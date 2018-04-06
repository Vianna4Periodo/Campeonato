package com.example.ferraz.campeonato.utils;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    private static final String BANCO_NOME = "campeonato.db";
    private static final String TABELA_JOGADOR = "jogador";
    private static final String TABELA_TIME = "time";
    private static final String TABELA_JOGO = "jogo";
    private static final String TABELA_RODADA = "rodada";
    private static final String TABELA_CAMPEONATO = "campeonato";
    private static final String CAMPO_JOGADOR_ID = "idJogador";
    private static final String CAMPO_JOGADOR_NOME = "nomeJogador";



    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
