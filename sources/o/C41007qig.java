package o;

import android.icu.util.Calendar;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonth;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C40894qgZ;
import o.InterfaceC49405unt;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41007qig implements InterfaceC49405unt<TradingCalendarMonth, java.util.List<? extends C41054qja>> {
    public final C40891qgW EZpvd;
    public final C40894qgZ copydefault;

    @yCM
    public C41007qig(@NotNull C40894qgZ c40894qgZ, @NotNull C40891qgW c40891qgW) {
        Intrinsics.checkNotNullParameter(c40894qgZ, "");
        Intrinsics.checkNotNullParameter(c40891qgW, "");
        this.copydefault = c40894qgZ;
        this.EZpvd = c40891qgW;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<C41054qja> EZpvd(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, tradingCalendarMonth);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<C41054qja> AEQbTJ(@NotNull TradingCalendarMonth tradingCalendarMonth) {
        Intrinsics.checkNotNullParameter(tradingCalendarMonth, "");
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, tradingCalendarMonth.getIndex());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int actualMaximum = calendar.getActualMaximum(5);
        if (1 <= actualMaximum) {
            int i = 1;
            while (true) {
                calendar.set(5, i);
                int i2 = calendar.get(5);
                long jLongValue = ((java.lang.Number) this.copydefault.EZpvd(new C40894qgZ.ActionBar(calendar.get(1), calendar.get(2), i2))).longValue();
                java.lang.String localized$default = pTB.formatLocalized$default(java.lang.String.valueOf(i2), null, 1, null);
                Intrinsics.copydefault(calendar);
                arrayList.add(new C41054qja(localized$default, KWHzl(calendar), false, false, jLongValue, ((java.lang.Boolean) this.EZpvd.OLrzqt(java.lang.Long.valueOf(jLongValue))).booleanValue()));
                if (i == actualMaximum) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public final java.lang.String KWHzl(Calendar calendar) {
        return new java.lang.String[]{C33070mpX.AYXKKw(pVX.LoaderManager.AxsJAY), C33070mpX.AYXKKw(pVX.LoaderManager.zLjUOn), C33070mpX.AYXKKw(pVX.LoaderManager.gHZMYf), C33070mpX.AYXKKw(pVX.LoaderManager.zuBGHE), C33070mpX.AYXKKw(pVX.LoaderManager.AwvSrB), C33070mpX.AYXKKw(pVX.LoaderManager.zsXlph), C33070mpX.AYXKKw(pVX.LoaderManager.sSMYrx)}[calendar.get(7) - 1];
    }
}
