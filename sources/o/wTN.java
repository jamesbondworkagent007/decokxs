package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse;
import com.okinc.tradingbot.impl.usecase.bot.FetchArbitrageStakingProfitsUseCase$execute$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTN extends vNH<TaskDescription, ArbitrageStakingProfitsResponse> {
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTN(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super ArbitrageStakingProfitsResponse> continuation) throws java.lang.Throwable {
        FetchArbitrageStakingProfitsUseCase$execute$1 fetchArbitrageStakingProfitsUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof FetchArbitrageStakingProfitsUseCase$execute$1) {
            fetchArbitrageStakingProfitsUseCase$execute$1 = (FetchArbitrageStakingProfitsUseCase$execute$1) continuation;
            int i = fetchArbitrageStakingProfitsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchArbitrageStakingProfitsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchArbitrageStakingProfitsUseCase$execute$1 = new FetchArbitrageStakingProfitsUseCase$execute$1(this, continuation);
            }
        }
        FetchArbitrageStakingProfitsUseCase$execute$1 fetchArbitrageStakingProfitsUseCase$execute$12 = fetchArbitrageStakingProfitsUseCase$execute$1;
        java.lang.Object objAEQbTJ = fetchArbitrageStakingProfitsUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchArbitrageStakingProfitsUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
                long jValueOf = C33129mqd.valueOf(taskDescription.copydefault());
                java.lang.String strKWHzl = taskDescription.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                int iEZpvd = taskDescription.EZpvd();
                int iOLrzqt = taskDescription.OLrzqt();
                fetchArbitrageStakingProfitsUseCase$execute$12.label = 1;
                objAEQbTJ = interfaceC50055vAf.AEQbTJ(strAEQbTJ, jValueOf, strKWHzl, iEZpvd, iOLrzqt, fetchArbitrageStakingProfitsUseCase$execute$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            return actionBar2.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar2 = new AbstractC43419rot.StateListAnimator((ArbitrageStakingProfitsResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }

    public static final class TaskDescription {
        public final java.lang.Long AEQbTJ;
        public final int EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.Long l, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i3 & 2) != 0) {
                l = taskDescription.AEQbTJ;
            }
            java.lang.Long l2 = l;
            if ((i3 & 4) != 0) {
                str2 = taskDescription.copydefault;
            }
            java.lang.String str3 = str2;
            if ((i3 & 8) != 0) {
                i = taskDescription.EZpvd;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(str, l2, str3, i4, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str, java.lang.Long l, java.lang.String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, l, str2, i, i2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.Long l = this.AEQbTJ;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.KWHzl + ", accountId=" + this.AEQbTJ + ", ccy=" + this.copydefault + ", pageIndex=" + this.EZpvd + ", pageSize=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, java.lang.Long l, java.lang.String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.AEQbTJ = l;
            this.copydefault = str2;
            this.EZpvd = i;
            this.OLrzqt = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.Long)
  (r9v0 java.lang.String)
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r11v0 int))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, int, int):void (m)] (LINE:31) call: o.wTN.TaskDescription.<init>(java.lang.String, java.lang.Long, java.lang.String, int, int):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.Long l, java.lang.String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, l, str2, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 20 : i2);
        }
    }
}
