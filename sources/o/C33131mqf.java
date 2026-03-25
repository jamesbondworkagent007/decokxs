package o;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33131mqf {
    public static final <T extends ViewDataBinding> T OLrzqt(@NotNull ViewStubProxy viewStubProxy) {
        android.view.ViewStub viewStub;
        Intrinsics.checkNotNullParameter(viewStubProxy, "");
        if (!viewStubProxy.isInflated() && (viewStub = viewStubProxy.getViewStub()) != null) {
            viewStub.inflate();
        }
        T t = (T) viewStubProxy.getBinding();
        Intrinsics.copydefault(t, "");
        return t;
    }

    public static final void EZpvd(@NotNull ViewStubProxy viewStubProxy) {
        Intrinsics.checkNotNullParameter(viewStubProxy, "");
        if (viewStubProxy.isInflated()) {
            android.view.View root = viewStubProxy.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
        }
    }

    public static final <T extends ViewDataBinding> void KWHzl(@NotNull ViewStubProxy viewStubProxy) {
        android.view.ViewStub viewStub;
        Intrinsics.checkNotNullParameter(viewStubProxy, "");
        if (!viewStubProxy.isInflated() && (viewStub = viewStubProxy.getViewStub()) != null) {
            viewStub.inflate();
        }
        android.view.View root = viewStubProxy.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
    }
}
