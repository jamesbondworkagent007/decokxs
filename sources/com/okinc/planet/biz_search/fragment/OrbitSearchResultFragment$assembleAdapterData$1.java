package com.okinc.planet.biz_search.fragment;

import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.im.bean.SearchResultData;
import com.okinc.planet.biz_search.SearchSubPage;
import com.okinc.search.bean.SearchResultContentPo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC47827txU;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C46084tHf;
import o.C46087tHi;
import o.C46088tHj;
import o.C46091tHm;
import o.C46092tHn;
import o.C46094tHp;
import o.C47501trL;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35180nqU;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitSearchResultFragment$assembleAdapterData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $planetEnable;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C46084tHf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitSearchResultFragment$assembleAdapterData$1(C46084tHf c46084tHf, boolean z, Continuation<? super OrbitSearchResultFragment$assembleAdapterData$1> continuation) {
        super(2, continuation);
        this.this$0 = c46084tHf;
        this.$planetEnable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitSearchResultFragment$assembleAdapterData$1(this.this$0, this.$planetEnable, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitSearchResultFragment$assembleAdapterData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        C46084tHf c46084tHf;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SearchResultContentPo searchResultContentPo;
        OrbitIMChatSearchResult orbitIMChatSearchResult;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList();
            SearchResultContentPo searchResultContentPoGEmmrt = this.this$0.gEmmrt();
            if (searchResultContentPoGEmmrt != null) {
                c46084tHf = this.this$0;
                boolean z = this.$planetEnable;
                c46084tHf.copydefault().OLrzqt(C33129mqd.gEmmrt(c46084tHf.AEQbTJ()));
                c46084tHf.copydefault().OLrzqt(searchResultContentPoGEmmrt);
                SearchResultContentPo.SearchResultContentQueryInfoPo queryInfo = searchResultContentPoGEmmrt.getQueryInfo();
                String strGEmmrt = C33129mqd.gEmmrt(queryInfo != null ? queryInfo.getQueryName() : null);
                c46084tHf.copydefault().EZpvd(strGEmmrt);
                List<SearchResultContentPo.SearchResultContentItemPo> contentDataList = searchResultContentPoGEmmrt.getContentDataList();
                if (contentDataList != null) {
                    arrayList2 = new ArrayList(C56403yEb.AYXKKw(contentDataList, 10));
                    Iterator<T> it = contentDataList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(c46084tHf.EZpvd((SearchResultContentPo.SearchResultContentItemPo) it.next()));
                    }
                } else {
                    arrayList2 = null;
                }
                List<SearchResultContentPo.SearchResultContentKolPo> kolDataList = searchResultContentPoGEmmrt.getKolDataList();
                if (kolDataList != null) {
                    arrayList3 = new ArrayList(C56403yEb.AYXKKw(kolDataList, 10));
                    Iterator<T> it2 = kolDataList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(c46084tHf.copydefault((SearchResultContentPo.SearchResultContentKolPo) it2.next()));
                    }
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 != null && (!arrayList3.isEmpty())) {
                    if (z) {
                        arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.zqTOFw)));
                    } else {
                        arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.dlRikr)));
                    }
                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList3, 3));
                    if (arrayList3.size() > 3 && searchResultContentPoGEmmrt.getQueryInfo() != null) {
                        arrayList.add(new C46092tHn(SearchSubPage.ORBITER, true));
                    }
                }
                if (arrayList2 != null && (!arrayList2.isEmpty())) {
                    arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.zYHWMc)));
                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList2, 3));
                    if (arrayList2.size() > 3 && searchResultContentPoGEmmrt.getQueryInfo() != null) {
                        arrayList.add(new C46092tHn(SearchSubPage.FEED, true));
                    }
                }
                if (z) {
                    InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU != null) {
                        this.L$0 = arrayList;
                        this.L$1 = c46084tHf;
                        this.L$2 = searchResultContentPoGEmmrt;
                        this.label = 1;
                        Object objEZpvd = interfaceC35180nqU.EZpvd(strGEmmrt, this);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        searchResultContentPo = searchResultContentPoGEmmrt;
                        obj = objEZpvd;
                    } else {
                        searchResultContentPo = searchResultContentPoGEmmrt;
                        orbitIMChatSearchResult = null;
                        c46084tHf.copydefault().EZpvd(orbitIMChatSearchResult);
                        if (orbitIMChatSearchResult != null) {
                            if (C33129mqd.KWHzl((Collection) orbitIMChatSearchResult.getGroupResults())) {
                                List<SearchResultData> groupResults = orbitIMChatSearchResult.getGroupResults();
                                ArrayList arrayList4 = new ArrayList();
                                for (SearchResultData searchResultData : groupResults) {
                                    SearchResultData.GroupResult groupResult = searchResultData instanceof SearchResultData.GroupResult ? (SearchResultData.GroupResult) searchResultData : null;
                                    C46088tHj c46088tHjOLrzqt = groupResult != null ? c46084tHf.OLrzqt(groupResult) : null;
                                    if (c46088tHjOLrzqt != null) {
                                        arrayList4.add(c46088tHjOLrzqt);
                                    }
                                }
                                if (!arrayList4.isEmpty()) {
                                    arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.DCJXGO)));
                                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList4, 3));
                                    if (arrayList4.size() > 3 && searchResultContentPo.getQueryInfo() != null) {
                                        arrayList.add(new C46092tHn(SearchSubPage.GROUPS, true));
                                    }
                                }
                            }
                            if (C33129mqd.KWHzl((Collection) orbitIMChatSearchResult.getContactAndConversationResults())) {
                                List<SearchResultData> contactAndConversationResults = orbitIMChatSearchResult.getContactAndConversationResults();
                                ArrayList arrayList5 = new ArrayList();
                                for (SearchResultData searchResultData2 : contactAndConversationResults) {
                                    SearchResultData.ChatAndContact chatAndContact = searchResultData2 instanceof SearchResultData.ChatAndContact ? (SearchResultData.ChatAndContact) searchResultData2 : null;
                                    C46087tHi c46087tHiEZpvd = chatAndContact != null ? c46084tHf.EZpvd(chatAndContact) : null;
                                    if (c46087tHiEZpvd != null) {
                                        arrayList5.add(c46087tHiEZpvd);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.DXXBbs)));
                                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList5, 3));
                                    if (arrayList5.size() > 3 && searchResultContentPo.getQueryInfo() != null) {
                                        arrayList.add(new C46092tHn(SearchSubPage.CONTACTS, true));
                                    }
                                }
                            }
                            if (C33129mqd.KWHzl((Collection) orbitIMChatSearchResult.getMessageResults())) {
                                List<SearchResultData> messageResults = orbitIMChatSearchResult.getMessageResults();
                                ArrayList arrayList6 = new ArrayList();
                                for (SearchResultData searchResultData3 : messageResults) {
                                    SearchResultData.Message message = searchResultData3 instanceof SearchResultData.Message ? (SearchResultData.Message) searchResultData3 : null;
                                    C46094tHp c46094tHpOLrzqt = message != null ? c46084tHf.OLrzqt(message) : null;
                                    if (c46094tHpOLrzqt != null) {
                                        arrayList6.add(c46094tHpOLrzqt);
                                    }
                                }
                                if (!arrayList6.isEmpty()) {
                                    arrayList.add(new C46091tHm(C33070mpX.AYXKKw(C47501trL.Fragment.ODWQjV)));
                                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList6, 3));
                                    if (arrayList6.size() > 3 && searchResultContentPo.getQueryInfo() != null) {
                                        arrayList.add(new C46092tHn(SearchSubPage.MESSAGES, true));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            AbstractC47827txU.submitList$default(this.this$0.copydefault(), arrayList, null, 2, null);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        searchResultContentPo = (SearchResultContentPo) this.L$2;
        c46084tHf = (C46084tHf) this.L$1;
        arrayList = (List) this.L$0;
        C56391yDq.AEQbTJ(obj);
        orbitIMChatSearchResult = (OrbitIMChatSearchResult) obj;
        c46084tHf.copydefault().EZpvd(orbitIMChatSearchResult);
        if (orbitIMChatSearchResult != null) {
        }
        AbstractC47827txU.submitList$default(this.this$0.copydefault(), arrayList, null, 2, null);
        return Unit.INSTANCE;
    }
}
