package com.okinc.im.imui.broadcastmessages.messagelist.viewproviders;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BroadcastWelcomeSystemMessage extends OKMessageContent {
    public List<String> nameList;
    public Integer total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, new ArrayListSerializer(StringSerializer.INSTANCE), null};
    public static final Parcelable.Creator<BroadcastWelcomeSystemMessage> CREATOR = new Parcelable.Creator<BroadcastWelcomeSystemMessage>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastWelcomeSystemMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BroadcastWelcomeSystemMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BroadcastWelcomeSystemMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BroadcastWelcomeSystemMessage[] newArray(int i) {
            return new BroadcastWelcomeSystemMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(List<String> list) {
        this.nameList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Integer num) {
        this.total = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.nameList;
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ BroadcastWelcomeSystemMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, List list, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.nameList = null;
        } else {
            this.nameList = list;
        }
        if ((i & 512) == 0) {
            this.total = null;
        } else {
            this.total = num;
        }
    }

    public static final /* synthetic */ void EZpvd(BroadcastWelcomeSystemMessage broadcastWelcomeSystemMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(broadcastWelcomeSystemMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || broadcastWelcomeSystemMessage.nameList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], broadcastWelcomeSystemMessage.nameList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && broadcastWelcomeSystemMessage.total == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, broadcastWelcomeSystemMessage.total);
    }

    public BroadcastWelcomeSystemMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastWelcomeSystemMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        List<String> list = this.nameList;
        if (list != null) {
            parcel.readStringList(list);
        }
        int i = parcel.readInt();
        this.total = i == -1 ? null : Integer.valueOf(i);
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.nameList);
        Integer num = this.total;
        parcel.writeInt(num != null ? num.intValue() : -1);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastWelcomeSystemMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BroadcastWelcomeSystemMessage> serializer() {
            return BroadcastWelcomeSystemMessage$$serializer.INSTANCE;
        }
    }
}
