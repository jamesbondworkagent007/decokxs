package com.okinc.unify_trade.refactor.presenter;

import androidx.core.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56111xwe;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.xKH;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsPresenter extends xKH implements LifecycleObserver {
    public final C56111xwe<Pair<String, Boolean>> RcXXUw;
    public final C56111xwe<Pair<String, Exception>> djSkpj;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public boolean clearOnDestroy() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<String, Exception>> getAggregateErrorLiveData() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<String, Boolean>> getAggregateLoadingLiveData() {
        return this.RcXXUw;
    }

    public abstract List<xKK> getUseCaseList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.RcXXUw = new C56111xwe<>();
        this.djSkpj = new C56111xwe<>();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        for (final xKK xkk : getUseCaseList()) {
            xkk.AkhnZx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.xKA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbsPresenter.onCreate$lambda$0(this.EZpvd, xkk, (java.lang.Boolean) obj);
                }
            }));
            xkk.AhwBna().observe(lifecycleOwner, new Application(new Function1() { // from class: o.xKB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbsPresenter.onCreate$lambda$2(this.KWHzl, xkk, (java.lang.Exception) obj);
                }
            }));
        }
    }

    public static final Unit onCreate$lambda$0(AbsPresenter absPresenter, xKK xkk, Boolean bool) {
        absPresenter.RcXXUw.setValue(new Pair<>(xkk.bB_(), bool));
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$2(AbsPresenter absPresenter, xKK xkk, Exception exc) {
        absPresenter.djSkpj.setValue(new Pair<>(xkk.bB_(), exc));
        HashMap map = new HashMap();
        map.put("user_case_info", xkk.bB_());
        map.put("error_info", String.valueOf(exc.getMessage()));
        map.put("request_params", xkk.valueOf().toString());
        pUU.OLrzqt("abs_presenter_request_error_key", map);
        return Unit.INSTANCE;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (clearOnDestroy()) {
            return;
        }
        onCleared();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (clearOnDestroy()) {
            removeAllObservers(lifecycleOwner);
            onCleared();
        }
    }

    public final void removeAllObservers(LifecycleOwner lifecycleOwner) {
        for (xKK xkk : getUseCaseList()) {
            xkk.AkhnZx().removeObservers(lifecycleOwner);
            xkk.AhwBna().removeObservers(lifecycleOwner);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        disposeAll();
    }

    public final void dispose(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (xKK xkk : getUseCaseList()) {
            if (Intrinsics.EZpvd((Object) str, (Object) xkk.bB_())) {
                xkk.AYXKKw();
                return;
            }
        }
    }

    private final void disposeAll() {
        Iterator<xKK> it = getUseCaseList().iterator();
        while (it.hasNext()) {
            it.next().AYXKKw();
        }
    }
}
