package com.okinc.okimcore.usecase;

import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44486sRp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import o.sDN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ObserveShowAgentProcessingFlow {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C44486sRp OLrzqt;

    @yCM
    public ObserveShowAgentProcessingFlow(@NotNull C44486sRp c44486sRp) {
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        this.OLrzqt = c44486sRp;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AgentProcessingState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AgentProcessingState[] $VALUES;
        public static final AgentProcessingState WORKING = new AgentProcessingState("WORKING", 0);
        public static final AgentProcessingState WORKING_STREAMING = new AgentProcessingState("WORKING_STREAMING", 1);
        public static final AgentProcessingState IDLE = new AgentProcessingState("IDLE", 2);
        public static final AgentProcessingState SENDING = new AgentProcessingState("SENDING", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AgentProcessingState[] $values() {
            return new AgentProcessingState[]{WORKING, WORKING_STREAMING, IDLE, SENDING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AgentProcessingState> getEntries() {
            return $ENTRIES;
        }

        private AgentProcessingState(String str, int i) {
        }

        static {
            AgentProcessingState[] agentProcessingStateArr$values = $values();
            $VALUES = agentProcessingStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(agentProcessingStateArr$values);
        }

        public static AgentProcessingState valueOf(String str) {
            return (AgentProcessingState) Enum.valueOf(AgentProcessingState.class, str);
        }

        public static AgentProcessingState[] values() {
            return (AgentProcessingState[]) $VALUES.clone();
        }
    }

    public final Flow<AgentProcessingState> AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.m7441catch(FlowKt.flowOn(FlowKt.conflate(FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.OLrzqt.copydefault(str), new ObserveShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1(null, this, str)))), sDN.copydefault.copydefault()), new ObserveShowAgentProcessingFlow$invoke$2(null));
    }

    public final Flow<AgentProcessingState> copydefault(String str, long j, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity) {
        return new Application(this.OLrzqt.KWHzl(str, j), this, z, inHouseIMMessageEntity);
    }

    public final AgentProcessingState OLrzqt(List<InHouseIMMessageEntity> list, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OLrzqt((InHouseIMMessageEntity) next)) {
                break;
            }
        }
        InHouseIMMessageEntity inHouseIMMessageEntity2 = (InHouseIMMessageEntity) next;
        if (inHouseIMMessageEntity2 != null && AEQbTJ(inHouseIMMessageEntity2)) {
            copydefault("IDLE - RequestIgnoreMessage found");
            return AgentProcessingState.IDLE;
        }
        if (inHouseIMMessageEntity2 != null && EZpvd(inHouseIMMessageEntity2)) {
            copydefault("WORKING - OtcInternalPrompt found");
            return AgentProcessingState.WORKING;
        }
        if (copydefault(inHouseIMMessageEntity)) {
            copydefault("WORKING_STREAMING - OtcInternalPrompt found");
            return AgentProcessingState.WORKING_STREAMING;
        }
        if (!z) {
            copydefault("IDLE - last visible from counterpart");
            return AgentProcessingState.IDLE;
        }
        copydefault("WORKING - waiting for agent response");
        return AgentProcessingState.WORKING;
    }

    public static final class Application implements Flow<AgentProcessingState> {
        public final /* synthetic */ ObserveShowAgentProcessingFlow AEQbTJ;
        public final /* synthetic */ InHouseIMMessageEntity EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        public Application(Flow flow, ObserveShowAgentProcessingFlow observeShowAgentProcessingFlow, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity) {
            this.OLrzqt = flow;
            this.AEQbTJ = observeShowAgentProcessingFlow;
            this.KWHzl = z;
            this.EZpvd = inHouseIMMessageEntity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(@NotNull FlowCollector<? super AgentProcessingState> flowCollector, @NotNull Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.AEQbTJ, this.KWHzl, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ ObserveShowAgentProcessingFlow EZpvd;
            public final /* synthetic */ InHouseIMMessageEntity KWHzl;
            public final /* synthetic */ boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, ObserveShowAgentProcessingFlow observeShowAgentProcessingFlow, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity) {
                this.AEQbTJ = flowCollector;
                this.EZpvd = observeShowAgentProcessingFlow;
                this.OLrzqt = z;
                this.KWHzl = inHouseIMMessageEntity;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                ObserveShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1 observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1;
                if (continuation instanceof ObserveShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1) {
                    observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1 = (ObserveShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1) continuation;
                    int i = observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1 = new ObserveShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    List list = (List) obj;
                    pUU.EZpvd("ObserveShowAgentProcessingFlow", "custom message count: " + list.size());
                    AgentProcessingState agentProcessingStateOLrzqt = this.EZpvd.OLrzqt(list, this.OLrzqt, this.KWHzl);
                    observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(agentProcessingStateOLrzqt, observeShowAgentProcessingFlow$observeCustomMessages$$inlined$map$1$2$1) == objCopydefault) {
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
    }

    public final void copydefault(String str) {
        pUU.KWHzl("ObserveShowAgentProcessingFlow", str);
    }

    public final boolean copydefault(InHouseIMMessageEntity inHouseIMMessageEntity) {
        StreamPlaceHolderMessageData streamPlaceholderMessage;
        return inHouseIMMessageEntity != null && inHouseIMMessageEntity.getContentType() == InHouseIMContentType.StreamPlaceHolder.getApiValue() && ((streamPlaceholderMessage = inHouseIMMessageEntity.getStreamPlaceholderMessage()) == null || !Intrinsics.EZpvd(streamPlaceholderMessage.getComplete(), Boolean.TRUE));
    }

    public final boolean OLrzqt(InHouseIMMessageEntity inHouseIMMessageEntity) {
        return AEQbTJ(inHouseIMMessageEntity) || EZpvd(inHouseIMMessageEntity);
    }

    public final boolean AEQbTJ(InHouseIMMessageEntity inHouseIMMessageEntity) {
        if (inHouseIMMessageEntity.getContentType() == InHouseIMContentType.Custom.getApiValue()) {
            CustomMessageData customMessage = inHouseIMMessageEntity.getCustomMessage();
            if (Intrinsics.EZpvd((Object) (customMessage != null ? customMessage.getBizName() : null), (Object) InHouseIMMessageDao.REQUEST_IGNORE_RESPONSE_MESSAGE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(InHouseIMMessageEntity inHouseIMMessageEntity) {
        if (inHouseIMMessageEntity.getContentType() == InHouseIMContentType.Custom.getApiValue()) {
            CustomMessageData customMessage = inHouseIMMessageEntity.getCustomMessage();
            if (Intrinsics.EZpvd((Object) (customMessage != null ? customMessage.getBizName() : null), (Object) "OTC_INTERNAL_PROMPT_MESSAGE")) {
                return true;
            }
        }
        return false;
    }
}
