package o;

import android.view.View;
import com.okinc.business.defi.dapp.net.OKDapp;
import com.okinc.business.defi.dapp.webview.DappWalletUtils$nftMarketIsSupportAA$nftHidden$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.dapp.bean.DappChains;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.InterfaceC43294rma;
import o.InterfaceC9738bbJ;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dDW {
    public static final dDW copydefault = new dDW();

    private dDW() {
    }

    public final OKDapp OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<OKDapp> listKWHzl = C15157dyy.EZpvd.KWHzl();
        java.lang.Object obj = null;
        if (listKWHzl == null) {
            return null;
        }
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((OKDapp) next).getDappId(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (OKDapp) obj;
    }

    public final void KWHzl(@NotNull final android.app.Activity activity, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.Object obj = null;
        boolean zBooleanValue = ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DappWalletUtils$nftMarketIsSupportAA$nftHidden$1(null), 1, null)).booleanValue();
        java.util.Iterator<T> it = C15157dyy.EZpvd.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((DappChains) next).getChainId() == C33129mqd.valueOf(l)) {
                obj = next;
                break;
            }
        }
        if (obj != null && !zBooleanValue) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(dLX.Dialog.fvQaOB));
            viewOnClickListenerC54939xaY.OLrzqt(dLX.Dialog.copydefault, new View.OnClickListener() { // from class: o.dDT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    dDW.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.EZpvd(dLX.Dialog.UeEOUB, new View.OnClickListener() { // from class: o.dDX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    dDW.copydefault(activity, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY2.EZpvd(C33070mpX.AYXKKw(dLX.Dialog.gasjUx));
        viewOnClickListenerC54939xaY2.EZpvd(dLX.Dialog.hDKMBd, new View.OnClickListener() { // from class: o.dDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dDW.EZpvd(viewOnClickListenerC54939xaY2, view);
            }
        });
        viewOnClickListenerC54939xaY2.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(android.app.Activity activity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, "metaX/nft/featured", null, new Function1() { // from class: o.dDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dDW.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, long j) {
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJ, j, null, 2, null);
        java.lang.Integer numValueOf = interfaceC9780bbzAddressFromRealChainId$default != null ? java.lang.Integer.valueOf(interfaceC9780bbzAddressFromRealChainId$default.getAddressType()) : null;
        java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(str);
        try {
            Result.Application application = Result.Companion;
            int value = AddressType.P2TRType.getValue();
            if (numValueOf != null && numValueOf.intValue() == value) {
                strSubstring = strEZpvd.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                strSubstring = strEZpvd;
            }
        } catch (java.lang.Throwable th) {
            th = th;
            strSubstring = strEZpvd;
        }
        try {
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            th = th2;
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            mapDjBIcL.put("publicKey", strSubstring);
            mapDjBIcL.put("compressedPublicKey", strEZpvd);
            mapDjBIcL.put("addressType", C33129mqd.gEmmrt(numValueOf));
            mapDjBIcL.put("walletType", C33129mqd.gEmmrt(java.lang.Integer.valueOf(interfaceC9738bbJ.getNewProxyInstance())));
        }
        return mapDjBIcL;
    }
}
