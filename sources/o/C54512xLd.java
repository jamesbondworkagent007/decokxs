package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import o.C54512xLd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54512xLd<T> extends MutableLiveData<T> {
    public final java.util.HashMap<Observer<? super T>, AtomicBoolean> EZpvd = new java.util.HashMap<>();

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.EZpvd.put(observer, new AtomicBoolean(false));
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.okinc.unify_trade.tool.SingleLiveData$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C54512xLd.KWHzl(this.KWHzl, observer, lifecycleOwner2, event);
            }
        });
        super.observe(lifecycleOwner, new Observer() { // from class: o.xLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C54512xLd.copydefault(this.OLrzqt, observer, obj);
            }
        });
    }

    public static final void KWHzl(C54512xLd c54512xLd, Observer observer, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            c54512xLd.EZpvd.remove(observer);
        }
    }

    public static final void copydefault(C54512xLd c54512xLd, Observer observer, java.lang.Object obj) {
        AtomicBoolean atomicBoolean = c54512xLd.EZpvd.get(observer);
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            return;
        }
        observer.onChanged(obj);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        this.EZpvd.put(observer, new AtomicBoolean(false));
        super.observeForever(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        this.EZpvd.remove(observer);
        super.removeObserver(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObservers(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.EZpvd.clear();
        super.removeObservers(lifecycleOwner);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        for (AtomicBoolean atomicBoolean : this.EZpvd.values()) {
            Intrinsics.checkNotNullExpressionValue(atomicBoolean, "");
            atomicBoolean.set(true);
        }
        super.setValue(t);
    }
}
