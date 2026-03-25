package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.jsbridge.JsBridgeAAIsExist;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dPV extends AbstractC57329ygP {

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.AAWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPV.copydefault(interfaceC57336ygW, message, this, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dPV.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPV.KWHzl(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dPV.djBIcL(function12, obj);
            }
        });
    }

    public static final Unit copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, dPV dpv, AbstractC12782ctV abstractC12782ctV) {
        int i = StateListAnimator.KWHzl[abstractC12782ctV.QwvEab().ordinal()];
        if (i == 1) {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(new JsBridgeAAIsExist(true)));
        } else if (i == 2) {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(new JsBridgeAAIsExist(false, 1, (DefaultConstructorMarker) null)));
        } else {
            Intrinsics.copydefault(abstractC12782ctV);
            dpv.EZpvd(abstractC12782ctV, interfaceC57336ygW, message);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(new JsBridgeAAIsExist(false, 1, (DefaultConstructorMarker) null)));
        return Unit.INSTANCE;
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV, final InterfaceC57336ygW interfaceC57336ygW, final com.okinc.jsbridge.Message message) {
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L);
        if (strEZpvd == null || strEZpvd.length() == 0 || strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(new JsBridgeAAIsExist(false, 1, (DefaultConstructorMarker) null)));
            return;
        }
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(strEZpvd, abstractC12782ctV.QwvEab());
        final Function1 function1 = new Function1() { // from class: o.dPY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPV.EZpvd(interfaceC57336ygW, message, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<AbstractC12782ctV>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dPV.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPV.EZpvd(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dPV.AYXKKw(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.util.List list) {
        C12764ctD c12764ctD = C12764ctD.OLrzqt;
        Intrinsics.copydefault(list);
        interfaceC57336ygW.OLrzqt(message, c12764ctD.AEQbTJ(new JsBridgeAAIsExist(!list.isEmpty())));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(new JsBridgeAAIsExist(false, 1, (DefaultConstructorMarker) null)));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("getAAAccountIsExistForCurrentWallet", "web3/wallet/js/getAAAccountIsExistForCurrentWallet");
    }
}
