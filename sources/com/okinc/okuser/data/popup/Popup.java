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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Popup implements Parcelable {
    public final String content;
    public final boolean dismissible;
    public final List<Item> items;
    public final boolean show;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Popup> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(Item$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<Popup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Popup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Item.CREATOR.createFromParcel(parcel));
            }
            return new Popup(z, z2, string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Popup[] newArray(int i) {
            return new Popup[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okuser.data.popup.Popup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Popup copy$default(Popup popup, boolean z, boolean z2, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = popup.show;
        }
        if ((i & 2) != 0) {
            z2 = popup.dismissible;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = popup.title;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = popup.content;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = popup.items;
        }
        return popup.EZpvd(z, z3, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Popup EZpvd(boolean z, boolean z2, @NotNull String str, String str2, @NotNull List<Item> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Popup(z, z2, str, str2, list);
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
        if (!(obj instanceof Popup)) {
            return false;
        }
        Popup popup = (Popup) obj;
        return this.show == popup.show && this.dismissible == popup.dismissible && Intrinsics.EZpvd((Object) this.title, (Object) popup.title) && Intrinsics.EZpvd((Object) this.content, (Object) popup.content) && Intrinsics.EZpvd(this.items, popup.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.show);
        int iHashCode2 = Boolean.hashCode(this.dismissible);
        int iHashCode3 = this.title.hashCode();
        String str = this.content;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Popup(show=" + this.show + ", dismissible=" + this.dismissible + ", title=" + this.title + ", content=" + this.content + ", items=" + this.items + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.show ? 1 : 0);
        parcel.writeInt(this.dismissible ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        List<Item> list = this.items;
        parcel.writeInt(list.size());
        Iterator<Item> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.popup.Popup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Popup> serializer() {
            return Popup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Popup(int i, boolean z, boolean z2, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, Popup$$serializer.INSTANCE.getDescriptor());
        }
        this.show = z;
        this.dismissible = z2;
        this.title = str;
        this.content = str2;
        this.items = list;
    }

    public static final /* synthetic */ void OLrzqt(Popup popup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, popup.show);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, popup.dismissible);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, popup.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, popup.content);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], popup.items);
    }

    public Popup(boolean z, boolean z2, @NotNull String str, String str2, @NotNull List<Item> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.show = z;
        this.dismissible = z2;
        this.title = str;
        this.content = str2;
        this.items = list;
    }
}
