package o;

import o.C58013ytK;

/* JADX INFO: renamed from: o.yrO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57911yrO {
    public static volatile C57911yrO KWHzl;
    public final android.app.Application AEQbTJ;
    public final java.util.HashSet<AbstractC58042ytn> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault() {
        return KWHzl != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.app.Application KWHzl() {
        return this.AEQbTJ;
    }

    public C57911yrO(android.app.Application application, InterfaceC58039ytk interfaceC58039ytk, java.util.HashSet<AbstractC58042ytn> hashSet, C57921yrY c57921yrY) {
        this.AEQbTJ = application;
        this.copydefault = hashSet;
        C57922yrZ.AEQbTJ(application, c57921yrY);
        C57968ysS.KWHzl.KWHzl(application, c57921yrY.OLrzqt());
        java.util.Iterator<AbstractC58042ytn> it = hashSet.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(this.AEQbTJ, interfaceC58039ytk);
        }
    }

    public static void copydefault(C58013ytK.ActionBar actionBar) {
        C58013ytK.AEQbTJ(actionBar);
    }

    public static C57911yrO KWHzl(C57911yrO c57911yrO) {
        if (c57911yrO == null) {
            throw new java.lang.RuntimeException("Matrix init, Matrix should not be null.");
        }
        synchronized (C57911yrO.class) {
            if (KWHzl == null) {
                KWHzl = c57911yrO;
            } else {
                C58013ytK.OLrzqt("Matrix.Matrix", "Matrix instance is already set. this invoking will be ignored", new java.lang.Object[0]);
            }
        }
        return KWHzl;
    }

    public static C57911yrO EZpvd() {
        if (KWHzl != null) {
            return KWHzl;
        }
        throw new java.lang.RuntimeException("you must init Matrix sdk first");
    }

    public void OLrzqt() {
        java.util.Iterator<AbstractC58042ytn> it = this.copydefault.iterator();
        while (it.hasNext()) {
            it.next().djBIcL();
        }
    }

    public <T extends AbstractC58042ytn> T copydefault(java.lang.Class<T> cls) {
        java.lang.String name = cls.getName();
        java.util.Iterator<AbstractC58042ytn> it = this.copydefault.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass().getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.yrO$Activity */
    public static class Activity {
        public final android.app.Application EZpvd;
        public InterfaceC58039ytk KWHzl;
        public C57921yrY OLrzqt = new C57921yrY();
        public final java.util.HashSet<AbstractC58042ytn> AEQbTJ = new java.util.HashSet<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AEQbTJ(InterfaceC58039ytk interfaceC58039ytk) {
            this.KWHzl = interfaceC58039ytk;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault(C57921yrY c57921yrY) {
            this.OLrzqt = c57921yrY;
            return this;
        }

        public Activity(android.app.Application application) {
            if (application == null) {
                throw new java.lang.RuntimeException("matrix init, application is null");
            }
            this.EZpvd = application;
        }

        public Activity KWHzl(AbstractC58042ytn abstractC58042ytn) {
            java.lang.String strEZpvd = abstractC58042ytn.EZpvd();
            java.util.Iterator<AbstractC58042ytn> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                if (strEZpvd.equals(it.next().EZpvd())) {
                    throw new java.lang.RuntimeException(java.lang.String.format("plugin with tag %s is already exist", strEZpvd));
                }
            }
            this.AEQbTJ.add(abstractC58042ytn);
            return this;
        }

        public C57911yrO AEQbTJ() {
            if (this.KWHzl == null) {
                this.KWHzl = new C58037yti(this.EZpvd);
            }
            return new C57911yrO(this.EZpvd, this.KWHzl, this.AEQbTJ, this.OLrzqt);
        }
    }
}
