package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26079jRd extends wXX {
    public hPA EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jRk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26079jRd.copydefault(this.EZpvd);
        }
    });
    public C23467hyl OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final LiquidityPoolPairUIItem AEQbTJ() {
        return (LiquidityPoolPairUIItem) this.KWHzl.getValue();
    }

    public static final LiquidityPoolPairUIItem copydefault(C26079jRd c26079jRd) {
        android.os.Bundle arguments = c26079jRd.getArguments();
        if (arguments != null) {
            return (LiquidityPoolPairUIItem) arguments.getParcelable("key-liquidity-pool-detail");
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivity3));
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        final LiquidityPoolPairUIItem liquidityPoolPairUIItemAEQbTJ;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23467hyl c23467hylAEQbTJ = C23467hyl.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        this.OLrzqt = c23467hylAEQbTJ;
        if (c23467hylAEQbTJ != null && (liquidityPoolPairUIItemAEQbTJ = AEQbTJ()) != null) {
            AppCompatImageView appCompatImageView = c23467hylAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C25386ivj.loadCircleImage$default(appCompatImageView, liquidityPoolPairUIItemAEQbTJ.getPoolLogoUrl(), false, 2, null);
            c23467hylAEQbTJ.AYXKKw.setText(liquidityPoolPairUIItemAEQbTJ.getDexName());
            c23467hylAEQbTJ.AhwBna.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, liquidityPoolPairUIItemAEQbTJ.getLiquidity(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            c23467hylAEQbTJ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.jRh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26079jRd.OLrzqt(this.KWHzl, liquidityPoolPairUIItemAEQbTJ, view);
                }
            });
            c23467hylAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jRf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26079jRd.KWHzl(this.KWHzl, liquidityPoolPairUIItemAEQbTJ, view);
                }
            });
        }
        EZpvd();
    }

    public static final void OLrzqt(C26079jRd c26079jRd, LiquidityPoolPairUIItem liquidityPoolPairUIItem, android.view.View view) {
        InterfaceC26087jRl interfaceC26087jRlCopydefault = c26079jRd.copydefault();
        if (interfaceC26087jRlCopydefault != null) {
            interfaceC26087jRlCopydefault.AEQbTJ(TokenDetailButtonName.DATA_LIQUIDITY_POOL_ADDRESS_COPY);
        }
        int i = C23274hvD.Fragment.ComponentActivity5;
        android.content.Context contextRequireContext = c26079jRd.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        hSW.copyAddress$default(i, contextRequireContext, liquidityPoolPairUIItem.getPairAddress(), null, null, 24, null);
    }

    public static final void KWHzl(C26079jRd c26079jRd, LiquidityPoolPairUIItem liquidityPoolPairUIItem, android.view.View view) {
        InterfaceC26087jRl interfaceC26087jRlCopydefault = c26079jRd.copydefault();
        if (interfaceC26087jRlCopydefault != null) {
            interfaceC26087jRlCopydefault.AEQbTJ(TokenDetailButtonName.DATA_LIQUIDITY_POOL_EXTERNAL_LINK);
        }
        C25352ivB.KWHzl(c26079jRd.getContext(), liquidityPoolPairUIItem.getExplorerUrl());
    }

    public final void EZpvd() {
        C23467hyl c23467hyl = this.OLrzqt;
        RecyclerView recyclerView = c23467hyl != null ? c23467hyl.EZpvd : null;
        this.EZpvd = new hPA();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(this.EZpvd);
        }
        hPA hpa = this.EZpvd;
        if (hpa != null) {
            LiquidityPoolPairUIItem liquidityPoolPairUIItemAEQbTJ = AEQbTJ();
            hpa.submitList(liquidityPoolPairUIItemAEQbTJ != null ? liquidityPoolPairUIItemAEQbTJ.getPoolTokenInfoList() : null);
        }
    }

    public final InterfaceC26087jRl copydefault() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC26087jRl) {
            return (InterfaceC26087jRl) parentFragment;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.jRd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C26079jRd EZpvd(@NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem) {
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key-liquidity-pool-detail", liquidityPoolPairUIItem);
            C26079jRd c26079jRd = new C26079jRd();
            c26079jRd.setArguments(bundle);
            return c26079jRd;
        }
    }
}
