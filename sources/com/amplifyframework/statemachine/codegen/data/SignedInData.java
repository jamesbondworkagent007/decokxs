package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.serializer.DateSerializer;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class SignedInData {
    private final CognitoUserPoolTokens cognitoUserPoolTokens;
    private final SignInMethod signInMethod;
    private final Date signedInDate;
    private final String userId;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SignInMethod.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignedInData copy$default(SignedInData signedInData, String str, String str2, Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedInData.userId;
        }
        if ((i & 2) != 0) {
            str2 = signedInData.username;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            date = signedInData.signedInDate;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            signInMethod = signedInData.signInMethod;
        }
        SignInMethod signInMethod2 = signInMethod;
        if ((i & 16) != 0) {
            cognitoUserPoolTokens = signedInData.cognitoUserPoolTokens;
        }
        return signedInData.copy(str, str3, date2, signInMethod2, cognitoUserPoolTokens);
    }

    @Serializable(with = DateSerializer.class)
    public static /* synthetic */ void getSignedInDate$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component3() {
        return this.signedInDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignInMethod component4() {
        return this.signInMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CognitoUserPoolTokens component5() {
        return this.cognitoUserPoolTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignedInData copy(@NotNull String str, @NotNull String str2, @NotNull Date date, @NotNull SignInMethod signInMethod, @NotNull CognitoUserPoolTokens cognitoUserPoolTokens) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(signInMethod, "");
        Intrinsics.checkNotNullParameter(cognitoUserPoolTokens, "");
        return new SignedInData(str, str2, date, signInMethod, cognitoUserPoolTokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CognitoUserPoolTokens getCognitoUserPoolTokens() {
        return this.cognitoUserPoolTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignInMethod getSignInMethod() {
        return this.signInMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getSignedInDate() {
        return this.signedInDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.username.hashCode()) * 31) + this.signedInDate.hashCode()) * 31) + this.signInMethod.hashCode()) * 31) + this.cognitoUserPoolTokens.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignedInData(userId=" + this.userId + ", username=" + this.username + ", signedInDate=" + this.signedInDate + ", signInMethod=" + this.signInMethod + ", cognitoUserPoolTokens=" + this.cognitoUserPoolTokens + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignedInData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignedInData> serializer() {
            return SignedInData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignedInData(int i, String str, String str2, @Serializable(with = DateSerializer.class) Date date, SignInMethod signInMethod, CognitoUserPoolTokens cognitoUserPoolTokens, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SignedInData$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.username = str2;
        this.signedInDate = date;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }

    public SignedInData(@NotNull String str, @NotNull String str2, @NotNull Date date, @NotNull SignInMethod signInMethod, @NotNull CognitoUserPoolTokens cognitoUserPoolTokens) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(signInMethod, "");
        Intrinsics.checkNotNullParameter(cognitoUserPoolTokens, "");
        this.userId = str;
        this.username = str2;
        this.signedInDate = date;
        this.signInMethod = signInMethod;
        this.cognitoUserPoolTokens = cognitoUserPoolTokens;
    }

    public static final /* synthetic */ void write$Self(SignedInData signedInData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signedInData.userId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signedInData.username);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, DateSerializer.INSTANCE, signedInData.signedInDate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], signedInData.signInMethod);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, CognitoUserPoolTokens$$serializer.INSTANCE, signedInData.cognitoUserPoolTokens);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            if (obj != null && Intrinsics.EZpvd(SignedInData.class, obj.getClass()) && (obj instanceof SignedInData)) {
                SignedInData signedInData = (SignedInData) obj;
                if (!Intrinsics.EZpvd((Object) this.userId, (Object) signedInData.userId) || !Intrinsics.EZpvd((Object) this.username, (Object) signedInData.username) || !Intrinsics.EZpvd(this.signInMethod, signedInData.signInMethod) || !Intrinsics.EZpvd(this.cognitoUserPoolTokens, signedInData.cognitoUserPoolTokens)) {
                }
            }
            return false;
        }
        return true;
    }
}
