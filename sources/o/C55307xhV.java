package o;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55307xhV {
    public static final void AEQbTJ(@NotNull android.widget.TextView textView, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "");
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static /* synthetic */ void setCursorDrawable$default(android.widget.TextView textView, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DeEinT);
        }
        if ((i3 & 2) != 0) {
            i2 = 6;
        }
        if ((i3 & 4) != 0) {
            f = 0.0f;
        }
        AEQbTJ(textView, i, i2, f);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(textView, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setSize(i2, -1);
        copydefault(textView, gradientDrawable);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x001f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.widget.TextView */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: android.widget.TextView */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(@NotNull android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        java.lang.reflect.Field declaredField;
        java.lang.Class cls = android.widget.TextView.class;
        Intrinsics.checkNotNullParameter(textView, "");
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTextCursorDrawable(drawable);
            return;
        }
        try {
            declaredField = android.widget.TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
        } catch (java.lang.Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            try {
                java.lang.Object obj = declaredField.get(textView);
                if (obj != null) {
                    textView = obj;
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (declaredField != null) {
            cls = textView.getClass();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mDrawableForCursor");
            declaredField2.setAccessible(true);
            declaredField2.set(textView, drawable);
        } else {
            java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(textView, new android.graphics.drawable.Drawable[]{drawable, drawable});
        }
    }

    public static final void copydefault(@NotNull android.widget.EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        editText.requestFocus();
        editText.setEnabled(true);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.getShowSoftInputOnFocus();
    }
}
