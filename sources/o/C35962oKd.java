package o;

/* JADX INFO: renamed from: o.oKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C35962oKd {
    public InterfaceC35961oKc EZpvd;
    public boolean KWHzl;
    public java.util.HashMap<java.lang.String, java.lang.Class<? extends InterfaceC35960oKb>> OLrzqt;
    public java.util.HashMap<java.lang.String, InterfaceC35960oKb> copydefault;

    /* JADX INFO: renamed from: o.oKd$Application */
    public static class Application {
        public static C35962oKd EZpvd = new C35962oKd();

        private Application() {
        }
    }

    public static C35962oKd EZpvd() {
        return Application.EZpvd;
    }

    public static void copydefault(oJZ ojz, java.lang.String str) {
        Application.EZpvd.KWHzl(ojz, str);
    }

    private C35962oKd() {
        this.OLrzqt = new java.util.HashMap<>();
        this.copydefault = new java.util.HashMap<>();
    }

    public final com.okinc.jsbridge.Message KWHzl(java.lang.String str) {
        if (this.KWHzl) {
            return this.EZpvd.AEQbTJ(str);
        }
        return null;
    }

    public final void KWHzl(oJZ ojz, java.lang.String str) {
        KWHzl(ojz, KWHzl(str));
    }

    public final void KWHzl(oJZ ojz, com.okinc.jsbridge.Message message) {
        if (message == null) {
            return;
        }
        if (this.copydefault.containsKey(message.uri)) {
            this.copydefault.get(message.uri).EZpvd(ojz, message);
            return;
        }
        if (this.OLrzqt.containsKey(message.uri)) {
            InterfaceC35960oKb interfaceC35960oKbEZpvd = ojz.EZpvd(this.OLrzqt.get(message.uri));
            if (interfaceC35960oKbEZpvd == null) {
                try {
                    interfaceC35960oKbEZpvd = this.OLrzqt.get(message.uri).newInstance();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    java.lang.String str = message.uri;
                    return;
                }
            }
            if (interfaceC35960oKbEZpvd != null) {
                interfaceC35960oKbEZpvd.EZpvd(ojz, message);
            }
        }
    }

    /* JADX INFO: renamed from: o.oKd$ActionBar */
    public static class ActionBar {
        public C35962oKd EZpvd = C35962oKd.EZpvd();

        public static ActionBar copydefault() {
            return new ActionBar();
        }

        private ActionBar() {
        }

        public ActionBar copydefault(java.lang.String str, java.lang.Class<? extends InterfaceC35960oKb> cls) {
            if (cls != null) {
                this.EZpvd.OLrzqt.put(str, cls);
            }
            return this;
        }

        public ActionBar AEQbTJ(InterfaceC35961oKc interfaceC35961oKc) {
            this.EZpvd.EZpvd = interfaceC35961oKc;
            return this;
        }

        public void EZpvd() {
            if (this.EZpvd.EZpvd != null) {
                this.EZpvd.KWHzl = true;
            }
        }
    }
}
