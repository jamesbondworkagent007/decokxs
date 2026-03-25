package com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommonTransactionData {
    private final String chainId;
    private final DexMultiTokenInfoBean fromToken;
    private String gasPriceScale;
    private final CommonUnSignData quoteData;
    private final String userWalletAddress;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonTransactionData() {
        this((String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (CommonUnSignData) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonTransactionData copy$default(CommonTransactionData commonTransactionData, String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, CommonUnSignData commonUnSignData, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonTransactionData.walletId;
        }
        if ((i & 2) != 0) {
            str2 = commonTransactionData.userWalletAddress;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = commonTransactionData.chainId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean = commonTransactionData.fromToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = dexMultiTokenInfoBean;
        if ((i & 16) != 0) {
            commonUnSignData = commonTransactionData.quoteData;
        }
        CommonUnSignData commonUnSignData2 = commonUnSignData;
        if ((i & 32) != 0) {
            str4 = commonTransactionData.gasPriceScale;
        }
        return commonTransactionData.copy(str, str5, str6, dexMultiTokenInfoBean2, commonUnSignData2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component4() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonUnSignData component5() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasPriceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonTransactionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull CommonUnSignData commonUnSignData, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(commonUnSignData, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CommonTransactionData(str, str2, str3, dexMultiTokenInfoBean, commonUnSignData, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonTransactionData)) {
            return false;
        }
        CommonTransactionData commonTransactionData = (CommonTransactionData) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) commonTransactionData.walletId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) commonTransactionData.userWalletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) commonTransactionData.chainId) && Intrinsics.EZpvd(this.fromToken, commonTransactionData.fromToken) && Intrinsics.EZpvd(this.quoteData, commonTransactionData.quoteData) && Intrinsics.EZpvd((Object) this.gasPriceScale, (Object) commonTransactionData.gasPriceScale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceScale() {
        return this.gasPriceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonUnSignData getQuoteData() {
        return this.quoteData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + this.userWalletAddress.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.fromToken.hashCode()) * 31) + this.quoteData.hashCode()) * 31) + this.gasPriceScale.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPriceScale = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonTransactionData(walletId=" + this.walletId + ", userWalletAddress=" + this.userWalletAddress + ", chainId=" + this.chainId + ", fromToken=" + this.fromToken + ", quoteData=" + this.quoteData + ", gasPriceScale=" + this.gasPriceScale + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonTransactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonTransactionData> serializer() {
            return CommonTransactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonTransactionData(int i, String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, CommonUnSignData commonUnSignData, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 2) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        this.fromToken = (i & 8) == 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean;
        this.quoteData = (i & 16) == 0 ? new CommonUnSignData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : commonUnSignData;
        this.gasPriceScale = (i & 32) == 0 ? "1" : str4;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CommonTransactionData commonTransactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) commonTransactionData.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, commonTransactionData.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) commonTransactionData.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, commonTransactionData.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) commonTransactionData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, commonTransactionData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(commonTransactionData.fromToken, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, DexMultiTokenInfoBean$$serializer.INSTANCE, commonTransactionData.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(commonTransactionData.quoteData, new CommonUnSignData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, CommonUnSignData$$serializer.INSTANCE, commonTransactionData.quoteData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) commonTransactionData.gasPriceScale, (Object) "1")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, commonTransactionData.gasPriceScale);
    }

    public CommonTransactionData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull CommonUnSignData commonUnSignData, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(commonUnSignData, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.walletId = str;
        this.userWalletAddress = str2;
        this.chainId = str3;
        this.fromToken = dexMultiTokenInfoBean;
        this.quoteData = commonUnSignData;
        this.gasPriceScale = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r75v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r71v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.TokenInfoForApp:?: CAST (com.okinc.business.dexlogic.bean.TokenInfoForApp) (null com.okinc.business.dexlogic.bean.TokenInfoForApp))
  (-1 int)
  (134217727 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:25) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r72v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData:?: TERNARY null = ((wrap:int:0x0098: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:26) call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r73v0 com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("1") : (r74v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData, java.lang.String):void (m)] (LINE:24) call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonTransactionData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData, java.lang.String):void type: THIS */
    public /* synthetic */ CommonTransactionData(String str, String str2, String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, CommonUnSignData commonUnSignData, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean, (i & 16) != 0 ? new CommonUnSignData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : commonUnSignData, (i & 32) != 0 ? "1" : str4);
    }
}
