package o;

import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.dEZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13399dJx implements dEZ.Application {
    public final WeakReference<C13241dEa> AEQbTJ;

    public C13399dJx(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    @Override // o.dEZ.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(8);
            c13241dEa.evaluateJavascript("window.nostr.sendError(" + c13241dEa.dNCPSb() + ",\"" + str2 + "\")", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [37=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.dEZ.Application
    public void copydefault(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str2);
            c13241dEa.setWeb3JsIdSign(str);
            switch (str2.hashCode()) {
                case -2100878188:
                    if (str2.equals("nip04decrypt")) {
                        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd("Web3WalletDecrypt_NostrDecrypt_Button_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dJy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C13399dJx.AYXKKw((EventParamsList) obj);
                            }
                        });
                        java.lang.String string = bundle.getString("data");
                        if (string != null) {
                            c13241dEa.evaluateJavascript("window.nostr.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string + "\")", null);
                        }
                        break;
                    }
                    break;
                case -955712148:
                    if (str2.equals("nip04encrypt")) {
                        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd("Web3WalletEncrypt_NostrEncrypt_Button_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dJB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C13399dJx.AhwBna((EventParamsList) obj);
                            }
                        });
                        java.lang.String string2 = bundle.getString("data");
                        if (string2 != null) {
                            c13241dEa.evaluateJavascript("window.nostr.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string2 + "\")", null);
                        }
                        break;
                    }
                    break;
                case 1047769821:
                    if (str2.equals("signEvent")) {
                        TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd("Web3WalletSign_SignDapp_Button_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dJA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C13399dJx.valueOf((EventParamsList) obj);
                            }
                        });
                        java.lang.String string3 = bundle.getString("data");
                        if (string3 != null) {
                            c13241dEa.evaluateJavascript("window.nostr.sendResponse(" + c13241dEa.dNCPSb() + "," + string3 + ")", null);
                        }
                        break;
                    }
                    break;
                case 1437294720:
                    if (str2.equals("getPublicKey")) {
                        TrackChannel[] trackChannelArrCopydefault4 = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd("Web3WalletDappConnection_ConnectDapp_Button_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault4, trackChannelArrCopydefault4.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dJz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C13399dJx.OLrzqt((EventParamsList) obj);
                            }
                        });
                        java.lang.String string4 = bundle.getString("publicKey");
                        c13241dEa.evaluateJavascript("window.nostr.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string4 + "\")", null);
                        break;
                    }
                    break;
            }
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        C13241dEa mWebView;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        eventParamsList.put("dapp_url", java.lang.String.valueOf((dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) ? null : mWebView.getOriginalUrl()), false);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        C13241dEa mWebView;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        eventParamsList.put("dapp_url", java.lang.String.valueOf((dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) ? null : mWebView.getOriginalUrl()), false);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        C13241dEa mWebView;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        eventParamsList.put("dapp_url", java.lang.String.valueOf((dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) ? null : mWebView.getOriginalUrl()), false);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        C13241dEa mWebView;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        eventParamsList.put("dapp_url", java.lang.String.valueOf((dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) ? null : mWebView.getOriginalUrl()), false);
        return Unit.INSTANCE;
    }

    @Override // o.dEZ.Application
    public void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(8);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(1237L, str, interfaceC9738bbJ, false);
            }
        }
    }
}
