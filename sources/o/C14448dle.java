package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14448dle<T> extends MutableLiveData<T> {
    public final AtomicBoolean AEQbTJ = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o.dle$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.dld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14448dle.OLrzqt(this.AEQbTJ, observer, obj);
            }
        }));
    }

    public static final Unit OLrzqt(C14448dle c14448dle, Observer observer, java.lang.Object obj) {
        if (obj == null) {
            return Unit.INSTANCE;
        }
        if (c14448dle.AEQbTJ.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        super.observeForever(new TaskDescription(new Function1() { // from class: o.dlc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14448dle.AEQbTJ(this.AEQbTJ, observer, obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C14448dle c14448dle, Observer observer, java.lang.Object obj) {
        if (obj == null) {
            return Unit.INSTANCE;
        }
        if (c14448dle.AEQbTJ.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.AEQbTJ.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        this.AEQbTJ.set(true);
        super.postValue(t);
    }
}
