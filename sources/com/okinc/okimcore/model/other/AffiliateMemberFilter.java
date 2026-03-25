package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AffiliateMemberFilter implements Parcelable {
    private final List<Long> identifyIds;
    private final InclusionType inclusionType;
    private final UserType userType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AffiliateMemberFilter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {UserType.CREATOR.serializer(), new ArrayListSerializer(LongSerializer.INSTANCE), InclusionType.CREATOR.serializer()};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<AffiliateMemberFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateMemberFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            UserType userType = (UserType) parcel.readParcelable(AffiliateMemberFilter.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new AffiliateMemberFilter(userType, arrayList, (InclusionType) parcel.readParcelable(AffiliateMemberFilter.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateMemberFilter[] newArray(int i) {
            return new AffiliateMemberFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.other.AffiliateMemberFilter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AffiliateMemberFilter copy$default(AffiliateMemberFilter affiliateMemberFilter, UserType userType, List list, InclusionType inclusionType, int i, Object obj) {
        if ((i & 1) != 0) {
            userType = affiliateMemberFilter.userType;
        }
        if ((i & 2) != 0) {
            list = affiliateMemberFilter.identifyIds;
        }
        if ((i & 4) != 0) {
            inclusionType = affiliateMemberFilter.inclusionType;
        }
        return affiliateMemberFilter.copy(userType, list, inclusionType);
    }

    @SerialName("scenarioType")
    public static /* synthetic */ void getUserType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserType component1() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.identifyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InclusionType component3() {
        return this.inclusionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateMemberFilter copy(@NotNull UserType userType, @NotNull List<Long> list, @NotNull InclusionType inclusionType) {
        Intrinsics.checkNotNullParameter(userType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(inclusionType, "");
        return new AffiliateMemberFilter(userType, list, inclusionType);
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
        if (!(obj instanceof AffiliateMemberFilter)) {
            return false;
        }
        AffiliateMemberFilter affiliateMemberFilter = (AffiliateMemberFilter) obj;
        return this.userType == affiliateMemberFilter.userType && Intrinsics.EZpvd(this.identifyIds, affiliateMemberFilter.identifyIds) && this.inclusionType == affiliateMemberFilter.inclusionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getIdentifyIds() {
        return this.identifyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InclusionType getInclusionType() {
        return this.inclusionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserType getUserType() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userType.hashCode() * 31) + this.identifyIds.hashCode()) * 31) + this.inclusionType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AffiliateMemberFilter(userType=" + this.userType + ", identifyIds=" + this.identifyIds + ", inclusionType=" + this.inclusionType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.userType, i);
        List<Long> list = this.identifyIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        parcel.writeParcelable(this.inclusionType, i);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.AffiliateMemberFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AffiliateMemberFilter> serializer() {
            return AffiliateMemberFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AffiliateMemberFilter(int i, UserType userType, List list, InclusionType inclusionType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AffiliateMemberFilter$$serializer.INSTANCE.getDescriptor());
        }
        this.userType = userType;
        this.identifyIds = list;
        this.inclusionType = inclusionType;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AffiliateMemberFilter affiliateMemberFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], affiliateMemberFilter.userType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], affiliateMemberFilter.identifyIds);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], affiliateMemberFilter.inclusionType);
    }

    public AffiliateMemberFilter(@NotNull UserType userType, @NotNull List<Long> list, @NotNull InclusionType inclusionType) {
        Intrinsics.checkNotNullParameter(userType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(inclusionType, "");
        this.userType = userType;
        this.identifyIds = list;
        this.inclusionType = inclusionType;
    }

    public final JsonObject toJsonObject() {
        return C33489mxS.KWHzl.OLrzqt(Companion.serializer(), this);
    }
}
