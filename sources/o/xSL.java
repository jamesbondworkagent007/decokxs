package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xSL extends xSG {
    public final java.lang.String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xSL(@NotNull java.util.List<java.lang.String> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, boolean z, @NotNull java.lang.String str) {
        super(list, function2, mutableLiveData, z, str);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    @Override // o.xSG, o.xSZ
    public void AuCTel() {
        C54723xSy.OLrzqt.copydefault(new Function1() { // from class: o.xSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xSL.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(xSL xsl, java.util.List list) {
        pUU.EZpvd("CoinMarketTaskV2", xsl.values + " -> CoinMarketTask getBatchCupTickers: " + list);
        synchronized (xSG.class) {
            xsl.gEmmrt().clear();
            if (list != null) {
                xsl.gEmmrt().addAll(list);
            }
        }
        xsl.EZpvd(true);
        xsl.fIwbmz();
        return Unit.INSTANCE;
    }
}
