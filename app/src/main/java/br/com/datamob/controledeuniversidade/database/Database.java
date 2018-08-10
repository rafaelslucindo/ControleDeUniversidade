package br.com.datamob.controledeuniversidade.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper
{
    private static final String NAME = "database";
    private static SQLiteDatabase database;

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    public static SQLiteDatabase getInstance(Context context)
    {
        if (database == null)
            database = new Database(context, NAME, null, 1).getWritableDatabase();
        return database;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table universidade ( nome TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public static void testa(Context context)
    {
        SQLiteDatabase instance = getInstance(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", "nomeDaUniversidade");
        instance.insert("universidade", null, contentValues);
        instance.insert("universidade", null, contentValues);

        Cursor universidade = instance.query("universidade", new String[]{"nome"}, null, null, null, null, null);

        if (universidade.moveToFirst())
        {
            do
            {
                universidade.getString(0);
            } while (universidade.moveToNext());
        }

    }
}
