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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55562xmL extends AbstractC55501xlD {
    public InterfaceC58217yxC AhwBna;
    public final AbstractC55576xmZ djBIcL;
    public final java.lang.String valueOf;

    public C55562xmL(@NotNull java.lang.String str, AbstractC55576xmZ abstractC55576xmZ) {
        RankListRequestGroup rankListRequestGroupCopydefault;
        RankListRequest request;
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        this.djBIcL = abstractC55576xmZ;
        java.lang.String num = (abstractC55576xmZ == null || (rankListRequestGroupCopydefault = abstractC55576xmZ.copydefault()) == null || (request = rankListRequestGroupCopydefault.getRequest()) == null) ? null : request.getNum();
        if (num == null || num.length() == 0) {
            throw new java.lang.IllegalArgumentException("ws need HotFuturesRank request filed num");
        }
        AYXKKw();
    }

    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55576xmZ) {
            java.lang.String strKWHzl = ((AbstractC55576xmZ) obj).KWHzl();
            AbstractC55576xmZ abstractC55576xmZ = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (abstractC55576xmZ != null ? abstractC55576xmZ.KWHzl() : null))) {
                return false;
            }
        }
        AhwBna();
        return true;
    }

    @Override // o.AbstractC55501xlD
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55562xmL.AEQbTJ(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xmP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55562xmL.KWHzl(this.EZpvd, (java.util.ArrayList) obj);
                    }
                };
                this.AhwBna = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55562xmL.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55576xmZ abstractC55576xmZ = this.djBIcL;
                if (abstractC55576xmZ != null) {
                    abstractC55576xmZ.EZpvd(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void AEQbTJ(java.lang.String str, C55562xmL c55562xmL, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupCopydefault;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupCopydefault2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupCopydefault3;
        RankListRequest request3;
        RankListRequestGroup rankListRequestGroupCopydefault4;
        RankListRequest request4;
        java.lang.String zone;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        JsonArray jsonArray = JsonElementKt.getJsonArray(c33489mxS.AEQbTJ().parseToJsonElement(str));
        if (jsonArray.size() > 0) {
            java.util.Map map = (java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl), BuiltinSerializersKt.ListSerializer(FuturesRankItemPo.Companion.serializer())), jsonArray.get(0).toString());
            C55488xkr c55488xkr = C55488xkr.KWHzl;
            AbstractC55576xmZ abstractC55576xmZ = c55562xmL.djBIcL;
            if (abstractC55576xmZ != null && (rankListRequestGroupCopydefault4 = abstractC55576xmZ.copydefault()) != null && (request4 = rankListRequestGroupCopydefault4.getRequest()) != null && (zone = request4.getZone()) != null) {
                str2 = zone;
            }
            java.util.List list = (java.util.List) map.get(c55488xkr.KWHzl(str2));
            java.util.List<FuturesRankItemPo> listAEQbTJ = c55562xmL.AEQbTJ(list != null ? new java.util.ArrayList(list) : new java.util.ArrayList());
            int size = listAEQbTJ.size();
            AbstractC55576xmZ abstractC55576xmZ2 = c55562xmL.djBIcL;
            java.lang.String num2 = null;
            boolean zCopydefault = C33129mqd.copydefault(java.lang.Integer.valueOf(size), (abstractC55576xmZ2 == null || (rankListRequestGroupCopydefault3 = abstractC55576xmZ2.copydefault()) == null || (request3 = rankListRequestGroupCopydefault3.getRequest()) == null) ? null : request3.getNum());
            AbstractC55576xmZ abstractC55576xmZ3 = c55562xmL.djBIcL;
            if (abstractC55576xmZ3 != null && (rankListRequestGroupCopydefault2 = abstractC55576xmZ3.copydefault()) != null && (request2 = rankListRequestGroupCopydefault2.getRequest()) != null) {
                num2 = request2.getNum();
            }
            if (zCopydefault & C33129mqd.AEQbTJ(num2, 0)) {
                AbstractC55576xmZ abstractC55576xmZ4 = c55562xmL.djBIcL;
                listAEQbTJ = listAEQbTJ.subList(0, (abstractC55576xmZ4 == null || (rankListRequestGroupCopydefault = abstractC55576xmZ4.copydefault()) == null || (request = rankListRequestGroupCopydefault.getRequest()) == null || (num = request.getNum()) == null) ? listAEQbTJ.size() : C33129mqd.AhwBna(num));
            }
            interfaceC58251yxk.onNext(new java.util.ArrayList(listAEQbTJ));
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C55562xmL c55562xmL, java.util.ArrayList arrayList) {
        AbstractC55576xmZ abstractC55576xmZ = c55562xmL.djBIcL;
        if (abstractC55576xmZ != null) {
            abstractC55576xmZ.OLrzqt("WebSocket", new java.util.ArrayList<>(arrayList));
        }
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        pUU.KWHzl("UpFuturesRankTask", "initSocket() called");
        valueOf();
    }

    private final void valueOf() {
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
            AbstractC55576xmZ abstractC55576xmZ = this.djBIcL;
            if (abstractC55576xmZ != null && (rankListRequestGroupCopydefault = abstractC55576xmZ.copydefault()) != null && (request = rankListRequestGroupCopydefault.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("futures-up-rank-1D", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55576xmZ abstractC55576xmZ2 = this.djBIcL;
            if (abstractC55576xmZ2 != null && (rankListRequestGroupCopydefault2 = abstractC55576xmZ2.copydefault()) != null && (request2 = rankListRequestGroupCopydefault2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("futures-up-rank-1D", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("futures-up-rank-1D", v5Connection$default, arrayList, new Function2() { // from class: o.xmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55562xmL.AEQbTJ(this.copydefault, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit AEQbTJ(C55562xmL c55562xmL, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c55562xmL.KWHzl(true);
        c55562xmL.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void AhwBna() {
        pUU.KWHzl("UpFuturesRankTask", "release() called");
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
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
        C54407xHg.Companion.EZpvd("futures-up-rank-1D", copydefault());
    }

    public final java.util.List<FuturesRankItemPo> AEQbTJ(java.util.List<FuturesRankItemPo> list) {
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
