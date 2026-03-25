package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54681xRj extends xQJ {
    public final qTI AuCTel;
    public final CoroutineScope fIwbmz;
    public final qTT wlaJM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54681xRj(@NotNull java.util.ArrayList<SpotInstrument> arrayList, @NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map, @NotNull java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map2, boolean z, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z2, boolean z3, @NotNull CoroutineScope coroutineScope, @NotNull qTI qti, @NotNull qTT qtt, @NotNull java.lang.String str) {
        super(arrayList, map, map2, z, mutableLiveData, z2, z3, str);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(qti, "");
        Intrinsics.checkNotNullParameter(qtt, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fIwbmz = coroutineScope;
        this.AuCTel = qti;
        this.wlaJM = qtt;
    }

    @Override // o.xQJ
    public void DbNXlk() {
        xSY xsyAhwBna;
        pUU.KWHzl("NavOptPhase1", djBIcL() + " -> SpotSourceByRepo initSpotTask invoke");
        if (AhwBna() != null && (xsyAhwBna = AhwBna()) != null) {
            xsyAhwBna.AEQbTJ();
        }
        KWHzl(new C54747xTv(gEmmrt(), new Function2() { // from class: o.xRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54681xRj.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, AYXKKw(), null, ejfBZ(), AkhnZx(), this.fIwbmz, this.AuCTel, this.wlaJM, djBIcL()));
    }

    public static final Unit KWHzl(C54681xRj c54681xRj, boolean z, java.lang.Exception exc) {
        java.lang.String message;
        pUU.KWHzl("NavOptPhase1", c54681xRj.djBIcL() + " -> SpotSourceByRepo notify callback");
        if (z) {
            c54681xRj.uzCIH();
        } else {
            Function1<java.lang.String, Unit> function1FIwbmz = c54681xRj.fIwbmz();
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
