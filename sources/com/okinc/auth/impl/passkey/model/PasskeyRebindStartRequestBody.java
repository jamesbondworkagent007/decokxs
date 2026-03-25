package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyRebindStartRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String workflowToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyRebindStartRequestBody() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRebindStartRequestBody copy$default(PasskeyRebindStartRequestBody passkeyRebindStartRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRebindStartRequestBody.workflowToken;
        }
        return passkeyRebindStartRequestBody.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRebindStartRequestBody KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyRebindStartRequestBody(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasskeyRebindStartRequestBody) && Intrinsics.EZpvd((Object) this.workflowToken, (Object) ((PasskeyRebindStartRequestBody) obj).workflowToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.workflowToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRebindStartRequestBody(workflowToken=" + this.workflowToken + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRebindStartRequestBody> serializer() {
            return PasskeyRebindStartRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRebindStartRequestBody(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.workflowToken = "";
        } else {
            this.workflowToken = str;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PasskeyRebindStartRequestBody passkeyRebindStartRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) passkeyRebindStartRequestBody.workflowToken, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyRebindStartRequestBody.workflowToken);
    }

    public PasskeyRebindStartRequestBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.workflowToken = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:372) call: com.okinc.auth.impl.passkey.model.PasskeyRebindStartRequestBody.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyRebindStartRequestBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
