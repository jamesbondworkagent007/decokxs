package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32726miy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32747mjS extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public Function0<Unit> AEQbTJ;
    public C32685miJ AhwBna;
    public android.os.Handler KWHzl;
    public java.lang.Runnable OLrzqt;
    public int copydefault = 3;
    public final java.lang.String djBIcL = C33070mpX.AYXKKw(C32726miy.Dialog.AkhnZx);
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        int i = this.gEmmrt;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: o.mjS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjS$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32747mjS newInstance$default(Activity activity, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return activity.OLrzqt(z, function0);
        }

        public final C32747mjS OLrzqt(boolean z, Function0<Unit> function0) {
            C32747mjS c32747mjS = new C32747mjS();
            c32747mjS.AEQbTJ = function0;
            c32747mjS.gEmmrt = z ? 1 : 0;
            return c32747mjS;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjS$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32747mjS newInstance$default(Activity activity, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                function0 = null;
            }
            return activity.AEQbTJ(i, function0);
        }

        public final C32747mjS AEQbTJ(int i, Function0<Unit> function0) {
            C32747mjS c32747mjS = new C32747mjS();
            c32747mjS.AEQbTJ = function0;
            c32747mjS.gEmmrt = i;
            return c32747mjS;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        int i = this.gEmmrt;
        if (i == 3 || i == 4) {
            return;
        }
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        int i = this.gEmmrt;
        if (i == 3 || i == 4) {
            wxq.setStyle(1);
            wxq.setCloseVisibility(true);
            wxq.AEQbTJ().setVisibility(8);
            android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
            imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C32685miJ c32685miJAEQbTJ = C32685miJ.AEQbTJ(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.AhwBna = c32685miJAEQbTJ;
        C32685miJ c32685miJ = null;
        if (c32685miJAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c32685miJAEQbTJ = null;
        }
        int i = this.gEmmrt;
        if (i == 0) {
            c32685miJAEQbTJ.AEQbTJ.setVisibility(8);
            c32685miJAEQbTJ.djBIcL.setGravity(8388611);
            c32685miJAEQbTJ.djBIcL.setTextSize(2, 24.0f);
            c32685miJAEQbTJ.EZpvd.setOKDSType(257);
            c32685miJAEQbTJ.EZpvd.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AkhnZx));
            C52794wYp c52794wYp = c32685miJAEQbTJ.EZpvd;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
            c32685miJAEQbTJ.EZpvd.setVisibility(0);
            c32685miJAEQbTJ.EZpvd.setClickable(false);
            c32685miJAEQbTJ.EZpvd.setEnabled(false);
            wYK wyk = c32685miJAEQbTJ.copydefault;
            wyk.setVisibility(0);
            wyk.setChecked(false);
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mjX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C32747mjS.copydefault(this.copydefault, c32685miJAEQbTJ, compoundButton, z);
                }
            });
        } else if (i == 1) {
            c32685miJAEQbTJ.AEQbTJ.setVisibility(8);
            c32685miJAEQbTJ.djBIcL.setText(C33070mpX.AYXKKw(C32726miy.Dialog.fJNWhG));
            c32685miJAEQbTJ.djBIcL.setTextSize(2, 18.0f);
            c32685miJAEQbTJ.valueOf.setText(C33070mpX.AYXKKw(C32726miy.Dialog.DbNXlk));
            c32685miJAEQbTJ.valueOf.setGravity(17);
            c32685miJAEQbTJ.gEmmrt.setVisibility(0);
            c32685miJAEQbTJ.EZpvd.setVisibility(8);
            wYF wyf = c32685miJAEQbTJ.OLrzqt;
            wyf.setVisibility(0);
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(262);
                c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.values));
                c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
                c52794wYpCopydefault.setClickable(true);
                c52794wYpCopydefault.setEnabled(true);
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.fetchVPNInfo));
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
            }
            c32685miJAEQbTJ.copydefault.setVisibility(8);
        } else if (i == 3 || i == 4) {
            c32685miJAEQbTJ.djBIcL.setText(C33070mpX.AYXKKw(C32726miy.Dialog.djBIcL));
            c32685miJAEQbTJ.djBIcL.setTextSize(2, 20.0f);
            c32685miJAEQbTJ.djBIcL.setGravity(8388611);
            c32685miJAEQbTJ.valueOf.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AYXKKw));
            c32685miJAEQbTJ.valueOf.setGravity(8388611);
            c32685miJAEQbTJ.AEQbTJ.setVisibility(0);
            c32685miJAEQbTJ.gEmmrt.setVisibility(8);
            c32685miJAEQbTJ.copydefault.setVisibility(8);
            c32685miJAEQbTJ.EZpvd.setVisibility(8);
            c32685miJAEQbTJ.OLrzqt.setVisibility(8);
        }
        C32685miJ c32685miJ2 = this.AhwBna;
        if (c32685miJ2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32685miJ = c32685miJ2;
        }
        constraintLayout.addView(c32685miJ.getRoot());
    }

    public static final void copydefault(C32747mjS c32747mjS, C32685miJ c32685miJ, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            c32747mjS.AEQbTJ();
            return;
        }
        c32747mjS.EZpvd();
        c32685miJ.EZpvd.setText(c32747mjS.djBIcL);
        c32685miJ.EZpvd.setClickable(false);
        c32685miJ.EZpvd.setEnabled(false);
    }

    /* JADX INFO: renamed from: o.mjS$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C32747mjS EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C32747mjS c32747mjS) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C32747mjS AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C32747mjS c32747mjS) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C32747mjS EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C32747mjS c32747mjS) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C32747mjS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C32747mjS c32747mjS) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C32747mjS KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C32747mjS c32747mjS) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C32747mjS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C32747mjS c32747mjS) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.mjS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C32747mjS KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C32747mjS c32747mjS) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c32747mjS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    private final void AEQbTJ() {
        this.KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
        this.copydefault = 3;
        Dialog dialog = new Dialog();
        this.OLrzqt = dialog;
        android.os.Handler handler = this.KWHzl;
        if (handler != null) {
            Intrinsics.copydefault(dialog);
            handler.post(dialog);
        }
    }

    /* JADX INFO: renamed from: o.mjS$Dialog */
    public static final class Dialog implements java.lang.Runnable {
        public Dialog() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C32685miJ c32685miJ = null;
            if (C32747mjS.this.copydefault > 0) {
                C32685miJ c32685miJ2 = C32747mjS.this.AhwBna;
                if (c32685miJ2 == null) {
                    Intrinsics.gEmmrt("");
                    c32685miJ2 = null;
                }
                C52794wYp c52794wYp = c32685miJ2.EZpvd;
                C32747mjS c32747mjS = C32747mjS.this;
                c52794wYp.setText(C33069mpW.copydefault(c32747mjS, C32726miy.Dialog.isConnected, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(c32747mjS.copydefault)))));
                C32685miJ c32685miJ3 = C32747mjS.this.AhwBna;
                if (c32685miJ3 == null) {
                    Intrinsics.gEmmrt("");
                    c32685miJ3 = null;
                }
                c32685miJ3.EZpvd.setClickable(false);
                C32685miJ c32685miJ4 = C32747mjS.this.AhwBna;
                if (c32685miJ4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c32685miJ = c32685miJ4;
                }
                c32685miJ.EZpvd.setEnabled(false);
                C32747mjS.this.copydefault--;
                android.os.Handler handler = C32747mjS.this.KWHzl;
                if (handler != null) {
                    handler.postDelayed(this, 1000L);
                    return;
                }
                return;
            }
            C32685miJ c32685miJ5 = C32747mjS.this.AhwBna;
            if (c32685miJ5 == null) {
                Intrinsics.gEmmrt("");
                c32685miJ5 = null;
            }
            c32685miJ5.EZpvd.setText(C32747mjS.this.djBIcL);
            C32685miJ c32685miJ6 = C32747mjS.this.AhwBna;
            if (c32685miJ6 == null) {
                Intrinsics.gEmmrt("");
                c32685miJ6 = null;
            }
            c32685miJ6.EZpvd.setClickable(true);
            C32685miJ c32685miJ7 = C32747mjS.this.AhwBna;
            if (c32685miJ7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c32685miJ = c32685miJ7;
            }
            c32685miJ.EZpvd.setEnabled(true);
        }
    }

    private final void EZpvd() {
        android.os.Handler handler = this.KWHzl;
        if (handler != null) {
            java.lang.Runnable runnable = this.OLrzqt;
            Intrinsics.copydefault(runnable);
            handler.removeCallbacks(runnable);
        }
        this.KWHzl = null;
        this.OLrzqt = null;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        int i = this.gEmmrt;
        C32685miJ c32685miJ = null;
        if (i != 3) {
            if (i != 4) {
                return;
            }
            wyf.setType(5);
            wyf.setPrimaryText(C33070mpX.AYXKKw(C32726miy.Dialog.gEmmrt));
            final C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(263);
                c52794wYpCopydefault.setEnabled(false);
                c52794wYpCopydefault.setOnClickListener(new FragmentManager(c52794wYpCopydefault, 1000L, this));
                C32685miJ c32685miJ2 = this.AhwBna;
                if (c32685miJ2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c32685miJ = c32685miJ2;
                }
                c32685miJ.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mjT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C32747mjS.copydefault(c52794wYpCopydefault, compoundButton, z);
                    }
                });
                return;
            }
            return;
        }
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C32726miy.Dialog.valueOf));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOKDSType(263);
            c52794wYpCopydefault2.setEnabled(false);
            c52794wYpCopydefault2.setOnClickListener(new Fragment(c52794wYpCopydefault2, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C32726miy.Dialog.gEmmrt));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setEnabled(false);
            c52794wYpAEQbTJ.setOnClickListener(new PendingIntent(c52794wYpAEQbTJ, 1000L, this));
        }
        C32685miJ c32685miJ3 = this.AhwBna;
        if (c32685miJ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32685miJ = c32685miJ3;
        }
        c32685miJ.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C32747mjS.copydefault(wyf, compoundButton, z);
            }
        });
    }

    public static final void copydefault(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(z);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setEnabled(z);
        }
    }

    public static final void copydefault(C52794wYp c52794wYp, android.widget.CompoundButton compoundButton, boolean z) {
        c52794wYp.setEnabled(z);
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
}
