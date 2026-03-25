package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyFinishUpgradeRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String responseJson;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyFinishUpgradeRequestBody copy$default(PasskeyFinishUpgradeRequestBody passkeyFinishUpgradeRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyFinishUpgradeRequestBody.responseJson;
        }
        return passkeyFinishUpgradeRequestBody.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyFinishUpgradeRequestBody EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyFinishUpgradeRequestBody(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasskeyFinishUpgradeRequestBody) && Intrinsics.EZpvd((Object) this.responseJson, (Object) ((PasskeyFinishUpgradeRequestBody) obj).responseJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.responseJson.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyFinishUpgradeRequestBody(responseJson=" + this.responseJson + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyFinishUpgradeRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyFinishUpgradeRequestBody> serializer() {
            return PasskeyFinishUpgradeRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyFinishUpgradeRequestBody(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyFinishUpgradeRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.responseJson = str;
    }

    public PasskeyFinishUpgradeRequestBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.responseJson = str;
    }
}
