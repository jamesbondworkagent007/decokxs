package o;

import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.InterfaceC9759bbe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22416heu {

    /* JADX INFO: renamed from: o.heu$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKComplianceRestrictionService.Feature.values().length];
            try {
                iArr[OKComplianceRestrictionService.Feature.DEX_MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKComplianceRestrictionService.Feature.DEX_TRADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DexFeature.values().length];
            try {
                iArr2[DexFeature.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[DexFeature.TRADE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    public static final boolean AkhnZx() {
        return ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.WEB3DEX);
    }

    public static final boolean EZpvd(@NotNull DexFeature dexFeature) {
        Intrinsics.checkNotNullParameter(dexFeature, "");
        return ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(AEQbTJ(dexFeature));
    }

    public static final boolean OLrzqt() {
        return ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.WEB3DEX);
    }

    public static final boolean OLrzqt(@NotNull DexFeature dexFeature) {
        Intrinsics.checkNotNullParameter(dexFeature, "");
        return ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(AEQbTJ(dexFeature));
    }

    public static final boolean copydefault(@NotNull DexFeature dexFeature) {
        Intrinsics.checkNotNullParameter(dexFeature, "");
        return EZpvd(dexFeature) || OLrzqt(dexFeature);
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<java.lang.String> setCopydefault = gKZ.EZpvd.copydefault();
        if (!(setCopydefault instanceof java.util.Collection) || !setCopydefault.isEmpty()) {
            java.util.Iterator<T> it = setCopydefault.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                    return EZpvd(DexFeature.MARKET);
                }
            }
        }
        java.util.Set<java.lang.String> setAEQbTJ = gKZ.EZpvd.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it2 = setAEQbTJ.iterator();
            while (it2.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) it2.next(), true)) {
                    return EZpvd(DexFeature.TRADE);
                }
            }
        }
        return AkhnZx();
    }

    public static final boolean uzCIH() {
        return ejfBZ() || C35202nqq.OLrzqt.AEQbTJ("dex_meme_model_business");
    }

    public static final boolean gEmmrt() {
        if (ejfBZ() || C35202nqq.OLrzqt.AEQbTJ("dex_cefi_model_business")) {
            return true;
        }
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.ADVANCED_MODE);
    }

    public static final boolean fetchVPNInfo() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.COPY_TRADING);
    }

    public static final boolean iwGUEr() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_meme_quick_model_business");
    }

    public static final boolean valueOf() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_advanced_disable_half_kline");
    }

    public static final boolean hDKMBd() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_meme_address_filter");
    }

    public static final boolean DbNXlk() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_cefi_rapid_process");
    }

    public static final boolean wlaJM() {
        return C35202nqq.OLrzqt.AEQbTJ("dex_trade_swap_best_tag_enabled");
    }

    public static final boolean fJNWhG() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_DISABLE_BASE64);
    }

    public static final boolean isConnected() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_TRADE_SUPPORT_DAG_ROUTER);
    }

    public static final boolean values() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_TRADE_QUICK_MODE_PRE_LOAD);
    }

    public static final boolean AhwBna() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_TRADE_SUPPORT_BATCH_BROADCAST);
    }

    public static final boolean zsXlph() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.djBIcL();
    }

    public static final boolean AYXKKw() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_TRADE_BRIDGE_APPROVE_DATA);
    }

    public static final boolean djBIcL() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.DEX_TRADE_BRIDGE_PLATFORM_CHECK);
    }

    public static final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zOLrzqt = OLrzqt(DexFeature.TRADE);
        if (zOLrzqt) {
            dexDialogLimitedBuilder$default(context, null, null, 6, null);
        }
        return zOLrzqt;
    }

    public static final boolean copydefault(@NotNull android.content.Context context, @NotNull DexFeature dexFeature) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dexFeature, "");
        boolean zOLrzqt = OLrzqt(dexFeature);
        if (zOLrzqt) {
            dexDialogLimitedBuilder$default(context, AEQbTJ(dexFeature), null, 4, null);
        }
        return zOLrzqt;
    }

    public static final boolean EZpvd(@NotNull android.content.Context context, @NotNull DexFeature dexFeature) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dexFeature, "");
        boolean zCopydefault = copydefault(dexFeature);
        if (zCopydefault) {
            OLrzqt(context, AEQbTJ(dexFeature), new Function0() { // from class: o.hex
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C22416heu.AEQbTJ();
                }
            });
        }
        return zCopydefault;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void dexDialogLimitedBuilder$default(final android.content.Context context, OKComplianceRestrictionService.Feature feature, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            feature = OKComplianceRestrictionService.Feature.WEB3DEX;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.het
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C22416heu.EZpvd(context);
                }
            };
        }
        OLrzqt(context, feature, function0);
    }

    public static final Unit EZpvd(android.content.Context context) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl != null && (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null) {
            interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.gEmmrt), C56424yEw.KWHzl(), new Function0() { // from class: o.hev
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C22416heu.EZpvd();
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ivd.showLimitedFeatureDialog$default(o.ivd, android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):o.xaY */
    public static final void OLrzqt(android.content.Context context, OKComplianceRestrictionService.Feature feature, Function0<Unit> function0) {
        int[] iArr = TaskDescription.AEQbTJ;
        int i = iArr[feature.ordinal()];
        int i2 = i != 1 ? i != 2 ? C23274hvD.Fragment.prepare : C23274hvD.Fragment.prepareFromSearch : C23274hvD.Fragment.prepareFromMediaId;
        int i3 = iArr[feature.ordinal()];
        C25380ivd.showLimitedFeatureDialog$default(C25380ivd.KWHzl, context, C33070mpX.AYXKKw(i2), C33070mpX.AYXKKw(i3 != 1 ? i3 != 2 ? C23274hvD.Fragment.next : C23274hvD.Fragment.isTransportControlEnabled : C23274hvD.Fragment.play), context.getString(C23274hvD.Fragment.getCREATORannotations), false, function0, 16, null);
    }

    public static final OKComplianceRestrictionService.Feature AEQbTJ(DexFeature dexFeature) {
        int i = TaskDescription.KWHzl[dexFeature.ordinal()];
        if (i == 1) {
            return OKComplianceRestrictionService.Feature.DEX_MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OKComplianceRestrictionService.Feature.DEX_TRADING;
    }

    public static final boolean zLjUOn() {
        return ((InterfaceC25414iwK) C43251rlk.copydefault(InterfaceC25414iwK.class)).valueOf();
    }

    public static final boolean fIwbmz() {
        return ((InterfaceC25414iwK) C43251rlk.copydefault(InterfaceC25414iwK.class)).EZpvd(FeatureFlag.AUTO_CONFIRM_EOA_ENABLED);
    }

    public static final boolean fARcdN() {
        return fIwbmz() && Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.StateListAnimator.OLrzqt);
    }

    public static final boolean AubY() {
        return ((InterfaceC25414iwK) C43251rlk.copydefault(InterfaceC25414iwK.class)).EZpvd(FeatureFlag.AUTO_CONFIRM_SA_ENABLED);
    }

    public static final boolean getFieldNames() {
        return AubY() && Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.StateListAnimator.OLrzqt);
    }

    public static final boolean AuCTel() {
        return ((InterfaceC25414iwK) C43251rlk.copydefault(InterfaceC25414iwK.class)).EZpvd(FeatureFlag.DEX_TRADE_SA_MARKET_ORDER_USE_EOA_ROUTE);
    }

    public static final boolean getNewProxyInstance() {
        return Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.Activity.EZpvd);
    }

    public static final boolean zuBGHE() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_TRADE_MODE_GUIDE)) && !SPUtils.getBoolean("isTradingModeSelectionGuideShown1", false, "dex_trading_local_config");
    }

    public static final boolean DTwDnp() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_WATCHLIST_GROUP_GUIDE)) && !Intrinsics.EZpvd((java.lang.Object) SPUtils.getString("key.show_guide", "false", "DexMarket"), (java.lang.Object) "true");
    }

    public static final boolean AwvSrB() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_MEMEFUN_SWIPE_GUIDE)) && !SPUtils.getBoolean("key.dex.has_shown_meme_pump_swipe_guide", false);
    }

    public static final boolean AxsJAY() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_SIGNAL_DISCLAIMER)) && !SPUtils.getBoolean("dex_hide_smart_money_disclaimer", false);
    }

    public static final boolean ejfBZ() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_DYNAMIC_UI);
    }

    public static final boolean sSMYrx() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        if (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_MEME_GUIDANCE)) {
            return SPUtils.getBoolean("key_dex_meme_function_introduce_new", true);
        }
        return false;
    }

    public static final boolean gHZMYf() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return (interfaceC25414iwK == null || !interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_COPY_TRADING_BUY_SETTINGS_GUIDE)) && !SPUtils.getBoolean("key_copy_trading_buy_settings_guide", false);
    }

    public static final boolean AuCTelauCTel() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.EZpvd(FeatureFlag.E2E_DEX_DISABLE_POPUPS_VIBES_DISCLAIMER);
    }

    public static final boolean ORxRYg() {
        if (AuCTelauCTel()) {
            return false;
        }
        return SPUtils.getBoolean("key_dex_vibes_disclaimer", true);
    }
}
