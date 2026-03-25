package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27172jqF extends ConstraintLayout {
    public iMA EZpvd;
    public InvestRedeemReceiveInfoUIBean OLrzqt;
    public View.OnClickListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProcessClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.copydefault = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27172jqF(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27172jqF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27172jqF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    private final iMA AEQbTJ() {
        if (this.EZpvd == null) {
            this.EZpvd = iMA.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
        }
        iMA ima = this.EZpvd;
        Intrinsics.copydefault(ima);
        return ima;
    }

    private final void EZpvd() {
        removeAllViews();
        addView(AEQbTJ().getRoot());
        AEQbTJ().djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.jqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27172jqF.AEQbTJ(this.OLrzqt, view);
            }
        });
        AEQbTJ().valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.jqI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27172jqF.KWHzl(this.OLrzqt, view);
            }
        });
        android.widget.ImageView imageView = AEQbTJ().copydefault;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Intrinsics.copydefault(imageView);
        c27569jxf.OLrzqt(imageView, C52761wXj.TaskDescription.onProviderDisabled);
    }

    public static final void AEQbTJ(C27172jqF c27172jqF, android.view.View view) {
        View.OnClickListener onClickListener;
        InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean = c27172jqF.OLrzqt;
        if (investRedeemReceiveInfoUIBean != null) {
            Intrinsics.copydefault(investRedeemReceiveInfoUIBean);
            if (investRedeemReceiveInfoUIBean.isDataErro() || (onClickListener = c27172jqF.copydefault) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    public static final void KWHzl(C27172jqF c27172jqF, android.view.View view) {
        c27172jqF.AEQbTJ().djBIcL.performClick();
    }

    public final void setData(@NotNull InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(investRedeemReceiveInfoUIBean, "");
        this.OLrzqt = investRedeemReceiveInfoUIBean;
        iMA imaAEQbTJ = AEQbTJ();
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = imaAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investRedeemReceiveInfoUIBean.getPlatformLogo(), c27569jxf.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        if (!investRedeemReceiveInfoUIBean.getReceiveTokenInfo().isEmpty()) {
            imaAEQbTJ.AEQbTJ.setVisibility(0);
            imaAEQbTJ.copydefault.setVisibility(0);
            C27538jxA c27538jxA = C27538jxA.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C27212jqt c27212jqt = imaAEQbTJ.AEQbTJ;
            java.util.List<InvestTokenWithAmount> receiveTokenInfo = investRedeemReceiveInfoUIBean.getReceiveTokenInfo();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(receiveTokenInfo, 10));
            java.util.Iterator<T> it = receiveTokenInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvestTokenWithAmount) it.next()).getTokenLogo());
            }
            c27538jxA.OLrzqt(context, c27212jqt, new InvestmentLogoData(arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 24.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : C27569jxf.OLrzqt.OLrzqt());
        } else {
            imaAEQbTJ.AEQbTJ.setVisibility(8);
            imaAEQbTJ.copydefault.setVisibility(8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) investRedeemReceiveInfoUIBean.getSwapToToken())) {
            imaAEQbTJ.AhwBna.setVisibility(0);
            imaAEQbTJ.KWHzl.setVisibility(0);
            C27538jxA c27538jxA2 = C27538jxA.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C27212jqt c27212jqt2 = imaAEQbTJ.AhwBna;
            java.util.List<InvestTokenWithAmount> swapToToken = investRedeemReceiveInfoUIBean.getSwapToToken();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(swapToToken, 10));
            java.util.Iterator<T> it2 = swapToToken.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InvestTokenWithAmount) it2.next()).getTokenLogo());
            }
            c27538jxA2.OLrzqt(context2, c27212jqt2, new InvestmentLogoData(arrayList2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 24.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : C27569jxf.OLrzqt.OLrzqt());
        } else {
            imaAEQbTJ.AhwBna.setVisibility(8);
            imaAEQbTJ.KWHzl.setVisibility(8);
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DDjfYY);
        android.graphics.drawable.Drawable drawableMutate = drawableKWHzl != null ? drawableKWHzl.mutate() : null;
        if (investRedeemReceiveInfoUIBean.isDataErro()) {
            if (drawableMutate != null) {
                DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
                imaAEQbTJ.EZpvd.setImageDrawable(drawableMutate);
            }
        } else if (drawableMutate != null) {
            DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            imaAEQbTJ.EZpvd.setImageDrawable(drawableMutate);
        }
        iMA imaAEQbTJ2 = AEQbTJ();
        if (imaAEQbTJ2 == null || (textView = imaAEQbTJ2.valueOf) == null) {
            return;
        }
        if (investRedeemReceiveInfoUIBean.getRedeemTips().getTipsType() != 0) {
            int tipsType = investRedeemReceiveInfoUIBean.getRedeemTips().getTipsType();
            if (tipsType == 1) {
                textView.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.pXZxY));
            } else if (tipsType == 2) {
                textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RXdAnZ), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", investRedeemReceiveInfoUIBean.getRedeemTips().getTokenSymbol()))));
            } else if (tipsType == 3) {
                textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RXdAnZ), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", investRedeemReceiveInfoUIBean.getRedeemTips().getSwapTokenSymbol()))));
            } else if (tipsType == 4) {
                java.lang.String tokenSymbol = investRedeemReceiveInfoUIBean.getRedeemTips().getTokenSymbol();
                java.lang.String swapTokenSymbol = investRedeemReceiveInfoUIBean.getRedeemTips().getSwapTokenSymbol();
                textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RXdAnZ), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", swapTokenSymbol + (swapTokenSymbol.length() != 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu) : "") + tokenSymbol))));
            } else if (tipsType == 5) {
                textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.hGuIrQ), C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", investRedeemReceiveInfoUIBean.getRedeemTips().getTokenSymbol()))));
            } else {
                textView.setText("");
            }
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
