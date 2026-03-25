package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.InvestHistoryBean;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.history.InvestHistoryItemViewBinder$1;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26391jbT extends AbstractC27121jpH<InvestHistoryBean, iLH> {
    public final C43316rmw OLrzqt;
    public final yHO<android.widget.LinearLayout, java.util.List<InvestTokenWithAmount>, java.lang.Integer, Unit> copydefault;

    /* JADX INFO: renamed from: o.jbT$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAction.values().length];
            try {
                iArr[InvestAction.Subscription.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAction.StartFarming.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestAction.Repay.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestAction.Redeem.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestAction.Claim.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[InvestAction.EndFarming.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[InvestAction.Mint.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[InvestAction.Borrow.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super android.widget.LinearLayout, ? super java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26391jbT(@NotNull C43316rmw c43316rmw, @NotNull yHO<? super android.widget.LinearLayout, ? super java.util.List<InvestTokenWithAmount>, ? super java.lang.Integer, Unit> yho) {
        super(InvestHistoryItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.OLrzqt = c43316rmw;
        this.copydefault = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C27120jpG<iLH> c27120jpG, @NotNull InvestHistoryBean investHistoryBean) {
        iLH ilh;
        InvestAction.Companion companion;
        InvestAction investActionCopydefault;
        int[] iArr;
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(investHistoryBean, "");
        iLH ilh2 = (iLH) c27120jpG.KWHzl();
        android.widget.TextView textView = ilh2.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.ImageView imageView = ilh2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.TextView textView2 = ilh2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.TextView textView3 = ilh2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.widget.LinearLayout linearLayout = ilh2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int layoutPosition = c27120jpG.getLayoutPosition() - 1;
        java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(investHistoryBean.getBlockTime()), null, 1, null);
        if (layoutPosition >= 0 && layoutPosition < this.OLrzqt.getItemCount()) {
            java.lang.Object objAEQbTJ = this.OLrzqt.AEQbTJ(layoutPosition);
            Intrinsics.copydefault(objAEQbTJ, "");
            ilh = ilh2;
            if (Intrinsics.EZpvd((java.lang.Object) pTA.formatSimpleDate$default(new Date(((InvestHistoryBean) objAEQbTJ).getBlockTime()), null, 1, null), (java.lang.Object) simpleDate$default)) {
                textView.setVisibility(8);
            }
            if (c27120jpG.getBindingAdapterPosition() == 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    android.content.Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.copydefault(8.0f, context);
                }
                textView.setLayoutParams(textView.getLayoutParams());
            }
            companion = InvestAction.Companion;
            investActionCopydefault = companion.copydefault(investHistoryBean.getOrderType());
            iArr = StateListAnimator.AEQbTJ;
            switch (iArr[investActionCopydefault.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    imageView.setBackgroundResource(C25493ixk.StateListAnimator.DbNXlk);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    imageView.setBackgroundResource(C25493ixk.StateListAnimator.AkhnZx);
                    break;
                default:
                    imageView.setBackgroundResource(0);
                    break;
            }
            switch (iArr[companion.copydefault(investHistoryBean.getOrderType()).ordinal()]) {
                case 1:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.zpGcln);
                    break;
                case 2:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.stopBehavioSecDataCollection);
                    break;
                case 3:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.DRGLNw);
                    break;
                case 4:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.siEkQe);
                    break;
                case 5:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.profile);
                    break;
                case 6:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.cancel);
                    break;
                case 7:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.DGUQLIhJrIAr);
                    break;
                case 8:
                    string = textView2.getContext().getString(C25493ixk.FragmentManager.OuxcSI);
                    break;
            }
            textView2.setText(string);
            textView3.setText(pTA.formatSimpleTime$default(new Date(investHistoryBean.getBlockTime()), null, 1, null));
            this.copydefault.invoke(linearLayout, investHistoryBean.getInvestInfo(), java.lang.Integer.valueOf(investHistoryBean.getOrderType()));
            ConstraintLayout root = ilh.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, investHistoryBean));
        }
        ilh = ilh2;
        textView.setVisibility(0);
        textView.setText(simpleDate$default);
        if (c27120jpG.getBindingAdapterPosition() == 0) {
        }
        companion = InvestAction.Companion;
        investActionCopydefault = companion.copydefault(investHistoryBean.getOrderType());
        iArr = StateListAnimator.AEQbTJ;
        switch (iArr[investActionCopydefault.ordinal()]) {
        }
        switch (iArr[companion.copydefault(investHistoryBean.getOrderType()).ordinal()]) {
        }
        textView2.setText(string);
        textView3.setText(pTA.formatSimpleTime$default(new Date(investHistoryBean.getBlockTime()), null, 1, null));
        this.copydefault.invoke(linearLayout, investHistoryBean.getInvestInfo(), java.lang.Integer.valueOf(investHistoryBean.getOrderType()));
        ConstraintLayout root2 = ilh.getRoot();
        root2.setOnClickListener(new ActionBar(root2, 1000L, investHistoryBean));
    }

    /* JADX INFO: renamed from: o.jbT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestHistoryBean KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, InvestHistoryBean investHistoryBean) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = investHistoryBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.OLrzqt;
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c27508jwX.copydefault(context, this.KWHzl.getTxHash(), this.KWHzl.getUopHash(), "defi");
            }
        }
    }
}
