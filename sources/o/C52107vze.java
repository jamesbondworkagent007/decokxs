package o;

import com.okinc.tradingbot.impl.nmp.my_bot.presenter.NmpTabType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52107vze implements InterfaceC47982uAp {
    public final NmpTabType copydefault;

    /* JADX INFO: renamed from: o.vze$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NmpTabType.values().length];
            try {
                iArr[NmpTabType.MY_SIGNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpTabType copydefault() {
        return this.copydefault;
    }

    public C52107vze(@NotNull NmpTabType nmpTabType) {
        Intrinsics.checkNotNullParameter(nmpTabType, "");
        this.copydefault = nmpTabType;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        if (StateListAnimator.EZpvd[this.copydefault.ordinal()] == 1) {
            return C51742vsk.Companion.OLrzqt(false);
        }
        return C52044vyU.Companion.copydefault(this.copydefault == NmpTabType.HISTORY_BOT, true);
    }
}
