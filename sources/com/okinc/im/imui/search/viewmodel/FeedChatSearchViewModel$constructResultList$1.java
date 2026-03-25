package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.bean.SearchResultData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35399nuc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35180nqU;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedChatSearchViewModel$constructResultList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SearchResultData> $resultList;
    final /* synthetic */ Boolean $showAllChatAndContactSize;
    final /* synthetic */ Boolean $showAllMessageQuerySize;
    Object L$0;
    int label;
    final /* synthetic */ FeedChatSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedChatSearchViewModel$constructResultList$1(FeedChatSearchViewModel feedChatSearchViewModel, List<? extends SearchResultData> list, Boolean bool, Boolean bool2, Continuation<? super FeedChatSearchViewModel$constructResultList$1> continuation) {
        super(2, continuation);
        this.this$0 = feedChatSearchViewModel;
        this.$resultList = list;
        this.$showAllChatAndContactSize = bool;
        this.$showAllMessageQuerySize = bool2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedChatSearchViewModel$constructResultList$1(this.this$0, this.$resultList, this.$showAllChatAndContactSize, this.$showAllMessageQuerySize, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedChatSearchViewModel$constructResultList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList();
            InterfaceC35180nqU interfaceC35180nqU = this.this$0.AhwBna;
            if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL()) {
                List<SearchResultData> list = this.$resultList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof SearchResultData.ChatAndContact) {
                        arrayList2.add(obj2);
                    }
                }
                List<SearchResultData> list2 = this.$resultList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof SearchResultData.Message) {
                        arrayList3.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new SearchResultData.Header(C35399nuc.LoaderManager.zMXLsR));
                    arrayList.addAll(Intrinsics.EZpvd(this.$showAllChatAndContactSize, C56443yFo.KWHzl(true)) ? arrayList2 : CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList2, 5));
                    if (arrayList2.size() > 5 && !Intrinsics.EZpvd(this.this$0.valueOf.get("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE"), C56443yFo.KWHzl(true))) {
                        arrayList.add(SearchResultData.LoadMore.CHAT_AND_CONTACT);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new SearchResultData.Header(C35399nuc.LoaderManager.DVmcag));
                    arrayList.addAll(Intrinsics.EZpvd(this.$showAllMessageQuerySize, C56443yFo.KWHzl(true)) ? arrayList3 : CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList3, 5));
                    if (arrayList3.size() == 5 && !Intrinsics.EZpvd(this.this$0.valueOf.get("SAVED_STATE_KEY_MESSAGES_LOAD_MORE"), C56443yFo.KWHzl(true))) {
                        arrayList.add(SearchResultData.LoadMore.MESSAGE);
                        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                        Boolean boolKWHzl = C56443yFo.KWHzl(true);
                        this.L$0 = arrayList;
                        this.label = 1;
                        if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            arrayList = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.gEmmrt;
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(arrayList, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
