package com.okinc.business.appupdate.update;

import com.okinc.core.util.SPUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AppUpdateConfigResp {
    public static final String UPDATE_SHOW_KEY = "update_show_key";
    private String additionalUrl;
    private AlertContent alertContent;
    private String apkMD5;
    private String latestVersion;
    private Integer mode;
    private String upgradeType;
    private UpgradeTypeDetail upgradeTypeDetail;
    private String versionIsLatest;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final boolean isNewVersionShowedToday() {
        return Companion.isNewVersionShowedToday();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalUrl() {
        return this.additionalUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertContent getAlertContent() {
        return this.alertContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApkMD5() {
        return this.apkMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpgradeType() {
        return this.upgradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeTypeDetail getUpgradeTypeDetail() {
        return this.upgradeTypeDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersionIsLatest() {
        return this.versionIsLatest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionalUrl(String str) {
        this.additionalUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlertContent(AlertContent alertContent) {
        this.alertContent = alertContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApkMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.apkMD5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.latestVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(Integer num) {
        this.mode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upgradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeTypeDetail(UpgradeTypeDetail upgradeTypeDetail) {
        this.upgradeTypeDetail = upgradeTypeDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersionIsLatest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.versionIsLatest = str;
    }

    public AppUpdateConfigResp() {
        this.apkMD5 = "";
        this.latestVersion = "";
        this.versionIsLatest = "1";
        this.upgradeType = "1";
    }

    public /* synthetic */ AppUpdateConfigResp(int i, String str, String str2, String str3, String str4, AlertContent alertContent, UpgradeTypeDetail upgradeTypeDetail, Integer num, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.apkMD5 = "";
        } else {
            this.apkMD5 = str;
        }
        if ((i & 2) == 0) {
            this.latestVersion = "";
        } else {
            this.latestVersion = str2;
        }
        if ((i & 4) == 0) {
            this.versionIsLatest = "1";
        } else {
            this.versionIsLatest = str3;
        }
        if ((i & 8) == 0) {
            this.upgradeType = "1";
        } else {
            this.upgradeType = str4;
        }
        if ((i & 16) == 0) {
            this.alertContent = null;
        } else {
            this.alertContent = alertContent;
        }
        if ((i & 32) == 0) {
            this.upgradeTypeDetail = null;
        } else {
            this.upgradeTypeDetail = upgradeTypeDetail;
        }
        if ((i & 64) == 0) {
            this.mode = null;
        } else {
            this.mode = num;
        }
        if ((i & 128) == 0) {
            this.additionalUrl = null;
        } else {
            this.additionalUrl = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(AppUpdateConfigResp appUpdateConfigResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) appUpdateConfigResp.apkMD5, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, appUpdateConfigResp.apkMD5);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) appUpdateConfigResp.latestVersion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, appUpdateConfigResp.latestVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) appUpdateConfigResp.versionIsLatest, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, appUpdateConfigResp.versionIsLatest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) appUpdateConfigResp.upgradeType, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, appUpdateConfigResp.upgradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || appUpdateConfigResp.alertContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, AlertContent$$serializer.INSTANCE, appUpdateConfigResp.alertContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || appUpdateConfigResp.upgradeTypeDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, UpgradeTypeDetail$$serializer.INSTANCE, appUpdateConfigResp.upgradeTypeDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || appUpdateConfigResp.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, appUpdateConfigResp.mode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && appUpdateConfigResp.additionalUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, appUpdateConfigResp.additionalUrl);
    }

    public final AppUpdateInfo getAppUpdateInfo() {
        return new AppUpdateInfo(this.latestVersion, this.upgradeType, this.alertContent, this.apkMD5, this.upgradeTypeDetail, this.mode, this.additionalUrl);
    }

    public final boolean hasNewVersion$OKUpgrade_ok_upgrade() {
        return Intrinsics.EZpvd((Object) this.versionIsLatest, (Object) "0");
    }

    public final boolean needUpdate$OKUpgrade_ok_upgrade(boolean z) {
        return hasNewVersion$OKUpgrade_ok_upgrade() && needShowUpdateDialog(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean needShowUpdateDialog(boolean z) {
        String mainSite;
        boolean zCanUpgradeByType = canUpgradeByType(this.upgradeType, z);
        if (!zCanUpgradeByType || C33129mqd.AhwBna(this.upgradeType) != 2 || this.upgradeTypeDetail == null) {
            return zCanUpgradeByType;
        }
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            UpgradeTypeDetail upgradeTypeDetail = this.upgradeTypeDetail;
            mainSite = upgradeTypeDetail != null ? upgradeTypeDetail.getWeb3() : null;
        } else {
            UpgradeTypeDetail upgradeTypeDetail2 = this.upgradeTypeDetail;
            if (upgradeTypeDetail2 != null) {
                mainSite = upgradeTypeDetail2.getMainSite();
            }
        }
        return canUpgradeByType(mainSite, z);
    }

    private final boolean canUpgradeByType(String str, boolean z) {
        int iAhwBna = C33129mqd.AhwBna(str);
        if (iAhwBna != 1) {
            return iAhwBna == 2;
        }
        boolean z2 = (z && Companion.isNewVersionShowedToday()) ? false : true;
        if (z2) {
            Companion.setNewVersionShowedToday$OKUpgrade_ok_upgrade();
        }
        return z2;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateConfigResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppUpdateConfigResp> serializer() {
            return AppUpdateConfigResp$$serializer.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNewVersionShowedToday() {
            return Intrinsics.EZpvd((Object) SPUtils.getString(AppUpdateConfigResp.UPDATE_SHOW_KEY, ""), (Object) new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE).format(new Date()));
        }

        public final void setNewVersionShowedToday$OKUpgrade_ok_upgrade() {
            SPUtils.put(AppUpdateConfigResp.UPDATE_SHOW_KEY, new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE).format(new Date()));
        }
    }
}
