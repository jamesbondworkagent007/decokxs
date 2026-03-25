package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.multitype.selection.Selectable;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C30947lkk implements InterfaceC55196xfQ<C55276xgr, C55104xde<C21624hGg>> {
    public Selectable.Mode AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30947lkk() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C30947lkk(@NotNull Selectable.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        this.AEQbTJ = mode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.multitype.selection.Selectable$Mode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.multitype.selection.Selectable$Mode:0x0004: SGET  A[WRAPPED] (LINE:19) com.okinc.multitype.selection.Selectable.Mode.Single com.okinc.multitype.selection.Selectable$Mode) : (r1v0 com.okinc.multitype.selection.Selectable$Mode))
 A[MD:(com.okinc.multitype.selection.Selectable$Mode):void (m)] (LINE:18) call: o.lkk.<init>(com.okinc.multitype.selection.Selectable$Mode):void type: THIS */
    public /* synthetic */ C30947lkk(Selectable.Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Selectable.Mode.Single : mode);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55104xde<C21624hGg> AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21624hGg c21624hGgKWHzl = C21624hGg.KWHzl(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c21624hGgKWHzl, "");
        return new C55104xde<>(c21624hGgKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
    @Override // o.InterfaceC55196xfQ
    public void EZpvd(@NotNull C55104xde<C21624hGg> c55104xde, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c55104xde, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C21624hGg c21624hGg = (C21624hGg) c55104xde.OLrzqt();
        if (c55276xgr.OLrzqt() instanceof MemeCurrencyBean) {
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            DexMultiTokenInfoBean currencyTokenInfo = ((MemeCurrencyBean) objOLrzqt).getCurrencyTokenInfo();
            c21624hGg.copydefault.setText(currencyTokenInfo.getTokenSymbol());
            c21624hGg.OLrzqt.setText(currencyTokenInfo.getTokenName());
            c21624hGg.EZpvd.setText(AEQbTJ(currencyTokenInfo.getAmountNum()));
            c21624hGg.KWHzl.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, currencyTokenInfo.getCurrencyAmount(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
            c21624hGg.AEQbTJ.AEQbTJ(currencyTokenInfo.getTokenLogoUrl(), currencyTokenInfo.getChainLogoUrl());
        }
        if (z) {
            c21624hGg.djBIcL.setImageResource(C52761wXj.TaskDescription.fVjYLc);
            return;
        }
        if (this.AEQbTJ == Selectable.Mode.Single) {
            c21624hGg.djBIcL.setImageDrawable(null);
        } else if (c55276xgr.AYXKKw()) {
            c21624hGg.djBIcL.setImageResource(C52761wXj.TaskDescription.dbwnZN);
        } else {
            c21624hGg.djBIcL.setImageResource(C52761wXj.TaskDescription.gsvlRV);
        }
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        return (C23313hvq.valueOf(str, 0) || str.length() == 0) ? pTB.formatLocalizedWithMinPrecision$default("0.00", 2, null, 2, null) : C23322hvz.toLocalizedNumber$default(str, false, (RoundingMode) null, false, false, 11, (java.lang.Object) null);
    }
}
