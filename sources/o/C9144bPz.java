package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bPz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9144bPz extends AbstractC8918bLl {
    @Override // o.AbstractC8918bLl
    public AbstractC58260yxt<Unit> gEmmrt() {
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9144bPz.copydefault(this.copydefault, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(final C9144bPz c9144bPz, final InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.String raw;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        final EVMMessageSignData eVMMessageSignData = (EVMMessageSignData) c9144bPz.QVsKAR();
        SignType signTypeAhwBna = c9144bPz.AhwBna();
        SignType signType = SignType.TYPED_MESSAGE;
        if (signTypeAhwBna == signType) {
            try {
                Result.Application application = Result.Companion;
                if (c9144bPz.QwvEab() == 2 || c9144bPz.QwvEab() == 5) {
                    raw = eVMMessageSignData.getRaw();
                    java.lang.String data = eVMMessageSignData.getData();
                    if (raw == null || raw.length() == 0) {
                        raw = data;
                    }
                } else {
                    raw = eVMMessageSignData.getData();
                }
                if (JsonParser.parseString(raw).isJsonObject()) {
                    if (c9144bPz.dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
                        c9144bPz.EZpvd(raw, new Function1() { // from class: o.bPC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9144bPz.KWHzl(this.AEQbTJ, interfaceC58257yxq, (JsonObject) obj);
                            }
                        });
                        return;
                    } else {
                        c9144bPz.AEQbTJ(raw, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bPD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9144bPz.OLrzqt(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                            }
                        });
                        return;
                    }
                }
                c9144bPz.AEQbTJ(raw, eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bPB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9144bPz.EZpvd(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                    }
                });
                return;
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                if (Result.m7383isFailureimpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th)))) {
                    c9144bPz.AEQbTJ(eVMMessageSignData.getData(), eVMMessageSignData.getSignTypedDataVersion(), new Function1() { // from class: o.bPF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C9144bPz.AYXKKw(eVMMessageSignData, interfaceC58257yxq, (java.lang.String) obj);
                        }
                    });
                    return;
                }
            }
        } else if (c9144bPz.dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            try {
                Result.Application application3 = Result.Companion;
                JsonObject asJsonObject = JsonParser.parseString(eVMMessageSignData.getData()).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                c9144bPz.EZpvd(c9144bPz.AEQbTJ(asJsonObject));
                if (c9144bPz.OLrzqt() != null) {
                    c9144bPz.copydefault(signType);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (c9144bPz.AhwBna() == SignType.PERSONAL_MESSAGE && !C59449zhJ.AYXKKw(eVMMessageSignData.getData(), EIP1271Verifier.hexPrefix, true)) {
                eVMMessageSignData.setData(C54910xZw.OLrzqt(xYW.AEQbTJ.values(eVMMessageSignData.getData())));
            }
        }
        interfaceC58257yxq.onSuccess(Unit.INSTANCE);
    }

    public static final Unit KWHzl(C9144bPz c9144bPz, InterfaceC58257yxq interfaceC58257yxq, JsonObject jsonObject) {
        if (jsonObject != null) {
            c9144bPz.EZpvd(c9144bPz.AEQbTJ(jsonObject));
        }
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AYXKKw(EVMMessageSignData eVMMessageSignData, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eVMMessageSignData.setData(str);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        if (AhwBna() != SignType.TYPED_MESSAGE) {
            return yDY.copydefault(9);
        }
        return new java.util.ArrayList<>();
    }

    @Override // o.AbstractC8918bLl
    public boolean djBIcL() {
        if (dUDNAs().AEQbTJ(WalletType.HardwareWallet) && OLrzqt() == null) {
            return AkhnZx();
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(EZpvd(str, ((EVMMessageSignData) QVsKAR()).getData(), AkhnZx()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        return copydefault(EZpvd(((EVMMessageSignData) QVsKAR()).getData()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(KWHzl(str, ((EVMMessageSignData) QVsKAR()).getData(), AkhnZx()));
    }

    private final boolean AkhnZx() {
        return AhwBna() == SignType.PERSONAL_MESSAGE;
    }
}
