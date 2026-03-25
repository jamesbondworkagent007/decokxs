package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TagWrapper implements Parcelable {
    public static final Parcelable.Creator<TagWrapper> CREATOR = new Creator();
    public final TagMeta EZpvd;
    public final CompactTag copydefault;

    public static final class Creator implements Parcelable.Creator<TagWrapper> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagWrapper createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagWrapper(CompactTag.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TagMeta.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagWrapper[] newArray(int i) {
            return new TagWrapper[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagWrapper copy$default(TagWrapper tagWrapper, CompactTag compactTag, TagMeta tagMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            compactTag = tagWrapper.copydefault;
        }
        if ((i & 2) != 0) {
            tagMeta = tagWrapper.EZpvd;
        }
        return tagWrapper.OLrzqt(compactTag, tagMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagMeta AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagWrapper OLrzqt(@NotNull CompactTag compactTag, TagMeta tagMeta) {
        Intrinsics.checkNotNullParameter(compactTag, "");
        return new TagWrapper(compactTag, tagMeta);
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
        if (!(obj instanceof TagWrapper)) {
            return false;
        }
        TagWrapper tagWrapper = (TagWrapper) obj;
        return Intrinsics.EZpvd(this.copydefault, tagWrapper.copydefault) && Intrinsics.EZpvd(this.EZpvd, tagWrapper.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        TagMeta tagMeta = this.EZpvd;
        return (iHashCode * 31) + (tagMeta == null ? 0 : tagMeta.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagWrapper(tag=" + this.copydefault + ", meta=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.copydefault.writeToParcel(parcel, i);
        TagMeta tagMeta = this.EZpvd;
        if (tagMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagMeta.writeToParcel(parcel, i);
        }
    }

    public TagWrapper(@NotNull CompactTag compactTag, TagMeta tagMeta) {
        Intrinsics.checkNotNullParameter(compactTag, "");
        this.copydefault = compactTag;
        this.EZpvd = tagMeta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.wallet.mine.search.data.model.CompactTag:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.wallet.mine.search.data.model.CompactTag:0x000c: CONSTRUCTOR 
  (null java.lang.String)
  false
  (null com.okinc.business.defi.wallet.mine.search.data.model.TagExtra)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, boolean, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:8) call: com.okinc.business.defi.wallet.mine.search.data.model.CompactTag.<init>(java.lang.String, boolean, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.defi.wallet.mine.search.data.model.CompactTag))
  (wrap:com.okinc.business.defi.wallet.mine.search.data.model.TagMeta:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.mine.search.data.model.TagMeta) : (r8v0 com.okinc.business.defi.wallet.mine.search.data.model.TagMeta))
 A[MD:(com.okinc.business.defi.wallet.mine.search.data.model.CompactTag, com.okinc.business.defi.wallet.mine.search.data.model.TagMeta):void (m)] (LINE:7) call: com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper.<init>(com.okinc.business.defi.wallet.mine.search.data.model.CompactTag, com.okinc.business.defi.wallet.mine.search.data.model.TagMeta):void type: THIS */
    public /* synthetic */ TagWrapper(CompactTag compactTag, TagMeta tagMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CompactTag(null, false, null, 7, null) : compactTag, (i & 2) != 0 ? null : tagMeta);
    }

    public final String KWHzl() {
        return this.copydefault.KWHzl();
    }

    public final TagExtra EZpvd() {
        return this.copydefault.copydefault();
    }

    public final TagEventProperty OLrzqt() {
        if (EZpvd().EZpvd().length() == 0 && EZpvd().OLrzqt().length() == 0) {
            return null;
        }
        return new TagEventProperty(EZpvd().EZpvd(), EZpvd().OLrzqt());
    }
}
