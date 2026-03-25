package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56830yTx extends yOX {
    public final InterfaceC56843yUj DbNXlk;
    public final C56794ySo djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56704yPf
    public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56830yTx(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56843yUj interfaceC56843yUj, int i, @NotNull InterfaceC56665yNu interfaceC56665yNu) {
        super(c56794ySo.EZpvd(), interfaceC56665yNu, new C56792ySm(c56794ySo, interfaceC56843yUj, false, 4, null), interfaceC56843yUj.fIwbmz(), Variance.INVARIANT, false, i, InterfaceC56686yOo.copydefault, c56794ySo.copydefault().iwGUEr());
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56843yUj, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        this.djBIcL = c56794ySo;
        this.DbNXlk = interfaceC56843yUj;
    }

    @Override // o.AbstractC56704yPf
    public java.util.List<AbstractC59233zdF> AkhnZx() {
        return fIwbmz();
    }

    public final java.util.List<AbstractC59233zdF> fIwbmz() {
        java.util.Collection<yTU> collectionOLrzqt = this.DbNXlk.OLrzqt();
        if (collectionOLrzqt.isEmpty()) {
            AbstractC59242zdO abstractC59242zdOAhwBna = this.djBIcL.AEQbTJ().AEQbTJ().AhwBna();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAhwBna, "");
            AbstractC59242zdO abstractC59242zdOIwGUEr = this.djBIcL.AEQbTJ().AEQbTJ().iwGUEr();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIwGUEr, "");
            return C56402yEa.EZpvd(C59231zdD.copydefault(abstractC59242zdOAhwBna, abstractC59242zdOIwGUEr));
        }
        java.util.Collection<yTU> collection = collectionOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.djBIcL.AYXKKw().EZpvd((yTU) it.next(), C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // o.AbstractC56704yPf
    public java.util.List<AbstractC59233zdF> copydefault(@NotNull java.util.List<? extends AbstractC59233zdF> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.djBIcL.copydefault().fIwbmz().EZpvd(this, list, this.djBIcL);
    }
}
