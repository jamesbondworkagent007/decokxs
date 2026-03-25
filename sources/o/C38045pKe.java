package o;

/* JADX INFO: renamed from: o.pKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C38045pKe {
    public long AEQbTJ;
    public float AYXKKw;
    public int AhwBna;
    public boolean EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float copydefault;
    public long djBIcL;
    public float gEmmrt;
    public float isConnected;
    public long valueOf;

    public void OLrzqt(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        this.AhwBna = motionEvent.getPointerId(actionIndex);
        long downTime = motionEvent.getDownTime();
        this.djBIcL = downTime;
        this.AEQbTJ = downTime;
        float x = motionEvent.getX(actionIndex);
        this.OLrzqt = x;
        this.KWHzl = x;
        float y = motionEvent.getY(actionIndex);
        this.gEmmrt = y;
        this.copydefault = y;
    }

    public void KWHzl(android.view.MotionEvent motionEvent) {
        this.valueOf = motionEvent.getEventTime();
        int actionIndex = motionEvent.getActionIndex();
        this.AYXKKw = motionEvent.getX(actionIndex);
        this.isConnected = motionEvent.getY(actionIndex);
        this.EZpvd = java.lang.Math.abs(this.KWHzl - this.AYXKKw) < ((float) pJI.EZpvd) && java.lang.Math.abs(this.copydefault - this.isConnected) < ((float) pJI.EZpvd);
    }
}
