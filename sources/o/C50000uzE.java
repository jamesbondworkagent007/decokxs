package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.biz.StrategyType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.tradeuilib.widget.SelectedTime;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C50000uzE extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public android.widget.TextView AEQbTJ;
    public SelectedTime AYXKKw;
    public ViewOnClickListenerC5326Nk AhwBna;
    public C50042uzu AkhnZx;
    public SelectedTime AuCTel;
    public wYK AubY;
    public boolean DbNXlk;
    public C49774uur EZpvd;
    public java.lang.String KWHzl;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public wYC djBIcL;
    public Calendar ejfBZ;
    public java.lang.String fARcdN;
    public C54984xbQ fIwbmz;
    public C54984xbQ fJNWhG;
    public Calendar fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public C54984xbQ getFieldNames;
    public android.widget.TextView getNewProxyInstance;
    public android.widget.TextView hDKMBd;
    public Calendar isConnected;
    public yHS<? super Calendar, ? super Calendar, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super SelectedTime, Unit> iwGUEr;
    public wYF uzCIH;
    public StrategyType valueOf;
    public Calendar values;

    /* JADX INFO: renamed from: o.uzE$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelectedTime.values().length];
            try {
                iArr[SelectedTime.TYPE_90_DAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedTime.TYPE_30_DAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectedTime.TYPE_7_DAYS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[StrategyType.values().length];
            try {
                iArr2[StrategyType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[StrategyType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[StrategyType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[StrategyType.MARKET.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[StrategyType.MP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[StrategyType.STOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[StrategyType.TRIGGER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StrategyType strategyType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.valueOf = strategyType;
        this.fARcdN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull yHS<? super Calendar, ? super Calendar, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super SelectedTime, Unit> yhs) {
        Intrinsics.checkNotNullParameter(yhs, "");
        this.iwGUEr = yhs;
    }

    public C50000uzE() {
        Calendar calendarEZpvd = EZpvd();
        Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
        this.ejfBZ = calendarEZpvd;
        Calendar calendarIsConnected = isConnected();
        Intrinsics.checkNotNullExpressionValue(calendarIsConnected, "");
        this.fetchVPNInfo = calendarIsConnected;
        this.AuCTel = SelectedTime.TYPE_90_DAYS;
    }

    public final void KWHzl(SelectedTime selectedTime) {
        this.AuCTel = selectedTime;
        int i = StateListAnimator.copydefault[selectedTime.ordinal()];
        if (i == 1) {
            C54984xbQ c54984xbQ = this.fJNWhG;
            if (c54984xbQ != null) {
                c54984xbQ.setSelectedStyle(false, 3);
            }
            C54984xbQ c54984xbQ2 = this.fIwbmz;
            if (c54984xbQ2 != null) {
                c54984xbQ2.setSelectedStyle(false, 3);
            }
            C54984xbQ c54984xbQ3 = this.getFieldNames;
            if (c54984xbQ3 != null) {
                c54984xbQ3.setSelectedStyle(true, 3);
                return;
            }
            return;
        }
        if (i == 2) {
            C54984xbQ c54984xbQ4 = this.fJNWhG;
            if (c54984xbQ4 != null) {
                c54984xbQ4.setSelectedStyle(false, 3);
            }
            C54984xbQ c54984xbQ5 = this.fIwbmz;
            if (c54984xbQ5 != null) {
                c54984xbQ5.setSelectedStyle(true, 3);
            }
            C54984xbQ c54984xbQ6 = this.getFieldNames;
            if (c54984xbQ6 != null) {
                c54984xbQ6.setSelectedStyle(false, 3);
                return;
            }
            return;
        }
        if (i != 3) {
            C54984xbQ c54984xbQ7 = this.fJNWhG;
            if (c54984xbQ7 != null) {
                c54984xbQ7.setSelectedStyle(false, 3);
            }
            C54984xbQ c54984xbQ8 = this.fIwbmz;
            if (c54984xbQ8 != null) {
                c54984xbQ8.setSelectedStyle(false, 3);
            }
            C54984xbQ c54984xbQ9 = this.getFieldNames;
            if (c54984xbQ9 != null) {
                c54984xbQ9.setSelectedStyle(false, 3);
                return;
            }
            return;
        }
        C54984xbQ c54984xbQ10 = this.fJNWhG;
        if (c54984xbQ10 != null) {
            c54984xbQ10.setSelectedStyle(true, 3);
        }
        C54984xbQ c54984xbQ11 = this.fIwbmz;
        if (c54984xbQ11 != null) {
            c54984xbQ11.setSelectedStyle(false, 3);
        }
        C54984xbQ c54984xbQ12 = this.getFieldNames;
        if (c54984xbQ12 != null) {
            c54984xbQ12.setSelectedStyle(false, 3);
        }
    }

    /* JADX INFO: renamed from: o.uzE$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uzE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C50000uzE newInstance$default(Activity activity, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return activity.EZpvd(str, z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, function0);
        }

        public final C50000uzE EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function0, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("show_time", z);
            bundle.putString("instType", str);
            bundle.putString("current_time", str2);
            bundle.putString(MetricsSQLiteCacheKt.METRICS_END_TIME, str3);
            bundle.putString("from", str4);
            C50000uzE c50000uzE = new C50000uzE();
            c50000uzE.setArguments(bundle);
            c50000uzE.gEmmrt = function0;
            return c50000uzE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C49511upt.Activity.gkJEwt));
        wxq.AYXKKw().setTextSize(16.0f);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        C52794wYp c52794wYpAEQbTJ;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.zuBGHE, (android.view.ViewGroup) constraintLayout, true);
        this.AubY = (wYK) viewInflate.findViewById(C49511upt.Application.getLabel);
        Intrinsics.copydefault(viewInflate);
        this.uzCIH = (wYF) C33054mpH.copydefault(viewInflate, C49511upt.Application.alsFma);
        this.AkhnZx = (C50042uzu) viewInflate.findViewById(C49511upt.Application.RKcVTr);
        this.EZpvd = (C49774uur) viewInflate.findViewById(C49511upt.Application.ORxRYg);
        this.fJNWhG = (C54984xbQ) viewInflate.findViewById(C49511upt.Application.aHXSQp);
        this.fIwbmz = (C54984xbQ) viewInflate.findViewById(C49511upt.Application.akftKQ);
        this.getFieldNames = (C54984xbQ) viewInflate.findViewById(C49511upt.Application.aJFbMH);
        this.getNewProxyInstance = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.dvImUD);
        this.hDKMBd = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.fLIjIY);
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.DGUQLIOvDItG);
        android.os.Bundle arguments = getArguments();
        java.lang.String str2 = "BOTS";
        if (arguments != null && (string3 = arguments.getString("instType", "BOTS")) != null) {
            str2 = string3;
        }
        this.KWHzl = str2;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("current_time", "")) == null) {
            string = "";
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString(MetricsSQLiteCacheKt.METRICS_END_TIME, "")) != null) {
            str = string2;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Calendar calendar = Calendar.getInstance();
            this.ejfBZ = calendar;
            calendar.setTime(new Date(C33129mqd.valueOf(string)));
            Calendar calendar2 = Calendar.getInstance();
            this.fetchVPNInfo = calendar2;
            calendar2.setTime(new Date(C33129mqd.valueOf(str)));
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            KWHzl(SelectedTime.TYPE_90_DAYS);
        }
        wYF wyf = this.uzCIH;
        if (wyf != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        android.widget.TextView textView = this.getNewProxyInstance;
        if (textView != null) {
            AYXKKw();
            values();
            initTimePicker$default(this, textView, null, 2, null);
        }
        KWHzl(this.AuCTel);
        wYC wyc = this.djBIcL;
        if (wyc != null) {
            wyc.setOnClickListener(new View.OnClickListener() { // from class: o.uzF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.fIwbmz(this.EZpvd, view);
                }
            });
        }
        OLrzqt();
        AEQbTJ();
        valueOf();
    }

    /* JADX INFO: renamed from: o.uzE$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50000uzE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50000uzE c50000uzE) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c50000uzE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final void fIwbmz(C50000uzE c50000uzE, android.view.View view) {
        c50000uzE.dismissAllowingStateLoss();
    }

    public final void AEQbTJ() {
        android.widget.TextView textView;
        android.os.Bundle arguments = getArguments();
        if (!Intrinsics.EZpvd((java.lang.Object) (arguments != null ? arguments.getString("from") : null), (java.lang.Object) "from_order") || (textView = this.AEQbTJ) == null) {
            return;
        }
        textView.setText(C49511upt.Activity.AwvSrB);
    }

    public final void OLrzqt() {
        wYK wyk;
        java.lang.Object obj = getArguments() == null ? java.lang.Boolean.FALSE : requireArguments().get("show_time");
        Intrinsics.copydefault(obj, "");
        if (!((java.lang.Boolean) obj).booleanValue() || (wyk = this.AubY) == null) {
            return;
        }
        wyk.setVisibility(0);
    }

    private final void valueOf() {
        C54984xbQ c54984xbQ = this.fJNWhG;
        if (c54984xbQ != null) {
            c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.uzL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.AhwBna(this.copydefault, view);
                }
            });
        }
        C54984xbQ c54984xbQ2 = this.fIwbmz;
        if (c54984xbQ2 != null) {
            c54984xbQ2.setOnClickListener(new View.OnClickListener() { // from class: o.uzP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.isConnected(this.copydefault, view);
                }
            });
        }
        C54984xbQ c54984xbQ3 = this.getFieldNames;
        if (c54984xbQ3 != null) {
            c54984xbQ3.setOnClickListener(new View.OnClickListener() { // from class: o.uzO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.DbNXlk(this.copydefault, view);
                }
            });
        }
        android.widget.TextView textView = this.getNewProxyInstance;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.uzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.fetchVPNInfo(this.OLrzqt, view);
                }
            });
        }
        android.widget.TextView textView2 = this.hDKMBd;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.uzM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50000uzE.AkhnZx(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void AhwBna(C50000uzE c50000uzE, android.view.View view) {
        c50000uzE.KWHzl(SelectedTime.TYPE_7_DAYS);
        c50000uzE.ejfBZ = c50000uzE.copydefault();
        c50000uzE.fetchVPNInfo = c50000uzE.isConnected();
        c50000uzE.gEmmrt();
    }

    public static final void isConnected(C50000uzE c50000uzE, android.view.View view) {
        c50000uzE.KWHzl(SelectedTime.TYPE_30_DAYS);
        c50000uzE.ejfBZ = c50000uzE.KWHzl();
        c50000uzE.fetchVPNInfo = c50000uzE.isConnected();
        c50000uzE.gEmmrt();
    }

    public static final void DbNXlk(C50000uzE c50000uzE, android.view.View view) {
        c50000uzE.KWHzl(SelectedTime.TYPE_90_DAYS);
        c50000uzE.ejfBZ = c50000uzE.EZpvd();
        c50000uzE.fetchVPNInfo = c50000uzE.isConnected();
        c50000uzE.gEmmrt();
    }

    public static final void fetchVPNInfo(C50000uzE c50000uzE, android.view.View view) {
        android.widget.TextView textView = c50000uzE.getNewProxyInstance;
        if (textView != null) {
            textView.setSelected(true);
        }
        android.widget.TextView textView2 = c50000uzE.hDKMBd;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
        Intrinsics.copydefault(view);
        initTimePicker$default(c50000uzE, view, null, 2, null);
    }

    public static final void AkhnZx(C50000uzE c50000uzE, android.view.View view) {
        android.widget.TextView textView = c50000uzE.getNewProxyInstance;
        if (textView != null) {
            textView.setSelected(false);
        }
        android.widget.TextView textView2 = c50000uzE.hDKMBd;
        if (textView2 != null) {
            textView2.setSelected(true);
        }
        Intrinsics.copydefault(view);
        c50000uzE.copydefault(view, c50000uzE.fetchVPNInfo);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        wYK wyk = this.AubY;
        if (wyk != null) {
            wyk.setChecked(this.DbNXlk);
        }
    }

    public static /* synthetic */ void initTimePicker$default(C50000uzE c50000uzE, android.view.View view, Calendar calendar, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initTimePicker");
        }
        if ((i & 2) != 0) {
            calendar = c50000uzE.ejfBZ;
        }
        c50000uzE.copydefault(view, calendar);
    }

    private final void copydefault(android.view.View view, Calendar calendar) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.AhwBna;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.copydefault();
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = new MZ(getContext(), new InterfaceC5318Nc() { // from class: o.uzC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view2) {
                C50000uzE.OLrzqt(this.AEQbTJ, date, view2);
            }
        }).AEQbTJ(fetchVPNInfo(), new MY() { // from class: o.uzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view2) {
                C50000uzE.values(this.EZpvd, view2);
            }
        }).KWHzl(new boolean[]{true, true, true, false, false, false}).EZpvd("", "", "", "", "", "").EZpvd(getResources().getColor(C32113mPz.ActionBar.fJNWhG)).KWHzl(20).copydefault(calendar).KWHzl(AkhnZx(), isConnected()).AEQbTJ(this.AkhnZx).OLrzqt(getResources().getColor(C52761wXj.Activity.GhqvEQ)).EZpvd(false).AEQbTJ(getResources().getColor(C32113mPz.ActionBar.zLjUOn)).AYXKKw(getResources().getColor(C32113mPz.ActionBar.ejfBZ)).copydefault(2.0f).copydefault(7).KWHzl(true).copydefault(new InterfaceC5319Nd() { // from class: o.uzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                C50000uzE.KWHzl(this.KWHzl, date);
            }
        }).EZpvd();
        this.AhwBna = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd != null) {
            viewOnClickListenerC5326NkEZpvd.OLrzqt(false);
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = this.AhwBna;
        if (viewOnClickListenerC5326Nk2 != null) {
            viewOnClickListenerC5326Nk2.AEQbTJ(view, false);
        }
    }

    public static final void OLrzqt(C50000uzE c50000uzE, Date date, android.view.View view) {
        C52794wYp c52794wYpAEQbTJ;
        c50000uzE.KWHzl(SelectedTime.NONE);
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (textView.getId() == C49511upt.Application.dvImUD) {
                if (calendar.getTimeInMillis() > c50000uzE.fetchVPNInfo.getTimeInMillis()) {
                    Date time = c50000uzE.fetchVPNInfo.getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "");
                    textView.setText(c50000uzE.KWHzl(time));
                    Calendar calendar2 = c50000uzE.fetchVPNInfo;
                    c50000uzE.ejfBZ = calendar2;
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = c50000uzE.AhwBna;
                    if (viewOnClickListenerC5326Nk != null) {
                        viewOnClickListenerC5326Nk.AEQbTJ(calendar2);
                    }
                } else if (calendar.getTimeInMillis() < c50000uzE.EZpvd().getTimeInMillis()) {
                    Date time2 = c50000uzE.EZpvd().getTime();
                    Intrinsics.checkNotNullExpressionValue(time2, "");
                    textView.setText(c50000uzE.KWHzl(time2));
                    c50000uzE.ejfBZ = c50000uzE.EZpvd();
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = c50000uzE.AhwBna;
                    if (viewOnClickListenerC5326Nk2 != null) {
                        viewOnClickListenerC5326Nk2.AEQbTJ(c50000uzE.EZpvd());
                    }
                } else {
                    Intrinsics.copydefault(date);
                    textView.setText(c50000uzE.KWHzl(date));
                    c50000uzE.ejfBZ = calendar;
                }
            } else if (calendar.getTimeInMillis() < c50000uzE.ejfBZ.getTimeInMillis()) {
                Date time3 = c50000uzE.ejfBZ.getTime();
                Intrinsics.checkNotNullExpressionValue(time3, "");
                textView.setText(c50000uzE.KWHzl(time3));
                Calendar calendar3 = c50000uzE.ejfBZ;
                c50000uzE.fetchVPNInfo = calendar3;
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk3 = c50000uzE.AhwBna;
                if (viewOnClickListenerC5326Nk3 != null) {
                    viewOnClickListenerC5326Nk3.AEQbTJ(calendar3);
                }
            } else if (calendar.getTimeInMillis() < c50000uzE.EZpvd().getTimeInMillis()) {
                Date time4 = c50000uzE.EZpvd().getTime();
                Intrinsics.checkNotNullExpressionValue(time4, "");
                textView.setText(c50000uzE.KWHzl(time4));
                c50000uzE.fetchVPNInfo = c50000uzE.EZpvd();
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk4 = c50000uzE.AhwBna;
                if (viewOnClickListenerC5326Nk4 != null) {
                    viewOnClickListenerC5326Nk4.AEQbTJ(c50000uzE.EZpvd());
                }
            } else {
                Intrinsics.copydefault(date);
                textView.setText(c50000uzE.KWHzl(date));
                c50000uzE.fetchVPNInfo = calendar;
            }
            wYF wyf = c50000uzE.uzCIH;
            if (wyf == null || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
                return;
            }
            c52794wYpAEQbTJ.setEnabled(true);
        }
    }

    public static final void values(final C50000uzE c50000uzE, android.view.View view) {
        wYF wyf = c50000uzE.uzCIH;
        if (wyf != null) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.uzN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C50000uzE.fJNWhG(this.AEQbTJ, view2);
                    }
                });
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uzJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C50000uzE.ejfBZ(this.OLrzqt, view2);
                    }
                });
            }
        }
    }

    public static final void fJNWhG(C50000uzE c50000uzE, android.view.View view) {
        Function1<? super java.lang.Boolean, Unit> function1 = c50000uzE.copydefault;
        if (function1 != null) {
            wYK wyk = c50000uzE.AubY;
            function1.invoke(java.lang.Boolean.valueOf(wyk != null && wyk.isChecked()));
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = c50000uzE.AhwBna;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.copydefault();
        }
        c50000uzE.AhwBna();
        Function1<? super java.lang.Boolean, Unit> function12 = c50000uzE.copydefault;
        if (function12 != null) {
            wYK wyk2 = c50000uzE.AubY;
            function12.invoke(java.lang.Boolean.valueOf(wyk2 != null ? wyk2.isChecked() : false));
        }
        yHS<? super Calendar, ? super Calendar, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super SelectedTime, Unit> yhs = c50000uzE.iwGUEr;
        if (yhs != null) {
            Calendar calendar = c50000uzE.ejfBZ;
            Calendar calendar2 = c50000uzE.fetchVPNInfo;
            wYK wyk3 = c50000uzE.AubY;
            yhs.invoke(calendar, calendar2, java.lang.Boolean.valueOf(wyk3 != null ? wyk3.isChecked() : false), java.lang.Boolean.valueOf(!c50000uzE.djBIcL()), c50000uzE.AuCTel);
        }
        c50000uzE.DbNXlk();
        c50000uzE.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ejfBZ(C50000uzE c50000uzE, android.view.View view) {
        c50000uzE.ejfBZ = c50000uzE.EZpvd();
        c50000uzE.fetchVPNInfo = c50000uzE.isConnected();
        c50000uzE.KWHzl(SelectedTime.TYPE_90_DAYS);
        wYK wyk = c50000uzE.AubY;
        if (wyk != null) {
            wyk.setChecked(false);
        }
        Function1<? super java.lang.Boolean, Unit> function1 = c50000uzE.copydefault;
        if (function1 != null) {
            wYK wyk2 = c50000uzE.AubY;
            if (wyk2 != null) {
                boolean z = wyk2.isChecked();
                function1.invoke(java.lang.Boolean.valueOf(z));
            }
        }
        android.widget.TextView textView = c50000uzE.getNewProxyInstance;
        if (textView != null) {
            c50000uzE.values();
            initTimePicker$default(c50000uzE, textView, null, 2, null);
        }
        view.setEnabled(false);
    }

    public static final void KWHzl(C50000uzE c50000uzE, Date date) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = c50000uzE.AhwBna;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.fetchVPNInfo();
        }
    }

    private final void DbNXlk() {
        final java.lang.String str;
        android.os.Bundle arguments = getArguments();
        if (!Intrinsics.EZpvd((java.lang.Object) (arguments != null ? arguments.getString("from") : null), (java.lang.Object) "from_order") || (str = (java.lang.String) C56424yEw.gEmmrt(C56390yDp.OLrzqt(SelectedTime.TYPE_7_DAYS, "seven"), C56390yDp.OLrzqt(SelectedTime.TYPE_30_DAYS, "thirty"), C56390yDp.OLrzqt(SelectedTime.TYPE_90_DAYS, "ninety"), C56390yDp.OLrzqt(SelectedTime.NONE, "custom")).get(this.AuCTel)) == null) {
            return;
        }
        C32866mlf.onEvent$default("OrderHistory_Button_TimeFrame_Click", (TrackChannel[]) null, new Function1() { // from class: o.uzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50000uzE.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    private final int fetchVPNInfo() {
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
            return C59449zhJ.startsWith$default(date$default, C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 2, null) ? C49511upt.StateListAnimator.iwGUEr : C59449zhJ.startsWith$default(date$default, str, false, 2, null) ? C32113mPz.Fragment.AwvSrB : C49511upt.StateListAnimator.hDKMBd;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return C49511upt.StateListAnimator.iwGUEr;
        }
    }

    public final void gEmmrt() {
        android.widget.TextView textView = this.getNewProxyInstance;
        if (textView != null) {
            Date time = this.ejfBZ.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            textView.setText(KWHzl(time));
        }
        android.widget.TextView textView2 = this.hDKMBd;
        if (textView2 != null) {
            Date time2 = this.fetchVPNInfo.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            textView2.setText(KWHzl(time2));
        }
        android.widget.TextView textView3 = this.getNewProxyInstance;
        android.widget.TextView textView4 = (textView3 == null || !textView3.isSelected()) ? this.hDKMBd : this.getNewProxyInstance;
        if (textView4 != null) {
            android.widget.TextView textView5 = this.getNewProxyInstance;
            if (textView5 != null && textView5.isSelected()) {
                copydefault(textView4, this.ejfBZ);
            } else {
                copydefault(textView4, this.fetchVPNInfo);
            }
        }
    }

    public final boolean djBIcL() {
        return this.ejfBZ.getTime().compareTo(copydefault().getTime()) >= 0 && this.fetchVPNInfo.getTime().compareTo(copydefault().getTime()) >= 0;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void values() {
        android.widget.TextView textView = this.getNewProxyInstance;
        if (textView != null) {
            textView.setSelected(true);
        }
        android.widget.TextView textView2 = this.hDKMBd;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
        android.widget.TextView textView3 = this.getNewProxyInstance;
        if (textView3 != null) {
            Date time = this.ejfBZ.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            textView3.setText(KWHzl(time));
        }
        android.widget.TextView textView4 = this.hDKMBd;
        if (textView4 != null) {
            Date time2 = this.fetchVPNInfo.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            textView4.setText(KWHzl(time2));
        }
    }

    public final Calendar EZpvd() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -89);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final Calendar copydefault() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -6);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return calendar;
    }

    public final Calendar KWHzl() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -29);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return calendar;
    }

    private final Calendar AkhnZx() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(0L));
        return calendar;
    }

    private final Calendar isConnected() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    public final java.lang.String KWHzl(Date date) {
        return pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }

    public final void AhwBna() {
        this.isConnected = this.ejfBZ;
        this.values = this.fetchVPNInfo;
        wYK wyk = this.AubY;
        boolean zIsChecked = wyk != null ? wyk.isChecked() : false;
        this.DbNXlk = zIsChecked;
        Function1<? super java.lang.Boolean, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(zIsChecked));
        }
        this.AYXKKw = this.AuCTel;
    }

    public final void AYXKKw() {
        Calendar calendar = this.isConnected;
        if (calendar != null) {
            this.ejfBZ = calendar;
        }
        Calendar calendar2 = this.values;
        if (calendar2 != null) {
            this.fetchVPNInfo = calendar2;
        }
        wYK wyk = this.AubY;
        if (wyk != null) {
            wyk.setChecked(this.DbNXlk);
        }
        Function1<? super java.lang.Boolean, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(this.DbNXlk));
        }
        SelectedTime selectedTime = this.AYXKKw;
        if (selectedTime != null) {
            KWHzl(selectedTime);
        }
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

    public static /* synthetic */ void setStrategyType$default(C50000uzE c50000uzE, StrategyType strategyType, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStrategyType");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        c50000uzE.EZpvd(strategyType, str);
    }
}
