package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hWB extends android.widget.RelativeLayout {
    public hGN AEQbTJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWB(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hWB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context);
    }

    public final void OLrzqt(android.content.Context context) {
        hGN hgnEZpvd = hGN.EZpvd(android.view.LayoutInflater.from(context), this, true);
        this.AEQbTJ = hgnEZpvd;
        if (hgnEZpvd != null) {
            hgnEZpvd.gEmmrt.setAutoSizeTextTypeFixWithConfiguration(12.0f, 20.0f, 2);
        }
    }

    public final void AEQbTJ(@NotNull OrderDetailBean orderDetailBean, @NotNull java.lang.String str) {
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt(orderDetailBean.getReceiveTokenStatus(), "0")) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        hGN hgn = this.AEQbTJ;
        if (hgn != null) {
            android.widget.ImageView imageView = hgn.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadImageWithBorder$default(imageView, orderDetailBean.getToChainLogoUrl(), null, 2, null);
            hgn.OLrzqt.setAlpha(Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getStatus(), (java.lang.Object) "100") ? 0.3f : 1.0f);
            if (orderDetailBean.isReceiveSuccess()) {
                C24247iaI c24247iaI = hgn.gEmmrt;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c24247iaI.setTextColor(C33508mxl.copydefault(context));
                hgn.gEmmrt.setAlpha(1.0f);
            } else if (orderDetailBean.isReceiveTerminalTransforming() || orderDetailBean.isReceiveWaiting()) {
                hgn.gEmmrt.setAlpha(0.3f);
            } else {
                C24247iaI c24247iaI2 = hgn.gEmmrt;
                int i = C52761wXj.Activity.DeEinT;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c24247iaI2.setTextColor(C25382ivf.copydefault(i, context2));
                hgn.gEmmrt.setAlpha(1.0f);
            }
            hgn.valueOf.setText(orderDetailBean.getToChainName());
            hgn.copydefault.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getReceiveTokenExploreUrl()) ? 0 : 8);
            hGN hgn2 = this.AEQbTJ;
            if (hgn2 != null && (linearLayout = hgn2.AYXKKw) != null) {
                linearLayout.setVisibility(orderDetailBean.isBridgeStatus() ? 8 : 0);
            }
            java.lang.String strKWHzl = pTD.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.DxnCrt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", orderDetailBean.getReceiveAmountShowData()), C56390yDp.OLrzqt("symbol", orderDetailBean.getReceiveTokenSymbol())));
            hGN hgn3 = this.AEQbTJ;
            if (hgn3 != null) {
                hgn3.gEmmrt.setText(strKWHzl);
            }
            EZpvd(orderDetailBean);
            OLrzqt(orderDetailBean);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [118=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void EZpvd(OrderDetailBean orderDetailBean) {
        AppCompatTextView appCompatTextView;
        C24253iaO c24253iaO;
        android.widget.ImageView imageView;
        AppCompatImageView appCompatImageView;
        android.graphics.drawable.Drawable drawable;
        AppCompatTextView appCompatTextView2;
        C24253iaO c24253iaO2;
        android.widget.ImageView imageView2;
        AppCompatImageView appCompatImageView2;
        android.graphics.drawable.Drawable drawable2;
        AppCompatTextView appCompatTextView3;
        C24253iaO c24253iaO3;
        android.widget.ImageView imageView3;
        AppCompatImageView appCompatImageView3;
        android.graphics.drawable.Drawable drawable3;
        AppCompatTextView appCompatTextView4;
        C24253iaO c24253iaO4;
        android.widget.ImageView imageView4;
        AppCompatImageView appCompatImageView4;
        android.graphics.drawable.Drawable drawable4;
        AppCompatTextView appCompatTextView5;
        C24253iaO c24253iaO5;
        android.widget.ImageView imageView5;
        AppCompatImageView appCompatImageView5;
        android.graphics.drawable.Drawable drawable5;
        C24253iaO c24253iaO6;
        C24253iaO c24253iaO7;
        java.lang.String receiveTokenStatus = orderDetailBean.getReceiveTokenStatus();
        hGN hgn = this.AEQbTJ;
        if (hgn != null && (c24253iaO7 = hgn.djBIcL) != null) {
            c24253iaO7.setVisibility(0);
        }
        hGN hgn2 = this.AEQbTJ;
        if (hgn2 != null && (c24253iaO6 = hgn2.djBIcL) != null) {
            c24253iaO6.setState(OLrzqt(receiveTokenStatus));
        }
        int iHashCode = receiveTokenStatus.hashCode();
        if (iHashCode != 1444) {
            switch (iHashCode) {
                case 49:
                    if (receiveTokenStatus.equals("1")) {
                        hGN hgn3 = this.AEQbTJ;
                        if (hgn3 != null && (appCompatImageView3 = hgn3.EZpvd) != null && (drawable3 = appCompatImageView3.getDrawable()) != null) {
                            drawable3.setTint(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
                        }
                        hGN hgn4 = this.AEQbTJ;
                        if (hgn4 != null && (imageView3 = hgn4.OLrzqt) != null) {
                            imageView3.setAlpha(0.3f);
                        }
                        hGN hgn5 = this.AEQbTJ;
                        if (hgn5 != null && (c24253iaO3 = hgn5.djBIcL) != null) {
                            c24253iaO3.setVisibility(4);
                        }
                        hGN hgn6 = this.AEQbTJ;
                        if (hgn6 == null || (appCompatTextView3 = hgn6.valueOf) == null) {
                            return;
                        }
                        appCompatTextView3.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
                        return;
                    }
                    break;
                case 50:
                    if (receiveTokenStatus.equals("2")) {
                        hGN hgn7 = this.AEQbTJ;
                        if (hgn7 != null && (appCompatImageView4 = hgn7.EZpvd) != null && (drawable4 = appCompatImageView4.getDrawable()) != null) {
                            drawable4.setTint(C25382ivf.KWHzl(C32113mPz.ActionBar.iwGUEr));
                        }
                        hGN hgn8 = this.AEQbTJ;
                        if (hgn8 != null && (imageView4 = hgn8.OLrzqt) != null) {
                            imageView4.setAlpha(1.0f);
                        }
                        hGN hgn9 = this.AEQbTJ;
                        if (hgn9 != null && (c24253iaO4 = hgn9.djBIcL) != null) {
                            c24253iaO4.setVisibility(0);
                        }
                        hGN hgn10 = this.AEQbTJ;
                        if (hgn10 == null || (appCompatTextView4 = hgn10.valueOf) == null) {
                            return;
                        }
                        appCompatTextView4.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.iwGUEr));
                        return;
                    }
                    break;
                case 51:
                    if (receiveTokenStatus.equals("3")) {
                        hGN hgn11 = this.AEQbTJ;
                        if (hgn11 != null && (appCompatImageView5 = hgn11.EZpvd) != null && (drawable5 = appCompatImageView5.getDrawable()) != null) {
                            drawable5.setTint(C25382ivf.KWHzl(C32113mPz.ActionBar.iwGUEr));
                        }
                        hGN hgn12 = this.AEQbTJ;
                        if (hgn12 != null && (imageView5 = hgn12.OLrzqt) != null) {
                            imageView5.setAlpha(1.0f);
                        }
                        hGN hgn13 = this.AEQbTJ;
                        if (hgn13 != null && (c24253iaO5 = hgn13.djBIcL) != null) {
                            c24253iaO5.setVisibility(4);
                        }
                        hGN hgn14 = this.AEQbTJ;
                        if (hgn14 == null || (appCompatTextView5 = hgn14.valueOf) == null) {
                            return;
                        }
                        appCompatTextView5.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.iwGUEr));
                        return;
                    }
                    break;
            }
        } else if (receiveTokenStatus.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
            hGN hgn15 = this.AEQbTJ;
            if (hgn15 != null && (appCompatImageView = hgn15.EZpvd) != null && (drawable = appCompatImageView.getDrawable()) != null) {
                drawable.setTint(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
            }
            hGN hgn16 = this.AEQbTJ;
            if (hgn16 != null && (imageView = hgn16.OLrzqt) != null) {
                imageView.setAlpha(0.3f);
            }
            hGN hgn17 = this.AEQbTJ;
            if (hgn17 != null && (c24253iaO = hgn17.djBIcL) != null) {
                c24253iaO.setVisibility(4);
            }
            hGN hgn18 = this.AEQbTJ;
            if (hgn18 == null || (appCompatTextView = hgn18.valueOf) == null) {
                return;
            }
            appCompatTextView.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
            return;
        }
        hGN hgn19 = this.AEQbTJ;
        if (hgn19 != null && (appCompatImageView2 = hgn19.EZpvd) != null && (drawable2 = appCompatImageView2.getDrawable()) != null) {
            drawable2.setTint(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
        }
        hGN hgn20 = this.AEQbTJ;
        if (hgn20 != null && (imageView2 = hgn20.OLrzqt) != null) {
            imageView2.setAlpha(0.3f);
        }
        hGN hgn21 = this.AEQbTJ;
        if (hgn21 != null && (c24253iaO2 = hgn21.djBIcL) != null) {
            c24253iaO2.setVisibility(0);
        }
        hGN hgn22 = this.AEQbTJ;
        if (hgn22 == null || (appCompatTextView2 = hgn22.valueOf) == null) {
            return;
        }
        appCompatTextView2.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(java.lang.String str) {
        switch (str.hashCode()) {
            case 49:
                return !str.equals("1") ? MultiTransferSignData.DEFAULT_INTERVAL : "100";
            case 50:
                if (str.equals("2")) {
                    return "0";
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return "1";
                }
                break;
        }
    }

    public final void OLrzqt(final OrderDetailBean orderDetailBean) {
        AppCompatImageView appCompatImageView;
        hGN hgn = this.AEQbTJ;
        if (hgn == null || (appCompatImageView = hgn.copydefault) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.hWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hWB.KWHzl(this.AEQbTJ, orderDetailBean, view);
            }
        });
    }

    public static final void KWHzl(hWB hwb, OrderDetailBean orderDetailBean, android.view.View view) {
        C25352ivB.KWHzl(hwb.getContext(), orderDetailBean.getReceiveTokenExploreUrl());
    }
}
