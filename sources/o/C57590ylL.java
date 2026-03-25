package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57590ylL extends AppCompatTextView {
    public final android.graphics.Rect KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57590ylL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57590ylL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.ylL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57590ylL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57590ylL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        this.KWHzl = rect;
        android.content.res.TypedArray typedArrayObtainAttributes = getResources().obtainAttributes(attributeSet, C32113mPz.PendingIntent.QDqgQU);
        rect.right = typedArrayObtainAttributes.getDimensionPixelSize(C32113mPz.PendingIntent.RVsVBY, 0);
        rect.bottom = typedArrayObtainAttributes.getDimensionPixelSize(C32113mPz.PendingIntent.RKcVTr, 0);
        typedArrayObtainAttributes.recycle();
        setDrawableSize(rect.width(), rect.height());
    }

    public final void setDrawableSize(int i, int i2) {
        android.graphics.Rect rect = this.KWHzl;
        rect.right = i;
        rect.bottom = i2;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        for (android.graphics.drawable.Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setBounds(this.KWHzl);
            }
        }
        int length = compoundDrawables.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (compoundDrawables[i3] != null) {
                setCompoundDrawablesRelative(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                break;
            }
            i3++;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        for (android.graphics.drawable.Drawable drawable2 : compoundDrawablesRelative) {
            if (drawable2 != null) {
                drawable2.setBounds(this.KWHzl);
            }
        }
        for (android.graphics.drawable.Drawable drawable3 : compoundDrawablesRelative) {
            if (drawable3 != null) {
                setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                return;
            }
        }
    }
}
