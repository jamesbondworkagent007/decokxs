package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import o.InterfaceC11794cam;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C11796cao<SignData extends StarkNetContractSignData> extends AbstractC8601bFm<C11840cbf, SignData> implements InterfaceC11794cam {
    public StarkNetContractSignData.StarkNetRequestData AYXKKw;
    public StarkNetSignInfo fetchVPNInfo;
    public C11838cbd djBIcL = C11838cbd.Companion.EZpvd();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.caw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11796cao.KWHzl(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.cat
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11796cao.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11794cam
    public C11838cbd AEQbTJ() {
        return this.djBIcL;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StarkNetContractSignData.StarkNetRequestData starkNetRequestData) {
        Intrinsics.checkNotNullParameter(starkNetRequestData, "");
        this.AYXKKw = starkNetRequestData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull C11838cbd c11838cbd) {
        Intrinsics.checkNotNullParameter(c11838cbd, "");
        this.djBIcL = c11838cbd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StarkNetSignInfo RcXXUw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(StarkNetSignInfo starkNetSignInfo) {
        this.fetchVPNInfo = starkNetSignInfo;
    }

    public C11838cbd EZpvd(@NotNull WalletGasLimitRes walletGasLimitRes) {
        return InterfaceC11794cam.Application.OLrzqt(this, walletGasLimitRes);
    }

    @Override // o.InterfaceC11794cam
    public java.lang.String KWHzl(java.lang.String str) {
        return InterfaceC11794cam.Application.EZpvd(this, str);
    }

    public final StarkNetContractSignData.StarkNetRequestData fARcdN() {
        StarkNetContractSignData.StarkNetRequestData starkNetRequestData = this.AYXKKw;
        if (starkNetRequestData != null) {
            return starkNetRequestData;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C11840cbf DXXBbs() {
        return (C11840cbf) this.AhwBna.getValue();
    }

    public static final C11840cbf KWHzl(C11796cao c11796cao) {
        return new C11840cbf(c11796cao, c11796cao);
    }

    public final C11845cbk djSkpj() {
        return (C11845cbk) this.valueOf.getValue();
    }

    public static final C11845cbk AEQbTJ(C11796cao c11796cao) {
        return new C11845cbk(c11796cao);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.caz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdKWHzl = abstractC58185ywXUeEOUB.KWHzl(new InterfaceC58229yxO() { // from class: o.cax
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.giSNqX(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.caA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11796cao.KWHzl(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, interfaceC60096zvdKWHzl, new InterfaceC58223yxI() { // from class: o.caB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11796cao.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C11796cao c11796cao, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11796cao.KWHzl(true);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(C11796cao c11796cao, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c11796cao.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!z) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return super.KWHzl(true);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<java.util.List<TxToastCheckRes>> OLrzqt(@NotNull TxToastCheckReq txToastCheckReq) {
        Intrinsics.checkNotNullParameter(txToastCheckReq, "");
        txToastCheckReq.setInputData(djSkpj().OLrzqt());
        return super.OLrzqt(txToastCheckReq);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        java.lang.Object objM7377constructorimpl;
        java.util.List<StarkNetContractSignData.StarkNetCall> calls;
        super.q_();
        try {
            Result.Application application = Result.Companion;
            KSerializer<StarkNetContractSignData.StarkNetRequestData> kSerializerSerializer = StarkNetContractSignData.StarkNetRequestData.Companion.serializer();
            java.lang.String data = QVsKAR().getData();
            if (data == null) {
                data = "";
            }
            java.lang.Object objOLrzqt = C54907xZt.OLrzqt(kSerializerSerializer, data);
            StarkNetContractSignData.StarkNetExecutionRequest executionRequest = ((StarkNetContractSignData.StarkNetRequestData) objOLrzqt).getExecutionRequest();
            if (executionRequest != null && (calls = executionRequest.getCalls()) != null) {
                for (StarkNetContractSignData.StarkNetCall starkNetCall : calls) {
                    java.lang.String contractAddress = starkNetCall.getContractAddress();
                    if (contractAddress == null || contractAddress.length() == 0) {
                        starkNetCall.setContractAddress(starkNetCall.getContract_address());
                    }
                    java.lang.String entrypoint = starkNetCall.getEntrypoint();
                    if (entrypoint == null || entrypoint.length() == 0) {
                        starkNetCall.setEntrypoint(starkNetCall.getEntry_point());
                    }
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((StarkNetContractSignData.StarkNetRequestData) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        StarkNetContractSignData.StarkNetRequestData starkNetRequestData = new StarkNetContractSignData.StarkNetRequestData((java.lang.String) null, (StarkNetContractSignData.StarkNetExecutionRequest) null, 3, (DefaultConstructorMarker) null);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = starkNetRequestData;
        }
        EZpvd((StarkNetContractSignData.StarkNetRequestData) objM7377constructorimpl);
        return true;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        return z ? QVsKAR().getData() : "";
    }

    public static final kotlin.Pair finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.cap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.AYXKKw(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.caq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C11796cao c11796cao, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11796cao.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        StarkNetSignInfo starkNetSignInfoRcXXUw = RcXXUw();
        if (starkNetSignInfoRcXXUw == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(starkNetSignInfoRcXXUw);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Application(starkNetSignInfoRcXXUw, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.OLrzqt(this.KWHzl, (StarkNetSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.caG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd OLrzqt(C11796cao c11796cao, StarkNetSignInfo starkNetSignInfo) {
        Intrinsics.checkNotNullParameter(starkNetSignInfo, "");
        c11796cao.copydefault(starkNetSignInfo);
        return c11796cao.EZpvd();
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.util.List<StarkNetContractSignData.StarkNetCall> calls;
        StarkNetContractSignData.StarkNetCall starkNetCall;
        java.lang.String to = QVsKAR().getTo();
        StarkNetContractSignData.StarkNetExecutionRequest executionRequest = fARcdN().getExecutionRequest();
        java.lang.String contractAddress = (executionRequest == null || (calls = executionRequest.getCalls()) == null || (starkNetCall = (StarkNetContractSignData.StarkNetCall) CollectionsKt___CollectionsKt.firstOrNull(calls)) == null) ? null : starkNetCall.getContractAddress();
        if (contractAddress == null) {
            contractAddress = "";
        }
        return (to == null || to.length() == 0) ? contractAddress : to;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return QwvEab() == 3 ? "5" : "3";
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        java.lang.String from = QVsKAR().getFrom();
        return from == null ? "" : from;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl();
        final Function1 function1 = new Function1() { // from class: o.can
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.car
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C11796cao c11796cao, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11796cao.EZpvd();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public java.lang.String OLrzqt() {
        return djSkpj().OLrzqt();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(htlTjW(), OLrzqt(), "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(dHguZz().AhwBna()), (496 & 16) != 0 ? null : "0", (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), htlTjW(), zLjUOn(), 5, (java.lang.String) null, zuBGHE(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.caE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11796cao.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.caC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.dvKsVJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return C54862xYb.convertToBigIntegerString$default(QVsKAR().getValue(), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = UeEOUB();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final ActionBar actionBar = new ActionBar(this, str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cas
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11796cao.gGvvIC(actionBar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.cao$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ C11796cao<SignData> KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C11796cao<SignData> c11796cao, java.lang.String str) {
            this.KWHzl = c11796cao;
            this.copydefault = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                SignedTx signedTxOLrzqt = this.KWHzl.djSkpj().OLrzqt(this.copydefault);
                java.lang.String tx = signedTxOLrzqt.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                C11796cao<SignData> c11796cao = this.KWHzl;
                java.lang.String tx2 = signedTxOLrzqt.getTx();
                Intrinsics.copydefault((java.lang.Object) tx2);
                java.lang.String txHash = signedTxOLrzqt.getTxHash();
                java.lang.String str = txHash == null ? "" : txHash;
                StarkNetSignInfo starkNetSignInfoRcXXUw = this.KWHzl.RcXXUw();
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c11796cao, tx2, str, null, new StarkNetExtJson(C54862xYb.convertToBigIntegerString$default(starkNetSignInfoRcXXUw != null ? starkNetSignInfoRcXXUw.getNonce() : null, true, (RoundingMode) null, 2, (java.lang.Object) null), this.KWHzl.dHguZz().AhwBna(), null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C11796cao c11796cao, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11796cao.OLrzqt(c11796cao.EZpvd((WalletGasLimitRes) data));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AEQbTJ(C11796cao c11796cao, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11796cao.copydefault(((SignInfo) data).getSupportPush());
            KSerializer<StarkNetSignInfo> kSerializerSerializer = StarkNetSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c11796cao.copydefault((StarkNetSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, info.toString()));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX INFO: renamed from: o.cao$Application */
    public static final class Application<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<StarkNetSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cao.Application.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cao.Application.5
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cao.Application.3
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) StarkNetSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.KWHzl;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }
}
