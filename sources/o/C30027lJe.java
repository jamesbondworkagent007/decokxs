package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.buysell.common.FiatOrderStatus;
import com.okinc.buysell.common.OKRemoteImageResource;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3718ArI;
import o.C31351lsQ;
import o.C47244tmQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellOrderType;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: renamed from: o.lJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30027lJe extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final lxI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30027lJe(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:49) call: o.lJe.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30027lJe(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30027lJe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.USBtdM, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        lxI lxi = (lxI) viewDataBindingInflate;
        this.OLrzqt = lxi;
        final AbstractC31607lxi abstractC31607lxi = lxi.fIwbmz;
        abstractC31607lxi.AEQbTJ.setSelected(false);
        abstractC31607lxi.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30027lJe.copydefault(abstractC31607lxi, view);
            }
        });
    }

    public static final void copydefault(AbstractC31607lxi abstractC31607lxi, android.view.View view) {
        abstractC31607lxi.AEQbTJ.setSelected(!r4.isSelected());
        abstractC31607lxi.AkhnZx.setVisibility(!abstractC31607lxi.AEQbTJ.isSelected() ? 8 : 0);
        abstractC31607lxi.fetchVPNInfo.setVisibility(abstractC31607lxi.AEQbTJ.isSelected() ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull C3682AqZ c3682AqZ, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String strKWHzl;
        java.lang.String str;
        boolean z;
        java.lang.String string;
        java.lang.String strOLrzqt;
        java.lang.String strAuCTel;
        boolean zEZpvd;
        java.lang.String strFJNWhG;
        java.lang.StringBuilder sb;
        java.lang.String string2;
        final C3686Aqd c3686AqdAkhnZx;
        java.lang.String strAYXKKw;
        java.lang.String upperCase;
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        setupFee(c3682AqZ, fragmentManager);
        lxI lxi = this.OLrzqt;
        java.util.List<C3715ArF> listQOLQEE = c3682AqZ.QOLQEE();
        if (listQOLQEE.size() >= 2) {
            lxi.iRxXKY.setData(c3682AqZ, listQOLQEE.get(0), listQOLQEE.get(1));
            lxi.iRxXKY.setVisibility(0);
            lxi.gkJEwt.setVisibility(0);
            lxi.zsXlph.setVisibility(0);
            lxi.accept.setVisibility(4);
        }
        C3665AqI fieldNames = c3682AqZ.getFieldNames();
        if (fieldNames != null) {
            lxi.QbewEr.setText(fieldNames.copydefault());
            lxi.hDKMBd.setVisibility(0);
        } else {
            lxi.hDKMBd.setVisibility(8);
        }
        android.widget.ImageView imageView = lxi.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (c3682AqZ.DTwDnp()) {
            C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
            if (c3687AqeGEmmrt == null) {
                str = null;
                C33054mpH.loadUrl$default(imageView, str, null, 0, 0, 14, null);
                z = c3682AqZ.ORxRYg() != BuySellTradeType.BUY;
                boolean z2 = c3682AqZ.getNewProxyInstance() != BuySellOrderType.RECURRING;
                if (z) {
                    string = getContext().getString(C31351lsQ.Activity.frkDMe);
                } else if (z2) {
                    string = getContext().getString(C47244tmQ.Activity.AEQbTJ);
                } else {
                    string = getContext().getString(C31351lsQ.Activity.DGUQLIhJrIAr);
                }
                Intrinsics.copydefault((java.lang.Object) string);
                lxi.QUSxYX.setText(string);
                if (!z && z2 && C33129mqd.OLrzqt((java.lang.CharSequence) c3682AqZ.hDKMBd())) {
                    ConstraintLayout constraintLayout = lxi.getFieldNames;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                    lxi.fFgQHt.setText(c3682AqZ.hDKMBd());
                } else {
                    ConstraintLayout constraintLayout2 = lxi.getFieldNames;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                    constraintLayout2.setVisibility(8);
                }
                if (!c3682AqZ.DTwDnp()) {
                    EZpvd(c3682AqZ);
                    lxi.fIwbmz.getRoot().setVisibility(0);
                    lxi.zsXlph.setVisibility(8);
                } else {
                    lxi.fIwbmz.getRoot().setVisibility(8);
                    lxi.zsXlph.setVisibility(0);
                }
                if (z) {
                    lxi.hUfVAv.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fmB));
                    lxi.fZBcTu.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDCKfqP));
                } else {
                    lxi.hUfVAv.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DCUTEI));
                    lxi.fZBcTu.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DlABUU));
                }
                android.widget.TextView textView = lxi.iZzfmt;
                if (c3682AqZ.AkhnZx() == null) {
                    strOLrzqt = C33070mpX.AYXKKw(C31351lsQ.Activity.htlTjW);
                } else {
                    strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DzkRMH), C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoName", c3682AqZ.copydefault())));
                }
                textView.setText(strOLrzqt);
                android.widget.TextView textView2 = lxi.flVtFt;
                if (c3682AqZ.AkhnZx() == null) {
                    java.lang.String strOLrzqt2 = C31661lzi.OLrzqt(c3682AqZ.AubY(), false, c3682AqZ.gHZMYf(), c3682AqZ.gHZMYf(), C38307pTy.Companion.KWHzl(0, 15), RoundingMode.DOWN);
                    strAuCTel = "1 " + c3682AqZ.copydefault() + "≈" + strOLrzqt2;
                } else if (c3682AqZ.AwvSrB().length() == 0) {
                    java.lang.String strAubY = c3682AqZ.AubY();
                    java.lang.String strGHZMYf = c3682AqZ.gHZMYf();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase2 = strGHZMYf.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    strAuCTel = strAubY + " " + upperCase2;
                } else {
                    strAuCTel = c3682AqZ.AuCTel();
                }
                textView2.setText(strAuCTel);
                zEZpvd = Intrinsics.EZpvd(c3682AqZ.zuBGHE(), AbstractC3718ArI.Activity.INSTANCE);
                android.widget.TextView textView3 = lxi.UeEOUB;
                if (!c3682AqZ.DTwDnp()) {
                    C3687Aqe c3687AqeGEmmrt2 = c3682AqZ.gEmmrt();
                    java.lang.String strCopydefault = (c3687AqeGEmmrt2 == null || (strAEQbTJ = c3687AqeGEmmrt2.AEQbTJ()) == null) ? null : C31661lzi.copydefault(strAEQbTJ, false);
                    C3687Aqe c3687AqeGEmmrt3 = c3682AqZ.gEmmrt();
                    if (c3687AqeGEmmrt3 == null || (strEZpvd = c3687AqeGEmmrt3.EZpvd()) == null) {
                        upperCase = null;
                    } else {
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        upperCase = strEZpvd.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    }
                    strFJNWhG = strCopydefault + " " + upperCase;
                } else if (c3682AqZ.AkhnZx() != null && !zEZpvd) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    if (z) {
                        sb2.append("~");
                    }
                    java.lang.String strCopydefault2 = C31661lzi.copydefault(c3682AqZ.AEQbTJ(), false);
                    java.lang.String strCopydefault3 = c3682AqZ.copydefault();
                    java.util.Locale locale3 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    java.lang.String upperCase3 = strCopydefault3.toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    sb2.append(strCopydefault2 + " " + upperCase3);
                    strFJNWhG = sb2.toString();
                } else {
                    strFJNWhG = c3682AqZ.fJNWhG();
                }
                textView3.setText(strFJNWhG);
                if (c3682AqZ.AkhnZx() == null || c3682AqZ.AwvSrB().length() == 0) {
                    sb = new java.lang.StringBuilder();
                    if (!zEZpvd && !z) {
                        sb.append("~");
                    }
                    java.lang.String strCopydefault4 = C31661lzi.copydefault(c3682AqZ.wlaJM(), false);
                    java.lang.String strGHZMYf2 = c3682AqZ.gHZMYf();
                    java.util.Locale locale4 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale4, "");
                    java.lang.String upperCase4 = strGHZMYf2.toUpperCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                    sb.append(strCopydefault4 + " " + upperCase4);
                    string2 = sb.toString();
                } else {
                    string2 = c3682AqZ.fIwbmz();
                }
                lxi.AxsJAYaxsJAY.setText(string2);
                if (!gEmmrt(c3682AqZ)) {
                    android.widget.ImageView imageView2 = lxi.QKVWgx;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    C33054mpH.loadUrl$default(imageView2, copydefault(c3682AqZ), null, 0, 0, 14, null);
                    lxi.QKVWgx.setVisibility(0);
                    lxi.DTwDnp.setVisibility(8);
                } else {
                    android.widget.ImageView imageView3 = lxi.DTwDnp;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C33054mpH.loadUrl$default(imageView3, copydefault(c3682AqZ), null, 0, 0, 14, null);
                    lxi.QKVWgx.setVisibility(8);
                }
                if (KWHzl(c3682AqZ)) {
                    lxi.AuCTel.setVisibility(8);
                } else {
                    lxi.AuCTel.setVisibility(0);
                    lxi.dNCPSb.setText(AEQbTJ(c3682AqZ));
                    if (c3682AqZ.OLrzqt().length() > 0) {
                        lxi.zuBGHE.setText(c3682AqZ.OLrzqt());
                        lxi.zuBGHE.setVisibility(0);
                    } else {
                        lxi.zuBGHE.setVisibility(8);
                    }
                }
                lxi.OcIXYQ.setText(c3682AqZ.isConnected());
                android.widget.ImageView imageView4 = lxi.ORxRYg;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                C33054mpH.loadUrl$default(imageView4, OLrzqt(c3682AqZ), null, 0, 0, 14, null);
                c3686AqdAkhnZx = c3682AqZ.AkhnZx();
                if (c3686AqdAkhnZx == null) {
                    lxi.sSMYrx.setVisibility(8);
                    lxi.AhwBna.setVisibility(0);
                    android.widget.ImageView imageView5 = lxi.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "");
                    C33054mpH.KWHzl(imageView5, C33492mxV.OLrzqt() ? c3686AqdAkhnZx.copydefault() : c3686AqdAkhnZx.KWHzl());
                    android.widget.ImageView imageView6 = lxi.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(imageView6, "");
                    C33054mpH.KWHzl(imageView6, c3686AqdAkhnZx.fetchVPNInfo());
                    lxi.fJNWhG.setVisibility(0);
                    android.widget.ImageView imageView7 = lxi.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(imageView7, "");
                    C33054mpH.loadUrl$default(imageView7, c3686AqdAkhnZx.fetchVPNInfo(), null, 0, 0, 14, null);
                    lxi.QVAiDq.setText(c3686AqdAkhnZx.djBIcL());
                    lxi.gasjUx.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.tIwhY));
                    if (zEZpvd && c3686AqdAkhnZx.AEQbTJ().length() > 0 && c3686AqdAkhnZx.EZpvd().length() > 0) {
                        android.widget.TextView textView4 = lxi.RJOkX;
                        textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        textView4.setClickable(true);
                        textView4.setVisibility(0);
                        C30329lUi c30329lUi = C30329lUi.AEQbTJ;
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        lxi.RJOkX.setText(c30329lUi.AEQbTJ(context, C33069mpW.OLrzqt(c3686AqdAkhnZx.AEQbTJ(), C56423yEv.EZpvd(C56390yDp.OLrzqt("disclaimerLearnMore", C33070mpX.AYXKKw(C31351lsQ.Activity.zKcAg)))), C33070mpX.AYXKKw(C31351lsQ.Activity.zKcAg), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.lJc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C30027lJe.AEQbTJ(this.EZpvd, c3686AqdAkhnZx);
                            }
                        }));
                    }
                } else {
                    lxi.sSMYrx.setVisibility(0);
                    lxi.AhwBna.setVisibility(8);
                    lxi.RJOkX.setVisibility(8);
                    lxi.fJNWhG.setVisibility(8);
                    lxi.gasjUx.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dzCpvv));
                }
                lxi.OLrzqt.setVisibility(8);
                lxi.aKErDB.setText(pTA.formatSimpleDateTime$default(new Date(c3682AqZ.DbNXlk()), null, 1, null));
                C57635ymD c57635ymD = lxi.giSNqX;
                Intrinsics.checkNotNullExpressionValue(c57635ymD, "");
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                if (c3682AqZ.AkhnZx() == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.tIwhY);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.dzCpvv);
                }
                C31661lzi.OLrzqt(c57635ymD, context2, (20 & 2) != 0 ? null : OtcExtraKeys.ORDER_ID, (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : strAYXKKw, (20 & 16) != 0 ? null : null);
                lxi.giSNqX.setText(c3682AqZ.iwGUEr());
            }
            strKWHzl = c3687AqeGEmmrt.AYXKKw();
        } else {
            strKWHzl = c3682AqZ.KWHzl();
        }
        str = strKWHzl;
        C33054mpH.loadUrl$default(imageView, str, null, 0, 0, 14, null);
        if (c3682AqZ.ORxRYg() != BuySellTradeType.BUY) {
        }
        if (c3682AqZ.getNewProxyInstance() != BuySellOrderType.RECURRING) {
        }
        if (z) {
        }
        Intrinsics.copydefault((java.lang.Object) string);
        lxi.QUSxYX.setText(string);
        if (!z) {
            ConstraintLayout constraintLayout22 = lxi.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(constraintLayout22, "");
            constraintLayout22.setVisibility(8);
        }
        if (!c3682AqZ.DTwDnp()) {
        }
        if (z) {
        }
        android.widget.TextView textView5 = lxi.iZzfmt;
        if (c3682AqZ.AkhnZx() == null) {
        }
        textView5.setText(strOLrzqt);
        android.widget.TextView textView22 = lxi.flVtFt;
        if (c3682AqZ.AkhnZx() == null) {
        }
        textView22.setText(strAuCTel);
        zEZpvd = Intrinsics.EZpvd(c3682AqZ.zuBGHE(), AbstractC3718ArI.Activity.INSTANCE);
        android.widget.TextView textView32 = lxi.UeEOUB;
        if (!c3682AqZ.DTwDnp()) {
        }
        textView32.setText(strFJNWhG);
        if (c3682AqZ.AkhnZx() == null) {
            sb = new java.lang.StringBuilder();
            if (!zEZpvd) {
                sb.append("~");
            }
            java.lang.String strCopydefault42 = C31661lzi.copydefault(c3682AqZ.wlaJM(), false);
            java.lang.String strGHZMYf22 = c3682AqZ.gHZMYf();
            java.util.Locale locale42 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale42, "");
            java.lang.String upperCase42 = strGHZMYf22.toUpperCase(locale42);
            Intrinsics.checkNotNullExpressionValue(upperCase42, "");
            sb.append(strCopydefault42 + " " + upperCase42);
            string2 = sb.toString();
        }
        lxi.AxsJAYaxsJAY.setText(string2);
        if (!gEmmrt(c3682AqZ)) {
        }
        if (KWHzl(c3682AqZ)) {
        }
        lxi.OcIXYQ.setText(c3682AqZ.isConnected());
        android.widget.ImageView imageView42 = lxi.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(imageView42, "");
        C33054mpH.loadUrl$default(imageView42, OLrzqt(c3682AqZ), null, 0, 0, 14, null);
        c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        if (c3686AqdAkhnZx == null) {
        }
        lxi.OLrzqt.setVisibility(8);
        lxi.aKErDB.setText(pTA.formatSimpleDateTime$default(new Date(c3682AqZ.DbNXlk()), null, 1, null));
        C57635ymD c57635ymD2 = lxi.giSNqX;
        Intrinsics.checkNotNullExpressionValue(c57635ymD2, "");
        android.content.Context context22 = getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "");
        if (c3682AqZ.AkhnZx() == null) {
        }
        C31661lzi.OLrzqt(c57635ymD2, context22, (20 & 2) != 0 ? null : OtcExtraKeys.ORDER_ID, (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : strAYXKKw, (20 & 16) != 0 ? null : null);
        lxi.giSNqX.setText(c3682AqZ.iwGUEr());
    }

    public static final Unit AEQbTJ(C30027lJe c30027lJe, C3686Aqd c3686Aqd) {
        android.content.Context context = c30027lJe.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c30027lJe.copydefault(context, c3686Aqd.EZpvd());
        return Unit.INSTANCE;
    }

    public final void setupFee(final C3682AqZ c3682AqZ, final androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String strAYXKKw;
        lxI lxi = this.OLrzqt;
        if (c3682AqZ.valueOf() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
            lxi.iwGUEr.setVisibility(8);
            return;
        }
        lxi.iwGUEr.setVisibility(0);
        if (c3682AqZ.AkhnZx() != null) {
            lxi.values.setVisibility(0);
            android.widget.TextView textView = lxi.finit;
            C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
            textView.setText(c3686AqdAkhnZx != null ? c3686AqdAkhnZx.valueOf() : null);
            lxi.uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.lJd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30027lJe.setupFee$lambda$13$lambda$12(c3682AqZ, fragmentManager, view);
                }
            });
            return;
        }
        lxi.values.setVisibility(8);
        android.widget.TextView textView2 = lxi.dvKsVJ;
        if (Intrinsics.EZpvd((java.lang.Object) c3682AqZ.fetchVPNInfo(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DDjfYY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.fdOvFl);
        }
        textView2.setText(strAYXKKw);
        lxi.finit.setText(c3682AqZ.ejfBZ());
    }

    public static final void setupFee$lambda$13$lambda$12(C3682AqZ c3682AqZ, androidx.fragment.app.FragmentManager fragmentManager, android.view.View view) {
        lIW.Companion.copydefault(c3682AqZ).show(fragmentManager, "BSCDexFeeInfoBottomSheet");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0.intValue() != r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(C3682AqZ c3682AqZ) {
        C3686Aqd c3686AqdAkhnZx;
        if (c3682AqZ.valueOf() == ChannelCategoryCode.BALANCE.getCode() && C33129mqd.OLrzqt((java.lang.CharSequence) c3682AqZ.gHZMYf())) {
            if (c3682AqZ.AkhnZx() != null && (c3686AqdAkhnZx = c3682AqZ.AkhnZx()) != null) {
                java.lang.Integer numOLrzqt = c3686AqdAkhnZx.OLrzqt();
                int value = FiatOrderStatus.IGNORED.getValue();
                if (numOLrzqt != null) {
                }
            }
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.gCZUJG), C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatName", c3682AqZ.gHZMYf())));
        }
        java.lang.String strFetchVPNInfo = c3682AqZ.fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.CARD.getCode()) || Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
            return c3682AqZ.zLjUOn() + " " + c3682AqZ.uzCIH();
        }
        if (Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            return c3682AqZ.uzCIH();
        }
        return c3682AqZ.zLjUOn();
    }

    public final boolean gEmmrt(C3682AqZ c3682AqZ) {
        java.lang.String strFetchVPNInfo = c3682AqZ.fetchVPNInfo();
        return Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode()) || Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.BLIK_BUY.getCode()) || Intrinsics.EZpvd((java.lang.Object) strFetchVPNInfo, (java.lang.Object) ChannelPlatformCode.APPLE_PAY.getCode());
    }

    public final java.lang.String copydefault(C3682AqZ c3682AqZ) {
        if (c3682AqZ.valueOf() == ChannelCategoryCode.BALANCE.getCode() && C33129mqd.OLrzqt((java.lang.CharSequence) c3682AqZ.sSMYrx())) {
            return c3682AqZ.sSMYrx();
        }
        java.lang.String strAuCTelauCTel = C33492mxV.OLrzqt() ? c3682AqZ.AuCTelauCTel() : c3682AqZ.zsXlph();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAuCTelauCTel)) {
            return strAuCTelauCTel;
        }
        return null;
    }

    public final java.lang.String OLrzqt(C3682AqZ c3682AqZ) {
        if (C33492mxV.OLrzqt()) {
            return c3682AqZ.djBIcL();
        }
        return c3682AqZ.AYXKKw();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C3682AqZ c3682AqZ) {
        android.graphics.drawable.Drawable drawableOLrzqt;
        java.lang.String upperCase;
        java.lang.String strAkhnZx;
        java.lang.String localized$default;
        java.lang.String strDjBIcL;
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        AbstractC31607lxi abstractC31607lxi = this.OLrzqt.fIwbmz;
        OKRemoteImageResource oKRemoteImageResource = OKRemoteImageResource.copydefault;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zAEQbTJ = oKRemoteImageResource.AEQbTJ(context);
        abstractC31607lxi.KWHzl.setVisibility(0);
        abstractC31607lxi.AuCTel.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fjfviF));
        C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
        java.lang.String strValueOf = java.lang.String.valueOf(c3687AqeGEmmrt != null ? c3687AqeGEmmrt.EZpvd() : null);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase2 = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (upperCase2 == null) {
            upperCase2 = "";
        }
        android.widget.TextView textView = abstractC31607lxi.djBIcL;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setText(C33069mpW.KWHzl(context2, C31351lsQ.Activity.fERRXa, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, upperCase2))));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(mDC.StateListAnimator.AhwBna);
        if (drawableKWHzl != null) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawableOLrzqt = C33057mpK.OLrzqt(drawableKWHzl, context3, C52761wXj.Activity.TarCU);
        } else {
            drawableOLrzqt = null;
        }
        abstractC31607lxi.gEmmrt.AEQbTJ.setBackground(drawableOLrzqt);
        abstractC31607lxi.gEmmrt.copydefault.setText("1");
        abstractC31607lxi.AhwBna.copydefault.setText("2");
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(mDC.StateListAnimator.AhwBna);
        if (Intrinsics.EZpvd(c3682AqZ.zuBGHE(), AbstractC3718ArI.Activity.INSTANCE)) {
            C3687Aqe c3687AqeGEmmrt2 = c3682AqZ.gEmmrt();
            java.lang.Integer numValueOf = c3687AqeGEmmrt2 != null ? java.lang.Integer.valueOf(c3687AqeGEmmrt2.valueOf()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView2 = abstractC31607lxi.djBIcL;
                int i = C52761wXj.Activity.ULRxlR;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                textView2.setTextColor(C33070mpX.OLrzqt(i, context4));
                ConstraintLayout constraintLayout = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == -1) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView3 = abstractC31607lxi.djBIcL;
                int i2 = C52761wXj.Activity.ULRxlR;
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView3.setTextColor(C33070mpX.OLrzqt(i2, context5));
                ConstraintLayout constraintLayout2 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout2.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_FINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView4 = abstractC31607lxi.djBIcL;
                int i3 = C52761wXj.Activity.TarCU;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                textView4.setTextColor(C33070mpX.OLrzqt(i3, context6));
                ConstraintLayout constraintLayout3 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.TarCU));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout3.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView5 = abstractC31607lxi.djBIcL;
                int i4 = C52761wXj.Activity.ULRxlR;
                android.content.Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                textView5.setTextColor(C33070mpX.OLrzqt(i4, context7));
                ConstraintLayout constraintLayout4 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout4.setBackground(drawableKWHzl2);
            } else {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView6 = abstractC31607lxi.djBIcL;
                int i5 = C52761wXj.Activity.ULRxlR;
                android.content.Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                textView6.setTextColor(C33070mpX.OLrzqt(i5, context8));
                ConstraintLayout constraintLayout5 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout5.setBackground(drawableKWHzl2);
            }
        } else {
            Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
            android.widget.TextView textView7 = abstractC31607lxi.djBIcL;
            int i6 = C52761wXj.Activity.ULRxlR;
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            textView7.setTextColor(C33070mpX.OLrzqt(i6, context9));
            ConstraintLayout constraintLayout6 = abstractC31607lxi.AhwBna.AEQbTJ;
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
            } else {
                drawableKWHzl2 = null;
            }
            constraintLayout6.setBackground(drawableKWHzl2);
        }
        android.widget.TextView textView8 = abstractC31607lxi.values;
        java.lang.String strCopydefault = C31661lzi.copydefault(c3682AqZ.AEQbTJ(), false);
        java.lang.String upperCase3 = c3682AqZ.copydefault().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
        textView8.setText(strCopydefault + " " + upperCase3);
        android.widget.TextView textView9 = abstractC31607lxi.valueOf;
        android.content.Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        int i7 = C31351lsQ.Activity.igXuih;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String strCopydefault2 = C31661lzi.copydefault(c3682AqZ.AEQbTJ(), false);
        java.lang.String upperCase4 = c3682AqZ.copydefault().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        pairArr[0] = C56390yDp.OLrzqt("usdtamount", strCopydefault2 + " " + upperCase4);
        C3687Aqe c3687AqeGEmmrt3 = c3682AqZ.gEmmrt();
        java.lang.String strCopydefault3 = (c3687AqeGEmmrt3 == null || (strAEQbTJ = c3687AqeGEmmrt3.AEQbTJ()) == null) ? null : C31661lzi.copydefault(strAEQbTJ, false);
        C3687Aqe c3687AqeGEmmrt4 = c3682AqZ.gEmmrt();
        if (c3687AqeGEmmrt4 == null || (strEZpvd = c3687AqeGEmmrt4.EZpvd()) == null) {
            upperCase = null;
        } else {
            upperCase = strEZpvd.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        pairArr[1] = C56390yDp.OLrzqt("cryptoamount", strCopydefault3 + " " + upperCase);
        textView9.setText(C33069mpW.KWHzl(context10, i7, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
        android.widget.TextView textView10 = abstractC31607lxi.AkhnZx;
        java.lang.String strCopydefault4 = C31661lzi.copydefault(c3682AqZ.AubY(), false);
        java.lang.String upperCase5 = c3682AqZ.gHZMYf().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        textView10.setText(strCopydefault4 + " " + upperCase5 + " ≈ 1 " + c3682AqZ.copydefault());
        C3687Aqe c3687AqeGEmmrt5 = c3682AqZ.gEmmrt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c3687AqeGEmmrt5 != null ? c3687AqeGEmmrt5.djBIcL() : null))) {
            C3687Aqe c3687AqeGEmmrt6 = c3682AqZ.gEmmrt();
            localized$default = (c3687AqeGEmmrt6 == null || (strDjBIcL = c3687AqeGEmmrt6.djBIcL()) == null) ? null : pTB.formatLocalized$default(strDjBIcL, null, 1, null);
        } else {
            C3687Aqe c3687AqeGEmmrt7 = c3682AqZ.gEmmrt();
            if (c3687AqeGEmmrt7 != null && (strAkhnZx = c3687AqeGEmmrt7.AkhnZx()) != null) {
                localized$default = pTB.formatLocalized$default(strAkhnZx, null, 1, null);
            }
        }
        android.widget.TextView textView11 = abstractC31607lxi.fetchVPNInfo;
        java.lang.String upperCase6 = c3682AqZ.copydefault().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase6, "");
        C3687Aqe c3687AqeGEmmrt8 = c3682AqZ.gEmmrt();
        textView11.setText(localized$default + " " + upperCase6 + " ≈ 1 " + (c3687AqeGEmmrt8 != null ? c3687AqeGEmmrt8.EZpvd() : null));
    }

    public final boolean KWHzl(C3682AqZ c3682AqZ) {
        return c3682AqZ.zLjUOn().length() > 0 || copydefault(c3682AqZ) != null || Intrinsics.EZpvd((java.lang.Object) c3682AqZ.fetchVPNInfo(), (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode());
    }

    public final void copydefault(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(context), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("special", java.lang.Boolean.TRUE)), null, 4, null);
    }

    /* JADX INFO: renamed from: o.lJe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
