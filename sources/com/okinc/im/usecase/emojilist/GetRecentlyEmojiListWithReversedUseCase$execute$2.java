package com.okinc.im.usecase.emojilist;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35770oDa;
import o.C35776oDg;
import o.C56391yDq;
import o.C56405yEd;
import o.C56427yEz;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class GetRecentlyEmojiListWithReversedUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends Integer, ? extends String>>>, Object> {
    int label;
    final /* synthetic */ C35776oDg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentlyEmojiListWithReversedUseCase$execute$2(C35776oDg c35776oDg, Continuation<? super GetRecentlyEmojiListWithReversedUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35776oDg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRecentlyEmojiListWithReversedUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends Integer, ? extends String>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Pair<Integer, String>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Pair<Integer, String>>> continuation) {
        return ((GetRecentlyEmojiListWithReversedUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35770oDa c35770oDa = this.this$0.AEQbTJ;
            this.label = 1;
            obj = c35770oDa.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56405yEd.hDKMBd(C56427yEz.AkhnZx((Map) obj));
    }
}
