package o;

import QfgSZK.AEQbTJ;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58288yyU {
    private C58288yyU() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, R> boolean copydefault(InterfaceC60096zvd<T> interfaceC60096zvd, InterfaceC60097zve<? super R> interfaceC60097zve, InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO) {
        if (!(interfaceC60096zvd instanceof Callable)) {
            return false;
        }
        try {
            AEQbTJ aEQbTJ = (java.lang.Object) ((Callable) interfaceC60096zvd).call();
            if (aEQbTJ == null) {
                EmptySubscription.complete(interfaceC60097zve);
                return true;
            }
            try {
                InterfaceC60096zvd interfaceC60096zvd2 = (InterfaceC60096zvd) C58297yyd.AEQbTJ(interfaceC58229yxO.apply(aEQbTJ), "The mapper returned a null Publisher");
                if (interfaceC60096zvd2 instanceof Callable) {
                    try {
                        java.lang.Object objCall = ((Callable) interfaceC60096zvd2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC60097zve);
                            return true;
                        }
                        interfaceC60097zve.onSubscribe(new ScalarSubscription(interfaceC60097zve, objCall));
                    } catch (java.lang.Throwable th) {
                        C58218yxD.AEQbTJ(th);
                        EmptySubscription.error(th, interfaceC60097zve);
                        return true;
                    }
                } else {
                    interfaceC60096zvd2.subscribe(interfaceC60097zve);
                }
                return true;
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                EmptySubscription.error(th2, interfaceC60097zve);
                return true;
            }
        } catch (java.lang.Throwable th3) {
            C58218yxD.AEQbTJ(th3);
            EmptySubscription.error(th3, interfaceC60097zve);
            return true;
        }
    }

    public static <T, U> AbstractC58185ywX<U> AEQbTJ(T t, InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends U>> interfaceC58229yxO) {
        return yBG.AEQbTJ(new StateListAnimator(t, interfaceC58229yxO));
    }

    /* JADX INFO: renamed from: o.yyU$StateListAnimator */
    public static final class StateListAnimator<T, R> extends AbstractC58185ywX<R> {
        public final T EZpvd;
        public final InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> copydefault;

        public StateListAnimator(T t, InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO) {
            this.EZpvd = t;
            this.copydefault = interfaceC58229yxO;
        }

        @Override // o.AbstractC58185ywX
        public void AEQbTJ(InterfaceC60097zve<? super R> interfaceC60097zve) {
            try {
                InterfaceC60096zvd interfaceC60096zvd = (InterfaceC60096zvd) C58297yyd.AEQbTJ(this.copydefault.apply(this.EZpvd), "The mapper returned a null Publisher");
                if (interfaceC60096zvd instanceof Callable) {
                    try {
                        java.lang.Object objCall = ((Callable) interfaceC60096zvd).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC60097zve);
                            return;
                        } else {
                            interfaceC60097zve.onSubscribe(new ScalarSubscription(interfaceC60097zve, objCall));
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        C58218yxD.AEQbTJ(th);
                        EmptySubscription.error(th, interfaceC60097zve);
                        return;
                    }
                }
                interfaceC60096zvd.subscribe(interfaceC60097zve);
            } catch (java.lang.Throwable th2) {
                EmptySubscription.error(th2, interfaceC60097zve);
            }
        }
    }
}
