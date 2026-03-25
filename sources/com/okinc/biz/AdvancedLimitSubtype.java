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
/* JADX INFO: loaded from: classes23.dex */
public final class AdvancedLimitSubtype implements Parcelable, InterfaceC6806aWN {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedLimitSubtype[] $VALUES;
    public static final Parcelable.Creator<AdvancedLimitSubtype> CREATOR;
    public static final StateListAnimator Companion;
    private final String reportName;
    public static final AdvancedLimitSubtype POST_ONLY = new AdvancedLimitSubtype("POST_ONLY", 0, "post only");
    public static final AdvancedLimitSubtype FILL_OR_KILL = new AdvancedLimitSubtype("FILL_OR_KILL", 1, "fok");
    public static final AdvancedLimitSubtype IMMEDIATE_OR_CANCEL = new AdvancedLimitSubtype("IMMEDIATE_OR_CANCEL", 2, "ioc");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedLimitSubtype[] $values() {
        return new AdvancedLimitSubtype[]{POST_ONLY, FILL_OR_KILL, IMMEDIATE_OR_CANCEL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedLimitSubtype> getEntries() {
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

    private AdvancedLimitSubtype(String str, int i, String str2) {
        this.reportName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:173) call: com.okinc.biz.AdvancedLimitSubtype.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedLimitSubtype(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }

    static {
        AdvancedLimitSubtype[] advancedLimitSubtypeArr$values = $values();
        $VALUES = advancedLimitSubtypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedLimitSubtypeArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<AdvancedLimitSubtype>() { // from class: com.okinc.biz.AdvancedLimitSubtype.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdvancedLimitSubtype createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return AdvancedLimitSubtype.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdvancedLimitSubtype[] newArray(int i) {
                return new AdvancedLimitSubtype[i];
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.AdvancedLimitSubtype.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static AdvancedLimitSubtype valueOf(String str) {
        return (AdvancedLimitSubtype) Enum.valueOf(AdvancedLimitSubtype.class, str);
    }

    public static AdvancedLimitSubtype[] values() {
        return (AdvancedLimitSubtype[]) $VALUES.clone();
    }
}
