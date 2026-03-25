package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47889tyd implements RxBus.Application {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final android.os.Bundle OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47889tyd() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47889tyd copy$default(C47889tyd c47889tyd, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = c47889tyd.OLrzqt;
        }
        return c47889tyd.copydefault(bundle);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47889tyd copydefault(android.os.Bundle bundle) {
        return new C47889tyd(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47889tyd) && Intrinsics.EZpvd(this.OLrzqt, ((C47889tyd) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.os.Bundle bundle = this.OLrzqt;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetClickTabEvent(bundle=" + this.OLrzqt + ")";
    }

    /* JADX INFO: renamed from: o.tyd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C47889tyd(android.os.Bundle bundle) {
        this.OLrzqt = bundle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r1v0 android.os.Bundle))
 A[MD:(android.os.Bundle):void (m)] (LINE:6) call: o.tyd.<init>(android.os.Bundle):void type: THIS */
    public /* synthetic */ C47889tyd(android.os.Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
