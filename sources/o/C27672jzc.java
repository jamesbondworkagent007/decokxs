package o;

import com.okinc.business.market.data.ws.LiquidityChangeWsClient$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27672jzc extends AbstractC23211htu {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final SharedFlow<java.lang.String> AYXKKw;
    public final C27673jzd valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27672jzc(@NotNull C27673jzd c27673jzd) {
        super(false, new LiquidityChangeWsClient$1(c27673jzd));
        Intrinsics.checkNotNullParameter(c27673jzd, "");
        this.valueOf = c27673jzd;
        this.AYXKKw = c27673jzd.KWHzl();
    }

    /* JADX INFO: renamed from: o.jzc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jzc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
