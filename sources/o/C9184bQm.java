package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.net.bean.AAAccountInfo;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9184bQm extends AbstractC8918bLl {
    public java.lang.String OLrzqt = "";
    public boolean AYXKKw = true;

    /* JADX INFO: renamed from: o.bQm$TaskDescription */
    public final /* synthetic */ class TaskDescription {
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
            try {
                iArr[SignType.TYPED_MESSAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.AbstractC8918bLl, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<EVMMessageSignData> signDataArgs) {
        java.lang.String url;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        PlatformItem dapp = OJuSTm().getDapp();
        if (dapp != null && (url = dapp.getUrl()) != null) {
            str = url;
        }
        if ((QwvEab() == 2 || QwvEab() == 5) && !KWHzl(str)) {
            DLWbHP().AEQbTJ(new C9809bcb(false));
        }
        return zKWHzl;
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        if (AhwBna() != SignType.TYPED_MESSAGE) {
            return yDY.copydefault(9);
        }
        return new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Unit> */
    @Override // o.AbstractC8918bLl
    public AbstractC58260yxt<Unit> gEmmrt() {
        this.AYXKKw = false;
        final long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        final java.lang.String address = fERRXa().getAddress();
        AbstractC58260yxt<ResponseData<AAAccountInfo>> abstractC58260yxtValueOf = OFhtUX().copydefault(jFetchVPNInfo, address).valueOf();
        final Function1 function1 = new Function1() { // from class: o.bQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9184bQm.KWHzl(this.KWHzl, jFetchVPNInfo, address, (ResponseData) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.bQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9184bQm.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C9184bQm c9184bQm, final InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.String raw;
        java.lang.String data;
        java.lang.String raw2;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) c9184bQm.QVsKAR();
        if (c9184bQm.dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            if (c9184bQm.AhwBna() == SignType.TYPED_MESSAGE) {
                if (c9184bQm.QwvEab() == 2 || c9184bQm.QwvEab() == 5) {
                    raw2 = eVMMessageSignData.getRaw();
                    java.lang.String data2 = eVMMessageSignData.getData();
                    if (raw2 == null || raw2.length() == 0) {
                        raw2 = data2;
                    }
                } else {
                    raw2 = eVMMessageSignData.getData();
                }
                c9184bQm.AEQbTJ(raw2, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bQl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9184bQm.KWHzl(interfaceC58257yxq, (java.lang.String) obj);
                    }
                });
                return;
            }
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = JsonParser.parseString(eVMMessageSignData.getData()).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                c9184bQm.EZpvd(c9184bQm.AEQbTJ(asJsonObject));
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (c9184bQm.OLrzqt() != null) {
                xYW xyw = xYW.AEQbTJ;
                kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = c9184bQm.OLrzqt();
                Intrinsics.copydefault(pairOLrzqt);
                java.lang.String first = pairOLrzqt.getFirst();
                kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2 = c9184bQm.OLrzqt();
                Intrinsics.copydefault(pairOLrzqt2);
                data = xyw.KWHzl(first, pairOLrzqt2.getSecond());
            } else if (c9184bQm.AhwBna() == SignType.PERSONAL_MESSAGE) {
                data = xYZ.KWHzl.EZpvd(eVMMessageSignData.getData(), true);
            } else {
                data = eVMMessageSignData.getData();
            }
            interfaceC58257yxq.onSuccess(data);
            return;
        }
        int i = TaskDescription.copydefault[c9184bQm.AhwBna().ordinal()];
        if (i == 1) {
            interfaceC58257yxq.onSuccess(eVMMessageSignData.getData());
            return;
        }
        if (i == 2) {
            interfaceC58257yxq.onSuccess(xYZ.KWHzl.EZpvd(eVMMessageSignData.getData(), true));
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (c9184bQm.QwvEab() == 2 || c9184bQm.QwvEab() == 5) {
            raw = eVMMessageSignData.getRaw();
            java.lang.String data3 = eVMMessageSignData.getData();
            if (raw == null || raw.length() == 0) {
                raw = data3;
            }
        } else {
            raw = eVMMessageSignData.getData();
        }
        c9184bQm.AEQbTJ(raw, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9184bQm.OLrzqt(interfaceC58257yxq, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58257yxq.onSuccess(str);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58257yxq.onSuccess(str);
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(final ResponseData responseData, final long j, final java.lang.String str, final C9184bQm c9184bQm, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C59449zhJ.startsWith$default(str2, EIP1271Verifier.hexPrefix, false, 2, null)) {
            str2 = EIP1271Verifier.hexPrefix + str2;
        }
        final java.lang.String str3 = str2;
        Intrinsics.copydefault((java.lang.Object) str3);
        return AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9184bQm.AEQbTJ(responseData, j, str, str3, c9184bQm, interfaceC58257yxq);
            }
        });
    }

    public static final void AEQbTJ(ResponseData responseData, long j, java.lang.String str, java.lang.String str2, final C9184bQm c9184bQm, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        java.lang.String name = ((AAAccountInfo) data).getName();
        java.lang.Object data2 = responseData.getData();
        Intrinsics.copydefault(data2);
        java.lang.String str3 = "\n                    {\n                      \"types\": {\n                          \"EIP712Domain\": [\n                              {\n                                  \"name\": \"name\",\n                                  \"type\": \"string\"\n                              },\n                              {\n                                  \"name\": \"version\",\n                                  \"type\": \"string\"\n                              },\n                              {\n                                  \"name\": \"chainId\",\n                                  \"type\": \"uint256\"\n                              },\n                              {\n                                  \"name\": \"verifyingContract\",\n                                  \"type\": \"address\"\n                              }\n                          ],\n                          \"isValidSignature\": [\n                              {\n                                  \"name\": \"_hash\",\n                                  \"type\": \"bytes32\"\n                              }\n                          ]\n                      },\n                      \"domain\": {\n                          \"name\": \"" + name + "\",\n                          \"version\": \"" + ((AAAccountInfo) data2).getContractVersion() + "\",\n                          \"chainId\": " + j + ",\n                          \"verifyingContract\": \"" + str + "\"\n                      },\n                      \"primaryType\": \"isValidSignature\",\n                      \"message\": {\n                          \"_hash\": \"" + str2 + "\"\n                      }\n                    }\n                ";
        if (c9184bQm.dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            c9184bQm.EZpvd(str3, new Function1() { // from class: o.bQq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9184bQm.KWHzl(this.EZpvd, interfaceC58257yxq, (JsonObject) obj);
                }
            });
        } else {
            c9184bQm.OLrzqt = xYW.AEQbTJ.EZpvd(str3);
            interfaceC58257yxq.onSuccess(Unit.INSTANCE);
        }
    }

    public static final Unit KWHzl(C9184bQm c9184bQm, InterfaceC58257yxq interfaceC58257yxq, JsonObject jsonObject) {
        if (jsonObject != null) {
            c9184bQm.EZpvd(c9184bQm.AEQbTJ(jsonObject));
        }
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    @Override // o.AbstractC8918bLl
    public boolean djBIcL() {
        if (!this.AYXKKw) {
            return false;
        }
        if (dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            return true;
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt);
    }

    public final boolean KWHzl(java.lang.String str) {
        JsonArray asJsonArray;
        JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("web3_aa_wallet_sign_dapp");
        if (jsonObjectAEQbTJ == null || (asJsonArray = jsonObjectAEQbTJ.getAsJsonArray("dapp_list")) == null) {
            return false;
        }
        java.lang.String strAEQbTJ = AEQbTJ(str);
        if (strAEQbTJ.length() == 0) {
            return false;
        }
        for (JsonElement jsonElement : asJsonArray) {
            java.lang.String asString = jsonElement.getAsString();
            if (asString != null && asString.length() != 0) {
                java.lang.String asString2 = jsonElement.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString2, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strAEQbTJ, (java.lang.CharSequence) asString2, false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String host;
        try {
            host = new java.net.URL(str).getHost();
        } catch (java.lang.Exception unused) {
        }
        return host == null ? "" : host;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(EZpvd(str, this.OLrzqt, false));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        return copydefault(EZpvd(this.OLrzqt));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(KWHzl(str, this.OLrzqt, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu KWHzl(final C9184bQm c9184bQm, final long j, final java.lang.String str, final ResponseData responseData) {
        boolean z;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (C33129mqd.copydefault(((AAAccountInfo) data).getVersion(), "3")) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                z = Intrinsics.EZpvd(((AAAccountInfo) data2).isDeploye(), java.lang.Boolean.TRUE);
            }
            c9184bQm.AYXKKw = z;
            if (z) {
                AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bQr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58259yxs
                    public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                        C9184bQm.AEQbTJ(this.OLrzqt, interfaceC58257yxq);
                    }
                });
                final Function1 function1 = new Function1() { // from class: o.bQv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9184bQm.EZpvd(responseData, j, str, c9184bQm, (java.lang.String) obj);
                    }
                };
                return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bQs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9184bQm.DbNXlk(function1, obj);
                    }
                });
            }
            c9184bQm.DLWbHP().AEQbTJ(new C9810bcc(false));
            return AbstractC58260yxt.copydefault(Unit.INSTANCE);
        }
        return AbstractC58260yxt.copydefault(Unit.INSTANCE);
    }
}
