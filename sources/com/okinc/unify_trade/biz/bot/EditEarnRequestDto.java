package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C55810xqv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EditEarnRequestDto implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String earnMaxLimit;
    private final String earnMinLimit;
    private final EarnType earnType;
    private final Boolean enabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EditEarnRequestDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditEarnRequestDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditEarnRequestDto createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EditEarnRequestDto(string, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? EarnType.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditEarnRequestDto[] newArray(int i) {
            return new EditEarnRequestDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditEarnRequestDto copy$default(EditEarnRequestDto editEarnRequestDto, String str, Boolean bool, String str2, String str3, EarnType earnType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editEarnRequestDto.algoId;
        }
        if ((i & 2) != 0) {
            bool = editEarnRequestDto.enabled;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str2 = editEarnRequestDto.earnMinLimit;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = editEarnRequestDto.earnMaxLimit;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            earnType = editEarnRequestDto.earnType;
        }
        return editEarnRequestDto.copy(str, bool2, str4, str5, earnType);
    }

    @Serializable(with = C55810xqv.class)
    public static /* synthetic */ void getEarnType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType component5() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditEarnRequestDto copy(@NotNull String str, Boolean bool, String str2, String str3, EarnType earnType) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EditEarnRequestDto(str, bool, str2, str3, earnType);
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
        if (!(obj instanceof EditEarnRequestDto)) {
            return false;
        }
        EditEarnRequestDto editEarnRequestDto = (EditEarnRequestDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) editEarnRequestDto.algoId) && Intrinsics.EZpvd(this.enabled, editEarnRequestDto.enabled) && Intrinsics.EZpvd((Object) this.earnMinLimit, (Object) editEarnRequestDto.earnMinLimit) && Intrinsics.EZpvd((Object) this.earnMaxLimit, (Object) editEarnRequestDto.earnMaxLimit) && this.earnType == editEarnRequestDto.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMaxLimit() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMinLimit() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType getEarnType() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        Boolean bool = this.enabled;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.earnMinLimit;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.earnMaxLimit;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        EarnType earnType = this.earnType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (earnType != null ? earnType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditEarnRequestDto(algoId=" + this.algoId + ", enabled=" + this.enabled + ", earnMinLimit=" + this.earnMinLimit + ", earnMaxLimit=" + this.earnMaxLimit + ", earnType=" + this.earnType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.earnMinLimit);
        parcel.writeString(this.earnMaxLimit);
        EarnType earnType = this.earnType;
        if (earnType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnType.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.EditEarnRequestDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditEarnRequestDto> serializer() {
            return EditEarnRequestDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditEarnRequestDto(int i, String str, Boolean bool, String str2, String str3, EarnType earnType, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, EditEarnRequestDto$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.enabled = bool;
        this.earnMinLimit = str2;
        this.earnMaxLimit = str3;
        this.earnType = earnType;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EditEarnRequestDto editEarnRequestDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, editEarnRequestDto.algoId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, editEarnRequestDto.enabled);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, editEarnRequestDto.earnMinLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, editEarnRequestDto.earnMaxLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, C55810xqv.copydefault, editEarnRequestDto.earnType);
    }

    public EditEarnRequestDto(@NotNull String str, Boolean bool, String str2, String str3, EarnType earnType) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.enabled = bool;
        this.earnMinLimit = str2;
        this.earnMaxLimit = str3;
        this.earnType = earnType;
    }
}
