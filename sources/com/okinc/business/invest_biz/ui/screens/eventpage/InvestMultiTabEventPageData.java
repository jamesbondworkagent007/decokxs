package com.okinc.business.invest_biz.ui.screens.eventpage;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestMultiTabEventPageData implements Parcelable {
    private final String appImageUrl;
    private final String eventTrackingValue;
    private final List<InvestHotZonePlatform> platformList;
    private final int tabId;
    private final String tabName;
    private final String topAreaDesc;
    private final String topViewText;
    private final String topViewUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestMultiTabEventPageData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(InvestHotZonePlatform$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<InvestMultiTabEventPageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMultiTabEventPageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(InvestHotZonePlatform.CREATOR.createFromParcel(parcel));
            }
            return new InvestMultiTabEventPageData(string, string2, i, string3, string4, string5, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMultiTabEventPageData[] newArray(int i) {
            return new InvestMultiTabEventPageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestMultiTabEventPageData() {
        this((String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eventTrackingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.topAreaDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.topViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.topViewUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestHotZonePlatform> component8() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestMultiTabEventPageData copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestHotZonePlatform> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestMultiTabEventPageData(str, str2, i, str3, str4, str5, str6, list);
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
        if (!(obj instanceof InvestMultiTabEventPageData)) {
            return false;
        }
        InvestMultiTabEventPageData investMultiTabEventPageData = (InvestMultiTabEventPageData) obj;
        return Intrinsics.EZpvd((Object) this.appImageUrl, (Object) investMultiTabEventPageData.appImageUrl) && Intrinsics.EZpvd((Object) this.eventTrackingValue, (Object) investMultiTabEventPageData.eventTrackingValue) && this.tabId == investMultiTabEventPageData.tabId && Intrinsics.EZpvd((Object) this.tabName, (Object) investMultiTabEventPageData.tabName) && Intrinsics.EZpvd((Object) this.topAreaDesc, (Object) investMultiTabEventPageData.topAreaDesc) && Intrinsics.EZpvd((Object) this.topViewText, (Object) investMultiTabEventPageData.topViewText) && Intrinsics.EZpvd((Object) this.topViewUrl, (Object) investMultiTabEventPageData.topViewUrl) && Intrinsics.EZpvd(this.platformList, investMultiTabEventPageData.platformList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppImageUrl() {
        return this.appImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingValue() {
        return this.eventTrackingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestHotZonePlatform> getPlatformList() {
        return this.platformList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabId() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopAreaDesc() {
        return this.topAreaDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopViewText() {
        return this.topViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopViewUrl() {
        return this.topViewUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.appImageUrl.hashCode() * 31) + this.eventTrackingValue.hashCode()) * 31) + Integer.hashCode(this.tabId)) * 31) + this.tabName.hashCode()) * 31) + this.topAreaDesc.hashCode()) * 31) + this.topViewText.hashCode()) * 31) + this.topViewUrl.hashCode()) * 31) + this.platformList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestMultiTabEventPageData(appImageUrl=" + this.appImageUrl + ", eventTrackingValue=" + this.eventTrackingValue + ", tabId=" + this.tabId + ", tabName=" + this.tabName + ", topAreaDesc=" + this.topAreaDesc + ", topViewText=" + this.topViewText + ", topViewUrl=" + this.topViewUrl + ", platformList=" + this.platformList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.appImageUrl);
        parcel.writeString(this.eventTrackingValue);
        parcel.writeInt(this.tabId);
        parcel.writeString(this.tabName);
        parcel.writeString(this.topAreaDesc);
        parcel.writeString(this.topViewText);
        parcel.writeString(this.topViewUrl);
        List<InvestHotZonePlatform> list = this.platformList;
        parcel.writeInt(list.size());
        Iterator<InvestHotZonePlatform> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestMultiTabEventPageData> serializer() {
            return InvestMultiTabEventPageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestMultiTabEventPageData(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appImageUrl = "";
        } else {
            this.appImageUrl = str;
        }
        if ((i & 2) == 0) {
            this.eventTrackingValue = "";
        } else {
            this.eventTrackingValue = str2;
        }
        if ((i & 4) == 0) {
            this.tabId = 0;
        } else {
            this.tabId = i2;
        }
        if ((i & 8) == 0) {
            this.tabName = "";
        } else {
            this.tabName = str3;
        }
        if ((i & 16) == 0) {
            this.topAreaDesc = "";
        } else {
            this.topAreaDesc = str4;
        }
        if ((i & 32) == 0) {
            this.topViewText = "";
        } else {
            this.topViewText = str5;
        }
        if ((i & 64) == 0) {
            this.topViewUrl = "";
        } else {
            this.topViewUrl = str6;
        }
        if ((i & 128) == 0) {
            this.platformList = yDY.AhwBna();
        } else {
            this.platformList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestMultiTabEventPageData investMultiTabEventPageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.appImageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investMultiTabEventPageData.appImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.eventTrackingValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investMultiTabEventPageData.eventTrackingValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investMultiTabEventPageData.tabId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, investMultiTabEventPageData.tabId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.tabName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investMultiTabEventPageData.tabName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.topAreaDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investMultiTabEventPageData.topAreaDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.topViewText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investMultiTabEventPageData.topViewText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investMultiTabEventPageData.topViewUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investMultiTabEventPageData.topViewUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(investMultiTabEventPageData.platformList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investMultiTabEventPageData.platformList);
    }

    public InvestMultiTabEventPageData(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestHotZonePlatform> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.appImageUrl = str;
        this.eventTrackingValue = str2;
        this.tabId = i;
        this.tabName = str3;
        this.topAreaDesc = str4;
        this.topViewText = str5;
        this.topViewUrl = str6;
        this.platformList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r17v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform>):void (m)] (LINE:14) call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestMultiTabEventPageData(String str, String str2, int i, String str3, String str4, String str5, String str6, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? yDY.AhwBna() : list);
    }
}
