package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hYQ extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.hYQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hYQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hYQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYQ.AEQbTJ(this.AEQbTJ);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DeEinT, (android.view.ViewGroup) this, true);
        this.copydefault = "";
    }

    public static final AppCompatTextView AEQbTJ(hYQ hyq) {
        return (AppCompatTextView) hyq.findViewById(C23274hvD.Application.setCursor);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hYQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(hYQ hyq, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            pair = null;
        }
        hyq.EZpvd(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, z, pair);
    }

    public final void EZpvd(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        java.lang.String bridgeName;
        java.lang.String time$default = "";
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        boolean zIsBridgeTimeOut = false;
        if (z) {
            if (pair == null) {
                OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
                if (value != null) {
                    zIsBridgeTimeOut = value.isBridgeTimeOut();
                }
            } else if (pair.getSecond().longValue() == -1) {
                zIsBridgeTimeOut = true;
            }
            AppCompatTextView appCompatTextViewEZpvd = EZpvd();
            boolean zEZpvd = EZpvd(dexOrderDetailViewModel, zIsBridgeTimeOut);
            DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
            if (bridgeOrderInfoVo != null && (bridgeName = bridgeOrderInfoVo.getBridgeName()) != null) {
                time$default = bridgeName;
            }
            appCompatTextViewEZpvd.setText(C25352ivB.OLrzqt(zEZpvd, time$default, dexMultiChildOrderInfoVo.getToChainName()));
            return;
        }
        if (pair != null && pair.getSecond().longValue() == -1 && pair.getFirst().longValue() == -1) {
            zIsBridgeTimeOut = true;
        }
        if (pair != null && !zIsBridgeTimeOut) {
            time$default = pTA.formatTime$default(new Date(pair.getFirst().longValue()), OKTimeEnum.TIME_FORMAT_MS, null, null, false, 14, null);
        }
        this.copydefault = time$default;
        copydefault(dexMultiChildOrderInfoVo, zIsBridgeTimeOut, dexOrderDetailViewModel.fJNWhG());
    }

    public final boolean EZpvd(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    public final void copydefault(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, boolean z2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strCopydefault = copydefault(dexMultiChildOrderInfoVo.getStatus());
        if (dexMultiChildOrderInfoVo.isCanceling()) {
            EZpvd().setText(strCopydefault);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            str = strCopydefault + " " + this.copydefault;
        } else {
            str = this.copydefault;
        }
        java.lang.String strCopydefault2 = C25352ivB.copydefault(z, dexMultiChildOrderInfoVo.getFromChainName(), dexMultiChildOrderInfoVo.getFromTokenSymbol(), dexMultiChildOrderInfoVo.getToTokenSymbol(), dexMultiChildOrderInfoVo.isSupportAccelerate(z2));
        if (str.length() == 0) {
            str2 = strCopydefault2;
        } else {
            str2 = str + " " + strCopydefault2;
        }
        EZpvd().setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.hYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hYQ.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strCopydefault2}, 0, null, false, new Function1() { // from class: o.hYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hYQ.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit AEQbTJ(hYQ hyq, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(hyq.getContext(), C32113mPz.Dialog.zsXlph));
        android.content.Context context = hyq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.HJWChPRAkuRW)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(hYQ hyq, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(hyq.getContext(), C32113mPz.Dialog.fIwbmz));
        android.content.Context context = hyq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.GzAsTt)));
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-4")) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.DkGEDn);
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-3") ? C33070mpX.AYXKKw(C23274hvD.Fragment.apNKau) : "";
    }
}
