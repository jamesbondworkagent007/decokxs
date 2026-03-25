package com.okinc.business.dex.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C43246rlf;
import o.C43386roM;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CDNSourceManager {
    public static final CDNSourceManager EZpvd = new CDNSourceManager();

    public interface Activity {
        String getFileName();

        String getFileType();

        String getPath();

        boolean getSupportDarkMode();
    }

    private CDNSourceManager() {
    }

    public static /* synthetic */ String getFullCDNUrl$default(CDNSourceManager cDNSourceManager, Activity activity, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = C43246rlf.OLrzqt.valueOf();
        }
        return cDNSourceManager.OLrzqt(activity, context);
    }

    public final String OLrzqt(@NotNull Activity activity, @NotNull Context context) {
        Configuration configuration;
        String str = "";
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(context, "");
        String fileType = activity.getFileType();
        String path = activity.getPath();
        if (C33129mqd.OLrzqt((CharSequence) path)) {
            str = path + "/";
        }
        String str2 = fileType + "/web3_dex/" + str + activity.getFileName();
        if (!activity.getSupportDarkMode()) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str2;
        }
        String str3 = C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/";
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null);
            return str3 + listSplit$default.get(0) + "_dark." + listSplit$default.get(1);
        }
        return str3 + str2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LottieSource implements Activity {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LottieSource[] $VALUES;
        public static final LottieSource DEFI_PLATFORMS_LOADING;
        public static final LottieSource DEX_CEFI_LOADING;
        public static final LottieSource DEX_CEFI_SETTING_LOADING;
        public static final LottieSource DEX_LOADING_ORDER_DETAIL;
        public static final LottieSource DEX_MARKET_COIN_DETAIL_LOADING;
        public static final LottieSource DEX_MARKET_HOME_LOADING;
        public static final LottieSource DEX_MARKET_MEME_LOADING;
        public static final LottieSource DEX_MARKET_MODULE_LOADING;
        public static final LottieSource DEX_MARKET_TOKEN_LIST_LOADING;
        public static final LottieSource DEX_MEME_LOADING;
        public static final LottieSource DEX_ORDER_PENDING_LOADING;
        public static final LottieSource DEX_SWAP_LINE_LOADING;
        public static final LottieSource DEX_SWAP_LOADING;
        public static final LottieSource DEX_SWAP_NEW_LOADING;
        public static final LottieSource DEX_TRADE_SURPLUS_ORDER_SAVINGS;
        public static final LottieSource TradeCopyTradeGuide;
        private final String fileName;
        private final String fileType;
        private final String path;
        private final boolean supportDarkMode;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LottieSource[] $values() {
            return new LottieSource[]{TradeCopyTradeGuide, DEFI_PLATFORMS_LOADING, DEX_CEFI_LOADING, DEX_MEME_LOADING, DEX_SWAP_LINE_LOADING, DEX_SWAP_LOADING, DEX_SWAP_NEW_LOADING, DEX_CEFI_SETTING_LOADING, DEX_LOADING_ORDER_DETAIL, DEX_ORDER_PENDING_LOADING, DEX_MARKET_COIN_DETAIL_LOADING, DEX_MARKET_HOME_LOADING, DEX_MARKET_MEME_LOADING, DEX_MARKET_TOKEN_LIST_LOADING, DEX_MARKET_MODULE_LOADING, DEX_TRADE_SURPLUS_ORDER_SAVINGS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LottieSource> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getPath() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public boolean getSupportDarkMode() {
            return this.supportDarkMode;
        }

        private LottieSource(String str, int i, String str2, boolean z, String str3, String str4) {
            this.fileName = str2;
            this.supportDarkMode = z;
            this.fileType = str3;
            this.path = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("lottie") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.business.dex.utils.CDNSourceManager.LottieSource.<init>(java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ LottieSource(String str, int i, String str2, boolean z, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? "lottie" : str3, (i2 & 8) != 0 ? "" : str4);
        }

        static {
            String str = null;
            TradeCopyTradeGuide = new LottieSource("TradeCopyTradeGuide", 0, "dex_copy_trade_guide.lottie", false, null, str, 14, null);
            boolean z = false;
            String str2 = null;
            String str3 = null;
            int i = 14;
            DefaultConstructorMarker defaultConstructorMarker = null;
            DEFI_PLATFORMS_LOADING = new LottieSource("DEFI_PLATFORMS_LOADING", 1, "defi_platforms_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            boolean z2 = false;
            String str4 = null;
            int i2 = 14;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            DEX_CEFI_LOADING = new LottieSource("DEX_CEFI_LOADING", 2, "dex_cefi_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_MEME_LOADING = new LottieSource("DEX_MEME_LOADING", 3, "dex_meme_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_SWAP_LINE_LOADING = new LottieSource("DEX_SWAP_LINE_LOADING", 4, "dex_swap_line_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_SWAP_LOADING = new LottieSource("DEX_SWAP_LOADING", 5, "dex_swap_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_SWAP_NEW_LOADING = new LottieSource("DEX_SWAP_NEW_LOADING", 6, "dex_swap_new_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_CEFI_SETTING_LOADING = new LottieSource("DEX_CEFI_SETTING_LOADING", 7, "dex_cefi_setting_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_LOADING_ORDER_DETAIL = new LottieSource("DEX_LOADING_ORDER_DETAIL", 8, "dex_loading_order_detail.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_ORDER_PENDING_LOADING = new LottieSource("DEX_ORDER_PENDING_LOADING", 9, "dex_order_pending_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_MARKET_COIN_DETAIL_LOADING = new LottieSource("DEX_MARKET_COIN_DETAIL_LOADING", 10, "dex_market_coin_detail_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_MARKET_HOME_LOADING = new LottieSource("DEX_MARKET_HOME_LOADING", 11, "dex_market_home_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_MARKET_MEME_LOADING = new LottieSource("DEX_MARKET_MEME_LOADING", 12, "dex_market_meme_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_MARKET_TOKEN_LIST_LOADING = new LottieSource("DEX_MARKET_TOKEN_LIST_LOADING", 13, "dex_market_token_list_loading.lottie", z, str2, str3, i, defaultConstructorMarker);
            DEX_MARKET_MODULE_LOADING = new LottieSource("DEX_MARKET_MODULE_LOADING", 14, "dex_market_module_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            DEX_TRADE_SURPLUS_ORDER_SAVINGS = new LottieSource("DEX_TRADE_SURPLUS_ORDER_SAVINGS", 15, "dex_trade_savings.lottie", z, str2, str3, i, defaultConstructorMarker);
            LottieSource[] lottieSourceArr$values = $values();
            $VALUES = lottieSourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(lottieSourceArr$values);
        }

        public static LottieSource valueOf(String str) {
            return (LottieSource) Enum.valueOf(LottieSource.class, str);
        }

        public static LottieSource[] values() {
            return (LottieSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageSource implements Activity {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImageSource[] $VALUES;
        public static final ImageSource BridgeTransactionLogo;
        public static final ImageSource EoaAutoConfirmIntro;
        public static final ImageSource GuideRoute = new ImageSource("GuideRoute", 0, "dex_ic_dialog_guide_route.webp", null, false, null, 14, null);
        public static final ImageSource IconErrorCheck;
        public static final ImageSource IconWarningCheck;
        public static final ImageSource JwtCheck;
        public static final ImageSource MemeSocialDiscord;
        public static final ImageSource MemeSocialFacebook;
        public static final ImageSource MemeSocialInstagram;
        public static final ImageSource MemeSocialTelegram;
        public static final ImageSource MemeSocialTiktok;
        public static final ImageSource MemeSocialTwitch;
        public static final ImageSource MemeSocialYoutube;
        public static final ImageSource ModuleBanner;
        public static final ImageSource SavingsSummaryBg;
        public static final ImageSource SignalFireAnimation;
        public static final ImageSource SwapTransactionLogo;
        public static final ImageSource WalletOrderEmpty;
        public static final ImageSource WalletStrategyEmpty;
        private final String fileName;
        private final String fileType;
        private final String path;
        private final boolean supportDarkMode;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImageSource[] $values() {
            return new ImageSource[]{GuideRoute, ModuleBanner, SwapTransactionLogo, BridgeTransactionLogo, IconWarningCheck, IconErrorCheck, MemeSocialDiscord, MemeSocialFacebook, MemeSocialInstagram, MemeSocialTelegram, MemeSocialTwitch, MemeSocialYoutube, MemeSocialTiktok, SignalFireAnimation, JwtCheck, WalletOrderEmpty, WalletStrategyEmpty, SavingsSummaryBg, EoaAutoConfirmIntro};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImageSource> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public String getPath() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dex.utils.CDNSourceManager.Activity
        public boolean getSupportDarkMode() {
            return this.supportDarkMode;
        }

        private ImageSource(String str, int i, String str2, String str3, boolean z, String str4) {
            this.fileName = str2;
            this.path = str3;
            this.supportDarkMode = z;
            this.fileType = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("android") : (r11v0 java.lang.String))
  (wrap:boolean:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("images") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:63) call: com.okinc.business.dex.utils.CDNSourceManager.ImageSource.<init>(java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ ImageSource(String str, int i, String str2, String str3, boolean z, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? "android" : str3, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? "images" : str4);
        }

        static {
            String str = null;
            boolean z = false;
            String str2 = null;
            int i = 14;
            DefaultConstructorMarker defaultConstructorMarker = null;
            ModuleBanner = new ImageSource("ModuleBanner", 1, "dex_module_banner.webp", str, z, str2, i, defaultConstructorMarker);
            String str3 = null;
            boolean z2 = false;
            String str4 = null;
            int i2 = 14;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            SwapTransactionLogo = new ImageSource("SwapTransactionLogo", 2, "icon_dex_swap_transaction_logo.webp", str3, z2, str4, i2, defaultConstructorMarker2);
            BridgeTransactionLogo = new ImageSource("BridgeTransactionLogo", 3, "icon_dex_bridge_transaction_logo.webp", str, z, str2, i, defaultConstructorMarker);
            IconWarningCheck = new ImageSource("IconWarningCheck", 4, "dex_icon_warning_check.webp", str3, z2, str4, i2, defaultConstructorMarker2);
            IconErrorCheck = new ImageSource("IconErrorCheck", 5, "dex_icon_error_check.webp", str, z, str2, i, defaultConstructorMarker);
            int i3 = 10;
            MemeSocialDiscord = new ImageSource("MemeSocialDiscord", 6, "market_social_discord.webp", str3, z2, str4, i3, defaultConstructorMarker2);
            int i4 = 10;
            MemeSocialFacebook = new ImageSource("MemeSocialFacebook", 7, "market_social_facebook.webp", str, z, str2, i4, defaultConstructorMarker);
            MemeSocialInstagram = new ImageSource("MemeSocialInstagram", 8, "market_social_instagram.webp", str3, z2, str4, i3, defaultConstructorMarker2);
            MemeSocialTelegram = new ImageSource("MemeSocialTelegram", 9, "market_social_telegram.webp", str, z, str2, i4, defaultConstructorMarker);
            MemeSocialTwitch = new ImageSource("MemeSocialTwitch", 10, "market_social_twitch.webp", str3, z2, str4, i3, defaultConstructorMarker2);
            MemeSocialYoutube = new ImageSource("MemeSocialYoutube", 11, "market_social_youtube.webp", str, z, str2, i4, defaultConstructorMarker);
            int i5 = 14;
            MemeSocialTiktok = new ImageSource("MemeSocialTiktok", 12, "market_social_tiktok.webp", str3, z2, str4, i5, defaultConstructorMarker2);
            int i6 = 14;
            SignalFireAnimation = new ImageSource("SignalFireAnimation", 13, "dex_market_signal_fire_icon.webp", str, z, str2, i6, defaultConstructorMarker);
            JwtCheck = new ImageSource("JwtCheck", 14, "dex_jwt_check.webp", str3, z2, str4, i5, defaultConstructorMarker2);
            WalletOrderEmpty = new ImageSource("WalletOrderEmpty", 15, "dex_wallet_order_empty.webp", str, z, str2, i6, defaultConstructorMarker);
            WalletStrategyEmpty = new ImageSource("WalletStrategyEmpty", 16, "dex_wallet_strategy_empty.webp", str3, z2, str4, i5, defaultConstructorMarker2);
            SavingsSummaryBg = new ImageSource("SavingsSummaryBg", 17, "dex_bg_surplus_summary.webp", str, z, str2, i6, defaultConstructorMarker);
            EoaAutoConfirmIntro = new ImageSource("EoaAutoConfirmIntro", 18, "dex_bg_eoa_auto_confirm_intro.png", "shared", z2, str4, 12, defaultConstructorMarker2);
            ImageSource[] imageSourceArr$values = $values();
            $VALUES = imageSourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(imageSourceArr$values);
        }

        public static ImageSource valueOf(String str) {
            return (ImageSource) Enum.valueOf(ImageSource.class, str);
        }

        public static ImageSource[] values() {
            return (ImageSource[]) $VALUES.clone();
        }
    }
}
