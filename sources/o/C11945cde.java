package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonInputData;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonMintlessJettonInfo;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import o.InterfaceC11834cbZ;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.cde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11945cde extends AbstractC8664bGw<C11917cdC, TransferSignData> implements InterfaceC11834cbZ {
    public java.lang.String AEQbTJ;
    public TonSignInfo AhwBna;
    public java.lang.String EZpvd;
    public InterfaceC58217yxC KWHzl;
    public TonMintlessJettonInfo OLrzqt;
    public InterfaceC60094zvb valueOf;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.cdv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11945cde.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.cdy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11945cde.OLrzqt(this.AEQbTJ);
        }
    });
    public java.lang.String djBIcL = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11834cbZ
    public TonMintlessJettonInfo AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(java.lang.String str) {
        this.AEQbTJ = str;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC9747bbS
    public int KWHzl() {
        return 250;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11834cbZ
    public void OLrzqt(@NotNull TonMintlessJettonInfo tonMintlessJettonInfo) {
        Intrinsics.checkNotNullParameter(tonMintlessJettonInfo, "");
        this.OLrzqt = tonMintlessJettonInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9747bbS
    public java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        this.AhwBna = tonSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(java.lang.String str) {
        this.EZpvd = str;
    }

    @Override // o.InterfaceC11834cbZ
    public boolean DbNXlk() {
        return InterfaceC11834cbZ.StateListAnimator.OLrzqt(this);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QVAiDq() {
        return InterfaceC11834cbZ.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC11834cbZ
    public java.lang.String djBIcL() {
        return InterfaceC11834cbZ.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC11834cbZ
    public java.lang.String gEmmrt() {
        return InterfaceC11834cbZ.StateListAnimator.EZpvd(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: OcIXYQ, reason: merged with bridge method [inline-methods] */
    public C11917cdC fJNWhG() {
        return (C11917cdC) this.copydefault.getValue();
    }

    public static final C11917cdC AEQbTJ(C11945cde c11945cde) {
        return new C11917cdC(c11945cde, c11945cde);
    }

    private final C11919cdE QUSxYX() {
        return (C11919cdE) this.AYXKKw.getValue();
    }

    public static final C11919cdE OLrzqt(C11945cde c11945cde) {
        return new C11919cdE(c11945cde, c11945cde);
    }

    @Override // o.InterfaceC11891ccd
    public TonSignInfo AEQbTJ() {
        TonSignInfo tonSignInfo = this.AhwBna;
        if (tonSignInfo != null) {
            return tonSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC11834cbZ
    public boolean isConnected() {
        return C_();
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function2 function2 = new Function2() { // from class: o.cdn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11945cde.copydefault(this.OLrzqt, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXUeEOUB, new InterfaceC58223yxI() { // from class: o.cdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11945cde.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(C11945cde c11945cde, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c11945cde.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        return ORxRYg();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public boolean q_() {
        super.q_();
        java.lang.String memo = ((TransferSignData) QVsKAR()).getMemo();
        if (memo == null) {
            memo = "";
        }
        fJNWhG(memo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.cdf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.valueOf(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair valueOf(C11945cde c11945cde, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11945cde.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    public static final Unit iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.cdg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.AhwBna(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AhwBna(C11945cde c11945cde, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11945cde.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        TonSignInfo tonSignInfoAEQbTJ = AEQbTJ();
        if (tonSignInfoAEQbTJ == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(tonSignInfoAEQbTJ);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Application(tonSignInfoAEQbTJ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cdq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.KWHzl(this.EZpvd, (TonSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cdt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(C11945cde c11945cde, TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        c11945cde.copydefault(tonSignInfo);
        c11945cde.zuBGHE();
        return c11945cde.djSkpj();
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ORxRYg() {
        InterfaceC60094zvb interfaceC60094zvb = this.valueOf;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.cdz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.gEmmrt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.AxsJAYsNCnLh(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.EZpvd(this.copydefault, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.cdx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11945cde.DAIeex(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair gEmmrt(C11945cde c11945cde, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11945cde.fJNWhG().KWHzl(2);
        }
        return C56390yDp.OLrzqt(pair.getFirst(), (java.lang.String) pair.getSecond());
    }

    public static final void DAIeex(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C11945cde c11945cde, InterfaceC60094zvb interfaceC60094zvb) {
        c11945cde.valueOf = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        super.AhwBna();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(AEQbTJ().getMinTonLimit(), fJNWhG().AEQbTJ()), false, (RoundingMode) null, 3, (java.lang.Object) null);
        DLWbHP().AEQbTJ(new C9885bdy(OLrzqt(strConvertToBigIntegerString$default), C54870xYj.KWHzl(strConvertToBigIntegerString$default, dHguZz().valueOf(), dHguZz().AkhnZx(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : java.lang.Boolean.valueOf(dHguZz().getNewProxyInstance()), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : true, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)));
    }

    public final boolean OLrzqt(java.lang.String str) {
        if (fHqPtx().DCUTEIddSDPG()) {
            return C33129mqd.copydefault(AbstractC8564bFB.getFeeCoinCheckBalance$default(this, null, 1, null), str);
        }
        return true;
    }

    public static final InterfaceC60096zvd RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDNCPSb = dNCPSb();
        final Function1 function1 = new Function1() { // from class: o.cdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.EZpvd(this.EZpvd, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDNCPSb.KWHzl(new InterfaceC58229yxO() { // from class: o.cdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(C11945cde c11945cde, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
        }
        TonSignedTx tonSignedTxEZpvd = c11945cde.QUSxYX().EZpvd(str);
        if (tonSignedTxEZpvd == null || tonSignedTxEZpvd.getTx().length() == 0) {
            return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c11945cde, tonSignedTxEZpvd.getTx(), tonSignedTxEZpvd.getTxHash(), null, new TonExtJson(C54862xYb.convertToBigIntegerString$default(c11945cde.AEQbTJ().getNonce(), true, (RoundingMode) null, 2, (java.lang.Object) null), c11945cde.DbNXlk() ? java.lang.Boolean.TRUE : null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDNCPSb = dNCPSb();
        final Function1 function1 = new Function1() { // from class: o.cdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.djBIcL(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDNCPSb.KWHzl(new InterfaceC58229yxO() { // from class: o.cdj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(C11945cde c11945cde, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11945cde.djSkpj();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dNCPSb() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), DWgRXt(), (java.lang.String) null, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        TonSignedTx tonSignedTxCopydefault = QUSxYX().copydefault();
        if (tonSignedTxCopydefault == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), C54907xZt.encodeToString$default(TonInputData.Companion.serializer(), new TonInputData(tonSignedTxCopydefault.getAddress(), tonSignedTxCopydefault.getTx(), tonSignedTxCopydefault.getCode(), tonSignedTxCopydefault.getData(), true), false, 2, null), "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cdk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11945cde.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11945cde.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.InterfaceC9747bbS
    public void EZpvd(@NotNull java.lang.String str) {
        DataInputModuleModel.DataInputItem data;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zKWHzl = KWHzl(str);
        UlJrfe().AEQbTJ(new C9800bcS(zKWHzl));
        if (zKWHzl) {
            fJNWhG(str);
            java.util.List<BaseModel<?>> listUSBtdM = USBtdM();
            if (listUSBtdM != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listUSBtdM) {
                    if (obj instanceof DataInputModuleModel) {
                        arrayList.add(obj);
                    }
                }
                DataInputModuleModel dataInputModuleModel = (DataInputModuleModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (dataInputModuleModel != null && (data = dataInputModuleModel.getData()) != null) {
                    data.setContent(str);
                }
            }
            zuBGHE();
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
            final Function1 function1 = new Function1() { // from class: o.cds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C11945cde.AYXKKw(this.AEQbTJ, (kotlin.Pair) obj2);
                }
            };
            this.KWHzl = abstractC58185ywXDjSkpj.AEQbTJ(new InterfaceC58227yxM() { // from class: o.cdr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C11945cde.QKudOq(function1, obj2);
                }
            });
        }
    }

    public static final void QKudOq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C11945cde c11945cde, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11945cde.fJNWhG().KWHzl(2);
        }
        return Unit.INSTANCE;
    }

    public final void zuBGHE() {
        UlJrfe().AEQbTJ(new C9802bcU(QKVWgx() || copydefault().length() > 0));
    }

    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes.length <= KWHzl();
    }

    /* JADX INFO: renamed from: o.cde$Application */
    public static final class Application<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.Object obj, java.lang.String str) {
            this.AEQbTJ = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<TonSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.cde.Application.3
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.cde.Application.5
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.cde.Application.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) TonSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.AEQbTJ;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    public final boolean QKVWgx() {
        return !Intrinsics.EZpvd(AEQbTJ().getCheckMemo(), java.lang.Boolean.TRUE);
    }

    public static final InterfaceC60096zvd AEQbTJ(C11945cde c11945cde, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11945cde.copydefault(((SignInfo) data).getSupportPush());
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<TonSignInfo> kSerializerSerializer = TonSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            kotlinx.serialization.json.JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c11945cde.copydefault((TonSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            c11945cde.zuBGHE();
            return c11945cde.QVAiDq();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair KWHzl(C11945cde c11945cde, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11945cde.AhwBna(((WalletGasLimitRes) data).getGasLimit());
            if (c11945cde.fHqPtx().DCUTEIddSDPG()) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c11945cde.valueOf(((WalletGasLimitRes) data2).getInvokeNotificationFee());
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
