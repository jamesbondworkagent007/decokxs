package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public class OKTypingIndicatorMessage extends OKMessageContent {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.okimcore.model.im.OKUserInfo)
  (r4v0 com.okinc.okimcore.model.im.OKMentionedInfo)
  (r5v0 java.lang.String)
  (r6v0 boolean)
  (r7v0 long)
  (r9v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType)
  (r10v0 boolean)
  (r11v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:8) call: com.okinc.okimcore.model.im.OKMessageContent.<init>(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
    public /* synthetic */ OKTypingIndicatorMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
    }

    public OKTypingIndicatorMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKTypingIndicatorMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKTypingIndicatorMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKTypingIndicatorMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKTypingIndicatorMessage> serializer() {
            return OKTypingIndicatorMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTypingIndicatorMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTypingIndicatorMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTypingIndicatorMessage[] newArray(int i) {
            return new OKTypingIndicatorMessage[i];
        }

        public final OKTypingIndicatorMessage obtain() {
            return new OKTypingIndicatorMessage();
        }
    }
}
