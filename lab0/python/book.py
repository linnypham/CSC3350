class Book:
    def __init__(self,title, author, publisher, publication_date):
        self.title = title
        self.author = author
        self.publisher = publisher
        self.publication_date = publication_date

    def print_info(self):
        print(f"Title: {self.title}")
        print(f"Author: {self.author}")
        print(f"Publisher: {self.publisher}")
        print(f"Publication Date: {self.publication_date}")

class Encyclopedia(Book):
    def __init__(self,title, author, publisher, publication_date,edition,num_Pages):
        super().__init__(title, author, publisher, publication_date)
        self.edition = edition
        self.num_Pages = num_Pages

    def print_info(self):
        super().print_info()
        print(f"Edition: {self.edition}")
        print(f"Number of Pages: {self.num_Pages}")

