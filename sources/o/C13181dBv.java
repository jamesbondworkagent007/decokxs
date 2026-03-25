package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.BTCNFTInfo;
import com.okinc.business.defi.api.bean.BtcNftData;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9737bbI;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13181dBv extends dAX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public long AYXKKw;
    public final java.lang.String AhwBna;
    public boolean gEmmrt;
    public TaskDescription valueOf;

    /* JADX INFO: renamed from: o.dBv$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, boolean z);

        void EZpvd(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str2, long j, boolean z);

        void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, long j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13181dBv(@NotNull WeakReference<FragmentActivity> weakReference, TaskDescription taskDescription, @NotNull WeakReference<dES> weakReference2) {
        super(7, weakReference, weakReference2);
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.valueOf = taskDescription;
        this.AhwBna = C13181dBv.class.getSimpleName();
    }

    /* JADX INFO: renamed from: o.dBv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dBv.ActionBar.<init>():void type: THIS */
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
            EZpvd(new Function1() { // from class: o.dBu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13181dBv.KWHzl(this.AEQbTJ, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "BtcWebAppInterface", e);
        }
    }

    public static final Unit KWHzl(C13181dBv c13181dBv, java.lang.String str, java.lang.String str2) throws JSONException {
        c13181dBv.KWHzl(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0284 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void KWHzl(@NotNull java.lang.String str) throws JSONException {
        int i;
        java.lang.String strReplace$default;
        InterfaceC9742bbN interfaceC9742bbNAEQbTJ;
        java.lang.String strEZpvd;
        java.lang.Object objOpt;
        Intrinsics.checkNotNullParameter(str, "");
        C33495mxY.KWHzl(this.AhwBna, str);
        JSONObject jSONObject = new JSONObject(str);
        java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        if (jSONObject.has("chainId")) {
            this.AYXKKw = C33129mqd.valueOf(jSONObject.get("chainId"));
        }
        if (jSONObject.has("isUnisat")) {
            java.lang.Object obj2 = jSONObject.get("isUnisat");
            Intrinsics.copydefault(obj2, "");
            this.gEmmrt = ((java.lang.Boolean) obj2).booleanValue();
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has("object")) {
            if (jSONObject.get("object") instanceof JSONObject) {
                java.lang.Object obj3 = jSONObject.get("object");
                Intrinsics.copydefault(obj3, "");
                jSONObject2 = (JSONObject) obj3;
            } else if (jSONObject.get("object") instanceof java.lang.String) {
                java.lang.Object obj4 = jSONObject.get("object");
                Intrinsics.copydefault(obj4, "");
                jSONObject2 = new JSONObject((java.lang.String) obj4);
            }
        }
        java.lang.Object obj5 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "requestAccounts")) {
            KWHzl(this.AYXKKw, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj)));
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "send")) {
            Intrinsics.copydefault(obj);
            OLrzqt(obj, jSONObject2, "send");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "sendBitcoin")) {
            Intrinsics.copydefault(obj);
            OLrzqt(obj, jSONObject2, "sendBitcoin");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signPsbt")) {
            Intrinsics.copydefault(obj);
            AEQbTJ(obj, jSONObject2, "signPsbt");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signMessage")) {
            Intrinsics.copydefault(obj);
            AEQbTJ(obj, jSONObject2, "signMessage");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "getBalance")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signPsbts")) {
            Intrinsics.copydefault(obj);
            AEQbTJ(obj, jSONObject2, "signPsbts");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "sendInscription")) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(jSONObject2.opt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS));
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(jSONObject2.opt("inscriptionId"));
            JSONObject jSONObject3 = (JSONObject) jSONObject2.opt("options");
            java.lang.String strGEmmrt3 = (jSONObject3 == null || (objOpt = jSONObject3.opt("feeRate")) == null) ? null : C33129mqd.gEmmrt(objOpt);
            BtcNftData btcNftData = new BtcNftData((java.lang.String) null, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            btcNftData.setTo(strGEmmrt);
            if (C59449zhJ.endsWith$default(strGEmmrt2, "-Atomicals", false, 2, null)) {
                strReplace$default = C59449zhJ.replace$default(strGEmmrt2, "-Atomicals", "", false, 4, (java.lang.Object) null);
                i = 8;
            } else {
                i = 7;
                if (C59449zhJ.endsWith$default(strGEmmrt2, "-Ordinals", false, 2, null)) {
                    strGEmmrt2 = C59449zhJ.replace$default(strGEmmrt2, "-Ordinals", "", false, 4, (java.lang.Object) null);
                }
                strReplace$default = strGEmmrt2;
            }
            if (this.AYXKKw == 70000061) {
                i = 15;
            }
            if (i == 8) {
                FragmentActivity fragmentActivity = EZpvd().get();
                if (fragmentActivity != null) {
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
                    viewOnClickListenerC54939xaY.setTitle(dLX.Dialog.iwGUEr);
                    viewOnClickListenerC54939xaY.copydefault(dLX.Dialog.uzCIH);
                    viewOnClickListenerC54939xaY.EZpvd(dLX.Dialog.OLrzqt, new View.OnClickListener() { // from class: o.dBE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C13181dBv.AEQbTJ(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                    return;
                }
                return;
            }
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            java.lang.String str2 = (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.AYXKKw)) == null) ? "" : strEZpvd;
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = OLrzqt();
            if (interfaceC9738bbJOLrzqt2 != null && (interfaceC9742bbNAEQbTJ = interfaceC9738bbJOLrzqt2.AEQbTJ(this.AYXKKw)) != null) {
                objEZpvd = java.lang.Long.valueOf(interfaceC9742bbNAEQbTJ.OLrzqt());
            }
            btcNftData.setBatchBean(C56402yEa.EZpvd(new BTCNFTInfo((java.lang.Long) objEZpvd, strReplace$default, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str2, false, (java.lang.String) null, (java.lang.String) null, java.lang.Integer.valueOf(i), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 126716, (DefaultConstructorMarker) null)));
            btcNftData.getFirstNftProtocolId();
            btcNftData.setScenario(5);
            btcNftData.setFeeRate(strGEmmrt3);
            btcNftData.setTxType("20");
            Intrinsics.copydefault(obj);
            java.lang.Object json = new Gson().toJson(btcNftData);
            Intrinsics.checkNotNullExpressionValue(json, "");
            OLrzqt(obj, json, "sendInscription");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "getInscriptions")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject2);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "pushPsbt")) {
            Intrinsics.copydefault(obj);
            KWHzl(obj, jSONObject2);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "pushTx")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject2, "pushTx");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "needLoginToast")) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(dLX.Dialog.gkJEwt));
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "switchChain")) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt3 = OLrzqt();
            objEZpvd = interfaceC9738bbJOLrzqt3 != null ? interfaceC9738bbJOLrzqt3.EZpvd(this.AYXKKw) : null;
            java.lang.String str3 = objEZpvd != null ? objEZpvd : "";
            TaskDescription taskDescription = this.valueOf;
            if (taskDescription != null) {
                taskDescription.KWHzl(str3, OLrzqt(), this.AYXKKw);
            }
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(final java.lang.Object obj) {
        AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> abstractC58185ywXOLrzqt;
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
        if (interfaceC9738bbJOLrzqt != null) {
            java.lang.String strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.AYXKKw);
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), this.AYXKKw, false, 2, null);
            java.lang.Long lValueOf = chainMetaWithRealChainId$default != null ? java.lang.Long.valueOf(chainMetaWithRealChainId$default.AhwBna()) : null;
            if (lValueOf != null) {
                lValueOf.longValue();
                InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
                if (interfaceC9854bdT == null || (abstractC58185ywXOLrzqt = interfaceC9854bdT.OLrzqt(new UTXOConfirmBalanceReq(lValueOf.longValue(), strEZpvd))) == null || (abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC58185ywXOLrzqt, (Function1) null, 1, (java.lang.Object) null)) == null) {
                    return;
                }
                final Function1 function1 = new Function1() { // from class: o.dBA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C13181dBv.KWHzl(this.AEQbTJ, obj, (UTXOConfirmBalanceResp) obj2);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dBy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        C13181dBv.getNewProxyInstance(function1, obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dBF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C13181dBv.KWHzl((java.lang.Throwable) obj2);
                    }
                };
                abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dBG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        C13181dBv.iwGUEr(function12, obj2);
                    }
                });
            }
        }
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C13181dBv c13181dBv, java.lang.Object obj, UTXOConfirmBalanceResp uTXOConfirmBalanceResp) {
        java.math.BigInteger total;
        java.math.BigInteger unconfirmed;
        java.math.BigInteger confirmed;
        TaskDescription taskDescription = c13181dBv.valueOf;
        if (taskDescription != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
            android.os.Bundle bundle = new android.os.Bundle();
            long jValueOf = 0;
            bundle.putLong("confirmed", (uTXOConfirmBalanceResp == null || (confirmed = uTXOConfirmBalanceResp.getConfirmed()) == null) ? 0L : C33129mqd.valueOf(confirmed));
            bundle.putLong("unconfirmed", (uTXOConfirmBalanceResp == null || (unconfirmed = uTXOConfirmBalanceResp.getUnconfirmed()) == null) ? 0L : C33129mqd.valueOf(unconfirmed));
            if (uTXOConfirmBalanceResp != null && (total = uTXOConfirmBalanceResp.getTotal()) != null) {
                jValueOf = C33129mqd.valueOf(total);
            }
            bundle.putLong("total", jValueOf);
            Unit unit = Unit.INSTANCE;
            taskDescription.EZpvd(strGEmmrt, bundle, "getBalance", c13181dBv.AYXKKw, c13181dBv.gEmmrt);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(java.lang.Object obj, java.lang.Object obj2) throws JSONException {
        if (obj2 instanceof JSONObject) {
            java.lang.String strOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().OLrzqt(C33129mqd.gEmmrt(((JSONObject) obj2).opt("psbtHex")));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rawtx", strOLrzqt);
            Unit unit = Unit.INSTANCE;
            EZpvd(obj, jSONObject, "pushPsbt");
        }
    }

    public final void EZpvd(final java.lang.Object obj, java.lang.Object obj2) {
        AbstractC58185ywX<ResponseData<UTXONFTListResp>> abstractC58185ywXOLrzqt;
        if (obj2 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj2;
            int iAhwBna = C33129mqd.AhwBna(jSONObject.opt("cursor"));
            int iAhwBna2 = C33129mqd.AhwBna(jSONObject.opt("size"));
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt != null) {
                java.lang.String strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.AYXKKw);
                InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
                if (interfaceC9854bdT == null || (abstractC58185ywXOLrzqt = interfaceC9854bdT.OLrzqt(new UTXONFTListReq(strEZpvd, iAhwBna, iAhwBna2, this.AYXKKw))) == null) {
                    return;
                }
                final Function1 function1 = new Function1() { // from class: o.dBI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C13181dBv.copydefault((ResponseData) obj3);
                    }
                };
                AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dBL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj3) {
                        return C13181dBv.AubY(function1, obj3);
                    }
                });
                if (abstractC58185ywXAEQbTJ != 0) {
                    final Function1 function12 = new Function1() { // from class: o.dBO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return C13181dBv.copydefault(this.AEQbTJ, obj, (UTXONFTListResp) obj3);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dBB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj3) {
                            C13181dBv.wlaJM(function12, obj3);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.dBz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return C13181dBv.OLrzqt((java.lang.Throwable) obj3);
                        }
                    };
                    abstractC58185ywXAEQbTJ.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dBC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj3) {
                            C13181dBv.AuCTelauCTel(function13, obj3);
                        }
                    });
                }
            }
        }
    }

    public static final UTXONFTListResp AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UTXONFTListResp) function1.invoke(obj);
    }

    public static final UTXONFTListResp copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return (UTXONFTListResp) responseData.getData();
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C13181dBv c13181dBv, java.lang.Object obj, UTXONFTListResp uTXONFTListResp) {
        TaskDescription taskDescription = c13181dBv.valueOf;
        if (taskDescription != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", uTXONFTListResp);
            Unit unit = Unit.INSTANCE;
            taskDescription.EZpvd(strGEmmrt, bundle, "getInscriptions", c13181dBv.AYXKKw, c13181dBv.gEmmrt);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.Object obj, java.lang.Object obj2, final java.lang.String str) {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default;
        if (!(obj2 instanceof JSONObject) || (interfaceC9738bbJOLrzqt = OLrzqt()) == null) {
            return;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(((JSONObject) obj2).opt("rawtx"));
        final java.lang.String strOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().OLrzqt(strGEmmrt, this.AYXKKw);
        final java.lang.String strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.AYXKKw);
        InterfaceC9742bbN interfaceC9742bbNAEQbTJ = interfaceC9738bbJOLrzqt.AEQbTJ(this.AYXKKw);
        java.lang.Long lValueOf = interfaceC9742bbNAEQbTJ != null ? java.lang.Long.valueOf(interfaceC9742bbNAEQbTJ.OLrzqt()) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
            if (interfaceC9854bdT != null) {
                java.lang.String strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk();
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = interfaceC9854bdT.AEQbTJ(strDbNXlk, new SimpleSubmitTxReq(strOLrzqt, strGEmmrt, strEZpvd, jLongValue, 2));
                if (abstractC58185ywXAEQbTJ == null || (abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC58185ywXAEQbTJ, (Function1) null, 1, (java.lang.Object) null)) == null) {
                    return;
                }
                final Function1 function1 = new Function1() { // from class: o.dBD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C13181dBv.AEQbTJ(this.copydefault, obj, strEZpvd, str, strOLrzqt, (java.lang.String) obj3);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dBH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) {
                        C13181dBv.zsXlph(function1, obj3);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dBK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C13181dBv.AEQbTJ(this.EZpvd, obj, (java.lang.Throwable) obj3);
                    }
                };
                abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dBM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) {
                        C13181dBv.zLjUOn(function12, obj3);
                    }
                });
            }
        }
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C13181dBv c13181dBv, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        TaskDescription taskDescription = c13181dBv.valueOf;
        if (taskDescription != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str3);
            Unit unit = Unit.INSTANCE;
            taskDescription.EZpvd(strGEmmrt, bundle, "pushTx", c13181dBv.AYXKKw, c13181dBv.gEmmrt);
        }
        dFN.copydefault(str, str2, c13181dBv.AYXKKw, c13181dBv.AEQbTJ(), str3);
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C13181dBv c13181dBv, java.lang.Object obj, java.lang.Throwable th) {
        TaskDescription taskDescription = c13181dBv.valueOf;
        if (taskDescription != null) {
            taskDescription.AEQbTJ(C33129mqd.gEmmrt(obj), "", "pushTx", c13181dBv.AYXKKw, c13181dBv.gEmmrt);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.Object obj, java.lang.Object obj2, final java.lang.String str) {
        java.lang.String strDbNXlk;
        int i;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt == null || (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            java.lang.String str2 = strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AYXKKw));
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(obj2);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sendInscription")) {
                i = 10;
            } else {
                i = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sendBitcoin") ? 15 : 7;
            }
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAEQbTJ2 = AEQbTJ();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(obj2));
            dFN.startTransferDappWithReport$default(str, fragmentActivity, new DappInteractionArgs(str2, null, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, java.lang.Integer.valueOf(i), null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201883870, null), new Function1() { // from class: o.dBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C13181dBv.AEQbTJ(this.copydefault, obj, str, (android.os.Bundle) obj3);
                }
            }, null, null, 32, null);
        }
    }

    public static final Unit AEQbTJ(C13181dBv c13181dBv, java.lang.Object obj, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            TaskDescription taskDescription = c13181dBv.valueOf;
            if (taskDescription != null) {
                taskDescription.AEQbTJ(C33129mqd.gEmmrt(obj), C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), str, c13181dBv.AYXKKw, c13181dBv.gEmmrt);
            }
        } else {
            TaskDescription taskDescription2 = c13181dBv.valueOf;
            if (taskDescription2 != null) {
                taskDescription2.EZpvd(C33129mqd.gEmmrt(obj), bundle, str, c13181dBv.AYXKKw, c13181dBv.gEmmrt);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.Object obj, JSONObject jSONObject, final java.lang.String str) {
        java.lang.String str2;
        java.lang.String strDbNXlk;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            java.lang.String str3 = "";
            java.lang.String str4 = (interfaceC9738bbJOLrzqt == null || (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.AYXKKw));
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(jSONObject);
            int iHashCode = str.hashCode();
            if (iHashCode != -79086710) {
                if (iHashCode != 311218418) {
                    if (iHashCode == 1057836481 && str.equals("signPsbts")) {
                        str2 = "btc_psbts";
                        str3 = str2;
                    }
                } else if (str.equals("signPsbt")) {
                    str2 = "btc_psbt";
                    str3 = str2;
                }
            } else if (str.equals("signMessage")) {
                str2 = "btc_message";
                str3 = str2;
            }
            dFN.startSignDappWithReport$default(str, fragmentActivity, new DappSignArgs(str4, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, false, 2, "dapp", null, false, false, str3, null, null, null, null, false, null, 129936, null), new Function1() { // from class: o.dBJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13181dBv.KWHzl(this.KWHzl, obj, str, (android.os.Bundle) obj2);
                }
            }, null, 16, null);
        }
    }

    public static final Unit KWHzl(C13181dBv c13181dBv, java.lang.Object obj, java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            TaskDescription taskDescription = c13181dBv.valueOf;
            if (taskDescription != null) {
                taskDescription.AEQbTJ(C33129mqd.gEmmrt(obj), C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), str, c13181dBv.AYXKKw, c13181dBv.gEmmrt);
            }
        } else {
            TaskDescription taskDescription2 = c13181dBv.valueOf;
            if (taskDescription2 != null) {
                taskDescription2.EZpvd(C33129mqd.gEmmrt(obj), bundle, str, c13181dBv.AYXKKw, c13181dBv.gEmmrt);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.dAX
    public void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map != null ? map.get("id") : null;
        if (interfaceC9738bbJ != null) {
            long j = this.AYXKKw;
            if (l != null && j == l.longValue()) {
                EZpvd(interfaceC9738bbJ);
                KWHzl(java.lang.String.valueOf(obj), interfaceC9738bbJ);
                return;
            }
        }
        EZpvd(java.lang.String.valueOf(obj), "", "requestAccounts", this.AYXKKw);
    }

    public final void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null) {
            dappTabDataOLrzqt.setConnectedByWalletConnect(false);
        }
        java.lang.String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(this.AYXKKw) : null;
        java.lang.String str2 = strEZpvd != null ? strEZpvd : "";
        TaskDescription taskDescription = this.valueOf;
        if (taskDescription != null) {
            taskDescription.KWHzl(str2, interfaceC9738bbJ, this.AYXKKw);
        }
        TaskDescription taskDescription2 = this.valueOf;
        if (taskDescription2 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2);
            Unit unit = Unit.INSTANCE;
            taskDescription2.EZpvd(str, bundle, "requestAccounts", this.AYXKKw, this.gEmmrt);
        }
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        TaskDescription taskDescription = this.valueOf;
        if (taskDescription != null) {
            taskDescription.AEQbTJ(str, str2, str3, j, this.gEmmrt);
        }
    }
}
