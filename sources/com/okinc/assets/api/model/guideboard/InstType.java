package com.okinc.assets.api.model.guideboard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class InstType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InstType[] $VALUES;
    public static final CREATOR CREATOR;
    private final String type;
    public static final InstType SPOT = new InstType("SPOT", 0, "SPOT");
    public static final InstType MARGIN = new InstType("MARGIN", 1, "MARGIN");
    public static final InstType FUTURES = new InstType("FUTURES", 2, "FUTURES");
    public static final InstType SWAP = new InstType("SWAP", 3, "SWAP");
    public static final InstType OPTION = new InstType("OPTION", 4, "OPTION");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InstType[] $values() {
        return new InstType[]{SPOT, MARGIN, FUTURES, SWAP, OPTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InstType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private InstType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        InstType[] instTypeArr$values = $values();
        $VALUES = instTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(instTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private InstType(String str, int i, Parcel parcel) {
        String string = parcel.readString();
        this(str, i, string == null ? "" : string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<InstType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.api.model.guideboard.InstType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [29=5] */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final InstType valueOf(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return InstType.MARGIN;
                    }
                    return null;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return InstType.OPTION;
                    }
                    return null;
                case 2552066:
                    if (str.equals("SPOT")) {
                        return InstType.SPOT;
                    }
                    return null;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return InstType.SWAP;
                    }
                    return null;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return InstType.FUTURES;
                    }
                    return null;
                default:
                    return null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            InstType instTypeValueOf = valueOf(string != null ? string : "");
            Intrinsics.copydefault(instTypeValueOf);
            return instTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstType[] newArray(int i) {
            return new InstType[i];
        }
    }

    public static InstType valueOf(String str) {
        return (InstType) Enum.valueOf(InstType.class, str);
    }

    public static InstType[] values() {
        return (InstType[]) $VALUES.clone();
    }
}
