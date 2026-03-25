package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PhoneRelationUpdateEntity {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String countryCode;
    private final String hash;
    private final String name;
    private final String nationalNumber;
    private final String phoneRelationId;
    private final String rawNumber;
    private final String rowId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PhoneRelationUpdateEntity copy$default(PhoneRelationUpdateEntity phoneRelationUpdateEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneRelationUpdateEntity.hash;
        }
        if ((i & 2) != 0) {
            str2 = phoneRelationUpdateEntity.rowId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = phoneRelationUpdateEntity.countryCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = phoneRelationUpdateEntity.phoneRelationId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = phoneRelationUpdateEntity.name;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = phoneRelationUpdateEntity.rawNumber;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = phoneRelationUpdateEntity.nationalNumber;
        }
        return phoneRelationUpdateEntity.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.phoneRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelationUpdateEntity copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PhoneRelationUpdateEntity(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRelationUpdateEntity)) {
            return false;
        }
        PhoneRelationUpdateEntity phoneRelationUpdateEntity = (PhoneRelationUpdateEntity) obj;
        return Intrinsics.EZpvd((Object) this.hash, (Object) phoneRelationUpdateEntity.hash) && Intrinsics.EZpvd((Object) this.rowId, (Object) phoneRelationUpdateEntity.rowId) && Intrinsics.EZpvd((Object) this.countryCode, (Object) phoneRelationUpdateEntity.countryCode) && Intrinsics.EZpvd((Object) this.phoneRelationId, (Object) phoneRelationUpdateEntity.phoneRelationId) && Intrinsics.EZpvd((Object) this.name, (Object) phoneRelationUpdateEntity.name) && Intrinsics.EZpvd((Object) this.rawNumber, (Object) phoneRelationUpdateEntity.rawNumber) && Intrinsics.EZpvd((Object) this.nationalNumber, (Object) phoneRelationUpdateEntity.nationalNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNationalNumber() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneRelationId() {
        return this.phoneRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawNumber() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.hash.hashCode();
        int iHashCode2 = this.rowId.hashCode();
        String str = this.countryCode;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.phoneRelationId.hashCode();
        String str2 = this.name;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.rawNumber.hashCode()) * 31) + this.nationalNumber.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PhoneRelationUpdateEntity(hash=" + this.hash + ", rowId=" + this.rowId + ", countryCode=" + this.countryCode + ", phoneRelationId=" + this.phoneRelationId + ", name=" + this.name + ", rawNumber=" + this.rawNumber + ", nationalNumber=" + this.nationalNumber + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.PhoneRelationUpdateEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PhoneRelationUpdateEntity> serializer() {
            return PhoneRelationUpdateEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PhoneRelationUpdateEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, PhoneRelationUpdateEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.hash = str;
        this.rowId = str2;
        this.countryCode = str3;
        this.phoneRelationId = str4;
        this.name = str5;
        this.rawNumber = str6;
        this.nationalNumber = str7;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PhoneRelationUpdateEntity phoneRelationUpdateEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, phoneRelationUpdateEntity.hash);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, phoneRelationUpdateEntity.rowId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, phoneRelationUpdateEntity.countryCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, phoneRelationUpdateEntity.phoneRelationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, phoneRelationUpdateEntity.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, phoneRelationUpdateEntity.rawNumber);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, phoneRelationUpdateEntity.nationalNumber);
    }

    public PhoneRelationUpdateEntity(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.hash = str;
        this.rowId = str2;
        this.countryCode = str3;
        this.phoneRelationId = str4;
        this.name = str5;
        this.rawNumber = str6;
        this.nationalNumber = str7;
    }
}
