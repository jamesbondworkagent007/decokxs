package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetUniqueName implements Parcelable {
    public static final String Key = "planetUniqueName";
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = AEQbTJ("");
    public static final Parcelable.Creator<PlanetUniqueName> CREATOR = new Parcelable.Creator<PlanetUniqueName>() { // from class: com.okinc.planet.biz_userprofile.data.PlanetUniqueName$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlanetUniqueName createFromParcel(Parcel parcel) {
            return PlanetUniqueName.EZpvd(m7055createFromParcelGPg1ANc(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-GPg1ANc, reason: not valid java name */
        public String m7055createFromParcelGPg1ANc(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return PlanetUniqueName.AEQbTJ(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlanetUniqueName[] newArray(int i) {
            return new PlanetUniqueName[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetUniqueName.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ PlanetUniqueName EZpvd(String str) {
        return new PlanetUniqueName(str);
    }

    public static int KWHzl(String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean KWHzl(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean OLrzqt(String str, Object obj) {
        return (obj instanceof PlanetUniqueName) && Intrinsics.EZpvd((Object) str, (Object) ((PlanetUniqueName) obj).EZpvd());
    }

    public static String copydefault(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String EZpvd() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return OLrzqt(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return OLrzqt(this.value);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.biz_userprofile.data.PlanetUniqueName.EZpvd(java.lang.String):com.okinc.planet.biz_userprofile.data.PlanetUniqueName] */
    public /* synthetic */ PlanetUniqueName(String str) {
        this.value = str;
    }

    public String toString() {
        return copydefault(this.value);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        OLrzqt(this.value, parcel, i);
    }

    public static void OLrzqt(String str, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return KWHzl(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetUniqueName.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetUniqueName> serializer() {
            return PlanetUniqueName$$serializer.INSTANCE;
        }

        public final String AEQbTJ() {
            return PlanetUniqueName.Empty;
        }
    }
}
