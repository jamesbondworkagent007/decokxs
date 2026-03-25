package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35882oHe<T, B extends ViewDataBinding> {
    public androidx.recyclerview.widget.ListAdapter<T, oGY<B>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull androidx.recyclerview.widget.ListAdapter<T, oGY<B>> listAdapter) {
        Intrinsics.checkNotNullParameter(listAdapter, "");
        this.zuBGHE = listAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull oGY<B> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
    }

    public abstract int OLrzqt();

    public abstract int copydefault();

    public final boolean copydefault(int i) {
        return true;
    }

    public final androidx.recyclerview.widget.ListAdapter<T, oGY<B>> zuBGHE() {
        if (this.zuBGHE == null) {
            Intrinsics.gEmmrt("");
        }
        androidx.recyclerview.widget.ListAdapter<T, oGY<B>> listAdapter = this.zuBGHE;
        if (listAdapter != null) {
            return listAdapter;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public oGY<B> AhwBna(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        int iCopydefault = copydefault();
        if (!copydefault(iCopydefault)) {
            viewGroup = null;
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, iCopydefault, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new oGY<>(viewDataBindingInflate.getRoot(), viewDataBindingInflate);
    }

    public void AEQbTJ(@NotNull oGY<B> ogy, T t, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl(ogy, t);
    }

    public void KWHzl(@NotNull oGY<B> ogy, T t) {
        Intrinsics.checkNotNullParameter(ogy, "");
        copydefault(ogy, t);
    }

    public final void copydefault(oGY<B> ogy, T t) {
        ViewDataBinding viewDataBindingCopydefault = ogy.copydefault();
        viewDataBindingCopydefault.setVariable(OLrzqt(), t);
        viewDataBindingCopydefault.executePendingBindings();
    }
}
