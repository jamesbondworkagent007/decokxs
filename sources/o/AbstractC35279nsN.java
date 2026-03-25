package o;

import androidx.fragment.app.Fragment;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35279nsN<T extends androidx.fragment.app.Fragment> {
    public final SharedFlow<android.os.Bundle> AEQbTJ;
    public MutableSharedFlow<android.os.Bundle> KWHzl;

    public abstract T EZpvd(@NotNull android.os.Bundle bundle);

    public void OLrzqt(T t) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<android.os.Bundle> copydefault() {
        return this.AEQbTJ;
    }

    public AbstractC35279nsN() {
        MutableSharedFlow<android.os.Bundle> mutableSharedFlowOLrzqt = C35286nsU.OLrzqt(null);
        this.KWHzl = mutableSharedFlowOLrzqt;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowOLrzqt);
    }

    public final android.os.Bundle KWHzl() {
        return (android.os.Bundle) CollectionsKt___CollectionsKt.firstOrNull(this.KWHzl.getReplayCache());
    }

    public T OLrzqt(@NotNull android.os.Bundle bundle, T t) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return (T) EZpvd(bundle);
    }

    public final T EZpvd(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment fragmentOLrzqt;
        if (fragment == null) {
            fragment = null;
        }
        android.os.Bundle bundleKWHzl = KWHzl();
        if (bundleKWHzl == null) {
            return null;
        }
        if (fragment == null) {
            fragmentOLrzqt = EZpvd(bundleKWHzl);
        } else {
            fragmentOLrzqt = OLrzqt(bundleKWHzl, fragment);
        }
        return (T) fragmentOLrzqt;
    }

    public final void copydefault(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            fragment = null;
        }
        if (fragment == null) {
            return;
        }
        OLrzqt(fragment);
    }
}
