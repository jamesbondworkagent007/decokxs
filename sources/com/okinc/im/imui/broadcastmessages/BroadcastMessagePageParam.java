package com.okinc.im.imui.broadcastmessages;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagePageParam implements Parcelable {
    public final CreateBroadcastChannelResponse copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = CreateBroadcastChannelResponse.$stable;
    public static final Parcelable.Creator<BroadcastMessagePageParam> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<BroadcastMessagePageParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastMessagePageParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BroadcastMessagePageParam((CreateBroadcastChannelResponse) parcel.readParcelable(BroadcastMessagePageParam.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastMessagePageParam[] newArray(int i) {
            return new BroadcastMessagePageParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BroadcastMessagePageParam copy$default(BroadcastMessagePageParam broadcastMessagePageParam, CreateBroadcastChannelResponse createBroadcastChannelResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            createBroadcastChannelResponse = broadcastMessagePageParam.copydefault;
        }
        return broadcastMessagePageParam.copydefault(createBroadcastChannelResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateBroadcastChannelResponse AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BroadcastMessagePageParam copydefault(@NotNull CreateBroadcastChannelResponse createBroadcastChannelResponse) {
        Intrinsics.checkNotNullParameter(createBroadcastChannelResponse, "");
        return new BroadcastMessagePageParam(createBroadcastChannelResponse);
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
        return (obj instanceof BroadcastMessagePageParam) && Intrinsics.EZpvd(this.copydefault, ((BroadcastMessagePageParam) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BroadcastMessagePageParam(createBroadcastChannelResponse=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.copydefault, i);
    }

    public BroadcastMessagePageParam(@NotNull CreateBroadcastChannelResponse createBroadcastChannelResponse) {
        Intrinsics.checkNotNullParameter(createBroadcastChannelResponse, "");
        this.copydefault = createBroadcastChannelResponse;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
