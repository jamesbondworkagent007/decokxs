package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.zcD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59178zcD {
    public static final StateListAnimator OLrzqt = StateListAnimator.copydefault;

    void AEQbTJ();

    void EZpvd();

    /* JADX INFO: renamed from: o.zcD$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }

        public final C59225zcy AEQbTJ(java.lang.Runnable runnable, Function1<? super java.lang.InterruptedException, Unit> function1) {
            if (runnable != null && function1 != null) {
                return new C59176zcB(runnable, function1);
            }
            return new C59225zcy(null, 1, null);
        }
    }
}
