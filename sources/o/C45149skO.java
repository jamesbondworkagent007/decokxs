package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45149skO extends android.widget.LinearLayout {
    public final C47534trs KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45149skO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45149skO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.skO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45149skO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45149skO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C47534trs c47534trsAEQbTJ = C47534trs.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c47534trsAEQbTJ, "");
        this.KWHzl = c47534trsAEQbTJ;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C47315tni.FragmentManager.AubY, 0, 0);
        try {
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C47315tni.FragmentManager.zsXlph);
            if (drawable != null) {
                copydefault(drawable);
            }
            java.lang.String string = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.AwvSrB);
            if (string != null) {
                copydefault().setText(string);
            }
            java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.AwvSrB);
            if (string2 != null) {
                copydefault().setText(string2);
            }
            EZpvd().setOKDSStyle(typedArrayObtainStyledAttributes.getInt(C47315tni.FragmentManager.zuBGHE, 12));
            java.lang.String string3 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.gHZMYf);
            if (string3 != null) {
                KWHzl().setText(string3);
            }
            java.lang.String string4 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.sSMYrx);
            if (string4 != null) {
                AEQbTJ().setText(string4);
            }
            java.lang.String string5 = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.zLjUOn);
            if (string5 != null) {
                AhwBna().setText(string5);
            }
            typedArrayObtainStyledAttributes.recycle();
            java.lang.CharSequence text = EZpvd().getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt__StringsKt.fARcdN(text)) {
                EZpvd().setVisibility(8);
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final ConstraintLayout OLrzqt() {
        ConstraintLayout constraintLayout = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    private final android.widget.ImageView AYXKKw() {
        android.widget.ImageView imageView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55251xgS EZpvd() {
        C55251xgS c55251xgS = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        return c55251xgS;
    }

    public final android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final MaterialTextView AEQbTJ() {
        MaterialTextView materialTextView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final C52794wYp AhwBna() {
        C52794wYp c52794wYp = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final void setServiceIcon(@androidx.annotation.DrawableRes java.lang.Integer num) {
        AYXKKw().setImageResource(num != null ? num.intValue() : 0);
        AYXKKw().setVisibility(num == null ? 8 : 0);
    }

    private final void copydefault(android.graphics.drawable.Drawable drawable) {
        AYXKKw().setImageDrawable(drawable);
        AYXKKw().setVisibility(drawable != null ? 0 : 8);
    }

    public final void setTagProperties(java.lang.String str, java.lang.Integer num) {
        EZpvd().setText(str);
        EZpvd().setOKDSStyle(num != null ? num.intValue() : 0);
        EZpvd().setVisibility((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || num == null) ? 8 : 0);
    }
}
