linguagens = ["python", "js", "c", "java", "csharp","c"]

linguagens.remove("c")

print(linguagens)  # ["python", "js", "java", "csharp"]


for ex in linguagens:
    if linguagens.count("c"):
        linguagens.remove("c")


print(linguagens)