package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.signalClone.domain.FetchCloneAlgoInfoUseCase$execute$1;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53736wrC extends vNH<StateListAnimator, Activity> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC50055vAf KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53736wrC(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
    }

    /* JADX INFO: renamed from: o.wrC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wrC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.wrC$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.wrC$Activity */
    public static final class Activity {
        public final StrategyDetailsResponse KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, StrategyDetailsResponse strategyDetailsResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                strategyDetailsResponse = activity.KWHzl;
            }
            return activity.AEQbTJ(strategyDetailsResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            return new Activity(strategyDetailsResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyDetailsResponse copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(algoInfo=" + this.KWHzl + ")";
        }

        public Activity(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            this.KWHzl = strategyDetailsResponse;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        FetchCloneAlgoInfoUseCase$execute$1 fetchCloneAlgoInfoUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator2;
        ResponseData responseData;
        if (continuation instanceof FetchCloneAlgoInfoUseCase$execute$1) {
            fetchCloneAlgoInfoUseCase$execute$1 = (FetchCloneAlgoInfoUseCase$execute$1) continuation;
            int i = fetchCloneAlgoInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCloneAlgoInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCloneAlgoInfoUseCase$execute$1 = new FetchCloneAlgoInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objIsConnected = fetchCloneAlgoInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchCloneAlgoInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objIsConnected);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
                fetchCloneAlgoInfoUseCase$execute$1.label = 1;
                objIsConnected = interfaceC50055vAf.isConnected(strAEQbTJ, fetchCloneAlgoInfoUseCase$execute$1);
                if (objIsConnected == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objIsConnected);
            }
            responseData = (ResponseData) objIsConnected;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator2 = new AbstractC43419rot.StateListAnimator(data);
            return new Activity((StrategyDetailsResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator2.AEQbTJ()));
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator2 = actionBar;
        return new Activity((StrategyDetailsResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator2.AEQbTJ()));
    }
}
