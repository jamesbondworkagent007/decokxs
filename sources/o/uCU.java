package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.QueryBotGuidePopupUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.UserPopUpDto;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCU extends vNH<Unit, Application> {
    public final InterfaceC50055vAf OLrzqt;
    public final CoroutineDispatcher copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC50055vAf;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class Application {
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = application.KWHzl;
            }
            return application.OLrzqt(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(shouldShowPopup=" + this.OLrzqt + ", timestamp=" + this.KWHzl + ")";
        }

        public Application(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = z;
            this.KWHzl = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x005b, B:25:0x0063, B:27:0x0069, B:28:0x0076), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        QueryBotGuidePopupUseCase$execute$1 queryBotGuidePopupUseCase$execute$1;
        java.lang.Throwable th;
        java.lang.String str;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof QueryBotGuidePopupUseCase$execute$1) {
            queryBotGuidePopupUseCase$execute$1 = (QueryBotGuidePopupUseCase$execute$1) continuation;
            int i = queryBotGuidePopupUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryBotGuidePopupUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                queryBotGuidePopupUseCase$execute$1 = new QueryBotGuidePopupUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = queryBotGuidePopupUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = queryBotGuidePopupUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            try {
                InterfaceC50055vAf interfaceC50055vAf = this.OLrzqt;
                queryBotGuidePopupUseCase$execute$1.L$0 = strValueOf;
                queryBotGuidePopupUseCase$execute$1.label = 1;
                java.lang.Object objEZpvd = interfaceC50055vAf.EZpvd("2", "ai_bot", strValueOf, queryBotGuidePopupUseCase$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                obj = objEZpvd;
                str = strValueOf;
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = strValueOf;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) queryBotGuidePopupUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        UserPopUpDto userPopUpDto = (UserPopUpDto) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        return new Application(userPopUpDto != null && userPopUpDto.getWhether(), str);
    }
}
