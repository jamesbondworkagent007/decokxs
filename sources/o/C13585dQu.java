package o;

import com.okinc.business.defi.jsbridge.MessageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dQu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13585dQu extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        MessageData messageData;
        java.lang.Long genernalChainId;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        try {
            java.lang.String str = message.data;
            Intrinsics.checkNotNullExpressionValue(str, "");
            messageData = (MessageData) C33490mxT.EZpvd(str, MessageData.class);
        } catch (java.lang.Exception unused) {
        }
        long jLongValue = (messageData == null || (genernalChainId = messageData.getGenernalChainId()) == null) ? -1L : genernalChainId.longValue();
        final long j = jLongValue;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        C11607cUn.OLrzqt(C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), true, false, false, 4, null), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13585dQu.EZpvd(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13585dQu.EZpvd(j, arrayList, interfaceC57336ygW, message, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.OLrzqt(message, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(long j, java.util.List list, InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            if (abstractC12782ctV.KWHzl(java.lang.Long.valueOf(j))) {
                list.add(abstractC12782ctV.DbNXlk());
            }
        }
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(list));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("getSupportedNetworkWalletList", "web3/wallet/js/getSupportedNetworkWalletList");
    }
}
