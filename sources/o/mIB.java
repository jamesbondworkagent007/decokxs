package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mIB extends ConstraintLayout {
    public C31890mHs AEQbTJ;
    public android.graphics.drawable.Drawable EZpvd;
    public java.lang.Boolean KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBinding(@NotNull C31890mHs c31890mHs) {
        Intrinsics.checkNotNullParameter(c31890mHs, "");
        this.AEQbTJ = c31890mHs;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.mIB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ mIB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mIB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C31890mHs c31890mHsEZpvd = C31890mHs.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c31890mHsEZpvd, "");
        this.AEQbTJ = c31890mHsEZpvd;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mDC.LoaderManager.KWHzl);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            java.lang.String string = typedArrayObtainStyledAttributes.getString(mDC.LoaderManager.AhwBna);
            this.copydefault = string;
            if (string != null) {
                this.AEQbTJ.KWHzl.setText(string);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(mDC.LoaderManager.AEQbTJ, 0);
            if (resourceId != 0) {
                this.AEQbTJ.KWHzl.setTextAppearance(resourceId);
            }
            if (typedArrayObtainStyledAttributes.hasValue(mDC.LoaderManager.EZpvd)) {
                this.AEQbTJ.KWHzl.setTypeface(null, typedArrayObtainStyledAttributes.getInt(mDC.LoaderManager.EZpvd, 0));
            }
            this.OLrzqt = typedArrayObtainStyledAttributes.getDrawable(mDC.LoaderManager.AYXKKw);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(mDC.LoaderManager.gEmmrt, true));
            this.KWHzl = boolValueOf;
            copydefault(boolValueOf != null ? boolValueOf.booleanValue() : true);
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(mDC.LoaderManager.copydefault);
            this.EZpvd = drawable;
            setEndIcon(drawable);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl.setText(str);
    }

    public final void setTitleTextAppearance(int i) {
        this.AEQbTJ.KWHzl.setTextAppearance(i);
    }

    public final void setTitleTypeface(int i) {
        this.AEQbTJ.KWHzl.setTypeface(null, i);
    }

    public final void setTitleIcon(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            this.AEQbTJ.valueOf.setVisibility(0);
            android.widget.ImageView imageView = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.KWHzl(imageView, str);
            return;
        }
        this.AEQbTJ.valueOf.setVisibility(8);
    }

    public final void setStartIcon() {
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        if (drawable != null) {
            this.AEQbTJ.AhwBna.setImageDrawable(drawable);
            this.AEQbTJ.AhwBna.setVisibility(0);
        }
    }

    public static final void setStartIconAction$lambda$1(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setStartIconAction(final Function0<Unit> function0) {
        this.AEQbTJ.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.mIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mIB.setStartIconAction$lambda$1(function0, view);
            }
        });
    }

    public static final void setBackIconAction$lambda$2(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setBackIconAction(final Function0<Unit> function0) {
        this.AEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mIB.setBackIconAction$lambda$2(function0, view);
            }
        });
    }

    public final void setEndIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.AEQbTJ.copydefault.setVisibility(0);
            this.AEQbTJ.copydefault.setImageDrawable(drawable);
        } else {
            this.AEQbTJ.copydefault.setVisibility(8);
        }
    }

    public static final void setEndIconAction$lambda$3(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEndIconAction(final Function0<Unit> function0) {
        this.AEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.mIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mIB.setEndIconAction$lambda$3(function0, view);
            }
        });
    }

    public final void copydefault(boolean z) {
        if (z) {
            this.AEQbTJ.OLrzqt.setVisibility(0);
            this.AEQbTJ.AhwBna.setVisibility(8);
        } else {
            this.AEQbTJ.OLrzqt.setVisibility(8);
            setStartIcon();
        }
    }
}
