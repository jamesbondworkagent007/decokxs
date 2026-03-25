package com.amplifyframework.statemachine.codegen.data;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public abstract class DeviceMetadata {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Companion.1
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedClassSerializer("com.amplifyframework.statemachine.codegen.data.DeviceMetadata", C56524yIo.AEQbTJ(DeviceMetadata.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Empty.class), C56524yIo.AEQbTJ(Metadata.class)}, new KSerializer[]{new ObjectSerializer("empty", Empty.INSTANCE, new Annotation[0]), DeviceMetadata$Metadata$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeviceMetadata(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void write$Self(DeviceMetadata deviceMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) DeviceMetadata.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<DeviceMetadata> serializer() {
            return get$cachedSerializer();
        }
    }

    @Serializable
    @SerialName(TtmlNode.TAG_METADATA)
    public static final class Metadata extends DeviceMetadata {
        public static final Companion Companion = new Companion(null);
        private final String deviceGroupKey;
        private final String deviceKey;
        private final String deviceSecret;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.deviceKey;
            }
            if ((i & 2) != 0) {
                str2 = metadata.deviceGroupKey;
            }
            if ((i & 4) != 0) {
                str3 = metadata.deviceSecret;
            }
            return metadata.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.deviceKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.deviceGroupKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.deviceSecret;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Metadata copy(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Metadata(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.EZpvd((Object) this.deviceKey, (Object) metadata.deviceKey) && Intrinsics.EZpvd((Object) this.deviceGroupKey, (Object) metadata.deviceGroupKey) && Intrinsics.EZpvd((Object) this.deviceSecret, (Object) metadata.deviceSecret);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceGroupKey() {
            return this.deviceGroupKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceKey() {
            return this.deviceKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceSecret() {
            return this.deviceSecret;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.deviceKey.hashCode();
            int iHashCode2 = this.deviceGroupKey.hashCode();
            String str = this.deviceSecret;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Metadata(deviceKey=" + this.deviceKey + ", deviceGroupKey=" + this.deviceGroupKey + ", deviceSecret=" + this.deviceSecret + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Metadata.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Metadata> serializer() {
                return DeviceMetadata$Metadata$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Metadata(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, DeviceMetadata$Metadata$$serializer.INSTANCE.getDescriptor());
            }
            this.deviceKey = str;
            this.deviceGroupKey = str2;
            if ((i & 4) == 0) {
                this.deviceSecret = null;
            } else {
                this.deviceSecret = str3;
            }
        }

        public static final /* synthetic */ void write$Self(Metadata metadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            DeviceMetadata.write$Self(metadata, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, metadata.deviceKey);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, metadata.deviceGroupKey);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && metadata.deviceSecret == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, metadata.deviceSecret);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Metadata.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Metadata(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(@NotNull String str, @NotNull String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.deviceKey = str;
            this.deviceGroupKey = str2;
            this.deviceSecret = str3;
        }
    }

    private DeviceMetadata() {
    }

    public /* synthetic */ DeviceMetadata(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @SerialName("empty")
    @Serializable
    public static final class Empty extends DeviceMetadata {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Empty.1
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
}
