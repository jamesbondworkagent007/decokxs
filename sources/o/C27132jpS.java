package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27132jpS extends ConstraintLayout {
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27132jpS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27132jpS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.jpS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27132jpS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27132jpS(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27132jpS.AEQbTJ(context, this);
            }
        });
    }

    private final iJY OLrzqt() {
        return (iJY) this.copydefault.getValue();
    }

    public static final iJY AEQbTJ(android.content.Context context, C27132jpS c27132jpS) {
        iJY ijyEZpvd = iJY.EZpvd(android.view.LayoutInflater.from(context), c27132jpS, true);
        Intrinsics.checkNotNullExpressionValue(ijyEZpvd, "");
        return ijyEZpvd;
    }

    public final void setCollateralRatio(@NotNull InterfaceC24178iXu.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        iJY ijyOLrzqt = OLrzqt();
        ijyOLrzqt.OLrzqt.setText(getContext().getString(application.KWHzl()));
        if (application.copydefault() == null) {
            setCollateralRatioText(ijyOLrzqt, application.AEQbTJ(), true, application.OLrzqt());
        } else {
            setCollateralRatioText(ijyOLrzqt, application.copydefault(), true, application.OLrzqt());
        }
    }

    public static /* synthetic */ void setCollateralRatioText$default(C27132jpS c27132jpS, iJY ijy, CollateralRatioInfo collateralRatioInfo, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        c27132jpS.setCollateralRatioText(ijy, collateralRatioInfo, z, num);
    }

    public final void setCollateralRatioText(iJY ijy, CollateralRatioInfo collateralRatioInfo, boolean z, java.lang.Integer num) {
        android.content.Context context = ijy.getRoot().getContext();
        android.widget.TextView textView = ijy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean zAEQbTJ = C55296xhK.AEQbTJ(textView);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) collateralRatioInfo.getRealCollateralRatio())) {
            Intrinsics.copydefault(context);
            java.lang.String collateralRatio = collateralRatioInfo.getCollateralRatio();
            if (collateralRatio == null) {
                collateralRatio = collateralRatioInfo.getSafeCollateralRatio();
            }
            java.lang.String strCopydefault = C26720jhe.copydefault(context, collateralRatio);
            java.lang.String realCollateralRatio = collateralRatioInfo.getRealCollateralRatio();
            if (realCollateralRatio == null) {
                realCollateralRatio = collateralRatioInfo.getSafeCollateralRatio();
            }
            java.lang.String strCopydefault2 = C26720jhe.copydefault(context, realCollateralRatio);
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.OBJEWx));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strCopydefault);
            if (!z) {
                spannableStringBuilder.append((java.lang.CharSequence) "\n");
            }
            spannableStringBuilder.append((java.lang.CharSequence) (zAEQbTJ ? " ← " : " → "));
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            java.lang.Integer realCollateralLevel = collateralRatioInfo.getRealCollateralLevel();
            android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, (realCollateralLevel != null && realCollateralLevel.intValue() == 0) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.DQzvGN));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strCopydefault2);
            spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        } else {
            java.lang.String safeCollateralRatio = (num != null && num.intValue() == 0) ? collateralRatioInfo.getSafeCollateralRatio() : collateralRatioInfo.getCollateralRatio();
            Intrinsics.copydefault(context);
            spannableStringBuilder.append((java.lang.CharSequence) C26720jhe.copydefault(context, safeCollateralRatio));
        }
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        android.widget.TextView textView2 = ijy.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        android.widget.TextView textView3 = ijy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z ^ true ? 0 : 8);
        if (z) {
            ijy.EZpvd.setText(spannedString);
        } else {
            ijy.KWHzl.setText(spannedString);
        }
    }
}
