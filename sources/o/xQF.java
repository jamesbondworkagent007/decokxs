package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xQF extends C54651xQg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xQF(@NotNull java.util.ArrayList<OptionInstrument> arrayList, @NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull java.lang.String str) {
        super(arrayList, map, mutableLiveData, z, str);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.C54651xQg
    public void AkhnZx() {
        pUU.KWHzl("NavOptPhase1", KWHzl() + " -> OptionMarketDataSourceV2 startRegisterDataSource invoke");
        xSW xswGEmmrt = gEmmrt();
        if (xswGEmmrt != null) {
            xswGEmmrt.djBIcL();
        }
        OLrzqt(new C54736xTk(copydefault(), new Function2() { // from class: o.xQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xQF.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, djBIcL(), AYXKKw(), KWHzl()));
    }

    public static final Unit KWHzl(xQF xqf, boolean z, java.lang.Exception exc) {
        java.lang.String message;
        pUU.KWHzl("NavOptPhase1", xqf.KWHzl() + " -> OptionMarketDataSourceV2 notify callback");
        if (z) {
            xqf.AhwBna();
        } else {
            Function1<java.lang.String, Unit> function1FIwbmz = xqf.fIwbmz();
            if (function1FIwbmz != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                function1FIwbmz.invoke(message);
            }
        }
        return Unit.INSTANCE;
    }
}
