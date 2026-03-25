package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.ExtFeeResp;
import com.okinc.business.defi.biz.net.bean.InputDataReq;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountKaiaTransaction;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.evm.OpCalDataTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC8919bLm;
import o.C8972bMm;
import o.InterfaceC8931bLy;
import o.InterfaceC9730bbB;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8972bMm<SignData extends EVMContractSignData> extends AbstractC8913bLg<C9312bTH, SignData> implements InterfaceC8931bLy, InterfaceC9743bbO, InterfaceC9736bbH {
    public boolean ORxRYg;
    public boolean OcIXYQ;
    public java.lang.String QUSxYX;
    public final InterfaceC56387yDm QVAiDq;
    public WalletGasLimitRes QbewEr;
    public java.lang.String QfsBiF;
    public SignData RJOkX;
    public java.util.ArrayList<java.lang.String> RcXXUw;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public java.lang.Integer dNCPSb;
    public SignData djSkpj;
    public java.lang.String dvKsVJ;
    public EvmSignInfo dxcTrN;
    public java.lang.String fFgQHt;
    public java.lang.Integer fZBcTu;
    public final C8955bMV fetchVPNInfo;
    public java.lang.String finit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8972bMm() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void AEQbTJ(java.lang.String str) {
        this.QUSxYX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.ORxRYg = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(java.lang.String str) {
        this.QfsBiF = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.OcIXYQ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes AkhnZx() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public java.lang.String AuCTel() {
        return this.QUSxYX;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DGOPHZDGOPHZ() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DGUQLI() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer DWgRXt() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public java.lang.String DbNXlk() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DcqEDu() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KDccX() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9736bbH
    public java.lang.String KWHzl(int i) {
        return this.fetchVPNInfo.KWHzl(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull WalletGasLimitRes walletGasLimitRes) {
        Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
        this.QbewEr = walletGasLimitRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9736bbH
    public java.lang.String copydefault(int i, boolean z) {
        return this.fetchVPNInfo.copydefault(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9736bbH
    public InterfaceC9730bbB.StateListAnimator copydefault(int i) {
        return this.fetchVPNInfo.copydefault(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9736bbH
    public void copydefault(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo.copydefault(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull EvmSignInfo evmSignInfo) {
        Intrinsics.checkNotNullParameter(evmSignInfo, "");
        this.dxcTrN = evmSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void copydefault(java.lang.String str) {
        this.UeEOUB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9736bbH
    public int djBIcL() {
        return this.fetchVPNInfo.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fHqPtx() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String flVtFt() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8955bMV giSNqX() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> iZzfmt() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(java.lang.String str) {
        this.finit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public EvmSignInfo uzCIH() {
        return this.dxcTrN;
    }

    public int DGOPHZ() {
        return InterfaceC8931bLy.StateListAnimator.AYXKKw(this);
    }

    @Override // o.InterfaceC8931bLy
    public java.lang.String QKVWgx() {
        return InterfaceC8931bLy.StateListAnimator.djBIcL(this);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC8931bLy.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC8931bLy
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        InterfaceC8931bLy.StateListAnimator.AEQbTJ(this, str, str2, str3);
    }

    public int fIwbmz() {
        return InterfaceC8931bLy.StateListAnimator.gEmmrt(this);
    }

    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes fetchVPNInfo() {
        return InterfaceC8931bLy.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC8931bLy
    public boolean getFieldNames() {
        return InterfaceC8931bLy.StateListAnimator.AkhnZx(this);
    }

    @Override // o.InterfaceC8931bLy
    public boolean hDKMBd() {
        return InterfaceC8931bLy.StateListAnimator.AhwBna(this);
    }

    @Override // o.InterfaceC8931bLy
    public EvmSignInfoGasPrice isConnected() {
        return InterfaceC8931bLy.StateListAnimator.KWHzl(this);
    }

    @Override // o.InterfaceC8931bLy
    public int iwGUEr() {
        return InterfaceC8931bLy.StateListAnimator.valueOf(this);
    }

    @Override // o.InterfaceC8931bLy
    public void valueOf(java.lang.String str) {
        InterfaceC8931bLy.StateListAnimator.EZpvd(this, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.bMV:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bMV:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:74) call: o.bMV.<init>():void type: CONSTRUCTOR) : (r1v0 o.bMV))
 A[MD:(o.bMV):void (m)] (LINE:73) call: o.bMm.<init>(o.bMV):void type: THIS */
    public /* synthetic */ C8972bMm(C8955bMV c8955bMV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8955bMV() : c8955bMV);
    }

    public C8972bMm(@NotNull C8955bMV c8955bMV) {
        Intrinsics.checkNotNullParameter(c8955bMV, "");
        this.fetchVPNInfo = c8955bMV;
        this.QVAiDq = C56392yDr.copydefault(new Function0() { // from class: o.bMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8972bMm.AEQbTJ(this.copydefault);
            }
        });
        this.dxcTrN = new EvmSignInfo((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (EvmSignInfoGasPrice) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
        this.QbewEr = new WalletGasLimitRes((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16383, (DefaultConstructorMarker) null);
        this.OcIXYQ = true;
        this.ORxRYg = true;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/bTG; */
    @Override // o.InterfaceC8931bLy
    /* JADX INFO: renamed from: fvQaOB, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C9312bTH fJNWhG() {
        return (C9312bTH) this.QVAiDq.getValue();
    }

    public static final C9312bTH AEQbTJ(C8972bMm c8972bMm) {
        return new C9312bTH(c8972bMm, c8972bMm);
    }

    @Override // o.AbstractC8913bLg, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        this.fetchVPNInfo.copydefault((C8972bMm<?>) this);
        return super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        dNCPSb();
        if (gwTjWJ()) {
            abstractC58185ywXKWHzl = super.QHmsKR();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        }
        final TaskDescription taskDescription = new TaskDescription(this);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bMr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.OqFWZa(taskDescription, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.bMm$TaskDescription */
    public static final class TaskDescription implements Function1<?, InterfaceC60096zvd<? extends kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>>> {
        public final /* synthetic */ C8972bMm<SignData> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C8972bMm<SignData> c8972bMm) {
            this.KWHzl = c8972bMm;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends kotlin.Pair<java.lang.Boolean, java.lang.String>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                AbstractC58185ywX abstractC58185ywXDxcTrN = C8972bMm.super.dxcTrN();
                final C8972bMm<SignData> c8972bMm = this.KWHzl;
                final Function1 function1 = new Function1() { // from class: o.bMP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8972bMm.TaskDescription.OLrzqt(c8972bMm, (kotlin.Pair) obj);
                    }
                };
                return abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C8972bMm.TaskDescription.EZpvd(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(pair);
        }

        public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        public static final kotlin.Pair OLrzqt(C8972bMm c8972bMm, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            c8972bMm.DXXBbs().KWHzl(0);
            return pair;
        }
    }

    public static final InterfaceC60096zvd OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: QVsKAR()Lcom/okinc/business/defi/api/model/tx/signdata/BaseSignData; */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /* JADX INFO: renamed from: UrRBLY, reason: merged with bridge method [inline-methods] */
    public SignData QVsKAR() {
        SignData signdata = (SignData) super.QVsKAR();
        if (!Intrinsics.EZpvd(this.RJOkX, signdata)) {
            this.djSkpj = (SignData) xVA.EZpvd(signdata);
            this.RJOkX = signdata;
        }
        SignData signdata2 = this.djSkpj;
        if (signdata2 != null) {
            return signdata2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final InterfaceC60096zvd QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        EvmSignInfoGasPrice gasPrice = uzCIH().getGasPrice();
        if (gasPrice == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(gasPrice);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ActionBar(gasPrice, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bMv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.EZpvd(this.AEQbTJ, (EvmSignInfoGasPrice) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd EZpvd(C8972bMm c8972bMm, EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        c8972bMm.uzCIH().setGasPrice(evmSignInfoGasPrice);
        return c8972bMm.DsrFlB();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DsrFlB() {
        return DBxZfM();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
        Gson gson = new Gson();
        java.lang.Object objEZpvd = xVA.EZpvd(super.QVsKAR());
        EVMContractSignData eVMContractSignData = (EVMContractSignData) objEZpvd;
        eVMContractSignData.setTo(eVMContractSignDataQVsKAR.getTo());
        eVMContractSignData.setData(eVMContractSignDataQVsKAR.getData());
        if ((eVMContractSignDataQVsKAR instanceof EVM5792ContractSignData) && (eVMContractSignData instanceof EVM5792ContractSignData)) {
            ((EVM5792ContractSignData) eVMContractSignData).setId(((EVM5792ContractSignData) eVMContractSignDataQVsKAR).getId());
        }
        Unit unit = Unit.INSTANCE;
        preExecTransactionReqRdAHlO.setDappData(gson.toJson(objEZpvd));
        preExecTransactionReqRdAHlO.setMethod("eth_sendTransaction");
        return preExecTransactionReqRdAHlO;
    }

    public final ApproveInfoModuleModel.ApproveInfoListItem AEQbTJ(PreExecTransactionRes preExecTransactionRes) {
        TxInfoItem txInfo;
        java.util.List<BaseModel<?>> moduleList;
        ApproveInfoModuleModel.ApproveInfoItem data;
        java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList;
        java.lang.Object obj = null;
        if (!gwTjWJ() || !zblBkD() || preExecTransactionRes == null || (txInfo = preExecTransactionRes.getTxInfo()) == null || (moduleList = txInfo.getModuleList()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : moduleList) {
            if (obj2 instanceof ApproveInfoModuleModel) {
                arrayList.add(obj2);
            }
        }
        ApproveInfoModuleModel approveInfoModuleModel = (ApproveInfoModuleModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (approveInfoModuleModel == null || (data = approveInfoModuleModel.getData()) == null || (approveInfoList = data.getApproveInfoList()) == null) {
            return null;
        }
        java.util.Iterator<T> it = approveInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String strZLjUOn = zLjUOn();
            ApproveInfoModuleModel.TxInfoItem tokenInfo = ((ApproveInfoModuleModel.ApproveInfoListItem) next).getTokenInfo();
            if (C59449zhJ.gEmmrt(strZLjUOn, tokenInfo != null ? tokenInfo.getAddress() : null, true)) {
                obj = next;
                break;
            }
        }
        return (ApproveInfoModuleModel.ApproveInfoListItem) obj;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        if (gwTjWJ()) {
            if (zblBkD()) {
                ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItemAEQbTJ = AEQbTJ(preExecTransactionRes);
                if (approveInfoListItemAEQbTJ != null) {
                    OLrzqt(approveInfoListItemAEQbTJ);
                    ApproveInfoModuleModel.TxInfoItem tokenInfo = approveInfoListItemAEQbTJ.getTokenInfo();
                    Intrinsics.copydefault(tokenInfo);
                    java.lang.String address = tokenInfo.getAddress();
                    java.lang.String symbol = tokenInfo.getSymbol();
                    java.lang.String str = symbol == null ? "" : symbol;
                    int iCopydefault = C11600cUg.copydefault(tokenInfo.getDecimals());
                    java.lang.String imageUrl = tokenInfo.getImageUrl();
                    KYSApprovalType.Application application = KYSApprovalType.Companion;
                    ApproveInfoModuleModel.Spender spender = approveInfoListItemAEQbTJ.getSpender();
                    KYSApprovalType kYSApprovalTypeOLrzqt = application.OLrzqt(spender != null ? spender.getApprovalType() : null);
                    copydefault(new ContractAddressResp((java.lang.String) null, address, str, iCopydefault, imageUrl, java.lang.Boolean.valueOf(kYSApprovalTypeOLrzqt == KYSApprovalType.NFT_AUTHORIZATION || kYSApprovalTypeOLrzqt == KYSApprovalType.NFT_CANCEL_AUTHORIZATION), 0, (java.lang.String) null, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, (DefaultConstructorMarker) null));
                }
                this.fetchVPNInfo.EZpvd(preExecTransactionRes);
            }
            if (ad_() == null && hCLrkq()) {
                OLrzqt(OKWBaseTransaction.TransactionType.Contract);
            }
        }
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        int iQwvEab = QwvEab();
        if (iQwvEab == 2 || iQwvEab == 3 || iQwvEab == 4 || iQwvEab == 5 || iQwvEab == 7) {
            if (newProxyInstance.contains(2)) {
                newProxyInstance.remove((java.lang.Object) 2);
            }
        } else if (OJuSTm().getForceCheckKys() && newProxyInstance.contains(2)) {
            newProxyInstance.remove((java.lang.Object) 2);
        }
        java.lang.String strZLjUOn = zLjUOn();
        if (strZLjUOn.length() == 0 || Intrinsics.EZpvd((java.lang.Object) strZLjUOn, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            newProxyInstance.remove((java.lang.Object) 6);
            newProxyInstance.remove((java.lang.Object) 9);
        }
        return newProxyInstance;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.List<java.lang.String> causeRiskItem;
        java.util.List<java.lang.String> causeRiskItem2;
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        java.util.Iterator<T> it = list.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            java.lang.Integer checkType = ((TxToastCheckRes) it.next()).getCheckType();
            if (checkType != null && checkType.intValue() == 9) {
                KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ab_();
                if (kYSPreTxCheckInfoAb_ != null && (causeRiskItem2 = kYSPreTxCheckInfoAb_.getCauseRiskItem()) != null && causeRiskItem2.contains("eth_sign")) {
                    z = false;
                }
                KYSPreTxCheckInfo kYSPreTxCheckInfoAb_2 = ab_();
                if (kYSPreTxCheckInfoAb_2 != null && (causeRiskItem = kYSPreTxCheckInfoAb_2.getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.EVM_7702_AUTH_ADDRESS_NOT_IN_WHITELIST)) {
                    z2 = false;
                }
            }
        }
        UlJrfe().OLrzqt(yDY.gEmmrt(new C9831bcx(z), new C9830bcw(z2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q_() {
        java.lang.String strOLrzqt;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.String gasLimit;
        EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
        java.lang.String gas = eVMContractSignDataQVsKAR.getGas();
        java.lang.String maxPriorityFeePerGas = null;
        eVMContractSignDataQVsKAR.setGas(gas != null ? C33491mxU.OLrzqt(gas) : null);
        java.lang.String gasPrice = eVMContractSignDataQVsKAR.getGasPrice();
        eVMContractSignDataQVsKAR.setGasPrice(gasPrice != null ? C33491mxU.OLrzqt(gasPrice) : null);
        java.lang.String gasLimit2 = eVMContractSignDataQVsKAR.getGasLimit();
        eVMContractSignDataQVsKAR.setGasLimit(gasLimit2 != null ? C33491mxU.OLrzqt(gasLimit2) : null);
        java.lang.String maxFeePerGas = eVMContractSignDataQVsKAR.getMaxFeePerGas();
        eVMContractSignDataQVsKAR.setMaxFeePerGas(maxFeePerGas != null ? C33491mxU.OLrzqt(maxFeePerGas) : null);
        java.lang.String maxPriorityFeePerGas2 = eVMContractSignDataQVsKAR.getMaxPriorityFeePerGas();
        eVMContractSignDataQVsKAR.setMaxPriorityFeePerGas(maxPriorityFeePerGas2 != null ? C33491mxU.OLrzqt(maxPriorityFeePerGas2) : null);
        java.lang.String value = eVMContractSignDataQVsKAR.getValue();
        if (value == null || (strOLrzqt = C33491mxU.OLrzqt(value)) == null) {
            strOLrzqt = "0";
        }
        eVMContractSignDataQVsKAR.setValue(strOLrzqt);
        java.lang.String nonce = eVMContractSignDataQVsKAR.getNonce();
        eVMContractSignDataQVsKAR.setNonce(nonce != null ? C33491mxU.OLrzqt(nonce) : null);
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGas()) || C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGasLimit());
        java.lang.String gasLimitRate = eVMContractSignDataQVsKAR.getGasLimitRate();
        boolean z2 = !(gasLimitRate == null || gasLimitRate.length() == 0);
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGasPrice());
        boolean z3 = eVMContractSignDataQVsKAR.getGasRate() != null;
        boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getMaxFeePerGas());
        boolean zOLrzqt3 = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getMaxPriorityFeePerGas());
        if (z && !z2 && zOLrzqt && !z3) {
            num = 0;
        } else if ((!z || z2) && zOLrzqt && !z3) {
            num = 1;
        } else if (z && !z2 && (!zOLrzqt || z3)) {
            num = 2;
        } else {
            num = 3;
        }
        this.dNCPSb = num;
        if ((num != null && num.intValue() == 0) || ((num2 = this.dNCPSb) != null && num2.intValue() == 1)) {
            num3 = null;
        } else {
            java.lang.Integer gasRate = QVsKAR().getGasRate();
            if (gasRate != null && gasRate.intValue() == 3) {
                num3 = 31;
            } else if (gasRate != null && gasRate.intValue() == 2) {
                num3 = 32;
            } else if (gasRate != null && gasRate.intValue() == 1) {
                num3 = 33;
            }
        }
        this.fZBcTu = num3;
        if (!z || z2) {
            gasLimit = null;
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGas())) {
            gasLimit = eVMContractSignDataQVsKAR.getGas();
            if (gasLimit == null) {
                gasLimit = "";
            }
        } else {
            gasLimit = eVMContractSignDataQVsKAR.getGasLimit();
        }
        this.aKErDB = gasLimit;
        this.finit = (!zOLrzqt || z3) ? null : eVMContractSignDataQVsKAR.getGasPrice();
        this.dvKsVJ = (!zOLrzqt2 || z3) ? null : eVMContractSignDataQVsKAR.getMaxFeePerGas();
        if (zOLrzqt3 && !z3) {
            maxPriorityFeePerGas = eVMContractSignDataQVsKAR.getMaxPriorityFeePerGas();
        }
        this.fFgQHt = maxPriorityFeePerGas;
        return super.q_();
    }

    /* JADX INFO: renamed from: o.bMm$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.Object EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Object obj, java.lang.String str) {
            this.EZpvd = obj;
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<EvmSignInfoGasPrice> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.AEQbTJ;
            java.lang.Object obj = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bMm.ActionBar.1
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bMm.ActionBar.2
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bMm.ActionBar.3
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) EvmSignInfoGasPrice.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.EZpvd;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QHmsKR() {
        if (gwTjWJ()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.QHmsKR();
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DNMMPQ() {
        return super.r_();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDNMMPQ = DNMMPQ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final yHO yho = new yHO() { // from class: o.bMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8972bMm.AEQbTJ(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDNMMPQ, abstractC58185ywXDaRZkR, abstractC58185ywXOTwTPd, new InterfaceC58228yxN() { // from class: o.bMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8972bMm.OLrzqt(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair OLrzqt(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair AEQbTJ(C8972bMm c8972bMm, kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        if (!((java.lang.Boolean) pair3.getFirst()).booleanValue()) {
            return pair3;
        }
        c8972bMm.DXXBbs().EZpvd(c8972bMm.dNCPSb, c8972bMm.fZBcTu, c8972bMm.finit, c8972bMm.dvKsVJ, c8972bMm.fFgQHt, c8972bMm.aKErDB);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8919bLm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        PreExecTransactionRes preExecTransactionResQSLkRj;
        TxInfoItem txInfo;
        java.util.List<BaseModel<?>> moduleList;
        Sequence sequenceQVAiDq;
        Sequence sequenceAkhnZx;
        C10854bwM c10854bwM;
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        if (zblBkD() && (preExecTransactionResQSLkRj = QSLkRj()) != null && (txInfo = preExecTransactionResQSLkRj.getTxInfo()) != null && (moduleList = txInfo.getModuleList()) != null && (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(moduleList)) != null) {
            Sequence sequenceDbNXlk = C59467zhb.DbNXlk(sequenceQVAiDq, Application.OLrzqt);
            Intrinsics.copydefault(sequenceDbNXlk, "");
            if (sequenceDbNXlk != null && (sequenceAkhnZx = C59467zhb.AkhnZx(sequenceDbNXlk, new Function1() { // from class: o.bMy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8972bMm.OLrzqt((ApproveInfoModuleModel) obj);
                }
            })) != null) {
                java.util.Iterator it = sequenceAkhnZx.iterator();
                while (it.hasNext()) {
                    ApproveInfoModuleModel.TxInfoItem tokenInfo = ((ApproveInfoModuleModel.ApproveInfoListItem) it.next()).getTokenInfo();
                    java.lang.String address = tokenInfo != null ? tokenInfo.getAddress() : null;
                    if (address != null && address.length() != 0 && (c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, address, dHguZz().fetchVPNInfo(), false, 4, null)) != null) {
                        hashSetJ_.add(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                    }
                }
            }
        }
        return hashSetJ_;
    }

    public static final java.lang.Iterable OLrzqt(ApproveInfoModuleModel approveInfoModuleModel) {
        Intrinsics.checkNotNullParameter(approveInfoModuleModel, "");
        ApproveInfoModuleModel.ApproveInfoItem data = approveInfoModuleModel.getData();
        java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList = data != null ? data.getApproveInfoList() : null;
        return approveInfoList == null ? yDY.AhwBna() : approveInfoList;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to = QVsKAR().getTo();
        return to == null ? "" : to;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        java.lang.String value = QVsKAR().getValue();
        return value == null ? "0" : value;
    }

    @Override // o.InterfaceC8931bLy
    public java.lang.String V_() {
        java.lang.String strAuCTel = AuCTel();
        if (strAuCTel != null) {
            return strAuCTel;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) QVsKAR().getNonce())) {
            return "";
        }
        java.lang.String nonce = QVsKAR().getNonce();
        Intrinsics.copydefault((java.lang.Object) nonce);
        return nonce;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final Function2 function2 = new Function2() { // from class: o.bMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8972bMm.copydefault(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDaRZkR, abstractC58185ywXOTwTPd, new InterfaceC58223yxI() { // from class: o.bMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8972bMm.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(C8972bMm c8972bMm, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c8972bMm.DXXBbs().EZpvd(c8972bMm.dNCPSb, c8972bMm.fZBcTu, c8972bMm.finit, c8972bMm.dvKsVJ, c8972bMm.fFgQHt, c8972bMm.aKErDB);
        c8972bMm.DXXBbs().KWHzl(1);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
        arrayListAuCTelauCTel.add(5);
        return arrayListAuCTelauCTel;
    }

    public static final Unit AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        final Function1 function1 = new Function1() { // from class: o.bMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDaRZkR.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AEQbTJ(C8972bMm c8972bMm, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8972bMm.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8601bFm
    public boolean DTwDnp() {
        if (aKErDB()) {
            return true;
        }
        return super.DTwDnp();
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DaRZkR() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), fERRXa().getAddress(), zLjUOn(), ai_(), AbstractC8601bFm.getInputData$default(this, false, 1, null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.djBIcL(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v10. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DBxZfM() {
        java.lang.String min;
        java.lang.String normal;
        java.lang.String max;
        EvmSignInfoGasPrice gasPrice = uzCIH().getGasPrice();
        EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGasPriceRate()) && C33129mqd.AEQbTJ(eVMContractSignDataQVsKAR.getGasPriceRate(), "0")) {
            java.lang.String oriMin = gasPrice.getOriMin();
            if (oriMin == null || oriMin.length() == 0) {
                min = gasPrice.getMin();
            } else {
                min = gasPrice.getOriMin();
            }
            BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(min, eVMContractSignDataQVsKAR.getGasPriceRate());
            RoundingMode roundingMode = RoundingMode.UP;
            gasPrice.setMin(C54862xYb.convertToString$default(bigDecimalOLrzqt, false, 0, roundingMode, 1, null));
            java.lang.String oriNormal = gasPrice.getOriNormal();
            if (oriNormal == null || oriNormal.length() == 0) {
                normal = gasPrice.getNormal();
            } else {
                normal = gasPrice.getOriNormal();
            }
            gasPrice.setNormal(C54862xYb.convertToString$default(C54862xYb.OLrzqt(normal, eVMContractSignDataQVsKAR.getGasPriceRate()), false, 0, roundingMode, 1, null));
            java.lang.String oriMax = gasPrice.getOriMax();
            if (oriMax == null || oriMax.length() == 0) {
                max = gasPrice.getMax();
            } else {
                max = gasPrice.getOriMax();
            }
            gasPrice.setMax(C54862xYb.convertToString$default(C54862xYb.OLrzqt(max, eVMContractSignDataQVsKAR.getGasPriceRate()), false, 0, roundingMode, 1, null));
        }
        java.lang.Boolean needExtFee = uzCIH().getNeedExtFee();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(needExtFee, bool)) {
            AbstractC58185ywX<ResponseData<ExtFeeResp>> abstractC58185ywXOLrzqt = OFhtUX().OLrzqt(dUDNAs().USBtdM(), dUDNAs().DbNXlk(), new InputDataReq(dHguZz().AhwBna(), RcXXUw()));
            final Function1 function1 = new Function1() { // from class: o.bMl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8972bMm.KWHzl(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8972bMm.hUfVAv(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: renamed from: o.bMm$Application */
    public static final class Application implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof ApproveInfoModuleModel);
        }
    }

    public static final kotlin.Pair hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final java.lang.String RcXXUw() {
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        return xYZ.KWHzl.copydefault(new SignParams(jFetchVPNInfo, jFetchVPNInfo, null, null, null, null, 0, null, false, false, null, 2040, null), new OpCalDataTransaction(zLjUOn(), C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), AbstractC9346bTp.getGasLimit$default(DXXBbs(), 0, 1, null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.String) null, AbstractC8601bFm.getInputData$default(this, false, 1, null), 48, (DefaultConstructorMarker) null));
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OTwTPd() {
        AbstractC58185ywX abstractC58185ywXCopydefault = OFhtUX().copydefault(htlTjW(), AbstractC8601bFm.getInputData$default(this, false, 1, null), zLjUOn(), (496 & 8) != 0 ? null : java.lang.Long.valueOf(dHguZz().AhwBna()), (496 & 16) != 0 ? null : zuBGHE(), (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        java.lang.String data = QVsKAR().getData();
        if (data != null) {
            return data;
        }
        java.lang.String input = QVsKAR().getInput();
        return input == null ? "" : input;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DGgnkA() {
        final java.lang.String data = QVsKAR().getData();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXValueOf = this.fetchVPNInfo.valueOf();
        final Function1 function1 = new Function1() { // from class: o.bMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.AEQbTJ(this.OLrzqt, data, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXValueOf.KWHzl(new InterfaceC58229yxO() { // from class: o.bMx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C8972bMm c8972bMm, final java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = c8972bMm.DaRZkR();
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = c8972bMm.OTwTPd();
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = c8972bMm.KWHzl(false);
            final yHO yho = new yHO() { // from class: o.bMp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C8972bMm.OLrzqt(this.OLrzqt, str, (kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
                }
            };
            return AbstractC58185ywX.EZpvd(abstractC58185ywXDaRZkR, abstractC58185ywXOTwTPd, abstractC58185ywXKWHzl, new InterfaceC58228yxN() { // from class: o.bMt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C8972bMm.copydefault(yho, obj, obj2, obj3);
                }
            });
        }
        c8972bMm.QVsKAR().setData(str);
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final kotlin.Pair copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair OLrzqt(C8972bMm c8972bMm, java.lang.String str, kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        if (!((java.lang.Boolean) pair3.getFirst()).booleanValue()) {
            c8972bMm.QVsKAR().setData(str);
            return pair3;
        }
        c8972bMm.DXXBbs().KWHzl(2);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final ResponseData RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        final Function1 function1 = new Function1() { // from class: o.bMT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.EZpvd(this.KWHzl, str, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return convertToBroadcastModel$default(this, abstractC58185ywXAEQbTJ, null, 1, null);
    }

    public static final ResponseData EZpvd(C8972bMm c8972bMm, java.lang.String str, Unit unit) {
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(unit, "");
        if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strSubstring = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = str;
        }
        if (str.length() == 0) {
            return new ResponseData(-5004, null, null, null, null, null, 62, null);
        }
        if (c8972bMm.aKErDB()) {
            return new ResponseData(0, null, null, null, xYZ.KWHzl.OLrzqt(new SignParams(c8972bMm.dHguZz().fetchVPNInfo(), c8972bMm.dHguZz().fetchVPNInfo(), null, str, null, java.lang.Integer.valueOf(c8972bMm.dUDNAs().finit()), 0, null, false, false, 1, 960, null), c8972bMm.djSkpj()), null, 46, null);
        }
        return new ResponseData(0, null, null, null, xYZ.KWHzl.EZpvd(strSubstring, C33129mqd.valueOf(c8972bMm.QKVWgx()), c8972bMm.UeEOUB()), null, 46, null);
    }

    public final AccountKaiaTransaction djSkpj() {
        C8972bMm<SignData> c8972bMm;
        java.lang.String strCopydefault;
        java.lang.String strConvertToBigIntegerString$default;
        java.lang.String strCopydefault2 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(V_(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String address = fERRXa().getAddress();
        java.lang.String strCopydefault3 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault4 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault5 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.Integer typeInt = QVsKAR().getTypeInt();
        java.lang.String strCopydefault6 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(typeInt != null ? typeInt.toString() : null, false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(DXXBbs(), 0, 1, null);
        if (priorityFee$default == null || (strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(priorityFee$default, false, (RoundingMode) null, 3, (java.lang.Object) null)) == null) {
            c8972bMm = this;
            strCopydefault = null;
        } else {
            strCopydefault = C33491mxU.copydefault(strConvertToBigIntegerString$default);
            c8972bMm = this;
        }
        return new AccountKaiaTransaction(strZLjUOn, address, strCopydefault2, strCopydefault4, strCopydefault5, strCopydefault3, null, strCopydefault6, null, strCopydefault, null, AbstractC8601bFm.getInputData$default(c8972bMm, false, 1, null));
    }

    public final SigData UeEOUB() {
        java.lang.String strConvertToBigIntegerString$default;
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strCopydefault = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        java.lang.String strCopydefault2 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault3 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault4 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(V_(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        int iIwGUEr = iwGUEr();
        java.lang.String strCopydefault5 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(DXXBbs(), 0, 1, null);
        return new SigData(strZLjUOn, strCopydefault, inputData$default, strCopydefault2, strCopydefault3, strCopydefault4, java.lang.String.valueOf(iIwGUEr), strCopydefault5, (priorityFee$default == null || (strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(priorityFee$default, false, (RoundingMode) null, 3, (java.lang.Object) null)) == null) ? null : C33491mxU.copydefault(strConvertToBigIntegerString$default), (java.util.List) null, 512, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        C10854bwM c10854bwMDHguZz = dHguZz();
        LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = ledgerSignHelper.KWHzl(new LedgerSignHelper.StateListAnimator(c10854bwMDHguZz, fERRXa(), (hCLrkq() && ledgerSignHelper.copydefault(c10854bwMDHguZz) == LedgerSupportedApp.Ethereum) ? false : true, iwGUEr(), QKVWgx(), gEmmrt()));
        final Function1 function1 = new Function1() { // from class: o.bML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.djBIcL((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return convertToBroadcastModel$default(this, abstractC58185ywXAEQbTJ, null, 1, null);
    }

    public static final ResponseData accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData djBIcL(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != -5001) {
            return responseData;
        }
        java.lang.String str = (java.lang.String) responseData.getData();
        return new ResponseData(0, null, null, null, str == null ? "" : str, null, 46, null);
    }

    public final boolean hCLrkq() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.Approve || aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove;
    }

    @Override // o.InterfaceC8931bLy
    public java.lang.String gEmmrt() {
        return xYZ.KWHzl.OLrzqt(dHguZz().fetchVPNInfo(), UeEOUB());
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        java.lang.String keystoneSignTx = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
        if (keystoneSignTx != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) keystoneSignTx)) {
            if (!C59449zhJ.AYXKKw(keystoneSignTx, EIP1271Verifier.hexPrefix, true)) {
                keystoneSignTx = EIP1271Verifier.hexPrefix + keystoneSignTx;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, keystoneSignTx, null, 46, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return convertToBroadcastModel$default(this, abstractC58185ywXKWHzl, null, 1, null);
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5013, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        return convertToBroadcastModel$default(this, OneKeySignHelper.copydefault.KWHzl(dUDNAs(), fERRXa(), new EvmTransactionData(iwGUEr(), dHguZz().QKVWgx(), QKVWgx(), gEmmrt(), null, UeEOUB())), null, 1, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final long jQKVWgx = dHguZz().QKVWgx();
        final long jValueOf = C33129mqd.valueOf(QKVWgx());
        return convertToBroadcastModel$default(this, C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8972bMm.KWHzl(jValueOf, this);
            }
        }, new Function2() { // from class: o.bMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8972bMm.copydefault(jQKVWgx, this, jValueOf, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C8972bMm.KWHzl((java.lang.String) obj));
            }
        }), null, 1, null);
    }

    public static final TxMessage KWHzl(long j, C8972bMm c8972bMm) {
        return xYZ.KWHzl.copydefault(j, c8972bMm.UeEOUB());
    }

    public static final java.lang.String copydefault(long j, C8972bMm c8972bMm, long j2, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYZ.KWHzl.EZpvd(j, new EvmSignatureRawValue(c8972bMm.iwGUEr(), java.lang.String.valueOf(j2), rsv.getR(), rsv.getS(), rsv.getV(), str));
    }

    public static final boolean KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !(str.length() == 0);
    }

    public java.lang.String dvKsVJ() {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd;
        if (!hCLrkq() || ((stateListAnimatorEZpvd = EZpvd()) != null && Intrinsics.EZpvd(stateListAnimatorEZpvd.djBIcL(), java.lang.Boolean.TRUE))) {
            return null;
        }
        return OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bMm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX convertToBroadcastModel$default(C8972bMm c8972bMm, AbstractC58185ywX abstractC58185ywX, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToBroadcastModel");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return c8972bMm.AEQbTJ((AbstractC58185ywX<ResponseData<java.lang.String>>) abstractC58185ywX, (java.util.List<EVMAuthorization>) list);
    }

    public static final ResponseData AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AEQbTJ(@NotNull AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX, final java.util.List<EVMAuthorization> list) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        final Function1 function1 = new Function1() { // from class: o.bMu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8972bMm.AEQbTJ(this.OLrzqt, list, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8972bMm.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AEQbTJ(C8972bMm c8972bMm, java.util.List list, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.String str = (java.lang.String) responseData.getData();
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String strAEQbTJ = xYW.AEQbTJ.AEQbTJ(str2, c8972bMm.dHguZz().fetchVPNInfo());
            C9215bRQ c9215bRQKWHzl = c8972bMm.DXXBbs().KWHzl();
            java.lang.String strV_ = c8972bMm.V_();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8972bMm, str2, strAEQbTJ, null, new EVMExtJson(strV_, AbstractC9346bTp.getGasLimit$default(c8972bMm.DXXBbs(), 0, 1, null), C9311bTG.getGasPrice$default(c8972bMm.DXXBbs(), 0, 1, null), C9311bTG.getPriorityFee$default(c8972bMm.DXXBbs(), 0, 1, null), c8972bMm.dHguZz().valueOf(), c8972bMm.DGOPHZ(), c8972bMm.DbNXlk(), c8972bMm.flVtFt(), java.lang.Integer.valueOf(c8972bMm.DXXBbs().fetchVPNInfo()), list), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setMevSuppliers(c8972bMm.RcXXUw);
            broadcastBeanGenerateBroadcastModel$default.setApprovalAddress(c8972bMm.dvKsVJ());
            if (broadcastBeanGenerateBroadcastModel$default.getToAdr().length() == 0) {
                broadcastBeanGenerateBroadcastModel$default.setToAdr(broadcastBeanGenerateBroadcastModel$default.getFromAdr());
            }
            broadcastBeanGenerateBroadcastModel$default.setNonce(strV_);
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, c9215bRQKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 246, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.Approve || this.fetchVPNInfo.w_();
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = EZpvd();
        if (stateListAnimatorEZpvd == null || !Intrinsics.EZpvd(stateListAnimatorEZpvd.djBIcL(), java.lang.Boolean.TRUE)) {
            AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
            java.lang.String data = QVsKAR().getData();
            if (data == null) {
                data = "";
            }
            if (!actionBar.AEQbTJ(data)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        return AEQbTJ();
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        java.lang.String strOLrzqt;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = EZpvd();
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItemAd_ = ad_();
        if (approveInfoListItemAd_ == null || (strOLrzqt = approveInfoListItemAd_.getAmount()) == null) {
            strOLrzqt = C33491mxU.OLrzqt(fZBcTu());
        }
        java.lang.String str = strOLrzqt;
        if (z) {
            return C54870xYj.EZpvd(str, stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.copydefault() : 0, stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.valueOf() : 8, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return str;
    }

    public final java.lang.String fZBcTu() {
        java.lang.String strAa_ = aa_();
        return (strAa_ == null || strAa_.length() == 0) ? gasjUx() : strAa_;
    }

    public final java.lang.String gasjUx() {
        java.lang.String strSubstring = AbstractC8601bFm.getInputData$default(this, false, 1, null).substring(r0.length() - 64);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = C33491mxU.copydefault(str);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strCopydefault = strCopydefault.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iRJOkX = CollectionsKt___CollectionsKt.RJOkX(C56548yJl.AhwBna(0, 64 - strCopydefault.length()));
        for (int i = 0; i < iRJOkX; i++) {
            sb.append("0");
        }
        sb.append(strCopydefault);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String data = QVsKAR().getData();
        if (data != null) {
            EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
            java.lang.String strSubstring = data.substring(0, data.length() - 64);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            eVMContractSignDataQVsKAR.setData(strSubstring + string);
        }
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        ApproveInfoModuleModel.TxInfoItem tokenInfo;
        java.lang.Integer signTokenPrecision;
        ContractAddressResp contractAddressRespY_ = Y_();
        if (contractAddressRespY_ == null) {
            return null;
        }
        C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, zLjUOn(), dHguZz().fetchVPNInfo(), false, 4, null);
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strKWHzl = DarRvM().KWHzl(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null, htlTjW());
        WalletTickerManager.CoinPrice coinPriceCopydefault = DarRvM().copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
        java.lang.String realPrice = coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null;
        java.lang.String symbol = contractAddressRespY_.getSymbol();
        int precision = contractAddressRespY_.getPrecision();
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItemAEQbTJ = AEQbTJ(QSLkRj());
        return new InterfaceC9730bbB.StateListAnimator(strZLjUOn, strKWHzl, realPrice, symbol, precision, (approveInfoListItemAEQbTJ == null || (tokenInfo = approveInfoListItemAEQbTJ.getTokenInfo()) == null || (signTokenPrecision = tokenInfo.getSignTokenPrecision()) == null) ? contractAddressRespY_.getPrecision() : signTokenPrecision.intValue(), contractAddressRespY_.getLogo(), null, contractAddressRespY_.isNft(), 128, null);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        return C12801cto.EZpvd.KWHzl(AbstractC8601bFm.getInputData$default(this, false, 1, null), java.lang.String.valueOf(dHguZz().fetchVPNInfo()));
    }

    @Override // o.InterfaceC9743bbO
    public void a_(@NotNull java.util.List<WalletDexService.SupportedMevNodeBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String gas = null;
        java.lang.String priorityRate = null;
        for (WalletDexService.SupportedMevNodeBean supportedMevNodeBean : list) {
            java.lang.String supplier = supportedMevNodeBean.getSupplier();
            if (supplier != null && supplier.length() != 0) {
                if (C33129mqd.AEQbTJ(supportedMevNodeBean.getGas(), gas)) {
                    gas = supportedMevNodeBean.getGas();
                }
                if (C33129mqd.AEQbTJ(supportedMevNodeBean.getPriorityRate(), priorityRate)) {
                    priorityRate = supportedMevNodeBean.getPriorityRate();
                }
                arrayList.add(supplier);
            }
        }
        this.RcXXUw = arrayList;
        DXXBbs().KWHzl(gas, priorityRate);
    }

    @Override // o.InterfaceC9743bbO
    public void fARcdN() {
        this.RcXXUw = null;
        DXXBbs().KWHzl((java.lang.String) null, (java.lang.String) null);
    }

    @Override // o.InterfaceC9743bbO
    public boolean ejfBZ() {
        return C33129mqd.KWHzl((java.util.Collection) this.RcXXUw);
    }

    @Override // o.AbstractC8564bFB
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        super.EZpvd(jsonObject);
        InterfaceC8931bLy.StateListAnimator.copydefault(this, jsonObject);
    }

    public final boolean aKErDB() {
        java.lang.Integer typeInt = QVsKAR().getTypeInt();
        return (typeInt != null && typeInt.intValue() == 9) || (typeInt != null && typeInt.intValue() == 17) || (typeInt != null && typeInt.intValue() == 49);
    }

    public final int KWHzl(@NotNull ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem) {
        Intrinsics.checkNotNullParameter(approveInfoListItem, "");
        return this.fetchVPNInfo.OLrzqt(approveInfoListItem);
    }

    public final java.lang.String OLrzqt(int i, boolean z) {
        return this.fetchVPNInfo.OLrzqt(i, z);
    }

    public final java.lang.String OLrzqt(int i) {
        return this.fetchVPNInfo.OLrzqt(i);
    }

    public boolean heceqZ() {
        return this.fetchVPNInfo.AYXKKw();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return heceqZ() ? "3" : super.l_();
    }

    public static final InterfaceC60096zvd djBIcL(C8972bMm c8972bMm, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c8972bMm.copydefault(((SignInfo) data2).getSupportPush());
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<EvmSignInfo> kSerializerSerializer = EvmSignInfo.Companion.serializer();
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                kotlinx.serialization.json.JsonObject info = ((SignInfo) data3).getInfo();
                Intrinsics.copydefault(info);
                c8972bMm.copydefault((EvmSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString()));
                java.lang.Object data4 = responseData.getData();
                Intrinsics.copydefault(data4);
                kotlinx.serialization.json.JsonObject info2 = ((SignInfo) data4).getInfo();
                Intrinsics.copydefault(info2);
                if (info2.containsKey((java.lang.Object) "reserveFeeRatio")) {
                    C8518bEI c8518bEIAc_ = c8972bMm.ac_();
                    java.lang.Object data5 = responseData.getData();
                    Intrinsics.copydefault(data5);
                    kotlinx.serialization.json.JsonObject info3 = ((SignInfo) data5).getInfo();
                    Intrinsics.copydefault(info3);
                    java.lang.Object obj = info3.get((java.lang.Object) "reserveFeeRatio");
                    JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                    c8518bEIAc_.OLrzqt(jsonPrimitive != null ? jsonPrimitive.getContent() : null);
                }
                return c8972bMm.DsrFlB();
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair KWHzl(C8972bMm c8972bMm, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8972bMm.AhwBna(((ExtFeeResp) data).getExtFee());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AEQbTJ(C8972bMm c8972bMm, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8972bMm.KWHzl((WalletGasLimitRes) data);
            java.lang.String gasLimitRate = c8972bMm.QVsKAR().getGasLimitRate();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) gasLimitRate) && C33129mqd.OLrzqt((java.lang.CharSequence) c8972bMm.AkhnZx().getOriginGasLimit())) {
                c8972bMm.AkhnZx().setGasLimit(C54862xYb.convertToString$default(C54862xYb.OLrzqt(c8972bMm.AkhnZx().getOriginGasLimit(), gasLimitRate), false, 0, RoundingMode.UP, 1, null));
            } else if (c8972bMm.aKErDB != null && c8972bMm.QwvEab() != 2 && c8972bMm.QwvEab() != 5) {
                c8972bMm.AkhnZx().setGasLimit(c8972bMm.aKErDB);
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
