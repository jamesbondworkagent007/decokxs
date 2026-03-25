package o;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.oXc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36312oXc extends oWO {
    public static C36312oXc djBIcL;
    public static WeakReference<C36250oUv> gEmmrt;
    public long ejfBZ;
    public float fARcdN;
    public float fIwbmz;
    public oWL fJNWhG;
    public float fetchVPNInfo;
    public float getNewProxyInstance;
    public float hDKMBd;
    public int uzCIH;
    public final java.lang.String AkhnZx = "StateMachine";
    public boolean DbNXlk = false;
    public boolean values = false;
    public boolean isConnected = false;
    public oWO zLjUOn = new C36313oXd(this);
    public oWO AwvSrB = new C36321oXl(this);
    public oWO iwGUEr = new oWP(this);
    public oWO AubY = new C36311oXb(this);
    public oWO gHZMYf = new C36323oXn(this);
    public oWO getFieldNames = new oWQ(this);
    public oWO wlaJM = new oWZ(this);
    public oWO AxsJAY = new C36316oXg(this);
    public oWO sSMYrx = new C36319oXj(this);
    public oWO AuCTelauCTel = new C36310oXa(this);
    public oWO zsXlph = new C36315oXf(this);
    public volatile oWO AuCTel = this.zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(float f) {
        this.hDKMBd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AuCTel() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(float f) {
        this.fARcdN = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.uzCIH = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(long j) {
        this.ejfBZ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.getNewProxyInstance = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(float f) {
        this.fIwbmz = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(float f) {
        this.fetchVPNInfo = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float djBIcL() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fIwbmz() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oWL gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void getFieldNames() {
        djBIcL = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int values() {
        return this.uzCIH;
    }

    private C36312oXc() {
    }

    public int AkhnZx() {
        C36250oUv c36250oUvDbNXlk = DbNXlk();
        if (c36250oUvDbNXlk != null) {
            return android.view.ViewConfiguration.get(c36250oUvDbNXlk.getContext()).getScaledMaximumFlingVelocity();
        }
        return 0;
    }

    public void ejfBZ() {
        C36250oUv c36250oUvDbNXlk;
        if ((this.fJNWhG == null || C36246oUr.copydefault().iwGUEr().fFgQHt()) && (c36250oUvDbNXlk = DbNXlk()) != null) {
            this.fJNWhG = new oWL(c36250oUvDbNXlk);
            C36246oUr.copydefault().iwGUEr().KWHzl(false);
        }
    }

    public boolean fARcdN() {
        C36250oUv c36250oUvDbNXlk = DbNXlk();
        return c36250oUvDbNXlk != null && java.lang.Math.abs(this.uzCIH) > android.view.ViewConfiguration.get(c36250oUvDbNXlk.getContext()).getScaledMinimumFlingVelocity();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[Catch: all -> 0x001b, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000c, B:8:0x0010, B:9:0x0017), top: B:15:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C36312oXc AEQbTJ(C36250oUv c36250oUv) {
        C36312oXc c36312oXc;
        synchronized (C36312oXc.class) {
            if (c36250oUv != null) {
                gEmmrt = new WeakReference<>(c36250oUv);
                if (djBIcL == null) {
                    djBIcL = new C36312oXc();
                }
                c36312oXc = djBIcL;
            } else {
                if (djBIcL == null) {
                }
                c36312oXc = djBIcL;
            }
        }
        return c36312oXc;
    }

    public boolean fARcdN(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            return AhwBna(motionEvent);
        }
        if (action == 1) {
            return fetchVPNInfo(motionEvent);
        }
        if (action == 2) {
            return DbNXlk(motionEvent);
        }
        if (action == 3) {
            return AYXKKw(motionEvent);
        }
        if (action == 5) {
            return values(motionEvent);
        }
        if (action != 6) {
            return true;
        }
        return AkhnZx(motionEvent);
    }

    public oWO isConnected() {
        oWO owo;
        synchronized (this) {
            owo = this.AuCTel;
        }
        return owo;
    }

    @Override // o.oWO
    public boolean AhwBna(android.view.MotionEvent motionEvent) {
        return this.AuCTel.AhwBna(motionEvent);
    }

    @Override // o.oWO
    public boolean values(android.view.MotionEvent motionEvent) {
        return this.AuCTel.values(motionEvent);
    }

    @Override // o.oWO
    public boolean DbNXlk(android.view.MotionEvent motionEvent) {
        return this.AuCTel.DbNXlk(motionEvent);
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(android.view.MotionEvent motionEvent) {
        return this.AuCTel.fetchVPNInfo(motionEvent);
    }

    @Override // o.oWO
    public boolean AkhnZx(android.view.MotionEvent motionEvent) {
        return this.AuCTel.AkhnZx(motionEvent);
    }

    @Override // o.oWO
    public boolean AYXKKw(android.view.MotionEvent motionEvent) {
        return this.AuCTel.AYXKKw(motionEvent);
    }

    @Override // o.oWO
    public boolean AEQbTJ() {
        return this.AuCTel.AEQbTJ();
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        this.AuCTel.AEQbTJ(z);
    }

    @Override // o.oWO
    public void EZpvd() {
        this.AuCTel.EZpvd();
    }

    @Override // o.oWO
    public void OLrzqt() {
        this.AuCTel.OLrzqt();
    }

    public boolean EZpvd(oWO owo) {
        this.AuCTel.KWHzl();
        owo.KWHzl();
        if (djBIcL == null) {
            djBIcL = new C36312oXc();
        }
        if (djBIcL.isConnected() == owo) {
            return false;
        }
        this.AuCTel.OLrzqt();
        this.AuCTel = owo;
        this.AuCTel.EZpvd();
        return true;
    }

    @Override // o.oWO
    public java.lang.String KWHzl() {
        java.lang.String strKWHzl;
        synchronized (this) {
            strKWHzl = this.AuCTel.KWHzl();
        }
        return strKWHzl;
    }

    public C36250oUv DbNXlk() {
        return gEmmrt.get();
    }
}
