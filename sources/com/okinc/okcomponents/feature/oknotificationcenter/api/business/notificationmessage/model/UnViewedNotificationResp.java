package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UnViewedNotificationResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnViewedNotificationResp> CREATOR = new Creator();
    private final Map<String, Integer> unviewMap;

    public static final class Creator implements Parcelable.Creator<UnViewedNotificationResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnViewedNotificationResp createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UnViewedNotificationResp(linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnViewedNotificationResp[] newArray(int i) {
            return new UnViewedNotificationResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnViewedNotificationResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnViewedNotificationResp copy$default(UnViewedNotificationResp unViewedNotificationResp, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = unViewedNotificationResp.unviewMap;
        }
        return unViewedNotificationResp.copy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Integer> component1() {
        return this.unviewMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnViewedNotificationResp copy(Map<String, Integer> map) {
        return new UnViewedNotificationResp(map);
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
        return (obj instanceof UnViewedNotificationResp) && Intrinsics.EZpvd(this.unviewMap, ((UnViewedNotificationResp) obj).unviewMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Integer> getUnviewMap() {
        return this.unviewMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Map<String, Integer> map = this.unviewMap;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnViewedNotificationResp(unviewMap=" + this.unviewMap + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Map<String, Integer> map = this.unviewMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
    }

    public UnViewedNotificationResp(Map<String, Integer> map) {
        this.unviewMap = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, java.lang.Integer>):void (m)] (LINE:9) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ UnViewedNotificationResp(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
