package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPLoadResult;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;
import o.pSI;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$loadLangPack$2$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends LPLoadResult, ? extends pSI>>, Object> {
    final /* synthetic */ Pair<LanguageUnit, pSI> $it;
    final /* synthetic */ LanguagePackType $langPackType;
    final /* synthetic */ boolean $successForDownload;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Pair<com.okinc.localization2.bean.LanguageUnit, ? extends o.pSI> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LanguagePackRepo$loadLangPack$2$1$job$1(C38313pUd c38313pUd, Pair<LanguageUnit, ? extends pSI> pair, boolean z, LanguagePackType languagePackType, Continuation<? super LanguagePackRepo$loadLangPack$2$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$it = pair;
        this.$successForDownload = z;
        this.$langPackType = languagePackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$loadLangPack$2$1$job$1(this.this$0, this.$it, this.$successForDownload, this.$langPackType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends LPLoadResult, ? extends pSI>> continuation) {
        return ((LanguagePackRepo$loadLangPack$2$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38313pUd c38313pUd = this.this$0;
            LanguageUnit first = this.$it.getFirst();
            pSI second = this.$it.getSecond();
            boolean z = this.$successForDownload;
            LanguagePackType languagePackType = this.$langPackType;
            this.label = 1;
            obj = c38313pUd.copydefault(first, second, z, languagePackType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (Pair) obj;
    }
}
