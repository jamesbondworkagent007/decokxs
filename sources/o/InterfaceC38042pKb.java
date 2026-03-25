package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pKb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38042pKb extends pJH {
    public static final Activity Companion = Activity.OLrzqt;

    /* JADX INFO: renamed from: o.pKb$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(int i);
    }

    void KWHzl(@NotNull StateListAnimator stateListAnimator);

    /* JADX INFO: renamed from: o.pKb$Activity */
    public static final class Activity {
        public static volatile InterfaceC38042pKb EZpvd;
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        public final int EZpvd() {
            return java.lang.Thread.activeCount();
        }

        public final InterfaceC38042pKb EZpvd(@NotNull CoroutineDispatcher coroutineDispatcher) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            if (EZpvd == null) {
                synchronized (this) {
                    EZpvd = new C38035pJv(coroutineDispatcher, null, 2, 0 == true ? 1 : 0);
                    Unit unit = Unit.INSTANCE;
                }
            }
            InterfaceC38042pKb interfaceC38042pKb = EZpvd;
            Intrinsics.copydefault(interfaceC38042pKb);
            return interfaceC38042pKb;
        }
    }
}
