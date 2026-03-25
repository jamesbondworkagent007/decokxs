package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesGroupViewModel;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46790tdn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40628qbY implements InterfaceC46790tdn {
    public boolean AEQbTJ;
    public C46796tdt AhwBna;
    public Function0<UserGroup> EZpvd;
    public java.lang.Object KWHzl;
    public MarketsFavoritesGroupViewModel OLrzqt;
    public boolean copydefault;
    public C46802tdz djBIcL;
    public C57869yqZ valueOf;
    public final java.lang.String AYXKKw = "DefaultMarketFavoritesDragDelegate";
    public long gEmmrt = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    private final void copydefault(boolean z) {
        if (z != this.AEQbTJ) {
            this.AEQbTJ = z;
            this.gEmmrt = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void AEQbTJ(@NotNull final C46796tdt c46796tdt, @NotNull final C59534zip c59534zip, @NotNull C33546myW c33546myW, @NotNull MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModel, @NotNull final Function0<? extends kotlin.Pair<? extends SortBy, ? extends SortOrder>> function0, @NotNull Function0<UserGroup> function02, @NotNull final yHO<? super android.view.View, ? super java.lang.Integer, ? super CoinQuote, Unit> yho, @NotNull final yHO<? super android.view.View, ? super java.lang.Integer, ? super InterfaceC41655qus, Unit> yho2) {
        Intrinsics.checkNotNullParameter(c46796tdt, "");
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(c33546myW, "");
        Intrinsics.checkNotNullParameter(marketsFavoritesGroupViewModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        this.AhwBna = c46796tdt;
        this.valueOf = c33546myW;
        this.OLrzqt = marketsFavoritesGroupViewModel;
        this.EZpvd = function02;
        this.djBIcL = new C46802tdz(c46796tdt, c59534zip, this, false, new Function0() { // from class: o.qbX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C40628qbY.EZpvd(function0));
            }
        }, new Function2() { // from class: o.qcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40628qbY.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        }, new Function1() { // from class: o.qce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40628qbY.copydefault(this.OLrzqt, c59534zip, c46796tdt, yho, yho2, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final boolean EZpvd(Function0 function0) {
        kotlin.Pair pair = (kotlin.Pair) function0.invoke();
        return pair.getFirst() == SortBy.NONE || pair.getSecond() == SortOrder.NONE;
    }

    public static final Unit copydefault(C40628qbY c40628qbY, int i, int i2) {
        c40628qbY.copydefault = true;
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C40628qbY c40628qbY, C59534zip c59534zip, C46796tdt c46796tdt, yHO yho, yHO yho2, int i) {
        try {
            Result.Application application = Result.Companion;
            java.util.List<?> items = c59534zip.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            c40628qbY.KWHzl = CollectionsKt___CollectionsKt.AkhnZx(items, i);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c46796tdt.findViewHolderForAdapterPosition(i);
            Unit unit = null;
            android.view.View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
            if (view != null) {
                java.lang.Object obj = c40628qbY.KWHzl;
                if (obj instanceof CoinQuote) {
                    Intrinsics.copydefault(obj, "");
                    yho.invoke(view, java.lang.Integer.valueOf(i), (CoinQuote) obj);
                } else if (obj instanceof InterfaceC41655qus) {
                    Intrinsics.copydefault(obj, "");
                    yho2.invoke(view, java.lang.Integer.valueOf(i), (InterfaceC41655qus) obj);
                }
                unit = Unit.INSTANCE;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC46790tdn
    public void AEQbTJ(java.util.List<?> list, boolean z) {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String groupName;
        UserGroup userGroupInvoke;
        WatchListData watchListDataFJNWhG;
        InterfaceC46790tdn.StateListAnimator.AEQbTJ(this, list, z);
        C41298qoF c41298qoF = C41298qoF.AEQbTJ;
        c41298qoF.EZpvd(this.AYXKKw, "onUserActionEnd() hasDiff = " + z);
        if (z && this.copydefault) {
            c41298qoF.EZpvd(this.AYXKKw, "onUserActionEnd:hasDiff invoke ");
            try {
                Result.Application application = Result.Companion;
                unit = null;
                if (list != null) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if ((obj instanceof CoinQuote) || (obj instanceof qWK)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList) {
                        if (obj2 instanceof CoinQuote) {
                            watchListDataFJNWhG = qWJ.AEQbTJ((CoinQuote) obj2);
                        } else {
                            watchListDataFJNWhG = obj2 instanceof qWK ? ((qWK) obj2).fJNWhG() : null;
                        }
                        if (watchListDataFJNWhG != null) {
                            arrayList2.add(watchListDataFJNWhG);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                C41298qoF.AEQbTJ.EZpvd(this.AYXKKw, "transformVales:" + (arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null));
                Function0<UserGroup> function0 = this.EZpvd;
                groupName = (function0 == null || (userGroupInvoke = function0.invoke()) == null) ? null : userGroupInvoke.getGroupName();
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (groupName != null) {
                MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModel = this.OLrzqt;
                if (marketsFavoritesGroupViewModel != null) {
                    marketsFavoritesGroupViewModel.copydefault(arrayList2, groupName, new Function0() { // from class: o.qbZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C40628qbY.copydefault(this.copydefault);
                        }
                    });
                    unit = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    copydefault(false);
                }
                Result.m7376boximpl(objM7377constructorimpl);
            } else {
                copydefault(false);
                return;
            }
        } else {
            copydefault(false);
        }
        this.copydefault = false;
        C57869yqZ c57869yqZ = this.valueOf;
        if (c57869yqZ != null) {
            c57869yqZ.setEnabled(true);
        }
    }

    public static final Unit copydefault(C40628qbY c40628qbY) {
        c40628qbY.copydefault(false);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC46790tdn
    public void EZpvd(int i, java.lang.Object obj) {
        C41298qoF.AEQbTJ.EZpvd(this.AYXKKw, "onUserActionStart() called");
        copydefault(true);
        C57869yqZ c57869yqZ = this.valueOf;
        if (c57869yqZ != null) {
            c57869yqZ.setEnabled(false);
        }
        if (obj instanceof CoinQuote) {
            this.KWHzl = obj;
        }
    }
}
