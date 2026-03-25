package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39044pkq {
    public static final android.view.View KWHzl(android.view.LayoutInflater layoutInflater, @androidx.annotation.LayoutRes int i, android.view.ViewGroup viewGroup) {
        return copydefault(layoutInflater, i, viewGroup);
    }

    public static /* synthetic */ android.view.View findOrCreateView$default(android.view.LayoutInflater layoutInflater, int i, android.view.ViewGroup viewGroup, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            viewGroup = null;
        }
        return copydefault(layoutInflater, i, viewGroup);
    }

    public static final android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, @androidx.annotation.LayoutRes int i, android.view.ViewGroup viewGroup) throws java.lang.Throwable {
        java.lang.Object objValueOf;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.content.Context context = layoutInflater.getContext();
        try {
            android.view.View viewInflate = layoutInflater.inflate(i, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return viewInflate;
        } catch (java.lang.Exception e) {
            try {
                objValueOf = context.getResources().getResourceName(i);
            } catch (java.lang.Exception unused) {
                objValueOf = java.lang.Integer.valueOf(i);
            }
            throw new java.lang.Throwable("can't inflate " + objValueOf, e);
        }
    }
}
