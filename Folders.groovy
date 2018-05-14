def folders = '''
Active Folder
Active Folder/DqCpi
Active Folder/DqCtlRent
Active Folder/DqFileBox
'''

def folderList = folders.tokenize('\n')

for (folderName in folderList) {
    folder(folderName)
}