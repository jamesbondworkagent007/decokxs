package com.okinc.business.defi.biz.core.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C33070mpX;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TeeGeneratedError extends OKWException {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    private static final int ERROR_CODE_MOBILE_TEE_COMMON_CODE = -1000;
    private static final int ERROR_CODE_TEE_BACKEND_INVALID_RESULT_CODE = -1002;
    private static final int ERROR_CODE_TEE_SDK_INTERACTION_CODE = -1001;
    private final int code;
    private final String failReason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeGeneratedError copy$default(TeeGeneratedError teeGeneratedError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teeGeneratedError.code;
        }
        if ((i2 & 2) != 0) {
            str = teeGeneratedError.failReason;
        }
        return teeGeneratedError.copy(i, str);
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
    public final TeeGeneratedError copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TeeGeneratedError(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeGeneratedError)) {
            return false;
        }
        TeeGeneratedError teeGeneratedError = (TeeGeneratedError) obj;
        return this.code == teeGeneratedError.code && Intrinsics.EZpvd((Object) this.failReason, (Object) teeGeneratedError.failReason);
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
        return "TeeGeneratedError(code=" + this.code + ", failReason=" + this.failReason + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeGeneratedError(int i, @NotNull String str) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.failReason = str;
    }

    public static /* synthetic */ TeeGeneratedError toThrowableWithLog$default(TeeGeneratedError teeGeneratedError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return teeGeneratedError.toThrowableWithLog(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeeGeneratedError toThrowableWithLog(String str) {
        pUU.copydefault("TeeGeneratedError", "{code:" + this.code + ", failReason: " + this.failReason + "}");
        return new TeeGeneratedError(this.code, str);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.error.TeeGeneratedError.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TeeGeneratedError KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TeeGeneratedError(-1000, str).toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
        }

        public final TeeGeneratedError OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TeeGeneratedError(TeeGeneratedError.ERROR_CODE_TEE_SDK_INTERACTION_CODE, str).toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
        }

        public final TeeGeneratedError EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TeeGeneratedError(TeeGeneratedError.ERROR_CODE_TEE_BACKEND_INVALID_RESULT_CODE, str).toThrowableWithLog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger));
        }
    }
}
