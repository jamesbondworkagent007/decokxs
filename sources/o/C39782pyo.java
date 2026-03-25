package o;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39782pyo extends android.widget.LinearLayout {
    public pAL AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public int OLrzqt;
    public RectF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsHeight(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsRect(RectF rectF) {
        this.copydefault = rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(pAL pal) {
        this.AEQbTJ = pal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPanelClickListener(@NotNull pAL pal) {
        Intrinsics.checkNotNullParameter(pal, "");
        this.AEQbTJ = pal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39782pyo(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && C36246oUr.copydefault().QVAiDq() == 0) {
            if (this.copydefault == null) {
                if (C36246oUr.copydefault().QKudOq() == 0) {
                    this.OLrzqt = AEQbTJ(20.0f);
                } else {
                    this.OLrzqt = AEQbTJ(40.0f);
                }
                this.copydefault = new RectF(C33129mqd.djBIcL(java.lang.Integer.valueOf(getLeft())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom() - this.OLrzqt)), C33129mqd.djBIcL(java.lang.Integer.valueOf(getRight())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom())));
            }
            RectF rectF = this.copydefault;
            if (rectF != null) {
                if (C36246oUr.copydefault().UrRBLY() && C36246oUr.copydefault().fARcdN() != null) {
                    if (rectF.contains(motionEvent != null ? motionEvent.getX() : 0.0f, motionEvent != null ? motionEvent.getY() : 0.0f)) {
                        pAL pal = this.AEQbTJ;
                        if (pal != null) {
                            pal.AEQbTJ(this.KWHzl);
                        }
                        return true;
                    }
                }
                if (C36246oUr.copydefault().UrRBLY()) {
                    pAL pal2 = this.AEQbTJ;
                    if (pal2 != null) {
                        pal2.AEQbTJ(this.EZpvd);
                    }
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int AEQbTJ(float f) {
        return (int) android.util.TypedValue.applyDimension(1, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }
}
