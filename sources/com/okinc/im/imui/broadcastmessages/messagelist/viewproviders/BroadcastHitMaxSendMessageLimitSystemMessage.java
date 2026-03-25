package com.okinc.im.imui.broadcastmessages.messagelist.viewproviders;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastHitMaxSendMessageLimitSystemMessage extends OKMessageContent {
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<BroadcastHitMaxSendMessageLimitSystemMessage> CREATOR = new Parcelable.Creator<BroadcastHitMaxSendMessageLimitSystemMessage>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastHitMaxSendMessageLimitSystemMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BroadcastHitMaxSendMessageLimitSystemMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BroadcastHitMaxSendMessageLimitSystemMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BroadcastHitMaxSendMessageLimitSystemMessage[] newArray(int i) {
            return new BroadcastHitMaxSendMessageLimitSystemMessage[i];
        }
    };

    public BroadcastHitMaxSendMessageLimitSystemMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastHitMaxSendMessageLimitSystemMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastHitMaxSendMessageLimitSystemMessage.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
