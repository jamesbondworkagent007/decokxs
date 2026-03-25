package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C9768bbn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EnterWalletMainBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean fromWalletManager;
    private final boolean hideWalletManager;
    private final String homeTabType;
    private final Boolean isShowResetWalletDialog;
    private final Integer mainTabId;
    private final ScanResult scanResult;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EnterWalletMainBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EnterWalletMainBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnterWalletMainBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EnterWalletMainBean(boolValueOf, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (ScanResult) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnterWalletMainBean[] newArray(int i) {
            return new EnterWalletMainBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnterWalletMainBean() {
        this((Boolean) null, (String) null, (Integer) null, (String) null, false, false, (ScanResult) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnterWalletMainBean copy$default(EnterWalletMainBean enterWalletMainBean, Boolean bool, String str, Integer num, String str2, boolean z, boolean z2, ScanResult scanResult, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = enterWalletMainBean.isShowResetWalletDialog;
        }
        if ((i & 2) != 0) {
            str = enterWalletMainBean.walletId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            num = enterWalletMainBean.mainTabId;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = enterWalletMainBean.homeTabType;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = enterWalletMainBean.fromWalletManager;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = enterWalletMainBean.hideWalletManager;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            scanResult = enterWalletMainBean.scanResult;
        }
        return enterWalletMainBean.copy(bool, str3, num2, str4, z3, z4, scanResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isShowResetWalletDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.mainTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.homeTabType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.fromWalletManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hideWalletManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanResult component7() {
        return this.scanResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnterWalletMainBean copy(Boolean bool, String str, Integer num, String str2, boolean z, boolean z2, ScanResult scanResult) {
        return new EnterWalletMainBean(bool, str, num, str2, z, z2, scanResult);
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
        if (!(obj instanceof EnterWalletMainBean)) {
            return false;
        }
        EnterWalletMainBean enterWalletMainBean = (EnterWalletMainBean) obj;
        return Intrinsics.EZpvd(this.isShowResetWalletDialog, enterWalletMainBean.isShowResetWalletDialog) && Intrinsics.EZpvd((Object) this.walletId, (Object) enterWalletMainBean.walletId) && Intrinsics.EZpvd(this.mainTabId, enterWalletMainBean.mainTabId) && Intrinsics.EZpvd((Object) this.homeTabType, (Object) enterWalletMainBean.homeTabType) && this.fromWalletManager == enterWalletMainBean.fromWalletManager && this.hideWalletManager == enterWalletMainBean.hideWalletManager && Intrinsics.EZpvd(this.scanResult, enterWalletMainBean.scanResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromWalletManager() {
        return this.fromWalletManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideWalletManager() {
        return this.hideWalletManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHomeTabType() {
        return this.homeTabType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMainTabId() {
        return this.mainTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanResult getScanResult() {
        return this.scanResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isShowResetWalletDialog;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.walletId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.mainTabId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.homeTabType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = Boolean.hashCode(this.fromWalletManager);
        int iHashCode6 = Boolean.hashCode(this.hideWalletManager);
        ScanResult scanResult = this.scanResult;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (scanResult != null ? scanResult.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isShowResetWalletDialog() {
        return this.isShowResetWalletDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnterWalletMainBean(isShowResetWalletDialog=" + this.isShowResetWalletDialog + ", walletId=" + this.walletId + ", mainTabId=" + this.mainTabId + ", homeTabType=" + this.homeTabType + ", fromWalletManager=" + this.fromWalletManager + ", hideWalletManager=" + this.hideWalletManager + ", scanResult=" + this.scanResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isShowResetWalletDialog;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.walletId);
        Integer num = this.mainTabId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.homeTabType);
        parcel.writeInt(this.fromWalletManager ? 1 : 0);
        parcel.writeInt(this.hideWalletManager ? 1 : 0);
        parcel.writeSerializable(this.scanResult);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.EnterWalletMainBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EnterWalletMainBean> serializer() {
            return EnterWalletMainBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EnterWalletMainBean(int i, Boolean bool, String str, Integer num, String str2, boolean z, boolean z2, ScanResult scanResult, SerializationConstructorMarker serializationConstructorMarker) {
        this.isShowResetWalletDialog = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 4) == 0) {
            this.mainTabId = Integer.valueOf(C9768bbn.gEmmrt);
        } else {
            this.mainTabId = num;
        }
        if ((i & 8) == 0) {
            this.homeTabType = "wallet";
        } else {
            this.homeTabType = str2;
        }
        if ((i & 16) == 0) {
            this.fromWalletManager = false;
        } else {
            this.fromWalletManager = z;
        }
        if ((i & 32) == 0) {
            this.hideWalletManager = false;
        } else {
            this.hideWalletManager = z2;
        }
        if ((i & 64) == 0) {
            this.scanResult = null;
        } else {
            this.scanResult = scanResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(EnterWalletMainBean enterWalletMainBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(enterWalletMainBean.isShowResetWalletDialog, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, enterWalletMainBean.isShowResetWalletDialog);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) enterWalletMainBean.walletId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, enterWalletMainBean.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, enterWalletMainBean.mainTabId);
        } else {
            Integer num = enterWalletMainBean.mainTabId;
            int i = C9768bbn.gEmmrt;
            if (num == null || num.intValue() != i) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) enterWalletMainBean.homeTabType, (Object) "wallet")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, enterWalletMainBean.homeTabType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || enterWalletMainBean.fromWalletManager) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, enterWalletMainBean.fromWalletManager);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || enterWalletMainBean.hideWalletManager) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, enterWalletMainBean.hideWalletManager);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && enterWalletMainBean.scanResult == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ScanResult$$serializer.INSTANCE, enterWalletMainBean.scanResult);
    }

    public EnterWalletMainBean(Boolean bool, String str, Integer num, String str2, boolean z, boolean z2, ScanResult scanResult) {
        this.isShowResetWalletDialog = bool;
        this.walletId = str;
        this.mainTabId = num;
        this.homeTabType = str2;
        this.fromWalletManager = z;
        this.hideWalletManager = z2;
        this.scanResult = scanResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:0x0017: TERNARY null = ((wrap:int:0x000d: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x0013: INVOKE (wrap:int:0x0011: SGET  A[WRAPPED] (LINE:16) o.bbn.gEmmrt int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:16)) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:0x001e: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("wallet") : (r9v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:com.okinc.wallet.api.bean.ScanResult:?: TERNARY null = ((wrap:int:0x002e: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.api.bean.ScanResult) : (r12v0 com.okinc.wallet.api.bean.ScanResult))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, com.okinc.wallet.api.bean.ScanResult):void (m)] (LINE:13) call: com.okinc.wallet.api.bean.EnterWalletMainBean.<init>(java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, com.okinc.wallet.api.bean.ScanResult):void type: THIS */
    public /* synthetic */ EnterWalletMainBean(Boolean bool, String str, Integer num, String str2, boolean z, boolean z2, ScanResult scanResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Integer.valueOf(C9768bbn.gEmmrt) : num, (i & 8) != 0 ? "wallet" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : scanResult);
    }
}
