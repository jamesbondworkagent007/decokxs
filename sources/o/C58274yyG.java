package o;

import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;

/* JADX INFO: renamed from: o.yyG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58274yyG<T, R> extends AbstractC58185ywX<R> {
    public final int EZpvd;
    public final ErrorMode KWHzl;
    public final InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> OLrzqt;
    public final InterfaceC60096zvd<T> copydefault;

    public C58274yyG(InterfaceC60096zvd<T> interfaceC60096zvd, InterfaceC58229yxO<? super T, ? extends InterfaceC60096zvd<? extends R>> interfaceC58229yxO, int i, ErrorMode errorMode) {
        this.copydefault = interfaceC60096zvd;
        this.OLrzqt = interfaceC58229yxO;
        this.EZpvd = i;
        this.KWHzl = errorMode;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super R> interfaceC60097zve) {
        if (C58288yyU.copydefault(this.copydefault, interfaceC60097zve, this.OLrzqt)) {
            return;
        }
        this.copydefault.subscribe(FlowableConcatMap.copydefault(interfaceC60097zve, this.OLrzqt, this.EZpvd, this.KWHzl));
    }
}
