package com.okinc.business.defi.assets.coinmanagement;

import com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import com.okinc.business.defi.biz.net.bean.SearchCoinMetaBean;
import com.okinc.business.defi.biz.net.bean.SearchCoinReq;
import com.okinc.business.defi.biz.net.bean.SearchCoinResp;
import com.okinc.business.defi.wallet.metricsmonitor.AddOrRemoveType;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC12782ctV;
import o.AbstractC32952mnL;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10404bnn;
import o.C10407bnq;
import o.C10525bqB;
import o.C10594brR;
import o.C10598brV;
import o.C10614brl;
import o.C10854bwM;
import o.C10856bwO;
import o.C10954byG;
import o.C12827cuN;
import o.C13934dbu;
import o.C33024moe;
import o.C33129mqd;
import o.C43453rpa;
import o.C56402yEa;
import o.C56403yEb;
import o.C59449zhJ;
import o.C9678baC;
import o.InterfaceC18445fiY;
import o.InterfaceC58217yxC;
import o.InterfaceC58223yxI;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SearchCoinViewModel extends AbstractC33073mpa {
    public final String AEQbTJ;
    public String AYXKKw;
    public int AhwBna;
    public final C13934dbu AkhnZx;
    public final C12827cuN AuCTel;
    public SearchResultBean DbNXlk;
    public final int EZpvd;
    public Long KWHzl;
    public List<Long> OLrzqt;
    public final AbstractC32952mnL<SearchCoinData> copydefault;
    public final ConcurrentHashMap<String, InterfaceC58217yxC> djBIcL;
    public WalletSelectedChainBean ejfBZ;
    public final C10614brl fARcdN;
    public final InterfaceC18445fiY fIwbmz;
    public final C10407bnq fetchVPNInfo;
    public boolean gEmmrt;
    public String isConnected;
    public AbstractC12782ctV valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchCoinViewModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Boolean KWHzl(C10404bnn c10404bnn, List list) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        Intrinsics.checkNotNullParameter(list, "");
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32952mnL<SearchCoinData> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:o.bnq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x0008: INVOKE 
  (wrap:o.bnq$ActionBar:0x0006: SGET  A[WRAPPED] (LINE:39) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:39)) : (r5v0 o.bnq))
  (wrap:o.cuN:0x0016: TERNARY null = ((wrap:int:0x000c: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0012: INVOKE 
  (wrap:o.cuN$Application:0x0010: SGET  A[WRAPPED] (LINE:40) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:40)) : (r6v0 o.cuN))
  (wrap:o.fiY:0x0021: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiY:0x001d: INVOKE 
  (wrap:o.fiY$StateListAnimator:0x001b: SGET  A[WRAPPED] (LINE:41) o.fiY.Companion o.fiY$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.fiY.StateListAnimator.getInstance$default(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY A[MD:(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY (m), WRAPPED] (LINE:41)) : (r7v0 o.fiY))
  (wrap:o.dbu:0x002b: TERNARY null = ((wrap:int:0x0022: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:42) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r8v0 o.dbu))
  (wrap:o.brl:?: TERNARY null = ((wrap:int:0x002c: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.brl:0x0032: INVOKE 
  (wrap:o.brl$TaskDescription:0x0030: SGET  A[WRAPPED] (LINE:43) o.brl.Companion o.brl$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.brl.TaskDescription.getInstance$default(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl A[MD:(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl (m), WRAPPED] (LINE:43)) : (r9v0 o.brl))
 A[MD:(o.bnq, o.cuN, o.fiY, o.dbu, o.brl):void (m)] (LINE:38) call: com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel.<init>(o.bnq, o.cuN, o.fiY, o.dbu, o.brl):void type: THIS */
    public /* synthetic */ SearchCoinViewModel(C10407bnq c10407bnq, C12827cuN c12827cuN, InterfaceC18445fiY interfaceC18445fiY, C13934dbu c13934dbu, C10614brl c10614brl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 4) != 0 ? InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null) : interfaceC18445fiY, (i & 8) != 0 ? new C13934dbu() : c13934dbu, (i & 16) != 0 ? C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null) : c10614brl);
    }

    public SearchCoinViewModel(@NotNull C10407bnq c10407bnq, @NotNull C12827cuN c12827cuN, @NotNull InterfaceC18445fiY interfaceC18445fiY, @NotNull C13934dbu c13934dbu, @NotNull C10614brl c10614brl) {
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10614brl, "");
        this.fetchVPNInfo = c10407bnq;
        this.AuCTel = c12827cuN;
        this.fIwbmz = interfaceC18445fiY;
        this.AkhnZx = c13934dbu;
        this.fARcdN = c10614brl;
        this.AEQbTJ = "SearchCoin-VM";
        this.isConnected = "";
        this.OLrzqt = yDY.AhwBna();
        this.AYXKKw = "";
        this.gEmmrt = true;
        this.DbNXlk = new SearchResultBean("", null, null, null, 14, null);
        this.AhwBna = -1;
        this.copydefault = new ActionBar();
        this.djBIcL = new ConcurrentHashMap<>();
    }

    public static final class ActionBar extends AbstractC32952mnL<SearchCoinData> {
        @Override // o.AbstractC32952mnL
        public InterfaceC58217yxC EZpvd(long j) {
            InterfaceC58217yxC interfaceC58217yxCDbNXlk = AbstractC58185ywX.KWHzl(Unit.INSTANCE).DbNXlk();
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCDbNXlk, "");
            return interfaceC58217yxCDbNXlk;
        }
    }

    public final void copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z) {
        List<Long> listAhwBna;
        List<C10854bwM> listOFhtUX;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.isConnected = abstractC12782ctV.DbNXlk();
        this.valueOf = abstractC12782ctV;
        this.values = z;
        this.gEmmrt = C43453rpa.AEQbTJ.KWHzl(C9678baC.Companion.AEQbTJ());
        AbstractC12782ctV abstractC12782ctV2 = this.valueOf;
        if (abstractC12782ctV2 == null || (listOFhtUX = abstractC12782ctV2.OFhtUX()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(listOFhtUX, 10));
            Iterator<T> it = listOFhtUX.iterator();
            while (it.hasNext()) {
                listAhwBna.add(Long.valueOf(((C10854bwM) it.next()).fetchVPNInfo()));
            }
        }
        this.OLrzqt = listAhwBna;
        this.ejfBZ = this.fARcdN.KWHzl(this.isConnected);
    }

    public final long OLrzqt() {
        Long l = this.KWHzl;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((C10525bqB) t).KWHzl().QfsBiF()), Integer.valueOf(((C10525bqB) t2).KWHzl().QfsBiF()));
        }
    }

    public final boolean valueOf() {
        WalletSelectedChainBean walletSelectedChainBean;
        return gEmmrt() && (walletSelectedChainBean = this.ejfBZ) != null && !walletSelectedChainBean.isSingleMode() && EZpvd().length() > 0;
    }

    public static final Unit AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Unit> */
    public final AbstractC58260yxt<Unit> djBIcL() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.AuCTel.copydefault(this.isConnected, false);
        final Function1 function1 = new Function1() { // from class: o.bfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.EZpvd(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final Unit EZpvd(SearchCoinViewModel searchCoinViewModel, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        searchCoinViewModel.valueOf = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public final void EZpvd(long j, @NotNull String str) {
        AbstractC58185ywX<SearchResultBean> abstractC58185ywXOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Long l = this.KWHzl;
        boolean z = l == null || l.longValue() != j;
        this.KWHzl = Long.valueOf(j);
        this.AYXKKw = str;
        final boolean z2 = valueOf() && C10598brV.AEQbTJ.EZpvd(j) == null;
        C33024moe.AEQbTJ(this.copydefault, null);
        if (z2) {
            abstractC58185ywXOLrzqt = copydefault(z, str);
        } else {
            abstractC58185ywXOLrzqt = OLrzqt(z, str);
        }
        this.djBIcL.put(str, C33024moe.subscribeOnIO$default(abstractC58185ywXOLrzqt, new Function1() { // from class: o.bfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.AEQbTJ(this.KWHzl, z2, (SearchCoinViewModel.SearchResultBean) obj);
            }
        }, 2, (Object) null));
    }

    public static final Unit AEQbTJ(SearchCoinViewModel searchCoinViewModel, boolean z, SearchResultBean searchResultBean) {
        Comparator activity;
        Intrinsics.checkNotNullParameter(searchResultBean, "");
        searchCoinViewModel.DbNXlk = searchResultBean;
        AbstractC32952mnL<SearchCoinData> abstractC32952mnL = searchCoinViewModel.copydefault;
        Collection<C10525bqB> collectionValues = searchResultBean.getOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(collectionValues, searchCoinViewModel.new StateListAnimator());
        Collection<C10525bqB> collectionValues2 = searchResultBean.getNotOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        Collection<C10525bqB> collection = collectionValues2;
        if (z) {
            activity = searchCoinViewModel.new TaskDescription();
        } else {
            activity = searchCoinViewModel.new Activity();
        }
        C33024moe.OLrzqt(abstractC32952mnL, new SearchCoinData(listEZpvd, CollectionsKt___CollectionsKt.EZpvd(collection, activity)));
        if (Intrinsics.EZpvd((Object) searchCoinViewModel.AYXKKw, (Object) searchResultBean.getSearchText())) {
            searchCoinViewModel.values();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SearchCoinViewModel searchCoinViewModel, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C10856bwO.copydefault(searchCoinViewModel.AEQbTJ, 0, "searchCoins error  " + th);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<SearchResultBean> OLrzqt(boolean z, final String str) {
        AbstractC58260yxt<Boolean> abstractC58260yxtAEQbTJ = AEQbTJ(z, OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.bfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.AEQbTJ(str, this, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<SearchResultBean> abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.bfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.valueOf(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final SearchResultBean valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SearchResultBean) function1.invoke(obj);
    }

    public static final SearchResultBean AEQbTJ(String str, SearchCoinViewModel searchCoinViewModel, Boolean bool) {
        AbstractC12782ctV abstractC12782ctV;
        Intrinsics.checkNotNullParameter(bool, "");
        SearchResultBean searchResultBean = new SearchResultBean(str, null, null, null, 14, null);
        HashMap map = new HashMap();
        C10407bnq c10407bnq = searchCoinViewModel.fetchVPNInfo;
        List<C10525bqB> listEZpvd = c10407bnq.EZpvd(c10407bnq.AEQbTJ(str), yDY.gEmmrt(1, 2));
        for (C10525bqB c10525bqB : listEZpvd) {
            if (c10525bqB.KWHzl().giSNqX()) {
                map.put(c10525bqB.valueOf(), c10525bqB);
            }
        }
        for (C10525bqB c10525bqB2 : listEZpvd) {
            if (c10525bqB2.KWHzl().DcqEDu() || c10525bqB2.KWHzl().giSNqX() || (((abstractC12782ctV = searchCoinViewModel.valueOf) != null && abstractC12782ctV.fetchVPNInfo(c10525bqB2.wlaJM())) || map.get(c10525bqB2.KWHzl().fJNWhG()) == null)) {
                AbstractC12782ctV abstractC12782ctV2 = searchCoinViewModel.valueOf;
                if (abstractC12782ctV2 != null && abstractC12782ctV2.fetchVPNInfo(c10525bqB2.wlaJM())) {
                    searchResultBean.getOpened_aggregated_coins().put(Long.valueOf(c10525bqB2.OLrzqt()), c10525bqB2);
                } else {
                    searchResultBean.getNotOpened_aggregated_coins().put(Long.valueOf(c10525bqB2.OLrzqt()), c10525bqB2);
                }
            }
        }
        for (C10594brR c10594brR : C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).djBIcL(str)) {
            AbstractC12782ctV abstractC12782ctV3 = searchCoinViewModel.valueOf;
            if (abstractC12782ctV3 != null && abstractC12782ctV3.AkhnZx(c10594brR.fetchVPNInfo().AkhnZx())) {
                searchResultBean.getOpened_aggregated_coins().put(Long.valueOf(c10594brR.OLrzqt()), C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brR.fetchVPNInfo().AEQbTJ(), c10594brR.DbNXlk(), null, 4, null));
            } else {
                searchResultBean.getNotOpened_aggregated_coins().put(Long.valueOf(c10594brR.OLrzqt()), C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brR.fetchVPNInfo().AEQbTJ(), c10594brR.DbNXlk(), null, 4, null));
            }
        }
        return searchResultBean;
    }

    public final AbstractC58185ywX<SearchResultBean> copydefault(boolean z, final String str) {
        AbstractC58260yxt<Boolean> abstractC58260yxtAEQbTJ = AEQbTJ(z, OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.bfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.copydefault(str, this, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.bfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.AkhnZx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.EZpvd(this.AEQbTJ, (SearchCoinViewModel.SearchResultBean) obj);
            }
        };
        AbstractC58185ywX<SearchResultBean> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final SearchResultBean AkhnZx(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SearchResultBean) function1.invoke(obj);
    }

    public static final SearchResultBean copydefault(String str, SearchCoinViewModel searchCoinViewModel, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        SearchResultBean searchResultBean = new SearchResultBean(str, null, null, null, 14, null);
        for (C10525bqB c10525bqB : searchCoinViewModel.fetchVPNInfo.AEQbTJ(str)) {
            AbstractC12782ctV abstractC12782ctV = searchCoinViewModel.valueOf;
            if (abstractC12782ctV != null && abstractC12782ctV.fetchVPNInfo(c10525bqB.wlaJM())) {
                searchResultBean.getOpened_notAggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
            }
        }
        C10407bnq c10407bnq = searchCoinViewModel.fetchVPNInfo;
        Collection<C10525bqB> collectionValues = searchResultBean.getOpened_notAggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (C10525bqB c10525bqB2 : c10407bnq.EZpvd(CollectionsKt___CollectionsKt.EZpvd(collectionValues, new Application()), yDY.gEmmrt(1, 2))) {
            c10525bqB2.KWHzl().AEQbTJ(Integer.MAX_VALUE);
            searchResultBean.getOpened_aggregated_coins().put(Long.valueOf(c10525bqB2.OLrzqt()), c10525bqB2);
        }
        return searchResultBean;
    }

    public static final InterfaceC60096zvd values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(SearchCoinViewModel searchCoinViewModel, final SearchResultBean searchResultBean) {
        Intrinsics.checkNotNullParameter(searchResultBean, "");
        AbstractC58185ywX<List<C10525bqB>> abstractC58185ywXCopydefault = searchCoinViewModel.copydefault(searchCoinViewModel.EZpvd, searchResultBean);
        final Function1 function1 = new Function1() { // from class: o.bfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.KWHzl((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<List<C10525bqB>> abstractC58185ywXDjBIcL = abstractC58185ywXCopydefault.djBIcL(new InterfaceC58229yxO() { // from class: o.bfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.isConnected(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.copydefault(searchResultBean, (java.util.List) obj);
            }
        };
        return abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final List KWHzl(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return yDY.AhwBna();
    }

    public static final List isConnected(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final SearchResultBean fetchVPNInfo(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SearchResultBean) function1.invoke(obj);
    }

    public final AbstractC58260yxt<Boolean> AEQbTJ(boolean z, long j) {
        if (z) {
            AbstractC58260yxt<C10404bnn> abstractC58260yxtKWHzl = this.fetchVPNInfo.KWHzl(j);
            AbstractC58260yxt<List<C10594brR>> abstractC58260yxtCopydefault = this.fetchVPNInfo.copydefault(j);
            final Function2 function2 = new Function2() { // from class: o.bfs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return SearchCoinViewModel.KWHzl((C10404bnn) obj, (java.util.List) obj2);
                }
            };
            AbstractC58260yxt<Boolean> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.bfr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return SearchCoinViewModel.AEQbTJ(function2, obj, obj2);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt);
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<Boolean> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(Boolean.TRUE);
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final Boolean AEQbTJ(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Boolean) function2.invoke(obj, obj2);
    }

    public final void AhwBna() {
        this.djBIcL.put(String.valueOf(this.AhwBna + 1), C33024moe.subscribeOnIO$default(copydefault(this.AhwBna + 1, this.DbNXlk), new Function1() { // from class: o.bfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.KWHzl(this.copydefault, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }, 2, (Object) null));
    }

    public static final Unit KWHzl(SearchCoinViewModel searchCoinViewModel, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C10856bwO.copydefault(searchCoinViewModel.AEQbTJ, 0, "loadNextPageFromServer error " + th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r14v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<o.bqB>> */
    public final AbstractC58185ywX<List<C10525bqB>> copydefault(final int i, final SearchResultBean searchResultBean) {
        List<Long> listEZpvd;
        C13934dbu c13934dbu = this.AkhnZx;
        String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
        String str = this.isConnected;
        String str2 = this.AYXKKw;
        List listAhwBna = yDY.AhwBna();
        Long l = this.KWHzl;
        if (l != null && l.longValue() == Long.MIN_VALUE) {
            listEZpvd = this.OLrzqt;
        } else {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.KWHzl);
            listEZpvd = C56402yEa.EZpvd(Long.valueOf(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : 0L));
        }
        Long l2 = this.KWHzl;
        AbstractC58185ywX<ResponseData<SearchCoinResp>> abstractC58185ywXOLrzqt = c13934dbu.OLrzqt(new SearchCoinReq(strAhwBna, str, str2, listAhwBna, listEZpvd, l2 != null && l2.longValue() == Long.MIN_VALUE, i));
        final Function1 function1 = new Function1() { // from class: o.bfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchCoinViewModel.OLrzqt(this.OLrzqt, i, searchResultBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SearchCoinViewModel.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final List djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public final OpenOrCloseCoinResult EZpvd(@NotNull C10525bqB c10525bqB, int i) {
        Comparator activity;
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        OpenOrCloseCoinResult openOrCloseCoinResult = new OpenOrCloseCoinResult(0, i);
        if (c10525bqB.KWHzl().giSNqX()) {
            ArrayList<Long> arrayListFARcdN = c10525bqB.fARcdN();
            if (arrayListFARcdN != null) {
                Iterator<T> it = arrayListFARcdN.iterator();
                while (it.hasNext()) {
                    this.DbNXlk.getOpened_notAggregated_coins().remove(Long.valueOf(((Number) it.next()).longValue()));
                }
            }
        } else {
            this.DbNXlk.getOpened_notAggregated_coins().remove(Long.valueOf(c10525bqB.OLrzqt()));
        }
        this.DbNXlk.getOpened_aggregated_coins().remove(Long.valueOf(c10525bqB.OLrzqt()));
        this.DbNXlk.getNotOpened_aggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
        Collection<C10525bqB> collectionValues = this.DbNXlk.getNotOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Collection<C10525bqB> collection = collectionValues;
        if (valueOf()) {
            activity = new TaskDescription();
        } else {
            activity = new Activity();
        }
        openOrCloseCoinResult.setUiAddIndex(CollectionsKt___CollectionsKt.EZpvd(collection, activity).indexOf(c10525bqB) + this.DbNXlk.getOpened_aggregated_coins().size());
        return openOrCloseCoinResult;
    }

    public final OpenOrCloseCoinResult AEQbTJ(@NotNull C10525bqB c10525bqB, int i) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        OpenOrCloseCoinResult openOrCloseCoinResult = new OpenOrCloseCoinResult(0, i);
        this.DbNXlk.getNotOpened_aggregated_coins().remove(Long.valueOf(c10525bqB.OLrzqt()));
        this.DbNXlk.getOpened_aggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
        if (c10525bqB.KWHzl().giSNqX()) {
            ArrayList<Long> arrayListFARcdN = c10525bqB.fARcdN();
            if (arrayListFARcdN != null) {
                Iterator<T> it = arrayListFARcdN.iterator();
                while (it.hasNext()) {
                    this.DbNXlk.getOpened_notAggregated_coins().put(Long.valueOf(((Number) it.next()).longValue()), c10525bqB);
                }
            }
        } else {
            this.DbNXlk.getOpened_notAggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
        }
        Collection<C10525bqB> collectionValues = this.DbNXlk.getOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        openOrCloseCoinResult.setUiAddIndex(CollectionsKt___CollectionsKt.EZpvd(collectionValues, new StateListAnimator()).indexOf(c10525bqB));
        return openOrCloseCoinResult;
    }

    public final void KWHzl(@NotNull C10525bqB c10525bqB, int i) {
        AddOrRemoveType addOrRemoveType;
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        InterfaceC18445fiY interfaceC18445fiY = this.fIwbmz;
        String strGEmmrt = c10525bqB.KWHzl().gEmmrt();
        String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
        long jAEQbTJ = c10525bqB.AEQbTJ();
        if (i == 0) {
            addOrRemoveType = AddOrRemoveType.REMOVE;
        } else {
            addOrRemoveType = AddOrRemoveType.ADD;
        }
        interfaceC18445fiY.KWHzl("SearchCoinViewModel", strGEmmrt, strFJNWhG, Long.valueOf(jAEQbTJ), addOrRemoveType, c10525bqB.values().QwvEab());
    }

    private final void values() {
        if (this.djBIcL.size() > 0) {
            Iterator<Map.Entry<String, InterfaceC58217yxC>> it = this.djBIcL.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().dispose();
                it.remove();
            }
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.copydefault.OLrzqt();
        values();
    }

    public static final class SearchResultBean {
        public static final int $stable = 8;
        private HashMap<Long, C10525bqB> notOpened_aggregated_coins;
        private HashMap<Long, C10525bqB> opened_aggregated_coins;
        private HashMap<Long, C10525bqB> opened_notAggregated_coins;
        private String searchText;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel$SearchResultBean */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchResultBean copy$default(SearchResultBean searchResultBean, String str, HashMap map, HashMap map2, HashMap map3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchResultBean.searchText;
            }
            if ((i & 2) != 0) {
                map = searchResultBean.opened_notAggregated_coins;
            }
            if ((i & 4) != 0) {
                map2 = searchResultBean.opened_aggregated_coins;
            }
            if ((i & 8) != 0) {
                map3 = searchResultBean.notOpened_aggregated_coins;
            }
            return searchResultBean.copy(str, map, map2, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.searchText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> component2() {
            return this.opened_notAggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> component3() {
            return this.opened_aggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> component4() {
            return this.notOpened_aggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchResultBean copy(@NotNull String str, @NotNull HashMap<Long, C10525bqB> map, @NotNull HashMap<Long, C10525bqB> map2, @NotNull HashMap<Long, C10525bqB> map3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            return new SearchResultBean(str, map, map2, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultBean)) {
                return false;
            }
            SearchResultBean searchResultBean = (SearchResultBean) obj;
            return Intrinsics.EZpvd((Object) this.searchText, (Object) searchResultBean.searchText) && Intrinsics.EZpvd(this.opened_notAggregated_coins, searchResultBean.opened_notAggregated_coins) && Intrinsics.EZpvd(this.opened_aggregated_coins, searchResultBean.opened_aggregated_coins) && Intrinsics.EZpvd(this.notOpened_aggregated_coins, searchResultBean.notOpened_aggregated_coins);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> getNotOpened_aggregated_coins() {
            return this.notOpened_aggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> getOpened_aggregated_coins() {
            return this.opened_aggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Long, C10525bqB> getOpened_notAggregated_coins() {
            return this.opened_notAggregated_coins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSearchText() {
            return this.searchText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.searchText.hashCode() * 31) + this.opened_notAggregated_coins.hashCode()) * 31) + this.opened_aggregated_coins.hashCode()) * 31) + this.notOpened_aggregated_coins.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNotOpened_aggregated_coins(@NotNull HashMap<Long, C10525bqB> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.notOpened_aggregated_coins = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpened_aggregated_coins(@NotNull HashMap<Long, C10525bqB> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.opened_aggregated_coins = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpened_notAggregated_coins(@NotNull HashMap<Long, C10525bqB> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.opened_notAggregated_coins = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSearchText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.searchText = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchResultBean(searchText=" + this.searchText + ", opened_notAggregated_coins=" + this.opened_notAggregated_coins + ", opened_aggregated_coins=" + this.opened_aggregated_coins + ", notOpened_aggregated_coins=" + this.notOpened_aggregated_coins + ")";
        }

        public SearchResultBean(@NotNull String str, @NotNull HashMap<Long, C10525bqB> map, @NotNull HashMap<Long, C10525bqB> map2, @NotNull HashMap<Long, C10525bqB> map3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            this.searchText = str;
            this.opened_notAggregated_coins = map;
            this.opened_aggregated_coins = map2;
            this.notOpened_aggregated_coins = map3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:415) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:416) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0018: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:417) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.HashMap))
 A[MD:(java.lang.String, java.util.HashMap<java.lang.Long, o.bqB>, java.util.HashMap<java.lang.Long, o.bqB>, java.util.HashMap<java.lang.Long, o.bqB>):void (m)] (LINE:413) call: com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel.SearchResultBean.<init>(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashMap):void type: THIS */
        public /* synthetic */ SearchResultBean(String str, HashMap map, HashMap map2, HashMap map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new HashMap() : map, (i & 4) != 0 ? new HashMap() : map2, (i & 8) != 0 ? new HashMap() : map3);
        }
    }

    public static final class OpenOrCloseCoinResult {
        public static final int $stable = 8;
        private int uiAddIndex;
        private int uiRemoveIndex;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OpenOrCloseCoinResult copy$default(OpenOrCloseCoinResult openOrCloseCoinResult, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = openOrCloseCoinResult.uiAddIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = openOrCloseCoinResult.uiRemoveIndex;
            }
            return openOrCloseCoinResult.copy(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.uiAddIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.uiRemoveIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OpenOrCloseCoinResult copy(int i, int i2) {
            return new OpenOrCloseCoinResult(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenOrCloseCoinResult)) {
                return false;
            }
            OpenOrCloseCoinResult openOrCloseCoinResult = (OpenOrCloseCoinResult) obj;
            return this.uiAddIndex == openOrCloseCoinResult.uiAddIndex && this.uiRemoveIndex == openOrCloseCoinResult.uiRemoveIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getUiAddIndex() {
            return this.uiAddIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getUiRemoveIndex() {
            return this.uiRemoveIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.uiAddIndex) * 31) + Integer.hashCode(this.uiRemoveIndex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUiAddIndex(int i) {
            this.uiAddIndex = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUiRemoveIndex(int i) {
            this.uiRemoveIndex = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenOrCloseCoinResult(uiAddIndex=" + this.uiAddIndex + ", uiRemoveIndex=" + this.uiRemoveIndex + ")";
        }

        public OpenOrCloseCoinResult(int i, int i2) {
            this.uiAddIndex = i;
            this.uiRemoveIndex = i2;
        }
    }

    public static final class SearchCoinData {
        public static final int $stable = 8;
        private final Collection<C10525bqB> notOpenedCoins;
        private final Collection<C10525bqB> openedCoins;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.coinmanagement.SearchCoinViewModel$SearchCoinData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchCoinData copy$default(SearchCoinData searchCoinData, Collection collection, Collection collection2, int i, Object obj) {
            if ((i & 1) != 0) {
                collection = searchCoinData.openedCoins;
            }
            if ((i & 2) != 0) {
                collection2 = searchCoinData.notOpenedCoins;
            }
            return searchCoinData.copy(collection, collection2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Collection<C10525bqB> component1() {
            return this.openedCoins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Collection<C10525bqB> component2() {
            return this.notOpenedCoins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchCoinData copy(@NotNull Collection<C10525bqB> collection, @NotNull Collection<C10525bqB> collection2) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(collection2, "");
            return new SearchCoinData(collection, collection2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchCoinData)) {
                return false;
            }
            SearchCoinData searchCoinData = (SearchCoinData) obj;
            return Intrinsics.EZpvd(this.openedCoins, searchCoinData.openedCoins) && Intrinsics.EZpvd(this.notOpenedCoins, searchCoinData.notOpenedCoins);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Collection<C10525bqB> getNotOpenedCoins() {
            return this.notOpenedCoins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Collection<C10525bqB> getOpenedCoins() {
            return this.openedCoins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.openedCoins.hashCode() * 31) + this.notOpenedCoins.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchCoinData(openedCoins=" + this.openedCoins + ", notOpenedCoins=" + this.notOpenedCoins + ")";
        }

        public SearchCoinData(@NotNull Collection<C10525bqB> collection, @NotNull Collection<C10525bqB> collection2) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(collection2, "");
            this.openedCoins = collection;
            this.notOpenedCoins = collection2;
        }
    }

    public final int AEQbTJ(C10525bqB c10525bqB, String str) {
        if (str.length() != 0) {
            if (C59449zhJ.gEmmrt(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 0;
            }
            if (C59449zhJ.AYXKKw(c10525bqB.KWHzl().fJNWhG(), str, true)) {
                return 1;
            }
            if (StringsKt__StringsKt.AhwBna((CharSequence) c10525bqB.KWHzl().fJNWhG(), (CharSequence) str, true)) {
                return 2;
            }
        }
        return 3;
    }

    public final class StateListAnimator implements Comparator<C10525bqB> {
        public int copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            Intrinsics.checkNotNullParameter(c10525bqB2, "");
            SearchCoinViewModel searchCoinViewModel = SearchCoinViewModel.this;
            int iAEQbTJ = searchCoinViewModel.AEQbTJ(c10525bqB, searchCoinViewModel.EZpvd());
            SearchCoinViewModel searchCoinViewModel2 = SearchCoinViewModel.this;
            int iAEQbTJ2 = iAEQbTJ - searchCoinViewModel2.AEQbTJ(c10525bqB2, searchCoinViewModel2.EZpvd());
            this.copydefault = iAEQbTJ2;
            if (iAEQbTJ2 == 0) {
                this.copydefault = C33129mqd.copydefault(c10525bqB2.AhwBna()).compareTo(C33129mqd.copydefault(c10525bqB.AhwBna()));
            }
            if (this.copydefault == 0) {
                this.copydefault = C33129mqd.copydefault(c10525bqB2.fIwbmz()).compareTo(C33129mqd.copydefault(c10525bqB.fIwbmz()));
            }
            if (this.copydefault == 0) {
                this.copydefault = c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
            }
            return this.copydefault;
        }
    }

    public final class Activity implements Comparator<C10525bqB> {
        public int copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            Intrinsics.checkNotNullParameter(c10525bqB2, "");
            SearchCoinViewModel searchCoinViewModel = SearchCoinViewModel.this;
            int iAEQbTJ = searchCoinViewModel.AEQbTJ(c10525bqB, searchCoinViewModel.EZpvd());
            SearchCoinViewModel searchCoinViewModel2 = SearchCoinViewModel.this;
            int iAEQbTJ2 = iAEQbTJ - searchCoinViewModel2.AEQbTJ(c10525bqB2, searchCoinViewModel2.EZpvd());
            this.copydefault = iAEQbTJ2;
            if (iAEQbTJ2 == 0) {
                this.copydefault = c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
            }
            if (this.copydefault == 0) {
                this.copydefault = c10525bqB.KWHzl().fJNWhG().compareTo(c10525bqB2.KWHzl().fJNWhG());
            }
            return this.copydefault;
        }
    }

    public final class TaskDescription implements Comparator<C10525bqB> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
            Intrinsics.checkNotNullParameter(c10525bqB, "");
            Intrinsics.checkNotNullParameter(c10525bqB2, "");
            return c10525bqB.KWHzl().UeEOUB() - c10525bqB2.KWHzl().UeEOUB();
        }
    }

    public static final SearchResultBean copydefault(SearchResultBean searchResultBean, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10525bqB c10525bqB = (C10525bqB) it.next();
            searchResultBean.getNotOpened_aggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
        }
        return searchResultBean;
    }

    public static final Unit OLrzqt(SearchCoinViewModel searchCoinViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10525bqB c10525bqB = (C10525bqB) it.next();
            searchCoinViewModel.DbNXlk.getNotOpened_aggregated_coins().put(Long.valueOf(c10525bqB.OLrzqt()), c10525bqB);
        }
        AbstractC32952mnL<SearchCoinData> abstractC32952mnL = searchCoinViewModel.copydefault;
        Collection<C10525bqB> collectionValues = searchCoinViewModel.DbNXlk.getOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(collectionValues, searchCoinViewModel.new StateListAnimator());
        Collection<C10525bqB> collectionValues2 = searchCoinViewModel.DbNXlk.getNotOpened_aggregated_coins().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        C33024moe.OLrzqt(abstractC32952mnL, new SearchCoinData(listEZpvd, CollectionsKt___CollectionsKt.EZpvd(collectionValues2, searchCoinViewModel.new TaskDescription())));
        return Unit.INSTANCE;
    }

    public static final List OLrzqt(SearchCoinViewModel searchCoinViewModel, int i, SearchResultBean searchResultBean, ResponseData responseData) {
        List<SearchCoinMetaBean> coinInfo;
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            SearchCoinResp searchCoinResp = (SearchCoinResp) responseData.getData();
            List<SearchCoinMetaBean> coinInfo2 = searchCoinResp != null ? searchCoinResp.getCoinInfo() : null;
            if (coinInfo2 != null && !coinInfo2.isEmpty()) {
                searchCoinViewModel.AhwBna = i;
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = searchResultBean.getOpened_aggregated_coins().size() + searchResultBean.getNotOpened_aggregated_coins().size();
        SearchCoinResp searchCoinResp2 = (SearchCoinResp) responseData.getData();
        if (searchCoinResp2 != null && (coinInfo = searchCoinResp2.getCoinInfo()) != null) {
            int i2 = 0;
            for (Object obj : coinInfo) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                SearchCoinMetaBean searchCoinMetaBean = (SearchCoinMetaBean) obj;
                Long lM6405getCoinId = searchCoinMetaBean.m6405getCoinId();
                if (lM6405getCoinId != null) {
                    long jLongValue = lM6405getCoinId.longValue();
                    if (searchResultBean.getOpened_notAggregated_coins().containsKey(Long.valueOf(jLongValue))) {
                        C10525bqB c10525bqB = searchResultBean.getOpened_aggregated_coins().get(Long.valueOf(jLongValue));
                        if (c10525bqB != null && (c10854bwMKWHzl = c10525bqB.KWHzl()) != null) {
                            c10854bwMKWHzl.AEQbTJ(i2 + size);
                        }
                    } else {
                        if (i > searchCoinViewModel.EZpvd && searchResultBean.getNotOpened_aggregated_coins().containsKey(Long.valueOf(jLongValue))) {
                            searchResultBean.getNotOpened_aggregated_coins().remove(Long.valueOf(jLongValue));
                        }
                        Long chainId = searchCoinMetaBean.getChainId();
                        C10854bwM c10854bwMEZpvd = chainId != null ? C10954byG.EZpvd.valueOf().EZpvd(searchCoinMetaBean.getAddress(), C33129mqd.valueOf(Long.valueOf(chainId.longValue()))) : null;
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        Long lM6405getCoinId2 = searchCoinMetaBean.m6405getCoinId();
                        long jLongValue2 = lM6405getCoinId2 != null ? lM6405getCoinId2.longValue() : 0L;
                        Long chainId2 = searchCoinMetaBean.getChainId();
                        long jLongValue3 = chainId2 != null ? chainId2.longValue() : 0L;
                        String symbol = searchCoinMetaBean.getSymbol();
                        C10854bwM c10854bwM = new C10854bwM(new CoinMetaBean(jLongValue2, jLongValue3, 0L, 0L, searchCoinMetaBean.getName(), searchCoinMetaBean.getChainName(), symbol, searchCoinMetaBean.getImageUrl(), (String) null, searchCoinMetaBean.getAddress(), 0, 0, 0, 0, searchCoinMetaBean.getTokenType(), false, false, (Integer) null, false, 0, searchCoinMetaBean.aggregationType(), size + i2, false, false, (String) null, (FactionInfo) null, (Boolean) null, 0, 0, false, (Boolean) null, (Long) null, (Boolean) null, (Integer) null, (Integer) null, 0, (Integer) null, (Integer) null, c10854bwMEZpvd != null ? c10854bwMEZpvd.getNewProxyInstance() : false, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, c10854bwMEZpvd != null ? c10854bwMEZpvd.RcXXUw() : false, (String) null, -3162868, 575, (DefaultConstructorMarker) null));
                        AbstractC12782ctV abstractC12782ctV = searchCoinViewModel.valueOf;
                        Intrinsics.copydefault(abstractC12782ctV);
                        C10525bqB c10525bqBFromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(stateListAnimator, c10854bwM, abstractC12782ctV, null, 4, null);
                        if (c10525bqBFromCoinMeta$default.KWHzl().giSNqX()) {
                            c10525bqBFromCoinMeta$default.DbNXlk();
                            c10525bqBFromCoinMeta$default.KWHzl(searchCoinMetaBean.getCoinIds());
                        }
                        arrayList.add(c10525bqBFromCoinMeta$default);
                    }
                }
                i2++;
            }
        }
        return arrayList;
    }
}
