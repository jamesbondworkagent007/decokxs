package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.kline.data.KlineOpenOrderBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39799pzE extends android.widget.FrameLayout {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public AbstractC32393mcJ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39799pzE(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:35) call: o.pzE.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C39799pzE(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39799pzE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = "sell";
        this.EZpvd = "buy";
        this.AEQbTJ = "net";
        this.KWHzl = "long";
        this.OLrzqt = "short";
        this.copydefault = "--";
        this.valueOf = (AbstractC32393mcJ) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C32392mcI.StateListAnimator.EZpvd, this, true);
        setupRtlLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setData(@NotNull KlineOpenOrderBean klineOpenOrderBean) {
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        this.valueOf.AYXKKw.setVisibility(8);
        this.valueOf.AhwBna.setVisibility(8);
        this.valueOf.KWHzl.setVisibility(8);
        this.valueOf.AEQbTJ.setVisibility(0);
        this.valueOf.EZpvd.setVisibility(0);
        this.valueOf.AuCTel.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.AEQbTJ));
        this.valueOf.fJNWhG.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.DbNXlk));
        this.valueOf.AkhnZx.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.AkhnZx));
        this.valueOf.DbNXlk.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.iPSTqm));
        this.valueOf.valueOf.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.zAEkPU));
        this.valueOf.uzCIH.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.fARcdN));
        this.valueOf.djBIcL.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.AYXKKw));
        this.valueOf.ejfBZ.setText(OLrzqt(klineOpenOrderBean));
        this.valueOf.isConnected.setText(klineOpenOrderBean.getAmount());
        this.valueOf.fetchVPNInfo.setText(klineOpenOrderBean.getNotionalUsd());
        java.lang.String ordType = klineOpenOrderBean.getOrdType();
        switch (ordType.hashCode()) {
            case -1727670399:
                if (ordType.equals("move_order_stop")) {
                    this.valueOf.EZpvd.setVisibility(8);
                    this.valueOf.AEQbTJ.setVisibility(8);
                    copydefault(klineOpenOrderBean.getMoveTriggerPx(), klineOpenOrderBean.getTriggerPxType());
                    this.valueOf.AhwBna.setVisibility(0);
                    this.valueOf.fARcdN.setText(klineOpenOrderBean.getCallback());
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) klineOpenOrderBean.getActivePx())) {
                        this.valueOf.KWHzl.setVisibility(0);
                        this.valueOf.gEmmrt.setText(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getActivePx()), C36246oUr.copydefault().gkJEwt(), null, 2, null));
                    }
                    break;
                }
                break;
            case -1059891784:
                if (ordType.equals("trigger")) {
                    this.valueOf.values.setText(copydefault(klineOpenOrderBean));
                    copydefault(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getTriggerPxType());
                    break;
                }
                break;
            case 102976443:
                if (!ordType.equals("limit")) {
                }
                this.valueOf.values.setText(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPrice()), C36246oUr.copydefault().gkJEwt(), null, 2, null));
                break;
            case 148365877:
                if (!ordType.equals("SL_Limit")) {
                }
                this.valueOf.values.setText(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPrice()), C36246oUr.copydefault().gkJEwt(), null, 2, null));
                break;
            case 325766402:
                if (!ordType.equals("SL_Market")) {
                }
                this.valueOf.values.setText(copydefault(klineOpenOrderBean));
                copydefault(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getTriggerPxType());
                break;
            case 1146223640:
                if (!ordType.equals("TP_Limit")) {
                }
                this.valueOf.values.setText(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPrice()), C36246oUr.copydefault().gkJEwt(), null, 2, null));
                break;
            case 1194585983:
                if (!ordType.equals("TP_Market")) {
                }
                this.valueOf.values.setText(copydefault(klineOpenOrderBean));
                copydefault(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getTriggerPxType());
                break;
            case 2002822123:
                if (!ordType.equals("post_only")) {
                }
                this.valueOf.values.setText(pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPrice()), C36246oUr.copydefault().gkJEwt(), null, 2, null));
                break;
        }
    }

    public final void setupRtlLayout() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            this.valueOf.OLrzqt.setLayoutDirection(1);
            this.valueOf.AYXKKw.setLayoutDirection(1);
            this.valueOf.AEQbTJ.setLayoutDirection(1);
            this.valueOf.copydefault.setLayoutDirection(1);
            this.valueOf.EZpvd.setLayoutDirection(1);
            this.valueOf.AhwBna.setLayoutDirection(1);
            this.valueOf.KWHzl.setLayoutDirection(1);
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        this.valueOf.AYXKKw.setVisibility(0);
        android.widget.TextView textView = this.valueOf.fIwbmz;
        if (str == null || str.length() == 0) {
            str3 = this.copydefault;
        } else {
            str3 = pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) str), C36246oUr.copydefault().gkJEwt(), null, 2, null) + " " + EZpvd(str2);
        }
        textView.setText(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        if (str == null) {
            return "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3314326) {
            if (iHashCode != 3344077) {
                if (iHashCode == 100346066 && str.equals("index")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.DarRvM));
                    sb.append(")");
                    string = sb.toString();
                } else {
                    string = "";
                }
            } else if (str.equals("mark")) {
                sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.ODWQjV));
                sb.append(")");
                string = sb.toString();
            }
        } else if (str.equals("last")) {
            sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.tIwhY));
            sb.append(")");
            string = sb.toString();
        }
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [151=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String ordType = klineOpenOrderBean.getOrdType();
        switch (ordType.hashCode()) {
            case -1727670399:
                if (ordType.equals("move_order_stop")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.fIwbmz) + " (");
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
            case -1059891784:
                if (ordType.equals("trigger")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.ejfBZ) + " (");
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
            case 102976443:
                if (ordType.equals("limit")) {
                    if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.isTpLimit(), (java.lang.Object) "true")) {
                        sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.gUEfcq) + " (");
                    } else {
                        sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.OLrzqt) + " (");
                    }
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
            case 148365877:
                if (ordType.equals("SL_Limit")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.gEmmrt) + " (");
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
            case 325766402:
                if (ordType.equals("SL_Market")) {
                }
                break;
            case 1146223640:
                if (ordType.equals("TP_Limit")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.fJNWhG) + " (");
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
            case 1194585983:
                if (ordType.equals("TP_Market")) {
                }
                break;
            case 2002822123:
                if (ordType.equals("post_only")) {
                    sb.append(C33070mpX.AYXKKw(C32392mcI.Dialog.copydefault) + " (");
                    sb.append(EZpvd(klineOpenOrderBean.getSide(), klineOpenOrderBean.getPosSide()));
                }
                break;
        }
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.AEQbTJ)) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.djBIcL);
            }
            return C33070mpX.AYXKKw(C32392mcI.Dialog.fetchVPNInfo);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.KWHzl)) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.isConnected);
            }
            return C33070mpX.AYXKKw(C32392mcI.Dialog.valueOf);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
            return C33070mpX.AYXKKw(C32392mcI.Dialog.AhwBna);
        }
        return C33070mpX.AYXKKw(C32392mcI.Dialog.values);
    }

    public final java.lang.String copydefault(KlineOpenOrderBean klineOpenOrderBean) {
        if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
            return pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getTpOrdPx()), C36246oUr.copydefault().gkJEwt(), null, 2, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Limit")) {
            return pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getSlOrdPx()), C36246oUr.copydefault().gkJEwt(), null, 2, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "trigger")) {
            if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.DAIeex);
            }
            return pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getOrdPx()), C36246oUr.copydefault().gkJEwt(), null, 2, null);
        }
        return C33070mpX.AYXKKw(C32392mcI.Dialog.DAIeex);
    }
}
