package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23614iCx<T> extends MutableLiveData<T> {
    public final AtomicBoolean OLrzqt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o.iCx$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(lifecycleOwner, new Activity(new Function1() { // from class: o.iCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23614iCx.copydefault(this.AEQbTJ, observer, obj);
            }
        }));
    }

    public static final Unit copydefault(C23614iCx c23614iCx, Observer observer, java.lang.Object obj) {
        if (c23614iCx.OLrzqt.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        super.observeForever(new Activity(new Function1() { // from class: o.iCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23614iCx.OLrzqt(this.copydefault, observer, obj);
            }
        }));
    }

    public static final Unit OLrzqt(C23614iCx c23614iCx, Observer observer, java.lang.Object obj) {
        if (c23614iCx.OLrzqt.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.OLrzqt.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        this.OLrzqt.set(true);
        super.postValue(t);
    }
}
