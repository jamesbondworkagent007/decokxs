package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qBG extends AbstractC39894qBs {
    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment
    public void OLrzqt(ChargeGroupVo chargeGroupVo, boolean z) {
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment
    public CategoryGroupVo OLrzqt() {
        return CategoryGroupVo.Companion.KWHzl();
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        qSZ qsz;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42829rdm c42829rdmAkhnZx = AkhnZx();
        if (c42829rdmAkhnZx == null || (qsz = c42829rdmAkhnZx.KWHzl) == null) {
            return;
        }
        qsz.setVisibility(8);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33014moU
    public void onRefreshCompleted(@NotNull java.lang.Object obj) {
        qSZ qsz;
        Intrinsics.checkNotNullParameter(obj, "");
        super.onRefreshCompleted(obj);
        C42829rdm c42829rdmAkhnZx = AkhnZx();
        if (c42829rdmAkhnZx == null || (qsz = c42829rdmAkhnZx.KWHzl) == null) {
            return;
        }
        qsz.setVisibility(8);
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
