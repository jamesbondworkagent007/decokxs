package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ButtonGroupModuleModel extends BaseModel<ButtonGroup> {
    public static final int $stable = 0;

    public ButtonGroupModuleModel() {
        super("buttonGroup");
    }

    public static final class ButtonGroup {
        public static final int $stable = 0;
        private final String primaryButtonText;
        private final String secondaryButtonText;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ButtonGroup() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ButtonGroup copy$default(ButtonGroup buttonGroup, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonGroup.primaryButtonText;
            }
            if ((i & 2) != 0) {
                str2 = buttonGroup.secondaryButtonText;
            }
            return buttonGroup.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.primaryButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.secondaryButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ButtonGroup copy(String str, String str2) {
            return new ButtonGroup(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonGroup)) {
                return false;
            }
            ButtonGroup buttonGroup = (ButtonGroup) obj;
            return Intrinsics.EZpvd((Object) this.primaryButtonText, (Object) buttonGroup.primaryButtonText) && Intrinsics.EZpvd((Object) this.secondaryButtonText, (Object) buttonGroup.secondaryButtonText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.primaryButtonText;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.secondaryButtonText;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ButtonGroup(primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ")";
        }

        public ButtonGroup(String str, String str2) {
            this.primaryButtonText = str;
            this.secondaryButtonText = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:625) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.ButtonGroupModuleModel.ButtonGroup.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ButtonGroup(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
