package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.CommonUserFavUseCase$setWatch$1;
import com.okinc.market.watch.usecase.CommonUserFavUseCase$setWatch$4$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import o.C55688xof;
import o.InterfaceC40459qWq;
import o.InterfaceC40464qWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWN {
    public static final int KWHzl = 0;
    public final qWO EZpvd;

    public qWN(@NotNull qWO qwo) {
        Intrinsics.checkNotNullParameter(qwo, "");
        this.EZpvd = qwo;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objInsertUserFavorite$default;
        BizInstrument bizInstrumentEZpvd = qWJ.EZpvd(str, str2);
        MarketUserFavorite marketUserFavorite$default = bizInstrumentEZpvd != null ? qWJ.toMarketUserFavorite$default(bizInstrumentEZpvd, null, 1, null) : null;
        return (marketUserFavorite$default == null || (objInsertUserFavorite$default = InterfaceC40459qWq.ActionBar.insertUserFavorite$default(this.EZpvd, marketUserFavorite$default, null, false, continuation, 6, null)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objInsertUserFavorite$default;
    }

    public final java.lang.Object copydefault(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objInsertUserFavorite$default;
        MarketUserFavorite marketUserFavorite$default = qWJ.toMarketUserFavorite$default(bizInstrument, null, 1, null);
        return (marketUserFavorite$default == null || (objInsertUserFavorite$default = InterfaceC40459qWq.ActionBar.insertUserFavorite$default(this.EZpvd, marketUserFavorite$default, null, false, continuation, 6, null)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objInsertUserFavorite$default;
    }

    public final java.lang.Object AEQbTJ(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objInsertUserFavorite$default = InterfaceC40459qWq.ActionBar.insertUserFavorite$default(this.EZpvd, qWJ.convertToUserFavorite$default(watchListData, null, 1, null), null, false, continuation, 6, null);
        return objInsertUserFavorite$default == C56442yFn.copydefault() ? objInsertUserFavorite$default : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objDeleteUserFavorite$default;
        BizInstrument bizInstrumentEZpvd = qWJ.EZpvd(str, str2);
        MarketUserFavorite marketUserFavorite$default = bizInstrumentEZpvd != null ? qWJ.toMarketUserFavorite$default(bizInstrumentEZpvd, null, 1, null) : null;
        return (marketUserFavorite$default == null || (objDeleteUserFavorite$default = InterfaceC40459qWq.ActionBar.deleteUserFavorite$default(this.EZpvd, C56402yEa.EZpvd(marketUserFavorite$default), null, continuation, 2, null)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objDeleteUserFavorite$default;
    }

    public final java.lang.Object OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objDeleteUserFavorite$default = InterfaceC40459qWq.ActionBar.deleteUserFavorite$default(this.EZpvd, C56402yEa.EZpvd(qWJ.toMarketUserFavorite$default(bizInstrument, null, 1, null)), null, continuation, 2, null);
        return objDeleteUserFavorite$default == C56442yFn.copydefault() ? objDeleteUserFavorite$default : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objDeleteUserFavorite$default = InterfaceC40459qWq.ActionBar.deleteUserFavorite$default(this.EZpvd, C56402yEa.EZpvd(qWJ.convertToUserFavorite$default(watchListData, null, 1, null)), null, continuation, 2, null);
        return objDeleteUserFavorite$default == C56442yFn.copydefault() ? objDeleteUserFavorite$default : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object top$default = InterfaceC40459qWq.ActionBar.setTop$default(this.EZpvd, qWJ.toMarketUserFavorite$default(bizInstrument, null, 1, null), null, continuation, 2, null);
        return top$default == C56442yFn.copydefault() ? top$default : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object top$default = InterfaceC40459qWq.ActionBar.setTop$default(this.EZpvd, qWJ.convertToUserFavorite$default(watchListData, null, 1, null), null, continuation, 2, null);
        return top$default == C56442yFn.copydefault() ? top$default : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<MarketUserFavorite>> continuation) {
        return InterfaceC40459qWq.ActionBar.getUserFavoritesByUserId$default(this.EZpvd, C55686xod.KWHzl(), null, continuation, 2, null);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation) {
        return InterfaceC40464qWv.StateListAnimator.cursorUserFav$default(this.EZpvd, C55686xod.KWHzl(), null, continuation, 2, null);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.EZpvd.copydefault(C55686xod.KWHzl(), list, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<WatchListData> list, @NotNull Continuation<? super Unit> continuation) {
        qWO qwo = this.EZpvd;
        java.lang.String strKWHzl = C55686xod.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qWJ.EZpvd((WatchListData) it.next(), C55686xod.KWHzl()));
        }
        java.lang.Object objReplaceFavorites$default = InterfaceC40459qWq.ActionBar.replaceFavorites$default(qwo, strKWHzl, arrayList, null, false, continuation, 12, null);
        return objReplaceFavorites$default == C56442yFn.copydefault() ? objReplaceFavorites$default : Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CommonUserFavUseCase$setWatch$1 commonUserFavUseCase$setWatch$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CommonUserFavUseCase$setWatch$1) {
            commonUserFavUseCase$setWatch$1 = (CommonUserFavUseCase$setWatch$1) continuation;
            int i = commonUserFavUseCase$setWatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonUserFavUseCase$setWatch$1.label = i - Integer.MIN_VALUE;
            } else {
                commonUserFavUseCase$setWatch$1 = new CommonUserFavUseCase$setWatch$1(this, continuation);
            }
        }
        java.lang.Object obj = commonUserFavUseCase$setWatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = commonUserFavUseCase$setWatch$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        commonUserFavUseCase$setWatch$1.L$0 = str;
                        commonUserFavUseCase$setWatch$1.label = 1;
                        if (copydefault(bizInstrument, commonUserFavUseCase$setWatch$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        commonUserFavUseCase$setWatch$1.L$0 = str;
                        commonUserFavUseCase$setWatch$1.label = 3;
                        if (OLrzqt(bizInstrument, commonUserFavUseCase$setWatch$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        commonUserFavUseCase$setWatch$1.L$0 = str;
                        commonUserFavUseCase$setWatch$1.label = 2;
                        if (KWHzl(bizInstrument, commonUserFavUseCase$setWatch$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) commonUserFavUseCase$setWatch$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                C33134mqi.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDGTeJD), 0, 1, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                C33134mqi.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (java.lang.Object) null);
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MainCoroutineDispatcher main = Dispatchers.getMain();
            CommonUserFavUseCase$setWatch$4$1 commonUserFavUseCase$setWatch$4$1 = new CommonUserFavUseCase$setWatch$4$1(thM7380exceptionOrNullimpl, null);
            commonUserFavUseCase$setWatch$1.L$0 = objM7377constructorimpl;
            commonUserFavUseCase$setWatch$1.label = 4;
            if (BuildersKt.withContext(main, commonUserFavUseCase$setWatch$4$1, commonUserFavUseCase$setWatch$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) {
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    java.lang.Object objCopydefault = copydefault(bizInstrument, continuation);
                    return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    java.lang.Object objOLrzqt = OLrzqt(bizInstrument, continuation);
                    return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    java.lang.Object objKWHzl = KWHzl(bizInstrument, continuation);
                    return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.EZpvd.KWHzl(C55686xod.KWHzl(), qWJ.convertToUserFavorite$default(watchListData, null, 1, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull WatchListData watchListData, @NotNull Continuation<? super Flow<java.lang.Boolean>> continuation) {
        return this.EZpvd.KWHzl(C55686xod.KWHzl(), qWJ.convertToUserFavorite$default(watchListData, null, 1, null));
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objSyncWithServer$default = qWO.syncWithServer$default(this.EZpvd, C55686xod.KWHzl(), false, continuation, 2, null);
        return objSyncWithServer$default == C56442yFn.copydefault() ? objSyncWithServer$default : Unit.INSTANCE;
    }
}
