package com.okinc.business.market.features.meme.preview.domain.usecase;

import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28800khc;
import o.C28807khj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28744kgZ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.meme.preview.domain.usecase.TwitterPreviewUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28807khj>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ XPostType $postType$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ C28800khc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, XPostType xPostType, C28800khc c28800khc, String str, String str2) {
        super(2, continuation);
        this.$postType$inlined = xPostType;
        this.this$0 = c28800khc;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$postType$inlined, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28807khj>> continuation) {
        return ((TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C28807khj c28807khjCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                int i2 = C28800khc.Application.OLrzqt[this.$postType$inlined.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC28744kgZ interfaceC28744kgZ = this.this$0.KWHzl;
                    String str = this.$chainId$inlined;
                    String str2 = this.$tokenAddress$inlined;
                    this.label = 2;
                    obj = interfaceC28744kgZ.copydefault(str, str2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    c28807khjCopydefault = this.this$0.OLrzqt.EZpvd((TwitterPreviewData) ((AbstractC43419rot) obj).AEQbTJ());
                } else {
                    InterfaceC28744kgZ interfaceC28744kgZ2 = this.this$0.KWHzl;
                    String str3 = this.$chainId$inlined;
                    String str4 = this.$tokenAddress$inlined;
                    this.label = 1;
                    obj = interfaceC28744kgZ2.EZpvd(str3, str4, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    c28807khjCopydefault = this.this$0.OLrzqt.copydefault((TwitterV2Response) ((AbstractC43419rot) obj).AEQbTJ());
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                c28807khjCopydefault = this.this$0.OLrzqt.copydefault((TwitterV2Response) ((AbstractC43419rot) obj).AEQbTJ());
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                c28807khjCopydefault = this.this$0.OLrzqt.EZpvd((TwitterPreviewData) ((AbstractC43419rot) obj).AEQbTJ());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(c28807khjCopydefault);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
