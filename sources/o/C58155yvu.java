package o;

import io.reactivex.BackpressureStrategy;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58155yvu<T> implements InterfaceC58252yxl<T, T>, InterfaceC58241yxa<T, T>, InterfaceC58262yxv<T, T> {
    public final AbstractC58247yxg<?> AEQbTJ;

    public C58155yvu(AbstractC58247yxg<?> abstractC58247yxg) {
        C58158yvx.AEQbTJ(abstractC58247yxg, "observable == null");
        this.AEQbTJ = abstractC58247yxg;
    }

    @Override // o.InterfaceC58252yxl
    public InterfaceC58255yxo<T> AEQbTJ(AbstractC58247yxg<T> abstractC58247yxg) {
        return abstractC58247yxg.takeUntil(this.AEQbTJ);
    }

    @Override // o.InterfaceC58241yxa
    public InterfaceC60096zvd<T> copydefault(AbstractC58185ywX<T> abstractC58185ywX) {
        return abstractC58185ywX.AhwBna(this.AEQbTJ.toFlowable(BackpressureStrategy.LATEST));
    }

    @Override // o.InterfaceC58262yxv
    public InterfaceC58261yxu<T> copydefault(AbstractC58260yxt<T> abstractC58260yxt) {
        return abstractC58260yxt.EZpvd((InterfaceC58261yxu) this.AEQbTJ.firstOrError());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C58155yvu.class != obj.getClass()) {
            return false;
        }
        return this.AEQbTJ.equals(((C58155yvu) obj).AEQbTJ);
    }

    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public java.lang.String toString() {
        return "LifecycleTransformer{observable=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
    }
}
