package com.okinc.okimcore.model.room.inhouseim;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DraftMessageModel implements Parcelable {
    private final String channelId;
    private final List<DraftMentionedStringRangeInfoModel> mentionedInfo;
    private final String message;
    private final String quotedMessageId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DraftMessageModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(DraftMentionedStringRangeInfoModel$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DraftMessageModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftMessageModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DraftMentionedStringRangeInfoModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DraftMessageModel(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DraftMessageModel[] newArray(int i) {
            return new DraftMessageModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.room.inhouseim.DraftMessageModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftMessageModel copy$default(DraftMessageModel draftMessageModel, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftMessageModel.channelId;
        }
        if ((i & 2) != 0) {
            str2 = draftMessageModel.message;
        }
        if ((i & 4) != 0) {
            str3 = draftMessageModel.quotedMessageId;
        }
        if ((i & 8) != 0) {
            list = draftMessageModel.mentionedInfo;
        }
        return draftMessageModel.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quotedMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DraftMentionedStringRangeInfoModel> component4() {
        return this.mentionedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel copy(@NotNull String str, String str2, String str3, List<DraftMentionedStringRangeInfoModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DraftMessageModel(str, str2, str3, list);
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
        if (!(obj instanceof DraftMessageModel)) {
            return false;
        }
        DraftMessageModel draftMessageModel = (DraftMessageModel) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) draftMessageModel.channelId) && Intrinsics.EZpvd((Object) this.message, (Object) draftMessageModel.message) && Intrinsics.EZpvd((Object) this.quotedMessageId, (Object) draftMessageModel.quotedMessageId) && Intrinsics.EZpvd(this.mentionedInfo, draftMessageModel.mentionedInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DraftMentionedStringRangeInfoModel> getMentionedInfo() {
        return this.mentionedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotedMessageId() {
        return this.quotedMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.quotedMessageId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<DraftMentionedStringRangeInfoModel> list = this.mentionedInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DraftMessageModel(channelId=" + this.channelId + ", message=" + this.message + ", quotedMessageId=" + this.quotedMessageId + ", mentionedInfo=" + this.mentionedInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.channelId);
        parcel.writeString(this.message);
        parcel.writeString(this.quotedMessageId);
        List<DraftMentionedStringRangeInfoModel> list = this.mentionedInfo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DraftMentionedStringRangeInfoModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.DraftMessageModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DraftMessageModel> serializer() {
            return DraftMessageModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DraftMessageModel(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, DraftMessageModel$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.quotedMessageId = null;
        } else {
            this.quotedMessageId = str3;
        }
        this.mentionedInfo = list;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(DraftMessageModel draftMessageModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, draftMessageModel.channelId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || draftMessageModel.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, draftMessageModel.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || draftMessageModel.quotedMessageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, draftMessageModel.quotedMessageId);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], draftMessageModel.mentionedInfo);
    }

    public DraftMessageModel(@NotNull String str, String str2, String str3, List<DraftMentionedStringRangeInfoModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.message = str2;
        this.quotedMessageId = str3;
        this.mentionedInfo = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (r5v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.okimcore.model.room.inhouseim.DraftMentionedStringRangeInfoModel>):void (m)] (LINE:11) call: com.okinc.okimcore.model.room.inhouseim.DraftMessageModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DraftMessageModel(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, list);
    }
}
