package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsItemBinder$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iYO extends AbstractC27119jpF<C27296jsX, C23753iIa> {
    public final Function2<ButtonAction, AssetRawData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<ButtonAction, AssetRawData, Unit> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction, ? super com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iYO(@NotNull Function2<? super ButtonAction, ? super AssetRawData, Unit> function2) {
        super(AssetDetailsItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23753iIa c23753iIa, @NotNull final C27296jsX c27296jsX) {
        Intrinsics.checkNotNullParameter(c23753iIa, "");
        Intrinsics.checkNotNullParameter(c27296jsX, "");
        c23753iIa.djBIcL.setText(c27296jsX.OLrzqt());
        android.widget.TextView textView = c23753iIa.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27296jsX.OLrzqt()) ? 0 : 8);
        C55251xgS c55251xgS = c23753iIa.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27296jsX.djBIcL()) ? 0 : 8);
        c23753iIa.OLrzqt.setText(c27296jsX.djBIcL());
        c23753iIa.AEQbTJ.removeAllViews();
        for (final C27294jsV c27294jsV : c27296jsX.KWHzl()) {
            android.content.Context context = c23753iIa.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C27285jsM c27285jsM = new C27285jsM(context, null, 0, 6, null);
            c23753iIa.AEQbTJ.addView(c27285jsM);
            C27285jsM.setData$default(c27285jsM, c27294jsV, new Function1() { // from class: o.iYQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iYO.AEQbTJ(this.copydefault, c27294jsV, c27296jsX, (AssetRawData) obj);
                }
            }, null, 4, null);
        }
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C52794wYp c52794wYp = c23753iIa.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C27569jxf.setInvestClaimButtonStatus$default(c27569jxf, c52794wYp, c27296jsX.AEQbTJ(), c27296jsX.EZpvd(), null, 4, null);
        C52794wYp c52794wYp2 = c23753iIa.EZpvd;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, c23753iIa, c27296jsX, this));
        LinearLayoutCompat linearLayoutCompat = c23753iIa.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(c27296jsX.gEmmrt() ^ true ? 0 : 8);
        if (c27296jsX.gEmmrt()) {
            C55251xgS c55251xgS2 = c23753iIa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(8);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
            android.content.Context context2 = c23753iIa.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.setMargins(0, C55298xhM.copydefault(8.0f, context2), 0, 0);
            c23753iIa.EZpvd.setLayoutParams(layoutParams);
            c23753iIa.EZpvd.setOKDSSize(52);
        }
    }

    public static final Unit AEQbTJ(iYO iyo, C27294jsV c27294jsV, C27296jsX c27296jsX, AssetRawData assetRawData) {
        if (assetRawData != null) {
            Function2<ButtonAction, AssetRawData, Unit> function2 = iyo.OLrzqt;
            ButtonAction buttonActionCopydefault = c27294jsV.copydefault();
            if (buttonActionCopydefault == null) {
                buttonActionCopydefault = ButtonAction.CLAIM;
            }
            function2.invoke(buttonActionCopydefault, assetRawData.copydefault((1023 & 1) != 0 ? assetRawData.KWHzl : null, (1023 & 2) != 0 ? assetRawData.AYXKKw : null, (1023 & 4) != 0 ? assetRawData.OLrzqt : null, (1023 & 8) != 0 ? assetRawData.copydefault : null, (1023 & 16) != 0 ? assetRawData.AEQbTJ : null, (1023 & 32) != 0 ? assetRawData.AkhnZx : null, (1023 & 64) != 0 ? assetRawData.gEmmrt : null, (1023 & 128) != 0 ? assetRawData.djBIcL : false, (1023 & 256) != 0 ? assetRawData.AhwBna : null, (1023 & 512) != 0 ? assetRawData.EZpvd : null, (1023 & 1024) != 0 ? assetRawData.valueOf : c27296jsX.AhwBna()));
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ iYO EZpvd;
        public final /* synthetic */ C27296jsX KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C23753iIa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C23753iIa c23753iIa, C27296jsX c27296jsX, iYO iyo) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c23753iIa;
            this.KWHzl = c27296jsX;
            this.EZpvd = iyo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52794wYp.startLoading$default(this.copydefault.EZpvd, 0L, 1, null);
                AssetRawData assetRawDataCopydefault = this.KWHzl.copydefault();
                if (assetRawDataCopydefault != null) {
                    this.EZpvd.copydefault().invoke(this.KWHzl.EZpvd(), assetRawDataCopydefault.copydefault((1023 & 1) != 0 ? assetRawDataCopydefault.KWHzl : null, (1023 & 2) != 0 ? assetRawDataCopydefault.AYXKKw : null, (1023 & 4) != 0 ? assetRawDataCopydefault.OLrzqt : null, (1023 & 8) != 0 ? assetRawDataCopydefault.copydefault : null, (1023 & 16) != 0 ? assetRawDataCopydefault.AEQbTJ : null, (1023 & 32) != 0 ? assetRawDataCopydefault.AkhnZx : null, (1023 & 64) != 0 ? assetRawDataCopydefault.gEmmrt : null, (1023 & 128) != 0 ? assetRawDataCopydefault.djBIcL : false, (1023 & 256) != 0 ? assetRawDataCopydefault.AhwBna : null, (1023 & 512) != 0 ? assetRawDataCopydefault.EZpvd : null, (1023 & 1024) != 0 ? assetRawDataCopydefault.valueOf : this.KWHzl.AhwBna()));
                    this.copydefault.EZpvd.fIwbmz();
                }
            }
        }
    }
}
