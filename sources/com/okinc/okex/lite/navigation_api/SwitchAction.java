package com.okinc.okex.lite.navigation_api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SwitchAction {
    public static final int $stable = 8;
    private String actionType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwitchAction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwitchAction copy$default(SwitchAction switchAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchAction.actionType;
        }
        return switchAction.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.actionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchAction copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SwitchAction(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwitchAction) && Intrinsics.EZpvd((Object) this.actionType, (Object) ((SwitchAction) obj).actionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionType() {
        return this.actionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.actionType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchAction(actionType=" + this.actionType + ")";
    }

    public SwitchAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actionType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("switch_action_cancel") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:21) call: com.okinc.okex.lite.navigation_api.SwitchAction.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SwitchAction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "switch_action_cancel" : str);
    }
}
