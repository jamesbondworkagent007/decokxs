package com.okinc.business.defi.wallet.home.repository;

import com.okinc.business.defi.biz.net.bean.Article;
import com.okinc.business.defi.biz.net.bean.FusionData;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C18192fdk;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class FusionDataRepository$queryCryptoReadsArticleList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends Article>, ? extends OKServerException>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18192fdk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusionDataRepository$queryCryptoReadsArticleList$2(C18192fdk c18192fdk, Continuation<? super FusionDataRepository$queryCryptoReadsArticleList$2> continuation) {
        super(2, continuation);
        this.this$0 = c18192fdk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FusionDataRepository$queryCryptoReadsArticleList$2 fusionDataRepository$queryCryptoReadsArticleList$2 = new FusionDataRepository$queryCryptoReadsArticleList$2(this.this$0, continuation);
        fusionDataRepository$queryCryptoReadsArticleList$2.L$0 = obj;
        return fusionDataRepository$queryCryptoReadsArticleList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends Article>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<Article>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<Article>, OKServerException>> continuation) {
        return ((FusionDataRepository$queryCryptoReadsArticleList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:5:0x000b, B:15:0x0034, B:17:0x0038, B:19:0x0040, B:22:0x0048, B:23:0x004e, B:10:0x0025, B:12:0x002b), top: B:28:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:5:0x000b, B:15:0x0034, B:17:0x0038, B:19:0x0040, B:22:0x0048, B:23:0x004e, B:10:0x0025, B:12:0x002b), top: B:28:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Article> articleInfoList;
        FusionData fusionData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd((CoroutineScope) this.L$0);
                Deferred deferred = this.this$0.OLrzqt;
                if (deferred != null) {
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (articleInfoList == null) {
                    return new AbstractC43419rot.StateListAnimator(articleInfoList);
                }
                return new AbstractC43419rot.StateListAnimator(yDY.AhwBna());
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            articleInfoList = (abstractC43419rot == null || (fusionData = (FusionData) abstractC43419rot.AEQbTJ()) == null) ? null : fusionData.getArticleInfoList();
            if (articleInfoList == null) {
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
