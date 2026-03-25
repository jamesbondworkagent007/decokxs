package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.DistributeItem;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50576vTn extends AbstractC50583vTu {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "HoardCoinOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50576vTn KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.ArrayList<SelectCoinData> arrayList, @NotNull AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(autoEarnStakingQueryConfig, "");
            C50576vTn c50576vTn = new C50576vTn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("hoard_coin_use_quote", z);
            bundle.putString("hoard_coin_title", str);
            bundle.putString("hoard_coin_balance_type", str2);
            bundle.putString("hoard_coin_amount", str3);
            bundle.putParcelableArrayList("hoard_coin_list_key", arrayList);
            bundle.putString("title", "HoardCoinOrderConfirmDFragment");
            bundle.putParcelable("auto_earn_stake_info", autoEarnStakingQueryConfig);
            c50576vTn.setArguments(bundle);
            return c50576vTn;
        }
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ("smart_portfolio");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("hoard_coin_title")) != null) {
            str = string;
        }
        djBIcL(str);
        AhwBna(getString(C55688xof.Application.FractionRes));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string3 = getString(C55688xof.Application.toInclusive);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        android.os.Bundle arguments = getArguments();
        arrayList.add(new TacticsInsideItemData(string3, (arguments == null || (string2 = arguments.getString("hoard_coin_balance_type")) == null) ? "" : string2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        android.os.Bundle arguments2 = getArguments();
        boolean z = arguments2 != null && arguments2.getBoolean("hoard_coin_use_quote");
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi215);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DimenRes);
        }
        java.lang.String str = strAYXKKw;
        android.os.Bundle arguments3 = getArguments();
        arrayList.add(new TacticsInsideItemData(str, (arguments3 == null || (string = arguments3.getString("hoard_coin_amount")) == null) ? "" : string, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        android.os.Bundle arguments4 = getArguments();
        AutoEarnStakingQueryConfig autoEarnStakingQueryConfig = arguments4 != null ? (AutoEarnStakingQueryConfig) arguments4.getParcelable("auto_earn_stake_info") : null;
        if (C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null))) {
            C54149wys.AEQbTJ.EZpvd(arrayList, autoEarnStakingQueryConfig);
        } else {
            if (C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null))) {
            }
        }
        arrayList.add(AEQbTJ());
        arrayList.add(new TacticsInsideLineItemData(C55298xhM.dp2px$default(16.0f, null, 1, null), 0, 0, 6, null));
        if (z) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi214);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.IdRes);
        }
        arrayList.add(new BotRemindData(strAYXKKw2, 0, 0, null, 14, null));
        return arrayList;
    }

    /* JADX DEBUG: Possible override for method o.vTu.AEQbTJ()V */
    public final SmartCoinsData AEQbTJ() {
        java.util.ArrayList<SelectCoinData> parcelableArrayList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("hoard_coin_list_key")) != null) {
            for (SelectCoinData selectCoinData : parcelableArrayList) {
                java.lang.String name = selectCoinData.getName();
                java.lang.String str = name == null ? "" : name;
                xMR xmr = xMR.copydefault;
                java.lang.String ratio = selectCoinData.getRatio();
                if (ratio == null) {
                    ratio = "";
                }
                arrayList.add(new DistributeItem(str, 0, xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) ratio), null, C38307pTy.Companion.copydefault(0), null, null, null, 58, null), selectCoinData.getIcon(), 0, 18, (DefaultConstructorMarker) null));
            }
        }
        java.lang.String string = getString(C55688xof.Application.setElevation);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new SmartCoinsData(string, arrayList, false, 0.0f, 12, null);
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        C56028xvA.OLrzqt("make_order", C56424yEw.KWHzl());
        FragmentKt.setFragmentResult(this, "HoardCoinOrderConfirmFragmentResultKey", BundleKt.bundleOf());
        dismiss();
    }
}
