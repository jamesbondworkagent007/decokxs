package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23183htS extends AbstractC23179htO {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final java.lang.String AYXKKw;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final InterfaceC23251huh valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23183htS(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC23251huh interfaceC23251huh) {
        super("dex-market", str3, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC23251huh, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.AYXKKw = str3;
        this.valueOf = interfaceC23251huh;
    }

    /* JADX INFO: renamed from: o.htS$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.htS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC23179htO
    public void AEQbTJ(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        this.valueOf.AEQbTJ(marketTxWsInfoItemBean);
    }
}
