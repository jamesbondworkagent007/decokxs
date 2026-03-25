package o;

import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.aeY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class C7157aeY implements InterfaceC7283ags {
    public static final boolean EZpvd = C7060ach.AEQbTJ("rbnf");
    public java.util.Map<java.lang.String, InterfaceC7280agp> OLrzqt = new java.util.HashMap();

    @java.lang.Deprecated
    public C7157aeY() {
    }

    @Override // o.InterfaceC7283ags
    @java.lang.Deprecated
    public InterfaceC7280agp copydefault(ULocale uLocale, java.lang.String str) {
        java.lang.String str2 = uLocale.toString() + "/" + str;
        synchronized (this.OLrzqt) {
            InterfaceC7280agp interfaceC7280agp = this.OLrzqt.get(str2);
            if (interfaceC7280agp != null) {
                return interfaceC7280agp;
            }
            InterfaceC7280agp interfaceC7280agpAEQbTJ = AEQbTJ(uLocale, str);
            synchronized (this.OLrzqt) {
                this.OLrzqt.put(str2, interfaceC7280agpAEQbTJ);
            }
            return interfaceC7280agpAEQbTJ;
        }
    }

    @java.lang.Deprecated
    public InterfaceC7280agp AEQbTJ(ULocale uLocale, java.lang.String str) {
        C7286agv c7286agv;
        try {
            c7286agv = (C7286agv) AbstractC7206afU.copydefault(uLocale.toLocale());
            if (str != null) {
                c7286agv = new C7286agv(c7286agv.values() + str);
            }
            c7286agv.KWHzl(17);
        } catch (java.lang.Exception e) {
            if (EZpvd) {
                e.printStackTrace();
                java.lang.System.out.println("++++");
            }
            c7286agv = null;
        }
        return new Activity(c7286agv);
    }

    /* JADX INFO: renamed from: o.aeY$Activity */
    public static class Activity implements InterfaceC7280agp {
        public final C7286agv OLrzqt;

        public Activity(C7286agv c7286agv) {
            this.OLrzqt = c7286agv;
        }

        @Override // o.InterfaceC7280agp
        public boolean AEQbTJ(java.lang.String str) {
            C7204afS c7204afSKWHzl = this.OLrzqt.KWHzl(str);
            int iKWHzl = c7204afSKWHzl.KWHzl();
            while (iKWHzl != -1 && C7204afS.copydefault(iKWHzl) == 0) {
                iKWHzl = c7204afSKWHzl.KWHzl();
            }
            return iKWHzl == -1;
        }

        @Override // o.InterfaceC7280agp
        public int[] copydefault(java.lang.String str, java.lang.String str2, int i) {
            int iKWHzl = 0;
            while (i < str.length() && iKWHzl == 0) {
                iKWHzl = KWHzl(str.substring(i), str2);
                if (iKWHzl != 0) {
                    return new int[]{i, iKWHzl};
                }
                i++;
            }
            return new int[]{-1, 0};
        }

        @Override // o.InterfaceC7280agp
        public int KWHzl(java.lang.String str, java.lang.String str2) {
            C7204afS c7204afSKWHzl = this.OLrzqt.KWHzl(str);
            C7204afS c7204afSKWHzl2 = this.OLrzqt.KWHzl(str2);
            int iKWHzl = c7204afSKWHzl.KWHzl();
            int iKWHzl2 = c7204afSKWHzl2.KWHzl();
            while (iKWHzl2 != -1) {
                while (C7204afS.copydefault(iKWHzl) == 0 && iKWHzl != -1) {
                    iKWHzl = c7204afSKWHzl.KWHzl();
                }
                while (C7204afS.copydefault(iKWHzl2) == 0 && iKWHzl2 != -1) {
                    iKWHzl2 = c7204afSKWHzl2.KWHzl();
                }
                if (iKWHzl2 == -1) {
                    break;
                }
                if (iKWHzl == -1 || C7204afS.copydefault(iKWHzl) != C7204afS.copydefault(iKWHzl2)) {
                    return 0;
                }
                iKWHzl = c7204afSKWHzl.KWHzl();
                iKWHzl2 = c7204afSKWHzl2.KWHzl();
            }
            int iEZpvd = c7204afSKWHzl.EZpvd();
            return iKWHzl != -1 ? iEZpvd - 1 : iEZpvd;
        }
    }
}
