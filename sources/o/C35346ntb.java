package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.task.BaseTaskHandler$dispatchOnCreate$1;
import com.okinc.im.config.task.BaseTaskHandler$dispatchOnStart$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C35346ntb {
    public InterfaceC35289nsX AEQbTJ;
    public Function0<? extends androidx.fragment.app.Fragment> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<? extends androidx.fragment.app.Fragment> function0, @NotNull InterfaceC35289nsX interfaceC35289nsX) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(interfaceC35289nsX, "");
        this.copydefault = function0;
        this.AEQbTJ = interfaceC35289nsX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, continuation);
    }

    public void gEmmrt() {
    }

    public void valueOf() {
    }

    public final LifecycleCoroutineScope OLrzqt() {
        Function0<? extends androidx.fragment.app.Fragment> function0 = this.copydefault;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        return LifecycleOwnerKt.getLifecycleScope(function0.invoke());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ntb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC56387yDm viewModel$default(C35346ntb c35346ntb, InterfaceC56551yJo interfaceC56551yJo, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewModel");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        return c35346ntb.KWHzl(interfaceC56551yJo, function0, function02);
    }

    public final <T extends ViewModel> InterfaceC56387yDm<T> KWHzl(@NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, final Function0<? extends CreationExtras> function0, final Function0<? extends ViewModelProvider.Factory> function02) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return C56392yDr.copydefault(new Function0() { // from class: o.ntd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35346ntb.KWHzl(this.KWHzl, function02, function0, interfaceC56551yJo);
            }
        });
    }

    public static final ViewModel KWHzl(C35346ntb c35346ntb, Function0 function0, Function0 function02, InterfaceC56551yJo interfaceC56551yJo) {
        Function0<? extends androidx.fragment.app.Fragment> function03 = c35346ntb.copydefault;
        if (function03 == null) {
            Intrinsics.gEmmrt("");
            function03 = null;
        }
        final androidx.fragment.app.Fragment fragmentInvoke = function03.invoke();
        if (function0 == null) {
            function0 = new Function0() { // from class: o.nta
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35346ntb.KWHzl(fragmentInvoke);
                }
            };
        }
        if (function02 == null) {
            function02 = new Function0() { // from class: o.ntc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35346ntb.copydefault(fragmentInvoke);
                }
            };
        }
        return (ViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragmentInvoke, interfaceC56551yJo, new Function0() { // from class: o.ntf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35346ntb.djBIcL(fragmentInvoke);
            }
        }, function02, function0).getValue();
    }

    public static final ViewModelProvider.Factory KWHzl(androidx.fragment.app.Fragment fragment) {
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return defaultViewModelProviderFactory;
    }

    public static final CreationExtras copydefault(androidx.fragment.app.Fragment fragment) {
        CreationExtras defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        return defaultViewModelCreationExtras;
    }

    public static final ViewModelStore djBIcL(androidx.fragment.app.Fragment fragment) {
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        return viewModelStore;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(OLrzqt(), null, null, new BaseTaskHandler$dispatchOnCreate$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(OLrzqt(), null, null, new BaseTaskHandler$dispatchOnStart$1(this, null), 3, null);
    }

    public final void EZpvd() {
        gEmmrt();
    }

    public final void AEQbTJ() {
        valueOf();
    }

    public static /* synthetic */ java.lang.Object EZpvd(C35346ntb c35346ntb, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(C35346ntb c35346ntb, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
