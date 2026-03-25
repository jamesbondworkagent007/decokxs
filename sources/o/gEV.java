package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.wallet.api.bean.AddressType;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C12827cuN;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gEV extends AbstractC33073mpa {
    public C10854bwM copydefault;
    public InterfaceC58217yxC valueOf;
    public final java.lang.String AYXKKw = gEV.class.getName();
    public java.lang.String djBIcL = "";
    public java.lang.String OLrzqt = "";
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gFo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gEV.OLrzqt();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gFr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gEV.djBIcL();
        }
    });
    public final WalletTickerManager AhwBna = new WalletTickerManager();
    public final MutableLiveData<WalletTickerManager.CoinPrice> EZpvd = new MutableLiveData<>();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gFq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gEV.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<WalletTickerManager.CoinPrice> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.djBIcL;
    }

    public static final MutableLiveData OLrzqt() {
        return new MutableLiveData();
    }

    public final MutableLiveData<gBU> values() {
        return (MutableLiveData) this.AEQbTJ.getValue();
    }

    public static final MutableLiveData djBIcL() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<DeFiApyDataInfoData>> AkhnZx() {
        return (MutableLiveData) this.gEmmrt.getValue();
    }

    private final InterfaceC25424iwU fARcdN() {
        return (InterfaceC25424iwU) this.KWHzl.getValue();
    }

    public static final InterfaceC25424iwU KWHzl() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str2;
        this.OLrzqt = str;
        this.copydefault = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(str)));
    }

    public final boolean DbNXlk() {
        C10854bwM c10854bwM = this.copydefault;
        return c10854bwM != null && (c10854bwM.iRxXKY() || C10854bwM.isXRCToken$default(c10854bwM, null, 1, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gEV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshData$default(gEV gev, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        gev.KWHzl(function0);
    }

    public final void KWHzl(final Function0<Unit> function0) {
        AbstractC58185ywX abstractC58185ywXRefreshWalletAsset$default = C10407bnq.refreshWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), this.djBIcL, 1, null, false, false, 12, null);
        final Function1 function1 = new Function1() { // from class: o.gEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.copydefault(function0, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.zsXlph(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.EZpvd(this.copydefault, function0, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXRefreshWalletAsset$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.AuCTelauCTel(function12, obj);
            }
        }));
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function0 function0, kotlin.Pair pair) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(gEV gev, Function0 function0, java.lang.Throwable th) {
        pUU.copydefault(gev.AYXKKw, "refreshData error message :" + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C10854bwM c10854bwM = this.copydefault;
        if (c10854bwM != null && c10854bwM.dxcTrN()) {
            final C8301bAD c8301bAD = new C8301bAD();
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.djBIcL, false);
            final Function1 function1 = new Function1() { // from class: o.gEX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gEV.AEQbTJ(c8301bAD, this, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gFa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return gEV.fIwbmz(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gFc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gEV.KWHzl(c8301bAD, this, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.gFd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return gEV.fJNWhG(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
            AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtOLrzqt3);
            final Function1 function13 = new Function1() { // from class: o.gEZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gEV.OLrzqt(this.EZpvd, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    gEV.fARcdN(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.gFg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gEV.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            call().AEQbTJ(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    gEV.AuCTel(function14, obj);
                }
            }));
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt4 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.djBIcL, false);
        final Function1 function15 = new Function1() { // from class: o.gFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.OLrzqt(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.gFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.ejfBZ(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.gEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.AYXKKw(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt4.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.gFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.uzCIH(function16, obj);
            }
        }));
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C8301bAD c8301bAD, gEV gev, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.gGvvIC());
        if (chainAddress != null && (address = chainAddress.getAddress()) != null) {
            str = address;
        }
        java.lang.String str2 = gev.djBIcL;
        C10854bwM c10854bwM = gev.copydefault;
        return c8301bAD.KWHzl(str2, c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, str);
    }

    public static final InterfaceC58261yxu fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C8301bAD c8301bAD, gEV gev, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10854bwM c10854bwM = gev.copydefault;
        return c8301bAD.AEQbTJ(c10854bwM != null ? c10854bwM.AhwBna() : 0L);
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gEV gev, java.util.ArrayList arrayList) {
        WalletTickerManager walletTickerManager = gev.AhwBna;
        C10854bwM c10854bwM = gev.copydefault;
        WalletTickerManager.CoinPrice coinPriceAEQbTJ = walletTickerManager.AEQbTJ(c10854bwM != null ? c10854bwM.AhwBna() : 0L);
        if (coinPriceAEQbTJ != null) {
            Intrinsics.copydefault(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C10525bqB c10525bqB = (C10525bqB) it.next();
                C10525bqB.setValues$default(c10525bqB, c10525bqB.copydefault(), C54862xYb.convertToString$default(C54862xYb.OLrzqt(gev.copydefault(c10525bqB.fIwbmz(), c10525bqB.KWHzl().fZBcTu()), coinPriceAEQbTJ.getPrice()), false, null, null, 7, null), c10525bqB.getNewProxyInstance(), c10525bqB.zuBGHE(), null, c10525bqB.sSMYrx(), c10525bqB.gHZMYf(), c10525bqB.zsXlph(), c10525bqB.zLjUOn(), 16, null);
            }
        }
        Intrinsics.copydefault(arrayList);
        gev.EZpvd(arrayList);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(gEV gev, java.lang.Throwable th) {
        pUU.copydefault(gev.AYXKKw, "getItemDataList and coinMeta?.isAggregationAddress is true error message : " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gEV gev, AbstractC12782ctV abstractC12782ctV) {
        C10525bqB c10525bqBAEQbTJ;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI = abstractC12782ctV.hrNTAI();
        C10854bwM c10854bwM = gev.copydefault;
        java.lang.Object obj = null;
        java.util.List<C10525bqB> listEZpvd = mapHrNTAI.get(c10854bwM != null ? c10854bwM.fJNWhG() : null);
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            C10525bqB c10525bqB = (C10525bqB) next;
            C10854bwM c10854bwM2 = gev.copydefault;
            if (c10854bwM2 != null && c10525bqB.OLrzqt() == c10854bwM2.AhwBna()) {
                obj = next;
                break;
            }
        }
        C10525bqB c10525bqB2 = (C10525bqB) obj;
        if ((listEZpvd.isEmpty() || c10525bqB2 == null) && (c10525bqBAEQbTJ = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(gev.OLrzqt)))) != null) {
            listEZpvd = C56402yEa.EZpvd(c10525bqBAEQbTJ);
        }
        for (C10525bqB c10525bqB3 : listEZpvd) {
            WalletTickerManager.CoinPrice coinPriceAEQbTJ = gev.AhwBna.AEQbTJ(c10525bqB3.OLrzqt());
            if (coinPriceAEQbTJ != null) {
                C10525bqB.setValues$default(c10525bqB3, c10525bqB3.copydefault(), C54862xYb.convertToString$default(C54862xYb.OLrzqt(gev.copydefault(c10525bqB3.fIwbmz(), c10525bqB3.KWHzl().fZBcTu()), coinPriceAEQbTJ.getPrice()), false, null, null, 7, null), c10525bqB3.getNewProxyInstance(), c10525bqB3.zuBGHE(), null, c10525bqB3.sSMYrx(), c10525bqB3.gHZMYf(), c10525bqB3.zsXlph(), c10525bqB3.zLjUOn(), 16, null);
            }
        }
        gev.EZpvd(listEZpvd);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(gEV gev, java.lang.Throwable th) {
        pUU.copydefault(gev.AYXKKw, "getItemDataList and coinMeta?.isAggregationAddress is false error message : " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str, int i) {
        return C54862xYb.convertToString$default(C33129mqd.EZpvd(str), false, java.lang.Integer.valueOf(i), null, 5, null);
    }

    public static final gBU KWHzl(gEV gev, java.util.List list) {
        return gev.OLrzqt(list);
    }

    public final void EZpvd(final java.util.List<C10525bqB> list) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.gFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return gEV.KWHzl(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.gFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.AEQbTJ(this.copydefault, (gBU) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.hDKMBd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gFx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.djBIcL(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.zLjUOn(function12, obj);
            }
        }));
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(gEV gev, gBU gbu) {
        gev.values().setValue(gbu);
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(gEV gev, java.lang.Throwable th) {
        pUU.copydefault(gev.AYXKKw, "postOverviewData error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.util.List<C10331bmT> fetchVPNInfo() {
        java.util.List<C19419gBr> listCopydefault;
        java.lang.Integer num;
        gBU value = values().getValue();
        if (value == null || (listCopydefault = value.copydefault()) == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList<C19419gBr> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault) {
            if (C33129mqd.AEQbTJ(((C19419gBr) obj).djBIcL(), 0)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C19419gBr c19419gBr : arrayList) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c19419gBr.KWHzl()));
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
                num = C21253gwK.KWHzl.OLrzqt().get(java.lang.Integer.valueOf(c19419gBr.AEQbTJ()));
            } else {
                num = C21253gwK.KWHzl.copydefault().get(java.lang.Long.valueOf(c19419gBr.EZpvd()));
            }
            int iIntValue = num != null ? num.intValue() : C21253gwK.KWHzl.KWHzl();
            java.lang.String strOLrzqt = c19419gBr.OLrzqt();
            if (strOLrzqt.length() == 0) {
                strOLrzqt = c19419gBr.isConnected();
            }
            arrayList2.add(new C10331bmT(strOLrzqt, c19419gBr.fetchVPNInfo(), c19419gBr.djBIcL(), c19419gBr.DbNXlk(), c19419gBr.AYXKKw(), c10854bwMKWHzl != null ? c10854bwMKWHzl.fZBcTu() : 4, iIntValue));
        }
        return arrayList2;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AuCTel() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.djBIcL, false);
        final Function1 function1 = new Function1() { // from class: o.gFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.iwGUEr(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.valueOf(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.getFieldNames(function12, obj);
            }
        }));
    }

    public static final Unit EZpvd(final gEV gev, AbstractC12782ctV abstractC12782ctV) {
        AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXOLrzqt;
        InterfaceC25424iwU interfaceC25424iwUFARcdN = gev.fARcdN();
        if (interfaceC25424iwUFARcdN != null) {
            boolean z = true;
            if (interfaceC25424iwUFARcdN.EZpvd(gev.djBIcL)) {
                java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI = abstractC12782ctV.hrNTAI();
                C10854bwM c10854bwM = gev.copydefault;
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = null;
                java.util.List<C10525bqB> listAhwBna = mapHrNTAI.get(c10854bwM != null ? c10854bwM.fJNWhG() : null);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (listAhwBna.isEmpty()) {
                    gev.AkhnZx().setValue(new java.util.ArrayList());
                    return Unit.INSTANCE;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAhwBna) {
                    if (C33129mqd.AEQbTJ(((C10525bqB) obj).fIwbmz(), 0)) {
                        arrayList.add(obj);
                    }
                }
                java.util.List<java.lang.Long> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((C10525bqB) it.next()).OLrzqt()));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAhwBna) {
                    if (!arrayList2.contains(java.lang.Long.valueOf(((C10525bqB) obj2).OLrzqt()))) {
                        arrayList3.add(obj2);
                    }
                }
                java.util.List<java.lang.Long> arrayList4 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList3, 10));
                java.util.Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(java.lang.Long.valueOf(((C10525bqB) it2.next()).OLrzqt()));
                }
                if (!abstractC12782ctV.AwvSrB() && !abstractC12782ctV.AubY()) {
                    z = false;
                }
                if (arrayList2.contains(25034771L) || arrayList4.contains(25034771L)) {
                    if (z) {
                        arrayList2 = C56402yEa.EZpvd(25034771L);
                        arrayList4 = yDY.AhwBna();
                    } else {
                        gev.AkhnZx().setValue(yDY.AhwBna());
                        return Unit.INSTANCE;
                    }
                }
                InterfaceC25424iwU interfaceC25424iwUFARcdN2 = gev.fARcdN();
                if (interfaceC25424iwUFARcdN2 != null && (abstractC58185ywXOLrzqt = interfaceC25424iwUFARcdN2.OLrzqt(arrayList2, arrayList4)) != null) {
                    final Function1 function1 = new Function1() { // from class: o.gFw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return gEV.AEQbTJ(this.EZpvd, (java.util.List) obj3);
                        }
                    };
                    interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gFC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj3) {
                            gEV.getNewProxyInstance(function1, obj3);
                        }
                    });
                }
                if (interfaceC58217yxCAEQbTJ != null) {
                    gev.call().AEQbTJ(interfaceC58217yxCAEQbTJ);
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(gEV gev, java.util.List list) {
        gev.AkhnZx().setValue(list);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(gEV gev, java.lang.Throwable th) {
        pUU.copydefault(gev.AYXKKw, "loadRecommendedInvestment error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        java.util.List<WalletTickerManager.CoinInfo> listEZpvd;
        final C10854bwM c10854bwM = this.copydefault;
        if (c10854bwM == null) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        WalletTickerManager walletTickerManager = this.AhwBna;
        xZA xza = new xZA(1000L, 2000L, null, 4, null);
        if (c10854bwM.giSNqX()) {
            java.util.List<C10854bwM> listAEQbTJ = C10954byG.EZpvd.valueOf().AEQbTJ(c10854bwM.fJNWhG());
            listEZpvd = new java.util.ArrayList<>(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (C10854bwM c10854bwM2 : listAEQbTJ) {
                listEZpvd.add(new WalletTickerManager.CoinInfo(c10854bwM2.fetchVPNInfo(), c10854bwM2.AhwBna(), c10854bwM2.OLrzqt(), c10854bwM2.AhwBna() == c10854bwM.AhwBna()));
            }
        } else {
            listEZpvd = C56402yEa.EZpvd(new WalletTickerManager.CoinInfo(c10854bwM.fetchVPNInfo(), c10854bwM.AhwBna(), c10854bwM.OLrzqt(), false));
        }
        AbstractC58185ywX<WalletTickerManager.CoinPriceRes> abstractC58185ywXCopydefault = walletTickerManager.copydefault("subTicker-overview", xza, listEZpvd);
        final Function1 function1 = new Function1() { // from class: o.gFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.AEQbTJ(this.AEQbTJ, c10854bwM, (WalletTickerManager.CoinPriceRes) obj);
            }
        };
        InterfaceC58227yxM<? super WalletTickerManager.CoinPriceRes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.wlaJM(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gEV.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.valueOf = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gEV.AubY(function12, obj);
            }
        });
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(gEV gev, C10854bwM c10854bwM, WalletTickerManager.CoinPriceRes coinPriceRes) {
        WalletTickerManager.CoinPrice coinPriceAEQbTJ;
        java.lang.Object next;
        int type = coinPriceRes.getType();
        if (type == 1) {
            MutableLiveData<WalletTickerManager.CoinPrice> mutableLiveData = gev.EZpvd;
            if (c10854bwM.giSNqX()) {
                coinPriceAEQbTJ = gev.AhwBna.copydefault(c10854bwM.AhwBna());
            } else {
                coinPriceAEQbTJ = gev.AhwBna.AEQbTJ(c10854bwM.AhwBna());
            }
            mutableLiveData.setValue(coinPriceAEQbTJ);
        } else if (type == 2) {
            java.util.Iterator<T> it = coinPriceRes.getCoinPriceList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                WalletTickerManager.CoinPrice coinPrice = (WalletTickerManager.CoinPrice) next;
                WalletTickerManager.CoinPrice value = gev.EZpvd.getValue();
                if (value != null && coinPrice.getCoinId() == value.getCoinId()) {
                    break;
                }
            }
            WalletTickerManager.CoinPrice coinPrice2 = (WalletTickerManager.CoinPrice) next;
            if (coinPrice2 != null) {
                gev.EZpvd.setValue(coinPrice2);
            }
        }
        gev.valueOf();
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final gBU OLrzqt(java.util.List<C10525bqB> list) {
        java.lang.Object next;
        java.util.List<java.lang.Integer> listEZpvd;
        java.lang.String displayCurrencyAmount$default;
        java.lang.String strConvertToString$default;
        java.lang.String str;
        C10854bwM c10854bwMKWHzl;
        java.lang.String strAYXKKw;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10525bqB) next).gEmmrt() == 196) {
                break;
            }
        }
        C10525bqB c10525bqB = (C10525bqB) next;
        java.util.List<C10525bqB> listEZpvd2 = Intrinsics.EZpvd(c10525bqB != null ? java.lang.Boolean.valueOf(c10525bqB.QVAiDq()) : null, java.lang.Boolean.TRUE) ? CollectionsKt___CollectionsKt.EZpvd(list, gBR.copydefault.EZpvd()) : list;
        C10525bqB c10525bqB2 = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd2);
        if (c10525bqB2 == null || c10525bqB2.KWHzl().giSNqX()) {
            listEZpvd = C56402yEa.EZpvd(1);
        } else {
            listEZpvd = C56402yEa.EZpvd(2);
        }
        java.util.List<C10525bqB> listEZpvd3 = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(listEZpvd2, listEZpvd);
        if (!listEZpvd3.isEmpty()) {
            C10525bqB c10525bqB3 = (C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd3);
            strConvertToString$default = C54862xYb.convertToString$default(C33129mqd.EZpvd(c10525bqB3.fIwbmz()), false, java.lang.Integer.valueOf(c10525bqB3.KWHzl().fZBcTu()), null, 5, null);
            java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB3, false, false, 3, null);
            displayCurrencyAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB3, false, 1, null);
            str = displayAmount$default;
        } else {
            displayCurrencyAmount$default = "0";
            strConvertToString$default = displayCurrencyAmount$default;
            str = strConvertToString$default;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
        for (C10525bqB c10525bqB4 : listEZpvd2) {
            if (c10525bqB4.KWHzl().dxcTrN()) {
                c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10525bqB4.OLrzqt()));
            } else {
                c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c10525bqB4.OLrzqt());
            }
            C10854bwM c10854bwM = c10854bwMKWHzl;
            java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C33129mqd.EZpvd(c10525bqB4.fIwbmz()), false, java.lang.Integer.valueOf(c10525bqB4.KWHzl().AkhnZx()), null, 5, null);
            java.lang.String strConvertToString$default3 = C33129mqd.AEQbTJ(strConvertToString$default, 0) ? C54862xYb.convertToString$default(C54862xYb.divB$default(strConvertToString$default2, strConvertToString$default, 0, null, 6, null), false, null, null, 7, null) : "0";
            long jFetchVPNInfo = c10854bwM != null ? c10854bwM.fetchVPNInfo() : -1L;
            java.lang.String strAwvSrB = c10525bqB4.AwvSrB();
            java.lang.String str2 = (c10854bwM == null || (strAYXKKw = c10854bwM.AYXKKw()) == null) ? "" : strAYXKKw;
            java.lang.String strZuBGHE = c10525bqB4.DTwDnp() ? "" : c10525bqB4.zuBGHE();
            long jOLrzqt = c10525bqB4.OLrzqt();
            ChainAddress chainAddressEZpvd = c10525bqB4.EZpvd();
            int addressType = chainAddressEZpvd != null ? chainAddressEZpvd.getAddressType() : AddressType.Legacy.getValue();
            java.lang.String displayAmount$default2 = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB4, false, true, 1, null);
            java.lang.String strOLrzqt = c10525bqB4.OLrzqt(true);
            java.lang.String strAhwBna = c10525bqB4.AhwBna();
            boolean z = strZuBGHE.length() == 0 && c10854bwM != null && c10854bwM.dxcTrN();
            ChainAddress chainAddressEZpvd2 = c10525bqB4.EZpvd();
            arrayList.add(new C19419gBr(jOLrzqt, jFetchVPNInfo, str2, strAwvSrB, "", addressType, strConvertToString$default3, strConvertToString$default2, displayAmount$default2, strOLrzqt, strAhwBna, z, strZuBGHE, false, chainAddressEZpvd2 != null && chainAddressEZpvd2.isDefault() && DbNXlk()));
        }
        return new gBU(arrayList, str, displayCurrencyAmount$default);
    }
}
