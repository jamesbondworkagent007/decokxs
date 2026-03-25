package o;

/* JADX INFO: renamed from: o.zls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59696zls extends AbstractC59774znQ {
    public final InterfaceC59779znV AEQbTJ;
    public final InterfaceC59779znV EZpvd;
    public final InterfaceC59779znV KWHzl;
    public final InterfaceC59779znV copydefault;

    @Override // o.InterfaceC59779znV
    public InterfaceC59779znV copy() {
        return this;
    }

    public C59696zls(InterfaceC59779znV interfaceC59779znV, InterfaceC59779znV interfaceC59779znV2, InterfaceC59779znV interfaceC59779znV3, InterfaceC59779znV interfaceC59779znV4) {
        this.copydefault = interfaceC59779znV;
        this.KWHzl = interfaceC59779znV2;
        this.EZpvd = interfaceC59779znV3;
        this.AEQbTJ = interfaceC59779znV4;
    }

    @Override // o.InterfaceC59779znV
    public java.lang.Object getParameter(java.lang.String str) {
        InterfaceC59779znV interfaceC59779znV;
        InterfaceC59779znV interfaceC59779znV2;
        InterfaceC59779znV interfaceC59779znV3;
        C59851zoo.AEQbTJ(str, "Parameter name");
        InterfaceC59779znV interfaceC59779znV4 = this.AEQbTJ;
        java.lang.Object parameter = interfaceC59779znV4 != null ? interfaceC59779znV4.getParameter(str) : null;
        if (parameter == null && (interfaceC59779znV3 = this.EZpvd) != null) {
            parameter = interfaceC59779znV3.getParameter(str);
        }
        if (parameter == null && (interfaceC59779znV2 = this.KWHzl) != null) {
            parameter = interfaceC59779znV2.getParameter(str);
        }
        return (parameter != null || (interfaceC59779znV = this.copydefault) == null) ? parameter : interfaceC59779znV.getParameter(str);
    }

    @Override // o.InterfaceC59779znV
    public InterfaceC59779znV setParameter(java.lang.String str, java.lang.Object obj) throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
