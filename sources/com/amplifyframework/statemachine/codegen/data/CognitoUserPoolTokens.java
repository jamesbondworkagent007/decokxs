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
public final class CognitoUserPoolTokens {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final Long expiration;
    private final String idToken;
    private final String refreshToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CognitoUserPoolTokens copy$default(CognitoUserPoolTokens cognitoUserPoolTokens, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cognitoUserPoolTokens.idToken;
        }
        if ((i & 2) != 0) {
            str2 = cognitoUserPoolTokens.accessToken;
        }
        if ((i & 4) != 0) {
            str3 = cognitoUserPoolTokens.refreshToken;
        }
        if ((i & 8) != 0) {
            l = cognitoUserPoolTokens.expiration;
        }
        return cognitoUserPoolTokens.copy(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.idToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CognitoUserPoolTokens copy(String str, String str2, String str3, Long l) {
        return new CognitoUserPoolTokens(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdToken() {
        return this.idToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.idToken;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accessToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refreshToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Long l = this.expiration;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CognitoUserPoolTokens> serializer() {
            return CognitoUserPoolTokens$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CognitoUserPoolTokens(int i, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CognitoUserPoolTokens$$serializer.INSTANCE.getDescriptor());
        }
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l;
    }

    public CognitoUserPoolTokens(String str, String str2, String str3, Long l) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.expiration = l;
    }

    public static final /* synthetic */ void write$Self(CognitoUserPoolTokens cognitoUserPoolTokens, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, cognitoUserPoolTokens.idToken);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, cognitoUserPoolTokens.accessToken);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, cognitoUserPoolTokens.refreshToken);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, cognitoUserPoolTokens.expiration);
    }

    public String toString() {
        String str = this.idToken;
        String strKWHzl = str != null ? StringsKt__StringsKt.KWHzl(str, new IntRange(0, 4)) : null;
        String str2 = this.accessToken;
        String strKWHzl2 = str2 != null ? StringsKt__StringsKt.KWHzl(str2, new IntRange(0, 4)) : null;
        String str3 = this.refreshToken;
        return "CognitoUserPoolTokens(idToken = " + strKWHzl + "***, accessToken = " + strKWHzl2 + "***, refreshToken = " + (str3 != null ? StringsKt__StringsKt.KWHzl(str3, new IntRange(0, 4)) : null) + "***)";
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            if (obj != null && Intrinsics.EZpvd(CognitoUserPoolTokens.class, obj.getClass()) && (obj instanceof CognitoUserPoolTokens)) {
                CognitoUserPoolTokens cognitoUserPoolTokens = (CognitoUserPoolTokens) obj;
                if (!Intrinsics.EZpvd((Object) this.idToken, (Object) cognitoUserPoolTokens.idToken) || !Intrinsics.EZpvd((Object) this.accessToken, (Object) cognitoUserPoolTokens.accessToken) || !Intrinsics.EZpvd((Object) this.refreshToken, (Object) cognitoUserPoolTokens.refreshToken)) {
                }
            }
            return false;
        }
        return true;
    }
}
