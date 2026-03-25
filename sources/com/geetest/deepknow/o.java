package com.geetest.deepknow;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x004c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0073: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x0072 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStream] */
    public static JSONObject a(Context context) throws Throwable {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        StringBuffer stringBuffer;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                context = context.getAssets().open("dp_configuration_files.json", 2);
                try {
                    stringBuffer = new StringBuffer();
                    bufferedReader = new BufferedReader(new InputStreamReader(context));
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (context == 0) {
                        throw th;
                    }
                    try {
                        context.close();
                        throw th;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                context = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                context = 0;
            }
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                if (context != 0) {
                    try {
                        context.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                return jSONObject;
            } catch (Exception e8) {
                e = e8;
                e.printStackTrace();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                if (context != 0) {
                    try {
                        context.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader3 = bufferedReader2;
        }
    }
}
