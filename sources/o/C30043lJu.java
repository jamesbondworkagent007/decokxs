package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.common.FiatOrderStatus;
import com.okinc.buysell.common.HistoryOrderStatus;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3718ArI;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: renamed from: o.lJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30043lJu extends android.widget.FrameLayout {
    public final lxN copydefault;

    /* JADX INFO: renamed from: o.lJu$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BuySellTradeType.values().length];
            try {
                iArr[BuySellTradeType.SELL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30043lJu(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:23) call: o.lJu.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30043lJu(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30043lJu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.igXuih, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (lxN) viewDataBindingInflate;
    }

    public final void setData(@NotNull C3682AqZ c3682AqZ) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        copydefault(c3682AqZ);
        OLrzqt(c3682AqZ);
    }

    public final void copydefault(C3682AqZ c3682AqZ) {
        this.copydefault.OLrzqt.setVisibility(0);
        AbstractC3718ArI abstractC3718ArIZuBGHE = c3682AqZ.zuBGHE();
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.StateListAnimator.INSTANCE)) {
            setPendingStatus();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.PendingIntent.INSTANCE)) {
            valueOf(c3682AqZ);
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.ActionBar.INSTANCE)) {
            djBIcL(c3682AqZ);
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.Activity.INSTANCE)) {
            AhwBna(c3682AqZ);
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.LoaderManager.INSTANCE)) {
            setRefundedStatus();
            return;
        }
        if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.Application.INSTANCE)) {
            setExpiredStatus();
        } else if (Intrinsics.EZpvd(abstractC3718ArIZuBGHE, AbstractC3718ArI.TaskDescription.INSTANCE)) {
            setCancelledStatus();
        } else {
            if (!(abstractC3718ArIZuBGHE instanceof AbstractC3718ArI.Dialog)) {
                throw new NoWhenBranchMatchedException();
            }
            this.copydefault.OLrzqt.setVisibility(8);
        }
    }

    public final void setPendingStatus() {
        this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.PENDING.getDisplayName()));
        this.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.Swccd));
    }

    private final void valueOf(C3682AqZ c3682AqZ) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        android.widget.TextView textView = this.copydefault.KWHzl;
        if (c3682AqZ.AkhnZx() != null) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zOIQXb);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(HistoryOrderStatus.PROCESSING.getDisplayName());
        }
        textView.setText(strAYXKKw);
        android.widget.TextView textView2 = this.copydefault.EZpvd;
        if (c3682AqZ.AkhnZx() != null) {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.zAEkPU);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.geLlBI);
        }
        textView2.setText(strAYXKKw2);
    }

    private final void djBIcL(C3682AqZ c3682AqZ) {
        java.lang.String strAYXKKw;
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(FiatOrderStatus.FAILED.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.SUCCESS.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.IGNORED.getValue()));
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        boolean zKWHzl = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c3686AqdAkhnZx != null ? c3686AqdAkhnZx.OLrzqt() : null);
        android.widget.TextView textView = this.copydefault.KWHzl;
        if (zKWHzl) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zqTOFw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(HistoryOrderStatus.FAILED.getDisplayName());
        }
        textView.setText(strAYXKKw);
        this.copydefault.EZpvd.setText(EZpvd(c3682AqZ));
    }

    public final java.lang.String EZpvd(C3682AqZ c3682AqZ) {
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        if (c3686AqdAkhnZx == null) {
            return gEmmrt(c3682AqZ);
        }
        java.lang.Integer numOLrzqt = c3686AqdAkhnZx.OLrzqt();
        int value = FiatOrderStatus.FAILED.getValue();
        if (numOLrzqt != null && numOLrzqt.intValue() == value) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.zDUObI);
        }
        int value2 = FiatOrderStatus.SUCCESS.getValue();
        if (numOLrzqt != null && numOLrzqt.intValue() == value2) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.vLaW);
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("refundAmount", C31661lzi.copydefault(c3686AqdAkhnZx.isConnected(), false));
            java.lang.String strDbNXlk = c3686AqdAkhnZx.DbNXlk();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strDbNXlk.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("asset", upperCase)));
        }
        return gEmmrt(c3682AqZ);
    }

    public final java.lang.String gEmmrt(C3682AqZ c3682AqZ) {
        if (yDY.gEmmrt(ChannelPlatformCode.BUY_IDEAL.getCode(), ChannelPlatformCode.ACH_BUY.getCode()).contains(c3682AqZ.fetchVPNInfo()) && (!c3682AqZ.QOLQEE().isEmpty()) && c3682AqZ.QOLQEE().size() >= 2 && c3682AqZ.QOLQEE().get(0).copydefault() == HistoryOrderStatus.COMPLETED.getValue() && c3682AqZ.QOLQEE().get(1).copydefault() == HistoryOrderStatus.FAILED.getValue()) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.DrNnAm);
        }
        return c3682AqZ.valueOf() == ChannelCategoryCode.THIRD_PARTY.getCode() ? AYXKKw(c3682AqZ) : C33070mpX.AYXKKw(C31351lsQ.Activity.aJZHYI);
    }

    public final java.lang.String AYXKKw(C3682AqZ c3682AqZ) {
        if (c3682AqZ.AxsJAY() && c3682AqZ.values().length() > 0) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DPHsZd), C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", c3682AqZ.isConnected())));
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DPhTBN);
    }

    private final void AhwBna(C3682AqZ c3682AqZ) {
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(FiatOrderStatus.SUCCESS.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.IGNORED.getValue()));
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c3686AqdAkhnZx != null ? c3686AqdAkhnZx.OLrzqt() : null)) {
            this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zlvcHA));
            this.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.swzYdv));
        } else {
            this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.COMPLETED.getDisplayName()));
            this.copydefault.EZpvd.setText(AEQbTJ(c3682AqZ));
        }
    }

    public final java.lang.String AEQbTJ(C3682AqZ c3682AqZ) {
        if (c3682AqZ.DTwDnp()) {
            return KWHzl(c3682AqZ);
        }
        if (StateListAnimator.EZpvd[c3682AqZ.ORxRYg().ordinal()] == 1) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.RAQtXZ);
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
    }

    public final java.lang.String KWHzl(C3682AqZ c3682AqZ) {
        java.lang.String strAYXKKw;
        C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
        if (c3687AqeGEmmrt != null) {
            int iValueOf = c3687AqeGEmmrt.valueOf();
            if (iValueOf == -3 || iValueOf == -2 || iValueOf == -1 || (iValueOf != 2 && iValueOf == 3)) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DPHNDa);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
            }
            if (strAYXKKw != null) {
                return strAYXKKw;
            }
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
    }

    public final void setRefundedStatus() {
        this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.REFUNDED.getDisplayName()));
        this.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fkESqH));
    }

    public final void setExpiredStatus() {
        this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.EXPIRED.getDisplayName()));
        this.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.iKEqwx));
    }

    public final void setCancelledStatus() {
        this.copydefault.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.CANCELLED.getDisplayName()));
        this.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DLGVGj));
    }

    public final void OLrzqt(C3682AqZ c3682AqZ) {
        if (c3682AqZ.DTwDnp()) {
            C3687Aqe c3687AqeGEmmrt = c3682AqZ.gEmmrt();
            java.lang.String strAhwBna = c3687AqeGEmmrt != null ? c3687AqeGEmmrt.AhwBna() : null;
            if (strAhwBna == null || strAhwBna.length() == 0) {
                this.copydefault.AEQbTJ.setVisibility(8);
                return;
            } else {
                this.copydefault.AEQbTJ.setVisibility(0);
                this.copydefault.AEQbTJ.setText(strAhwBna);
                return;
            }
        }
        this.copydefault.AEQbTJ.setVisibility(8);
    }
}
