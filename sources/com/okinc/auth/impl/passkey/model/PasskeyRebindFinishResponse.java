package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyRebindFinishResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String nextStep;
    public final String reminderContent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRebindFinishResponse copy$default(PasskeyRebindFinishResponse passkeyRebindFinishResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRebindFinishResponse.nextStep;
        }
        if ((i & 2) != 0) {
            str2 = passkeyRebindFinishResponse.reminderContent;
        }
        return passkeyRebindFinishResponse.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRebindFinishResponse copydefault(String str, String str2) {
        return new PasskeyRebindFinishResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyRebindFinishResponse)) {
            return false;
        }
        PasskeyRebindFinishResponse passkeyRebindFinishResponse = (PasskeyRebindFinishResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextStep, (Object) passkeyRebindFinishResponse.nextStep) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) passkeyRebindFinishResponse.reminderContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextStep;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.reminderContent;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRebindFinishResponse(nextStep=" + this.nextStep + ", reminderContent=" + this.reminderContent + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRebindFinishResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRebindFinishResponse> serializer() {
            return PasskeyRebindFinishResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRebindFinishResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyRebindFinishResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.nextStep = str;
        if ((i & 2) == 0) {
            this.reminderContent = null;
        } else {
            this.reminderContent = str2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PasskeyRebindFinishResponse passkeyRebindFinishResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, passkeyRebindFinishResponse.nextStep);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && passkeyRebindFinishResponse.reminderContent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, passkeyRebindFinishResponse.reminderContent);
    }

    public PasskeyRebindFinishResponse(String str, String str2) {
        this.nextStep = str;
        this.reminderContent = str2;
    }
}
