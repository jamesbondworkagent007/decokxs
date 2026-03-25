package com.okinc.web3Uilib.bean;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MultiTransactionDetailBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String content;
    private final List<MultiTransactionDetailItem> inputList;
    private final String inputTitle;
    private final List<MultiTransactionDetailItem> outputList;
    private final String outputTitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiTransactionDetailBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MultiTransactionDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransactionDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MultiTransactionDetailItem.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(MultiTransactionDetailItem.CREATOR.createFromParcel(parcel));
            }
            return new MultiTransactionDetailBean(string, string2, string3, arrayList, string4, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransactionDetailBean[] newArray(int i) {
            return new MultiTransactionDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiTransactionDetailBean() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.web3Uilib.bean.MultiTransactionDetailBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiTransactionDetailBean copy$default(MultiTransactionDetailBean multiTransactionDetailBean, String str, String str2, String str3, List list, String str4, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiTransactionDetailBean.title;
        }
        if ((i & 2) != 0) {
            str2 = multiTransactionDetailBean.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = multiTransactionDetailBean.inputTitle;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = multiTransactionDetailBean.inputList;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            str4 = multiTransactionDetailBean.outputTitle;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            list2 = multiTransactionDetailBean.outputList;
        }
        return multiTransactionDetailBean.copy(str, str5, str6, list3, str7, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inputTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MultiTransactionDetailItem> component4() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.outputTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MultiTransactionDetailItem> component6() {
        return this.outputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiTransactionDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<MultiTransactionDetailItem> list, @NotNull String str4, @NotNull List<MultiTransactionDetailItem> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new MultiTransactionDetailBean(str, str2, str3, list, str4, list2);
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
        if (!(obj instanceof MultiTransactionDetailBean)) {
            return false;
        }
        MultiTransactionDetailBean multiTransactionDetailBean = (MultiTransactionDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) multiTransactionDetailBean.title) && Intrinsics.EZpvd((Object) this.content, (Object) multiTransactionDetailBean.content) && Intrinsics.EZpvd((Object) this.inputTitle, (Object) multiTransactionDetailBean.inputTitle) && Intrinsics.EZpvd(this.inputList, multiTransactionDetailBean.inputList) && Intrinsics.EZpvd((Object) this.outputTitle, (Object) multiTransactionDetailBean.outputTitle) && Intrinsics.EZpvd(this.outputList, multiTransactionDetailBean.outputList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MultiTransactionDetailItem> getInputList() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MultiTransactionDetailItem> getOutputList() {
        return this.outputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutputTitle() {
        return this.outputTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.inputTitle.hashCode()) * 31) + this.inputList.hashCode()) * 31) + this.outputTitle.hashCode()) * 31) + this.outputList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiTransactionDetailBean(title=" + this.title + ", content=" + this.content + ", inputTitle=" + this.inputTitle + ", inputList=" + this.inputList + ", outputTitle=" + this.outputTitle + ", outputList=" + this.outputList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.inputTitle);
        List<MultiTransactionDetailItem> list = this.inputList;
        parcel.writeInt(list.size());
        Iterator<MultiTransactionDetailItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.outputTitle);
        List<MultiTransactionDetailItem> list2 = this.outputList;
        parcel.writeInt(list2.size());
        Iterator<MultiTransactionDetailItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.MultiTransactionDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiTransactionDetailBean> serializer() {
            return MultiTransactionDetailBean$$serializer.INSTANCE;
        }
    }

    static {
        MultiTransactionDetailItem$$serializer multiTransactionDetailItem$$serializer = MultiTransactionDetailItem$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(multiTransactionDetailItem$$serializer), null, new ArrayListSerializer(multiTransactionDetailItem$$serializer)};
    }

    public /* synthetic */ MultiTransactionDetailBean(int i, String str, String str2, String str3, List list, String str4, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.inputTitle = "";
        } else {
            this.inputTitle = str3;
        }
        if ((i & 8) == 0) {
            this.inputList = yDY.AhwBna();
        } else {
            this.inputList = list;
        }
        if ((i & 16) == 0) {
            this.outputTitle = "";
        } else {
            this.outputTitle = str4;
        }
        if ((i & 32) == 0) {
            this.outputList = yDY.AhwBna();
        } else {
            this.outputList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(MultiTransactionDetailBean multiTransactionDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) multiTransactionDetailBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, multiTransactionDetailBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) multiTransactionDetailBean.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, multiTransactionDetailBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) multiTransactionDetailBean.inputTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, multiTransactionDetailBean.inputTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(multiTransactionDetailBean.inputList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], multiTransactionDetailBean.inputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) multiTransactionDetailBean.outputTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, multiTransactionDetailBean.outputTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(multiTransactionDetailBean.outputList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], multiTransactionDetailBean.outputList);
    }

    public MultiTransactionDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<MultiTransactionDetailItem> list, @NotNull String str4, @NotNull List<MultiTransactionDetailItem> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.title = str;
        this.content = str2;
        this.inputTitle = str3;
        this.inputList = list;
        this.outputTitle = str4;
        this.outputList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.List:0x001f: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:294)) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:296)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.web3Uilib.bean.MultiTransactionDetailItem>, java.lang.String, java.util.List<com.okinc.web3Uilib.bean.MultiTransactionDetailItem>):void (m)] (LINE:290) call: com.okinc.web3Uilib.bean.MultiTransactionDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MultiTransactionDetailBean(String str, String str2, String str3, List list, String str4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? yDY.AhwBna() : list2);
    }
}
