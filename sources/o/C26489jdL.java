package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.ui.screens.network_fee.NetworkFeeItemBinder$1;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import com.okinc.business.invest_biz.ui.widget.LeftRightInputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26489jdL extends AbstractC27119jpF<InvestNetworkFeeItem, iIQ> {
    public final Function1<InvestNetworkFeeItem, Unit> EZpvd;
    public final Function1<InvestNetworkFeeItem, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26489jdL(@NotNull Function1<? super InvestNetworkFeeItem, Unit> function1, Function1<? super InvestNetworkFeeItem, Unit> function12) {
        super(NetworkFeeItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final iIQ iiq, @NotNull final InvestNetworkFeeItem investNetworkFeeItem) {
        Intrinsics.checkNotNullParameter(iiq, "");
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        iiq.valueOf.setImageResource(investNetworkFeeItem.getIconRes());
        AppCompatTextView appCompatTextView = iiq.AYXKKw;
        DisplayText title = investNetworkFeeItem.getTitle();
        android.content.Context context = iiq.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setText(title.getString(context));
        iiq.copydefault.setText(C27492jwH.OLrzqt.AEQbTJ(investNetworkFeeItem.getEstimatedTime()));
        AbstractC23809iKc abstractC23809iKc = iiq.AhwBna;
        abstractC23809iKc.OLrzqt.setText(investNetworkFeeItem.getGasPrice());
        abstractC23809iKc.KWHzl.setText(investNetworkFeeItem.getGasPriceUnit());
        AppCompatImageView appCompatImageView = iiq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(investNetworkFeeItem.isCustom() ? 0 : 8);
        iiq.getRoot().setSelected(investNetworkFeeItem.getSelected());
        if (investNetworkFeeItem.isCustom()) {
            iiq.fetchVPNInfo.setText(investNetworkFeeItem.getGasPriceUnit());
            AppCompatTextView appCompatTextView2 = iiq.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            iiq.djBIcL.setInputFilters(new android.text.InputFilter[]{new C57711yna(1)});
            LeftRightInputData leftRightInputDataCopydefault = iiq.djBIcL.copydefault();
            leftRightInputDataCopydefault.setLable(C23952iPk.KWHzl(""));
            leftRightInputDataCopydefault.setHint(C23952iPk.KWHzl(investNetworkFeeItem.getGasPrice()));
            leftRightInputDataCopydefault.setContent(investNetworkFeeItem.getGasPrice());
            leftRightInputDataCopydefault.setSetInput(true);
            iiq.djBIcL.setTradeInputContent(investNetworkFeeItem.getGasPrice());
            iiq.djBIcL.setContentData(leftRightInputDataCopydefault);
        } else {
            iiq.djBIcL.KWHzl();
        }
        iiq.djBIcL.EZpvd(new Function2() { // from class: o.jdJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C26489jdL.copydefault(iiq, investNetworkFeeItem, this, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        KWHzl(iiq, investNetworkFeeItem);
        android.view.View root = iiq.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, investNetworkFeeItem));
    }

    public static final Unit copydefault(iIQ iiq, InvestNetworkFeeItem investNetworkFeeItem, C26489jdL c26489jdL, C55001xbh c55001xbh, java.lang.String str) {
        java.lang.String strCopydefault = "";
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23809iKc abstractC23809iKc = iiq.AhwBna;
        abstractC23809iKc.OLrzqt.setText(str.length() == 0 ? "0" : str);
        abstractC23809iKc.KWHzl.setText(investNetworkFeeItem.getGasPriceUnit());
        AppCompatTextView appCompatTextView = iiq.AkhnZx;
        if (C33129mqd.AEQbTJ(str, investNetworkFeeItem.getMaxGasPrice())) {
            strCopydefault = C33069mpW.copydefault(C25493ixk.FragmentManager.dLBcXg, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", investNetworkFeeItem.getMaxGasPrice())));
        } else if (C33129mqd.gEmmrt(str, investNetworkFeeItem.getMinGasPrice())) {
            strCopydefault = C33069mpW.copydefault(C25493ixk.FragmentManager.dvImUD, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", investNetworkFeeItem.getMinGasPrice())));
        }
        appCompatTextView.setText(strCopydefault);
        Function1<InvestNetworkFeeItem, Unit> function1 = c26489jdL.KWHzl;
        if (function1 != null) {
            function1.invoke(investNetworkFeeItem.copy((6143 & 1) != 0 ? investNetworkFeeItem.title : null, (6143 & 2) != 0 ? investNetworkFeeItem.iconRes : 0, (6143 & 4) != 0 ? investNetworkFeeItem.isCustom : false, (6143 & 8) != 0 ? investNetworkFeeItem.calculateGasPrice : null, (6143 & 16) != 0 ? investNetworkFeeItem.estimatedTime : null, (6143 & 32) != 0 ? investNetworkFeeItem.gasPrice : str, (6143 & 64) != 0 ? investNetworkFeeItem.priorityFee : null, (6143 & 128) != 0 ? investNetworkFeeItem.gasPriceUnit : null, (6143 & 256) != 0 ? investNetworkFeeItem.minGasPrice : null, (6143 & 512) != 0 ? investNetworkFeeItem.maxGasPrice : null, (6143 & 1024) != 0 ? investNetworkFeeItem.isExpand : false, (6143 & 2048) != 0 ? investNetworkFeeItem.selected : false, (6143 & 4096) != 0 ? investNetworkFeeItem.customGasPrice : null));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(iIQ iiq, InvestNetworkFeeItem investNetworkFeeItem) {
        android.view.View view = iiq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(investNetworkFeeItem.isExpand() ? 0 : 8);
        C27302jsd c27302jsd = iiq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c27302jsd, "");
        c27302jsd.setVisibility(investNetworkFeeItem.isExpand() ? 0 : 8);
        android.widget.Space space = iiq.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(space, "");
        space.setVisibility(investNetworkFeeItem.isExpand() ? 0 : 8);
        iiq.OLrzqt.setRotation(investNetworkFeeItem.isExpand() ? 180.0f : 0.0f);
        ConstraintLayout constraintLayout = iiq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(investNetworkFeeItem.isExpand() ? 0 : 8);
    }

    public final void KWHzl(InvestNetworkFeeItem investNetworkFeeItem) {
        this.EZpvd.invoke(investNetworkFeeItem);
    }

    /* JADX INFO: renamed from: o.jdL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ InvestNetworkFeeItem EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C26489jdL OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26489jdL c26489jdL, InvestNetworkFeeItem investNetworkFeeItem) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c26489jdL;
            this.EZpvd = investNetworkFeeItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(this.EZpvd);
            }
        }
    }
}
