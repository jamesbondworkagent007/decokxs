package com.okinc.im.imui.conversationlist.error;

import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C35830oFg;
import o.C35831oFh;
import o.C35837oFn;
import o.C56442yFn;
import o.nGF;
import o.rXL;
import o.rXQ;
import o.sGF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListSubAccountViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final sGF AEQbTJ;
    public final C35831oFh AYXKKw;
    public final C35837oFn AhwBna;
    public final C35830oFg EZpvd;
    public final MutableStateFlow<List<nGF>> KWHzl;
    public final MutableSharedFlow<String> copydefault;
    public final StateFlow<List<nGF>> djBIcL;
    public final SharedFlow<String> gEmmrt;
    public final rXQ valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<nGF>> EZpvd() {
        return this.djBIcL;
    }

    @yCM
    public ConversationListSubAccountViewModel(@NotNull sGF sgf, @NotNull C35830oFg c35830oFg, @NotNull C35831oFh c35831oFh, @NotNull C35837oFn c35837oFn, @NotNull rXQ rxq) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(c35830oFg, "");
        Intrinsics.checkNotNullParameter(c35831oFh, "");
        Intrinsics.checkNotNullParameter(c35837oFn, "");
        Intrinsics.checkNotNullParameter(rxq, "");
        this.AEQbTJ = sgf;
        this.EZpvd = c35830oFg;
        this.AYXKKw = c35831oFh;
        this.AhwBna = c35837oFn;
        this.valueOf = rxq;
        MutableStateFlow<List<nGF>> MutableStateFlow = StateFlowKt.MutableStateFlow(Collections.emptyList());
        this.KWHzl = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListSubAccountViewModel$loadNotifications$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull OKConversation oKConversation) {
        rXL rxlEZpvd;
        Intrinsics.checkNotNullParameter(oKConversation, "");
        if (TaskDescription.OLrzqt[oKConversation.getConversationType().ordinal()] != 1 || (rxlEZpvd = rXL.Companion.EZpvd(oKConversation.getTargetId())) == null) {
            return;
        }
        OLrzqt(rxlEZpvd);
    }

    private final void OLrzqt(rXL rxl) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1(this, rxl, null), 3, null);
    }

    public final Object copydefault(Continuation<? super Unit> continuation) throws Throwable {
        Object objAEQbTJ = this.EZpvd.AEQbTJ(continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListSubAccountViewModel$refreshNotifications$1(this, null), 3, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
