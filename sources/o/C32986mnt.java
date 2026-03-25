package o;

import androidx.lifecycle.ProcessLifecycleOwner;
import com.okinc.core.appdelegate.ProcessLifecycleMonitor$appLifecycleObserver$2$1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32986mnt {
    public static final C32986mnt EZpvd = new C32986mnt();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mnu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32986mnt.OLrzqt();
        }
    });
    public static final AtomicBoolean copydefault = new AtomicBoolean(true);
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mnr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32986mnt.AEQbTJ();
        }
    });
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.mnt$Application */
    public interface Application {
        void AEQbTJ();

        void OLrzqt();
    }

    private C32986mnt() {
    }

    public final ProcessLifecycleMonitor$appLifecycleObserver$2$1 gEmmrt() {
        return (ProcessLifecycleMonitor$appLifecycleObserver$2$1) AEQbTJ.getValue();
    }

    public static final ProcessLifecycleMonitor$appLifecycleObserver$2$1 OLrzqt() {
        return new ProcessLifecycleMonitor$appLifecycleObserver$2$1();
    }

    public static final CopyOnWriteArrayList AEQbTJ() {
        return new CopyOnWriteArrayList();
    }

    public final CopyOnWriteArrayList<Application> djBIcL() {
        return (CopyOnWriteArrayList) KWHzl.getValue();
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        djBIcL().add(application);
    }

    public final void KWHzl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        djBIcL().remove(application);
    }

    public final void AhwBna() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(gEmmrt());
    }

    public final boolean valueOf() {
        return copydefault.get();
    }

    public final void KWHzl(Function1<? super Application, Unit> function1) {
        for (Application application : djBIcL()) {
            Intrinsics.copydefault(application);
            function1.invoke(application);
        }
    }
}
