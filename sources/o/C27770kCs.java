package o;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.data.model.watchlist.FavoriteTokenData;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.domain.token.UpdateFavoriteTokensInGroupsUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.token.UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.watch_list_groups.domain.token.UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1;
import com.okinc.business.market.features.watch_list_groups.domain.token.UpdateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC28415kaO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27770kCs {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC27771kCt AEQbTJ;
    public final C27764kCm EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final kKG copydefault;

    @yCM
    public C27770kCs(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull C27764kCm c27764kCm, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(c27764kCm, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27771kCt;
        this.EZpvd = c27764kCm;
        this.copydefault = kkg;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.kCs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull FavoriteAction favoriteAction, @NotNull java.util.List<HomeToken> list, @NotNull java.util.List<java.lang.Integer> list2, @NotNull java.util.List<java.lang.Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) throws java.lang.Throwable {
        UpdateFavoriteTokensInGroupsUseCase$invoke$1 updateFavoriteTokensInGroupsUseCase$invoke$1;
        if (continuation instanceof UpdateFavoriteTokensInGroupsUseCase$invoke$1) {
            updateFavoriteTokensInGroupsUseCase$invoke$1 = (UpdateFavoriteTokensInGroupsUseCase$invoke$1) continuation;
            int i = updateFavoriteTokensInGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateFavoriteTokensInGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateFavoriteTokensInGroupsUseCase$invoke$1 = new UpdateFavoriteTokensInGroupsUseCase$invoke$1(this, continuation);
            }
        }
        UpdateFavoriteTokensInGroupsUseCase$invoke$1 updateFavoriteTokensInGroupsUseCase$invoke$12 = updateFavoriteTokensInGroupsUseCase$invoke$1;
        java.lang.Object objWithContext = updateFavoriteTokensInGroupsUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateFavoriteTokensInGroupsUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 updateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, this, list2, list3, list, favoriteAction);
            updateFavoriteTokensInGroupsUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, updateFavoriteTokensInGroupsUseCase$invoke$12);
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

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kCs */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8647invokeyxL6bBk$default(C27770kCs c27770kCs, FavoriteAction favoriteAction, java.util.List list, java.util.List list2, java.util.List list3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        java.util.List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return c27770kCs.EZpvd(favoriteAction, list, list4, list3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<HomeToken> list, java.util.List<java.lang.Integer> list2, Continuation<? super UpdateFavoriteTokensRequest> continuation) throws java.lang.Throwable {
        UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1 updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1;
        FavoriteAction favoriteAction;
        C27770kCs c27770kCs;
        java.util.List list3;
        FavoriteAction favoriteAction2;
        java.util.List list4;
        java.lang.String str;
        java.lang.String str2;
        if (continuation instanceof UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1) {
            updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1 = (UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1) continuation;
            int i = updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1 = new UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1(this, continuation);
            }
        }
        java.lang.Object obj = updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (HomeToken homeToken : list) {
                arrayList.add(new FavoriteTokenData(homeToken.AYXKKw(), homeToken.OLrzqt(), homeToken.values(), list2, (java.lang.String) null, 16, (DefaultConstructorMarker) null));
            }
            favoriteAction = FavoriteAction.AddToWatchList;
            kKG kkg = this.copydefault;
            updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$0 = this;
            updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$1 = arrayList;
            updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$2 = favoriteAction;
            updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.label = 1;
            java.lang.Object objAEQbTJ = kkg.AEQbTJ(updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c27770kCs = this;
            list3 = arrayList;
            obj = objAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str3 = (java.lang.String) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$3;
                str2 = (java.lang.String) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$2;
                FavoriteAction favoriteAction3 = (FavoriteAction) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$1;
                java.util.List list5 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$0;
                C56391yDq.AEQbTJ(obj);
                list4 = list5;
                str = str3;
                favoriteAction2 = favoriteAction3;
                return new UpdateFavoriteTokensRequest(favoriteAction2, str2, str, (java.lang.String) obj, list4, (java.util.List) null, 32, (DefaultConstructorMarker) null);
            }
            favoriteAction = (FavoriteAction) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$2;
            list3 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$1;
            c27770kCs = (C27770kCs) updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.String str4 = (java.lang.String) obj;
        java.lang.String strCopydefault = c27770kCs.copydefault.copydefault();
        kKG kkg2 = c27770kCs.copydefault;
        updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$0 = list3;
        updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$1 = favoriteAction;
        updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$2 = str4;
        updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.L$3 = strCopydefault;
        updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1.label = 2;
        java.lang.Object objCopydefault2 = kkg2.copydefault(updateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        favoriteAction2 = favoriteAction;
        list4 = list3;
        str = strCopydefault;
        str2 = str4;
        obj = objCopydefault2;
        return new UpdateFavoriteTokensRequest(favoriteAction2, str2, str, (java.lang.String) obj, list4, (java.util.List) null, 32, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<HomeToken> list, java.util.List<java.lang.Integer> list2, Continuation<? super UpdateFavoriteTokensRequest> continuation) throws java.lang.Throwable {
        UpdateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1 updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1;
        FavoriteAction favoriteAction;
        java.util.List<java.lang.Integer> list3;
        C27770kCs c27770kCs;
        java.util.List list4;
        FavoriteAction favoriteAction2;
        java.util.List<java.lang.Integer> list5;
        java.lang.String str;
        java.lang.String str2;
        java.util.List list6;
        if (continuation instanceof UpdateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1) {
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1 = (UpdateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1) continuation;
            int i = updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1 = new UpdateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1(this, continuation);
            }
        }
        java.lang.Object obj = updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (HomeToken homeToken : list) {
                arrayList.add(new FavoriteTokenData(homeToken.AYXKKw(), homeToken.OLrzqt(), homeToken.values(), (java.util.List) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null));
            }
            favoriteAction = FavoriteAction.RemoveFromWatchList;
            kKG kkg = this.copydefault;
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$0 = this;
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$1 = list2;
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$2 = arrayList;
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$3 = favoriteAction;
            updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.label = 1;
            java.lang.Object objAEQbTJ = kkg.AEQbTJ(updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            list3 = list2;
            c27770kCs = this;
            list4 = arrayList;
            obj = objAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str3 = (java.lang.String) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$4;
                str2 = (java.lang.String) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$3;
                FavoriteAction favoriteAction3 = (FavoriteAction) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$2;
                java.util.List list7 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$1;
                java.util.List<java.lang.Integer> list8 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$0;
                C56391yDq.AEQbTJ(obj);
                list5 = list8;
                list6 = list7;
                str = str3;
                favoriteAction2 = favoriteAction3;
                return new UpdateFavoriteTokensRequest(favoriteAction2, str2, str, (java.lang.String) obj, list6, list5);
            }
            favoriteAction = (FavoriteAction) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$3;
            list4 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$2;
            list3 = (java.util.List) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$1;
            c27770kCs = (C27770kCs) updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.String str4 = (java.lang.String) obj;
        java.lang.String strCopydefault = c27770kCs.copydefault.copydefault();
        kKG kkg2 = c27770kCs.copydefault;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$0 = list3;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$1 = list4;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$2 = favoriteAction;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$3 = str4;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.L$4 = strCopydefault;
        updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1.label = 2;
        java.lang.Object objCopydefault2 = kkg2.copydefault(updateFavoriteTokensInGroupsUseCase$mapToRemoveFromFavoriteRequest$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        favoriteAction2 = favoriteAction;
        list5 = list3;
        str = strCopydefault;
        str2 = str4;
        obj = objCopydefault2;
        list6 = list4;
        return new UpdateFavoriteTokensRequest(favoriteAction2, str2, str, (java.lang.String) obj, list6, list5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kCs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC28415kaO mapResponseToResult$default(C27770kCs c27770kCs, FavoriteAction favoriteAction, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        return c27770kCs.AEQbTJ(favoriteAction, i, (java.util.List<CommonGroupData>) list);
    }

    public final InterfaceC28415kaO AEQbTJ(FavoriteAction favoriteAction, int i, java.util.List<CommonGroupData> list) {
        if (i != 0) {
            if (i == 10069) {
                return InterfaceC28415kaO.Application.OLrzqt;
            }
            return InterfaceC28415kaO.TaskDescription.AEQbTJ;
        }
        if (favoriteAction == FavoriteAction.AddToWatchList) {
            return list != null ? new InterfaceC28415kaO.ActionBar(list) : InterfaceC28415kaO.TaskDescription.AEQbTJ;
        }
        return InterfaceC28415kaO.LoaderManager.OLrzqt;
    }
}
