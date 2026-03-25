package com.amplifyframework.statemachine.codegen.data;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public abstract class AmplifyCredential {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.Companion.1
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedClassSerializer("com.amplifyframework.statemachine.codegen.data.AmplifyCredential", C56524yIo.AEQbTJ(AmplifyCredential.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(ASFDevice.class), C56524yIo.AEQbTJ(DeviceData.class), C56524yIo.AEQbTJ(Empty.class), C56524yIo.AEQbTJ(IdentityPool.class), C56524yIo.AEQbTJ(IdentityPoolFederated.class), C56524yIo.AEQbTJ(UserAndIdentityPool.class), C56524yIo.AEQbTJ(UserPool.class)}, new KSerializer[]{AmplifyCredential$ASFDevice$$serializer.INSTANCE, AmplifyCredential$DeviceData$$serializer.INSTANCE, new ObjectSerializer("empty", Empty.INSTANCE, new Annotation[0]), AmplifyCredential$IdentityPool$$serializer.INSTANCE, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE, AmplifyCredential$UserPool$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public interface DeviceMetaDataTypeCredential {
        DeviceMetadata getDeviceMetadata();
    }

    public interface IdentityPoolTypeCredential {
        AWSCredentials getCredentials();

        String getIdentityId();
    }

    public interface UserPoolTypeCredential {
        SignedInData getSignedInData();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AmplifyCredential(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void write$Self(AmplifyCredential amplifyCredential, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AmplifyCredential.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AmplifyCredential> serializer() {
            return get$cachedSerializer();
        }
    }

    private AmplifyCredential() {
    }

    public /* synthetic */ AmplifyCredential(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @SerialName("empty")
    @Serializable
    public static final class Empty extends AmplifyCredential {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.Empty.1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("empty", Empty.INSTANCE, new Annotation[0]);
            }
        });

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Empty> serializer() {
            return get$cachedSerializer();
        }

        private Empty() {
            super(null);
        }
    }

    @Serializable
    @SerialName("userPool")
    public static final class UserPool extends AmplifyCredential implements UserPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UserPool copy$default(UserPool userPool, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = userPool.signedInData;
            }
            return userPool.copy(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserPool copy(@NotNull SignedInData signedInData) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            return new UserPool(signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserPool) && Intrinsics.EZpvd(this.signedInData, ((UserPool) obj).signedInData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserPoolTypeCredential
        public SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.signedInData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserPool(signedInData=" + this.signedInData + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserPool.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UserPool> serializer() {
                return AmplifyCredential$UserPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserPool(int i, SignedInData signedInData, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, AmplifyCredential$UserPool$$serializer.INSTANCE.getDescriptor());
            }
            this.signedInData = signedInData;
        }

        public static final /* synthetic */ void write$Self(UserPool userPool, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(userPool, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, SignedInData$$serializer.INSTANCE, userPool.getSignedInData());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserPool(@NotNull SignedInData signedInData) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            this.signedInData = signedInData;
        }
    }

    @Serializable
    @SerialName("identityPool")
    public static final class IdentityPool extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ IdentityPool copy$default(IdentityPool identityPool, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                str = identityPool.identityId;
            }
            if ((i & 2) != 0) {
                aWSCredentials = identityPool.credentials;
            }
            return identityPool.copy(str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AWSCredentials component2() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IdentityPool copy(@NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            return new IdentityPool(str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPool)) {
                return false;
            }
            IdentityPool identityPool = (IdentityPool) obj;
            return Intrinsics.EZpvd((Object) this.identityId, (Object) identityPool.identityId) && Intrinsics.EZpvd(this.credentials, identityPool.credentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.identityId.hashCode() * 31) + this.credentials.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "IdentityPool(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPool.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IdentityPool> serializer() {
                return AmplifyCredential$IdentityPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPool(int i, String str, AWSCredentials aWSCredentials, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, AmplifyCredential$IdentityPool$$serializer.INSTANCE.getDescriptor());
            }
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static final /* synthetic */ void write$Self(IdentityPool identityPool, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(identityPool, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, identityPool.getIdentityId());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AWSCredentials$$serializer.INSTANCE, identityPool.getCredentials());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPool(@NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    @Serializable
    @SerialName("identityPoolFederated")
    public static final class IdentityPoolFederated extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final FederatedToken federatedToken;
        private final String identityId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ IdentityPoolFederated copy$default(IdentityPoolFederated identityPoolFederated, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = identityPoolFederated.federatedToken;
            }
            if ((i & 2) != 0) {
                str = identityPoolFederated.identityId;
            }
            if ((i & 4) != 0) {
                aWSCredentials = identityPoolFederated.credentials;
            }
            return identityPoolFederated.copy(federatedToken, str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatedToken component1() {
            return this.federatedToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AWSCredentials component3() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IdentityPoolFederated copy(@NotNull FederatedToken federatedToken, @NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            Intrinsics.checkNotNullParameter(federatedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            return new IdentityPoolFederated(federatedToken, str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPoolFederated)) {
                return false;
            }
            IdentityPoolFederated identityPoolFederated = (IdentityPoolFederated) obj;
            return Intrinsics.EZpvd(this.federatedToken, identityPoolFederated.federatedToken) && Intrinsics.EZpvd((Object) this.identityId, (Object) identityPoolFederated.identityId) && Intrinsics.EZpvd(this.credentials, identityPoolFederated.credentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FederatedToken getFederatedToken() {
            return this.federatedToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.federatedToken.hashCode() * 31) + this.identityId.hashCode()) * 31) + this.credentials.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "IdentityPoolFederated(federatedToken=" + this.federatedToken + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolFederated.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IdentityPoolFederated> serializer() {
                return AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPoolFederated(int i, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE.getDescriptor());
            }
            this.federatedToken = federatedToken;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static final /* synthetic */ void write$Self(IdentityPoolFederated identityPoolFederated, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(identityPoolFederated, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, FederatedToken$$serializer.INSTANCE, identityPoolFederated.federatedToken);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, identityPoolFederated.getIdentityId());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, AWSCredentials$$serializer.INSTANCE, identityPoolFederated.getCredentials());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPoolFederated(@NotNull FederatedToken federatedToken, @NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            super(null);
            Intrinsics.checkNotNullParameter(federatedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            this.federatedToken = federatedToken;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    @Serializable
    @SerialName("userAndIdentityPool")
    public static final class UserAndIdentityPool extends AmplifyCredential implements UserPoolTypeCredential, IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;
        private final SignedInData signedInData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UserAndIdentityPool copy$default(UserAndIdentityPool userAndIdentityPool, SignedInData signedInData, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = userAndIdentityPool.signedInData;
            }
            if ((i & 2) != 0) {
                str = userAndIdentityPool.identityId;
            }
            if ((i & 4) != 0) {
                aWSCredentials = userAndIdentityPool.credentials;
            }
            return userAndIdentityPool.copy(signedInData, str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignedInData component1() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AWSCredentials component3() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserAndIdentityPool copy(@NotNull SignedInData signedInData, @NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            return new UserAndIdentityPool(signedInData, str, aWSCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAndIdentityPool)) {
                return false;
            }
            UserAndIdentityPool userAndIdentityPool = (UserAndIdentityPool) obj;
            return Intrinsics.EZpvd(this.signedInData, userAndIdentityPool.signedInData) && Intrinsics.EZpvd((Object) this.identityId, (Object) userAndIdentityPool.identityId) && Intrinsics.EZpvd(this.credentials, userAndIdentityPool.credentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserPoolTypeCredential
        public SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.signedInData.hashCode() * 31) + this.identityId.hashCode()) * 31) + this.credentials.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserAndIdentityPool(signedInData=" + this.signedInData + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserAndIdentityPool.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UserAndIdentityPool> serializer() {
                return AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserAndIdentityPool(int i, SignedInData signedInData, String str, AWSCredentials aWSCredentials, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE.getDescriptor());
            }
            this.signedInData = signedInData;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static final /* synthetic */ void write$Self(UserAndIdentityPool userAndIdentityPool, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(userAndIdentityPool, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, SignedInData$$serializer.INSTANCE, userAndIdentityPool.getSignedInData());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userAndIdentityPool.getIdentityId());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, AWSCredentials$$serializer.INSTANCE, userAndIdentityPool.getCredentials());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAndIdentityPool(@NotNull SignedInData signedInData, @NotNull String str, @NotNull AWSCredentials aWSCredentials) {
            super(null);
            Intrinsics.checkNotNullParameter(signedInData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aWSCredentials, "");
            this.signedInData = signedInData;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    @Serializable
    @SerialName("deviceMetadata")
    public static final class DeviceData extends AmplifyCredential implements DeviceMetaDataTypeCredential {
        private final DeviceMetadata deviceMetadata;
        public static final Companion Companion = new Companion(null);
        private static final KSerializer<Object>[] $childSerializers = {DeviceMetadata.Companion.serializer()};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, DeviceMetadata deviceMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceMetadata = deviceData.deviceMetadata;
            }
            return deviceData.copy(deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceMetadata component1() {
            return this.deviceMetadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceData copy(@NotNull DeviceMetadata deviceMetadata) {
            Intrinsics.checkNotNullParameter(deviceMetadata, "");
            return new DeviceData(deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceData) && Intrinsics.EZpvd(this.deviceMetadata, ((DeviceData) obj).deviceMetadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.DeviceMetaDataTypeCredential
        public DeviceMetadata getDeviceMetadata() {
            return this.deviceMetadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.deviceMetadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeviceData(deviceMetadata=" + this.deviceMetadata + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.DeviceData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DeviceData> serializer() {
                return AmplifyCredential$DeviceData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceData(int i, DeviceMetadata deviceMetadata, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, AmplifyCredential$DeviceData$$serializer.INSTANCE.getDescriptor());
            }
            this.deviceMetadata = deviceMetadata;
        }

        public static final /* synthetic */ void write$Self(DeviceData deviceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(deviceData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], deviceData.getDeviceMetadata());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceData(@NotNull DeviceMetadata deviceMetadata) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceMetadata, "");
            this.deviceMetadata = deviceMetadata;
        }
    }

    @Serializable
    @SerialName("asfDevice")
    public static final class ASFDevice extends AmplifyCredential {
        public static final Companion Companion = new Companion(null);
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ASFDevice copy$default(ASFDevice aSFDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aSFDevice.id;
            }
            return aSFDevice.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ASFDevice copy(String str) {
            return new ASFDevice(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ASFDevice) && Intrinsics.EZpvd((Object) this.id, (Object) ((ASFDevice) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ASFDevice(id=" + this.id + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ASFDevice> serializer() {
                return AmplifyCredential$ASFDevice$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ASFDevice(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, AmplifyCredential$ASFDevice$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
        }

        public static final /* synthetic */ void write$Self(ASFDevice aSFDevice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            AmplifyCredential.write$Self(aSFDevice, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aSFDevice.id);
        }

        public ASFDevice(String str) {
            super(null);
            this.id = str;
        }
    }
}
