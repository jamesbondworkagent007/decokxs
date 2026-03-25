package com.okinc.business.market.features.tag.domain;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.data.model.CompactTagData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C29706kyh;
import o.C29712kyn;
import o.C29713kyo;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29685kyM;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class FetchTokenTagAttributesUseCase$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC29685kyM.ActionBar>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $fetchStaticTags;
    final /* synthetic */ String $tokenContractAddress;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C29713kyo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTokenTagAttributesUseCase$invoke$2$1(boolean z, C29713kyo c29713kyo, String str, String str2, Continuation<? super FetchTokenTagAttributesUseCase$invoke$2$1> continuation) {
        super(2, continuation);
        this.$fetchStaticTags = z;
        this.this$0 = c29713kyo;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchTokenTagAttributesUseCase$invoke$2$1 fetchTokenTagAttributesUseCase$invoke$2$1 = new FetchTokenTagAttributesUseCase$invoke$2$1(this.$fetchStaticTags, this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
        fetchTokenTagAttributesUseCase$invoke$2$1.L$0 = obj;
        return fetchTokenTagAttributesUseCase$invoke$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC29685kyM.ActionBar> continuation) {
        return ((FetchTokenTagAttributesUseCase$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0115 -> B:29:0x011c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        CoroutineScope coroutineScope;
        Deferred deferred;
        List list;
        Object objAwait2;
        CoroutineScope coroutineScope2;
        Iterator it;
        CoroutineScope coroutineScope3;
        List list2;
        C29713kyo c29713kyo;
        Collection collection;
        List list3;
        List listAhwBna;
        List list4;
        Object objAwaitAll;
        List list5;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 3;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new FetchTokenTagAttributesUseCase$invoke$2$1$tagAttributesDeferred$1(this.this$0, this.$chainId, this.$tokenContractAddress, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new FetchTokenTagAttributesUseCase$invoke$2$1$marketInfoDeferred$1(this.this$0, this.$tokenContractAddress, this.$chainId, null), 3, null);
            this.L$0 = coroutineScope4;
            this.L$1 = deferredAsync$default2;
            this.label = 1;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope4;
            deferred = deferredAsync$default2;
        } else if (i == 1) {
            deferred = (Deferred) this.L$1;
            CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope5;
            objAwait = obj;
        } else if (i == 2) {
            List list6 = (List) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list6;
            objAwait2 = obj;
            List<CompactTagData> newTagList = ((LatestMarketInfoBean) objAwait2).getNewTagList();
            C29713kyo c29713kyo2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            it = newTagList.iterator();
            coroutineScope3 = coroutineScope2;
            list2 = list;
            c29713kyo = c29713kyo2;
            collection = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list7 = (List) this.L$1;
                list5 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list3 = list7;
                objAwaitAll = obj;
                listAhwBna = (List) objAwaitAll;
                list4 = list5;
                return new InterfaceC29685kyM.ActionBar(list4, list3, listAhwBna);
            }
            Iterator it2 = (Iterator) this.L$4;
            Collection collection2 = (Collection) this.L$3;
            C29713kyo c29713kyo3 = (C29713kyo) this.L$2;
            List list8 = (List) this.L$1;
            CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            it = it2;
            collection = collection2;
            c29713kyo = c29713kyo3;
            list2 = list8;
            coroutineScope3 = coroutineScope6;
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd;
            if (tagWrapper != null) {
                collection.add(tagWrapper);
            }
            i2 = 3;
            if (!it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C29712kyn c29712kyn = c29713kyo.KWHzl;
                this.L$0 = coroutineScope3;
                this.L$1 = list2;
                this.L$2 = c29713kyo;
                this.L$3 = collection;
                this.L$4 = it;
                this.label = i2;
                CoroutineScope coroutineScope7 = coroutineScope3;
                C29713kyo c29713kyo4 = c29713kyo;
                List list9 = list2;
                Collection collection3 = collection;
                objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                list2 = list9;
                c29713kyo = c29713kyo4;
                collection = collection3;
                coroutineScope3 = coroutineScope7;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd;
                if (tagWrapper2 != null) {
                }
                i2 = 3;
                if (!it.hasNext()) {
                    CoroutineScope coroutineScope8 = coroutineScope3;
                    List list10 = list2;
                    list3 = (List) collection;
                    if (this.$fetchStaticTags) {
                        Set<String> setOLrzqt = C29706kyh.OLrzqt.OLrzqt();
                        C29713kyo c29713kyo5 = this.this$0;
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(setOLrzqt, 10));
                        Iterator<T> it3 = setOLrzqt.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope8, null, null, new FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1(list3, c29713kyo5, (String) it3.next(), null), 3, null));
                        }
                        this.L$0 = list10;
                        this.L$1 = list3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        objAwaitAll = AwaitKt.awaitAll(arrayList2, this);
                        if (objAwaitAll == objCopydefault) {
                            return objCopydefault;
                        }
                        list5 = list10;
                        listAhwBna = (List) objAwaitAll;
                        list4 = list5;
                        return new InterfaceC29685kyM.ActionBar(list4, list3, listAhwBna);
                    }
                    listAhwBna = yDY.AhwBna();
                    list4 = list10;
                    return new InterfaceC29685kyM.ActionBar(list4, list3, listAhwBna);
                }
            }
        }
        list = (List) objAwait;
        this.L$0 = coroutineScope;
        this.L$1 = list;
        this.label = 2;
        objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        coroutineScope2 = coroutineScope;
        List<CompactTagData> newTagList2 = ((LatestMarketInfoBean) objAwait2).getNewTagList();
        C29713kyo c29713kyo22 = this.this$0;
        ArrayList arrayList3 = new ArrayList();
        it = newTagList2.iterator();
        coroutineScope3 = coroutineScope2;
        list2 = list;
        c29713kyo = c29713kyo22;
        collection = arrayList3;
        if (!it.hasNext()) {
        }
    }
}
