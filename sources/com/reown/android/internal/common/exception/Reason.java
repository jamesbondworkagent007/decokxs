package com.reown.android.internal.common.exception;

import com.reown.android.internal.common.model.type.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Reason implements Error {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.exception.Reason.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Reason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Reason() {
    }

    public static final class UserDisconnected extends Reason {
        public static final UserDisconnected INSTANCE = new UserDisconnected();
        public static final String message = MessagesKt.DISCONNECT_MESSAGE;
        public static final int code = 6000;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public int getCode() {
            return code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Error
        public String getMessage() {
            return message;
        }

        public UserDisconnected() {
            super(null);
        }
    }
}
