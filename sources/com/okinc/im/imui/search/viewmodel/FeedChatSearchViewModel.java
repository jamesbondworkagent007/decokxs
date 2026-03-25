package com.okinc.im.imui.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
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
import o.InterfaceC35180nqU;
import o.InterfaceC36569odT;
import o.sKO;
import o.sKT;
import o.sQY;
import o.sSM;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedChatSearchViewModel extends ViewModel {
    public final C36561odL AYXKKw;
    public final InterfaceC35180nqU AhwBna;
    public final sKO DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<Long> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final MutableStateFlow<List<SearchResultData>> gEmmrt;
    public final StateFlow<List<SearchResultData>> isConnected;
    public final SavedStateHandle valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SearchResultData>> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.djBIcL;
    }

    @yCM
    public FeedChatSearchViewModel(@NotNull InterfaceC36569odT interfaceC36569odT, @NotNull SavedStateHandle savedStateHandle, InterfaceC35180nqU interfaceC35180nqU, @NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(sko, "");
        this.valueOf = savedStateHandle;
        this.AhwBna = interfaceC35180nqU;
        this.DbNXlk = sko;
        MutableStateFlow<List<SearchResultData>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.gEmmrt = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = interfaceC36569odT.copydefault(300L);
        Boolean bool = Boolean.FALSE;
        this.KWHzl = StateFlowKt.MutableStateFlow(bool);
        this.EZpvd = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        this.copydefault = StateFlowKt.MutableStateFlow(Long.MAX_VALUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FeedChatSearchViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(FeedChatSearchViewModel.this.KWHzl, FeedChatSearchViewModel.this.EZpvd, new C04831(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(FeedChatSearchViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04831 extends SuspendLambda implements yHO<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C04831(Continuation<? super C04831> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                C04831 c04831 = new C04831(continuation);
                c04831.Z$0 = z;
                c04831.Z$1 = z2;
                return c04831.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(this.Z$0 && this.Z$1);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ FeedChatSearchViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FeedChatSearchViewModel feedChatSearchViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = feedChatSearchViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    boolean z = this.Z$0;
                    MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(z);
                    this.label = 1;
                    if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
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
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FeedChatSearchViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends SearchResultData>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FeedChatSearchViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FeedChatSearchViewModel feedChatSearchViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = feedChatSearchViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends SearchResultData> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                } else {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
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
                    MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                    Long lKWHzl = C56443yFo.KWHzl(j);
                    this.label = 1;
                    if (mutableStateFlow.emit(lKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
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
                MutableStateFlow mutableStateFlow = FeedChatSearchViewModel.this.gEmmrt;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FeedChatSearchViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == objCopydefault) {
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

    public final void AEQbTJ(@NotNull List<? extends SearchResultData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.set("SAVED_STATE_KEY_MESSAGES_LOAD_MORE", Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedChatSearchViewModel$loadInitialData$1(this, list, null), 3, null);
    }

    public final void KWHzl(@NotNull final List<? extends SearchResultData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw.OLrzqt(new Function0() { // from class: o.ovt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FeedChatSearchViewModel.KWHzl(this.copydefault, list);
            }
        });
    }

    public static final Unit KWHzl(FeedChatSearchViewModel feedChatSearchViewModel, List list) {
        feedChatSearchViewModel.valueOf.set("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE", Boolean.TRUE);
        feedChatSearchViewModel.copydefault((List<? extends SearchResultData>) list);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.OLrzqt(new Function0() { // from class: o.ovr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FeedChatSearchViewModel.EZpvd(this.OLrzqt, str);
            }
        });
    }

    public static final Unit EZpvd(FeedChatSearchViewModel feedChatSearchViewModel, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(feedChatSearchViewModel), null, null, new FeedChatSearchViewModel$messageLoadMore$1$1(feedChatSearchViewModel, str, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedChatSearchViewModel$fetchNextMessagePage$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, Continuation<? super Unit> continuation) throws Throwable {
        FeedChatSearchViewModel$appendMessagesToFlow$1 feedChatSearchViewModel$appendMessagesToFlow$1;
        List<? extends SearchResultData> listFJNWhG;
        FeedChatSearchViewModel feedChatSearchViewModel;
        if (continuation instanceof FeedChatSearchViewModel$appendMessagesToFlow$1) {
            feedChatSearchViewModel$appendMessagesToFlow$1 = (FeedChatSearchViewModel$appendMessagesToFlow$1) continuation;
            int i = feedChatSearchViewModel$appendMessagesToFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                feedChatSearchViewModel$appendMessagesToFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                feedChatSearchViewModel$appendMessagesToFlow$1 = new FeedChatSearchViewModel$appendMessagesToFlow$1(this, continuation);
            }
        }
        Object objKWHzl = feedChatSearchViewModel$appendMessagesToFlow$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = feedChatSearchViewModel$appendMessagesToFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.gEmmrt.getValue());
            feedChatSearchViewModel$appendMessagesToFlow$1.L$0 = this;
            feedChatSearchViewModel$appendMessagesToFlow$1.L$1 = listFJNWhG;
            feedChatSearchViewModel$appendMessagesToFlow$1.label = 1;
            objKWHzl = KWHzl(str, feedChatSearchViewModel$appendMessagesToFlow$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            feedChatSearchViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return Unit.INSTANCE;
            }
            listFJNWhG = (List) feedChatSearchViewModel$appendMessagesToFlow$1.L$1;
            feedChatSearchViewModel = (FeedChatSearchViewModel) feedChatSearchViewModel$appendMessagesToFlow$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        Iterable iterable = (Iterable) objKWHzl;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            ContactEntity contactEntityOLrzqt = null;
            if (!it.hasNext()) {
                break;
            }
            sQY sqy = (sQY) it.next();
            OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
            OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(sqy.OLrzqt());
            sSM ssm = sSM.AEQbTJ;
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
            RelationInfo relationInfoOLrzqt = ssm.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
            InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
            if (inHouseIMContactInfoEntityAEQbTJ != null) {
                contactEntityOLrzqt = C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ);
            }
            arrayList.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt, relationInfoOLrzqt, ssm.OLrzqt(contactEntityOLrzqt), sqy.EZpvd()));
        }
        listFJNWhG.addAll(arrayList);
        feedChatSearchViewModel.copydefault(listFJNWhG);
        MutableStateFlow<Boolean> mutableStateFlow = feedChatSearchViewModel.EZpvd;
        Boolean boolKWHzl = C56443yFo.KWHzl(arrayList.size() >= 100);
        feedChatSearchViewModel$appendMessagesToFlow$1.L$0 = null;
        feedChatSearchViewModel$appendMessagesToFlow$1.L$1 = null;
        feedChatSearchViewModel$appendMessagesToFlow$1.label = 2;
        if (mutableStateFlow.emit(boolKWHzl, feedChatSearchViewModel$appendMessagesToFlow$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object KWHzl(String str, Continuation<? super List<sQY>> continuation) {
        return this.DbNXlk.KWHzl(new sKT(str, null, 100, this.copydefault.getValue()), continuation);
    }

    public final void copydefault(List<? extends SearchResultData> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedChatSearchViewModel$constructResultList$1(this, list, (Boolean) this.valueOf.get("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE"), (Boolean) this.valueOf.get("SAVED_STATE_KEY_MESSAGES_LOAD_MORE"), null), 3, null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
