package o;

import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55884xsP {
    public static /* synthetic */ boolean canShowEarnOrStakeProfit$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return copydefault(str, str2, z);
    }

    public static final boolean copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        return C33129mqd.AEQbTJ(str, "0") || ((z || !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "default")) && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "vip_dropout") && C33129mqd.OLrzqt((java.lang.CharSequence) str2));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
        if (C33129mqd.AEQbTJ(str, "0") || canShowEarnOrStakeProfit$default(str, str2, false, 4, null) || z) {
            return C56068xvo.copydefault.KWHzl(str3, str4, str, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : str5, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? true : true, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : str6, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
        }
        return C56390yDp.OLrzqt(null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) null)));
    }

    public static /* synthetic */ kotlin.Pair formatAutoStake$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            num = null;
        }
        return AEQbTJ(str, str2, str3, str4, str5, num);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvo.getPnlAndColorPair$default(o.xvo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.math.RoundingMode, java.lang.String, java.lang.Integer, int, java.lang.Object):kotlin.Pair */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (canShowEarnOrStakeProfit$default(str, str2, false, 4, null)) {
            return C56068xvo.copydefault.KWHzl(str3, str4, str, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : str5, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? true : true, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : str5, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : num);
        }
        return C56390yDp.OLrzqt(null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) null)));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, java.lang.Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (copydefault(str, str2, z2)) {
            return C56068xvo.copydefault.KWHzl(str3, str4, str, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : str5, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? true : true, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : z, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : str5, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : num);
        }
        return C56390yDp.OLrzqt(null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) null)));
    }

    public static final void AEQbTJ(@NotNull java.util.ArrayList<ItemData> arrayList, @NotNull BenefitDetails benefitDetails, @NotNull StrategyConfigInfo strategyConfigInfo) {
        java.lang.String vipLevel;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(benefitDetails, "");
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getAutoEarnProfit())) {
            if (!Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoEarnState(), (java.lang.Object) "default") && C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getAutoEarnState())) {
                arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getMediaUri), (java.lang.String) null, false, benefitDetails.getAutoEarnProfitColor(), (java.lang.String) null, (java.lang.String) null, false, true, (java.lang.String) null, false, true, "show_auto_earn_profit", (java.lang.String) null, false, C33129mqd.gEmmrt(benefitDetails.getAutoEarnProfit()), (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoEarnState(), (java.lang.Object) "vip_dropout") ? "" : "show_auto_earn_profit", (Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoEarnState(), (java.lang.Object) "vip_dropout") || (vipLevel = strategyConfigInfo.getVipLevel()) == null) ? "" : vipLevel, 4174710, (DefaultConstructorMarker) null));
                return;
            }
            java.lang.String autoEarnState = benefitDetails.getAutoEarnState();
            if ((autoEarnState == null || autoEarnState.length() == 0) && C33129mqd.KWHzl((java.util.Collection) strategyConfigInfo.getAutoEarn())) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getMediaUri);
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(benefitDetails.getAutoEarnProfit());
                int autoEarnProfitColor = benefitDetails.getAutoEarnProfitColor();
                java.lang.String vipLevel2 = strategyConfigInfo.getVipLevel();
                arrayList.add(new ItemData(strAYXKKw, (java.lang.String) null, false, autoEarnProfitColor, (java.lang.String) null, (java.lang.String) null, false, true, (java.lang.String) null, false, true, "show_auto_earn_profit", (java.lang.String) null, false, strGEmmrt, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, "show_auto_earn_profit", vipLevel2 == null ? "" : vipLevel2, 4174710, (DefaultConstructorMarker) null));
                return;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getAutoEarnProfit())) {
                arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getMediaUri), (java.lang.String) null, false, benefitDetails.getAutoEarnProfitColor(), (java.lang.String) null, (java.lang.String) null, false, true, (java.lang.String) null, false, true, "show_auto_simple_earn_profit", (java.lang.String) null, false, C33129mqd.gEmmrt(benefitDetails.getAutoEarnProfit()), (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, "", "", 4174710, (DefaultConstructorMarker) null));
            }
        }
    }

    public static final void copydefault(@NotNull java.util.ArrayList<ItemData> arrayList, @NotNull BenefitDetails benefitDetails, @NotNull StrategyConfigInfo strategyConfigInfo) {
        java.lang.String vipLevel;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(benefitDetails, "");
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        AEQbTJ(arrayList, benefitDetails, strategyConfigInfo);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getAutoStakeProfit()) && !Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoStakeState(), (java.lang.Object) "default") && C33129mqd.OLrzqt((java.lang.CharSequence) benefitDetails.getAutoStakeState())) {
            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getIconUri), (java.lang.String) null, false, benefitDetails.getAutoStakeProfitColor(), (java.lang.String) null, (java.lang.String) null, false, true, (java.lang.String) null, false, true, "show_auto_stake_profit", (java.lang.String) null, false, C33129mqd.gEmmrt(benefitDetails.getAutoStakeProfit()), (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoStakeState(), (java.lang.Object) "vip_dropout") ? "" : "show_auto_stake_profit", (Intrinsics.EZpvd((java.lang.Object) benefitDetails.getAutoStakeState(), (java.lang.Object) "vip_dropout") || (vipLevel = strategyConfigInfo.getVipLevel()) == null) ? "" : vipLevel, 4174710, (DefaultConstructorMarker) null));
        }
    }
}
