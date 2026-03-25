package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5151Gr implements InterfaceC5148Go {
    public final InterfaceC60100zvh AEQbTJ;

    /* JADX INFO: renamed from: o.Gr$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.Trace.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.Debug.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.Warning.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC60100zvh OLrzqt() {
        return this.AEQbTJ;
    }

    public AbstractC5151Gr(@NotNull InterfaceC60100zvh interfaceC60100zvh) {
        Intrinsics.checkNotNullParameter(interfaceC60100zvh, "");
        this.AEQbTJ = interfaceC60100zvh;
    }

    @Override // o.InterfaceC5148Go
    public void AEQbTJ(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(LogLevel.Trace)) {
            if (th != null) {
                this.AEQbTJ.trace(function0.invoke(), th);
            } else {
                this.AEQbTJ.trace(function0.invoke());
            }
        }
    }

    @Override // o.InterfaceC5148Go
    public void KWHzl(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(LogLevel.Debug)) {
            if (th != null) {
                this.AEQbTJ.debug(function0.invoke(), th);
            } else {
                this.AEQbTJ.debug(function0.invoke());
            }
        }
    }

    @Override // o.InterfaceC5148Go
    public void copydefault(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(LogLevel.Info)) {
            if (th != null) {
                this.AEQbTJ.info(function0.invoke(), th);
            } else {
                this.AEQbTJ.info(function0.invoke());
            }
        }
    }

    @Override // o.InterfaceC5148Go
    public void OLrzqt(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(LogLevel.Warning)) {
            if (th != null) {
                this.AEQbTJ.warn(function0.invoke(), th);
            } else {
                this.AEQbTJ.warn(function0.invoke());
            }
        }
    }

    @Override // o.InterfaceC5148Go
    public void EZpvd(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (OLrzqt(LogLevel.Error)) {
            if (th != null) {
                this.AEQbTJ.error(function0.invoke(), th);
            } else {
                this.AEQbTJ.error(function0.invoke());
            }
        }
    }

    @Override // o.InterfaceC5148Go
    public boolean OLrzqt(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        int i = Activity.OLrzqt[logLevel.ordinal()];
        if (i == 1) {
            return this.AEQbTJ.isTraceEnabled();
        }
        if (i == 2) {
            return this.AEQbTJ.isDebugEnabled();
        }
        if (i == 3) {
            return this.AEQbTJ.isInfoEnabled();
        }
        if (i == 4) {
            return this.AEQbTJ.isWarnEnabled();
        }
        if (i == 5) {
            return this.AEQbTJ.isErrorEnabled();
        }
        throw new NoWhenBranchMatchedException();
    }
}
