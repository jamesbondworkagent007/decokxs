package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.data.model.TokenPriceResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46850teu {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.teB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46850teu.KWHzl();
        }
    });

    @yCM
    public C46850teu() {
    }

    public static final InterfaceC46851tev KWHzl() {
        return (InterfaceC46851tev) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC46851tev.class));
    }

    public final InterfaceC46851tev AEQbTJ() {
        return (InterfaceC46851tev) this.AEQbTJ.getValue();
    }

    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<TokenPriceResponse>> continuation) {
        return AEQbTJ().KWHzl(str, str2, continuation);
    }
}
