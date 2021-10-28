package com.example.annuaire;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.DriverManager;

public class connexion {
    connexion con;
    String ip, port, db, un, pass;

    @SuppressLint("NewApi")
    public connexion conclass() {
        ip = "";
        port = "";
        db = "";
        un = "";
        pass = "";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        connexion connexion = null;
        String connectURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            // connectURL = "jdbc:jtds:sqlserver://"+ip+":"+port+";"databaseName="+db+";"+un+"";"password="+pass+";";
            //connexion = DriverManager.getConnection(connectURL);

        } catch (Exception exception) {
            Log.e("Error:", exception.getMessage());
        }
        return connexion;
    }
}
