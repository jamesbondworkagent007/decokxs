package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseItemInfo;
import com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12239cjG<ItemMintInfo extends UTXOMintBaseItemInfo, SignData extends UTXOMintBaseSignData<ItemMintInfo>> extends AbstractC11993ceZ<SignData> {
    public C10854bwM dNCPSb;

    public java.lang.String DNMMPQ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM RXzakW() {
        return this.dNCPSb;
    }

    @Override // o.AbstractC8704bHj
    public boolean heceqZ() {
        return false;
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> aJFbMH() {
        java.lang.String strDNMMPQ = DNMMPQ();
        if (strDNMMPQ == null || strDNMMPQ.length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<CoinMetaBean>> abstractC58185ywXKWHzl2 = OFhtUX().KWHzl(QVsKAR().getProtocolId(), strDNMMPQ);
        final Function1 function1 = new Function1() { // from class: o.cjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12239cjG.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12239cjG.DGOPHZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        if (this.dNCPSb != null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQHmsKR = QHmsKR();
            final Function1 function1 = new Function1() { // from class: o.cjK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12239cjG.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQHmsKR.KWHzl(new InterfaceC58229yxO() { // from class: o.cjN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12239cjG.WS(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.dxcTrN();
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC12239cjG abstractC12239cjG, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.dxcTrN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.Integer dvKsVJ() {
        return java.lang.Integer.valueOf(QVsKAR().getProtocolId());
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8664bGw
    public kotlin.Pair<java.lang.Boolean, java.lang.String> ao_() {
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public java.lang.String TarCU() {
        java.lang.String mintOutputSat = QVsKAR().getMintOutputSat();
        if (mintOutputSat == null || mintOutputSat.length() == 0) {
            UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
            java.lang.String inscriptionOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null;
            if (inscriptionOutput != null && inscriptionOutput.length() != 0) {
                return inscriptionOutput;
            }
        } else {
            java.lang.String mintOutputSat2 = QVsKAR().getMintOutputSat();
            if (mintOutputSat2 != null && mintOutputSat2.length() != 0) {
                return mintOutputSat2;
            }
        }
        return "546";
    }

    public int RKcVTr() {
        java.util.List mintItemList = QVsKAR().getMintItemList();
        if (mintItemList != null) {
            return mintItemList.size();
        }
        return 0;
    }

    public java.util.List<ItemMintInfo> QIZEnU() {
        java.util.List<ItemMintInfo> mintItemList = QVsKAR().getMintItemList();
        return mintItemList == null ? yDY.AhwBna() : mintItemList;
    }

    public final java.lang.String ULRxlR() {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.convertToString$default(C54862xYb.KWHzl(C54862xYb.OLrzqt(TarCU(), java.lang.Integer.valueOf(RKcVTr())), DXXBbs().AEQbTJ()), false, null, null, 7, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        switch (QVsKAR().getMintType()) {
            case 0:
                return "62";
            case 1:
                return "61";
            case 2:
                return "60";
            case 3:
                return "50";
            case 4:
            case 9:
                return "51";
            case 5:
                return "33";
            case 6:
                return "34";
            case 7:
                return "35";
            case 8:
                return "36";
            case 10:
                return "58";
            default:
                return "";
        }
    }

    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), responseData.getData(), DGOPHZ(), C33129mqd.AhwBna(l_()), fHqPtx().DbNXlk(), null, false, null, 448, null);
    }

    public static final kotlin.Pair copydefault(AbstractC12239cjG abstractC12239cjG, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            abstractC12239cjG.dNCPSb = new C10854bwM((CoinMetaBean) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
