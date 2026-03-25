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
public final class PlanetAuthorId implements Parcelable {
    public static final String Key = "planetAuthorId";
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = KWHzl("");
    public static final Parcelable.Creator<PlanetAuthorId> CREATOR = new Parcelable.Creator<PlanetAuthorId>() { // from class: com.okinc.planet.biz_userprofile.data.PlanetAuthorId$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlanetAuthorId createFromParcel(Parcel parcel) {
            return PlanetAuthorId.OLrzqt(m7047createFromParcelQFiwK8M(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-QFiwK8M, reason: not valid java name */
        public String m7047createFromParcelQFiwK8M(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return PlanetAuthorId.KWHzl(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlanetAuthorId[] newArray(int i) {
            return new PlanetAuthorId[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AEQbTJ(String str) {
        return str.hashCode();
    }

    public static String EZpvd(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetAuthorId.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ PlanetAuthorId OLrzqt(String str) {
        return new PlanetAuthorId(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean OLrzqt(String str, Object obj) {
        return (obj instanceof PlanetAuthorId) && Intrinsics.EZpvd((Object) str, (Object) ((PlanetAuthorId) obj).copydefault());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    public static int copydefault(String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String copydefault() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return OLrzqt(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return AEQbTJ(this.value);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.biz_userprofile.data.PlanetAuthorId.OLrzqt(java.lang.String):com.okinc.planet.biz_userprofile.data.PlanetAuthorId] */
    public /* synthetic */ PlanetAuthorId(String str) {
        this.value = str;
    }

    public String toString() {
        return EZpvd(this.value);
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
        return copydefault(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetAuthorId.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetAuthorId> serializer() {
            return PlanetAuthorId$$serializer.INSTANCE;
        }

        public final String OLrzqt() {
            return PlanetAuthorId.Empty;
        }
    }
}
