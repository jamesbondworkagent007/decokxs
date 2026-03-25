package com.amplifyframework.statemachine.codegen.data;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class AuthChallenge {
    private static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String challengeName;
    private final Map<String, String> parameters;
    private final String session;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.AuthChallenge */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthChallenge copy$default(AuthChallenge authChallenge, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authChallenge.challengeName;
        }
        if ((i & 2) != 0) {
            str2 = authChallenge.username;
        }
        if ((i & 4) != 0) {
            str3 = authChallenge.session;
        }
        if ((i & 8) != 0) {
            map = authChallenge.parameters;
        }
        return authChallenge.copy(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.session;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component4() {
        return this.parameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthChallenge copy(@NotNull String str, String str2, String str3, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AuthChallenge(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthChallenge)) {
            return false;
        }
        AuthChallenge authChallenge = (AuthChallenge) obj;
        return Intrinsics.EZpvd((Object) this.challengeName, (Object) authChallenge.challengeName) && Intrinsics.EZpvd((Object) this.username, (Object) authChallenge.username) && Intrinsics.EZpvd((Object) this.session, (Object) authChallenge.session) && Intrinsics.EZpvd(this.parameters, authChallenge.parameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallengeName() {
        return this.challengeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSession() {
        return this.session;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.challengeName.hashCode();
        String str = this.username;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.session;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Map<String, String> map = this.parameters;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthChallenge(challengeName=" + this.challengeName + ", username=" + this.username + ", session=" + this.session + ", parameters=" + this.parameters + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AuthChallenge.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AuthChallenge> serializer() {
            return AuthChallenge$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ AuthChallenge(int i, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, AuthChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.challengeName = str;
        if ((i & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        this.session = str3;
        this.parameters = map;
    }

    public AuthChallenge(@NotNull String str, String str2, String str3, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.challengeName = str;
        this.username = str2;
        this.session = str3;
        this.parameters = map;
    }

    public static final /* synthetic */ void write$Self(AuthChallenge authChallenge, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, authChallenge.challengeName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authChallenge.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, authChallenge.username);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authChallenge.session);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], authChallenge.parameters);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 java.util.Map)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:21) call: com.amplifyframework.statemachine.codegen.data.AuthChallenge.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ AuthChallenge(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, map);
    }
}
