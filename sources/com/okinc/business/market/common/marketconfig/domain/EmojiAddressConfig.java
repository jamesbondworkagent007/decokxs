package com.okinc.business.market.common.marketconfig.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class EmojiAddressConfig implements Parcelable {
    public static final Parcelable.Creator<EmojiAddressConfig> CREATOR = new Creator();
    public final Map<String, Map<String, String>> EZpvd;

    public static final class Creator implements Parcelable.Creator<EmojiAddressConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmojiAddressConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                String string = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap.put(string, linkedHashMap2);
            }
            return new EmojiAddressConfig(linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmojiAddressConfig[] newArray(int i) {
            return new EmojiAddressConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EmojiAddressConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.common.marketconfig.domain.EmojiAddressConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiAddressConfig copy$default(EmojiAddressConfig emojiAddressConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = emojiAddressConfig.EZpvd;
        }
        return emojiAddressConfig.copydefault(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmojiAddressConfig copydefault(@NotNull Map<String, ? extends Map<String, String>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new EmojiAddressConfig(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Map<String, String>> copydefault() {
        return this.EZpvd;
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
        return (obj instanceof EmojiAddressConfig) && Intrinsics.EZpvd(this.EZpvd, ((EmojiAddressConfig) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EmojiAddressConfig(mapping=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Map<String, Map<String, String>> map = this.EZpvd;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            Map<String, String> value = entry.getValue();
            parcel.writeInt(value.size());
            for (Map.Entry<String, String> entry2 : value.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public EmojiAddressConfig(@NotNull Map<String, ? extends Map<String, String>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>>):void (m)] (LINE:7) call: com.okinc.business.market.common.marketconfig.domain.EmojiAddressConfig.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ EmojiAddressConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map);
    }
}
