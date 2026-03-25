package o;

import com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle;
import com.okinc.rxutils.RxBus;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22380heK {
    public static C23261hur AEQbTJ;
    public static InterfaceC58217yxC gEmmrt;
    public static C23263hut valueOf;
    public static final C22380heK OLrzqt = new C22380heK();
    public static ConcurrentHashMap<java.lang.String, C22374heE> EZpvd = new ConcurrentHashMap<>();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.heP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C22380heK.EZpvd();
        }
    });
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23261hur copydefault() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23263hut djBIcL() {
        return valueOf;
    }

    private C22380heK() {
    }

    public final C22826hmg OLrzqt() {
        return (C22826hmg) copydefault.getValue();
    }

    public static final C22826hmg EZpvd() {
        return new C22826hmg();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        if (EZpvd.get(str) == null) {
            EZpvd.put(str, new C22374heE(str));
        }
    }

    public final C22374heE copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd.get(str) == null) {
            EZpvd.put(str, new C22374heE(str));
        }
        C22374heE c22374heE = EZpvd.get(str);
        Intrinsics.copydefault(c22374heE);
        return c22374heE;
    }

    public final C22826hmg AEQbTJ() {
        return OLrzqt();
    }

    public final void EZpvd(java.lang.String str) {
        EZpvd.remove(str);
        if (EZpvd.isEmpty()) {
            OLrzqt().EZpvd();
        }
        jUD.copydefault.copydefault();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(str);
    }

    public static /* synthetic */ void initWsTools$default(C22380heK c22380heK, C23263hut c23263hut, C23261hur c23261hur, int i, java.lang.Object obj) {
        WsHandle wsHandle = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        int i2 = 1;
        if ((i & 1) != 0) {
            c23263hut = new C23263hut(wsHandle, i2, b3 == true ? 1 : 0);
        }
        if ((i & 2) != 0) {
            c23261hur = new C23261hur(b2 == true ? 1 : 0, i2, b == true ? 1 : 0);
        }
        c22380heK.copydefault(c23263hut, c23261hur);
    }

    public final void copydefault(@NotNull C23263hut c23263hut, @NotNull C23261hur c23261hur) {
        Intrinsics.checkNotNullParameter(c23263hut, "");
        Intrinsics.checkNotNullParameter(c23261hur, "");
        if (valueOf == null) {
            valueOf = c23263hut;
        }
        if (AEQbTJ == null) {
            AEQbTJ = c23261hur;
        }
        C23263hut c23263hut2 = valueOf;
        if (c23263hut2 != null) {
            c23263hut2.KWHzl();
        }
        C23261hur c23261hur2 = AEQbTJ;
        if (c23261hur2 != null) {
            c23261hur2.KWHzl();
        }
        valueOf();
    }

    public final void valueOf() {
        InterfaceC58217yxC interfaceC58217yxC = gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.heI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22380heK.AEQbTJ((xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.heJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22380heK.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.heM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22380heK.copydefault((java.lang.Throwable) obj);
            }
        };
        gEmmrt = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.heL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22380heK.EZpvd(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(xXO xxo) {
        C23263hut c23263hut = valueOf;
        if (c23263hut != null) {
            c23263hut.KWHzl();
        }
        C23261hur c23261hur = AEQbTJ;
        if (c23261hur != null) {
            c23261hur.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        LimitWsHandle limitWsHandleEZpvd;
        WsHandle wsHandleAYXKKw;
        C23263hut c23263hut = valueOf;
        if (c23263hut != null && (wsHandleAYXKKw = c23263hut.AYXKKw()) != null) {
            wsHandleAYXKKw.unSubWs();
        }
        C23261hur c23261hur = AEQbTJ;
        if (c23261hur != null && (limitWsHandleEZpvd = c23261hur.EZpvd()) != null) {
            limitWsHandleEZpvd.unSubWs();
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        C23263hut c23263hut = valueOf;
        if (c23263hut != null) {
            c23263hut.valueOf();
        }
        C23261hur c23261hur = AEQbTJ;
        if (c23261hur != null) {
            c23261hur.OLrzqt();
        }
        InterfaceC58217yxC interfaceC58217yxC = gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        valueOf = null;
        AEQbTJ = null;
        gEmmrt = null;
    }
}
