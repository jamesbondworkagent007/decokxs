package com.okinc.planet.serializer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetNumericString implements Parcelable {
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = AEQbTJ("");
    public static final Parcelable.Creator<PlanetNumericString> CREATOR = new Parcelable.Creator<PlanetNumericString>() { // from class: com.okinc.planet.serializer.PlanetNumericString$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PlanetNumericString createFromParcel(Parcel parcel) {
            return PlanetNumericString.OLrzqt(m7068createFromParcelvIx6V_E(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-vIx6V_E, reason: not valid java name */
        public String m7068createFromParcelvIx6V_E(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return PlanetNumericString.AEQbTJ(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlanetNumericString[] newArray(int i) {
            return new PlanetNumericString[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int EZpvd(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(String str, Object obj) {
        return (obj instanceof PlanetNumericString) && Intrinsics.EZpvd((Object) str, (Object) ((PlanetNumericString) obj).AEQbTJ());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    public static int KWHzl(String str) {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.serializer.PlanetNumericString.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ PlanetNumericString OLrzqt(String str) {
        return new PlanetNumericString(str);
    }

    public static String copydefault(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String AEQbTJ() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return EZpvd(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return EZpvd(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.serializer.PlanetNumericString.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlanetNumericString> serializer() {
            return PlanetNumericString$$serializer.INSTANCE;
        }

        public final String EZpvd() {
            return PlanetNumericString.Empty;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.serializer.PlanetNumericString.OLrzqt(java.lang.String):com.okinc.planet.serializer.PlanetNumericString] */
    public /* synthetic */ PlanetNumericString(String str) {
        this.value = str;
    }

    public String toString() {
        return copydefault(this.value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return KWHzl(this.value);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AEQbTJ(this.value, parcel, i);
    }

    public static void AEQbTJ(String str, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(str);
    }

    public static final String copydefault(String str, @NotNull Function0<PlanetNumericString> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return str.length() == 0 ? function0.invoke().AEQbTJ() : str;
    }
}
