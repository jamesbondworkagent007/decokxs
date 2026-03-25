package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.lang.reflect.ParameterizedType;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractActivityC54499xKr<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractActivityC33041mov implements CoroutineScope {
    public C54503xKv<Binding, Presenter> getFieldNames;
    public final /* synthetic */ CoroutineScope uzCIH = CoroutineScopeKt.MainScope();

    public abstract int AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.uzCIH.getCoroutineContext();
    }

    public int zuBGHE() {
        return 0;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C54503xKv<Binding, Presenter> c54503xKv = new C54503xKv<>(OLrzqt(), zuBGHE());
        this.getFieldNames = c54503xKv;
        c54503xKv.copydefault(this, AYXKKw());
        C54503xKv<Binding, Presenter> c54503xKv2 = this.getFieldNames;
        if (c54503xKv2 == null) {
            Intrinsics.gEmmrt("");
            c54503xKv2 = null;
        }
        c54503xKv2.copydefault(this, AwvSrB());
    }

    private final Presenter OLrzqt() {
        return (Presenter) AEQbTJ(this).get(KWHzl());
    }

    public final ViewModelProvider AEQbTJ(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivity.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return new ViewModelProvider(appCompatActivity, defaultViewModelProviderFactory);
    }

    private final java.lang.Class<Presenter> KWHzl() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        Intrinsics.copydefault(genericSuperclass, "");
        java.lang.reflect.Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
        Intrinsics.copydefault(type, "");
        if (type instanceof ParameterizedType) {
            java.lang.reflect.Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.copydefault(rawType, "");
            return (java.lang.Class) rawType;
        }
        return (java.lang.Class) type;
    }

    public java.util.List<AbsPresenter> AwvSrB() {
        return yDY.AhwBna();
    }

    public final Presenter gHZMYf() {
        C54503xKv<Binding, Presenter> c54503xKv = this.getFieldNames;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Presenter) c54503xKv.EZpvd();
    }

    public final Binding sSMYrx() {
        C54503xKv<Binding, Presenter> c54503xKv = this.getFieldNames;
        if (c54503xKv == null) {
            Intrinsics.gEmmrt("");
            c54503xKv = null;
        }
        return (Binding) c54503xKv.AEQbTJ();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
