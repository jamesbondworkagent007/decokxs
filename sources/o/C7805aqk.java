package o;

import android.os.Build;

/* JADX INFO: renamed from: o.aqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7805aqk extends C7808aqn {
    public static final android.graphics.Rect fetchVPNInfo = new android.graphics.Rect();

    @Override // o.C7806aql
    public void copydefault(android.graphics.Canvas canvas) {
        if (this.AuCTel <= 0.0f || this.AkhnZx.isEmpty()) {
            return;
        }
        canvas.getClipBounds(fetchVPNInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.translate(r0.left, r0.top);
            canvas.drawPath(this.AkhnZx, this.values);
            canvas.translate(-r0.left, -r0.top);
            canvas.restore();
            return;
        }
        this.DbNXlk.offset(r0.left, r0.top);
        int iSaveLayer = canvas.saveLayer(this.DbNXlk, null, 31);
        this.DbNXlk.offset(-r0.left, -r0.top);
        canvas.drawPath(this.AkhnZx, this.values);
        canvas.restoreToCount(iSaveLayer);
    }
}
