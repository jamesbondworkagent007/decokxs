package o;

/* JADX INFO: renamed from: o.muh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33345muh extends C33282mtX {
    public final InterfaceC33214msI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C33282mtX
    public InterfaceC33214msI djBIcL() {
        return this.OLrzqt;
    }

    public C33345muh() {
        InterfaceC33214msI interfaceC33214msIKWHzl;
        super("LiteTradePageId", 2, "liteHomeSimpleTradeTabID");
        C33267mtI c33267mtI = C33267mtI.OLrzqt;
        InterfaceC33213msH interfaceC33213msHAEQbTJ = c33267mtI.AEQbTJ("LiteTradePageId");
        if (interfaceC33213msHAEQbTJ == null || (interfaceC33214msIKWHzl = interfaceC33213msHAEQbTJ.KWHzl()) == null) {
            InterfaceC33213msH interfaceC33213msHAEQbTJ2 = c33267mtI.AEQbTJ("LiteBSCPageId");
            interfaceC33214msIKWHzl = interfaceC33213msHAEQbTJ2 != null ? interfaceC33213msHAEQbTJ2.KWHzl() : null;
        }
        this.OLrzqt = interfaceC33214msIKWHzl;
    }
}
