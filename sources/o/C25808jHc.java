package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25808jHc implements ViewModelProvider.Factory {
    public static final Activity Companion = new Activity(null);
    public static final InterfaceC56387yDm<jGH> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jGZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25808jHc.AkhnZx();
        }
    });
    public static final InterfaceC56387yDm<C25806jHa> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jHb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25808jHc.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm<C4152AzU> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jHd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25808jHc.DbNXlk();
        }
    });
    public static final InterfaceC56387yDm<C25802jGx> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jHg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25808jHc.djBIcL();
        }
    });

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isAssignableFrom(C25829jHx.class)) {
            return new C25829jHx(Companion.EZpvd());
        }
        if (cls.isAssignableFrom(jGX.class)) {
            Activity activity = Companion;
            return new jGX(activity.EZpvd(), C19691gLt.KWHzl.getNewProxyInstance(), activity.OLrzqt());
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }

    /* JADX INFO: renamed from: o.jHc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final jGH OLrzqt() {
            return (jGH) C25808jHc.OLrzqt.getValue();
        }

        public final C25806jHa copydefault() {
            return (C25806jHa) C25808jHc.copydefault.getValue();
        }

        public final InterfaceC2147AAo KWHzl() {
            return (InterfaceC2147AAo) C25808jHc.EZpvd.getValue();
        }

        public final C25802jGx EZpvd() {
            return (C25802jGx) C25808jHc.AEQbTJ.getValue();
        }
    }

    public static final jGH AkhnZx() {
        return new jGH();
    }

    public static final C25806jHa gEmmrt() {
        return new C25806jHa(C19691gLt.KWHzl.zLjUOn());
    }

    public static final C4152AzU DbNXlk() {
        return new C4152AzU();
    }

    public static final C25802jGx djBIcL() {
        Activity activity = Companion;
        return new C25802jGx(activity.copydefault(), activity.KWHzl(), C19691gLt.KWHzl.uzCIH());
    }
}
