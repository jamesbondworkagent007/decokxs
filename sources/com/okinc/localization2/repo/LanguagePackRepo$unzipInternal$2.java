package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$unzipInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LPDownloadResult>>, Object> {
    final /* synthetic */ List<LPDownloadResult> $downloadResults;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.localization2.bean.LPDownloadResult> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LanguagePackRepo$unzipInternal$2(List<? extends LPDownloadResult> list, C38313pUd c38313pUd, Continuation<? super LanguagePackRepo$unzipInternal$2> continuation) {
        super(2, continuation);
        this.$downloadResults = list;
        this.this$0 = c38313pUd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LanguagePackRepo$unzipInternal$2 languagePackRepo$unzipInternal$2 = new LanguagePackRepo$unzipInternal$2(this.$downloadResults, this.this$0, continuation);
        languagePackRepo$unzipInternal$2.L$0 = obj;
        return languagePackRepo$unzipInternal$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LPDownloadResult>> continuation) {
        return ((LanguagePackRepo$unzipInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList();
            Iterator<LPDownloadResult> it = this.$downloadResults.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LanguagePackRepo$unzipInternal$2$job$1(it.next(), this.this$0, null), 3, null));
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        this.this$0.OLrzqt("unzipInternal", (List<? extends Object>) list);
        return list;
    }
}
