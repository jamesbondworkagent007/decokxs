package o;

import com.okinc.business.invest_biz.data.logic.ws.InvestWebSocketManager$special$$inlined$createWebSocket$1;
import com.okinc.business.invest_biz.data.logic.ws.InvestWebSocketManager$special$$inlined$createWebSocket$2;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestNotify;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C23597iCg {
    public final CoroutineScope EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final SharedFlow<InvestNotify> copydefault;
    public final SharedFlow<InvestTransactionModel> djBIcL;
    public final InterfaceC23916iOb gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InvestTransactionModel> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InvestNotify> copydefault() {
        return this.copydefault;
    }

    @yCM
    public C23597iCg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.OLrzqt = coroutineDispatcher;
        this.gEmmrt = interfaceC23916iOb;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher).plus(new CoroutineName("InvestWebSocket")).plus(new TaskDescription(CoroutineExceptionHandler.Key)));
        this.EZpvd = CoroutineScope;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23597iCg.KWHzl(this.EZpvd);
            }
        });
        Flow flowBuffer$default = FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new InvestWebSocketManager$special$$inlined$createWebSocket$1("invest-tx-status-toast", this, null)), Integer.MAX_VALUE, null, 2, null);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.djBIcL = FlowKt__ShareKt.shareIn$default(flowBuffer$default, CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 0, 4, null);
        this.copydefault = FlowKt__ShareKt.shareIn$default(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new InvestWebSocketManager$special$$inlined$createWebSocket$2("invest-notify", this, null)), Integer.MAX_VALUE, null, 2, null), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 0, 4, null);
    }

    /* JADX INFO: renamed from: o.iCg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iCg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.iCg$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("InvestWebSocketManager", "InvestWebSocket", th);
        }
    }

    public static final C57567ykp KWHzl(C23597iCg c23597iCg) {
        return c23597iCg.gEmmrt.values();
    }

    public final C57567ykp KWHzl() {
        return (C57567ykp) this.KWHzl.getValue();
    }
}
