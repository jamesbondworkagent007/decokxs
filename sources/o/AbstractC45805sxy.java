package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45805sxy<T extends ViewBinding> extends AbstractC32996moC {
    public final yHO<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> AYXKKw;
    public T valueOf;

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T extends androidx.viewbinding.ViewBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC45805sxy(@NotNull yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.AYXKKw = yho;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        yHO<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> yho = this.AYXKKw;
        android.view.LayoutInflater layoutInflater2 = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
        T tInvoke = yho.invoke(layoutInflater2, null, java.lang.Boolean.FALSE);
        this.valueOf = tInvoke;
        if (tInvoke != null) {
            return tInvoke.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.valueOf = null;
        super.onDestroyView();
    }

    public final T AhwBna() {
        T t = this.valueOf;
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("Binding is null");
    }
}
