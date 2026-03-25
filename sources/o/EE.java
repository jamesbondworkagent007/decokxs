package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import o.AbstractC5105Ex;
import o.CO;

/* JADX INFO: loaded from: classes2.dex */
public final class EE {
    public static final InterfaceC5106Ey AEQbTJ() {
        return new EI(new CQ(), null, 2, 0 == true ? 1 : 0);
    }

    public static final void EZpvd(CQ cq, java.lang.Number number) throws java.io.IOException {
        CO.Application.writeUtf8$default(cq, number.toString(), 0, 0, 6, null);
    }

    public static final C5101Et AEQbTJ(EN en) {
        return new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EF(en.copydefault()));
    }

    public static final C5101Et copydefault(C5101Et c5101Et, java.lang.String str) {
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setAEQbTJ) {
            if (!(((InterfaceC5096Eo) obj) instanceof EF)) {
                arrayList.add(obj);
            }
        }
        java.util.Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(arrayList);
        setDXXBbs.add(new EF(str));
        return new C5101Et(c5101Et.KWHzl(), (java.util.Set<? extends InterfaceC5096Eo>) setDXXBbs);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        return C5167Hh.KWHzl.AEQbTJ().EZpvd(str);
    }

    public static final java.lang.String OLrzqt(C5101Et c5101Et) {
        java.lang.Object next;
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == EF.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (interfaceC5096Eo != null) {
            return ((EF) interfaceC5096Eo).AEQbTJ();
        }
        throw new java.lang.IllegalArgumentException(("Expected to find trait " + C56524yIo.AEQbTJ(EF.class) + " in " + c5101Et + " but was not present.").toString());
    }
}
