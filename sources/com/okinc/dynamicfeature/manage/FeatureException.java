package com.okinc.dynamicfeature.manage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FeatureException extends Exception {
    public static final int $stable = 0;
    public static final int CODE_MODULE_NAME_EMPTY = 2;
    public static final int CODE_MODULE_REGISTER_FAIL = 1;
    public static final Activity Companion = new Activity(null);
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dynamicfeature.manage.FeatureException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureException(int i, @NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
    }
}
