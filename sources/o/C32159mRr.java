package o;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32159mRr extends mQU {
    public final java.lang.String AYXKKw;
    public final java.lang.String DbNXlk;
    public final InterfaceC32156mRo djBIcL;
    public final java.lang.String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32159mRr(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC32156mRo interfaceC32156mRo) {
        super("dex-market-v3", str3, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC32156mRo, "");
        this.values = str;
        this.DbNXlk = str2;
        this.AYXKKw = str3;
        this.djBIcL = interfaceC32156mRo;
    }

    /* JADX INFO: renamed from: o.mRr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mRr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.mQU
    public void KWHzl(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        this.djBIcL.KWHzl(marketTxWsInfoItemBean);
    }
}
