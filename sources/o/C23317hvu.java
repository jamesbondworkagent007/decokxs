package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.business.dexlogic.bean.ChainKeyBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23317hvu {
    public static final C23312hvp getNewProxyInstance = new C23312hvp("key_dex_swap_reverse_gas_tip", false, null);
    public static final C23312hvp uzCIH = new C23312hvp("key_dex_swap_reserve_gas_not_enough_tip", false, null);
    public static final C23312hvp AYXKKw = new C23312hvp("key_dex_swap_cancel_collect_custom_token", false, null);
    public static final C23312hvp ejfBZ = new C23312hvp("key_dex_swap_limit_order_guide", false, null);
    public static final C23312hvp fARcdN = new C23312hvp("key_dex_limit_guide", false, null);
    public static final C23312hvp djBIcL = new C23312hvp("key_dex_chain_sle_guide", false, null);
    public static final C23318hvv values = new C23318hvv("key_dex_tab", 2, "file_dex_tab");
    public static final C23312hvp valueOf = new C23312hvp("key_dex_market_change_language", false, "file_dex_market");
    public static final C23312hvp fetchVPNInfo = new C23312hvp("key_dex_gas_station_list_tab", true, "file_dex_gas_station_list");
    public static final C23312hvp AkhnZx = new C23312hvp("key_dex_cross_swap_confirm_tab", false, "file_dex_swap");
    public static final C23321hvy zLjUOn = new C23321hvy("key_dex_coin_select_chainid", "", "file_dex_swap");
    public static final C23321hvy AubY = new C23321hvy("key_dex_coin_select_to_chainid", "", "file_dex_swap");
    public static final C23321hvy DbNXlk = new C23321hvy("key_swap_tab", "swap", "file_dex_swap_tab");
    public static final C23312hvp zsXlph = new C23312hvp("key_dex_swap_mev_init_tag", false, "file_dex_swap");
    public static final C23312hvp AuCTel = new C23312hvp("key_dex_limit_submit_order_tip", true, null);
    public static final C23312hvp copydefault = new C23312hvp("key_dex_aa_wallet_first_swap", true, null);
    public static final C23321hvy getFieldNames = new C23321hvy("key_dex_meme_slippage_value", "", null);
    public static final C23321hvy iwGUEr = new C23321hvy("key_dex_meme_priority_fee_value", "", null);
    public static final C23318hvv hDKMBd = new C23318hvv("key_dex_meme_priority_fee_tag", PriorityFeeType.PriorityMarket.getValue(), null);
    public static final C23312hvp AhwBna = new C23312hvp("key_dex_cefi_show_kline", true, null);
    public static final C23312hvp OLrzqt = new C23312hvp("key.advancedAboutLimitSheet", false, null);
    public static final C23321hvy KWHzl = new C23321hvy("key_dex_cefi_position_chain_id", "", null);
    public static final C23321hvy AEQbTJ = new C23321hvy("key_dex_cefi_position_chain_logo", "", null);
    public static final C23312hvp isConnected = new C23312hvp("key_dex_legal_disclaimer", false, null);
    public static final C23312hvp fJNWhG = new C23312hvp("key_dex_meme_preset_buy_old_tag", true, null);
    public static final C23312hvp fIwbmz = new C23312hvp("key_dex_meme_preset_sell_old_tag", true, null);
    public static final C23312hvp EZpvd = new C23312hvp("key_dex_rate_lock_tag", true, null);
    public static final C23312hvp gEmmrt = new C23312hvp("key_copy_trading_buy_settings_guide", false, null);

    /* JADX INFO: renamed from: o.hvu$ActionBar */
    public static final class ActionBar extends TypeToken<DexMultiTokenInfoBean> {
    }

    /* JADX INFO: renamed from: o.hvu$Activity */
    public static final class Activity extends TypeToken<ChainKeyBean> {
    }

    /* JADX INFO: renamed from: o.hvu$Application */
    public static final class Application extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX INFO: renamed from: o.hvu$Dialog */
    public static final class Dialog extends TypeToken<DexMultiTokenInfoBean> {
    }

    /* JADX INFO: renamed from: o.hvu$FragmentManager */
    public static final class FragmentManager extends TypeToken<DexMultiTokenInfoBean> {
    }

    /* JADX INFO: renamed from: o.hvu$PendingIntent */
    public static final class PendingIntent extends TypeToken<DexMultiTokenInfoBean> {
    }

    /* JADX INFO: renamed from: o.hvu$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX INFO: renamed from: o.hvu$TaskDescription */
    public static final class TaskDescription extends TypeToken<DexMultiTokenInfoBean> {
    }

    public static /* synthetic */ C23312hvp spBoolean$default(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return new C23312hvp(str, z, str2);
    }

    public static /* synthetic */ C23321hvy spString$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return new C23321hvy(str, str2, str3);
    }

    public static /* synthetic */ C23318hvv spInt$default(java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return new C23318hvv(str, i, str2);
    }

    public static final void AkhnZx(boolean z) {
        getNewProxyInstance.OLrzqt(z);
    }

    public static final boolean values() {
        return getNewProxyInstance.EZpvd();
    }

    public static final void gEmmrt(boolean z) {
        uzCIH.OLrzqt(z);
    }

    public static final boolean isConnected() {
        return uzCIH.EZpvd();
    }

    public static final java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(str, "", "file_dex_swap_address_book");
        Intrinsics.copydefault((java.lang.Object) string);
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string) ? new java.util.ArrayList() : StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
    }

    public static final void AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str, CollectionsKt___CollectionsKt.joinToString$default(C56402yEa.EZpvd(str2), ",", null, null, 0, null, null, 62, null), "file_dex_swap_address_book");
    }

    public static final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        SPUtils.put("key_dex_swap_cross_from_coin", C23316hvt.OLrzqt(dexMultiTokenInfoBean), "file_dex_swap_cross_from_to_coin");
    }

    public static final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        SPUtils.put("key_dex_swap_cross_to_coin", C23316hvt.OLrzqt(dexMultiTokenInfoBean), "file_dex_swap_cross_from_to_coin");
    }

    public static final DexMultiTokenInfoBean EZpvd() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_dex_swap_cross_from_coin", "", "file_dex_swap_cross_from_to_coin");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new TaskDescription().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        return (DexMultiTokenInfoBean) objM7377constructorimpl;
    }

    public static final DexMultiTokenInfoBean AuCTel() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_dex_swap_cross_to_coin", "", "file_dex_swap_cross_from_to_coin");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new FragmentManager().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        return (DexMultiTokenInfoBean) objM7377constructorimpl;
    }

    public static final void djBIcL(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        synchronized (C23317hvu.class) {
            if (dexMultiTokenInfoBean == null) {
                return;
            }
            SPUtils.put("key_dex_swap_single_from_coin", C23316hvt.OLrzqt(dexMultiTokenInfoBean), "file_dex_swap_single_from_to_coin");
        }
    }

    public static final void AhwBna(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        SPUtils.put("key_dex_swap_single_to_coin", C23316hvt.OLrzqt(dexMultiTokenInfoBean), "file_dex_swap_single_from_to_coin");
    }

    public static final DexMultiTokenInfoBean KWHzl() {
        java.lang.Object objM7377constructorimpl;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        synchronized (C23317hvu.class) {
            java.lang.String string = SPUtils.getString("key_dex_swap_single_from_coin", "", "file_dex_swap_single_from_to_coin");
            if (string == null) {
                objM7377constructorimpl = null;
                dexMultiTokenInfoBean = (DexMultiTokenInfoBean) objM7377constructorimpl;
            } else {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new ActionBar().getType()));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) objM7377constructorimpl;
                } else {
                    pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                    objM7377constructorimpl = null;
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) objM7377constructorimpl;
                }
            }
        }
        return dexMultiTokenInfoBean;
    }

    public static final DexMultiTokenInfoBean fIwbmz() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_dex_swap_single_to_coin", "", "file_dex_swap_single_from_to_coin");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new PendingIntent().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        return (DexMultiTokenInfoBean) objM7377constructorimpl;
    }

    public static final void fARcdN() {
        SPUtils.clear("file_dex_swap_cross_from_to_coin");
    }

    public static final void ejfBZ() {
        SPUtils.clear("file_dex_swap_single_from_to_coin");
    }

    public static final boolean AhwBna() {
        return ejfBZ.EZpvd();
    }

    public static final void djBIcL(boolean z) {
        fARcdN.OLrzqt(z);
    }

    public static final boolean AYXKKw() {
        return fARcdN.EZpvd();
    }

    public static final void OLrzqt(boolean z) {
        valueOf.OLrzqt(z);
    }

    public static final void AYXKKw(boolean z) {
        AkhnZx.OLrzqt(z);
    }

    public static final boolean copydefault() {
        return AkhnZx.EZpvd();
    }

    public static final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        zLjUOn.OLrzqt(str);
    }

    public static final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AubY.OLrzqt(str);
    }

    public static final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DbNXlk.OLrzqt(str);
    }

    public static final java.lang.String OLrzqt() {
        return DbNXlk.KWHzl();
    }

    public static final void copydefault(int i, boolean z) {
        SPUtils.put("key_dex_btc_cross_hint_tag" + i, java.lang.Boolean.valueOf(z), "file_dex_swap");
    }

    public static final boolean AEQbTJ(int i) {
        return SPUtils.getBoolean("key_dex_btc_cross_hint_tag" + i, false, "file_dex_swap");
    }

    public static final void isConnected(boolean z) {
        zsXlph.OLrzqt(z);
    }

    public static final boolean fJNWhG() {
        return zsXlph.EZpvd();
    }

    public static final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        djBIcL(dexMultiTokenInfoBean);
    }

    public static final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        AhwBna(dexMultiTokenInfoBean);
    }

    public static final DexMultiTokenInfoBean djBIcL() {
        return KWHzl();
    }

    public static final DexMultiTokenInfoBean gEmmrt() {
        return fIwbmz();
    }

    public static final void OLrzqt(ChainKeyBean chainKeyBean) {
        if (chainKeyBean == null) {
            return;
        }
        SPUtils.put("key_dex_chain_sle_sort", C23316hvt.OLrzqt(chainKeyBean), "file_dex_swap_chain_sle_sort");
    }

    public static final ChainKeyBean fetchVPNInfo() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_dex_chain_sle_sort", "", "file_dex_swap_chain_sle_sort");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new Activity().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        return (ChainKeyBean) objM7377constructorimpl;
    }

    public static final void EZpvd(int i, boolean z) {
        SPUtils.put("key_dex_wormhole_daily_limit" + i, java.lang.Boolean.valueOf(z), "file_dex_swap");
    }

    public static final boolean EZpvd(int i) {
        return SPUtils.getBoolean("key_dex_wormhole_daily_limit" + i, false, "file_dex_swap");
    }

    public static final void gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(KWHzl(str2), str);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(KWHzl(str), "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String KWHzl(java.lang.String str) {
        return "key_meme_buy_transaction_custom_amount" + str;
    }

    public static final void OLrzqt(boolean z, boolean z2) {
        SPUtils.put("key_third_party_provider_risk_warning_acknowledgement" + (z ? "" : "_bridge"), java.lang.Boolean.valueOf(z2));
    }

    public static final boolean AEQbTJ(boolean z) {
        return SPUtils.getBoolean("key_third_party_provider_risk_warning_acknowledgement" + (z ? "" : "_bridge"), false);
    }

    public static final void copydefault(int i) {
        SPUtils.put("key_dex_swap_simple_tab_position", java.lang.Integer.valueOf(i));
    }

    public static final int DbNXlk() {
        java.lang.Integer num = SPUtils.getInt("key_dex_swap_simple_tab_position", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public static final void valueOf(boolean z) {
        SPUtils.put("key_dex_meme_function_introduce_new", java.lang.Boolean.valueOf(z));
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "key_dex_meme_preset_type" + str + str2;
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2.length() == 0) {
            return;
        }
        SPUtils.put(copydefault(str2, str3), str, "file_dex_meme_preset_type");
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return "1";
        }
        java.lang.String string = SPUtils.getString(copydefault(str, str2), "", "file_dex_meme_preset_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        synchronized (C23317hvu.class) {
            if (dexMultiTokenInfoBean != null) {
                SPUtils.put("key_dex_swap_meme_coin", C23316hvt.OLrzqt(dexMultiTokenInfoBean), "file_dex_swap_meme_coin");
            }
        }
    }

    public static final DexMultiTokenInfoBean AkhnZx() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_dex_swap_meme_coin", "", "file_dex_swap_meme_coin");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new Dialog().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        return (DexMultiTokenInfoBean) objM7377constructorimpl;
    }

    public static final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put("key_dex_meme_preset_sell_amount_level" + str, C23316hvt.KWHzl().toJson(list), "file_dex_meme_preset_sell_amount_level");
    }

    public static final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return (java.util.List) C23316hvt.KWHzl().fromJson(SPUtils.getString("key_dex_meme_preset_sell_amount_level" + str, "", "file_dex_meme_preset_sell_amount_level"), new StateListAnimator().getType());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put(EZpvd(str, str2), C23316hvt.KWHzl().toJson(list), "file_dex_meme_preset_buy_amount_level");
    }

    public static final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return (java.util.List) C23316hvt.KWHzl().fromJson(SPUtils.getString(EZpvd(str, str2), "", "file_dex_meme_preset_buy_amount_level"), new Application().getType());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(EZpvd(str, str2), java.lang.Integer.valueOf(i), "file_dex_meme_buy_amount_level");
    }

    public static final int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Integer num = SPUtils.getInt(EZpvd(str, str2), 0, "file_dex_meme_buy_amount_level");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return "key_dex_meme_preset_buy_amount_level" + str + str2;
    }

    public static final void fetchVPNInfo(boolean z) {
        AhwBna.OLrzqt(z);
    }

    public static final boolean getNewProxyInstance() {
        return AhwBna.EZpvd();
    }

    public static final void copydefault(boolean z) {
        OLrzqt.OLrzqt(z);
    }

    public static final boolean getFieldNames() {
        return OLrzqt.EZpvd();
    }

    public static final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl.OLrzqt(str);
    }

    public static final void AhwBna(boolean z) {
        isConnected.OLrzqt(z);
    }

    public static final boolean valueOf() {
        return isConnected.EZpvd();
    }

    public static final void KWHzl(boolean z) {
        EZpvd.OLrzqt(z);
    }

    public static final boolean AEQbTJ() {
        return EZpvd.EZpvd();
    }

    public static final void EZpvd(boolean z) {
        gEmmrt.OLrzqt(z);
    }
}
