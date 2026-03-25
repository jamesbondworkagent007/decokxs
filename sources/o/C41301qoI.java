package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41301qoI {
    public static final C41301qoI KWHzl = new C41301qoI();

    /* JADX INFO: renamed from: o.qoI$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortOrder.values().length];
            try {
                iArr[SortOrder.ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortOrder.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[SortBy.values().length];
            try {
                iArr2[SortBy.CHANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SortBy.NAME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SortBy.TURNOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SortBy.PRICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SortBy.VOLUME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[DexSortByEnum.values().length];
            try {
                iArr3[DexSortByEnum.CHANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[DexSortByEnum.TURNOVER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[DexSortByEnum.PRICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[DexSortByEnum.MARKET_CAP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            AEQbTJ = iArr3;
        }
    }

    private C41301qoI() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1858767985:
                if (!str.equals("price_descending_sort")) {
                }
                break;
            case -1339918127:
                if (!str.equals("name_descending_sort")) {
                }
                break;
            case -713692905:
                if (!str.equals("turnover_descending_sort")) {
                }
                break;
            case -379411751:
                if (!str.equals("name_ascending_sort")) {
                }
                break;
            case 56431059:
                if (!str.equals("turnover_ascending_sort")) {
                }
                break;
            case 220531922:
                if (!str.equals("applies_descending_sort")) {
                }
                break;
            case 363662008:
                if (!str.equals("applies_ascending_sort")) {
                }
                break;
            case 1959155803:
                if (!str.equals("price_ascending_sort")) {
                }
                break;
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1858767985:
                return !str.equals("price_descending_sort") ? "neutral" : "ascending";
            case -1339918127:
                if (!str.equals("name_descending_sort")) {
                }
                break;
            case -713692905:
                if (!str.equals("turnover_descending_sort")) {
                }
                break;
            case -379411751:
                if (str.equals("name_ascending_sort")) {
                    return "descending";
                }
                break;
            case 56431059:
                if (!str.equals("turnover_ascending_sort")) {
                }
                break;
            case 220531922:
                if (!str.equals("applies_descending_sort")) {
                }
                break;
            case 363662008:
                if (!str.equals("applies_ascending_sort")) {
                }
                break;
            case 1959155803:
                if (!str.equals("price_ascending_sort")) {
                }
                break;
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(pair, "");
        int i = Activity.copydefault[pair.getSecond().ordinal()];
        java.lang.String str2 = i != 1 ? i != 2 ? i != 3 ? "" : "neutral" : "descending" : "ascending";
        int i2 = Activity.EZpvd[pair.getFirst().ordinal()];
        if (i2 == 1) {
            str = "change";
        } else if (i2 == 2) {
            str = "Name";
        } else if (i2 == 3) {
            str = "Turnover";
        } else if (i2 == 4) {
            str = FirebaseAnalytics.Param.PRICE;
        } else if (i2 == 5) {
            str = "volume";
        }
        return new kotlin.Pair<>(str, str2);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(pair, "");
        int i = Activity.copydefault[pair.getSecond().ordinal()];
        if (i == 1) {
            str = "ascending";
        } else if (i == 2) {
            str = "descending";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "neutral";
        }
        int i2 = Activity.AEQbTJ[pair.getFirst().ordinal()];
        if (i2 == 1) {
            str2 = "change";
        } else if (i2 == 2) {
            str2 = "Turnover";
        } else if (i2 == 3) {
            str2 = FirebaseAnalytics.Param.PRICE;
        } else if (i2 == 4) {
            str2 = "mcap";
        }
        return new kotlin.Pair<>(str2, str);
    }

    public final java.lang.String OLrzqt(@NotNull CategoryGroupVo categoryGroupVo) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        return Intrinsics.EZpvd(categoryGroupVo, taskDescription.KWHzl()) ? "all" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.gEmmrt()) ? OtpEventTracker.OTP_EVENT_VALUE_NEW : Intrinsics.EZpvd(categoryGroupVo, taskDescription.OLrzqt()) ? "hot" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.EZpvd()) ? "gainers" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.AEQbTJ()) ? "losers" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.djBIcL()) ? "turnover" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.copydefault()) ? "mcap" : Intrinsics.EZpvd(categoryGroupVo, taskDescription.AYXKKw()) ? "stocks" : Intrinsics.EZpvd((java.lang.Object) categoryGroupVo.gEmmrt().getId(), (java.lang.Object) "1") ? "top" : categoryGroupVo.gEmmrt().getName();
    }
}
