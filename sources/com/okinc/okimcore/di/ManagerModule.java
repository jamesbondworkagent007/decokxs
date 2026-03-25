package com.okinc.okimcore.di;

import com.okinc.okimcore.di.ManagerModule;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C44272sJr;
import o.C44302sKu;
import o.C44489sRs;
import o.C44498sSa;
import o.C44504sSg;
import o.InterfaceC44293sKl;
import o.InterfaceC44301sKt;
import o.sED;
import o.sGH;
import o.sGI;
import o.sHZ;
import o.sIC;
import o.sMF;
import o.sMU;
import o.yCL;
import o.yCR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ManagerModule {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final CoroutineScope EZpvd(CoroutineScope coroutineScope) {
        return coroutineScope;
    }

    @yCL(AEQbTJ = "latestCallMessagesStateFlow")
    @yCR
    public final MutableStateFlow<List<InHouseIMMessageEntity>> EZpvd() {
        return StateFlowKt.MutableStateFlow(yDY.AhwBna());
    }

    @yCL(AEQbTJ = "groupVoiceCallSharedFlow")
    @yCR
    public final MutableSharedFlow<InHouseIMMessageEntity> AEQbTJ() {
        return SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
    }

    @yCR
    public final InterfaceC44301sKt OLrzqt(@NotNull sGI sgi, @NotNull sIC sic, @NotNull C44498sSa c44498sSa, @NotNull C44489sRs c44489sRs, @NotNull InHouseIMConversationService inHouseIMConversationService, @NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull sHZ shz, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull sED sed, @NotNull sGH sgh, @yCL(AEQbTJ = "latestCallMessagesStateFlow") @NotNull MutableStateFlow<List<InHouseIMMessageEntity>> mutableStateFlow, @yCL(AEQbTJ = "groupVoiceCallSharedFlow") @NotNull MutableSharedFlow<InHouseIMMessageEntity> mutableSharedFlow, @NotNull C44504sSg c44504sSg, @NotNull sMF smf, @NotNull C44272sJr c44272sJr, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull final CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sgi, "");
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(c44498sSa, "");
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationService, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(shz, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(sed, "");
        Intrinsics.checkNotNullParameter(sgh, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "");
        Intrinsics.checkNotNullParameter(c44504sSg, "");
        Intrinsics.checkNotNullParameter(smf, "");
        Intrinsics.checkNotNullParameter(c44272sJr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new C44302sKu(sic, shz, c44498sSa, sgi, c44489sRs, sed, inHouseIMConversationService, inHouseIMGroupService, c44272sJr, interfaceC44293sKl, mutableStateFlow, mutableSharedFlow, sgh, new sMU("MainTaskQueue", new Function0() { // from class: o.sFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ManagerModule.EZpvd(coroutineScope);
            }
        }, null, null, null, false, 60, null), c44504sSg, smf, coroutineDispatcher);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.di.ManagerModule.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
