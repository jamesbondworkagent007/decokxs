package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import java.util.Stack;
import org.htmlcleaner.HtmlCleanerException;
import org.htmlcleaner.audit.ErrorType;

/* JADX INFO: renamed from: o.zpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59887zpg {
    public static int OLrzqt = 4;
    public C59882zpb EZpvd;
    public C59836zoZ KWHzl;

    public final void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59882zpb EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59836zoZ OLrzqt() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.zpg$Application */
    public class Application {
        public java.lang.String AEQbTJ;
        public int EZpvd;
        public C59894zpn copydefault;

        public Application(int i, java.lang.String str) {
            this.EZpvd = i;
            this.AEQbTJ = str;
            this.copydefault = C59887zpg.this.KWHzl().getTagInfo(str);
        }
    }

    /* JADX INFO: renamed from: o.zpg$TaskDescription */
    public class TaskDescription {
        public Stack<Application> AEQbTJ;
        public Stack<Application> OLrzqt;

        public TaskDescription() {
            this.AEQbTJ = new Stack<>();
            this.OLrzqt = new Stack<>();
        }

        public void AEQbTJ(Application application, Application application2) {
            this.AEQbTJ.add(application);
            this.OLrzqt.add(application2);
        }

        public boolean AEQbTJ() {
            return this.AEQbTJ.isEmpty();
        }

        public java.lang.String OLrzqt() {
            return this.OLrzqt.peek().AEQbTJ;
        }

        public Application copydefault() {
            this.OLrzqt.pop();
            return this.AEQbTJ.pop();
        }

        public int EZpvd() {
            if (this.OLrzqt.isEmpty()) {
                return -1;
            }
            return this.OLrzqt.peek().EZpvd;
        }
    }

    /* JADX INFO: renamed from: o.zpg$Activity */
    public class Activity {
        public ActionBar EZpvd;
        public TaskDescription OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar copydefault() {
            return this.EZpvd;
        }

        public Activity() {
            this.EZpvd = C59887zpg.this.new ActionBar();
            this.OLrzqt = new TaskDescription();
        }
    }

    /* JADX INFO: renamed from: o.zpg$ActionBar */
    public class ActionBar {
        public Application OLrzqt;
        public java.util.List<Application> AEQbTJ = new java.util.ArrayList();
        public java.util.Set<java.lang.String> KWHzl = new java.util.HashSet();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        public final boolean EZpvd() {
            return this.AEQbTJ.isEmpty();
        }

        public final void OLrzqt(java.lang.String str, int i) {
            Application application = C59887zpg.this.new Application(i, str);
            this.OLrzqt = application;
            this.AEQbTJ.add(application);
            this.KWHzl.add(str);
        }

        public final void KWHzl(java.lang.String str) {
            Application application;
            java.util.List<Application> list = this.AEQbTJ;
            java.util.ListIterator<Application> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    C59887zpg.this.AEQbTJ();
                    break;
                } else if (str.equals(listIterator.previous().AEQbTJ)) {
                    listIterator.remove();
                    break;
                }
            }
            if (this.AEQbTJ.isEmpty()) {
                application = null;
            } else {
                application = this.AEQbTJ.get(r3.size() - 1);
            }
            this.OLrzqt = application;
        }

        public final Application KWHzl() {
            if (this.AEQbTJ.isEmpty()) {
                return null;
            }
            return this.AEQbTJ.get(0);
        }

        public final Application OLrzqt(java.lang.String str) {
            if (str != null) {
                java.util.List<Application> list = this.AEQbTJ;
                java.util.ListIterator<Application> listIterator = list.listIterator(list.size());
                C59894zpn tagInfo = C59887zpg.this.KWHzl().getTagInfo(str);
                while (listIterator.hasPrevious()) {
                    if (java.lang.Thread.currentThread().isInterrupted()) {
                        C59887zpg.this.AEQbTJ();
                        return null;
                    }
                    Application applicationPrevious = listIterator.previous();
                    if (!str.equals(applicationPrevious.AEQbTJ)) {
                        if (tagInfo != null && tagInfo.fetchVPNInfo(applicationPrevious.AEQbTJ)) {
                            break;
                        }
                    } else {
                        return applicationPrevious;
                    }
                }
            }
            return null;
        }

        public final boolean EZpvd(java.lang.String str) {
            return OLrzqt(str) != null;
        }

        public final Application AEQbTJ() {
            if (EZpvd()) {
                return null;
            }
            java.util.List<Application> list = this.AEQbTJ;
            java.util.ListIterator<Application> listIterator = list.listIterator(list.size());
            Application application = null;
            while (listIterator.hasPrevious()) {
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    C59887zpg.this.AEQbTJ();
                    return null;
                }
                Application applicationPrevious = listIterator.previous();
                if ((applicationPrevious.copydefault == null || applicationPrevious.copydefault.copydefault()) && application != null) {
                    return application;
                }
                application = applicationPrevious;
            }
            return application;
        }

        public final boolean AEQbTJ(java.lang.String str) {
            return this.KWHzl.contains(str);
        }

        public final boolean OLrzqt(java.util.Set<java.lang.String> set) {
            java.util.Iterator<Application> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                if (set.contains(it.next().AEQbTJ)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C59887zpg() {
        this(null, null);
    }

    public C59887zpg(InterfaceC59892zpl interfaceC59892zpl, C59836zoZ c59836zoZ) {
        c59836zoZ = c59836zoZ == null ? new C59836zoZ() : c59836zoZ;
        this.KWHzl = c59836zoZ;
        if (interfaceC59892zpl != null || c59836zoZ.AYXKKw() != null) {
            if (interfaceC59892zpl != null) {
                this.KWHzl.OLrzqt(interfaceC59892zpl);
            }
        } else if (this.KWHzl.copydefault() == OLrzqt) {
            this.KWHzl.OLrzqt(C59885zpe.EZpvd);
        } else {
            this.KWHzl.OLrzqt(C59886zpf.OLrzqt);
        }
    }

    public C59895zpo copydefault(java.lang.String str) {
        try {
            return AEQbTJ(new java.io.StringReader(str), new C59883zpc());
        } catch (java.io.IOException e) {
            throw new HtmlCleanerException(e);
        }
    }

    public C59895zpo AEQbTJ(java.io.Reader reader, C59883zpc c59883zpc) throws java.io.IOException {
        AEQbTJ(c59883zpc);
        c59883zpc.OLrzqt = false;
        c59883zpc.KWHzl = false;
        c59883zpc.copydefault.clear();
        c59883zpc.EZpvd.clear();
        c59883zpc.DbNXlk = new java.util.HashSet(this.KWHzl.djBIcL());
        c59883zpc.AEQbTJ = new java.util.HashSet(this.KWHzl.KWHzl());
        this.EZpvd = this.KWHzl.EZpvd();
        c59883zpc.values.clear();
        c59883zpc.djBIcL = AEQbTJ("html");
        c59883zpc.valueOf = AEQbTJ("body");
        C59895zpo c59895zpoAEQbTJ = AEQbTJ(TtmlNode.TAG_HEAD);
        c59883zpc.AhwBna = c59895zpoAEQbTJ;
        c59883zpc.fetchVPNInfo = null;
        c59883zpc.djBIcL.AEQbTJ(c59895zpoAEQbTJ);
        c59883zpc.djBIcL.AEQbTJ(c59883zpc.valueOf);
        C59893zpm c59893zpm = new C59893zpm(this, reader, c59883zpc);
        c59893zpm.getNewProxyInstance();
        if (java.lang.Thread.currentThread().isInterrupted()) {
            AEQbTJ();
            return null;
        }
        java.util.List<InterfaceC59833zoW> listDjBIcL = c59893zpm.djBIcL();
        KWHzl(listDjBIcL, c59883zpc);
        if (java.lang.Thread.currentThread().isInterrupted()) {
            AEQbTJ();
            return null;
        }
        AEQbTJ(listDjBIcL, c59883zpc);
        if (java.lang.Thread.currentThread().isInterrupted()) {
            AEQbTJ();
            return null;
        }
        EZpvd(c59883zpc, c59893zpm.AhwBna());
        if (java.lang.Thread.currentThread().isInterrupted()) {
            AEQbTJ();
            return null;
        }
        while (OLrzqt(listDjBIcL, c59883zpc)) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                AEQbTJ();
                return null;
            }
        }
        java.util.Set<C59895zpo> set = c59883zpc.values;
        if (set != null && !set.isEmpty()) {
            for (C59895zpo c59895zpo : c59883zpc.values) {
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    AEQbTJ();
                    return null;
                }
                C59895zpo c59895zpoCopydefault = c59895zpo.copydefault();
                if (c59895zpoCopydefault != null) {
                    c59895zpoCopydefault.copydefault(c59895zpo);
                }
            }
        }
        c59883zpc.fetchVPNInfo.OLrzqt(c59893zpm.gEmmrt());
        EZpvd(c59883zpc);
        return c59883zpc.fetchVPNInfo;
    }

    public final boolean OLrzqt(java.util.List list, C59883zpc c59883zpc) {
        boolean zOLrzqt = false;
        for (java.lang.Object obj : list) {
            if ((obj instanceof C59895zpo) && !c59883zpc.values.contains(obj)) {
                C59895zpo c59895zpo = (C59895zpo) obj;
                if (copydefault(c59895zpo, c59883zpc)) {
                    zOLrzqt = true;
                } else if (!c59895zpo.DbNXlk()) {
                    zOLrzqt |= OLrzqt(c59895zpo.AYXKKw(), c59883zpc);
                }
            }
        }
        return zOLrzqt;
    }

    public final void EZpvd(C59883zpc c59883zpc, java.util.Set<java.lang.String> set) {
        c59883zpc.fetchVPNInfo = c59883zpc.djBIcL;
        if (this.KWHzl.AuCTel()) {
            java.util.List<? extends InterfaceC59833zoW> listAYXKKw = c59883zpc.valueOf.AYXKKw();
            c59883zpc.fetchVPNInfo = new C59895zpo(null);
            if (listAYXKKw != null) {
                java.util.Iterator<? extends InterfaceC59833zoW> it = listAYXKKw.iterator();
                while (it.hasNext()) {
                    c59883zpc.fetchVPNInfo.AEQbTJ(it.next());
                }
            }
        }
        java.util.Map<java.lang.String, java.lang.String> mapValueOf = c59883zpc.fetchVPNInfo.valueOf();
        if (c59883zpc.fetchVPNInfo.OLrzqt("xmlns")) {
            C59895zpo c59895zpo = c59883zpc.fetchVPNInfo;
            c59895zpo.AEQbTJ("", c59895zpo.EZpvd("xmlns"));
        }
        if (!this.KWHzl.isConnected() || set == null) {
            return;
        }
        for (java.lang.String str : set) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                AEQbTJ();
                return;
            }
            java.lang.String str2 = "xmlns:" + str;
            if (!mapValueOf.containsKey(str2) && !str.equals("xml")) {
                c59883zpc.fetchVPNInfo.copydefault(str2, str);
            }
        }
    }

    public final void copydefault(C59895zpo c59895zpo, java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            java.util.Map<java.lang.String, java.lang.String> mapValueOf = c59895zpo.valueOf();
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (!mapValueOf.containsKey(key)) {
                    c59895zpo.copydefault(key, entry.getValue());
                }
            }
        }
    }

    public final boolean OLrzqt(C59894zpn c59894zpn, C59883zpc c59883zpc) {
        if (c59894zpn == null || c59894zpn.KWHzl().isEmpty()) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = c59894zpn.KWHzl().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (copydefault(c59883zpc).EZpvd(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean EZpvd(C59894zpn c59894zpn, C59883zpc c59883zpc) {
        boolean z;
        Application applicationOLrzqt;
        Application applicationOLrzqt2;
        if (c59894zpn == null || c59894zpn.valueOf().isEmpty()) {
            return false;
        }
        int i = -1;
        for (java.lang.String str : c59894zpn.KWHzl()) {
            if (str != null && (applicationOLrzqt2 = copydefault(c59883zpc).OLrzqt(str)) != null) {
                i = applicationOLrzqt2.EZpvd;
            }
        }
        loop1: while (true) {
            z = true;
            for (java.lang.String str2 : c59894zpn.valueOf()) {
                if (str2 != null && (applicationOLrzqt = copydefault(c59883zpc).OLrzqt(str2)) != null) {
                    if (applicationOLrzqt.EZpvd <= i) {
                        break;
                    }
                    z = false;
                }
            }
        }
        if (!z) {
            return false;
        }
        java.util.ListIterator listIterator = copydefault(c59883zpc).AEQbTJ.listIterator(copydefault(c59883zpc).AEQbTJ.size());
        while (listIterator.hasPrevious()) {
            Application application = (Application) listIterator.previous();
            if (!java.lang.Thread.currentThread().isInterrupted()) {
                if (c59894zpn.values(application.AEQbTJ)) {
                    return application.EZpvd <= i;
                }
            } else {
                AEQbTJ();
                return application.EZpvd <= i;
            }
        }
        return true;
    }

    public final C59895zpo AEQbTJ(java.lang.String str) {
        return new C59895zpo(str);
    }

    public final C59895zpo copydefault(C59895zpo c59895zpo) {
        c59895zpo.AuCTel();
        return c59895zpo;
    }

    public final boolean AEQbTJ(InterfaceC59833zoW interfaceC59833zoW, C59883zpc c59883zpc) {
        Application applicationOLrzqt = copydefault(c59883zpc).OLrzqt();
        if (applicationOLrzqt == null || applicationOLrzqt.copydefault == null) {
            return true;
        }
        return applicationOLrzqt.copydefault.EZpvd(interfaceC59833zoW);
    }

    public final void copydefault(java.util.List list, java.lang.Object obj, C59883zpc c59883zpc) {
        Application applicationAEQbTJ;
        C59895zpo c59895zpo;
        Application applicationOLrzqt = copydefault(c59883zpc).OLrzqt();
        if ((applicationOLrzqt != null && applicationOLrzqt.copydefault != null && applicationOLrzqt.copydefault.DbNXlk()) || (applicationAEQbTJ = copydefault(c59883zpc).AEQbTJ()) == null || (c59895zpo = (C59895zpo) list.get(applicationAEQbTJ.EZpvd)) == null) {
            return;
        }
        c59895zpo.OLrzqt(obj);
    }

    public final boolean EZpvd(java.lang.Object obj) {
        return (obj instanceof C59895zpo) && !((C59895zpo) obj).fJNWhG();
    }

    public final boolean EZpvd(java.lang.String str, C59883zpc c59883zpc) {
        java.lang.String strPeek;
        if (!this.KWHzl.isConnected() || str == null) {
            return false;
        }
        if (str.contains(":")) {
            return true;
        }
        Stack<java.lang.String> stack = c59883zpc.gEmmrt;
        return (stack == null || stack.size() == 0 || (strPeek = c59883zpc.gEmmrt.peek()) == null || strPeek.equals("http://www.w3.org/1999/xhtml")) ? false : true;
    }

    public void OLrzqt(java.util.List list, java.util.ListIterator<InterfaceC59833zoW> listIterator, C59883zpc c59883zpc) {
        while (listIterator.hasNext()) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                AEQbTJ();
                return;
            }
            InterfaceC59833zoW next = listIterator.next();
            if (next instanceof C59884zpd) {
                C59884zpd c59884zpd = (C59884zpd) next;
                java.lang.String strValues = c59884zpd.values();
                C59894zpn c59894zpnAEQbTJ = AEQbTJ(strValues, c59883zpc);
                if ((c59894zpnAEQbTJ == null && this.KWHzl.fARcdN() && !EZpvd(strValues, c59883zpc)) || (c59894zpnAEQbTJ != null && c59894zpnAEQbTJ.djBIcL() && this.KWHzl.ejfBZ())) {
                    listIterator.set(null);
                } else if (c59894zpnAEQbTJ == null || c59894zpnAEQbTJ.OLrzqt()) {
                    Application applicationOLrzqt = copydefault(c59883zpc).OLrzqt(strValues);
                    if (applicationOLrzqt != null) {
                        java.util.List<C59895zpo> listEZpvd = EZpvd(list, applicationOLrzqt, c59884zpd, c59883zpc);
                        if (listEZpvd.size() > 0 && listEZpvd.get(0).OLrzqt("xmlns")) {
                            c59883zpc.gEmmrt.pop();
                        }
                        listIterator.set(null);
                        for (int size = listEZpvd.size() - 1; size >= 0; size--) {
                            C59895zpo c59895zpo = listEZpvd.get(size);
                            if (size > 0 && c59894zpnAEQbTJ != null && c59894zpnAEQbTJ.djBIcL(c59895zpo.values())) {
                                C59895zpo c59895zpoFARcdN = c59895zpo.fARcdN();
                                c59895zpoFARcdN.OLrzqt(true);
                                listIterator.add(c59895zpoFARcdN);
                                listIterator.previous();
                            }
                        }
                        if (!KWHzl(c59883zpc).AEQbTJ()) {
                            while (applicationOLrzqt.EZpvd < KWHzl(c59883zpc).EZpvd()) {
                                KWHzl(c59883zpc).copydefault();
                            }
                        }
                        while (!KWHzl(c59883zpc).AEQbTJ() && strValues.equals(KWHzl(c59883zpc).OLrzqt()) && applicationOLrzqt.EZpvd == KWHzl(c59883zpc).EZpvd()) {
                            if (list.get(((Application) KWHzl(c59883zpc).AEQbTJ.peek()).EZpvd) != null) {
                                int i = KWHzl(c59883zpc).copydefault().EZpvd;
                                java.lang.Object obj = list.get(i);
                                if (obj instanceof C59895zpo) {
                                    AEQbTJ(listIterator, (C59895zpo) obj, c59883zpc);
                                } else if (obj instanceof java.util.List) {
                                    for (InterfaceC59833zoW interfaceC59833zoW : (java.util.List) obj) {
                                        if (java.lang.Thread.currentThread().isInterrupted()) {
                                            return;
                                        }
                                        listIterator.add(interfaceC59833zoW);
                                        OLrzqt(list, list.listIterator(list.size() - 1), c59883zpc);
                                    }
                                    list.set(i, null);
                                } else {
                                    continue;
                                }
                            } else {
                                KWHzl(c59883zpc).copydefault();
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    listIterator.set(null);
                }
            } else if (EZpvd(next)) {
                C59895zpo c59895zpo2 = (C59895zpo) next;
                java.lang.String strValues2 = c59895zpo2.values();
                C59894zpn c59894zpnAEQbTJ2 = AEQbTJ(strValues2, c59883zpc);
                Application applicationOLrzqt2 = copydefault(c59883zpc).EZpvd() ? null : copydefault(c59883zpc).OLrzqt();
                C59894zpn c59894zpnAEQbTJ3 = applicationOLrzqt2 == null ? null : AEQbTJ(applicationOLrzqt2.AEQbTJ, c59883zpc);
                c59883zpc.EZpvd.add(strValues2);
                if (c59895zpo2.OLrzqt("xmlns")) {
                    java.lang.String strEZpvd = c59895zpo2.EZpvd("xmlns");
                    if (strEZpvd.equals("https://www.w3.org/1999/xhtml") || strEZpvd.equals("http://w3.org/1999/xhtml")) {
                        java.util.Map<java.lang.String, java.lang.String> mapValueOf = c59895zpo2.valueOf();
                        strEZpvd = "http://www.w3.org/1999/xhtml";
                        mapValueOf.put("xmlns", "http://www.w3.org/1999/xhtml");
                        c59895zpo2.EZpvd(mapValueOf);
                    }
                    if (("html".equals(strValues2) && strEZpvd.equals("http://www.w3.org/TR/REC-html40")) || strEZpvd.trim().isEmpty()) {
                        c59895zpo2.AEQbTJ("xmlns");
                    } else {
                        c59883zpc.gEmmrt.push(strEZpvd);
                        c59895zpo2.AEQbTJ("", strEZpvd);
                    }
                }
                if (EZpvd(strValues2, c59883zpc)) {
                    c59895zpo2.copydefault(true);
                } else {
                    c59895zpo2.copydefault(false);
                }
                if ("html".equals(strValues2)) {
                    copydefault(c59883zpc.djBIcL, c59895zpo2.valueOf());
                    listIterator.set(null);
                } else if ("body".equals(strValues2)) {
                    c59883zpc.KWHzl = true;
                    copydefault(c59883zpc.valueOf, c59895zpo2.valueOf());
                    listIterator.set(null);
                } else if (TtmlNode.TAG_HEAD.equals(strValues2)) {
                    c59883zpc.OLrzqt = true;
                    copydefault(c59883zpc.AhwBna, c59895zpo2.valueOf());
                    listIterator.set(null);
                } else if (c59894zpnAEQbTJ2 == null && this.KWHzl.fARcdN() && !EZpvd(strValues2, c59883zpc)) {
                    listIterator.set(null);
                    this.KWHzl.EZpvd(true, c59895zpo2, ErrorType.Unknown);
                } else if (c59894zpnAEQbTJ2 != null && c59894zpnAEQbTJ2.djBIcL() && this.KWHzl.ejfBZ()) {
                    listIterator.set(null);
                    this.KWHzl.EZpvd(true, c59895zpo2, ErrorType.Deprecated);
                } else if (c59894zpnAEQbTJ2 == null && c59894zpnAEQbTJ3 != null && !c59894zpnAEQbTJ3.copydefault()) {
                    EZpvd(list, applicationOLrzqt2, c59895zpo2, c59883zpc);
                    listIterator.previous();
                } else if (c59894zpnAEQbTJ2 != null && c59894zpnAEQbTJ2.AhwBna() && copydefault(c59883zpc).OLrzqt(c59894zpnAEQbTJ2.EZpvd())) {
                    listIterator.set(null);
                } else if (c59894zpnAEQbTJ2 != null && c59894zpnAEQbTJ2.isConnected() && copydefault(c59883zpc).AEQbTJ(strValues2)) {
                    listIterator.set(null);
                    this.KWHzl.OLrzqt(true, c59895zpo2, ErrorType.UniqueTagDuplicated);
                } else if (!OLrzqt(c59894zpnAEQbTJ2, c59883zpc)) {
                    listIterator.set(null);
                    this.KWHzl.OLrzqt(true, c59895zpo2, ErrorType.FatalTagMissing);
                } else if (EZpvd(c59894zpnAEQbTJ2, c59883zpc)) {
                    C59895zpo c59895zpoAEQbTJ = AEQbTJ(c59894zpnAEQbTJ2.valueOf().iterator().next());
                    if (AEQbTJ(c59895zpoAEQbTJ, c59883zpc)) {
                        c59895zpoAEQbTJ.OLrzqt(true);
                        listIterator.previous();
                        listIterator.add(c59895zpoAEQbTJ);
                        listIterator.previous();
                        this.KWHzl.OLrzqt(true, c59895zpo2, ErrorType.RequiredParentMissing);
                    } else {
                        copydefault(list, next, c59883zpc);
                        listIterator.set(null);
                    }
                } else if (c59894zpnAEQbTJ2 != null && applicationOLrzqt2 != null && c59894zpnAEQbTJ2.copydefault(c59894zpnAEQbTJ3)) {
                    KWHzl(c59883zpc).AEQbTJ(applicationOLrzqt2, new Application(listIterator.previousIndex(), c59894zpnAEQbTJ2.AEQbTJ()));
                    this.KWHzl.OLrzqt(!c59895zpo2.OLrzqt("id"), (C59895zpo) list.get(applicationOLrzqt2.EZpvd), ErrorType.UnpermittedChild);
                    java.util.List<C59895zpo> listEZpvd2 = EZpvd(list, applicationOLrzqt2, c59895zpo2, c59883zpc);
                    int size2 = listEZpvd2.size();
                    if (c59894zpnAEQbTJ2.gEmmrt() && size2 > 0) {
                        java.util.ListIterator<C59895zpo> listIterator2 = listEZpvd2.listIterator(size2);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (listIterator2.hasPrevious()) {
                            if (java.lang.Thread.currentThread().isInterrupted()) {
                                return;
                            }
                            C59895zpo c59895zpoPrevious = listIterator2.previous();
                            if (!c59894zpnAEQbTJ2.gEmmrt(c59895zpoPrevious.values())) {
                                break;
                            } else {
                                arrayList.add(0, c59895zpoPrevious);
                            }
                        }
                        if (arrayList.size() > 0) {
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (java.lang.Thread.currentThread().isInterrupted()) {
                                    return;
                                }
                                C59895zpo c59895zpo3 = (C59895zpo) it.next();
                                if (!EZpvd(c59895zpo3, listIterator)) {
                                    listIterator.add(c59895zpo3.fARcdN());
                                } else {
                                    it.remove();
                                }
                            }
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                listIterator.previous();
                            }
                        }
                    }
                    listIterator.previous();
                } else if (!AEQbTJ(next, c59883zpc)) {
                    copydefault(list, next, c59883zpc);
                    listIterator.set(null);
                } else if (c59894zpnAEQbTJ2 == null || c59894zpnAEQbTJ2.OLrzqt()) {
                    copydefault(c59883zpc).OLrzqt(strValues2, listIterator.previousIndex());
                } else {
                    C59895zpo c59895zpoCopydefault = copydefault(c59895zpo2);
                    AEQbTJ(c59894zpnAEQbTJ2, c59895zpoCopydefault, c59883zpc);
                    listIterator.set(c59895zpoCopydefault);
                }
            } else {
                if (c59883zpc.OLrzqt && !c59883zpc.KWHzl && this.KWHzl.fetchVPNInfo()) {
                    if (next instanceof C59835zoY) {
                        if (copydefault(c59883zpc).OLrzqt() == null) {
                            c59883zpc.copydefault.add(new C59889zpi((C59835zoY) next, c59883zpc.valueOf));
                        }
                    } else if (next instanceof C59881zpa) {
                        C59881zpa c59881zpa = (C59881zpa) next;
                        if (c59881zpa.gEmmrt() && ((InterfaceC59833zoW) list.get(list.size() - 1)) == next) {
                            c59883zpc.copydefault.add(new C59889zpi(c59881zpa, c59883zpc.valueOf));
                        }
                    }
                }
                if (!AEQbTJ(next, c59883zpc)) {
                    copydefault(list, next, c59883zpc);
                    listIterator.set(null);
                }
            }
        }
    }

    public static boolean EZpvd(C59895zpo c59895zpo, java.util.ListIterator<InterfaceC59833zoW> listIterator) {
        int i = 0;
        int i2 = 0;
        while (listIterator.hasNext() && i < 3) {
            InterfaceC59833zoW next = listIterator.next();
            i++;
            if (!(next instanceof C59895zpo)) {
                break;
            }
            C59895zpo c59895zpo2 = (C59895zpo) next;
            if (!c59895zpo2.isConnected() || !copydefault(c59895zpo2, c59895zpo)) {
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < i; i3++) {
            listIterator.previous();
        }
        return i2 == 3;
    }

    public static boolean copydefault(C59895zpo c59895zpo, C59895zpo c59895zpo2) {
        return c59895zpo.fJNWhG.equals(c59895zpo2.fJNWhG) && c59895zpo.valueOf().equals(c59895zpo2.valueOf());
    }

    public final void AEQbTJ(java.util.ListIterator<InterfaceC59833zoW> listIterator, C59895zpo c59895zpo, C59883zpc c59883zpc) {
        C59895zpo c59895zpoFARcdN = c59895zpo.fARcdN();
        c59895zpoFARcdN.OLrzqt(true);
        c59895zpoFARcdN.AEQbTJ("id");
        listIterator.add(c59895zpoFARcdN);
        copydefault(c59883zpc).OLrzqt(c59895zpo.values(), listIterator.previousIndex());
    }

    public final void AEQbTJ(java.util.List list, C59883zpc c59883zpc) {
        for (java.lang.Object obj : list) {
            if (obj != null) {
                if (obj instanceof C59895zpo) {
                    C59895zpo c59895zpo = (C59895zpo) obj;
                    AEQbTJ(KWHzl().getTagInfo(c59895zpo.values()), c59895zpo, c59883zpc);
                } else if (!(obj instanceof C59881zpa) || (!"".equals(obj.toString()))) {
                }
                c59883zpc.valueOf.AEQbTJ(obj);
            }
        }
        for (C59895zpo c59895zpo2 : c59883zpc.copydefault) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                AEQbTJ();
                return;
            }
            C59895zpo c59895zpoCopydefault = c59895zpo2.copydefault();
            while (true) {
                if (c59895zpoCopydefault != null) {
                    if (c59883zpc.copydefault.contains(c59895zpoCopydefault)) {
                        break;
                    } else {
                        c59895zpoCopydefault = c59895zpoCopydefault.copydefault();
                    }
                } else {
                    c59895zpo2.KWHzl();
                    c59883zpc.AhwBna.AEQbTJ(c59895zpo2);
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C59895zpo> EZpvd(java.util.List list, Application application, java.lang.Object obj, C59883zpc c59883zpc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ListIterator listIterator = list.listIterator(application.EZpvd);
        java.lang.Object next = listIterator.next();
        C59895zpo c59895zpo = null;
        boolean z = false;
        while (true) {
            if ((obj != null || z) && (obj == null || next == obj)) {
                break;
            }
            if (java.lang.Thread.currentThread().isInterrupted()) {
                AEQbTJ();
                return arrayList;
            }
            if (EZpvd(next)) {
                C59895zpo c59895zpo2 = (C59895zpo) next;
                arrayList.add(c59895zpo2);
                java.util.List<? extends InterfaceC59833zoW> listAhwBna = c59895zpo2.AhwBna();
                if (listAhwBna != null) {
                    AEQbTJ(c59883zpc);
                    OLrzqt(listAhwBna, listAhwBna.listIterator(0), c59883zpc);
                    KWHzl(listAhwBna, c59883zpc);
                    c59895zpo2.copydefault((java.util.List<InterfaceC59833zoW>) null);
                    EZpvd(c59883zpc);
                }
                C59895zpo c59895zpoCopydefault = copydefault(c59895zpo2);
                AEQbTJ(AEQbTJ(c59895zpoCopydefault.values(), c59883zpc), c59895zpoCopydefault, c59883zpc);
                if (c59895zpo != null) {
                    c59895zpo.EZpvd(listAhwBna);
                    c59895zpo.AEQbTJ(c59895zpoCopydefault);
                    listIterator.set(null);
                } else if (listAhwBna != null) {
                    listAhwBna.add(c59895zpoCopydefault);
                    listIterator.set(listAhwBna);
                } else {
                    listIterator.set(c59895zpoCopydefault);
                }
                copydefault(c59883zpc).KWHzl(c59895zpoCopydefault.values());
                c59895zpo = c59895zpoCopydefault;
            } else if (c59895zpo != null) {
                listIterator.set(null);
                if (next != null) {
                    c59895zpo.AEQbTJ(next);
                }
            }
            if (listIterator.hasNext()) {
                next = listIterator.next();
            } else {
                z = true;
            }
        }
    }

    public final void KWHzl(java.util.List list, C59883zpc c59883zpc) {
        Application applicationKWHzl = copydefault(c59883zpc).KWHzl();
        for (Application application : copydefault(c59883zpc).AEQbTJ) {
            if (!java.lang.Thread.currentThread().isInterrupted()) {
                this.KWHzl.OLrzqt(true, (C59895zpo) list.get(application.EZpvd), ErrorType.UnclosedTag);
            } else {
                AEQbTJ();
                return;
            }
        }
        if (applicationKWHzl != null) {
            EZpvd(list, applicationKWHzl, null, c59883zpc);
        }
    }

    public final void AEQbTJ(C59894zpn c59894zpn, C59895zpo c59895zpo, C59883zpc c59883zpc) {
        if (c59894zpn == null || c59895zpo == null) {
            return;
        }
        if (c59894zpn.fetchVPNInfo() || (c59894zpn.AYXKKw() && c59883zpc.OLrzqt && !c59883zpc.KWHzl)) {
            c59883zpc.copydefault.add(c59895zpo);
        }
    }

    public void OLrzqt(C59895zpo c59895zpo, C59883zpc c59883zpc) {
        c59895zpo.EZpvd(true);
        c59883zpc.values.add(c59895zpo);
    }

    public final C59894zpn AEQbTJ(java.lang.String str, C59883zpc c59883zpc) {
        if (EZpvd(str, c59883zpc)) {
            return null;
        }
        return KWHzl().getTagInfo(str);
    }

    public final boolean copydefault(C59895zpo c59895zpo, C59883zpc c59883zpc) {
        java.util.Set<InterfaceC59902zpv> set = c59883zpc.DbNXlk;
        if (set != null) {
            for (InterfaceC59902zpv interfaceC59902zpv : set) {
                if (interfaceC59902zpv.EZpvd(c59895zpo)) {
                    OLrzqt(c59895zpo, c59883zpc);
                    this.KWHzl.AEQbTJ(interfaceC59902zpv, c59895zpo);
                    return true;
                }
            }
        }
        java.util.Set<InterfaceC59902zpv> set2 = c59883zpc.AEQbTJ;
        if (set2 == null || set2.isEmpty()) {
            return false;
        }
        java.util.Iterator<InterfaceC59902zpv> it = c59883zpc.AEQbTJ.iterator();
        while (it.hasNext()) {
            if (it.next().EZpvd(c59895zpo)) {
                return false;
            }
        }
        if (!c59895zpo.AkhnZx()) {
            this.KWHzl.KWHzl(true, c59895zpo, ErrorType.NotAllowedTag);
        }
        OLrzqt(c59895zpo, c59883zpc);
        return true;
    }

    public InterfaceC59892zpl KWHzl() {
        return this.KWHzl.AYXKKw();
    }

    public final ActionBar copydefault(C59883zpc c59883zpc) {
        return c59883zpc.AYXKKw.peek().copydefault();
    }

    public final TaskDescription KWHzl(C59883zpc c59883zpc) {
        return c59883zpc.AYXKKw.peek().AEQbTJ();
    }

    public final Activity AEQbTJ(C59883zpc c59883zpc) {
        return c59883zpc.AYXKKw.push(new Activity());
    }

    public final Activity EZpvd(C59883zpc c59883zpc) {
        return c59883zpc.AYXKKw.pop();
    }
}
