package o;

import android.icu.util.Calendar;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonth;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.TradingCalendarGridVo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C40894qgZ;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40949qhb implements InterfaceC49405unt<TradingCalendarMonth, java.util.List<? extends TradingCalendarGridVo>> {
    public final C40894qgZ EZpvd;
    public final C40891qgW KWHzl;

    /* JADX INFO: renamed from: o.qhb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingCalendarMonth.values().length];
            try {
                iArr[TradingCalendarMonth.PREVIOUS_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingCalendarMonth.CURRENT_MONTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingCalendarMonth.NEXT_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingCalendarMonth.NEXT_NEXT_MONTH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingCalendarMonth.NOT_SELECTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C40949qhb(@NotNull C40894qgZ c40894qgZ, @NotNull C40891qgW c40891qgW) {
        Intrinsics.checkNotNullParameter(c40894qgZ, "");
        Intrinsics.checkNotNullParameter(c40891qgW, "");
        this.EZpvd = c40894qgZ;
        this.KWHzl = c40891qgW;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradingCalendarGridVo> OLrzqt(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, tradingCalendarMonth);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.util.List<TradingCalendarGridVo> AEQbTJ(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        Intrinsics.checkNotNullParameter(tradingCalendarMonth, "");
        return EZpvd(tradingCalendarMonth);
    }

    public final java.util.List<TradingCalendarGridVo> EZpvd(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        java.util.Locale locale;
        java.lang.Object obj;
        java.lang.String localized$default;
        C40949qhb c40949qhb = this;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tradingCalendarMonth, "");
        TradingCalendarMonth tradingCalendarMonthOLrzqt = OLrzqt(tradingCalendarMonth);
        TradingCalendarMonth tradingCalendarMonthKWHzl = KWHzl(tradingCalendarMonth);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, tradingCalendarMonth.getIndex());
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = 5;
        calendar.set(5, 1);
        int i5 = calendar.get(7) - 1;
        calendar.add(2, -1);
        calendar.set(5, (calendar.getActualMaximum(5) - i5) + 1);
        int i6 = 0;
        while (true) {
            locale = null;
            if (i6 >= i5) {
                break;
            }
            java.lang.String localized$default2 = tradingCalendarMonth == TradingCalendarMonth.PREVIOUS_MONTH ? str : pTB.formatLocalized$default(java.lang.String.valueOf(calendar.get(i4)), null, i, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            Intrinsics.copydefault(calendar);
            Calendar calendar2 = calendar;
            java.lang.String str2 = str;
            java.util.ArrayList arrayList4 = arrayList;
            arrayList4.add(new TradingCalendarGridVo(localized$default2, c40949qhb.copydefault(calendar), arrayList2, arrayList3, "", false, false, false, tradingCalendarMonthOLrzqt));
            calendar2.add(5, 1);
            i6++;
            i4 = 5;
            i = 1;
            calendar = calendar2;
            arrayList = arrayList4;
            str = str2;
            i5 = i5;
            i3 = i3;
            i2 = i2;
        }
        int i7 = i4;
        java.lang.String str3 = str;
        java.util.ArrayList arrayList5 = arrayList;
        Calendar calendar3 = calendar;
        int i8 = i;
        calendar3.set(i8, i2);
        calendar3.set(2, i3);
        calendar3.set(i7, i8);
        int actualMaximum = calendar3.getActualMaximum(i7);
        int i9 = 0;
        while (i9 < actualMaximum) {
            boolean zBooleanValue = ((java.lang.Boolean) c40949qhb.KWHzl.OLrzqt(java.lang.Long.valueOf(calendar3.getTimeInMillis()))).booleanValue();
            java.lang.String localized$default3 = pTB.formatLocalized$default(java.lang.String.valueOf(calendar3.get(i7)), locale, i8, locale);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            Intrinsics.copydefault(calendar3);
            int i10 = actualMaximum;
            int i11 = i7;
            TradingCalendarMonth tradingCalendarMonth2 = tradingCalendarMonthKWHzl;
            Calendar calendar4 = calendar3;
            arrayList5.add(new TradingCalendarGridVo(localized$default3, c40949qhb.copydefault(calendar3), arrayList6, arrayList7, "", zBooleanValue, true, false, tradingCalendarMonth));
            calendar4.add(i11, 1);
            i9++;
            i8 = 1;
            i7 = i11;
            calendar3 = calendar4;
            actualMaximum = i10;
            tradingCalendarMonthKWHzl = tradingCalendarMonth2;
            locale = null;
        }
        int i12 = i7;
        TradingCalendarMonth tradingCalendarMonth3 = tradingCalendarMonthKWHzl;
        Calendar calendar5 = calendar3;
        int i13 = i8;
        int size = arrayList5.size();
        int i14 = 0;
        while (i14 < 42 - size) {
            if (tradingCalendarMonth == TradingCalendarMonth.NEXT_NEXT_MONTH) {
                localized$default = str3;
                obj = null;
            } else {
                obj = null;
                localized$default = pTB.formatLocalized$default(java.lang.String.valueOf(calendar5.get(i12)), null, i13, null);
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            Intrinsics.copydefault(calendar5);
            long jCopydefault = c40949qhb.copydefault(calendar5);
            int i15 = i13;
            arrayList5.add(new TradingCalendarGridVo(localized$default, jCopydefault, arrayList8, arrayList9, "", false, false, false, tradingCalendarMonth3));
            calendar5.add(5, i15);
            i14++;
            i13 = i15;
            i12 = 5;
            c40949qhb = this;
        }
        return arrayList5;
    }

    public final TradingCalendarMonth OLrzqt(TradingCalendarMonth tradingCalendarMonth) {
        int i = TaskDescription.KWHzl[tradingCalendarMonth.ordinal()];
        if (i == 1) {
            return TradingCalendarMonth.NOT_SELECTED;
        }
        if (i == 2) {
            return TradingCalendarMonth.PREVIOUS_MONTH;
        }
        if (i == 3) {
            return TradingCalendarMonth.CURRENT_MONTH;
        }
        if (i == 4) {
            return TradingCalendarMonth.NEXT_MONTH;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return TradingCalendarMonth.NOT_SELECTED;
    }

    public final TradingCalendarMonth KWHzl(TradingCalendarMonth tradingCalendarMonth) {
        int i = TaskDescription.KWHzl[tradingCalendarMonth.ordinal()];
        if (i == 1) {
            return TradingCalendarMonth.CURRENT_MONTH;
        }
        if (i == 2) {
            return TradingCalendarMonth.NEXT_MONTH;
        }
        if (i == 3) {
            return TradingCalendarMonth.NEXT_NEXT_MONTH;
        }
        if (i == 4) {
            return TradingCalendarMonth.NOT_SELECTED;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return TradingCalendarMonth.NOT_SELECTED;
    }

    public final long copydefault(Calendar calendar) {
        return ((java.lang.Number) this.EZpvd.EZpvd(new C40894qgZ.ActionBar(calendar.get(1), calendar.get(2), calendar.get(5)))).longValue();
    }
}
