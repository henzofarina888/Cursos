saldo=1000
saque=200
limite=150
conta_especial= False

expressao=(saldo>= saque and saque <= limite)or(saldo>=saque and conta_especial)

print(expressao)