
import pandas as pd
#create the dataset
data ={
    "usernames": ["admin", "Charles","Deku"],
    "passwords": ["passeord","Charl113", "Allmight"],
}
#convert dataset to dataframe
df = pd.DataFrame(data)
#write the dataframe to a CSV file
df.to_csv("samples.csv", index=False)
#read data from the CSV file
input_data = pd.read.csv("sample.csv")