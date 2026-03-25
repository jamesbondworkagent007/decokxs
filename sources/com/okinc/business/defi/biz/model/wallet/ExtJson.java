package com.okinc.business.defi.biz.model.wallet;

import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ExtJson {
    public static final String BRC20TYPE_INSCRIBE_DEPLOY = "inscribe-deploy";
    public static final String BRC20TYPE_INSCRIBE_MINT = "inscribe-mint";
    public static final String BRC20TYPE_INSCRIBE_TRANSFER = "inscribe-transfer";
    public static final String BRC20TYPE_TRADE = "trade";
    public static final String BRC20TYPE_TRANSFER = "transfer";
    private String brc20Type;
    private String brc20TypeExt;
    private int broadcastType;
    private String dappUrl;
    private int decimal;
    private String extFee;
    private int feeType;
    private BigInteger gas;
    private String gasFrom;
    private BigInteger gasPrice;
    private List<String> inscriptionIds;
    private String nftId;
    private List<String> nftIds;
    private String nftLocation;
    private List<String> nftLocations;
    private BigInteger nonce;
    private String okexAccount;
    private String oldTxHash;
    private BigInteger priorityFee;
    private int protocolId;
    private String publicKey;
    private int repeatTxType;
    private int utxoType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBrc20Type() {
        return this.brc20Type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBrc20TypeExt() {
        return this.brc20TypeExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBroadcastType() {
        return this.broadcastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDappUrl() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getExtFee() {
        return this.extFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getFeeType() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGasFrom() {
        return this.gasFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getInscriptionIds() {
        return this.inscriptionIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getNftIds() {
        return this.nftIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNftLocation() {
        return this.nftLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getNftLocations() {
        return this.nftLocations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOldTxHash() {
        return this.oldTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getRepeatTxType() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getUtxoType() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBrc20Type(String str) {
        this.brc20Type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBrc20TypeExt(String str) {
        this.brc20TypeExt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBroadcastType(int i) {
        this.broadcastType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDappUrl(String str) {
        this.dappUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDecimal(int i) {
        this.decimal = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExtFee(String str) {
        this.extFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFeeType(int i) {
        this.feeType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGas(BigInteger bigInteger) {
        this.gas = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGasFrom(String str) {
        this.gasFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGasPrice(BigInteger bigInteger) {
        this.gasPrice = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInscriptionIds(List<String> list) {
        this.inscriptionIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNftIds(List<String> list) {
        this.nftIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNftLocation(String str) {
        this.nftLocation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNftLocations(List<String> list) {
        this.nftLocations = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNonce(BigInteger bigInteger) {
        this.nonce = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOkexAccount(String str) {
        this.okexAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOldTxHash(String str) {
        this.oldTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPriorityFee(BigInteger bigInteger) {
        this.priorityFee = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProtocolId(int i) {
        this.protocolId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRepeatTxType(int i) {
        this.repeatTxType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUtxoType(int i) {
        this.utxoType = i;
    }

    public ExtJson() {
    }

    public ExtJson(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2, String str, String str2, String str3, String str4) {
        this.nonce = bigInteger;
        this.gas = bigInteger2;
        this.gasPrice = bigInteger3;
        this.priorityFee = bigInteger4;
        this.decimal = i;
        this.repeatTxType = i2;
        this.extFee = str;
        this.oldTxHash = str2;
        this.okexAccount = str3;
        this.dappUrl = str4;
    }

    public ExtJson(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2, String str, String str2, int i3, String str3) {
        this.nonce = bigInteger;
        this.gas = bigInteger2;
        this.gasPrice = bigInteger3;
        this.priorityFee = bigInteger4;
        this.decimal = i;
        this.repeatTxType = i2;
        this.extFee = str;
        this.oldTxHash = str2;
        this.feeType = i3;
        this.dappUrl = str3;
    }

    public ExtJson(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2, String str, String str2, int i3, String str3, String str4) {
        this.nonce = bigInteger;
        this.gas = bigInteger2;
        this.gasPrice = bigInteger3;
        this.priorityFee = bigInteger4;
        this.decimal = i;
        this.repeatTxType = i2;
        this.extFee = str;
        this.oldTxHash = str2;
        this.feeType = i3;
        this.okexAccount = str3;
        this.dappUrl = str4;
    }

    public ExtJson(int i, int i2, int i3, String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, String str4, String str5, String str6, String str7, int i4, int i5) {
        this.decimal = i;
        this.repeatTxType = i2;
        this.utxoType = i3;
        this.gasFrom = str;
        this.nftId = str2;
        this.nftLocation = str3;
        this.nftLocations = list;
        this.nftIds = list2;
        this.inscriptionIds = list3;
        this.brc20Type = str4;
        this.brc20TypeExt = str5;
        this.okexAccount = str6;
        this.oldTxHash = str7;
        this.broadcastType = i4;
        this.protocolId = i5;
    }
}
