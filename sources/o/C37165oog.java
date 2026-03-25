package o;

import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37165oog {
    public final MutableStateFlow<C37147ooO> AEQbTJ;
    public final InterfaceC37144ooL KWHzl;
    public final StateFlow<C37147ooO> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37165oog() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C37165oog(InterfaceC37144ooL interfaceC37144ooL) {
        this.KWHzl = interfaceC37144ooL;
        MutableStateFlow<C37147ooO> MutableStateFlow = StateFlowKt.MutableStateFlow(C37147ooO.Companion.KWHzl());
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.ooL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.ooL) : (r1v0 o.ooL))
 A[MD:(o.ooL):void (m)] (LINE:56) call: o.oog.<init>(o.ooL):void type: THIS */
    public /* synthetic */ C37165oog(InterfaceC37144ooL interfaceC37144ooL, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC37144ooL);
    }

    public final C37147ooO copydefault() {
        return this.AEQbTJ.getValue();
    }

    public final void KWHzl() {
        this.AEQbTJ.setValue(C37147ooO.Companion.KWHzl());
    }

    public static final C37147ooO AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, str, str2, z, null, false, null, 56, null);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(new Function1() { // from class: o.ooo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37165oog.AEQbTJ(str, str2, z, (C37147ooO) obj);
            }
        });
    }

    public static /* synthetic */ void setStatus$default(C37165oog c37165oog, CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            oKCallDisconnectedReason = null;
        }
        c37165oog.OLrzqt(callStatus, oKCallDisconnectedReason);
    }

    public static final C37147ooO copydefault(CallStatus callStatus, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, null, null, false, callStatus, false, null, 55, null);
    }

    public final void OLrzqt(@NotNull final CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        Intrinsics.checkNotNullParameter(callStatus, "");
        copydefault(new Function1() { // from class: o.ooj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37165oog.copydefault(callStatus, (C37147ooO) obj);
            }
        });
        InterfaceC37144ooL interfaceC37144ooL = this.KWHzl;
        if (interfaceC37144ooL != null) {
            interfaceC37144ooL.copydefault(callStatus, oKCallDisconnectedReason);
        }
    }

    public static final C37147ooO copydefault(boolean z, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, null, null, false, null, z, null, 47, null);
    }

    public final void KWHzl(final boolean z) {
        copydefault(new Function1() { // from class: o.oof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37165oog.copydefault(z, (C37147ooO) obj);
            }
        });
    }

    public static final C37147ooO AEQbTJ(AudioCallUIParams audioCallUIParams, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, null, null, false, null, false, audioCallUIParams, 31, null);
    }

    public final void OLrzqt(final AudioCallUIParams audioCallUIParams) {
        copydefault(new Function1() { // from class: o.ooh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37165oog.AEQbTJ(audioCallUIParams, (C37147ooO) obj);
            }
        });
    }

    public static final C37147ooO OLrzqt(Function1 function1, C37147ooO c37147ooO) {
        Intrinsics.checkNotNullParameter(c37147ooO, "");
        return C37147ooO.copy$default(c37147ooO, null, null, false, null, false, (AudioCallUIParams) function1.invoke(c37147ooO.KWHzl()), 31, null);
    }

    public final void OLrzqt(@NotNull final Function1<? super AudioCallUIParams, AudioCallUIParams> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(new Function1() { // from class: o.oon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37165oog.OLrzqt(function1, (C37147ooO) obj);
            }
        });
    }

    public final void copydefault(@NotNull Function1<? super C37147ooO, C37147ooO> function1) {
        C37147ooO value;
        Intrinsics.checkNotNullParameter(function1, "");
        MutableStateFlow<C37147ooO> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, function1.invoke(value)));
    }
}
