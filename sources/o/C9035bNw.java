package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.wallethardware.onekey.EVMTypedData;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9035bNw extends AbstractC8918bLl {
    public boolean AYXKKw = true;
    public boolean OLrzqt = true;

    /* JADX INFO: renamed from: o.bNw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignType.values().length];
            try {
                iArr[SignType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignType.PERSONAL_MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignType.TYPED_MESSAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC8918bLl
    public AbstractC58260yxt<Unit> gEmmrt() {
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bNu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9035bNw.OLrzqt(this.KWHzl, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(final C9035bNw c9035bNw, final InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.String raw;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        final EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) c9035bNw.QVsKAR();
        SignType signTypeAhwBna = c9035bNw.AhwBna();
        SignType signType = SignType.TYPED_MESSAGE;
        if (signTypeAhwBna == signType) {
            if (c9035bNw.dUDNAs().AxsJAY() || c9035bNw.dUDNAs().zuBGHE()) {
                eVMMessageSignData.setData(eVMMessageSignData.getData());
            } else {
                try {
                    Result.Application application = Result.Companion;
                    if (c9035bNw.QwvEab() == 2 || c9035bNw.QwvEab() == 5) {
                        raw = eVMMessageSignData.getRaw();
                        java.lang.String data = eVMMessageSignData.getData();
                        if (raw == null || raw.length() == 0) {
                            raw = data;
                        }
                    } else {
                        raw = eVMMessageSignData.getData();
                    }
                    if (JsonParser.parseString(raw).isJsonObject()) {
                        if (c9035bNw.dUDNAs().gHZMYf()) {
                            c9035bNw.EZpvd(raw, new Function1() { // from class: o.bNB
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C9035bNw.copydefault(this.KWHzl, interfaceC58257yxq, (JsonObject) obj);
                                }
                            });
                            return;
                        } else {
                            c9035bNw.AEQbTJ(raw, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bNC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C9035bNw.KWHzl(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                                }
                            });
                            return;
                        }
                    }
                    c9035bNw.AEQbTJ(raw, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bNE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C9035bNw.EZpvd(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                        }
                    });
                    return;
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    if (Result.m7383isFailureimpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th)))) {
                        c9035bNw.AEQbTJ(eVMMessageSignData.getData(), eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bND
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9035bNw.valueOf(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                            }
                        });
                        return;
                    }
                }
            }
        } else if (c9035bNw.dUDNAs().gHZMYf()) {
            try {
                Result.Application application3 = Result.Companion;
                JsonObject asJsonObject = JsonParser.parseString(eVMMessageSignData.getData()).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                c9035bNw.EZpvd(c9035bNw.AEQbTJ(asJsonObject));
                if (c9035bNw.OLrzqt() != null) {
                    c9035bNw.copydefault(signType);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (c9035bNw.dUDNAs().sSMYrx() && c9035bNw.AhwBna() == SignType.PERSONAL_MESSAGE && !C59449zhJ.AYXKKw(eVMMessageSignData.getData(), EIP1271Verifier.hexPrefix, true)) {
                eVMMessageSignData.setData(C54910xZw.OLrzqt(xYW.AEQbTJ.values(eVMMessageSignData.getData())));
            }
        }
        interfaceC58257yxq.onSuccess(Unit.INSTANCE);
    }

    public static final Unit copydefault(C9035bNw c9035bNw, InterfaceC58257yxq interfaceC58257yxq, JsonObject jsonObject) {
        if (jsonObject != null) {
            c9035bNw.EZpvd(c9035bNw.AEQbTJ(jsonObject));
        }
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public static final Unit KWHzl(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public static final Unit EZpvd(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public static final Unit valueOf(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8918bLl
    public boolean djBIcL() {
        AbstractC12782ctV abstractC12782ctVDUDNAs = dUDNAs();
        EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) QVsKAR();
        if (abstractC12782ctVDUDNAs.AxsJAY()) {
            return AkhnZx() ? false : false;
        }
        if (!abstractC12782ctVDUDNAs.zuBGHE() && abstractC12782ctVDUDNAs.gHZMYf() && OLrzqt() == null) {
            return as_();
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final SignType isConnected() {
        if (AkhnZx()) {
            java.lang.String method = ((EVMMessageSignData) QVsKAR()).getMethod();
            if (method != null) {
                int iHashCode = method.hashCode();
                if (iHashCode != -1424874333) {
                    if (iHashCode != 28005018) {
                        if (iHashCode == 1684402730 && method.equals(DappSignArgs.SIGN_PERSONALMESSAGE)) {
                            return SignType.PERSONAL_MESSAGE;
                        }
                    } else if (method.equals(DappSignArgs.SIGN_TYPEDMESSAGE)) {
                        return SignType.TYPED_MESSAGE;
                    }
                } else if (method.equals("eth_sign")) {
                    return SignType.MESSAGE;
                }
            }
            if (((EVMMessageSignData) QVsKAR()).isPersonSign()) {
                return SignType.PERSONAL_MESSAGE;
            }
            return SignType.MESSAGE;
        }
        return AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    @Override // o.AbstractC8918bLl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull SignDataArgs<EVMMessageSignData> signDataArgs) {
        boolean z;
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        super.OLrzqt(signDataArgs);
        if (ODXsMY()) {
            int i = Application.AEQbTJ[AhwBna().ordinal()];
            z = true;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        AhwBna(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        if (Intrinsics.EZpvd((java.lang.Object) ((EVMMessageSignData) QVsKAR()).getMethod(), (java.lang.Object) DappSignArgs.SIGN_TYPEDMESSAGE)) {
            return yDY.copydefault(10);
        }
        return yDY.copydefault(9);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        java.lang.String str;
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        Gson gson = new Gson();
        java.lang.String raw = ((EVMMessageSignData) QVsKAR()).getRaw();
        java.lang.String data = ((EVMMessageSignData) QVsKAR()).getData();
        if (raw == null || raw.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) raw)) {
            raw = data;
        }
        preExecTransactionReqRdAHlO.setDappData(gson.toJson(C56423yEv.EZpvd(C56390yDp.OLrzqt("data", raw))));
        int i = Application.AEQbTJ[AhwBna().ordinal()];
        if (i == 1) {
            str = "eth_sign";
        } else if (i == 2) {
            str = "personal_sign";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "wallet_signTypeData";
        }
        preExecTransactionReqRdAHlO.setMethod(str);
        return preExecTransactionReqRdAHlO;
    }

    public final boolean AkhnZx() {
        int iQwvEab = QwvEab();
        return iQwvEab == 5 || iQwvEab == 2;
    }

    public final boolean values() {
        int iQwvEab = QwvEab();
        return iQwvEab == 5 || iQwvEab == 2 || iQwvEab == 3 || iQwvEab == 11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String DbNXlk() {
        EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) QVsKAR();
        int i = Application.AEQbTJ[isConnected().ordinal()];
        if (i == 2) {
            if (C59449zhJ.AYXKKw(eVMMessageSignData.getData(), EIP1271Verifier.hexPrefix, true)) {
                java.lang.String strSubstring = eVMMessageSignData.getData().substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
            return eVMMessageSignData.getData();
        }
        if (i == 3) {
            if (values()) {
                xYW xyw = xYW.AEQbTJ;
                java.lang.String raw = eVMMessageSignData.getRaw();
                return xyw.values(raw != null ? raw : "");
            }
            return xYW.AEQbTJ.values(eVMMessageSignData.getData());
        }
        throw new java.lang.Exception("keystone not support the signType");
    }

    public final boolean as_() {
        return AhwBna() == SignType.PERSONAL_MESSAGE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(EZpvd(str, ((EVMMessageSignData) QVsKAR()).getData(), as_()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        return copydefault(EZpvd(((EVMMessageSignData) QVsKAR()).getData()));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        java.lang.String keystoneSignTx = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
        if (keystoneSignTx == null || keystoneSignTx.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5013, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            Intrinsics.copydefault(submitTxExpandBean);
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, submitTxExpandBean.getKeystoneSignTx(), null, 46, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return copydefault(abstractC58185ywXKWHzl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ;
        int i = Application.AEQbTJ[isConnected().ordinal()];
        if (i == 1 || i == 2) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = OneKeySignHelper.copydefault.EZpvd(dUDNAs(), fERRXa(), ((EVMMessageSignData) QVsKAR()).getData());
            final Function1 function1 = new Function1() { // from class: o.bNG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9035bNw.valueOf((ResponseData) obj);
                }
            };
            abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9035bNw.fetchVPNInfo(function1, obj);
                }
            });
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    C9035bNw.OLrzqt(this.OLrzqt, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
            final Function1 function12 = new Function1() { // from class: o.bNJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9035bNw.KWHzl(this.AEQbTJ, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bNA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9035bNw.isConnected(function12, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.bNy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9035bNw.gEmmrt((ResponseData) obj);
                }
            };
            abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9035bNw.values(function13, obj);
                }
            });
        }
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return copydefault(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData valueOf(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(final C9035bNw c9035bNw, final InterfaceC58184ywW interfaceC58184ywW) {
        final java.lang.String data = "";
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (c9035bNw.values()) {
            java.lang.String raw = ((EVMMessageSignData) c9035bNw.QVsKAR()).getRaw();
            if (raw != null) {
                data = raw;
            }
        } else {
            data = ((EVMMessageSignData) c9035bNw.QVsKAR()).getData();
        }
        c9035bNw.EZpvd(data, new Function1() { // from class: o.bNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9035bNw.copydefault(this.EZpvd, interfaceC58184ywW, data, (JsonObject) obj);
            }
        });
    }

    public static final Unit copydefault(C9035bNw c9035bNw, InterfaceC58184ywW interfaceC58184ywW, java.lang.String str, JsonObject jsonObject) {
        if (jsonObject != null) {
            c9035bNw.EZpvd(c9035bNw.AEQbTJ(jsonObject));
            interfaceC58184ywW.onNext(str);
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception("Cal hash failed."));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C9035bNw c9035bNw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OneKeySignHelper oneKeySignHelper = OneKeySignHelper.copydefault;
        AbstractC12782ctV abstractC12782ctVDUDNAs = c9035bNw.dUDNAs();
        ChainAddress chainAddressFERRXa = c9035bNw.fERRXa();
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = c9035bNw.OLrzqt();
        java.lang.String first = pairOLrzqt != null ? pairOLrzqt.getFirst() : null;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2 = c9035bNw.OLrzqt();
        return oneKeySignHelper.OLrzqt(abstractC12782ctVDUDNAs, chainAddressFERRXa, new EVMTypedData(str, first, pairOLrzqt2 != null ? pairOLrzqt2.getSecond() : null));
    }

    public static final ResponseData values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(KWHzl(str, ((EVMMessageSignData) QVsKAR()).getData(), as_()));
    }
}
