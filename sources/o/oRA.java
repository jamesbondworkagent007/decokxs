package o;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRA {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oRw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oRA.EZpvd();
        }
    });

    @yCM
    public oRA() {
    }

    public final InterfaceC36172oRy AEQbTJ() {
        return (InterfaceC36172oRy) this.copydefault.getValue();
    }

    public static final InterfaceC36172oRy EZpvd() {
        return (InterfaceC36172oRy) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC36172oRy.class));
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<IndexComponentsResp>> continuation) {
        return AEQbTJ().AEQbTJ(str, continuation);
    }
}
