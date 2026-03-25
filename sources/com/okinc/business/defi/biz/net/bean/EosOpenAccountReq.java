package com.okinc.business.defi.biz.net.bean;

import java.math.BigInteger;
import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public class EosOpenAccountReq {
    public EosOpenOrder order;
    public EosOpenTransaction transaction;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosOpenOrder getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosOpenTransaction getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOrder(EosOpenOrder eosOpenOrder) {
        this.order = eosOpenOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTransaction(EosOpenTransaction eosOpenTransaction) {
        this.transaction = eosOpenTransaction;
    }

    public EosOpenAccountReq(EosOpenOrder eosOpenOrder, EosOpenTransaction eosOpenTransaction) {
        this.order = eosOpenOrder;
        this.transaction = eosOpenTransaction;
    }

    public static class EosOpenOrder {
        public String account;
        public String activeKey;
        public BigInteger cpuAmount;
        public BigInteger eosAmount;
        public BigInteger netAmount;
        public String ownerKey;
        public String parentAccount;
        public String payAddress;
        public BigInteger payAmount;
        public String payCoin;
        public BigInteger ramAmount;
        public BigInteger ramBytes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getAccount() {
            return this.account;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getActiveKey() {
            return this.activeKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getCpuAmount() {
            return this.cpuAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getEosAmount() {
            return this.eosAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getNetAmount() {
            return this.netAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getOwnerKey() {
            return this.ownerKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getParentAccount() {
            return this.parentAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPayAddress() {
            return this.payAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getPayAmount() {
            return this.payAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPayCoin() {
            return this.payCoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getRamAmount() {
            return this.ramAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getRamBytes() {
            return this.ramBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setAccount(String str) {
            this.account = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setActiveKey(String str) {
            this.activeKey = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCpuAmount(BigInteger bigInteger) {
            this.cpuAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setEosAmount(BigInteger bigInteger) {
            this.eosAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setNetAmount(BigInteger bigInteger) {
            this.netAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setOwnerKey(String str) {
            this.ownerKey = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setParentAccount(String str) {
            this.parentAccount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setPayAddress(String str) {
            this.payAddress = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setPayAmount(BigInteger bigInteger) {
            this.payAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setPayCoin(String str) {
            this.payCoin = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setRamAmount(BigInteger bigInteger) {
            this.ramAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setRamBytes(BigInteger bigInteger) {
            this.ramBytes = bigInteger;
        }

        public EosOpenOrder(String str, String str2, String str3, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, String str4, BigInteger bigInteger6, String str5, String str6) {
            this.account = str;
            this.ownerKey = str2;
            this.activeKey = str3;
            this.cpuAmount = bigInteger;
            this.netAmount = bigInteger2;
            this.ramAmount = bigInteger3;
            this.ramBytes = bigInteger4;
            this.eosAmount = bigInteger5;
            this.payCoin = str4;
            this.payAmount = bigInteger6;
            this.payAddress = str5;
            this.parentAccount = str6;
        }
    }

    public static class EosOpenTransaction {
        public List<EosOpenAction> actions;
        public BigInteger coinAmount;
        public long coinId;
        public String extJson;
        public String fromAdr;
        public BigInteger serviceCharge;
        public String signedTx;
        public String toAdr;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<EosOpenAction> getActions() {
            return this.actions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getCoinAmount() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getExtJson() {
            return this.extJson;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getFromAdr() {
            return this.fromAdr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getServiceCharge() {
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
        public void setActions(List<EosOpenAction> list) {
            this.actions = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCoinAmount(BigInteger bigInteger) {
            this.coinAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCoinId(long j) {
            this.coinId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setExtJson(String str) {
            this.extJson = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setFromAdr(String str) {
            this.fromAdr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setServiceCharge(BigInteger bigInteger) {
            this.serviceCharge = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setSignedTx(String str) {
            this.signedTx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setToAdr(String str) {
            this.toAdr = str;
        }

        public EosOpenTransaction(String str, long j, BigInteger bigInteger, String str2, String str3, BigInteger bigInteger2, String str4, List<EosOpenAction> list) {
            this.signedTx = str;
            this.coinId = j;
            this.coinAmount = bigInteger;
            this.fromAdr = str2;
            this.toAdr = str3;
            this.serviceCharge = bigInteger2;
            this.extJson = str4;
            this.actions = list;
        }
    }

    public static class EosOpenAction {
        public BigInteger cpuAmount;
        public String memo;
        public String name;
        public BigInteger netAmount;
        public BigInteger ramAmount;
        public BigInteger ramBytes;
        public String receiver;
        public String sender;
        public BigInteger transAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getCpuAmount() {
            return this.cpuAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getMemo() {
            return this.memo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getNetAmount() {
            return this.netAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getRamAmount() {
            return this.ramAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getRamBytes() {
            return this.ramBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getReceiver() {
            return this.receiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getSender() {
            return this.sender;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigInteger getTransAmount() {
            return this.transAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCpuAmount(BigInteger bigInteger) {
            this.cpuAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setMemo(String str) {
            this.memo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setName(String str) {
            this.name = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setNetAmount(BigInteger bigInteger) {
            this.netAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setRamAmount(BigInteger bigInteger) {
            this.ramAmount = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setRamBytes(BigInteger bigInteger) {
            this.ramBytes = bigInteger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setReceiver(String str) {
            this.receiver = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setSender(String str) {
            this.sender = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setTransAmount(BigInteger bigInteger) {
            this.transAmount = bigInteger;
        }

        public EosOpenAction(String str, String str2, String str3, String str4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this.name = str;
            this.sender = str2;
            this.receiver = str3;
            this.memo = str4;
            this.cpuAmount = bigInteger;
            this.netAmount = bigInteger2;
            this.ramAmount = bigInteger3;
            this.ramBytes = bigInteger4;
            this.transAmount = bigInteger5;
        }
    }
}
