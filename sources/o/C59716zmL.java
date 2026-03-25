package o;

/* JADX INFO: renamed from: o.zmL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59716zmL implements InterfaceC59608zkJ, InterfaceC59607zkI {
    public final InterfaceC59605zkG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59607zkI
    public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        return this.OLrzqt;
    }

    public C59716zmL(java.lang.String[] strArr) {
        this.OLrzqt = new C59717zmM(strArr);
    }

    public C59716zmL() {
        this(null);
    }

    @Override // o.InterfaceC59608zkJ
    public InterfaceC59605zkG KWHzl(InterfaceC59779znV interfaceC59779znV) {
        if (interfaceC59779znV != null) {
            java.util.Collection collection = (java.util.Collection) interfaceC59779znV.getParameter("http.protocol.cookie-datepatterns");
            return new C59717zmM(collection != null ? (java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]) : null);
        }
        return new C59717zmM();
    }
}
