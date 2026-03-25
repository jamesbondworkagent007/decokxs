package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.planet.domain.GetBotInfoUseCase$execute$1;
import com.okinc.tradingbot.impl.planet.dto.BotDto;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC50055vAf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53666wpm extends vNH<java.lang.String, BotDto> {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC50055vAf copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53666wpm(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC50055vAf;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.wpm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53666wpm copydefault() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).fGQ();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super BotDto> continuation) throws java.lang.Throwable {
        GetBotInfoUseCase$execute$1 getBotInfoUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GetBotInfoUseCase$execute$1) {
            getBotInfoUseCase$execute$1 = (GetBotInfoUseCase$execute$1) continuation;
            int i = getBotInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBotInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getBotInfoUseCase$execute$1 = new GetBotInfoUseCase$execute$1(this, continuation);
            }
        }
        GetBotInfoUseCase$execute$1 getBotInfoUseCase$execute$12 = getBotInfoUseCase$execute$1;
        java.lang.Object ongoingBotsForShare$default = getBotInfoUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBotInfoUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(ongoingBotsForShare$default);
                InterfaceC50055vAf interfaceC50055vAf = this.copydefault;
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(1);
                getBotInfoUseCase$execute$12.label = 1;
                ongoingBotsForShare$default = InterfaceC50055vAf.ActionBar.getOngoingBotsForShare$default(interfaceC50055vAf, numAEQbTJ, null, false, str, getBotInfoUseCase$execute$12, 6, null);
                if (ongoingBotsForShare$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(ongoingBotsForShare$default);
            }
            responseData = (ResponseData) ongoingBotsForShare$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
    }
}
