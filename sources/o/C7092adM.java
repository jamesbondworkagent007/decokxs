package o;

import com.ibm.icu.impl.locale.LocaleSyntaxException;
import java.util.Collections;

/* JADX INFO: renamed from: o.adM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7092adM {
    public static final ActionBar OLrzqt = new ActionBar("x".charAt(0));
    public java.util.HashMap<Application, java.lang.String> AhwBna;
    public java.util.HashMap<ActionBar, java.lang.String> EZpvd;
    public java.util.HashSet<Application> valueOf;
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";
    public java.lang.String djBIcL = "";

    public C7092adM OLrzqt(java.lang.String str) throws LocaleSyntaxException {
        if (str == null || !C7100adU.KWHzl(str)) {
            throw new LocaleSyntaxException("Ill-formed Unicode locale attribute: " + str);
        }
        if (this.valueOf == null) {
            this.valueOf = new java.util.HashSet<>(4);
        }
        this.valueOf.add(new Application(str));
        return this;
    }

    public C7092adM AEQbTJ(java.lang.String str, java.lang.String str2) throws LocaleSyntaxException {
        if (!C7100adU.AEQbTJ(str)) {
            throw new LocaleSyntaxException("Ill-formed Unicode locale keyword key: " + str);
        }
        Application application = new Application(str);
        if (str2 == null) {
            java.util.HashMap<Application, java.lang.String> map = this.AhwBna;
            if (map != null) {
                map.remove(application);
            }
        } else {
            if (str2.length() != 0) {
                C7104adY c7104adY = new C7104adY(str2.replaceAll("_", "-"), "-");
                while (!c7104adY.OLrzqt()) {
                    if (!C7100adU.OLrzqt(c7104adY.KWHzl())) {
                        throw new LocaleSyntaxException("Ill-formed Unicode locale keyword type: " + str2, c7104adY.copydefault());
                    }
                    c7104adY.valueOf();
                }
            }
            if (this.AhwBna == null) {
                this.AhwBna = new java.util.HashMap<>(4);
            }
            this.AhwBna.put(application, str2);
        }
        return this;
    }

    public C7092adM OLrzqt(char c, java.lang.String str) throws LocaleSyntaxException {
        boolean zDjBIcL;
        boolean zEZpvd = C7096adQ.EZpvd(c);
        if (!zEZpvd && !C7096adQ.AEQbTJ(c)) {
            throw new LocaleSyntaxException("Ill-formed extension key: " + c);
        }
        boolean z = str == null || str.length() == 0;
        ActionBar actionBar = new ActionBar(c);
        if (z) {
            if (C7100adU.AEQbTJ(actionBar.EZpvd())) {
                java.util.HashSet<Application> hashSet = this.valueOf;
                if (hashSet != null) {
                    hashSet.clear();
                }
                java.util.HashMap<Application, java.lang.String> map = this.AhwBna;
                if (map != null) {
                    map.clear();
                }
            } else {
                java.util.HashMap<ActionBar, java.lang.String> map2 = this.EZpvd;
                if (map2 != null && map2.containsKey(actionBar)) {
                    this.EZpvd.remove(actionBar);
                }
            }
        } else {
            java.lang.String strReplaceAll = str.replaceAll("_", "-");
            C7104adY c7104adY = new C7104adY(strReplaceAll, "-");
            while (!c7104adY.OLrzqt()) {
                java.lang.String strKWHzl = c7104adY.KWHzl();
                if (zEZpvd) {
                    zDjBIcL = C7096adQ.AkhnZx(strKWHzl);
                } else {
                    zDjBIcL = C7096adQ.djBIcL(strKWHzl);
                }
                if (!zDjBIcL) {
                    throw new LocaleSyntaxException("Ill-formed extension value: " + strKWHzl, c7104adY.copydefault());
                }
                c7104adY.valueOf();
            }
            if (C7100adU.AEQbTJ(actionBar.EZpvd())) {
                EZpvd(strReplaceAll);
            } else {
                if (this.EZpvd == null) {
                    this.EZpvd = new java.util.HashMap<>(4);
                }
                this.EZpvd.put(actionBar, strReplaceAll);
            }
        }
        return this;
    }

    public final C7092adM OLrzqt(java.util.List<java.lang.String> list, java.lang.String str) {
        EZpvd();
        if (list != null && list.size() > 0) {
            java.util.HashSet hashSet = new java.util.HashSet(list.size());
            for (java.lang.String str2 : list) {
                ActionBar actionBar = new ActionBar(str2.charAt(0));
                if (!hashSet.contains(actionBar)) {
                    if (C7100adU.AEQbTJ(actionBar.EZpvd())) {
                        EZpvd(str2.substring(2));
                    } else {
                        if (this.EZpvd == null) {
                            this.EZpvd = new java.util.HashMap<>(4);
                        }
                        this.EZpvd.put(actionBar, str2.substring(2));
                    }
                }
            }
        }
        if (str != null && str.length() > 0) {
            if (this.EZpvd == null) {
                this.EZpvd = new java.util.HashMap<>(1);
            }
            this.EZpvd.put(new ActionBar(str.charAt(0)), str.substring(2));
        }
        return this;
    }

    public C7092adM EZpvd(C7096adQ c7096adQ) {
        KWHzl();
        if (c7096adQ.copydefault().size() > 0) {
            this.KWHzl = c7096adQ.copydefault().get(0);
        } else {
            java.lang.String strAEQbTJ = c7096adQ.AEQbTJ();
            if (!strAEQbTJ.equals(C7096adQ.OLrzqt)) {
                this.KWHzl = strAEQbTJ;
            }
        }
        this.AEQbTJ = c7096adQ.AYXKKw();
        this.copydefault = c7096adQ.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(c7096adQ.AhwBna());
        Collections.sort(arrayList);
        if (arrayList.size() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                sb.append("_");
                sb.append((java.lang.String) arrayList.get(i));
            }
            this.djBIcL = sb.toString();
        }
        OLrzqt(c7096adQ.KWHzl(), c7096adQ.EZpvd());
        return this;
    }

    public C7092adM OLrzqt(C7094adO c7094adO, C7098adS c7098adS) throws LocaleSyntaxException {
        int iCopydefault;
        java.lang.String strKWHzl = c7094adO.KWHzl();
        java.lang.String strEZpvd = c7094adO.EZpvd();
        java.lang.String strOLrzqt = c7094adO.OLrzqt();
        java.lang.String strCopydefault = c7094adO.copydefault();
        if (strKWHzl.length() > 0 && !C7096adQ.AhwBna(strKWHzl)) {
            throw new LocaleSyntaxException("Ill-formed language: " + strKWHzl);
        }
        if (strEZpvd.length() > 0 && !C7096adQ.isConnected(strEZpvd)) {
            throw new LocaleSyntaxException("Ill-formed script: " + strEZpvd);
        }
        if (strOLrzqt.length() > 0 && !C7096adQ.DbNXlk(strOLrzqt)) {
            throw new LocaleSyntaxException("Ill-formed region: " + strOLrzqt);
        }
        if (strCopydefault.length() > 0 && (iCopydefault = copydefault(strCopydefault, "_")) != -1) {
            throw new LocaleSyntaxException("Ill-formed variant: " + strCopydefault, iCopydefault);
        }
        this.KWHzl = strKWHzl;
        this.AEQbTJ = strEZpvd;
        this.copydefault = strOLrzqt;
        this.djBIcL = strCopydefault;
        EZpvd();
        java.util.Set<java.lang.Character> setCopydefault = c7098adS == null ? null : c7098adS.copydefault();
        if (setCopydefault != null) {
            for (java.lang.Character ch : setCopydefault) {
                C7091adL c7091adLAEQbTJ = c7098adS.AEQbTJ(ch);
                if (c7091adLAEQbTJ instanceof C7100adU) {
                    C7100adU c7100adU = (C7100adU) c7091adLAEQbTJ;
                    for (java.lang.String str : c7100adU.copydefault()) {
                        if (this.valueOf == null) {
                            this.valueOf = new java.util.HashSet<>(4);
                        }
                        this.valueOf.add(new Application(str));
                    }
                    for (java.lang.String str2 : c7100adU.KWHzl()) {
                        if (this.AhwBna == null) {
                            this.AhwBna = new java.util.HashMap<>(4);
                        }
                        this.AhwBna.put(new Application(str2), c7100adU.copydefault(str2));
                    }
                } else {
                    if (this.EZpvd == null) {
                        this.EZpvd = new java.util.HashMap<>(4);
                    }
                    this.EZpvd.put(new ActionBar(ch.charValue()), c7091adLAEQbTJ.AEQbTJ());
                }
            }
        }
        return this;
    }

    public C7092adM KWHzl() {
        this.KWHzl = "";
        this.AEQbTJ = "";
        this.copydefault = "";
        this.djBIcL = "";
        EZpvd();
        return this;
    }

    public C7092adM EZpvd() {
        java.util.HashMap<ActionBar, java.lang.String> map = this.EZpvd;
        if (map != null) {
            map.clear();
        }
        java.util.HashSet<Application> hashSet = this.valueOf;
        if (hashSet != null) {
            hashSet.clear();
        }
        java.util.HashMap<Application, java.lang.String> map2 = this.AhwBna;
        if (map2 != null) {
            map2.clear();
        }
        return this;
    }

    public C7094adO copydefault() {
        java.lang.String str;
        int iCopydefault;
        java.lang.String str2 = this.KWHzl;
        java.lang.String str3 = this.AEQbTJ;
        java.lang.String str4 = this.copydefault;
        java.lang.String string = this.djBIcL;
        java.util.HashMap<ActionBar, java.lang.String> map = this.EZpvd;
        if (map != null && (str = map.get(OLrzqt)) != null) {
            C7104adY c7104adY = new C7104adY(str, "-");
            boolean z = false;
            while (true) {
                if (c7104adY.OLrzqt()) {
                    iCopydefault = -1;
                    break;
                }
                if (z) {
                    iCopydefault = c7104adY.copydefault();
                    break;
                }
                if (C7090adK.copydefault(c7104adY.KWHzl(), "lvariant")) {
                    z = true;
                }
                c7104adY.valueOf();
            }
            if (iCopydefault != -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
                if (sb.length() != 0) {
                    sb.append("_");
                }
                sb.append(str.substring(iCopydefault).replaceAll("-", "_"));
                string = sb.toString();
            }
        }
        return C7094adO.AEQbTJ(str2, str3, str4, string);
    }

    public C7098adS OLrzqt() {
        java.util.HashSet<Application> hashSet;
        java.util.HashMap<Application, java.lang.String> map;
        java.util.HashMap<ActionBar, java.lang.String> map2 = this.EZpvd;
        if ((map2 == null || map2.size() == 0) && (((hashSet = this.valueOf) == null || hashSet.size() == 0) && ((map = this.AhwBna) == null || map.size() == 0))) {
            return C7098adS.OLrzqt;
        }
        return new C7098adS(this.EZpvd, this.valueOf, this.AhwBna);
    }

    public static java.lang.String copydefault(java.lang.String str) {
        C7104adY c7104adY = new C7104adY(str, "-");
        int iCopydefault = -1;
        while (!c7104adY.OLrzqt()) {
            if (iCopydefault != -1) {
                if (iCopydefault == 0) {
                    return null;
                }
                return str.substring(0, iCopydefault - 1);
            }
            if (C7090adK.copydefault(c7104adY.KWHzl(), "lvariant")) {
                iCopydefault = c7104adY.copydefault();
            }
            c7104adY.valueOf();
        }
        return str;
    }

    public final int copydefault(java.lang.String str, java.lang.String str2) {
        C7104adY c7104adY = new C7104adY(str, str2);
        while (!c7104adY.OLrzqt()) {
            if (!C7096adQ.fetchVPNInfo(c7104adY.KWHzl())) {
                return c7104adY.copydefault();
            }
            c7104adY.valueOf();
        }
        return -1;
    }

    public final void EZpvd(java.lang.String str) {
        java.util.HashSet<Application> hashSet = this.valueOf;
        if (hashSet != null) {
            hashSet.clear();
        }
        java.util.HashMap<Application, java.lang.String> map = this.AhwBna;
        if (map != null) {
            map.clear();
        }
        C7104adY c7104adY = new C7104adY(str, "-");
        while (!c7104adY.OLrzqt() && C7100adU.KWHzl(c7104adY.KWHzl())) {
            if (this.valueOf == null) {
                this.valueOf = new java.util.HashSet<>(4);
            }
            this.valueOf.add(new Application(c7104adY.KWHzl()));
            c7104adY.valueOf();
        }
        Application application = null;
        int iCopydefault = -1;
        int iAEQbTJ = -1;
        while (!c7104adY.OLrzqt()) {
            if (application != null) {
                if (C7100adU.AEQbTJ(c7104adY.KWHzl())) {
                    java.lang.String strSubstring = iCopydefault == -1 ? "" : str.substring(iCopydefault, iAEQbTJ);
                    if (this.AhwBna == null) {
                        this.AhwBna = new java.util.HashMap<>(4);
                    }
                    this.AhwBna.put(application, strSubstring);
                    application = new Application(c7104adY.KWHzl());
                    if (this.AhwBna.containsKey(application)) {
                        application = null;
                    }
                    iCopydefault = -1;
                    iAEQbTJ = -1;
                } else {
                    if (iCopydefault == -1) {
                        iCopydefault = c7104adY.copydefault();
                    }
                    iAEQbTJ = c7104adY.AEQbTJ();
                }
            } else if (C7100adU.AEQbTJ(c7104adY.KWHzl())) {
                application = new Application(c7104adY.KWHzl());
                java.util.HashMap<Application, java.lang.String> map2 = this.AhwBna;
                if (map2 != null && map2.containsKey(application)) {
                    application = null;
                }
            }
            if (!c7104adY.EZpvd()) {
                if (application != null) {
                    java.lang.String strSubstring2 = iCopydefault != -1 ? str.substring(iCopydefault, iAEQbTJ) : "";
                    if (this.AhwBna == null) {
                        this.AhwBna = new java.util.HashMap<>(4);
                    }
                    this.AhwBna.put(application, strSubstring2);
                    return;
                }
                return;
            }
            c7104adY.valueOf();
        }
    }

    /* JADX INFO: renamed from: o.adM$Application */
    public static class Application {
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        public Application(java.lang.String str) {
            this.OLrzqt = str;
        }

        public int hashCode() {
            return C7090adK.AEQbTJ(this.OLrzqt).hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Application) {
                return C7090adK.copydefault(this.OLrzqt, ((Application) obj).EZpvd());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o.adM$ActionBar */
    public static class ActionBar {
        public char AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public char EZpvd() {
            return this.AEQbTJ;
        }

        public ActionBar(char c) {
            this.AEQbTJ = c;
        }

        public int hashCode() {
            return C7090adK.AEQbTJ(this.AEQbTJ);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.AEQbTJ == C7090adK.AEQbTJ(((ActionBar) obj).EZpvd());
        }
    }
}
