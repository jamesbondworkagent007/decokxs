package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class SupportBannerResponseBean implements Parcelable {
    private final int bannerId;
    private final String content;
    private final boolean dismissible;
    private final List<DisplayPageResponseBean> displayPages;
    private final int pollingTimeFrameInSeconds;
    private final String url;
    private final String urlDisplayLabel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportBannerResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(DisplayPageResponseBean$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SupportBannerResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportBannerResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DisplayPageResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new SupportBannerResponseBean(string, z, i, string2, string3, arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportBannerResponseBean[] newArray(int i) {
            return new SupportBannerResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportBannerResponseBean() {
        this((String) null, false, 0, (String) null, (String) null, (List) null, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportBannerResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportBannerResponseBean copy$default(SupportBannerResponseBean supportBannerResponseBean, String str, boolean z, int i, String str2, String str3, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = supportBannerResponseBean.content;
        }
        if ((i3 & 2) != 0) {
            z = supportBannerResponseBean.dismissible;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            i = supportBannerResponseBean.bannerId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = supportBannerResponseBean.url;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            str3 = supportBannerResponseBean.urlDisplayLabel;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            list = supportBannerResponseBean.displayPages;
        }
        List list2 = list;
        if ((i3 & 64) != 0) {
            i2 = supportBannerResponseBean.pollingTimeFrameInSeconds;
        }
        return supportBannerResponseBean.copy(str, z2, i4, str4, str5, list2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.dismissible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.urlDisplayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DisplayPageResponseBean> component6() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportBannerResponseBean copy(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, @NotNull List<DisplayPageResponseBean> list, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SupportBannerResponseBean(str, z, i, str2, str3, list, i2);
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
        if (!(obj instanceof SupportBannerResponseBean)) {
            return false;
        }
        SupportBannerResponseBean supportBannerResponseBean = (SupportBannerResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) supportBannerResponseBean.content) && this.dismissible == supportBannerResponseBean.dismissible && this.bannerId == supportBannerResponseBean.bannerId && Intrinsics.EZpvd((Object) this.url, (Object) supportBannerResponseBean.url) && Intrinsics.EZpvd((Object) this.urlDisplayLabel, (Object) supportBannerResponseBean.urlDisplayLabel) && Intrinsics.EZpvd(this.displayPages, supportBannerResponseBean.displayPages) && this.pollingTimeFrameInSeconds == supportBannerResponseBean.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBannerId() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DisplayPageResponseBean> getDisplayPages() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPollingTimeFrameInSeconds() {
        return this.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlDisplayLabel() {
        return this.urlDisplayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.content.hashCode() * 31) + Boolean.hashCode(this.dismissible)) * 31) + Integer.hashCode(this.bannerId)) * 31) + this.url.hashCode()) * 31) + this.urlDisplayLabel.hashCode()) * 31) + this.displayPages.hashCode()) * 31) + Integer.hashCode(this.pollingTimeFrameInSeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportBannerResponseBean(content=" + this.content + ", dismissible=" + this.dismissible + ", bannerId=" + this.bannerId + ", url=" + this.url + ", urlDisplayLabel=" + this.urlDisplayLabel + ", displayPages=" + this.displayPages + ", pollingTimeFrameInSeconds=" + this.pollingTimeFrameInSeconds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
        parcel.writeInt(this.dismissible ? 1 : 0);
        parcel.writeInt(this.bannerId);
        parcel.writeString(this.url);
        parcel.writeString(this.urlDisplayLabel);
        List<DisplayPageResponseBean> list = this.displayPages;
        parcel.writeInt(list.size());
        Iterator<DisplayPageResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.pollingTimeFrameInSeconds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportBannerResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportBannerResponseBean> serializer() {
            return SupportBannerResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportBannerResponseBean(int i, String str, boolean z, int i2, String str2, String str3, List list, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.dismissible = true;
        } else {
            this.dismissible = z;
        }
        if ((i & 4) == 0) {
            this.bannerId = 0;
        } else {
            this.bannerId = i2;
        }
        if ((i & 8) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 16) == 0) {
            this.urlDisplayLabel = "";
        } else {
            this.urlDisplayLabel = str3;
        }
        if ((i & 32) == 0) {
            this.displayPages = yDY.AhwBna();
        } else {
            this.displayPages = list;
        }
        if ((i & 64) == 0) {
            this.pollingTimeFrameInSeconds = 0;
        } else {
            this.pollingTimeFrameInSeconds = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SupportBannerResponseBean supportBannerResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportBannerResponseBean.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportBannerResponseBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !supportBannerResponseBean.dismissible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, supportBannerResponseBean.dismissible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportBannerResponseBean.bannerId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, supportBannerResponseBean.bannerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) supportBannerResponseBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, supportBannerResponseBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) supportBannerResponseBean.urlDisplayLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, supportBannerResponseBean.urlDisplayLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(supportBannerResponseBean.displayPages, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], supportBannerResponseBean.displayPages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && supportBannerResponseBean.pollingTimeFrameInSeconds == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, supportBannerResponseBean.pollingTimeFrameInSeconds);
    }

    public SupportBannerResponseBean(@NotNull String str, boolean z, int i, @NotNull String str2, @NotNull String str3, @NotNull List<DisplayPageResponseBean> list, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.content = str;
        this.dismissible = z;
        this.bannerId = i;
        this.url = str2;
        this.urlDisplayLabel = str3;
        this.displayPages = list;
        this.pollingTimeFrameInSeconds = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:boolean:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.util.List:0x002c: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r11v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean>, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportBannerResponseBean.<init>(java.lang.String, boolean, int, java.lang.String, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ SupportBannerResponseBean(String str, boolean z, int i, String str2, String str3, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) == 0 ? str3 : "", (i3 & 32) != 0 ? yDY.AhwBna() : list, (i3 & 64) != 0 ? 0 : i2);
    }
}
