package com.okinc.business.dexlogic.main.market.detail;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29712kyn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel$formatTagData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CompactTagData> $tags;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$formatTagData$1(MarketCoinDetailViewModel marketCoinDetailViewModel, List<CompactTagData> list, Continuation<? super MarketCoinDetailViewModel$formatTagData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$tags = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$formatTagData$1(this.this$0, this.$tags, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$formatTagData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0080 -> B:15:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Iterator it;
        MarketCoinDetailViewModel marketCoinDetailViewModel;
        Collection collection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData2 = this.this$0.KWHzl;
            List<CompactTagData> list = this.$tags;
            MarketCoinDetailViewModel marketCoinDetailViewModel2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            mutableLiveData = mutableLiveData2;
            it = list.iterator();
            marketCoinDetailViewModel = marketCoinDetailViewModel2;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableLiveData mutableLiveData3 = (MutableLiveData) this.L$3;
            Iterator it2 = (Iterator) this.L$2;
            Collection collection2 = (Collection) this.L$1;
            MarketCoinDetailViewModel marketCoinDetailViewModel3 = (MarketCoinDetailViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            mutableLiveData = mutableLiveData3;
            it = it2;
            collection = collection2;
            marketCoinDetailViewModel = marketCoinDetailViewModel3;
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd;
            if (tagWrapper != null) {
                collection.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C29712kyn c29712kyn = marketCoinDetailViewModel.hDKMBd;
                this.L$0 = marketCoinDetailViewModel;
                this.L$1 = collection;
                this.L$2 = it;
                this.L$3 = mutableLiveData;
                this.label = 1;
                MarketCoinDetailViewModel marketCoinDetailViewModel4 = marketCoinDetailViewModel;
                objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                marketCoinDetailViewModel = marketCoinDetailViewModel4;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    mutableLiveData.setValue((List) collection);
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
