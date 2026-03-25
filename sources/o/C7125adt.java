package o;

/* JADX INFO: renamed from: o.adt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7125adt implements InterfaceC7082adC {
    public static C7125adt AEQbTJ;
    public AbstractC7089adJ EZpvd;

    public static C7125adt KWHzl() {
        if (AEQbTJ == null) {
            AEQbTJ = new C7125adt(C7088adI.AEQbTJ());
        }
        return AEQbTJ;
    }

    public C7125adt(AbstractC7089adJ abstractC7089adJ) {
        this.EZpvd = abstractC7089adJ;
    }

    @Override // o.InterfaceC7082adC
    public InterfaceC7123adr AEQbTJ() {
        return new C7120ado(this);
    }

    @Override // o.InterfaceC7082adC
    public InterfaceC7128adw EZpvd() {
        return new C7121adp(this.EZpvd);
    }

    public InterfaceC7130ady copydefault() {
        return new C7119adn(this.EZpvd);
    }
}
