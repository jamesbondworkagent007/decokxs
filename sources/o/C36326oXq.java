package o;

/* JADX INFO: renamed from: o.oXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C36326oXq {
    public static float copydefault(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x * x) + (y * y));
    }
}
