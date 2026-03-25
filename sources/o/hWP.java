package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hWP extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hWP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.hWP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hWP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hWP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWP.gEmmrt(this.AEQbTJ);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWP.djBIcL(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWP.AYXKKw(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWP.valueOf(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hWP.AhwBna(this.OLrzqt);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.UCQKYV, (android.view.ViewGroup) this, true);
    }

    private final C55258xgZ AEQbTJ() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55258xgZ) value;
    }

    public static final C55258xgZ gEmmrt(hWP hwp) {
        return (C55258xgZ) hwp.findViewById(C23274hvD.Application.getMinimumHeight);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView djBIcL(hWP hwp) {
        return (AppCompatTextView) hwp.findViewById(C23274hvD.Application.peekSupportActionBar);
    }

    public static final AppCompatTextView AYXKKw(hWP hwp) {
        return (AppCompatTextView) hwp.findViewById(C23274hvD.Application.updateStatusGuard);
    }

    private final AppCompatTextView copydefault() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView valueOf(hWP hwp) {
        return (AppCompatTextView) hwp.findViewById(C23274hvD.Application.startSupportActionModeFromWindow);
    }

    public static final AppCompatTextView AhwBna(hWP hwp) {
        return (AppCompatTextView) hwp.findViewById(C23274hvD.Application.shouldAnimateActionModeView);
    }

    private final AppCompatTextView OLrzqt() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public final void setNetworkInfo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "--")) {
            copydefault().setText("");
        } else {
            copydefault().setText(str3);
        }
        OLrzqt().setVisibility(z ? 8 : 0);
        AEQbTJ().setText(str);
        KWHzl().setMaxLines(z2 ? 8 : 1);
        KWHzl().setText(pTF.KWHzl.AEQbTJ(str2));
        EZpvd().setText(str4);
    }

    public static /* synthetic */ void setFreeGasNetworkInfo$default(hWP hwp, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C52761wXj.Activity.DeEinT;
        }
        hwp.setFreeGasNetworkInfo(str, str2, i);
    }

    public final void setFreeGasNetworkInfo(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ().setText(str);
        KWHzl().setText(pTF.KWHzl.AEQbTJ(str2));
        AppCompatTextView appCompatTextViewKWHzl = KWHzl();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextViewKWHzl.setTextColor(C25382ivf.KWHzl(context, i));
        OLrzqt().setVisibility(8);
    }

    public final void OLrzqt(boolean z) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = AEQbTJ().valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        if (!z) {
            c55320xhiKWHzl.setCompoundDrawablesRelative(null, null, null, null);
            c55320xhiKWHzl.setOnClickListener(null);
            return;
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        if (drawable != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
        } else {
            drawable = null;
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c55320xhiKWHzl.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context3));
        TextViewCompat.setCompoundDrawableTintList(c55320xhiKWHzl, ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab));
        c55320xhiKWHzl.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public final void setOnTipClickListener(@NotNull Function0<Unit> function0) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(function0, "");
        C55312xha c55312xhaValueOf = AEQbTJ().valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setOnClickListener(new Activity(c55320xhiKWHzl, 1000L, function0));
    }

    public final void copydefault(DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX) {
        if (dexGasStationFeeDetailVOX != null) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("value1", C23319hvw.OLrzqt(dexGasStationFeeDetailVOX.getGasTokenPriceUSD(), dexGasStationFeeDetailVOX.getApproveTokenAmount()));
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("value2", C23319hvw.OLrzqt(dexGasStationFeeDetailVOX.getGasTokenPriceUSD(), dexGasStationFeeDetailVOX.getTransferApproveTokenGasFeeAmount()));
            kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("value3", C23319hvw.OLrzqt(dexGasStationFeeDetailVOX.getGasTokenPriceUSD(), dexGasStationFeeDetailVOX.getSwapGasFeeAmount()));
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onPlaybackPositionUpdate, ArrayMapKt.arrayMapOf(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt("approveFee", C23271hvA.getNumberICUWithPrecision$default(c23271hvA, dexGasStationFeeDetailVOX.getApproveTokenAmount(), null, 1, null)), C56390yDp.OLrzqt("transferFee", C23271hvA.getNumberICUWithPrecision$default(c23271hvA, dexGasStationFeeDetailVOX.getTransferApproveTokenGasFeeAmount(), null, 1, null)), C56390yDp.OLrzqt("swapFee", C23271hvA.getNumberICUWithPrecision$default(c23271hvA, dexGasStationFeeDetailVOX.getSwapGasFeeAmount(), null, 1, null)), C56390yDp.OLrzqt("token1", dexGasStationFeeDetailVOX.getGasTokenSymbol()), C56390yDp.OLrzqt("token2", dexGasStationFeeDetailVOX.getGasTokenSymbol()), C56390yDp.OLrzqt("token3", dexGasStationFeeDetailVOX.getGasTokenSymbol())));
            android.content.Context context = getContext();
            if (context != null) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.fsSxsn);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }
}
