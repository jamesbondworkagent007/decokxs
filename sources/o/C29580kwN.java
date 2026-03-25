package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29580kwN extends ConstraintLayout {
    public final C21599hFi OLrzqt;

    /* JADX INFO: renamed from: o.kwN$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalMultiplierTagType.values().length];
            try {
                iArr[SignalMultiplierTagType.GOLD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalMultiplierTagType.SILVER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalMultiplierTagType.BRONZE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29580kwN(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.kwN.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29580kwN(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29580kwN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21599hFi c21599hFiAEQbTJ = C21599hFi.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21599hFiAEQbTJ, "");
        this.OLrzqt = c21599hFiAEQbTJ;
    }

    public final void setData(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SignalMultiplierTagType signalMultiplierTagType) {
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagType, "");
        C21599hFi c21599hFi = this.OLrzqt;
        android.widget.ImageView imageView = c21599hFi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25386ivj.loadSquareImage$default(imageView, str, C55298xhM.copydefault(5.625f, context), null, 4, null);
        android.widget.ImageView imageView2 = c21599hFi.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadCircleImage$default(imageView2, str2, false, 2, null);
        int i2 = Activity.EZpvd[signalMultiplierTagType.ordinal()];
        if (i2 == 1) {
            i = C23274hvD.StateListAnimator.getNewProxyInstance;
        } else if (i2 == 2) {
            i = C23274hvD.StateListAnimator.wlaJM;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.StateListAnimator.fJNWhG;
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        android.content.res.ColorStateList colorStateListOLrzqt = C25382ivf.OLrzqt(context2, i);
        c21599hFi.EZpvd.setBackgroundTintList(colorStateListOLrzqt);
        c21599hFi.AEQbTJ.setBackgroundTintList(colorStateListOLrzqt);
    }
}
