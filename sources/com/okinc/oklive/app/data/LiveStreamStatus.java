package com.okinc.oklive.app.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.oklive.app.data.LiveStreamStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sTU;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
@Serializable(with = sTU.class)
public final class LiveStreamStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiveStreamStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<LiveStreamStatus> CREATOR;
    public static final Companion Companion;
    private final int code;
    public static final LiveStreamStatus UNKNOWN = new LiveStreamStatus("UNKNOWN", 0, -1);
    public static final LiveStreamStatus SCHEDULED = new LiveStreamStatus("SCHEDULED", 1, 0);
    public static final LiveStreamStatus LIVE = new LiveStreamStatus("LIVE", 2, 1);
    public static final LiveStreamStatus PAUSED = new LiveStreamStatus("PAUSED", 3, 2);
    public static final LiveStreamStatus ENDED = new LiveStreamStatus("ENDED", 4, 3);
    public static final LiveStreamStatus Cancelled = new LiveStreamStatus("Cancelled", 5, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiveStreamStatus[] $values() {
        return new LiveStreamStatus[]{UNKNOWN, SCHEDULED, LIVE, PAUSED, ENDED, Cancelled};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiveStreamStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private LiveStreamStatus(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        LiveStreamStatus[] liveStreamStatusArr$values = $values();
        $VALUES = liveStreamStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liveStreamStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<LiveStreamStatus>() { // from class: com.okinc.oklive.app.data.LiveStreamStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LiveStreamStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return LiveStreamStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LiveStreamStatus[] newArray(int i) {
                return new LiveStreamStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LiveStreamStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.LiveStreamStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) LiveStreamStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LiveStreamStatus> serializer() {
            return AEQbTJ();
        }

        public final LiveStreamStatus OLrzqt(int i) {
            LiveStreamStatus liveStreamStatus;
            LiveStreamStatus[] liveStreamStatusArrValues = LiveStreamStatus.values();
            int length = liveStreamStatusArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    liveStreamStatus = null;
                    break;
                }
                liveStreamStatus = liveStreamStatusArrValues[i2];
                if (liveStreamStatus.getCode() == i) {
                    break;
                }
                i2++;
            }
            return liveStreamStatus == null ? LiveStreamStatus.UNKNOWN : liveStreamStatus;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sTU();
    }

    public static LiveStreamStatus valueOf(String str) {
        return (LiveStreamStatus) Enum.valueOf(LiveStreamStatus.class, str);
    }

    public static LiveStreamStatus[] values() {
        return (LiveStreamStatus[]) $VALUES.clone();
    }
}
