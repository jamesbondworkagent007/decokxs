package com.okinc.dexkline.market.widget.time_range_selection;

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
import com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter;
import com.okinc.dexkline.market.widget.time_range_selection.TimeSelectionWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C35964oKf;
import o.C54984xbQ;
import o.C56392yDr;
import o.C56444yFp;
import o.C56529yIt;
import o.C56548yJl;
import o.InterfaceC34610nfO;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.mUO;
import o.oOC;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TimeSelectionWidget extends ConstraintLayout {
    public Calendar AEQbTJ;
    public Calendar AYXKKw;
    public boolean AhwBna;
    public final Integer[] AkhnZx;
    public final NumberPicker DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC34610nfO KWHzl;
    public final DatePicker OLrzqt;
    public final Calendar copydefault;
    public final Calendar djBIcL;
    public boolean gEmmrt;
    public PickerType isConnected;
    public final NumberPicker valueOf;

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
    public final void setCallback(@NotNull InterfaceC34610nfO interfaceC34610nfO) {
        Intrinsics.checkNotNullParameter(interfaceC34610nfO, "");
        this.KWHzl = interfaceC34610nfO;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: com.okinc.dexkline.market.widget.time_range_selection.TimeSelectionWidget.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ TimeSelectionWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSelectionWidget(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = new Integer[]{0, 15, 30, 45};
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TimeSelectionWidget.KWHzl(context, this);
            }
        });
        Calendar calendar = Calendar.getInstance();
        this.copydefault = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, -180);
        this.djBIcL = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(calendar2.getTimeInMillis());
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        Intrinsics.checkNotNullExpressionValue(calendar3, "");
        this.AYXKKw = calendar3;
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(calendar.getTimeInMillis());
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        Intrinsics.checkNotNullExpressionValue(calendar4, "");
        this.AEQbTJ = calendar4;
        this.isConnected = PickerType.START_DATE;
        this.valueOf = KWHzl().OLrzqt;
        this.DbNXlk = KWHzl().EZpvd;
        DatePicker datePicker = KWHzl().KWHzl;
        this.OLrzqt = datePicker;
        datePicker.setMinDate(calendar2.getTimeInMillis());
        datePicker.setMaxDate(calendar.getTimeInMillis());
        EZpvd(datePicker);
        AYXKKw();
        valueOf();
    }

    private final oOC KWHzl() {
        return (oOC) this.EZpvd.getValue();
    }

    public static final oOC KWHzl(Context context, TimeSelectionWidget timeSelectionWidget) {
        return oOC.AEQbTJ(LayoutInflater.from(context), timeSelectionWidget, true);
    }

    private final void AYXKKw() {
        LinearLayout linearLayout = KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        Calendar calendar = Calendar.getInstance();
        this.OLrzqt.init(calendar.get(1), calendar.get(2), calendar.get(5), new DatePicker.OnDateChangedListener() { // from class: o.nfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(android.widget.DatePicker datePicker, int i, int i2, int i3) {
                TimeSelectionWidget.setupPickers$lambda$4(this.EZpvd, datePicker, i, i2, i3);
            }
        });
        isConnected();
        gEmmrt();
        NumberPicker numberPicker = this.DbNXlk;
        Integer[] numArr = this.AkhnZx;
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
        PickerType pickerType = timeSelectionWidget.isConnected;
        if (pickerType == PickerType.START_DATE) {
            timeSelectionWidget.AYXKKw.set(i, i2, i3);
            Calendar calendar = timeSelectionWidget.AYXKKw;
            C54984xbQ c54984xbQ = timeSelectionWidget.KWHzl().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
            timeSelectionWidget.AEQbTJ(calendar, c54984xbQ);
            timeSelectionWidget.KWHzl().AhwBna.setText(timeSelectionWidget.OLrzqt());
        } else if (pickerType == PickerType.END_DATE) {
            timeSelectionWidget.AEQbTJ.set(i, i2, i3);
            Calendar calendar2 = timeSelectionWidget.AEQbTJ;
            C54984xbQ c54984xbQ2 = timeSelectionWidget.KWHzl().valueOf;
            Intrinsics.checkNotNullExpressionValue(c54984xbQ2, "");
            timeSelectionWidget.AEQbTJ(calendar2, c54984xbQ2);
            timeSelectionWidget.KWHzl().gEmmrt.setText(timeSelectionWidget.OLrzqt());
        }
        timeSelectionWidget.copydefault();
    }

    private final void OLrzqt(NumberPicker numberPicker, int i, int i2, int i3) {
        numberPicker.setMinValue(i);
        numberPicker.setMaxValue(i2);
        numberPicker.setValue(i3);
        numberPicker.setWrapSelectorWheel(false);
    }

    private final void AEQbTJ(Calendar calendar, C54984xbQ c54984xbQ) {
        if (calendar.compareTo(this.copydefault) > 0) {
            calendar.set(11, 0);
            calendar.set(12, 0);
        }
        c54984xbQ.setText(EZpvd(calendar));
    }

    private final void isConnected() {
        int length;
        if (this.gEmmrt) {
            OLrzqt(this.valueOf, 0, OLrzqt(this.AYXKKw, this.AEQbTJ) ? this.AEQbTJ.get(11) : 23, this.AYXKKw.get(11));
            NumberPicker numberPicker = this.DbNXlk;
            if (EZpvd(this.AYXKKw, this.AEQbTJ)) {
                if (this.AYXKKw.compareTo(this.AEQbTJ) > 0) {
                    this.AYXKKw.set(12, this.AEQbTJ.get(12));
                }
                length = OLrzqt(this.AEQbTJ.get(12));
            } else {
                length = this.AkhnZx.length - 1;
            }
            OLrzqt(numberPicker, 0, length, OLrzqt(this.AYXKKw.get(12)));
            return;
        }
        OLrzqt(this.valueOf, 0, 23, this.AYXKKw.get(11));
        OLrzqt(this.DbNXlk, 0, this.AkhnZx.length - 1, OLrzqt(this.AYXKKw.get(12)));
    }

    private final void gEmmrt() {
        int length;
        if (this.AhwBna) {
            NumberPicker numberPicker = this.valueOf;
            int i = OLrzqt(this.AYXKKw, this.AEQbTJ) ? this.AYXKKw.get(11) : 0;
            Calendar calendar = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            OLrzqt(numberPicker, i, OLrzqt(calendar, this.AEQbTJ) ? this.copydefault.get(11) : 23, this.AEQbTJ.get(11));
            NumberPicker numberPicker2 = this.DbNXlk;
            int iOLrzqt = EZpvd(this.AYXKKw, this.AEQbTJ) ? OLrzqt(this.AYXKKw.get(12)) : 0;
            Calendar calendar2 = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(calendar2, "");
            if (EZpvd(calendar2, this.AEQbTJ)) {
                length = OLrzqt(this.copydefault.get(12));
            } else {
                length = this.AkhnZx.length - 1;
            }
            OLrzqt(numberPicker2, iOLrzqt, length, OLrzqt(this.AEQbTJ.get(12)));
            return;
        }
        OLrzqt(this.valueOf, 0, 23, this.AEQbTJ.get(11));
        OLrzqt(this.DbNXlk, 0, this.AkhnZx.length - 1, OLrzqt(this.AEQbTJ.get(12)));
    }

    private final void AhwBna() {
        this.OLrzqt.setMaxDate(this.AEQbTJ.getTimeInMillis());
        this.OLrzqt.setMinDate(this.djBIcL.getTimeInMillis());
        this.OLrzqt.updateDate(this.AYXKKw.get(1), this.AYXKKw.get(2), this.AYXKKw.get(5));
    }

    private final void djBIcL() {
        this.OLrzqt.setMinDate(this.AYXKKw.getTimeInMillis());
        this.OLrzqt.setMaxDate(this.copydefault.getTimeInMillis());
        this.OLrzqt.updateDate(this.AEQbTJ.get(1), this.AEQbTJ.get(2), this.AEQbTJ.get(5));
    }

    private final void valueOf() {
        final oOC oocKWHzl = KWHzl();
        mUO.setOnDoubleCheckClickListener$default(oocKWHzl.AYXKKw, 0L, new Function1() { // from class: o.nfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.gEmmrt(oocKWHzl, this, (android.view.View) obj);
            }
        }, 1, null);
        mUO.setOnDoubleCheckClickListener$default(oocKWHzl.valueOf, 0L, new Function1() { // from class: o.nfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.AhwBna(oocKWHzl, this, (android.view.View) obj);
            }
        }, 1, null);
        mUO.setOnDoubleCheckClickListener$default(oocKWHzl.AhwBna, 0L, new Function1() { // from class: o.nfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.valueOf(oocKWHzl, this, (android.view.View) obj);
            }
        }, 1, null);
        mUO.setOnDoubleCheckClickListener$default(oocKWHzl.gEmmrt, 0L, new Function1() { // from class: o.nfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSelectionWidget.AEQbTJ(oocKWHzl, this, (android.view.View) obj);
            }
        }, 1, null);
        oocKWHzl.OLrzqt.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: o.nfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(android.widget.NumberPicker numberPicker, int i, int i2) {
                TimeSelectionWidget.setupListeners$lambda$13$lambda$11(this.KWHzl, oocKWHzl, numberPicker, i, i2);
            }
        });
        oocKWHzl.EZpvd.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: o.nfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(android.widget.NumberPicker numberPicker, int i, int i2) {
                TimeSelectionWidget.setupListeners$lambda$13$lambda$12(this.KWHzl, numberPicker, i, i2);
            }
        });
    }

    public static final Unit gEmmrt(oOC ooc, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = ooc.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        timeSelectionWidget.OLrzqt.setVisibility(8);
        timeSelectionWidget.isConnected = PickerType.START_TIME;
        ooc.AYXKKw.setSelectedStyle(true, 3);
        ooc.valueOf.setSelectedStyle(false, 3);
        ooc.AhwBna.setSelectedStyle(false, 3);
        ooc.gEmmrt.setSelectedStyle(false, 3);
        timeSelectionWidget.isConnected();
        ooc.AYXKKw.setText(timeSelectionWidget.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(oOC ooc, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = ooc.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        timeSelectionWidget.OLrzqt.setVisibility(8);
        timeSelectionWidget.isConnected = PickerType.END_TIME;
        ooc.AYXKKw.setSelectedStyle(false, 3);
        ooc.valueOf.setSelectedStyle(true, 3);
        ooc.AhwBna.setSelectedStyle(false, 3);
        ooc.gEmmrt.setSelectedStyle(false, 3);
        timeSelectionWidget.gEmmrt();
        ooc.valueOf.setText(timeSelectionWidget.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(oOC ooc, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = ooc.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        timeSelectionWidget.OLrzqt.setVisibility(0);
        timeSelectionWidget.isConnected = PickerType.START_DATE;
        ooc.AYXKKw.setSelectedStyle(false, 3);
        ooc.valueOf.setSelectedStyle(false, 3);
        ooc.AhwBna.setSelectedStyle(true, 3);
        ooc.gEmmrt.setSelectedStyle(false, 3);
        Calendar calendar = timeSelectionWidget.AYXKKw;
        C54984xbQ c54984xbQ = ooc.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        timeSelectionWidget.AEQbTJ(calendar, c54984xbQ);
        timeSelectionWidget.AhwBna();
        timeSelectionWidget.gEmmrt = true;
        ooc.AhwBna.setText(timeSelectionWidget.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(oOC ooc, TimeSelectionWidget timeSelectionWidget, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayout = ooc.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        timeSelectionWidget.OLrzqt.setVisibility(0);
        timeSelectionWidget.isConnected = PickerType.END_DATE;
        ooc.AYXKKw.setSelectedStyle(false, 3);
        ooc.valueOf.setSelectedStyle(false, 3);
        ooc.AhwBna.setSelectedStyle(false, 3);
        ooc.gEmmrt.setSelectedStyle(true, 3);
        Calendar calendar = timeSelectionWidget.AEQbTJ;
        C54984xbQ c54984xbQ = ooc.valueOf;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        timeSelectionWidget.AEQbTJ(calendar, c54984xbQ);
        timeSelectionWidget.djBIcL();
        timeSelectionWidget.AhwBna = true;
        ooc.gEmmrt.setText(timeSelectionWidget.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final void setupListeners$lambda$13$lambda$11(TimeSelectionWidget timeSelectionWidget, oOC ooc, NumberPicker numberPicker, int i, int i2) {
        PickerType pickerType = timeSelectionWidget.isConnected;
        if (pickerType == PickerType.START_TIME) {
            timeSelectionWidget.AYXKKw.set(11, ooc.OLrzqt.getValue());
            timeSelectionWidget.isConnected();
            timeSelectionWidget.KWHzl().AYXKKw.setText(timeSelectionWidget.EZpvd());
        } else if (pickerType == PickerType.END_TIME) {
            timeSelectionWidget.AEQbTJ.set(11, ooc.OLrzqt.getValue());
            timeSelectionWidget.gEmmrt();
            timeSelectionWidget.KWHzl().valueOf.setText(timeSelectionWidget.EZpvd());
        }
        timeSelectionWidget.copydefault();
    }

    public static final void setupListeners$lambda$13$lambda$12(TimeSelectionWidget timeSelectionWidget, NumberPicker numberPicker, int i, int i2) {
        PickerType pickerType = timeSelectionWidget.isConnected;
        if (pickerType == PickerType.START_TIME) {
            timeSelectionWidget.AYXKKw.set(12, timeSelectionWidget.AkhnZx[i2].intValue());
            timeSelectionWidget.KWHzl().AYXKKw.setText(timeSelectionWidget.EZpvd());
        } else if (pickerType == PickerType.END_TIME) {
            timeSelectionWidget.AEQbTJ.set(12, timeSelectionWidget.AkhnZx[i2].intValue());
            timeSelectionWidget.KWHzl().valueOf.setText(timeSelectionWidget.EZpvd());
        }
        timeSelectionWidget.copydefault();
    }

    private final void copydefault() {
        TimeRangeFilter timeRangeFilter;
        if (this.AEQbTJ.compareTo(Calendar.getInstance()) > 0) {
            timeRangeFilter = new TimeRangeFilter(String.valueOf(this.AYXKKw.getTimeInMillis()), (String) null, false, 6, (DefaultConstructorMarker) null);
        } else {
            timeRangeFilter = new TimeRangeFilter(String.valueOf(this.AYXKKw.getTimeInMillis()), String.valueOf(this.AEQbTJ.getTimeInMillis()), false, 4, (DefaultConstructorMarker) null);
        }
        InterfaceC34610nfO interfaceC34610nfO = this.KWHzl;
        if (interfaceC34610nfO != null) {
            interfaceC34610nfO.AEQbTJ(timeRangeFilter);
        }
    }

    private final String EZpvd() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = Locale.ROOT;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.valueOf.getValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(AEQbTJ())}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + " : " + str2;
    }

    private final String EZpvd(Calendar calendar) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = Locale.ROOT;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + " : " + str2;
    }

    private final String OLrzqt() {
        int dayOfMonth = this.OLrzqt.getDayOfMonth();
        int month = this.OLrzqt.getMonth();
        return dayOfMonth + "/" + (month + 1) + "/" + this.OLrzqt.getYear();
    }

    private final String KWHzl(Calendar calendar) {
        int i = calendar.get(5);
        int i2 = calendar.get(2);
        return i + "/" + (i2 + 1) + "/" + calendar.get(1);
    }

    private final int AEQbTJ() {
        return this.AkhnZx[this.DbNXlk.getValue()].intValue();
    }

    private final boolean OLrzqt(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final boolean EZpvd(Calendar calendar, Calendar calendar2) {
        return OLrzqt(calendar, calendar2) && calendar.get(11) == calendar2.get(11);
    }

    public final void setData(TimeRangeFilter timeRangeFilter) {
        oOC oocKWHzl = KWHzl();
        String strCopydefault = timeRangeFilter != null ? timeRangeFilter.copydefault() : null;
        if (strCopydefault == null || strCopydefault.length() == 0) {
            oocKWHzl.gEmmrt.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.fGQ));
            oocKWHzl.valueOf.setText(EZpvd(this.AEQbTJ));
        } else {
            this.AEQbTJ.setTimeInMillis(C33129mqd.valueOf(timeRangeFilter != null ? timeRangeFilter.copydefault() : null));
            oocKWHzl.valueOf.setText(EZpvd(this.AEQbTJ));
            oocKWHzl.gEmmrt.setText(KWHzl(this.AEQbTJ));
            this.gEmmrt = true;
        }
        String strKWHzl = timeRangeFilter != null ? timeRangeFilter.KWHzl() : null;
        if (strKWHzl == null || strKWHzl.length() == 0) {
            oocKWHzl.AhwBna.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DPHNDa));
            oocKWHzl.AYXKKw.setText(EZpvd(this.AYXKKw));
        } else {
            this.AYXKKw.setTimeInMillis(C33129mqd.valueOf(timeRangeFilter != null ? timeRangeFilter.KWHzl() : null));
            oocKWHzl.AYXKKw.setText(EZpvd(this.AYXKKw));
            oocKWHzl.AhwBna.setText(KWHzl(this.AYXKKw));
            this.AhwBna = true;
        }
    }

    private final void EZpvd(DatePicker datePicker) {
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
    /* JADX INFO: loaded from: classes23.dex */
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

    private final int OLrzqt(int i) {
        Integer[] numArr = this.AkhnZx;
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
