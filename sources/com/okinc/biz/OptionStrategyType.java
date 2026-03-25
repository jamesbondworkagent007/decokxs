package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OptionStrategyType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OptionStrategyType[] $VALUES;
    public static final Parcelable.Creator<OptionStrategyType> CREATOR;
    public static final Application Companion;
    private final String strategyName;
    public static final OptionStrategyType CALL_SPREAD = new OptionStrategyType("CALL_SPREAD", 0, "call_spread");
    public static final OptionStrategyType PUT_SPREAD = new OptionStrategyType("PUT_SPREAD", 1, "put_spread");
    public static final OptionStrategyType COLLAR = new OptionStrategyType("COLLAR", 2, "collar");
    public static final OptionStrategyType STRADDLE = new OptionStrategyType("STRADDLE", 3, "straddle");
    public static final OptionStrategyType STRANGLE = new OptionStrategyType("STRANGLE", 4, "strangle");
    public static final OptionStrategyType PUT_RATIO_SPREAD = new OptionStrategyType("PUT_RATIO_SPREAD", 5, "put_ratio_spread");
    public static final OptionStrategyType CALL_RATIO_SPREAD = new OptionStrategyType("CALL_RATIO_SPREAD", 6, "call_ratio_spread");
    public static final OptionStrategyType DEFAULT_OPTION_STRATEGY = new OptionStrategyType("DEFAULT_OPTION_STRATEGY", 7, "default_option_strategy");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OptionStrategyType[] $values() {
        return new OptionStrategyType[]{CALL_SPREAD, PUT_SPREAD, COLLAR, STRADDLE, STRANGLE, PUT_RATIO_SPREAD, CALL_RATIO_SPREAD, DEFAULT_OPTION_STRATEGY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OptionStrategyType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private OptionStrategyType(String str, int i, String str2) {
        this.strategyName = str2;
    }

    static {
        OptionStrategyType[] optionStrategyTypeArr$values = $values();
        $VALUES = optionStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(optionStrategyTypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<OptionStrategyType>() { // from class: com.okinc.biz.OptionStrategyType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionStrategyType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OptionStrategyType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionStrategyType[] newArray(int i) {
                return new OptionStrategyType[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.OptionStrategyType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static OptionStrategyType valueOf(String str) {
        return (OptionStrategyType) Enum.valueOf(OptionStrategyType.class, str);
    }

    public static OptionStrategyType[] values() {
        return (OptionStrategyType[]) $VALUES.clone();
    }
}
