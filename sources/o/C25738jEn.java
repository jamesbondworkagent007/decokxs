package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import kotlin.jvm.internal.Intrinsics;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25738jEn {
    public static final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TrackerTrendUIModel trackerTrendUIModel, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default((gKO) C43251rlk.copydefault(gKO.class), fragmentManager, str, new TokenBase(trackerTrendUIModel.AEQbTJ(), trackerTrendUIModel.djBIcL(), trackerTrendUIModel.fetchVPNInfo(), "", "", trackerTrendUIModel.isConnected(), "", 0, 0, 0, 0, null, "default_trade", null, null, trackerTrendUIModel.KWHzl(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), TransactionType.Buy.getType(), "", null, null, 96, null);
    }
}
