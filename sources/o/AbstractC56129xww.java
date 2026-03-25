package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC56129xww<T> extends AbstractC32998moE implements CoroutineScope {
    public android.view.View OBJEWx;
    public AppCompatActivity QSBOWP;
    public final /* synthetic */ CoroutineScope QkdxfA = CoroutineScopeKt.MainScope();
    public C56132xwz RKDWNf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OBJEWx = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C56132xwz c56132xwz) {
        Intrinsics.checkNotNullParameter(c56132xwz, "");
        this.RKDWNf = c56132xwz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatActivity RcXXUw() {
        return this.QSBOWP;
    }

    public void bt_() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.QkdxfA.getCoroutineContext();
    }

    public final C56132xwz finit() {
        C56132xwz c56132xwz = this.RKDWNf;
        if (c56132xwz != null) {
            return c56132xwz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View djSkpj() {
        android.view.View view = this.OBJEWx;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity appCompatActivity = this.QSBOWP;
        Intrinsics.copydefault(appCompatActivity);
        EZpvd((C56132xwz) OLrzqt(appCompatActivity).get(C56132xwz.class));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.QSBOWP = (AppCompatActivity) context;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        bt_();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw(view);
    }

    public static /* synthetic */ ViewModelProvider getFragmentViewModelProvider$default(AbstractC56129xww abstractC56129xww, androidx.fragment.app.Fragment fragment, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFragmentViewModelProvider");
        }
        androidx.fragment.app.Fragment fragment2 = fragment;
        if ((i & 1) != 0) {
            fragment2 = abstractC56129xww;
        }
        return abstractC56129xww.copydefault(fragment2);
    }

    public final ViewModelProvider copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return new ViewModelProvider(fragment, defaultViewModelProviderFactory);
    }

    public final ViewModelProvider OLrzqt(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivity.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return new ViewModelProvider(appCompatActivity, defaultViewModelProviderFactory);
    }

    public final android.view.View fZBcTu() {
        return djSkpj();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }
}
