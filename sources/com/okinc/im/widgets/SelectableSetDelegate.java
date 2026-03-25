package com.okinc.im.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SelectableSetDelegate<VH extends RecyclerView.ViewHolder, ID> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final CREATOR CREATOR;
        private final int mode;
        public static final Mode NONE = new Mode("NONE", 0, 0);
        public static final Mode SINGLE = new Mode("SINGLE", 1, 1);
        public static final Mode MULTIPLE = new Mode("MULTIPLE", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{NONE, SINGLE, MULTIPLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMode() {
            return this.mode;
        }

        private Mode(String str, int i, int i2) {
            this.mode = i2;
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
            CREATOR = new CREATOR(null);
        }

        private Mode(String str, int i, Parcel parcel) {
            this(str, i, parcel.readInt());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.mode);
        }

        public static final class CREATOR implements Parcelable.Creator<Mode> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.widgets.SelectableSetDelegate.Mode.CREATOR.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            public final Mode valueOf(int i) {
                if (i == 0) {
                    return Mode.NONE;
                }
                if (i == 1) {
                    return Mode.SINGLE;
                }
                if (i != 2) {
                    return null;
                }
                return Mode.MULTIPLE;
            }

            public final boolean isValid(int i) {
                Mode mode;
                Mode[] modeArrValues = Mode.values();
                int length = modeArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        mode = null;
                        break;
                    }
                    mode = modeArrValues[i2];
                    if (mode.getMode() == i) {
                        break;
                    }
                    i2++;
                }
                return mode != null;
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Mode createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                Mode modeValueOf = valueOf(parcel.readInt());
                Intrinsics.copydefault(modeValueOf);
                return modeValueOf;
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Mode[] newArray(int i) {
                return new Mode[i];
            }
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }
}
