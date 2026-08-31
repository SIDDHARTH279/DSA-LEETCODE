import pandas as pd

def createDataframe(student_data: List[List[int]]):
    return pd.DataFrame(student_data, columns = ['student_id', 'age'])
    