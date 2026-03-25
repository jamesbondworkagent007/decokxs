package o;

import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVT {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mVU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mVT.EZpvd();
        }
    });

    @yCM
    public mVT() {
    }

    public static final mVS EZpvd() {
        return (mVS) C43417ror.OLrzqt(C56524yIo.AEQbTJ(mVS.class));
    }

    public final mVS AEQbTJ() {
        return (mVS) this.OLrzqt.getValue();
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<AlertRemindPo>>> continuation) {
        return AEQbTJ().copydefault(continuation);
    }
}
