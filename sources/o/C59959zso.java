package o;

/* JADX INFO: renamed from: o.zso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59959zso {
    public InterfaceC59958zsn AEQbTJ;

    public C59959zso(InterfaceC59958zsn interfaceC59958zsn) {
        this.AEQbTJ = interfaceC59958zsn;
    }

    public void OLrzqt(AbstractC59916zrY abstractC59916zrY) {
        AbstractC59916zrY abstractC59916zrYCopydefault = abstractC59916zrY;
        int i = 0;
        while (abstractC59916zrYCopydefault != null) {
            this.AEQbTJ.copydefault(abstractC59916zrYCopydefault, i);
            if (abstractC59916zrYCopydefault.AkhnZx() > 0) {
                abstractC59916zrYCopydefault = abstractC59916zrYCopydefault.copydefault(0);
                i++;
            } else {
                while (abstractC59916zrYCopydefault.fIwbmz() == null && i > 0) {
                    this.AEQbTJ.EZpvd(abstractC59916zrYCopydefault, i);
                    abstractC59916zrYCopydefault = abstractC59916zrYCopydefault.AhwBna();
                    i--;
                }
                this.AEQbTJ.EZpvd(abstractC59916zrYCopydefault, i);
                if (abstractC59916zrYCopydefault == abstractC59916zrY) {
                    return;
                } else {
                    abstractC59916zrYCopydefault = abstractC59916zrYCopydefault.fIwbmz();
                }
            }
        }
    }
}
