package o;

import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xKJ<Resp> extends xKE<Resp> {
    public java.util.ArrayList<java.lang.Object> AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.ArrayList<java.lang.Object> arrayList) {
        this.AYXKKw = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Object> ejfBZ() {
        return this.AYXKKw;
    }

    @Override // o.xKE, o.xKK
    public void OLrzqt(long j) {
        AYXKKw();
        OLrzqt(true);
    }

    @Override // o.xKE, o.InterfaceC54502xKu
    public void AYXKKw() {
        java.util.ArrayList<java.lang.Object> arrayList = this.AYXKKw;
        if (arrayList != null) {
            pUU.KWHzl("WbTaskUseCase", "unbind for " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).getClass().getName() + " ， id is : " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList).hashCode());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
            }
            this.AYXKKw = null;
        }
        super.AYXKKw();
    }
}
