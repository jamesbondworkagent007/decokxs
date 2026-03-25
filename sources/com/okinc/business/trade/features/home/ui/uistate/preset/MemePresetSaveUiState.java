package com.okinc.business.trade.features.home.ui.uistate.preset;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MemePresetSaveUiState {
    public static final int $stable = 0;
    private final String data;
    private final String errorMessage;
    private final boolean isFail;
    private final boolean isLoading;
    private final boolean isSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemePresetSaveUiState() {
        this(false, false, false, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemePresetSaveUiState copy$default(MemePresetSaveUiState memePresetSaveUiState, boolean z, boolean z2, boolean z3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = memePresetSaveUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = memePresetSaveUiState.isSuccess;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = memePresetSaveUiState.isFail;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            str = memePresetSaveUiState.data;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = memePresetSaveUiState.errorMessage;
        }
        return memePresetSaveUiState.copy(z, z4, z5, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isFail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemePresetSaveUiState copy(boolean z, boolean z2, boolean z3, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new MemePresetSaveUiState(z, z2, z3, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemePresetSaveUiState)) {
            return false;
        }
        MemePresetSaveUiState memePresetSaveUiState = (MemePresetSaveUiState) obj;
        return this.isLoading == memePresetSaveUiState.isLoading && this.isSuccess == memePresetSaveUiState.isSuccess && this.isFail == memePresetSaveUiState.isFail && Intrinsics.EZpvd((Object) this.data, (Object) memePresetSaveUiState.data) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) memePresetSaveUiState.errorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading);
        int iHashCode2 = Boolean.hashCode(this.isSuccess);
        int iHashCode3 = Boolean.hashCode(this.isFail);
        String str = this.data;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.errorMessage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFail() {
        return this.isFail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemePresetSaveUiState(isLoading=" + this.isLoading + ", isSuccess=" + this.isSuccess + ", isFail=" + this.isFail + ", data=" + this.data + ", errorMessage=" + this.errorMessage + ")";
    }

    public MemePresetSaveUiState(boolean z, boolean z2, boolean z3, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.isLoading = z;
        this.isSuccess = z2;
        this.isFail = z3;
        this.data = str;
        this.errorMessage = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 boolean) : false)
  (wrap:java.lang.String:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(boolean, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetSaveUiState.<init>(boolean, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemePresetSaveUiState(boolean z, boolean z2, boolean z3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? null : str, (i & 16) != 0 ? "" : str2);
    }
}
