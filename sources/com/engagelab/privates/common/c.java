package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.analysis.api.Event;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes21.dex */
public class c implements Thread.UncaughtExceptionHandler {
    public static volatile c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f325a = null;
    public boolean b = false;
    public Context c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                d = new c();
            }
        }
        return d;
    }

    public void b(Context context) {
        this.c = context;
        this.b = true;
        if (this.f325a == null) {
            this.f325a = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.c == null) {
            return;
        }
        if (this.b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strB = b(th);
            String strA = a(th);
            Event event = new Event(MTAnalysisConstants.TYPE_CRASH);
            event.putExtraAttr("crashtime", Long.valueOf(jCurrentTimeMillis));
            event.putExtraAttr("stacktrace", strB);
            event.putExtraAttr("message", strA);
            d.c().a(this.c, event);
            try {
                Thread.sleep(200L);
            } catch (Exception unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f325a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public void a(Context context) {
        b(context);
    }

    public final String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public final String a(Throwable th) {
        String string = th.toString();
        try {
            String[] strArrSplit = string.split(":");
            if (strArrSplit.length <= 1) {
                return string;
            }
            for (int length = strArrSplit.length - 1; length >= 0; length--) {
                if (!strArrSplit[length].endsWith("Exception") && !strArrSplit[length].endsWith("Error")) {
                }
                return strArrSplit[length];
            }
            return string;
        } catch (NullPointerException | PatternSyntaxException unused) {
            return string;
        }
    }
}
