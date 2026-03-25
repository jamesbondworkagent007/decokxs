package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AssetAirDropReceiveItemBean {
    private String balance;
    private Integer currencyId;
    private String currencyName;
    private String fullName;
    private String icon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetAirDropReceiveItemBean() {
        this((String) null, (Integer) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetAirDropReceiveItemBean copy$default(AssetAirDropReceiveItemBean assetAirDropReceiveItemBean, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetAirDropReceiveItemBean.balance;
        }
        if ((i & 2) != 0) {
            num = assetAirDropReceiveItemBean.currencyId;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = assetAirDropReceiveItemBean.currencyName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = assetAirDropReceiveItemBean.icon;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = assetAirDropReceiveItemBean.fullName;
        }
        return assetAirDropReceiveItemBean.copy(str, num2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetAirDropReceiveItemBean copy(String str, Integer num, String str2, String str3, String str4) {
        return new AssetAirDropReceiveItemBean(str, num, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetAirDropReceiveItemBean)) {
            return false;
        }
        AssetAirDropReceiveItemBean assetAirDropReceiveItemBean = (AssetAirDropReceiveItemBean) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) assetAirDropReceiveItemBean.balance) && Intrinsics.EZpvd(this.currencyId, assetAirDropReceiveItemBean.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) assetAirDropReceiveItemBean.currencyName) && Intrinsics.EZpvd((Object) this.icon, (Object) assetAirDropReceiveItemBean.icon) && Intrinsics.EZpvd((Object) this.fullName, (Object) assetAirDropReceiveItemBean.fullName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.balance;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.currencyName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.icon;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fullName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(String str) {
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyName(String str) {
        this.currencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetAirDropReceiveItemBean(balance=" + this.balance + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", icon=" + this.icon + ", fullName=" + this.fullName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AssetAirDropReceiveItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetAirDropReceiveItemBean> serializer() {
            return AssetAirDropReceiveItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetAirDropReceiveItemBean(int i, String str, Integer num, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.balance = null;
        } else {
            this.balance = str;
        }
        if ((i & 2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.currencyName = null;
        } else {
            this.currencyName = str2;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i & 16) == 0) {
            this.fullName = null;
        } else {
            this.fullName = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AssetAirDropReceiveItemBean assetAirDropReceiveItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetAirDropReceiveItemBean.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetAirDropReceiveItemBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetAirDropReceiveItemBean.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, assetAirDropReceiveItemBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetAirDropReceiveItemBean.currencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetAirDropReceiveItemBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetAirDropReceiveItemBean.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, assetAirDropReceiveItemBean.icon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && assetAirDropReceiveItemBean.fullName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetAirDropReceiveItemBean.fullName);
    }

    public AssetAirDropReceiveItemBean(String str, Integer num, String str2, String str3, String str4) {
        this.balance = str;
        this.currencyId = num;
        this.currencyName = str2;
        this.icon = str3;
        this.fullName = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.AssetAirDropReceiveItemBean.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetAirDropReceiveItemBean(String str, Integer num, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
