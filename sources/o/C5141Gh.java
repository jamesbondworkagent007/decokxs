package o;

import androidx.exifinterface.media.ExifInterface;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5141Gh {
    public static final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ(@NotNull CoroutineContext coroutineContext) {
        java.util.Map<java.lang.String, java.lang.Object> mapAEQbTJ;
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        C5145Gl c5145Gl = (C5145Gl) coroutineContext.get(C5145Gl.OLrzqt);
        return (c5145Gl == null || (mapAEQbTJ = c5145Gl.AEQbTJ()) == null) ? C56424yEw.KWHzl() : mapAEQbTJ;
    }

    public static /* synthetic */ void log$default(CoroutineContext coroutineContext, LogLevel logLevel, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        copydefault(coroutineContext, logLevel, str, th, function0);
    }

    public static final void copydefault(@NotNull CoroutineContext coroutineContext, @NotNull LogLevel logLevel, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        GT gtEZpvd;
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(logLevel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC5148Go interfaceC5148GoOLrzqt = FX.KWHzl(coroutineContext).KWHzl().OLrzqt(str);
        if (interfaceC5148GoOLrzqt.OLrzqt(logLevel)) {
            java.util.Map<java.lang.String, java.lang.Object> mapAEQbTJ = AEQbTJ(coroutineContext);
            GU guCopydefault = GO.copydefault(coroutineContext);
            if (guCopydefault == null || (gtEZpvd = guCopydefault.EZpvd()) == null || !gtEZpvd.AEQbTJ()) {
                gtEZpvd = null;
            }
            InterfaceC5147Gn interfaceC5147GnKWHzl = interfaceC5148GoOLrzqt.KWHzl(logLevel);
            if (th != null) {
                interfaceC5147GnKWHzl.KWHzl(th);
            }
            interfaceC5147GnKWHzl.KWHzl(function0);
            for (Map.Entry<java.lang.String, java.lang.Object> entry : mapAEQbTJ.entrySet()) {
                interfaceC5147GnKWHzl.AEQbTJ(entry.getKey(), entry.getValue());
            }
            if (gtEZpvd != null) {
                interfaceC5147GnKWHzl.AEQbTJ("trace_id", gtEZpvd.EZpvd());
                interfaceC5147GnKWHzl.AEQbTJ("span_id", gtEZpvd.KWHzl());
            }
            interfaceC5147GnKWHzl.OLrzqt();
        }
    }

    public static /* synthetic */ void log$default(CoroutineContext coroutineContext, LogLevel logLevel, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(logLevel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static /* synthetic */ void error$default(CoroutineContext coroutineContext, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        EZpvd(coroutineContext, str, th, function0);
    }

    public static final void EZpvd(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault(coroutineContext, LogLevel.Error, str, th, function0);
    }

    public static /* synthetic */ void error$default(CoroutineContext coroutineContext, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LogLevel logLevel = LogLevel.Error;
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static /* synthetic */ void warn$default(CoroutineContext coroutineContext, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        OLrzqt(coroutineContext, str, th, function0);
    }

    public static final void OLrzqt(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault(coroutineContext, LogLevel.Warning, str, th, function0);
    }

    public static /* synthetic */ void warn$default(CoroutineContext coroutineContext, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LogLevel logLevel = LogLevel.Warning;
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static /* synthetic */ void info$default(CoroutineContext coroutineContext, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AEQbTJ(coroutineContext, str, th, function0);
    }

    public static final void AEQbTJ(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault(coroutineContext, LogLevel.Info, str, th, function0);
    }

    public static /* synthetic */ void info$default(CoroutineContext coroutineContext, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LogLevel logLevel = LogLevel.Info;
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static /* synthetic */ void debug$default(CoroutineContext coroutineContext, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        copydefault(coroutineContext, str, th, function0);
    }

    public static final void copydefault(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault(coroutineContext, LogLevel.Debug, str, th, function0);
    }

    public static /* synthetic */ void debug$default(CoroutineContext coroutineContext, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LogLevel logLevel = LogLevel.Debug;
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static /* synthetic */ void trace$default(CoroutineContext coroutineContext, java.lang.String str, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        KWHzl(coroutineContext, str, th, function0);
    }

    public static final void KWHzl(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str, java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault(coroutineContext, LogLevel.Trace, str, th, function0);
    }

    public static /* synthetic */ void trace$default(CoroutineContext coroutineContext, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LogLevel logLevel = LogLevel.Trace;
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        copydefault(coroutineContext, logLevel, strGEmmrt, th, function0);
    }

    public static final InterfaceC5148Go OLrzqt(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C5144Gk(coroutineContext, FX.KWHzl(coroutineContext).KWHzl().OLrzqt(str), str);
    }
}
