package o;

import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import com.okinc.business.market.features.position.repo.LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2;
import com.okinc.business.market.features.position.repo.LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29131knp implements InterfaceC29130kno {
    public final InterfaceC27595jyE EZpvd;
    public final InterfaceC9859bdY OLrzqt;
    public final CoroutineDispatcher copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C29131knp(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull InterfaceC9859bdY interfaceC9859bdY, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC27595jyE;
        this.OLrzqt = interfaceC9859bdY;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.knp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.knp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC29130kno
    public java.lang.Object copydefault(@NotNull C27610jyT c27610jyT, @NotNull Continuation<? super AbstractC43419rot<LimitOrderBalanceData, OKServerException>> continuation) {
        return kAB.EZpvd(new LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2(c27610jyT, this, null), continuation);
    }

    @Override // o.InterfaceC29130kno
    public Flow<java.util.List<C9922bei>> EZpvd() {
        return FlowKt.m7441catch(FlowKt.flowOn(ReactiveFlowKt.asFlow(this.OLrzqt.djBIcL("dex-strategy-balance-token-detail")), this.copydefault), new LimitOrderAssetRepositoryImpl$subscribeLimitOrderWsData$1(null));
    }
}
