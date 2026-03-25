package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderBody;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.PlaceOrderResponse;
import com.okinc.tradingbot.impl.order.strategy.spotdca.domain.PlaceManualOrderUseCase$execute$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53200wgx extends vNH<Application, StateListAnimator> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53200wgx(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC50055vAf;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Application application, @NotNull Continuation<? super StateListAnimator> continuation) throws java.lang.Throwable {
        PlaceManualOrderUseCase$execute$1 placeManualOrderUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        PlaceOrderResponse placeOrderResponse;
        ResponseData responseData;
        if (continuation instanceof PlaceManualOrderUseCase$execute$1) {
            placeManualOrderUseCase$execute$1 = (PlaceManualOrderUseCase$execute$1) continuation;
            int i = placeManualOrderUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                placeManualOrderUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                placeManualOrderUseCase$execute$1 = new PlaceManualOrderUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = placeManualOrderUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = placeManualOrderUseCase$execute$1.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                AddOrderBody addOrderBody = new AddOrderBody(application.copydefault(), application.EZpvd(), application.KWHzl(), application.OLrzqt());
                placeManualOrderUseCase$execute$1.label = 1;
                objAEQbTJ = interfaceC50055vAf.AEQbTJ(addOrderBody, placeManualOrderUseCase$execute$1);
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
            placeOrderResponse = (PlaceOrderResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
            if (placeOrderResponse == null) {
            }
            return new StateListAnimator(placeOrderResponse);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        placeOrderResponse = (PlaceOrderResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
        if (placeOrderResponse == null) {
            placeOrderResponse = new PlaceOrderResponse((java.lang.String) null, i3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        return new StateListAnimator(placeOrderResponse);
    }

    /* JADX INFO: renamed from: o.wgx$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = application.OLrzqt;
            }
            if ((i & 8) != 0) {
                str4 = application.EZpvd;
            }
            return application.AEQbTJ(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Application(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
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
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.String str = this.KWHzl;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.AEQbTJ + ", price=" + this.KWHzl + ", amount=" + this.OLrzqt + ", orderType=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
            this.EZpvd = str4;
        }
    }

    /* JADX INFO: renamed from: o.wgx$StateListAnimator */
    public static final class StateListAnimator {
        public final PlaceOrderResponse KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PlaceOrderResponse placeOrderResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                placeOrderResponse = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(placeOrderResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull PlaceOrderResponse placeOrderResponse) {
            Intrinsics.checkNotNullParameter(placeOrderResponse, "");
            return new StateListAnimator(placeOrderResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(placeOrderResponse=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull PlaceOrderResponse placeOrderResponse) {
            Intrinsics.checkNotNullParameter(placeOrderResponse, "");
            this.KWHzl = placeOrderResponse;
        }
    }
}
