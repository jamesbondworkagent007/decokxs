package com.okinc.business.web3pay.lib.features.contacts.data.entity;

import com.okinc.business.web3pay.lib.features.contacts.model.ContactType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Web3PayRecentContactEntity {
    public static final int $stable = 0;
    private final String contactAvatar;
    private final String contactDisplay;
    private final Long contactId;
    private final String contactInfo;
    private final String contactName;
    private final ContactType contactType;
    private final long createdTime;
    private final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contactName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.contactAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.contactDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.contactInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactType component7() {
        return this.contactType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayRecentContactEntity copy(@NotNull String str, Long l, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull ContactType contactType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(contactType, "");
        return new Web3PayRecentContactEntity(str, l, str2, str3, str4, str5, contactType, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Web3PayRecentContactEntity)) {
            return false;
        }
        Web3PayRecentContactEntity web3PayRecentContactEntity = (Web3PayRecentContactEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) web3PayRecentContactEntity.key) && Intrinsics.EZpvd(this.contactId, web3PayRecentContactEntity.contactId) && Intrinsics.EZpvd((Object) this.contactName, (Object) web3PayRecentContactEntity.contactName) && Intrinsics.EZpvd((Object) this.contactAvatar, (Object) web3PayRecentContactEntity.contactAvatar) && Intrinsics.EZpvd((Object) this.contactDisplay, (Object) web3PayRecentContactEntity.contactDisplay) && Intrinsics.EZpvd((Object) this.contactInfo, (Object) web3PayRecentContactEntity.contactInfo) && this.contactType == web3PayRecentContactEntity.contactType && this.createdTime == web3PayRecentContactEntity.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactAvatar() {
        return this.contactAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactDisplay() {
        return this.contactDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getContactId() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactInfo() {
        return this.contactInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactName() {
        return this.contactName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactType getContactType() {
        return this.contactType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        Long l = this.contactId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        int iHashCode3 = this.contactName.hashCode();
        String str = this.contactAvatar;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.contactDisplay.hashCode()) * 31) + this.contactInfo.hashCode()) * 31) + this.contactType.hashCode()) * 31) + Long.hashCode(this.createdTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3PayRecentContactEntity(key=" + this.key + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", contactAvatar=" + this.contactAvatar + ", contactDisplay=" + this.contactDisplay + ", contactInfo=" + this.contactInfo + ", contactType=" + this.contactType + ", createdTime=" + this.createdTime + ")";
    }

    public Web3PayRecentContactEntity(@NotNull String str, Long l, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull ContactType contactType, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(contactType, "");
        this.key = str;
        this.contactId = l;
        this.contactName = str2;
        this.contactAvatar = str3;
        this.contactDisplay = str4;
        this.contactInfo = str5;
        this.contactType = contactType;
        this.createdTime = j;
    }
}
