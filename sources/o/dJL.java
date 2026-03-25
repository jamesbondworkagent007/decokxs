package o;

import com.okinc.business.defi.dapp.webview.okxconnect.Address;
import com.okinc.business.defi.dapp.webview.okxconnect.Namespace;
import com.okinc.business.defi.dapp.webview.okxconnect.OKXConnectManager$getAddressFromCaipChainId$generalChainId$1;
import com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsParams;
import com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.InterfaceC9737bbI;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dJL {
    public static final dJL OLrzqt = new dJL();

    private dJL() {
    }

    public final RequestWalletsResponse copydefault(@NotNull final InterfaceC9738bbJ interfaceC9738bbJ, RequestWalletsParams requestWalletsParams) {
        java.util.List<Namespace> optionalNamespaces;
        java.util.List<Namespace> requiredNamespaces;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        RequestWalletsResponse requestWalletsResponse = new RequestWalletsResponse(interfaceC9738bbJ.AYXKKw(), interfaceC9738bbJ.getNewProxyInstance(), arrayList);
        Function1 function1 = new Function1() { // from class: o.dJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dJL.OLrzqt(interfaceC9738bbJ, (Namespace) obj);
            }
        };
        if (requestWalletsParams != null && (requiredNamespaces = requestWalletsParams.getRequiredNamespaces()) != null) {
            java.util.Iterator<T> it = requiredNamespaces.iterator();
            while (it.hasNext()) {
                arrayList.addAll((java.util.Collection) function1.invoke((Namespace) it.next()));
            }
        }
        if (requestWalletsParams != null && (optionalNamespaces = requestWalletsParams.getOptionalNamespaces()) != null) {
            java.util.Iterator<T> it2 = optionalNamespaces.iterator();
            while (it2.hasNext()) {
                arrayList.addAll((java.util.Collection) function1.invoke((Namespace) it2.next()));
            }
        }
        return requestWalletsResponse;
    }

    public static final java.util.List OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, Namespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = namespace.getChains().iterator();
        while (it.hasNext()) {
            Address addressEZpvd = OLrzqt.EZpvd(namespace.getNamespace(), (java.lang.String) it.next(), interfaceC9738bbJ);
            if (addressEZpvd != null) {
                arrayList.add(addressEZpvd);
            }
        }
        return arrayList;
    }

    public final Address EZpvd(java.lang.String str, java.lang.String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strDjBIcL;
        java.lang.String strOLrzqt;
        java.lang.String str3 = (java.lang.String) BuildersKt__BuildersKt.runBlocking$default(null, new OKXConnectManager$getAddressFromCaipChainId$generalChainId$1(str2, null), 1, null);
        if (str3 == null) {
            return null;
        }
        java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str3));
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(str3);
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(str3), false, 2, null);
        if (chainMetaWithRealChainId$default == null || (strDjBIcL = chainMetaWithRealChainId$default.djBIcL()) == null) {
            strDjBIcL = "";
        }
        java.lang.String str4 = strDjBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "btc")) {
            strOLrzqt = interfaceC9738bbJ.EZpvd(interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str3)));
        } else {
            strOLrzqt = interfaceC9738bbJ.OLrzqt(C33129mqd.valueOf(str3));
        }
        java.lang.String str5 = strOLrzqt;
        InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJ, C33129mqd.valueOf(str3), null, 2, null);
        return new Address(strEZpvd, strGEmmrt, str4, str2, str5, null, C33129mqd.gEmmrt(interfaceC9780bbzAddressFromRealChainId$default != null ? java.lang.Integer.valueOf(interfaceC9780bbzAddressFromRealChainId$default.getAddressType()) : null), 32, null);
    }
}
