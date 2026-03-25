package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMW extends xMS {
    public final boolean DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMW() {
        this(false, 1, null);
    }

    public xMW(boolean z) {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        super(z);
        this.DbNXlk = z;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        ValuationCurrencyData valuationCurrencyDataAEQbTJ = null;
        ValuationCurrencyData value = (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance2.bG_()) == null) ? null : mutableLiveDataBG_.getValue();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
            valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD");
        }
        if (value == null || valuationCurrencyDataAEQbTJ == null) {
            return;
        }
        KWHzl(value.getIsoCode(), value.getSymbol(), value.getPrecision(), valuationCurrencyDataAEQbTJ.getIsoCode(), valuationCurrencyDataAEQbTJ.getSymbol(), valuationCurrencyDataAEQbTJ.getPrecision(), true);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:8) call: o.xMW.<init>(boolean):void type: THIS */
    public /* synthetic */ xMW(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // o.xMS
    public java.lang.String copydefault() {
        return AYXKKw();
    }

    public final java.lang.String AYXKKw() {
        java.lang.String strOLrzqt = OLrzqt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            java.lang.String strEZpvd = interfaceC54581xNrOLrzqt.EZpvd(strOLrzqt, !this.DbNXlk);
            if (strEZpvd != null) {
                return strEZpvd;
            }
        }
        return "1";
    }

    @Override // o.xMS
    public xMS KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        xMS xmsKWHzl = super.KWHzl(str, str2, str3, str4, str5, str6, z);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.EZpvd(str, false);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            interfaceC54581xNrOLrzqt2.EZpvd(str, true);
        }
        AYXKKw();
        return xmsKWHzl;
    }
}
