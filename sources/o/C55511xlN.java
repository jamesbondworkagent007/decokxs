package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.HotRankResponse;
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
import o.C55511xlN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55511xlN extends AbstractC55501xlD {
    public final AbstractC55571xmU AhwBna;
    public final java.lang.String djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC55571xmU valueOf() {
        return this.AhwBna;
    }

    public C55511xlN(@NotNull java.lang.String str, AbstractC55571xmU abstractC55571xmU) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.AhwBna = abstractC55571xmU;
        if (abstractC55571xmU != null && (rankListRequestGroupAEQbTJ2 = abstractC55571xmU.AEQbTJ()) != null && rankListRequestGroupAEQbTJ2.getNeedWs()) {
            java.lang.String num = abstractC55571xmU.AEQbTJ().getRequest().getNum();
            if (num == null || num.length() == 0) {
                throw new java.lang.IllegalArgumentException("ws need RankListRequest filed num");
            }
            AhwBna();
        }
        if (abstractC55571xmU == null || (rankListRequestGroupAEQbTJ = abstractC55571xmU.AEQbTJ()) == null || !rankListRequestGroupAEQbTJ.getNeedHttp()) {
            return;
        }
        copydefault(AEQbTJ().AEQbTJ(abstractC55571xmU.AEQbTJ().getRequest(), new AnonymousClass5()));
    }

    /* JADX INFO: renamed from: o.xlN$5, reason: invalid class name */
    public static final class AnonymousClass5 implements InterfaceC55701xos<java.util.List<? extends HotRankResponse>> {
        public AnonymousClass5() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, final java.util.List<HotRankResponse> list, java.lang.Exception exc) {
            if (z) {
                InterfaceC58217yxC interfaceC58217yxC = C55511xlN.this.gEmmrt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                C55511xlN c55511xlN = C55511xlN.this;
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xlU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55511xlN.AnonymousClass5.EZpvd(list, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final C55511xlN c55511xlN2 = C55511xlN.this;
                final Function1 function1 = new Function1() { // from class: o.xlS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55511xlN.AnonymousClass5.copydefault(c55511xlN2, (java.util.ArrayList) obj);
                    }
                };
                c55511xlN.gEmmrt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xma
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55511xlN.AnonymousClass5.KWHzl(function1, obj);
                    }
                });
                return;
            }
            AbstractC55571xmU abstractC55571xmUValueOf = C55511xlN.this.valueOf();
            Intrinsics.copydefault(exc);
            abstractC55571xmUValueOf.AEQbTJ(exc);
        }

        public static final void EZpvd(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            java.util.ArrayList<HotRankResponse> arrayListCopydefault = C55631xnb.AEQbTJ.copydefault(list);
            if (arrayListCopydefault != null) {
                interfaceC58251yxk.onNext(arrayListCopydefault);
            }
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(C55511xlN c55511xlN, java.util.ArrayList arrayList) {
            AbstractC55571xmU abstractC55571xmUValueOf = c55511xlN.valueOf();
            Intrinsics.copydefault(arrayList);
            abstractC55571xmUValueOf.EZpvd("http", arrayList);
            return Unit.INSTANCE;
        }
    }

    public boolean copydefault(java.lang.Object obj) {
        if (obj instanceof AbstractC55571xmU) {
            java.lang.String strEZpvd = ((AbstractC55571xmU) obj).EZpvd();
            AbstractC55571xmU abstractC55571xmU = this.AhwBna;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55571xmU != null ? abstractC55571xmU.EZpvd() : null))) {
                return false;
            }
        }
        AYXKKw();
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
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xlQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55511xlN.AEQbTJ(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xlT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55511xlN.AEQbTJ(this.AEQbTJ, (java.util.ArrayList) obj);
                    }
                };
                this.valueOf = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xlV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55511xlN.OLrzqt(function1, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55571xmU abstractC55571xmU = this.AhwBna;
                if (abstractC55571xmU != null) {
                    abstractC55571xmU.AEQbTJ(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    public static final void AEQbTJ(java.lang.String str, C55511xlN c55511xlN, InterfaceC58251yxk interfaceC58251yxk) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequest request;
        java.lang.String num;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupAEQbTJ3;
        RankListRequest request3;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.ArrayList<HotRankResponse> arrayListCopydefault = C55631xnb.AEQbTJ.copydefault((java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(HotRankResponse.Companion.serializer()), str));
        java.util.List<HotRankResponse> listSubList = null;
        java.lang.Integer numValueOf = arrayListCopydefault != null ? java.lang.Integer.valueOf(arrayListCopydefault.size()) : null;
        AbstractC55571xmU abstractC55571xmU = c55511xlN.AhwBna;
        boolean zCopydefault = C33129mqd.copydefault(numValueOf, (abstractC55571xmU == null || (rankListRequestGroupAEQbTJ3 = abstractC55571xmU.AEQbTJ()) == null || (request3 = rankListRequestGroupAEQbTJ3.getRequest()) == null) ? null : request3.getNum());
        AbstractC55571xmU abstractC55571xmU2 = c55511xlN.AhwBna;
        if (zCopydefault & C33129mqd.AEQbTJ((abstractC55571xmU2 == null || (rankListRequestGroupAEQbTJ2 = abstractC55571xmU2.AEQbTJ()) == null || (request2 = rankListRequestGroupAEQbTJ2.getRequest()) == null) ? null : request2.getNum(), 0)) {
            if (arrayListCopydefault != null) {
                AbstractC55571xmU abstractC55571xmU3 = c55511xlN.AhwBna;
                listSubList = arrayListCopydefault.subList(0, (abstractC55571xmU3 == null || (rankListRequestGroupAEQbTJ = abstractC55571xmU3.AEQbTJ()) == null || (request = rankListRequestGroupAEQbTJ.getRequest()) == null || (num = request.getNum()) == null) ? arrayListCopydefault.size() : C33129mqd.AhwBna(num));
            }
            arrayListCopydefault = new java.util.ArrayList<>(listSubList);
        }
        if (arrayListCopydefault != null) {
            interfaceC58251yxk.onNext(arrayListCopydefault);
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C55511xlN c55511xlN, java.util.ArrayList arrayList) {
        AbstractC55571xmU abstractC55571xmU = c55511xlN.AhwBna;
        if (abstractC55571xmU != null) {
            abstractC55571xmU.EZpvd("WebSocket", new java.util.ArrayList<>(arrayList));
        }
        return Unit.INSTANCE;
    }

    public void AhwBna() {
        startSocket$default(this, null, 1, null);
    }

    public static /* synthetic */ void startSocket$default(C55511xlN c55511xlN, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c55511xlN.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        RankListRequestGroup rankListRequestGroupAEQbTJ;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupAEQbTJ2;
        RankListRequest request2;
        java.lang.String type = null;
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
        java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
            AbstractC55571xmU abstractC55571xmU = this.AhwBna;
            if (abstractC55571xmU != null && (rankListRequestGroupAEQbTJ = abstractC55571xmU.AEQbTJ()) != null && (request = rankListRequestGroupAEQbTJ.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("hot-rank-s", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55571xmU abstractC55571xmU2 = this.AhwBna;
            if (abstractC55571xmU2 != null && (rankListRequestGroupAEQbTJ2 = abstractC55571xmU2.AEQbTJ()) != null && (request2 = rankListRequestGroupAEQbTJ2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("hot-rank-s", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("hot-rank-s", v5Connection$default, arrayList, new Function2() { // from class: o.xlW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55511xlN.OLrzqt(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit OLrzqt(C55511xlN c55511xlN, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        c55511xlN.KWHzl(true);
        c55511xlN.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.gEmmrt;
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
        C54407xHg.Companion.EZpvd("hot-rank-s", copydefault());
    }
}
