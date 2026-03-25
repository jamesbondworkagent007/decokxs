package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.botDetail.domain.usecase.FetchBacktestBotInfoUseCase$execute$1;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48181uHz extends vNH<ActionBar, StrategyDetailsResponse> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C48181uHz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    /* JADX INFO: renamed from: o.uHz$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uHz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C48181uHz KWHzl() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).RkASWs();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ActionBar actionBar, @NotNull Continuation<? super StrategyDetailsResponse> continuation) throws java.lang.Throwable {
        FetchBacktestBotInfoUseCase$execute$1 fetchBacktestBotInfoUseCase$execute$1;
        AbstractC43419rot actionBar2;
        if (continuation instanceof FetchBacktestBotInfoUseCase$execute$1) {
            fetchBacktestBotInfoUseCase$execute$1 = (FetchBacktestBotInfoUseCase$execute$1) continuation;
            int i = fetchBacktestBotInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchBacktestBotInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchBacktestBotInfoUseCase$execute$1 = new FetchBacktestBotInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = fetchBacktestBotInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchBacktestBotInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objValueOf);
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                java.lang.String strEZpvd = actionBar.EZpvd();
                fetchBacktestBotInfoUseCase$execute$1.L$0 = actionBar;
                fetchBacktestBotInfoUseCase$execute$1.label = 1;
                objValueOf = interfaceC50055vAf.valueOf(strEZpvd, fetchBacktestBotInfoUseCase$execute$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionBar = (ActionBar) fetchBacktestBotInfoUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
            }
            ResponseData responseData = (ResponseData) objValueOf;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar2 = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar2.AEQbTJ());
        if (strategyDetailsResponse != null) {
            return strategyDetailsResponse;
        }
        throw new java.lang.IllegalStateException("No backtest bot info found for algoId: " + actionBar.EZpvd());
    }

    /* JADX INFO: renamed from: o.uHz$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }
}
