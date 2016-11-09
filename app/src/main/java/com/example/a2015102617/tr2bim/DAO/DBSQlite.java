package com.example.a2015102617.tr2bim.DAO;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.a2015102617.tr2bim.Model.Movie;
/**
 * Created by 2015102617 on 09/11/2016.
 */

    /**
     * Created by Martin on 13/05/2016.
     */
    public class DBSQlite extends SQLiteOpenHelper {
        private static final String NOME_BASE = "base.db";
        private static final int VERSAO = 1;

        public DBSQlite(Context context) {
            super(context, NOME_BASE, null, VERSAO);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String CRIA_TABELA_MOVIE = "CREATE TABLE " + Movie.TABELA_MOVIES  + "("
                    + Movie.CAMPO_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                    + Movie.CAMPO_TITLE + " TEXT, "
                    + Movie.CAMPO_Image + " TEXT, "
                    + Movie.CAMPO_RATE + " TEXT, "
                    + Movie.CAMPO_RELEASEYEAR + "TEXT"
                    + Movie.CAMPO_GENRE+ "TEXT)";
            db.execSQL(CRIA_TABELA_MOVIE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
