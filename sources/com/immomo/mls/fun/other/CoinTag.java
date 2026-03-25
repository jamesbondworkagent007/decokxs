package com.immomo.mls.fun.other;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CoinTag implements Parcelable {
    private ContentTagList contentTagList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinTag> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinTag(ContentTagList.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinTag[] newArray(int i) {
            return new CoinTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinTag() {
        this((ContentTagList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinTag copy$default(CoinTag coinTag, ContentTagList contentTagList, int i, Object obj) {
        if ((i & 1) != 0) {
            contentTagList = coinTag.contentTagList;
        }
        return coinTag.copy(contentTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTagList component1() {
        return this.contentTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinTag copy(@NotNull ContentTagList contentTagList) {
        Intrinsics.checkNotNullParameter(contentTagList, "");
        return new CoinTag(contentTagList);
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
        return (obj instanceof CoinTag) && Intrinsics.EZpvd(this.contentTagList, ((CoinTag) obj).contentTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTagList getContentTagList() {
        return this.contentTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.contentTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentTagList(@NotNull ContentTagList contentTagList) {
        Intrinsics.checkNotNullParameter(contentTagList, "");
        this.contentTagList = contentTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinTag(contentTagList=" + this.contentTagList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.contentTagList.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.other.CoinTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinTag> serializer() {
            return CoinTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinTag(int i, ContentTagList contentTagList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contentTagList = new ContentTagList((List) null, (List) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.contentTagList = contentTagList;
        }
    }

    public static final /* synthetic */ void write$Self$MLN_mlnservics(CoinTag coinTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(coinTag.contentTagList, new ContentTagList((List) null, (List) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ContentTagList$$serializer.INSTANCE, coinTag.contentTagList);
    }

    public CoinTag(@NotNull ContentTagList contentTagList) {
        Intrinsics.checkNotNullParameter(contentTagList, "");
        this.contentTagList = contentTagList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.immomo.mls.fun.other.ContentTagList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.immomo.mls.fun.other.ContentTagList:0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.immomo.mls.fun.other.ContentTagList.<init>(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 com.immomo.mls.fun.other.ContentTagList))
 A[MD:(com.immomo.mls.fun.other.ContentTagList):void (m)] (LINE:12) call: com.immomo.mls.fun.other.CoinTag.<init>(com.immomo.mls.fun.other.ContentTagList):void type: THIS */
    public /* synthetic */ CoinTag(ContentTagList contentTagList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentTagList((List) null, (List) null, 3, (DefaultConstructorMarker) null) : contentTagList);
    }
}
