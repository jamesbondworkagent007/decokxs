package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class WithdrawPromotionBanner implements Parcelable {
    private String content;
    private String header;
    private List<WithdrawPromotionSubBanner> withdrawPromotionSubBanners;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawPromotionBanner> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(WithdrawPromotionSubBanner$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WithdrawPromotionBanner> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawPromotionBanner createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(WithdrawPromotionSubBanner.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WithdrawPromotionBanner(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawPromotionBanner[] newArray(int i) {
            return new WithdrawPromotionBanner[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawPromotionBanner() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.WithdrawPromotionBanner */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawPromotionBanner copy$default(WithdrawPromotionBanner withdrawPromotionBanner, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawPromotionBanner.header;
        }
        if ((i & 2) != 0) {
            str2 = withdrawPromotionBanner.content;
        }
        if ((i & 4) != 0) {
            list = withdrawPromotionBanner.withdrawPromotionSubBanners;
        }
        return withdrawPromotionBanner.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawPromotionSubBanner> component3() {
        return this.withdrawPromotionSubBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawPromotionBanner copy(String str, String str2, List<WithdrawPromotionSubBanner> list) {
        return new WithdrawPromotionBanner(str, str2, list);
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
        if (!(obj instanceof WithdrawPromotionBanner)) {
            return false;
        }
        WithdrawPromotionBanner withdrawPromotionBanner = (WithdrawPromotionBanner) obj;
        return Intrinsics.EZpvd((Object) this.header, (Object) withdrawPromotionBanner.header) && Intrinsics.EZpvd((Object) this.content, (Object) withdrawPromotionBanner.content) && Intrinsics.EZpvd(this.withdrawPromotionSubBanners, withdrawPromotionBanner.withdrawPromotionSubBanners);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeader() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawPromotionSubBanner> getWithdrawPromotionSubBanners() {
        return this.withdrawPromotionSubBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.header;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<WithdrawPromotionSubBanner> list = this.withdrawPromotionSubBanners;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeader(String str) {
        this.header = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawPromotionSubBanners(List<WithdrawPromotionSubBanner> list) {
        this.withdrawPromotionSubBanners = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawPromotionBanner(header=" + this.header + ", content=" + this.content + ", withdrawPromotionSubBanners=" + this.withdrawPromotionSubBanners + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.header);
        parcel.writeString(this.content);
        List<WithdrawPromotionSubBanner> list = this.withdrawPromotionSubBanners;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<WithdrawPromotionSubBanner> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawPromotionBanner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WithdrawPromotionBanner> serializer() {
            return WithdrawPromotionBanner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawPromotionBanner(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.header = null;
        } else {
            this.header = str;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.withdrawPromotionSubBanners = null;
        } else {
            this.withdrawPromotionSubBanners = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(WithdrawPromotionBanner withdrawPromotionBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || withdrawPromotionBanner.header != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, withdrawPromotionBanner.header);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || withdrawPromotionBanner.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, withdrawPromotionBanner.content);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && withdrawPromotionBanner.withdrawPromotionSubBanners == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], withdrawPromotionBanner.withdrawPromotionSubBanners);
    }

    public WithdrawPromotionBanner(String str, String str2, List<WithdrawPromotionSubBanner> list) {
        this.header = str;
        this.content = str2;
        this.withdrawPromotionSubBanners = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.WithdrawPromotionSubBanner>):void (m)] (LINE:31) call: com.okinc.assets.backend.api.model.WithdrawPromotionBanner.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WithdrawPromotionBanner(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
