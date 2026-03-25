package o;

import com.okinc.business.defi.jsbridge.JsBridgeWalletBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13573dQi extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        C11607cUn.OLrzqt(C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13573dQi.AEQbTJ(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13573dQi.OLrzqt(interfaceC57336ygW, message, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56402yEa.EZpvd(new JsBridgeWalletBean((java.lang.String) null, 0, 3, (DefaultConstructorMarker) null))));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("getAllWalletListWithType", "web3/wallet/js/getAllWalletListWithType");
    }

    public static final Unit OLrzqt(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            arrayList.add(new JsBridgeWalletBean(abstractC12782ctV.DbNXlk(), abstractC12782ctV.getNewProxyInstance()));
        }
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(arrayList));
        return Unit.INSTANCE;
    }
}
