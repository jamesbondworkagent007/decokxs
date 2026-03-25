package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PasskeyAuthenticateRequest implements Parcelable {
    public final List<AllowCredential> allowCredentials;
    public final String challenge;
    public final Extensions extensions;
    public final String rpId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PasskeyAuthenticateRequest> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(PasskeyAuthenticateRequest$AllowCredential$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PasskeyAuthenticateRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Extensions extensionsCreateFromParcel = Extensions.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AllowCredential.CREATOR.createFromParcel(parcel));
            }
            return new PasskeyAuthenticateRequest(extensionsCreateFromParcel, string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateRequest[] newArray(int i) {
            return new PasskeyAuthenticateRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyAuthenticateRequest copy$default(PasskeyAuthenticateRequest passkeyAuthenticateRequest, Extensions extensions, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            extensions = passkeyAuthenticateRequest.extensions;
        }
        if ((i & 2) != 0) {
            str = passkeyAuthenticateRequest.challenge;
        }
        if ((i & 4) != 0) {
            str2 = passkeyAuthenticateRequest.rpId;
        }
        if ((i & 8) != 0) {
            list = passkeyAuthenticateRequest.allowCredentials;
        }
        return passkeyAuthenticateRequest.EZpvd(extensions, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateRequest EZpvd(@NotNull Extensions extensions, @NotNull String str, @NotNull String str2, @NotNull List<AllowCredential> list) {
        Intrinsics.checkNotNullParameter(extensions, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PasskeyAuthenticateRequest(extensions, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.rpId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AllowCredential> OLrzqt() {
        return this.allowCredentials;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyAuthenticateRequest)) {
            return false;
        }
        PasskeyAuthenticateRequest passkeyAuthenticateRequest = (PasskeyAuthenticateRequest) obj;
        return Intrinsics.EZpvd(this.extensions, passkeyAuthenticateRequest.extensions) && Intrinsics.EZpvd((Object) this.challenge, (Object) passkeyAuthenticateRequest.challenge) && Intrinsics.EZpvd((Object) this.rpId, (Object) passkeyAuthenticateRequest.rpId) && Intrinsics.EZpvd(this.allowCredentials, passkeyAuthenticateRequest.allowCredentials);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.extensions.hashCode() * 31) + this.challenge.hashCode()) * 31) + this.rpId.hashCode()) * 31) + this.allowCredentials.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyAuthenticateRequest(extensions=" + this.extensions + ", challenge=" + this.challenge + ", rpId=" + this.rpId + ", allowCredentials=" + this.allowCredentials + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.extensions.writeToParcel(parcel, i);
        parcel.writeString(this.challenge);
        parcel.writeString(this.rpId);
        List<AllowCredential> list = this.allowCredentials;
        parcel.writeInt(list.size());
        Iterator<AllowCredential> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyAuthenticateRequest> serializer() {
            return PasskeyAuthenticateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyAuthenticateRequest(int i, Extensions extensions, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PasskeyAuthenticateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.extensions = extensions;
        this.challenge = str;
        this.rpId = str2;
        this.allowCredentials = list;
    }

    public static final /* synthetic */ void copydefault(PasskeyAuthenticateRequest passkeyAuthenticateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$Extensions$$serializer.INSTANCE, passkeyAuthenticateRequest.extensions);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyAuthenticateRequest.challenge);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, passkeyAuthenticateRequest.rpId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], passkeyAuthenticateRequest.allowCredentials);
    }

    public PasskeyAuthenticateRequest(@NotNull Extensions extensions, @NotNull String str, @NotNull String str2, @NotNull List<AllowCredential> list) {
        Intrinsics.checkNotNullParameter(extensions, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.extensions = extensions;
        this.challenge = str;
        this.rpId = str2;
        this.allowCredentials = list;
    }

    @Serializable
    public static final class Extensions implements Parcelable {
        public static final int $stable = 0;
        public final Boolean credProps;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Extensions> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Extensions> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extensions createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Extensions(boolValueOf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extensions[] newArray(int i) {
                return new Extensions[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Extensions() {
            this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Extensions copy$default(Extensions extensions, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = extensions.credProps;
            }
            return extensions.OLrzqt(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions OLrzqt(Boolean bool) {
            return new Extensions(bool);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extensions) && Intrinsics.EZpvd(this.credProps, ((Extensions) obj).credProps);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.credProps;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Extensions(credProps=" + this.credProps + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            ?? BooleanValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean bool = this.credProps;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest.Extensions.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Extensions> serializer() {
                return PasskeyAuthenticateRequest$Extensions$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Extensions(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credProps = null;
            } else {
                this.credProps = bool;
            }
        }

        public static final /* synthetic */ void OLrzqt(Extensions extensions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && extensions.credProps == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, extensions.credProps);
        }

        public Extensions(Boolean bool) {
            this.credProps = bool;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:49) call: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest.Extensions.<init>(java.lang.Boolean):void type: THIS */
        public /* synthetic */ Extensions(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }
    }

    @Serializable
    public static final class AllowCredential implements Parcelable {
        public final String id;
        public final List<String> transports;
        public final String type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<AllowCredential> CREATOR = new Creator();
        public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

        public static final class Creator implements Parcelable.Creator<AllowCredential> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowCredential createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AllowCredential(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowCredential[] newArray(int i) {
                return new AllowCredential[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest$AllowCredential */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AllowCredential copy$default(AllowCredential allowCredential, List list, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = allowCredential.transports;
            }
            if ((i & 2) != 0) {
                str = allowCredential.id;
            }
            if ((i & 4) != 0) {
                str2 = allowCredential.type;
            }
            return allowCredential.OLrzqt(list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> AEQbTJ() {
            return this.transports;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AllowCredential OLrzqt(@NotNull List<String> list, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new AllowCredential(list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllowCredential)) {
                return false;
            }
            AllowCredential allowCredential = (AllowCredential) obj;
            return Intrinsics.EZpvd(this.transports, allowCredential.transports) && Intrinsics.EZpvd((Object) this.id, (Object) allowCredential.id) && Intrinsics.EZpvd((Object) this.type, (Object) allowCredential.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.transports.hashCode() * 31) + this.id.hashCode()) * 31) + this.type.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AllowCredential(transports=" + this.transports + ", id=" + this.id + ", type=" + this.type + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeStringList(this.transports);
            parcel.writeString(this.id);
            parcel.writeString(this.type);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateRequest.AllowCredential.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AllowCredential> serializer() {
                return PasskeyAuthenticateRequest$AllowCredential$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AllowCredential(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, PasskeyAuthenticateRequest$AllowCredential$$serializer.INSTANCE.getDescriptor());
            }
            this.transports = list;
            this.id = str;
            this.type = str2;
        }

        public static final /* synthetic */ void EZpvd(AllowCredential allowCredential, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], allowCredential.transports);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, allowCredential.id);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, allowCredential.type);
        }

        public AllowCredential(@NotNull List<String> list, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.transports = list;
            this.id = str;
            this.type = str2;
        }
    }
}
