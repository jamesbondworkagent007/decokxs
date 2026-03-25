package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23599iCi {
    public final InterfaceC56387yDm AEQbTJ;
    public InterfaceC58217yxC OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public C23599iCi(@NotNull final java.lang.String str, @NotNull final Function1<? super java.lang.String, Unit> function1, final Function1<? super OKWsConnectionState, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23599iCi.EZpvd();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.iCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23599iCi.OLrzqt(str, this, function12, function1);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKWsConnectionState, kotlin.Unit>):void (m)] (LINE:12) call: o.iCi.<init>(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C23599iCi(java.lang.String str, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1, (i & 4) != 0 ? null : function12);
    }

    public final C57567ykp KWHzl() {
        return (C57567ykp) this.copydefault.getValue();
    }

    public final AbstractC57556yke copydefault() {
        return (AbstractC57556yke) this.AEQbTJ.getValue();
    }

    public static final AbstractC57556yke OLrzqt(java.lang.String str, final C23599iCi c23599iCi, final Function1 function1, final Function1 function12) {
        return C57554ykc.Companion.AEQbTJ(str, c23599iCi.KWHzl(), yDY.copydefault(new WsArgV5(str, null, null, null, null, null, null, null, 254, null)), new Function2() { // from class: o.iCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23599iCi.copydefault(this.copydefault, function1, function12, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit copydefault(C23599iCi c23599iCi, Function1 function1, Function1 function12, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            if (function1 != null) {
                function1.invoke(abstractC33132mqg.EZpvd());
            }
            java.lang.Object payload = oKIncomingData.getPayload();
            Intrinsics.copydefault(payload, "");
            function12.invoke((java.lang.String) payload);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("InvestWsClient listen failed=" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }

    public void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        copydefault().djBIcL();
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23599iCi c23599iCi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c23599iCi.copydefault().AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23599iCi c23599iCi, java.lang.Throwable th) {
        c23599iCi.copydefault().AhwBna();
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXIsConnected = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).isConnected();
        final Function1 function1 = new Function1() { // from class: o.iCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23599iCi.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23599iCi.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23599iCi.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXIsConnected.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23599iCi.EZpvd(function12, obj);
            }
        });
    }

    public static final C57567ykp EZpvd() {
        return ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).values();
    }
}
