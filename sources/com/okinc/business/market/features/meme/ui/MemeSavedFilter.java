package com.okinc.business.market.features.meme.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeSavedFilter implements Parcelable {
    private final List<MemeSavedTabFilter> filters;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeSavedFilter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(MemeSavedTabFilter$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<MemeSavedFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSavedFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MemeSavedTabFilter.CREATOR.createFromParcel(parcel));
            }
            return new MemeSavedFilter(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSavedFilter[] newArray(int i) {
            return new MemeSavedFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSavedFilter() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.ui.MemeSavedFilter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeSavedFilter copy$default(MemeSavedFilter memeSavedFilter, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = memeSavedFilter.filters;
        }
        return memeSavedFilter.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSavedTabFilter> component1() {
        return this.filters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSavedFilter copy(@NotNull List<MemeSavedTabFilter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new MemeSavedFilter(list);
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
        return (obj instanceof MemeSavedFilter) && Intrinsics.EZpvd(this.filters, ((MemeSavedFilter) obj).filters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSavedTabFilter> getFilters() {
        return this.filters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.filters.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSavedFilter(filters=" + this.filters + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<MemeSavedTabFilter> list = this.filters;
        parcel.writeInt(list.size());
        Iterator<MemeSavedTabFilter> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.ui.MemeSavedFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeSavedFilter> serializer() {
            return MemeSavedFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeSavedFilter(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) != 0) {
            this.filters = list;
            return;
        }
        String str = null;
        List list2 = null;
        MemeFilter memeFilter = null;
        int i2 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.filters = yDY.gEmmrt(new MemeSavedTabFilter(str, list2, memeFilter, i2, defaultConstructorMarker), new MemeSavedTabFilter((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null), new MemeSavedTabFilter(str, list2, memeFilter, i2, defaultConstructorMarker));
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeSavedFilter memeSavedFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(memeSavedFilter.filters, yDY.gEmmrt(new MemeSavedTabFilter((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null), new MemeSavedTabFilter((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null), new MemeSavedTabFilter((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null)))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], memeSavedFilter.filters);
    }

    public MemeSavedFilter(@NotNull List<MemeSavedTabFilter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.filters = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MemeSavedFilter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            String str = null;
            List list2 = null;
            MemeFilter memeFilter = null;
            int i2 = 7;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            list = yDY.gEmmrt(new MemeSavedTabFilter(str, list2, memeFilter, i2, defaultConstructorMarker2), new MemeSavedTabFilter((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null), new MemeSavedTabFilter(str, list2, memeFilter, i2, defaultConstructorMarker2));
        }
        this(list);
    }
}
