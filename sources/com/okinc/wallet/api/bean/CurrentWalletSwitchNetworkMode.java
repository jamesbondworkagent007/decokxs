package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CurrentWalletSwitchNetworkMode implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CurrentWalletSwitchNetworkMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CurrentWalletSwitchNetworkMode() {
    }

    public static final class Ignored extends CurrentWalletSwitchNetworkMode {
        public static final Ignored OLrzqt = new Ignored();
        public static final Parcelable.Creator<Ignored> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Ignored> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ignored createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Ignored.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ignored[] newArray(int i) {
                return new Ignored[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Ignored() {
            super(null);
        }
    }

    public static final class SingleNetwork extends CurrentWalletSwitchNetworkMode {
        public static final Parcelable.Creator<SingleNetwork> CREATOR = new Creator();
        public final long OLrzqt;

        public static final class Creator implements Parcelable.Creator<SingleNetwork> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SingleNetwork createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SingleNetwork(parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SingleNetwork[] newArray(int i) {
                return new SingleNetwork[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SingleNetwork copy$default(SingleNetwork singleNetwork, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = singleNetwork.OLrzqt;
            }
            return singleNetwork.EZpvd(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SingleNetwork EZpvd(long j) {
            return new SingleNetwork(j);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleNetwork) && this.OLrzqt == ((SingleNetwork) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SingleNetwork(selectedGeneralChainId=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.OLrzqt);
        }

        public SingleNetwork(long j) {
            super(null);
            this.OLrzqt = j;
        }
    }

    public static final class MultipleNetworks extends CurrentWalletSwitchNetworkMode {
        public static final Parcelable.Creator<MultipleNetworks> CREATOR = new Creator();
        public final List<Long> EZpvd;
        public final List<Long> OLrzqt;
        public final long copydefault;

        public static final class Creator implements Parcelable.Creator<MultipleNetworks> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleNetworks createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                long j = parcel.readLong();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                return new MultipleNetworks(j, arrayList, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleNetworks[] newArray(int i) {
                return new MultipleNetworks[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode$MultipleNetworks */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleNetworks copy$default(MultipleNetworks multipleNetworks, long j, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = multipleNetworks.copydefault;
            }
            if ((i & 2) != 0) {
                list = multipleNetworks.OLrzqt;
            }
            if ((i & 4) != 0) {
                list2 = multipleNetworks.EZpvd;
            }
            return multipleNetworks.AEQbTJ(j, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MultipleNetworks AEQbTJ(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new MultipleNetworks(j, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> OLrzqt() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleNetworks)) {
                return false;
            }
            MultipleNetworks multipleNetworks = (MultipleNetworks) obj;
            return this.copydefault == multipleNetworks.copydefault && Intrinsics.EZpvd(this.OLrzqt, multipleNetworks.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, multipleNetworks.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MultipleNetworks(selectedGeneralChainId=" + this.copydefault + ", supportedGeneralChainIds=" + this.OLrzqt + ", popularGeneralChainIds=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.copydefault);
            List<Long> list = this.OLrzqt;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            List<Long> list2 = this.EZpvd;
            parcel.writeInt(list2.size());
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleNetworks(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.copydefault = j;
            this.OLrzqt = list;
            this.EZpvd = list2;
        }
    }
}
