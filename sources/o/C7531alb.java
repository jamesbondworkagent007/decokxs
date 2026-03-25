package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.alb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7531alb {
    public long[] AEQbTJ;

    public final void OLrzqt(int i, int i2) {
        if (i == 0) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new long[10];
            }
            long j = i2;
            this.AEQbTJ[0] = (j << 32) | j;
            return;
        }
        int i3 = i - 1;
        long[] jArr = this.AEQbTJ;
        if (jArr == null || jArr.length <= i3) {
            return;
        }
        long j2 = jArr[i3];
        if (j2 == 0) {
            return;
        }
        if (jArr.length == i) {
            copydefault();
        }
        long[] jArr2 = this.AEQbTJ;
        long j3 = i2;
        if ((jArr2[i] >>> 32) != j3) {
            jArr2[i] = ((j2 & BodyPartID.bodyIdMax) + j3) | (j3 << 32);
        }
    }

    public final void copydefault() {
        long[] jArr = this.AEQbTJ;
        long[] jArr2 = new long[jArr.length + 10];
        this.AEQbTJ = jArr2;
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
    }

    public void AEQbTJ(LinearLayoutManager linearLayoutManager, android.view.View view) {
        OLrzqt(linearLayoutManager.getPosition(view), view.getMeasuredHeight());
    }

    public int EZpvd(LinearLayoutManager linearLayoutManager) {
        int iFindFirstVisibleItemPosition;
        android.view.View viewFindViewByPosition;
        if (linearLayoutManager.getChildCount() == 0 || this.AEQbTJ == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) < 0 || iFindFirstVisibleItemPosition >= this.AEQbTJ.length || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return 0;
        }
        return (int) (((long) (-((int) viewFindViewByPosition.getY()))) + (iFindFirstVisibleItemPosition == 0 ? 0L : this.AEQbTJ[iFindFirstVisibleItemPosition - 1] & BodyPartID.bodyIdMax));
    }
}
