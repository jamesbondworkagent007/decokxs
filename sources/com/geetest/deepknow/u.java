package com.geetest.deepknow;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f406a = {"com.bly.dkplat", "com.lbe.parallel", "com.excelliance.dualaid", "com.lody.virtual", "com.qihoo.magic"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject a(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, a(context) + "");
            jSONObject.put(str2, a() + "");
            jSONObject.put(str3, "false");
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static boolean a(Context context) {
        try {
            String path = context.getFilesDir().getPath();
            for (String str : f406a) {
                if (path.contains(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean a() throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            bufferedReader2.close();
                            break;
                        }
                        for (String str : f406a) {
                            if (line.contains(str)) {
                                try {
                                    bufferedReader2.close();
                                    return true;
                                } catch (IOException unused) {
                                    return true;
                                }
                            }
                        }
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
            return false;
        }
    }
}
