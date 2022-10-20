saldo = 3000;
cheque_especial= 2500;
saque = float(input("Qual será o valor do saque:"))
conta = str(input("Qual tipo de conta?"))

if conta =="especial":
    if saldo >= saque:
        print("Saque feito com sucesso, saldo R$",saldo -saque)
    else:
        if saque<=cheque_especial:
            print("Saldo Insuficiente, mas o cheque especial foi usado . saldo R$",saldo+saque)
        else:
            print("Saldo Insuficiente e sem cheque especial, saldo R$",saldo);         
elif conta =="normal":
    if saldo >= saque:
        print("Saque feito com sucesso, saldo R$",saldo-saque)
    else:
        print("Saldo Insuficiente")