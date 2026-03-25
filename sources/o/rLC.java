package o;

import android.view.View;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rLC extends wXX {
    public wYF EZpvd;
    public C42434rSs KWHzl;
    public ViewOnClickListenerC5326Nk OLrzqt;
    public rLF copydefault;
    public Calendar valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public rLC() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.valueOf = calendar;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rLC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ rLC newInstance$default(TaskDescription taskDescription, rLF rlf, Date date, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                date = null;
            }
            return taskDescription.OLrzqt(rlf, date);
        }

        public final rLC OLrzqt(@NotNull rLF rlf, Date date) {
            Intrinsics.checkNotNullParameter(rlf, "");
            rLC rlc = new rLC();
            rlc.copydefault = rlf;
            android.os.Bundle bundle = new android.os.Bundle();
            if (date != null) {
                bundle.putLong("initial_date", date.getTime());
            }
            rlc.setArguments(bundle);
            return rlc;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        if (this.copydefault == null) {
            dismiss();
            return null;
        }
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.QXDzTk, (android.view.ViewGroup) null, false);
        this.EZpvd = (wYF) viewInflate.findViewById(C43662rtX.ActionBar.DAIeex);
        this.KWHzl = (C42434rSs) viewInflate.findViewById(C43662rtX.ActionBar.dPnHjp);
        copydefault();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.OLrzqt;
        if (viewOnClickListenerC5326Nk != null) {
            if (viewOnClickListenerC5326Nk == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC5326Nk = null;
            }
            viewOnClickListenerC5326Nk.copydefault();
        }
    }

    public final void copydefault() {
        MZ mzKWHzl = new MZ(getContext(), new InterfaceC5318Nc() { // from class: o.rLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view) {
                rLC.OLrzqt(this.AEQbTJ, date, view);
            }
        }).AEQbTJ(C32113mPz.Fragment.AwvSrB, new MY() { // from class: o.rLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view) {
                rLC.AEQbTJ(this.copydefault, view);
            }
        }).KWHzl(new boolean[]{true, true, true, false, false, false}).EZpvd("", "", "", "", "", "").EZpvd(C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG)).KWHzl(20).copydefault(KWHzl()).KWHzl(AEQbTJ(), OLrzqt());
        C42434rSs c42434rSs = this.KWHzl;
        C42434rSs c42434rSs2 = null;
        if (c42434rSs == null) {
            Intrinsics.gEmmrt("");
            c42434rSs = null;
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = mzKWHzl.AEQbTJ(c42434rSs).OLrzqt(C33070mpX.copydefault(C32113mPz.ActionBar.isConnected)).EZpvd(false).AEQbTJ(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)).copydefault(2.0f).copydefault(7).KWHzl(false).copydefault(new InterfaceC5319Nd() { // from class: o.rLG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                rLC.AEQbTJ(this.KWHzl, date);
            }
        }).EZpvd();
        this.OLrzqt = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC5326NkEZpvd = null;
        }
        viewOnClickListenerC5326NkEZpvd.OLrzqt(false);
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.OLrzqt;
        if (viewOnClickListenerC5326Nk == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC5326Nk = null;
        }
        C42434rSs c42434rSs3 = this.KWHzl;
        if (c42434rSs3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42434rSs2 = c42434rSs3;
        }
        viewOnClickListenerC5326Nk.AEQbTJ(c42434rSs2, false);
    }

    public static final void OLrzqt(rLC rlc, Date date, android.view.View view) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        rlc.valueOf = calendar;
    }

    public static final void AEQbTJ(rLC rlc, android.view.View view) {
        wYF wyf = rlc.EZpvd;
        wYF wyf2 = null;
        if (wyf == null) {
            Intrinsics.gEmmrt("");
            wyf = null;
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, rlc));
        }
        wYF wyf3 = rlc.EZpvd;
        if (wyf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wyf2 = wyf3;
        }
        C52794wYp c52794wYpAEQbTJ = wyf2.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
    }

    public static final void AEQbTJ(rLC rlc, Date date) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = rlc.OLrzqt;
        if (viewOnClickListenerC5326Nk == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC5326Nk = null;
        }
        viewOnClickListenerC5326Nk.fetchVPNInfo();
    }

    public final Calendar AEQbTJ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final Calendar OLrzqt() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2200);
        calendar.set(2, 11);
        calendar.set(5, 31);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    public final Calendar KWHzl() {
        Calendar calendar = Calendar.getInstance();
        android.os.Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("initial_date")) {
            android.os.Bundle arguments2 = getArguments();
            long j = arguments2 != null ? arguments2.getLong("initial_date") : 0L;
            if (j > 0) {
                Date date = new Date(j);
                calendar.setTime(date);
                this.valueOf.setTime(date);
            }
        }
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ rLC AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rLC rlc) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = rlc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                rLF rlf = this.AEQbTJ.copydefault;
                if (rlf != null) {
                    Date time = this.AEQbTJ.valueOf.getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "");
                    rlf.KWHzl(time);
                }
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.AEQbTJ.OLrzqt;
                if (viewOnClickListenerC5326Nk == null) {
                    Intrinsics.gEmmrt("");
                    viewOnClickListenerC5326Nk = null;
                }
                viewOnClickListenerC5326Nk.copydefault();
                this.AEQbTJ.dismiss();
            }
        }
    }
}
