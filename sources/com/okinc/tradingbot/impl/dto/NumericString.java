package com.okinc.tradingbot.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NumericString implements Parcelable {
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final String Empty = AEQbTJ("");
    public static final Parcelable.Creator<NumericString> CREATOR = new Parcelable.Creator<NumericString>() { // from class: com.okinc.tradingbot.impl.dto.NumericString$Companion$CREATOR$1
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NumericString createFromParcel(Parcel parcel) {
            return NumericString.copydefault(m7089createFromParcelWnx5xUg(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-Wnx5xUg, reason: not valid java name */
        public String m7089createFromParcelWnx5xUg(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            return NumericString.AEQbTJ(string != null ? string : "");
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NumericString[] newArray(int i) {
            return new NumericString[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static String EZpvd(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(String str, Object obj) {
        return (obj instanceof NumericString) && Intrinsics.EZpvd((Object) str, (Object) ((NumericString) obj).EZpvd());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl(String str) {
        return str.hashCode();
    }

    public static int OLrzqt(String str) {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.tradingbot.impl.dto.NumericString.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ NumericString copydefault(String str) {
        return new NumericString(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ String EZpvd() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return EZpvd(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return KWHzl(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.NumericString.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NumericString> serializer() {
            return NumericString$$serializer.INSTANCE;
        }

        public final String copydefault() {
            return NumericString.Empty;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.tradingbot.impl.dto.NumericString.copydefault(java.lang.String):com.okinc.tradingbot.impl.dto.NumericString] */
    public /* synthetic */ NumericString(String str) {
        this.value = str;
    }

    public String toString() {
        return EZpvd(this.value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return OLrzqt(this.value);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        copydefault(this.value, parcel, i);
    }

    public static void copydefault(String str, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(str);
    }
}
