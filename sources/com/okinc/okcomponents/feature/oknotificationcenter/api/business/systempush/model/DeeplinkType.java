package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class DeeplinkType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeeplinkType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final DeeplinkType EXCHANGE = new DeeplinkType("EXCHANGE", 0, 0);
    public static final DeeplinkType WEB3 = new DeeplinkType("WEB3", 1, 1);
    public static final DeeplinkType ALL = new DeeplinkType("ALL", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeeplinkType[] $values() {
        return new DeeplinkType[]{EXCHANGE, WEB3, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeeplinkType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private DeeplinkType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        DeeplinkType[] deeplinkTypeArr$values = $values();
        $VALUES = deeplinkTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deeplinkTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private DeeplinkType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class CREATOR implements Parcelable.Creator<DeeplinkType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.DeeplinkType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final DeeplinkType valueOf(int i) {
            if (i == 0) {
                return DeeplinkType.EXCHANGE;
            }
            if (i == 1) {
                return DeeplinkType.WEB3;
            }
            if (i != 2) {
                return null;
            }
            return DeeplinkType.ALL;
        }

        public final boolean isValid(int i) {
            DeeplinkType deeplinkType;
            DeeplinkType[] deeplinkTypeArrValues = DeeplinkType.values();
            int length = deeplinkTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    deeplinkType = null;
                    break;
                }
                deeplinkType = deeplinkTypeArrValues[i2];
                if (deeplinkType.getType() == i) {
                    break;
                }
                i2++;
            }
            return deeplinkType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeeplinkType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            DeeplinkType deeplinkTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(deeplinkTypeValueOf);
            return deeplinkTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeeplinkType[] newArray(int i) {
            return new DeeplinkType[i];
        }
    }

    public static DeeplinkType valueOf(String str) {
        return (DeeplinkType) Enum.valueOf(DeeplinkType.class, str);
    }

    public static DeeplinkType[] values() {
        return (DeeplinkType[]) $VALUES.clone();
    }
}
