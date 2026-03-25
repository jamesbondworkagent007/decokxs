package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27187jqU extends ConstraintLayout {
    public InterfaceC27313jso AEQbTJ;
    public InvestSubscriptionReceiveInfoUIBean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public View.OnClickListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveInfoUIBean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProcessClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.copydefault = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27187jqU(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27187jqU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27187jqU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    private final InterfaceC27313jso KWHzl() {
        return OLrzqt();
    }

    private final InterfaceC27313jso OLrzqt() {
        InterfaceC27313jso interfaceC27313jsoEZpvd;
        if (this.AEQbTJ == null) {
            if (this.KWHzl) {
                interfaceC27313jsoEZpvd = AEQbTJ(this.OLrzqt);
            } else {
                interfaceC27313jsoEZpvd = EZpvd(this.OLrzqt);
            }
            this.AEQbTJ = interfaceC27313jsoEZpvd;
        }
        InterfaceC27313jso interfaceC27313jso = this.AEQbTJ;
        Intrinsics.copydefault(interfaceC27313jso);
        return interfaceC27313jso;
    }

    public final InterfaceC27313jso AEQbTJ(boolean z) {
        if (z) {
            C23885iMy c23885iMyAEQbTJ = C23885iMy.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
            Intrinsics.checkNotNullExpressionValue(c23885iMyAEQbTJ, "");
            return new C27314jsp(c23885iMyAEQbTJ);
        }
        iMA imaAEQbTJ = iMA.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
        Intrinsics.checkNotNullExpressionValue(imaAEQbTJ, "");
        return new C27316jsr(imaAEQbTJ);
    }

    public final InterfaceC27313jso EZpvd(boolean z) {
        if (z) {
            iMP impAEQbTJ = iMP.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
            Intrinsics.checkNotNullExpressionValue(impAEQbTJ, "");
            return new C27249jrd(impAEQbTJ);
        }
        iMN imnKWHzl = iMN.KWHzl(android.view.LayoutInflater.from(getContext()), this, false);
        Intrinsics.checkNotNullExpressionValue(imnKWHzl, "");
        return new C27246jra(imnKWHzl);
    }

    private final void copydefault() {
        removeAllViews();
        addView(KWHzl().KWHzl());
        final InterfaceC27313jso interfaceC27313jsoKWHzl = KWHzl();
        interfaceC27313jsoKWHzl.djBIcL().setOnClickListener(new View.OnClickListener() { // from class: o.jqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27187jqU.EZpvd(this.EZpvd, view);
            }
        });
        interfaceC27313jsoKWHzl.AhwBna().setOnClickListener(new View.OnClickListener() { // from class: o.jqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27187jqU.AEQbTJ(interfaceC27313jsoKWHzl, view);
            }
        });
    }

    public static final void EZpvd(C27187jqU c27187jqU, android.view.View view) {
        View.OnClickListener onClickListener;
        InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean = c27187jqU.EZpvd;
        if (investSubscriptionReceiveInfoUIBean != null) {
            Intrinsics.copydefault(investSubscriptionReceiveInfoUIBean);
            if (investSubscriptionReceiveInfoUIBean.isDataErro() || (onClickListener = c27187jqU.copydefault) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    public static final void AEQbTJ(InterfaceC27313jso interfaceC27313jso, android.view.View view) {
        interfaceC27313jso.djBIcL().performClick();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxA.setPileAvatarLayoutNoSmallIcon$default(o.jxA, android.content.Context, o.jqt, com.okinc.business.invest_biz.data.bean.InvestmentLogoData, float, int, float, int, int, java.lang.Object):void */
    public final void setData(@NotNull InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        this.EZpvd = investSubscriptionReceiveInfoUIBean;
        InterfaceC27313jso interfaceC27313jsoKWHzl = KWHzl();
        if (investSubscriptionReceiveInfoUIBean.getInvestWithToken() != null) {
            interfaceC27313jsoKWHzl.AYXKKw().setVisibility(0);
            interfaceC27313jsoKWHzl.OLrzqt().setVisibility(0);
            C27538jxA c27538jxA = C27538jxA.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C27212jqt c27212jqtAYXKKw = interfaceC27313jsoKWHzl.AYXKKw();
            java.util.List<InvestTokenWithAmount> investWithToken = investSubscriptionReceiveInfoUIBean.getInvestWithToken();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(investWithToken, 10));
            java.util.Iterator<T> it = investWithToken.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvestTokenWithAmount) it.next()).getTokenLogo());
            }
            c27538jxA.OLrzqt(context, c27212jqtAYXKKw, new InvestmentLogoData(arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 24.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : C27569jxf.OLrzqt.OLrzqt());
        } else {
            interfaceC27313jsoKWHzl.AYXKKw().setVisibility(8);
            interfaceC27313jsoKWHzl.OLrzqt().setVisibility(8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) investSubscriptionReceiveInfoUIBean.getSwapToToken())) {
            interfaceC27313jsoKWHzl.valueOf().setVisibility(0);
            interfaceC27313jsoKWHzl.AEQbTJ().setVisibility(0);
            C27538jxA c27538jxA2 = C27538jxA.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C27212jqt c27212jqtValueOf = interfaceC27313jsoKWHzl.valueOf();
            java.util.List<InvestTokenWithAmount> swapToToken = investSubscriptionReceiveInfoUIBean.getSwapToToken();
            Intrinsics.copydefault(swapToToken);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(swapToToken, 10));
            java.util.Iterator<T> it2 = swapToToken.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InvestTokenWithAmount) it2.next()).getTokenLogo());
            }
            c27538jxA2.OLrzqt(context2, c27212jqtValueOf, new InvestmentLogoData(arrayList2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 24.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : C27569jxf.OLrzqt.OLrzqt());
        } else {
            interfaceC27313jsoKWHzl.valueOf().setVisibility(8);
            interfaceC27313jsoKWHzl.AEQbTJ().setVisibility(8);
        }
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C27569jxf.loadCircleWithBorder$default(c27569jxf, interfaceC27313jsoKWHzl.EZpvd(), investSubscriptionReceiveInfoUIBean.getPlatformLogo(), c27569jxf.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DNMMPQ);
        android.graphics.drawable.Drawable drawableMutate = drawableKWHzl != null ? drawableKWHzl.mutate() : null;
        if (investSubscriptionReceiveInfoUIBean.isDataErro()) {
            if (drawableMutate != null) {
                DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
                interfaceC27313jsoKWHzl.copydefault().setImageDrawable(drawableMutate);
            }
        } else if (drawableMutate != null) {
            DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            interfaceC27313jsoKWHzl.copydefault().setImageDrawable(drawableMutate);
        }
        interfaceC27313jsoKWHzl.copydefault().setRotation(90.0f);
        android.widget.TextView textViewAhwBna = interfaceC27313jsoKWHzl.AhwBna();
        if (investSubscriptionReceiveInfoUIBean.getTipsBean().getTipsType() != 0) {
            int tipsType = investSubscriptionReceiveInfoUIBean.getTipsBean().getTipsType();
            if (tipsType == 1) {
                textViewAhwBna.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcMfJK));
            } else if (tipsType == 2) {
                textViewAhwBna.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fXYAwm), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", investSubscriptionReceiveInfoUIBean.getTipsBean().getTokenSymbol()))));
            } else if (tipsType == 3) {
                textViewAhwBna.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fXYAwm), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", investSubscriptionReceiveInfoUIBean.getTipsBean().getSwapTokenSymbol()))));
            } else if (tipsType == 4) {
                java.lang.String tokenSymbol = investSubscriptionReceiveInfoUIBean.getTipsBean().getTokenSymbol();
                java.lang.String strAYXKKw = investSubscriptionReceiveInfoUIBean.getTipsBean().getSwapTokenSymbol().length() != 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu) : "";
                textViewAhwBna.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fXYAwm), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol + strAYXKKw + investSubscriptionReceiveInfoUIBean.getTipsBean().getSwapTokenSymbol()))));
            } else if (tipsType == 5) {
                textViewAhwBna.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.hGuIrQ), C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", investSubscriptionReceiveInfoUIBean.getTipsBean().getTokenSymbol()))));
            } else {
                textViewAhwBna.setText("");
            }
            textViewAhwBna.setVisibility(0);
            return;
        }
        textViewAhwBna.setVisibility(8);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().gEmmrt().setText(str);
    }

    public final void EZpvd(boolean z, boolean z2) {
        if (this.KWHzl == z && this.OLrzqt == z2) {
            return;
        }
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.AEQbTJ = null;
        copydefault();
    }
}
