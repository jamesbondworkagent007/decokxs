package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30795lhr extends AbstractC30799lhv {
    public TaskDescription copydefault;

    /* JADX INFO: renamed from: o.lhr$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.lhr$TaskDescription */
    public interface TaskDescription {
        void gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30795lhr(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(TaskDescription taskDescription) {
        this.copydefault = taskDescription;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.lhr.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30795lhr(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30795lhr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AkhnZx();
    }

    @Override // o.AbstractC30799lhv
    public void AEQbTJ() {
        C55001xbh c55001xbhAhwBna = AhwBna();
        if (c55001xbhAhwBna != null) {
            c55001xbhAhwBna.setContentDescription("web3_dex_advance_market_amount_input");
        }
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setText(appCompatTextViewGEmmrt.getContext().getString(C23274hvD.Fragment.SFHvfS));
            appCompatTextViewGEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30795lhr.copydefault(this.EZpvd, view);
                }
            });
        }
    }

    public static final void copydefault(C30795lhr c30795lhr, android.view.View view) {
        TaskDescription taskDescription = c30795lhr.copydefault;
        if (taskDescription != null) {
            taskDescription.gEmmrt();
        }
    }

    public final java.lang.String KWHzl(AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        java.lang.String tokenSymbol;
        int i = ActionBar.copydefault[advancedTradeType.ordinal()];
        if (i == 1) {
            int i2 = C23274hvD.Fragment.putLong;
            tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
            return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", tokenSymbol != null ? tokenSymbol : "")));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = C23274hvD.Fragment.putString;
        tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
        return C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", tokenSymbol != null ? tokenSymbol : "")));
    }

    public final void copydefault(@NotNull AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        android.widget.TextView textViewFJNWhG;
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        int i = 0;
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setText(C30565ldZ.getFmtSymbol$default(dexMultiTokenInfoBean.getTokenSymbol(), 0, 1, null));
        }
        C55001xbh c55001xbhAhwBna = AhwBna();
        if (c55001xbhAhwBna != null) {
            c55001xbhAhwBna.setMaxDecimalValue(C33129mqd.AhwBna(dexMultiTokenInfoBean.getDecimals()));
        }
        C55008xbo c55008xboValueOf = valueOf();
        if (c55008xboValueOf != null) {
            c55008xboValueOf.setLabelText(KWHzl(advancedTradeType, dexMultiTokenInfoBean));
        }
        C55001xbh c55001xbhAhwBna2 = AhwBna();
        boolean z = c55001xbhAhwBna2 != null && c55001xbhAhwBna2.isFocused();
        C55001xbh c55001xbhAhwBna3 = AhwBna();
        boolean z2 = (c55001xbhAhwBna3 == null || (strIsConnected = c55001xbhAhwBna3.isConnected()) == null || strIsConnected.length() == 0) ? false : true;
        C55008xbo c55008xboValueOf2 = valueOf();
        if (c55008xboValueOf2 == null || (textViewFJNWhG = c55008xboValueOf2.fJNWhG()) == null) {
            return;
        }
        if (!z && !z2) {
            i = 8;
        }
        textViewFJNWhG.setVisibility(i);
    }
}
