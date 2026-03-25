package o;

/* JADX INFO: renamed from: o.zmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59720zmP implements InterfaceC59608zkJ, InterfaceC59607zkI {
    public final InterfaceC59605zkG EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59607zkI
    public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        return this.EZpvd;
    }

    public C59720zmP(java.lang.String[] strArr, boolean z) {
        this.EZpvd = new C59713zmI(strArr, z);
    }

    public C59720zmP() {
        this(null, false);
    }

    @Override // o.InterfaceC59608zkJ
    public InterfaceC59605zkG KWHzl(InterfaceC59779znV interfaceC59779znV) {
        if (interfaceC59779znV != null) {
            java.util.Collection collection = (java.util.Collection) interfaceC59779znV.getParameter("http.protocol.cookie-datepatterns");
            return new C59713zmI(collection != null ? (java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]) : null, interfaceC59779znV.getBooleanParameter("http.protocol.single-cookie-header", false));
        }
        return new C59713zmI();
    }
}
