package o;

/* JADX INFO: renamed from: o.adp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7121adp implements InterfaceC7128adw {
    public final AbstractC7089adJ AEQbTJ;
    public boolean EZpvd;
    public C7081adB OLrzqt;
    public Activity copydefault = new Activity();
    public java.lang.String KWHzl = java.util.Locale.getDefault().toString();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7128adw
    public InterfaceC7128adw KWHzl(java.lang.String str) {
        this.OLrzqt = null;
        this.KWHzl = str;
        return this;
    }

    public C7121adp(AbstractC7089adJ abstractC7089adJ) {
        this.AEQbTJ = abstractC7089adJ;
    }

    @Override // o.InterfaceC7128adw
    public InterfaceC7128adw OLrzqt(boolean z) {
        copydefault().AEQbTJ = z;
        return this;
    }

    @Override // o.InterfaceC7128adw
    public InterfaceC7127adv AEQbTJ() {
        this.EZpvd = true;
        return new C7117adl(this, this.KWHzl, EZpvd(), this.copydefault);
    }

    public final Activity copydefault() {
        if (this.EZpvd) {
            this.copydefault = this.copydefault.copydefault();
            this.EZpvd = false;
        }
        return this.copydefault;
    }

    public C7081adB EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = this.AEQbTJ.OLrzqt(this.KWHzl);
        }
        return this.OLrzqt;
    }

    public C7081adB AEQbTJ(java.lang.String str) {
        return this.AEQbTJ.OLrzqt(str);
    }

    /* JADX INFO: renamed from: o.adp$Activity */
    public static class Activity {
        public boolean KWHzl = true;
        public boolean AEQbTJ = true;
        public byte copydefault = 2;
        public byte OLrzqt = 0;
        public byte EZpvd = 0;

        public Activity copydefault() {
            Activity activity = new Activity();
            activity.KWHzl = this.KWHzl;
            activity.AEQbTJ = this.AEQbTJ;
            activity.copydefault = this.copydefault;
            activity.OLrzqt = this.OLrzqt;
            activity.EZpvd = this.EZpvd;
            return activity;
        }
    }
}
