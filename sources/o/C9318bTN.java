package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.kaspa.bean.KaspaSignInfo;
import com.okinc.business.defi.biz.net.bean.KaspaUtxoResp;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.kaspa.KaspaTxIn;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9318bTN extends AbstractC8664bGw<C9402bUs, TransferSignData> {
    public KaspaSignInfo AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String copydefault;
    public InterfaceC60094zvb djBIcL;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bUk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9318bTN.OLrzqt(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bUl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9318bTN.KWHzl(this.KWHzl);
        }
    });
    public java.util.List<KaspaUtxoResp> OLrzqt = yDY.AhwBna();

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<KaspaUtxoResp> OcIXYQ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C9402bUs fJNWhG() {
        return (C9402bUs) this.KWHzl.getValue();
    }

    public static final C9402bUs OLrzqt(C9318bTN c9318bTN) {
        return new C9402bUs(c9318bTN);
    }

    public final C9405bUv ORxRYg() {
        return (C9405bUv) this.EZpvd.getValue();
    }

    public static final C9405bUv KWHzl(C9318bTN c9318bTN) {
        return new C9405bUv(c9318bTN);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQKVWgx = QKVWgx();
        final Function2 function2 = new Function2() { // from class: o.bUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9318bTN.OLrzqt(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXQKVWgx, new InterfaceC58223yxI() { // from class: o.bUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9318bTN.OLrzqt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(C9318bTN c9318bTN, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9318bTN.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final InterfaceC60096zvd DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QKVWgx() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQUSxYX = QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.bUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQUSxYX.KWHzl(new InterfaceC58229yxO() { // from class: o.bUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C9318bTN c9318bTN, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX abstractC58185ywXCreateUtxoRequest$default = createUtxoRequest$default(c9318bTN, false, null, 3, null);
        final Function1 function1 = new Function1() { // from class: o.bTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.AEQbTJ(pair, (C9399bUp) obj);
            }
        };
        return abstractC58185ywXCreateUtxoRequest$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.gkJEwt(function1, obj);
            }
        });
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, C9399bUp c9399bUp) {
        Intrinsics.checkNotNullParameter(c9399bUp, "");
        return (((java.lang.Boolean) pair.getFirst()).booleanValue() && c9399bUp.copydefault()) ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !c9399bUp.copydefault() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, c9399bUp.KWHzl()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    public static /* synthetic */ AbstractC58185ywX createUtxoRequest$default(C9318bTN c9318bTN, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "0";
        }
        return c9318bTN.EZpvd(z, str);
    }

    /* JADX DEBUG: Type inference failed for r12v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<o.bUp> */
    public final AbstractC58185ywX<C9399bUp> EZpvd(boolean z, java.lang.String str) {
        java.lang.String strConvertToBigIntegerString$default;
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strDmq = Dmq();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strQCjLjM = QCjLjM();
        long jValueOf = C33129mqd.valueOf(java.lang.Long.valueOf(DGOPHZ()));
        java.lang.String strHtlTjW = htlTjW();
        if (z) {
            strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        } else {
            strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AEQbTJ(false, false), true, (RoundingMode) null, 2, (java.lang.Object) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<KaspaUtxoResp>>> abstractC58185ywXEZpvd = c13934dbuOFhtUX.EZpvd(strDmq, strOxVOHk, strQCjLjM, jValueOf, strConvertToBigIntegerString$default, C54862xYb.convertToBigIntegerString$default(str, true, (RoundingMode) null, 2, (java.lang.Object) null), strHtlTjW);
        final Function1 function1 = new Function1() { // from class: o.bTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final C9399bUp AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C9399bUp) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QUSxYX() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), htlTjW(), zLjUOn(), DWgRXt(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C9318bTN c9318bTN, KaspaSignInfo kaspaSignInfo) {
        Intrinsics.checkNotNullParameter(kaspaSignInfo, "");
        c9318bTN.AEQbTJ = kaspaSignInfo;
        c9318bTN.AhwBna = kaspaSignInfo != null ? kaspaSignInfo.getMinOutput() : null;
        KaspaSignInfo kaspaSignInfo2 = c9318bTN.AEQbTJ;
        c9318bTN.copydefault = kaspaSignInfo2 != null ? kaspaSignInfo2.getNormal() : null;
        AbstractC58185ywX abstractC58185ywXCreateUtxoRequest$default = createUtxoRequest$default(c9318bTN, false, null, 3, null);
        final Function1 function1 = new Function1() { // from class: o.bUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.KWHzl((C9399bUp) obj);
            }
        };
        return abstractC58185ywXCreateUtxoRequest$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.QKudOq(function1, obj);
            }
        });
    }

    public static final kotlin.Pair QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C9399bUp c9399bUp) {
        Intrinsics.checkNotNullParameter(c9399bUp, "");
        return c9399bUp.copydefault() ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !c9399bUp.copydefault() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, c9399bUp.KWHzl()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    public static /* synthetic */ java.lang.String getMinOutput$default(C9318bTN c9318bTN, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c9318bTN.OLrzqt(z, z2);
    }

    public final java.lang.String OLrzqt(boolean z, boolean z2) {
        if (z) {
            java.lang.String str = this.AhwBna;
            if (str != null) {
                java.lang.String strEZpvd = C54870xYj.EZpvd(str, dHguZz().valueOf(), dHguZz().AkhnZx(), z2 ? dHguZz().fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
            }
        } else {
            java.lang.String str2 = this.AhwBna;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final boolean KWHzl() {
        return C33129mqd.copydefault(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), this.AhwBna);
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        UlJrfe().AEQbTJ(new C9797bcP(KWHzl(), getMinOutput$default(this, false, false, 3, null)));
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bUq>> */
    private final AbstractC58185ywX<ResponseData<C9400bUq>> dNCPSb() {
        final java.lang.String strAEQbTJ = fJNWhG().AEQbTJ();
        AbstractC58185ywX<C9399bUp> abstractC58185ywXEZpvd = EZpvd(true, strAEQbTJ);
        final Function1 function1 = new Function1() { // from class: o.bTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.copydefault(this.OLrzqt, strAEQbTJ, (C9399bUp) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(C9318bTN c9318bTN, java.lang.String str, C9399bUp c9399bUp) {
        Intrinsics.checkNotNullParameter(c9399bUp, "");
        if (c9399bUp.copydefault()) {
            return new ResponseData(-5001, null, null, null, c9318bTN.OLrzqt(str, c9318bTN.OLrzqt), null, 46, null);
        }
        return new ResponseData(0, c9399bUp.KWHzl(), null, null, null, null, 61, null);
    }

    public static final InterfaceC60096zvd DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull final java.lang.String str, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<C9400bUq>> abstractC58185ywXDNCPSb = dNCPSb();
        final Function1 function1 = new Function1() { // from class: o.bTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.copydefault(this.KWHzl, str, submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDNCPSb.KWHzl(new InterfaceC58229yxO() { // from class: o.bTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(C9318bTN c9318bTN, java.lang.String str, SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return super.AEQbTJ(str, submitTxExpandBean);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        C9400bUq c9400bUqOLrzqt = OLrzqt(fJNWhG().AEQbTJ(), this.OLrzqt);
        SignedTx signedTxOLrzqt = ORxRYg().OLrzqt(str, c9400bUqOLrzqt);
        java.lang.String tx = signedTxOLrzqt.getTx();
        if (tx == null || tx.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        java.lang.String tx2 = signedTxOLrzqt.getTx();
        java.lang.String str2 = tx2 == null ? "" : tx2;
        java.lang.String txHash = signedTxOLrzqt.getTxHash();
        BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, str2, txHash == null ? "" : txHash, null, null, 12, null);
        broadcastBeanGenerateBroadcastModel$default.setServiceCharge(c9400bUqOLrzqt.OLrzqt());
        Unit unit = Unit.INSTANCE;
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public final C9400bUq OLrzqt(java.lang.String str, java.util.List<KaspaUtxoResp> list) {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (KaspaUtxoResp kaspaUtxoResp : list) {
            bigDecimal = C54862xYb.KWHzl(bigDecimal, kaspaUtxoResp.getAmount());
            java.lang.String txId = kaspaUtxoResp.getTxId();
            java.lang.String str2 = "";
            if (txId == null) {
                txId = "";
            }
            int iAhwBna = C33129mqd.AhwBna(kaspaUtxoResp.getIndex());
            java.lang.String address = kaspaUtxoResp.getAddress();
            if (address != null) {
                str2 = address;
            }
            arrayList.add(new KaspaTxIn(txId, iAhwBna, str2, C54862xYb.convertToBigIntegerString$default(kaspaUtxoResp.getAmount(), false, (RoundingMode) null, 3, (java.lang.Object) null)));
        }
        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(C54862xYb.AEQbTJ(bigDecimal, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)), str);
        if (C33129mqd.gEmmrt(bigDecimalAEQbTJ, this.AhwBna) && C33129mqd.AEQbTJ(bigDecimalAEQbTJ, "0")) {
            str = C54862xYb.convertToString$default(C54862xYb.KWHzl(str, bigDecimalAEQbTJ), false, null, null, 7, null);
        }
        return new C9400bUq(str, arrayList);
    }

    public static final kotlin.Pair DCJXGO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.bUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.AhwBna(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.DCJXGO(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(C9318bTN c9318bTN, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9318bTN.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0")) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
            final Function1 function1 = new Function1() { // from class: o.bUb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9318bTN.EZpvd(this.OLrzqt, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bUa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9318bTN.RlQdEF(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C9318bTN c9318bTN, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9318bTN.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    /* JADX INFO: renamed from: o.bTN$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.kaspa.bean.KaspaSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<KaspaSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bTN.StateListAnimator.3
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bTN.StateListAnimator.5
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bTN.StateListAnimator.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) KaspaSignInfo.class));
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

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QVAiDq() {
        InterfaceC60094zvb interfaceC60094zvb = this.djBIcL;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX abstractC58185ywXCreateUtxoRequest$default = createUtxoRequest$default(this, false, null, 3, null);
        final Function1 function1 = new Function1() { // from class: o.bTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.OLrzqt((C9399bUp) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCreateUtxoRequest$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.DarRvM(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.AEQbTJ(this.copydefault, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.bTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9318bTN.ODWQjV(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C9399bUp c9399bUp) {
        Intrinsics.checkNotNullParameter(c9399bUp, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(c9399bUp.copydefault()), c9399bUp.KWHzl());
    }

    public static final void ODWQjV(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C9318bTN c9318bTN, InterfaceC60094zvb interfaceC60094zvb) {
        c9318bTN.djBIcL = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        KaspaSignInfo kaspaSignInfo = this.AEQbTJ;
        if (kaspaSignInfo == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(kaspaSignInfo);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new StateListAnimator(kaspaSignInfo, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9318bTN.AEQbTJ(this.OLrzqt, (KaspaSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9318bTN.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final C9399bUp copydefault(C9318bTN c9318bTN, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<KaspaUtxoResp> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            c9318bTN.OLrzqt = listAhwBna;
            return new C9399bUp(true, "");
        }
        return new C9399bUp(false, responseData.getMsg());
    }

    public static final kotlin.Pair KWHzl(C9318bTN c9318bTN, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c9318bTN.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<KaspaSignInfo> kSerializerSerializer = KaspaSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            KaspaSignInfo kaspaSignInfo = (KaspaSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info);
            c9318bTN.AEQbTJ = kaspaSignInfo;
            c9318bTN.AhwBna = kaspaSignInfo != null ? kaspaSignInfo.getMinOutput() : null;
            KaspaSignInfo kaspaSignInfo2 = c9318bTN.AEQbTJ;
            c9318bTN.copydefault = kaspaSignInfo2 != null ? kaspaSignInfo2.getNormal() : null;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
