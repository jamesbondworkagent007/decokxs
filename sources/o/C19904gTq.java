package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C19904gTq implements InterfaceC55196xfQ<C55276xgr, C55104xde<C21624hGg>> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55104xde<C21624hGg> AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21624hGg c21624hGgKWHzl = C21624hGg.KWHzl(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c21624hGgKWHzl, "");
        return new C55104xde<>(c21624hGgKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C55104xde<C21624hGg> c55104xde, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c55104xde, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C21624hGg c21624hGg = (C21624hGg) c55104xde.OLrzqt();
        if (c55276xgr.OLrzqt() instanceof DexMultiTokenInfoBean) {
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) objOLrzqt;
            ConstraintLayout root = c21624hGg.getRoot();
            java.lang.String upperCase = dexMultiTokenInfoBean.getTokenSymbol().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            root.setContentDescription("web3_dex_copytrading_token_cell_" + upperCase);
            c21624hGg.copydefault.setText(dexMultiTokenInfoBean.getTokenSymbol());
            c21624hGg.OLrzqt.setText(dexMultiTokenInfoBean.getTokenName());
            c21624hGg.EZpvd.setText(AEQbTJ(dexMultiTokenInfoBean.getAmountNum()));
            c21624hGg.KWHzl.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, dexMultiTokenInfoBean.getCurrencyAmount(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
            c21624hGg.AEQbTJ.AEQbTJ(dexMultiTokenInfoBean.getTokenLogoUrl(), dexMultiTokenInfoBean.getChainLogoUrl());
        }
        if (z) {
            c21624hGg.djBIcL.setImageResource(C52761wXj.TaskDescription.fVjYLc);
        } else {
            c21624hGg.djBIcL.setImageDrawable(null);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return (C23313hvq.valueOf(str, 0) || str.length() == 0) ? pTB.formatLocalizedWithMinPrecision$default("0.00", 2, null, 2, null) : C23322hvz.toLocalizedNumber$default(str, false, (RoundingMode) null, false, false, 11, (java.lang.Object) null);
    }
}
