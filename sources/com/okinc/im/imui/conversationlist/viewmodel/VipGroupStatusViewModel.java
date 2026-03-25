package com.okinc.im.imui.conversationlist.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.group.VipGroupDismissState;
import com.okinc.okimcore.model.im.group.VipGroupStatus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C37760ozs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sIR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class VipGroupStatusViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public final sIR EZpvd;
    public final MutableSharedFlow<VipGroupDismissState> KWHzl;
    public final SharedFlow<VipGroupDismissState> copydefault;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VipGroupStatus.values().length];
            try {
                iArr[VipGroupStatus.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VipGroupStatus.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<VipGroupDismissState> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public VipGroupStatusViewModel(@NotNull sIR sir) {
        Intrinsics.checkNotNullParameter(sir, "");
        this.EZpvd = sir;
        MutableSharedFlow<VipGroupDismissState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.VipGroupStatusViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void copydefault(@NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        if (num == null || num.intValue() != 14 || this.AEQbTJ) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VipGroupStatusViewModel$checkVipGroupStatus$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, Continuation<? super Unit> continuation) throws Throwable {
        VipGroupStatusViewModel$fetchVipGroupStatus$1 vipGroupStatusViewModel$fetchVipGroupStatus$1;
        Throwable th;
        VipGroupStatusViewModel vipGroupStatusViewModel;
        Object objM7377constructorimpl;
        Object obj;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof VipGroupStatusViewModel$fetchVipGroupStatus$1) {
            vipGroupStatusViewModel$fetchVipGroupStatus$1 = (VipGroupStatusViewModel$fetchVipGroupStatus$1) continuation;
            int i = vipGroupStatusViewModel$fetchVipGroupStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vipGroupStatusViewModel$fetchVipGroupStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                vipGroupStatusViewModel$fetchVipGroupStatus$1 = new VipGroupStatusViewModel$fetchVipGroupStatus$1(this, continuation);
            }
        }
        Object objCopydefault = vipGroupStatusViewModel$fetchVipGroupStatus$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = vipGroupStatusViewModel$fetchVipGroupStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                Result.Application application = Result.Companion;
                sIR sir = this.EZpvd;
                long j = Long.parseLong(str);
                vipGroupStatusViewModel$fetchVipGroupStatus$1.L$0 = this;
                vipGroupStatusViewModel$fetchVipGroupStatus$1.label = 1;
                objCopydefault = sir.copydefault(j, vipGroupStatusViewModel$fetchVipGroupStatus$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                vipGroupStatusViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                vipGroupStatusViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = vipGroupStatusViewModel$fetchVipGroupStatus$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("VipGroupStatusViewModel", "Failed to get VIP group status", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            vipGroupStatusViewModel = (VipGroupStatusViewModel) vipGroupStatusViewModel$fetchVipGroupStatus$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((VipGroupDismissState) objCopydefault);
        Object obj2 = objM7377constructorimpl;
        VipGroupStatusViewModel vipGroupStatusViewModel2 = vipGroupStatusViewModel;
        obj = obj2;
        if (Result.m7384isSuccessimpl(obj)) {
            VipGroupDismissState vipGroupDismissState = (VipGroupDismissState) obj;
            vipGroupStatusViewModel2.AEQbTJ = true;
            pUU.KWHzl("VipGroupStatusViewModel", "VIP group status: " + vipGroupDismissState);
            vipGroupStatusViewModel$fetchVipGroupStatus$1.L$0 = obj;
            vipGroupStatusViewModel$fetchVipGroupStatus$1.label = 2;
            if (vipGroupStatusViewModel2.OLrzqt(vipGroupDismissState, vipGroupStatusViewModel$fetchVipGroupStatus$1) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final Object OLrzqt(VipGroupDismissState vipGroupDismissState, Continuation<? super Unit> continuation) {
        Integer expiryDays;
        VipGroupStatus status = vipGroupDismissState.getStatus();
        int i = status == null ? -1 : ActionBar.KWHzl[status.ordinal()];
        if (i == 1) {
            EZpvd();
        } else if (i == 2 && (expiryDays = vipGroupDismissState.getExpiryDays()) != null && expiryDays.intValue() > 0 && !KWHzl(vipGroupDismissState)) {
            Object objEmit = this.KWHzl.emit(vipGroupDismissState, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(VipGroupDismissState vipGroupDismissState) {
        try {
            VipGroupDismissState vipGroupDismissState2 = (VipGroupDismissState) C37760ozs.OLrzqt("SAVE_DO_NOT_SHOW_AGAIN_VIP_CHAT", VipGroupDismissState.class);
            if (Intrinsics.EZpvd(vipGroupDismissState2.getExpiryTimestamp(), vipGroupDismissState.getExpiryTimestamp())) {
                return true;
            }
            if (vipGroupDismissState2.getExpiryTimestamp() != null) {
                EZpvd();
            }
        } catch (Exception e) {
            pUU.copydefault("VipGroupStatusViewModel", "Read Vip Preference Error " + e.getMessage());
        }
        return false;
    }

    public final void EZpvd() {
        C37760ozs.KWHzl("SAVE_DO_NOT_SHOW_AGAIN_VIP_CHAT");
    }
}
