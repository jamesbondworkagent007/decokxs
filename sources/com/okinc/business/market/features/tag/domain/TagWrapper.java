package com.okinc.business.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagWrapper implements Parcelable {
    public static final Parcelable.Creator<TagWrapper> CREATOR = new Creator();
    public final TagMeta OLrzqt;
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
            tagMeta = tagWrapper.OLrzqt;
        }
        return tagWrapper.copydefault(compactTag, tagMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagMeta AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompactTag copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagWrapper copydefault(@NotNull CompactTag compactTag, TagMeta tagMeta) {
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
        return Intrinsics.EZpvd(this.copydefault, tagWrapper.copydefault) && Intrinsics.EZpvd(this.OLrzqt, tagWrapper.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        TagMeta tagMeta = this.OLrzqt;
        return (iHashCode * 31) + (tagMeta == null ? 0 : tagMeta.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagWrapper(tag=" + this.copydefault + ", meta=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.copydefault.writeToParcel(parcel, i);
        TagMeta tagMeta = this.OLrzqt;
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
        this.OLrzqt = tagMeta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.tag.domain.CompactTag:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.tag.domain.CompactTag:0x000c: CONSTRUCTOR 
  (null java.lang.String)
  false
  (null com.okinc.business.market.features.tag.domain.TagExtra)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagExtra, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:8) call: com.okinc.business.market.features.tag.domain.CompactTag.<init>(java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagExtra, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.market.features.tag.domain.CompactTag))
  (wrap:com.okinc.business.market.features.tag.domain.TagMeta:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.domain.TagMeta) : (r8v0 com.okinc.business.market.features.tag.domain.TagMeta))
 A[MD:(com.okinc.business.market.features.tag.domain.CompactTag, com.okinc.business.market.features.tag.domain.TagMeta):void (m)] (LINE:7) call: com.okinc.business.market.features.tag.domain.TagWrapper.<init>(com.okinc.business.market.features.tag.domain.CompactTag, com.okinc.business.market.features.tag.domain.TagMeta):void type: THIS */
    public /* synthetic */ TagWrapper(CompactTag compactTag, TagMeta tagMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CompactTag(null, false, null, 7, null) : compactTag, (i & 2) != 0 ? null : tagMeta);
    }

    public final String OLrzqt() {
        return this.copydefault.copydefault();
    }
}
