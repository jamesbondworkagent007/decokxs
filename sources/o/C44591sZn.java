package o;

import com.okinc.okmarket.app.callauction.CallAuctionWsManager$initWs$2;
import com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44591sZn {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<java.util.List<CallAuctionData>> AEQbTJ;
    public CoroutineScope AYXKKw;
    public final SharedFlow<java.util.List<CallAuctionData>> AhwBna;
    public final C44594sZq EZpvd;
    public java.util.List<CallAuctionData> OLrzqt;
    public final InterfaceC54816xWj copydefault;
    public final InterfaceC47278tmy djBIcL;
    public final InterfaceC54577xNn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<CallAuctionData>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.sZn$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.KWHzl("CallAuctionWsManager", "managerScope exception", th);
        }
    }

    @yCM
    public C44591sZn(InterfaceC54577xNn interfaceC54577xNn, @NotNull C44594sZq c44594sZq, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c44594sZq, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.valueOf = interfaceC54577xNn;
        this.EZpvd = c44594sZq;
        this.djBIcL = interfaceC47278tmy;
        MutableSharedFlow<java.util.List<CallAuctionData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        InterfaceC54816xWj interfaceC54816xWj = new InterfaceC54816xWj() { // from class: o.sZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC54816xWj
            public final void KWHzl() {
                C44591sZn.AEQbTJ(this.KWHzl);
            }
        };
        this.copydefault = interfaceC54816xWj;
        C54819xWm.KWHzl().AEQbTJ(interfaceC54816xWj);
    }

    /* JADX INFO: renamed from: o.sZn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sZn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final void AEQbTJ(C44591sZn c44591sZn) {
        pUU.KWHzl("CallAuctionWsManager", "----->> onAppEnterBackground clear cache data --- ");
        c44591sZn.OLrzqt = null;
    }

    public final void copydefault() {
        CoroutineScope coroutineScope = this.AYXKKw;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null));
        this.AYXKKw = CoroutineScope;
        if (CoroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, new StateListAnimator(CoroutineExceptionHandler.Key), null, new CallAuctionWsManager$initWs$2(this, null), 2, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xNr.TaskDescription.getSuggestedInstrument$default(o.xNr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.unify_trade.biz.BizInstrument */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String listStage;
        java.util.List<CallAuctionData> list;
        java.lang.Object next;
        java.lang.String state;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") && (interfaceC54577xNn = this.valueOf) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) != null && (listStage = suggestedInstrument$default.getListStage()) != null && !Intrinsics.EZpvd((java.lang.Object) listStage, (java.lang.Object) "LIVE") && (list = this.OLrzqt) != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CallAuctionData callAuctionData = (CallAuctionData) next;
                if (Intrinsics.EZpvd((java.lang.Object) callAuctionData.getInstId(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) callAuctionData.getInstType(), (java.lang.Object) str2)) {
                    break;
                }
            }
            CallAuctionData callAuctionData2 = (CallAuctionData) next;
            if (callAuctionData2 != null && (state = callAuctionData2.getState()) != null) {
                return state;
            }
        }
        return "TRADING";
    }
}
