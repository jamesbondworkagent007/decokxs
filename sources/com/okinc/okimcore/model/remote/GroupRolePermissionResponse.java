package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupRolePermissionResponse {
    private GroupRolePermissionItem common;
    private GroupRolePermissionItem manager;
    private GroupRolePermissionItem owner;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupRolePermissionResponse() {
        this((GroupRolePermissionItem) null, (GroupRolePermissionItem) null, (GroupRolePermissionItem) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupRolePermissionResponse copy$default(GroupRolePermissionResponse groupRolePermissionResponse, GroupRolePermissionItem groupRolePermissionItem, GroupRolePermissionItem groupRolePermissionItem2, GroupRolePermissionItem groupRolePermissionItem3, int i, Object obj) {
        if ((i & 1) != 0) {
            groupRolePermissionItem = groupRolePermissionResponse.owner;
        }
        if ((i & 2) != 0) {
            groupRolePermissionItem2 = groupRolePermissionResponse.manager;
        }
        if ((i & 4) != 0) {
            groupRolePermissionItem3 = groupRolePermissionResponse.common;
        }
        return groupRolePermissionResponse.copy(groupRolePermissionItem, groupRolePermissionItem2, groupRolePermissionItem3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem component1() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem component2() {
        return this.manager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem component3() {
        return this.common;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionResponse copy(GroupRolePermissionItem groupRolePermissionItem, GroupRolePermissionItem groupRolePermissionItem2, GroupRolePermissionItem groupRolePermissionItem3) {
        return new GroupRolePermissionResponse(groupRolePermissionItem, groupRolePermissionItem2, groupRolePermissionItem3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupRolePermissionResponse)) {
            return false;
        }
        GroupRolePermissionResponse groupRolePermissionResponse = (GroupRolePermissionResponse) obj;
        return Intrinsics.EZpvd(this.owner, groupRolePermissionResponse.owner) && Intrinsics.EZpvd(this.manager, groupRolePermissionResponse.manager) && Intrinsics.EZpvd(this.common, groupRolePermissionResponse.common);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem getCommon() {
        return this.common;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem getManager() {
        return this.manager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupRolePermissionItem groupRolePermissionItem = this.owner;
        int iHashCode = groupRolePermissionItem == null ? 0 : groupRolePermissionItem.hashCode();
        GroupRolePermissionItem groupRolePermissionItem2 = this.manager;
        int iHashCode2 = groupRolePermissionItem2 == null ? 0 : groupRolePermissionItem2.hashCode();
        GroupRolePermissionItem groupRolePermissionItem3 = this.common;
        return (((iHashCode * 31) + iHashCode2) * 31) + (groupRolePermissionItem3 != null ? groupRolePermissionItem3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommon(GroupRolePermissionItem groupRolePermissionItem) {
        this.common = groupRolePermissionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setManager(GroupRolePermissionItem groupRolePermissionItem) {
        this.manager = groupRolePermissionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwner(GroupRolePermissionItem groupRolePermissionItem) {
        this.owner = groupRolePermissionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupRolePermissionResponse(owner=" + this.owner + ", manager=" + this.manager + ", common=" + this.common + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupRolePermissionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupRolePermissionResponse> serializer() {
            return GroupRolePermissionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupRolePermissionResponse(int i, GroupRolePermissionItem groupRolePermissionItem, GroupRolePermissionItem groupRolePermissionItem2, GroupRolePermissionItem groupRolePermissionItem3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.owner = null;
        } else {
            this.owner = groupRolePermissionItem;
        }
        if ((i & 2) == 0) {
            this.manager = null;
        } else {
            this.manager = groupRolePermissionItem2;
        }
        if ((i & 4) == 0) {
            this.common = null;
        } else {
            this.common = groupRolePermissionItem3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupRolePermissionResponse groupRolePermissionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupRolePermissionResponse.owner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GroupRolePermissionItem$$serializer.INSTANCE, groupRolePermissionResponse.owner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupRolePermissionResponse.manager != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, GroupRolePermissionItem$$serializer.INSTANCE, groupRolePermissionResponse.manager);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && groupRolePermissionResponse.common == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, GroupRolePermissionItem$$serializer.INSTANCE, groupRolePermissionResponse.common);
    }

    public GroupRolePermissionResponse(GroupRolePermissionItem groupRolePermissionItem, GroupRolePermissionItem groupRolePermissionItem2, GroupRolePermissionItem groupRolePermissionItem3) {
        this.owner = groupRolePermissionItem;
        this.manager = groupRolePermissionItem2;
        this.common = groupRolePermissionItem3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.GroupRolePermissionItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupRolePermissionItem) : (r2v0 com.okinc.okimcore.model.remote.GroupRolePermissionItem))
  (wrap:com.okinc.okimcore.model.remote.GroupRolePermissionItem:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupRolePermissionItem) : (r3v0 com.okinc.okimcore.model.remote.GroupRolePermissionItem))
  (wrap:com.okinc.okimcore.model.remote.GroupRolePermissionItem:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupRolePermissionItem) : (r4v0 com.okinc.okimcore.model.remote.GroupRolePermissionItem))
 A[MD:(com.okinc.okimcore.model.remote.GroupRolePermissionItem, com.okinc.okimcore.model.remote.GroupRolePermissionItem, com.okinc.okimcore.model.remote.GroupRolePermissionItem):void (m)] (LINE:100) call: com.okinc.okimcore.model.remote.GroupRolePermissionResponse.<init>(com.okinc.okimcore.model.remote.GroupRolePermissionItem, com.okinc.okimcore.model.remote.GroupRolePermissionItem, com.okinc.okimcore.model.remote.GroupRolePermissionItem):void type: THIS */
    public /* synthetic */ GroupRolePermissionResponse(GroupRolePermissionItem groupRolePermissionItem, GroupRolePermissionItem groupRolePermissionItem2, GroupRolePermissionItem groupRolePermissionItem3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupRolePermissionItem, (i & 2) != 0 ? null : groupRolePermissionItem2, (i & 4) != 0 ? null : groupRolePermissionItem3);
    }
}
