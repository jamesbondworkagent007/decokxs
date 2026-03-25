package o;

import com.okinc.business.defi.jsbridge.MessageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dQO extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        try {
            java.lang.String str2 = message.data;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            MessageData messageData = (MessageData) C33490mxT.EZpvd(str2, MessageData.class);
            if (messageData != null) {
                java.lang.String walletId = messageData.getWalletId();
                if (walletId != null) {
                    str = walletId;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQO.EZpvd(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dQO.AEQbTJ(interfaceC57336ygW, message, (AbstractC12782ctV) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.OLrzqt(message, "{}");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("isMainWallet", java.lang.Boolean.valueOf(abstractC12782ctV.zuWLRA())))));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("isMainWalletById", "web3/wallet/js/isMainWalletById");
    }
}
