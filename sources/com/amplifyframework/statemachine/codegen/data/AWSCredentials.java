package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class AWSCredentials {
    public static final Companion Companion = new Companion(null);
    private static final AWSCredentials empty = new AWSCredentials(null, null, null, 0L);
    private final String accessKeyId;
    private final Long expiration;
    private final String secretAccessKey;
    private final String sessionToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AWSCredentials copy$default(AWSCredentials aWSCredentials, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCredentials.accessKeyId;
        }
        if ((i & 2) != 0) {
            str2 = aWSCredentials.secretAccessKey;
        }
        if ((i & 4) != 0) {
            str3 = aWSCredentials.sessionToken;
        }
        if ((i & 8) != 0) {
            l = aWSCredentials.expiration;
        }
        return aWSCredentials.copy(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.secretAccessKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCredentials copy(String str, String str2, String str3, Long l) {
        return new AWSCredentials(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCredentials)) {
            return false;
        }
        AWSCredentials aWSCredentials = (AWSCredentials) obj;
        return Intrinsics.EZpvd((Object) this.accessKeyId, (Object) aWSCredentials.accessKeyId) && Intrinsics.EZpvd((Object) this.secretAccessKey, (Object) aWSCredentials.secretAccessKey) && Intrinsics.EZpvd((Object) this.sessionToken, (Object) aWSCredentials.sessionToken) && Intrinsics.EZpvd(this.expiration, aWSCredentials.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accessKeyId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.secretAccessKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sessionToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Long l = this.expiration;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
    }

    public /* synthetic */ AWSCredentials(int i, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, AWSCredentials$$serializer.INSTANCE.getDescriptor());
        }
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l;
    }

    public AWSCredentials(String str, String str2, String str3, Long l) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l;
    }

    public static final /* synthetic */ void write$Self(AWSCredentials aWSCredentials, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, aWSCredentials.accessKeyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, aWSCredentials.secretAccessKey);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, aWSCredentials.sessionToken);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, aWSCredentials.expiration);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AWSCredentials.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AWSCredentials> serializer() {
            return AWSCredentials$$serializer.INSTANCE;
        }

        public final AWSCredentials getEmpty() {
            return AWSCredentials.empty;
        }
    }

    public String toString() {
        String str = this.accessKeyId;
        String strKWHzl = str != null ? StringsKt__StringsKt.KWHzl(str, new IntRange(0, 4)) : null;
        String str2 = this.secretAccessKey;
        String strKWHzl2 = str2 != null ? StringsKt__StringsKt.KWHzl(str2, new IntRange(0, 4)) : null;
        String str3 = this.sessionToken;
        return "AWSCredentials(accessKeyId = " + strKWHzl + "***, secretAccessKey = " + strKWHzl2 + "***, sessionToken = " + (str3 != null ? StringsKt__StringsKt.KWHzl(str3, new IntRange(0, 4)) : null) + "***, expiration = " + this.expiration + ")";
    }
}
