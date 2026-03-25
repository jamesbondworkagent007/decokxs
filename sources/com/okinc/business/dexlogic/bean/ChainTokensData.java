package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ChainTokensData implements Parcelable {
    private final boolean clickable;
    private final String clickableMsg;
    private final String text;
    private final List<DexMultiTokenInfoBean> tokenList;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChainTokensData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(DexMultiTokenInfoBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ChainTokensData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainTokensData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChainTokensData(string, string2, z, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainTokensData[] newArray(int i) {
            return new ChainTokensData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainTokensData() {
        this((String) null, (String) null, false, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dexlogic.bean.ChainTokensData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainTokensData copy$default(ChainTokensData chainTokensData, String str, String str2, boolean z, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chainTokensData.text;
        }
        if ((i & 2) != 0) {
            str2 = chainTokensData.type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = chainTokensData.clickable;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = chainTokensData.clickableMsg;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = chainTokensData.tokenList;
        }
        return chainTokensData.copy(str, str4, z2, str5, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.clickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.clickableMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> component5() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainTokensData copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ChainTokensData(str, str2, z, str3, list);
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
        if (!(obj instanceof ChainTokensData)) {
            return false;
        }
        ChainTokensData chainTokensData = (ChainTokensData) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) chainTokensData.text) && Intrinsics.EZpvd((Object) this.type, (Object) chainTokensData.type) && this.clickable == chainTokensData.clickable && Intrinsics.EZpvd((Object) this.clickableMsg, (Object) chainTokensData.clickableMsg) && Intrinsics.EZpvd(this.tokenList, chainTokensData.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClickableMsg() {
        return this.clickableMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.text.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = Boolean.hashCode(this.clickable);
        int iHashCode4 = this.clickableMsg.hashCode();
        List<DexMultiTokenInfoBean> list = this.tokenList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainTokensData(text=" + this.text + ", type=" + this.type + ", clickable=" + this.clickable + ", clickableMsg=" + this.clickableMsg + ", tokenList=" + this.tokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.type);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.clickableMsg);
        List<DexMultiTokenInfoBean> list = this.tokenList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DexMultiTokenInfoBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ChainTokensData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainTokensData> serializer() {
            return ChainTokensData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainTokensData(int i, String str, String str2, boolean z, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.clickable = true;
        } else {
            this.clickable = z;
        }
        if ((i & 8) == 0) {
            this.clickableMsg = "";
        } else {
            this.clickableMsg = str3;
        }
        if ((i & 16) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ChainTokensData chainTokensData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) chainTokensData.text, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, chainTokensData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chainTokensData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chainTokensData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !chainTokensData.clickable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, chainTokensData.clickable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chainTokensData.clickableMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chainTokensData.clickableMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(chainTokensData.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], chainTokensData.tokenList);
    }

    public ChainTokensData(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.text = str;
        this.type = str2;
        this.clickable = z;
        this.clickableMsg = str3;
        this.tokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:314)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>):void (m)] (LINE:309) call: com.okinc.business.dexlogic.bean.ChainTokensData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ChainTokensData(String str, String str2, boolean z, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? yDY.AhwBna() : list);
    }
}
