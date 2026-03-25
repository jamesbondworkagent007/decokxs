package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.server.AppLinkLang;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$downloadWithNeedLatest$2$5$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LPDownloadResult>, Object> {
    final /* synthetic */ Pair<String, AppLinkLang> $it;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$downloadWithNeedLatest$2$5$job$1(C38313pUd c38313pUd, Pair<String, AppLinkLang> pair, Continuation<? super LanguagePackRepo$downloadWithNeedLatest$2$5$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$it = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$downloadWithNeedLatest$2$5$job$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LPDownloadResult> continuation) {
        return ((LanguagePackRepo$downloadWithNeedLatest$2$5$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38313pUd c38313pUd = this.this$0;
            Pair<String, AppLinkLang> pair = this.$it;
            this.label = 1;
            obj = c38313pUd.KWHzl((Pair<String, AppLinkLang>) pair, (Continuation<? super LPDownloadResult>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (LPDownloadResult) obj;
    }
}
