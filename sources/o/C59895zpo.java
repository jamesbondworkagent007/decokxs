package o;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.zpo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59895zpo extends AbstractC59897zpq implements InterfaceC59890zpj {
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public C59888zph AhwBna;
    public final boolean AkhnZx;
    public boolean AuCTel;
    public transient boolean DbNXlk;
    public boolean djBIcL;
    public java.util.Map<java.lang.String, java.lang.String> ejfBZ;
    public C59895zpo fIwbmz;
    public boolean fetchVPNInfo;
    public final java.util.List<InterfaceC59833zoW> gEmmrt;
    public boolean isConnected;
    public boolean valueOf;
    public java.util.List<InterfaceC59833zoW> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<? extends InterfaceC59833zoW> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<? extends InterfaceC59833zoW> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C59888zph c59888zph) {
        this.AhwBna = c59888zph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59895zpo copydefault() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.util.List<InterfaceC59833zoW> list) {
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.DbNXlk;
    }

    public final void fetchVPNInfo() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.AkhnZx;
    }

    public C59895zpo(java.lang.String str) {
        this(str, false);
    }

    public C59895zpo(java.lang.String str, boolean z) {
        super(str);
        this.AYXKKw = new LinkedHashMap();
        this.gEmmrt = new java.util.ArrayList();
        this.djBIcL = false;
        this.fetchVPNInfo = true;
        this.AkhnZx = z;
    }

    @Override // o.AbstractC59897zpq
    public java.lang.String values() {
        if (this.isConnected) {
            return this.fJNWhG;
        }
        java.lang.String str = this.fJNWhG;
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return gEmmrt().get(str.toLowerCase());
    }

    public java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return new LinkedHashMap(this.AYXKKw);
    }

    public java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        return djBIcL();
    }

    public void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.djBIcL) {
            AEQbTJ(map);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.String str : map.keySet()) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                fetchVPNInfo();
                return;
            }
            java.lang.String str2 = map.get(str);
            if (!this.djBIcL) {
                java.lang.String str3 = str;
                for (java.lang.String str4 : this.AYXKKw.keySet()) {
                    if (str4.equalsIgnoreCase(str)) {
                        str3 = str4;
                    }
                }
                str = str3;
            }
            linkedHashMap.put(str, str2);
        }
        AEQbTJ((java.util.Map<java.lang.String, java.lang.String>) linkedHashMap);
    }

    public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        this.AYXKKw.clear();
        this.AYXKKw.putAll(map);
    }

    public boolean OLrzqt(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = this.AYXKKw.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC59897zpq
    public void copydefault(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (!this.isConnected && this.djBIcL) {
                strTrim = strTrim.toLowerCase();
            }
            if (str2 == null) {
                str2 = "";
            }
            if (this.fetchVPNInfo) {
                str2 = str2.trim().replaceAll("\\p{Cntrl}", " ");
            }
            if (strTrim.length() != 0) {
                this.AYXKKw.put(strTrim, str2);
            }
        }
    }

    public void AEQbTJ(java.lang.String str) {
        if (str == null || "".equals(str.trim())) {
            return;
        }
        this.AYXKKw.remove(str.toLowerCase());
    }

    public void AEQbTJ(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof java.util.List) {
            EZpvd((java.util.List) obj);
            return;
        }
        if (obj instanceof C59889zpi) {
            this.gEmmrt.add(((C59889zpi) obj).OLrzqt());
            return;
        }
        if (obj instanceof InterfaceC59833zoW) {
            this.gEmmrt.add((InterfaceC59833zoW) obj);
            if (obj instanceof C59895zpo) {
                ((C59895zpo) obj).fIwbmz = this;
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException("Attempted to add invalid child object to TagNode; class=" + obj.getClass());
    }

    public void EZpvd(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AEQbTJ(it.next());
            }
        }
    }

    public boolean KWHzl() {
        C59895zpo c59895zpo = this.fIwbmz;
        if (c59895zpo != null) {
            return c59895zpo.copydefault(this);
        }
        return false;
    }

    public boolean copydefault(java.lang.Object obj) {
        return this.gEmmrt.remove(obj);
    }

    public void OLrzqt(java.lang.Object obj) {
        if (this.values == null) {
            this.values = new java.util.ArrayList();
        }
        if (obj instanceof InterfaceC59833zoW) {
            this.values.add((InterfaceC59833zoW) obj);
            return;
        }
        throw new java.lang.RuntimeException("Attempt to add invalid item for moving; class=" + obj.getClass());
    }

    public void AuCTel() {
        KWHzl(true);
    }

    public boolean DbNXlk() {
        if (ejfBZ()) {
            return true;
        }
        for (InterfaceC59833zoW interfaceC59833zoW : this.gEmmrt) {
            if (interfaceC59833zoW instanceof C59895zpo) {
                if (!((C59895zpo) interfaceC59833zoW).ejfBZ()) {
                    return false;
                }
            } else if (interfaceC59833zoW instanceof C59881zpa) {
                if (!((C59881zpa) interfaceC59833zoW).gEmmrt()) {
                    return false;
                }
            } else {
                boolean z = interfaceC59833zoW instanceof C59835zoY;
                return false;
            }
        }
        return true;
    }

    public void AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (this.ejfBZ == null) {
            this.ejfBZ = new TreeMap();
        }
        this.ejfBZ.put(str, str2);
    }

    public C59895zpo fARcdN() {
        C59895zpo c59895zpo = new C59895zpo(this.fJNWhG, true);
        c59895zpo.AYXKKw.putAll(this.AYXKKw);
        return c59895zpo;
    }

    public void copydefault(boolean z) {
        this.djBIcL = true;
        this.isConnected = z;
        if (z) {
            return;
        }
        AEQbTJ(gEmmrt());
    }

    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.String str : this.AYXKKw.keySet()) {
            linkedHashMap.put(str.toLowerCase(), this.AYXKKw.get(str));
        }
        return linkedHashMap;
    }
}
