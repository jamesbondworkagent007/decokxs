package com.okinc.network.okg.error;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CustomServerErrorException extends IOException {
    public static final int $stable = 0;
    public static final TaskDescription Companion = new TaskDescription(null);
    private static final long serialVersionUID = -4639126076052875402L;

    public CustomServerErrorException(String str) {
        super(str);
    }

    public CustomServerErrorException() {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.error.CustomServerErrorException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
