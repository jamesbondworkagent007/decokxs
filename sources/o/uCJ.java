package o;

import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetAiBotRecreateConfigUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.uCH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCJ extends vNH<TaskDescription, StateListAnimator> {
    public final uCH KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCJ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCH uch) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(uch, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = uch;
    }

    public static final class TaskDescription {
        public final java.lang.String EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                z = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.EZpvd + ", isBacktest=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = z;
        }
    }

    public static final class StateListAnimator {
        public static final int EZpvd = AiOrderReq.$stable;
        public final AiOrderReq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AiOrderReq aiOrderReq, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aiOrderReq = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(aiOrderReq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull AiOrderReq aiOrderReq) {
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            return new StateListAnimator(aiOrderReq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AiOrderReq OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(orderReq=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull AiOrderReq aiOrderReq) {
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            this.OLrzqt = aiOrderReq;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super StateListAnimator> continuation) throws java.lang.Throwable {
        GetAiBotRecreateConfigUseCase$execute$1 getAiBotRecreateConfigUseCase$execute$1;
        if (continuation instanceof GetAiBotRecreateConfigUseCase$execute$1) {
            getAiBotRecreateConfigUseCase$execute$1 = (GetAiBotRecreateConfigUseCase$execute$1) continuation;
            int i = getAiBotRecreateConfigUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAiBotRecreateConfigUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAiBotRecreateConfigUseCase$execute$1 = new GetAiBotRecreateConfigUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getAiBotRecreateConfigUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAiBotRecreateConfigUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            uCH uch = this.KWHzl;
            uCH.TaskDescription taskDescription2 = new uCH.TaskDescription(taskDescription.copydefault(), taskDescription.KWHzl());
            getAiBotRecreateConfigUseCase$execute$1.label = 1;
            objKWHzl = uch.KWHzl(taskDescription2, getAiBotRecreateConfigUseCase$execute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AiDetailResponseDto aiDetailResponseDto = (AiDetailResponseDto) objKWHzl;
        return new StateListAnimator(new AiOrderReq(aiDetailResponseDto.OLrzqt().getName(), aiDetailResponseDto.KWHzl(), aiDetailResponseDto.EZpvd(), "ai_bot", "cross", aiDetailResponseDto.copydefault(), aiDetailResponseDto.AhwBna(), aiDetailResponseDto.valueOf(), "", "", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4096, (DefaultConstructorMarker) null));
    }
}
