package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.InsetDrawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55381xiq {
    public android.graphics.drawable.Drawable AEQbTJ;
    public final android.content.Context EZpvd;
    public boolean OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.AEQbTJ = null;
        this.OLrzqt = false;
    }

    public C55381xiq(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.copydefault = i;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable prepareIcon$default(C55381xiq c55381xiq, int i, int i2, java.lang.Integer num, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return c55381xiq.copydefault(i, i2, num, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.drawable.Drawable copydefault(@androidx.annotation.DrawableRes int i, int i2, java.lang.Integer num, int i3) {
        BitmapDrawable bitmapDrawable;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this.EZpvd, i);
        if (drawable == null) {
            bitmapDrawable = null;
        } else {
            drawable.setTint(num != null ? java.lang.Integer.valueOf(C33517mxu.KWHzl.OLrzqt(this.EZpvd, num.intValue())).intValue() : i3);
            drawable.setAutoMirrored(true);
            num.intValue();
            num = java.lang.Boolean.valueOf(C55296xhK.OLrzqt(this.EZpvd)).booleanValue() ? 1 : null;
            drawable.setLayoutDirection(num != null ? num.intValue() : 0);
            android.graphics.Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable, i2, i2, null, 4, null);
            if (bitmap$default != null) {
                android.content.res.Resources resources = this.EZpvd.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                bitmapDrawable = new BitmapDrawable(resources, bitmap$default);
            }
        }
        if (bitmapDrawable == null) {
            return null;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.copydefault);
        numValueOf.intValue();
        if (!(!C55296xhK.OLrzqt(this.EZpvd))) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.copydefault);
        numValueOf2.intValue();
        java.lang.Integer num2 = C55296xhK.OLrzqt(this.EZpvd) ? numValueOf2 : null;
        InsetDrawable insetDrawable = new InsetDrawable((android.graphics.drawable.Drawable) bitmapDrawable, iIntValue, 0, num2 != null ? num2.intValue() : 0, 0);
        insetDrawable.setBounds(0, 0, this.copydefault + i2, i2);
        this.AEQbTJ = insetDrawable;
        this.OLrzqt = true;
        return insetDrawable;
    }

    public final void copydefault(int i) {
        android.graphics.drawable.Drawable drawable = this.AEQbTJ;
        if (drawable != null) {
            drawable.setTint(C33517mxu.KWHzl.OLrzqt(this.EZpvd, i));
        }
    }

    public final int EZpvd() {
        android.graphics.Rect bounds;
        android.graphics.drawable.Drawable drawable = this.AEQbTJ;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }
}
