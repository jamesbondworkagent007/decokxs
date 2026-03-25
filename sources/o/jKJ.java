package o;

import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jKJ {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jKL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jKJ.KWHzl();
        }
    });

    @yCM
    public jKJ() {
    }

    public final jKG copydefault() {
        return (jKG) this.KWHzl.getValue();
    }

    public static final jKG KWHzl() {
        return (jKG) C38416pXz.copydefault(C56524yIo.AEQbTJ(jKG.class));
    }

    public java.lang.Object KWHzl(@NotNull PayloadPeriod payloadPeriod, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<jKO>>> continuation) {
        return copydefault().OLrzqt(payloadPeriod.getValue(), str, str2, continuation);
    }
}
