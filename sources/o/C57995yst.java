package o;

import o.InterfaceC57909yrM;

/* JADX INFO: renamed from: o.yst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57995yst extends C57983ysh implements InterfaceC57912yrP {
    public static long AEQbTJ;
    public static final C57995yst EZpvd = new C57995yst();
    public static final Application OLrzqt;
    public static int gEmmrt;

    private C57995yst() {
        super(false, 1, null);
    }

    static {
        long j = C57994yss.OLrzqt;
        AEQbTJ = j;
        gEmmrt = 20;
        OLrzqt = new Application(j, 20);
        C57993ysr.AEQbTJ.KWHzl(new InterfaceC57909yrM() { // from class: o.yst.2
            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
            }

            @Override // o.InterfaceC57916yrT
            public void KWHzl() {
                C57995yst.OLrzqt.valueOf();
            }

            @Override // o.InterfaceC57916yrT
            public void OLrzqt() {
                C57995yst.OLrzqt.AhwBna();
                C57995yst.EZpvd.djBIcL();
            }
        });
    }

    /* JADX INFO: renamed from: o.yst$Application */
    public static final class Application extends AbstractC57957ysH {
        public Application(long j, int i) {
            super("Matrix.Staged", j, i);
        }

        @Override // o.AbstractC57957ysH
        public boolean KWHzl() {
            if (C57993ysr.AEQbTJ.AEQbTJ()) {
                boolean zAhwBna = C58001ysz.AhwBna();
                C58013ytK.EZpvd("Matrix.Staged", "hasRunningAppTask? " + zAhwBna, new java.lang.Object[0]);
                if (zAhwBna || C57992ysq.AEQbTJ.AEQbTJ()) {
                    C58013ytK.EZpvd("Matrix.Staged", "turn ON", new java.lang.Object[0]);
                    C57995yst.EZpvd.valueOf();
                    return true;
                }
            }
            C58013ytK.EZpvd("Matrix.Staged", "turn off", new java.lang.Object[0]);
            C57995yst.EZpvd.djBIcL();
            return false;
        }
    }

    @Override // o.C57983ysh, o.InterfaceC57914yrR
    public boolean AEQbTJ() {
        if (!C57993ysr.AEQbTJ.AEQbTJ()) {
            djBIcL();
            return false;
        }
        OLrzqt.copydefault();
        return super.AEQbTJ();
    }
}
