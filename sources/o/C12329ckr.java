package o;

import com.okinc.business.defi.api.model.tx.signdata.RunesTransferSignData;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12329ckr extends AbstractC12388clx<RunesTransferSignData> {
    public final java.lang.String QUSxYX = "OKWRunesTransfer";
    public final InterfaceC56387yDm QVAiDq = C56392yDr.copydefault(new Function0() { // from class: o.ckq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12329ckr.EZpvd(this.AEQbTJ);
        }
    });
    public C10854bwM QfsBiF;

    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        C10854bwM c10854bwM = this.QfsBiF;
        return c10854bwM == null ? dHguZz() : c10854bwM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        if (this.QfsBiF != null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQHmsKR = QHmsKR();
            final Function1 function1 = new Function1() { // from class: o.ckB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12329ckr.djBIcL(this.EZpvd, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQHmsKR.KWHzl(new InterfaceC58229yxO() { // from class: o.ckx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12329ckr.ixgjPv(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.dxcTrN();
    }

    public static final InterfaceC60096zvd djBIcL(final C12329ckr c12329ckr, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
            final Function1 function1 = new Function1() { // from class: o.ckt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12329ckr.AYXKKw(this.EZpvd, (kotlin.Pair) obj);
                }
            };
            return abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cku
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12329ckr.UlJrfe(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final kotlin.Pair UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(C12329ckr c12329ckr, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12329ckr.OLrzqt(c12329ckr.DarRvM().KWHzl(java.lang.Long.valueOf(c12329ckr.DGOPHZ()), c12329ckr.htlTjW()));
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.ckn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12329ckr.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRJOkX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12329ckr.Dmq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(C12329ckr c12329ckr, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12329ckr.OLrzqt(c12329ckr.DarRvM().KWHzl(java.lang.Long.valueOf(c12329ckr.DGOPHZ()), c12329ckr.htlTjW()));
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8664bGw, o.AbstractC8704bHj
    public java.lang.String AEQbTJ(boolean z, boolean z2) {
        java.lang.String transferAmount = ((RunesTransferSignData) QVsKAR()).getTransferAmount();
        if (transferAmount.length() == 0) {
            transferAmount = "0";
        }
        return C54870xYj.KWHzl(transferAmount, fHqPtx().valueOf());
    }

    public static final InterfaceC60096zvd aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDNMMPQ = DNMMPQ();
        final Function1 function1 = new Function1() { // from class: o.ckw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12329ckr.gEmmrt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDNMMPQ.KWHzl(new InterfaceC58229yxO() { // from class: o.cky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12329ckr.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(C12329ckr c12329ckr, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.r_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    private final C12354clP DaRZkR() {
        return (C12354clP) this.QVAiDq.getValue();
    }

    public static final C12354clP EZpvd(C12329ckr c12329ckr) {
        return new C12354clP(c12329ckr);
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> AhwBna(@NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DaRZkR().copydefault(list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12340clB
    public boolean OTwTPd() {
        XRC20TransactionResult xRC20TransactionResultRKcVTr = RKcVTr();
        return Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr != null ? xRC20TransactionResultRKcVTr.getErrCode() : null), (java.lang.Object) "1000001");
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DaRZkR().AEQbTJ(str, str2, list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DNMMPQ() {
        if (((RunesTransferSignData) QVsKAR()).getRuneid().length() == 0) {
            OLrzqt(this.QUSxYX, "OKWRunesTransfer loadCoinMeta(): runeid is empty");
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHomeButtonEnabled)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<CoinMetaBean>> abstractC58185ywXKWHzl2 = OFhtUX().KWHzl(((RunesTransferSignData) QVsKAR()).getProtocolId(), ((RunesTransferSignData) QVsKAR()).getRuneid());
        final Function1 function1 = new Function1() { // from class: o.cks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12329ckr.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12329ckr.QCjLjM(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C12329ckr c12329ckr, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c12329ckr.QfsBiF = new C10854bwM((CoinMetaBean) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
