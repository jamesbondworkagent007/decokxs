package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SwitchNetworkInput implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<Long> popularGeneralChainIds;
    private final long selectedGeneralChainId;
    private final List<Long> supportedGeneralChainIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SwitchNetworkInput> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SwitchNetworkInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchNetworkInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            return new SwitchNetworkInput(j, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchNetworkInput[] newArray(int i) {
            return new SwitchNetworkInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.SwitchNetworkInput */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwitchNetworkInput copy$default(SwitchNetworkInput switchNetworkInput, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = switchNetworkInput.selectedGeneralChainId;
        }
        if ((i & 2) != 0) {
            list = switchNetworkInput.popularGeneralChainIds;
        }
        if ((i & 4) != 0) {
            list2 = switchNetworkInput.supportedGeneralChainIds;
        }
        return switchNetworkInput.copy(j, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.selectedGeneralChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.popularGeneralChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component3() {
        return this.supportedGeneralChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchNetworkInput copy(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SwitchNetworkInput(j, list, list2);
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
        if (!(obj instanceof SwitchNetworkInput)) {
            return false;
        }
        SwitchNetworkInput switchNetworkInput = (SwitchNetworkInput) obj;
        return this.selectedGeneralChainId == switchNetworkInput.selectedGeneralChainId && Intrinsics.EZpvd(this.popularGeneralChainIds, switchNetworkInput.popularGeneralChainIds) && Intrinsics.EZpvd(this.supportedGeneralChainIds, switchNetworkInput.supportedGeneralChainIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getPopularGeneralChainIds() {
        return this.popularGeneralChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSelectedGeneralChainId() {
        return this.selectedGeneralChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getSupportedGeneralChainIds() {
        return this.supportedGeneralChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.selectedGeneralChainId) * 31) + this.popularGeneralChainIds.hashCode()) * 31) + this.supportedGeneralChainIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchNetworkInput(selectedGeneralChainId=" + this.selectedGeneralChainId + ", popularGeneralChainIds=" + this.popularGeneralChainIds + ", supportedGeneralChainIds=" + this.supportedGeneralChainIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.selectedGeneralChainId);
        List<Long> list = this.popularGeneralChainIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        List<Long> list2 = this.supportedGeneralChainIds;
        parcel.writeInt(list2.size());
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.SwitchNetworkInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwitchNetworkInput> serializer() {
            return SwitchNetworkInput$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer)};
    }

    public /* synthetic */ SwitchNetworkInput(int i, long j, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SwitchNetworkInput$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedGeneralChainId = j;
        this.popularGeneralChainIds = list;
        this.supportedGeneralChainIds = list2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SwitchNetworkInput switchNetworkInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, switchNetworkInput.selectedGeneralChainId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], switchNetworkInput.popularGeneralChainIds);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], switchNetworkInput.supportedGeneralChainIds);
    }

    public SwitchNetworkInput(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.selectedGeneralChainId = j;
        this.popularGeneralChainIds = list;
        this.supportedGeneralChainIds = list2;
    }
}
