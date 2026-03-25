package com.okinc.okimcore.model.share;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class IMMessageShareModelV2 implements Parcelable {
    public static final Parcelable.Creator<IMMessageShareModelV2> CREATOR = new Creator();
    public final Integer AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final Map<String, String> copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<IMMessageShareModelV2> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMMessageShareModelV2 createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new IMMessageShareModelV2(string, string2, string3, string4, string5, string6, string7, string8, string9, numValueOf, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMMessageShareModelV2[] newArray(int i) {
            return new IMMessageShareModelV2[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMMessageShareModelV2 EZpvd(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IMMessageShareModelV2(str, str2, str3, str4, str5, str6, str7, str8, str9, num, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMMessageShareModelV2)) {
            return false;
        }
        IMMessageShareModelV2 iMMessageShareModelV2 = (IMMessageShareModelV2) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) iMMessageShareModelV2.EZpvd) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) iMMessageShareModelV2.AkhnZx) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) iMMessageShareModelV2.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) iMMessageShareModelV2.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) iMMessageShareModelV2.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) iMMessageShareModelV2.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) iMMessageShareModelV2.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) iMMessageShareModelV2.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) iMMessageShareModelV2.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, iMMessageShareModelV2.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, iMMessageShareModelV2.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        String str = this.AkhnZx;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.djBIcL;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gEmmrt;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AYXKKw;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.OLrzqt;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.valueOf;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.AhwBna;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        Integer num = this.AEQbTJ;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Map<String, String> map = this.copydefault;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMMessageShareModelV2(bizName=" + this.EZpvd + ", title=" + this.AkhnZx + ", content=" + this.KWHzl + ", messagePreview=" + this.djBIcL + ", image=" + this.gEmmrt + ", imageBase64=" + this.AYXKKw + ", deeplink=" + this.OLrzqt + ", shortLink=" + this.valueOf + ", tagLine=" + this.AhwBna + ", ctaType=" + this.AEQbTJ + ", extra=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AhwBna);
        Integer num = this.AEQbTJ;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Map<String, String> map = this.copydefault;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public IMMessageShareModelV2(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.AkhnZx = str2;
        this.KWHzl = str3;
        this.djBIcL = str4;
        this.gEmmrt = str5;
        this.AYXKKw = str6;
        this.OLrzqt = str7;
        this.valueOf = str8;
        this.AhwBna = str9;
        this.AEQbTJ = num;
        this.copydefault = map;
    }
}
