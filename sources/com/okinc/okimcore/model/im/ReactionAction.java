package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C44446sQc;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ReactionAction implements Parcelable {
    private SendReactionAction action;
    private String emoji;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReactionAction() {
        this((String) null, (SendReactionAction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReactionAction copy$default(ReactionAction reactionAction, String str, SendReactionAction sendReactionAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactionAction.emoji;
        }
        if ((i & 2) != 0) {
            sendReactionAction = reactionAction.action;
        }
        return reactionAction.copy(str, sendReactionAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendReactionAction component2() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionAction copy(String str, SendReactionAction sendReactionAction) {
        return new ReactionAction(str, sendReactionAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionAction)) {
            return false;
        }
        ReactionAction reactionAction = (ReactionAction) obj;
        return Intrinsics.EZpvd((Object) this.emoji, (Object) reactionAction.emoji) && this.action == reactionAction.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendReactionAction getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.emoji;
        int iHashCode = str == null ? 0 : str.hashCode();
        SendReactionAction sendReactionAction = this.action;
        return (iHashCode * 31) + (sendReactionAction != null ? sendReactionAction.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(SendReactionAction sendReactionAction) {
        this.action = sendReactionAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmoji(String str) {
        this.emoji = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionAction(emoji=" + this.emoji + ", action=" + this.action + ")";
    }

    public /* synthetic */ ReactionAction(int i, String str, SendReactionAction sendReactionAction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str;
        }
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = sendReactionAction;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReactionAction reactionAction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || reactionAction.emoji != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, reactionAction.emoji);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && reactionAction.action == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, C44446sQc.OLrzqt, reactionAction.action);
    }

    public ReactionAction(String str, SendReactionAction sendReactionAction) {
        this.emoji = str;
        this.action = sendReactionAction;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction) : (r3v0 com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.ReactionAction.<init>(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction):void type: THIS */
    public /* synthetic */ ReactionAction(String str, SendReactionAction sendReactionAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : sendReactionAction);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactionAction(@NotNull Parcel parcel) {
        SendReactionAction sendReactionAction;
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        int i = parcel.readInt();
        SendReactionAction[] sendReactionActionArrValues = SendReactionAction.values();
        int length = sendReactionActionArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                sendReactionAction = null;
                break;
            }
            sendReactionAction = sendReactionActionArrValues[i2];
            if (sendReactionAction.getValue() == i) {
                break;
            } else {
                i2++;
            }
        }
        this(string, sendReactionAction);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.emoji);
        SendReactionAction sendReactionAction = this.action;
        parcel.writeInt(sendReactionAction != null ? sendReactionAction.getValue() : 0);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<ReactionAction> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.ReactionAction.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<ReactionAction> serializer() {
            return ReactionAction$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionAction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReactionAction(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionAction[] newArray(int i) {
            return new ReactionAction[i];
        }

        public final List<ReactionAction> createListFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ReactionAction.CREATOR);
            return arrayListCreateTypedArrayList != null ? arrayListCreateTypedArrayList : yDY.AhwBna();
        }

        public final void writeListToParcel(@NotNull Parcel parcel, List<ReactionAction> list, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeTypedList(list);
        }
    }
}
