package com.okinc.okx.paymentapi.service;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SupportBanner implements Parcelable {
    private final Integer bannerId;
    private final String content;
    private final boolean dismissible;
    private final List<DisplayPage> displayPages;
    private final Integer pollingTimeFrameInSeconds;
    private final String url;
    private final String urlDisplayLabel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportBanner> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(DisplayPage$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SupportBanner> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportBanner createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DisplayPage.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SupportBanner(string, z, numValueOf, string2, string3, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportBanner[] newArray(int i) {
            return new SupportBanner[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportBanner() {
        this((String) null, false, (Integer) null, (String) null, (String) null, (List) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okx.paymentapi.service.SupportBanner */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportBanner copy$default(SupportBanner supportBanner, String str, boolean z, Integer num, String str2, String str3, List list, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportBanner.content;
        }
        if ((i & 2) != 0) {
            z = supportBanner.dismissible;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            num = supportBanner.bannerId;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            str2 = supportBanner.url;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = supportBanner.urlDisplayLabel;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            list = supportBanner.displayPages;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            num2 = supportBanner.pollingTimeFrameInSeconds;
        }
        return supportBanner.copy(str, z2, num3, str4, str5, list2, num2);
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
    public final Integer component3() {
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
    public final List<DisplayPage> component6() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.pollingTimeFrameInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportBanner copy(String str, boolean z, Integer num, String str2, String str3, List<DisplayPage> list, Integer num2) {
        return new SupportBanner(str, z, num, str2, str3, list, num2);
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
        if (!(obj instanceof SupportBanner)) {
            return false;
        }
        SupportBanner supportBanner = (SupportBanner) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) supportBanner.content) && this.dismissible == supportBanner.dismissible && Intrinsics.EZpvd(this.bannerId, supportBanner.bannerId) && Intrinsics.EZpvd((Object) this.url, (Object) supportBanner.url) && Intrinsics.EZpvd((Object) this.urlDisplayLabel, (Object) supportBanner.urlDisplayLabel) && Intrinsics.EZpvd(this.displayPages, supportBanner.displayPages) && Intrinsics.EZpvd(this.pollingTimeFrameInSeconds, supportBanner.pollingTimeFrameInSeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBannerId() {
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
    public final List<DisplayPage> getDisplayPages() {
        return this.displayPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPollingTimeFrameInSeconds() {
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
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.dismissible);
        Integer num = this.bannerId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.url;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.urlDisplayLabel;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        List<DisplayPage> list = this.displayPages;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        Integer num2 = this.pollingTimeFrameInSeconds;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportBanner(content=" + this.content + ", dismissible=" + this.dismissible + ", bannerId=" + this.bannerId + ", url=" + this.url + ", urlDisplayLabel=" + this.urlDisplayLabel + ", displayPages=" + this.displayPages + ", pollingTimeFrameInSeconds=" + this.pollingTimeFrameInSeconds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
        parcel.writeInt(this.dismissible ? 1 : 0);
        Integer num = this.bannerId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.url);
        parcel.writeString(this.urlDisplayLabel);
        List<DisplayPage> list = this.displayPages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DisplayPage> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.pollingTimeFrameInSeconds;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.SupportBanner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportBanner> serializer() {
            return SupportBanner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportBanner(int i, String str, boolean z, Integer num, String str2, String str3, List list, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.dismissible = true;
        } else {
            this.dismissible = z;
        }
        if ((i & 4) == 0) {
            this.bannerId = null;
        } else {
            this.bannerId = num;
        }
        if ((i & 8) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 16) == 0) {
            this.urlDisplayLabel = null;
        } else {
            this.urlDisplayLabel = str3;
        }
        if ((i & 32) == 0) {
            this.displayPages = null;
        } else {
            this.displayPages = list;
        }
        if ((i & 64) == 0) {
            this.pollingTimeFrameInSeconds = null;
        } else {
            this.pollingTimeFrameInSeconds = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SupportBanner supportBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || supportBanner.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, supportBanner.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !supportBanner.dismissible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, supportBanner.dismissible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportBanner.bannerId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, supportBanner.bannerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportBanner.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, supportBanner.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportBanner.urlDisplayLabel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, supportBanner.urlDisplayLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || supportBanner.displayPages != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], supportBanner.displayPages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && supportBanner.pollingTimeFrameInSeconds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, supportBanner.pollingTimeFrameInSeconds);
    }

    public SupportBanner(String str, boolean z, Integer num, String str2, String str3, List<DisplayPage> list, Integer num2) {
        this.content = str;
        this.dismissible = z;
        this.bannerId = num;
        this.url = str2;
        this.urlDisplayLabel = str3;
        this.displayPages = list;
        this.pollingTimeFrameInSeconds = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:boolean:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
 A[MD:(java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.util.List<com.okinc.okx.paymentapi.service.DisplayPage>, java.lang.Integer):void (m)] (LINE:737) call: com.okinc.okx.paymentapi.service.SupportBanner.<init>(java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ SupportBanner(String str, boolean z, Integer num, String str2, String str3, List list, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num2);
    }
}
