package com.geetest.deepknow;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes17.dex */
public class f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(String str, byte[] bArr, int i) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Exception e;
        HttpURLConnection httpURLConnection2;
        t.b("REQUEST URL: " + str);
        URL urlA = a(str);
        try {
            HttpURLConnection httpURLConnection3 = null;
            try {
                if ("https".equals(urlA.getProtocol().toLowerCase())) {
                    try {
                        try {
                            httpURLConnection2 = (HttpsURLConnection) urlA.openConnection();
                            try {
                                httpURLConnection2.setConnectTimeout(i);
                                httpURLConnection2.setReadTimeout(i);
                                httpURLConnection2.setDoInput(true);
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestMethod("POST");
                                httpURLConnection2.setUseCaches(false);
                                OutputStream outputStream = httpURLConnection2.getOutputStream();
                                outputStream.write(bArr);
                                outputStream.flush();
                                outputStream.close();
                                int responseCode = httpURLConnection2.getResponseCode();
                                if (responseCode == 200) {
                                    String strA = a(httpURLConnection2.getInputStream());
                                    httpURLConnection2.disconnect();
                                    return strA;
                                }
                                String str2 = "Url: " + str + "  responseCode:" + responseCode;
                                httpURLConnection2.disconnect();
                                return str2;
                            } catch (Exception e2) {
                                e = e2;
                                httpURLConnection3 = httpURLConnection2;
                                String str3 = "Url: " + str + "  error:" + e.toString();
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                return str3;
                            } catch (Throwable th2) {
                                th = th2;
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection2 = httpURLConnection3;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } else {
                    try {
                        httpURLConnection = (HttpURLConnection) urlA.openConnection();
                        try {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(false);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setUseCaches(false);
                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                            outputStream2.write(bArr);
                            outputStream2.flush();
                            outputStream2.close();
                            int responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 == 200) {
                                String strA2 = a(httpURLConnection.getInputStream());
                                httpURLConnection.disconnect();
                                return strA2;
                            }
                            String str4 = "responseCode:" + responseCode2;
                            httpURLConnection.disconnect();
                            return str4;
                        } catch (Exception e4) {
                            e = e4;
                            httpURLConnection3 = httpURLConnection;
                            String str5 = "error:" + e.toString();
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            return str5;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = httpURLConnection3;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        } catch (Exception e6) {
            return "error:" + e6.toString();
        }
    }

    private static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new String(byteArrayOutputStream.toByteArray());
        }
        inputStream.close();
        return new String(byteArrayOutputStream.toByteArray());
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            t.a("url parse error：" + e.toString());
            return null;
        }
    }
}
