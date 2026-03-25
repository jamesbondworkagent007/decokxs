package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.WalletBindCeFiSelectUseCase$getData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19331fzK extends AbstractC19325fzE<StateListAnimator, ActionBar> {
    public final CoroutineDispatcher EZpvd;
    public final WalletBindApiService copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19331fzK(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull WalletBindApiService walletBindApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = walletBindApiService;
    }

    /* JADX INFO: renamed from: o.fzK$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public final java.util.List<java.lang.String> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fzK$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(accountIdList=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.fzK$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.Long OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                l = actionBar.OLrzqt;
            }
            return actionBar.AEQbTJ(z, str, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z, @NotNull java.lang.String str, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(z, str, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.copydefault == actionBar.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
            int iHashCode2 = this.AEQbTJ.hashCode();
            java.lang.Long l = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OutPut(isBind=" + this.copydefault + ", threshold=" + this.AEQbTJ + ", uid=" + this.OLrzqt + ")";
        }

        public ActionBar(boolean z, @NotNull java.lang.String str, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = z;
            this.AEQbTJ = str;
            this.OLrzqt = l;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC19325fzE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        WalletBindCeFiSelectUseCase$getData$1 walletBindCeFiSelectUseCase$getData$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof WalletBindCeFiSelectUseCase$getData$1) {
            walletBindCeFiSelectUseCase$getData$1 = (WalletBindCeFiSelectUseCase$getData$1) continuation;
            int i = walletBindCeFiSelectUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindCeFiSelectUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindCeFiSelectUseCase$getData$1 = new WalletBindCeFiSelectUseCase$getData$1(this, continuation);
            }
        }
        WalletBindCeFiSelectUseCase$getData$1 walletBindCeFiSelectUseCase$getData$12 = walletBindCeFiSelectUseCase$getData$1;
        java.lang.Object objCheckWalletBindStatus$default = walletBindCeFiSelectUseCase$getData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindCeFiSelectUseCase$getData$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCheckWalletBindStatus$default);
                Result.Application application = Result.Companion;
                WalletBindApiService walletBindApiService = this.copydefault;
                CheckWalletBindStatusRequestBody checkWalletBindStatusRequestBody = new CheckWalletBindStatusRequestBody(stateListAnimator.AEQbTJ());
                walletBindCeFiSelectUseCase$getData$12.label = 1;
                objCheckWalletBindStatus$default = WalletBindApiService.TaskDescription.checkWalletBindStatus$default(walletBindApiService, checkWalletBindStatusRequestBody, null, walletBindCeFiSelectUseCase$getData$12, 2, null);
                if (objCheckWalletBindStatus$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCheckWalletBindStatus$default);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((CheckWalletBindStatusResponse) ((ResponseData) objCheckWalletBindStatus$default).getData());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        CheckWalletBindStatusResponse checkWalletBindStatusResponse = (CheckWalletBindStatusResponse) objM7377constructorimpl;
        if (checkWalletBindStatusResponse != null && (!checkWalletBindStatusResponse.getAccountList().isEmpty())) {
            return new ActionBar(checkWalletBindStatusResponse.getAccountList().get(0).isBinded(), checkWalletBindStatusResponse.getThreshold(), checkWalletBindStatusResponse.getAccountList().get(0).getUid());
        }
        return new ActionBar(false, "0", null);
    }
}
