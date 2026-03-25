package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesAddCryptosToGroupPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptosInGroupPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupNamePayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupVisibilityPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesUpdateGroupNamePayload;
import com.okinc.business.market.features.favorites.editing.data.repository.MarketFavoritesRepository$getMarketFavoritesGroupsData$1;
import com.okinc.business.market.features.favorites.editing.data.repository.MarketFavoritesRepository$updateFavoritesGroupVisibility$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26117jSo {
    public final CoroutineDispatcher KWHzl;
    public final C26113jSk OLrzqt;

    @yCM
    public C26117jSo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26113jSk c26113jSk) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26113jSk, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c26113jSk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<MarketFavoritesGroupPo>> continuation) throws java.lang.Throwable {
        MarketFavoritesRepository$getMarketFavoritesGroupsData$1 marketFavoritesRepository$getMarketFavoritesGroupsData$1;
        if (continuation instanceof MarketFavoritesRepository$getMarketFavoritesGroupsData$1) {
            marketFavoritesRepository$getMarketFavoritesGroupsData$1 = (MarketFavoritesRepository$getMarketFavoritesGroupsData$1) continuation;
            int i = marketFavoritesRepository$getMarketFavoritesGroupsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavoritesRepository$getMarketFavoritesGroupsData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavoritesRepository$getMarketFavoritesGroupsData$1 = new MarketFavoritesRepository$getMarketFavoritesGroupsData$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = marketFavoritesRepository$getMarketFavoritesGroupsData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavoritesRepository$getMarketFavoritesGroupsData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C26113jSk c26113jSk = this.OLrzqt;
            marketFavoritesRepository$getMarketFavoritesGroupsData$1.label = 1;
            objAEQbTJ = c26113jSk.AEQbTJ(marketFavoritesRepository$getMarketFavoritesGroupsData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }

    public final java.lang.Object KWHzl(@NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = this.OLrzqt.EZpvd(marketFavoritesGroupNamePayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.OLrzqt.OLrzqt(marketFavoritesUpdateGroupNamePayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.OLrzqt.OLrzqt(marketFavoritesGroupNamePayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.OLrzqt.copydefault(list, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload, @NotNull Continuation<? super java.util.List<MarketFavoritesGroupPo>> continuation) throws java.lang.Throwable {
        MarketFavoritesRepository$updateFavoritesGroupVisibility$1 marketFavoritesRepository$updateFavoritesGroupVisibility$1;
        if (continuation instanceof MarketFavoritesRepository$updateFavoritesGroupVisibility$1) {
            marketFavoritesRepository$updateFavoritesGroupVisibility$1 = (MarketFavoritesRepository$updateFavoritesGroupVisibility$1) continuation;
            int i = marketFavoritesRepository$updateFavoritesGroupVisibility$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavoritesRepository$updateFavoritesGroupVisibility$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavoritesRepository$updateFavoritesGroupVisibility$1 = new MarketFavoritesRepository$updateFavoritesGroupVisibility$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = marketFavoritesRepository$updateFavoritesGroupVisibility$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavoritesRepository$updateFavoritesGroupVisibility$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C26113jSk c26113jSk = this.OLrzqt;
            marketFavoritesRepository$updateFavoritesGroupVisibility$1.label = 1;
            objAEQbTJ = c26113jSk.AEQbTJ(marketFavoritesGroupVisibilityPayload, marketFavoritesRepository$updateFavoritesGroupVisibility$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }

    public final java.lang.Object EZpvd(@NotNull MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = this.OLrzqt.EZpvd(marketFavoritesAddCryptosToGroupPayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = this.OLrzqt.EZpvd(marketFavoritesCryptosInGroupPayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.OLrzqt.AEQbTJ(marketFavoritesCryptosInGroupPayload, (Continuation<? super ResponseData<Unit>>) continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
