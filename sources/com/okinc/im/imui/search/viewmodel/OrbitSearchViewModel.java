package com.okinc.im.imui.search.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C36561odL;
import o.C44169sFw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC36569odT;
import o.InterfaceC56445yFq;
import o.pUU;
import o.sKO;
import o.sKR;
import o.sKT;
import o.sQU;
import o.sQY;
import o.sSM;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OrbitSearchViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final sKO AYXKKw;
    public String AhwBna;
    public final MutableStateFlow<Long> EZpvd;
    public final StateFlow<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<List<SearchResultData>> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public SearchType gEmmrt;
    public final StateFlow<List<SearchResultData>> isConnected;
    public final C36561odL valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SearchResultData>> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public OrbitSearchViewModel(@NotNull InterfaceC36569odT interfaceC36569odT, @NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(sko, "");
        this.AYXKKw = sko;
        MutableStateFlow<List<SearchResultData>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = interfaceC36569odT.copydefault(300L);
        this.EZpvd = StateFlowKt.MutableStateFlow(Long.MAX_VALUE);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.OLrzqt = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.AEQbTJ = MutableStateFlow3;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow3);
        this.gEmmrt = SearchType.MESSAGE;
        this.AhwBna = "";
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SearchType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SearchType[] $VALUES;
        public static final SearchType MESSAGE = new SearchType("MESSAGE", 0);
        public static final SearchType CONTACT = new SearchType("CONTACT", 1);
        public static final SearchType GROUP = new SearchType("GROUP", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SearchType[] $values() {
            return new SearchType[]{MESSAGE, CONTACT, GROUP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SearchType> getEntries() {
            return $ENTRIES;
        }

        private SearchType(String str, int i) {
        }

        static {
            SearchType[] searchTypeArr$values = $values();
            $VALUES = searchTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(searchTypeArr$values);
        }

        public static SearchType valueOf(String str) {
            return (SearchType) Enum.valueOf(SearchType.class, str);
        }

        public static SearchType[] values() {
            return (SearchType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrbitSearchViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04841 extends SuspendLambda implements Function2<List<? extends SearchResultData>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrbitSearchViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04841(OrbitSearchViewModel orbitSearchViewModel, Continuation<? super C04841> continuation) {
                super(2, continuation);
                this.this$0 = orbitSearchViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04841 c04841 = new C04841(this.this$0, continuation);
                c04841.L$0 = obj;
                return c04841;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends SearchResultData> list, Continuation<? super Unit> continuation) {
                return ((C04841) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    if (this.this$0.gEmmrt == SearchType.MESSAGE) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof SearchResultData.Message) {
                                arrayList.add(obj2);
                            }
                        }
                        long j = Long.MAX_VALUE;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            OKMessage message = ((SearchResultData.Message) it.next()).getMessage();
                            long sentTime = message != null ? message.getSentTime() : Long.MAX_VALUE;
                            while (it.hasNext()) {
                                OKMessage message2 = ((SearchResultData.Message) it.next()).getMessage();
                                long sentTime2 = message2 != null ? message2.getSentTime() : Long.MAX_VALUE;
                                if (sentTime > sentTime2) {
                                    sentTime = sentTime2;
                                }
                            }
                            j = sentTime;
                        }
                        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                        Long lKWHzl = C56443yFo.KWHzl(j);
                        this.label = 1;
                        if (mutableStateFlow.emit(lKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = OrbitSearchViewModel.this.copydefault;
                C04841 c04841 = new C04841(OrbitSearchViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c04841, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(@NotNull List<? extends SearchResultData> list, @NotNull SearchType searchType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(searchType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = searchType;
        this.AhwBna = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrbitSearchViewModel$loadInitialData$1(this, list, null), 3, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0060 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x009b */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.okinc.im.imui.search.viewmodel.OrbitSearchViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed A[Catch: all -> 0x0098, Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:70:0x013a, B:74:0x0146, B:34:0x008b, B:61:0x00ff, B:37:0x0094, B:56:0x00e5, B:58:0x00ed, B:67:0x0117, B:53:0x00d9), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117 A[Catch: all -> 0x0098, Exception -> 0x009b, TRY_ENTER, TryCatch #1 {Exception -> 0x009b, blocks: (B:70:0x013a, B:74:0x0146, B:34:0x008b, B:61:0x00ff, B:37:0x0094, B:56:0x00e5, B:58:0x00ed, B:67:0x0117, B:53:0x00d9), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super List<? extends SearchResultData>> continuation) throws Throwable {
        OrbitSearchViewModel$loadMoreData$1 orbitSearchViewModel$loadMoreData$1;
        OrbitSearchViewModel orbitSearchViewModel;
        MutableStateFlow<Boolean> mutableStateFlow;
        Boolean boolKWHzl;
        MutableStateFlow<Boolean> mutableStateFlow2;
        Boolean boolKWHzl2;
        OrbitSearchViewModel orbitSearchViewModel2;
        OrbitSearchViewModel orbitSearchViewModel3;
        List<? extends SearchResultData> list;
        List<SearchResultData> listCopydefault;
        MutableStateFlow<Boolean> mutableStateFlow3;
        Boolean boolKWHzl3;
        OrbitSearchViewModel orbitSearchViewModel4;
        if (continuation instanceof OrbitSearchViewModel$loadMoreData$1) {
            orbitSearchViewModel$loadMoreData$1 = (OrbitSearchViewModel$loadMoreData$1) continuation;
            int i = orbitSearchViewModel$loadMoreData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitSearchViewModel$loadMoreData$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitSearchViewModel$loadMoreData$1 = new OrbitSearchViewModel$loadMoreData$1(this, continuation);
            }
        }
        Object objEZpvd = orbitSearchViewModel$loadMoreData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        OrbitSearchViewModel orbitSearchViewModel5 = orbitSearchViewModel$loadMoreData$1.label;
        boolean z = true;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                orbitSearchViewModel = orbitSearchViewModel5;
            }
        } catch (Exception e) {
            e = e;
        }
        switch (orbitSearchViewModel5) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                if (this.OLrzqt.getValue().booleanValue() || !this.AEQbTJ.getValue().booleanValue()) {
                    return yDY.AhwBna();
                }
                MutableStateFlow<Boolean> mutableStateFlow4 = this.OLrzqt;
                Boolean boolKWHzl4 = C56443yFo.KWHzl(true);
                orbitSearchViewModel$loadMoreData$1.L$0 = this;
                orbitSearchViewModel$loadMoreData$1.label = 1;
                if (mutableStateFlow4.emit(boolKWHzl4, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                    return objCopydefault;
                }
                orbitSearchViewModel3 = this;
                orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                orbitSearchViewModel$loadMoreData$1.label = 2;
                objEZpvd = orbitSearchViewModel3.EZpvd(orbitSearchViewModel$loadMoreData$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) objEZpvd;
                if (list.isEmpty()) {
                    MutableStateFlow<Boolean> mutableStateFlow5 = orbitSearchViewModel3.AEQbTJ;
                    Boolean boolKWHzl5 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                    orbitSearchViewModel$loadMoreData$1.label = 3;
                    if (mutableStateFlow5.emit(boolKWHzl5, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    List listAhwBna = yDY.AhwBna();
                    MutableStateFlow<Boolean> mutableStateFlow6 = orbitSearchViewModel3.OLrzqt;
                    Boolean boolKWHzl6 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = listAhwBna;
                    orbitSearchViewModel$loadMoreData$1.label = 4;
                    return mutableStateFlow6.emit(boolKWHzl6, orbitSearchViewModel$loadMoreData$1) != objCopydefault ? objCopydefault : listAhwBna;
                }
                listCopydefault = orbitSearchViewModel3.copydefault(list);
                List<SearchResultData> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) orbitSearchViewModel3.copydefault.getValue());
                listFJNWhG.addAll(listCopydefault);
                MutableStateFlow<List<SearchResultData>> mutableStateFlow7 = orbitSearchViewModel3.copydefault;
                orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                orbitSearchViewModel$loadMoreData$1.L$1 = listCopydefault;
                orbitSearchViewModel$loadMoreData$1.label = 5;
                if (mutableStateFlow7.emit(listFJNWhG, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow3 = orbitSearchViewModel3.AEQbTJ;
                if (listCopydefault.size() >= 100) {
                    z = false;
                }
                boolKWHzl3 = C56443yFo.KWHzl(z);
                orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                orbitSearchViewModel$loadMoreData$1.L$1 = listCopydefault;
                orbitSearchViewModel$loadMoreData$1.label = 6;
                if (mutableStateFlow3.emit(boolKWHzl3, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                    return objCopydefault;
                }
                orbitSearchViewModel4 = orbitSearchViewModel3;
                MutableStateFlow<Boolean> mutableStateFlow8 = orbitSearchViewModel4.OLrzqt;
                Boolean boolKWHzl7 = C56443yFo.KWHzl(false);
                orbitSearchViewModel$loadMoreData$1.L$0 = listCopydefault;
                orbitSearchViewModel$loadMoreData$1.L$1 = null;
                orbitSearchViewModel$loadMoreData$1.label = 7;
                return mutableStateFlow8.emit(boolKWHzl7, orbitSearchViewModel$loadMoreData$1) != objCopydefault ? objCopydefault : listCopydefault;
            case 1:
                orbitSearchViewModel3 = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                orbitSearchViewModel$loadMoreData$1.label = 2;
                objEZpvd = orbitSearchViewModel3.EZpvd(orbitSearchViewModel$loadMoreData$1);
                if (objEZpvd == objCopydefault) {
                }
                list = (List) objEZpvd;
                if (list.isEmpty()) {
                }
                break;
            case 2:
                orbitSearchViewModel3 = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list = (List) objEZpvd;
                if (list.isEmpty()) {
                }
                break;
            case 3:
                orbitSearchViewModel3 = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                List listAhwBna2 = yDY.AhwBna();
                MutableStateFlow<Boolean> mutableStateFlow62 = orbitSearchViewModel3.OLrzqt;
                Boolean boolKWHzl62 = C56443yFo.KWHzl(false);
                orbitSearchViewModel$loadMoreData$1.L$0 = listAhwBna2;
                orbitSearchViewModel$loadMoreData$1.label = 4;
                if (mutableStateFlow62.emit(boolKWHzl62, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                }
                break;
            case 4:
                List list2 = (List) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return list2;
            case 5:
                List<SearchResultData> list3 = (List) orbitSearchViewModel$loadMoreData$1.L$1;
                OrbitSearchViewModel orbitSearchViewModel6 = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    listCopydefault = list3;
                    orbitSearchViewModel3 = orbitSearchViewModel6;
                    mutableStateFlow3 = orbitSearchViewModel3.AEQbTJ;
                    if (listCopydefault.size() >= 100) {
                    }
                    boolKWHzl3 = C56443yFo.KWHzl(z);
                    orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel3;
                    orbitSearchViewModel$loadMoreData$1.L$1 = listCopydefault;
                    orbitSearchViewModel$loadMoreData$1.label = 6;
                    if (mutableStateFlow3.emit(boolKWHzl3, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    orbitSearchViewModel5 = orbitSearchViewModel6;
                    pUU.AEQbTJ("OrbitSearchViewModel", "Error loading more data: " + e.getMessage(), e);
                    mutableStateFlow2 = orbitSearchViewModel5.AEQbTJ;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel5;
                    orbitSearchViewModel$loadMoreData$1.L$1 = null;
                    orbitSearchViewModel$loadMoreData$1.label = 8;
                    orbitSearchViewModel2 = orbitSearchViewModel5;
                    if (mutableStateFlow2.emit(boolKWHzl2, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                    }
                    List listAhwBna3 = yDY.AhwBna();
                    MutableStateFlow<Boolean> mutableStateFlow9 = orbitSearchViewModel2.OLrzqt;
                    Boolean boolKWHzl8 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = listAhwBna3;
                    orbitSearchViewModel$loadMoreData$1.label = 9;
                    if (mutableStateFlow9.emit(boolKWHzl8, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    orbitSearchViewModel = orbitSearchViewModel6;
                    mutableStateFlow = orbitSearchViewModel.OLrzqt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = th;
                    orbitSearchViewModel$loadMoreData$1.L$1 = null;
                    orbitSearchViewModel$loadMoreData$1.label = 10;
                    if (mutableStateFlow.emit(boolKWHzl, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                    }
                }
                break;
            case 6:
                List<SearchResultData> list4 = (List) orbitSearchViewModel$loadMoreData$1.L$1;
                orbitSearchViewModel = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    listCopydefault = list4;
                    orbitSearchViewModel4 = orbitSearchViewModel;
                    MutableStateFlow<Boolean> mutableStateFlow82 = orbitSearchViewModel4.OLrzqt;
                    Boolean boolKWHzl72 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = listCopydefault;
                    orbitSearchViewModel$loadMoreData$1.L$1 = null;
                    orbitSearchViewModel$loadMoreData$1.label = 7;
                    if (mutableStateFlow82.emit(boolKWHzl72, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    orbitSearchViewModel5 = orbitSearchViewModel;
                    pUU.AEQbTJ("OrbitSearchViewModel", "Error loading more data: " + e.getMessage(), e);
                    mutableStateFlow2 = orbitSearchViewModel5.AEQbTJ;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = orbitSearchViewModel5;
                    orbitSearchViewModel$loadMoreData$1.L$1 = null;
                    orbitSearchViewModel$loadMoreData$1.label = 8;
                    orbitSearchViewModel2 = orbitSearchViewModel5;
                    if (mutableStateFlow2.emit(boolKWHzl2, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    List listAhwBna32 = yDY.AhwBna();
                    MutableStateFlow<Boolean> mutableStateFlow92 = orbitSearchViewModel2.OLrzqt;
                    Boolean boolKWHzl82 = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = listAhwBna32;
                    orbitSearchViewModel$loadMoreData$1.label = 9;
                    if (mutableStateFlow92.emit(boolKWHzl82, orbitSearchViewModel$loadMoreData$1) == objCopydefault) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mutableStateFlow = orbitSearchViewModel.OLrzqt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    orbitSearchViewModel$loadMoreData$1.L$0 = th;
                    orbitSearchViewModel$loadMoreData$1.L$1 = null;
                    orbitSearchViewModel$loadMoreData$1.label = 10;
                    if (mutableStateFlow.emit(boolKWHzl, orbitSearchViewModel$loadMoreData$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    throw th;
                }
                break;
            case 7:
                List list5 = (List) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return list5;
            case 8:
                OrbitSearchViewModel orbitSearchViewModel7 = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                orbitSearchViewModel2 = orbitSearchViewModel7;
                List listAhwBna322 = yDY.AhwBna();
                MutableStateFlow<Boolean> mutableStateFlow922 = orbitSearchViewModel2.OLrzqt;
                Boolean boolKWHzl822 = C56443yFo.KWHzl(false);
                orbitSearchViewModel$loadMoreData$1.L$0 = listAhwBna322;
                orbitSearchViewModel$loadMoreData$1.label = 9;
                return mutableStateFlow922.emit(boolKWHzl822, orbitSearchViewModel$loadMoreData$1) == objCopydefault ? objCopydefault : listAhwBna322;
            case 9:
                List list6 = (List) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                return list6;
            case 10:
                Throwable th4 = (Throwable) orbitSearchViewModel$loadMoreData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                throw th4;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object EZpvd(Continuation<? super List<? extends SearchResultData>> continuation) {
        int i = Application.OLrzqt[this.gEmmrt.ordinal()];
        if (i == 1) {
            return AEQbTJ(continuation);
        }
        if (i == 2) {
            return KWHzl(continuation);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return copydefault(continuation);
    }

    public final List<SearchResultData> copydefault(List<? extends SearchResultData> list) {
        List<SearchResultData> value = this.copydefault.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            String strOLrzqt = OLrzqt((SearchResultData) it.next());
            if (strOLrzqt != null) {
                arrayList.add(strOLrzqt);
            }
        }
        Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) setOqFWZa), OLrzqt((SearchResultData) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final String OLrzqt(SearchResultData searchResultData) {
        OKConversation conversation;
        if (searchResultData instanceof SearchResultData.Message) {
            return ((SearchResultData.Message) searchResultData).getConversation().getTargetId();
        }
        if (searchResultData instanceof SearchResultData.ChatAndContact) {
            OKConversation conversation2 = ((SearchResultData.ChatAndContact) searchResultData).getConversation();
            if (conversation2 != null) {
                return conversation2.getTargetId();
            }
        } else if ((searchResultData instanceof SearchResultData.GroupResult) && (conversation = ((SearchResultData.GroupResult) searchResultData).getConversation()) != null) {
            return conversation.getTargetId();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super List<? extends SearchResultData>> continuation) throws Throwable {
        OrbitSearchViewModel$loadMoreMessages$1 orbitSearchViewModel$loadMoreMessages$1;
        if (continuation instanceof OrbitSearchViewModel$loadMoreMessages$1) {
            orbitSearchViewModel$loadMoreMessages$1 = (OrbitSearchViewModel$loadMoreMessages$1) continuation;
            int i = orbitSearchViewModel$loadMoreMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitSearchViewModel$loadMoreMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitSearchViewModel$loadMoreMessages$1 = new OrbitSearchViewModel$loadMoreMessages$1(this, continuation);
            }
        }
        Object objKWHzl = orbitSearchViewModel$loadMoreMessages$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = orbitSearchViewModel$loadMoreMessages$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            sKO sko = this.AYXKKw;
            sKT skt = new sKT(this.AhwBna, null, 100, this.EZpvd.getValue());
            orbitSearchViewModel$loadMoreMessages$1.label = 1;
            objKWHzl = sko.KWHzl(skt, orbitSearchViewModel$loadMoreMessages$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        List<sQY> list = (List) objKWHzl;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (sQY sqy : list) {
            OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
            OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(sqy.OLrzqt());
            sSM ssm = sSM.AEQbTJ;
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
            RelationInfo relationInfoOLrzqt = ssm.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
            arrayList.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt, relationInfoOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityAEQbTJ != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ) : null), sqy.EZpvd()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super List<? extends SearchResultData>> continuation) throws Throwable {
        OrbitSearchViewModel$loadMoreContacts$1 orbitSearchViewModel$loadMoreContacts$1;
        OrbitSearchViewModel orbitSearchViewModel;
        if (continuation instanceof OrbitSearchViewModel$loadMoreContacts$1) {
            orbitSearchViewModel$loadMoreContacts$1 = (OrbitSearchViewModel$loadMoreContacts$1) continuation;
            int i = orbitSearchViewModel$loadMoreContacts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitSearchViewModel$loadMoreContacts$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitSearchViewModel$loadMoreContacts$1 = new OrbitSearchViewModel$loadMoreContacts$1(this, continuation);
            }
        }
        Object objOLrzqt = orbitSearchViewModel$loadMoreContacts$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = orbitSearchViewModel$loadMoreContacts$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            sKO sko = this.AYXKKw;
            sKR skr = new sKR(this.AhwBna, null, 2, null);
            orbitSearchViewModel$loadMoreContacts$1.L$0 = this;
            orbitSearchViewModel$loadMoreContacts$1.label = 1;
            objOLrzqt = sko.OLrzqt(skr, false, orbitSearchViewModel$loadMoreContacts$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            orbitSearchViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orbitSearchViewModel = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreContacts$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        List<sQU> list = (List) objOLrzqt;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (sQU squ : list) {
            InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = squ.copydefault();
            OKConversation oKConversationOLrzqt = inHouseIMConversationEntityCopydefault != null ? C44169sFw.OLrzqt(inHouseIMConversationEntityCopydefault) : null;
            sSM ssm = sSM.AEQbTJ;
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
            arrayList.add(new SearchResultData.ChatAndContact(oKConversationOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityOLrzqt != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityOLrzqt) : null), squ.KWHzl(), orbitSearchViewModel.AhwBna));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super List<? extends SearchResultData>> continuation) throws Throwable {
        OrbitSearchViewModel$loadMoreGroups$1 orbitSearchViewModel$loadMoreGroups$1;
        OrbitSearchViewModel orbitSearchViewModel;
        if (continuation instanceof OrbitSearchViewModel$loadMoreGroups$1) {
            orbitSearchViewModel$loadMoreGroups$1 = (OrbitSearchViewModel$loadMoreGroups$1) continuation;
            int i = orbitSearchViewModel$loadMoreGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitSearchViewModel$loadMoreGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitSearchViewModel$loadMoreGroups$1 = new OrbitSearchViewModel$loadMoreGroups$1(this, continuation);
            }
        }
        Object objKWHzl = orbitSearchViewModel$loadMoreGroups$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = orbitSearchViewModel$loadMoreGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            sKO sko = this.AYXKKw;
            sKR skr = new sKR(this.AhwBna, null, 2, null);
            orbitSearchViewModel$loadMoreGroups$1.L$0 = this;
            orbitSearchViewModel$loadMoreGroups$1.label = 1;
            objKWHzl = sko.KWHzl(skr, orbitSearchViewModel$loadMoreGroups$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            orbitSearchViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orbitSearchViewModel = (OrbitSearchViewModel) orbitSearchViewModel$loadMoreGroups$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        List list = (List) objKWHzl;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchResultData.GroupResult(C44169sFw.OLrzqt((InHouseIMConversationEntity) it.next()), orbitSearchViewModel.AhwBna));
        }
        return arrayList;
    }

    public final void copydefault() {
        if (this.OLrzqt.getValue().booleanValue() || !this.AEQbTJ.getValue().booleanValue()) {
            return;
        }
        this.valueOf.OLrzqt(new Function0() { // from class: o.ovD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrbitSearchViewModel.djBIcL(this.EZpvd);
            }
        });
    }

    public static final Unit djBIcL(OrbitSearchViewModel orbitSearchViewModel) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(orbitSearchViewModel), null, null, new OrbitSearchViewModel$fetchNextPage$1$1(orbitSearchViewModel, null), 3, null);
        return Unit.INSTANCE;
    }
}
