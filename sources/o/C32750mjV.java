package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32726miy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32750mjV extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;
    public C32683miH AYXKKw;
    public java.lang.Runnable EZpvd;
    public android.os.Handler OLrzqt;
    public int KWHzl = 3;
    public final java.lang.String gEmmrt = C33070mpX.AYXKKw(C32726miy.Dialog.AuCTel);

    /* JADX INFO: renamed from: o.mjV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjV$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32750mjV newInstance$default(Application application, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return application.KWHzl(function0);
        }

        public final C32750mjV KWHzl(Function0<Unit> function0) {
            C32750mjV c32750mjV = new C32750mjV();
            c32750mjV.AEQbTJ = function0;
            return c32750mjV;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(9);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C32683miH c32683miHCopydefault = C32683miH.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.AYXKKw = c32683miHCopydefault;
        C32683miH c32683miH = null;
        if (c32683miHCopydefault == null) {
            Intrinsics.gEmmrt("");
            c32683miHCopydefault = null;
        }
        wYF wyf = c32683miHCopydefault.OLrzqt;
        if (wyf != null) {
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setTextSize(2, 14.0f);
                c52794wYpAEQbTJ.setVisibility(0);
                c52794wYpAEQbTJ.setClickable(false);
                c52794wYpAEQbTJ.setEnabled(false);
                c52794wYpAEQbTJ.setText(C33069mpW.copydefault(this, C32726miy.Dialog.ejfBZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(this.KWHzl)))));
                c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(257);
                c52794wYpCopydefault.setTextSize(2, 14.0f);
                c52794wYpCopydefault.setVisibility(0);
                c52794wYpCopydefault.setClickable(true);
                c52794wYpCopydefault.setEnabled(true);
                c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.fIwbmz));
                c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
            }
        }
        C32683miH c32683miH2 = this.AYXKKw;
        if (c32683miH2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32683miH = c32683miH2;
        }
        constraintLayout.addView(c32683miH.getRoot());
        copydefault();
    }

    /* JADX INFO: renamed from: o.mjV$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public TaskDescription() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C52794wYp c52794wYpAEQbTJ;
            C52794wYp c52794wYpAEQbTJ2;
            C32683miH c32683miH = null;
            if (C32750mjV.this.KWHzl > 0) {
                C32683miH c32683miH2 = C32750mjV.this.AYXKKw;
                if (c32683miH2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c32683miH = c32683miH2;
                }
                wYF wyf = c32683miH.OLrzqt;
                if (wyf != null && (c52794wYpAEQbTJ2 = wyf.AEQbTJ()) != null) {
                    C32750mjV c32750mjV = C32750mjV.this;
                    c52794wYpAEQbTJ2.setOKDSType(262);
                    c52794wYpAEQbTJ2.setTextSize(2, 14.0f);
                    c52794wYpAEQbTJ2.setText(C33069mpW.copydefault(c32750mjV, C32726miy.Dialog.ejfBZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(c32750mjV.KWHzl)))));
                }
                C32750mjV.this.KWHzl--;
                android.os.Handler handler = C32750mjV.this.OLrzqt;
                if (handler != null) {
                    handler.postDelayed(this, 1000L);
                    return;
                }
                return;
            }
            C32683miH c32683miH3 = C32750mjV.this.AYXKKw;
            if (c32683miH3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c32683miH = c32683miH3;
            }
            wYF wyf2 = c32683miH.OLrzqt;
            if (wyf2 == null || (c52794wYpAEQbTJ = wyf2.AEQbTJ()) == null) {
                return;
            }
            c52794wYpAEQbTJ.setText(C32750mjV.this.gEmmrt);
            c52794wYpAEQbTJ.setClickable(true);
            c52794wYpAEQbTJ.setEnabled(true);
        }
    }

    private final void copydefault() {
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
        TaskDescription taskDescription = new TaskDescription();
        this.EZpvd = taskDescription;
        android.os.Handler handler = this.OLrzqt;
        if (handler != null) {
            Intrinsics.copydefault(taskDescription);
            handler.post(taskDescription);
        }
    }

    private final void EZpvd() {
        android.os.Handler handler;
        java.lang.Runnable runnable = this.EZpvd;
        if (runnable != null && (handler = this.OLrzqt) != null) {
            handler.removeCallbacks(runnable);
        }
        this.OLrzqt = null;
        this.EZpvd = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EZpvd();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.mjV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C32750mjV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C32750mjV c32750mjV) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c32750mjV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.mjV$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C32750mjV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C32750mjV c32750mjV) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c32750mjV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0 function0 = this.copydefault.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mjV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C32750mjV KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C32750mjV c32750mjV) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c32750mjV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
