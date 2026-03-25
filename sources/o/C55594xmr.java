package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C54401xHa;
import o.C55594xmr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55594xmr extends AbstractC55501xlD {
    public final AbstractC55572xmV AhwBna;
    public final java.lang.String djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC valueOf;

    public C55594xmr(@NotNull java.lang.String str, AbstractC55572xmV abstractC55572xmV) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.AhwBna = abstractC55572xmV;
        if (abstractC55572xmV != null && (rankListRequestGroupAEQbTJ2 = abstractC55572xmV.AEQbTJ()) != null && rankListRequestGroupAEQbTJ2.getNeedWs()) {
            java.lang.String num = abstractC55572xmV.AEQbTJ().getRequest().getNum();
            if (num == null || num.length() == 0) {
                throw new java.lang.IllegalArgumentException("ws need RankListRequest filed num");
            }
            AhwBna();
        }
        if (abstractC55572xmV == null || (rankListRequestGroupAEQbTJ = abstractC55572xmV.AEQbTJ()) == null || !rankListRequestGroupAEQbTJ.getNeedHttp()) {
            return;
        }
        copydefault(AEQbTJ().OLrzqt(abstractC55572xmV.AEQbTJ().getRequest(), new AnonymousClass2()));
    }

    /* JADX INFO: renamed from: o.xmr$2, reason: invalid class name */
    public static final class AnonymousClass2 implements InterfaceC55701xos<java.util.List<? extends TurnOverRank>> {
        public AnonymousClass2() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TurnOverRank> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TurnOverRank>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, final java.util.List<TurnOverRank> list, java.lang.Exception exc) {
            if (z) {
                InterfaceC58217yxC interfaceC58217yxC = C55594xmr.this.valueOf;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                C55594xmr c55594xmr = C55594xmr.this;
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55594xmr.AnonymousClass2.KWHzl(list, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final C55594xmr c55594xmr2 = C55594xmr.this;
                final Function1 function1 = new Function1() { // from class: o.xmE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55594xmr.AnonymousClass2.OLrzqt(c55594xmr2, (java.util.ArrayList) obj);
                    }
                };
                c55594xmr.valueOf = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55594xmr.AnonymousClass2.AEQbTJ(function1, obj);
                    }
                });
                return;
            }
            AbstractC55572xmV abstractC55572xmV = C55594xmr.this.AhwBna;
            Intrinsics.copydefault(exc);
            abstractC55572xmV.EZpvd(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            java.util.ArrayList<TurnOverRank> arrayListEZpvd = C55631xnb.AEQbTJ.EZpvd(list);
            if (arrayListEZpvd != null) {
                interfaceC58251yxk.onNext(arrayListEZpvd);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(C55594xmr c55594xmr, java.util.ArrayList arrayList) {
            AbstractC55572xmV abstractC55572xmV = c55594xmr.AhwBna;
            Intrinsics.copydefault(arrayList);
            abstractC55572xmV.EZpvd("http", arrayList);
            return Unit.INSTANCE;
        }
    }

    public boolean AEQbTJ(java.lang.Object obj) {
        if (obj instanceof AbstractC55572xmV) {
            java.lang.String strEZpvd = ((AbstractC55572xmV) obj).EZpvd();
            AbstractC55572xmV abstractC55572xmV = this.AhwBna;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55572xmV != null ? abstractC55572xmV.EZpvd() : null))) {
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
                InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55594xmr.AEQbTJ(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xmz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55594xmr.AEQbTJ(this.copydefault, (java.util.ArrayList) obj);
                    }
                };
                this.gEmmrt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xmy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55594xmr.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55572xmV abstractC55572xmV = this.AhwBna;
                if (abstractC55572xmV != null) {
                    abstractC55572xmV.EZpvd(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void AEQbTJ(java.lang.String str, C55594xmr c55594xmr, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupAEQbTJ3;
        RankListRequest request3;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.ArrayList<TurnOverRank> arrayListEZpvd = C55631xnb.AEQbTJ.EZpvd((java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(TurnOverRank.Companion.serializer()), str));
        java.util.List<TurnOverRank> listSubList = null;
        java.lang.Integer numValueOf = arrayListEZpvd != null ? java.lang.Integer.valueOf(arrayListEZpvd.size()) : null;
        AbstractC55572xmV abstractC55572xmV = c55594xmr.AhwBna;
        boolean zCopydefault = C33129mqd.copydefault(numValueOf, (abstractC55572xmV == null || (rankListRequestGroupAEQbTJ3 = abstractC55572xmV.AEQbTJ()) == null || (request3 = rankListRequestGroupAEQbTJ3.getRequest()) == null) ? null : request3.getNum());
        AbstractC55572xmV abstractC55572xmV2 = c55594xmr.AhwBna;
        if (zCopydefault & C33129mqd.AEQbTJ((abstractC55572xmV2 == null || (rankListRequestGroupAEQbTJ2 = abstractC55572xmV2.AEQbTJ()) == null || (request2 = rankListRequestGroupAEQbTJ2.getRequest()) == null) ? null : request2.getNum(), 0)) {
            if (arrayListEZpvd != null) {
                AbstractC55572xmV abstractC55572xmV3 = c55594xmr.AhwBna;
                listSubList = arrayListEZpvd.subList(0, (abstractC55572xmV3 == null || (rankListRequestGroupAEQbTJ = abstractC55572xmV3.AEQbTJ()) == null || (request = rankListRequestGroupAEQbTJ.getRequest()) == null || (num = request.getNum()) == null) ? arrayListEZpvd.size() : C33129mqd.AhwBna(num));
            }
            arrayListEZpvd = new java.util.ArrayList<>(listSubList);
        }
        if (arrayListEZpvd != null) {
            interfaceC58251yxk.onNext(arrayListEZpvd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C55594xmr c55594xmr, java.util.ArrayList arrayList) {
        AbstractC55572xmV abstractC55572xmV = c55594xmr.AhwBna;
        if (abstractC55572xmV != null) {
            abstractC55572xmV.EZpvd("WebSocket", new java.util.ArrayList<>(arrayList));
        }
        return Unit.INSTANCE;
    }

    public void valueOf() {
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
        C54407xHg.Companion.EZpvd("turn-over-rank-s", copydefault());
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
            AbstractC55572xmV abstractC55572xmV = this.AhwBna;
            if (abstractC55572xmV != null && (rankListRequestGroupAEQbTJ = abstractC55572xmV.AEQbTJ()) != null && (request = rankListRequestGroupAEQbTJ.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("turn-over-rank-s", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55572xmV abstractC55572xmV2 = this.AhwBna;
            if (abstractC55572xmV2 != null && (rankListRequestGroupAEQbTJ2 = abstractC55572xmV2.AEQbTJ()) != null && (request2 = rankListRequestGroupAEQbTJ2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("turn-over-rank-s", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("turn-over-rank-s", v5Connection$default, arrayList, new Function2() { // from class: o.xmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55594xmr.OLrzqt(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit OLrzqt(C55594xmr c55594xmr, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c55594xmr.KWHzl(true);
        c55594xmr.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }
}
