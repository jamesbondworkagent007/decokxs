package o;

import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMZ {
    public static final void copydefault(@NotNull android.view.ViewGroup viewGroup) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        for (android.view.View view : ViewGroupKt.getChildren(viewGroup)) {
            java.lang.Object tag = view.getTag();
            C55360xiV c55360xiV = null;
            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            java.lang.Float fFIwbmz = (str == null || (strKWHzl = StringsKt__StringsKt.KWHzl(str, (java.lang.CharSequence) "skeleton_radius_")) == null) ? null : C59443zhD.fIwbmz(strKWHzl);
            if (fFIwbmz != null) {
                c55360xiV = new C55360xiV(null, null, false, java.lang.Float.valueOf(fFIwbmz.floatValue()), 7, null);
            }
            C55420xjc.AEQbTJ(view, c55360xiV);
        }
    }

    public static final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C5495Ty) {
                android.view.View childAt2 = ((C5495Ty) childAt).getChildAt(0);
                if (childAt2 != null) {
                    C55420xjc.copydefault(childAt2, KWHzl());
                }
            } else if (childAt instanceof android.view.ViewGroup) {
                copydefault((android.view.ViewGroup) childAt);
                C55420xjc.copydefault(childAt, KWHzl());
            }
        }
    }

    public static final void KWHzl(@NotNull android.view.View view) {
        android.view.View childAt;
        Intrinsics.checkNotNullParameter(view, "");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt2 = viewGroup.getChildAt(i);
            if ((childAt2 instanceof C5495Ty) && (childAt = ((C5495Ty) childAt2).getChildAt(0)) != null) {
                C55420xjc.copydefault(childAt);
            }
        }
    }

    public static final C55358xiT KWHzl() {
        return new C55358xiT(1200L, C52761wXj.Activity.idLUrz, C52761wXj.Activity.invokespecialDPHOMC);
    }
}
