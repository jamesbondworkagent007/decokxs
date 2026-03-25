package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56391yDq;
import o.C56403yEb;
import o.C6614aSf;
import o.C6617aSi;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class RegistrationStartResponse implements Parcelable {
    private static final RegistrationStartResponse STUB_GOOGLE;
    private static final RegistrationStartResponse STUB_OKX;

    @SerializedName("publicKey")
    private final PublicKey publicKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RegistrationStartResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<RegistrationStartResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistrationStartResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RegistrationStartResponse(parcel.readInt() == 0 ? null : PublicKey.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistrationStartResponse[] newArray(int i) {
            return new RegistrationStartResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegistrationStartResponse() {
        this((PublicKey) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegistrationStartResponse copy$default(RegistrationStartResponse registrationStartResponse, PublicKey publicKey, int i, Object obj) {
        if ((i & 1) != 0) {
            publicKey = registrationStartResponse.publicKey;
        }
        return registrationStartResponse.copy(publicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey component1() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrationStartResponse copy(PublicKey publicKey) {
        return new RegistrationStartResponse(publicKey);
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
        return (obj instanceof RegistrationStartResponse) && Intrinsics.EZpvd(this.publicKey, ((RegistrationStartResponse) obj).publicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            return 0;
        }
        return publicKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegistrationStartResponse(publicKey=" + this.publicKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicKey.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ RegistrationStartResponse(int i, PublicKey publicKey, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = publicKey;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(RegistrationStartResponse registrationStartResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && registrationStartResponse.publicKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RegistrationStartResponse$PublicKey$$serializer.INSTANCE, registrationStartResponse.publicKey);
    }

    public RegistrationStartResponse(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey) : (r1v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey))
 A[MD:(com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey):void (m)] (LINE:45) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.<init>(com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey):void type: THIS */
    public /* synthetic */ RegistrationStartResponse(PublicKey publicKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : publicKey);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RegistrationStartResponse> serializer() {
            return RegistrationStartResponse$$serializer.INSTANCE;
        }
    }

    static {
        PublicKey.Rp rp = new PublicKey.Rp("WebAuthn Codelab", "emphasized-adventurous-drawbridge.glitch.me");
        PublicKey.User user = new PublicKey.User("1", "1", "zVhLeF2FAMEfY2HRbG48OyJSYg-LiMsHKArgn9KeG8w");
        List listGEmmrt = yDY.gEmmrt(new PublicKey.PubKeyCredParam("public-key", -7), new PublicKey.PubKeyCredParam("public-key", -257));
        STUB_GOOGLE = new RegistrationStartResponse(new PublicKey(new PublicKey.Extensions(true), "none", "1lPJTUOGACtxvd5c3n1VRK9wGK-gXmdvSD8zfT-Y8IY", new PublicKey.AuthenticatorSelection("required", Boolean.FALSE, ""), user, rp, 1800000, yDY.AhwBna(), listGEmmrt));
        STUB_OKX = new RegistrationStartResponse(new PublicKey(new PublicKey.Extensions(true), DevicePublicKeyStringDef.DIRECT, "s72pBDPaIciHuJ-kAC6B-RFJF4-yAlzf3iTiXN0WoYo", new PublicKey.AuthenticatorSelection("required", Boolean.TRUE, "required"), new PublicKey.User("abc abc", "abc@abc.com", "E1wo-MH3WdWG03uWwQSy1j6NpnWlAKfDA4_p4whLidAbeae0w-IULiKvaT_l6cnjIY9Szl2hbphYCzkPmjwgLQ"), new PublicKey.Rp("OKX", "emphasized-adventurous-drawbridge.glitch.me"), 6000, yDY.AhwBna(), yDY.gEmmrt(new PublicKey.PubKeyCredParam("public-key", -7), new PublicKey.PubKeyCredParam("public-key", -35), new PublicKey.PubKeyCredParam("public-key", -36), new PublicKey.PubKeyCredParam("public-key", -257), new PublicKey.PubKeyCredParam("public-key", -258), new PublicKey.PubKeyCredParam("public-key", -259))));
    }

    @Serializable
    public static final class PublicKey implements Parcelable {

        @SerializedName("attestation")
        private final String attestation;

        @SerializedName("authenticatorSelection")
        private final AuthenticatorSelection authenticatorSelection;

        @SerializedName(ClientData.KEY_CHALLENGE)
        private final String challenge;

        @SerializedName("excludeCredentials")
        private final List<CredentialDescriptor> excludeCredentials;

        @SerializedName("extensions")
        private final Extensions extensions;

        @SerializedName("pubKeyCredParams")
        private final List<PubKeyCredParam> pubKeyCredParams;

        @SerializedName("rp")
        private final Rp rp;

        @SerializedName("timeout")
        private final int timeout;

        @SerializedName("user")
        private final User user;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<PublicKey> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(RegistrationStartResponse$PublicKey$CredentialDescriptor$$serializer.INSTANCE), new ArrayListSerializer(RegistrationStartResponse$PublicKey$PubKeyCredParam$$serializer.INSTANCE)};

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<PublicKey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PublicKey createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                ArrayList arrayList2 = null;
                Extensions extensionsCreateFromParcel = parcel.readInt() == 0 ? null : Extensions.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                AuthenticatorSelection authenticatorSelectionCreateFromParcel = parcel.readInt() == 0 ? null : AuthenticatorSelection.CREATOR.createFromParcel(parcel);
                User userCreateFromParcel = parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel);
                Rp rpCreateFromParcel = parcel.readInt() == 0 ? null : Rp.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        arrayList.add(CredentialDescriptor.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i4 = parcel.readInt();
                    arrayList2 = new ArrayList(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList2.add(PubKeyCredParam.CREATOR.createFromParcel(parcel));
                    }
                }
                return new PublicKey(extensionsCreateFromParcel, string, string2, authenticatorSelectionCreateFromParcel, userCreateFromParcel, rpCreateFromParcel, i, arrayList, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PublicKey[] newArray(int i) {
                return new PublicKey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions component1() {
            return this.extensions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.attestation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticatorSelection component4() {
            return this.authenticatorSelection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final User component5() {
            return this.user;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rp component6() {
            return this.rp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component7() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CredentialDescriptor> component8() {
            return this.excludeCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PubKeyCredParam> component9() {
            return this.pubKeyCredParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PublicKey copy(Extensions extensions, String str, String str2, AuthenticatorSelection authenticatorSelection, User user, Rp rp, int i, List<CredentialDescriptor> list, List<PubKeyCredParam> list2) {
            return new PublicKey(extensions, str, str2, authenticatorSelection, user, rp, i, list, list2);
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
            if (!(obj instanceof PublicKey)) {
                return false;
            }
            PublicKey publicKey = (PublicKey) obj;
            return Intrinsics.EZpvd(this.extensions, publicKey.extensions) && Intrinsics.EZpvd((Object) this.attestation, (Object) publicKey.attestation) && Intrinsics.EZpvd((Object) this.challenge, (Object) publicKey.challenge) && Intrinsics.EZpvd(this.authenticatorSelection, publicKey.authenticatorSelection) && Intrinsics.EZpvd(this.user, publicKey.user) && Intrinsics.EZpvd(this.rp, publicKey.rp) && this.timeout == publicKey.timeout && Intrinsics.EZpvd(this.excludeCredentials, publicKey.excludeCredentials) && Intrinsics.EZpvd(this.pubKeyCredParams, publicKey.pubKeyCredParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAttestation() {
            return this.attestation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticatorSelection getAuthenticatorSelection() {
            return this.authenticatorSelection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChallenge() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CredentialDescriptor> getExcludeCredentials() {
            return this.excludeCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions getExtensions() {
            return this.extensions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PubKeyCredParam> getPubKeyCredParams() {
            return this.pubKeyCredParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rp getRp() {
            return this.rp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTimeout() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final User getUser() {
            return this.user;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Extensions extensions = this.extensions;
            int iHashCode = extensions == null ? 0 : extensions.hashCode();
            String str = this.attestation;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.challenge;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            AuthenticatorSelection authenticatorSelection = this.authenticatorSelection;
            int iHashCode4 = authenticatorSelection == null ? 0 : authenticatorSelection.hashCode();
            User user = this.user;
            int iHashCode5 = user == null ? 0 : user.hashCode();
            Rp rp = this.rp;
            int iHashCode6 = rp == null ? 0 : rp.hashCode();
            int iHashCode7 = Integer.hashCode(this.timeout);
            List<CredentialDescriptor> list = this.excludeCredentials;
            int iHashCode8 = list == null ? 0 : list.hashCode();
            List<PubKeyCredParam> list2 = this.pubKeyCredParams;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PublicKey(extensions=" + this.extensions + ", attestation=" + this.attestation + ", challenge=" + this.challenge + ", authenticatorSelection=" + this.authenticatorSelection + ", user=" + this.user + ", rp=" + this.rp + ", timeout=" + this.timeout + ", excludeCredentials=" + this.excludeCredentials + ", pubKeyCredParams=" + this.pubKeyCredParams + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double toTimeOutSeconds() {
            return this.timeout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Extensions extensions = this.extensions;
            if (extensions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extensions.writeToParcel(parcel, i);
            }
            parcel.writeString(this.attestation);
            parcel.writeString(this.challenge);
            AuthenticatorSelection authenticatorSelection = this.authenticatorSelection;
            if (authenticatorSelection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                authenticatorSelection.writeToParcel(parcel, i);
            }
            User user = this.user;
            if (user == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                user.writeToParcel(parcel, i);
            }
            Rp rp = this.rp;
            if (rp == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                rp.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.timeout);
            List<CredentialDescriptor> list = this.excludeCredentials;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<CredentialDescriptor> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
            List<PubKeyCredParam> list2 = this.pubKeyCredParams;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PubKeyCredParam> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PublicKey> serializer() {
                return RegistrationStartResponse$PublicKey$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PublicKey(int i, Extensions extensions, String str, String str2, AuthenticatorSelection authenticatorSelection, User user, Rp rp, int i2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if (64 != (i & 64)) {
                PluginExceptionsKt.throwMissingFieldException(i, 64, RegistrationStartResponse$PublicKey$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.extensions = null;
            } else {
                this.extensions = extensions;
            }
            if ((i & 2) == 0) {
                this.attestation = null;
            } else {
                this.attestation = str;
            }
            if ((i & 4) == 0) {
                this.challenge = null;
            } else {
                this.challenge = str2;
            }
            if ((i & 8) == 0) {
                this.authenticatorSelection = null;
            } else {
                this.authenticatorSelection = authenticatorSelection;
            }
            if ((i & 16) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
            if ((i & 32) == 0) {
                this.rp = null;
            } else {
                this.rp = rp;
            }
            this.timeout = i2;
            if ((i & 128) == 0) {
                this.excludeCredentials = null;
            } else {
                this.excludeCredentials = list;
            }
            if ((i & 256) == 0) {
                this.pubKeyCredParams = null;
            } else {
                this.pubKeyCredParams = list2;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(PublicKey publicKey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || publicKey.extensions != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE, publicKey.extensions);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || publicKey.attestation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, publicKey.attestation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || publicKey.challenge != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, publicKey.challenge);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || publicKey.authenticatorSelection != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RegistrationStartResponse$PublicKey$AuthenticatorSelection$$serializer.INSTANCE, publicKey.authenticatorSelection);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || publicKey.user != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, RegistrationStartResponse$PublicKey$User$$serializer.INSTANCE, publicKey.user);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || publicKey.rp != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, RegistrationStartResponse$PublicKey$Rp$$serializer.INSTANCE, publicKey.rp);
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 6, publicKey.timeout);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || publicKey.excludeCredentials != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], publicKey.excludeCredentials);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && publicKey.pubKeyCredParams == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], publicKey.pubKeyCredParams);
        }

        public PublicKey(Extensions extensions, String str, String str2, AuthenticatorSelection authenticatorSelection, User user, Rp rp, int i, List<CredentialDescriptor> list, List<PubKeyCredParam> list2) {
            this.extensions = extensions;
            this.attestation = str;
            this.challenge = str2;
            this.authenticatorSelection = authenticatorSelection;
            this.user = user;
            this.rp = rp;
            this.timeout = i;
            this.excludeCredentials = list;
            this.pubKeyCredParams = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Extensions:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Extensions) : (r14v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Extensions))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$AuthenticatorSelection:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$AuthenticatorSelection) : (r17v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$AuthenticatorSelection))
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$User:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$User) : (r18v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$User))
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Rp:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Rp) : (r19v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Rp))
  (r20v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
 A[MD:(com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Extensions, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$AuthenticatorSelection, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$User, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Rp, int, java.util.List<com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$CredentialDescriptor>, java.util.List<com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$PubKeyCredParam>):void (m)] (LINE:144) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.<init>(com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Extensions, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$AuthenticatorSelection, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$User, com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$Rp, int, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ PublicKey(Extensions extensions, String str, String str2, AuthenticatorSelection authenticatorSelection, User user, Rp rp, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : extensions, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : authenticatorSelection, (i2 & 16) != 0 ? null : user, (i2 & 32) != 0 ? null : rp, i, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2);
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Serializable
        public static final class Extensions implements Parcelable {
            public static final int $stable = 0;

            @SerializedName("credProps")
            private final boolean credProps;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Extensions> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Extensions> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Extensions createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Extensions(parcel.readInt() != 0);
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
            public static /* synthetic */ Extensions copy$default(Extensions extensions, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = extensions.credProps;
                }
                return extensions.copy(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component1() {
                return this.credProps;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Extensions copy(boolean z) {
                return new Extensions(z);
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
                return (obj instanceof Extensions) && this.credProps == ((Extensions) obj).credProps;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getCredProps() {
                return this.credProps;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.credProps);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Extensions(credProps=" + this.credProps + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(this.credProps ? 1 : 0);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.Extensions.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Extensions> serializer() {
                    return RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Extensions(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, RegistrationStartResponse$PublicKey$Extensions$$serializer.INSTANCE.getDescriptor());
                }
                this.credProps = z;
            }

            public Extensions(boolean z) {
                this.credProps = z;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Serializable
        public static final class AuthenticatorSelection implements Parcelable {
            public static final int $stable = 0;

            @SerializedName("requireResidentKey")
            private final Boolean requireResidentKey;

            @SerializedName("residentKey")
            private final String residentKey;

            @SerializedName("userVerification")
            private final String userVerification;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<AuthenticatorSelection> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<AuthenticatorSelection> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AuthenticatorSelection createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AuthenticatorSelection(string, boolValueOf, parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AuthenticatorSelection[] newArray(int i) {
                    return new AuthenticatorSelection[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AuthenticatorSelection() {
                this((String) null, (Boolean) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ AuthenticatorSelection copy$default(AuthenticatorSelection authenticatorSelection, String str, Boolean bool, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = authenticatorSelection.userVerification;
                }
                if ((i & 2) != 0) {
                    bool = authenticatorSelection.requireResidentKey;
                }
                if ((i & 4) != 0) {
                    str2 = authenticatorSelection.residentKey;
                }
                return authenticatorSelection.copy(str, bool, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.userVerification;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean component2() {
                return this.requireResidentKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.residentKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthenticatorSelection copy(String str, Boolean bool, String str2) {
                return new AuthenticatorSelection(str, bool, str2);
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
                if (!(obj instanceof AuthenticatorSelection)) {
                    return false;
                }
                AuthenticatorSelection authenticatorSelection = (AuthenticatorSelection) obj;
                return Intrinsics.EZpvd((Object) this.userVerification, (Object) authenticatorSelection.userVerification) && Intrinsics.EZpvd(this.requireResidentKey, authenticatorSelection.requireResidentKey) && Intrinsics.EZpvd((Object) this.residentKey, (Object) authenticatorSelection.residentKey);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean getRequireResidentKey() {
                return this.requireResidentKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getResidentKey() {
                return this.residentKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUserVerification() {
                return this.userVerification;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.userVerification;
                int iHashCode = str == null ? 0 : str.hashCode();
                Boolean bool = this.requireResidentKey;
                int iHashCode2 = bool == null ? 0 : bool.hashCode();
                String str2 = this.residentKey;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AuthenticatorSelection(userVerification=" + this.userVerification + ", requireResidentKey=" + this.requireResidentKey + ", residentKey=" + this.residentKey + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v5, types: [int] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                ?? BooleanValue;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.userVerification);
                Boolean bool = this.requireResidentKey;
                if (bool == null) {
                    BooleanValue = 0;
                } else {
                    parcel.writeInt(1);
                    BooleanValue = bool.booleanValue();
                }
                parcel.writeInt(BooleanValue);
                parcel.writeString(this.residentKey);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.AuthenticatorSelection.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<AuthenticatorSelection> serializer() {
                    return RegistrationStartResponse$PublicKey$AuthenticatorSelection$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ AuthenticatorSelection(int i, String str, Boolean bool, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.userVerification = null;
                } else {
                    this.userVerification = str;
                }
                if ((i & 2) == 0) {
                    this.requireResidentKey = null;
                } else {
                    this.requireResidentKey = bool;
                }
                if ((i & 4) == 0) {
                    this.residentKey = null;
                } else {
                    this.residentKey = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_impl(AuthenticatorSelection authenticatorSelection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authenticatorSelection.userVerification != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, authenticatorSelection.userVerification);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authenticatorSelection.requireResidentKey != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, authenticatorSelection.requireResidentKey);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && authenticatorSelection.residentKey == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authenticatorSelection.residentKey);
            }

            public AuthenticatorSelection(String str, Boolean bool, String str2) {
                this.userVerification = str;
                this.requireResidentKey = bool;
                this.residentKey = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:176) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.AuthenticatorSelection.<init>(java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
            public /* synthetic */ AuthenticatorSelection(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
            }
        }

        @Serializable
        public static final class User implements Parcelable {
            public static final int $stable = 0;

            @SerializedName(AppLocaleInfo.KEY_DISPLAY_NAME)
            private final String displayName;

            @SerializedName("id")
            private final String id;

            @SerializedName("name")
            private final String name;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<User> CREATOR = new Creator();

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Creator implements Parcelable.Creator<User> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final User createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new User(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final User[] newArray(int i) {
                    return new User[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public User() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = user.displayName;
                }
                if ((i & 2) != 0) {
                    str2 = user.name;
                }
                if ((i & 4) != 0) {
                    str3 = user.id;
                }
                return user.copy(str, str2, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.displayName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final User copy(String str, String str2, String str3) {
                return new User(str, str2, str3);
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
                if (!(obj instanceof User)) {
                    return false;
                }
                User user = (User) obj;
                return Intrinsics.EZpvd((Object) this.displayName, (Object) user.displayName) && Intrinsics.EZpvd((Object) this.name, (Object) user.name) && Intrinsics.EZpvd((Object) this.id, (Object) user.id);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDisplayName() {
                return this.displayName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.displayName;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.name;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.id;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "User(displayName=" + this.displayName + ", name=" + this.name + ", id=" + this.id + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.displayName);
                parcel.writeString(this.name);
                parcel.writeString(this.id);
            }

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.User.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<User> serializer() {
                    return RegistrationStartResponse$PublicKey$User$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ User(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.displayName = null;
                } else {
                    this.displayName = str;
                }
                if ((i & 2) == 0) {
                    this.name = null;
                } else {
                    this.name = str2;
                }
                if ((i & 4) == 0) {
                    this.id = null;
                } else {
                    this.id = str3;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_impl(User user, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || user.displayName != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, user.displayName);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || user.name != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, user.name);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && user.id == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, user.id);
            }

            public User(String str, String str2, String str3) {
                this.displayName = str;
                this.name = str2;
                this.id = str3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:188) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.User.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ User(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }

            public final PublicKeyCredentialUserEntity toPublicKeyCredentialUserEntity() {
                byte[] bArrAEQbTJ;
                String str = this.id;
                if (str == null || (bArrAEQbTJ = C6617aSi.AEQbTJ(str)) == null) {
                    bArrAEQbTJ = new byte[0];
                }
                String str2 = this.name;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.displayName;
                if (str3 == null) {
                    str3 = "";
                }
                return new PublicKeyCredentialUserEntity(bArrAEQbTJ, str2, "", str3);
            }
        }

        @Serializable
        public static final class Rp implements Parcelable {
            public static final int $stable = 0;

            @SerializedName("id")
            private final String id;

            @SerializedName("name")
            private final String name;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Rp> CREATOR = new Creator();

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Creator implements Parcelable.Creator<Rp> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rp createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Rp(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rp[] newArray(int i) {
                    return new Rp[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Rp() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Rp copy$default(Rp rp, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rp.name;
                }
                if ((i & 2) != 0) {
                    str2 = rp.id;
                }
                return rp.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Rp copy(String str, String str2) {
                return new Rp(str, str2);
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
                if (!(obj instanceof Rp)) {
                    return false;
                }
                Rp rp = (Rp) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) rp.name) && Intrinsics.EZpvd((Object) this.id, (Object) rp.id);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.name;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.id;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Rp(name=" + this.name + ", id=" + this.id + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.name);
                parcel.writeString(this.id);
            }

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.Rp.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Rp> serializer() {
                    return RegistrationStartResponse$PublicKey$Rp$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Rp(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.name = null;
                } else {
                    this.name = str;
                }
                if ((i & 2) == 0) {
                    this.id = null;
                } else {
                    this.id = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_impl(Rp rp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rp.name != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rp.name);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && rp.id == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rp.id);
            }

            public Rp(String str, String str2) {
                this.name = str;
                this.id = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:209) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.Rp.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ Rp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final PublicKeyCredentialRpEntity toPublicKeyCredentialRpEntity() {
                String str = this.id;
                if (str == null) {
                    str = "";
                }
                String str2 = this.name;
                return new PublicKeyCredentialRpEntity(str, str2 != null ? str2 : "", null);
            }
        }

        @Serializable
        public static final class CredentialDescriptor implements Parcelable {

            @SerializedName("id")
            private final String id;

            @SerializedName("transports")
            private final List<String> transports;

            @SerializedName("type")
            private final String type;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<CredentialDescriptor> CREATOR = new Creator();
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Creator implements Parcelable.Creator<CredentialDescriptor> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CredentialDescriptor createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new CredentialDescriptor(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CredentialDescriptor[] newArray(int i) {
                    return new CredentialDescriptor[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public CredentialDescriptor() {
                this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.RegistrationStartResponse$PublicKey$CredentialDescriptor */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CredentialDescriptor copy$default(CredentialDescriptor credentialDescriptor, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = credentialDescriptor.id;
                }
                if ((i & 2) != 0) {
                    str2 = credentialDescriptor.type;
                }
                if ((i & 4) != 0) {
                    list = credentialDescriptor.transports;
                }
                return credentialDescriptor.copy(str, str2, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component3() {
                return this.transports;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialDescriptor copy(String str, String str2, List<String> list) {
                return new CredentialDescriptor(str, str2, list);
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
                if (!(obj instanceof CredentialDescriptor)) {
                    return false;
                }
                CredentialDescriptor credentialDescriptor = (CredentialDescriptor) obj;
                return Intrinsics.EZpvd((Object) this.id, (Object) credentialDescriptor.id) && Intrinsics.EZpvd((Object) this.type, (Object) credentialDescriptor.type) && Intrinsics.EZpvd(this.transports, credentialDescriptor.transports);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getTransports() {
                return this.transports;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.id;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.type;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                List<String> list = this.transports;
                return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CredentialDescriptor(id=" + this.id + ", type=" + this.type + ", transports=" + this.transports + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.type);
                parcel.writeStringList(this.transports);
            }

            /* JADX INFO: loaded from: classes17.dex */
            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.CredentialDescriptor.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<CredentialDescriptor> serializer() {
                    return RegistrationStartResponse$PublicKey$CredentialDescriptor$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ CredentialDescriptor(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.id = null;
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.type = null;
                } else {
                    this.type = str2;
                }
                if ((i & 4) == 0) {
                    this.transports = null;
                } else {
                    this.transports = list;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_impl(CredentialDescriptor credentialDescriptor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || credentialDescriptor.id != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, credentialDescriptor.id);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || credentialDescriptor.type != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, credentialDescriptor.type);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && credentialDescriptor.transports == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], credentialDescriptor.transports);
            }

            public CredentialDescriptor(String str, String str2, List<String> list) {
                this.id = str;
                this.type = str2;
                this.transports = list;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:227) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.CredentialDescriptor.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
            public /* synthetic */ CredentialDescriptor(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        @Serializable
        public static final class PubKeyCredParam implements Parcelable {
            public static final int $stable = 0;

            @SerializedName("alg")
            private final Integer alg;

            @SerializedName("type")
            private final String type;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<PubKeyCredParam> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<PubKeyCredParam> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PubKeyCredParam createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new PubKeyCredParam(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PubKeyCredParam[] newArray(int i) {
                    return new PubKeyCredParam[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public PubKeyCredParam() {
                this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PubKeyCredParam copy$default(PubKeyCredParam pubKeyCredParam, String str, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pubKeyCredParam.type;
                }
                if ((i & 2) != 0) {
                    num = pubKeyCredParam.alg;
                }
                return pubKeyCredParam.copy(str, num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer component2() {
                return this.alg;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PubKeyCredParam copy(String str, Integer num) {
                return new PubKeyCredParam(str, num);
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
                if (!(obj instanceof PubKeyCredParam)) {
                    return false;
                }
                PubKeyCredParam pubKeyCredParam = (PubKeyCredParam) obj;
                return Intrinsics.EZpvd((Object) this.type, (Object) pubKeyCredParam.type) && Intrinsics.EZpvd(this.alg, pubKeyCredParam.alg);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer getAlg() {
                return this.alg;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.type;
                int iHashCode = str == null ? 0 : str.hashCode();
                Integer num = this.alg;
                return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PubKeyCredParam(type=" + this.type + ", alg=" + this.alg + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.type);
                Integer num = this.alg;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.PubKeyCredParam.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<PubKeyCredParam> serializer() {
                    return RegistrationStartResponse$PublicKey$PubKeyCredParam$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ PubKeyCredParam(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.type = null;
                } else {
                    this.type = str;
                }
                if ((i & 2) == 0) {
                    this.alg = null;
                } else {
                    this.alg = num;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_impl(PubKeyCredParam pubKeyCredParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pubKeyCredParam.type != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pubKeyCredParam.type);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && pubKeyCredParam.alg == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, pubKeyCredParam.alg);
            }

            public PubKeyCredParam(String str, Integer num) {
                this.type = str;
                this.alg = num;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:239) call: com.okinc.auth.impl.passkey.model.RegistrationStartResponse.PublicKey.PubKeyCredParam.<init>(java.lang.String, java.lang.Integer):void type: THIS */
            public /* synthetic */ PubKeyCredParam(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
            }
        }

        public final AttestationConveyancePreference toAttestationConveyancePreference() throws AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException {
            String str = this.attestation;
            if (str == null) {
                str = "";
            }
            AttestationConveyancePreference attestationConveyancePreferenceFromString = AttestationConveyancePreference.fromString(str);
            Intrinsics.checkNotNullExpressionValue(attestationConveyancePreferenceFromString, "");
            return attestationConveyancePreferenceFromString;
        }

        public final List<PublicKeyCredentialParameters> toPublicKeyCredentialParametersList() {
            List<PublicKeyCredentialParameters> listAxsJAYsNCnLh;
            List<PubKeyCredParam> list = this.pubKeyCredParams;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (PubKeyCredParam pubKeyCredParam : list) {
                    String type = pubKeyCredParam.getType();
                    if (type == null) {
                        type = "";
                    }
                    Integer alg = pubKeyCredParam.getAlg();
                    arrayList.add(new PublicKeyCredentialParameters(type, alg != null ? alg.intValue() : -1));
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            } else {
                listAxsJAYsNCnLh = null;
            }
            return listAxsJAYsNCnLh == null ? yDY.AhwBna() : listAxsJAYsNCnLh;
        }

        public final List<PublicKeyCredentialDescriptor> toPublicKeyCredentialDescriptorList() {
            byte[] bArrAEQbTJ;
            List listAhwBna;
            Object objM7377constructorimpl;
            List<CredentialDescriptor> list = this.excludeCredentials;
            List<PublicKeyCredentialDescriptor> listAxsJAYsNCnLh = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (CredentialDescriptor credentialDescriptor : list) {
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    String id = credentialDescriptor.getId();
                    if (id == null || (bArrAEQbTJ = C6617aSi.AEQbTJ(id)) == null) {
                        bArrAEQbTJ = new byte[0];
                    }
                    List<String> transports = credentialDescriptor.getTransports();
                    if (transports != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : transports) {
                            try {
                                Result.Application application = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(Transport.fromString(str));
                            } catch (Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                                objM7377constructorimpl = null;
                            }
                            Transport transport = (Transport) objM7377constructorimpl;
                            if (transport != null) {
                                arrayList2.add(transport);
                            }
                        }
                        listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
                    } else {
                        listAhwBna = null;
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    arrayList.add(new PublicKeyCredentialDescriptor(string, bArrAEQbTJ, (List<Transport>) listAhwBna));
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            }
            return listAxsJAYsNCnLh == null ? yDY.AhwBna() : listAxsJAYsNCnLh;
        }
    }

    public static /* synthetic */ PublicKeyCredentialCreationOptions toPublicKeyCredentialCreationOptionsBuilder$default(RegistrationStartResponse registrationStartResponse, boolean z, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            passkeyPromotionAuthenticator = PasskeyPromotionAuthenticator.All.KWHzl;
        }
        return registrationStartResponse.toPublicKeyCredentialCreationOptionsBuilder(z, passkeyPromotionAuthenticator);
    }

    public final PublicKeyCredentialCreationOptions toPublicKeyCredentialCreationOptionsBuilder(boolean z, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator) {
        PublicKey.AuthenticatorSelection authenticatorSelection;
        PublicKey.AuthenticatorSelection authenticatorSelection2;
        PublicKey.Rp rp;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity;
        List<PublicKeyCredentialParameters> publicKeyCredentialParametersList;
        String challenge;
        byte[] bArrAEQbTJ;
        PublicKey.User user;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity;
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
        PublicKey publicKey = this.publicKey;
        if (publicKey != null && (user = publicKey.getUser()) != null && (publicKeyCredentialUserEntity = user.toPublicKeyCredentialUserEntity()) != null) {
            builder.setUser(publicKeyCredentialUserEntity);
        }
        PublicKey publicKey2 = this.publicKey;
        if (publicKey2 != null && (challenge = publicKey2.getChallenge()) != null && (bArrAEQbTJ = C6617aSi.AEQbTJ(challenge)) != null) {
            builder.setChallenge(bArrAEQbTJ);
        }
        PublicKey publicKey3 = this.publicKey;
        if (publicKey3 != null && (publicKeyCredentialParametersList = publicKey3.toPublicKeyCredentialParametersList()) != null) {
            builder.setParameters(publicKeyCredentialParametersList);
        }
        PublicKey publicKey4 = this.publicKey;
        if (publicKey4 != null) {
            builder.setTimeoutSeconds(Double.valueOf(publicKey4.toTimeOutSeconds()));
        }
        PublicKey publicKey5 = this.publicKey;
        if (publicKey5 != null && (rp = publicKey5.getRp()) != null && (publicKeyCredentialRpEntity = rp.toPublicKeyCredentialRpEntity()) != null) {
            builder.setRp(publicKeyCredentialRpEntity);
        }
        PublicKey publicKey6 = this.publicKey;
        String residentKey = null;
        builder.setAttestationConveyancePreference(publicKey6 != null ? publicKey6.toAttestationConveyancePreference() : null);
        PublicKey publicKey7 = this.publicKey;
        builder.setExcludeList(publicKey7 != null ? publicKey7.toPublicKeyCredentialDescriptorList() : null);
        AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
        PublicKey publicKey8 = this.publicKey;
        builder2.setRequireResidentKey((publicKey8 == null || (authenticatorSelection2 = publicKey8.getAuthenticatorSelection()) == null) ? null : authenticatorSelection2.getRequireResidentKey());
        PublicKey publicKey9 = this.publicKey;
        if (publicKey9 != null && (authenticatorSelection = publicKey9.getAuthenticatorSelection()) != null) {
            residentKey = authenticatorSelection.getResidentKey();
        }
        if (residentKey == null) {
            residentKey = "";
        }
        builder2.setResidentKeyRequirement(ResidentKeyRequirement.fromString(residentKey));
        if (z) {
            builder2.setAttachment(Attachment.PLATFORM);
        } else if (C6614aSf.OLrzqt.KWHzl()) {
            pUU.AEQbTJ("Passkey ABTest - enabled external authenticator & " + passkeyPromotionAuthenticator);
            if (Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.ExternalOnly.EZpvd)) {
                builder2.setAttachment(Attachment.CROSS_PLATFORM);
            } else if (Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.InternalOnly.copydefault)) {
                builder2.setAttachment(Attachment.PLATFORM);
            } else {
                if (!Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.All.KWHzl)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            pUU.AEQbTJ("Passkey ABTest - disabled external authenticator");
            builder2.setAttachment(Attachment.PLATFORM);
        }
        builder.setAuthenticatorSelection(builder2.build());
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(publicKeyCredentialCreationOptionsBuild, "");
        return publicKeyCredentialCreationOptionsBuild;
    }
}
