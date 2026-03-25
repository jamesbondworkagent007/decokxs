package o;

/* JADX INFO: renamed from: o.myW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33546myW extends C57869yqZ {
    public long AEQbTJ;
    public boolean EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNoMoreDataEffective(boolean z) {
        this.fFgQHt = z;
    }

    public C33546myW(android.content.Context context) {
        super(context);
        this.KWHzl = 0;
        this.AEQbTJ = 0L;
        this.EZpvd = false;
    }

    public C33546myW(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = 0;
        this.AEQbTJ = 0L;
        this.EZpvd = false;
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl OLrzqt(InterfaceC57903yrG interfaceC57903yrG) {
        return super.OLrzqt(new Application(interfaceC57903yrG));
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl OLrzqt(InterfaceC57901yrE interfaceC57901yrE) {
        return super.OLrzqt((InterfaceC57901yrE) new TaskDescription(interfaceC57901yrE));
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl copydefault() {
        this.EZpvd = false;
        return KWHzl(false);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(boolean z) {
        this.EZpvd = z;
        return super.KWHzl(z && this.fFgQHt);
    }

    private int EZpvd() {
        long jCurrentTimeMillis = 0 - (java.lang.System.currentTimeMillis() - this.AEQbTJ);
        if (jCurrentTimeMillis > 0) {
            return (int) jCurrentTimeMillis;
        }
        return 0;
    }

    @Override // o.C57869yqZ, o.InterfaceC57934yrl
    public InterfaceC57934yrl AEQbTJ() {
        return super.KWHzl(EZpvd(), true, java.lang.Boolean.FALSE);
    }

    public InterfaceC57934yrl copydefault(java.lang.Boolean bool) {
        return super.KWHzl(EZpvd(), true, bool);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(int i) {
        if (this.gwTjWJ == null) {
            i = 0;
        }
        return super.KWHzl(java.lang.Math.max(EZpvd(), i));
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl AEQbTJ(boolean z) {
        return super.KWHzl(EZpvd(), z, java.lang.Boolean.FALSE);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl KWHzl(int i, boolean z, java.lang.Boolean bool) {
        return super.KWHzl(java.lang.Math.max(EZpvd(), i), z, bool);
    }

    @Override // o.C57869yqZ
    public InterfaceC57934yrl OLrzqt() {
        return super.KWHzl(EZpvd(), true, java.lang.Boolean.FALSE);
    }

    /* JADX INFO: renamed from: o.myW$Application */
    public class Application implements InterfaceC57903yrG {
        public InterfaceC57903yrG AEQbTJ;

        public Application(InterfaceC57903yrG interfaceC57903yrG) {
            this.AEQbTJ = interfaceC57903yrG;
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
            C33546myW.this.AEQbTJ = java.lang.System.currentTimeMillis();
            this.AEQbTJ.copydefault(interfaceC57934yrl);
        }
    }

    /* JADX INFO: renamed from: o.myW$TaskDescription */
    public class TaskDescription implements InterfaceC57901yrE {
        public InterfaceC57901yrE OLrzqt;

        public TaskDescription(InterfaceC57901yrE interfaceC57901yrE) {
            this.OLrzqt = interfaceC57901yrE;
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
            this.OLrzqt.EZpvd(interfaceC57934yrl);
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
            C33546myW.this.AEQbTJ = java.lang.System.currentTimeMillis();
            this.OLrzqt.copydefault(interfaceC57934yrl);
        }
    }
}
