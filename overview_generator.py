import os

def find_top_level_headings(file):
    topics = []
    with open(file) as f:
        lines = f.readlines()
        for l in lines:
            if l[:2] == "# ":
                topics.append(l[2:-1])
    return topics

def find_pres():
    pres_path = []
    ls = os.listdir()
    for path in ls:
        if os.path.isdir(path) and path.isnumeric():
            rel_path = os.path.join(path, "pres.md")
            if os.path.isfile(rel_path):
                pres_path.append(rel_path)
    return pres_path

def make_overview_bib(paths):
    overview = {}
    for path in paths:
        number = path.split("/")[0]
        overview[number] = find_top_level_headings(path)
    return overview

def format_overview(bib: dict):
    output = ""
    for number in bib.keys():
        output += "- [" + number + "](" + number + "/pres.md):"
        output += str(topics_to_string(bib[number])) + "\n"
    return output

def topics_to_string(topics: list):
    s = ""
    for topic in topics:
        s+=" " + topic
    return s


if __name__ == "__main__":
    paths = find_pres()
    bib = make_overview_bib(paths)
    print(format_overview(bib))
    
