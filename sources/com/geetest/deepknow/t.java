package com.geetest.deepknow;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f402a = 4;
    private static b b = null;
    public static String c = "Geetest_DeepKnow";

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HandlerThread f403a;
        private Handler b;
        private SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

        public class a extends Handler {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public a(Looper looper) {
                super(looper);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                super.handleMessage(message);
                if (!Thread.interrupted() && v.b()) {
                    int i = message.what;
                    if (i == 0) {
                        C0195b c0195b = (C0195b) message.obj;
                        b bVar = b.this;
                        bVar.a(b.b(bVar.c, c0195b.f405a, c0195b.b, c0195b.c));
                    } else if (i == 1) {
                        b.c();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.geetest.deepknow.t$b$b, reason: collision with other inner class name */
        public static class C0195b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f405a;
            public String b;
            public String c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private C0195b() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean c() {
            File file = new File(d());
            if (!file.exists()) {
                return false;
            }
            File file2 = new File(file, "deepknow_log.txt");
            if (file2.exists() && file2.length() >= 10485760) {
                return file2.delete();
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static String d() {
            return v.a() + File.separator + "geetest";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void e() {
            synchronized (this) {
                HandlerThread handlerThread = new HandlerThread("Geetest DeepKnow Thread");
                this.f403a = handlerThread;
                handlerThread.start();
                this.b = new a(this.f403a.getLooper());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void b() {
            synchronized (this) {
                if (v.b()) {
                    Message messageObtainMessage = this.b.obtainMessage();
                    messageObtainMessage.what = 1;
                    this.b.sendMessage(messageObtainMessage);
                }
            }
        }

        public void a(String str, String str2) {
            synchronized (this) {
                if (v.b()) {
                    Message messageObtainMessage = this.b.obtainMessage();
                    messageObtainMessage.what = 0;
                    C0195b c0195b = new C0195b();
                    c0195b.f405a = System.currentTimeMillis();
                    c0195b.b = str;
                    c0195b.c = str2;
                    messageObtainMessage.obj = c0195b;
                    this.b.sendMessage(messageObtainMessage);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String b(SimpleDateFormat simpleDateFormat, long j, String str, String str2) {
            return simpleDateFormat.format(new Date(j)) + '\t' + str + '\n' + str2 + '\n';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            File file = new File(d());
            if (!file.exists()) {
                file.mkdirs();
            }
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "deepknow_log.txt"), true));
                } catch (FileNotFoundException unused) {
                } catch (UnsupportedEncodingException unused2) {
                } catch (IOException unused3) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedOutputStream.write(str.getBytes("utf-8"));
                    bufferedOutputStream.close();
                } catch (FileNotFoundException unused4) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 == null) {
                        return;
                    }
                    bufferedOutputStream2.close();
                } catch (UnsupportedEncodingException unused5) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 == null) {
                        return;
                    }
                    bufferedOutputStream2.close();
                } catch (IOException unused6) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 == null) {
                        return;
                    }
                    bufferedOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(int i, String str) {
        f402a = i;
        c = str;
    }

    public static void b(String str) {
        if (f402a <= 3) {
            a(c, str);
        }
    }

    public static void a(String str) {
        if (f402a <= 5) {
            a(c, str);
        }
    }

    private static void a(String str, String str2) {
        if (b == null) {
            b bVar = new b();
            b = bVar;
            bVar.e();
            b.b();
        }
        if (b.b != null) {
            b.a(str, str2);
        }
    }
}
