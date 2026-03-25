package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.FundingRate;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C52894wbI;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageListSorter {
    public List<FundingRateArbCoin> KWHzl = yDY.AhwBna();

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortingCriterion.values().length];
            try {
                iArr[SortingCriterion.NextApy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortingCriterion.FilteredApy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[OKSortTextView.SortType.values().length];
            try {
                iArr2[OKSortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OKSortTextView.SortType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull List<FundingRateArbCoin> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SortingCriterion {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SortingCriterion[] $VALUES;
        public static final SortingCriterion NextApy = new SortingCriterion("NextApy", 0);
        public static final SortingCriterion FilteredApy = new SortingCriterion("FilteredApy", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SortingCriterion[] $values() {
            return new SortingCriterion[]{NextApy, FilteredApy};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SortingCriterion> getEntries() {
            return $ENTRIES;
        }

        private SortingCriterion(String str, int i) {
        }

        static {
            SortingCriterion[] sortingCriterionArr$values = $values();
            $VALUES = sortingCriterionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sortingCriterionArr$values);
        }

        public static SortingCriterion valueOf(String str) {
            return (SortingCriterion) Enum.valueOf(SortingCriterion.class, str);
        }

        public static SortingCriterion[] values() {
            return (SortingCriterion[]) $VALUES.clone();
        }
    }

    public final List<C52894wbI> EZpvd(@NotNull String str, @NotNull OKSortTextView.SortType sortType, @NotNull String str2, @NotNull SortingCriterion sortingCriterion) {
        List listEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sortingCriterion, "");
        List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.KWHzl);
        int i = ActionBar.AEQbTJ[sortType.ordinal()];
        if (i == 1) {
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listAxsJAYsNCnLh, new Activity(sortingCriterion, str2));
        } else if (i == 2) {
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listAxsJAYsNCnLh, new Application(sortingCriterion, str2));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listEZpvd = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.KWHzl);
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        Iterator it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((FundingRateArbCoin) it.next(), str, str2));
        }
        return arrayList;
    }

    public static final class Activity<T> implements Comparator {
        public final /* synthetic */ SortingCriterion EZpvd;
        public final /* synthetic */ String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(SortingCriterion sortingCriterion, String str) {
            this.EZpvd = sortingCriterion;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [103=4] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            double dAEQbTJ;
            double dAEQbTJ2;
            T next;
            FundingRateArbCoin fundingRateArbCoin = (FundingRateArbCoin) t;
            int i = ActionBar.OLrzqt[this.EZpvd.ordinal()];
            FundingRate fundingRate = null;
            if (i == 1) {
                dAEQbTJ = C33129mqd.AEQbTJ(fundingRateArbCoin.getApy());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it = fundingRateArbCoin.getHistoricalRates().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((FundingRate) next).getPeriod(), (Object) this.OLrzqt)) {
                        break;
                    }
                }
                FundingRate fundingRateCopydefault = next;
                if (fundingRateCopydefault == null) {
                    fundingRateCopydefault = FundingRate.Companion.copydefault();
                }
                dAEQbTJ = C33129mqd.AEQbTJ(fundingRateCopydefault.getApy());
            }
            FundingRateArbCoin fundingRateArbCoin2 = (FundingRateArbCoin) t2;
            int i2 = ActionBar.OLrzqt[this.EZpvd.ordinal()];
            if (i2 == 1) {
                dAEQbTJ2 = C33129mqd.AEQbTJ(fundingRateArbCoin2.getApy());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it2 = fundingRateArbCoin2.getHistoricalRates().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((FundingRate) next2).getPeriod(), (Object) this.OLrzqt)) {
                        fundingRate = next2;
                        break;
                    }
                }
                FundingRate fundingRateCopydefault2 = fundingRate;
                if (fundingRateCopydefault2 == null) {
                    fundingRateCopydefault2 = FundingRate.Companion.copydefault();
                }
                dAEQbTJ2 = C33129mqd.AEQbTJ(fundingRateCopydefault2.getApy());
            }
            return yET.KWHzl(Double.valueOf(dAEQbTJ), Double.valueOf(dAEQbTJ2));
        }
    }

    public final C52894wbI KWHzl(@NotNull FundingRateArbCoin fundingRateArbCoin, @NotNull String str, @NotNull String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(fundingRateArbCoin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String ccy = fundingRateArbCoin.getCcy();
        String str3 = ccy == null ? "" : ccy;
        String apy = fundingRateArbCoin.getApy();
        String str4 = apy == null ? "" : apy;
        String fundingRate = fundingRateArbCoin.getFundingRate();
        FundingRate fundingRate2 = new FundingRate(str4, fundingRate == null ? "" : fundingRate, "", (String) null, 8, (DefaultConstructorMarker) null);
        Iterator<T> it = fundingRateArbCoin.getHistoricalRates().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((FundingRate) next).getPeriod(), (Object) str2)) {
                break;
            }
        }
        FundingRate fundingRate3 = (FundingRate) next;
        FundingRate fundingRateCopydefault = fundingRate3 == null ? FundingRate.Companion.copydefault() : fundingRate3;
        String instId = fundingRateArbCoin.getInstId();
        return new C52894wbI(str3, instId == null ? "" : instId, fundingRateCopydefault, fundingRate2, StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) str, false, 2, (Object) null), C33129mqd.valueOf(fundingRateArbCoin.getNextFundingTime()));
    }

    public static final class Application<T> implements Comparator {
        public final /* synthetic */ SortingCriterion KWHzl;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(SortingCriterion sortingCriterion, String str) {
            this.KWHzl = sortingCriterion;
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [122=4] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            double dAEQbTJ;
            double dAEQbTJ2;
            T next;
            FundingRateArbCoin fundingRateArbCoin = (FundingRateArbCoin) t2;
            int i = ActionBar.OLrzqt[this.KWHzl.ordinal()];
            FundingRate fundingRate = null;
            if (i == 1) {
                dAEQbTJ = C33129mqd.AEQbTJ(fundingRateArbCoin.getApy());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it = fundingRateArbCoin.getHistoricalRates().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((FundingRate) next).getPeriod(), (Object) this.copydefault)) {
                        break;
                    }
                }
                FundingRate fundingRateCopydefault = next;
                if (fundingRateCopydefault == null) {
                    fundingRateCopydefault = FundingRate.Companion.copydefault();
                }
                dAEQbTJ = C33129mqd.AEQbTJ(fundingRateCopydefault.getApy());
            }
            FundingRateArbCoin fundingRateArbCoin2 = (FundingRateArbCoin) t;
            int i2 = ActionBar.OLrzqt[this.KWHzl.ordinal()];
            if (i2 == 1) {
                dAEQbTJ2 = C33129mqd.AEQbTJ(fundingRateArbCoin2.getApy());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it2 = fundingRateArbCoin2.getHistoricalRates().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((FundingRate) next2).getPeriod(), (Object) this.copydefault)) {
                        fundingRate = next2;
                        break;
                    }
                }
                FundingRate fundingRateCopydefault2 = fundingRate;
                if (fundingRateCopydefault2 == null) {
                    fundingRateCopydefault2 = FundingRate.Companion.copydefault();
                }
                dAEQbTJ2 = C33129mqd.AEQbTJ(fundingRateCopydefault2.getApy());
            }
            return yET.KWHzl(Double.valueOf(dAEQbTJ), Double.valueOf(dAEQbTJ2));
        }
    }
}
