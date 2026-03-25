package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.okinc.business.defi.dapp.net.checkTxStatus;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsResponse;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.dGQ;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13381dJf implements dGQ.Activity {
    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ;
    public final java.util.HashMap<java.lang.String, InterfaceC58217yxC> EZpvd;
    public InterfaceC58217yxC KWHzl;
    public long OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final WeakReference<C13241dEa> gEmmrt;
    public final java.util.HashMap<java.lang.String, java.lang.String> valueOf;

    public C13381dJf(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.gEmmrt = weakReference;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13381dJf.EZpvd();
            }
        });
        this.valueOf = new java.util.HashMap<>();
        this.AEQbTJ = new java.util.HashMap<>();
        this.EZpvd = new java.util.HashMap<>();
    }

    public final C15059dxF KWHzl() {
        return (C15059dxF) this.copydefault.getValue();
    }

    public static final C15059dxF EZpvd() {
        return new C15059dxF();
    }

    public final void KWHzl(final java.lang.String str, java.lang.String str2, final android.webkit.WebView webView, final java.lang.String str3) {
        InterfaceC9738bbJ interfaceC9738bbJValues;
        C13241dEa c13241dEa;
        WeakReference<FragmentActivity> weakReferenceFetchVPNInfo;
        FragmentActivity fragmentActivity;
        WeakReference<dES> weakReferenceAKErDB;
        dES des;
        C13241dEa c13241dEa2 = this.gEmmrt.get();
        DappTabData dappTabDataUzCIH = null;
        if (c13241dEa2 != null && (interfaceC9738bbJValues = c13241dEa2.values()) != null && interfaceC9738bbJValues.getFieldNames()) {
            this.OLrzqt = java.lang.System.currentTimeMillis();
            this.AEQbTJ.put(str, str2);
            copydefault(str, str3, new Function1() { // from class: o.dJe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13381dJf.copydefault(this.copydefault, str, webView, (java.lang.String) obj);
                }
            });
            if (this.KWHzl != null || (c13241dEa = this.gEmmrt.get()) == null || (weakReferenceFetchVPNInfo = c13241dEa.fetchVPNInfo()) == null || (fragmentActivity = weakReferenceFetchVPNInfo.get()) == null) {
                return;
            }
            InterfaceC9859bdY interfaceC9859bdY = (InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class);
            C13241dEa c13241dEa3 = this.gEmmrt.get();
            if (c13241dEa3 != null && (weakReferenceAKErDB = c13241dEa3.aKErDB()) != null && (des = weakReferenceAKErDB.get()) != null) {
                dappTabDataUzCIH = des.uzCIH();
            }
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(interfaceC9859bdY.gEmmrt(java.lang.String.valueOf(dappTabDataUzCIH)), fragmentActivity, Lifecycle.Event.ON_DESTROY);
            final Function1 function1 = new Function1() { // from class: o.dJh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13381dJf.KWHzl(this.OLrzqt, webView, str3, (C9921beh) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dJo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13381dJf.AYXKKw(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dJp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13381dJf.copydefault((java.lang.Throwable) obj);
                }
            };
            this.KWHzl = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dJr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13381dJf.gEmmrt(function12, obj);
                }
            });
            return;
        }
        webView.evaluateJavascript("window.okxwallet.sendResponse(" + str2 + ",\"" + str + "\")", null);
    }

    public static final Unit copydefault(C13381dJf c13381dJf, java.lang.String str, android.webkit.WebView webView, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        webView.evaluateJavascript("window.okxwallet.sendResponse(" + c13381dJf.AEQbTJ.get(str) + ",\"" + str2 + "\")", null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C13381dJf c13381dJf, android.webkit.WebView webView, java.lang.String str, C9921beh c9921beh) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c9921beh.copydefault())) {
            java.lang.String str2 = c13381dJf.AEQbTJ.get(c9921beh.OLrzqt());
            c13381dJf.valueOf.put(c9921beh.OLrzqt(), c9921beh.copydefault());
            if (str2 != null) {
                webView.evaluateJavascript("window.okxwallet.sendResponse(" + str2 + ",\"" + c9921beh.copydefault() + "\")", null);
                c13381dJf.OLrzqt(c9921beh.OLrzqt());
                c13381dJf.copydefault("1", str, c9921beh.OLrzqt(), c9921beh.copydefault(), "");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.remove(str);
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd.get(str);
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.EZpvd.remove(str);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        dGQ dgqRcXXUw;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa == null || (dgqRcXXUw = c13241dEa.RcXXUw()) == null || (interfaceC9738bbJValueOf = dgqRcXXUw.valueOf()) == null) {
            return;
        }
        C15151dys.copydefault(str2, str4, str3, interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(str2)), str5, C33129mqd.gEmmrt(java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.OLrzqt) / ((long) 1000))), "2", str);
    }

    public final void copydefault(final java.lang.String str, final java.lang.String str2, final Function1<? super java.lang.String, Unit> function1) {
        WeakReference<FragmentActivity> weakReferenceFetchVPNInfo;
        FragmentActivity fragmentActivity;
        dGQ dgqRcXXUw;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null && (dgqRcXXUw = c13241dEa.RcXXUw()) != null && (interfaceC9738bbJValueOf = dgqRcXXUw.valueOf()) != null) {
            C15151dys.copydefault(str2, str, interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(str2)));
        }
        C13241dEa c13241dEa2 = this.gEmmrt.get();
        if (c13241dEa2 == null || (weakReferenceFetchVPNInfo = c13241dEa2.fetchVPNInfo()) == null || (fragmentActivity = weakReferenceFetchVPNInfo.get()) == null) {
            return;
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C48787ucK.AEQbTJ.OLrzqt("dappAAWallet.aaGetTxHash", 30L), java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.dJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13381dJf.KWHzl(atomicInteger, (java.lang.Long) obj);
            }
        };
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.dJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13381dJf.djBIcL(function12, obj);
            }
        }).KWHzl(new InterfaceC58222yxH() { // from class: o.dJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13381dJf.AEQbTJ(this.KWHzl, str, atomicInteger, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl2, fragmentActivity, Lifecycle.Event.ON_DESTROY);
        final Function1 function13 = new Function1() { // from class: o.dJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13381dJf.copydefault(this.OLrzqt, str2, str, (java.lang.Long) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.dJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13381dJf.valueOf(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13381dJf.EZpvd(this.EZpvd, str, function1, str2, atomicInteger, (checkTxStatus) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13381dJf.AkhnZx(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.dJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13381dJf.KWHzl((java.lang.Throwable) obj);
            }
        };
        this.EZpvd.put(str, abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13381dJf.fetchVPNInfo(function15, obj);
            }
        }));
    }

    public static final Unit KWHzl(AtomicInteger atomicInteger, java.lang.Long l) {
        atomicInteger.incrementAndGet();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AEQbTJ(C13381dJf c13381dJf, java.lang.String str, AtomicInteger atomicInteger, java.lang.String str2) {
        C13241dEa c13241dEa;
        dGQ dgqRcXXUw;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        if (!c13381dJf.EZpvd.containsKey(str) && (c13241dEa = c13381dJf.gEmmrt.get()) != null && (dgqRcXXUw = c13241dEa.RcXXUw()) != null && (interfaceC9738bbJValueOf = dgqRcXXUw.valueOf()) != null) {
            C15151dys.dappUopEndLoopReport$default(str2, "", str, interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(str2)), C33129mqd.gEmmrt(java.lang.Integer.valueOf(atomicInteger.get())), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c13381dJf.OLrzqt)), "1", null, 128, null);
        }
        atomicInteger.set(0);
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C13381dJf c13381dJf, java.lang.String str, java.lang.String str2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return C43423rox.unwrapResponseData$default(c13381dJf.KWHzl().OLrzqt(str, "", str2), (Function1) null, 1, (java.lang.Object) null);
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C13381dJf c13381dJf, java.lang.String str, Function1 function1, java.lang.String str2, AtomicInteger atomicInteger, checkTxStatus checktxstatus) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) checktxstatus.getTxHash())) {
            java.lang.String txHash = checktxstatus.getTxHash();
            if (txHash != null) {
                function1.invoke(txHash);
                c13381dJf.valueOf.put(str, txHash);
                c13381dJf.copydefault("2", str2, str, txHash, C33129mqd.gEmmrt(java.lang.Integer.valueOf(atomicInteger.get())));
            }
            c13381dJf.OLrzqt(str);
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.dGQ.Activity
    public void copydefault(android.os.Bundle bundle, long j) {
        java.lang.String string;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            java.lang.String str = "";
            if (bundle != null && (string = bundle.getString("data", "")) != null) {
                str = string;
            }
            KWHzl(str, c13241dEa.dNCPSb(), c13241dEa, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ea, code lost:
    
        if (r3.equals("klay_signTransaction") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f3, code lost:
    
        if (r3.equals("kaia_signTransaction") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f6, code lost:
    
        r14 = new java.util.HashMap();
        r13 = r13.getString("tx_sign");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ff, code lost:
    
        if (r13 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0301, code lost:
    
        r14.put("raw", com.reown.android.internal.common.signing.eip1271.EIP1271Verifier.hexPrefix + r13);
        r13 = new com.google.gson.Gson().toJson(r14);
        r0.evaluateJavascript("window.okxwallet.sendResponse(\"" + r0.dNCPSb() + "\"," + r13 + ")", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return;
     */
    @Override // o.dGQ.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(android.os.Bundle bundle, long j) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String str2;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            str = "";
            if (bundle == null || (string = bundle.getString("data", "")) == null) {
                string = "";
            }
            if (c13241dEa.AkhnZx() == 3) {
                if (Intrinsics.EZpvd((java.lang.Object) "signTransaction", (java.lang.Object) (bundle != null ? bundle.getString(FirebaseAnalytics.Param.METHOD) : null))) {
                    java.lang.String string4 = bundle != null ? bundle.getString("tx_sign") : null;
                    if (string4 != null && C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string4).toString(), "{", false, 2, null)) {
                        str2 = "window.aptos.sendResponse(" + c13241dEa.dNCPSb() + ", " + string4 + ");";
                    } else {
                        java.lang.String strQuote = JSONObject.quote(string4);
                        str2 = "window.aptos.sendResponse(" + c13241dEa.dNCPSb() + ", " + strQuote + ");";
                    }
                    c13241dEa.evaluateJavascript(str2, null);
                    return;
                }
                java.lang.String string5 = bundle != null ? bundle.getString("tx") : null;
                if (string5 == null) {
                    string5 = bundle != null ? bundle.getString("tx_hash") : null;
                }
                c13241dEa.evaluateJavascript("window.aptos.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string5 + "\")", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 4) {
                if (Intrinsics.EZpvd((java.lang.Object) (bundle != null ? bundle.getString("eventName") : null), (java.lang.Object) "signTransactionBlock")) {
                    java.util.HashMap map = new java.util.HashMap();
                    java.lang.String string6 = bundle != null ? bundle.getString("tx_bytes") : null;
                    java.lang.String string7 = bundle != null ? bundle.getString("signature") : null;
                    if (string7 == null) {
                        string7 = "";
                    }
                    map.put("signature", string7);
                    map.put("transactionBlockBytes", string6 != null ? string6 : "");
                    java.lang.String json = new Gson().toJson(map);
                    C13284dFq c13284dFqQfsBiF = c13241dEa.QfsBiF();
                    java.lang.String strAhwBna = c13284dFqQfsBiF != null ? c13284dFqQfsBiF.AhwBna() : null;
                    c13241dEa.evaluateJavascript(strAhwBna + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json + "')", null);
                    return;
                }
                java.util.HashMap map2 = new java.util.HashMap();
                java.lang.String string8 = bundle != null ? bundle.getString("tx_hash") : null;
                JSONObject jSONObject = new JSONObject(bundle != null ? bundle.getString("tx_sign") : null);
                java.lang.String string9 = jSONObject.has("tx_bytes") ? jSONObject.getString("tx_bytes") : "";
                map2.put("confirmedLocalExecution", "false");
                map2.put("digest", string8 != null ? string8 : "");
                map2.put("txBytes", string9);
                java.lang.String json2 = new Gson().toJson(map2);
                C13284dFq c13284dFqQfsBiF2 = c13241dEa.QfsBiF();
                java.lang.String strAhwBna2 = c13284dFqQfsBiF2 != null ? c13284dFqQfsBiF2.AhwBna() : null;
                c13241dEa.evaluateJavascript(strAhwBna2 + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json2 + "')", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 5) {
                if (bundle != null && (string3 = bundle.getString("txHash", "")) != null) {
                    str = string3;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    c13241dEa.evaluateJavascript("window.keplr.sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + str + "')", null);
                    return;
                }
                c13241dEa.evaluateJavascript("window.keplr.sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + string + "')", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 6) {
                if (bundle != null && (string2 = bundle.getString("tx_hash", "")) != null) {
                    str = string2;
                }
                c13241dEa.evaluateJavascript("window.starknet.sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + str + "')", null);
                return;
            }
            java.lang.String string10 = bundle != null ? bundle.getString(FirebaseAnalytics.Param.METHOD) : null;
            if (string10 != null) {
                int iHashCode = string10.hashCode();
                if (iHashCode != -853054576) {
                    if (iHashCode != 248995323) {
                        if (iHashCode == 523811636 && string10.equals("walletSendCalls")) {
                            java.lang.String string11 = bundle.getString("tx_send_calls_id", "");
                            str = string11 != null ? string11 : "";
                            if (str.length() != 0) {
                                java.util.HashMap map3 = new java.util.HashMap();
                                map3.put("id", str);
                                java.lang.String json3 = new Gson().toJson(map3);
                                c13241dEa.evaluateJavascript("window.okxwallet.sendResponse(\"" + c13241dEa.dNCPSb() + "\"," + json3 + ")", null);
                                return;
                            }
                            c13241dEa.evaluateJavascript("window.okxwallet.sendError(\"" + c13241dEa.dNCPSb() + "\")", null);
                            return;
                        }
                    }
                }
            }
            KWHzl(string, c13241dEa.dNCPSb(), c13241dEa, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
        }
    }

    @Override // o.dGQ.Activity
    public void OLrzqt(android.os.Bundle bundle, long j) {
        java.lang.String string;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            java.lang.String str = "";
            if (bundle != null && (string = bundle.getString("data", "")) != null) {
                str = string;
            }
            KWHzl(str, c13241dEa.dNCPSb(), c13241dEa, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
        }
    }

    @Override // o.dGQ.Activity
    public void AEQbTJ(android.os.Bundle bundle, long j) throws JSONException {
        java.lang.String string;
        java.lang.String string2;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            java.lang.String str = "";
            if (bundle == null || (string = bundle.getString("data", "")) == null) {
                string = "";
            }
            if (c13241dEa.AkhnZx() == 3) {
                c13241dEa.evaluateJavascript("window.aptos.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string + "\")", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 6) {
                c13241dEa.evaluateJavascript(C59442zhC.fJNWhG("\n                      window.starknet.sendResponse(" + c13241dEa.dNCPSb() + ", `" + string + "`);\n                        "), null);
                return;
            }
            if (c13241dEa.AkhnZx() == 4) {
                java.util.HashMap map = new java.util.HashMap();
                if (bundle != null && (string2 = bundle.getString("messageBytes", "")) != null) {
                    str = string2;
                }
                map.put("messageBytes", str);
                map.put("signature", string);
                java.lang.String json = new Gson().toJson(map);
                C13284dFq c13284dFqQfsBiF = c13241dEa.QfsBiF();
                java.lang.String strAhwBna = c13284dFqQfsBiF != null ? c13284dFqQfsBiF.AhwBna() : null;
                c13241dEa.evaluateJavascript(strAhwBna + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json + "')", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 5) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("signature", new JSONObject(string));
                c13241dEa.evaluateJavascript("window.keplr.sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + jSONObject + "')", null);
                return;
            }
            c13241dEa.evaluateJavascript("window.okxwallet.sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string + "\")", null);
        }
    }

    @Override // o.dGQ.Activity
    public void copydefault(@NotNull java.lang.Object obj, RequestWalletsResponse requestWalletsResponse) {
        Intrinsics.checkNotNullParameter(obj, "");
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            java.lang.String json = new Gson().toJson(requestWalletsResponse);
            Intrinsics.copydefault((java.lang.Object) json);
            c13241dEa.evaluateJavascript("window.okxwallet.sendResponse(" + obj + ", " + C33490mxT.OLrzqt(json) + ")", null);
        }
    }

    @Override // o.dGQ.Activity
    public void KWHzl(android.os.Bundle bundle) {
        android.content.Context context;
        android.content.Context context2;
        android.content.Context context3;
        android.content.Context context4;
        android.content.Context context5;
        C13241dEa c13241dEa = this.gEmmrt.get();
        if (c13241dEa != null) {
            if (c13241dEa.AkhnZx() == 3) {
                java.lang.String strDNCPSb = c13241dEa.dNCPSb();
                C13241dEa c13241dEa2 = this.gEmmrt.get();
                c13241dEa.evaluateJavascript("window.aptos.sendError(" + strDNCPSb + ",\"" + ((c13241dEa2 == null || (context5 = c13241dEa2.getContext()) == null) ? null : context5.getString(dLX.Dialog.AxsJAY)) + "\")", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 4) {
                C13284dFq c13284dFqQfsBiF = c13241dEa.QfsBiF();
                java.lang.String strAhwBna = c13284dFqQfsBiF != null ? c13284dFqQfsBiF.AhwBna() : null;
                java.lang.String strDNCPSb2 = c13241dEa.dNCPSb();
                C13241dEa c13241dEa3 = this.gEmmrt.get();
                c13241dEa.evaluateJavascript(strAhwBna + ".sendError(\"" + strDNCPSb2 + "\",\"" + ((c13241dEa3 == null || (context4 = c13241dEa3.getContext()) == null) ? null : context4.getString(dLX.Dialog.AxsJAY)) + "\", -4005)", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 5) {
                java.lang.String strDNCPSb3 = c13241dEa.dNCPSb();
                C13241dEa c13241dEa4 = this.gEmmrt.get();
                c13241dEa.evaluateJavascript("window.keplr.sendError(" + strDNCPSb3 + ",\"" + ((c13241dEa4 == null || (context3 = c13241dEa4.getContext()) == null) ? null : context3.getString(dLX.Dialog.AxsJAY)) + "\")", null);
                return;
            }
            if (c13241dEa.AkhnZx() == 6) {
                java.lang.String strDNCPSb4 = c13241dEa.dNCPSb();
                C13241dEa c13241dEa5 = this.gEmmrt.get();
                c13241dEa.evaluateJavascript("window.starknet.sendError(" + strDNCPSb4 + ",\"" + ((c13241dEa5 == null || (context2 = c13241dEa5.getContext()) == null) ? null : context2.getString(dLX.Dialog.AxsJAY)) + "\")", null);
                return;
            }
            java.lang.String strDNCPSb5 = c13241dEa.dNCPSb();
            C13241dEa c13241dEa6 = this.gEmmrt.get();
            c13241dEa.evaluateJavascript("window.okxwallet.sendError(" + strDNCPSb5 + ",\"" + ((c13241dEa6 == null || (context = c13241dEa6.getContext()) == null) ? null : context.getString(dLX.Dialog.AxsJAY)) + "\", 4001)", null);
        }
    }
}
