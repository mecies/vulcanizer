from flask import Flask
from flask import jsonify
import requests
from bs4 import BeautifulSoup
app = Flask(__name__)


URL = 'https://www.ngdc.noaa.gov/nndc/struts/results?type_0=Like&query_0=&op_8=eq&v_8=&type_10=EXACT&query_10=None+Selected&le_2=&ge_3=&le_3=&ge_2=&op_5=eq&v_5=&op_6=eq&v_6=&op_7=eq&v_7=&t=102557&s=5&d=5' 


  
# extracting data in json format 
# data = r.json() 


@app.route('/')
def hello_world():
    return "404"

@app.route('/boi')
def get_data():
    r = requests.get(URL) 
    soup = BeautifulSoup(r.text)
    table = soup.find("table", attrs={"width":"100%", "cellpadding":"5", "cellspacing":"5"})
    # The first tr contains the field names.
    headings = [th.get_text() for th in table.find("tr").find_all("th")]

    datasets = []
    for row in table.find_all("tr")[1:]:
        for td in row.find_all("td")):
            print(td.get_text())
    return jsonify(datasets)

if __name__ == '__main__':
   app.run()