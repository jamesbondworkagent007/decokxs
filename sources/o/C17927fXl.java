package o;

import android.graphics.drawable.GradientDrawable;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.dTH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17927fXl {
    public static final C17927fXl KWHzl = new C17927fXl();

    private C17927fXl() {
    }

    public final void OLrzqt(@NotNull dTH dth, android.widget.ImageView imageView, boolean z, @NotNull android.widget.TextView... textViewArr) {
        Intrinsics.checkNotNullParameter(dth, "");
        Intrinsics.checkNotNullParameter(textViewArr, "");
        android.graphics.drawable.Drawable drawable = null;
        if (dth instanceof dTH.FragmentManager) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            for (android.widget.TextView textView : textViewArr) {
                textView.setTextColor(iCopydefault);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (z) {
                if (imageView != null) {
                    imageView.setImageDrawable(null);
                }
                if (imageView != null) {
                    imageView.setBackground(null);
                    return;
                }
                return;
            }
            return;
        }
        if (dth instanceof dTH.PendingIntent) {
            int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
            for (android.widget.TextView textView2 : textViewArr) {
                textView2.setTextColor(iCopydefault2);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(iCopydefault2);
                    drawable = drawableKWHzl;
                }
                imageView.setImageDrawable(drawable);
            }
            if (!z || imageView == null) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor((iCopydefault2 & 16777215) | 855638016);
            imageView.setBackground(gradientDrawable);
            return;
        }
        if (dth instanceof dTH.Activity) {
            int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
            for (android.widget.TextView textView3 : textViewArr) {
                textView3.setTextColor(iCopydefault3);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(iCopydefault3);
                    drawable = drawableKWHzl2;
                }
                imageView.setImageDrawable(drawable);
            }
            if (!z || imageView == null) {
                return;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(C33070mpX.copydefault(C52761wXj.Activity.aJZHYI));
            imageView.setBackground(gradientDrawable2);
            return;
        }
        if (!(dth instanceof dTH.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        int iCopydefault4 = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        for (android.widget.TextView textView4 : textViewArr) {
            textView4.setTextColor(iCopydefault4);
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
            if (drawableKWHzl3 != null) {
                drawableKWHzl3.setTint(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                drawable = drawableKWHzl3;
            }
            imageView.setImageDrawable(drawable);
        }
        if (!z || imageView == null) {
            return;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        imageView.setBackground(gradientDrawable3);
    }

    public final java.lang.String AEQbTJ(@NotNull java.util.List<ChainAddress> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ChainAddress) next).getChainId() == 1) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        if (chainAddress == null) {
            return "";
        }
        java.lang.String lowerCase = chainAddress.getAddress().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return xYT.KWHzl.EZpvd(lowerCase + "OKX-TEE");
    }
}
