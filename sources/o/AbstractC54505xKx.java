package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC54505xKx<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC56129xww<Presenter> {
    public C54503xKv<Binding, Presenter> AwvSrB;
    public boolean zuBGHE;

    public boolean bs_() {
        return false;
    }

    public boolean bv_() {
        return false;
    }

    public int fFgQHt() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean giSNqX() {
        return this.AwvSrB != null;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public void uzCIH() {
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C54503xKv<Binding, Presenter> c54503xKv = new C54503xKv<>(gasjUx(), fFgQHt());
        this.AwvSrB = c54503xKv;
        c54503xKv.OLrzqt(this, bu_());
    }

    public final Presenter gasjUx() {
        ViewModelProvider viewModelProviderCopydefault;
        if (bv_()) {
            AppCompatActivity appCompatActivityRcXXUw = RcXXUw();
            Intrinsics.copydefault(appCompatActivityRcXXUw);
            viewModelProviderCopydefault = OLrzqt(appCompatActivityRcXXUw);
        } else if (bs_() && getParentFragment() != null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment);
            viewModelProviderCopydefault = copydefault(parentFragment);
        } else {
            viewModelProviderCopydefault = copydefault(this);
        }
        return (Presenter) viewModelProviderCopydefault.get(dvKsVJ());
    }

    public java.lang.Class<Presenter> dvKsVJ() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        boolean z = true;
        while (z) {
            if (genericSuperclass == null) {
                z = false;
            } else {
                if (genericSuperclass instanceof ParameterizedType) {
                    java.lang.reflect.Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
                    Intrinsics.copydefault(type, "");
                    if (type instanceof ParameterizedType) {
                        java.lang.reflect.Type rawType = ((ParameterizedType) type).getRawType();
                        Intrinsics.copydefault(rawType, "");
                        return (java.lang.Class) rawType;
                    }
                    return (java.lang.Class) type;
                }
                genericSuperclass = ((java.lang.Class) genericSuperclass).getGenericSuperclass();
            }
        }
        Intrinsics.copydefault(genericSuperclass, "");
        return (java.lang.Class) genericSuperclass;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xKv.doBinding$default(o.xKv, androidx.lifecycle.LifecycleOwner, android.view.LayoutInflater, android.view.ViewGroup, int, boolean, int, java.lang.Object):android.view.View */
    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C54503xKv<Binding, Presenter> c54503xKv = this.AwvSrB;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return C54503xKv.doBinding$default(c54503xKv, this, layoutInflater, viewGroup, getLayoutId(), false, 16, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.zuBGHE) {
            return;
        }
        uzCIH();
        this.zuBGHE = true;
    }

    public java.util.List<AbsPresenter> bu_() {
        return yDY.AhwBna();
    }

    public Presenter dxcTrN() {
        C54503xKv<Binding, Presenter> c54503xKv = this.AwvSrB;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Presenter) c54503xKv.EZpvd();
    }

    public Binding gGvvIC() {
        C54503xKv<Binding, Presenter> c54503xKv = this.AwvSrB;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Binding) c54503xKv.AEQbTJ();
    }
}
