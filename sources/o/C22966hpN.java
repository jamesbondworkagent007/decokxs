package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22966hpN extends AbstractC22992hpn {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22966hpN() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("default_trade") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:22) call: o.hpN.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C22966hpN(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default_trade" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22966hpN(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23093hri(fetchVPNInfo(), this);
    }

    @Override // o.AbstractC22992hpn
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MergeCallData mergeCallData, final Function1<? super InterfaceC9734bbF, Unit> function1) {
        QuotePriceRes quotePriceRes;
        OfflineQuote calldata;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        TransactionBean transactionBeanFJNWhG = fJNWhG();
        if (transactionBeanFJNWhG == null || (quotePriceRes = transactionBeanFJNWhG.getQuotePriceRes()) == null) {
            return;
        }
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(fetchVPNInfo());
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22374heECopydefault.fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            return;
        }
        KWHzl(str);
        OLrzqt(mergeCallData.getUnsingedCallData());
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk();
        DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
        java.lang.String unsignedTx = (selectedDeFiPlatform == null || (calldata = selectedDeFiPlatform.getCalldata()) == null) ? null : calldata.getUnsignedTx();
        DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(strDbNXlk, null, str2, null, unsignedTx == null ? "" : unsignedTx, null, "dex", 3, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 1, null, null, SolanaSignType.NORMAL, null, null, -604012758, null);
        InterfaceC23194htd interfaceC23194htdFARcdN = c22374heECopydefault.fARcdN();
        boolean zWlaJM = wlaJM();
        DeFiPlatformForSwap selectedDeFiPlatform2 = quotePriceRes.getSelectedDeFiPlatform();
        java.lang.String defiPlatformId = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getDefiPlatformId() : null;
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtKWHzl = interfaceC23194htdFARcdN.KWHzl(dappInteractionArgs, AEQbTJ(zWlaJM, defiPlatformId == null ? "" : defiPlatformId));
        final Function1 function12 = new Function1() { // from class: o.hpR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22966hpN.OLrzqt(function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<InterfaceC9734bbF, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22966hpN.AYXKKw(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22966hpN.OLrzqt(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22966hpN.gEmmrt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(Function1 function1, kotlin.Pair pair) {
        if (function1 != null) {
            function1.invoke(pair != null ? (InterfaceC9734bbF) pair.getFirst() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        if (th instanceof OKServerException) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            OKServerException oKServerException = (OKServerException) th;
            java.lang.Throwable origin = oKServerException.getOrigin();
            java.lang.Throwable origin2 = oKServerException.getOrigin();
            taskDescription.EZpvd(new java.lang.Exception("event: fetchQuoteCallData\n, cause: fetchQuoteCallData request error \nurl: " + origin + " stack: " + (origin2 != null ? C56379yDe.AEQbTJ(origin2) : null)));
        }
        if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> AEQbTJ(final boolean z, final java.lang.String str) {
        return new Function1() { // from class: o.hpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22966hpN.OLrzqt(this.KWHzl, z, str, (NewCallbackBean) obj);
            }
        };
    }

    public static final AbstractC58185ywX OLrzqt(C22966hpN c22966hpN, boolean z, java.lang.String str, NewCallbackBean newCallbackBean) throws OKServerException {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        java.lang.String asString = newCallbackBean.getBody().get("signedTx").getAsString();
        if (asString == null || asString.length() == 0) {
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null);
        }
        return c22966hpN.AEQbTJ(asString, z, str, TradeMode.SwapMode.getType());
    }
}
