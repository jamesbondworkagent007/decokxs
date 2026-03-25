package com.okinc.business.market.features.home_favorite_list.ui.edit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC28464kbK;
import o.AbstractC28538kcf;
import o.C22418hew;
import o.C25389ivm;
import o.C27770kCs;
import o.C28410kaJ;
import o.C28416kaP;
import o.C28418kaR;
import o.C28422kaV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistEditViewModel extends ViewModel {
    public final C28410kaJ AEQbTJ;
    public final C28416kaP AYXKKw;
    public final C27770kCs AhwBna;
    public final MutableLiveData<AbstractC28464kbK> EZpvd;
    public Job KWHzl;
    public final MutableLiveData<AbstractC28538kcf> OLrzqt;
    public final C28418kaR copydefault;
    public final List<C28422kaV> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AbstractC28538kcf> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AbstractC28464kbK> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public WatchlistEditViewModel(@NotNull C28416kaP c28416kaP, @NotNull C28418kaR c28418kaR, @NotNull C28410kaJ c28410kaJ, @NotNull C27770kCs c27770kCs) {
        Intrinsics.checkNotNullParameter(c28416kaP, "");
        Intrinsics.checkNotNullParameter(c28418kaR, "");
        Intrinsics.checkNotNullParameter(c28410kaJ, "");
        Intrinsics.checkNotNullParameter(c27770kCs, "");
        this.AYXKKw = c28416kaP;
        this.copydefault = c28418kaR;
        this.AEQbTJ = c28410kaJ;
        this.AhwBna = c27770kCs;
        this.OLrzqt = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.valueOf = new ArrayList();
    }

    public final void AEQbTJ(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C22418hew.copydefault(str)) {
            str = "";
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistEditViewModel$getWatchlist$1(this, i, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull C28422kaV c28422kaV, int i) {
        Intrinsics.checkNotNullParameter(c28422kaV, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistEditViewModel$pinTop$1(this, c28422kaV, i, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull FavoriteAction favoriteAction, @NotNull List<HomeToken> list, @NotNull List<Integer> list2, @NotNull List<Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        WatchlistEditViewModel$updateFavoriteStatus$1 watchlistEditViewModel$updateFavoriteStatus$1;
        if (continuation instanceof WatchlistEditViewModel$updateFavoriteStatus$1) {
            watchlistEditViewModel$updateFavoriteStatus$1 = (WatchlistEditViewModel$updateFavoriteStatus$1) continuation;
            int i = watchlistEditViewModel$updateFavoriteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistEditViewModel$updateFavoriteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistEditViewModel$updateFavoriteStatus$1 = new WatchlistEditViewModel$updateFavoriteStatus$1(this, continuation);
            }
        }
        WatchlistEditViewModel$updateFavoriteStatus$1 watchlistEditViewModel$updateFavoriteStatus$12 = watchlistEditViewModel$updateFavoriteStatus$1;
        Object obj = watchlistEditViewModel$updateFavoriteStatus$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistEditViewModel$updateFavoriteStatus$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27770kCs c27770kCs = this.AhwBna;
        watchlistEditViewModel$updateFavoriteStatus$12.label = 1;
        Object objEZpvd = c27770kCs.EZpvd(favoriteAction, list, list2, list3, watchlistEditViewModel$updateFavoriteStatus$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: updateFavoriteStatus-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m6595updateFavoriteStatusyxL6bBk$default(WatchlistEditViewModel watchlistEditViewModel, FavoriteAction favoriteAction, List list, List list2, List list3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return watchlistEditViewModel.OLrzqt(favoriteAction, list, list4, list3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull List<C28422kaV> list, @NotNull List<Integer> list2, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        WatchlistEditViewModel$removeSelected$1 watchlistEditViewModel$removeSelected$1;
        if (continuation instanceof WatchlistEditViewModel$removeSelected$1) {
            watchlistEditViewModel$removeSelected$1 = (WatchlistEditViewModel$removeSelected$1) continuation;
            int i = watchlistEditViewModel$removeSelected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistEditViewModel$removeSelected$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistEditViewModel$removeSelected$1 = new WatchlistEditViewModel$removeSelected$1(this, continuation);
            }
        }
        WatchlistEditViewModel$removeSelected$1 watchlistEditViewModel$removeSelected$12 = watchlistEditViewModel$removeSelected$1;
        Object obj = watchlistEditViewModel$removeSelected$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistEditViewModel$removeSelected$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27770kCs c27770kCs = this.AhwBna;
        FavoriteAction favoriteAction = FavoriteAction.RemoveFromWatchList;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28422kaV c28422kaV : list) {
            arrayList.add(new HomeToken(c28422kaV.EZpvd(), null, c28422kaV.AkhnZx(), c28422kaV.AuCTel(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 1048562, null));
        }
        watchlistEditViewModel$removeSelected$12.label = 1;
        Object objM8647invokeyxL6bBk$default = C27770kCs.m8647invokeyxL6bBk$default(c27770kCs, favoriteAction, arrayList, null, list2, watchlistEditViewModel$removeSelected$12, 4, null);
        return objM8647invokeyxL6bBk$default == objCopydefault ? objCopydefault : objM8647invokeyxL6bBk$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: removeSelected-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m6594removeSelected0E7RQCE$default(WatchlistEditViewModel watchlistEditViewModel, List list, List list2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = yDY.AhwBna();
        }
        return watchlistEditViewModel.AEQbTJ(list, list2, continuation);
    }

    public final void OLrzqt(@NotNull C28422kaV c28422kaV) {
        Intrinsics.checkNotNullParameter(c28422kaV, "");
        if (this.valueOf.remove(c28422kaV)) {
            this.valueOf.add(0, c28422kaV);
            this.EZpvd.setValue(AbstractC28464kbK.TaskDescription.KWHzl);
        } else {
            this.EZpvd.setValue(AbstractC28464kbK.Application.KWHzl);
        }
    }

    public final void copydefault(int i, @NotNull List<C28422kaV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistEditViewModel$sortTokens$1(this, i, list, null), 3, null);
    }

    public final void KWHzl() {
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.KWHzl = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistEditViewModel$startLoadingOperation$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.OLrzqt.setValue(new AbstractC28538kcf.Activity(this.valueOf));
    }
}
