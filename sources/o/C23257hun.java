package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23257hun extends AbstractC23179htO {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final java.lang.String AYXKKw;
    public final InterfaceC23251huh djBIcL;
    public final java.lang.String isConnected;
    public final java.lang.String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23257hun(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC23251huh interfaceC23251huh) {
        super("dex-market-v3", str3, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC23251huh, "");
        this.isConnected = str;
        this.values = str2;
        this.AYXKKw = str3;
        this.djBIcL = interfaceC23251huh;
    }

    /* JADX INFO: renamed from: o.hun$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hun.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC23179htO
    public void AEQbTJ(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        this.djBIcL.AEQbTJ(marketTxWsInfoItemBean);
    }
}
