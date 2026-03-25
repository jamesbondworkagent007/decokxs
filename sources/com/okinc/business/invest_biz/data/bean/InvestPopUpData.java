package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestPopUpData implements Parcelable {
    public static final String KEY_TIPLOGO_EXCLAMATION = "EXCLAMATION";
    public static final String POSITION_BOTTOM = "BOTTOM";
    private final List<InvestButtonAction> actions;
    private final String content;
    private final String position;
    private final String subTitle;
    private final String tipLogo;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestPopUpData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestButtonAction$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestPopUpData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPopUpData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestButtonAction.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InvestPopUpData(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPopUpData[] newArray(int i) {
            return new InvestPopUpData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestPopUpData() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestPopUpData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestPopUpData copy$default(InvestPopUpData investPopUpData, List list, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investPopUpData.actions;
        }
        if ((i & 2) != 0) {
            str = investPopUpData.content;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = investPopUpData.position;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = investPopUpData.subTitle;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = investPopUpData.title;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = investPopUpData.tipLogo;
        }
        return investPopUpData.copy(list, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestButtonAction> component1() {
        return this.actions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tipLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPopUpData copy(List<InvestButtonAction> list, String str, String str2, String str3, String str4, String str5) {
        return new InvestPopUpData(list, str, str2, str3, str4, str5);
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
        if (!(obj instanceof InvestPopUpData)) {
            return false;
        }
        InvestPopUpData investPopUpData = (InvestPopUpData) obj;
        return Intrinsics.EZpvd(this.actions, investPopUpData.actions) && Intrinsics.EZpvd((Object) this.content, (Object) investPopUpData.content) && Intrinsics.EZpvd((Object) this.position, (Object) investPopUpData.position) && Intrinsics.EZpvd((Object) this.subTitle, (Object) investPopUpData.subTitle) && Intrinsics.EZpvd((Object) this.title, (Object) investPopUpData.title) && Intrinsics.EZpvd((Object) this.tipLogo, (Object) investPopUpData.tipLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestButtonAction> getActions() {
        return this.actions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipLogo() {
        return this.tipLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestButtonAction> list = this.actions;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.content;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.position;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subTitle;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tipLogo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestPopUpData(actions=" + this.actions + ", content=" + this.content + ", position=" + this.position + ", subTitle=" + this.subTitle + ", title=" + this.title + ", tipLogo=" + this.tipLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestButtonAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestButtonAction> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.content);
        parcel.writeString(this.position);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.title);
        parcel.writeString(this.tipLogo);
    }

    public /* synthetic */ InvestPopUpData(int i, List list, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actions = null;
        } else {
            this.actions = list;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 4) == 0) {
            this.position = null;
        } else {
            this.position = str2;
        }
        if ((i & 8) == 0) {
            this.subTitle = null;
        } else {
            this.subTitle = str3;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 32) == 0) {
            this.tipLogo = null;
        } else {
            this.tipLogo = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestPopUpData investPopUpData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investPopUpData.actions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investPopUpData.actions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investPopUpData.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investPopUpData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investPopUpData.position != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investPopUpData.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investPopUpData.subTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investPopUpData.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investPopUpData.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investPopUpData.title);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && investPopUpData.tipLogo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investPopUpData.tipLogo);
    }

    public InvestPopUpData(List<InvestButtonAction> list, String str, String str2, String str3, String str4, String str5) {
        this.actions = list;
        this.content = str;
        this.position = str2;
        this.subTitle = str3;
        this.title = str4;
        this.tipLogo = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestButtonAction>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:214) call: com.okinc.business.invest_biz.data.bean.InvestPopUpData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestPopUpData(List list, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestPopUpData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestPopUpData> serializer() {
            return InvestPopUpData$$serializer.INSTANCE;
        }
    }
}
