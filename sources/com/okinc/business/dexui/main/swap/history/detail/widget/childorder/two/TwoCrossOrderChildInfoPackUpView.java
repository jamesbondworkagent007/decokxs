package com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.net.HttpHeaders;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two.TwoCrossOrderChildInfoPackUpView;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C25352ivB;
import o.C25382ivf;
import o.C32113mPz;
import o.C33061mpO;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pTA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TwoCrossOrderChildInfoPackUpView extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public String OLrzqt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PackInfoType.values().length];
            try {
                iArr[PackInfoType.From.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackInfoType.Bridge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackInfoType.To.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoCrossOrderChildInfoPackUpView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoCrossOrderChildInfoPackUpView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two.TwoCrossOrderChildInfoPackUpView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ TwoCrossOrderChildInfoPackUpView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoCrossOrderChildInfoPackUpView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hZQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TwoCrossOrderChildInfoPackUpView.OLrzqt(this.KWHzl);
            }
        });
        LayoutInflater.from(context).inflate(C23274hvD.Activity.DeEinT, (ViewGroup) this, true);
        this.OLrzqt = "";
    }

    private final AppCompatTextView KWHzl() {
        Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView OLrzqt(TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView) {
        return (AppCompatTextView) twoCrossOrderChildInfoPackUpView.findViewById(C23274hvD.Application.setCursor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two.TwoCrossOrderChildInfoPackUpView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, PackInfoType packInfoType, Pair pair, int i, Object obj) {
        if ((i & 8) != 0) {
            pair = null;
        }
        twoCrossOrderChildInfoPackUpView.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, packInfoType, pair);
    }

    public final void KWHzl(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull PackInfoType packInfoType, Pair<Long, Long> pair) {
        String time$default = "";
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(packInfoType, "");
        boolean z = pair != null && pair.getSecond().longValue() == -1 && pair.getFirst().longValue() == -1;
        if (pair != null && !z) {
            time$default = pTA.formatTime$default(new Date(pair.getFirst().longValue()), OKTimeEnum.TIME_FORMAT_MS, null, null, false, 14, null);
        }
        this.OLrzqt = time$default;
        AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, packInfoType, copydefault(dexOrderDetailViewModel, z));
    }

    private final boolean copydefault(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    public final void AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, PackInfoType packInfoType, boolean z) {
        String str;
        String strCopydefault;
        String str2;
        String bridgeName;
        String strAEQbTJ = AEQbTJ(dexMultiChildOrderInfoVo.getStatus());
        if (dexMultiChildOrderInfoVo.isCanceling()) {
            KWHzl().setText(strAEQbTJ);
            return;
        }
        if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
            str = strAEQbTJ + " " + this.OLrzqt;
        } else {
            str = this.OLrzqt;
        }
        int i = Activity.EZpvd[packInfoType.ordinal()];
        if (i != 1) {
            strCopydefault = "";
            if (i == 2) {
                DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
                if (bridgeOrderInfoVo != null && (bridgeName = bridgeOrderInfoVo.getBridgeName()) != null) {
                    strCopydefault = bridgeName;
                }
                strCopydefault = C25352ivB.OLrzqt(z, strCopydefault, dexMultiChildOrderInfoVo.getToChainName());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dexOrderDetailViewModel.fetchVPNInfo()) {
                    strCopydefault = C25352ivB.AEQbTJ(false);
                }
            }
        } else {
            strCopydefault = C25352ivB.copydefault(z, dexMultiChildOrderInfoVo.getFromChainName(), dexMultiChildOrderInfoVo.getFromTokenSymbol(), dexMultiChildOrderInfoVo.getToTokenSymbol(), DexMultiChildOrderInfoVo.isSupportAccelerate$default(dexMultiChildOrderInfoVo, false, 1, null));
        }
        if (str.length() == 0) {
            str2 = strCopydefault;
        } else {
            str2 = str + " " + strCopydefault;
        }
        KWHzl().setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str2, new String[]{str}, 0, null, false, new Function1() { // from class: o.hZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TwoCrossOrderChildInfoPackUpView.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null), new String[]{strCopydefault}, 0, null, false, new Function1() { // from class: o.hZO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TwoCrossOrderChildInfoPackUpView.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit KWHzl(TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(twoCrossOrderChildInfoPackUpView.getContext(), C32113mPz.Dialog.zsXlph));
        Context context = twoCrossOrderChildInfoPackUpView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.HJWChPRAkuRW)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(twoCrossOrderChildInfoPackUpView.getContext(), C32113mPz.Dialog.fIwbmz));
        Context context = twoCrossOrderChildInfoPackUpView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.GzAsTt)));
        return Unit.INSTANCE;
    }

    private final String AEQbTJ(String str) {
        if (Intrinsics.EZpvd((Object) str, (Object) "-4")) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.DkGEDn);
        }
        return Intrinsics.EZpvd((Object) str, (Object) "-3") ? C33070mpX.AYXKKw(C23274hvD.Fragment.apNKau) : "";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PackInfoType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PackInfoType[] $VALUES;
        public static final PackInfoType From = new PackInfoType(HttpHeaders.FROM, 0);
        public static final PackInfoType Bridge = new PackInfoType("Bridge", 1);
        public static final PackInfoType To = new PackInfoType("To", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PackInfoType[] $values() {
            return new PackInfoType[]{From, Bridge, To};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PackInfoType> getEntries() {
            return $ENTRIES;
        }

        private PackInfoType(String str, int i) {
        }

        static {
            PackInfoType[] packInfoTypeArr$values = $values();
            $VALUES = packInfoTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(packInfoTypeArr$values);
        }

        public static PackInfoType valueOf(String str) {
            return (PackInfoType) Enum.valueOf(PackInfoType.class, str);
        }

        public static PackInfoType[] values() {
            return (PackInfoType[]) $VALUES.clone();
        }
    }
}
