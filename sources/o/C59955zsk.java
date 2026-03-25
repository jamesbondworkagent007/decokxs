package o;

/* JADX INFO: renamed from: o.zsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59955zsk {
    private C59955zsk() {
    }

    public static C59952zsh EZpvd(AbstractC59956zsl abstractC59956zsl, C59946zsb c59946zsb) {
        C59952zsh c59952zsh = new C59952zsh();
        new C59959zso(new Activity(c59946zsb, c59952zsh, abstractC59956zsl)).OLrzqt(c59946zsb);
        return c59952zsh;
    }

    /* JADX INFO: renamed from: o.zsk$Activity */
    public static class Activity implements InterfaceC59958zsn {
        public final AbstractC59956zsl AEQbTJ;
        public final C59952zsh KWHzl;
        public final C59946zsb OLrzqt;

        @Override // o.InterfaceC59958zsn
        public void EZpvd(AbstractC59916zrY abstractC59916zrY, int i) {
        }

        public Activity(C59946zsb c59946zsb, C59952zsh c59952zsh, AbstractC59956zsl abstractC59956zsl) {
            this.OLrzqt = c59946zsb;
            this.KWHzl = c59952zsh;
            this.AEQbTJ = abstractC59956zsl;
        }

        @Override // o.InterfaceC59958zsn
        public void copydefault(AbstractC59916zrY abstractC59916zrY, int i) {
            if (abstractC59916zrY instanceof C59946zsb) {
                C59946zsb c59946zsb = (C59946zsb) abstractC59916zrY;
                if (this.AEQbTJ.copydefault(this.OLrzqt, c59946zsb)) {
                    this.KWHzl.add(c59946zsb);
                }
            }
        }
    }
}
