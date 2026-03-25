package com.okinc.business.defi.biz.core.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C33070mpX;
import o.C33129mqd;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletImportError extends OKWException {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    public static final int ERROR_CODE_AA_CREATE_KEY = 110;
    public static final int ERROR_CODE_AA_EXIST = 112;
    public static final int ERROR_CODE_ADDRESS_EXIST = 102;
    private static final int ERROR_CODE_DATA_ERROR = 105;
    public static final int ERROR_CODE_DATA_MPC = 107;
    public static final int ERROR_CODE_GET_EOA_ADDRESS_KEY = 111;
    public static final int ERROR_CODE_HARDWARE_ACCOUNT_EXIST = 113;
    private static final int ERROR_CODE_MNEMONIC_EMPTY = 108;
    public static final int ERROR_CODE_MNEMONIC_EXIST = 100;
    public static final int ERROR_CODE_MNEMONIC_OR_PRIVATE_KEY = 109;
    public static final int ERROR_CODE_MPC_EXIST = 106;
    public static final int ERROR_CODE_NOT_SUPPORT_CHAIN = 103;
    public static final int ERROR_CODE_PRIVATE_KEY_EXIST = 101;
    private final int code;
    private final String failReason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletImportError copy$default(WalletImportError walletImportError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = walletImportError.code;
        }
        if ((i2 & 2) != 0) {
            str = walletImportError.failReason;
        }
        return walletImportError.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletImportError copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletImportError(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletImportError)) {
            return false;
        }
        WalletImportError walletImportError = (WalletImportError) obj;
        return this.code == walletImportError.code && Intrinsics.EZpvd((Object) this.failReason, (Object) walletImportError.failReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.failReason.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "WalletImportError(code=" + this.code + ", failReason=" + this.failReason + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportError(int i, @NotNull String str) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.failReason = str;
    }

    public static /* synthetic */ WalletImportError toThrowableWithLog$default(WalletImportError walletImportError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return walletImportError.toThrowableWithLog(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletImportError toThrowableWithLog(String str) {
        pUU.copydefault("WalletImportError", "{code:" + this.code + ", failReason: " + this.failReason + "}");
        return new WalletImportError(this.code, str);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.error.WalletImportError.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final WalletImportError valueOf() {
            return new WalletImportError(100, "Mnemonic already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }

        public final WalletImportError AYXKKw() {
            return new WalletImportError(101, "Private key already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }

        public final WalletImportError isConnected() {
            return new WalletImportError(103, "Not support chain.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError OLrzqt() {
            return new WalletImportError(102, "Address already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }

        public static /* synthetic */ WalletImportError dataError$default(Activity activity, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = 1;
            }
            return activity.OLrzqt(str, i);
        }

        public final WalletImportError OLrzqt(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!C33129mqd.OLrzqt((CharSequence) str)) {
                str = "Data error";
            }
            return new WalletImportError(105, str).toThrowableWithLog(C33070mpX.AYXKKw(i == 1 ? C13754dXa.FragmentManager.IMediaSessionStubProxy : C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError AhwBna() {
            return new WalletImportError(106, "MPC wallet already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }

        public static /* synthetic */ WalletImportError createMpcDataError$default(Activity activity, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return activity.EZpvd(i);
        }

        public final WalletImportError EZpvd(int i) {
            return new WalletImportError(107, "MPC wallet Data error " + i + " .").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError EZpvd() {
            return new WalletImportError(108, "Mnemonic is empty.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
        }

        public final WalletImportError gEmmrt() {
            return new WalletImportError(109, "Mnemonic or private key invalid.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError copydefault() {
            return new WalletImportError(WalletImportError.ERROR_CODE_AA_CREATE_KEY, "AA aaAddress or verifyingContract is null.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError djBIcL() {
            return new WalletImportError(WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, "EOA Address is null or empty.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController));
        }

        public final WalletImportError KWHzl() {
            return new WalletImportError(WalletImportError.ERROR_CODE_AA_EXIST, "AA wallet already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }

        public final WalletImportError AEQbTJ() {
            return new WalletImportError(WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, "this account already exists.").toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfv));
        }
    }
}
