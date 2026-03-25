package o;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o.C32956mnP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C32956mnP {
    public LifecycleOwner AEQbTJ;
    public final GenericLifecycleObserver OLrzqt = new GenericLifecycleObserver() { // from class: com.okinc.core.arch.lifecycle.LifecycleAttacher$$ExternalSyntheticLambda0
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            C32956mnP.AEQbTJ(this.AEQbTJ, lifecycleOwner, event);
        }
    };

    public static final void AEQbTJ(C32956mnP c32956mnP, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        c32956mnP.OLrzqt(lifecycleOwner, event);
    }

    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        Objects.toString(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            copydefault();
        }
    }

    public final void copydefault() {
        LifecycleOwner lifecycleOwner = this.AEQbTJ;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this.OLrzqt);
            this.AEQbTJ = null;
        }
    }
}
