package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zP {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final java.lang.Long gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ zP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Long AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean b_() {
        return this.AYXKKw;
    }

    private zP() {
        this.AYXKKw = true;
    }

    public static final class StateListAnimator extends zP {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final boolean OLrzqt = false;
        public static final long copydefault = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public final boolean b_() {
            return OLrzqt;
        }

        private StateListAnimator() {
            super(null);
        }

        @Override // o.zP
        public java.lang.Long AEQbTJ() {
            return java.lang.Long.valueOf(copydefault);
        }
    }

    public static abstract class TaskDescription extends zP {
        public final boolean AEQbTJ;

        public abstract byte[] OLrzqt();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public final boolean b_() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
            super(null);
        }
    }

    public static abstract class Application extends zP {
        public abstract InterfaceC5060De copydefault();

        public Application() {
            super(null);
        }
    }

    public static abstract class Activity extends zP {
        public abstract CS copydefault();

        public Activity() {
            super(null);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final zP OLrzqt(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return new C3603Ap(bArr);
        }
    }
}
