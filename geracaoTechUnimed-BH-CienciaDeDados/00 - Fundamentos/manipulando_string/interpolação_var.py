nome = input("Qual seu nome:")
idade = int(input("Qual sua idade:"))
saldo = float(input("Qual seu saldo:"))
profissao = input("Qual sua profissao:")
linguagem = input("Qual a linguagem do seu curso:")


print(f"Olá, me chamo {nome}. Eu tenho {idade} anos de idade, trabalho com {profissao} e faço o curso de {linguagem}.\nsaldo atual é R$ {saldo:.2f}")