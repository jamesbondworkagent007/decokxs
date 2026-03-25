package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8155axR extends C7781aqM {
    public static final Activity Companion = new Activity(null);
    public static final int isConnected = 8;
    public float AkhnZx;
    public int AuCTel;
    public float DbNXlk;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public float fetchVPNInfo;
    public int getNewProxyInstance;
    public int iwGUEr;
    public int uzCIH;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.ejfBZ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlideMode(int i) {
        this.uzCIH = i;
    }

    /* JADX INFO: renamed from: o.axR$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.axR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8155axR(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.fIwbmz = -1;
        this.getNewProxyInstance = 300;
        this.DbNXlk = 0.3f;
        this.values = 0.7f;
        this.AkhnZx = 1.0f;
        this.iwGUEr = 50;
        this.uzCIH = 1;
        gEmmrt();
    }

    /* JADX INFO: renamed from: o.axR$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            C8155axR.this.fJNWhG = i;
        }
    }

    public final void gEmmrt() {
        addOnScrollListener(new Application());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent != null ? motionEvent.getActionIndex() : 0;
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.fIwbmz = motionEvent.getPointerId(0);
            this.fARcdN = (int) (motionEvent.getX(0) + 0.5f);
            int y = (int) (motionEvent.getY(0) + 0.5f);
            this.AuCTel = y;
            copydefault("down", actionIndex, this.fIwbmz, y);
        } else if (numValueOf != null && numValueOf.intValue() == 5) {
            this.fIwbmz = motionEvent.getPointerId(actionIndex);
            this.fARcdN = (int) (motionEvent.getX(actionIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.AuCTel = y2;
            copydefault("point_down", actionIndex, this.fIwbmz, y2);
        } else if (numValueOf != null && numValueOf.intValue() == 6) {
            copydefault("point_up1", actionIndex, motionEvent.getPointerId(actionIndex), (int) (motionEvent.getY(actionIndex) + 0.5f));
            if (motionEvent.getPointerId(actionIndex) == this.fIwbmz) {
                int i = actionIndex == 0 ? 1 : 0;
                this.fIwbmz = motionEvent.getPointerId(i);
                this.fARcdN = (int) (motionEvent.getX(i) + 0.5f);
                int y3 = (int) (motionEvent.getY(i) + 0.5f);
                this.AuCTel = y3;
                copydefault("point_up2", i, this.fIwbmz, y3);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            copydefault("up", actionIndex, motionEvent.getPointerId(actionIndex), y4);
            int i2 = this.fARcdN;
            int i3 = y4 - this.AuCTel;
            if (java.lang.Math.abs(i3) >= java.lang.Math.abs(x - i2) && java.lang.Math.abs(i3) >= this.iwGUEr) {
                int i4 = this.uzCIH;
                if (i4 == 0) {
                    copydefault(i3 < 0);
                } else if (i4 == 1) {
                    EZpvd(i3 < 0);
                } else {
                    EZpvd(i3 < 0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void copydefault(boolean z) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition == -1) {
                pUU.KWHzl("AnnualBillRecyclerView", "showNextOrBefore no position");
                return;
            }
            int height = linearLayoutManager.getHeight();
            if (z) {
                RecyclerView.Adapter adapter = getAdapter();
                if (iFindFirstCompletelyVisibleItemPosition < (adapter != null ? adapter.getItemCount() : 0) - 1) {
                    OLrzqt(true, height);
                    return;
                }
                return;
            }
            if (iFindFirstCompletelyVisibleItemPosition > 0) {
                RecyclerView.Adapter adapter2 = getAdapter();
                if (iFindFirstCompletelyVisibleItemPosition < (adapter2 != null ? adapter2.getItemCount() : 0)) {
                    OLrzqt(false, height);
                }
            }
        }
    }

    public final void EZpvd(final boolean z) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            if (this.fJNWhG != 0) {
                pUU.KWHzl("AnnualBillRecyclerView", "showNextOrBeforeNew: rv is dragging or scrolling");
                return;
            }
            final android.view.View childAt = linearLayoutManager.getChildAt(0);
            final int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (childAt == null || iFindFirstVisibleItemPosition == -1) {
                pUU.KWHzl("AnnualBillRecyclerView", "showNextOrBeforeNew: NO_POSITION");
            } else {
                childAt.post(new java.lang.Runnable() { // from class: o.axV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8155axR.copydefault(childAt, z, this, iFindFirstVisibleItemPosition);
                    }
                });
            }
        }
    }

    public static final void copydefault(android.view.View view, boolean z, C8155axR c8155axR, int i) {
        int height = view.getHeight();
        if (z) {
            if (!c8155axR.canScrollVertically(1)) {
                pUU.KWHzl("AnnualBillRecyclerView", "showNextOrBeforeNew: can not scroll up");
                return;
            }
            RecyclerView.Adapter adapter = c8155axR.getAdapter();
            if (i < (adapter != null ? adapter.getItemCount() : 0) - 1) {
                c8155axR.OLrzqt(true, height);
                return;
            }
            return;
        }
        if (!c8155axR.canScrollVertically(-1)) {
            pUU.KWHzl("AnnualBillRecyclerView", "showNextOrBeforeNew: can not scroll down");
        } else if (i >= 0) {
            RecyclerView.Adapter adapter2 = c8155axR.getAdapter();
            if (i < (adapter2 != null ? adapter2.getItemCount() : 0)) {
                c8155axR.OLrzqt(false, height);
            }
        }
    }

    public final void OLrzqt(boolean z, int i) {
        smoothScrollBy(0, z ? i : -i, new android.view.animation.PathInterpolator(this.DbNXlk, this.fetchVPNInfo, this.values, this.AkhnZx), this.getNewProxyInstance);
        int i2 = this.ejfBZ;
        this.ejfBZ = z ? i2 + 1 : i2 - 1;
        pUU.KWHzl("AnnualBillRecyclerView", "next=" + z + ",dy=" + i + ",currentIndex=" + this.ejfBZ);
    }

    public final void copydefault(java.lang.String str, int i, int i2, int i3) {
        pUU.KWHzl("AnnualBillRecyclerView", str + ",index=" + i + ",id=" + i2 + ",y=" + i3);
    }

    public final void OLrzqt(float f, @NotNull C7348aiD c7348aiD, @NotNull C7348aiD c7348aiD2, int i) {
        Intrinsics.checkNotNullParameter(c7348aiD, "");
        Intrinsics.checkNotNullParameter(c7348aiD2, "");
        if (f > 0.0f) {
            this.getNewProxyInstance = C33129mqd.AhwBna(java.lang.Float.valueOf(f * 1000));
        }
        this.DbNXlk = c7348aiD.KWHzl();
        this.fetchVPNInfo = c7348aiD.EZpvd();
        this.values = c7348aiD2.KWHzl();
        this.AkhnZx = c7348aiD2.EZpvd();
        if (i > 0) {
            this.iwGUEr = i;
        }
    }
}
