package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.InterfaceC6806aWN;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class OptionLimitSubtype implements Parcelable, InterfaceC6806aWN {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OptionLimitSubtype[] $VALUES;
    public static final Parcelable.Creator<OptionLimitSubtype> CREATOR;
    public static final TaskDescription Companion;
    private final String reportName;
    public static final OptionLimitSubtype BASIC_LIMIT = new OptionLimitSubtype("BASIC_LIMIT", 0, "basic limit order");
    public static final OptionLimitSubtype TRACKING_IV = new OptionLimitSubtype("TRACKING_IV", 1, "iv order");
    public static final OptionLimitSubtype TRACKING_USD = new OptionLimitSubtype("TRACKING_USD", 2, "usd price order");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OptionLimitSubtype[] $values() {
        return new OptionLimitSubtype[]{BASIC_LIMIT, TRACKING_IV, TRACKING_USD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OptionLimitSubtype> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportName() {
        return this.reportName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private OptionLimitSubtype(String str, int i, String str2) {
        this.reportName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:186) call: com.okinc.biz.OptionLimitSubtype.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ OptionLimitSubtype(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }

    static {
        OptionLimitSubtype[] optionLimitSubtypeArr$values = $values();
        $VALUES = optionLimitSubtypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(optionLimitSubtypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<OptionLimitSubtype>() { // from class: com.okinc.biz.OptionLimitSubtype.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionLimitSubtype createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OptionLimitSubtype.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionLimitSubtype[] newArray(int i) {
                return new OptionLimitSubtype[i];
            }
        };
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.OptionLimitSubtype.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static OptionLimitSubtype valueOf(String str) {
        return (OptionLimitSubtype) Enum.valueOf(OptionLimitSubtype.class, str);
    }

    public static OptionLimitSubtype[] values() {
        return (OptionLimitSubtype[]) $VALUES.clone();
    }
}
