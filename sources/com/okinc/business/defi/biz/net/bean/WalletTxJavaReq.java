package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public class WalletTxJavaReq implements java.io.Serializable {
    private String aaFeeToken;
    private String accountId;
    private List<ApprovalForAll> approvalForAllList;
    private String btcSpeedUpInfo;
    private String coinAmount;
    private long coinId;
    private List<String> dependTx;
    private String domain;
    private String extJson;
    private String feeRate;
    private String fromAdr;
    private String gasLimit;
    private String gasPrice;
    private String inputData;
    private String itemId;
    private String memo;
    private String mev;
    private String nonce;
    private String serviceCharge;
    private String signedTx;
    private String toAdr;
    private String txHash;
    private int txSource;
    private String txType;
    private UserOperation uop;
    private int walletType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAaFeeToken() {
        return this.aaFeeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<ApprovalForAll> getApprovalForAllList() {
        return this.approvalForAllList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBtcSpeedUpInfo() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getDependTx() {
        return this.dependTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getExtJson() {
        return this.extJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFromAdr() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getItemId() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMev() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getToAdr() {
        return this.toAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserOperation getUop() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAaFeeToken(String str) {
        this.aaFeeToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setApprovalForAllList(List<ApprovalForAll> list) {
        this.approvalForAllList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBtcSpeedUpInfo(String str) {
        this.btcSpeedUpInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCoinId(int i) {
        this.coinId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDependTx(List<String> list) {
        this.dependTx = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDomain(String str) {
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExtJson(String str) {
        this.extJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFromAdr(String str) {
        this.fromAdr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGasLimit(String str) {
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGasPrice(String str) {
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setItemId(String str) {
        this.itemId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMev(String str) {
        this.mev = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setServiceCharge(String str) {
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSignedTx(String str) {
        this.signedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setToAdr(String str) {
        this.toAdr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTxSource(int i) {
        this.txSource = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUop(UserOperation userOperation) {
        this.uop = userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setWalletType(int i) {
        this.walletType = i;
    }

    private WalletTxJavaReq() {
    }

    public WalletTxJavaReq(String str, String str2, int i, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, String str15, List<String> list, String str16, String str17, UserOperation userOperation, String str18, String str19, List<ApprovalForAll> list2, String str20) {
        this.signedTx = str;
        this.txHash = str2;
        this.txSource = i;
        this.coinId = j;
        this.coinAmount = str3;
        this.fromAdr = str4;
        this.toAdr = str5;
        this.serviceCharge = str6;
        this.extJson = str7;
        this.domain = str8;
        this.gasPrice = str9;
        this.gasLimit = str10;
        this.nonce = str11;
        this.inputData = str12;
        this.btcSpeedUpInfo = str13;
        this.accountId = str14;
        this.walletType = i2;
        this.itemId = str15;
        this.dependTx = list;
        this.memo = str16;
        this.txType = str17;
        this.uop = userOperation;
        this.aaFeeToken = str18;
        this.mev = str19;
        this.approvalForAllList = list2;
        this.feeRate = str20;
    }

    public String toString() {
        return "WalletTxJavaReq{signedTx='" + this.signedTx + "', txHash='" + this.txHash + "', txSource=" + this.txSource + ", coinId=" + this.coinId + ", coinAmount='" + this.coinAmount + "', fromAdr='" + this.fromAdr + "', toAdr='" + this.toAdr + "', serviceCharge='" + this.serviceCharge + "', extJson='" + this.extJson + "', domain='" + this.domain + "', gasPrice='" + this.gasPrice + "', gasLimit='" + this.gasLimit + "', nonce='" + this.nonce + "', inputData='" + this.inputData + "', btcSpeedUpInfo='" + this.btcSpeedUpInfo + "', walletId='" + this.accountId + "', walletType=" + this.walletType + ", itemId='" + this.itemId + "', dependTx=" + this.dependTx + "', feeRate=" + this.feeRate + "', memo=" + this.memo + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Serializable
    public static class ApprovalForAll implements java.io.Serializable {
        private String inputHex;
        private String to;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getInputHex() {
            return this.inputHex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getTo() {
            return this.to;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setInputHex(String str) {
            this.inputHex = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setTo(String str) {
            this.to = str;
        }

        public ApprovalForAll() {
        }

        public ApprovalForAll(String str, String str2) {
            this.to = str;
            this.inputHex = str2;
        }
    }
}
