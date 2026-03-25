package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.data.po.FavGroupItemPo;
import com.okinc.market.watch.datasource.MarketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1;
import com.okinc.market.watch.datasource.MarketUserFavoriteRemoteDataSourceFake$getUserGroupData$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40465qWw implements InterfaceC40459qWq {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qWy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40465qWw.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<MarketUserFavorite>> continuation) {
        return OLrzqt(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, str, list, str2, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<UserGroup>> continuation) {
        return KWHzl(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object EZpvd(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, marketUserFavorite, str, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull UserGroup userGroup, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, str, userGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, marketUserFavorite, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation) {
        return copydefault(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, list, str, continuation);
    }

    public final MarketHttpApi AEQbTJ() {
        return (MarketHttpApi) this.KWHzl.getValue();
    }

    public static final MarketHttpApi KWHzl() {
        return (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(C40465qWw c40465qWw, java.lang.String str, java.lang.String str2, Continuation<? super java.util.List<MarketUserFavorite>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1 marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1;
        if (continuation instanceof MarketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1) {
            marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1 = (MarketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1) continuation;
            int i = marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1 = new MarketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1(c40465qWw, continuation);
            }
        }
        java.lang.Object watchListFavorite$default = marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(watchListFavorite$default);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
                java.util.Iterator<T> it = arrayListEZpvd.iterator();
                while (it.hasNext()) {
                    arrayList.add(qWJ.EZpvd(((WatchListBean) it.next()).getWatchlistData(), str));
                }
                return arrayList;
            }
            MarketHttpApi marketHttpApiAEQbTJ = c40465qWw.AEQbTJ();
            marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.L$0 = str;
            marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.label = 1;
            watchListFavorite$default = MarketHttpApi.ActionBar.getWatchListFavorite$default(marketHttpApiAEQbTJ, false, marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1, 1, null);
            if (watchListFavorite$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) marketUserFavoriteRemoteDataSourceFake$getUserFavoritesByUserId$1.L$0;
            C56391yDq.AEQbTJ(watchListFavorite$default);
        }
        java.util.List list = (java.util.List) ((ResponseData) watchListFavorite$default).getData();
        if (list == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(qWJ.EZpvd((WatchListData) it2.next(), str));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(C40465qWw c40465qWw, java.lang.String str, Continuation<? super java.util.List<C40453qWk>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRemoteDataSourceFake$getUserGroupData$1 marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1;
        java.util.List listAhwBna;
        if (continuation instanceof MarketUserFavoriteRemoteDataSourceFake$getUserGroupData$1) {
            marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1 = (MarketUserFavoriteRemoteDataSourceFake$getUserGroupData$1) continuation;
            int i = marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1 = new MarketUserFavoriteRemoteDataSourceFake$getUserGroupData$1(c40465qWw, continuation);
            }
        }
        java.lang.Object groupWatchListFavorite$default = marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(groupWatchListFavorite$default);
            if (C55608xnE.isLogin$default(null, 1, null)) {
                MarketHttpApi marketHttpApiAEQbTJ = c40465qWw.AEQbTJ();
                marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1.label = 1;
                groupWatchListFavorite$default = MarketHttpApi.ActionBar.getGroupWatchListFavorite$default(marketHttpApiAEQbTJ, false, marketUserFavoriteRemoteDataSourceFake$getUserGroupData$1, 1, null);
                if (groupWatchListFavorite$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
                java.util.Iterator<T> it = arrayListEZpvd.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WatchListBean) it.next()).getWatchlistData());
                }
                java.util.List<WatchListData> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listFJNWhG) {
                    WatchListData watchListData = (WatchListData) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION") && C33129mqd.valueOf(watchListData.getExpTime(), C33129mqd.gEmmrt(C56443yFo.KWHzl(java.lang.System.currentTimeMillis())))) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    listFJNWhG.remove((WatchListData) it2.next());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
                java.util.Iterator it3 = listFJNWhG.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(WatchListBean.Companion.AEQbTJ((WatchListData) it3.next()));
                }
                qVA.copydefault(new java.util.ArrayList(arrayList3));
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.List<UserGroup> listAEQbTJ = UserGroup.Companion.AEQbTJ(MultiTransferSignData.DEFAULT_INTERVAL);
                for (WatchListData watchListData2 : listFJNWhG) {
                    for (UserGroup userGroup : listAEQbTJ) {
                        boolean zAEQbTJ = C40454qWl.AEQbTJ(userGroup, watchListData2);
                        java.lang.Object arrayList5 = linkedHashMap.get(userGroup);
                        if (arrayList5 == null) {
                            arrayList5 = new java.util.ArrayList();
                            linkedHashMap.put(userGroup, arrayList5);
                        }
                        java.util.List list = (java.util.List) arrayList5;
                        if (zAEQbTJ) {
                            list.add(watchListData2);
                        }
                    }
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                for (UserGroup userGroup2 : listAEQbTJ) {
                    java.util.List list2 = (java.util.List) linkedHashMap.get(userGroup2);
                    if (list2 == null) {
                        listAhwBna = yDY.AhwBna();
                    } else {
                        listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                        java.util.Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            listAhwBna.add(qWJ.EZpvd((WatchListData) it4.next(), MultiTransferSignData.DEFAULT_INTERVAL));
                        }
                    }
                    arrayList6.add(new C40453qWk(userGroup2, listAhwBna));
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList6) {
                    if (!((C40453qWk) obj2).copydefault().isEmpty()) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList4.addAll(arrayList7);
                return arrayList4;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(groupWatchListFavorite$default);
        }
        java.util.List list3 = (java.util.List) ((ResponseData) groupWatchListFavorite$default).getData();
        if (list3 == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
        java.util.Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList8.add(C40452qWj.AEQbTJ((FavGroupItemPo) it5.next()));
        }
        return arrayList8;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40465qWw c40465qWw, java.util.List<MarketUserFavorite> list, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.IllegalAccessException {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (C55608xnE.isLogin$default(null, 1, null)) {
            if (list.size() == 1) {
                MarketUserFavorite marketUserFavorite = (MarketUserFavorite) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (marketUserFavorite != null) {
                    java.lang.Object objRemoveFavoritesCryptosFromGroup = c40465qWw.AEQbTJ().removeFavoritesCryptosFromGroup(C40457qWo.OLrzqt(marketUserFavorite, str, "1"), continuation);
                    if (objRemoveFavoritesCryptosFromGroup == C56442yFn.copydefault()) {
                        return objRemoveFavoritesCryptosFromGroup;
                    }
                }
            } else {
                MarketHttpApi marketHttpApiAEQbTJ = c40465qWw.AEQbTJ();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (MarketUserFavorite marketUserFavorite2 : list) {
                    arrayList.add(new SettingWatchList("0", marketUserFavorite2.getInstId(), marketUserFavorite2.getInstType(), marketUserFavorite2.getAlias(), marketUserFavorite2.getExpTime(), marketUserFavorite2.getChainId(), marketUserFavorite2.getTokenContractAddress()));
                }
                java.lang.Object allFavorite = marketHttpApiAEQbTJ.setAllFavorite(arrayList, continuation);
                return allFavorite == C56442yFn.copydefault() ? allFavorite : Unit.INSTANCE;
            }
        } else {
            java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
            for (final MarketUserFavorite marketUserFavorite3 : list) {
                final Function1 function1 = new Function1() { // from class: o.qWz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(C40465qWw.copydefault(marketUserFavorite3, (WatchListBean) obj));
                    }
                };
                arrayListEZpvd.removeIf(new java.util.function.Predicate() { // from class: o.qWA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return C40465qWw.copydefault(function1, obj);
                    }
                });
            }
            if (!qVA.copydefault(new java.util.ArrayList(arrayListEZpvd))) {
                throw new java.lang.IllegalAccessException(C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener));
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean copydefault(MarketUserFavorite marketUserFavorite, WatchListBean watchListBean) {
        Intrinsics.checkNotNullParameter(watchListBean, "");
        WatchListData watchlistData = watchListBean.getWatchlistData();
        return Intrinsics.EZpvd((java.lang.Object) watchlistData.getInstId(), (java.lang.Object) marketUserFavorite.getInstId()) && Intrinsics.EZpvd((java.lang.Object) watchlistData.getInstType(), (java.lang.Object) marketUserFavorite.getInstType()) && Intrinsics.EZpvd((java.lang.Object) watchlistData.getAlias(), (java.lang.Object) marketUserFavorite.getAlias()) && Intrinsics.EZpvd((java.lang.Object) watchlistData.getChainId(), (java.lang.Object) marketUserFavorite.getChainId()) && Intrinsics.EZpvd((java.lang.Object) watchlistData.getTokenContractAddress(), (java.lang.Object) marketUserFavorite.getTokenContractAddress());
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40465qWw c40465qWw, java.lang.String str, java.util.List<MarketUserFavorite> list, java.lang.String str2, boolean z, Continuation<? super Unit> continuation) throws java.lang.IllegalAccessException {
        if (C55608xnE.isLogin$default(null, 1, null)) {
            if (z) {
                java.lang.Object groupFavorite = c40465qWw.AEQbTJ().setGroupFavorite(C40457qWo.AEQbTJ(list, str2, "0"), continuation);
                return groupFavorite == C56442yFn.copydefault() ? groupFavorite : Unit.INSTANCE;
            }
            MarketHttpApi marketHttpApiAEQbTJ = c40465qWw.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MarketUserFavorite marketUserFavorite : list) {
                arrayList.add(new SettingWatchList("0", marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias(), marketUserFavorite.getExpTime(), marketUserFavorite.getChainId(), marketUserFavorite.getTokenContractAddress()));
            }
            java.lang.Object allFavorite = marketHttpApiAEQbTJ.setAllFavorite(arrayList, continuation);
            return allFavorite == C56442yFn.copydefault() ? allFavorite : Unit.INSTANCE;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ALL")) {
            java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
            while (it.hasNext()) {
                arrayList2.add(((WatchListBean) it.next()).getWatchlistData());
            }
            qWL qwl = qWL.copydefault;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(qWJ.EZpvd((MarketUserFavorite) it2.next()));
            }
            java.util.List<WatchListData> listCopydefault = qwl.copydefault(arrayList3, arrayList2, true);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it3 = listCopydefault.iterator();
            while (it3.hasNext()) {
                arrayList4.add(WatchListBean.Companion.AEQbTJ((WatchListData) it3.next()));
            }
            if (!qVA.copydefault(new java.util.ArrayList(arrayList4))) {
                throw new java.lang.IllegalAccessException(C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener));
            }
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(WatchListBean.Companion.AEQbTJ(qWJ.EZpvd((MarketUserFavorite) it4.next())));
            }
            if (!qVA.copydefault(new java.util.ArrayList(arrayList5))) {
                throw new java.lang.IllegalAccessException(C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(C40465qWw c40465qWw, MarketUserFavorite marketUserFavorite, java.lang.String str, boolean z, Continuation<? super Unit> continuation) throws java.lang.Exception {
        if (C55608xnE.isLogin$default(null, 1, null)) {
            java.lang.Object watchListFavorite = c40465qWw.AEQbTJ().setWatchListFavorite(new SettingWatchList("0", marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias(), marketUserFavorite.getExpTime(), marketUserFavorite.getChainId(), marketUserFavorite.getTokenContractAddress()), continuation);
            return watchListFavorite == C56442yFn.copydefault() ? watchListFavorite : Unit.INSTANCE;
        }
        qVA.AEQbTJ("0", qWJ.EZpvd(marketUserFavorite));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object KWHzl(C40465qWw c40465qWw, MarketUserFavorite marketUserFavorite, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Exception {
        if (C55608xnE.isLogin$default(null, 1, null)) {
            java.lang.Object watchListFavorite = c40465qWw.AEQbTJ().setWatchListFavorite(new SettingWatchList("2", marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias(), marketUserFavorite.getExpTime(), marketUserFavorite.getChainId(), marketUserFavorite.getTokenContractAddress()), continuation);
            return watchListFavorite == C56442yFn.copydefault() ? watchListFavorite : Unit.INSTANCE;
        }
        qVA.AEQbTJ("2", qWJ.EZpvd(marketUserFavorite));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(C40465qWw c40465qWw, java.lang.String str, java.lang.String str2, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40465qWw c40465qWw, java.lang.String str, UserGroup userGroup, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object KWHzl(C40465qWw c40465qWw, java.lang.String str, Continuation<? super java.util.List<UserGroup>> continuation) {
        return yDY.AhwBna();
    }
}
