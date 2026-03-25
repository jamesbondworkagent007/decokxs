package com.okinc.business.invest_biz.data.bean;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33069mpW;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DisplayText implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> mapper;
    private final String rawValue;
    private final int resId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DisplayText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DisplayText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DisplayText(string, i, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayText[] newArray(int i) {
            return new DisplayText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DisplayText() {
        this((String) null, 0, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.DisplayText */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayText copy$default(DisplayText displayText, String str, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = displayText.rawValue;
        }
        if ((i2 & 2) != 0) {
            i = displayText.resId;
        }
        if ((i2 & 4) != 0) {
            map = displayText.mapper;
        }
        return displayText.copy(str, i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rawValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.resId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.mapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText copy(String str, int i, Map<String, String> map) {
        return new DisplayText(str, i, map);
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
        if (!(obj instanceof DisplayText)) {
            return false;
        }
        DisplayText displayText = (DisplayText) obj;
        return Intrinsics.EZpvd((Object) this.rawValue, (Object) displayText.rawValue) && this.resId == displayText.resId && Intrinsics.EZpvd(this.mapper, displayText.mapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getMapper() {
        return this.mapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResId() {
        return this.resId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rawValue;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.resId);
        Map<String, String> map = this.mapper;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisplayText(rawValue=" + this.rawValue + ", resId=" + this.resId + ", mapper=" + this.mapper + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rawValue);
        parcel.writeInt(this.resId);
        Map<String, String> map = this.mapper;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public /* synthetic */ DisplayText(int i, String str, int i2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rawValue = null;
        } else {
            this.rawValue = str;
        }
        if ((i & 2) == 0) {
            this.resId = 0;
        } else {
            this.resId = i2;
        }
        if ((i & 4) == 0) {
            this.mapper = null;
        } else {
            this.mapper = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DisplayText displayText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || displayText.rawValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, displayText.rawValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || displayText.resId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, displayText.resId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && displayText.mapper == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], displayText.mapper);
    }

    public DisplayText(String str, int i, Map<String, String> map) {
        this.rawValue = str;
        this.resId = i;
        this.mapper = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.lang.String, int, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:14) call: com.okinc.business.invest_biz.data.bean.DisplayText.<init>(java.lang.String, int, java.util.Map):void type: THIS */
    public /* synthetic */ DisplayText(String str, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : map);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.DisplayText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DisplayText> serializer() {
            return DisplayText$$serializer.INSTANCE;
        }

        public final DisplayText OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DisplayText(str, 0, (Map) null, 6, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.DisplayText$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayText fromStringResource$default(Companion companion, int i, Map map, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                map = null;
            }
            return companion.KWHzl(i, map);
        }

        public final DisplayText KWHzl(int i, Map<String, String> map) {
            return new DisplayText((String) null, i, map, 1, (DefaultConstructorMarker) null);
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public final String getString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String str = this.rawValue;
        if (str != null) {
            return str;
        }
        if (this.resId == 0) {
            return "";
        }
        Map<String, String> map = this.mapper;
        if (map == null || map.isEmpty()) {
            return C33070mpX.OLrzqt(this.resId, context);
        }
        return C33069mpW.KWHzl(context, this.resId, this.mapper);
    }
}
