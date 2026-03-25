package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25954jMn {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jMr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25954jMn.KWHzl();
        }
    });

    @yCM
    public C25954jMn() {
    }

    public final InterfaceC25956jMp EZpvd() {
        return (InterfaceC25956jMp) this.OLrzqt.getValue();
    }

    public static final InterfaceC25956jMp KWHzl() {
        return (InterfaceC25956jMp) C38416pXz.copydefault(C56524yIo.AEQbTJ(InterfaceC25956jMp.class));
    }

    public java.lang.Object copydefault(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Integer num2, java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<PnlDetailPo>>> continuation) {
        return EZpvd().KWHzl(num, str, str2, bool, num2, str3, continuation);
    }
}
