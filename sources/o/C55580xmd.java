package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.NewCoinRank;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.WaitOnlineRank;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import o.C54401xHa;
import o.C55580xmd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55580xmd extends AbstractC55501xlD {
    public final java.lang.String AhwBna;
    public final AbstractC55574xmX djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC valueOf;

    public C55580xmd(@NotNull java.lang.String str, AbstractC55574xmX abstractC55574xmX) {
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.djBIcL = abstractC55574xmX;
        if (abstractC55574xmX != null && (rankListRequestGroupOLrzqt2 = abstractC55574xmX.OLrzqt()) != null && rankListRequestGroupOLrzqt2.getNeedWs()) {
            java.lang.String num = abstractC55574xmX.OLrzqt().getRequest().getNum();
            if (num == null || num.length() == 0) {
                throw new java.lang.IllegalArgumentException("ws need RankListRequest filed num");
            }
            djBIcL();
        }
        if (abstractC55574xmX == null || (rankListRequestGroupOLrzqt = abstractC55574xmX.OLrzqt()) == null || !rankListRequestGroupOLrzqt.getNeedHttp()) {
            return;
        }
        copydefault(AEQbTJ().KWHzl(abstractC55574xmX.OLrzqt().getRequest(), new AnonymousClass4()));
    }

    /* JADX INFO: renamed from: o.xmd$4, reason: invalid class name */
    public static final class AnonymousClass4 implements InterfaceC55701xos<java.util.List<? extends NewCoinGroupResponse>> {
        public AnonymousClass4() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends NewCoinGroupResponse> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<NewCoinGroupResponse>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, final java.util.List<NewCoinGroupResponse> list, java.lang.Exception exc) {
            if (z) {
                pUU.EZpvd("NewCoin", "NewCoinRankTask getNewCoinRank result ok, " + list);
                if (list == null || list.isEmpty()) {
                    return;
                }
                InterfaceC58217yxC interfaceC58217yxC = C55580xmd.this.gEmmrt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                C55580xmd c55580xmd = C55580xmd.this;
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55580xmd.AnonymousClass4.EZpvd(list, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.KWHzl()).observeOn(C58266yxz.OLrzqt());
                final C55580xmd c55580xmd2 = C55580xmd.this;
                final Function1 function1 = new Function1() { // from class: o.xmn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55580xmd.AnonymousClass4.EZpvd(c55580xmd2, (NewCoinGroupResponse) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xmq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55580xmd.AnonymousClass4.copydefault(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.xmp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55580xmd.AnonymousClass4.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                c55580xmd.gEmmrt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xms
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55580xmd.AnonymousClass4.OLrzqt(function12, obj);
                    }
                });
                return;
            }
            pUU.EZpvd("NewCoin", "NewCoinRankTask getNewCoinRank result error, " + exc);
            AbstractC55574xmX abstractC55574xmX = C55580xmd.this.djBIcL;
            if (exc == null) {
                exc = new java.lang.RuntimeException("unknown error");
            }
            abstractC55574xmX.copydefault(exc);
        }

        public static final void EZpvd(java.util.List list, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            C55631xnb c55631xnb = C55631xnb.AEQbTJ;
            java.util.ArrayList<NewCoinRank> arrayListAEQbTJ = c55631xnb.AEQbTJ(((NewCoinGroupResponse) list.get(0)).getOnline());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw = c55631xnb.AYXKKw(((NewCoinGroupResponse) list.get(0)).getWaitOnline());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw2 = c55631xnb.AYXKKw(((NewCoinGroupResponse) list.get(0)).getWaitOnlineNew());
            java.util.ArrayList<NewCoinFuturesRankPo> arrayListKWHzl = c55631xnb.KWHzl(((NewCoinGroupResponse) list.get(0)).getFuturesOnline());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw3 = c55631xnb.AYXKKw(((NewCoinGroupResponse) list.get(0)).getFuturesWaitOnline());
            if (arrayListAEQbTJ != null) {
                NewCoinGroupResponse newCoinGroupResponse = (arrayListAYXKKw == null || arrayListAYXKKw2 == null) ? null : new NewCoinGroupResponse(arrayListAEQbTJ, arrayListAYXKKw2, arrayListAYXKKw, arrayListKWHzl, arrayListAYXKKw3);
                if (newCoinGroupResponse != null) {
                    interfaceC58251yxk.onNext(newCoinGroupResponse);
                }
            }
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(C55580xmd c55580xmd, NewCoinGroupResponse newCoinGroupResponse) {
            pUU.EZpvd("NewCoin", "NewCoinRankTask getNewCoinRank filter ok, " + newCoinGroupResponse);
            AbstractC55574xmX abstractC55574xmX = c55580xmd.djBIcL;
            Intrinsics.copydefault(newCoinGroupResponse);
            abstractC55574xmX.KWHzl("http", newCoinGroupResponse);
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(java.lang.Throwable th) {
            pUU.copydefault("NewCoin", "NewCoinRankTask getNewCoinRank error, " + th);
            return Unit.INSTANCE;
        }
    }

    public boolean AEQbTJ(java.lang.Object obj) {
        if (obj instanceof AbstractC55574xmX) {
            java.lang.String strAEQbTJ = ((AbstractC55574xmX) obj).AEQbTJ();
            AbstractC55574xmX abstractC55574xmX = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) (abstractC55574xmX != null ? abstractC55574xmX.AEQbTJ() : null))) {
                return false;
            }
        }
        AYXKKw();
        return true;
    }

    @Override // o.AbstractC55501xlD
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("NewCoin", "NewCoinRankTask handleData invoked, " + str);
        try {
            try {
                InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.xmi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C55580xmd.copydefault(str, this, interfaceC58251yxk);
                    }
                }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.xml
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55580xmd.copydefault(this.KWHzl, (NewCoinGroupResponse) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xmh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55580xmd.KWHzl(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.xmk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55580xmd.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                this.valueOf = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xmo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C55580xmd.AhwBna(function12, obj);
                    }
                });
            } catch (java.lang.Exception e) {
                AbstractC55574xmX abstractC55574xmX = this.djBIcL;
                if (abstractC55574xmX != null) {
                    abstractC55574xmX.copydefault(e);
                }
            }
        } finally {
            KWHzl();
            KWHzl(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(java.lang.String str, C55580xmd c55580xmd, InterfaceC58251yxk interfaceC58251yxk) {
        java.util.ArrayList<WaitOnlineRank> arrayList;
        java.util.ArrayList<NewCoinRank> arrayList2;
        java.util.ArrayList<WaitOnlineRank> arrayList3;
        java.util.ArrayList<NewCoinFuturesRankPo> arrayList4;
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        RankListRequest request2;
        RankListRequestGroup rankListRequestGroupOLrzqt3;
        RankListRequest request3;
        java.util.List<NewCoinRank> listSubList;
        RankListRequestGroup rankListRequestGroupOLrzqt4;
        RankListRequest request4;
        java.util.List<WaitOnlineRank> listSubList2;
        RankListRequestGroup rankListRequestGroupOLrzqt5;
        RankListRequest request5;
        RankListRequestGroup rankListRequestGroupOLrzqt6;
        RankListRequest request6;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        JsonArray jsonArray = JsonElementKt.getJsonArray(c33489mxS.AEQbTJ().parseToJsonElement(str));
        if (jsonArray.size() > 0) {
            NewCoinGroupResponse newCoinGroupResponse = (NewCoinGroupResponse) c33489mxS.OLrzqt((DeserializationStrategy) NewCoinGroupResponse.Companion.serializer(), jsonArray.get(0).toString());
            C55631xnb c55631xnb = C55631xnb.AEQbTJ;
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw = c55631xnb.AYXKKw(newCoinGroupResponse.getWaitOnlineNew());
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw2 = c55631xnb.AYXKKw(newCoinGroupResponse.getWaitOnline());
            NewCoinGroupResponse newCoinGroupResponse2 = null;
            java.lang.Integer numValueOf = arrayListAYXKKw != null ? java.lang.Integer.valueOf(arrayListAYXKKw.size()) : null;
            AbstractC55574xmX abstractC55574xmX = c55580xmd.djBIcL;
            if (C33129mqd.copydefault(numValueOf, (abstractC55574xmX == null || (rankListRequestGroupOLrzqt6 = abstractC55574xmX.OLrzqt()) == null || (request6 = rankListRequestGroupOLrzqt6.getRequest()) == null) ? null : request6.getNum())) {
                if (arrayListAYXKKw != null) {
                    AbstractC55574xmX abstractC55574xmX2 = c55580xmd.djBIcL;
                    listSubList2 = arrayListAYXKKw.subList(0, C33129mqd.AhwBna((abstractC55574xmX2 == null || (rankListRequestGroupOLrzqt5 = abstractC55574xmX2.OLrzqt()) == null || (request5 = rankListRequestGroupOLrzqt5.getRequest()) == null) ? null : request5.getNum()));
                } else {
                    listSubList2 = null;
                }
                arrayList = new java.util.ArrayList<>(listSubList2);
            } else {
                arrayList = arrayListAYXKKw;
            }
            AbstractC55574xmX abstractC55574xmX3 = c55580xmd.djBIcL;
            java.lang.String strSubS$default = C33129mqd.subS$default((abstractC55574xmX3 == null || (rankListRequestGroupOLrzqt4 = abstractC55574xmX3.OLrzqt()) == null || (request4 = rankListRequestGroupOLrzqt4.getRequest()) == null) ? null : request4.getNum(), arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null, null, null, null, 14, null);
            java.util.ArrayList<NewCoinRank> arrayListAEQbTJ = c55631xnb.AEQbTJ(newCoinGroupResponse.getOnline());
            if (C33129mqd.AEQbTJ(strSubS$default, "0")) {
                if (!C33129mqd.AEQbTJ(arrayListAEQbTJ != null ? java.lang.Integer.valueOf(arrayListAEQbTJ.size()) : null, strSubS$default)) {
                    arrayList2 = arrayListAEQbTJ;
                } else if (arrayListAEQbTJ == null || (listSubList = arrayListAEQbTJ.subList(0, C33129mqd.AhwBna(strSubS$default))) == null) {
                    arrayList2 = null;
                } else {
                    arrayListAEQbTJ = new java.util.ArrayList<>(listSubList);
                    arrayList2 = arrayListAEQbTJ;
                }
            } else {
                arrayList2 = new java.util.ArrayList<>();
            }
            java.util.ArrayList<WaitOnlineRank> arrayListAYXKKw3 = c55631xnb.AYXKKw(newCoinGroupResponse.getFuturesWaitOnline());
            java.lang.Integer numValueOf2 = arrayListAYXKKw3 != null ? java.lang.Integer.valueOf(arrayListAYXKKw3.size()) : null;
            AbstractC55574xmX abstractC55574xmX4 = c55580xmd.djBIcL;
            if (!C33129mqd.copydefault(numValueOf2, (abstractC55574xmX4 == null || (rankListRequestGroupOLrzqt3 = abstractC55574xmX4.OLrzqt()) == null || (request3 = rankListRequestGroupOLrzqt3.getRequest()) == null) ? null : request3.getNum())) {
                arrayList3 = arrayListAYXKKw3;
            } else if (arrayListAYXKKw3 == null) {
                arrayList3 = null;
            } else {
                AbstractC55574xmX abstractC55574xmX5 = c55580xmd.djBIcL;
                java.util.List<WaitOnlineRank> listSubList3 = arrayListAYXKKw3.subList(0, C33129mqd.AhwBna((abstractC55574xmX5 == null || (rankListRequestGroupOLrzqt2 = abstractC55574xmX5.OLrzqt()) == null || (request2 = rankListRequestGroupOLrzqt2.getRequest()) == null) ? null : request2.getNum()));
                if (listSubList3 != null) {
                    arrayList3 = new java.util.ArrayList<>(listSubList3);
                }
            }
            AbstractC55574xmX abstractC55574xmX6 = c55580xmd.djBIcL;
            java.lang.String strSubS$default2 = C33129mqd.subS$default((abstractC55574xmX6 == null || (rankListRequestGroupOLrzqt = abstractC55574xmX6.OLrzqt()) == null || (request = rankListRequestGroupOLrzqt.getRequest()) == null) ? null : request.getNum(), arrayList3 != null ? java.lang.Integer.valueOf(arrayList3.size()) : null, null, null, null, 14, null);
            java.util.ArrayList<NewCoinFuturesRankPo> arrayListKWHzl = c55631xnb.KWHzl(newCoinGroupResponse.getFuturesOnline());
            if (arrayListKWHzl != null) {
                if (C33129mqd.AEQbTJ(strSubS$default2, "0")) {
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayListKWHzl.size()), strSubS$default2)) {
                        arrayListKWHzl = new java.util.ArrayList<>(arrayListKWHzl.subList(0, C33129mqd.AhwBna(strSubS$default2)));
                    }
                } else {
                    arrayListKWHzl = new java.util.ArrayList<>();
                }
                arrayList4 = arrayListKWHzl;
            } else {
                arrayList4 = null;
            }
            if (arrayList2 != null) {
                if (arrayList != null && arrayListAYXKKw2 != null) {
                    newCoinGroupResponse2 = new NewCoinGroupResponse(arrayList2, arrayList, arrayListAYXKKw2, arrayList4, arrayList3);
                }
                if (newCoinGroupResponse2 != null) {
                    interfaceC58251yxk.onNext(newCoinGroupResponse2);
                }
            }
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C55580xmd c55580xmd, NewCoinGroupResponse newCoinGroupResponse) {
        pUU.EZpvd("NewCoin", "NewCoinRankTask handleData ok, " + newCoinGroupResponse);
        AbstractC55574xmX abstractC55574xmX = c55580xmd.djBIcL;
        if (abstractC55574xmX != null) {
            Intrinsics.copydefault(newCoinGroupResponse);
            abstractC55574xmX.KWHzl("WebSocket", newCoinGroupResponse);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        pUU.copydefault("NewCoin", "NewCoinRankTask handleData error, " + th);
        return Unit.INSTANCE;
    }

    public void djBIcL() {
        RankListRequestGroup rankListRequestGroupOLrzqt;
        RankListRequest request;
        RankListRequestGroup rankListRequestGroupOLrzqt2;
        RankListRequest request2;
        pUU.EZpvd("NewCoin", "NewCoinRankTask initSocket invoked");
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
        java.lang.String type = null;
        java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
            AbstractC55574xmX abstractC55574xmX = this.djBIcL;
            if (abstractC55574xmX != null && (rankListRequestGroupOLrzqt = abstractC55574xmX.OLrzqt()) != null && (request = rankListRequestGroupOLrzqt.getRequest()) != null) {
                type = request.getType();
            }
            arrayList.add(new WsArgV5("new-coin-rank", null, null, null, type, null, null, null, 238, null));
        } else {
            AbstractC55574xmX abstractC55574xmX2 = this.djBIcL;
            if (abstractC55574xmX2 != null && (rankListRequestGroupOLrzqt2 = abstractC55574xmX2.OLrzqt()) != null && (request2 = rankListRequestGroupOLrzqt2.getRequest()) != null) {
                type = request2.getType();
            }
            arrayList.add(new EntityWsArg("new-coin-rank", null, null, null, type, null, null, null, strAuCTelauCTel, 238, null));
        }
        AEQbTJ(C54407xHg.Companion.AEQbTJ("new-coin-rank", v5Connection$default, arrayList, new Function2() { // from class: o.xmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55580xmd.EZpvd(this.OLrzqt, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        gEmmrt();
    }

    public static final Unit EZpvd(C55580xmd c55580xmd, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pUU.EZpvd("NewCoin", "NewCoinRankTask ws incoming");
        c55580xmd.KWHzl(true);
        c55580xmd.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        pUU.EZpvd("NewCoin", "NewCoinRankTask release invoked");
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.valueOf;
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
        if (this.djBIcL != null) {
            C54407xHg.Companion.EZpvd("new-coin-rank", copydefault());
        }
    }
}
