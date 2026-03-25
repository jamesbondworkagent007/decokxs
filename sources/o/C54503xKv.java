package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54503xKv<Binding extends ViewDataBinding, Presenter extends AbsPresenter> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Binding KWHzl;
    public int OLrzqt;
    public Presenter copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Presenter EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt != 0;
    }

    public C54503xKv(@NotNull Presenter presenter, int i) {
        Intrinsics.checkNotNullParameter(presenter, "");
        this.copydefault = presenter;
        this.OLrzqt = i;
    }

    /* JADX INFO: renamed from: o.xKv$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull AppCompatActivity appCompatActivity, int i) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        this.KWHzl = (Binding) DataBindingUtil.setContentView(appCompatActivity, i);
        Binding binding = null;
        if (KWHzl()) {
            Binding binding2 = this.KWHzl;
            if (binding2 == null) {
                Intrinsics.gEmmrt("");
                binding2 = null;
            }
            binding2.setVariable(this.OLrzqt, this.copydefault);
        }
        Binding binding3 = this.KWHzl;
        if (binding3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            binding = binding3;
        }
        binding.setLifecycleOwner(appCompatActivity);
        appCompatActivity.getLifecycle().addObserver(this.copydefault);
    }

    public static /* synthetic */ android.view.View doBinding$default(C54503xKv c54503xKv, LifecycleOwner lifecycleOwner, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        return c54503xKv.AEQbTJ(lifecycleOwner, layoutInflater, viewGroup, i, z);
    }

    public final android.view.View AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, int i, boolean z) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = (Binding) DataBindingUtil.inflate(layoutInflater, i, viewGroup, z);
        Binding binding = null;
        if (KWHzl()) {
            Binding binding2 = this.KWHzl;
            if (binding2 == null) {
                Intrinsics.gEmmrt("");
                binding2 = null;
            }
            binding2.setVariable(this.OLrzqt, this.copydefault);
        }
        Binding binding3 = this.KWHzl;
        if (binding3 == null) {
            Intrinsics.gEmmrt("");
            binding3 = null;
        }
        binding3.setLifecycleOwner(lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(this.copydefault);
        Binding binding4 = this.KWHzl;
        if (binding4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            binding = binding4;
        }
        android.view.View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final Binding AEQbTJ() {
        Binding binding = this.KWHzl;
        if (binding != null) {
            return binding;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void copydefault(@NotNull AppCompatActivity appCompatActivity, @NotNull java.util.List<? extends AbsPresenter> list) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            appCompatActivity.getLifecycle().addObserver((AbsPresenter) it.next());
        }
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends AbsPresenter> list) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            fragment.getLifecycle().addObserver((AbsPresenter) it.next());
        }
    }
}
