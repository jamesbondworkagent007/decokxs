package com.okinc.liveness.lca.data;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveEvent<T> {
    public static final int $stable = 8;
    private T value;
    private final AtomicBoolean mPending = new AtomicBoolean(false);
    private final MutableLiveData<T> mData = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getValue() {
        return this.value;
    }

    public final void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        this.mData.observe(lifecycleOwner, new LiveEvent$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.okinc.liveness.lca.data.LiveEvent$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEvent.observe$lambda$0(this.f$0, observer, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$0(LiveEvent liveEvent, Observer observer, Object obj) {
        if (liveEvent.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    public final void removeObserver(@NotNull Observer<T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        this.mData.removeObserver(observer);
    }

    public final void observeForever(@NotNull final Observer<T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        this.mData.observeForever(new LiveEvent$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.okinc.liveness.lca.data.LiveEvent$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEvent.observeForever$lambda$1(this.f$0, observer, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeForever$lambda$1(LiveEvent liveEvent, Observer observer, Object obj) {
        if (liveEvent.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    public final void setValue(T t) {
        if (t != null) {
            this.mPending.set(true);
            this.mData.setValue(t);
        }
        this.value = t;
    }
}
