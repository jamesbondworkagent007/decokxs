package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mHA {
    public static final mHA OLrzqt = new mHA();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    private mHA() {
    }

    public final <T> void OLrzqt(@NotNull MutableLiveData<C32989mnw<T>> mutableLiveData, T t) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        mutableLiveData.setValue(new C32989mnw<>(t));
    }

    public final void KWHzl(@NotNull MutableLiveData<C32989mnw<Unit>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        mutableLiveData.setValue(new C32989mnw<>(Unit.INSTANCE));
    }

    public final <T> void AEQbTJ(@NotNull MutableLiveData<C32989mnw<T>> mutableLiveData, T t) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        mutableLiveData.postValue(new C32989mnw<>(t));
    }

    public final <T> void copydefault(@NotNull LiveData<C32989mnw<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        liveData.observe(lifecycleOwner, new Application(new Function1() { // from class: o.mHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mHA.KWHzl(function1, (C32989mnw) obj);
            }
        }));
    }

    public static final Unit KWHzl(Function1 function1, C32989mnw c32989mnw) {
        java.lang.Object objKWHzl = c32989mnw.KWHzl();
        if (objKWHzl != null) {
            function1.invoke(objKWHzl);
        }
        return Unit.INSTANCE;
    }

    public final <T> T AEQbTJ(@NotNull LiveData<C32989mnw<T>> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "");
        C32989mnw<T> value = liveData.getValue();
        if (value != null) {
            return value.OLrzqt();
        }
        return null;
    }
}
