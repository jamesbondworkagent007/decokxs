package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.SetBotGuidePopupShownUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.SetUserPopUpRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCR extends vNH<java.lang.String, Unit> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SetBotGuidePopupShownUseCase$execute$1 setBotGuidePopupShownUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SetBotGuidePopupShownUseCase$execute$1) {
            setBotGuidePopupShownUseCase$execute$1 = (SetBotGuidePopupShownUseCase$execute$1) continuation;
            int i = setBotGuidePopupShownUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setBotGuidePopupShownUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                setBotGuidePopupShownUseCase$execute$1 = new SetBotGuidePopupShownUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = setBotGuidePopupShownUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = setBotGuidePopupShownUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                SetUserPopUpRequest setUserPopUpRequest = new SetUserPopUpRequest("2", "ai_bot", str);
                setBotGuidePopupShownUseCase$execute$1.label = 1;
                objOLrzqt = interfaceC50055vAf.OLrzqt(setUserPopUpRequest, setBotGuidePopupShownUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            stateListAnimator.AEQbTJ();
            return Unit.INSTANCE;
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        stateListAnimator.AEQbTJ();
        return Unit.INSTANCE;
    }
}
