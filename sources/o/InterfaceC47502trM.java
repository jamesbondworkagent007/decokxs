package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC47502trM<B extends ViewBinding> {
    void EZpvd(B b);

    B OLrzqt();

    /* JADX INFO: renamed from: o.trM$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static <B extends ViewBinding> void EZpvd(@NotNull InterfaceC47502trM<B> interfaceC47502trM, @NotNull Function1<? super B, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ViewBinding viewBindingOLrzqt = interfaceC47502trM.OLrzqt();
            if (viewBindingOLrzqt != null) {
                function1.invoke(viewBindingOLrzqt);
            }
        }

        public static <B extends ViewBinding> void KWHzl(@NotNull final InterfaceC47502trM<B> interfaceC47502trM, @NotNull B b, @NotNull LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(b, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            interfaceC47502trM.EZpvd(b);
            lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.planet.base.ViewBindingHolder$registerBinding$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                    lifecycleOwner2.getLifecycle().removeObserver(this);
                    interfaceC47502trM.EZpvd(null);
                }
            });
        }
    }
}
