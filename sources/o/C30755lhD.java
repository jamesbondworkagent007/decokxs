package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30755lhD extends AbstractC30799lhv {
    public Activity copydefault;

    /* JADX INFO: renamed from: o.lhD$Activity */
    public interface Activity {
        void isConnected();
    }

    /* JADX INFO: renamed from: o.lhD$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedLimitBy.values().length];
            try {
                iArr[AdvancedLimitBy.Price.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30755lhD(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Activity activity) {
        this.copydefault = activity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.lhD.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30755lhD(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30755lhD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AkhnZx();
    }

    @Override // o.AbstractC30799lhv
    public void AEQbTJ() {
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setTag(AdvancedLimitBy.Price);
            appCompatTextViewGEmmrt.setText(appCompatTextViewGEmmrt.getContext().getString(C23274hvD.Fragment.DsL));
            appCompatTextViewGEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lhC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30755lhD.EZpvd(this.KWHzl, view);
                }
            });
        }
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setText(C23272hvB.KWHzl.OLrzqt().getSymbol());
        }
    }

    public static final void EZpvd(C30755lhD c30755lhD, android.view.View view) {
        Activity activity = c30755lhD.copydefault;
        if (activity != null) {
            activity.isConnected();
        }
    }

    private final java.lang.String ejfBZ() {
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        java.lang.Object tag = appCompatTextViewGEmmrt != null ? appCompatTextViewGEmmrt.getTag() : null;
        AdvancedLimitBy advancedLimitBy = tag instanceof AdvancedLimitBy ? (AdvancedLimitBy) tag : null;
        int i = advancedLimitBy == null ? -1 : Application.copydefault[advancedLimitBy.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatBuilder, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol())));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatBitmapKey, C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol())));
    }

    /* JADX DEBUG: Possible override for method o.lhv.isConnected()Landroid/view/View; */
    public final void isConnected() {
        android.widget.TextView textViewFJNWhG;
        java.lang.String strIsConnected;
        C55008xbo c55008xboValueOf = valueOf();
        if (c55008xboValueOf != null) {
            c55008xboValueOf.setLabelText(ejfBZ());
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

    public final void AuCTel() {
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setText(C23272hvB.KWHzl.OLrzqt().getSymbol());
        }
        isConnected();
    }

    public final void OLrzqt(@NotNull AdvancedLimitBy advancedLimitBy) {
        int i;
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setTag(advancedLimitBy);
            int i2 = Application.copydefault[advancedLimitBy.ordinal()];
            if (i2 == 1) {
                i = C23274hvD.Fragment.DsL;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23274hvD.Fragment.avCqka;
            }
            appCompatTextViewGEmmrt.setText(C33070mpX.AYXKKw(i));
        }
        isConnected();
    }
}
