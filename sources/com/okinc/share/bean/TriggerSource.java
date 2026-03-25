package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class TriggerSource implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TriggerSource[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final TriggerSource BUTTON_CLICK = new TriggerSource("BUTTON_CLICK", 0, 1);
    public static final TriggerSource SCREEN_SHOT = new TriggerSource("SCREEN_SHOT", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TriggerSource[] $values() {
        return new TriggerSource[]{BUTTON_CLICK, SCREEN_SHOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TriggerSource> getEntries() {
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

    private TriggerSource(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        TriggerSource[] triggerSourceArr$values = $values();
        $VALUES = triggerSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(triggerSourceArr$values);
        CREATOR = new CREATOR(null);
    }

    private TriggerSource(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<TriggerSource> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.TriggerSource.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final TriggerSource valueOf(int i) {
            if (i == 1) {
                return TriggerSource.BUTTON_CLICK;
            }
            if (i != 2) {
                return null;
            }
            return TriggerSource.SCREEN_SHOT;
        }

        public final boolean isValid(int i) {
            TriggerSource triggerSource;
            TriggerSource[] triggerSourceArrValues = TriggerSource.values();
            int length = triggerSourceArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    triggerSource = null;
                    break;
                }
                triggerSource = triggerSourceArrValues[i2];
                if (triggerSource.getType() == i) {
                    break;
                }
                i2++;
            }
            return triggerSource != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TriggerSource createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TriggerSource triggerSourceValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(triggerSourceValueOf);
            return triggerSourceValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TriggerSource[] newArray(int i) {
            return new TriggerSource[i];
        }
    }

    public static TriggerSource valueOf(String str) {
        return (TriggerSource) Enum.valueOf(TriggerSource.class, str);
    }

    public static TriggerSource[] values() {
        return (TriggerSource[]) $VALUES.clone();
    }
}
