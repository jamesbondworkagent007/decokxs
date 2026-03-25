package com.okinc.okimcore.model.room.inhouseim;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DraftMentionedStringRangeInfoModel implements Parcelable {
    public static final int $stable = 0;
    private final String content;
    private final String displayName;
    private final int rangeLocation;
    private final String sendName;
    private final String userId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DraftMentionedStringRangeInfoModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DraftMentionedStringRangeInfoModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftMentionedStringRangeInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DraftMentionedStringRangeInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftMentionedStringRangeInfoModel[] newArray(int i) {
            return new DraftMentionedStringRangeInfoModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DraftMentionedStringRangeInfoModel copy$default(DraftMentionedStringRangeInfoModel draftMentionedStringRangeInfoModel, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = draftMentionedStringRangeInfoModel.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = draftMentionedStringRangeInfoModel.content;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = draftMentionedStringRangeInfoModel.sendName;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = draftMentionedStringRangeInfoModel.displayName;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = draftMentionedStringRangeInfoModel.rangeLocation;
        }
        return draftMentionedStringRangeInfoModel.copy(str, str5, str6, str7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sendName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.rangeLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMentionedStringRangeInfoModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DraftMentionedStringRangeInfoModel(str, str2, str3, str4, i);
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
        if (!(obj instanceof DraftMentionedStringRangeInfoModel)) {
            return false;
        }
        DraftMentionedStringRangeInfoModel draftMentionedStringRangeInfoModel = (DraftMentionedStringRangeInfoModel) obj;
        return Intrinsics.EZpvd((Object) this.userId, (Object) draftMentionedStringRangeInfoModel.userId) && Intrinsics.EZpvd((Object) this.content, (Object) draftMentionedStringRangeInfoModel.content) && Intrinsics.EZpvd((Object) this.sendName, (Object) draftMentionedStringRangeInfoModel.sendName) && Intrinsics.EZpvd((Object) this.displayName, (Object) draftMentionedStringRangeInfoModel.displayName) && this.rangeLocation == draftMentionedStringRangeInfoModel.rangeLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRangeLocation() {
        return this.rangeLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSendName() {
        return this.sendName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.content.hashCode()) * 31) + this.sendName.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.rangeLocation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DraftMentionedStringRangeInfoModel(userId=" + this.userId + ", content=" + this.content + ", sendName=" + this.sendName + ", displayName=" + this.displayName + ", rangeLocation=" + this.rangeLocation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userId);
        parcel.writeString(this.content);
        parcel.writeString(this.sendName);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.rangeLocation);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.DraftMentionedStringRangeInfoModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DraftMentionedStringRangeInfoModel> serializer() {
            return DraftMentionedStringRangeInfoModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DraftMentionedStringRangeInfoModel(int i, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, DraftMentionedStringRangeInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.content = str2;
        this.sendName = str3;
        this.displayName = str4;
        this.rangeLocation = i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(DraftMentionedStringRangeInfoModel draftMentionedStringRangeInfoModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, draftMentionedStringRangeInfoModel.userId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, draftMentionedStringRangeInfoModel.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, draftMentionedStringRangeInfoModel.sendName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, draftMentionedStringRangeInfoModel.displayName);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, draftMentionedStringRangeInfoModel.rangeLocation);
    }

    public DraftMentionedStringRangeInfoModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.userId = str;
        this.content = str2;
        this.sendName = str3;
        this.displayName = str4;
        this.rangeLocation = i;
    }
}
