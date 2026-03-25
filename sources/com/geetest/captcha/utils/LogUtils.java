package com.geetest.captcha.utils;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.geetest.captcha.NoProguard;
import com.geetest.captcha.z;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class LogUtils implements NoProguard {
    public static a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LogUtils f375a = new LogUtils();
    public static int b = 4;
    public static String d = "Captcha";
    public static boolean e = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LogUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void destroy() {
        try {
            a aVar = c;
            if (aVar != null) {
                aVar.b();
            }
            c = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void init(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        b = i;
        d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void printLongString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (length > 3800) {
            int i = 0;
            while (length - i > 3800) {
                Intrinsics.checkNotNullExpressionValue(str.substring(i, 3800), "");
                i += 3800;
            }
            Intrinsics.checkNotNullExpressionValue(str.substring(i), "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReleaseLog(boolean z) {
        e = z;
        b = z ? 1 : 9999;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private final void log2sd(String str, String str2) {
        Message messageObtainMessage;
        if (c == null) {
            a aVar = new a();
            c = aVar;
            aVar.a();
        }
        a aVar2 = c;
        if (aVar2 != null) {
            synchronized (aVar2) {
                com.geetest.captcha.utils.a aVar3 = aVar2.b;
                if (aVar3 != null && (messageObtainMessage = aVar3.obtainMessage(0)) != null) {
                    messageObtainMessage.obj = new a.b(System.currentTimeMillis(), str, str2);
                    aVar2.c();
                    com.geetest.captcha.utils.a aVar4 = aVar2.b;
                    if (aVar4 != null) {
                        aVar4.sendMessage(messageObtainMessage);
                    }
                }
            }
        }
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (b <= 2) {
            log2sd(d, str);
        }
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (b <= 5) {
            log2sd(d, str);
        }
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (b <= 3) {
            log2sd(d, str);
        }
    }

    public final void v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (b <= 1) {
            log2sd(d, str);
        }
    }

    public final void w(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (b <= 4) {
            log2sd(d, str);
        }
    }

    public final void release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        log2sd(d, str);
    }

    public final void d(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (b <= 2) {
            log2sd(str, str2);
        }
    }

    public final void e(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (b <= 5) {
            log2sd(str, str2);
        }
    }

    public final void i(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (b <= 3) {
            log2sd(str, str2);
        }
    }

    public final void v(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (b <= 1) {
            log2sd(str, str2);
        }
    }

    public final void w(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (b <= 4) {
            log2sd(str, str2);
        }
    }

    public static final class a {
        public static final SimpleDateFormat c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HandlerThread f376a;
        public com.geetest.captcha.utils.a b;

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f377a;
            public final String b;
            public final String c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public b() {
                this(0);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (0 long), (null java.lang.String), (null java.lang.String) A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:1) call: com.geetest.captcha.utils.LogUtils.a.b.<init>(long, java.lang.String, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ b(int i) {
                this(0L, null, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f377a == bVar.f377a && Intrinsics.EZpvd((Object) this.b, (Object) bVar.b) && Intrinsics.EZpvd((Object) this.c, (Object) bVar.c);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int hashCode() {
                int iHashCode = Long.hashCode(this.f377a);
                String str = this.b;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String toString() {
                return "Item(millis=" + this.f377a + ", tag=" + this.b + ", message=" + this.c + ')';
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public b(long j, String str, String str2) {
                this.f377a = j;
                this.b = str;
                this.c = str2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            new C0190a();
            c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            c();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public static final void a(a aVar, String str) {
            aVar.getClass();
            try {
                File file = new File(z.f388a + File.separator + "Geetest");
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "captcha_log.txt"), true);
                try {
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    fileOutputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(fileOutputStream, null);
                } finally {
                }
            } catch (Exception unused) {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void b() {
            synchronized (this) {
                com.geetest.captcha.utils.a aVar = this.b;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                HandlerThread handlerThread = this.f376a;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                this.f376a = null;
                this.b = null;
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void c() {
            synchronized (this) {
                HandlerThread handlerThread = this.f376a;
                if (handlerThread != null) {
                    Intrinsics.copydefault(handlerThread);
                    if (!handlerThread.isAlive()) {
                    }
                }
                HandlerThread handlerThread2 = new HandlerThread("Captcha Thread");
                handlerThread2.start();
                this.f376a = handlerThread2;
                Intrinsics.copydefault(handlerThread2);
                Looper looper = handlerThread2.getLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "");
                this.b = new com.geetest.captcha.utils.a(looper, this);
            }
        }

        /* JADX INFO: renamed from: com.geetest.captcha.utils.LogUtils$a$a, reason: collision with other inner class name */
        public static final class C0190a {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static final String a(SimpleDateFormat simpleDateFormat, long j, String str, String str2) {
                SimpleDateFormat simpleDateFormat2 = a.c;
                String str3 = simpleDateFormat.format(new Date(j)) + '\t' + str + '\n' + str2 + '\n';
                Intrinsics.checkNotNullExpressionValue(str3, "");
                return str3;
            }

            public static final void a() {
                SimpleDateFormat simpleDateFormat = a.c;
                File file = new File(new File(z.f388a + File.separator + "Geetest"), "captcha_log.txt");
                if (!file.exists() || file.length() < 10485760) {
                    return;
                }
                file.delete();
            }
        }

        public final void a() {
            Message messageObtainMessage;
            synchronized (this) {
                com.geetest.captcha.utils.a aVar = this.b;
                if (aVar != null && (messageObtainMessage = aVar.obtainMessage(1)) != null) {
                    c();
                    com.geetest.captcha.utils.a aVar2 = this.b;
                    if (aVar2 != null) {
                        aVar2.sendMessage(messageObtainMessage);
                    }
                }
            }
        }
    }
}
