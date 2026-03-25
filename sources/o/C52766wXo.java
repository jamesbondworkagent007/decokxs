package o;

import android.content.res.Resources;
import androidx.collection.SparseArrayCompat;
import com.google.android.material.resources.MaterialResources;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52766wXo implements InterfaceC52764wXm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final SparseArrayCompat<java.lang.Float> EZpvd;
    public final android.util.SparseIntArray KWHzl;
    public final android.widget.TextView OLrzqt;

    public C52766wXo(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.OLrzqt = textView;
        this.EZpvd = new SparseArrayCompat<>(3);
        this.KWHzl = new android.util.SparseIntArray(3);
    }

    /* JADX INFO: renamed from: o.wXo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.OLrzqt.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OKvQBs, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.KWHzl.put(-3, typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ORrpqH, 0));
            this.EZpvd.put(-3, java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.dGrqPl, 0.0f)));
            this.KWHzl.put(-4, typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OUcgGI, 0));
            this.EZpvd.put(-4, java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.FF, 0.0f)));
            this.KWHzl.put(-5, typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.gZKUVK, 0));
            this.EZpvd.put(-5, java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.uLLnq, 0.0f)));
            this.KWHzl.put(-6, typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OeZisf, 0));
            this.EZpvd.put(-6, java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QYNZmZ, 0.0f)));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ float getTextSizeBySize$default(C52766wXo c52766wXo, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return c52766wXo.copydefault(i, f);
    }

    public final float copydefault(int i, float f) {
        java.lang.Float f2 = this.EZpvd.get(i);
        return (f2 == null || Intrinsics.EZpvd(f2, 0.0f)) ? f : f2.floatValue();
    }

    public static /* synthetic */ int getTextAppearanceBySize$default(C52766wXo c52766wXo, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C52761wXj.LoaderManager.DCJXGO;
        }
        return c52766wXo.copydefault(i, i2);
    }

    public final int copydefault(int i, int i2) {
        int i3 = this.KWHzl.get(i);
        return i3 == 0 ? i2 : i3;
    }

    public final int EZpvd(int i) {
        int i2 = this.KWHzl.get(i);
        Resources.Theme theme = this.OLrzqt.getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "");
        return OLrzqt(theme, i2);
    }

    public final int OLrzqt(Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, com.google.android.material.R.styleable.MaterialTextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        android.content.Context context = this.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = KWHzl(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight, com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iKWHzl;
    }

    public final int KWHzl(android.content.Context context, android.content.res.TypedArray typedArray, @androidx.annotation.StyleableRes int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i], -1);
        }
        return dimensionPixelSize;
    }
}
