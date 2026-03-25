package com.okinc.business.market.widget.time_range_selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.timepicker.TimeModel;
import com.okinc.business.market.features.filter.domain.TimeRangeFilter;
import com.okinc.business.market.widget.time_range_selection.TimeSelectionWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C21657hHm;
import o.C23274hvD;
import o.C25352ivB;
import o.C33070mpX;
import o.C33129mqd;
import o.C54984xbQ;
import o.C56392yDr;
import o.C56444yFp;
import o.C56529yIt;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.kNB;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeSelectionWidget extends ConstraintLayout {
    public final Calendar AEQbTJ;
    public boolean AYXKKw;
    public final NumberPicker AhwBna;
    public final NumberPicker AkhnZx;
    public final Integer[] DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final DatePicker KWHzl;
    public Calendar OLrzqt;
    public kNB copydefault;
    public Calendar djBIcL;
    public boolean gEmmrt;
    public final Calendar valueOf;
    public PickerType values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeSelectionWidget(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeSelectionWidget(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull kNB knb) {
        Intrinsics.checkNotNullParameter(knb, "");
        this.copydefault = knb;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: com.okinc.business.market.widget.time_range_selection.TimeSelectionWidget.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ TimeSelectionWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSelectionWidget(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.DbNXlk = new Integer[]{0, 15, 30, 45};
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TimeSelectionWidget.copydefault(context, this);
            }
        });
        Calendar calendar = Calendar.getInstance();
        this.AEQbTJ = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, -180);
        this.valueOf = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(calendar2.getTimeInMillis());
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        Intrinsics.checkNotNullExpressionValue(calendar3, "");
        this.djBIcL = calendar3;
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(calendar.getTimeInMillis());
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        Intrinsics.checkNotNullExpressionValue(calendar4, "");
        this.OLrzqt = calendar4;
        this.values = PickerType.START_DATE;
        this.AhwBna = EZpvd().copydefault;
        this.AkhnZx = EZpvd().AEQbTJ;
        DatePicker datePicker = EZpvd().KWHzl;
        this.KWHzl = datePicker;
        datePicker.setMinDate(calendar2.getTimeInMillis());
        datePicker.setMaxDate(calendar.getTimeInMillis());
        copydefault(datePicker);
        setupPickers();
        djBIcL();
    }

    private final C21657hHm EZpvd() {
        return (C21657hHm) this.EZpvd.getValue();
    }

    public static final C21657hHm copydefault(Context context, TimeSelectionWidget timeSelectionWidget) {
        return C21657hHm.AEQbTJ(LayoutInflater.from(context), timeSelectionWidget, true);
    }

    public final void setupPickers() {
        LinearLayout linearLayout = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        Calendar calendar = Calendar.getInstance();
        this.KWHzl.init(calendar.get(1), calendar.get(2), calendar.get(5), new DatePicker.OnDateChangedListener() { // from class: o.kND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(android.widget.DatePicker datePicker, int i, int i2, int i3) {
                TimeSelectionWidget.setupPickers$lambda$4(this.AEQbTJ, datePicker, i, i2, i3);
            }
        });
        setupStartTime();
        setupEndTime();
        NumberPicker numberPicker = this.AkhnZx;
        Integer[] numArr = this.DbNXlk;
        ArrayList arrayList = new ArrayList(numArr.length);
        for (Integer num : numArr) {
            int iIntValue = num.intValue();
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(str);
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    public static final void setupPickers$lambda$4(TimeSelectionWidget timeSelectionWidget, DatePicker datePicker, int i, int i2, int i3) {
        PickerType pickerType = timeSelectionWidget.values;
        if (pickerType == PickerType.START_DATE) {
            timeSelectionWidget.djBIcL.set(i, i2, i3);
            Calendar calendar = timeSelectionWidget.djBIcL;
            C54984xbQ c54984xbQ = timeSelectionWidget.EZpvd().djBIcL;
            Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
            timeSelectionWidget.EZpvd(calendar, c54984xbQ);
            timeSelectionWidget.EZpvd().AhwBna.setText(timeSelectionWidget.copydefault());
        } else if (pickerType == PickerType.END_DATE) {
            timeSelectionWidget.OLrzqt.set(i, i2, i3);
            Calendar calendar2 = timeSelectionWidget.OLrzqt;
            C54984xbQ c54984xbQ2 = timeSelectionWidget.EZpvd().valueOf;
            Intrinsics.checkNotNullExpressionValue(c54984xbQ2, "");
            timeSelectionWidget.EZpvd(calendar2, c54984xbQ2);
            timeSelectionWidget.EZpvd().AYXKKw.setText(timeSelectionWidget.copydefault());
        }
        timeSelectionWidget.AEQbTJ();
    }

    public final void setupNumberPicker(NumberPicker numberPicker, int i, int i2, int i3) {
        numberPicker.setMinValue(i);
        numberPicker.setMaxValue(i2);
        numberPicker.setValue(i3);
        numberPicker.setWrapSelectorWheel(false);
    }

    public final void EZpvd(Calendar calendar, C54984xbQ c54984xbQ) {
        if (calendar.compareTo(this.AEQbTJ) > 0) {
            calendar.set(11, 0);
            calendar.set(12, 0);
        }
        c54984xbQ.setText(AEQbTJ(calendar));
    }

    public final void setupStartTime() {
        int length;
        if (this.AYXKKw) {
            setupNumberPicker(this.AhwBna, 0, AEQbTJ(this.djBIcL, this.OLrzqt) ? this.OLrzqt.get(11) : 23, this.djBIcL.get(11));
            NumberPicker numberPicker = this.AkhnZx;
            if (EZpvd(this.djBIcL, this.OLrzqt)) {
                if (this.djBIcL.compareTo(this.OLrzqt) > 0) {
                    this.djBIcL.set(12, this.OLrzqt.get(12));
                }
                length = KWHzl(this.OLrzqt.get(12));
            } else {
                length = this.DbNXlk.length - 1;
            }
            setupNumberPicker(numberPicker, 0, length, KWHzl(this.djBIcL.get(12)));
            return;
        }
        setupNumberPicker(this.AhwBna, 0, 23, this.djBIcL.get(11));
        setupNumberPicker(this.AkhnZx, 0, this.DbNXlk.length - 1, KWHzl(this.djBIcL.get(12)));
    }

    public final void setupEndTime() {
        int length;
        if (this.gEmmrt) {
            NumberPicker numberPicker = this.AhwBna;
            int i = AEQbTJ(this.djBIcL, this.OLrzqt) ? this.djBIcL.get(11) : 0;
            Calendar calendar = this.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            setupNumberPicker(numberPicker, i, AEQbTJ(calendar, this.OLrzqt) ? this.AEQbTJ.get(11) : 23, this.OLrzqt.get(11));
            NumberPicker numberPicker2 = this.AkhnZx;
            int iKWHzl = EZpvd(this.djBIcL, this.OLrzqt) ? KWHzl(this.djBIcL.get(12)) : 0;
            Calendar calendar2 = this.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(calendar2, "");
            if (EZpvd(calendar2, this.OLrzqt)) {
                length = KWHzl(this.AEQbTJ.get(12));
            } else {
                length = this.DbNXlk.length - 1;
            }
            setupNumberPicker(numberPicker2, iKWHzl, length, KWHzl(this.OLrzqt.get(12)));
            return;
        }
        setupNumberPicker(this.AhwBna, 0, 23, this.OLrzqt.get(11));
        setupNumberPicker(this.AkhnZx, 0, this.DbNXlk.length - 1, KWHzl(this.OLrzqt.get(12)));
    }

    public final void setupStartDay() {
        this.KWHzl.setMaxDate(this.OLrzqt.getTimeInMillis());
        this.KWHzl.setMinDate(this.valueOf.getTimeInMillis());
        this.KWHzl.updateDate(this.djBIcL.get(1), this.djBIcL.get(2), this.djBIcL.get(5));
    }

    public final void setupEndDay() {
        this.KWHzl.setMinDate(this.djBIcL.getTimeInMillis());
        this.KWHzl.setMaxDate(this.AEQbTJ.getTimeInMillis());
        this.KWHzl.updateDate(this.OLrzqt.get(1), this.OLrzqt.get(2), this.OLrzqt.get(5));
    }

    private final void djBIcL() {
        final C21657hHm c21657hHmEZpvd = EZpvd();
        C25352ivB.setOnDoubleCheckClickListener$default(c21657hHmEZpvd.djBIcL, 0L, new Function1() { // from class: o.kNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.djBIcL(c21657hHmEZpvd, this, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(c21657hHmEZpvd.valueOf, 0L, new Function1() { // from class: o.kNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.gEmmrt(c21657hHmEZpvd, this, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(c21657hHmEZpvd.AhwBna, 0L, new Function1() { // from class: o.kNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.valueOf(c21657hHmEZpvd, this, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(c21657hHmEZpvd.AYXKKw, 0L, new Function1() { // from class: o.kNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.OLrzqt(c21657hHmEZpvd, this, (android.view.View) obj);
            }
        }, 1, null);
        c21657hHmEZpvd.copydefault.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: o.kNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(android.widget.NumberPicker numberPicker, int i, int i2) {
                TimeSelectionWidget.setupListeners$lambda$13$lambda$11(this.copydefault, c21657hHmEZpvd, numberPicker, i, i2);
            }
        });
        c21657hHmEZpvd.AEQbTJ.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: o.kNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(android.widget.NumberPicker numberPicker, int i, int i2) {
                TimeSelectionWidget.setupListeners$lambda$13$lambda$12(this.AEQbTJ, numberPicker, i, i2);
            }
        });
    }

    public static final Unit djBIcL(C21657hHm c21657hHm, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = c21657hHm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        timeSelectionWidget.KWHzl.setVisibility(8);
        timeSelectionWidget.values = PickerType.START_TIME;
        c21657hHm.djBIcL.setSelectedStyle(true, 3);
        c21657hHm.valueOf.setSelectedStyle(false, 3);
        c21657hHm.AhwBna.setSelectedStyle(false, 3);
        c21657hHm.AYXKKw.setSelectedStyle(false, 3);
        timeSelectionWidget.setupStartTime();
        c21657hHm.djBIcL.setText(timeSelectionWidget.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C21657hHm c21657hHm, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = c21657hHm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        timeSelectionWidget.KWHzl.setVisibility(8);
        timeSelectionWidget.values = PickerType.END_TIME;
        c21657hHm.djBIcL.setSelectedStyle(false, 3);
        c21657hHm.valueOf.setSelectedStyle(true, 3);
        c21657hHm.AhwBna.setSelectedStyle(false, 3);
        c21657hHm.AYXKKw.setSelectedStyle(false, 3);
        timeSelectionWidget.setupEndTime();
        c21657hHm.valueOf.setText(timeSelectionWidget.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C21657hHm c21657hHm, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = c21657hHm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        timeSelectionWidget.KWHzl.setVisibility(0);
        timeSelectionWidget.values = PickerType.START_DATE;
        c21657hHm.djBIcL.setSelectedStyle(false, 3);
        c21657hHm.valueOf.setSelectedStyle(false, 3);
        c21657hHm.AhwBna.setSelectedStyle(true, 3);
        c21657hHm.AYXKKw.setSelectedStyle(false, 3);
        Calendar calendar = timeSelectionWidget.djBIcL;
        C54984xbQ c54984xbQ = c21657hHm.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        timeSelectionWidget.EZpvd(calendar, c54984xbQ);
        timeSelectionWidget.setupStartDay();
        timeSelectionWidget.AYXKKw = true;
        c21657hHm.AhwBna.setText(timeSelectionWidget.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C21657hHm c21657hHm, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = c21657hHm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        timeSelectionWidget.KWHzl.setVisibility(0);
        timeSelectionWidget.values = PickerType.END_DATE;
        c21657hHm.djBIcL.setSelectedStyle(false, 3);
        c21657hHm.valueOf.setSelectedStyle(false, 3);
        c21657hHm.AhwBna.setSelectedStyle(false, 3);
        c21657hHm.AYXKKw.setSelectedStyle(true, 3);
        Calendar calendar = timeSelectionWidget.OLrzqt;
        C54984xbQ c54984xbQ = c21657hHm.valueOf;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        timeSelectionWidget.EZpvd(calendar, c54984xbQ);
        timeSelectionWidget.setupEndDay();
        timeSelectionWidget.gEmmrt = true;
        c21657hHm.AYXKKw.setText(timeSelectionWidget.copydefault());
        return Unit.INSTANCE;
    }

    public static final void setupListeners$lambda$13$lambda$11(TimeSelectionWidget timeSelectionWidget, C21657hHm c21657hHm, NumberPicker numberPicker, int i, int i2) {
        PickerType pickerType = timeSelectionWidget.values;
        if (pickerType == PickerType.START_TIME) {
            timeSelectionWidget.djBIcL.set(11, c21657hHm.copydefault.getValue());
            timeSelectionWidget.setupStartTime();
            timeSelectionWidget.EZpvd().djBIcL.setText(timeSelectionWidget.KWHzl());
        } else if (pickerType == PickerType.END_TIME) {
            timeSelectionWidget.OLrzqt.set(11, c21657hHm.copydefault.getValue());
            timeSelectionWidget.setupEndTime();
            timeSelectionWidget.EZpvd().valueOf.setText(timeSelectionWidget.KWHzl());
        }
        timeSelectionWidget.AEQbTJ();
    }

    public static final void setupListeners$lambda$13$lambda$12(TimeSelectionWidget timeSelectionWidget, NumberPicker numberPicker, int i, int i2) {
        PickerType pickerType = timeSelectionWidget.values;
        if (pickerType == PickerType.START_TIME) {
            timeSelectionWidget.djBIcL.set(12, timeSelectionWidget.DbNXlk[i2].intValue());
            timeSelectionWidget.EZpvd().djBIcL.setText(timeSelectionWidget.KWHzl());
        } else if (pickerType == PickerType.END_TIME) {
            timeSelectionWidget.OLrzqt.set(12, timeSelectionWidget.DbNXlk[i2].intValue());
            timeSelectionWidget.EZpvd().valueOf.setText(timeSelectionWidget.KWHzl());
        }
        timeSelectionWidget.AEQbTJ();
    }

    public final void AEQbTJ() {
        TimeRangeFilter timeRangeFilter;
        if (this.OLrzqt.compareTo(Calendar.getInstance()) > 0) {
            timeRangeFilter = new TimeRangeFilter(String.valueOf(this.djBIcL.getTimeInMillis()), (String) null, false, 6, (DefaultConstructorMarker) null);
        } else {
            timeRangeFilter = new TimeRangeFilter(String.valueOf(this.djBIcL.getTimeInMillis()), String.valueOf(this.OLrzqt.getTimeInMillis()), false, 4, (DefaultConstructorMarker) null);
        }
        kNB knb = this.copydefault;
        if (knb != null) {
            knb.copydefault(timeRangeFilter);
        }
    }

    private final String KWHzl() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = Locale.ROOT;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.AhwBna.getValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(OLrzqt())}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + " : " + str2;
    }

    public final String AEQbTJ(Calendar calendar) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = Locale.ROOT;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + " : " + str2;
    }

    private final String copydefault() {
        int dayOfMonth = this.KWHzl.getDayOfMonth();
        int month = this.KWHzl.getMonth();
        return dayOfMonth + "/" + (month + 1) + "/" + this.KWHzl.getYear();
    }

    public final String KWHzl(Calendar calendar) {
        int i = calendar.get(5);
        int i2 = calendar.get(2);
        return i + "/" + (i2 + 1) + "/" + calendar.get(1);
    }

    private final int OLrzqt() {
        return this.DbNXlk[this.AkhnZx.getValue()].intValue();
    }

    public final boolean AEQbTJ(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public final boolean EZpvd(Calendar calendar, Calendar calendar2) {
        return AEQbTJ(calendar, calendar2) && calendar.get(11) == calendar2.get(11);
    }

    public final void setData(TimeRangeFilter timeRangeFilter) {
        C21657hHm c21657hHmEZpvd = EZpvd();
        String strEZpvd = timeRangeFilter != null ? timeRangeFilter.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            c21657hHmEZpvd.AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.adevsa));
            c21657hHmEZpvd.valueOf.setText(AEQbTJ(this.OLrzqt));
        } else {
            this.OLrzqt.setTimeInMillis(C33129mqd.valueOf(timeRangeFilter != null ? timeRangeFilter.EZpvd() : null));
            c21657hHmEZpvd.valueOf.setText(AEQbTJ(this.OLrzqt));
            c21657hHmEZpvd.AYXKKw.setText(KWHzl(this.OLrzqt));
            this.AYXKKw = true;
        }
        String strOLrzqt = timeRangeFilter != null ? timeRangeFilter.OLrzqt() : null;
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            c21657hHmEZpvd.AhwBna.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.zdxASf));
            c21657hHmEZpvd.djBIcL.setText(AEQbTJ(this.djBIcL));
        } else {
            this.djBIcL.setTimeInMillis(C33129mqd.valueOf(timeRangeFilter != null ? timeRangeFilter.OLrzqt() : null));
            c21657hHmEZpvd.djBIcL.setText(AEQbTJ(this.djBIcL));
            c21657hHmEZpvd.AhwBna.setText(KWHzl(this.djBIcL));
            this.gEmmrt = true;
        }
    }

    public final void copydefault(DatePicker datePicker) {
        try {
            View childAt = datePicker.getChildAt(0);
            LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
            if (linearLayout == null) {
                return;
            }
            View childAt2 = linearLayout.getChildAt(0);
            LinearLayout linearLayout2 = childAt2 instanceof LinearLayout ? (LinearLayout) childAt2 : null;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int childCount = linearLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt3 = linearLayout2.getChildAt(i);
                if (childAt3 instanceof NumberPicker) {
                    ((NumberPicker) childAt3).setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                }
            }
            datePicker.requestLayout();
        } catch (Exception e) {
            pUU.KWHzl(e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PickerType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PickerType[] $VALUES;
        public static final PickerType START_TIME = new PickerType("START_TIME", 0);
        public static final PickerType END_TIME = new PickerType("END_TIME", 1);
        public static final PickerType START_DATE = new PickerType("START_DATE", 2);
        public static final PickerType END_DATE = new PickerType("END_DATE", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PickerType[] $values() {
            return new PickerType[]{START_TIME, END_TIME, START_DATE, END_DATE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PickerType> getEntries() {
            return $ENTRIES;
        }

        private PickerType(String str, int i) {
        }

        static {
            PickerType[] pickerTypeArr$values = $values();
            $VALUES = pickerTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pickerTypeArr$values);
        }

        public static PickerType valueOf(String str) {
            return (PickerType) Enum.valueOf(PickerType.class, str);
        }

        public static PickerType[] values() {
            return (PickerType[]) $VALUES.clone();
        }
    }

    public final int KWHzl(int i) {
        Integer[] numArr = this.DbNXlk;
        int length = numArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (numArr[length].intValue() <= i) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            length = -1;
        } else {
            length = -1;
        }
        return C56548yJl.copydefault(length, 0);
    }
}
