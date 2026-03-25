package com.okinc.web3.security.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ButtonEvent {
    public static final int $stable = 0;
    private final String buttonName;
    private final String importSource;
    private final String importType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ButtonEvent copy$default(ButtonEvent buttonEvent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonEvent.buttonName;
        }
        if ((i & 2) != 0) {
            str2 = buttonEvent.importType;
        }
        if ((i & 4) != 0) {
            str3 = buttonEvent.importSource;
        }
        return buttonEvent.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buttonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.importType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.importSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonEvent copy(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ButtonEvent(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonEvent)) {
            return false;
        }
        ButtonEvent buttonEvent = (ButtonEvent) obj;
        return Intrinsics.EZpvd((Object) this.buttonName, (Object) buttonEvent.buttonName) && Intrinsics.EZpvd((Object) this.importType, (Object) buttonEvent.importType) && Intrinsics.EZpvd((Object) this.importSource, (Object) buttonEvent.importSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonName() {
        return this.buttonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImportSource() {
        return this.importSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImportType() {
        return this.importType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.buttonName.hashCode();
        String str = this.importType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.importSource;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ButtonEvent(buttonName=" + this.buttonName + ", importType=" + this.importType + ", importSource=" + this.importSource + ")";
    }

    public ButtonEvent(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buttonName = str;
        this.importType = str2;
        this.importSource = str3;
    }
}
