package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupAddMembersResult implements Parcelable {
    private final Map<GroupActionFailReason, List<String>> failedReasons;
    private final int totalInvitees;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupAddMembersResult> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.GroupActionFailReason", GroupActionFailReason.values()), new ArrayListSerializer(StringSerializer.INSTANCE))};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<GroupAddMembersResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAddMembersResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(GroupActionFailReason.valueOf(parcel.readString()), parcel.createStringArrayList());
            }
            return new GroupAddMembersResult(i, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAddMembersResult[] newArray(int i) {
            return new GroupAddMembersResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.other.GroupAddMembersResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupAddMembersResult copy$default(GroupAddMembersResult groupAddMembersResult, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = groupAddMembersResult.totalInvitees;
        }
        if ((i2 & 2) != 0) {
            map = groupAddMembersResult.failedReasons;
        }
        return groupAddMembersResult.copy(i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.totalInvitees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<GroupActionFailReason, List<String>> component2() {
        return this.failedReasons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAddMembersResult copy(int i, @NotNull Map<GroupActionFailReason, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new GroupAddMembersResult(i, map);
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
        if (!(obj instanceof GroupAddMembersResult)) {
            return false;
        }
        GroupAddMembersResult groupAddMembersResult = (GroupAddMembersResult) obj;
        return this.totalInvitees == groupAddMembersResult.totalInvitees && Intrinsics.EZpvd(this.failedReasons, groupAddMembersResult.failedReasons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<GroupActionFailReason, List<String>> getFailedReasons() {
        return this.failedReasons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalInvitees() {
        return this.totalInvitees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.totalInvitees) * 31) + this.failedReasons.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAddMembersResult(totalInvitees=" + this.totalInvitees + ", failedReasons=" + this.failedReasons + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.totalInvitees);
        Map<GroupActionFailReason, List<String>> map = this.failedReasons;
        parcel.writeInt(map.size());
        for (Map.Entry<GroupActionFailReason, List<String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey().name());
            parcel.writeStringList(entry.getValue());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupAddMembersResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAddMembersResult> serializer() {
            return GroupAddMembersResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAddMembersResult(int i, int i2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GroupAddMembersResult$$serializer.INSTANCE.getDescriptor());
        }
        this.totalInvitees = i2;
        this.failedReasons = map;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAddMembersResult groupAddMembersResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, groupAddMembersResult.totalInvitees);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupAddMembersResult.failedReasons);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<com.okinc.okimcore.model.im.GroupActionFailReason, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupAddMembersResult(int i, @NotNull Map<GroupActionFailReason, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.totalInvitees = i;
        this.failedReasons = map;
    }

    public final boolean isAllAddSuccess() {
        return this.failedReasons.isEmpty();
    }
}
