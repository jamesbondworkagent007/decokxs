package com.okinc.planet.format;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InstId implements Parcelable {
    public static final String Key = "InstIdKey";
    public final String id;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = EZpvd("");
    public static final Parcelable.Creator<InstId> CREATOR = new Parcelable.Creator<InstId>() { // from class: com.okinc.planet.format.InstId$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InstId createFromParcel(Parcel parcel) {
            return InstId.copydefault(m7062createFromParcelnI8vunI(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-nI8vunI, reason: not valid java name */
        public String m7062createFromParcelnI8vunI(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return InstId.EZpvd(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstId[] newArray(int i) {
            return new InstId[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String AEQbTJ(String str) {
        return "InstId(id=" + str + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(String str, Object obj) {
        return (obj instanceof InstId) && Intrinsics.EZpvd((Object) str, (Object) ((InstId) obj).OLrzqt());
    }

    public static int KWHzl(String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.format.InstId.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ InstId copydefault(String str) {
        return new InstId(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String OLrzqt() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return EZpvd(this.id, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return OLrzqt(this.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return AEQbTJ(this.id);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.format.InstId.copydefault(java.lang.String):com.okinc.planet.format.InstId] */
    public /* synthetic */ InstId(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        KWHzl(this.id, parcel, i);
    }

    public static void KWHzl(String str, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return KWHzl(this.id);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.format.InstId.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InstId> serializer() {
            return InstId$$serializer.INSTANCE;
        }

        public final String KWHzl() {
            return InstId.Empty;
        }
    }
}
