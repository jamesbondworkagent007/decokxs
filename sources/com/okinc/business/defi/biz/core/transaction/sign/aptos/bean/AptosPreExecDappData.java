package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AptosPreExecDappData {
    private final Data data;
    private final Transaction transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosPreExecDappData copy$default(AptosPreExecDappData aptosPreExecDappData, Transaction transaction, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            transaction = aptosPreExecDappData.transaction;
        }
        if ((i & 2) != 0) {
            data = aptosPreExecDappData.data;
        }
        return aptosPreExecDappData.copy(transaction, data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Transaction component1() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Data component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosPreExecDappData copy(@NotNull Transaction transaction, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(transaction, "");
        Intrinsics.checkNotNullParameter(data, "");
        return new AptosPreExecDappData(transaction, data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosPreExecDappData)) {
            return false;
        }
        AptosPreExecDappData aptosPreExecDappData = (AptosPreExecDappData) obj;
        return Intrinsics.EZpvd(this.transaction, aptosPreExecDappData.transaction) && Intrinsics.EZpvd(this.data, aptosPreExecDappData.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Data getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Transaction getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.transaction.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosPreExecDappData(transaction=" + this.transaction + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosPreExecDappData> serializer() {
            return AptosPreExecDappData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosPreExecDappData(int i, Transaction transaction, Data data, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AptosPreExecDappData$$serializer.INSTANCE.getDescriptor());
        }
        this.transaction = transaction;
        if ((i & 2) == 0) {
            this.data = new Data((String) null, (String) null, (Data.Options) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.data = data;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AptosPreExecDappData aptosPreExecDappData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AptosPreExecDappData$Transaction$$serializer.INSTANCE, aptosPreExecDappData.transaction);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(aptosPreExecDappData.data, new Data((String) null, (String) null, (Data.Options) null, (Boolean) null, 15, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AptosPreExecDappData$Data$$serializer.INSTANCE, aptosPreExecDappData.data);
    }

    public AptosPreExecDappData(@NotNull Transaction transaction, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(transaction, "");
        Intrinsics.checkNotNullParameter(data, "");
        this.transaction = transaction;
        this.data = data;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Transaction)
  (wrap:com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options:?: CAST (com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options) (null com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options))
  (wrap:java.lang.Boolean:?: CAST (java.lang.Boolean) (null java.lang.Boolean))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:28) call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Data.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data))
 A[MD:(com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Transaction, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data):void (m)] (LINE:26) call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.<init>(com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Transaction, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data):void type: THIS */
    public /* synthetic */ AptosPreExecDappData(Transaction transaction, Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transaction, (i & 2) != 0 ? new Data((String) null, (String) null, (Data.Options) null, (Boolean) null, 15, (DefaultConstructorMarker) null) : data);
    }

    @Serializable
    public static final class Transaction {
        private final List<String> additionalSigners;
        private final String amount;
        private final String expirationTimestampSecs;
        private final String fungibleAssetMetadataAddress;
        private final String gasUnitPrice;
        private final String maxGasAmount;
        private final String publicKey;
        private final String sequenceNumber;
        private final String tyArg;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Transaction() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tyArg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.fungibleAssetMetadataAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.publicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.sequenceNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.maxGasAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.gasUnitPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.expirationTimestampSecs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component9() {
            return this.additionalSigners;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Transaction copy(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, List<String> list) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new Transaction(str, str2, str3, str4, str5, str6, str7, str8, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Transaction)) {
                return false;
            }
            Transaction transaction = (Transaction) obj;
            return Intrinsics.EZpvd((Object) this.amount, (Object) transaction.amount) && Intrinsics.EZpvd((Object) this.tyArg, (Object) transaction.tyArg) && Intrinsics.EZpvd((Object) this.fungibleAssetMetadataAddress, (Object) transaction.fungibleAssetMetadataAddress) && Intrinsics.EZpvd((Object) this.publicKey, (Object) transaction.publicKey) && Intrinsics.EZpvd((Object) this.sequenceNumber, (Object) transaction.sequenceNumber) && Intrinsics.EZpvd((Object) this.maxGasAmount, (Object) transaction.maxGasAmount) && Intrinsics.EZpvd((Object) this.gasUnitPrice, (Object) transaction.gasUnitPrice) && Intrinsics.EZpvd((Object) this.expirationTimestampSecs, (Object) transaction.expirationTimestampSecs) && Intrinsics.EZpvd(this.additionalSigners, transaction.additionalSigners);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getAdditionalSigners() {
            return this.additionalSigners;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpirationTimestampSecs() {
            return this.expirationTimestampSecs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFungibleAssetMetadataAddress() {
            return this.fungibleAssetMetadataAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGasUnitPrice() {
            return this.gasUnitPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxGasAmount() {
            return this.maxGasAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPublicKey() {
            return this.publicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTyArg() {
            return this.tyArg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amount;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.tyArg;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.fungibleAssetMetadataAddress;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            int iHashCode4 = this.publicKey.hashCode();
            int iHashCode5 = this.sequenceNumber.hashCode();
            String str4 = this.maxGasAmount;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            int iHashCode7 = this.gasUnitPrice.hashCode();
            int iHashCode8 = this.expirationTimestampSecs.hashCode();
            List<String> list = this.additionalSigners;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Transaction(amount=" + this.amount + ", tyArg=" + this.tyArg + ", fungibleAssetMetadataAddress=" + this.fungibleAssetMetadataAddress + ", publicKey=" + this.publicKey + ", sequenceNumber=" + this.sequenceNumber + ", maxGasAmount=" + this.maxGasAmount + ", gasUnitPrice=" + this.gasUnitPrice + ", expirationTimestampSecs=" + this.expirationTimestampSecs + ", additionalSigners=" + this.additionalSigners + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Transaction.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Transaction> serializer() {
                return AptosPreExecDappData$Transaction$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Transaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amount = null;
            } else {
                this.amount = str;
            }
            if ((i & 2) == 0) {
                this.tyArg = null;
            } else {
                this.tyArg = str2;
            }
            if ((i & 4) == 0) {
                this.fungibleAssetMetadataAddress = null;
            } else {
                this.fungibleAssetMetadataAddress = str3;
            }
            if ((i & 8) == 0) {
                this.publicKey = "";
            } else {
                this.publicKey = str4;
            }
            if ((i & 16) == 0) {
                this.sequenceNumber = "";
            } else {
                this.sequenceNumber = str5;
            }
            if ((i & 32) == 0) {
                this.maxGasAmount = null;
            } else {
                this.maxGasAmount = str6;
            }
            if ((i & 64) == 0) {
                this.gasUnitPrice = "";
            } else {
                this.gasUnitPrice = str7;
            }
            if ((i & 128) == 0) {
                this.expirationTimestampSecs = "";
            } else {
                this.expirationTimestampSecs = str8;
            }
            if ((i & 256) == 0) {
                this.additionalSigners = null;
            } else {
                this.additionalSigners = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Transaction transaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transaction.amount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transaction.amount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transaction.tyArg != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, transaction.tyArg);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transaction.fungibleAssetMetadataAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, transaction.fungibleAssetMetadataAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transaction.publicKey, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, transaction.publicKey);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transaction.sequenceNumber, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, transaction.sequenceNumber);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transaction.maxGasAmount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, transaction.maxGasAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transaction.gasUnitPrice, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, transaction.gasUnitPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transaction.expirationTimestampSecs, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, transaction.expirationTimestampSecs);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && transaction.additionalSigners == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], transaction.additionalSigners);
        }

        public Transaction(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, List<String> list) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.amount = str;
            this.tyArg = str2;
            this.fungibleAssetMetadataAddress = str3;
            this.publicKey = str4;
            this.sequenceNumber = str5;
            this.maxGasAmount = str6;
            this.gasUnitPrice = str7;
            this.expirationTimestampSecs = str8;
            this.additionalSigners = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:33) call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Transaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ Transaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) == 0 ? list : null);
        }
    }

    @Serializable
    public static final class Data {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String abi;
        private final Boolean isRawType;
        private final Options options;
        private final String payload;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Data() {
            this((String) null, (String) null, (Options) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Data copy$default(Data data, String str, String str2, Options options, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.payload;
            }
            if ((i & 2) != 0) {
                str2 = data.abi;
            }
            if ((i & 4) != 0) {
                options = data.options;
            }
            if ((i & 8) != 0) {
                bool = data.isRawType;
            }
            return data.copy(str, str2, options, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.abi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Options component3() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component4() {
            return this.isRawType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Data copy(String str, String str2, Options options, Boolean bool) {
            return new Data(str, str2, options, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.EZpvd((Object) this.payload, (Object) data.payload) && Intrinsics.EZpvd((Object) this.abi, (Object) data.abi) && Intrinsics.EZpvd(this.options, data.options) && Intrinsics.EZpvd(this.isRawType, data.isRawType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAbi() {
            return this.abi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Options getOptions() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.payload;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.abi;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Options options = this.options;
            int iHashCode3 = options == null ? 0 : options.hashCode();
            Boolean bool = this.isRawType;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isRawType() {
            return this.isRawType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Data(payload=" + this.payload + ", abi=" + this.abi + ", options=" + this.options + ", isRawType=" + this.isRawType + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Data.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Data> serializer() {
                return AptosPreExecDappData$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i, String str, String str2, Options options, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.payload = null;
            } else {
                this.payload = str;
            }
            if ((i & 2) == 0) {
                this.abi = null;
            } else {
                this.abi = str2;
            }
            if ((i & 4) == 0) {
                this.options = null;
            } else {
                this.options = options;
            }
            if ((i & 8) == 0) {
                this.isRawType = null;
            } else {
                this.isRawType = bool;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || data.payload != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, data.payload);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || data.abi != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, data.abi);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || data.options != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, AptosPreExecDappData$Data$Options$$serializer.INSTANCE, data.options);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && data.isRawType == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, data.isRawType);
        }

        public Data(String str, String str2, Options options, Boolean bool) {
            this.payload = str;
            this.abi = str2;
            this.options = options;
            this.isRawType = bool;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options) : (r4v0 com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options, java.lang.Boolean):void (m)] (LINE:47) call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Data.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData$Data$Options, java.lang.Boolean):void type: THIS */
        public /* synthetic */ Data(String str, String str2, Options options, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : options, (i & 8) != 0 ? null : bool);
        }

        @Serializable
        public static final class Options {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String gas_unit_price;
            private final String max_gas_amount;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Options copy$default(Options options, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = options.max_gas_amount;
                }
                if ((i & 2) != 0) {
                    str2 = options.gas_unit_price;
                }
                return options.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.max_gas_amount;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.gas_unit_price;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Options copy(String str, String str2) {
                return new Options(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Options)) {
                    return false;
                }
                Options options = (Options) obj;
                return Intrinsics.EZpvd((Object) this.max_gas_amount, (Object) options.max_gas_amount) && Intrinsics.EZpvd((Object) this.gas_unit_price, (Object) options.gas_unit_price);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getGas_unit_price() {
                return this.gas_unit_price;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMax_gas_amount() {
                return this.max_gas_amount;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.max_gas_amount;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.gas_unit_price;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Options(max_gas_amount=" + this.max_gas_amount + ", gas_unit_price=" + this.gas_unit_price + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Data.Options.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Options> serializer() {
                    return AptosPreExecDappData$Data$Options$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Options(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, AptosPreExecDappData$Data$Options$$serializer.INSTANCE.getDescriptor());
                }
                this.max_gas_amount = str;
                this.gas_unit_price = str2;
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Options options, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, options.max_gas_amount);
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, options.gas_unit_price);
            }

            public Options(String str, String str2) {
                this.max_gas_amount = str;
                this.gas_unit_price = str2;
            }
        }
    }
}
