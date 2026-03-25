package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderCheckResponse;
import com.okinc.tradingbot.impl.order.strategy.spotdca.domain.CheckManualAddOrderUseCase$execute$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53202wgz extends vNH<Activity, ActionBar> {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC50055vAf OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53202wgz(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC50055vAf;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        CheckManualAddOrderUseCase$execute$1 checkManualAddOrderUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        AddOrderCheckResponse addOrderCheckResponse;
        ResponseData responseData;
        if (continuation instanceof CheckManualAddOrderUseCase$execute$1) {
            checkManualAddOrderUseCase$execute$1 = (CheckManualAddOrderUseCase$execute$1) continuation;
            int i = checkManualAddOrderUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkManualAddOrderUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                checkManualAddOrderUseCase$execute$1 = new CheckManualAddOrderUseCase$execute$1(this, continuation);
            }
        }
        CheckManualAddOrderUseCase$execute$1 checkManualAddOrderUseCase$execute$12 = checkManualAddOrderUseCase$execute$1;
        java.lang.Object objKWHzl = checkManualAddOrderUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkManualAddOrderUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC50055vAf interfaceC50055vAf = this.OLrzqt;
                java.lang.String strCopydefault = activity.copydefault();
                java.lang.String strKWHzl = activity.KWHzl();
                java.lang.String strEZpvd = activity.EZpvd();
                java.lang.String strAEQbTJ = activity.AEQbTJ();
                checkManualAddOrderUseCase$execute$12.label = 1;
                objKWHzl = interfaceC50055vAf.KWHzl(strCopydefault, strKWHzl, strEZpvd, strAEQbTJ, checkManualAddOrderUseCase$execute$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            addOrderCheckResponse = (AddOrderCheckResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
            if (addOrderCheckResponse == null) {
            }
            return new ActionBar(addOrderCheckResponse);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        addOrderCheckResponse = (AddOrderCheckResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
        if (addOrderCheckResponse == null) {
            addOrderCheckResponse = new AddOrderCheckResponse((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        return new ActionBar(addOrderCheckResponse);
    }

    /* JADX INFO: renamed from: o.wgz$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = activity.EZpvd;
            }
            if ((i & 8) != 0) {
                str4 = activity.OLrzqt;
            }
            return activity.EZpvd(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Activity(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.copydefault + ", price=" + this.AEQbTJ + ", amount=" + this.EZpvd + ", orderType=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.EZpvd = str3;
            this.OLrzqt = str4;
        }
    }

    /* JADX INFO: renamed from: o.wgz$ActionBar */
    public static final class ActionBar {
        public final AddOrderCheckResponse KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AddOrderCheckResponse addOrderCheckResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addOrderCheckResponse = actionBar.KWHzl;
            }
            return actionBar.EZpvd(addOrderCheckResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull AddOrderCheckResponse addOrderCheckResponse) {
            Intrinsics.checkNotNullParameter(addOrderCheckResponse, "");
            return new ActionBar(addOrderCheckResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddOrderCheckResponse OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(addOrderCheckResponse=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull AddOrderCheckResponse addOrderCheckResponse) {
            Intrinsics.checkNotNullParameter(addOrderCheckResponse, "");
            this.KWHzl = addOrderCheckResponse;
        }
    }
}
