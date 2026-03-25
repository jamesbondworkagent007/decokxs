package com.okinc.im.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class SelectableDelegate<VH extends RecyclerView.ViewHolder, ID> {
    public ArrayList<ID> AEQbTJ;
    public Mode EZpvd;
    public RecyclerView.Adapter<VH> copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mode AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ID> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
    }

    public void KWHzl(int i) {
    }

    public abstract boolean OLrzqt(int i);

    public abstract int copydefault(ID id);

    public abstract ID copydefault(int i);

    public SelectableDelegate(@NotNull Mode mode, @NotNull RecyclerView.Adapter<VH> adapter) {
        Intrinsics.checkNotNullParameter(mode, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.EZpvd = mode;
        this.copydefault = adapter;
        this.AEQbTJ = new ArrayList<>();
    }

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
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.widgets.SelectableDelegate.Mode.CREATOR.<init>():void type: THIS */
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

    public final boolean KWHzl() {
        return AEQbTJ() != Mode.NONE;
    }

    public final void KWHzl(@NotNull Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        if (this.EZpvd != mode) {
            int iOLrzqt = OLrzqt();
            if (KWHzl()) {
                this.AEQbTJ.clear();
            }
            this.EZpvd = mode;
            KWHzl(0, this.copydefault.getItemCount());
            if (iOLrzqt > 0) {
                KWHzl(OLrzqt());
            }
            EZpvd(mode);
        }
    }

    public final boolean djBIcL(int i) {
        if (KWHzl() && OLrzqt(i)) {
            return copydefault(i, !AEQbTJ(i));
        }
        return false;
    }

    public final boolean AEQbTJ(int i) {
        return this.AEQbTJ.contains(copydefault(i));
    }

    public final boolean copydefault(int i, boolean z) {
        if (!KWHzl() || !OLrzqt(i)) {
            return false;
        }
        int i2 = Activity.KWHzl[AEQbTJ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return true;
            }
            ID idCopydefault = copydefault(i);
            if (z) {
                this.AEQbTJ.add(idCopydefault);
            } else {
                this.AEQbTJ.remove(idCopydefault);
            }
            gEmmrt(i);
            KWHzl(OLrzqt());
            return true;
        }
        ID idCopydefault2 = copydefault(i);
        if (this.AEQbTJ.size() > 1) {
            throw new IllegalArgumentException("selected size can not over 1 in Single mode".toString());
        }
        if (z) {
            Iterator<ID> it = this.AEQbTJ.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                ID next = it.next();
                it.remove();
                gEmmrt(copydefault(next));
            }
            this.AEQbTJ.add(idCopydefault2);
            gEmmrt(i);
            KWHzl(OLrzqt());
            return true;
        }
        this.AEQbTJ.remove(idCopydefault2);
        gEmmrt(i);
        KWHzl(OLrzqt());
        return true;
    }

    public final boolean AEQbTJ(ID id, boolean z) {
        if (!KWHzl()) {
            return false;
        }
        int i = Activity.KWHzl[AEQbTJ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    this.AEQbTJ.add(id);
                } else {
                    this.AEQbTJ.remove(id);
                }
                KWHzl(0, this.copydefault.getItemCount());
                KWHzl(OLrzqt());
            }
        } else {
            if (this.AEQbTJ.size() > 1) {
                throw new IllegalArgumentException("selected size can not over 1 in Single mode".toString());
            }
            if (z) {
                this.AEQbTJ.clear();
                this.AEQbTJ.add(id);
            } else {
                this.AEQbTJ.remove(id);
            }
            KWHzl(0, this.copydefault.getItemCount());
            KWHzl(OLrzqt());
        }
        return true;
    }

    public final void gEmmrt(int i) {
        this.copydefault.notifyItemChanged(i);
    }

    public final void KWHzl(int i, int i2) {
        this.copydefault.notifyItemRangeChanged(i, i2);
    }

    public final int OLrzqt() {
        return this.AEQbTJ.size();
    }

    public final void copydefault() {
        this.copydefault.notifyDataSetChanged();
    }
}
