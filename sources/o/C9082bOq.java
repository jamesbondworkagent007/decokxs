package o;

import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9082bOq extends C8998bNL {
    public java.lang.String OLrzqt = EIP1271Verifier.hexPrefix;
    public java.lang.String KWHzl = EIP1271Verifier.hexPrefix;

    @Override // o.C8998bNL
    public boolean ORxRYg() {
        return true;
    }

    @Override // o.C8998bNL
    public java.lang.String dNCPSb() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.C8998bNL, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDvKsVJ = dvKsVJ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final Function2 function2 = new Function2() { // from class: o.bOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9082bOq.AhwBna((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDvKsVJ, abstractC58185ywXFZBcTu, new InterfaceC58223yxI() { // from class: o.bOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9082bOq.AhwBna(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9082bOq.AEQbTJ(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9082bOq.DCJXGO(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9082bOq.valueOf(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9082bOq.ffGIBT(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd DCJXGO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C9082bOq c9082bOq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c9082bOq.djSkpj();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair ffGIBT(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair valueOf(C9082bOq c9082bOq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9082bOq.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    @Override // o.C8998bNL, o.InterfaceC9778bbx
    public java.lang.String AEQbTJ() {
        return C54910xZw.OLrzqt(xYW.AEQbTJ.values("data:application/vnd.facet.tx+json;rule=esip6,{\"op\":\"call\",\"data\":{\"to\":\"" + this.KWHzl + "\",\"function\":\"transfer\",\"args\":{\"to\":\"" + zLjUOn() + "\",\"amount\":\"" + AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null) + "\"}}}"));
    }

    public static final kotlin.Pair DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.C8998bNL
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fZBcTu() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = super.fZBcTu();
        final Function1 function1 = new Function1() { // from class: o.bOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9082bOq.EZpvd(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFZBcTu.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9082bOq.DarRvM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair EZpvd(C9082bOq c9082bOq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (Intrinsics.EZpvd(c9082bOq.uzCIH().isFacet(), java.lang.Boolean.TRUE) && C33129mqd.OLrzqt((java.lang.CharSequence) c9082bOq.uzCIH().getFacetBlackHoleAddress()) && C33129mqd.OLrzqt((java.lang.CharSequence) c9082bOq.uzCIH().getFacetContractAddress())) {
            java.lang.String facetBlackHoleAddress = c9082bOq.uzCIH().getFacetBlackHoleAddress();
            Intrinsics.copydefault((java.lang.Object) facetBlackHoleAddress);
            c9082bOq.OLrzqt = facetBlackHoleAddress;
            java.lang.String facetContractAddress = c9082bOq.uzCIH().getFacetContractAddress();
            Intrinsics.copydefault((java.lang.Object) facetContractAddress);
            c9082bOq.KWHzl = facetContractAddress;
            return pair;
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("EthsTransferSignHandler", "facetAddress empty"));
    }

    @Override // o.C8998bNL
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        AbstractC58185ywX abstractC58185ywXCopydefault = OFhtUX().copydefault(fERRXa().getAddress(), AEQbTJ(), this.OLrzqt, (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : "0", (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9082bOq.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9082bOq.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.C8998bNL
    public BaseAccountTransaction UeEOUB() {
        return QVAiDq();
    }

    @Override // o.C8998bNL
    public AccountTransaction QVAiDq() {
        AccountTransaction accountTransactionQVAiDq = super.QVAiDq();
        accountTransactionQVAiDq.setTo(this.OLrzqt);
        accountTransactionQVAiDq.setValue("0");
        accountTransactionQVAiDq.setData(AEQbTJ());
        return accountTransactionQVAiDq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // o.C8998bNL
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXCopydefault = super.copydefault(abstractC58185ywX);
        final Function1 function1 = new Function1() { // from class: o.bOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9082bOq.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9082bOq.OqFWZa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AEQbTJ(C9082bOq c9082bOq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        ((BatchBroadcastModel) data).getTxList().get(0).setInputData(c9082bOq.AEQbTJ());
        return responseData;
    }

    public static final kotlin.Pair copydefault(C9082bOq c9082bOq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c9082bOq.KWHzl((WalletGasLimitRes) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
