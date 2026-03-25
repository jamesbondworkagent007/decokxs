package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.home.NewCoinInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46595taD {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.taE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46595taD.OLrzqt();
        }
    });

    @yCM
    public C46595taD() {
    }

    public final InterfaceC46592taA KWHzl() {
        return (InterfaceC46592taA) this.EZpvd.getValue();
    }

    public static final InterfaceC46592taA OLrzqt() {
        return (InterfaceC46592taA) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC46592taA.class));
    }

    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.ArrayList<NewCoinInfo>>> continuation) {
        return KWHzl().KWHzl(qTC.copydefault.AEQbTJ(), continuation);
    }
}
