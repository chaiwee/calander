package com.example.wyshin.calander;

import android.support.v7.app.ActionBarActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShowScheduleInMonthly extends AddSchedulepencil{
    private String[] data = new String[32];

    public void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        FileInputStream fis = openFileInput("data.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        while (true) {
            String temp = br.readLine();
            if (temp == null) break;
            StringTokenizer st = new StringTokenizer(temp);
            int day = Integer.parseInt(st.nextToken());
            while (st.hasMoreElements()) {
                    data[day] = st.nextToken();
            }
        }
        br.close();
    }

    public String[] getData() {
        return data;
    }
}
