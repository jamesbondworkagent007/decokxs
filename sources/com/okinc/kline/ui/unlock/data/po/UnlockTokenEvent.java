package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenEvent {
    public static final int $stable = 8;

    @SerializedName("alloction")
    private final List<EventAllocation> alloction;

    @SerializedName("emissionType")
    private final String emissionType;

    @SerializedName("percOfUnlocked")
    private final String percOfUnlocked;

    @SerializedName("percOfUnlockedValue")
    private final String percOfUnlockedValue;

    @SerializedName("unlocked")
    private final String unlocked;

    @SerializedName("unlockedTs")
    private final String unlockedTs;

    @SerializedName("unlockedValue")
    private final String unlockedValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlockTokenEvent copy$default(UnlockTokenEvent unlockTokenEvent, List list, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unlockTokenEvent.alloction;
        }
        if ((i & 2) != 0) {
            str = unlockTokenEvent.emissionType;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = unlockTokenEvent.percOfUnlocked;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = unlockTokenEvent.percOfUnlockedValue;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = unlockTokenEvent.unlocked;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = unlockTokenEvent.unlockedTs;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = unlockTokenEvent.unlockedValue;
        }
        return unlockTokenEvent.copy(list, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventAllocation> component1() {
        return this.alloction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.emissionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.percOfUnlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.unlockedTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockTokenEvent copy(@NotNull List<EventAllocation> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new UnlockTokenEvent(list, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockTokenEvent)) {
            return false;
        }
        UnlockTokenEvent unlockTokenEvent = (UnlockTokenEvent) obj;
        return Intrinsics.EZpvd(this.alloction, unlockTokenEvent.alloction) && Intrinsics.EZpvd((Object) this.emissionType, (Object) unlockTokenEvent.emissionType) && Intrinsics.EZpvd((Object) this.percOfUnlocked, (Object) unlockTokenEvent.percOfUnlocked) && Intrinsics.EZpvd((Object) this.percOfUnlockedValue, (Object) unlockTokenEvent.percOfUnlockedValue) && Intrinsics.EZpvd((Object) this.unlocked, (Object) unlockTokenEvent.unlocked) && Intrinsics.EZpvd((Object) this.unlockedTs, (Object) unlockTokenEvent.unlockedTs) && Intrinsics.EZpvd((Object) this.unlockedValue, (Object) unlockTokenEvent.unlockedValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventAllocation> getAlloction() {
        return this.alloction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmissionType() {
        return this.emissionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUnlocked() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUnlockedValue() {
        return this.percOfUnlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlocked() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlockedTs() {
        return this.unlockedTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlockedValue() {
        return this.unlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.alloction.hashCode() * 31) + this.emissionType.hashCode()) * 31) + this.percOfUnlocked.hashCode()) * 31) + this.percOfUnlockedValue.hashCode()) * 31) + this.unlocked.hashCode()) * 31) + this.unlockedTs.hashCode()) * 31) + this.unlockedValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockTokenEvent(alloction=" + this.alloction + ", emissionType=" + this.emissionType + ", percOfUnlocked=" + this.percOfUnlocked + ", percOfUnlockedValue=" + this.percOfUnlockedValue + ", unlocked=" + this.unlocked + ", unlockedTs=" + this.unlockedTs + ", unlockedValue=" + this.unlockedValue + ")";
    }

    public UnlockTokenEvent(@NotNull List<EventAllocation> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.alloction = list;
        this.emissionType = str;
        this.percOfUnlocked = str2;
        this.percOfUnlockedValue = str3;
        this.unlocked = str4;
        this.unlockedTs = str5;
        this.unlockedValue = str6;
    }
}
