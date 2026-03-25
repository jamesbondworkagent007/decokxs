package o;

import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yBA<T> extends AbstractC58247yxg<T> {
    public abstract void OLrzqt(InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yBA<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final yBA<T> copydefault() {
        return this instanceof InterfaceC56300yAg ? yBG.copydefault(new ObservablePublishAlt(((InterfaceC56300yAg) this).OLrzqt())) : this;
    }

    public AbstractC58247yxg<T> KWHzl() {
        return yBG.EZpvd(new ObservableRefCount(copydefault()));
    }
}
