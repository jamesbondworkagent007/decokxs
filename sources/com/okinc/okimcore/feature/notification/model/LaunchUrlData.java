package com.okinc.okimcore.feature.notification.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class LaunchUrlData {
    private final List<String> atTargetUids;
    private final String conversationId;
    private final ConversationType conversationType;
    private final String deeplink;
    private final String senderUid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.feature.notification.model.ConversationType", ConversationType.values()), null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okimcore.feature.notification.model.LaunchUrlData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LaunchUrlData copy$default(LaunchUrlData launchUrlData, String str, ConversationType conversationType, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = launchUrlData.conversationId;
        }
        if ((i & 2) != 0) {
            conversationType = launchUrlData.conversationType;
        }
        ConversationType conversationType2 = conversationType;
        if ((i & 4) != 0) {
            str2 = launchUrlData.senderUid;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = launchUrlData.atTargetUids;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = launchUrlData.deeplink;
        }
        return launchUrlData.copy(str, conversationType2, str4, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.conversationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationType component2() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.atTargetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LaunchUrlData copy(@NotNull String str, @NotNull ConversationType conversationType, @NotNull String str2, @NotNull List<String> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(conversationType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LaunchUrlData(str, conversationType, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchUrlData)) {
            return false;
        }
        LaunchUrlData launchUrlData = (LaunchUrlData) obj;
        return Intrinsics.EZpvd((Object) this.conversationId, (Object) launchUrlData.conversationId) && this.conversationType == launchUrlData.conversationType && Intrinsics.EZpvd((Object) this.senderUid, (Object) launchUrlData.senderUid) && Intrinsics.EZpvd(this.atTargetUids, launchUrlData.atTargetUids) && Intrinsics.EZpvd((Object) this.deeplink, (Object) launchUrlData.deeplink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAtTargetUids() {
        return this.atTargetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationType getConversationType() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUid() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.conversationId.hashCode() * 31) + this.conversationType.hashCode()) * 31) + this.senderUid.hashCode()) * 31) + this.atTargetUids.hashCode()) * 31) + this.deeplink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LaunchUrlData(conversationId=" + this.conversationId + ", conversationType=" + this.conversationType + ", senderUid=" + this.senderUid + ", atTargetUids=" + this.atTargetUids + ", deeplink=" + this.deeplink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.notification.model.LaunchUrlData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LaunchUrlData> serializer() {
            return LaunchUrlData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LaunchUrlData(int i, String str, ConversationType conversationType, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, LaunchUrlData$$serializer.INSTANCE.getDescriptor());
        }
        this.conversationId = str;
        this.conversationType = conversationType;
        this.senderUid = str2;
        this.atTargetUids = list;
        this.deeplink = str3;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(LaunchUrlData launchUrlData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, launchUrlData.conversationId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], launchUrlData.conversationType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, launchUrlData.senderUid);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], launchUrlData.atTargetUids);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, launchUrlData.deeplink);
    }

    public LaunchUrlData(@NotNull String str, @NotNull ConversationType conversationType, @NotNull String str2, @NotNull List<String> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(conversationType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.conversationId = str;
        this.conversationType = conversationType;
        this.senderUid = str2;
        this.atTargetUids = list;
        this.deeplink = str3;
    }
}
