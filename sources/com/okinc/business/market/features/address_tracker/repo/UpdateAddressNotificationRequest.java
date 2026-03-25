package com.okinc.business.market.features.address_tracker.repo;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UpdateAddressNotificationRequest {
    public final String collectAddress;
    public final int notifyType;
    public final List<Integer> userActionTypeList;
    public final String volumeMax;
    public final String volumeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.address_tracker.repo.UpdateAddressNotificationRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateAddressNotificationRequest copy$default(UpdateAddressNotificationRequest updateAddressNotificationRequest, String str, String str2, int i, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateAddressNotificationRequest.walletAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = updateAddressNotificationRequest.collectAddress;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = updateAddressNotificationRequest.notifyType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = updateAddressNotificationRequest.volumeMin;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = updateAddressNotificationRequest.volumeMax;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            list = updateAddressNotificationRequest.userActionTypeList;
        }
        return updateAddressNotificationRequest.AEQbTJ(str, str5, i3, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateAddressNotificationRequest AEQbTJ(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UpdateAddressNotificationRequest(str, str2, i, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAddressNotificationRequest)) {
            return false;
        }
        UpdateAddressNotificationRequest updateAddressNotificationRequest = (UpdateAddressNotificationRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) updateAddressNotificationRequest.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) updateAddressNotificationRequest.collectAddress) && this.notifyType == updateAddressNotificationRequest.notifyType && Intrinsics.EZpvd((Object) this.volumeMin, (Object) updateAddressNotificationRequest.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) updateAddressNotificationRequest.volumeMax) && Intrinsics.EZpvd(this.userActionTypeList, updateAddressNotificationRequest.userActionTypeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + Integer.hashCode(this.notifyType)) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.userActionTypeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateAddressNotificationRequest(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", notifyType=" + this.notifyType + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", userActionTypeList=" + this.userActionTypeList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.repo.UpdateAddressNotificationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateAddressNotificationRequest> serializer() {
            return UpdateAddressNotificationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateAddressNotificationRequest(int i, String str, String str2, int i2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, UpdateAddressNotificationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddress = str2;
        this.notifyType = i2;
        this.volumeMin = str3;
        this.volumeMax = str4;
        this.userActionTypeList = list;
    }

    public static final /* synthetic */ void copydefault(UpdateAddressNotificationRequest updateAddressNotificationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, updateAddressNotificationRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, updateAddressNotificationRequest.collectAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, updateAddressNotificationRequest.notifyType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, updateAddressNotificationRequest.volumeMin);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, updateAddressNotificationRequest.volumeMax);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], updateAddressNotificationRequest.userActionTypeList);
    }

    public UpdateAddressNotificationRequest(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.notifyType = i;
        this.volumeMin = str3;
        this.volumeMax = str4;
        this.userActionTypeList = list;
    }
}
