package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import o.AbstractC55554xmD;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55554xmD extends AbstractC55501xlD {
    public InterfaceC58217yxC AhwBna;
    public final java.lang.String djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public final AbstractC55573xmW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC55573xmW AYXKKw() {
        return this.valueOf;
    }

    public abstract java.lang.String AhwBna();

    public AbstractC55554xmD(@NotNull java.lang.String str, AbstractC55573xmW abstractC55573xmW) {
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.valueOf = abstractC55573xmW;
        if (abstractC55573xmW != null && (rankListRequestGroupOLrzqt2 = abstractC55573xmW.OLrzqt()) != null && rankListRequestGroupOLrzqt2.getNeedWs()) {
            java.lang.String num = abstractC55573xmW.OLrzqt().getRequest().getNum();
            if (num == null || num.length() == 0) {
                throw new java.lang.IllegalArgumentException("ws need RankListRequest filed num");
            }
            valueOf();
        }
        if (abstractC55573xmW == null || (rankListRequestGroupOLrzqt = abstractC55573xmW.OLrzqt()) == null || !rankListRequestGroupOLrzqt.getNeedHttp()) {
            return;
        }
        copydefault(AEQbTJ().copydefault(abstractC55573xmW.OLrzqt().getRequest(), new AnonymousClass3()));
    }

    /* JADX INFO: renamed from: o.xmD$3, reason: invalid class name */
    public static final class AnonymousClass3 implements InterfaceC55701xos<java.util.List<? extends UpDownRank>> {
        public AnonymousClass3() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, final java.util.List<UpDownRank> list, java.lang.Exception exc) {
            if (z) {
                InterfaceC58217yxC interfaceC58217yxC = AbstractC55554xmD.this.AhwBna;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC55554xmD abstractC55554xmD = AbstractC55554xmD.this;
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        AbstractC55554xmD.AnonymousClass3.EZpvd(list, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final AbstractC55554xmD abstractC55554xmD2 = AbstractC55554xmD.this;
                final Function1 function1 = new Function1() { // from class: o.xmK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC55554xmD.AnonymousClass3.copydefault(abstractC55554xmD2, list, (java.util.ArrayList) obj);
                    }
                };
                abstractC55554xmD.AhwBna = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC55554xmD.AnonymousClass3.copydefault(function1, obj);
                    }
                });
                return;
            }
            AbstractC55573xmW abstractC55573xmWAYXKKw = AbstractC55554xmD.this.AYXKKw();
            Intrinsics.copydefault(exc);
            abstractC55573xmWAYXKKw.KWHzl(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void EZpvd(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            java.util.ArrayList<UpDownRank> arrayListAhwBna = C55631xnb.AEQbTJ.AhwBna(list);
            if (arrayListAhwBna != null) {
                interfaceC58251yxk.onNext(arrayListAhwBna);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(AbstractC55554xmD abstractC55554xmD, java.util.List list, java.util.ArrayList arrayList) {
            abstractC55554xmD.AYXKKw().OLrzqt("http", new java.util.ArrayList<>(list));
            return Unit.INSTANCE;
        }
    }

    public boolean EZpvd(java.lang.Object obj) {
        if (obj instanceof AbstractC55573xmW) {
            java.lang.String strCopydefault = ((AbstractC55573xmW) obj).copydefault();
            AbstractC55573xmW abstractC55573xmW = this.valueOf;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55573xmW != null ? abstractC55573xmW.copydefault() : null))) {
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
                InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        AbstractC55554xmD.AEQbTJ(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xmB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC55554xmD.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj);
                    }
                };
                this.gEmmrt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC55554xmD.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55573xmW abstractC55573xmW = this.valueOf;
                if (abstractC55573xmW != null) {
                    abstractC55573xmW.KWHzl(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void AEQbTJ(java.lang.String str, AbstractC55554xmD abstractC55554xmD, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupOLrzqt3;
        RankListRequest request3;
        RankListRequestGroup rankListRequestGroupOLrzqt4;
        RankListRequest request4;
        java.lang.String zone;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        JsonArray jsonArray = JsonElementKt.getJsonArray(c33489mxS.AEQbTJ().parseToJsonElement(str));
        if (jsonArray == null || jsonArray.size() <= 0) {
            return;
        }
        java.util.Map map = (java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl), BuiltinSerializersKt.ListSerializer(UpDownRank.Companion.serializer())), jsonArray.get(0).toString());
        C55488xkr c55488xkr = C55488xkr.KWHzl;
        AbstractC55573xmW abstractC55573xmW = abstractC55554xmD.valueOf;
        if (abstractC55573xmW != null && (rankListRequestGroupOLrzqt4 = abstractC55573xmW.OLrzqt()) != null && (request4 = rankListRequestGroupOLrzqt4.getRequest()) != null && (zone = request4.getZone()) != null) {
            str2 = zone;
        }
        java.util.List list = (java.util.List) map.get(c55488xkr.KWHzl(str2));
        java.util.ArrayList<UpDownRank> arrayListAhwBna = C55631xnb.AEQbTJ.AhwBna(list != null ? new java.util.ArrayList(list) : new java.util.ArrayList());
        java.util.List<UpDownRank> listSubList = null;
        java.lang.Integer numValueOf = arrayListAhwBna != null ? java.lang.Integer.valueOf(arrayListAhwBna.size()) : null;
        AbstractC55573xmW abstractC55573xmW2 = abstractC55554xmD.valueOf;
        boolean zCopydefault = C33129mqd.copydefault(numValueOf, (abstractC55573xmW2 == null || (rankListRequestGroupOLrzqt3 = abstractC55573xmW2.OLrzqt()) == null || (request3 = rankListRequestGroupOLrzqt3.getRequest()) == null) ? null : request3.getNum());
        AbstractC55573xmW abstractC55573xmW3 = abstractC55554xmD.valueOf;
        if (zCopydefault & C33129mqd.AEQbTJ((abstractC55573xmW3 == null || (rankListRequestGroupOLrzqt2 = abstractC55573xmW3.OLrzqt()) == null || (request2 = rankListRequestGroupOLrzqt2.getRequest()) == null) ? null : request2.getNum(), 0)) {
            if (arrayListAhwBna != null) {
                AbstractC55573xmW abstractC55573xmW4 = abstractC55554xmD.valueOf;
                listSubList = arrayListAhwBna.subList(0, (abstractC55573xmW4 == null || (rankListRequestGroupOLrzqt = abstractC55573xmW4.OLrzqt()) == null || (request = rankListRequestGroupOLrzqt.getRequest()) == null || (num = request.getNum()) == null) ? arrayListAhwBna.size() : C33129mqd.AhwBna(num));
            }
            arrayListAhwBna = new java.util.ArrayList<>(listSubList);
        }
        if (arrayListAhwBna != null) {
            interfaceC58251yxk.onNext(arrayListAhwBna);
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC55554xmD abstractC55554xmD, java.util.ArrayList arrayList) {
        AbstractC55573xmW abstractC55573xmW = abstractC55554xmD.valueOf;
        if (abstractC55573xmW != null) {
            Intrinsics.copydefault(arrayList);
            abstractC55573xmW.OLrzqt("WebSocket", arrayList);
        }
        return Unit.INSTANCE;
    }

    public void valueOf() {
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        RankListRequest request2;
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
        java.lang.String type = null;
        java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
            java.lang.String strAhwBna = AhwBna();
            AbstractC55573xmW abstractC55573xmW = this.valueOf;
            if (abstractC55573xmW != null && (rankListRequestGroupOLrzqt = abstractC55573xmW.OLrzqt()) != null && (request = rankListRequestGroupOLrzqt.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5(strAhwBna, null, null, null, type, null, null, null, 238, null));
        } else {
            java.lang.String strAhwBna2 = AhwBna();
            AbstractC55573xmW abstractC55573xmW2 = this.valueOf;
            if (abstractC55573xmW2 != null && (rankListRequestGroupOLrzqt2 = abstractC55573xmW2.OLrzqt()) != null && (request2 = rankListRequestGroupOLrzqt2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg(strAhwBna2, null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ(AhwBna(), v5Connection$default, arrayList, new Function2() { // from class: o.xmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC55554xmD.EZpvd(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit EZpvd(AbstractC55554xmD abstractC55554xmD, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        abstractC55554xmD.KWHzl(true);
        abstractC55554xmD.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void djBIcL() {
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AhwBna;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
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
    }
}
