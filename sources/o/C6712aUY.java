package o;

/* JADX INFO: renamed from: o.aUY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6712aUY extends C58037yti {
    public C6712aUY(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // o.C58037yti, o.InterfaceC58039ytk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(C58038ytj c58038ytj) {
        byte b;
        super.copydefault(c58038ytj);
        if (c58038ytj == null) {
            pUU.EZpvd("Matrix.Listener", "onReportIssue is null");
            return;
        }
        pUU.EZpvd("Matrix.Listener.Issue", c58038ytj.toString());
        java.lang.String strEZpvd = c58038ytj.EZpvd();
        strEZpvd.hashCode();
        int iHashCode = strEZpvd.hashCode();
        if (iHashCode != -1864660637) {
            if (iHashCode != -1566431569) {
                b = (iHashCode == -935762161 && strEZpvd.equals("Trace_EvilMethod")) ? (byte) 2 : (byte) -1;
            } else if (strEZpvd.equals("Trace_FPS")) {
                b = 1;
            }
        } else if (strEZpvd.equals("Trace_StartUp")) {
            b = 0;
        }
        if (b == 0) {
            pUU.EZpvd("Matrix.Listener", "onReportIssue TAG_PLUGIN_STARTUP: " + c58038ytj.toString());
            if (c58038ytj.OLrzqt() != null) {
                C6700aUL c6700aUL = C6700aUL.EZpvd;
                if (c6700aUL.EZpvd() != null) {
                    c6700aUL.EZpvd().OLrzqt(c58038ytj.OLrzqt());
                    return;
                }
                return;
            }
            return;
        }
        if (b == 1) {
            pUU.EZpvd("Matrix.Listener", "onReportIssue TAG_PLUGIN_FPS: " + c58038ytj.toString());
            if (c58038ytj.OLrzqt() != null) {
                C6700aUL c6700aUL2 = C6700aUL.EZpvd;
                if (c6700aUL2.EZpvd() != null) {
                    c6700aUL2.EZpvd().EZpvd(c58038ytj.OLrzqt());
                    return;
                }
                return;
            }
            return;
        }
        if (b == 2) {
            pUU.EZpvd("Matrix.Listener", "onReportIssue TAG_PLUGIN_EVIL_METHOD: " + c58038ytj.toString());
            if (c58038ytj.OLrzqt() != null) {
                C6700aUL c6700aUL3 = C6700aUL.EZpvd;
                if (c6700aUL3.EZpvd() != null) {
                    c6700aUL3.EZpvd().AEQbTJ(c58038ytj.OLrzqt());
                    return;
                }
                return;
            }
            return;
        }
        pUU.EZpvd("Matrix.Listener", "onReportIssue other: " + c58038ytj.toString());
    }

    @Override // o.C58037yti, o.InterfaceC58039ytk
    public void copydefault(AbstractC58042ytn abstractC58042ytn) {
        pUU.KWHzl("Matrix.Listener", "%s plugin is init:" + abstractC58042ytn.EZpvd());
    }

    @Override // o.C58037yti, o.InterfaceC58039ytk
    public void OLrzqt(AbstractC58042ytn abstractC58042ytn) {
        pUU.KWHzl("Matrix.Listener", "%s plugin is started:" + abstractC58042ytn.EZpvd());
    }
}
