package com.okinc.im.imui.messageV2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SendMessageRequest implements Parcelable {
    public final Long AEQbTJ;
    public final String KWHzl;
    public final SendMessageRequestParam copydefault;
    public static final int OLrzqt = SendMessageRequestParam.AEQbTJ;
    public static final Parcelable.Creator<SendMessageRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SendMessageRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendMessageRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SendMessageRequest(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (SendMessageRequestParam) parcel.readParcelable(SendMessageRequest.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendMessageRequest[] newArray(int i) {
            return new SendMessageRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendMessageRequest copy$default(SendMessageRequest sendMessageRequest, String str, Long l, SendMessageRequestParam sendMessageRequestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageRequest.KWHzl;
        }
        if ((i & 2) != 0) {
            l = sendMessageRequest.AEQbTJ;
        }
        if ((i & 4) != 0) {
            sendMessageRequestParam = sendMessageRequest.copydefault;
        }
        return sendMessageRequest.KWHzl(str, l, sendMessageRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendMessageRequest KWHzl(@NotNull String str, Long l, @NotNull SendMessageRequestParam sendMessageRequestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sendMessageRequestParam, "");
        return new SendMessageRequest(str, l, sendMessageRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendMessageRequestParam copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) sendMessageRequest.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, sendMessageRequest.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, sendMessageRequest.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        Long l = this.AEQbTJ;
        return (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendMessageRequest(channelId=" + this.KWHzl + ", referenceMessageId=" + this.AEQbTJ + ", param=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        Long l = this.AEQbTJ;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.copydefault, i);
    }

    public SendMessageRequest(@NotNull String str, Long l, @NotNull SendMessageRequestParam sendMessageRequestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sendMessageRequestParam, "");
        this.KWHzl = str;
        this.AEQbTJ = l;
        this.copydefault = sendMessageRequestParam;
    }
}
