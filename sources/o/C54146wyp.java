package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.domain.AutoEarnStakingProfitHistoryUseCase$execute$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54146wyp extends vNH<TaskDescription, AutoEarnStakingProfitHistoryOverView> {
    public final InterfaceC50055vAf KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C54146wyp(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super AutoEarnStakingProfitHistoryOverView> continuation) throws java.lang.Throwable {
        AutoEarnStakingProfitHistoryUseCase$execute$1 autoEarnStakingProfitHistoryUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof AutoEarnStakingProfitHistoryUseCase$execute$1) {
            autoEarnStakingProfitHistoryUseCase$execute$1 = (AutoEarnStakingProfitHistoryUseCase$execute$1) continuation;
            int i = autoEarnStakingProfitHistoryUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                autoEarnStakingProfitHistoryUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                autoEarnStakingProfitHistoryUseCase$execute$1 = new AutoEarnStakingProfitHistoryUseCase$execute$1(this, continuation);
            }
        }
        AutoEarnStakingProfitHistoryUseCase$execute$1 autoEarnStakingProfitHistoryUseCase$execute$12 = autoEarnStakingProfitHistoryUseCase$execute$1;
        java.lang.Object objCopydefault = autoEarnStakingProfitHistoryUseCase$execute$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = autoEarnStakingProfitHistoryUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                java.lang.String strOLrzqt = taskDescription.OLrzqt();
                java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
                java.lang.String strCopydefault = taskDescription.copydefault();
                int iEZpvd = taskDescription.EZpvd();
                int iKWHzl = taskDescription.KWHzl();
                autoEarnStakingProfitHistoryUseCase$execute$12.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(strOLrzqt, strCopydefault, strAEQbTJ, iEZpvd, iKWHzl, autoEarnStakingProfitHistoryUseCase$execute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
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
            actionBar2 = new AbstractC43419rot.StateListAnimator((AutoEarnStakingProfitHistoryOverView) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.wyp$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final int EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i3 & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            java.lang.String str4 = str2;
            if ((i3 & 4) != 0) {
                str3 = taskDescription.AEQbTJ;
            }
            java.lang.String str5 = str3;
            if ((i3 & 8) != 0) {
                i = taskDescription.copydefault;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = taskDescription.EZpvd;
            }
            return taskDescription.EZpvd(str, str4, str5, i4, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(str, str2, str3, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && this.copydefault == taskDescription.copydefault && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Request(algoId=" + this.KWHzl + ", ccy=" + this.OLrzqt + ", earnType=" + this.AEQbTJ + ", pageIndex=" + this.copydefault + ", pageSize=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
            this.copydefault = i;
            this.EZpvd = i2;
        }
    }
}
