package com.okinc.business.defi.wallet.home.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class GetUserInfoBody {
    public final List<Long> chainIndexList;
    public final String targetAddress;
    public final String userAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.bean.GetUserInfoBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetUserInfoBody copy$default(GetUserInfoBody getUserInfoBody, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserInfoBody.userAddress;
        }
        if ((i & 2) != 0) {
            str2 = getUserInfoBody.targetAddress;
        }
        if ((i & 4) != 0) {
            list = getUserInfoBody.chainIndexList;
        }
        return getUserInfoBody.OLrzqt(str, str2, (List<Long>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetUserInfoBody OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GetUserInfoBody(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserInfoBody)) {
            return false;
        }
        GetUserInfoBody getUserInfoBody = (GetUserInfoBody) obj;
        return Intrinsics.EZpvd((Object) this.userAddress, (Object) getUserInfoBody.userAddress) && Intrinsics.EZpvd((Object) this.targetAddress, (Object) getUserInfoBody.targetAddress) && Intrinsics.EZpvd(this.chainIndexList, getUserInfoBody.chainIndexList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userAddress.hashCode() * 31) + this.targetAddress.hashCode()) * 31) + this.chainIndexList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetUserInfoBody(userAddress=" + this.userAddress + ", targetAddress=" + this.targetAddress + ", chainIndexList=" + this.chainIndexList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.GetUserInfoBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetUserInfoBody> serializer() {
            return GetUserInfoBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetUserInfoBody(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetUserInfoBody$$serializer.INSTANCE.getDescriptor());
        }
        this.userAddress = str;
        this.targetAddress = str2;
        this.chainIndexList = list;
    }

    public static final /* synthetic */ void OLrzqt(GetUserInfoBody getUserInfoBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getUserInfoBody.userAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getUserInfoBody.targetAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], getUserInfoBody.chainIndexList);
    }

    public GetUserInfoBody(@NotNull String str, @NotNull String str2, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.userAddress = str;
        this.targetAddress = str2;
        this.chainIndexList = list;
    }
}
