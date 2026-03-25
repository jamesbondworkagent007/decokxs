package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeStrategyInfoLanguageBean implements Parcelable {
    private ArrayList<TradeStrategyInfoButtonBean> buttons;
    private String message;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeStrategyInfoLanguageBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(TradeStrategyInfoButtonBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<TradeStrategyInfoLanguageBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyInfoLanguageBean createFromParcel(Parcel parcel) {
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
                    arrayList2.add(TradeStrategyInfoButtonBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TradeStrategyInfoLanguageBean(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyInfoLanguageBean[] newArray(int i) {
            return new TradeStrategyInfoLanguageBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeStrategyInfoLanguageBean() {
        this((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeStrategyInfoLanguageBean copy$default(TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeStrategyInfoLanguageBean.title;
        }
        if ((i & 2) != 0) {
            str2 = tradeStrategyInfoLanguageBean.message;
        }
        if ((i & 4) != 0) {
            arrayList = tradeStrategyInfoLanguageBean.buttons;
        }
        return tradeStrategyInfoLanguageBean.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeStrategyInfoButtonBean> component3() {
        return this.buttons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyInfoLanguageBean copy(String str, String str2, ArrayList<TradeStrategyInfoButtonBean> arrayList) {
        return new TradeStrategyInfoLanguageBean(str, str2, arrayList);
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
        if (!(obj instanceof TradeStrategyInfoLanguageBean)) {
            return false;
        }
        TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean = (TradeStrategyInfoLanguageBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) tradeStrategyInfoLanguageBean.title) && Intrinsics.EZpvd((Object) this.message, (Object) tradeStrategyInfoLanguageBean.message) && Intrinsics.EZpvd(this.buttons, tradeStrategyInfoLanguageBean.buttons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeStrategyInfoButtonBean> getButtons() {
        return this.buttons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        ArrayList<TradeStrategyInfoButtonBean> arrayList = this.buttons;
        return (((iHashCode * 31) + iHashCode2) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setButtons(ArrayList<TradeStrategyInfoButtonBean> arrayList) {
        this.buttons = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(String str) {
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStrategyInfoLanguageBean(title=" + this.title + ", message=" + this.message + ", buttons=" + this.buttons + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        ArrayList<TradeStrategyInfoButtonBean> arrayList = this.buttons;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<TradeStrategyInfoButtonBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStrategyInfoLanguageBean> serializer() {
            return TradeStrategyInfoLanguageBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStrategyInfoLanguageBean(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.buttons = null;
        } else {
            this.buttons = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeStrategyInfoLanguageBean.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeStrategyInfoLanguageBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeStrategyInfoLanguageBean.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeStrategyInfoLanguageBean.message);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tradeStrategyInfoLanguageBean.buttons == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradeStrategyInfoLanguageBean.buttons);
    }

    public TradeStrategyInfoLanguageBean(String str, String str2, ArrayList<TradeStrategyInfoButtonBean> arrayList) {
        this.title = str;
        this.message = str2;
        this.buttons = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.TradeStrategyInfoButtonBean>):void (m)] (LINE:1133) call: com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ TradeStrategyInfoLanguageBean(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arrayList);
    }
}
