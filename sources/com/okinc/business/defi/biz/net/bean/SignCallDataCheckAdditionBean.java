package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SignCallDataCheckAdditionBean implements Parcelable {
    private final List<String> assets;
    private final String spender;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignCallDataCheckAdditionBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SignCallDataCheckAdditionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckAdditionBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignCallDataCheckAdditionBean(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckAdditionBean[] newArray(int i) {
            return new SignCallDataCheckAdditionBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignCallDataCheckAdditionBean() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignCallDataCheckAdditionBean copy$default(SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signCallDataCheckAdditionBean.spender;
        }
        if ((i & 2) != 0) {
            str2 = signCallDataCheckAdditionBean.value;
        }
        if ((i & 4) != 0) {
            list = signCallDataCheckAdditionBean.assets;
        }
        return signCallDataCheckAdditionBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.spender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCallDataCheckAdditionBean copy(String str, String str2, List<String> list) {
        return new SignCallDataCheckAdditionBean(str, str2, list);
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
        if (!(obj instanceof SignCallDataCheckAdditionBean)) {
            return false;
        }
        SignCallDataCheckAdditionBean signCallDataCheckAdditionBean = (SignCallDataCheckAdditionBean) obj;
        return Intrinsics.EZpvd((Object) this.spender, (Object) signCallDataCheckAdditionBean.spender) && Intrinsics.EZpvd((Object) this.value, (Object) signCallDataCheckAdditionBean.value) && Intrinsics.EZpvd(this.assets, signCallDataCheckAdditionBean.assets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAssets() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpender() {
        return this.spender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.spender;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.assets;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignCallDataCheckAdditionBean(spender=" + this.spender + ", value=" + this.value + ", assets=" + this.assets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.spender);
        parcel.writeString(this.value);
        parcel.writeStringList(this.assets);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignCallDataCheckAdditionBean> serializer() {
            return SignCallDataCheckAdditionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignCallDataCheckAdditionBean(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.spender = null;
        } else {
            this.spender = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.assets = null;
        } else {
            this.assets = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signCallDataCheckAdditionBean.spender != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signCallDataCheckAdditionBean.spender);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signCallDataCheckAdditionBean.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signCallDataCheckAdditionBean.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signCallDataCheckAdditionBean.assets == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], signCallDataCheckAdditionBean.assets);
    }

    public SignCallDataCheckAdditionBean(String str, String str2, List<String> list) {
        this.spender = str;
        this.value = str2;
        this.assets = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:547) call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SignCallDataCheckAdditionBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
