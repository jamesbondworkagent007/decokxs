package o;

import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22960hpH extends AbstractC22992hpn {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22960hpH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("default_trade") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:16) call: o.hpH.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C22960hpH(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default_trade" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22960hpH(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23097hrm(fetchVPNInfo(), this);
    }

    @Override // o.AbstractC22992hpn
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MergeCallData mergeCallData, final Function1<? super InterfaceC9734bbF, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        TransactionBean transactionBeanFJNWhG = fJNWhG();
        if (transactionBeanFJNWhG == null || transactionBeanFJNWhG.getQuotePriceRes() == null) {
            return;
        }
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(fetchVPNInfo());
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22374heECopydefault.fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            return;
        }
        KWHzl(str);
        OLrzqt(mergeCallData.getUnsingedCallData());
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtKWHzl = c22374heECopydefault.fARcdN().KWHzl(new SignDataArgs<>(interfaceC9738bbJAEQbTJ.DbNXlk(), null, C33129mqd.valueOf(str2), KWHzl(AEQbTJ()), null, null, null, null, null, null, 3, null, null, null, null, null, null, false, false, null, false, false, false, false, 16776178, null));
        final Function1 function12 = new Function1() { // from class: o.hpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22960hpH.AEQbTJ(function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<InterfaceC9734bbF, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22960hpH.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22960hpH.KWHzl(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22960hpH.gEmmrt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(Function1 function1, kotlin.Pair pair) {
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
    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
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
}
