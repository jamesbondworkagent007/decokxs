package com.okinc.im.imui.search.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.viewmodel.ConversationSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import o.InterfaceC36569odT;
import o.InterfaceC37420otW;
import o.sKO;
import o.sKT;
import o.sQY;
import o.sSM;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationSearchViewModel extends ViewModel {
    public final MutableStateFlow<List<SearchResultData.Message>> AEQbTJ;
    public String AYXKKw;
    public final StateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public long OLrzqt;
    public final MutableStateFlow<InterfaceC37420otW> copydefault;
    public final sKO djBIcL;
    public final C36561odL gEmmrt;
    public final StateFlow<InterfaceC37420otW> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC37420otW> KWHzl() {
        return this.valueOf;
    }

    @yCM
    public ConversationSearchViewModel(@NotNull InterfaceC36569odT interfaceC36569odT, @NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(sko, "");
        this.djBIcL = sko;
        MutableStateFlow<InterfaceC37420otW> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = Long.MAX_VALUE;
        this.gEmmrt = interfaceC36569odT.copydefault(300L);
        this.AYXKKw = "";
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.ConversationSearchViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationSearchViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.viewmodel.ConversationSearchViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04821 extends SuspendLambda implements Function2<List<? extends SearchResultData.Message>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConversationSearchViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04821(ConversationSearchViewModel conversationSearchViewModel, Continuation<? super C04821> continuation) {
                super(2, continuation);
                this.this$0 = conversationSearchViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04821 c04821 = new C04821(this.this$0, continuation);
                c04821.L$0 = obj;
                return c04821;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends SearchResultData.Message> list, Continuation<? super Unit> continuation) {
                return invoke2((List<SearchResultData.Message>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<SearchResultData.Message> list, Continuation<? super Unit> continuation) {
                return ((C04821) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                long jLongValue;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    if (!list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            OKMessage message = ((SearchResultData.Message) it.next()).getMessage();
                            Long lKWHzl = message != null ? C56443yFo.KWHzl(message.getSentTime()) : null;
                            if (lKWHzl != null) {
                                arrayList.add(lKWHzl);
                            }
                        }
                        Long l = (Long) CollectionsKt___CollectionsKt.fFgQHt(arrayList);
                        jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
                    }
                    this.this$0.OLrzqt = jLongValue;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = ConversationSearchViewModel.this.AEQbTJ;
                C04821 c04821 = new C04821(ConversationSearchViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c04821, this) == objCopydefault) {
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

    public final void OLrzqt(@NotNull final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt.OLrzqt(new Function0() { // from class: o.ovp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationSearchViewModel.KWHzl(this.KWHzl, stateListAnimator);
            }
        });
    }

    public static final Unit KWHzl(ConversationSearchViewModel conversationSearchViewModel, StateListAnimator stateListAnimator) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationSearchViewModel), null, null, new ConversationSearchViewModel$search$1$1(conversationSearchViewModel, stateListAnimator, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super Unit> continuation) throws Throwable {
        ConversationSearchViewModel$resetUI$1 conversationSearchViewModel$resetUI$1;
        ConversationSearchViewModel conversationSearchViewModel;
        if (continuation instanceof ConversationSearchViewModel$resetUI$1) {
            conversationSearchViewModel$resetUI$1 = (ConversationSearchViewModel$resetUI$1) continuation;
            int i = conversationSearchViewModel$resetUI$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationSearchViewModel$resetUI$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationSearchViewModel$resetUI$1 = new ConversationSearchViewModel$resetUI$1(this, continuation);
            }
        }
        Object obj = conversationSearchViewModel$resetUI$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationSearchViewModel$resetUI$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.OLrzqt = Long.MAX_VALUE;
            MutableStateFlow<List<SearchResultData.Message>> mutableStateFlow = this.AEQbTJ;
            List<SearchResultData.Message> listAhwBna = yDY.AhwBna();
            conversationSearchViewModel$resetUI$1.L$0 = this;
            conversationSearchViewModel$resetUI$1.label = 1;
            if (mutableStateFlow.emit(listAhwBna, conversationSearchViewModel$resetUI$1) == objCopydefault) {
                return objCopydefault;
            }
            conversationSearchViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            conversationSearchViewModel = (ConversationSearchViewModel) conversationSearchViewModel$resetUI$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow<Boolean> mutableStateFlow2 = conversationSearchViewModel.KWHzl;
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        conversationSearchViewModel$resetUI$1.L$0 = null;
        conversationSearchViewModel$resetUI$1.label = 2;
        if (mutableStateFlow2.emit(boolKWHzl, conversationSearchViewModel$resetUI$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt.OLrzqt(new Function0() { // from class: o.ovl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationSearchViewModel.AEQbTJ(this.OLrzqt, stateListAnimator);
            }
        });
    }

    public static final Unit AEQbTJ(ConversationSearchViewModel conversationSearchViewModel, StateListAnimator stateListAnimator) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationSearchViewModel), null, null, new ConversationSearchViewModel$fetchNextMessagePage$1$1(conversationSearchViewModel, stateListAnimator, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(List<sQY> list, Continuation<? super Unit> continuation) throws Throwable {
        ConversationSearchViewModel$processAndAppendMessages$1 conversationSearchViewModel$processAndAppendMessages$1;
        List arrayList;
        ConversationSearchViewModel conversationSearchViewModel;
        List<SearchResultData.Message> listDjBIcL;
        ConversationSearchViewModel conversationSearchViewModel2;
        MutableStateFlow<InterfaceC37420otW> mutableStateFlow;
        InterfaceC37420otW.StateListAnimator stateListAnimator;
        if (continuation instanceof ConversationSearchViewModel$processAndAppendMessages$1) {
            conversationSearchViewModel$processAndAppendMessages$1 = (ConversationSearchViewModel$processAndAppendMessages$1) continuation;
            int i = conversationSearchViewModel$processAndAppendMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationSearchViewModel$processAndAppendMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationSearchViewModel$processAndAppendMessages$1 = new ConversationSearchViewModel$processAndAppendMessages$1(this, continuation);
            }
        }
        Object obj = conversationSearchViewModel$processAndAppendMessages$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationSearchViewModel$processAndAppendMessages$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (sQY sqy : list) {
                OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
                OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(sqy.OLrzqt());
                sSM ssm = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
                RelationInfo relationInfoOLrzqt = ssm.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
                arrayList.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt, relationInfoOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityAEQbTJ != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ) : null), sqy.EZpvd()));
            }
            MutableStateFlow<Boolean> mutableStateFlow2 = this.KWHzl;
            Boolean boolKWHzl = C56443yFo.KWHzl(arrayList.size() >= 100);
            conversationSearchViewModel$processAndAppendMessages$1.L$0 = this;
            conversationSearchViewModel$processAndAppendMessages$1.L$1 = arrayList;
            conversationSearchViewModel$processAndAppendMessages$1.label = 1;
            if (mutableStateFlow2.emit(boolKWHzl, conversationSearchViewModel$processAndAppendMessages$1) == objCopydefault) {
                return objCopydefault;
            }
            conversationSearchViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                listDjBIcL = (List) conversationSearchViewModel$processAndAppendMessages$1.L$1;
                conversationSearchViewModel2 = (ConversationSearchViewModel) conversationSearchViewModel$processAndAppendMessages$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = conversationSearchViewModel2.copydefault;
                stateListAnimator = new InterfaceC37420otW.StateListAnimator(listDjBIcL);
                conversationSearchViewModel$processAndAppendMessages$1.L$0 = null;
                conversationSearchViewModel$processAndAppendMessages$1.L$1 = null;
                conversationSearchViewModel$processAndAppendMessages$1.label = 3;
                if (mutableStateFlow.emit(stateListAnimator, conversationSearchViewModel$processAndAppendMessages$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            arrayList = (List) conversationSearchViewModel$processAndAppendMessages$1.L$1;
            conversationSearchViewModel = (ConversationSearchViewModel) conversationSearchViewModel$processAndAppendMessages$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) conversationSearchViewModel.AEQbTJ.getValue(), (Iterable) arrayList);
        MutableStateFlow<List<SearchResultData.Message>> mutableStateFlow3 = conversationSearchViewModel.AEQbTJ;
        conversationSearchViewModel$processAndAppendMessages$1.L$0 = conversationSearchViewModel;
        conversationSearchViewModel$processAndAppendMessages$1.L$1 = listDjBIcL;
        conversationSearchViewModel$processAndAppendMessages$1.label = 2;
        if (mutableStateFlow3.emit(listDjBIcL, conversationSearchViewModel$processAndAppendMessages$1) == objCopydefault) {
            return objCopydefault;
        }
        conversationSearchViewModel2 = conversationSearchViewModel;
        mutableStateFlow = conversationSearchViewModel2.copydefault;
        stateListAnimator = new InterfaceC37420otW.StateListAnimator(listDjBIcL);
        conversationSearchViewModel$processAndAppendMessages$1.L$0 = null;
        conversationSearchViewModel$processAndAppendMessages$1.L$1 = null;
        conversationSearchViewModel$processAndAppendMessages$1.label = 3;
        if (mutableStateFlow.emit(stateListAnimator, conversationSearchViewModel$processAndAppendMessages$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final Object AEQbTJ(StateListAnimator stateListAnimator, Continuation<? super List<sQY>> continuation) {
        return this.djBIcL.KWHzl(new sKT(stateListAnimator.EZpvd(), stateListAnimator.KWHzl(), 100, C56443yFo.KWHzl(this.OLrzqt)), continuation);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final String EZpvd;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            String str = this.KWHzl;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchParams(keyword=" + this.EZpvd + ", conversationId=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = str2;
        }
    }
}
