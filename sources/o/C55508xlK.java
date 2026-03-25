package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55508xlK extends AbstractC55501xlD {
    public final java.lang.String AhwBna;
    public InterfaceC58217yxC djBIcL;
    public final AbstractC55567xmQ gEmmrt;

    public C55508xlK(@NotNull java.lang.String str, AbstractC55567xmQ abstractC55567xmQ) {
        RankListRequestGroup rankListRequestGroupCopydefault;
        RankListRequest request;
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.gEmmrt = abstractC55567xmQ;
        java.lang.String num = (abstractC55567xmQ == null || (rankListRequestGroupCopydefault = abstractC55567xmQ.copydefault()) == null || (request = rankListRequestGroupCopydefault.getRequest()) == null) ? null : request.getNum();
        if (num == null || num.length() == 0) {
            throw new java.lang.IllegalArgumentException("ws need HotFuturesRank request filed num");
        }
        AYXKKw();
    }

    public boolean AEQbTJ(java.lang.Object obj) {
        if (obj instanceof AbstractC55567xmQ) {
            java.lang.String strOLrzqt = ((AbstractC55567xmQ) obj).OLrzqt();
            AbstractC55567xmQ abstractC55567xmQ = this.gEmmrt;
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) (abstractC55567xmQ != null ? abstractC55567xmQ.OLrzqt() : null))) {
                return false;
            }
        }
        djBIcL();
        return true;
    }

    @Override // o.AbstractC55501xlD
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xlL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55508xlK.OLrzqt(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xlR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55508xlK.copydefault(this.KWHzl, (java.util.ArrayList) obj);
                    }
                };
                this.djBIcL = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xlO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55508xlK.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55567xmQ abstractC55567xmQ = this.gEmmrt;
                if (abstractC55567xmQ != null) {
                    abstractC55567xmQ.KWHzl(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void OLrzqt(java.lang.String str, C55508xlK c55508xlK, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupCopydefault;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupCopydefault2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupCopydefault3;
        RankListRequest request3;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.List<FuturesRankItemPo> listKWHzl = c55508xlK.KWHzl((java.util.List<FuturesRankItemPo>) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(FuturesRankItemPo.Companion.serializer()), str));
        int size = listKWHzl.size();
        AbstractC55567xmQ abstractC55567xmQ = c55508xlK.gEmmrt;
        java.lang.String num2 = null;
        boolean zCopydefault = C33129mqd.copydefault(java.lang.Integer.valueOf(size), (abstractC55567xmQ == null || (rankListRequestGroupCopydefault3 = abstractC55567xmQ.copydefault()) == null || (request3 = rankListRequestGroupCopydefault3.getRequest()) == null) ? null : request3.getNum());
        AbstractC55567xmQ abstractC55567xmQ2 = c55508xlK.gEmmrt;
        if (abstractC55567xmQ2 != null && (rankListRequestGroupCopydefault2 = abstractC55567xmQ2.copydefault()) != null && (request2 = rankListRequestGroupCopydefault2.getRequest()) != null) {
            num2 = request2.getNum();
        }
        if (zCopydefault & C33129mqd.AEQbTJ(num2, 0)) {
            AbstractC55567xmQ abstractC55567xmQ3 = c55508xlK.gEmmrt;
            listKWHzl = listKWHzl.subList(0, (abstractC55567xmQ3 == null || (rankListRequestGroupCopydefault = abstractC55567xmQ3.copydefault()) == null || (request = rankListRequestGroupCopydefault.getRequest()) == null || (num = request.getNum()) == null) ? listKWHzl.size() : C33129mqd.AhwBna(num));
        }
        interfaceC58251yxk.onNext(new java.util.ArrayList(listKWHzl));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C55508xlK c55508xlK, java.util.ArrayList arrayList) {
        AbstractC55567xmQ abstractC55567xmQ = c55508xlK.gEmmrt;
        if (abstractC55567xmQ != null) {
            abstractC55567xmQ.OLrzqt("WebSocket", new java.util.ArrayList<>(arrayList));
        }
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        pUU.KWHzl("HotFuturesRankTask", "initSocket() called");
        AhwBna();
    }

    public final void AhwBna() {
        RankListRequestGroup rankListRequestGroupCopydefault;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupCopydefault2;
        RankListRequest request2;
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
        java.lang.String type = null;
        java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
            AbstractC55567xmQ abstractC55567xmQ = this.gEmmrt;
            if (abstractC55567xmQ != null && (rankListRequestGroupCopydefault = abstractC55567xmQ.copydefault()) != null && (request = rankListRequestGroupCopydefault.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("futures-hot-rank-1D", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55567xmQ abstractC55567xmQ2 = this.gEmmrt;
            if (abstractC55567xmQ2 != null && (rankListRequestGroupCopydefault2 = abstractC55567xmQ2.copydefault()) != null && (request2 = rankListRequestGroupCopydefault2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("futures-hot-rank-1D", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("futures-hot-rank-1D", v5Connection$default, arrayList, new Function2() { // from class: o.xlP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55508xlK.EZpvd(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit EZpvd(C55508xlK c55508xlK, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c55508xlK.KWHzl(true);
        c55508xlK.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void djBIcL() {
        pUU.KWHzl("HotFuturesRankTask", "release() called");
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCOLrzqt = OLrzqt();
        if (interfaceC58217yxCOLrzqt != null) {
            interfaceC58217yxCOLrzqt.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCEZpvd = EZpvd();
        if (interfaceC58217yxCEZpvd != null) {
            interfaceC58217yxCEZpvd.dispose();
        }
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.djBIcL();
        }
        C54407xHg.Companion.EZpvd("futures-hot-rank-1D", copydefault());
    }

    public final java.util.List<FuturesRankItemPo> KWHzl(java.util.List<FuturesRankItemPo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            FuturesRankItemPo futuresRankItemPo = (FuturesRankItemPo) obj;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.OLrzqt(futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
