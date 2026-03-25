package o;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58245yxe<T> implements InterfaceC58246yxf<T> {
    public abstract void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb);

    public static <T> AbstractC58245yxe<T> KWHzl(InterfaceC58243yxc<T> interfaceC58243yxc) {
        C58297yyd.AEQbTJ(interfaceC58243yxc, "onSubscribe is null");
        return yBG.copydefault(new MaybeCreate(interfaceC58243yxc));
    }

    public static <T> AbstractC58245yxe<T> AEQbTJ() {
        return yBG.copydefault((AbstractC58245yxe) C58293yyZ.OLrzqt);
    }

    public static <T> AbstractC58245yxe<T> OLrzqt(Callable<? extends T> callable) {
        C58297yyd.AEQbTJ(callable, "callable is null");
        return yBG.copydefault((AbstractC58245yxe) new CallableC58351yze(callable));
    }

    public static <T> AbstractC58245yxe<T> AEQbTJ(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "item is null");
        return yBG.copydefault((AbstractC58245yxe) new C58352yzf(t));
    }

    public final T KWHzl() {
        C58308yyo c58308yyo = new C58308yyo();
        OLrzqt(c58308yyo);
        return (T) c58308yyo.KWHzl();
    }

    public final AbstractC58245yxe<T> EZpvd(InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        C58297yyd.AEQbTJ(interfaceC58239yxY, "predicate is null");
        return yBG.copydefault(new C58348yzb(this, interfaceC58239yxY));
    }

    public final <R> AbstractC58245yxe<R> EZpvd(InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        C58297yyd.AEQbTJ(interfaceC58229yxO, "mapper is null");
        return yBG.copydefault(new C58353yzg(this, interfaceC58229yxO));
    }

    public final InterfaceC58217yxC EZpvd(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2) {
        return KWHzl(interfaceC58227yxM, interfaceC58227yxM2, Functions.AEQbTJ);
    }

    public final InterfaceC58217yxC KWHzl(InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSuccess is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        return (InterfaceC58217yxC) AEQbTJ(new MaybeCallbackObserver(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH));
    }

    @Override // o.InterfaceC58246yxf
    public final void OLrzqt(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        C58297yyd.AEQbTJ(interfaceC58242yxb, "observer is null");
        InterfaceC58242yxb<? super T> interfaceC58242yxbKWHzl = yBG.KWHzl(this, interfaceC58242yxb);
        C58297yyd.AEQbTJ(interfaceC58242yxbKWHzl, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            copydefault(interfaceC58242yxbKWHzl);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <E extends InterfaceC58242yxb<? super T>> E AEQbTJ(E e) {
        OLrzqt(e);
        return e;
    }
}
