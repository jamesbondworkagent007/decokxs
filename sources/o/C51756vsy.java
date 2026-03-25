package o;

import com.okinc.tradingbot.impl.market_place.my_bot.TabType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51756vsy implements InterfaceC47982uAp {
    public final TabType AEQbTJ;
    public final java.lang.Boolean OLrzqt;

    /* JADX INFO: renamed from: o.vsy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TabType.values().length];
            try {
                iArr[TabType.MY_SIGNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabType EZpvd() {
        return this.AEQbTJ;
    }

    public C51756vsy(@NotNull TabType tabType, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(tabType, "");
        this.AEQbTJ = tabType;
        this.OLrzqt = bool;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        if (StateListAnimator.OLrzqt[this.AEQbTJ.ordinal()] == 1) {
            return C51742vsk.Companion.OLrzqt(false);
        }
        return C51672vrT.Companion.KWHzl(this.AEQbTJ == TabType.HISTORY_BOT, this.OLrzqt);
    }
}
