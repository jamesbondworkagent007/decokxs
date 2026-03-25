package o;

import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31899mIa {
    public static /* synthetic */ mHV applyTouchFeedback$default(ViewDataBinding viewDataBinding, android.view.View view, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view = null;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 5;
        }
        return copydefault(viewDataBinding, view, z, i);
    }

    public static final mHV copydefault(@NotNull ViewDataBinding viewDataBinding, android.view.View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "");
        android.view.View root = viewDataBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return AEQbTJ(root, view, z, i);
    }

    public static /* synthetic */ mHV applyTouchFeedback$default(android.view.View view, android.view.View view2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            view2 = null;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 5;
        }
        return AEQbTJ(view, view2, z, i);
    }

    public static final mHV AEQbTJ(@NotNull android.view.View view, android.view.View view2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        return mHV.Companion.AEQbTJ(view, view2, C56402yEa.EZpvd(view), z, i);
    }
}
