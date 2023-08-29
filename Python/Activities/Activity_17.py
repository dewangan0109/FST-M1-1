import pandas

data = {
    "Usernames" : ["admin","Mark","Unum"],
    "Passwords" : ["password","Mark203","Unum901"]
}

dataframe = pandas.DataFrame(data)

dataframe.to_csv("Auth_File.csv")