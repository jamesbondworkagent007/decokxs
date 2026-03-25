package com.keystone.module;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiAccounts {
    private final String device;
    private final String deviceId;
    private final String deviceVersion;
    private final List<Account> keys;
    private final String masterFingerprint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.keystone.module.MultiAccounts */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiAccounts copy$default(MultiAccounts multiAccounts, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiAccounts.masterFingerprint;
        }
        if ((i & 2) != 0) {
            list = multiAccounts.keys;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = multiAccounts.device;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = multiAccounts.deviceId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = multiAccounts.deviceVersion;
        }
        return multiAccounts.copy(str, list2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Account> component2() {
        return this.keys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.deviceVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiAccounts copy(@NotNull String str, @NotNull List<Account> list, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MultiAccounts(str, list, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiAccounts)) {
            return false;
        }
        MultiAccounts multiAccounts = (MultiAccounts) obj;
        return Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) multiAccounts.masterFingerprint) && Intrinsics.EZpvd(this.keys, multiAccounts.keys) && Intrinsics.EZpvd((Object) this.device, (Object) multiAccounts.device) && Intrinsics.EZpvd((Object) this.deviceId, (Object) multiAccounts.deviceId) && Intrinsics.EZpvd((Object) this.deviceVersion, (Object) multiAccounts.deviceVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevice() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Account> getKeys() {
        return this.keys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.masterFingerprint.hashCode();
        int iHashCode2 = this.keys.hashCode();
        String str = this.device;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.deviceId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deviceVersion;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiAccounts(masterFingerprint=" + this.masterFingerprint + ", keys=" + this.keys + ", device=" + ((Object) this.device) + ", deviceId=" + ((Object) this.deviceId) + ", deviceVersion=" + ((Object) this.deviceVersion) + ')';
    }

    public MultiAccounts(@NotNull String str, @NotNull List<Account> list, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.masterFingerprint = str;
        this.keys = list;
        this.device = str2;
        this.deviceId = str3;
        this.deviceVersion = str4;
    }
}
