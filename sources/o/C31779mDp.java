package o;

import android.icu.util.ULocale;
import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.crcore.shared.formatter.AssetDisplayType;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.mDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31779mDp extends AbstractC43215rlA implements InterfaceC31780mDq {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mDs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31779mDp.OLrzqt();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mDr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31779mDp.AEQbTJ(this.AEQbTJ);
        }
    });

    public final InterfaceC46553tYp copydefault() {
        return (InterfaceC46553tYp) this.copydefault.getValue();
    }

    public static final InterfaceC46553tYp OLrzqt() {
        return (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
    }

    public final java.util.List<java.lang.String> KWHzl() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List AEQbTJ(C31779mDp c31779mDp) {
        java.util.ArrayList<ValuationCurrencyBean> arrayListQOLQEE = c31779mDp.copydefault().QOLQEE();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListQOLQEE, 10));
        java.util.Iterator<T> it = arrayListQOLQEE.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValuationCurrencyBean) it.next()).getIsoCode());
        }
        return arrayList;
    }

    public final java.util.List<java.lang.String> AEQbTJ() {
        return C31785mDv.EZpvd.OLrzqt();
    }

    @Override // o.InterfaceC31780mDq
    public java.lang.String KWHzl(@NotNull C31775mDl c31775mDl) {
        Intrinsics.checkNotNullParameter(c31775mDl, "");
        java.lang.String strCopydefault = c31775mDl.copydefault();
        AmountDisplayType amountDisplayTypeAEQbTJ = c31775mDl.AEQbTJ();
        BigDecimal bigDecimalKWHzl = c31775mDl.KWHzl();
        boolean zEZpvd = c31775mDl.EZpvd();
        RoundingMode roundingModeOLrzqt = c31775mDl.OLrzqt();
        DisplaySign displaySignAhwBna = c31775mDl.AhwBna();
        if (strCopydefault.length() == 0) {
            return C33129mqd.gEmmrt(bigDecimalKWHzl);
        }
        C31778mDo c31778mDo = C31778mDo.KWHzl;
        return c31778mDo.KWHzl(bigDecimalKWHzl, c31778mDo.copydefault(strCopydefault, KWHzl(), AEQbTJ()), amountDisplayTypeAEQbTJ, zEZpvd, roundingModeOLrzqt, displaySignAhwBna);
    }

    @Override // o.InterfaceC31780mDq
    public int AEQbTJ(@NotNull C31775mDl c31775mDl) {
        Intrinsics.checkNotNullParameter(c31775mDl, "");
        java.lang.String strCopydefault = c31775mDl.copydefault();
        AmountDisplayType amountDisplayTypeAEQbTJ = c31775mDl.AEQbTJ();
        return C31778mDo.KWHzl.KWHzl(c31775mDl.KWHzl(), copydefault(strCopydefault), amountDisplayTypeAEQbTJ);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0049 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [o.mDp] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v3, types: [o.mDn] */
    /* JADX WARN: Type inference failed for: r13v4, types: [o.mDn] */
    @Override // o.InterfaceC31780mDq
    public java.lang.String copydefault(@NotNull C31775mDl c31775mDl) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c31775mDl, "");
        java.lang.String strCopydefault = c31775mDl.copydefault();
        AmountDisplayType amountDisplayTypeAEQbTJ = c31775mDl.AEQbTJ();
        BigDecimal bigDecimalKWHzl = c31775mDl.KWHzl();
        boolean zEZpvd = c31775mDl.EZpvd();
        RoundingMode roundingModeOLrzqt = c31775mDl.OLrzqt();
        DisplaySign displaySignAhwBna = c31775mDl.AhwBna();
        if (strCopydefault.length() == 0) {
            return C33129mqd.gEmmrt(bigDecimalKWHzl);
        }
        ?? AEQbTJ = C31778mDo.KWHzl.AEQbTJ(copydefault(strCopydefault), amountDisplayTypeAEQbTJ);
        if (zEZpvd && (strAEQbTJ = AEQbTJ(bigDecimalKWHzl, strCopydefault, AEQbTJ, displaySignAhwBna)) != null) {
            return strAEQbTJ;
        }
        C38307pTy c38307pTyEZpvd = AEQbTJ.EZpvd(bigDecimalKWHzl);
        if (c38307pTyEZpvd == null) {
            c38307pTyEZpvd = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy = c38307pTyEZpvd;
        try {
            if (OLrzqt(strCopydefault)) {
                AEQbTJ = C38305pTw.formatFiatCode$default(java.lang.Double.valueOf(bigDecimalKWHzl.doubleValue()), strCopydefault, roundingModeOLrzqt, c38307pTy, displaySignAhwBna, null, null, 48, null);
            } else {
                AEQbTJ = C38305pTw.formatCryptoCode$default(java.lang.Double.valueOf(bigDecimalKWHzl.doubleValue()), strCopydefault, roundingModeOLrzqt, c38307pTy, displaySignAhwBna, null, null, 48, null);
            }
            return AEQbTJ;
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("AmountFormatterImpl", "formatAmountWithCode ICU4J error, using fallback", e);
            return pTB.formatDownToMax$default(bigDecimalKWHzl, AEQbTJ.KWHzl(bigDecimalKWHzl), null, 2, null) + " " + strCopydefault;
        }
    }

    /* JADX INFO: renamed from: o.mDp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mDp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.String AEQbTJ(BigDecimal bigDecimal, java.lang.String str, AbstractC31777mDn abstractC31777mDn, DisplaySign displaySign) {
        java.lang.String str2;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return null;
        }
        boolean z = bigDecimal.compareTo(bigDecimal2) < 0;
        if (bigDecimal.abs().compareTo(abstractC31777mDn.AEQbTJ()) >= 0) {
            return null;
        }
        java.lang.String strEZpvd = abstractC31777mDn.EZpvd();
        if (z) {
            str2 = "-";
        } else {
            str2 = (displaySign == DisplaySign.EXCEPT_ZERO || displaySign == DisplaySign.ALWAYS) ? Marker.ANY_NON_NULL_MARKER : "";
        }
        ULocale uLocaleForLocale = ULocale.forLocale(java.util.Locale.getDefault());
        if (uLocaleForLocale != null && uLocaleForLocale.isRightToLeft()) {
            return str2 + "<" + strEZpvd + " \u200f" + str + "\u200e";
        }
        return str2 + "<" + strEZpvd + " " + str;
    }

    public final AssetDisplayType copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C31778mDo.KWHzl.copydefault(str, KWHzl(), AEQbTJ());
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C31778mDo.KWHzl.KWHzl(str, KWHzl());
    }
}
