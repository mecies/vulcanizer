package org.doublem.vulcanizer.volcano.service.data;

import org.doublem.vulcanizer.volcano.model.Volcano;
import org.doublem.vulcanizer.volcano.service.mapper.VolcanoRowMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class VolcanoParsingService {

    private static final int VOLCANO_TABLE_LOCATION = 2;

    public List<Volcano> getVolcanoesList(String volcanoHtml) {
        Document document = Jsoup.parse(volcanoHtml);
        Elements tables = document.select("table");
        Element tab = tables.get(VOLCANO_TABLE_LOCATION);
        Element tbody = tab.select("tbody").get(0);

        return tbody.select("tr")
                .stream()
                .map(row -> row.select("td"))
                .map(VolcanoRowMapper::mapRow)
                .collect(Collectors.toList());
    }

}
