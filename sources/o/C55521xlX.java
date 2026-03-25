package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.MarketCapRank;
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
import o.C55521xlX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55521xlX extends AbstractC55501xlD {
    public final java.lang.String AhwBna;
    public InterfaceC58217yxC djBIcL;
    public final AbstractC55575xmY gEmmrt;
    public InterfaceC58217yxC valueOf;

    public C55521xlX(@NotNull java.lang.String str, AbstractC55575xmY abstractC55575xmY) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.gEmmrt = abstractC55575xmY;
        if (abstractC55575xmY != null && (rankListRequestGroupAEQbTJ2 = abstractC55575xmY.AEQbTJ()) != null && rankListRequestGroupAEQbTJ2.getNeedWs()) {
            java.lang.String num = abstractC55575xmY.AEQbTJ().getRequest().getNum();
            if (num == null || num.length() == 0) {
                throw new java.lang.IllegalArgumentException("ws need RankListRequest filed num");
            }
            AhwBna();
        }
        if (abstractC55575xmY == null || (rankListRequestGroupAEQbTJ = abstractC55575xmY.AEQbTJ()) == null || !rankListRequestGroupAEQbTJ.getNeedHttp()) {
            return;
        }
        copydefault(AEQbTJ().EZpvd(abstractC55575xmY.AEQbTJ().getRequest(), new AnonymousClass1()));
    }

    /* JADX INFO: renamed from: o.xlX$1, reason: invalid class name */
    public static final class AnonymousClass1 implements InterfaceC55701xos<java.util.List<? extends MarketCapRank>> {
        public AnonymousClass1() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends MarketCapRank> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<MarketCapRank>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, final java.util.List<MarketCapRank> list, java.lang.Exception exc) {
            if (z) {
                InterfaceC58217yxC interfaceC58217yxC = C55521xlX.this.djBIcL;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                C55521xlX c55521xlX = C55521xlX.this;
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xme
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55521xlX.AnonymousClass1.KWHzl(list, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final C55521xlX c55521xlX2 = C55521xlX.this;
                final Function1 function1 = new Function1() { // from class: o.xmc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55521xlX.AnonymousClass1.KWHzl(c55521xlX2, (java.util.ArrayList) obj);
                    }
                };
                c55521xlX.djBIcL = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55521xlX.AnonymousClass1.KWHzl(function1, obj);
                    }
                });
                return;
            }
            AbstractC55575xmY abstractC55575xmY = C55521xlX.this.gEmmrt;
            Intrinsics.copydefault(exc);
            abstractC55575xmY.OLrzqt(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            java.util.ArrayList<MarketCapRank> arrayListOLrzqt = C55631xnb.AEQbTJ.OLrzqt(list);
            if (arrayListOLrzqt != null) {
                interfaceC58251yxk.onNext(arrayListOLrzqt);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(C55521xlX c55521xlX, java.util.ArrayList arrayList) {
            AbstractC55575xmY abstractC55575xmY = c55521xlX.gEmmrt;
            Intrinsics.copydefault(arrayList);
            abstractC55575xmY.EZpvd("http", arrayList);
            return Unit.INSTANCE;
        }
    }

    public boolean EZpvd(java.lang.Object obj) {
        if (obj instanceof AbstractC55575xmY) {
            java.lang.String strOLrzqt = ((AbstractC55575xmY) obj).OLrzqt();
            AbstractC55575xmY abstractC55575xmY = this.gEmmrt;
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) (abstractC55575xmY != null ? abstractC55575xmY.OLrzqt() : null))) {
                return false;
            }
        }
        valueOf();
        return true;
    }

    @Override // o.AbstractC55501xlD
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55521xlX.copydefault(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xlY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55521xlX.copydefault(this.copydefault, (java.util.ArrayList) obj);
                    }
                };
                this.valueOf = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xlZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55521xlX.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55575xmY abstractC55575xmY = this.gEmmrt;
                if (abstractC55575xmY != null) {
                    abstractC55575xmY.OLrzqt(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void copydefault(java.lang.String str, C55521xlX c55521xlX, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupAEQbTJ3;
        RankListRequest request3;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.ArrayList<MarketCapRank> arrayListOLrzqt = C55631xnb.AEQbTJ.OLrzqt((java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(MarketCapRank.Companion.serializer()), str));
        java.util.List<MarketCapRank> listSubList = null;
        java.lang.Integer numValueOf = arrayListOLrzqt != null ? java.lang.Integer.valueOf(arrayListOLrzqt.size()) : null;
        AbstractC55575xmY abstractC55575xmY = c55521xlX.gEmmrt;
        boolean zCopydefault = C33129mqd.copydefault(numValueOf, (abstractC55575xmY == null || (rankListRequestGroupAEQbTJ3 = abstractC55575xmY.AEQbTJ()) == null || (request3 = rankListRequestGroupAEQbTJ3.getRequest()) == null) ? null : request3.getNum());
        AbstractC55575xmY abstractC55575xmY2 = c55521xlX.gEmmrt;
        if (zCopydefault & C33129mqd.AEQbTJ((abstractC55575xmY2 == null || (rankListRequestGroupAEQbTJ2 = abstractC55575xmY2.AEQbTJ()) == null || (request2 = rankListRequestGroupAEQbTJ2.getRequest()) == null) ? null : request2.getNum(), 0)) {
            if (arrayListOLrzqt != null) {
                AbstractC55575xmY abstractC55575xmY3 = c55521xlX.gEmmrt;
                listSubList = arrayListOLrzqt.subList(0, (abstractC55575xmY3 == null || (rankListRequestGroupAEQbTJ = abstractC55575xmY3.AEQbTJ()) == null || (request = rankListRequestGroupAEQbTJ.getRequest()) == null || (num = request.getNum()) == null) ? arrayListOLrzqt.size() : C33129mqd.AhwBna(num));
            }
            arrayListOLrzqt = new java.util.ArrayList<>(listSubList);
        }
        if (arrayListOLrzqt != null) {
            interfaceC58251yxk.onNext(arrayListOLrzqt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C55521xlX c55521xlX, java.util.ArrayList arrayList) {
        AbstractC55575xmY abstractC55575xmY = c55521xlX.gEmmrt;
        if (abstractC55575xmY != null) {
            abstractC55575xmY.EZpvd("WebSocket", new java.util.ArrayList<>(arrayList));
        }
        return Unit.INSTANCE;
    }

    public void AhwBna() {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        RankListRequest request2;
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
        java.lang.String type = null;
        java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
            AbstractC55575xmY abstractC55575xmY = this.gEmmrt;
            if (abstractC55575xmY != null && (rankListRequestGroupAEQbTJ = abstractC55575xmY.AEQbTJ()) != null && (request = rankListRequestGroupAEQbTJ.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("market-cap-rank-s", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55575xmY abstractC55575xmY2 = this.gEmmrt;
            if (abstractC55575xmY2 != null && (rankListRequestGroupAEQbTJ2 = abstractC55575xmY2.AEQbTJ()) != null && (request2 = rankListRequestGroupAEQbTJ2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("market-cap-rank-s", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("market-cap-rank-s", v5Connection$default, arrayList, new Function2() { // from class: o.xmg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55521xlX.KWHzl(this.OLrzqt, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit KWHzl(C55521xlX c55521xlX, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c55521xlX.KWHzl(true);
        c55521xlX.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void valueOf() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.djBIcL;
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
        C54407xHg.Companion.EZpvd("market-cap-rank-s", copydefault());
    }
}
