package com.saidinosystems.uixchalange.db.provider.model

data class Note (val title:String,val description: String){
}

val noteListMonk =mutableListOf<Note>(
    Note("UPDATE BANK STATEMENT",
        "Check BIM statement if its Matching with system daily updates" +
                "if ist not pleasereconcile"),
    Note("PETTY CASH GET UPDATED" ,
            "PLEASE MAKE SURE YOU HAVE ALREADY UPDATE THE PETTY CASH DAILY"),

    Note("Supplier",
        "UPDATE SUPPLIER SUMARY INVOICES AND CHECK IF THEIR STATEMENTS HAS ALREADY UPDATED" +
                "AS PER AS YOUR INVOCE SHEET"),

    Note("WORK ON PURCHASES UPDATE ","CHECK PROPERLY IF THE PURCHASES ARE ALREADY UPDATED" +
            "CORRECTLY IN THEIR LEDGER COUNTS"),
    Note("ON FINALIZING INVOICES","Check if their are finalizing properly in the main Ledgers")
)