package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Content implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> bold;
    private final String text;
    private final HashMap<String, String> ukLink;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Content> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Content> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Content createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            HashMap map2 = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                HashMap map3 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map3.put(parcel.readString(), parcel.readString());
                }
                map2 = map3;
            }
            return new Content(map, string, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Content[] newArray(int i) {
            return new Content[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Content() {
        this((HashMap) null, (String) null, (HashMap) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.Content */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Content copy$default(Content content, HashMap map, String str, HashMap map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = content.bold;
        }
        if ((i & 2) != 0) {
            str = content.text;
        }
        if ((i & 4) != 0) {
            map2 = content.ukLink;
        }
        return content.copy(map, str, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component1() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component3() {
        return this.ukLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Content copy(HashMap<String, String> map, String str, HashMap<String, String> map2) {
        return new Content(map, str, map2);
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
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return Intrinsics.EZpvd(this.bold, content.bold) && Intrinsics.EZpvd((Object) this.text, (Object) content.text) && Intrinsics.EZpvd(this.ukLink, content.ukLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getBold() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getUkLink() {
        return this.ukLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        HashMap<String, String> map = this.bold;
        int iHashCode = map == null ? 0 : map.hashCode();
        String str = this.text;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        HashMap<String, String> map2 = this.ukLink;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Content(bold=" + this.bold + ", text=" + this.text + ", ukLink=" + this.ukLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        HashMap<String, String> map = this.bold;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.text);
        HashMap<String, String> map2 = this.ukLink;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Content.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Content> serializer() {
            return Content$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new HashMapSerializer(stringSerializer, stringSerializer), null, new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ Content(int i, HashMap map, String str, HashMap map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bold = null;
        } else {
            this.bold = map;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 4) == 0) {
            this.ukLink = null;
        } else {
            this.ukLink = map2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Content content, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || content.bold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], content.bold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) content.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, content.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && content.ukLink == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], content.ukLink);
    }

    public Content(HashMap<String, String> map, String str, HashMap<String, String> map2) {
        this.bold = map;
        this.text = str;
        this.ukLink = map2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r2v0 java.util.HashMap))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r4v0 java.util.HashMap))
 A[MD:(java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:81) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Content.<init>(java.util.HashMap, java.lang.String, java.util.HashMap):void type: THIS */
    public /* synthetic */ Content(HashMap map, String str, HashMap map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : map2);
    }
}
