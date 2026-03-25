package o;

import com.okinc.im.config.page.IMPageType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.ody, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36600ody {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final C36600ody copydefault = new C36600ody();
    public final SharedFlow<java.util.Map<IMPageType, java.util.List<AbstractC35291nsZ>>> AEQbTJ;
    public final MutableSharedFlow<java.util.Map<IMPageType, java.util.List<AbstractC35291nsZ>>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.Map<IMPageType, java.util.List<AbstractC35291nsZ>>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.ody$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ody.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C36600ody OLrzqt() {
            return C36600ody.copydefault;
        }
    }

    public C36600ody() {
        MutableSharedFlow<java.util.Map<IMPageType, java.util.List<AbstractC35291nsZ>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        mutableSharedFlowMutableSharedFlow$default.tryEmit(new LinkedHashMap());
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}
