package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.futures_grid.domain.FetchPositionMarginBalanceUseCase$execute$1;
import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import com.okinc.tradingbot.impl.futures_grid.dto.PositionMarginBalanceResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51052vfj extends vNH<StateListAnimator, Application> {
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C51052vfj(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.vfj$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String OLrzqt;
        public final MarginBalanceType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, MarginBalanceType marginBalanceType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                marginBalanceType = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(str, str2, marginBalanceType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MarginBalanceType OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MarginBalanceType marginBalanceType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(marginBalanceType, "");
            return new StateListAnimator(str, str2, marginBalanceType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(amt=" + this.OLrzqt + ", algoId=" + this.AEQbTJ + ", type=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MarginBalanceType marginBalanceType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(marginBalanceType, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.copydefault = marginBalanceType;
        }
    }

    /* JADX INFO: renamed from: o.vfj$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = application.KWHzl;
            }
            return application.KWHzl(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.String str = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(maxAmt=" + this.OLrzqt + ", lever=" + this.copydefault + ", accAmt=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
            this.KWHzl = str3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        FetchPositionMarginBalanceUseCase$execute$1 fetchPositionMarginBalanceUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator2;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof FetchPositionMarginBalanceUseCase$execute$1) {
            fetchPositionMarginBalanceUseCase$execute$1 = (FetchPositionMarginBalanceUseCase$execute$1) continuation;
            int i = fetchPositionMarginBalanceUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPositionMarginBalanceUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPositionMarginBalanceUseCase$execute$1 = new FetchPositionMarginBalanceUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = fetchPositionMarginBalanceUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = fetchPositionMarginBalanceUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
                java.lang.String value = stateListAnimator.OLrzqt().getValue();
                java.lang.String strEZpvd = stateListAnimator.EZpvd();
                fetchPositionMarginBalanceUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(strAEQbTJ, value, strEZpvd, fetchPositionMarginBalanceUseCase$execute$1);
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
            stateListAnimator2 = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator2 instanceof AbstractC43419rot.StateListAnimator)) {
            }
            PositionMarginBalanceResponse positionMarginBalanceResponse = (PositionMarginBalanceResponse) actionBar2.AEQbTJ();
            return new Application(positionMarginBalanceResponse.getMaxAmt(), positionMarginBalanceResponse.getLever(), positionMarginBalanceResponse.getAccAmt());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator2 = actionBar;
        if (!(stateListAnimator2 instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar2 = new AbstractC43419rot.StateListAnimator((PositionMarginBalanceResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator2).KWHzl()));
        } else {
            if (!(stateListAnimator2 instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator2).KWHzl());
        }
        PositionMarginBalanceResponse positionMarginBalanceResponse2 = (PositionMarginBalanceResponse) actionBar2.AEQbTJ();
        return new Application(positionMarginBalanceResponse2.getMaxAmt(), positionMarginBalanceResponse2.getLever(), positionMarginBalanceResponse2.getAccAmt());
    }
}
