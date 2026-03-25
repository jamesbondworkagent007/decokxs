package o;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;

/* JADX INFO: renamed from: o.ywP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58177ywP implements InterfaceC58180ywS {
    public abstract void KWHzl(InterfaceC58179ywR interfaceC58179ywR);

    public static AbstractC58177ywP OLrzqt(InterfaceC58183ywV interfaceC58183ywV) {
        C58297yyd.AEQbTJ(interfaceC58183ywV, "source is null");
        return yBG.copydefault(new CompletableCreate(interfaceC58183ywV));
    }

    public static AbstractC58177ywP EZpvd(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "error is null");
        return yBG.copydefault(new C58269yyB(th));
    }

    public static AbstractC58177ywP KWHzl(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "run is null");
        return yBG.copydefault(new C58268yyA(interfaceC58222yxH));
    }

    public static java.lang.NullPointerException KWHzl(java.lang.Throwable th) {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public final AbstractC58177ywP EZpvd(InterfaceC58222yxH interfaceC58222yxH) {
        InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxMKWHzl2 = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH2 = Functions.AEQbTJ;
        return EZpvd(interfaceC58227yxMKWHzl, interfaceC58227yxMKWHzl2, interfaceC58222yxH, interfaceC58222yxH2, interfaceC58222yxH2, interfaceC58222yxH2);
    }

    public final AbstractC58177ywP AEQbTJ(InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxMKWHzl = Functions.KWHzl();
        InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
        return EZpvd(interfaceC58227yxMKWHzl, interfaceC58227yxM, interfaceC58222yxH, interfaceC58222yxH, interfaceC58222yxH, interfaceC58222yxH);
    }

    public final AbstractC58177ywP EZpvd(InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2, InterfaceC58222yxH interfaceC58222yxH3, InterfaceC58222yxH interfaceC58222yxH4) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onSubscribe is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH2, "onTerminate is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH3, "onAfterTerminate is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH4, "onDispose is null");
        return yBG.copydefault(new C58319yyz(this, interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, interfaceC58222yxH2, interfaceC58222yxH3, interfaceC58222yxH4));
    }

    public final AbstractC58177ywP copydefault(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.copydefault(new CompletableObserveOn(this, abstractC58253yxm));
    }

    public final InterfaceC58217yxC EZpvd() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        copydefault(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @Override // o.InterfaceC58180ywS
    public final void copydefault(InterfaceC58179ywR interfaceC58179ywR) {
        C58297yyd.AEQbTJ(interfaceC58179ywR, "observer is null");
        try {
            InterfaceC58179ywR interfaceC58179ywRCopydefault = yBG.copydefault(this, interfaceC58179ywR);
            C58297yyd.AEQbTJ(interfaceC58179ywRCopydefault, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            KWHzl(interfaceC58179ywRCopydefault);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            yBG.copydefault(th);
            throw KWHzl(th);
        }
    }

    public final InterfaceC58217yxC copydefault(InterfaceC58222yxH interfaceC58222yxH, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(interfaceC58227yxM, interfaceC58222yxH);
        copydefault(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final InterfaceC58217yxC AEQbTJ(InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(interfaceC58222yxH);
        copydefault(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final AbstractC58177ywP AEQbTJ(AbstractC58253yxm abstractC58253yxm) {
        C58297yyd.AEQbTJ(abstractC58253yxm, "scheduler is null");
        return yBG.copydefault(new CompletableSubscribeOn(this, abstractC58253yxm));
    }

    public final <T> AbstractC58260yxt<T> AEQbTJ(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "completionValue is null");
        return yBG.AEQbTJ(new C58270yyC(this, null, t));
    }
}
