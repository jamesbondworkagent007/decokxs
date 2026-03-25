package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CompactTag implements Parcelable {
    public static final Parcelable.Creator<CompactTag> CREATOR = new Creator();
    public final TagExtra AEQbTJ;
    public final String EZpvd;
    public final boolean OLrzqt;

    public static final class Creator implements Parcelable.Creator<CompactTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompactTag(parcel.readString(), parcel.readInt() != 0, TagExtra.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTag[] newArray(int i) {
            return new CompactTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompactTag() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CompactTag copy$default(CompactTag compactTag, String str, boolean z, TagExtra tagExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compactTag.EZpvd;
        }
        if ((i & 2) != 0) {
            z = compactTag.OLrzqt;
        }
        if ((i & 4) != 0) {
            tagExtra = compactTag.AEQbTJ;
        }
        return compactTag.AEQbTJ(str, z, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompactTag AEQbTJ(@NotNull String str, boolean z, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        return new CompactTag(str, z, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof CompactTag)) {
            return false;
        }
        CompactTag compactTag = (CompactTag) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) compactTag.EZpvd) && this.OLrzqt == compactTag.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, compactTag.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompactTag(key=" + this.EZpvd + ", hasMetadata=" + this.OLrzqt + ", extra=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        this.AEQbTJ.writeToParcel(parcel, i);
    }

    public CompactTag(@NotNull String str, boolean z, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        this.EZpvd = str;
        this.OLrzqt = z;
        this.AEQbTJ = tagExtra;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:com.okinc.business.defi.wallet.mine.search.data.model.TagExtra:?: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.wallet.mine.search.data.model.TagExtra:0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.business.defi.wallet.mine.search.data.model.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.defi.wallet.mine.search.data.model.TagExtra))
 A[MD:(java.lang.String, boolean, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra):void (m)] (LINE:7) call: com.okinc.business.defi.wallet.mine.search.data.model.CompactTag.<init>(java.lang.String, boolean, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra):void type: THIS */
    public /* synthetic */ CompactTag(String str, boolean z, TagExtra tagExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new TagExtra((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tagExtra);
    }
}
