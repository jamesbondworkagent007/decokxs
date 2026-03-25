package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class EventAllocation {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("percOfUnlocked")
    private final String percOfUnlocked;

    @SerializedName("unlocked")
    private final String unlocked;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EventAllocation copy$default(EventAllocation eventAllocation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventAllocation.label;
        }
        if ((i & 2) != 0) {
            str2 = eventAllocation.percOfUnlocked;
        }
        if ((i & 4) != 0) {
            str3 = eventAllocation.unlocked;
        }
        return eventAllocation.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventAllocation copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EventAllocation(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventAllocation)) {
            return false;
        }
        EventAllocation eventAllocation = (EventAllocation) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) eventAllocation.label) && Intrinsics.EZpvd((Object) this.percOfUnlocked, (Object) eventAllocation.percOfUnlocked) && Intrinsics.EZpvd((Object) this.unlocked, (Object) eventAllocation.unlocked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUnlocked() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlocked() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.percOfUnlocked.hashCode()) * 31) + this.unlocked.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EventAllocation(label=" + this.label + ", percOfUnlocked=" + this.percOfUnlocked + ", unlocked=" + this.unlocked + ")";
    }

    public EventAllocation(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.percOfUnlocked = str2;
        this.unlocked = str3;
    }
}
