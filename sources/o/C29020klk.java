package o;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC29022klm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C29020klk<T, V extends InterfaceC29022klm<T>> extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public float AEQbTJ;
    public boolean AYXKKw;
    public C29019klj AhwBna;
    public android.os.Handler AkhnZx;
    public java.lang.Runnable DbNXlk;
    public android.view.Choreographer KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C29018kli<T, V> copydefault;
    public Choreographer.FrameCallback djBIcL;
    public long fetchVPNInfo;
    public boolean gEmmrt;
    public final Activity isConnected;
    public boolean valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29020klk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29020klk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.values > 1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.klk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29020klk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29020klk(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29020klk.KWHzl(context, this);
            }
        });
        this.valueOf = true;
        this.AhwBna = C29019klj.Companion.EZpvd();
        this.isConnected = new Activity(this);
        setupRecyclerView();
        setupAutoScrollComponents();
        setupCarouselTimeUpdates();
    }

    /* JADX INFO: renamed from: o.klk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.klk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final C23399hxW AkhnZx() {
        return (C23399hxW) this.OLrzqt.getValue();
    }

    public static final C23399hxW KWHzl(android.content.Context context, C29020klk c29020klk) {
        return C23399hxW.AEQbTJ(android.view.LayoutInflater.from(context), c29020klk, true);
    }

    /* JADX INFO: renamed from: o.klk$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public final /* synthetic */ C29020klk<T, V> copydefault;

        public Activity(C29020klk<T, V> c29020klk) {
            this.copydefault = c29020klk;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            this.copydefault.valueOf = i == 0;
            if (i == 0) {
                this.copydefault.gEmmrt = false;
                if (this.copydefault.AYXKKw) {
                    return;
                }
                this.copydefault.gEmmrt();
                return;
            }
            if (i == 1) {
                this.copydefault.gEmmrt = true;
                this.copydefault.djBIcL();
            } else {
                if (i != 2) {
                    return;
                }
                this.copydefault.gEmmrt = true;
            }
        }
    }

    public final void setupRecyclerView() {
        AkhnZx().EZpvd.addOnScrollListener(this.isConnected);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.klk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCarouselItems$default(C29020klk c29020klk, java.util.List list, Function1 function1, Function1 function12, C29019klj c29019klj, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function12 = null;
        }
        if ((i & 8) != 0) {
            c29019klj = C29019klj.Companion.EZpvd();
        }
        c29020klk.setCarouselItems(list, function1, function12, c29019klj);
    }

    public final void setCarouselItems(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super android.content.Context, ? extends V> function1, Function1<? super T, Unit> function12, @NotNull final C29019klj c29019klj) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(c29019klj, "");
        this.AhwBna = c29019klj;
        this.values = list.size();
        RecyclerView recyclerView = AkhnZx().EZpvd;
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C57583ylE(C55298xhM.dpInt$default(c29019klj.AhwBna(), (android.content.Context) null, 1, (java.lang.Object) null), false, false, 6, null));
        DbNXlk();
        this.copydefault = new C29018kli<>(list, function1, function12);
        AkhnZx().EZpvd.setAdapter(this.copydefault);
        post(new java.lang.Runnable() { // from class: o.klq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29020klk.setCarouselItems$lambda$4(this.copydefault, c29019klj);
            }
        });
    }

    public static final void setCarouselItems$lambda$4(final C29020klk c29020klk, final C29019klj c29019klj) {
        if (c29020klk.AEQbTJ()) {
            C29018kli<T, V> c29018kli = c29020klk.copydefault;
            int iOLrzqt = c29018kli != null ? c29018kli.OLrzqt() : 0;
            RecyclerView.LayoutManager layoutManager = c29020klk.AkhnZx().EZpvd.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(iOLrzqt, C55298xhM.dpInt$default(c29019klj.AhwBna(), (android.content.Context) null, 1, (java.lang.Object) null));
        }
        c29020klk.postDelayed(new java.lang.Runnable() { // from class: o.klr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29020klk.setCarouselItems$lambda$4$lambda$3(this.copydefault, c29019klj);
            }
        }, c29019klj.AEQbTJ());
    }

    public static final void setCarouselItems$lambda$4$lambda$3(C29020klk c29020klk, C29019klj c29019klj) {
        if (c29020klk.KWHzl == null || c29020klk.djBIcL == null) {
            c29020klk.setupAutoScrollComponents();
        }
        if (c29020klk.AkhnZx == null || c29020klk.DbNXlk == null) {
            c29020klk.setupCarouselTimeUpdates();
        }
        if (c29019klj.EZpvd() && c29020klk.AEQbTJ()) {
            c29020klk.gEmmrt();
        }
        if (c29019klj.copydefault()) {
            c29020klk.valueOf();
        }
    }

    public final void DbNXlk() {
        C23399hxW c23399hxWAkhnZx = AkhnZx();
        int i = this.AhwBna.valueOf() ? 0 : 8;
        c23399hxWAkhnZx.AEQbTJ.setVisibility(i);
        c23399hxWAkhnZx.copydefault.setVisibility(i);
        if (this.AhwBna.valueOf()) {
            int iDpInt$default = C55298xhM.dpInt$default(this.AhwBna.OLrzqt(), (android.content.Context) null, 1, (java.lang.Object) null);
            android.view.View view = c23399hxWAkhnZx.AEQbTJ;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = iDpInt$default;
            view.setLayoutParams(layoutParams);
            android.view.View view2 = c23399hxWAkhnZx.copydefault;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.width = iDpInt$default;
            view2.setLayoutParams(layoutParams2);
        }
    }

    public final void gEmmrt() {
        android.view.Choreographer choreographer;
        if (!this.AhwBna.EZpvd() || !AEQbTJ() || this.gEmmrt || this.copydefault == null || !isAttachedToWindow() || C22416heu.ejfBZ()) {
            return;
        }
        this.AYXKKw = false;
        djBIcL();
        this.fetchVPNInfo = 0L;
        this.AEQbTJ = 0.0f;
        Choreographer.FrameCallback frameCallback = this.djBIcL;
        if (frameCallback == null || (choreographer = this.KWHzl) == null) {
            return;
        }
        choreographer.postFrameCallback(frameCallback);
    }

    public final void AhwBna() {
        this.AYXKKw = true;
        djBIcL();
    }

    public final void djBIcL() {
        android.view.Choreographer choreographer;
        Choreographer.FrameCallback frameCallback = this.djBIcL;
        if (frameCallback != null && (choreographer = this.KWHzl) != null) {
            choreographer.removeFrameCallback(frameCallback);
        }
        this.fetchVPNInfo = 0L;
        this.AEQbTJ = 0.0f;
    }

    public final void valueOf() {
        java.lang.Runnable runnable;
        android.os.Handler handler;
        if (!this.AhwBna.copydefault() || !isAttachedToWindow() || (runnable = this.DbNXlk) == null || (handler = this.AkhnZx) == null) {
            return;
        }
        handler.post(runnable);
    }

    public final void AYXKKw() {
        android.os.Handler handler;
        java.lang.Runnable runnable = this.DbNXlk;
        if (runnable == null || (handler = this.AkhnZx) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public final void EZpvd() {
        this.AYXKKw = true;
        djBIcL();
        AYXKKw();
    }

    public final void KWHzl() {
        this.AYXKKw = false;
        if (isAttachedToWindow() && !this.gEmmrt && this.AhwBna.EZpvd() && AEQbTJ()) {
            gEmmrt();
        }
        if (isAttachedToWindow() && this.AhwBna.copydefault()) {
            valueOf();
        }
    }

    public final void setupAutoScrollComponents() {
        this.KWHzl = android.view.Choreographer.getInstance();
        this.djBIcL = new Choreographer.FrameCallback() { // from class: o.klp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.KWHzl.OLrzqt(j);
            }
        };
    }

    public final void OLrzqt(long j) {
        android.view.Choreographer choreographer;
        if (this.gEmmrt || this.AYXKKw || this.copydefault == null) {
            return;
        }
        if (!isAttachedToWindow()) {
            djBIcL();
            return;
        }
        double d = j / 1.0E9d;
        long j2 = this.fetchVPNInfo;
        double d2 = j2 == 0 ? 0.0d : d - (j2 / 1.0E9d);
        this.fetchVPNInfo = j;
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE && d2 < 0.1d) {
            float fKWHzl = this.AEQbTJ + ((float) (((double) this.AhwBna.KWHzl()) * d2));
            this.AEQbTJ = fKWHzl;
            int i = (int) fKWHzl;
            if (i > 0) {
                try {
                    AkhnZx().EZpvd.scrollBy(i, 0);
                    this.AEQbTJ -= i;
                } catch (java.lang.Exception unused) {
                    djBIcL();
                    return;
                }
            }
        }
        Choreographer.FrameCallback frameCallback = this.djBIcL;
        if (frameCallback == null || (choreographer = this.KWHzl) == null) {
            return;
        }
        choreographer.postFrameCallback(frameCallback);
    }

    public final void setupCarouselTimeUpdates() {
        this.AkhnZx = new android.os.Handler(android.os.Looper.getMainLooper());
        this.DbNXlk = new TaskDescription(this);
    }

    /* JADX INFO: renamed from: o.klk$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ C29020klk<T, V> AEQbTJ;

        public TaskDescription(C29020klk<T, V> c29020klk) {
            this.AEQbTJ = c29020klk;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.AEQbTJ.isConnected();
            android.os.Handler handler = this.AEQbTJ.AkhnZx;
            if (handler != null) {
                handler.postDelayed(this, this.AEQbTJ.AhwBna.gEmmrt());
            }
        }
    }

    public final void isConnected() {
        if (!isAttachedToWindow()) {
            AYXKKw();
            return;
        }
        try {
            RecyclerView recyclerView = AkhnZx().EZpvd;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = recyclerView.getChildAt(i);
                if (childAt instanceof InterfaceC29022klm) {
                    ((InterfaceC29022klm) childAt).KWHzl();
                }
            }
        } catch (java.lang.Exception unused) {
            AYXKKw();
        }
    }

    public final void copydefault() {
        AhwBna();
        this.KWHzl = null;
        this.djBIcL = null;
    }

    public final void OLrzqt() {
        AYXKKw();
        this.AkhnZx = null;
        this.DbNXlk = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AkhnZx().EZpvd.removeOnScrollListener(this.isConnected);
        copydefault();
        OLrzqt();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AkhnZx().EZpvd.addOnScrollListener(this.isConnected);
        if (this.KWHzl == null || this.djBIcL == null) {
            setupAutoScrollComponents();
        }
        if (this.AkhnZx == null || this.DbNXlk == null) {
            setupCarouselTimeUpdates();
        }
        if (this.AhwBna.EZpvd() && AEQbTJ()) {
            gEmmrt();
        }
        if (this.AhwBna.copydefault()) {
            valueOf();
        }
    }
}
