package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41312qoT extends AppCompatTextView {

    /* JADX INFO: renamed from: o.qoT$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UpDownColor.values().length];
            try {
                iArr[UpDownColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UpDownColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41312qoT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41312qoT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.qoT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41312qoT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41312qoT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setChangeRatioAndColor(java.lang.CharSequence charSequence, UpDownColor upDownColor) {
        int iTradeRiseHighlightsContent$default;
        int iTradeRiseHighlightsFill$default;
        if (charSequence == null) {
            charSequence = "--";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        int i = upDownColor == null ? -1 : TaskDescription.copydefault[upDownColor.ordinal()];
        if (i == 1) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeRiseHighlightsContent$default = C33512mxp.tradeRiseHighlightsContent$default(c33512mxp, context, 0.0f, 2, null);
        } else if (i == 2) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeRiseHighlightsContent$default = C33512mxp.tradeFallHighlightsContent$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            int i2 = C52761wXj.ActionBar.QSBOWP;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iTradeRiseHighlightsContent$default = C55366xib.KWHzl(i2, context3);
        }
        setTextColor(iTradeRiseHighlightsContent$default);
        C41426qqb.setAutoSizeText$default(this, charSequence2, 14.0f, 0, 4, null);
        int i3 = upDownColor != null ? TaskDescription.copydefault[upDownColor.ordinal()] : -1;
        if (i3 == 1) {
            C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            iTradeRiseHighlightsFill$default = C33512mxp.tradeRiseHighlightsFill$default(c33512mxp3, context4, 0.0f, 2, null);
        } else if (i3 == 2) {
            C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            iTradeRiseHighlightsFill$default = C33512mxp.tradeFallHighlightsFill$default(c33512mxp4, context5, 0.0f, 2, null);
        } else {
            int i4 = C52761wXj.ActionBar.RdAHlO;
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            iTradeRiseHighlightsFill$default = C55366xib.KWHzl(i4, context6);
        }
        ViewCompat.setBackgroundTintList(this, android.content.res.ColorStateList.valueOf(iTradeRiseHighlightsFill$default));
    }
}
