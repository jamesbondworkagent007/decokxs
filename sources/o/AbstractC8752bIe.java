package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOReq;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOResp;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.cardano.CardanoMultiAsset;
import com.okinc.wallet.core.sign.cardano.CardanoSignedMinFee;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8752bIe extends AbstractC8664bGw<C8756bIi, TransferSignData> {
    public boolean copydefault;
    public java.util.List<CardanoUTXOResp> gEmmrt;
    public final int OLrzqt = 4;
    public final int AEQbTJ = 10004;
    public java.lang.String KWHzl = "0";
    public java.lang.String EZpvd = "0";
    public java.lang.String AhwBna = "0";
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bIv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8752bIe.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bIw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8752bIe.djBIcL(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.AhwBna;
    }

    public abstract java.lang.String OcIXYQ();

    public abstract boolean QUSxYX();

    public abstract java.util.List<CardanoMultiAsset> QVAiDq();

    public abstract java.lang.String UeEOUB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aKErDB() {
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] */
    public C8756bIi DXXBbs() {
        return (C8756bIi) this.valueOf.getValue();
    }

    public static final C8756bIi KWHzl(AbstractC8752bIe abstractC8752bIe) {
        return new C8756bIi(abstractC8752bIe);
    }

    public final C8754bIg QKVWgx() {
        return (C8754bIg) this.djBIcL.getValue();
    }

    public static final C8754bIg djBIcL(AbstractC8752bIe abstractC8752bIe) {
        return new C8754bIg(abstractC8752bIe);
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        return newProxyInstance;
    }

    public static final kotlin.Pair hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl(new C8725bID(true, false, false, 0, 14, null));
        final Function1 function1 = new Function1() { // from class: o.bIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.valueOf(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair valueOf(AbstractC8752bIe abstractC8752bIe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC8752bIe.DXXBbs().KWHzl(2);
        return pair;
    }

    public static final kotlin.Pair accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl(new C8725bID(true, false, false, 0, 14, null));
        final Function1 function1 = new Function1() { // from class: o.bIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.AhwBna(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(AbstractC8752bIe abstractC8752bIe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC8752bIe.DXXBbs().KWHzl(1);
        return pair;
    }

    public static final InterfaceC60096zvd gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.bIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.gEmmrt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXRJOkX.KWHzl(new InterfaceC58229yxO() { // from class: o.bIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(final AbstractC8752bIe abstractC8752bIe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC8752bIe.KWHzl(new C8725bID(true, false, false, 0, 14, null));
        final Function1 function1 = new Function1() { // from class: o.bIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.AYXKKw(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.iRxXKY(function1, obj);
            }
        });
    }

    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(AbstractC8752bIe abstractC8752bIe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC8752bIe.DXXBbs().KWHzl(2);
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        if (C33129mqd.AEQbTJ(((TransferSignData) QVsKAR()).getTransferAmount(), "0") || ((TransferSignData) QVsKAR()).isTransferMaxAmount()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl(new C8725bID(false, true, false, 0, 13, null));
            final Function1 function1 = new Function1() { // from class: o.bIC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8752bIe.djBIcL(this.copydefault, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC8752bIe.AxsJAYaxsJAY(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final Unit AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit djBIcL(AbstractC8752bIe abstractC8752bIe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC8752bIe.DXXBbs().KWHzl(3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AbstractC58185ywX loadUTXO$default(AbstractC8752bIe abstractC8752bIe, C8725bID c8725bID, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUTXO");
        }
        if ((i & 1) != 0) {
            c8725bID = new C8725bID(false, false, false, 0, 15, null);
        }
        return abstractC8752bIe.KWHzl(c8725bID);
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(@NotNull final C8725bID c8725bID) {
        Intrinsics.checkNotNullParameter(c8725bID, "");
        java.lang.String strDNCPSb = dNCPSb();
        java.lang.String strUeEOUB = UeEOUB();
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<java.util.List<CardanoUTXOResp>>> abstractC58185ywXAEQbTJ = c13934dbuOFhtUX.AEQbTJ(strOxVOHk, strDmq, new CardanoUTXOReq(java.lang.Long.valueOf(jDGOPHZ), htlTjW(), strDNCPSb, strUeEOUB));
        final Function1 function1 = new Function1() { // from class: o.bIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.AEQbTJ(this.AEQbTJ, c8725bID, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final AbstractC8752bIe abstractC8752bIe, final C8725bID c8725bID, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC8752bIe.copydefault = responseData.getCode() == abstractC8752bIe.AEQbTJ;
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            abstractC8752bIe.gEmmrt = (java.util.List) responseData.getData();
            if (c8725bID.AEQbTJ() < abstractC8752bIe.OLrzqt) {
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXRcXXUw = abstractC8752bIe.RcXXUw();
                final Function1 function1 = new Function1() { // from class: o.bIA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC8752bIe.copydefault(this.copydefault, c8725bID, (java.lang.Boolean) obj);
                    }
                };
                return abstractC58185ywXRcXXUw.KWHzl(new InterfaceC58229yxO() { // from class: o.bIB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC8752bIe.giSNqX(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC8752bIe abstractC8752bIe, C8725bID c8725bID, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return abstractC8752bIe.KWHzl(C8725bID.copy$default(c8725bID, false, false, false, c8725bID.AEQbTJ() + 1, 7, null));
    }

    public final java.lang.String dNCPSb() {
        return C_() ? AbstractC8704bHj.getCoinBalance$default(this, null, 1, null) : C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<java.lang.Boolean> RcXXUw() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return AbstractC8752bIe.EZpvd(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean EZpvd(AbstractC8752bIe abstractC8752bIe) {
        abstractC8752bIe.AhwBna = abstractC8752bIe.QKVWgx().copydefault();
        CardanoSignedMinFee cardanoSignedMinFeeKWHzl = abstractC8752bIe.QKVWgx().KWHzl(abstractC8752bIe.gEmmrt);
        java.lang.String fee = cardanoSignedMinFeeKWHzl.getFee();
        if (fee == null) {
            fee = "";
        }
        abstractC8752bIe.KWHzl = fee;
        java.lang.String change = cardanoSignedMinFeeKWHzl.getChange();
        abstractC8752bIe.EZpvd = change != null ? change : "";
        return java.lang.Boolean.valueOf(Intrinsics.EZpvd(cardanoSignedMinFeeKWHzl.getValid(), java.lang.Boolean.TRUE));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC8752bIe abstractC8752bIe, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        java.lang.String str2 = (java.lang.String) pair.component2();
        if (zBooleanValue && C33129mqd.KWHzl((java.util.Collection) abstractC8752bIe.gEmmrt)) {
            java.lang.String strCopydefault = abstractC8752bIe.QKVWgx().copydefault(str, abstractC8752bIe.gEmmrt);
            if (strCopydefault.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, strCopydefault, null, 46, null));
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5000, str2 == null ? "" : str2, null, null, null, null, 60, null));
    }

    public static final InterfaceC60096zvd QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull java.lang.String str, @NotNull final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = KWHzl(new C8725bID(false, false, true, 0, 11, null));
        final Function1 function1 = new Function1() { // from class: o.bIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.AEQbTJ(this.EZpvd, str2, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.QKudOq(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8752bIe.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.bIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8752bIe.AxsJAYsNCnLh(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(AbstractC8752bIe abstractC8752bIe, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return abstractC8752bIe.djBIcL((ResponseData<java.lang.String>) responseData);
    }

    public final ResponseData<BatchBroadcastModel> djBIcL(ResponseData<java.lang.String> responseData) {
        if (responseData.getCode() == -5001) {
            java.lang.String data = responseData.getData();
            java.lang.String str = data == null ? "" : data;
            xYW xyw = xYW.AEQbTJ;
            java.lang.String data2 = responseData.getData();
            return new ResponseData<>(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(this, str, xyw.OLrzqt(data2 != null ? data2 : "", dHguZz().QKVWgx()), null, null, 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), responseData.getMsg(), null, responseData.getErrorMsg(), null, responseData.getError_code(), 20, null);
    }
}
