package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
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
public final class hZN extends ConstraintLayout {
    public java.lang.String AEQbTJ;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.hZN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hZN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hZN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hZM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZN.EZpvd(this.KWHzl);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DeEinT, (android.view.ViewGroup) this, true);
        this.AEQbTJ = "";
    }

    public static final AppCompatTextView EZpvd(hZN hzn) {
        return (AppCompatTextView) hzn.findViewById(C23274hvD.Application.setCursor);
    }

    private final AppCompatTextView OLrzqt() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.hZN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(hZN hzn, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            pair = null;
        }
        hzn.AEQbTJ(dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, dexOrderDetailViewModel, pair);
    }

    public final void AEQbTJ(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, @NotNull DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo3, "");
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        this.AEQbTJ = (pair == null || (pair != null && (pair.getSecond().longValue() > (-1L) ? 1 : (pair.getSecond().longValue() == (-1L) ? 0 : -1)) == 0 && (pair.getFirst().longValue() > (-1L) ? 1 : (pair.getFirst().longValue() == (-1L) ? 0 : -1)) == 0)) ? "" : pTA.formatTime$default(new Date(pair.getFirst().longValue()), OKTimeEnum.TIME_FORMAT_MS, null, null, false, 14, null);
        java.lang.String strCopydefault = copydefault(dexMultiChildOrderInfoVo.getStatus());
        if (dexMultiChildOrderInfoVo.isCanceling()) {
            OLrzqt().setText(strCopydefault);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            str = strCopydefault + " " + this.AEQbTJ;
        } else {
            str = this.AEQbTJ;
        }
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus()) {
            strAYXKKw = KWHzl(dexMultiChildOrderInfoVo, pair, dexMultiChildOrderInfoVo2);
        } else if (dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus()) {
            strAYXKKw = EZpvd(pair, dexMultiChildOrderInfoVo2, dexOrderDetailViewModel);
        } else if (dexMultiChildOrderInfoVo3.isOpenPackUpViewStatus() && dexOrderDetailViewModel.fetchVPNInfo()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx);
        }
        if (str.length() == 0) {
            str2 = strAYXKKw;
        } else {
            str2 = str + " " + strAYXKKw;
        }
        OLrzqt().setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.hZL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hZN.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.hZJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hZN.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit EZpvd(hZN hzn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(hzn.getContext(), C32113mPz.Dialog.zsXlph));
        android.content.Context context = hzn.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.HJWChPRAkuRW)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hZN hzn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(hzn.getContext(), C32113mPz.Dialog.fIwbmz));
        android.content.Context context = hzn.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.GzAsTt)));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(kotlin.Pair<java.lang.Long, java.lang.Long> pair, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexOrderDetailViewModel dexOrderDetailViewModel) {
        java.lang.String bridgeName;
        boolean zEZpvd = EZpvd(dexOrderDetailViewModel, pair != null && pair.getFirst().longValue() == -1 && pair.getSecond().longValue() == -1);
        DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
        if (bridgeOrderInfoVo == null || (bridgeName = bridgeOrderInfoVo.getBridgeName()) == null) {
            bridgeName = "";
        }
        return C25352ivB.OLrzqt(zEZpvd, bridgeName, dexMultiChildOrderInfoVo.getToChainName());
    }

    private final boolean EZpvd(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    public final java.lang.String KWHzl(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, kotlin.Pair<java.lang.Long, java.lang.Long> pair, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2) {
        java.lang.String bridgeName;
        if (pair != null && pair.getFirst().longValue() == -1 && pair.getSecond().longValue() == -1) {
            return C25352ivB.AEQbTJ(dexMultiChildOrderInfoVo.isSupportAccelerate(true));
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[1];
        DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo2.getBridgeOrderInfoVo();
        if (bridgeOrderInfoVo == null || (bridgeName = bridgeOrderInfoVo.getBridgeName()) == null) {
            bridgeName = "";
        }
        pairArr[0] = C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, bridgeName);
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.hdBMmm, ArrayMapKt.arrayMapOf(pairArr));
    }

    private final java.lang.String copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-4")) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.DkGEDn);
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-3") ? C33070mpX.AYXKKw(C23274hvD.Fragment.apNKau) : "";
    }
}
