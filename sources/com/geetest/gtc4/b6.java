package com.geetest.gtc4;

import android.text.TextUtils;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b6 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Pair a(a6 a6Var, int i) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(a6Var.b).openConnection();
            httpURLConnection.setConnectTimeout(i > 0 ? i : 5000);
            if (i <= 0) {
                i = 3000;
            }
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            if (a6Var.f421a.size() > 0) {
                for (Map.Entry entry : a6Var.f421a.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(a6Var.c)) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(a6Var.c.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Pair pairA = a(httpURLConnection.getInputStream());
            return ((Boolean) pairA.first).booleanValue() ? new Pair(Integer.valueOf(responseCode), (String) pairA.second) : new Pair(Integer.valueOf(-responseCode), (String) pairA.second);
        } catch (MalformedURLException e) {
            p3.a(String.valueOf(-11), e);
            return new Pair(-11, e.toString());
        } catch (ProtocolException e2) {
            p3.a(String.valueOf(-12), e2);
            return new Pair(-12, e2.toString());
        } catch (IOException e3) {
            p3.a(String.valueOf(-13), e3);
            return new Pair(-13, e3.toString());
        } catch (Exception e4) {
            p3.a(String.valueOf(-14), e4);
            return new Pair(-14, e4.toString());
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public static Pair a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                Pair pair = new Pair(Boolean.TRUE, byteArrayOutputStream.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    p3.a(String.valueOf(-13), e);
                }
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    p3.a(String.valueOf(-13), e2);
                }
                return pair;
            } catch (IOException e3) {
                p3.a(String.valueOf(-13), e3);
                Pair pair2 = new Pair(Boolean.FALSE, e3.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    p3.a(String.valueOf(-13), e4);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        p3.a(String.valueOf(-13), e5);
                    }
                }
                return pair2;
            } catch (Exception e6) {
                p3.a(String.valueOf(-14), e6);
                Pair pair3 = new Pair(Boolean.FALSE, e6.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e7) {
                    p3.a(String.valueOf(-13), e7);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        p3.a(String.valueOf(-13), e8);
                    }
                }
                return pair3;
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                p3.a(String.valueOf(-13), e9);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e10) {
                    p3.a(String.valueOf(-13), e10);
                    throw th;
                }
            }
            throw th;
        }
    }
}
