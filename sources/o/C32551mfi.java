package o;

import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32551mfi {
    public static final C32551mfi EZpvd = new C32551mfi();
    public static final InterfaceC46553tYp OLrzqt = (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mfj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32551mfi.copydefault();
        }
    });
    public static final int KWHzl = 8;

    private C32551mfi() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return (java.util.Map) copydefault.getValue();
    }

    public static final java.util.Map copydefault() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("USD", "$"), C56390yDp.OLrzqt("CNY", "¥"), C56390yDp.OLrzqt("RUB", "₽"), C56390yDp.OLrzqt("JPY", "¥"), C56390yDp.OLrzqt("EUR", "€"), C56390yDp.OLrzqt("VND", "₫"), C56390yDp.OLrzqt("IDR", "Rp"), C56390yDp.OLrzqt("PHP", "₱"), C56390yDp.OLrzqt("INR", "₹"), C56390yDp.OLrzqt("ARS", "$"), C56390yDp.OLrzqt("SAR", "ر.س"), C56390yDp.OLrzqt("TRY", "₺"), C56390yDp.OLrzqt("AED", "AED"), C56390yDp.OLrzqt("IQD", " د.ع"), C56390yDp.OLrzqt("BND", "B$"), C56390yDp.OLrzqt("LAK", "₭"), C56390yDp.OLrzqt("NPR", "रू"), C56390yDp.OLrzqt("PKR", "Rs"), C56390yDp.OLrzqt("SGD", "S$"), C56390yDp.OLrzqt("MMK", "K"), C56390yDp.OLrzqt("MNT", "₮"), C56390yDp.OLrzqt("COP", "COP$"), C56390yDp.OLrzqt("CLP", "CLP$"), C56390yDp.OLrzqt("VES", "Bs."), C56390yDp.OLrzqt("MXN", "M$"), C56390yDp.OLrzqt("BRL", "R$"), C56390yDp.OLrzqt("PEN", "S/."), C56390yDp.OLrzqt("HNL", "L"), C56390yDp.OLrzqt("UYU", "$U"), C56390yDp.OLrzqt("GBP", "£"), C56390yDp.OLrzqt("CHF", "Fr"), C56390yDp.OLrzqt("UAH", "₴"), C56390yDp.OLrzqt("AUD", "A$"), C56390yDp.OLrzqt("NZD", "NZ$"), C56390yDp.OLrzqt("CAD", "C$"), C56390yDp.OLrzqt("ZAR", com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW), C56390yDp.OLrzqt("ILS", "₪"), C56390yDp.OLrzqt("TWD", "NT$"), C56390yDp.OLrzqt("HKD", "HK$"));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = OLrzqt.QOLQEE().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((ValuationCurrencyBean) next).getIsoCode(), str, true)) {
                break;
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        java.lang.String symbol = valuationCurrencyBean != null ? valuationCurrencyBean.getSymbol() : null;
        return symbol != null ? symbol : EZpvd().get(str);
    }
}
