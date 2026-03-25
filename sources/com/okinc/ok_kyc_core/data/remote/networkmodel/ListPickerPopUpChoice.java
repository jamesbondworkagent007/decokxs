package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ListPickerPopUpChoice implements Parcelable {
    private final Boolean disabled;
    private final String subText;
    private final List<String> textList;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListPickerPopUpChoice> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<ListPickerPopUpChoice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUpChoice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ListPickerPopUpChoice(string, arrayListCreateStringArrayList, string2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUpChoice[] newArray(int i) {
            return new ListPickerPopUpChoice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListPickerPopUpChoice() {
        this((String) null, (List) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListPickerPopUpChoice copy$default(ListPickerPopUpChoice listPickerPopUpChoice, String str, List list, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listPickerPopUpChoice.value;
        }
        if ((i & 2) != 0) {
            list = listPickerPopUpChoice.textList;
        }
        if ((i & 4) != 0) {
            str2 = listPickerPopUpChoice.subText;
        }
        if ((i & 8) != 0) {
            bool = listPickerPopUpChoice.disabled;
        }
        return listPickerPopUpChoice.copy(str, list, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.textList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.disabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListPickerPopUpChoice copy(@NotNull String str, @NotNull List<String> list, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ListPickerPopUpChoice(str, list, str2, bool);
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
        if (!(obj instanceof ListPickerPopUpChoice)) {
            return false;
        }
        ListPickerPopUpChoice listPickerPopUpChoice = (ListPickerPopUpChoice) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) listPickerPopUpChoice.value) && Intrinsics.EZpvd(this.textList, listPickerPopUpChoice.textList) && Intrinsics.EZpvd((Object) this.subText, (Object) listPickerPopUpChoice.subText) && Intrinsics.EZpvd(this.disabled, listPickerPopUpChoice.disabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTextList() {
        return this.textList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.value.hashCode();
        int iHashCode2 = this.textList.hashCode();
        String str = this.subText;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.disabled;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListPickerPopUpChoice(value=" + this.value + ", textList=" + this.textList + ", subText=" + this.subText + ", disabled=" + this.disabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeStringList(this.textList);
        parcel.writeString(this.subText);
        Boolean bool = this.disabled;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListPickerPopUpChoice> serializer() {
            return ListPickerPopUpChoice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListPickerPopUpChoice(int i, String str, List list, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.value = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.textList = yDY.AhwBna();
        } else {
            this.textList = list;
        }
        if ((i & 4) == 0) {
            this.subText = null;
        } else {
            this.subText = str2;
        }
        if ((i & 8) == 0) {
            this.disabled = Boolean.FALSE;
        } else {
            this.disabled = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ListPickerPopUpChoice listPickerPopUpChoice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) listPickerPopUpChoice.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, listPickerPopUpChoice.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(listPickerPopUpChoice.textList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], listPickerPopUpChoice.textList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || listPickerPopUpChoice.subText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, listPickerPopUpChoice.subText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(listPickerPopUpChoice.disabled, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, listPickerPopUpChoice.disabled);
    }

    public ListPickerPopUpChoice(@NotNull String str, @NotNull List<String> list, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.value = str;
        this.textList = list;
        this.subText = str2;
        this.disabled = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4971)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0017: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean):void (m)] (LINE:4969) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ListPickerPopUpChoice(String str, List list, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool);
    }

    public final String getConcatenatedTextList() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.textList, "\n", null, null, 0, null, null, 62, null);
    }
}
