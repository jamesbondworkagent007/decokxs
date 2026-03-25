package com.okinc.oklive.app.ui.list.displaymodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LiveFloatingWindowUIState implements Parcelable {
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 boolean), (r4v0 java.lang.String) A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] call: com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState.<init>(java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LiveFloatingWindowUIState(String str, String str2, boolean z, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return this.KWHzl;
    }

    public LiveFloatingWindowUIState(String str, String str2, boolean z, String str3) {
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = z;
        this.KWHzl = str3;
    }

    public static final class LiveStream extends LiveFloatingWindowUIState {
        public static final Parcelable.Creator<LiveStream> CREATOR = new Creator();
        public final boolean AYXKKw;
        public final String OLrzqt;
        public final String djBIcL;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<LiveStream> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LiveStream createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new LiveStream(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LiveStream[] newArray(int i) {
                return new LiveStream[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LiveStream copy$default(LiveStream liveStream, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = liveStream.valueOf;
            }
            if ((i & 2) != 0) {
                str2 = liveStream.OLrzqt;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                z = liveStream.AYXKKw;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str3 = liveStream.djBIcL;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = liveStream.gEmmrt;
            }
            return liveStream.EZpvd(str, str5, z2, str6, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LiveStream EZpvd(String str, @NotNull String str2, boolean z, String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new LiveStream(str, str2, z, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public boolean OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String copydefault() {
            return this.djBIcL;
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
            if (!(obj instanceof LiveStream)) {
                return false;
            }
            LiveStream liveStream = (LiveStream) obj;
            return Intrinsics.EZpvd((Object) this.valueOf, (Object) liveStream.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) liveStream.OLrzqt) && this.AYXKKw == liveStream.AYXKKw && Intrinsics.EZpvd((Object) this.djBIcL, (Object) liveStream.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) liveStream.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.valueOf;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = Boolean.hashCode(this.AYXKKw);
            String str2 = this.djBIcL;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.gEmmrt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LiveStream(shareCode=" + this.valueOf + ", affiliateChannelId=" + this.OLrzqt + ", isMuted=" + this.AYXKKw + ", title=" + this.djBIcL + ", streamUrl=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.valueOf);
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeString(this.djBIcL);
            parcel.writeString(this.gEmmrt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveStream(String str, @NotNull String str2, boolean z, String str3, @NotNull String str4) {
            super(str, str2, z, str3, null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.valueOf = str;
            this.OLrzqt = str2;
            this.AYXKKw = z;
            this.djBIcL = str3;
            this.gEmmrt = str4;
        }
    }

    public static final class Recording extends LiveFloatingWindowUIState {
        public static final Parcelable.Creator<Recording> CREATOR = new Creator();
        public final String AYXKKw;
        public final String AhwBna;
        public final String OLrzqt;
        public final String djBIcL;
        public final long gEmmrt;
        public final boolean valueOf;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Recording> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recording createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Recording(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recording[] newArray(int i) {
                return new Recording[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Recording copy$default(Recording recording, String str, String str2, boolean z, String str3, String str4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recording.AYXKKw;
            }
            if ((i & 2) != 0) {
                str2 = recording.OLrzqt;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                z = recording.valueOf;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str3 = recording.djBIcL;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = recording.AhwBna;
            }
            String str7 = str4;
            if ((i & 32) != 0) {
                j = recording.gEmmrt;
            }
            return recording.AEQbTJ(str, str5, z2, str6, str7, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Recording AEQbTJ(String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, long j) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Recording(str, str2, z, str3, str4, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public boolean OLrzqt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState
        public String copydefault() {
            return this.djBIcL;
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
            if (!(obj instanceof Recording)) {
                return false;
            }
            Recording recording = (Recording) obj;
            return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) recording.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) recording.OLrzqt) && this.valueOf == recording.valueOf && Intrinsics.EZpvd((Object) this.djBIcL, (Object) recording.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) recording.AhwBna) && this.gEmmrt == recording.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AYXKKw;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = Boolean.hashCode(this.valueOf);
            String str2 = this.djBIcL;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AhwBna.hashCode()) * 31) + Long.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Recording(shareCode=" + this.AYXKKw + ", affiliateChannelId=" + this.OLrzqt + ", isMuted=" + this.valueOf + ", title=" + this.djBIcL + ", recordingUrl=" + this.AhwBna + ", recordingPosition=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AYXKKw);
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.valueOf ? 1 : 0);
            parcel.writeString(this.djBIcL);
            parcel.writeString(this.AhwBna);
            parcel.writeLong(this.gEmmrt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recording(String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, long j) {
            super(str, str2, z, str3, null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AYXKKw = str;
            this.OLrzqt = str2;
            this.valueOf = z;
            this.djBIcL = str3;
            this.AhwBna = str4;
            this.gEmmrt = j;
        }
    }
}
