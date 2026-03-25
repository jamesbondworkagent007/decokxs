package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class DexOrderSubItem implements Parcelable {
    private final Function0<Unit> onTitleClick;
    private String orderSubValue;
    private String orderTitle;
    private CharSequence orderValue;
    private int position;
    private int titleHyperType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexOrderSubItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    public static final class Creator implements Parcelable.Creator<DexOrderSubItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderSubItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexOrderSubItem(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderSubItem[] newArray(int i) {
            return new DexOrderSubItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexOrderSubItem() {
        this((String) null, (CharSequence) null, (String) null, 0, 0, (Function0) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.subscribe.DexOrderSubItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexOrderSubItem copy$default(DexOrderSubItem dexOrderSubItem, String str, CharSequence charSequence, String str2, int i, int i2, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dexOrderSubItem.orderTitle;
        }
        if ((i3 & 2) != 0) {
            charSequence = dexOrderSubItem.orderValue;
        }
        CharSequence charSequence2 = charSequence;
        if ((i3 & 4) != 0) {
            str2 = dexOrderSubItem.orderSubValue;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            i = dexOrderSubItem.position;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = dexOrderSubItem.titleHyperType;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            function0 = dexOrderSubItem.onTitleClick;
        }
        return dexOrderSubItem.copy(str, charSequence2, str3, i4, i5, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderSubValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.titleHyperType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component6() {
        return this.onTitleClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderSubItem copy(@NotNull String str, @NotNull CharSequence charSequence, @NotNull String str2, int i, int i2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexOrderSubItem(str, charSequence, str2, i, i2, function0);
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
        if (!(obj instanceof DexOrderSubItem)) {
            return false;
        }
        DexOrderSubItem dexOrderSubItem = (DexOrderSubItem) obj;
        return Intrinsics.EZpvd((Object) this.orderTitle, (Object) dexOrderSubItem.orderTitle) && Intrinsics.EZpvd(this.orderValue, dexOrderSubItem.orderValue) && Intrinsics.EZpvd((Object) this.orderSubValue, (Object) dexOrderSubItem.orderSubValue) && this.position == dexOrderSubItem.position && this.titleHyperType == dexOrderSubItem.titleHyperType && Intrinsics.EZpvd(this.onTitleClick, dexOrderSubItem.onTitleClick);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnTitleClick() {
        return this.onTitleClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSubValue() {
        return this.orderSubValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTitle() {
        return this.orderTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleHyperType() {
        return this.titleHyperType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderTitle.hashCode();
        int iHashCode2 = this.orderValue.hashCode();
        int iHashCode3 = this.orderSubValue.hashCode();
        int iHashCode4 = Integer.hashCode(this.position);
        int iHashCode5 = Integer.hashCode(this.titleHyperType);
        Function0<Unit> function0 = this.onTitleClick;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSubValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderSubValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.orderValue = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleHyperType(int i) {
        this.titleHyperType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.orderTitle;
        CharSequence charSequence = this.orderValue;
        return "DexOrderSubItem(orderTitle=" + str + ", orderValue=" + ((Object) charSequence) + ", orderSubValue=" + this.orderSubValue + ", position=" + this.position + ", titleHyperType=" + this.titleHyperType + ", onTitleClick=" + this.onTitleClick + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderTitle);
        TextUtils.writeToParcel(this.orderValue, parcel, i);
        parcel.writeString(this.orderSubValue);
        parcel.writeInt(this.position);
        parcel.writeInt(this.titleHyperType);
        parcel.writeSerializable((java.io.Serializable) this.onTitleClick);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.DexOrderSubItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexOrderSubItem> serializer() {
            return DexOrderSubItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexOrderSubItem(int i, String str, CharSequence charSequence, String str2, int i2, int i3, Function0 function0, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderTitle = "";
        } else {
            this.orderTitle = str;
        }
        if ((i & 2) == 0) {
            this.orderValue = "";
        } else {
            this.orderValue = charSequence;
        }
        if ((i & 4) == 0) {
            this.orderSubValue = "";
        } else {
            this.orderSubValue = str2;
        }
        if ((i & 8) == 0) {
            this.position = 0;
        } else {
            this.position = i2;
        }
        if ((i & 16) == 0) {
            this.titleHyperType = 2;
        } else {
            this.titleHyperType = i3;
        }
        if ((i & 32) == 0) {
            this.onTitleClick = null;
        } else {
            this.onTitleClick = function0;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DexOrderSubItem dexOrderSubItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexOrderSubItem.orderTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexOrderSubItem.orderTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexOrderSubItem.orderValue, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dexOrderSubItem.orderValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexOrderSubItem.orderSubValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexOrderSubItem.orderSubValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexOrderSubItem.position != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, dexOrderSubItem.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dexOrderSubItem.titleHyperType != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, dexOrderSubItem.titleHyperType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && dexOrderSubItem.onTitleClick == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], dexOrderSubItem.onTitleClick);
    }

    public DexOrderSubItem(@NotNull String str, @NotNull CharSequence charSequence, @NotNull String str2, int i, int i2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderTitle = str;
        this.orderValue = charSequence;
        this.orderSubValue = str2;
        this.position = i;
        this.titleHyperType = i2;
        this.onTitleClick = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r9v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r10v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.String, int, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:99) call: com.okinc.unify_trade.biz.subscribe.DexOrderSubItem.<init>(java.lang.String, java.lang.CharSequence, java.lang.String, int, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ DexOrderSubItem(String str, CharSequence charSequence, String str2, int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : charSequence, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 2 : i2, (i3 & 32) != 0 ? null : function0);
    }
}
