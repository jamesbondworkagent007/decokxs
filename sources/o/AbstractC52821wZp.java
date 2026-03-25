package o;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc;

/* JADX INFO: renamed from: o.wZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52821wZp implements ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Activity {
    public float EZpvd;
    public float OLrzqt;
    public float copydefault;

    public abstract void AEQbTJ(RectF rectF, float f, float f2);

    public abstract void EZpvd(android.graphics.Bitmap bitmap, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent);

    public AbstractC52821wZp(float f, float f2, float f3) {
        this.OLrzqt = f;
        this.copydefault = f2;
        this.EZpvd = f3;
    }

    @Override // o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Activity
    public void copydefault(android.graphics.Bitmap bitmap, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        Intrinsics.copydefault(pendingIntent);
        AEQbTJ(pendingIntent.OLrzqt(), this.OLrzqt, this.copydefault);
        EZpvd(bitmap, pendingIntent);
    }
}
