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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public abstract class SignInMethod {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.amplifyframework.statemachine.codegen.data.SignInMethod.Companion.1
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedClassSerializer("com.amplifyframework.statemachine.codegen.data.SignInMethod", C56524yIo.AEQbTJ(SignInMethod.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(ApiBased.class), C56524yIo.AEQbTJ(HostedUI.class)}, new KSerializer[]{SignInMethod$ApiBased$$serializer.INSTANCE, SignInMethod$HostedUI$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignInMethod.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignInMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void write$Self(SignInMethod signInMethod, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignInMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SignInMethod.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SignInMethod> serializer() {
            return get$cachedSerializer();
        }
    }

    private SignInMethod() {
    }

    public /* synthetic */ SignInMethod(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @Serializable
    @SerialName("SignInMethod.ApiBased")
    public static final class ApiBased extends SignInMethod {
        private final AuthType authType;
        public static final Companion Companion = new Companion(null);
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.amplifyframework.statemachine.codegen.data.SignInMethod.ApiBased.AuthType", AuthType.values())};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ApiBased copy$default(ApiBased apiBased, AuthType authType, int i, Object obj) {
            if ((i & 1) != 0) {
                authType = apiBased.authType;
            }
            return apiBased.copy(authType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthType component1() {
            return this.authType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApiBased copy(@NotNull AuthType authType) {
            Intrinsics.checkNotNullParameter(authType, "");
            return new ApiBased(authType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiBased) && this.authType == ((ApiBased) obj).authType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthType getAuthType() {
            return this.authType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.authType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApiBased(authType=" + this.authType + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignInMethod.ApiBased.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ApiBased> serializer() {
                return SignInMethod$ApiBased$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApiBased(int i, AuthType authType, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SignInMethod$ApiBased$$serializer.INSTANCE.getDescriptor());
            }
            this.authType = authType;
        }

        public static final /* synthetic */ void write$Self(ApiBased apiBased, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SignInMethod.write$Self(apiBased, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], apiBased.authType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiBased(@NotNull AuthType authType) {
            super(null);
            Intrinsics.checkNotNullParameter(authType, "");
            this.authType = authType;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class AuthType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ AuthType[] $VALUES;
            public static final AuthType USER_SRP_AUTH = new AuthType("USER_SRP_AUTH", 0);
            public static final AuthType CUSTOM_AUTH = new AuthType("CUSTOM_AUTH", 1);
            public static final AuthType USER_PASSWORD_AUTH = new AuthType("USER_PASSWORD_AUTH", 2);
            public static final AuthType UNKNOWN = new AuthType("UNKNOWN", 3);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ AuthType[] $values() {
                return new AuthType[]{USER_SRP_AUTH, CUSTOM_AUTH, USER_PASSWORD_AUTH, UNKNOWN};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<AuthType> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static AuthType valueOf(String str) {
                return (AuthType) Enum.valueOf(AuthType.class, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static AuthType[] values() {
                return (AuthType[]) $VALUES.clone();
            }

            private AuthType(String str, int i) {
            }

            static {
                AuthType[] authTypeArr$values = $values();
                $VALUES = authTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(authTypeArr$values);
            }
        }
    }

    @Serializable
    @SerialName("SignInMethod.HostedUI")
    public static final class HostedUI extends SignInMethod {
        public static final Companion Companion = new Companion(null);
        private final String browserPackage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public HostedUI() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HostedUI copy$default(HostedUI hostedUI, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hostedUI.browserPackage;
            }
            return hostedUI.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.browserPackage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUI copy(String str) {
            return new HostedUI(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedUI) && Intrinsics.EZpvd((Object) this.browserPackage, (Object) ((HostedUI) obj).browserPackage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBrowserPackage() {
            return this.browserPackage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.browserPackage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HostedUI(browserPackage=" + this.browserPackage + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignInMethod.HostedUI.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<HostedUI> serializer() {
                return SignInMethod$HostedUI$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ HostedUI(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.browserPackage = null;
            } else {
                this.browserPackage = str;
            }
        }

        public static final /* synthetic */ void write$Self(HostedUI hostedUI, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SignInMethod.write$Self(hostedUI, compositeEncoder, serialDescriptor);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && hostedUI.browserPackage == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, hostedUI.browserPackage);
        }

        public HostedUI(String str) {
            super(null);
            this.browserPackage = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:39) call: com.amplifyframework.statemachine.codegen.data.SignInMethod.HostedUI.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ HostedUI(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
