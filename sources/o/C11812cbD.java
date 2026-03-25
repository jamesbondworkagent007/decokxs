package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin;
import com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.sui.SuiObject;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11812cbD extends AbstractC8664bGw<C11829cbU, TransferSignData> implements InterfaceC11843cbi {
    public SuiSignInfo AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cbF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11812cbD.KWHzl(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.cbI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11812cbD.copydefault(this.KWHzl);
        }
    });
    public java.lang.String copydefault;

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SuiSignInfo suiSignInfo) {
        Intrinsics.checkNotNullParameter(suiSignInfo, "");
        this.AEQbTJ = suiSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C11829cbU fJNWhG() {
        return (C11829cbU) this.EZpvd.getValue();
    }

    public static final C11829cbU KWHzl(C11812cbD c11812cbD) {
        return new C11829cbU(c11812cbD, c11812cbD);
    }

    public final C11890ccc zuBGHE() {
        return (C11890ccc) this.OLrzqt.getValue();
    }

    public static final C11890ccc copydefault(C11812cbD c11812cbD) {
        return new C11890ccc(c11812cbD);
    }

    public final SuiSignInfo OcIXYQ() {
        SuiSignInfo suiSignInfo = this.AEQbTJ;
        if (suiSignInfo != null) {
            return suiSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC11843cbi
    public java.lang.String EZpvd() {
        java.lang.String str = this.copydefault;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function2 function2 = new Function2() { // from class: o.cbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11812cbD.EZpvd(this.KWHzl, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXQVAiDq, new InterfaceC58223yxI() { // from class: o.cbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11812cbD.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(C11812cbD c11812cbD, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c11812cbD.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.cbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.AYXKKw(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C11812cbD c11812cbD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11812cbD.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.cbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair KWHzl(C11812cbD c11812cbD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11812cbD.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        SuiSignInfo suiSignInfoOcIXYQ = OcIXYQ();
        if (suiSignInfoOcIXYQ == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(suiSignInfoOcIXYQ);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(suiSignInfoOcIXYQ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.KWHzl(this.KWHzl, (SuiSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(C11812cbD c11812cbD, SuiSignInfo suiSignInfo) {
        Intrinsics.checkNotNullParameter(suiSignInfo, "");
        c11812cbD.KWHzl(suiSignInfo);
        return c11812cbD.EZpvd(c11812cbD.ORxRYg());
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QVAiDq() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQUSxYX = QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.cbN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQUSxYX.KWHzl(new InterfaceC58229yxO() { // from class: o.cbL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C11812cbD c11812cbD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11812cbD.EZpvd(c11812cbD.ORxRYg());
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final java.lang.String ORxRYg() {
        if (fHqPtx().AuCTel()) {
            kotlin.Pair<java.lang.String, java.util.List<SuiObject>> pairAEQbTJ = AEQbTJ();
            return zuBGHE().EZpvd(pairAEQbTJ.component1(), pairAEQbTJ.component2());
        }
        kotlin.Pair<java.lang.String, java.util.List<SuiObject>> pairAEQbTJ2 = AEQbTJ(OcIXYQ().getInputCoins(), QKVWgx());
        return zuBGHE().copydefault(pairAEQbTJ2.component1(), pairAEQbTJ2.component2());
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QUSxYX() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), DWgRXt(), (java.lang.String) null, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cbS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cbQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), str, "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : "0", (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cbP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cbT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final java.lang.String QKVWgx() {
        return C54870xYj.KWHzl("1", dHguZz().valueOf());
    }

    public final kotlin.Pair<java.lang.String, java.util.List<SuiObject>> AEQbTJ() {
        return C56390yDp.OLrzqt(QKVWgx(), yDY.AhwBna());
    }

    public final kotlin.Pair<java.lang.String, java.util.List<SuiObject>> AEQbTJ(java.util.List<SuiInputCoin> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        BigDecimal bigDecimal = new BigDecimal("0");
        if (list != null) {
            for (SuiInputCoin suiInputCoin : list) {
                arrayList.add(suiInputCoin.toSuiObject());
                BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimal, suiInputCoin.getAmount());
                if (C33129mqd.copydefault(bigDecimalKWHzl, str)) {
                    return C56390yDp.OLrzqt(C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null), arrayList);
                }
                bigDecimal = bigDecimalKWHzl;
            }
        }
        return C56390yDp.OLrzqt(C54862xYb.convertToBigIntegerString$default(bigDecimal, false, RoundingMode.UP, 1, (java.lang.Object) null), arrayList);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.cbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11812cbD.KWHzl(this.EZpvd, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11812cbD.gasjUx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(C11812cbD c11812cbD, java.lang.String str, kotlin.Pair pair) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(pair, "");
        if (c11812cbD.fHqPtx().AuCTel()) {
            C11890ccc c11890cccZuBGHE = c11812cbD.zuBGHE();
            java.lang.String strEZpvd = c11812cbD.EZpvd();
            java.util.List<SuiInputCoin> inputCoins = c11812cbD.OcIXYQ().getInputCoins();
            java.util.List<SuiObject> listAEQbTJ = inputCoins != null ? C11832cbX.AEQbTJ(inputCoins) : null;
            if (listAEQbTJ == null) {
                listAEQbTJ = yDY.AhwBna();
            }
            strCopydefault = c11890cccZuBGHE.EZpvd(strEZpvd, listAEQbTJ);
        } else {
            C11890ccc c11890cccZuBGHE2 = c11812cbD.zuBGHE();
            java.lang.String strEZpvd2 = c11812cbD.EZpvd();
            java.util.List<SuiInputCoin> inputCoins2 = c11812cbD.OcIXYQ().getInputCoins();
            java.util.List<SuiObject> listAEQbTJ2 = inputCoins2 != null ? C11832cbX.AEQbTJ(inputCoins2) : null;
            if (listAEQbTJ2 == null) {
                listAEQbTJ2 = yDY.AhwBna();
            }
            strCopydefault = c11890cccZuBGHE2.copydefault(strEZpvd2, listAEQbTJ2);
        }
        SignedTx signedTxEZpvd = c11812cbD.zuBGHE().EZpvd(str, strCopydefault);
        java.lang.String tx = signedTxEZpvd.getTx();
        if (tx == null || tx.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String tx2 = signedTxEZpvd.getTx();
        Intrinsics.copydefault((java.lang.Object) tx2);
        return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c11812cbD, tx2, signedTxEZpvd.getTxHash(), null, new SuiExtJson(c11812cbD.OcIXYQ().getInputCoins(), c11812cbD.fHqPtx().DCUTEIddSDPG() ? c11812cbD.OcIXYQ().getTokenInputCoins() : null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair EZpvd(C11812cbD c11812cbD, ResponseData responseData) {
        boolean z;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11812cbD.copydefault(((SignInfo) data).getSupportPush());
            KSerializer<SuiSignInfo> kSerializerSerializer = SuiSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c11812cbD.KWHzl((SuiSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, info.toString()));
            java.lang.String maxObjectLimit = c11812cbD.OcIXYQ().getMaxObjectLimit();
            java.util.List<SuiInputCoin> inputCoins = c11812cbD.OcIXYQ().getInputCoins();
            if (!C33129mqd.gEmmrt(maxObjectLimit, inputCoins != null ? java.lang.Integer.valueOf(inputCoins.size()) : null)) {
                java.lang.String maxObjectLimit2 = c11812cbD.OcIXYQ().getMaxObjectLimit();
                java.util.List<SuiInputCoin> tokenInputCoins = c11812cbD.OcIXYQ().getTokenInputCoins();
                z = C33129mqd.gEmmrt(maxObjectLimit2, tokenInputCoins != null ? java.lang.Integer.valueOf(tokenInputCoins.size()) : null);
            }
            c11812cbD.DLWbHP().AEQbTJ(new C9884bdx(!z));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair KWHzl(C11812cbD c11812cbD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11812cbD.KWHzl(C54862xYb.convertToBigIntegerString$default(((WalletGasLimitRes) data).getGasLimit(), false, RoundingMode.UP, 1, (java.lang.Object) null));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX INFO: renamed from: o.cbD$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.Object EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.EZpvd = obj;
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<SuiSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.AEQbTJ;
            java.lang.Object obj = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cbD.Activity.1
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cbD.Activity.2
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cbD.Activity.5
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) SuiSignInfo.class));
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
}
