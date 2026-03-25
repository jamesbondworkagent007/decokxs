package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.usecase.bot.FetchGridWithdrawnProfitsUseCase$execute$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTW extends vNH<Application, GridWithdrawnProfitsQueryVO> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC50055vAf AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = interfaceC50055vAf;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wTW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Application application, @NotNull Continuation<? super GridWithdrawnProfitsQueryVO> continuation) throws java.lang.Throwable {
        FetchGridWithdrawnProfitsUseCase$execute$1 fetchGridWithdrawnProfitsUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof FetchGridWithdrawnProfitsUseCase$execute$1) {
            fetchGridWithdrawnProfitsUseCase$execute$1 = (FetchGridWithdrawnProfitsUseCase$execute$1) continuation;
            int i = fetchGridWithdrawnProfitsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchGridWithdrawnProfitsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchGridWithdrawnProfitsUseCase$execute$1 = new FetchGridWithdrawnProfitsUseCase$execute$1(this, continuation);
            }
        }
        FetchGridWithdrawnProfitsUseCase$execute$1 fetchGridWithdrawnProfitsUseCase$execute$12 = fetchGridWithdrawnProfitsUseCase$execute$1;
        java.lang.Object objEZpvd = fetchGridWithdrawnProfitsUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchGridWithdrawnProfitsUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC50055vAf interfaceC50055vAf = this.AEQbTJ;
                java.lang.String strAEQbTJ = application.AEQbTJ();
                java.lang.String strCopydefault = application.copydefault();
                java.lang.String strOLrzqt = application.OLrzqt();
                java.lang.Integer numKWHzl = application.KWHzl();
                fetchGridWithdrawnProfitsUseCase$execute$12.label = 1;
                objEZpvd = interfaceC50055vAf.EZpvd(strAEQbTJ, strCopydefault, strOLrzqt, numKWHzl, fetchGridWithdrawnProfitsUseCase$execute$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
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
            actionBar2 = new AbstractC43419rot.StateListAnimator((GridWithdrawnProfitsQueryVO) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }

    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = application.AEQbTJ;
            }
            if ((i & 8) != 0) {
                num = application.copydefault;
            }
            return application.EZpvd(str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.String str = this.OLrzqt;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.Integer num = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.EZpvd + ", before=" + this.OLrzqt + ", after=" + this.AEQbTJ + ", limit=" + this.copydefault + ")";
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
            this.copydefault = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:35) call: o.wTW.Application.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 100 : num);
        }
    }
}
