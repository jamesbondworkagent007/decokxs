package o;

import android.icu.text.SimpleDateFormat;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonth;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33537myN;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40950qhc implements InterfaceC49405unt<TradingCalendarMonth, java.util.List<? extends C33537myN.ActionBar>> {
    @yCM
    public C40950qhc() {
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

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<C33537myN.ActionBar> copydefault(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, tradingCalendarMonth);
    }

    public final java.lang.String KWHzl(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, i);
        java.lang.String str = new SimpleDateFormat("MMM yyyy", java.util.Locale.getDefault()).format(calendar.getTime());
        Intrinsics.copydefault((java.lang.Object) str);
        return str;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<C33537myN.ActionBar> AEQbTJ(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        Intrinsics.checkNotNullParameter(tradingCalendarMonth, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int index = tradingCalendarMonth.getIndex();
        TradingCalendarMonth tradingCalendarMonth2 = TradingCalendarMonth.PREVIOUS_MONTH;
        arrayList.add(new C33537myN.ActionBar(index == tradingCalendarMonth2.getIndex(), KWHzl(tradingCalendarMonth2.getIndex()), tradingCalendarMonth2.getIndex()));
        int index2 = tradingCalendarMonth.getIndex();
        TradingCalendarMonth tradingCalendarMonth3 = TradingCalendarMonth.CURRENT_MONTH;
        arrayList.add(new C33537myN.ActionBar(index2 == tradingCalendarMonth3.getIndex(), KWHzl(tradingCalendarMonth3.getIndex()), tradingCalendarMonth3.getIndex()));
        int index3 = tradingCalendarMonth.getIndex();
        TradingCalendarMonth tradingCalendarMonth4 = TradingCalendarMonth.NEXT_MONTH;
        arrayList.add(new C33537myN.ActionBar(index3 == tradingCalendarMonth4.getIndex(), KWHzl(tradingCalendarMonth4.getIndex()), tradingCalendarMonth4.getIndex()));
        int index4 = tradingCalendarMonth.getIndex();
        TradingCalendarMonth tradingCalendarMonth5 = TradingCalendarMonth.NEXT_NEXT_MONTH;
        arrayList.add(new C33537myN.ActionBar(index4 == tradingCalendarMonth5.getIndex(), KWHzl(tradingCalendarMonth5.getIndex()), tradingCalendarMonth5.getIndex()));
        return arrayList;
    }
}
