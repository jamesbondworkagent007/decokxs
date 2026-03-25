package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.BlackAddressWarning;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8918bLl extends AbstractC8610bFv<EVMMessageSignData> {
    public KYSPreTxCheckInfo AEQbTJ;
    public kotlin.Pair<java.lang.String, java.lang.String> EZpvd;
    public SignType copydefault;

    /* JADX INFO: renamed from: o.bLl$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        this.EZpvd = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull SignType signType) {
        Intrinsics.checkNotNullParameter(signType, "");
        this.copydefault = signType;
    }

    public abstract boolean djBIcL();

    public abstract AbstractC58260yxt<Unit> gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KYSPreTxCheckInfo valueOf() {
        return this.AEQbTJ;
    }

    public final SignType AhwBna() {
        SignType signType = this.copydefault;
        if (signType != null) {
            return signType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<EVMMessageSignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        OLrzqt(signDataArgs);
        return zKWHzl;
    }

    public void OLrzqt(@NotNull SignDataArgs<EVMMessageSignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        SignType signType = ((EVMMessageSignData) signDataArgs.getSignData()).getSignType();
        if (signType == null) {
            signType = ((EVMMessageSignData) signDataArgs.getSignData()).isPersonSign() ? SignType.PERSONAL_MESSAGE : SignType.MESSAGE;
        }
        copydefault(signType);
    }

    public static final kotlin.Pair AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = super.EZpvd();
        AbstractC58185ywX<Unit> abstractC58185ywXEZpvd2 = gEmmrt().EZpvd();
        final Function2 function2 = new Function2() { // from class: o.bLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8918bLl.OLrzqt(this.EZpvd, (kotlin.Pair) obj, (Unit) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd3 = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd, abstractC58185ywXEZpvd2, new InterfaceC58223yxI() { // from class: o.bLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8918bLl.AhwBna(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd3, "");
        return abstractC58185ywXEZpvd3;
    }

    public static final kotlin.Pair OLrzqt(AbstractC8918bLl abstractC8918bLl, kotlin.Pair pair, Unit unit) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(unit, "");
        abstractC8918bLl.DLWbHP().OLrzqt(C56402yEa.EZpvd(new C9782bcA(abstractC8918bLl.djBIcL())));
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setCoinId(java.lang.Long.valueOf(dHguZz().AhwBna()));
        txToastCheckReqI_.setChainId(dHguZz().fetchVPNInfo());
        txToastCheckReqI_.setFrom(htlTjW());
        txToastCheckReqI_.setTo("");
        java.lang.String raw = ((EVMMessageSignData) QVsKAR()).getRaw();
        java.lang.String data = ((EVMMessageSignData) QVsKAR()).getData();
        if (raw == null || raw.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) raw)) {
            raw = data;
        }
        txToastCheckReqI_.setInputData(raw);
        txToastCheckReqI_.setRequestId(UUID.randomUUID().toString());
        if (KWHzl().length() > 0) {
            txToastCheckReqI_.setAdditionalData(C56423yEv.EZpvd(C56390yDp.OLrzqt("evmData", C33488mxR.EZpvd(C56423yEv.EZpvd(C56390yDp.OLrzqt("type", KWHzl()))))));
        }
        return txToastCheckReqI_;
    }

    public final java.lang.String KWHzl() {
        int i = Application.copydefault[AhwBna().ordinal()];
        return i != 1 ? i != 2 ? "" : "personal_sign" : "eth_sign";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[PHI: r20
  0x0096: PHI (r20v3 java.lang.String) = (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:9:0x0084, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.lang.String str;
        java.util.Iterator it;
        boolean z;
        java.lang.Integer approvalType;
        java.util.Iterator it2;
        java.lang.String addressType;
        java.lang.Boolean tagExt;
        AbstractC8918bLl abstractC8918bLl = this;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        abstractC8918bLl.AEQbTJ = null;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component1()).booleanValue();
        java.lang.Object objComponent2 = pairOLrzqt.component2();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(bool, yDY.AhwBna());
        boolean zBooleanValue2 = ((java.lang.Boolean) pairOLrzqt2.component1()).booleanValue();
        java.lang.Object objComponent22 = pairOLrzqt2.component2();
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(bool, yDY.AhwBna());
        boolean zBooleanValue3 = ((java.lang.Boolean) pairOLrzqt3.component1()).booleanValue();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = pairOLrzqt3.component2();
        java.util.Iterator it3 = list.iterator();
        boolean z2 = zBooleanValue;
        boolean z3 = zBooleanValue2;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean zBooleanValue4 = false;
        while (it3.hasNext()) {
            TxToastCheckRes txToastCheckRes = (TxToastCheckRes) it3.next();
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType == null) {
                str = str2;
            } else {
                str = str2;
                if (checkType.intValue() == 10) {
                    KYSPreTxCheckInfo kYSPreTxCheckInfoAEQbTJ = OHqIaq().AEQbTJ(txToastCheckRes);
                    abstractC8918bLl.AEQbTJ = kYSPreTxCheckInfoAEQbTJ;
                    java.util.List<java.lang.String> riskAddressList = kYSPreTxCheckInfoAEQbTJ.getRiskAddressList();
                    java.util.List<java.lang.String> similarAddressList = kYSPreTxCheckInfoAEQbTJ.getSimilarAddressList();
                    java.util.List<java.lang.String> causeRiskItem = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    BlackAddressWarning blackAddressWarning = kYSPreTxCheckInfoAEQbTJ.getBlackAddressWarning();
                    zBooleanValue4 = (blackAddressWarning == null || (tagExt = blackAddressWarning.getTagExt()) == null) ? false : tagExt.booleanValue();
                    BlackAddressWarning blackAddressWarning2 = kYSPreTxCheckInfoAEQbTJ.getBlackAddressWarning();
                    java.lang.String address = blackAddressWarning2 != null ? blackAddressWarning2.getAddress() : null;
                    if (address == null) {
                        address = str;
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) riskAddressList)) {
                        objComponent22 = riskAddressList;
                        objComponent2 = str;
                        z2 = false;
                        z3 = false;
                    } else if (C33129mqd.KWHzl((java.util.Collection) similarAddressList)) {
                        objComponent22 = similarAddressList;
                        objComponent2 = str;
                        z2 = false;
                        z3 = true;
                    }
                    if (zBooleanValue4 && C33129mqd.OLrzqt((java.lang.CharSequence) address)) {
                        objComponent22 = C56402yEa.EZpvd(address);
                    }
                    if (causeRiskItem != null) {
                        z = true;
                        if (causeRiskItem.contains(TxToastCheckRes.EIP712_NOT_STANDARD)) {
                            z6 = false;
                        }
                    } else {
                        z = true;
                    }
                    if (causeRiskItem != null && causeRiskItem.contains(TxToastCheckRes.LONG_SIGN_TEXT) == z) {
                        z8 = false;
                    }
                    if (causeRiskItem != null && causeRiskItem.contains("eth_sign") == z) {
                        z4 = false;
                    }
                    if (causeRiskItem != null && causeRiskItem.contains(TxToastCheckRes.LOWER_VALUE) == z) {
                        z7 = false;
                    }
                    if (causeRiskItem != null && causeRiskItem.contains(TxToastCheckRes.OFFLINE_AUTHORIZATION_FOR_UNKNOWN_PROJECT) == z) {
                        z5 = false;
                    }
                    java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAEQbTJ.getExposures();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : exposures) {
                        Spender spenderValue = ((ExposureInfo) obj).getSpenderValue();
                        if (spenderValue != null) {
                            addressType = spenderValue.getAddressType();
                            it2 = it3;
                        } else {
                            it2 = it3;
                            addressType = null;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) addressType, (java.lang.Object) TxToastCheckRes.EOA_ADDRESS_TYPE)) {
                            arrayList.add(obj);
                        }
                        it3 = it2;
                    }
                    it = it3;
                    ?? arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        java.lang.String spenderKey = ((ExposureInfo) it4.next()).getSpenderKey();
                        if (spenderKey != null) {
                            arrayList2.add(spenderKey);
                        }
                    }
                    objectRef.element = arrayList2;
                    java.util.List<ExposureInfo> exposures2 = kYSPreTxCheckInfoAEQbTJ.getExposures();
                    if ((exposures2 instanceof java.util.Collection) && exposures2.isEmpty()) {
                        zBooleanValue3 = false;
                    } else {
                        java.util.Iterator<T> it5 = exposures2.iterator();
                        while (it5.hasNext()) {
                            Spender spenderValue2 = ((ExposureInfo) it5.next()).getSpenderValue();
                            if (((spenderValue2 == null || (approvalType = spenderValue2.getApprovalType()) == null) ? null : KYSApprovalType.Companion.OLrzqt(java.lang.Integer.valueOf(approvalType.intValue()))) == KYSApprovalType.CANCEL_AUTHORIZATION) {
                                zBooleanValue3 = true;
                                break;
                            }
                        }
                        zBooleanValue3 = false;
                    }
                }
                abstractC8918bLl = this;
                it3 = it;
                str2 = str;
            }
            if (checkType == null || checkType.intValue() != 9) {
                it = it3;
            }
            abstractC8918bLl = this;
            it3 = it;
            str2 = str;
        }
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        AbstractC9832bcy[] abstractC9832bcyArr = new AbstractC9832bcy[9];
        java.lang.String str3 = (java.lang.String) objComponent2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.lang.Iterable) objComponent22).iterator();
        int i = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.Iterator it7 = it6;
            boolean z9 = z7;
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), 3)) {
                arrayList3.add(next);
            }
            i++;
            it6 = it7;
            z7 = z9;
        }
        boolean z10 = z8;
        abstractC9832bcyArr[0] = new C9870bdj(z2, str3, z3, zBooleanValue4, arrayList3, null, 32, null);
        boolean z11 = true;
        abstractC9832bcyArr[1] = new C9871bdk(z7);
        abstractC9832bcyArr[2] = new C9783bcB(z6);
        abstractC9832bcyArr[3] = new C9798bcQ(z10);
        abstractC9832bcyArr[4] = new C9831bcx(z4);
        abstractC9832bcyArr[5] = new C9833bcz(z6);
        abstractC9832bcyArr[6] = new C9794bcM(z10);
        abstractC9832bcyArr[7] = new C9812bce(z5);
        if (!((java.util.List) objectRef.element).isEmpty() && !zBooleanValue3) {
            z11 = false;
        }
        abstractC9832bcyArr[8] = new C9814bcg(z11, (java.util.List) objectRef.element);
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(abstractC9832bcyArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.bLl */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        OLrzqt((SignDataArgs<EVMMessageSignData>) OJuSTm());
        return EZpvd();
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = jsonObject.get("domainSeparator");
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return null;
        }
        java.lang.String asString = jsonElement.getAsString();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) asString)) {
            return null;
        }
        java.lang.String asString2 = jsonObject.get("typedDataHash").getAsJsonPrimitive().getAsString();
        Intrinsics.copydefault((java.lang.Object) asString);
        return C56390yDp.OLrzqt(asString, asString2);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull final Function1<? super JsonObject, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C57259yez.copydefault.copydefault("okCalTypedDataHash", new Gson().toJson(C56402yEa.EZpvd(str)), new android.webkit.ValueCallback() { // from class: o.bLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC8918bLl.AEQbTJ(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.String str) {
        java.lang.String strReplace$default;
        if (str != null) {
            try {
                strReplace$default = C59449zhJ.replace$default(str, "\\", "", false, 4, (java.lang.Object) null);
            } catch (java.lang.Exception unused) {
                function1.invoke(null);
                return;
            }
        } else {
            strReplace$default = null;
        }
        function1.invoke(JsonParser.parseString(strReplace$default).getAsJsonObject());
    }

    public final void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C57259yez.copydefault.copydefault("okCalTypedDataVersioned", new Gson().toJson(yDY.gEmmrt(str, str2)), new android.webkit.ValueCallback() { // from class: o.bLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC8918bLl.copydefault(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.String str) {
        java.lang.String strReplace$default;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "\\", "", false, 4, (java.lang.Object) null)) == null) {
            strReplace$default = "";
        }
        function1.invoke(strReplace$default);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        java.lang.String data;
        EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) QVsKAR();
        if (z) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) eVMMessageSignData.getRaw())) {
                data = eVMMessageSignData.getRaw();
                Intrinsics.copydefault((java.lang.Object) data);
            } else {
                data = eVMMessageSignData.getData();
            }
            if (AhwBna() != SignType.PERSONAL_MESSAGE) {
                return data;
            }
            java.lang.String strAYXKKw = xYW.AEQbTJ.AYXKKw(data);
            return C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw) ? strAYXKKw : data;
        }
        return eVMMessageSignData.getData();
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
            str = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        java.lang.String strAEQbTJ = xYZ.KWHzl.AEQbTJ(str, str2, z);
        if (strAEQbTJ.length() != 0) {
            strAEQbTJ = EIP1271Verifier.hexPrefix + strAEQbTJ;
        }
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, strAEQbTJ, null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r8v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMDHguZz = dHguZz();
        ChainAddress chainAddressFERRXa = fERRXa();
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.EZpvd;
        if (pair != null) {
            abstractC58185ywXEZpvd = LedgerSignHelper.AEQbTJ.EZpvd(c10854bwMDHguZz, chainAddressFERRXa, pair.getFirst(), pair.getSecond());
        } else {
            if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                str = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            abstractC58185ywXEZpvd = LedgerSignHelper.AEQbTJ.EZpvd(c10854bwMDHguZz, chainAddressFERRXa, str);
        }
        final Function1 function1 = new Function1() { // from class: o.bLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8918bLl.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8918bLl.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, responseData.getData(), responseData.getError_code(), 8, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (OJuSTm().getMpcSignType() == MpcSignType.SHARE2) {
            return AEQbTJ(str, str2, z);
        }
        return C10965byR.OLrzqt.KWHzl(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC8918bLl.KWHzl(str2, z);
            }
        }, new Function1() { // from class: o.bLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8918bLl.AEQbTJ((RSV) obj);
            }
        }, new Function1() { // from class: o.bLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8918bLl.copydefault((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String KWHzl(java.lang.String str, boolean z) {
        return xYZ.KWHzl.EZpvd(str, z);
    }

    public static final java.lang.String AEQbTJ(RSV rsv) {
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYZ.KWHzl.EZpvd(rsv.getR(), rsv.getS(), rsv.getV());
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54910xZw.OLrzqt(str);
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(java.lang.String str, final java.lang.String str2, final boolean z) {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = dUDNAs().EZpvd(str, dHguZz().QKVWgx()).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8918bLl.KWHzl(str2, z, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8918bLl.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(java.lang.String str, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (C59449zhJ.startsWith$default(str2, EIP1271Verifier.hexPrefix, false, 2, null)) {
            str2 = str2.substring(2);
            Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        java.lang.String strAEQbTJ = xYZ.KWHzl.AEQbTJ(str2, str, z);
        if (strAEQbTJ.length() != 0) {
            strAEQbTJ = EIP1271Verifier.hexPrefix + strAEQbTJ;
        }
        return new ResponseData(-5001, null, null, null, strAEQbTJ, null, 46, null);
    }

    public static final ResponseData AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        final Function1 function1 = new Function1() { // from class: o.bLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8918bLl.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8918bLl.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData KWHzl(AbstractC8918bLl abstractC8918bLl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        java.lang.String msg = responseData.getMsg();
        java.lang.String error_code = responseData.getError_code();
        java.lang.String str = (java.lang.String) responseData.getData();
        return new ResponseData(code, msg, null, null, str != null ? new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(abstractC8918bLl, str, null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null) : null, error_code, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58260yxt<ResponseData<DappTxResultBean>> AYXKKw(@NotNull final ResponseData<DappTxResultBean> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        final java.lang.String wcAuthRequestIssuer = ((EVMMessageSignData) QVsKAR()).getWcAuthRequestIssuer();
        if (wcAuthRequestIssuer == null) {
            return super.AYXKKw(responseData);
        }
        AbstractC58260yxt<ResponseData<DappTxResultBean>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                AbstractC8918bLl.OLrzqt(this.AEQbTJ, responseData, wcAuthRequestIssuer, interfaceC58257yxq);
            }
        }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void OLrzqt(AbstractC8918bLl abstractC8918bLl, ResponseData responseData, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String resultData;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        try {
            Result.Application application = Result.Companion;
            WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
            java.lang.Long wcId = abstractC8918bLl.OJuSTm().getWcId();
            long jLongValue = wcId != null ? wcId.longValue() : 0L;
            DappTxResultBean dappTxResultBean = (DappTxResultBean) responseData.getData();
            instance$default.KWHzl(jLongValue, (dappTxResultBean == null || (resultData = dappTxResultBean.getResultData()) == null) ? "" : resultData, str, abstractC8918bLl.dUDNAs().getFieldNames());
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            interfaceC58257yxq.onSuccess(responseData);
            return;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        interfaceC58257yxq.onError(thM7380exceptionOrNullimpl);
    }
}
