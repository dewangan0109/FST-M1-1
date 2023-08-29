import pandas
from pandas import ExcelWriter

data = {
    "FirstName" : ["Saumya","Mayur","Pooja"],
    "LastName" : ["Dewangan","Nimbalkar","Tare"],
    "Email" : ["samdew@example.com","mayurNm@example.com","PoojaTare@example.com"],
    "PhoneNumber" : ["6576567678", "6576564543", "6545434321"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter("sample.xlsx")
dataframe.to_excel(writer,"Sheet1",index=False)
writer.save()