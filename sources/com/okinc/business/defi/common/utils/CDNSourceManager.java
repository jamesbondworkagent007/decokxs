package com.okinc.business.defi.common.utils;

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

/* JADX INFO: loaded from: classes4.dex */
public final class CDNSourceManager {
    public static final CDNSourceManager OLrzqt = new CDNSourceManager();

    public interface ActionBar {
        String getFileName();

        String getFileType();

        String getPath();

        boolean getSupportDarkMode();
    }

    private CDNSourceManager() {
    }

    public static /* synthetic */ String getFullCDNUrl$default(CDNSourceManager cDNSourceManager, ActionBar actionBar, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = C43246rlf.OLrzqt.valueOf();
        }
        return cDNSourceManager.KWHzl(actionBar, context);
    }

    public final String KWHzl(@NotNull ActionBar actionBar, @NotNull Context context) {
        Configuration configuration;
        String str = "";
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(context, "");
        String fileType = actionBar.getFileType();
        String path = actionBar.getPath();
        if (C33129mqd.OLrzqt((CharSequence) path)) {
            str = path + "/";
        }
        String str2 = fileType + "/web3_wallet/" + str + actionBar.getFileName();
        if (!actionBar.getSupportDarkMode()) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str2;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null);
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        if (numValueOf != null && numValueOf.intValue() == 32) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + listSplit$default.get(0) + "_dark." + listSplit$default.get(1);
        }
        if (numValueOf != null && numValueOf.intValue() == 16) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str2;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str2;
        }
        return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageSource implements ActionBar {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImageSource[] $VALUES;
        public static final ImageSource ApprovalNoRisk;
        public static final ImageSource ApprovalRisk;
        public static final ImageSource CreateWalletIcon;
        public static final ImageSource DeleteWalletConfirm;
        public static final ImageSource FreeGasWarning;
        public static final ImageSource HomeSAAddFunds;
        public static final ImageSource ICloudBackUp;
        public static final ImageSource ICloudTipsNoBackUp;
        public static final ImageSource ImportSecurityIcon;
        public static final ImageSource MultiTransferConfirmImage;
        public static final ImageSource MultiTransferSendArrow;
        public static final ImageSource MultiTransferSendBg = new ImageSource("MultiTransferSendBg", 0, "bg_multi_send_board_full.webp", "android", false, null, 8, null);
        public static final ImageSource MultiTransferSendImage;
        public static final ImageSource OneKeySigning;
        public static final ImageSource ReceiveFromExchangeGuide;
        public static final ImageSource TxChangeTransferTip;
        public static final ImageSource TxConfirmApprove;
        public static final ImageSource TxConfirmCancelApprove;
        public static final ImageSource TxConfirmContract;
        public static final ImageSource TxConfirmMint;
        public static final ImageSource TxConfirmMultiTransferManyToMany;
        public static final ImageSource TxConfirmMultiTransferManyToOne;
        public static final ImageSource TxConfirmMultiTransferOneToMany;
        public static final ImageSource TxConfirmPermit;
        public static final ImageSource TxConfirmRegister;
        public static final ImageSource TxConfirmSignMessage;
        public static final ImageSource TxConfirmTransfer;
        public static final ImageSource USDGOnboardPage;
        public static final ImageSource UpgradeWalletHeader;
        public static final ImageSource UpgradeWalletVerified;
        public static final ImageSource WalletBackUpTipsNoCamera;
        public static final ImageSource WalletBackUpTipsNoShare;
        private final String fileName;
        private final String fileType;
        private final String path;
        private final boolean supportDarkMode;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImageSource[] $values() {
            return new ImageSource[]{MultiTransferSendBg, MultiTransferSendArrow, MultiTransferSendImage, ApprovalRisk, FreeGasWarning, TxConfirmApprove, TxConfirmPermit, MultiTransferConfirmImage, USDGOnboardPage, ICloudBackUp, DeleteWalletConfirm, CreateWalletIcon, ImportSecurityIcon, TxConfirmMint, ReceiveFromExchangeGuide, ApprovalNoRisk, ICloudTipsNoBackUp, WalletBackUpTipsNoShare, OneKeySigning, WalletBackUpTipsNoCamera, TxConfirmCancelApprove, TxConfirmTransfer, TxChangeTransferTip, TxConfirmSignMessage, TxConfirmContract, TxConfirmRegister, TxConfirmMultiTransferManyToMany, TxConfirmMultiTransferManyToOne, TxConfirmMultiTransferOneToMany, UpgradeWalletVerified, UpgradeWalletHeader, HomeSAAddFunds};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImageSource> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getPath() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public boolean getSupportDarkMode() {
            return this.supportDarkMode;
        }

        private ImageSource(String str, int i, String str2, String str3, boolean z, String str4) {
            this.fileName = str2;
            this.path = str3;
            this.supportDarkMode = z;
            this.fileType = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("images") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:51) call: com.okinc.business.defi.common.utils.CDNSourceManager.ImageSource.<init>(java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ ImageSource(String str, int i, String str2, String str3, boolean z, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, z, (i2 & 8) != 0 ? "images" : str4);
        }

        static {
            boolean z = false;
            String str = null;
            int i = 8;
            DefaultConstructorMarker defaultConstructorMarker = null;
            MultiTransferSendArrow = new ImageSource("MultiTransferSendArrow", 1, "ic_multi_send_board_arrow.webp", "android", z, str, i, defaultConstructorMarker);
            boolean z2 = false;
            String str2 = null;
            int i2 = 8;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            MultiTransferSendImage = new ImageSource("MultiTransferSendImage", 2, "ic_multi_send_board_main_top.webp", "android", z2, str2, i2, defaultConstructorMarker2);
            ApprovalRisk = new ImageSource("ApprovalRisk", 3, "icon_approval_risky.webp", "android", z, str, i, defaultConstructorMarker);
            FreeGasWarning = new ImageSource("FreeGasWarning", 4, "icon_free_gas_warning_inner_times.webp", "android", z2, str2, i2, defaultConstructorMarker2);
            boolean z3 = true;
            TxConfirmApprove = new ImageSource("TxConfirmApprove", 5, "icon_wallet_tx_confirm_approve.webp", "android", z3, str, i, defaultConstructorMarker);
            boolean z4 = true;
            TxConfirmPermit = new ImageSource("TxConfirmPermit", 6, "icon_wallet_tx_confirm_dialog_permit.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            MultiTransferConfirmImage = new ImageSource("MultiTransferConfirmImage", 7, "icon_wallet_tx_confirm_exchange_address_tips.webp", "android", z3, str, i, defaultConstructorMarker);
            USDGOnboardPage = new ImageSource("USDGOnboardPage", 8, "bg_usdg_activity_onboard.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            ICloudBackUp = new ImageSource("ICloudBackUp", 9, "icon_cloud_backup.webp", "android", z3, str, i, defaultConstructorMarker);
            DeleteWalletConfirm = new ImageSource("DeleteWalletConfirm", 10, "icon_delete_confirm_wallet.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            CreateWalletIcon = new ImageSource("CreateWalletIcon", 11, "icon_create_wallet_new.webp", "android", z3, str, i, defaultConstructorMarker);
            ImportSecurityIcon = new ImageSource("ImportSecurityIcon", 12, "icon_import_security_new.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            TxConfirmMint = new ImageSource("TxConfirmMint", 13, "icon_wallet_tx_confirm_mint.webp", "android", z3, str, i, defaultConstructorMarker);
            ReceiveFromExchangeGuide = new ImageSource("ReceiveFromExchangeGuide", 14, "ic_receive_from_exchange_guide.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            ApprovalNoRisk = new ImageSource("ApprovalNoRisk", 15, "icon_approval_norisk.webp", "android", z3, str, i, defaultConstructorMarker);
            ICloudTipsNoBackUp = new ImageSource("ICloudTipsNoBackUp", 16, "icon_wallet_backup_tips_no_cloud.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            WalletBackUpTipsNoShare = new ImageSource("WalletBackUpTipsNoShare", 17, "icon_wallet_backup_tpis_no_share.webp", "android", z3, str, i, defaultConstructorMarker);
            OneKeySigning = new ImageSource("OneKeySigning", 18, "ic_hardware_one_key_signing.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            WalletBackUpTipsNoCamera = new ImageSource("WalletBackUpTipsNoCamera", 19, "icon_wallet_backup_tips_no_camera.webp", "android", z3, str, i, defaultConstructorMarker);
            TxConfirmCancelApprove = new ImageSource("TxConfirmCancelApprove", 20, "icon_wallet_tx_confirm_cancel_approve.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            TxConfirmTransfer = new ImageSource("TxConfirmTransfer", 21, "icon_wallet_tx_confirm_transfer.webp", "android", z3, str, i, defaultConstructorMarker);
            TxChangeTransferTip = new ImageSource("TxChangeTransferTip", 22, "icon_wallet_change_transfer_tip.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            TxConfirmSignMessage = new ImageSource("TxConfirmSignMessage", 23, "icon_wallet_tx_confirm_sign_message.webp", "android", z3, str, i, defaultConstructorMarker);
            TxConfirmContract = new ImageSource("TxConfirmContract", 24, "icon_wallet_tx_confirm_contract.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            TxConfirmRegister = new ImageSource("TxConfirmRegister", 25, "icon_wallet_tx_confirm_register.webp", "android", z3, str, i, defaultConstructorMarker);
            TxConfirmMultiTransferManyToMany = new ImageSource("TxConfirmMultiTransferManyToMany", 26, "icon_wallet_tx_confirm_multi_transfer_many_to_many.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            TxConfirmMultiTransferManyToOne = new ImageSource("TxConfirmMultiTransferManyToOne", 27, "icon_wallet_tx_confirm_multi_transfer_many_to_one.webp", "android", z3, str, i, defaultConstructorMarker);
            TxConfirmMultiTransferOneToMany = new ImageSource("TxConfirmMultiTransferOneToMany", 28, "icon_wallet_tx_confirm_multi_transfer_one_to_many.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            UpgradeWalletVerified = new ImageSource("UpgradeWalletVerified", 29, "header_upgrade_wallet_verified.webp", "android", z3, str, i, defaultConstructorMarker);
            UpgradeWalletHeader = new ImageSource("UpgradeWalletHeader", 30, "header_upgrade_wallet.webp", "android", z4, str2, i2, defaultConstructorMarker2);
            HomeSAAddFunds = new ImageSource("HomeSAAddFunds", 31, "ic_add_sa_funds.webp", "android", z3, str, i, defaultConstructorMarker);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LottieSource implements ActionBar {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LottieSource[] $VALUES;
        public static final LottieSource HomeKlineLoading;
        public static final LottieSource HomeKlineXLargeLoading;
        public static final LottieSource SACreateDone;
        public static final LottieSource SACreateGuide;
        public static final LottieSource WalletEnableSAccount;
        private final String fileName;
        private final String fileType;
        private final String path;
        private final boolean supportDarkMode;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LottieSource[] $values() {
            return new LottieSource[]{WalletEnableSAccount, SACreateGuide, HomeKlineLoading, HomeKlineXLargeLoading, SACreateDone};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LottieSource> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getFileName() {
            return this.fileName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getFileType() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public String getPath() {
            return this.path;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.common.utils.CDNSourceManager.ActionBar
        public boolean getSupportDarkMode() {
            return this.supportDarkMode;
        }

        private LottieSource(String str, int i, String str2, boolean z, String str3, String str4) {
            this.fileName = str2;
            this.supportDarkMode = z;
            this.fileType = str3;
            this.path = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.lang.String)
  (r11v0 boolean)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("lottie") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:112) call: com.okinc.business.defi.common.utils.CDNSourceManager.LottieSource.<init>(java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ LottieSource(String str, int i, String str2, boolean z, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, (i2 & 4) != 0 ? "lottie" : str3, (i2 & 8) != 0 ? "" : str4);
        }

        static {
            String str = null;
            WalletEnableSAccount = new LottieSource("WalletEnableSAccount", 0, "enable_sa2_btn.lottie", true, null, str, 12, null);
            boolean z = true;
            String str2 = null;
            String str3 = null;
            int i = 12;
            DefaultConstructorMarker defaultConstructorMarker = null;
            SACreateGuide = new LottieSource("SACreateGuide", 1, "sa_create_guide.lottie", z, str2, str3, i, defaultConstructorMarker);
            boolean z2 = true;
            String str4 = null;
            int i2 = 12;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            HomeKlineLoading = new LottieSource("HomeKlineLoading", 2, "big_kline_loading.lottie", z2, str, str4, i2, defaultConstructorMarker2);
            HomeKlineXLargeLoading = new LottieSource("HomeKlineXLargeLoading", 3, "big_kline_loading_xlarge.lottie", z, str2, str3, i, defaultConstructorMarker);
            SACreateDone = new LottieSource("SACreateDone", 4, "sa_create_done.lottie", z2, str, str4, i2, defaultConstructorMarker2);
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
}
