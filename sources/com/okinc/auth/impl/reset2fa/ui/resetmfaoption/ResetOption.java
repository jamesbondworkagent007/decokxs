package com.okinc.auth.impl.reset2fa.ui.resetmfaoption;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerialName;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ResetOption implements Serializable {
    public static final int $stable = 8;
    private boolean checked;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean) A[MD:(boolean):void (m)] call: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetOption.<init>(boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResetOption(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    @SerialName("checked")
    public static /* synthetic */ void getChecked$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.checked = z;
    }

    private ResetOption(boolean z) {
        this.checked = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(boolean, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:24) call: com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetOption.<init>(boolean, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ ResetOption(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    public static final class Mobile extends ResetOption {
        public static final int $stable = 0;
        public static final Mobile INSTANCE = new Mobile();

        private Mobile() {
            super(false, 1, null);
        }
    }

    public static final class Email extends ResetOption {
        public static final int $stable = 0;
        public static final Email INSTANCE = new Email();

        private Email() {
            super(false, 1, null);
        }
    }

    public static final class AuthApp extends ResetOption {
        public static final int $stable = 0;
        public static final AuthApp INSTANCE = new AuthApp();

        private AuthApp() {
            super(false, 1, null);
        }
    }
}
