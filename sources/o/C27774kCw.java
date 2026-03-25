package o;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.data.model.watchlist.WatchlistGroupRequest;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$createWatchlistGroup$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$deleteWatchlistGroup$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$getWatchlistGroups$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$renameWatchlistGroup$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$sortFavoriteTokens$1;
import com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$sortWatchlistGroups$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27774kCw implements InterfaceC27771kCt {
    public final InterfaceC27595jyE KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C27774kCw(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$getWatchlistGroups$1 watchlistGroupRepositoryImpl$getWatchlistGroups$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$getWatchlistGroups$1) {
            watchlistGroupRepositoryImpl$getWatchlistGroups$1 = (WatchlistGroupRepositoryImpl$getWatchlistGroups$1) continuation;
            int i = watchlistGroupRepositoryImpl$getWatchlistGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$getWatchlistGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$getWatchlistGroups$1 = new WatchlistGroupRepositoryImpl$getWatchlistGroups$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = watchlistGroupRepositoryImpl$getWatchlistGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistGroupRepositoryImpl$getWatchlistGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1 watchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1 = new WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1(null, str2, str, this);
            watchlistGroupRepositoryImpl$getWatchlistGroups$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, watchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1, watchlistGroupRepositoryImpl$getWatchlistGroups$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$createWatchlistGroup$1 watchlistGroupRepositoryImpl$createWatchlistGroup$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$createWatchlistGroup$1) {
            watchlistGroupRepositoryImpl$createWatchlistGroup$1 = (WatchlistGroupRepositoryImpl$createWatchlistGroup$1) continuation;
            int i = watchlistGroupRepositoryImpl$createWatchlistGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$createWatchlistGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$createWatchlistGroup$1 = new WatchlistGroupRepositoryImpl$createWatchlistGroup$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = watchlistGroupRepositoryImpl$createWatchlistGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistGroupRepositoryImpl$createWatchlistGroup$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC27595jyE interfaceC27595jyE = this.KWHzl;
                WatchlistGroupRequest watchlistGroupRequest = new WatchlistGroupRequest(str, str2, str3, (java.lang.Integer) null, 8, (DefaultConstructorMarker) null);
                watchlistGroupRepositoryImpl$createWatchlistGroup$1.label = 1;
                objKWHzl = interfaceC27595jyE.KWHzl(watchlistGroupRequest, watchlistGroupRepositoryImpl$createWatchlistGroup$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objKWHzl).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$deleteWatchlistGroup$1 watchlistGroupRepositoryImpl$deleteWatchlistGroup$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$deleteWatchlistGroup$1) {
            watchlistGroupRepositoryImpl$deleteWatchlistGroup$1 = (WatchlistGroupRepositoryImpl$deleteWatchlistGroup$1) continuation;
            int i2 = watchlistGroupRepositoryImpl$deleteWatchlistGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$deleteWatchlistGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$deleteWatchlistGroup$1 = new WatchlistGroupRepositoryImpl$deleteWatchlistGroup$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = watchlistGroupRepositoryImpl$deleteWatchlistGroup$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = watchlistGroupRepositoryImpl$deleteWatchlistGroup$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC27595jyE interfaceC27595jyE = this.KWHzl;
                WatchlistGroupRequest watchlistGroupRequest = new WatchlistGroupRequest(str, str2, (java.lang.String) null, C56443yFo.AEQbTJ(i), 4, (DefaultConstructorMarker) null);
                watchlistGroupRepositoryImpl$deleteWatchlistGroup$1.label = 1;
                objCopydefault = interfaceC27595jyE.copydefault(watchlistGroupRequest, watchlistGroupRepositoryImpl$deleteWatchlistGroup$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$renameWatchlistGroup$1 watchlistGroupRepositoryImpl$renameWatchlistGroup$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$renameWatchlistGroup$1) {
            watchlistGroupRepositoryImpl$renameWatchlistGroup$1 = (WatchlistGroupRepositoryImpl$renameWatchlistGroup$1) continuation;
            int i2 = watchlistGroupRepositoryImpl$renameWatchlistGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$renameWatchlistGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$renameWatchlistGroup$1 = new WatchlistGroupRepositoryImpl$renameWatchlistGroup$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = watchlistGroupRepositoryImpl$renameWatchlistGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = watchlistGroupRepositoryImpl$renameWatchlistGroup$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC27595jyE interfaceC27595jyE = this.KWHzl;
                WatchlistGroupRequest watchlistGroupRequest = new WatchlistGroupRequest(str, str2, str3, C56443yFo.AEQbTJ(i));
                watchlistGroupRepositoryImpl$renameWatchlistGroup$1.label = 1;
                objOLrzqt = interfaceC27595jyE.OLrzqt(watchlistGroupRequest, watchlistGroupRepositoryImpl$renameWatchlistGroup$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objOLrzqt).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    @Override // o.InterfaceC27771kCt
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return kAB.EZpvd(new WatchlistGroupRepositoryImpl$sortWatchlistGroups$2(this, str, str2, list, null), continuation);
    }

    @Override // o.InterfaceC27771kCt
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<HomeFavoriteTokenData>, OKServerException>> continuation) {
        return kAB.EZpvd(new WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2(str, str2, i, str3, this, null), continuation);
    }

    @Override // o.InterfaceC27771kCt
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CommonGroupData>, OKServerException>> continuation) {
        return kAB.EZpvd(new WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2(str, str2, str3, str4, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull UpdateFavoriteTokensRequest updateFavoriteTokensRequest, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1) {
            watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 = (WatchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1) continuation;
            int i = watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1 = new WatchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC27595jyE interfaceC27595jyE = this.KWHzl;
                watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1.label = 1;
                objCopydefault = interfaceC27595jyE.copydefault(updateFavoriteTokensRequest, watchlistGroupRepositoryImpl$addOrDeleteFavoriteTokens$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objCopydefault).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC27771kCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull FavoriteTokensSortRequest favoriteTokensSortRequest, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WatchlistGroupRepositoryImpl$sortFavoriteTokens$1 watchlistGroupRepositoryImpl$sortFavoriteTokens$1;
        if (continuation instanceof WatchlistGroupRepositoryImpl$sortFavoriteTokens$1) {
            watchlistGroupRepositoryImpl$sortFavoriteTokens$1 = (WatchlistGroupRepositoryImpl$sortFavoriteTokens$1) continuation;
            int i = watchlistGroupRepositoryImpl$sortFavoriteTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistGroupRepositoryImpl$sortFavoriteTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistGroupRepositoryImpl$sortFavoriteTokens$1 = new WatchlistGroupRepositoryImpl$sortFavoriteTokens$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = watchlistGroupRepositoryImpl$sortFavoriteTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistGroupRepositoryImpl$sortFavoriteTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC27595jyE interfaceC27595jyE = this.KWHzl;
                watchlistGroupRepositoryImpl$sortFavoriteTokens$1.label = 1;
                objAEQbTJ = interfaceC27595jyE.AEQbTJ(favoriteTokensSortRequest, watchlistGroupRepositoryImpl$sortFavoriteTokens$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return C56443yFo.AEQbTJ(((ResponseData) objAEQbTJ).getCode());
        } catch (OKServerException e) {
            return C56443yFo.AEQbTJ(e.getCode());
        }
    }
}
