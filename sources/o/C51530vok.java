package o;

import com.okinc.tradingbot.impl.market_place.home.list.BotMarketPlaceType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C51593vpu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51530vok implements InterfaceC47982uAp {
    public final BotMarketPlaceType KWHzl;

    /* JADX INFO: renamed from: o.vok$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotMarketPlaceType.values().length];
            try {
                iArr[BotMarketPlaceType.FEATURED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotMarketPlaceType.FeaturedCRBots.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BotMarketPlaceType.OnGoing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[BotMarketPlaceType.CROnGoing.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[BotMarketPlaceType.SignalsTab.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotMarketPlaceType copydefault() {
        return this.KWHzl;
    }

    public C51530vok(@NotNull BotMarketPlaceType botMarketPlaceType) {
        Intrinsics.checkNotNullParameter(botMarketPlaceType, "");
        this.KWHzl = botMarketPlaceType;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        int i = Application.OLrzqt[this.KWHzl.ordinal()];
        if (i == 1 || i == 2) {
            return C51579vpg.Companion.OLrzqt();
        }
        if (i == 3 || i == 4) {
            C51593vpu.Activity activity = C51593vpu.Companion;
            android.os.Bundle bundle = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            return activity.copydefault(bundle != null ? bundle.getString(C56071xvr.gEmmrt.fetchVPNInfo()) : null);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new uLE();
    }
}
