package com.okinc.okimcore.model.remote;

import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ShareContentResponse {

    @SerializedName("channelResults")
    private final List<ChannelResult> channelResults;

    @SerializedName("userUidResults")
    private final List<UserResult> usersUidResults;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ChannelResult$$serializer.INSTANCE), new ArrayListSerializer(UserResult$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.ShareContentResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareContentResponse copy$default(ShareContentResponse shareContentResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shareContentResponse.channelResults;
        }
        if ((i & 2) != 0) {
            list2 = shareContentResponse.usersUidResults;
        }
        return shareContentResponse.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelResult> component1() {
        return this.channelResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserResult> component2() {
        return this.usersUidResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareContentResponse copy(@NotNull List<ChannelResult> list, @NotNull List<UserResult> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ShareContentResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareContentResponse)) {
            return false;
        }
        ShareContentResponse shareContentResponse = (ShareContentResponse) obj;
        return Intrinsics.EZpvd(this.channelResults, shareContentResponse.channelResults) && Intrinsics.EZpvd(this.usersUidResults, shareContentResponse.usersUidResults);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelResult> getChannelResults() {
        return this.channelResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserResult> getUsersUidResults() {
        return this.usersUidResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.channelResults.hashCode() * 31) + this.usersUidResults.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareContentResponse(channelResults=" + this.channelResults + ", usersUidResults=" + this.usersUidResults + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ShareContentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareContentResponse> serializer() {
            return ShareContentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareContentResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ShareContentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.channelResults = list;
        this.usersUidResults = list2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ShareContentResponse shareContentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], shareContentResponse.channelResults);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], shareContentResponse.usersUidResults);
    }

    public ShareContentResponse(@NotNull List<ChannelResult> list, @NotNull List<UserResult> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.channelResults = list;
        this.usersUidResults = list2;
    }
}
