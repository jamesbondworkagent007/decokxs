package com.okinc.planet.biz_positions.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Ccy implements Parcelable {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String Empty = m6962constructorimpl("");
    public static final Parcelable.Creator<Ccy> CREATOR = new Parcelable.Creator<Ccy>() { // from class: com.okinc.planet.biz_positions.data.Ccy$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Ccy createFromParcel(Parcel parcel) {
            return Ccy.m6961boximpl(m6972createFromParcel7KLJ7nA(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-7KLJ7nA, reason: not valid java name */
        public String m6972createFromParcel7KLJ7nA(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return Ccy.m6962constructorimpl(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ccy[] newArray(int i) {
            return new Ccy[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.planet.biz_positions.data.Ccy.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Ccy m6961boximpl(String str) {
        return new Ccy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m6962constructorimpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX INFO: renamed from: describeContents-impl, reason: not valid java name */
    public static int m6963describeContentsimpl(String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6964equalsimpl(String str, Object obj) {
        return (obj instanceof Ccy) && Intrinsics.EZpvd((Object) str, (Object) ((Ccy) obj).m6969unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6965equalsimpl0(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6966hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6967toStringimpl(String str) {
        return "Ccy(value=" + str + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return m6964equalsimpl(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return m6966hashCodeimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return m6967toStringimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6969unboximpl() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.Ccy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Ccy> serializer() {
            return Ccy$$serializer.INSTANCE;
        }

        public final String KWHzl() {
            return Ccy.Empty;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.planet.biz_positions.data.Ccy.box-impl(java.lang.String):com.okinc.planet.biz_positions.data.Ccy] */
    private /* synthetic */ Ccy(String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return m6963describeContentsimpl(this.value);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        m6968writeToParcelimpl(this.value, parcel, i);
    }

    /* JADX INFO: renamed from: writeToParcel-impl, reason: not valid java name */
    public static void m6968writeToParcelimpl(String str, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(str);
    }
}
