package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.contrarywind.view.WheelView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSU extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public ViewOnClickListenerC5326Nk AEQbTJ;
    public Function1<? super java.lang.Long, Unit> AYXKKw;
    public wYF EZpvd;
    public Calendar KWHzl;
    public C39833pzm OLrzqt;
    public android.widget.TextView gEmmrt;
    public android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super java.lang.Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    public oSU() {
        Calendar calendarCopydefault = copydefault();
        Intrinsics.checkNotNullExpressionValue(calendarCopydefault, "");
        this.KWHzl = calendarCopydefault;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Long, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(function1, "");
            oSU osu = new oSU();
            osu.EZpvd(function1);
            osu.show(fragmentManager, "show_time");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.zeUYeG));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.DbNXlk, (android.view.ViewGroup) constraintLayout, true);
        Intrinsics.copydefault(viewInflate);
        this.EZpvd = (wYF) C33054mpH.copydefault(viewInflate, C35964oKf.StateListAnimator.onResult);
        this.OLrzqt = (C39833pzm) viewInflate.findViewById(C35964oKf.StateListAnimator.INotificationSideChannel);
        this.gEmmrt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.describeContents);
        this.valueOf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.isEmpty);
        OLrzqt();
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            KWHzl();
            copydefault(textView, this.KWHzl);
        }
        EZpvd();
    }

    public final void OLrzqt() {
        C52794wYp c52794wYpAEQbTJ;
        wYF wyf = this.EZpvd;
        if (wyf != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        wYF wyf2 = this.EZpvd;
        if (wyf2 != null) {
            C52794wYp c52794wYpCopydefault = wyf2.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.oSY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        oSU.AhwBna(this.copydefault, view);
                    }
                });
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setEnabled(false);
                c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.oTa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        oSU.gEmmrt(this.OLrzqt, view);
                    }
                });
            }
        }
    }

    public static final void AhwBna(oSU osu, android.view.View view) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = osu.AEQbTJ;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.copydefault();
        }
        Function1<? super java.lang.Long, Unit> function1 = osu.AYXKKw;
        if (function1 != null) {
            function1.invoke(java.lang.Long.valueOf(osu.KWHzl.getTimeInMillis()));
        }
        osu.dismissAllowingStateLoss();
    }

    public static final void gEmmrt(oSU osu, android.view.View view) {
        osu.KWHzl = osu.copydefault();
        android.widget.TextView textView = osu.gEmmrt;
        if (textView != null) {
            osu.KWHzl();
            osu.copydefault(textView, osu.KWHzl);
        }
        view.setEnabled(false);
    }

    private final void EZpvd() {
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.oSV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    oSU.valueOf(this.OLrzqt, view);
                }
            });
        }
        android.widget.TextView textView2 = this.valueOf;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.oTb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    oSU.djBIcL(this.KWHzl, view);
                }
            });
        }
    }

    public static final void valueOf(oSU osu, android.view.View view) {
        android.widget.TextView textView = osu.gEmmrt;
        if (textView != null) {
            textView.setSelected(true);
        }
        android.widget.TextView textView2 = osu.valueOf;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
        Intrinsics.copydefault(view);
        osu.copydefault(view, osu.KWHzl);
    }

    public static final void djBIcL(oSU osu, android.view.View view) {
        android.widget.TextView textView = osu.gEmmrt;
        if (textView != null) {
            textView.setSelected(false);
        }
        android.widget.TextView textView2 = osu.valueOf;
        if (textView2 != null) {
            textView2.setSelected(true);
        }
        Intrinsics.copydefault(view);
        osu.copydefault(view, osu.KWHzl);
    }

    public final void copydefault(android.view.View view, Calendar calendar) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.AEQbTJ;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.copydefault();
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = new MZ(getContext(), new InterfaceC5318Nc() { // from class: o.oSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view2) {
                oSU.KWHzl(this.AEQbTJ, date, view2);
            }
        }).AEQbTJ(AEQbTJ(), new MY() { // from class: o.oSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view2) {
                oSU.AYXKKw(this.OLrzqt, view2);
            }
        }).KWHzl(view.getId() == C35964oKf.StateListAnimator.describeContents ? new boolean[]{true, true, true, false, false, false} : new boolean[]{false, false, false, true, true, false}).EZpvd("", "", "", "", "", "").EZpvd(getResources().getColor(C32113mPz.ActionBar.fJNWhG)).KWHzl(20).copydefault(calendar).KWHzl(AYXKKw(), valueOf()).AEQbTJ(this.OLrzqt).OLrzqt(getResources().getColor(C52761wXj.Activity.GhqvEQ)).EZpvd(false).AEQbTJ(getResources().getColor(C32113mPz.ActionBar.zLjUOn)).AYXKKw(getResources().getColor(C32113mPz.ActionBar.ejfBZ)).copydefault(2.0f).copydefault(7).KWHzl(true).copydefault(new InterfaceC5319Nd() { // from class: o.oST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                oSU.copydefault(this.KWHzl, date);
            }
        }).EZpvd();
        this.AEQbTJ = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd != null) {
            viewOnClickListenerC5326NkEZpvd.OLrzqt(false);
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = this.AEQbTJ;
        if (viewOnClickListenerC5326Nk2 != null) {
            viewOnClickListenerC5326Nk2.AEQbTJ(view, false);
        }
    }

    public static final void KWHzl(oSU osu, Date date, android.view.View view) {
        C52794wYp c52794wYpAEQbTJ;
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (textView.getId() == C35964oKf.StateListAnimator.describeContents) {
                java.lang.Object objClone = osu.KWHzl.clone();
                Intrinsics.copydefault(objClone, "");
                Calendar calendar2 = (Calendar) objClone;
                calendar2.set(1, calendar.get(1));
                calendar2.set(2, calendar.get(2));
                calendar2.set(5, calendar.get(5));
                if (calendar2.getTimeInMillis() > osu.valueOf().getTimeInMillis()) {
                    Date time = osu.valueOf().getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "");
                    textView.setText(osu.KWHzl(time));
                    Calendar calendarValueOf = osu.valueOf();
                    osu.KWHzl = calendarValueOf;
                    android.widget.TextView textView2 = osu.valueOf;
                    if (textView2 != null) {
                        Date time2 = calendarValueOf.getTime();
                        Intrinsics.checkNotNullExpressionValue(time2, "");
                        textView2.setText(osu.AEQbTJ(time2));
                    }
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = osu.AEQbTJ;
                    if (viewOnClickListenerC5326Nk != null) {
                        viewOnClickListenerC5326Nk.AEQbTJ(osu.valueOf());
                    }
                } else if (calendar2.getTimeInMillis() < osu.AYXKKw().getTimeInMillis()) {
                    Date time3 = osu.AYXKKw().getTime();
                    Intrinsics.checkNotNullExpressionValue(time3, "");
                    textView.setText(osu.KWHzl(time3));
                    osu.KWHzl = osu.AYXKKw();
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = osu.AEQbTJ;
                    if (viewOnClickListenerC5326Nk2 != null) {
                        viewOnClickListenerC5326Nk2.AEQbTJ(osu.AYXKKw());
                    }
                } else {
                    Intrinsics.copydefault(date);
                    textView.setText(osu.KWHzl(date));
                    osu.KWHzl = calendar2;
                }
            } else {
                java.lang.Object objClone2 = osu.KWHzl.clone();
                Intrinsics.copydefault(objClone2, "");
                Calendar calendar3 = (Calendar) objClone2;
                calendar3.set(11, calendar.get(11));
                calendar3.set(12, calendar.get(12));
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                if (calendar3.getTimeInMillis() < osu.AYXKKw().getTimeInMillis()) {
                    Date time4 = osu.AYXKKw().getTime();
                    Intrinsics.checkNotNullExpressionValue(time4, "");
                    textView.setText(osu.AEQbTJ(time4));
                    osu.KWHzl = osu.AYXKKw();
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk3 = osu.AEQbTJ;
                    if (viewOnClickListenerC5326Nk3 != null) {
                        viewOnClickListenerC5326Nk3.AEQbTJ(osu.AYXKKw());
                    }
                } else if (calendar3.getTimeInMillis() > osu.valueOf().getTimeInMillis()) {
                    Date time5 = osu.valueOf().getTime();
                    Intrinsics.checkNotNullExpressionValue(time5, "");
                    textView.setText(osu.AEQbTJ(time5));
                    osu.KWHzl = osu.valueOf();
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk4 = osu.AEQbTJ;
                    if (viewOnClickListenerC5326Nk4 != null) {
                        viewOnClickListenerC5326Nk4.AEQbTJ(osu.valueOf());
                    }
                } else {
                    Intrinsics.copydefault(date);
                    textView.setText(osu.AEQbTJ(date));
                    osu.KWHzl = calendar3;
                }
            }
            osu.KWHzl.getTimeInMillis();
            wYF wyf = osu.EZpvd;
            if (wyf == null || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
                return;
            }
            c52794wYpAEQbTJ.setEnabled(true);
        }
    }

    public static final void AYXKKw(oSU osu, android.view.View view) {
        Intrinsics.copydefault(view);
        osu.AEQbTJ(view);
    }

    public static final void copydefault(oSU osu, Date date) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = osu.AEQbTJ;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.fetchVPNInfo();
        }
    }

    public final void AEQbTJ(android.view.View view) {
        try {
            android.graphics.Typeface typefaceValueOf = C55051xce.OLrzqt.valueOf();
            WheelView wheelView = (WheelView) view.findViewById(C35964oKf.StateListAnimator.sendQueueTitle);
            if (wheelView != null) {
                wheelView.setTypeface(typefaceValueOf);
            }
            WheelView wheelView2 = (WheelView) view.findViewById(C35964oKf.StateListAnimator.iflRwn);
            if (wheelView2 != null) {
                wheelView2.setTypeface(typefaceValueOf);
            }
            WheelView wheelView3 = (WheelView) view.findViewById(C35964oKf.StateListAnimator.awiJhF);
            if (wheelView3 != null) {
                wheelView3.setTypeface(typefaceValueOf);
            }
            WheelView wheelView4 = (WheelView) view.findViewById(C35964oKf.StateListAnimator.DxnCrt);
            if (wheelView4 != null) {
                wheelView4.setTypeface(typefaceValueOf);
            }
            WheelView wheelView5 = (WheelView) view.findViewById(C35964oKf.StateListAnimator.aVPvww);
            if (wheelView5 != null) {
                wheelView5.setTypeface(typefaceValueOf);
            }
            WheelView wheelView6 = (WheelView) view.findViewById(C35964oKf.StateListAnimator.notifyNotificationWithChannel);
            if (wheelView6 != null) {
                wheelView6.setTypeface(typefaceValueOf);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final int AEQbTJ() {
        java.lang.String strGEmmrt;
        try {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(i2), (java.lang.Object) 10)) {
                strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2));
            } else {
                strGEmmrt = "0" + i2;
            }
            java.lang.String str = strGEmmrt;
            java.lang.String date$default = pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
            return C59449zhJ.startsWith$default(date$default, C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 2, null) ? C35964oKf.Application.fARcdN : C59449zhJ.startsWith$default(date$default, str, false, 2, null) ? C35964oKf.Application.ejfBZ : C35964oKf.Application.AuCTel;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return C35964oKf.Application.fARcdN;
        }
    }

    public final void KWHzl() {
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            textView.setSelected(true);
        }
        android.widget.TextView textView2 = this.valueOf;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
        android.widget.TextView textView3 = this.gEmmrt;
        if (textView3 != null) {
            Date time = this.KWHzl.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            textView3.setText(KWHzl(time));
        }
        android.widget.TextView textView4 = this.valueOf;
        if (textView4 != null) {
            Date time2 = this.KWHzl.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            textView4.setText(AEQbTJ(time2));
        }
    }

    private final Calendar AYXKKw() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2009);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private final Calendar valueOf() {
        return Calendar.getInstance();
    }

    public final Calendar copydefault() {
        return Calendar.getInstance();
    }

    public final java.lang.String KWHzl(Date date) {
        return pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }

    public final java.lang.String AEQbTJ(Date date) {
        return pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (isAdded()) {
            dismiss();
        } else {
            super.show(fragmentManager, str);
        }
    }
}
