package com.okinc.business.defi.wallet.home.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NotificationInfo {
    public final String collectAddress;
    public final String devId;
    public final int notifyType;
    public final List<Integer> userActionTypeList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.bean.NotificationInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationInfo copy$default(NotificationInfo notificationInfo, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notificationInfo.collectAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = notificationInfo.devId;
        }
        if ((i2 & 4) != 0) {
            i = notificationInfo.notifyType;
        }
        if ((i2 & 8) != 0) {
            list = notificationInfo.userActionTypeList;
        }
        return notificationInfo.EZpvd(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.notifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationInfo EZpvd(@NotNull String str, @NotNull String str2, int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NotificationInfo(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationInfo)) {
            return false;
        }
        NotificationInfo notificationInfo = (NotificationInfo) obj;
        return Intrinsics.EZpvd((Object) this.collectAddress, (Object) notificationInfo.collectAddress) && Intrinsics.EZpvd((Object) this.devId, (Object) notificationInfo.devId) && this.notifyType == notificationInfo.notifyType && Intrinsics.EZpvd(this.userActionTypeList, notificationInfo.userActionTypeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.collectAddress.hashCode() * 31) + this.devId.hashCode()) * 31) + Integer.hashCode(this.notifyType)) * 31) + this.userActionTypeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationInfo(collectAddress=" + this.collectAddress + ", devId=" + this.devId + ", notifyType=" + this.notifyType + ", userActionTypeList=" + this.userActionTypeList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.NotificationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationInfo> serializer() {
            return NotificationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NotificationInfo(int i, String str, String str2, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, NotificationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.collectAddress = str;
        this.devId = str2;
        this.notifyType = i2;
        this.userActionTypeList = list;
    }

    public static final /* synthetic */ void copydefault(NotificationInfo notificationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, notificationInfo.collectAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, notificationInfo.devId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, notificationInfo.notifyType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], notificationInfo.userActionTypeList);
    }

    public NotificationInfo(@NotNull String str, @NotNull String str2, int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.collectAddress = str;
        this.devId = str2;
        this.notifyType = i;
        this.userActionTypeList = list;
    }
}
