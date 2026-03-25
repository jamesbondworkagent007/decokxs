package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.PollingTimeoutException;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.PreviewAiStrategyUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCS extends vNH<AiOrderReq, PreviewAiStrategyResponseDto> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC50050vAa EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50050vAa interfaceC50050vAa) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50050vAa, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC50050vAa;
    }

    /* JADX DEBUG: Duplicate block (B:45:0x0123) to fix multi-entry loop: BACK_EDGE: B:45:0x0123 -> B:21:0x0069 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Path cross not found for [B:28:0x008a, B:32:0x009f], limit reached: 51 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AiOrderReq aiOrderReq, @NotNull Continuation<? super PreviewAiStrategyResponseDto> continuation) throws java.lang.Throwable {
        PreviewAiStrategyUseCase$execute$1 previewAiStrategyUseCase$execute$1;
        uCS ucs;
        int i;
        PreviewAiStrategyUseCase$execute$1 previewAiStrategyUseCase$execute$12;
        uCS ucs2;
        AiOrderReq aiOrderReq2;
        java.lang.Throwable th;
        AbstractC43419rot actionBar;
        PreviewAiStrategyUseCase$execute$1 previewAiStrategyUseCase$execute$13;
        int i2;
        AiOrderReq aiOrderReq3;
        PreviewAiStrategyResponseDto previewAiStrategyResponseDto;
        ResponseData responseData;
        if (continuation instanceof PreviewAiStrategyUseCase$execute$1) {
            previewAiStrategyUseCase$execute$1 = (PreviewAiStrategyUseCase$execute$1) continuation;
            int i3 = previewAiStrategyUseCase$execute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                previewAiStrategyUseCase$execute$1.label = i3 - Integer.MIN_VALUE;
                ucs = this;
            } else {
                ucs = this;
                previewAiStrategyUseCase$execute$1 = new PreviewAiStrategyUseCase$execute$1(ucs, continuation);
            }
        }
        java.lang.Object objKWHzl = previewAiStrategyUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = previewAiStrategyUseCase$execute$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            i = 0;
            previewAiStrategyUseCase$execute$12 = previewAiStrategyUseCase$execute$1;
            ucs2 = ucs;
            aiOrderReq2 = aiOrderReq;
        } else if (i4 == 1) {
            i2 = previewAiStrategyUseCase$execute$1.I$0;
            aiOrderReq3 = (AiOrderReq) previewAiStrategyUseCase$execute$1.L$1;
            ucs2 = (uCS) previewAiStrategyUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                int i5 = i2;
                previewAiStrategyUseCase$execute$12 = previewAiStrategyUseCase$execute$1;
                aiOrderReq2 = aiOrderReq3;
                i = i5;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                previewAiStrategyUseCase$execute$13 = previewAiStrategyUseCase$execute$12;
                i2 = i;
                previewAiStrategyResponseDto = (PreviewAiStrategyResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
                if (!Intrinsics.EZpvd((java.lang.Object) previewAiStrategyResponseDto.OLrzqt(), (java.lang.Object) "pending")) {
                }
            }
            responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            previewAiStrategyUseCase$execute$13 = previewAiStrategyUseCase$execute$1;
            aiOrderReq2 = aiOrderReq3;
            previewAiStrategyResponseDto = (PreviewAiStrategyResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
            if (!Intrinsics.EZpvd((java.lang.Object) previewAiStrategyResponseDto.OLrzqt(), (java.lang.Object) "pending")) {
                return previewAiStrategyResponseDto;
            }
            i = i2 + 1;
            if (i < 7) {
                previewAiStrategyUseCase$execute$13.L$0 = ucs2;
                previewAiStrategyUseCase$execute$13.L$1 = aiOrderReq2;
                previewAiStrategyUseCase$execute$13.I$0 = i;
                previewAiStrategyUseCase$execute$13.label = 2;
                if (DelayKt.delay(3800L, previewAiStrategyUseCase$execute$13) == objCopydefault) {
                    return objCopydefault;
                }
                previewAiStrategyUseCase$execute$12 = previewAiStrategyUseCase$execute$13;
            }
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = previewAiStrategyUseCase$execute$1.I$0;
            AiOrderReq aiOrderReq4 = (AiOrderReq) previewAiStrategyUseCase$execute$1.L$1;
            ucs2 = (uCS) previewAiStrategyUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            previewAiStrategyUseCase$execute$12 = previewAiStrategyUseCase$execute$1;
            aiOrderReq2 = aiOrderReq4;
            i = i6;
        }
        if (i >= 7) {
            throw new PollingTimeoutException("AI preview polling timed out after 7 attempts");
        }
        try {
        } catch (java.lang.Throwable th3) {
            th = th3;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            previewAiStrategyUseCase$execute$13 = previewAiStrategyUseCase$execute$12;
            i2 = i;
            previewAiStrategyResponseDto = (PreviewAiStrategyResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
            if (!Intrinsics.EZpvd((java.lang.Object) previewAiStrategyResponseDto.OLrzqt(), (java.lang.Object) "pending")) {
            }
        }
        InterfaceC50050vAa interfaceC50050vAa = ucs2.EZpvd;
        previewAiStrategyUseCase$execute$12.L$0 = ucs2;
        previewAiStrategyUseCase$execute$12.L$1 = aiOrderReq2;
        previewAiStrategyUseCase$execute$12.I$0 = i;
        previewAiStrategyUseCase$execute$12.label = 1;
        objKWHzl = interfaceC50050vAa.KWHzl(aiOrderReq2, previewAiStrategyUseCase$execute$12);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        int i7 = i;
        aiOrderReq3 = aiOrderReq2;
        previewAiStrategyUseCase$execute$1 = previewAiStrategyUseCase$execute$12;
        i2 = i7;
        responseData = (ResponseData) objKWHzl;
        if (responseData.getCode() != 0) {
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        previewAiStrategyUseCase$execute$13 = previewAiStrategyUseCase$execute$1;
        aiOrderReq2 = aiOrderReq3;
        previewAiStrategyResponseDto = (PreviewAiStrategyResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
        if (!Intrinsics.EZpvd((java.lang.Object) previewAiStrategyResponseDto.OLrzqt(), (java.lang.Object) "pending")) {
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
