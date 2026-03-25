package o;

import QfgSZK.AEQbTJ;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58350yzd {
    private C58350yzd() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> boolean KWHzl(java.lang.Object obj, InterfaceC58229yxO<? super T, ? extends InterfaceC58180ywS> interfaceC58229yxO, InterfaceC58179ywR interfaceC58179ywR) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AEQbTJ aEQbTJ = (java.lang.Object) ((Callable) obj).call();
            InterfaceC58180ywS interfaceC58180ywS = aEQbTJ != null ? (InterfaceC58180ywS) C58297yyd.AEQbTJ(interfaceC58229yxO.apply(aEQbTJ), "The mapper returned a null CompletableSource") : null;
            if (interfaceC58180ywS == null) {
                EmptyDisposable.complete(interfaceC58179ywR);
            } else {
                interfaceC58180ywS.copydefault(interfaceC58179ywR);
            }
            return true;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58179ywR);
            return true;
        }
    }

    public static <T, R> boolean EZpvd(java.lang.Object obj, InterfaceC58229yxO<? super T, ? extends InterfaceC58246yxf<? extends R>> interfaceC58229yxO, InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AEQbTJ aEQbTJ = (java.lang.Object) ((Callable) obj).call();
            InterfaceC58246yxf interfaceC58246yxf = aEQbTJ != null ? (InterfaceC58246yxf) C58297yyd.AEQbTJ(interfaceC58229yxO.apply(aEQbTJ), "The mapper returned a null MaybeSource") : null;
            if (interfaceC58246yxf == null) {
                EmptyDisposable.complete(interfaceC58256yxp);
            } else {
                interfaceC58246yxf.OLrzqt(MaybeToObservable.AEQbTJ(interfaceC58256yxp));
            }
            return true;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
            return true;
        }
    }

    public static <T, R> boolean copydefault(java.lang.Object obj, InterfaceC58229yxO<? super T, ? extends InterfaceC58261yxu<? extends R>> interfaceC58229yxO, InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AEQbTJ aEQbTJ = (java.lang.Object) ((Callable) obj).call();
            InterfaceC58261yxu interfaceC58261yxu = aEQbTJ != null ? (InterfaceC58261yxu) C58297yyd.AEQbTJ(interfaceC58229yxO.apply(aEQbTJ), "The mapper returned a null SingleSource") : null;
            if (interfaceC58261yxu == null) {
                EmptyDisposable.complete(interfaceC58256yxp);
            } else {
                interfaceC58261yxu.copydefault(SingleToObservable.AEQbTJ(interfaceC58256yxp));
            }
            return true;
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
            return true;
        }
    }
}
