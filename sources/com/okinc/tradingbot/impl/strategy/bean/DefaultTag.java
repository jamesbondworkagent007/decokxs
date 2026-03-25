package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class DefaultTag implements Parcelable, Tag {
    public static final Parcelable.Creator<DefaultTag> CREATOR = new Creator();
    public final int AEQbTJ;
    public final TagConfig EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public final float valueOf;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DefaultTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DefaultTag(parcel.readString(), TagConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultTag[] newArray(int i) {
            return new DefaultTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefaultTag copy$default(DefaultTag defaultTag, String str, TagConfig tagConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultTag.copydefault;
        }
        if ((i & 2) != 0) {
            tagConfig = defaultTag.EZpvd;
        }
        return defaultTag.copydefault(str, tagConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultTag copydefault(@NotNull String str, @NotNull TagConfig tagConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagConfig, "");
        return new DefaultTag(str, tagConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagConfig copydefault() {
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
        if (!(obj instanceof DefaultTag)) {
            return false;
        }
        DefaultTag defaultTag = (DefaultTag) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) defaultTag.copydefault) && Intrinsics.EZpvd(this.EZpvd, defaultTag.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultTag(tagTitle=" + this.copydefault + ", tagConfig=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        this.EZpvd.writeToParcel(parcel, i);
    }

    public DefaultTag(@NotNull String str, @NotNull TagConfig tagConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagConfig, "");
        this.copydefault = str;
        this.EZpvd = tagConfig;
        this.OLrzqt = C52761wXj.LoaderManager.OBJEWx;
        this.AEQbTJ = C33070mpX.copydefault(C52761wXj.Activity.HJWChPhFGucI);
        this.KWHzl = C33070mpX.copydefault(C52761wXj.Activity.dpErvT);
        this.valueOf = 12.0f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.tradingbot.impl.strategy.bean.TagConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.strategy.bean.TagConfig:0x0008: CONSTRUCTOR (-4 int), (7 int) A[MD:(int, int):void (m), WRAPPED] (LINE:43) call: com.okinc.tradingbot.impl.strategy.bean.TagConfig.<init>(int, int):void type: CONSTRUCTOR) : (r2v0 com.okinc.tradingbot.impl.strategy.bean.TagConfig))
 A[MD:(java.lang.String, com.okinc.tradingbot.impl.strategy.bean.TagConfig):void (m)] (LINE:41) call: com.okinc.tradingbot.impl.strategy.bean.DefaultTag.<init>(java.lang.String, com.okinc.tradingbot.impl.strategy.bean.TagConfig):void type: THIS */
    public /* synthetic */ DefaultTag(String str, TagConfig tagConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new TagConfig(-4, 7) : tagConfig);
    }
}
