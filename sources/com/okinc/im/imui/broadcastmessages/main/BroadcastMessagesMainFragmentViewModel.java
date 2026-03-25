package com.okinc.im.imui.broadcastmessages.main;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.InputMode;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC35761oCs;
import o.C35386nuP;
import o.C35399nuc;
import o.C35762oCt;
import o.C35766oCx;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesMainFragmentViewModel extends ViewModel {
    public final C35762oCt AYXKKw;
    public final Flow<Boolean> AhwBna;
    public final SharedFlow<Unit> AkhnZx;
    public final SharedFlow<Pair<List<OKMessage>, Boolean>> DbNXlk;
    public final MutableSharedFlow<Pair<List<OKMessage>, Boolean>> EZpvd;
    public final MutableSharedFlow<StringResource> KWHzl;
    public final Flow<ObserveKeyboardInputStateUseCase.KeyboardInputState> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final HashSet<Long> djBIcL;
    public final SharedFlow<StringResource> ejfBZ;
    public final C35766oCx fetchVPNInfo;
    public final C35386nuP gEmmrt;
    public final Flow<Boolean> isConnected;
    public final MutableStateFlow<InputMode> valueOf;
    public final Flow<Boolean> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StringResource> AEQbTJ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<List<OKMessage>, Boolean>> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public BroadcastMessagesMainFragmentViewModel(@NotNull C35762oCt c35762oCt, @NotNull C35766oCx c35766oCx, @NotNull C35386nuP c35386nuP) {
        Intrinsics.checkNotNullParameter(c35762oCt, "");
        Intrinsics.checkNotNullParameter(c35766oCx, "");
        Intrinsics.checkNotNullParameter(c35386nuP, "");
        this.AYXKKw = c35762oCt;
        this.fetchVPNInfo = c35766oCx;
        this.gEmmrt = c35386nuP;
        this.djBIcL = new HashSet<>();
        MutableSharedFlow<Pair<List<OKMessage>, Boolean>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<StringResource> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        StateListAnimator stateListAnimator = new StateListAnimator(c35386nuP.OLrzqt());
        this.OLrzqt = stateListAnimator;
        MutableStateFlow<InputMode> MutableStateFlow = StateFlowKt.MutableStateFlow(InputMode.DefaultMode);
        this.valueOf = MutableStateFlow;
        this.AhwBna = new TaskDescription(stateListAnimator);
        this.isConnected = FlowKt.combine(MutableStateFlow, stateListAnimator, new BroadcastMessagesMainFragmentViewModel$isPluginPanelVisible$1(null));
        this.values = FlowKt.combine(MutableStateFlow, stateListAnimator, new BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1(null));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragmentViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class StateListAnimator implements Flow<ObserveKeyboardInputStateUseCase.KeyboardInputState> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragmentViewModel$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                BroadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1 broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1;
                ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState;
                if (continuation instanceof BroadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1) {
                    broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1 = (BroadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1 = new BroadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (((Number) obj).intValue() >= 20) {
                        keyboardInputState = ObserveKeyboardInputStateUseCase.KeyboardInputState.GroupMuted;
                    } else {
                        keyboardInputState = ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput;
                    }
                    broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(keyboardInputState, broadcastMessagesMainFragmentViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ObserveKeyboardInputStateUseCase.KeyboardInputState> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragmentViewModel$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                BroadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1 broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof BroadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1) {
                    broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1 = (BroadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1 = new BroadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((ObserveKeyboardInputStateUseCase.KeyboardInputState) obj) == ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput);
                    broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, broadcastMessagesMainFragmentViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void EZpvd(List<OKMessage> list, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagesMainFragmentViewModel$dispatchMessages$1(this, list, z, null), 3, null);
    }

    public final void copydefault(@NotNull InputMode inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "");
        this.valueOf.tryEmit(inputMode);
    }

    public final void OLrzqt(Long l, @NotNull List<? extends SendMessageRequestParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (l != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagesMainFragmentViewModel$sendMessage$1(this, l, list, null), 3, null);
        }
    }

    public final void KWHzl(Long l, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (l == null || this.djBIcL.contains(Long.valueOf(oKMessage.getSeq()))) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagesMainFragmentViewModel$resendMessage$1(this, oKMessage, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<? extends AbstractC35761oCs> list, Continuation<? super List<? extends AbstractC35761oCs>> continuation) throws Throwable {
        BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1 broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1;
        BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel;
        List<? extends AbstractC35761oCs> list2;
        Iterator it;
        if (continuation instanceof BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) {
            broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1 = (BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) continuation;
            int i = broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label = i - Integer.MIN_VALUE;
            } else {
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1 = new BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1(this, continuation);
            }
        }
        Object obj = broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            for (AbstractC35761oCs abstractC35761oCs : list) {
                AbstractC35761oCs.StateListAnimator stateListAnimator = abstractC35761oCs instanceof AbstractC35761oCs.StateListAnimator ? (AbstractC35761oCs.StateListAnimator) abstractC35761oCs : null;
                if (stateListAnimator != null) {
                    arrayList.add(stateListAnimator);
                }
            }
            Iterator it2 = arrayList.iterator();
            broadcastMessagesMainFragmentViewModel = this;
            list2 = list;
            it = it2;
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$2;
            List<? extends AbstractC35761oCs> list3 = (List) broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$1;
            broadcastMessagesMainFragmentViewModel = (BroadcastMessagesMainFragmentViewModel) broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$0;
            C56391yDq.AEQbTJ(obj);
            list2 = list3;
        }
        while (it.hasNext()) {
            AbstractC35761oCs.StateListAnimator stateListAnimator2 = (AbstractC35761oCs.StateListAnimator) it.next();
            OKMessage oKMessageCopydefault = stateListAnimator2.copydefault();
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(stateListAnimator2.KWHzl());
            int code = oKServerExceptionOLrzqt.getCode();
            if (code == 2004) {
                broadcastMessagesMainFragmentViewModel.djBIcL.add(C56443yFo.KWHzl(oKMessageCopydefault.getSeq()));
                MutableSharedFlow<StringResource> mutableSharedFlow = broadcastMessagesMainFragmentViewModel.KWHzl;
                StringResource.Res res = new StringResource.Res(C35399nuc.LoaderManager.giSNqX);
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$0 = broadcastMessagesMainFragmentViewModel;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$1 = list2;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$2 = it;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label = 1;
                if (mutableSharedFlow.emit(res, broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (code == 2005) {
                MutableSharedFlow<Unit> mutableSharedFlow2 = broadcastMessagesMainFragmentViewModel.copydefault;
                Unit unit = Unit.INSTANCE;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$0 = broadcastMessagesMainFragmentViewModel;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$1 = list2;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$2 = it;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label = 2;
                if (mutableSharedFlow2.emit(unit, broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (code == 50011) {
                MutableSharedFlow<StringResource> mutableSharedFlow3 = broadcastMessagesMainFragmentViewModel.KWHzl;
                StringResource.Res res2 = new StringResource.Res(C35399nuc.LoaderManager.gasjUx);
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$0 = broadcastMessagesMainFragmentViewModel;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$1 = list2;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$2 = it;
                broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label = 3;
                if (mutableSharedFlow3.emit(res2, broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                String message = oKServerExceptionOLrzqt.getMessage();
                if (message != null) {
                    MutableSharedFlow<StringResource> mutableSharedFlow4 = broadcastMessagesMainFragmentViewModel.KWHzl;
                    StringResource.Raw raw = new StringResource.Raw(message);
                    broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$0 = broadcastMessagesMainFragmentViewModel;
                    broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$1 = list2;
                    broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.L$2 = it;
                    broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1.label = 4;
                    if (mutableSharedFlow4.emit(raw, broadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    continue;
                }
            }
        }
        return list2;
    }

    public final Object AEQbTJ(Flow<?> flow, Continuation<? super Flow<? extends Object>> continuation) {
        return FlowKt.m7441catch(flow, new BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2(this, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o.oCs> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<AbstractC35761oCs> AEQbTJ(List<? extends AbstractC35761oCs> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC35761oCs abstractC35761oCs : list) {
            AbstractC35761oCs.TaskDescription taskDescription = abstractC35761oCs instanceof AbstractC35761oCs.TaskDescription ? (AbstractC35761oCs.TaskDescription) abstractC35761oCs : null;
            OKMessage oKMessageOLrzqt = taskDescription != null ? taskDescription.OLrzqt() : null;
            if (oKMessageOLrzqt != null) {
                arrayList.add(oKMessageOLrzqt);
            }
        }
        if (!arrayList.isEmpty()) {
            EZpvd(arrayList, z);
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o.oCs> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<AbstractC35761oCs> copydefault(List<? extends AbstractC35761oCs> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC35761oCs abstractC35761oCs : list) {
            AbstractC35761oCs.Application application = abstractC35761oCs instanceof AbstractC35761oCs.Application ? (AbstractC35761oCs.Application) abstractC35761oCs : null;
            OKMessage oKMessageOLrzqt = application != null ? application.OLrzqt() : null;
            if (oKMessageOLrzqt != null) {
                arrayList.add(oKMessageOLrzqt);
            }
        }
        if (!arrayList.isEmpty()) {
            EZpvd(arrayList, z);
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o.oCs> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<AbstractC35761oCs> OLrzqt(List<? extends AbstractC35761oCs> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC35761oCs abstractC35761oCs : list) {
            AbstractC35761oCs.StateListAnimator stateListAnimator = abstractC35761oCs instanceof AbstractC35761oCs.StateListAnimator ? (AbstractC35761oCs.StateListAnimator) abstractC35761oCs : null;
            OKMessage oKMessageCopydefault = stateListAnimator != null ? stateListAnimator.copydefault() : null;
            if (oKMessageCopydefault != null) {
                arrayList.add(oKMessageCopydefault);
            }
        }
        if (!arrayList.isEmpty()) {
            EZpvd(arrayList, z);
        }
        return list;
    }
}
