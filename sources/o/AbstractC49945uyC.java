package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49945uyC<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC49393unh {
    public C54503xKv<Binding, Presenter> EZpvd;

    public abstract int AEQbTJ();

    public boolean AkhnZx() {
        return false;
    }

    public int KWHzl() {
        return 0;
    }

    public boolean fetchVPNInfo() {
        return false;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C54503xKv<Binding, Presenter> c54503xKv = new C54503xKv<>(isConnected(), KWHzl());
        this.EZpvd = c54503xKv;
        c54503xKv.OLrzqt(this, DbNXlk());
    }

    private final Presenter isConnected() {
        ViewModelProvider viewModelProviderKWHzl;
        if (fetchVPNInfo()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            viewModelProviderKWHzl = KWHzl((AppCompatActivity) fragmentActivityRequireActivity);
        } else if (AkhnZx() && getParentFragment() != null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment);
            viewModelProviderKWHzl = KWHzl(parentFragment);
        } else {
            viewModelProviderKWHzl = KWHzl(this);
        }
        return (Presenter) viewModelProviderKWHzl.get(valueOf());
    }

    public static /* synthetic */ ViewModelProvider getFragmentViewModelProvider$default(AbstractC49945uyC abstractC49945uyC, androidx.fragment.app.Fragment fragment, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFragmentViewModelProvider");
        }
        androidx.fragment.app.Fragment fragment2 = fragment;
        if ((i & 1) != 0) {
            fragment2 = abstractC49945uyC;
        }
        return abstractC49945uyC.KWHzl(fragment2);
    }

    private final ViewModelProvider KWHzl(androidx.fragment.app.Fragment fragment) {
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return new ViewModelProvider(fragment, defaultViewModelProviderFactory);
    }

    private final ViewModelProvider KWHzl(AppCompatActivity appCompatActivity) {
        ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivity.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return new ViewModelProvider(appCompatActivity, defaultViewModelProviderFactory);
    }

    public java.lang.Class<Presenter> valueOf() {
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

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54503xKv<Binding, Presenter> c54503xKv = this.EZpvd;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        c54503xKv.AEQbTJ(this, getCustomLayoutInflater(), constraintLayout, AEQbTJ(), true);
    }

    public final Presenter OLrzqt() {
        C54503xKv<Binding, Presenter> c54503xKv = this.EZpvd;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Presenter) c54503xKv.EZpvd();
    }

    public java.util.List<AbsPresenter> DbNXlk() {
        return yDY.AhwBna();
    }

    public Binding values() {
        C54503xKv<Binding, Presenter> c54503xKv = this.EZpvd;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Binding) c54503xKv.AEQbTJ();
    }

    public static /* synthetic */ void showLoading$default(AbstractC49945uyC abstractC49945uyC, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i & 1) != 0) {
            j = 500;
        }
        abstractC49945uyC.EZpvd(j);
    }

    public final void EZpvd(long j) {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            ((AbstractActivityC33041mov) fragmentActivityRequireActivity).showLoading(j);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void EZpvd() {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            ((AbstractActivityC33041mov) fragmentActivityRequireActivity).dismissLoading();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
