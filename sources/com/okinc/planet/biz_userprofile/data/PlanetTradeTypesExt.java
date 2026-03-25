package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class PlanetTradeTypesExt implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetTradeTypesExt.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PlanetTradeTypesExt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PlanetTradeTypesExt() {
    }

    public static abstract class PlanetTradeTypeOrigin extends PlanetTradeTypesExt {
        public final String KWHzl;
        public final PlanetTradeTypes copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.planet.biz_userprofile.data.PlanetTradeTypes), (r2v0 java.lang.String) A[MD:(com.okinc.planet.biz_userprofile.data.PlanetTradeTypes, java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetTradeTypesExt.PlanetTradeTypeOrigin.<init>(com.okinc.planet.biz_userprofile.data.PlanetTradeTypes, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PlanetTradeTypeOrigin(PlanetTradeTypes planetTradeTypes, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(planetTradeTypes, str);
        }

        public PlanetTradeTypeOrigin(PlanetTradeTypes planetTradeTypes, String str) {
            super(null);
            this.copydefault = planetTradeTypes;
            this.KWHzl = str;
        }
    }

    public static abstract class PlanetTradeTypeExt extends PlanetTradeTypesExt {
        public final String KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetTradeTypesExt.PlanetTradeTypeExt.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PlanetTradeTypeExt(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public PlanetTradeTypeExt(String str) {
            super(null);
            this.KWHzl = str;
        }
    }

    public static final class PlanetSwapExt extends PlanetTradeTypeOrigin {
        public static final PlanetSwapExt AEQbTJ = new PlanetSwapExt();
        public static final Parcelable.Creator<PlanetSwapExt> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PlanetSwapExt> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetSwapExt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PlanetSwapExt.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetSwapExt[] newArray(int i) {
                return new PlanetSwapExt[i];
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

        private PlanetSwapExt() {
            super(PlanetTradeTypes.Swap, "0", null);
        }
    }

    public static final class PlanetSpotExt extends PlanetTradeTypeOrigin {
        public static final PlanetSpotExt OLrzqt = new PlanetSpotExt();
        public static final Parcelable.Creator<PlanetSpotExt> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PlanetSpotExt> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetSpotExt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PlanetSpotExt.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetSpotExt[] newArray(int i) {
                return new PlanetSpotExt[i];
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

        private PlanetSpotExt() {
            super(PlanetTradeTypes.Spot, "1", null);
        }
    }

    public static final class PlanetStrategy extends PlanetTradeTypeExt {
        public static final PlanetStrategy OLrzqt = new PlanetStrategy();
        public static final Parcelable.Creator<PlanetStrategy> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PlanetStrategy> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetStrategy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PlanetStrategy.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetStrategy[] newArray(int i) {
                return new PlanetStrategy[i];
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

        private PlanetStrategy() {
            super("2", null);
        }
    }

    public static final class PlanetTradeTypeUnknown extends PlanetTradeTypesExt {
        public static final PlanetTradeTypeUnknown KWHzl = new PlanetTradeTypeUnknown();
        public static final Parcelable.Creator<PlanetTradeTypeUnknown> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PlanetTradeTypeUnknown> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetTradeTypeUnknown createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PlanetTradeTypeUnknown.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlanetTradeTypeUnknown[] newArray(int i) {
                return new PlanetTradeTypeUnknown[i];
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

        private PlanetTradeTypeUnknown() {
            super(null);
        }
    }
}
