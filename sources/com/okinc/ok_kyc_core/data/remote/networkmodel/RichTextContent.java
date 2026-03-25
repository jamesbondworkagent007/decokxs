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
public final class RichTextContent implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> bold;
    private final HashMap<String, LinkTextContent> link;
    private final HashMap<String, PopupTextContent> popup;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichTextContent> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RichTextContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextContent createFromParcel(Parcel parcel) {
            HashMap map;
            HashMap map2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            HashMap map3 = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                map2 = null;
            } else {
                int i3 = parcel.readInt();
                map2 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map2.put(parcel.readString(), LinkTextContent.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                map3 = new HashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    map3.put(parcel.readString(), PopupTextContent.CREATOR.createFromParcel(parcel));
                }
            }
            return new RichTextContent(string, map, map2, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichTextContent[] newArray(int i) {
            return new RichTextContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RichTextContent() {
        this((String) null, (HashMap) null, (HashMap) null, (HashMap) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichTextContent copy$default(RichTextContent richTextContent, String str, HashMap map, HashMap map2, HashMap map3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richTextContent.text;
        }
        if ((i & 2) != 0) {
            map = richTextContent.bold;
        }
        if ((i & 4) != 0) {
            map2 = richTextContent.link;
        }
        if ((i & 8) != 0) {
            map3 = richTextContent.popup;
        }
        return richTextContent.copy(str, map, map2, map3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component2() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, LinkTextContent> component3() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, PopupTextContent> component4() {
        return this.popup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextContent copy(String str, HashMap<String, String> map, HashMap<String, LinkTextContent> map2, HashMap<String, PopupTextContent> map3) {
        return new RichTextContent(str, map, map2, map3);
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
        if (!(obj instanceof RichTextContent)) {
            return false;
        }
        RichTextContent richTextContent = (RichTextContent) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) richTextContent.text) && Intrinsics.EZpvd(this.bold, richTextContent.bold) && Intrinsics.EZpvd(this.link, richTextContent.link) && Intrinsics.EZpvd(this.popup, richTextContent.popup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getBold() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, LinkTextContent> getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, PopupTextContent> getPopup() {
        return this.popup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        HashMap<String, String> map = this.bold;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        HashMap<String, LinkTextContent> map2 = this.link;
        int iHashCode3 = map2 == null ? 0 : map2.hashCode();
        HashMap<String, PopupTextContent> map3 = this.popup;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map3 != null ? map3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RichTextContent(text=" + this.text + ", bold=" + this.bold + ", link=" + this.link + ", popup=" + this.popup + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
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
        HashMap<String, LinkTextContent> map2 = this.link;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, LinkTextContent> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
        }
        HashMap<String, PopupTextContent> map3 = this.popup;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map3.size());
        for (Map.Entry<String, PopupTextContent> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            entry3.getValue().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichTextContent> serializer() {
            return RichTextContent$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new HashMapSerializer(stringSerializer, stringSerializer), new HashMapSerializer(stringSerializer, LinkTextContent$$serializer.INSTANCE), new HashMapSerializer(stringSerializer, PopupTextContent$$serializer.INSTANCE)};
    }

    public /* synthetic */ RichTextContent(int i, String str, HashMap map, HashMap map2, HashMap map3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.bold = null;
        } else {
            this.bold = map;
        }
        if ((i & 4) == 0) {
            this.link = null;
        } else {
            this.link = map2;
        }
        if ((i & 8) == 0) {
            this.popup = null;
        } else {
            this.popup = map3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(RichTextContent richTextContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || richTextContent.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, richTextContent.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || richTextContent.bold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], richTextContent.bold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || richTextContent.link != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], richTextContent.link);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && richTextContent.popup == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], richTextContent.popup);
    }

    public RichTextContent(String str, HashMap<String, String> map, HashMap<String, LinkTextContent> map2, HashMap<String, PopupTextContent> map3) {
        this.text = str;
        this.bold = map;
        this.link = map2;
        this.popup = map3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r3v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r4v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r5v0 java.util.HashMap))
 A[MD:(java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent>, java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent>):void (m)] (LINE:1901) call: com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent.<init>(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashMap):void type: THIS */
    public /* synthetic */ RichTextContent(String str, HashMap map, HashMap map2, HashMap map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, (i & 8) != 0 ? null : map3);
    }
}
