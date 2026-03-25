package o;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28445kas extends kLO<HoldingAsset> {
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    public boolean EZpvd(@NotNull HoldingAsset holdingAsset, @NotNull HoldingAsset holdingAsset2) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        Intrinsics.checkNotNullParameter(holdingAsset2, "");
        return Intrinsics.EZpvd((java.lang.Object) holdingAsset.AkhnZx(), (java.lang.Object) holdingAsset2.AkhnZx()) && Intrinsics.EZpvd((java.lang.Object) holdingAsset.OLrzqt(), (java.lang.Object) holdingAsset2.OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull HoldingAsset holdingAsset, @NotNull HoldingAsset holdingAsset2) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        Intrinsics.checkNotNullParameter(holdingAsset2, "");
        return Intrinsics.EZpvd(holdingAsset, holdingAsset2);
    }
}
