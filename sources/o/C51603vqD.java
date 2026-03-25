package o;

import android.view.GestureDetector;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51603vqD extends RecyclerView {
    public final java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public final Activity AhwBna;
    public float EZpvd;
    public float KWHzl;
    public final android.view.GestureDetector OLrzqt;
    public boolean copydefault;
    public final Application djBIcL;
    public final int gEmmrt;
    public final android.os.Handler valueOf;

    /* JADX INFO: renamed from: o.vqD$StateListAnimator */
    public static final class StateListAnimator extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51603vqD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, @NotNull java.lang.String str) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.valueOf = new android.os.Handler(android.os.Looper.getMainLooper());
        this.djBIcL = new Application(context);
        this.AhwBna = new Activity();
        this.OLrzqt = new android.view.GestureDetector(context, new StateListAnimator());
        addOnItemTouchListener(new RecyclerView.OnItemTouchListener() { // from class: o.vqD.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onRequestDisallowInterceptTouchEvent(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                Intrinsics.checkNotNullParameter(motionEvent, "");
                return C51603vqD.this.OLrzqt.onTouchEvent(motionEvent);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                Intrinsics.checkNotNullParameter(motionEvent, "");
                C51603vqD.this.OLrzqt.onTouchEvent(motionEvent);
            }
        });
        this.gEmmrt = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: o.vqD$Application */
    public static final class Application implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context KWHzl;

        public Application(android.content.Context context) {
            this.KWHzl = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C51603vqD.this.smoothScrollBy(C55296xhK.OLrzqt(this.KWHzl) ? -5 : 5, 0);
            C51603vqD.this.valueOf.postDelayed(this, 50L);
        }
    }

    /* JADX INFO: renamed from: o.vqD$Activity */
    public static final class Activity implements java.lang.Runnable {
        public Activity() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter;
            if (C51603vqD.this.AYXKKw || (adapter = C51603vqD.this.getAdapter()) == null || adapter.getItemCount() <= 1) {
                return;
            }
            C51603vqD c51603vqD = C51603vqD.this;
            c51603vqD.smoothScrollBy(0, c51603vqD.getHeight() / 2);
            C51603vqD.this.valueOf.postDelayed(this, 3000L);
        }
    }

    public final void AEQbTJ() {
        this.valueOf.post(this.djBIcL);
    }

    public final void copydefault() {
        this.valueOf.removeCallbacks(this.djBIcL);
    }

    public final void EZpvd() {
        this.valueOf.post(this.AhwBna);
    }

    public final void OLrzqt() {
        this.valueOf.removeCallbacks(this.AhwBna);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        copydefault();
        OLrzqt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View viewFindChildViewUnder;
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "h")) {
                copydefault();
            } else {
                OLrzqt();
            }
            this.EZpvd = motionEvent.getX();
            this.KWHzl = motionEvent.getY();
            this.copydefault = false;
        } else if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
            if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "h")) {
                AEQbTJ();
            } else {
                EZpvd();
            }
            if (motionEvent.getAction() == 1 && !this.copydefault && (viewFindChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY())) != null) {
                viewFindChildViewUnder.performClick();
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float x = motionEvent.getX();
            float f = this.EZpvd;
            float y = motionEvent.getY();
            float f2 = this.KWHzl;
            if (java.lang.Math.abs(x - f) > this.gEmmrt || java.lang.Math.abs(y - f2) > this.gEmmrt) {
                this.copydefault = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
