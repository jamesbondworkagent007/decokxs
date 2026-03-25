package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CheckMpcStatusRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String mpcId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckMpcStatusRequestBody copy$default(CheckMpcStatusRequestBody checkMpcStatusRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkMpcStatusRequestBody.mpcId;
        }
        return checkMpcStatusRequestBody.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckMpcStatusRequestBody copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckMpcStatusRequestBody(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckMpcStatusRequestBody) && Intrinsics.EZpvd((Object) this.mpcId, (Object) ((CheckMpcStatusRequestBody) obj).mpcId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.mpcId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckMpcStatusRequestBody(mpcId=" + this.mpcId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckMpcStatusRequestBody> serializer() {
            return CheckMpcStatusRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckMpcStatusRequestBody(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CheckMpcStatusRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
    }

    public CheckMpcStatusRequestBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }
}
