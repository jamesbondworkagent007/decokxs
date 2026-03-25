package com.okinc.okuser.data.popup;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Item implements Parcelable {
    public final String content;
    public final String displayType;
    public final Boolean isChecked;
    public final boolean mandatory;
    public final List<Param> params;
    public final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Item> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(Item$Param$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<Item> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Item createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Param.CREATOR.createFromParcel(parcel));
            }
            return new Item(string, string2, string3, z, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Item[] newArray(int i) {
            return new Item[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okuser.data.popup.Item */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, boolean z, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = item.type;
        }
        if ((i & 2) != 0) {
            str2 = item.content;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = item.displayType;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = item.mandatory;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = item.params;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = item.isChecked;
        }
        return item.EZpvd(str, str4, str5, z2, list2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Item EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<Param> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Item(str, str2, str3, z, list, bool);
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
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) item.type) && Intrinsics.EZpvd((Object) this.content, (Object) item.content) && Intrinsics.EZpvd((Object) this.displayType, (Object) item.displayType) && this.mandatory == item.mandatory && Intrinsics.EZpvd(this.params, item.params) && Intrinsics.EZpvd(this.isChecked, item.isChecked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.content.hashCode();
        int iHashCode3 = this.displayType.hashCode();
        int iHashCode4 = Boolean.hashCode(this.mandatory);
        int iHashCode5 = this.params.hashCode();
        Boolean bool = this.isChecked;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.content);
        parcel.writeString(this.displayType);
        parcel.writeInt(this.mandatory ? 1 : 0);
        List<Param> list = this.params;
        parcel.writeInt(list.size());
        Iterator<Param> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Boolean bool = this.isChecked;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.popup.Item.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Item> serializer() {
            return Item$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Item(int i, String str, String str2, String str3, boolean z, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, Item$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.content = str2;
        this.displayType = str3;
        this.mandatory = z;
        this.params = list;
        if ((i & 32) == 0) {
            this.isChecked = Boolean.FALSE;
        } else {
            this.isChecked = bool;
        }
    }

    public static final /* synthetic */ void EZpvd(Item item, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, item.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, item.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, item.displayType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, item.mandatory);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], item.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(item.isChecked, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, item.isChecked);
    }

    public Item(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<Param> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.content = str2;
        this.displayType = str3;
        this.mandatory = z;
        this.params = list;
        this.isChecked = bool;
    }

    public String toString() {
        return "Consent(type=" + this.type + ", mandatory=" + this.mandatory + ")";
    }

    @Serializable
    public static final class Param implements Parcelable {
        public static final int $stable = 0;
        public final String placeholder;
        public final String text;
        public final String type;
        public final String value;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Param> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Param> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Param createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Param(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Param[] newArray(int i) {
                return new Param[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Param copy$default(Param param, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.placeholder;
            }
            if ((i & 2) != 0) {
                str2 = param.text;
            }
            if ((i & 4) != 0) {
                str3 = param.value;
            }
            if ((i & 8) != 0) {
                str4 = param.type;
            }
            return param.AEQbTJ(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Param AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Param(str, str2, str3, str4);
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
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.EZpvd((Object) this.placeholder, (Object) param.placeholder) && Intrinsics.EZpvd((Object) this.text, (Object) param.text) && Intrinsics.EZpvd((Object) this.value, (Object) param.value) && Intrinsics.EZpvd((Object) this.type, (Object) param.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.placeholder.hashCode() * 31) + this.text.hashCode()) * 31) + this.value.hashCode()) * 31) + this.type.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Param(placeholder=" + this.placeholder + ", text=" + this.text + ", value=" + this.value + ", type=" + this.type + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.placeholder);
            parcel.writeString(this.text);
            parcel.writeString(this.value);
            parcel.writeString(this.type);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.popup.Item.Param.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Param> serializer() {
                return Item$Param$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Param(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, Item$Param$$serializer.INSTANCE.getDescriptor());
            }
            this.placeholder = str;
            this.text = str2;
            this.value = str3;
            this.type = str4;
        }

        public static final /* synthetic */ void copydefault(Param param, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, param.placeholder);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, param.text);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, param.value);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, param.type);
        }

        public Param(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.placeholder = str;
            this.text = str2;
            this.value = str3;
            this.type = str4;
        }
    }
}
