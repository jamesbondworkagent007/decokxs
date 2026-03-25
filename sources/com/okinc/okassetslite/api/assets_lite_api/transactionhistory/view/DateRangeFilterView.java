package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.Period;
import com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.UserDateSelectionUiModel;
import com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView;
import java.util.Calendar;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.C32113mPz;
import o.C56444yFp;
import o.C8195ayE;
import o.InterfaceC5318Nc;
import o.InterfaceC5319Nd;
import o.InterfaceC56445yFq;
import o.MY;
import o.MZ;
import o.ViewOnClickListenerC5326Nk;
import o.pTA;
import o.rWS;
import o.rWV;
import o.yII;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DateRangeFilterView extends FrameLayout {
    public Application AEQbTJ;
    public final TextView AYXKKw;
    public final FrameLayout AhwBna;
    public final TextView AkhnZx;
    public final TextView AuCTel;
    public final TextView DbNXlk;
    public ViewOnClickListenerC5326Nk EZpvd;
    public final Activity KWHzl;
    public Activity OLrzqt;
    public View.OnClickListener copydefault;
    public Activity djBIcL;
    public final TextView ejfBZ;
    public final TextView fARcdN;
    public final TextView fetchVPNInfo;
    public final Button gEmmrt;
    public final TextView isConnected;
    public final Button valueOf;
    public final TextView values;

    public interface Application {
        void KWHzl(@NotNull UserDateSelectionUiModel userDateSelectionUiModel);
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PresetButtonSelection.values().length];
            try {
                iArr[PresetButtonSelection.RECENT_7.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresetButtonSelection.RECENT_30.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresetButtonSelection.RECENT_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[DateFieldSelection.values().length];
            try {
                iArr2[DateFieldSelection.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DateFieldSelection.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResetOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.copydefault = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateRangeFilterView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeFilterView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        View.inflate(getContext(), C8195ayE.StateListAnimator.OLrzqt, this);
        View viewFindViewById = findViewById(C8195ayE.Application.djBIcL);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ejfBZ = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C8195ayE.Application.AhwBna);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.fetchVPNInfo = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C8195ayE.Application.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        TextView textView = (TextView) viewFindViewById3;
        this.AkhnZx = textView;
        View viewFindViewById4 = findViewById(C8195ayE.Application.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        TextView textView2 = (TextView) viewFindViewById4;
        this.DbNXlk = textView2;
        View viewFindViewById5 = findViewById(C8195ayE.Application.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.valueOf = (Button) viewFindViewById5;
        View viewFindViewById6 = findViewById(C8195ayE.Application.EZpvd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.gEmmrt = (Button) viewFindViewById6;
        View viewFindViewById7 = findViewById(C8195ayE.Application.copydefault);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.AhwBna = (FrameLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(C8195ayE.Application.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        TextView textView3 = (TextView) viewFindViewById8;
        this.values = textView3;
        View viewFindViewById9 = findViewById(C8195ayE.Application.KWHzl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
        TextView textView4 = (TextView) viewFindViewById9;
        this.AYXKKw = textView4;
        View viewFindViewById10 = findViewById(C8195ayE.Application.DbNXlk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
        TextView textView5 = (TextView) viewFindViewById10;
        this.fARcdN = textView5;
        View viewFindViewById11 = findViewById(C8195ayE.Application.valueOf);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
        TextView textView6 = (TextView) viewFindViewById11;
        this.isConnected = textView6;
        View viewFindViewById12 = findViewById(C8195ayE.Application.values);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "");
        TextView textView7 = (TextView) viewFindViewById12;
        this.AuCTel = textView7;
        PresetButtonSelection presetButtonSelection = PresetButtonSelection.RECENT_30;
        DateFieldSelection dateFieldSelection = DateFieldSelection.START;
        rWS rws = rWS.KWHzl;
        Calendar calendarKWHzl = rws.KWHzl(-29);
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
        Calendar calendarEZpvd = EZpvd(calendarKWHzl);
        Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
        Calendar dateFilterTodayDate$default = rWS.getDateFilterTodayDate$default(rws, 0, 1, null);
        Intrinsics.checkNotNullExpressionValue(dateFilterTodayDate$default, "");
        Calendar calendarKWHzl2 = KWHzl(dateFilterTodayDate$default);
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl2, "");
        Activity activity = new Activity(presetButtonSelection, dateFieldSelection, calendarEZpvd, calendarKWHzl2);
        this.KWHzl = activity;
        this.djBIcL = Activity.copy$default(activity, null, null, null, null, 15, null);
        Activity.copy$default(activity, null, null, null, null, 15, null);
        this.OLrzqt = activity;
        textView3.setOnClickListener(new View.OnClickListener() { // from class: o.rWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.djBIcL(this.copydefault, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: o.rWZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.gEmmrt(this.AEQbTJ, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.rWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.EZpvd(view);
            }
        });
        textView.setVisibility(8);
        textView2.setVisibility(8);
        textView5.setOnClickListener(new View.OnClickListener() { // from class: o.rXb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.values(this.KWHzl, view);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() { // from class: o.rXa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.fetchVPNInfo(this.OLrzqt, view);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() { // from class: o.rXe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DateRangeFilterView.AkhnZx(this.EZpvd, view);
            }
        });
        String string = getContext().getString(C8195ayE.ActionBar.fARcdN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        KWHzl(string);
        String string2 = getContext().getString(C8195ayE.ActionBar.AuCTel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        AEQbTJ(string2);
        String string3 = getContext().getString(PresetButtonSelection.RECENT_7.getPeriodText());
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getContext().getString(presetButtonSelection.getPeriodText());
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = getContext().getString(PresetButtonSelection.RECENT_90.getPeriodText());
        Intrinsics.checkNotNullExpressionValue(string5, "");
        setFilterButtonTitle(string3, string4, string5);
        AEQbTJ(this.OLrzqt);
    }

    public static abstract class ActionBar {
        public final PresetButtonSelection KWHzl;
        public final Calendar OLrzqt;
        public final Calendar copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView$PresetButtonSelection)
  (r2v0 java.util.Calendar)
  (r3v0 java.util.Calendar)
 A[MD:(com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView$PresetButtonSelection, java.util.Calendar, java.util.Calendar):void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView.ActionBar.<init>(com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView$PresetButtonSelection, java.util.Calendar, java.util.Calendar):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(PresetButtonSelection presetButtonSelection, Calendar calendar, Calendar calendar2, DefaultConstructorMarker defaultConstructorMarker) {
            this(presetButtonSelection, calendar, calendar2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PresetButtonSelection OLrzqt() {
            return this.KWHzl;
        }

        public static final class Application extends ActionBar {
            public static final Application AEQbTJ = new Application();

            /* JADX WARN: Illegal instructions before constructor call */
            private Application() {
                PresetButtonSelection presetButtonSelection = PresetButtonSelection.RECENT_7;
                rWS rws = rWS.KWHzl;
                Calendar calendarKWHzl = rws.KWHzl(-6);
                Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
                Calendar dateFilterTodayDate$default = rWS.getDateFilterTodayDate$default(rws, 0, 1, null);
                Intrinsics.checkNotNullExpressionValue(dateFilterTodayDate$default, "");
                super(presetButtonSelection, calendarKWHzl, dateFilterTodayDate$default, null);
            }
        }

        public ActionBar(PresetButtonSelection presetButtonSelection, Calendar calendar, Calendar calendar2) {
            this.KWHzl = presetButtonSelection;
            this.OLrzqt = calendar;
            this.copydefault = calendar2;
        }

        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            /* JADX WARN: Illegal instructions before constructor call */
            private TaskDescription() {
                PresetButtonSelection presetButtonSelection = PresetButtonSelection.RECENT_30;
                rWS rws = rWS.KWHzl;
                Calendar calendarKWHzl = rws.KWHzl(-29);
                Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
                Calendar dateFilterTodayDate$default = rWS.getDateFilterTodayDate$default(rws, 0, 1, null);
                Intrinsics.checkNotNullExpressionValue(dateFilterTodayDate$default, "");
                super(presetButtonSelection, calendarKWHzl, dateFilterTodayDate$default, null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0530ActionBar extends ActionBar {
            public static final C0530ActionBar EZpvd = new C0530ActionBar();

            /* JADX WARN: Illegal instructions before constructor call */
            private C0530ActionBar() {
                PresetButtonSelection presetButtonSelection = PresetButtonSelection.RECENT_90;
                rWS rws = rWS.KWHzl;
                Calendar calendarKWHzl = rws.KWHzl(-89);
                Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
                Calendar dateFilterTodayDate$default = rWS.getDateFilterTodayDate$default(rws, 0, 1, null);
                Intrinsics.checkNotNullExpressionValue(dateFilterTodayDate$default, "");
                super(presetButtonSelection, calendarKWHzl, dateFilterTodayDate$default, null);
            }
        }
    }

    public static final void djBIcL(DateRangeFilterView dateRangeFilterView, View view) {
        Activity activityCopy$default = Activity.copy$default(dateRangeFilterView.OLrzqt, null, DateFieldSelection.START, null, null, 13, null);
        dateRangeFilterView.OLrzqt = activityCopy$default;
        dateRangeFilterView.AEQbTJ(activityCopy$default);
        Intrinsics.copydefault(view);
        dateRangeFilterView.setupTimePicker(view, dateRangeFilterView.OLrzqt.copydefault());
    }

    public static final void gEmmrt(DateRangeFilterView dateRangeFilterView, View view) {
        Activity activityCopy$default = Activity.copy$default(dateRangeFilterView.OLrzqt, null, DateFieldSelection.END, null, null, 13, null);
        dateRangeFilterView.OLrzqt = activityCopy$default;
        dateRangeFilterView.AEQbTJ(activityCopy$default);
        Intrinsics.copydefault(view);
        dateRangeFilterView.setupTimePicker(view, dateRangeFilterView.OLrzqt.EZpvd());
    }

    public static final void EZpvd(View view) {
        view.setSelected(!view.isSelected());
    }

    public static final void values(DateRangeFilterView dateRangeFilterView, View view) {
        Activity activity = dateRangeFilterView.OLrzqt;
        ActionBar.Application application = ActionBar.Application.AEQbTJ;
        PresetButtonSelection presetButtonSelectionOLrzqt = application.OLrzqt();
        DateFieldSelection dateFieldSelection = DateFieldSelection.START;
        Calendar calendarEZpvd = dateRangeFilterView.EZpvd(application.EZpvd());
        Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
        Calendar calendarKWHzl = dateRangeFilterView.KWHzl(application.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
        Activity activityEZpvd = activity.EZpvd(presetButtonSelectionOLrzqt, dateFieldSelection, calendarEZpvd, calendarKWHzl);
        dateRangeFilterView.OLrzqt = activityEZpvd;
        dateRangeFilterView.AEQbTJ(activityEZpvd);
    }

    public static final void fetchVPNInfo(DateRangeFilterView dateRangeFilterView, View view) {
        Activity activity = dateRangeFilterView.OLrzqt;
        ActionBar.TaskDescription taskDescription = ActionBar.TaskDescription.AEQbTJ;
        PresetButtonSelection presetButtonSelectionOLrzqt = taskDescription.OLrzqt();
        DateFieldSelection dateFieldSelection = DateFieldSelection.START;
        Calendar calendarEZpvd = dateRangeFilterView.EZpvd(taskDescription.EZpvd());
        Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
        Calendar calendarKWHzl = dateRangeFilterView.KWHzl(taskDescription.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
        Activity activityEZpvd = activity.EZpvd(presetButtonSelectionOLrzqt, dateFieldSelection, calendarEZpvd, calendarKWHzl);
        dateRangeFilterView.OLrzqt = activityEZpvd;
        dateRangeFilterView.AEQbTJ(activityEZpvd);
    }

    public static final void AkhnZx(DateRangeFilterView dateRangeFilterView, View view) {
        Activity activity = dateRangeFilterView.OLrzqt;
        ActionBar.C0530ActionBar c0530ActionBar = ActionBar.C0530ActionBar.EZpvd;
        PresetButtonSelection presetButtonSelectionOLrzqt = c0530ActionBar.OLrzqt();
        DateFieldSelection dateFieldSelection = DateFieldSelection.START;
        Calendar calendarEZpvd = dateRangeFilterView.EZpvd(c0530ActionBar.EZpvd());
        Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
        Calendar calendarKWHzl = dateRangeFilterView.KWHzl(c0530ActionBar.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
        Activity activityEZpvd = activity.EZpvd(presetButtonSelectionOLrzqt, dateFieldSelection, calendarEZpvd, calendarKWHzl);
        dateRangeFilterView.OLrzqt = activityEZpvd;
        dateRangeFilterView.AEQbTJ(activityEZpvd);
    }

    public final void setupTimePicker(View view, Calendar calendar) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.EZpvd;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.copydefault();
        }
        MZ mzCopydefault = new MZ(getContext(), new InterfaceC5318Nc() { // from class: o.rXd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view2) {
                DateRangeFilterView.setupTimePicker$lambda$8(this.EZpvd, date, view2);
            }
        }).AEQbTJ(C32113mPz.Fragment.AwvSrB, new MY() { // from class: o.rXf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view2) {
                DateRangeFilterView.setupTimePicker$lambda$11(this.AEQbTJ, view2);
            }
        }).KWHzl(new boolean[]{true, true, true, false, false, false}).EZpvd("", "", "", "", "", "").EZpvd(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.fJNWhG)).KWHzl(20).copydefault(calendar);
        rWS rws = rWS.KWHzl;
        Calendar calendarKWHzl = rws.KWHzl(-89);
        Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
        Calendar calendarEZpvd = EZpvd(calendarKWHzl);
        Calendar dateFilterTodayDate$default = rWS.getDateFilterTodayDate$default(rws, 0, 1, null);
        Intrinsics.checkNotNullExpressionValue(dateFilterTodayDate$default, "");
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = mzCopydefault.KWHzl(calendarEZpvd, KWHzl(dateFilterTodayDate$default)).AEQbTJ(this.AhwBna).OLrzqt(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.isConnected)).EZpvd(false).AEQbTJ(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.zLjUOn)).AYXKKw(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.ejfBZ)).copydefault(2.0f).copydefault(7).KWHzl(false).copydefault(new InterfaceC5319Nd() { // from class: o.rXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                DateRangeFilterView.setupTimePicker$lambda$12(this.AEQbTJ, date);
            }
        }).EZpvd();
        this.EZpvd = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd != null) {
            viewOnClickListenerC5326NkEZpvd.OLrzqt(false);
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = this.EZpvd;
        if (viewOnClickListenerC5326Nk2 != null) {
            viewOnClickListenerC5326Nk2.AEQbTJ(view, false);
        }
    }

    public static final void setupTimePicker$lambda$8(DateRangeFilterView dateRangeFilterView, Date date, View view) {
        Activity activity = dateRangeFilterView.OLrzqt;
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (Intrinsics.EZpvd(view, dateRangeFilterView.values)) {
                if (calendar.getTimeInMillis() > dateRangeFilterView.OLrzqt.EZpvd().getTimeInMillis()) {
                    Calendar calendarEZpvd = dateRangeFilterView.EZpvd(dateRangeFilterView.OLrzqt.EZpvd());
                    Date time = calendarEZpvd.getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "");
                    textView.setText(dateRangeFilterView.AEQbTJ(time));
                    Activity activity2 = dateRangeFilterView.OLrzqt;
                    Intrinsics.copydefault(calendarEZpvd);
                    dateRangeFilterView.OLrzqt = Activity.copy$default(activity2, null, null, calendarEZpvd, null, 11, null);
                    ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = dateRangeFilterView.EZpvd;
                    if (viewOnClickListenerC5326Nk != null) {
                        viewOnClickListenerC5326Nk.AEQbTJ(calendarEZpvd);
                    }
                } else {
                    Intrinsics.copydefault(date);
                    textView.setText(dateRangeFilterView.AEQbTJ(date));
                    Activity activity3 = dateRangeFilterView.OLrzqt;
                    Intrinsics.copydefault(calendar);
                    dateRangeFilterView.OLrzqt = Activity.copy$default(activity3, null, null, calendar, null, 11, null);
                }
            } else if (calendar.getTimeInMillis() < dateRangeFilterView.OLrzqt.copydefault().getTimeInMillis()) {
                Calendar calendarKWHzl = dateRangeFilterView.KWHzl(dateRangeFilterView.OLrzqt.copydefault());
                Date time2 = calendarKWHzl.getTime();
                Intrinsics.checkNotNullExpressionValue(time2, "");
                textView.setText(dateRangeFilterView.AEQbTJ(time2));
                Activity activity4 = dateRangeFilterView.OLrzqt;
                Intrinsics.copydefault(calendarKWHzl);
                dateRangeFilterView.OLrzqt = Activity.copy$default(activity4, null, null, null, calendarKWHzl, 7, null);
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = dateRangeFilterView.EZpvd;
                if (viewOnClickListenerC5326Nk2 != null) {
                    viewOnClickListenerC5326Nk2.AEQbTJ(calendarKWHzl);
                }
            } else {
                Intrinsics.copydefault(date);
                textView.setText(dateRangeFilterView.AEQbTJ(date));
                Activity activity5 = dateRangeFilterView.OLrzqt;
                Intrinsics.copydefault(calendar);
                dateRangeFilterView.OLrzqt = Activity.copy$default(activity5, null, null, null, calendar, 7, null);
            }
        }
        Intrinsics.copydefault(date);
        if (dateRangeFilterView.EZpvd(date, activity)) {
            Activity activityCopy$default = Activity.copy$default(dateRangeFilterView.OLrzqt, PresetButtonSelection.CUSTOM, null, null, null, 14, null);
            dateRangeFilterView.OLrzqt = activityCopy$default;
            dateRangeFilterView.AEQbTJ(activityCopy$default);
        }
    }

    public static final void setupTimePicker$lambda$11(final DateRangeFilterView dateRangeFilterView, View view) {
        dateRangeFilterView.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.rXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                DateRangeFilterView.setupTimePicker$lambda$11$lambda$9(this.AEQbTJ, view2);
            }
        });
        dateRangeFilterView.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.rWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                DateRangeFilterView.setupTimePicker$lambda$11$lambda$10(this.KWHzl, view2);
            }
        });
    }

    public static final void setupTimePicker$lambda$11$lambda$9(DateRangeFilterView dateRangeFilterView, View view) {
        dateRangeFilterView.AEQbTJ();
        Application application = dateRangeFilterView.AEQbTJ;
        if (application != null) {
            Period periodOLrzqt = dateRangeFilterView.OLrzqt(dateRangeFilterView.OLrzqt);
            Calendar calendarEZpvd = dateRangeFilterView.EZpvd(dateRangeFilterView.OLrzqt.copydefault());
            Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
            Calendar calendarKWHzl = dateRangeFilterView.KWHzl(dateRangeFilterView.OLrzqt.EZpvd());
            Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
            application.KWHzl(new UserDateSelectionUiModel(periodOLrzqt, calendarEZpvd, calendarKWHzl));
        }
    }

    public static final void setupTimePicker$lambda$11$lambda$10(DateRangeFilterView dateRangeFilterView, View view) {
        dateRangeFilterView.copydefault();
        View.OnClickListener onClickListener = dateRangeFilterView.copydefault;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void setupTimePicker$lambda$12(DateRangeFilterView dateRangeFilterView, Date date) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = dateRangeFilterView.EZpvd;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.fetchVPNInfo();
        }
    }

    public final Calendar EZpvd(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public final Calendar KWHzl(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 999);
        return calendar2;
    }

    public final String AEQbTJ(Date date) {
        return pTA.formatSimpleDate$default(date, null, 1, null);
    }

    public final boolean EZpvd(Date date, Activity activity) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (this.OLrzqt.OLrzqt() == DateFieldSelection.START) {
            long timeInMillis = activity.copydefault().getTimeInMillis();
            Intrinsics.copydefault(calendar);
            return timeInMillis != EZpvd(calendar).getTimeInMillis();
        }
        long timeInMillis2 = activity.EZpvd().getTimeInMillis();
        Intrinsics.copydefault(calendar);
        return timeInMillis2 != KWHzl(calendar).getTimeInMillis();
    }

    public final void setDateSelection(@NotNull rWV rwv) {
        Activity activityCopy$default;
        Intrinsics.checkNotNullParameter(rwv, "");
        if (Intrinsics.EZpvd(rwv, rWV.ActionBar.KWHzl)) {
            Activity activity = this.OLrzqt;
            ActionBar.Application application = ActionBar.Application.AEQbTJ;
            PresetButtonSelection presetButtonSelectionOLrzqt = application.OLrzqt();
            Calendar calendarEZpvd = EZpvd(application.EZpvd());
            Intrinsics.checkNotNullExpressionValue(calendarEZpvd, "");
            Calendar calendarKWHzl = KWHzl(application.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(calendarKWHzl, "");
            activityCopy$default = Activity.copy$default(activity, presetButtonSelectionOLrzqt, null, calendarEZpvd, calendarKWHzl, 2, null);
        } else if (Intrinsics.EZpvd(rwv, rWV.StateListAnimator.KWHzl)) {
            Activity activity2 = this.OLrzqt;
            ActionBar.TaskDescription taskDescription = ActionBar.TaskDescription.AEQbTJ;
            PresetButtonSelection presetButtonSelectionOLrzqt2 = taskDescription.OLrzqt();
            Calendar calendarEZpvd2 = EZpvd(taskDescription.EZpvd());
            Intrinsics.checkNotNullExpressionValue(calendarEZpvd2, "");
            Calendar calendarKWHzl2 = KWHzl(taskDescription.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(calendarKWHzl2, "");
            activityCopy$default = Activity.copy$default(activity2, presetButtonSelectionOLrzqt2, null, calendarEZpvd2, calendarKWHzl2, 2, null);
        } else if (Intrinsics.EZpvd(rwv, rWV.Activity.OLrzqt)) {
            Activity activity3 = this.OLrzqt;
            ActionBar.C0530ActionBar c0530ActionBar = ActionBar.C0530ActionBar.EZpvd;
            PresetButtonSelection presetButtonSelectionOLrzqt3 = c0530ActionBar.OLrzqt();
            Calendar calendarEZpvd3 = EZpvd(c0530ActionBar.EZpvd());
            Intrinsics.checkNotNullExpressionValue(calendarEZpvd3, "");
            Calendar calendarKWHzl3 = KWHzl(c0530ActionBar.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(calendarKWHzl3, "");
            activityCopy$default = Activity.copy$default(activity3, presetButtonSelectionOLrzqt3, null, calendarEZpvd3, calendarKWHzl3, 2, null);
        } else {
            if (!(rwv instanceof rWV.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            Activity activity4 = this.OLrzqt;
            PresetButtonSelection presetButtonSelection = PresetButtonSelection.CUSTOM;
            rWV.Application application2 = (rWV.Application) rwv;
            Calendar calendarEZpvd4 = EZpvd(application2.copydefault());
            Intrinsics.checkNotNullExpressionValue(calendarEZpvd4, "");
            Calendar calendarKWHzl4 = KWHzl(application2.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(calendarKWHzl4, "");
            activityCopy$default = Activity.copy$default(activity4, presetButtonSelection, null, calendarEZpvd4, calendarKWHzl4, 2, null);
        }
        this.OLrzqt = activityCopy$default;
        AEQbTJ(activityCopy$default);
    }

    private final void KWHzl(String str) {
        this.ejfBZ.setText(str);
    }

    private final void AEQbTJ(String str) {
        this.fetchVPNInfo.setText(str);
    }

    public final void setOnConfirmDateListener(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
        Activity activity = this.KWHzl;
        this.OLrzqt = activity;
        AEQbTJ(activity);
    }

    public final void setFilterButtonTitle(String str, String str2, String str3) {
        this.fARcdN.setText(str);
        this.isConnected.setText(str2);
        this.AuCTel.setText(str3);
    }

    public final void copydefault() {
        OLrzqt();
    }

    public final void AEQbTJ() {
        this.djBIcL = Activity.copy$default(this.OLrzqt, null, null, null, null, 15, null);
    }

    public final void OLrzqt() {
        Activity activityCopy$default = Activity.copy$default(this.KWHzl, null, null, null, null, 15, null);
        this.OLrzqt = activityCopy$default;
        AEQbTJ(activityCopy$default);
    }

    public final void AEQbTJ(Activity activity) {
        OLrzqt(activity.AEQbTJ());
        KWHzl(activity.OLrzqt());
        OLrzqt(activity.copydefault());
        copydefault(activity.EZpvd());
        copydefault(activity);
    }

    private final void OLrzqt(PresetButtonSelection presetButtonSelection) {
        this.fARcdN.setSelected(presetButtonSelection == PresetButtonSelection.RECENT_7);
        this.isConnected.setSelected(presetButtonSelection == PresetButtonSelection.RECENT_30);
        this.AuCTel.setSelected(presetButtonSelection == PresetButtonSelection.RECENT_90);
    }

    private final void KWHzl(DateFieldSelection dateFieldSelection) {
        this.values.setSelected(dateFieldSelection == DateFieldSelection.START);
        this.AYXKKw.setSelected(dateFieldSelection == DateFieldSelection.END);
    }

    private final void OLrzqt(Calendar calendar) {
        TextView textView = this.values;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        textView.setText(AEQbTJ(time));
    }

    private final void copydefault(Calendar calendar) {
        TextView textView = this.AYXKKw;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        textView.setText(AEQbTJ(time));
    }

    public final Period OLrzqt(Activity activity) {
        int i = TaskDescription.copydefault[activity.AEQbTJ().ordinal()];
        if (i == 1) {
            return Period.SEVEN_DAYS;
        }
        if (i == 2) {
            return Period.THIRTY_DAYS;
        }
        if (i == 3) {
            return Period.NINETY_DAYS;
        }
        return Period.CUSTOM;
    }

    private final void copydefault(Activity activity) {
        int i = TaskDescription.OLrzqt[activity.OLrzqt().ordinal()];
        if (i == 1) {
            setupTimePicker(this.values, activity.copydefault());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setupTimePicker(this.AYXKKw, activity.EZpvd());
        }
    }

    public static final class Activity {
        public final PresetButtonSelection AEQbTJ;
        public final Calendar KWHzl;
        public final DateFieldSelection OLrzqt;
        public final Calendar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, PresetButtonSelection presetButtonSelection, DateFieldSelection dateFieldSelection, Calendar calendar, Calendar calendar2, int i, Object obj) {
            if ((i & 1) != 0) {
                presetButtonSelection = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                dateFieldSelection = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                calendar = activity.KWHzl;
            }
            if ((i & 8) != 0) {
                calendar2 = activity.copydefault;
            }
            return activity.EZpvd(presetButtonSelection, dateFieldSelection, calendar, calendar2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PresetButtonSelection AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull PresetButtonSelection presetButtonSelection, @NotNull DateFieldSelection dateFieldSelection, @NotNull Calendar calendar, @NotNull Calendar calendar2) {
            Intrinsics.checkNotNullParameter(presetButtonSelection, "");
            Intrinsics.checkNotNullParameter(dateFieldSelection, "");
            Intrinsics.checkNotNullParameter(calendar, "");
            Intrinsics.checkNotNullParameter(calendar2, "");
            return new Activity(presetButtonSelection, dateFieldSelection, calendar, calendar2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DateFieldSelection OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Calendar copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DateFilterViewState(presetButtonSelection=" + this.AEQbTJ + ", dateFieldSelection=" + this.OLrzqt + ", startDate=" + this.KWHzl + ", endDate=" + this.copydefault + ")";
        }

        public Activity(@NotNull PresetButtonSelection presetButtonSelection, @NotNull DateFieldSelection dateFieldSelection, @NotNull Calendar calendar, @NotNull Calendar calendar2) {
            Intrinsics.checkNotNullParameter(presetButtonSelection, "");
            Intrinsics.checkNotNullParameter(dateFieldSelection, "");
            Intrinsics.checkNotNullParameter(calendar, "");
            Intrinsics.checkNotNullParameter(calendar2, "");
            this.AEQbTJ = presetButtonSelection;
            this.OLrzqt = dateFieldSelection;
            this.KWHzl = calendar;
            this.copydefault = calendar2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PresetButtonSelection {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PresetButtonSelection[] $VALUES;
        private final int periodText;
        public static final PresetButtonSelection RECENT_7 = new PresetButtonSelection("RECENT_7", 0, C8195ayE.ActionBar.fIwbmz);
        public static final PresetButtonSelection RECENT_30 = new PresetButtonSelection("RECENT_30", 1, C8195ayE.ActionBar.fJNWhG);
        public static final PresetButtonSelection RECENT_90 = new PresetButtonSelection("RECENT_90", 2, C8195ayE.ActionBar.ejfBZ);
        public static final PresetButtonSelection CUSTOM = new PresetButtonSelection("CUSTOM", 3, C8195ayE.ActionBar.fetchVPNInfo);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PresetButtonSelection[] $values() {
            return new PresetButtonSelection[]{RECENT_7, RECENT_30, RECENT_90, CUSTOM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PresetButtonSelection> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPeriodText() {
            return this.periodText;
        }

        private PresetButtonSelection(String str, int i, int i2) {
            this.periodText = i2;
        }

        static {
            PresetButtonSelection[] presetButtonSelectionArr$values = $values();
            $VALUES = presetButtonSelectionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(presetButtonSelectionArr$values);
        }

        public static PresetButtonSelection valueOf(String str) {
            return (PresetButtonSelection) Enum.valueOf(PresetButtonSelection.class, str);
        }

        public static PresetButtonSelection[] values() {
            return (PresetButtonSelection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DateFieldSelection {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DateFieldSelection[] $VALUES;
        public static final DateFieldSelection START = new DateFieldSelection("START", 0);
        public static final DateFieldSelection END = new DateFieldSelection("END", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DateFieldSelection[] $values() {
            return new DateFieldSelection[]{START, END};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DateFieldSelection> getEntries() {
            return $ENTRIES;
        }

        private DateFieldSelection(String str, int i) {
        }

        static {
            DateFieldSelection[] dateFieldSelectionArr$values = $values();
            $VALUES = dateFieldSelectionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dateFieldSelectionArr$values);
        }

        public static DateFieldSelection valueOf(String str) {
            return (DateFieldSelection) Enum.valueOf(DateFieldSelection.class, str);
        }

        public static DateFieldSelection[] values() {
            return (DateFieldSelection[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator extends ScrollView {
        public final int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull Context context) {
            this(context, null, 0, 6, null);
            Intrinsics.checkNotNullParameter(context, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            Intrinsics.checkNotNullParameter(context, "");
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:404) call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.view.DateRangeFilterView.StateListAnimator.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
        public /* synthetic */ StateListAnimator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = new int[2];
        }

        @Override // android.widget.ScrollView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            FrameLayout frameLayoutCopydefault = copydefault();
            if (frameLayoutCopydefault == null) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 0 && EZpvd(motionEvent, frameLayoutCopydefault)) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final FrameLayout copydefault() {
            return (FrameLayout) findViewById(C8195ayE.Application.copydefault);
        }

        public final boolean EZpvd(MotionEvent motionEvent, View view) {
            view.getLocationOnScreen(this.EZpvd);
            int[] iArr = this.EZpvd;
            int i = iArr[0];
            int i2 = iArr[1];
            IntRange intRange = new IntRange(i, view.getWidth() + i);
            IntRange intRange2 = new IntRange(i2, view.getHeight() + i2);
            int iKWHzl = intRange.KWHzl();
            int iCopydefault = intRange.copydefault();
            int iEZpvd = yII.EZpvd(motionEvent.getRawX());
            if (iKWHzl > iEZpvd || iEZpvd > iCopydefault) {
                return false;
            }
            int iKWHzl2 = intRange2.KWHzl();
            int iCopydefault2 = intRange2.copydefault();
            int iEZpvd2 = yII.EZpvd(motionEvent.getRawY());
            return iKWHzl2 <= iEZpvd2 && iEZpvd2 <= iCopydefault2;
        }
    }
}
