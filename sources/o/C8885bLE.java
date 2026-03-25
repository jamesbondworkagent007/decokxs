package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.ExtFeeResp;
import com.okinc.business.defi.biz.net.bean.InputDataReq;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.InterfaceC8931bLy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8885bLE extends OKWBaseMultiTransfer<C9345bTo, MultiTransferSignData> implements InterfaceC8931bLy {
    public java.lang.String OcIXYQ;
    public java.lang.String QUSxYX;
    public java.lang.String QVAiDq;
    public java.lang.String QbewEr;
    public InterfaceC60094zvb UeEOUB;
    public final InterfaceC56387yDm RJOkX = C56392yDr.copydefault(new Function0() { // from class: o.bLS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8885bLE.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm dNCPSb = C56392yDr.copydefault(new Function0() { // from class: o.bLV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8885bLE.KWHzl(this.copydefault);
        }
    });
    public EvmSignInfo djSkpj = new EvmSignInfo((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (EvmSignInfoGasPrice) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
    public WalletGasLimitRes QfsBiF = new WalletGasLimitRes((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16383, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull WalletGasLimitRes walletGasLimitRes) {
        Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
        this.QfsBiF = walletGasLimitRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void AEQbTJ(java.lang.String str) {
        this.QUSxYX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes AkhnZx() {
        return this.QfsBiF;
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
    public java.lang.String DGOPHZDGOPHZ() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public java.lang.String DbNXlk() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.OcIXYQ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull EvmSignInfo evmSignInfo) {
        Intrinsics.checkNotNullParameter(evmSignInfo, "");
        this.djSkpj = evmSignInfo;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public long QUSxYX() {
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void copydefault(java.lang.String str) {
        this.QbewEr = str;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public boolean fvQaOB() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public EvmSignInfo uzCIH() {
        return this.djSkpj;
    }

    public int DGUQLI() {
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

    @Override // o.InterfaceC8931bLy
    public int fIwbmz() {
        return InterfaceC8931bLy.StateListAnimator.gEmmrt(this);
    }

    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes fetchVPNInfo() {
        return InterfaceC8931bLy.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC8931bLy
    public java.lang.String gEmmrt() {
        return InterfaceC8931bLy.StateListAnimator.EZpvd(this);
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

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/bTG; */
    @Override // o.InterfaceC8931bLy
    /* JADX INFO: renamed from: DBxZfM, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C9345bTo fJNWhG() {
        return (C9345bTo) this.RJOkX.getValue();
    }

    public static final C9345bTo AEQbTJ(C8885bLE c8885bLE) {
        return new C9345bTo(c8885bLE, c8885bLE);
    }

    public final C9317bTM hCLrkq() {
        return (C9317bTM) this.dNCPSb.getValue();
    }

    public static final C9317bTM KWHzl(C8885bLE c8885bLE) {
        return new C9317bTM(c8885bLE);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDsrFlB = DsrFlB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        final yHO yho = new yHO() { // from class: o.bLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8885bLE.EZpvd(this.KWHzl, (kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXDsrFlB, abstractC58185ywXDaRZkR, new InterfaceC58228yxN() { // from class: o.bLH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8885bLE.AEQbTJ(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair EZpvd(C8885bLE c8885bLE, kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
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
        c8885bLE.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDGgnkA = DGgnkA();
        final Function1 function1 = new Function1() { // from class: o.bLF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.djBIcL(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDGgnkA.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair djBIcL(C8885bLE c8885bLE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8885bLE.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
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
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new TaskDescription(gasPrice, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.EZpvd(this.KWHzl, (EvmSignInfoGasPrice) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bLG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd EZpvd(C8885bLE c8885bLE, EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        c8885bLE.uzCIH().setGasPrice(evmSignInfoGasPrice);
        return c8885bLE.DNMMPQ();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DGgnkA() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        InterfaceC60094zvb interfaceC60094zvb = this.UeEOUB;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        java.lang.Boolean needExtFee = uzCIH().getNeedExtFee();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(needExtFee, bool)) {
            abstractC58185ywXKWHzl = DsrFlB();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        final Function2 function2 = new Function2() { // from class: o.bLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8885bLE.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXDaRZkR, new InterfaceC58223yxI() { // from class: o.bLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8885bLE.EZpvd(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.KWHzl(this.AEQbTJ, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = abstractC58185ywXEZpvd.EZpvd(new InterfaceC58227yxM() { // from class: o.bMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8885bLE.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final void DAIeex(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C8885bLE c8885bLE, InterfaceC60094zvb interfaceC60094zvb) {
        c8885bLE.UeEOUB = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DsrFlB() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), DWgRXt(), KWHzl(), fHqPtx().AuCTel() ? C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null) : "0", (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.AYXKKw(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DNMMPQ() {
        java.lang.Boolean needExtFee = uzCIH().getNeedExtFee();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(needExtFee, bool)) {
            AbstractC58185ywX<ResponseData<ExtFeeResp>> abstractC58185ywXOLrzqt = ixgjPv().OLrzqt(OxVOHk(), Dmq(), new InputDataReq(DGOPHZ(), hCLrkq().AEQbTJ()));
            final Function1 function1 = new Function1() { // from class: o.bLM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8885bLE.OLrzqt(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8885bLE.iRxXKY(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DaRZkR() {
        java.lang.String strOLrzqt;
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String address = fERRXa().getAddress();
        java.lang.String strKWHzl = KWHzl();
        if (fHqPtx().AuCTel()) {
            strOLrzqt = zLjUOn();
        } else {
            strOLrzqt = fHqPtx().OLrzqt();
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(address, strKWHzl, strOLrzqt, (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : fHqPtx().AuCTel() ? AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null) : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OTwTPd() {
        if (((MultiTransferSignData) QVsKAR()).getCurTXIndex() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        TxToastCheckReq txToastCheckReqI_ = i_();
        txToastCheckReqI_.setCheckTypes(C56402yEa.EZpvd(5));
        AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXOLrzqt = OLrzqt(txToastCheckReqI_);
        final Function1 function1 = new Function1() { // from class: o.bLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C8885bLE c8885bLE, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Integer checkType = ((TxToastCheckRes) next).getCheckType();
            if (checkType != null && checkType.intValue() == 5) {
                break;
            }
        }
        TxToastCheckRes txToastCheckRes = (TxToastCheckRes) next;
        c8885bLE.QVAiDq = txToastCheckRes != null ? txToastCheckRes.getNewNonce() : null;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final java.lang.String KWHzl() {
        if (!fHqPtx().DCUTEIddSDPG() || zLjUOn().length() <= 0) {
            return null;
        }
        return xYW.AEQbTJ.copydefault(zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public OKWBaseMultiTransfer.BroadcastStrategy valueOf() {
        return OKWBaseMultiTransfer.BroadcastStrategy.CALL_API_FINISH;
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QbewEr() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDGgnkA = DGgnkA();
        final Function1 function1 = new Function1() { // from class: o.bLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDGgnkA.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair KWHzl(C8885bLE c8885bLE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8885bLE.DXXBbs().KWHzl(2);
        }
        return pair;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QfsBiF() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDsrFlB = DsrFlB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final yHO yho = new yHO() { // from class: o.bLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8885bLE.AEQbTJ((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDsrFlB, abstractC58185ywXDaRZkR, abstractC58185ywXOTwTPd, new InterfaceC58228yxN() { // from class: o.bLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8885bLE.KWHzl(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair KWHzl(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? pair3 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        if (((MultiTransferSignData) QVsKAR()).getCurTXIndex() == 0) {
            java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
            arrayListAuCTelauCTel.add(5);
            return arrayListAuCTelauCTel;
        }
        return super.AuCTelauCTel();
    }

    public static final Unit RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDsrFlB = DsrFlB();
        final Function1 function1 = new Function1() { // from class: o.bLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8885bLE.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDsrFlB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8885bLE.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit OLrzqt(C8885bLE c8885bLE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8885bLE.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        SignedTx signedTxKWHzl = hCLrkq().KWHzl(str);
        java.lang.String tx = signedTxKWHzl != null ? signedTxKWHzl.getTx() : null;
        if (tx == null || tx.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        C9215bRQ c9215bRQKWHzl = DXXBbs().KWHzl();
        java.lang.String tx2 = signedTxKWHzl.getTx();
        java.lang.String str2 = tx2 == null ? "" : tx2;
        java.lang.String txHash = signedTxKWHzl.getTxHash();
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(OKWBaseMultiTransfer.generateBroadcastModel$default(this, str2, txHash == null ? "" : txHash, null, new EVMExtJson(V_(), AbstractC9346bTp.getGasLimit$default(DXXBbs(), 0, 1, null), C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), C9311bTG.getPriorityFee$default(DXXBbs(), 0, 1, null), dHguZz().valueOf(), DGUQLI(), DbNXlk(), ((MultiTransferSignData) QVsKAR()).getCurTXIndex() == 0 ? DGOPHZDGOPHZ() : null, java.lang.Integer.valueOf(DXXBbs().fetchVPNInfo()), null, 512, null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, c9215bRQKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 246, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8931bLy
    public java.lang.String V_() {
        if (((MultiTransferSignData) QVsKAR()).getCurTXIndex() == 0) {
            java.lang.String strAuCTel = AuCTel();
            if (strAuCTel != null) {
                return strAuCTel;
            }
        } else {
            java.lang.String str = this.QVAiDq;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: o.bLE$TaskDescription */
    public static final class TaskDescription<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.Object obj, java.lang.String str) {
            this.EZpvd = obj;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<EvmSignInfoGasPrice> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.KWHzl;
            java.lang.Object obj = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bLE.TaskDescription.1
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bLE.TaskDescription.5
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bLE.TaskDescription.4
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
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        super.EZpvd(jsonObject);
        InterfaceC8931bLy.StateListAnimator.copydefault(this, jsonObject);
    }

    public static final InterfaceC60096zvd AYXKKw(C8885bLE c8885bLE, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c8885bLE.copydefault(((SignInfo) data2).getSupportPush());
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<EvmSignInfo> kSerializerSerializer = EvmSignInfo.Companion.serializer();
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                kotlinx.serialization.json.JsonObject info = ((SignInfo) data3).getInfo();
                Intrinsics.copydefault(info);
                c8885bLE.OLrzqt((EvmSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString()));
                return c8885bLE.DNMMPQ();
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair OLrzqt(C8885bLE c8885bLE, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8885bLE.EZpvd(((ExtFeeResp) data).getExtFee());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(C8885bLE c8885bLE, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8885bLE.AEQbTJ((WalletGasLimitRes) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
