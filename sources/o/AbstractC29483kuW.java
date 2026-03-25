package o;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29483kuW {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kuW.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC29483kuW(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.kuW$StateListAnimator */
    public static final class StateListAnimator extends AbstractC29483kuW {
        public final java.util.List<SignalUiModel> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SignalUiModel> KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.util.List<SignalUiModel> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    private AbstractC29483kuW() {
    }
}
