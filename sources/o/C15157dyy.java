package o;

import com.okinc.business.defi.dapp.net.OKAAWalletChainList;
import com.okinc.business.defi.dapp.net.OKDapp;
import com.okinc.dapp.bean.DappChains;
import com.okinc.wallet.api.bean.DappSupportCheck;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.dyy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15157dyy {
    public static final C15157dyy EZpvd = new C15157dyy();
    public static C15059dxF valueOf = new C15059dxF();
    public static java.util.List<DappChains> AhwBna = new java.util.ArrayList();
    public static java.util.List<DappChains> KWHzl = new java.util.ArrayList();
    public static java.util.List<OKDapp> copydefault = new java.util.ArrayList();
    public static java.lang.String djBIcL = "";
    public static java.util.HashMap<java.lang.String, DappSupportCheck> OLrzqt = new java.util.HashMap<>();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DappChains> EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OKDapp> KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, DappSupportCheck> OLrzqt() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DappChains> copydefault() {
        return AhwBna;
    }

    private C15157dyy() {
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void gEmmrt() {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) valueOf.KWHzl()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.dyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15157dyy.EZpvd((java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dyv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15157dyy.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dyu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15157dyy.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15157dyy.AhwBna(function12, obj);
            }
        });
        if (KWHzl.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default2 = C43423rox.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) valueOf.EZpvd()), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function13 = new Function1() { // from class: o.dyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15157dyy.KWHzl((OKAAWalletChainList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15157dyy.valueOf(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dyz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15157dyy.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXUnwrapResponseData$default2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dyB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15157dyy.gEmmrt(function14, obj);
                }
            });
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.util.List list) {
        AhwBna = list;
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        if (AhwBna.isEmpty()) {
            AhwBna = new java.util.ArrayList();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(OKAAWalletChainList oKAAWalletChainList) {
        KWHzl = oKAAWalletChainList.getDappAAWalletChainList();
        copydefault = oKAAWalletChainList.getDappOkxList();
        djBIcL = oKAAWalletChainList.getDappNftId();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
