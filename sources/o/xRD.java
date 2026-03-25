package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.trade.source.SwapMarketDataSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xRD extends SwapMarketDataSource {
    public final qTT fARcdN;
    public final qTI fIwbmz;
    public final CoroutineScope fJNWhG;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r12v0 java.util.ArrayList)
  (r13v0 java.util.ArrayList)
  (r14v0 java.util.HashMap)
  (r15v0 androidx.lifecycle.MutableLiveData)
  (r16v0 boolean)
  (r17v0 kotlinx.coroutines.CoroutineScope)
  (r18v0 o.qTI)
  (r19v0 o.qTT)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("unknown") : (r20v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.SwapInstrument>, java.util.ArrayList<com.okinc.unify_trade.biz.FutureInstrument>, java.util.HashMap<java.lang.String, com.okinc.unify_trade.biz.TradeCoinInfo>, androidx.lifecycle.MutableLiveData<com.okinc.tradeapi.bean.SourceResp<o.xQb>>, boolean, kotlinx.coroutines.CoroutineScope, o.qTI, o.qTT, java.lang.String):void (m)] (LINE:17) call: o.xRD.<init>(java.util.ArrayList, java.util.ArrayList, java.util.HashMap, androidx.lifecycle.MutableLiveData, boolean, kotlinx.coroutines.CoroutineScope, o.qTI, o.qTT, java.lang.String):void type: THIS */
    public /* synthetic */ xRD(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.HashMap map, MutableLiveData mutableLiveData, boolean z, CoroutineScope coroutineScope, qTI qti, qTT qtt, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, map, mutableLiveData, z, coroutineScope, qti, qtt, (i & 256) != 0 ? "unknown" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xRD(@NotNull java.util.ArrayList<SwapInstrument> arrayList, @NotNull java.util.ArrayList<FutureInstrument> arrayList2, @NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull CoroutineScope coroutineScope, qTI qti, qTT qtt, @NotNull java.lang.String str) {
        super(arrayList, arrayList2, map, mutableLiveData, z, str);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG = coroutineScope;
        this.fIwbmz = qti;
        this.fARcdN = qtt;
    }

    @Override // com.okinc.unify_trade.trade.source.SwapMarketDataSource
    public void DbNXlk() {
        pUU.KWHzl("NavOptPhase1", copydefault() + " -> SwapSourceByRepo initSpotTask invoke");
        if (this.fIwbmz == null || this.fARcdN == null) {
            super.DbNXlk();
            return;
        }
        InterfaceC54726xTa interfaceC54726xTaDjBIcL = djBIcL();
        if (interfaceC54726xTaDjBIcL != null) {
            interfaceC54726xTaDjBIcL.KWHzl();
        }
        OLrzqt(new xSU("SWAP", CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) AYXKKw(), (java.lang.Iterable) KWHzl()), new Function2() { // from class: o.xRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xRD.AEQbTJ(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        }, AhwBna(), AkhnZx(), this.fJNWhG, this.fIwbmz, this.fARcdN, "FUTURES", copydefault()));
    }

    public static final Unit AEQbTJ(xRD xrd, boolean z, java.lang.Exception exc) {
        java.lang.String message;
        pUU.KWHzl("NavOptPhase1", xrd.copydefault() + " -> SwapSourceByRepo notify callback");
        if (z) {
            xrd.ejfBZ();
        } else {
            Function1<java.lang.String, Unit> function1FIwbmz = xrd.fIwbmz();
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
