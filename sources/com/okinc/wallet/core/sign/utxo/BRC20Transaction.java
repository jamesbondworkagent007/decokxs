package com.okinc.wallet.core.sign.utxo;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BRC20Transaction {
    private String chainCode;
    private String changeAddress;
    private String commitFeeRate;
    private String commitTx;
    private List<BRC20InscriptionData> inscriptionData;
    private String masterPublicKey;
    private String minChangeValue;
    private String revealFeeRate;
    private String revealOutValue;
    private List<String> signatureList;
    private List<UTXOTxIn> txin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(UTXOTxIn$$serializer.INSTANCE), new ArrayListSerializer(BRC20InscriptionData$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainCode() {
        return this.chainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitFeeRate() {
        return this.commitFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitTx() {
        return this.commitTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BRC20InscriptionData> getInscriptionData() {
        return this.inscriptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterPublicKey() {
        return this.masterPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinChangeValue() {
        return this.minChangeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevealFeeRate() {
        return this.revealFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevealOutValue() {
        return this.revealOutValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureList() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getTxin() {
        return this.txin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainCode(String str) {
        this.chainCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.commitFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitTx(String str) {
        this.commitTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionData(@NotNull List<BRC20InscriptionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inscriptionData = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterPublicKey(String str) {
        this.masterPublicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinChangeValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minChangeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevealFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.revealFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevealOutValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.revealOutValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatureList(List<String> list) {
        this.signatureList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxin(@NotNull List<UTXOTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.txin = list;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.BRC20Transaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BRC20Transaction> serializer() {
            return BRC20Transaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BRC20Transaction(int i, String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, BRC20Transaction$$serializer.INSTANCE.getDescriptor());
        }
        this.commitFeeRate = str;
        this.revealFeeRate = str2;
        this.revealOutValue = str3;
        this.changeAddress = str4;
        this.txin = list;
        this.inscriptionData = list2;
        this.minChangeValue = str5;
        if ((i & 128) == 0) {
            this.masterPublicKey = null;
        } else {
            this.masterPublicKey = str6;
        }
        if ((i & 256) == 0) {
            this.chainCode = null;
        } else {
            this.chainCode = str7;
        }
        if ((i & 512) == 0) {
            this.commitTx = null;
        } else {
            this.commitTx = str8;
        }
        if ((i & 1024) == 0) {
            this.signatureList = null;
        } else {
            this.signatureList = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(BRC20Transaction bRC20Transaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bRC20Transaction.commitFeeRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bRC20Transaction.revealFeeRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bRC20Transaction.revealOutValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, bRC20Transaction.changeAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], bRC20Transaction.txin);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], bRC20Transaction.inscriptionData);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, bRC20Transaction.minChangeValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bRC20Transaction.masterPublicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bRC20Transaction.masterPublicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bRC20Transaction.chainCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bRC20Transaction.chainCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bRC20Transaction.commitTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, bRC20Transaction.commitTx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && bRC20Transaction.signatureList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], bRC20Transaction.signatureList);
    }

    public BRC20Transaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<UTXOTxIn> list, @NotNull List<BRC20InscriptionData> list2, @NotNull String str5, String str6, String str7, String str8, List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.commitFeeRate = str;
        this.revealFeeRate = str2;
        this.revealOutValue = str3;
        this.changeAddress = str4;
        this.txin = list;
        this.inscriptionData = list2;
        this.minChangeValue = str5;
        this.masterPublicKey = str6;
        this.chainCode = str7;
        this.commitTx = str8;
        this.signatureList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.util.List)
  (r21v0 java.util.List)
  (r22v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.BRC20InscriptionData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:15) call: com.okinc.wallet.core.sign.utxo.BRC20Transaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BRC20Transaction(String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, list2, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : list3);
    }
}
