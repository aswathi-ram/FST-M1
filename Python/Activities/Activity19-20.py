import pandas as pd
from pandas import ExcelWriter
# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
# Create the DataFrame that will be written to the excel file
dataframe = pd.DataFrame(data)
# Print the dataframe
print(dataframe)
# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
# Commit data to the Excel file
writer.close()
#read the excel file
input_data = pd.read_excel("sample.xlsx")
#print the number of rows and columns
print("Number of rows:", input_data.shape[0])
print("Number of columns:", input_data.shape[1])
#print the data in email column only
print(input_data["Email"])
#sort the data based on firstname in ascending order and print the data
#print(input_data.)