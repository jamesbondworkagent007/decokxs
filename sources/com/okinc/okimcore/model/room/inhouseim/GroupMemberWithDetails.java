package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupMemberWithDetails {
    public final InHouseIMGroupMemberEntity groupMember;
    public final String phoneName;
    public final String phoneRawNumber;
    public final String remarkName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupMemberWithDetails copy$default(GroupMemberWithDetails groupMemberWithDetails, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            inHouseIMGroupMemberEntity = groupMemberWithDetails.groupMember;
        }
        if ((i & 2) != 0) {
            str = groupMemberWithDetails.remarkName;
        }
        if ((i & 4) != 0) {
            str2 = groupMemberWithDetails.phoneName;
        }
        if ((i & 8) != 0) {
            str3 = groupMemberWithDetails.phoneRawNumber;
        }
        return groupMemberWithDetails.AEQbTJ(inHouseIMGroupMemberEntity, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberWithDetails AEQbTJ(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, String str, String str2, String str3) {
        return new GroupMemberWithDetails(inHouseIMGroupMemberEntity, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberEntity EZpvd() {
        return this.groupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMemberWithDetails)) {
            return false;
        }
        GroupMemberWithDetails groupMemberWithDetails = (GroupMemberWithDetails) obj;
        return Intrinsics.EZpvd(this.groupMember, groupMemberWithDetails.groupMember) && Intrinsics.EZpvd((Object) this.remarkName, (Object) groupMemberWithDetails.remarkName) && Intrinsics.EZpvd((Object) this.phoneName, (Object) groupMemberWithDetails.phoneName) && Intrinsics.EZpvd((Object) this.phoneRawNumber, (Object) groupMemberWithDetails.phoneRawNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = this.groupMember;
        int iHashCode = inHouseIMGroupMemberEntity == null ? 0 : inHouseIMGroupMemberEntity.hashCode();
        String str = this.remarkName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.phoneName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.phoneRawNumber;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupMemberWithDetails(groupMember=" + this.groupMember + ", remarkName=" + this.remarkName + ", phoneName=" + this.phoneName + ", phoneRawNumber=" + this.phoneRawNumber + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupMemberWithDetails> serializer() {
            return GroupMemberWithDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupMemberWithDetails(int i, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GroupMemberWithDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.groupMember = inHouseIMGroupMemberEntity;
        this.remarkName = str;
        this.phoneName = str2;
        this.phoneRawNumber = str3;
    }

    public static final /* synthetic */ void OLrzqt(GroupMemberWithDetails groupMemberWithDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InHouseIMGroupMemberEntity$$serializer.INSTANCE, groupMemberWithDetails.groupMember);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, groupMemberWithDetails.remarkName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, groupMemberWithDetails.phoneName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, groupMemberWithDetails.phoneRawNumber);
    }

    public GroupMemberWithDetails(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, String str, String str2, String str3) {
        this.groupMember = inHouseIMGroupMemberEntity;
        this.remarkName = str;
        this.phoneName = str2;
        this.phoneRawNumber = str3;
    }
}
