package o;

import com.okinc.buysell.domain.GetQuoteUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC31764mDa OLrzqt;

    @yCM
    public lyX(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.OLrzqt = interfaceC31764mDa;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull TradeType tradeType, @NotNull java.lang.String str5, int i, int i2, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetQuoteUseCase$invoke$2(this, str, str2, str3, str4, tradeType, str5, i, i2, str6, str7, null), continuation);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
