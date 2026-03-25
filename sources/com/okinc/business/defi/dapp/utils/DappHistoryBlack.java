package com.okinc.business.defi.dapp.utils;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappHistoryBlack implements Parcelable {
    private final List<DappHistoryRegex> regexList;
    private final int version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappHistoryBlack> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DappHistoryRegex$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappHistoryBlack> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappHistoryBlack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DappHistoryRegex.CREATOR.createFromParcel(parcel));
            }
            return new DappHistoryBlack(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappHistoryBlack[] newArray(int i) {
            return new DappHistoryBlack[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.utils.DappHistoryBlack */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappHistoryBlack copy$default(DappHistoryBlack dappHistoryBlack, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dappHistoryBlack.version;
        }
        if ((i2 & 2) != 0) {
            list = dappHistoryBlack.regexList;
        }
        return dappHistoryBlack.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappHistoryRegex> component2() {
        return this.regexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappHistoryBlack copy(int i, @NotNull List<DappHistoryRegex> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DappHistoryBlack(i, list);
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
        if (!(obj instanceof DappHistoryBlack)) {
            return false;
        }
        DappHistoryBlack dappHistoryBlack = (DappHistoryBlack) obj;
        return this.version == dappHistoryBlack.version && Intrinsics.EZpvd(this.regexList, dappHistoryBlack.regexList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappHistoryRegex> getRegexList() {
        return this.regexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.regexList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappHistoryBlack(version=" + this.version + ", regexList=" + this.regexList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.version);
        List<DappHistoryRegex> list = this.regexList;
        parcel.writeInt(list.size());
        Iterator<DappHistoryRegex> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.utils.DappHistoryBlack.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappHistoryBlack> serializer() {
            return DappHistoryBlack$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappHistoryBlack(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DappHistoryBlack$$serializer.INSTANCE.getDescriptor());
        }
        this.version = i2;
        this.regexList = list;
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappHistoryBlack dappHistoryBlack, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, dappHistoryBlack.version);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dappHistoryBlack.regexList);
    }

    public DappHistoryBlack(int i, @NotNull List<DappHistoryRegex> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.version = i;
        this.regexList = list;
    }
}
