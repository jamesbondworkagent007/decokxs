package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30800lhw extends AbstractC30799lhv {
    public ActionBar copydefault;

    /* JADX INFO: renamed from: o.lhw$ActionBar */
    public interface ActionBar {
        void fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.lhw$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30800lhw(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.lhw.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30800lhw(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30800lhw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AkhnZx();
    }

    @Override // o.AbstractC30799lhv
    public void AEQbTJ() {
        C55001xbh c55001xbhAhwBna = AhwBna();
        if (c55001xbhAhwBna != null) {
            c55001xbhAhwBna.setContentDescription("web3_dex_advance_market_value_input_textfield");
            c55001xbhAhwBna.setMaxDecimalValue(C23272hvB.KWHzl.OLrzqt().getPrecision());
        }
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setText(appCompatTextViewGEmmrt.getContext().getString(C23274hvD.Fragment.OFqMGB));
            appCompatTextViewGEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lhA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30800lhw.copydefault(this.AEQbTJ, view);
                }
            });
        }
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setText(C23272hvB.KWHzl.OLrzqt().getSymbol());
        }
    }

    public static final void copydefault(C30800lhw c30800lhw, android.view.View view) {
        ActionBar actionBar = c30800lhw.copydefault;
        if (actionBar != null) {
            actionBar.fetchVPNInfo();
        }
    }

    public final java.lang.String KWHzl(AdvancedTradeType advancedTradeType) {
        int i = StateListAnimator.copydefault[advancedTradeType.ordinal()];
        if (i == 1) {
            return C33069mpW.copydefault(C23274hvD.Fragment.putBitmap, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol())));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatTextKey, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol())));
    }

    public final void AEQbTJ(@NotNull AdvancedTradeType advancedTradeType) {
        android.widget.TextView textViewFJNWhG;
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setText(C23272hvB.KWHzl.OLrzqt().getSymbol());
        }
        C55008xbo c55008xboValueOf = valueOf();
        if (c55008xboValueOf != null) {
            c55008xboValueOf.setLabelText(KWHzl(advancedTradeType));
        }
        C55001xbh c55001xbhAhwBna = AhwBna();
        int i = 0;
        boolean z = c55001xbhAhwBna != null && c55001xbhAhwBna.isFocused();
        C55001xbh c55001xbhAhwBna2 = AhwBna();
        boolean z2 = (c55001xbhAhwBna2 == null || (strIsConnected = c55001xbhAhwBna2.isConnected()) == null || strIsConnected.length() == 0) ? false : true;
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
