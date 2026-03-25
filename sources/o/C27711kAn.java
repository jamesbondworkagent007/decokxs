package o;

import com.okinc.business.market.features.trader.domain.model.Traders;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27711kAn extends kLO<Traders> {

    /* JADX INFO: renamed from: o.kAn$StateListAnimator */
    public static final class StateListAnimator {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kAn$Application */
    public static final class Application {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean EZpvd(@NotNull Traders traders, @NotNull Traders traders2) {
        Intrinsics.checkNotNullParameter(traders, "");
        Intrinsics.checkNotNullParameter(traders2, "");
        return Intrinsics.EZpvd((java.lang.Object) traders.isConnected(), (java.lang.Object) traders2.isConnected());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull Traders traders, @NotNull Traders traders2) {
        Intrinsics.checkNotNullParameter(traders, "");
        Intrinsics.checkNotNullParameter(traders2, "");
        return Intrinsics.EZpvd(traders, traders2);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.kLO
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Traders traders, @NotNull Traders traders2) {
        Intrinsics.checkNotNullParameter(traders, "");
        Intrinsics.checkNotNullParameter(traders2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) traders.djBIcL(), (java.lang.Object) traders2.djBIcL()) || !Intrinsics.EZpvd((java.lang.Object) traders.OLrzqt(), (java.lang.Object) traders2.OLrzqt())) {
            return StateListAnimator.AEQbTJ;
        }
        if (Intrinsics.EZpvd((java.lang.Object) traders.AYXKKw(), (java.lang.Object) traders2.AYXKKw()) && Intrinsics.EZpvd((java.lang.Object) traders.values(), (java.lang.Object) traders2.values()) && Intrinsics.EZpvd((java.lang.Object) traders.gEmmrt(), (java.lang.Object) traders2.gEmmrt()) && Intrinsics.EZpvd((java.lang.Object) traders.valueOf(), (java.lang.Object) traders2.valueOf()) && Intrinsics.EZpvd((java.lang.Object) traders.fetchVPNInfo(), (java.lang.Object) traders2.fetchVPNInfo()) && Intrinsics.EZpvd((java.lang.Object) traders.AkhnZx(), (java.lang.Object) traders2.AkhnZx()) && Intrinsics.EZpvd((java.lang.Object) traders.KWHzl(), (java.lang.Object) traders2.KWHzl())) {
            return null;
        }
        return Application.KWHzl;
    }
}
