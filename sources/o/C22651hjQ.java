package o;

import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.net.DexSourceResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22651hjQ extends AbstractC22649hjO<DexSourceResp<QuotePriceRes>> {
    public final boolean AEQbTJ;
    public final C23237huT OLrzqt;
    public final java.lang.String djBIcL;
    public final QuotePriceReq valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 o.huT)
  (r9v0 com.okinc.business.dexlogic.bean.QuotePriceReq)
  (r10v0 java.lang.String)
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (5000 long) : (r11v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
 A[MD:(o.huT, com.okinc.business.dexlogic.bean.QuotePriceReq, java.lang.String, long, boolean):void (m)] (LINE:15) call: o.hjQ.<init>(o.huT, com.okinc.business.dexlogic.bean.QuotePriceReq, java.lang.String, long, boolean):void type: THIS */
    public /* synthetic */ C22651hjQ(C23237huT c23237huT, QuotePriceReq quotePriceReq, java.lang.String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23237huT, quotePriceReq, str, (i & 8) != 0 ? 5000L : j, (i & 16) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22651hjQ(@NotNull C23237huT c23237huT, @NotNull QuotePriceReq quotePriceReq, @NotNull java.lang.String str, long j, boolean z) {
        super(j);
        Intrinsics.checkNotNullParameter(c23237huT, "");
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = c23237huT;
        this.valueOf = quotePriceReq;
        this.djBIcL = str;
        this.AEQbTJ = z;
    }

    public final AbstractC58185ywX<DexSourceResp<QuotePriceRes>> OLrzqt(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd();
        return C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22651hjQ.EZpvd(this.EZpvd, function1, interfaceC58184ywW);
            }
        });
    }

    public static final void EZpvd(C22651hjQ c22651hjQ, Function1 function1, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c22651hjQ.OLrzqt(true);
        c22651hjQ.KWHzl((InterfaceC58184ywW<DexSourceResp<QuotePriceRes>>) interfaceC58184ywW, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    @Override // o.AbstractC22649hjO
    public void KWHzl(@NotNull final InterfaceC58184ywW<DexSourceResp<QuotePriceRes>> interfaceC58184ywW, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58185ywX<ResponseData<QuotePriceRes>> abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt();
        function1.invoke(java.lang.Boolean.valueOf(copydefault()));
        if (this.AEQbTJ) {
            abstractC58185ywXCopydefault = this.OLrzqt.copydefault(this.djBIcL, this.valueOf);
        } else {
            abstractC58185ywXCopydefault = this.OLrzqt.copydefault(this.valueOf);
        }
        final Function1 function12 = new Function1() { // from class: o.hjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22651hjQ.AEQbTJ(this.EZpvd, interfaceC58184ywW, function1, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<QuotePriceRes>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22651hjQ.AEQbTJ(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22651hjQ.AEQbTJ(this.AEQbTJ, interfaceC58184ywW, function1, (java.lang.Throwable) obj);
            }
        };
        copydefault(abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22651hjQ.EZpvd(function13, obj);
            }
        }));
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22651hjQ c22651hjQ, InterfaceC58184ywW interfaceC58184ywW, Function1 function1, java.lang.Throwable th) {
        c22651hjQ.KWHzl().KWHzl(new java.lang.Exception(th));
        c22651hjQ.copydefault(interfaceC58184ywW, (Function1<? super java.lang.Boolean, Unit>) function1);
        interfaceC58184ywW.onNext(new DexSourceResp(false, null, th, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22651hjQ c22651hjQ, InterfaceC58184ywW interfaceC58184ywW, Function1 function1, ResponseData responseData) {
        if (responseData.getCode() == 0) {
            c22651hjQ.KWHzl().OLrzqt();
            c22651hjQ.copydefault(interfaceC58184ywW, (Function1<? super java.lang.Boolean, Unit>) function1);
            interfaceC58184ywW.onNext(new DexSourceResp(true, responseData.getData(), null, 4, null));
        } else {
            c22651hjQ.KWHzl().KWHzl(new java.lang.Exception(responseData.getMsg()));
            c22651hjQ.copydefault(interfaceC58184ywW, (Function1<? super java.lang.Boolean, Unit>) function1);
            interfaceC58184ywW.onNext(new DexSourceResp(false, null, new java.lang.Exception(responseData.getMsg()), 2, null));
        }
        return Unit.INSTANCE;
    }
}
