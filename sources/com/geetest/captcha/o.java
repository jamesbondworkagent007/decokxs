package com.geetest.captcha;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.amplitude.analytics.BuildConfig;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f371a = {"/sdcard/.system_log.trace", "/sdcard/tencent/.DrvZPZQ", "/sdcard/alipay/.Wg83DS3"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Can't wrap try/catch for region: R(10:47|81|48|(7:49|(1:51)(1:95)|55|69|56|57|58)|52|55|69|56|57|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:21|77|22|83|23|(7:24|(1:26)(1:93)|30|71|31|32|33)|27|30|71|31|32|33) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:34|85|35|75|36|(7:37|(1:39)(1:94)|43|73|44|45|46)|40|43|73|44|45|46) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<String, String> a(Context context) {
        String string;
        String string2;
        StringWriter stringWriter;
        char[] cArr;
        String string3;
        StringWriter stringWriter2;
        char[] cArr2;
        String string4;
        StringWriter stringWriter3;
        char[] cArr3;
        try {
            string = context.getSharedPreferences("gt_fp", 0).getString("gt_di", null);
        } catch (Exception unused) {
            string = "$unknown";
        }
        if (!TextUtils.isEmpty(string) && !"$unknown".equals(string)) {
            try {
                byte[] bArrA = a.a(Base64.decode(string, 2));
                int i = v.f379a;
                return new Pair<>(new JSONObject(new String(bArrA, Charset.forName("utf-8"))).getString("gee_id"), string);
            } catch (Exception unused2) {
                return null;
            }
        }
        if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0) {
            if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
                return null;
            }
            try {
                FileReader fileReader = new FileReader(f371a[0]);
                int i2 = v.f379a;
                try {
                    stringWriter3 = new StringWriter();
                    cArr3 = new char[4096];
                } catch (Exception unused3) {
                    string4 = null;
                }
                while (true) {
                    int i3 = fileReader.read(cArr3);
                    if (-1 == i3) {
                        break;
                    }
                    stringWriter3.write(cArr3, 0, i3);
                    JSONObject jSONObject = new JSONObject(new String(a.a(Base64.decode(string4, 2))));
                    context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string4).apply();
                    return new Pair<>(jSONObject.getString("gee_id"), string4);
                }
                string4 = stringWriter3.toString();
                JSONObject jSONObject2 = new JSONObject(new String(a.a(Base64.decode(string4, 2))));
                context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string4).apply();
                return new Pair<>(jSONObject2.getString("gee_id"), string4);
            } catch (Exception unused4) {
                try {
                    try {
                        try {
                            String[] strArr = f371a;
                            FileReader fileReader2 = new FileReader(strArr[1]);
                            int i4 = v.f379a;
                            try {
                                stringWriter2 = new StringWriter();
                                cArr2 = new char[4096];
                            } catch (Exception unused5) {
                                string3 = null;
                            }
                            while (true) {
                                int i5 = fileReader2.read(cArr2);
                                if (-1 == i5) {
                                    break;
                                }
                                stringWriter2.write(cArr2, 0, i5);
                                JSONObject jSONObject3 = new JSONObject(new String(a.a(Base64.decode(string3, 2))));
                                context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string3).apply();
                                a(string3, strArr[0]);
                                return new Pair<>(jSONObject3.getString("gee_id"), string3);
                            }
                            string3 = stringWriter2.toString();
                            JSONObject jSONObject32 = new JSONObject(new String(a.a(Base64.decode(string3, 2))));
                            context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string3).apply();
                            a(string3, strArr[0]);
                            return new Pair<>(jSONObject32.getString("gee_id"), string3);
                        } catch (Exception unused6) {
                            String[] strArr2 = f371a;
                            FileReader fileReader3 = new FileReader(strArr2[2]);
                            int i6 = v.f379a;
                            try {
                                stringWriter = new StringWriter();
                                cArr = new char[4096];
                            } catch (Exception unused7) {
                                string2 = null;
                            }
                            while (true) {
                                int i7 = fileReader3.read(cArr);
                                if (-1 == i7) {
                                    break;
                                }
                                stringWriter.write(cArr, 0, i7);
                                JSONObject jSONObject4 = new JSONObject(new String(a.a(Base64.decode(string2, 2))));
                                context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string2).apply();
                                a(string2, strArr2[0]);
                                a(string2, strArr2[1]);
                                return new Pair<>(jSONObject4.getString("gee_id"), string2);
                            }
                            string2 = stringWriter.toString();
                            JSONObject jSONObject42 = new JSONObject(new String(a.a(Base64.decode(string2, 2))));
                            context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string2).apply();
                            a(string2, strArr2[0]);
                            a(string2, strArr2[1]);
                            return new Pair<>(jSONObject42.getString("gee_id"), string2);
                        }
                    } catch (Exception unused8) {
                    }
                } catch (Exception unused9) {
                    String string5 = UUID.randomUUID().toString();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("gee_id", string5);
                    jSONObject5.put("ts", System.currentTimeMillis());
                    jSONObject5.put("ver", BuildConfig.VERSION_NAME);
                    byte[] bArrEncode = Base64.encode(a.b(jSONObject5.toString()), 2);
                    int i8 = v.f379a;
                    String str = new String(bArrEncode, Charset.forName("utf-8"));
                    try {
                        context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", str).apply();
                    } catch (Exception unused10) {
                    }
                    String[] strArr3 = f371a;
                    a(str, strArr3[0]);
                    a(str, strArr3[1]);
                    a(str, strArr3[2]);
                    return new Pair<>(string5, str);
                }
            }
        }
        return null;
    }

    public static void a(String str, String str2) {
        try {
            FileWriter fileWriter = new FileWriter(str2);
            int i = v.f379a;
            if (str != null) {
                fileWriter.write(str);
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
