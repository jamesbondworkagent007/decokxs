package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55378xin extends android.widget.FrameLayout {
    public final C54925xaK EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55378xin(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55378xin(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.xin.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55378xin(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55378xin(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54925xaK c54925xaKCopydefault = C54925xaK.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54925xaKCopydefault, "");
        this.EZpvd = c54925xaKCopydefault;
        setMinimumHeight(C55298xhM.OLrzqt(44, context));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.dbAction, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            setTitle(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.dHAKvv, 0, 4, null));
            setSubtitle(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.DbvGUJ, 0, 4, null));
            setLogo(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.identifier));
            KWHzl(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.openFileOutput, false));
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.DhEJvI);
            if (drawable != null) {
                EZpvd().setImageDrawable(drawable);
            }
            java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(C52761wXj.PictureInPictureParams.ZxnNGp);
            if (text != null) {
                c54925xaKCopydefault.gEmmrt.setContentDescription(text);
            }
            java.lang.CharSequence text2 = typedArrayObtainStyledAttributes.getText(C52761wXj.PictureInPictureParams.ZqidTP);
            if (text2 != null) {
                c54925xaKCopydefault.OLrzqt.setContentDescription(text2);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final wYC EZpvd() {
        wYC wyc = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        MaterialTextView materialTextView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        C55307xhV.AEQbTJ(materialTextView, charSequence);
    }

    public final void setSubtitle(java.lang.CharSequence charSequence) {
        MaterialTextView materialTextView = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        C55307xhV.AEQbTJ(materialTextView, charSequence);
    }

    public final void setLogo(android.graphics.drawable.Drawable drawable) {
        AppCompatImageView appCompatImageView = this.EZpvd.copydefault;
        appCompatImageView.setImageDrawable(drawable);
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(drawable != null ? 0 : 8);
    }

    public final void KWHzl(boolean z) {
        AppCompatImageView appCompatImageView = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    public final wYC copydefault(android.graphics.drawable.Drawable drawable) {
        android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (drawable == null) {
            return null;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYC wyc = new wYC(context, null, 0, 6, null);
        wyc.setImageDrawable(drawable);
        android.content.Context context2 = wyc.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOLrzqt, iOLrzqt);
        android.content.Context context3 = wyc.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams.setMarginStart(C55298xhM.OLrzqt(12, context3));
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(wyc, layoutParams);
        return wyc;
    }

    public final wYC AEQbTJ(@androidx.annotation.DrawableRes int i) {
        return copydefault(ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        KWHzl();
    }

    public final void KWHzl() {
        ConstraintLayout constraintLayout = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        android.util.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = EZpvd(constraintLayout);
        ConstraintLayout constraintLayout2 = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        OLrzqt(constraintLayout2, pairEZpvd);
    }

    public final android.util.Pair<java.lang.Integer, java.lang.Integer> EZpvd(android.view.View view) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != view) {
                int right = childAt.getRight();
                if (paddingLeft + 1 <= right && right < i) {
                    paddingLeft = childAt.getRight();
                }
                int left = childAt.getLeft();
                if (i + 1 <= left && left < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(paddingLeft), java.lang.Integer.valueOf(paddingRight));
    }

    public final void OLrzqt(android.view.View view, android.util.Pair<java.lang.Integer, java.lang.Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = (int) java.lang.Math.max(((java.lang.Number) pair.first).intValue() - i, AudioStats.AUDIO_AMPLITUDE_NONE);
        Intrinsics.checkNotNullExpressionValue(pair.second, "");
        int iMax2 = (int) java.lang.Math.max(iMax, (int) java.lang.Math.max(i2 - ((java.lang.Number) r10).intValue(), AudioStats.AUDIO_AMPLITUDE_NONE));
        if (iMax2 > 0) {
            i += iMax2;
            i2 -= iMax2;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity |= 16;
            }
            Unit unit = Unit.INSTANCE;
        } else {
            layoutParams = null;
        }
        super.addView(view, i, layoutParams);
    }
}
