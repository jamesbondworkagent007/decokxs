package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dQW extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQW.copydefault(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQW.OLrzqt(interfaceC57336ygW, message, (AbstractC12782ctV) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.OLrzqt(message, "{}");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("isBackedUp", java.lang.Boolean.valueOf(abstractC12782ctV.zLjUOn())))));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("isMainWalletBackedUp", "web3/wallet/js/isMainWalletBackedUp");
    }
}
