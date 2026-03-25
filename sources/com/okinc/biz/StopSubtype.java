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
public final class StopSubtype implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StopSubtype[] $VALUES;
    public static final Parcelable.Creator<StopSubtype> CREATOR;
    public static final Application Companion;
    private final String reportName;
    public static final StopSubtype SINGE = new StopSubtype("SINGE", 0, "conditional");
    public static final StopSubtype DOUBLE = new StopSubtype("DOUBLE", 1, "oco");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StopSubtype[] $values() {
        return new StopSubtype[]{SINGE, DOUBLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StopSubtype> getEntries() {
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

    private StopSubtype(String str, int i, String str2) {
        this.reportName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:199) call: com.okinc.biz.StopSubtype.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ StopSubtype(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : str2);
    }

    static {
        StopSubtype[] stopSubtypeArr$values = $values();
        $VALUES = stopSubtypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(stopSubtypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<StopSubtype>() { // from class: com.okinc.biz.StopSubtype.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopSubtype createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return StopSubtype.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StopSubtype[] newArray(int i) {
                return new StopSubtype[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.StopSubtype.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static StopSubtype valueOf(String str) {
        return (StopSubtype) Enum.valueOf(StopSubtype.class, str);
    }

    public static StopSubtype[] values() {
        return (StopSubtype[]) $VALUES.clone();
    }
}
