package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NostrSignType;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappTabData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dEZ extends dAX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final java.lang.String AYXKKw;
    public Application AhwBna;
    public boolean djBIcL;

    public interface Application {
        void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

        void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ);

        void copydefault(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dEZ(@NotNull WeakReference<FragmentActivity> weakReference, Application application, @NotNull WeakReference<dES> weakReference2) {
        super(8, weakReference, weakReference2);
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.AhwBna = application;
        this.AYXKKw = dEZ.class.getName();
        this.djBIcL = true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dEZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            EZpvd(new Function1() { // from class: o.dEY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dEZ.OLrzqt(this.OLrzqt, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "NostrWebAppInterface", e);
        }
    }

    public static final Unit OLrzqt(dEZ dez, java.lang.String str, java.lang.String str2) throws JSONException {
        dez.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "");
        C33495mxY.KWHzl(this.AYXKKw, str);
        JSONObject jSONObject = new JSONObject(str);
        java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has("object")) {
            if (jSONObject.get("object") instanceof JSONObject) {
                java.lang.Object obj2 = jSONObject.get("object");
                Intrinsics.copydefault(obj2, "");
                jSONObject2 = (JSONObject) obj2;
            } else if (jSONObject.get("object") instanceof java.lang.String) {
                java.lang.Object obj3 = jSONObject.get("object");
                Intrinsics.copydefault(obj3, "");
                jSONObject2 = new JSONObject((java.lang.String) obj3);
            }
        }
        java.lang.Object obj4 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "getPublicKey")) {
            KWHzl(1237L, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj)));
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "signEvent")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject2, "signEvent");
        } else if (Intrinsics.EZpvd(obj4, (java.lang.Object) "nip04encrypt")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject2, "nip04encrypt");
        } else if (Intrinsics.EZpvd(obj4, (java.lang.Object) "nip04decrypt")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject2, "nip04decrypt");
        }
    }

    public final void EZpvd(final java.lang.Object obj, java.lang.Object obj2, final java.lang.String str) {
        java.lang.String strDbNXlk;
        NostrSignType nostrSignType;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt == null || (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            java.lang.String str2 = strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(1237L);
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String string = obj2.toString();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "signEvent")) {
                nostrSignType = NostrSignType.MESSAGE;
            } else {
                nostrSignType = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "nip04encrypt") ? NostrSignType.ENCRYPT : NostrSignType.DECRYPT;
            }
            dFN.startSignDappWithReport$default(str, fragmentActivity, new DappSignArgs(str2, strGEmmrt, platformItemAEQbTJ, string, null, false, 2, "dapp", null, null, false, false, null, null, null, null, null, null, false, nostrSignType, null, null, 3669808, null), new Function1() { // from class: o.dFa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return dEZ.KWHzl(this.EZpvd, obj, str, (android.os.Bundle) obj3);
                }
            }, null, 16, null);
        }
    }

    public static final Unit KWHzl(dEZ dez, java.lang.Object obj, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            Application application = dez.AhwBna;
            if (application != null) {
                application.KWHzl(C33129mqd.gEmmrt(obj), C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), str);
            }
        } else {
            Application application2 = dez.AhwBna;
            if (application2 != null) {
                application2.copydefault(C33129mqd.gEmmrt(obj), bundle, str);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.dAX
    public void EZpvd(final InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, final java.util.HashMap<java.lang.String, java.lang.Object> map) {
        final java.lang.Object obj = map != null ? map.get("id") : null;
        if (interfaceC9738bbJ == null || l == null || l.longValue() != 1237) {
            KWHzl(java.lang.String.valueOf(obj), "", "getPublicKey");
            return;
        }
        if (this.djBIcL) {
            this.djBIcL = false;
            FragmentActivity fragmentActivity = EZpvd().get();
            if (fragmentActivity != null) {
                ((InterfaceC9849bdO) C43248rlh.KWHzl.AEQbTJ(InterfaceC9849bdO.class)).AEQbTJ(fragmentActivity, new Function1() { // from class: o.dEX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dEZ.AEQbTJ(this.EZpvd, interfaceC9738bbJ, obj, map, (kotlin.Pair) obj2);
                    }
                });
            }
        }
    }

    public static final Unit AEQbTJ(final dEZ dez, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Object obj, final java.util.HashMap map, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        dez.djBIcL = true;
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            dez.EZpvd(interfaceC9738bbJ);
            dez.copydefault(java.lang.String.valueOf(obj), interfaceC9738bbJ);
        } else if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            dES des = dez.copydefault().get();
            if (des != null) {
                des.AEQbTJ(1237L, new Function2() { // from class: o.dEW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return dEZ.AEQbTJ(this.EZpvd, map, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3);
                    }
                });
            }
        } else {
            dez.KWHzl(java.lang.String.valueOf(obj), "", "getPublicKey");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dEZ dez, java.util.HashMap map, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        dez.EZpvd(interfaceC9738bbJ, l, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null) {
            dappTabDataOLrzqt.setConnectedByWalletConnect(false);
        }
        java.lang.String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(1237L) : null;
        java.lang.String str2 = strEZpvd != null ? strEZpvd : "";
        Application application = this.AhwBna;
        if (application != null) {
            application.KWHzl(str2, interfaceC9738bbJ);
        }
        if (interfaceC9738bbJ != null) {
            java.lang.String strOLrzqt = interfaceC9738bbJ.OLrzqt(1237L);
            Application application2 = this.AhwBna;
            if (application2 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("publicKey", strOLrzqt);
                Unit unit = Unit.INSTANCE;
                application2.copydefault(str, bundle, "getPublicKey");
            }
        }
    }

    public static /* synthetic */ void notifySendError$default(dEZ dez, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        dez.KWHzl(str, str2, str3);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Application application = this.AhwBna;
        if (application != null) {
            application.KWHzl(str, str2, str3);
        }
    }
}
