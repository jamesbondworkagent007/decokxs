package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CRMarketRepository$getCoinTrendCandles$2;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31746mCj;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class CRMarketRepository$getCoinTrendCandles$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends List<? extends String>>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $bar;
    final /* synthetic */ String $baseCcy;
    final /* synthetic */ int $cacheExpire;
    final /* synthetic */ String $cacheStrategy;
    final /* synthetic */ boolean $isPremium;
    final /* synthetic */ int $limit;
    final /* synthetic */ String $quoteCcy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31746mCj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRMarketRepository$getCoinTrendCandles$2(C31746mCj c31746mCj, String str, String str2, boolean z, String str3, int i, String str4, int i2, Continuation<? super CRMarketRepository$getCoinTrendCandles$2> continuation) {
        super(2, continuation);
        this.this$0 = c31746mCj;
        this.$baseCcy = str;
        this.$quoteCcy = str2;
        this.$isPremium = z;
        this.$bar = str3;
        this.$limit = i;
        this.$cacheStrategy = str4;
        this.$cacheExpire = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRMarketRepository$getCoinTrendCandles$2 cRMarketRepository$getCoinTrendCandles$2 = new CRMarketRepository$getCoinTrendCandles$2(this.this$0, this.$baseCcy, this.$quoteCcy, this.$isPremium, this.$bar, this.$limit, this.$cacheStrategy, this.$cacheExpire, continuation);
        cRMarketRepository$getCoinTrendCandles$2.L$0 = obj;
        return cRMarketRepository$getCoinTrendCandles$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends List<? extends String>>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<? extends List<String>>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends List<String>>, OKServerException>> continuation) {
        return ((CRMarketRepository$getCoinTrendCandles$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31746mCj c31746mCj = this.this$0;
                String str = this.$baseCcy;
                String str2 = this.$quoteCcy;
                boolean z = this.$isPremium;
                String str3 = this.$bar;
                int i2 = this.$limit;
                String str4 = this.$cacheStrategy;
                int i3 = this.$cacheExpire;
                IMarketApiService iMarketApiService = c31746mCj.OLrzqt;
                this.label = 1;
                obj = iMarketApiService.getCoinTrendCandles(str, str2, z, str3, i2, str4, i3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRMarketRepository$getCoinTrendCandles$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }
}
