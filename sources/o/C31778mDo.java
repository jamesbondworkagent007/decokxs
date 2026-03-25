package o;

import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.crcore.shared.formatter.AssetDisplayType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31777mDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31778mDo {
    public static final int AEQbTJ;
    public static final C31783mDt EZpvd;
    public static final C31778mDo KWHzl = new C31778mDo();

    private C31778mDo() {
    }

    static {
        AssetDisplayType assetDisplayType = AssetDisplayType.FIAT;
        AmountDisplayType amountDisplayType = AmountDisplayType.OVERVIEW;
        AbstractC31777mDn.ActionBar actionBar = AbstractC31777mDn.ActionBar.OLrzqt;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(amountDisplayType, actionBar);
        AmountDisplayType amountDisplayType2 = AmountDisplayType.INPUT;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(amountDisplayType2, actionBar);
        AmountDisplayType amountDisplayType3 = AmountDisplayType.CASH;
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(amountDisplayType3, actionBar);
        AmountDisplayType amountDisplayType4 = AmountDisplayType.DETAIL;
        AbstractC31777mDn.StateListAnimator stateListAnimator = AbstractC31777mDn.StateListAnimator.KWHzl;
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(assetDisplayType, C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(amountDisplayType4, stateListAnimator)));
        AssetDisplayType assetDisplayType2 = AssetDisplayType.STABLECOIN_1_TO_1;
        AbstractC31777mDn.Activity activity = AbstractC31777mDn.Activity.OLrzqt;
        EZpvd = new C31783mDt(C56424yEw.gEmmrt(pairOLrzqt4, C56390yDp.OLrzqt(assetDisplayType2, C56424yEw.gEmmrt(C56390yDp.OLrzqt(amountDisplayType, activity), C56390yDp.OLrzqt(amountDisplayType2, actionBar), C56390yDp.OLrzqt(amountDisplayType3, actionBar), C56390yDp.OLrzqt(amountDisplayType4, stateListAnimator))), C56390yDp.OLrzqt(AssetDisplayType.STABLECOIN, C56424yEw.gEmmrt(C56390yDp.OLrzqt(amountDisplayType, activity), C56390yDp.OLrzqt(amountDisplayType2, actionBar), C56390yDp.OLrzqt(amountDisplayType3, activity), C56390yDp.OLrzqt(amountDisplayType4, stateListAnimator))), C56390yDp.OLrzqt(AssetDisplayType.CRYPTO, C56424yEw.gEmmrt(C56390yDp.OLrzqt(amountDisplayType, stateListAnimator), C56390yDp.OLrzqt(amountDisplayType2, stateListAnimator), C56390yDp.OLrzqt(amountDisplayType3, stateListAnimator), C56390yDp.OLrzqt(amountDisplayType4, stateListAnimator)))));
        AEQbTJ = 8;
    }

    public static /* synthetic */ java.lang.String formatAmount$default(C31778mDo c31778mDo, BigDecimal bigDecimal, AssetDisplayType assetDisplayType, AmountDisplayType amountDisplayType, boolean z, RoundingMode roundingMode, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 32) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return c31778mDo.KWHzl(bigDecimal, assetDisplayType, amountDisplayType, z2, roundingMode2, displaySign);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, @NotNull AssetDisplayType assetDisplayType, @NotNull AmountDisplayType amountDisplayType, boolean z, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(assetDisplayType, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return EZpvd.copydefault(assetDisplayType, amountDisplayType).KWHzl(bigDecimal, z, roundingMode, displaySign);
    }

    public final AbstractC31777mDn AEQbTJ(@NotNull AssetDisplayType assetDisplayType, @NotNull AmountDisplayType amountDisplayType) {
        Intrinsics.checkNotNullParameter(assetDisplayType, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        return EZpvd.copydefault(assetDisplayType, amountDisplayType);
    }

    public final AssetDisplayType copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase.length() == 0 ? AssetDisplayType.CRYPTO : list.contains(upperCase) ? AssetDisplayType.FIAT : list2.contains(upperCase) ? AssetDisplayType.STABLECOIN : AssetDisplayType.CRYPTO;
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return list.contains(upperCase);
    }

    public final int KWHzl(@NotNull BigDecimal bigDecimal, @NotNull AssetDisplayType assetDisplayType, @NotNull AmountDisplayType amountDisplayType) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(assetDisplayType, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        return AEQbTJ(assetDisplayType, amountDisplayType).KWHzl(bigDecimal);
    }
}
