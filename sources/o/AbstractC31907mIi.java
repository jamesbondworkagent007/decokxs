package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC31907mIi<T extends ViewDataBinding> extends AbstractC32996moC {
    public final int AuCTel;
    public android.view.View ejfBZ;
    public boolean fARcdN;
    public T fIwbmz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.fIwbmz = t;
    }

    public abstract void EZpvd();

    public abstract void djBIcL();

    public abstract void gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AuCTel;
    }

    public AbstractC31907mIi(@androidx.annotation.LayoutRes int i) {
        this.AuCTel = i;
    }

    public final T isConnected() {
        T t = this.fIwbmz;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ(boolean z) {
        if (this.fARcdN) {
            return;
        }
        this.fARcdN = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AEQbTJ(DataBindingUtil.inflate(layoutInflater, getLayoutId(), viewGroup, false));
        android.view.View root = isConnected().getRoot();
        this.ejfBZ = root;
        if (root != null) {
            return root;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
        EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.view.View view = this.ejfBZ;
        android.view.View view2 = null;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        if (view.getParent() != null) {
            android.view.View view3 = this.ejfBZ;
            if (view3 == null) {
                Intrinsics.gEmmrt("");
                view3 = null;
            }
            android.view.ViewParent parent = view3.getParent();
            Intrinsics.copydefault(parent, "");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            android.view.View view4 = this.ejfBZ;
            if (view4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                view2 = view4;
            }
            viewGroup.removeView(view2);
        }
        super.onDestroyView();
        isConnected().unbind();
    }
}
