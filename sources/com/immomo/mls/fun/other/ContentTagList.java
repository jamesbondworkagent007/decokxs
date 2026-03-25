package com.immomo.mls.fun.other;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ContentTagList implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<BlueLinkTag> cashtagList;
    private List<BlueLinkTag> hashtagList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContentTagList> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContentTagList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTagList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BlueLinkTag.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(BlueLinkTag.CREATOR.createFromParcel(parcel));
            }
            return new ContentTagList(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTagList[] newArray(int i) {
            return new ContentTagList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentTagList() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.immomo.mls.fun.other.ContentTagList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentTagList copy$default(ContentTagList contentTagList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentTagList.cashtagList;
        }
        if ((i & 2) != 0) {
            list2 = contentTagList.hashtagList;
        }
        return contentTagList.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlueLinkTag> component1() {
        return this.cashtagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlueLinkTag> component2() {
        return this.hashtagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTagList copy(@NotNull List<BlueLinkTag> list, @NotNull List<BlueLinkTag> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ContentTagList(list, list2);
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
        if (!(obj instanceof ContentTagList)) {
            return false;
        }
        ContentTagList contentTagList = (ContentTagList) obj;
        return Intrinsics.EZpvd(this.cashtagList, contentTagList.cashtagList) && Intrinsics.EZpvd(this.hashtagList, contentTagList.hashtagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlueLinkTag> getCashtagList() {
        return this.cashtagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlueLinkTag> getHashtagList() {
        return this.hashtagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.cashtagList.hashCode() * 31) + this.hashtagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashtagList(@NotNull List<BlueLinkTag> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.cashtagList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHashtagList(@NotNull List<BlueLinkTag> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hashtagList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentTagList(cashtagList=" + this.cashtagList + ", hashtagList=" + this.hashtagList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<BlueLinkTag> list = this.cashtagList;
        parcel.writeInt(list.size());
        Iterator<BlueLinkTag> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<BlueLinkTag> list2 = this.hashtagList;
        parcel.writeInt(list2.size());
        Iterator<BlueLinkTag> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.other.ContentTagList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentTagList> serializer() {
            return ContentTagList$$serializer.INSTANCE;
        }
    }

    static {
        BlueLinkTag$$serializer blueLinkTag$$serializer = BlueLinkTag$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(blueLinkTag$$serializer), new ArrayListSerializer(blueLinkTag$$serializer)};
    }

    public /* synthetic */ ContentTagList(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.cashtagList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.hashtagList = new ArrayList();
        } else {
            this.hashtagList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$MLN_mlnservics(ContentTagList contentTagList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(contentTagList.cashtagList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], contentTagList.cashtagList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(contentTagList.hashtagList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], contentTagList.hashtagList);
    }

    public ContentTagList(@NotNull List<BlueLinkTag> list, @NotNull List<BlueLinkTag> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.cashtagList = list;
        this.hashtagList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:21) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:23) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.immomo.mls.fun.other.BlueLinkTag>, java.util.List<com.immomo.mls.fun.other.BlueLinkTag>):void (m)] (LINE:19) call: com.immomo.mls.fun.other.ContentTagList.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ContentTagList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
