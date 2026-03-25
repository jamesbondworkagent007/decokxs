package o;

import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.ywc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58190ywc implements ViewModelProvider.Factory {
    public static final CreationExtras.Key<Function1<java.lang.Object, ViewModel>> KWHzl = new CreationExtras.Key<Function1<java.lang.Object, ViewModel>>() { // from class: o.ywc.4
    };
    public final ViewModelProvider.Factory AEQbTJ;
    public final ViewModelProvider.Factory OLrzqt;
    public final java.util.Map<java.lang.Class<?>, java.lang.Boolean> copydefault;

    /* JADX INFO: renamed from: o.ywc$ActionBar */
    public interface ActionBar {
        java.util.Map<java.lang.Class<?>, yCP<ViewModel>> DztXDE();

        java.util.Map<java.lang.Class<?>, java.lang.Object> OEgNct();
    }

    public C58190ywc(@androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, @androidx.annotation.NonNull ViewModelProvider.Factory factory, @androidx.annotation.NonNull final InterfaceC58128yvT interfaceC58128yvT) {
        this.copydefault = map;
        this.OLrzqt = factory;
        this.AEQbTJ = new ViewModelProvider.Factory() { // from class: o.ywc.3
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull CreationExtras creationExtras) {
                final C58192ywe c58192ywe = new C58192ywe();
                T t = (T) KWHzl(interfaceC58128yvT.copydefault(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).KWHzl(c58192ywe).KWHzl(), cls, creationExtras);
                t.addCloseable(new java.io.Closeable() { // from class: o.ywb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        c58192ywe.AEQbTJ();
                    }
                });
                return t;
            }

            public final <T extends ViewModel> T KWHzl(@androidx.annotation.NonNull InterfaceC58120yvL interfaceC58120yvL, @androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull CreationExtras creationExtras) {
                yCP<ViewModel> ycp = ((ActionBar) C58113yvE.copydefault(interfaceC58120yvL, ActionBar.class)).DztXDE().get(cls);
                Function1 function1 = (Function1) creationExtras.get(C58190ywc.KWHzl);
                java.lang.Object obj = ((ActionBar) C58113yvE.copydefault(interfaceC58120yvL, ActionBar.class)).OEgNct().get(cls);
                if (obj == null) {
                    if (function1 != null) {
                        throw new java.lang.IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (ycp == null) {
                        throw new java.lang.IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    return (T) ycp.get();
                }
                if (ycp != null) {
                    throw new java.lang.AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (function1 == null) {
                    throw new java.lang.IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                return (T) function1.invoke(obj);
            }
        };
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull CreationExtras creationExtras) {
        if (this.copydefault.containsKey(cls)) {
            return (T) this.AEQbTJ.create(cls, creationExtras);
        }
        return (T) this.OLrzqt.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@androidx.annotation.NonNull java.lang.Class<T> cls) {
        if (this.copydefault.containsKey(cls)) {
            return (T) this.AEQbTJ.create(cls);
        }
        return (T) this.OLrzqt.create(cls);
    }
}
