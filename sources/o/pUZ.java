package o;

import com.okinc.log.LogLevel;
import com.tencent.mars.xlog.Xlog;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final InterfaceC56387yDm<pUZ> copydefault = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: o.pVb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pUZ.OLrzqt();
        }
    });
    public final InterfaceC38340pVd AEQbTJ;
    public final java.util.Map<java.lang.String, C38339pVc> KWHzl;

    public pUZ(@NotNull InterfaceC38340pVd interfaceC38340pVd) {
        Intrinsics.checkNotNullParameter(interfaceC38340pVd, "");
        this.AEQbTJ = interfaceC38340pVd;
        this.KWHzl = new java.util.HashMap();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final pUZ OLrzqt() {
            return (pUZ) pUZ.copydefault.getValue();
        }
    }

    public static final pUZ OLrzqt() {
        return new pUZ(new Xlog());
    }

    public final void AEQbTJ(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3) {
        Xlog.XLogConfig xLogConfig = new Xlog.XLogConfig();
        xLogConfig.level = i;
        xLogConfig.mode = i2;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.pubkey = str4;
        xLogConfig.compressmode = 0;
        xLogConfig.compresslevel = 0;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i3;
        this.AEQbTJ.openLog(xLogConfig);
    }

    public final void AEQbTJ() {
        this.AEQbTJ.appenderFlush(0L, false);
        java.util.Iterator<Map.Entry<java.lang.String, C38339pVc>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().AEQbTJ();
        }
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ.appenderFlush(0L, z);
    }

    public final void KWHzl(boolean z) {
        this.AEQbTJ.setConsoleLogOpen(0L, z);
    }

    public final void copydefault(long j) {
        this.AEQbTJ.setMaxFileSize(0L, j);
    }

    public final void KWHzl(long j) {
        this.AEQbTJ.setMaxAliveTime(0L, j);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_FATAL.getLevel()) {
            this.AEQbTJ.logF(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_ERROR.getLevel()) {
            this.AEQbTJ.logE(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public final void gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_WARNING.getLevel()) {
            this.AEQbTJ.logW(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_INFO.getLevel()) {
            this.AEQbTJ.logI(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_DEBUG.getLevel()) {
            this.AEQbTJ.logD(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.AEQbTJ.getLogLevel(0L) <= LogLevel.LEVEL_VERBOSE.getLevel()) {
            this.AEQbTJ.logV(0L, str, "", "", 0, android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
        }
    }
}
