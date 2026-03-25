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
public final class PlanetUid implements Parcelable {
    public static final String Key = "planetUid";
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = copydefault("");
    public static final Parcelable.Creator<PlanetUid> CREATOR = new Parcelable.Creator<PlanetUid>() { // from class: com.okinc.planet.biz_userprofile.data.PlanetUid$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlanetUid createFromParcel(Parcel parcel) {
            return PlanetUid.KWHzl(m7052createFromParcelomZz0d4(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-omZz0d4, reason: not valid java name */
        public String m7052createFromParcelomZz0d4(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return PlanetUid.copydefault(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlanetUid[] newArray(int i) {
            return new PlanetUid[i];
        }
    };

    public static int AEQbTJ(String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int EZpvd(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetUid.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ PlanetUid KWHzl(String str) {
        return new PlanetUid(str);
    }

    public static String OLrzqt(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(String str, Object obj) {
        return (obj instanceof PlanetUid) && Intrinsics.EZpvd((Object) str, (Object) ((PlanetUid) obj).copydefault());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String copydefault() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return copydefault(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return EZpvd(this.value);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.biz_userprofile.data.PlanetUid.KWHzl(java.lang.String):com.okinc.planet.biz_userprofile.data.PlanetUid] */
    public /* synthetic */ PlanetUid(String str) {
        this.value = str;
    }

    public String toString() {
        return OLrzqt(this.value);
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
        return AEQbTJ(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetUid.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetUid> serializer() {
            return PlanetUid$$serializer.INSTANCE;
        }

        public final String copydefault() {
            return PlanetUid.Empty;
        }
    }
}
