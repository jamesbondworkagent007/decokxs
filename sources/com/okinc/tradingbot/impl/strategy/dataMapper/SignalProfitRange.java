package com.okinc.tradingbot.impl.strategy.dataMapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C55276xgr;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SignalProfitRange implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalProfitRange[] $VALUES;
    public static final Parcelable.Creator<SignalProfitRange> CREATOR;
    public static final TaskDescription Companion;
    private final String count;
    private final String duration;
    public static final SignalProfitRange DAY_7 = new SignalProfitRange("DAY_7", 0, "7D", "7");
    public static final SignalProfitRange DAY_30 = new SignalProfitRange("DAY_30", 1, "30D", "30");
    public static final SignalProfitRange DAY_180 = new SignalProfitRange("DAY_180", 2, "180D", "180");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalProfitRange[] $values() {
        return new SignalProfitRange[]{DAY_7, DAY_30, DAY_180};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalProfitRange> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private SignalProfitRange(String str, int i, String str2, String str3) {
        this.duration = str2;
        this.count = str3;
    }

    static {
        SignalProfitRange[] signalProfitRangeArr$values = $values();
        $VALUES = signalProfitRangeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalProfitRangeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<SignalProfitRange>() { // from class: com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalProfitRange createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SignalProfitRange.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalProfitRange[] newArray(int i) {
                return new SignalProfitRange[i];
            }
        };
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String OLrzqt(@NotNull SignalProfitRange signalProfitRange) {
            Intrinsics.checkNotNullParameter(signalProfitRange, "");
            return C33069mpW.copydefault(C55688xof.Application.OeZisf, C56423yEv.EZpvd(C56390yDp.OLrzqt("dayRange", signalProfitRange.getCount())));
        }

        public final String KWHzl(@NotNull SignalProfitRange signalProfitRange) {
            Intrinsics.checkNotNullParameter(signalProfitRange, "");
            return C33069mpW.copydefault(C55688xof.Application.ruDxL, C56423yEv.EZpvd(C56390yDp.OLrzqt("dayRange", signalProfitRange.getCount())));
        }

        public final List<C55276xgr> EZpvd(@NotNull SignalProfitRange signalProfitRange) {
            Intrinsics.checkNotNullParameter(signalProfitRange, "");
            ArrayList arrayList = new ArrayList();
            SignalProfitRange[] signalProfitRangeArrValues = SignalProfitRange.values();
            int length = signalProfitRangeArrValues.length;
            for (int i = 0; i < length; i++) {
                SignalProfitRange signalProfitRange2 = signalProfitRangeArrValues[i];
                arrayList.add(new C55276xgr(SignalProfitRange.Companion.OLrzqt(signalProfitRange2), signalProfitRange2, null, signalProfitRange2 == signalProfitRange, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
            return arrayList;
        }
    }

    public static SignalProfitRange valueOf(String str) {
        return (SignalProfitRange) Enum.valueOf(SignalProfitRange.class, str);
    }

    public static SignalProfitRange[] values() {
        return (SignalProfitRange[]) $VALUES.clone();
    }
}
