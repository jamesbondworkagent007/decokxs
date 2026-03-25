package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class MainChainBalanceResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String coinAmountOrigin;
    private final Integer decimalNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MainChainBalanceResp() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MainChainBalanceResp copy$default(MainChainBalanceResp mainChainBalanceResp, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mainChainBalanceResp.coinAmountOrigin;
        }
        if ((i & 2) != 0) {
            num = mainChainBalanceResp.decimalNum;
        }
        return mainChainBalanceResp.copy(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MainChainBalanceResp copy(String str, Integer num) {
        return new MainChainBalanceResp(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainChainBalanceResp)) {
            return false;
        }
        MainChainBalanceResp mainChainBalanceResp = (MainChainBalanceResp) obj;
        return Intrinsics.EZpvd((Object) this.coinAmountOrigin, (Object) mainChainBalanceResp.coinAmountOrigin) && Intrinsics.EZpvd(this.decimalNum, mainChainBalanceResp.decimalNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountOrigin() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinAmountOrigin;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.decimalNum;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MainChainBalanceResp(coinAmountOrigin=" + this.coinAmountOrigin + ", decimalNum=" + this.decimalNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.MainChainBalanceResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MainChainBalanceResp> serializer() {
            return MainChainBalanceResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MainChainBalanceResp(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinAmountOrigin = null;
        } else {
            this.coinAmountOrigin = str;
        }
        if ((i & 2) == 0) {
            this.decimalNum = null;
        } else {
            this.decimalNum = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MainChainBalanceResp mainChainBalanceResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mainChainBalanceResp.coinAmountOrigin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mainChainBalanceResp.coinAmountOrigin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && mainChainBalanceResp.decimalNum == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, mainChainBalanceResp.decimalNum);
    }

    public MainChainBalanceResp(String str, Integer num) {
        this.coinAmountOrigin = str;
        this.decimalNum = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:1890) call: com.okinc.business.defi.biz.net.bean.MainChainBalanceResp.<init>(java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ MainChainBalanceResp(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
