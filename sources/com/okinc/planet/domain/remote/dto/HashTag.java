package com.okinc.planet.domain.remote.dto;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class HashTag implements Parcelable {
    public final String activityKey;
    public final String deeplinkUrl;
    public final String linkUrl;
    public final List<Integer> position;
    public final String tag;
    public final Integer type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HashTag> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<HashTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HashTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new HashTag(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HashTag[] newArray(int i) {
            return new HashTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.planet.domain.remote.dto.HashTag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HashTag copy$default(HashTag hashTag, String str, String str2, List list, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hashTag.tag;
        }
        if ((i & 2) != 0) {
            str2 = hashTag.activityKey;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = hashTag.position;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = hashTag.linkUrl;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = hashTag.deeplinkUrl;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            num = hashTag.type;
        }
        return hashTag.KWHzl(str, str5, list2, str6, str7, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.activityKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashTag KWHzl(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HashTag(str, str2, list, str3, str4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> OLrzqt() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.deeplinkUrl;
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
        if (!(obj instanceof HashTag)) {
            return false;
        }
        HashTag hashTag = (HashTag) obj;
        return Intrinsics.EZpvd((Object) this.tag, (Object) hashTag.tag) && Intrinsics.EZpvd((Object) this.activityKey, (Object) hashTag.activityKey) && Intrinsics.EZpvd(this.position, hashTag.position) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) hashTag.linkUrl) && Intrinsics.EZpvd((Object) this.deeplinkUrl, (Object) hashTag.deeplinkUrl) && Intrinsics.EZpvd(this.type, hashTag.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer gEmmrt() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tag.hashCode();
        int iHashCode2 = this.activityKey.hashCode();
        int iHashCode3 = this.position.hashCode();
        String str = this.linkUrl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.deeplinkUrl;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.type;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HashTag(tag=" + this.tag + ", activityKey=" + this.activityKey + ", position=" + this.position + ", linkUrl=" + this.linkUrl + ", deeplinkUrl=" + this.deeplinkUrl + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tag);
        parcel.writeString(this.activityKey);
        List<Integer> list = this.position;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.deeplinkUrl);
        Integer num = this.type;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.HashTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HashTag> serializer() {
            return HashTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HashTag(int i, String str, String str2, List list, String str3, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, HashTag$$serializer.INSTANCE.getDescriptor());
        }
        this.tag = str;
        this.activityKey = str2;
        this.position = list;
        if ((i & 8) == 0) {
            this.linkUrl = null;
        } else {
            this.linkUrl = str3;
        }
        if ((i & 16) == 0) {
            this.deeplinkUrl = null;
        } else {
            this.deeplinkUrl = str4;
        }
        if ((i & 32) == 0) {
            this.type = 0;
        } else {
            this.type = num;
        }
    }

    public static final /* synthetic */ void AEQbTJ(HashTag hashTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hashTag.tag);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hashTag.activityKey);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], hashTag.position);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || hashTag.linkUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, hashTag.linkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || hashTag.deeplinkUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, hashTag.deeplinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = hashTag.type) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, hashTag.type);
        }
    }

    public HashTag(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tag = str;
        this.activityKey = str2;
        this.position = list;
        this.linkUrl = str3;
        this.deeplinkUrl = str4;
        this.type = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:55) call: com.okinc.planet.domain.remote.dto.HashTag.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ HashTag(String str, String str2, List list, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? 0 : num);
    }
}
