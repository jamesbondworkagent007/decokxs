package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5238Ka implements Logger {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final C5238Ka KWHzl = new C5238Ka();
    public Logger.LogMode OLrzqt = Logger.LogMode.INFO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Logger.LogMode copydefault() {
        return this.OLrzqt;
    }

    @Override // com.amplitude.common.Logger
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(Logger.LogMode.DEBUG, str);
    }

    @Override // com.amplitude.common.Logger
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(Logger.LogMode.ERROR, str);
    }

    @Override // com.amplitude.common.Logger
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(Logger.LogMode.INFO, str);
    }

    @Override // com.amplitude.common.Logger
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(Logger.LogMode.WARN, str);
    }

    public final void KWHzl(Logger.LogMode logMode, java.lang.String str) {
        if (copydefault().compareTo(logMode) <= 0) {
            java.lang.System.out.println((java.lang.Object) str);
        }
    }

    /* JADX INFO: renamed from: o.Ka$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ka.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C5238Ka OLrzqt() {
            return C5238Ka.KWHzl;
        }
    }
}
