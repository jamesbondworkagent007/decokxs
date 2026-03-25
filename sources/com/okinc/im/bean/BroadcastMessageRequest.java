package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessageRequest implements Parcelable {
    public final GroupScenarioType AEQbTJ;
    public final String EZpvd;
    public final int KWHzl;
    public final List<Long> OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<BroadcastMessageRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BroadcastMessageRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastMessageRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            GroupScenarioType groupScenarioTypeValueOf = GroupScenarioType.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new BroadcastMessageRequest(i, groupScenarioTypeValueOf, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BroadcastMessageRequest[] newArray(int i) {
            return new BroadcastMessageRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.bean.BroadcastMessageRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BroadcastMessageRequest copy$default(BroadcastMessageRequest broadcastMessageRequest, int i, GroupScenarioType groupScenarioType, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = broadcastMessageRequest.KWHzl;
        }
        if ((i2 & 2) != 0) {
            groupScenarioType = broadcastMessageRequest.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            list = broadcastMessageRequest.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            str = broadcastMessageRequest.EZpvd;
        }
        return broadcastMessageRequest.copydefault(i, groupScenarioType, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupScenarioType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BroadcastMessageRequest copydefault(int i, @NotNull GroupScenarioType groupScenarioType, @NotNull List<Long> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new BroadcastMessageRequest(i, groupScenarioType, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof BroadcastMessageRequest)) {
            return false;
        }
        BroadcastMessageRequest broadcastMessageRequest = (BroadcastMessageRequest) obj;
        return this.KWHzl == broadcastMessageRequest.KWHzl && this.AEQbTJ == broadcastMessageRequest.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, broadcastMessageRequest.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) broadcastMessageRequest.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BroadcastMessageRequest(sourceType=" + this.KWHzl + ", scenarioType=" + this.AEQbTJ + ", listOfRecipients=" + this.OLrzqt + ", jsonExtra=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.AEQbTJ.name());
        List<Long> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        parcel.writeString(this.EZpvd);
    }

    public BroadcastMessageRequest(int i, @NotNull GroupScenarioType groupScenarioType, @NotNull List<Long> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = i;
        this.AEQbTJ = groupScenarioType;
        this.OLrzqt = list;
        this.EZpvd = str;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.BroadcastMessageRequest.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
