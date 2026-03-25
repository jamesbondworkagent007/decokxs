package o;

import com.okinc.business.defi.api.bean.BTCNFTDetails;
import com.okinc.business.defi.api.bean.BTCNFTDetailsReq;
import com.okinc.business.defi.api.bean.BTCNFTDetailsResp;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.chW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12149chW extends C12167cho {
    public java.util.List<BTCNFTDetails> dNCPSb;

    @Override // o.C12167cho
    public java.lang.String TarCU() {
        return null;
    }

    public static final InterfaceC60096zvd hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.C12167cho, o.AbstractC12102cgc, o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUfzxmz = Ufzxmz();
        final Function1 function1 = new Function1() { // from class: o.chV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12149chW.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUfzxmz.KWHzl(new InterfaceC58229yxO() { // from class: o.cia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12149chW.hCLrkq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(C12149chW c12149chW, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.r_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> Ufzxmz() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        java.lang.String from = fixedUTXOInfo != null ? fixedUTXOInfo.getFrom() : null;
        if (from == null) {
            from = "";
        }
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        java.util.Iterator<T> it = batchBean.iterator();
        while (it.hasNext()) {
            arrayList.add(((FixedUTXOInfo) it.next()).getNftId());
        }
        AbstractC58185ywX<ResponseData<BTCNFTDetailsResp>> abstractC58185ywXKWHzl = c13934dbuOFhtUX.KWHzl(new BTCNFTDetailsReq(from, arrayList));
        final Function1 function1 = new Function1() { // from class: o.chU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12149chW.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.chT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12149chW.DGOPHZDGOPHZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C12149chW c12149chW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        BTCNFTDetailsResp bTCNFTDetailsResp = (BTCNFTDetailsResp) responseData.getData();
        c12149chW.dNCPSb = bTCNFTDetailsResp != null ? bTCNFTDetailsResp.getList() : null;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final java.util.List<UTXONftInfo> alsFma() {
        java.util.List<UTXONftInfo> listDaRZkR = DaRZkR();
        for (UTXONftInfo uTXONftInfo : listDaRZkR) {
            java.util.List<BTCNFTDetails> list = this.dNCPSb;
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        BTCNFTDetails bTCNFTDetails = (BTCNFTDetails) it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) bTCNFTDetails.getInscriptionId(), (java.lang.Object) uTXONftInfo.getNftId())) {
                            uTXONftInfo.setName(bTCNFTDetails.getName());
                            uTXONftInfo.setImgUrl(bTCNFTDetails.getCoverUrl());
                            break;
                        }
                    }
                }
            }
        }
        return listDaRZkR;
    }
}
