package com.okinc.business.dexui.main.swap.history.detail.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22003hUh;
import o.C22822hmc;
import o.C23274hvD;
import o.C23313hvq;
import o.C25382ivf;
import o.C32866mlf;
import o.C32868mlh;
import o.C32979mnm;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C52761wXj;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC6804aWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class OrderInstructionView extends ConstraintLayout {
    public final InterfaceC56387yDm copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderInstructionType.values().length];
            try {
                iArr[OrderInstructionType.TIME_OUT_TIMESTAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderInstructionType.BTC_FROM_WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderInstructionType.ASSETS_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderInstructionType.MULTI_PENDING_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderInstructionType.ORDER_TYPE_BRIDGE_REDEEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderInstructionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderInstructionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:55) call: com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OrderInstructionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderInstructionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrderInstructionView.AEQbTJ(this.copydefault);
            }
        });
        LayoutInflater.from(context).inflate(C23274hvD.Activity.AuCTelauCTel, (ViewGroup) this, true);
    }

    private final AppCompatTextView AEQbTJ() {
        Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView AEQbTJ(OrderInstructionView orderInstructionView) {
        return (AppCompatTextView) orderInstructionView.findViewById(C23274hvD.Application.onAnimationEnd);
    }

    public final void setOrderMassage(@NotNull final Context context, @NotNull String str, final boolean z, @NotNull OrderInstructionType orderInstructionType, @NotNull String str2, @NotNull final String str3, @NotNull final String str4, @NotNull String str5) {
        String str6;
        CharSequence charSequenceKWHzl = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderInstructionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AEQbTJ().setMovementMethod(LinkMovementMethod.getInstance());
        AppCompatTextView appCompatTextViewAEQbTJ = AEQbTJ();
        int i = TaskDescription.EZpvd[orderInstructionType.ordinal()];
        if (i == 1) {
            setVisibility(C22822hmc.copydefault(z, str) ? 8 : 0);
            Pair<String, Boolean> pairOLrzqt = OLrzqt(context);
            String strComponent1 = pairOLrzqt.component1();
            if (pairOLrzqt.component2().booleanValue()) {
                str6 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase3) + " \n" + strComponent1;
            } else {
                str6 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase3) + " " + strComponent1;
            }
            charSequenceKWHzl = C33061mpO.setupSpanStyles$default(str6, new String[]{strComponent1}, 0, MatchPattern.FIRST_ONLY, false, new Function1() { // from class: o.hWD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrderInstructionView.AEQbTJ(context, this, z, str3, str4, (java.util.List) obj);
                }
            }, 10, null);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    setVisibility(0);
                    charSequenceKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.invokespecialRtjmuc);
                } else if (i == 5) {
                    setVisibility(0);
                    charSequenceKWHzl = C33069mpW.copydefault(C23274hvD.Fragment.invokespecialROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str5)));
                } else {
                    setVisibility(8);
                }
            } else if (z) {
                i = 8;
                setVisibility(i);
                charSequenceKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.isShuffleModeEnabledRemoved);
            } else {
                i = 8;
                setVisibility(i);
                charSequenceKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.isShuffleModeEnabledRemoved);
            }
        } else if (z) {
            i = 8;
            setVisibility(i);
            charSequenceKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.kcQGz, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chain", str2)));
        } else {
            i = 8;
            setVisibility(i);
            charSequenceKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.kcQGz, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chain", str2)));
        }
        appCompatTextViewAEQbTJ.setText(charSequenceKWHzl);
    }

    public static final Unit AEQbTJ(Context context, OrderInstructionView orderInstructionView, boolean z, String str, String str2, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.DeEinT)));
        list.add(orderInstructionView.new Application(context, z, str, str2));
        return Unit.INSTANCE;
    }

    public static final class Application extends ClickableSpan {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ Context OLrzqt;

        public Application(Context context, boolean z, String str, String str2) {
            this.OLrzqt = context;
            this.KWHzl = z;
            this.AEQbTJ = str;
            this.EZpvd = str2;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            Property property = ViewGroup.Y;
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            OrderInstructionView.this.EZpvd(this.OLrzqt, this.KWHzl);
            OrderInstructionView.this.EZpvd(this.AEQbTJ, this.EZpvd);
        }
    }

    public final Pair<String, Boolean> OLrzqt(Context context) {
        String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.describeContents);
        double dSubCheckD$default = C23313hvq.subCheckD$default(Integer.valueOf(C33570myu.djBIcL(context)), Integer.valueOf(C55298xhM.copydefault(32.0f, context)), null, null, null, 14, null);
        return new Pair<>(strAYXKKw, Boolean.valueOf(C23313hvq.valueOf(C23313hvq.subCheckS$default(Double.valueOf(dSubCheckD$default), Double.valueOf(C33129mqd.AEQbTJ(Float.valueOf(EZpvd(AEQbTJ(), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase3) + " "))) % dSubCheckD$default), null, null, null, 14, null), Float.valueOf(EZpvd(AEQbTJ(), strAYXKKw)))));
    }

    public final float EZpvd(TextView textView, String str) {
        return new TextPaint(textView.getPaint()).measureText(str);
    }

    public final void EZpvd(Context context, boolean z) {
        ChatBotRequest chatBotRequestOLrzqt;
        if (z) {
            chatBotRequestOLrzqt = C22003hUh.Companion.KWHzl();
        } else {
            chatBotRequestOLrzqt = C22003hUh.Companion.OLrzqt();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("SupportCenter_Btm_Chatbot_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).copydefault(context, chatBotRequestOLrzqt);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OrderInstructionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OrderInstructionType[] $VALUES;
        public static final OrderInstructionType TIME_OUT_TIMESTAMP = new OrderInstructionType("TIME_OUT_TIMESTAMP", 0);
        public static final OrderInstructionType BTC_FROM_WARN = new OrderInstructionType("BTC_FROM_WARN", 1);
        public static final OrderInstructionType ASSETS_LARGE = new OrderInstructionType("ASSETS_LARGE", 2);
        public static final OrderInstructionType MULTI_PENDING_LAST = new OrderInstructionType("MULTI_PENDING_LAST", 3);
        public static final OrderInstructionType ORDER_TYPE_BRIDGE_REDEEM = new OrderInstructionType("ORDER_TYPE_BRIDGE_REDEEM", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OrderInstructionType[] $values() {
            return new OrderInstructionType[]{TIME_OUT_TIMESTAMP, BTC_FROM_WARN, ASSETS_LARGE, MULTI_PENDING_LAST, ORDER_TYPE_BRIDGE_REDEEM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OrderInstructionType> getEntries() {
            return $ENTRIES;
        }

        private OrderInstructionType(String str, int i) {
        }

        static {
            OrderInstructionType[] orderInstructionTypeArr$values = $values();
            $VALUES = orderInstructionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orderInstructionTypeArr$values);
        }

        public static OrderInstructionType valueOf(String str) {
            return (OrderInstructionType) Enum.valueOf(OrderInstructionType.class, str);
        }

        public static OrderInstructionType[] values() {
            return (OrderInstructionType[]) $VALUES.clone();
        }
    }

    public final void EZpvd(final String str, final String str2) {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderInstructionView.KWHzl(str2, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_address", str, false);
        eventParamsList.put("orderId", str2, false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, DexHistoryDetailsFullPageClick.ButtonName.CUSTOMER_SUPPORT_TOP.getValue(), true);
        return Unit.INSTANCE;
    }
}
