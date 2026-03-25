package o;

import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.okinc.planet.utils.ImageLoadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46443tUn {
    public static final C46443tUn copydefault = new C46443tUn();

    private C46443tUn() {
    }

    public static /* synthetic */ void loadAvatar$default(C46443tUn c46443tUn, android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        if ((i2 & 16) != 0) {
            i = C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG);
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            f = 0.5f;
        }
        c46443tUn.EZpvd(imageView, str, str2, str4, i3, f);
    }

    public final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, int i, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        loadAvatar$default(this, imageView, new ImageLoadInfo(str3 == null ? "" : str3, str, str2 == null ? "" : str2, 0, 0, f, 24, null), i, 0.0f, 8, null);
    }

    public static /* synthetic */ void loadAvatar$default(C46443tUn c46443tUn, android.widget.ImageView imageView, ImageLoadInfo imageLoadInfo, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            int i3 = C32113mPz.ActionBar.fJNWhG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C33070mpX.OLrzqt(i3, context);
        }
        if ((i2 & 8) != 0) {
            f = 0.5f;
        }
        c46443tUn.KWHzl(imageView, imageLoadInfo, i, f);
    }

    public final void KWHzl(@NotNull final android.widget.ImageView imageView, ImageLoadInfo imageLoadInfo, final int i, final float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (imageLoadInfo == null) {
            tRE.copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tUp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46443tUn.EZpvd(imageView, f, i);
                }
            });
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) imageLoadInfo.copydefault())) {
            KWHzl(imageView, imageLoadInfo.copydefault(), i, imageLoadInfo.EZpvd(), imageLoadInfo.OLrzqt());
        } else if (imageLoadInfo.AEQbTJ().length() == 0) {
            KWHzl(imageView, imageLoadInfo.copydefault(), i, imageLoadInfo.EZpvd(), imageLoadInfo.OLrzqt());
        } else {
            KWHzl(imageView, imageLoadInfo, i);
        }
    }

    public static final Unit EZpvd(android.widget.ImageView imageView, float f, int i) {
        Glide.AEQbTJ(imageView.getContext()).OLrzqt(java.lang.Integer.valueOf(C47501trL.ActionBar.AhwBna)).KWHzl(C47501trL.ActionBar.AhwBna).EZpvd((NN<android.graphics.Bitmap>) new C46444tUo(f, i)).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadAvatar$default(C46443tUn c46443tUn, android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            f = 0.5f;
        }
        c46443tUn.KWHzl(imageView, str, i, i2, f);
    }

    public final void KWHzl(final android.widget.ImageView imageView, final java.lang.String str, final int i, final int i2, final float f) {
        tRE.copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46443tUn.OLrzqt(imageView, str, i2, i, f);
            }
        });
    }

    public static final Unit OLrzqt(android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i3 = layoutParams != null ? layoutParams.width : 0;
        C46443tUn c46443tUn = copydefault;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i = numValueOf.intValue();
        }
        c46443tUn.copydefault(context, str, i, i2, f).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C5335Nt buildRequestBuilder$default(C46443tUn c46443tUn, android.content.Context context, java.lang.String str, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 150;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG);
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = 0.5f;
        }
        return c46443tUn.copydefault(context, str, i4, i5, f);
    }

    public final C5335Nt<android.graphics.drawable.Drawable> copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        java.lang.Cloneable cloneableCopydefault = C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, "lfit", i, i).EZpvd((NN<android.graphics.Bitmap>) new C46444tUo(f, i2)).AEQbTJ(C47501trL.ActionBar.AhwBna).KWHzl(C47501trL.ActionBar.AhwBna).copydefault(C47501trL.ActionBar.AhwBna);
        Intrinsics.checkNotNullExpressionValue(cloneableCopydefault, "");
        return (C5335Nt) cloneableCopydefault;
    }

    public static /* synthetic */ C5335Nt buildDefaultRequestBuilder$default(C46443tUn c46443tUn, android.content.Context context, ImageLoadInfo imageLoadInfo, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG);
        }
        if ((i2 & 8) != 0) {
            f = 0.5f;
        }
        return c46443tUn.KWHzl(context, imageLoadInfo, i, f);
    }

    public final C5335Nt<android.graphics.drawable.Drawable> KWHzl(@NotNull android.content.Context context, @NotNull ImageLoadInfo imageLoadInfo, int i, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(imageLoadInfo, "");
        android.graphics.drawable.Drawable drawableKWHzl = new C46438tUi(imageLoadInfo.KWHzl(), imageLoadInfo.AEQbTJ()).KWHzl(context, C52761wXj.Activity.UCQKYV, 40.0f);
        if (drawableKWHzl == null) {
            drawableKWHzl = C33070mpX.KWHzl(C47501trL.ActionBar.AhwBna);
        }
        java.lang.Cloneable cloneableCopydefault = Glide.AEQbTJ(context).AEQbTJ(drawableKWHzl).EZpvd((NN<android.graphics.Bitmap>) new C46444tUo(f, i)).AEQbTJ(C47501trL.ActionBar.AhwBna).copydefault(C47501trL.ActionBar.AhwBna);
        Intrinsics.checkNotNullExpressionValue(cloneableCopydefault, "");
        return (C5335Nt) cloneableCopydefault;
    }

    public static /* synthetic */ void loadDefaultComposeAvatar$default(C46443tUn c46443tUn, android.widget.ImageView imageView, ImageLoadInfo imageLoadInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            int i3 = C32113mPz.ActionBar.fJNWhG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C33070mpX.OLrzqt(i3, context);
        }
        c46443tUn.KWHzl(imageView, imageLoadInfo, i);
    }

    public final void KWHzl(final android.widget.ImageView imageView, final ImageLoadInfo imageLoadInfo, final int i) {
        C46438tUi c46438tUi = new C46438tUi(imageLoadInfo.KWHzl(), imageLoadInfo.AEQbTJ());
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final android.graphics.drawable.Drawable drawableKWHzl = c46438tUi.KWHzl(context, C52761wXj.Activity.UCQKYV, 40.0f);
        if (drawableKWHzl == null) {
            drawableKWHzl = C33070mpX.KWHzl(C47501trL.ActionBar.AhwBna);
        }
        tRE.copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46443tUn.copydefault(imageView, drawableKWHzl, imageLoadInfo, i);
            }
        });
    }

    public static final Unit copydefault(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, ImageLoadInfo imageLoadInfo, int i) {
        if (imageView.getContext() != null) {
            Glide.AEQbTJ(imageView.getContext()).AEQbTJ(drawable).EZpvd((NN<android.graphics.Bitmap>) new C46444tUo(imageLoadInfo.OLrzqt(), i)).AEQbTJ(C47501trL.ActionBar.AhwBna).KWHzl(C47501trL.ActionBar.AhwBna).copydefault(C47501trL.ActionBar.AhwBna).EZpvd(imageView);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final android.widget.ImageView imageView, java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0) {
            tRE.copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tUl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46443tUn.AEQbTJ(imageView);
                }
            });
        } else {
            copydefault(imageView, str);
        }
    }

    public static final Unit AEQbTJ(android.widget.ImageView imageView) {
        Glide.AEQbTJ(imageView.getContext()).OLrzqt(java.lang.Integer.valueOf(C47501trL.ActionBar.djBIcL)).KWHzl(C47501trL.ActionBar.djBIcL).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public final void copydefault(final android.widget.ImageView imageView, final java.lang.String str) {
        tRE.copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46443tUn.OLrzqt(imageView, str);
            }
        });
    }

    public static final Unit OLrzqt(android.widget.ImageView imageView, java.lang.String str) {
        C46443tUn c46443tUn = copydefault;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        buildGroupRequestBuilder$default(c46443tUn, context, str, 0, 0, 0.0f, 28, null).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C5335Nt buildGroupRequestBuilder$default(C46443tUn c46443tUn, android.content.Context context, java.lang.String str, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 150;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG);
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = 0.5f;
        }
        return c46443tUn.AEQbTJ(context, str, i4, i5, f);
    }

    public final C5335Nt<android.graphics.drawable.Drawable> AEQbTJ(@NotNull android.content.Context context, java.lang.String str, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        if (str == null) {
            str = "";
        }
        java.lang.Cloneable cloneableCopydefault = C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, "lfit", i, i).EZpvd((NN<android.graphics.Bitmap>) new C46444tUo(f, i2)).AEQbTJ(C47501trL.ActionBar.djBIcL).KWHzl(C47501trL.ActionBar.djBIcL).copydefault(C47501trL.ActionBar.djBIcL);
        Intrinsics.checkNotNullExpressionValue(cloneableCopydefault, "");
        return (C5335Nt) cloneableCopydefault;
    }

    public final boolean AEQbTJ(android.content.Context context) {
        if (context == null) {
            return false;
        }
        return ((context instanceof android.app.Activity) && C33054mpH.copydefault((android.app.Activity) context)) ? false : true;
    }
}
