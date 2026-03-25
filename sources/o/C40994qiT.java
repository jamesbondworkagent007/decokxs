package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarTokenUnlockTypeVo;
import kotlin.jvm.internal.Intrinsics;
import o.C40992qiR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40994qiT extends AbstractC40510qYn<TradingCalendarTokenUnlockTypeVo, C42696rbL> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42696rbL AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42696rbL c42696rbLCopydefault = C42696rbL.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42696rbLCopydefault, "");
        return c42696rbLCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42696rbL c42696rbL, int i, @NotNull TradingCalendarTokenUnlockTypeVo tradingCalendarTokenUnlockTypeVo) {
        Intrinsics.checkNotNullParameter(c42696rbL, "");
        Intrinsics.checkNotNullParameter(tradingCalendarTokenUnlockTypeVo, "");
        c42696rbL.DbNXlk.setText(tradingCalendarTokenUnlockTypeVo.AYXKKw());
        C40992qiR.Application application = C40992qiR.Companion;
        android.widget.ImageView imageView = c42696rbL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        application.OLrzqt(imageView, tradingCalendarTokenUnlockTypeVo.AEQbTJ());
        c42696rbL.values.setText(tradingCalendarTokenUnlockTypeVo.gEmmrt());
        c42696rbL.fIwbmz.setText(tradingCalendarTokenUnlockTypeVo.DbNXlk());
        c42696rbL.AuCTel.setText(tradingCalendarTokenUnlockTypeVo.AkhnZx());
        c42696rbL.AhwBna.setText(tradingCalendarTokenUnlockTypeVo.AhwBna());
        c42696rbL.valueOf.setText(tradingCalendarTokenUnlockTypeVo.djBIcL());
        c42696rbL.OLrzqt.setText(tradingCalendarTokenUnlockTypeVo.KWHzl());
        c42696rbL.djBIcL.setText(tradingCalendarTokenUnlockTypeVo.EZpvd());
        android.view.View view = c42696rbL.isConnected;
        Intrinsics.checkNotNullExpressionValue(view, "");
        KWHzl(view, tradingCalendarTokenUnlockTypeVo.valueOf());
        android.view.View view2 = c42696rbL.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        KWHzl(view2, tradingCalendarTokenUnlockTypeVo.copydefault());
    }

    public final void KWHzl(android.view.View view, float f) {
        if (f <= 0.0f) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        view.getLayoutParams().width = (int) f;
        view.requestLayout();
    }
}
