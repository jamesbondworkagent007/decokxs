package com.okinc.business.defi.biz.net.bean;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class EosTxAction {
    private String domain;
    private String memo;
    private String name;
    private String receiver;
    private String sender;
    private BigInteger transAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDomain() {
        return this.domain;
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
    public void setDomain(String str) {
        this.domain = str;
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

    public EosTxAction(String str, String str2, String str3, BigInteger bigInteger, String str4, String str5) {
        this.name = str;
        this.sender = str2;
        this.receiver = str3;
        this.transAmount = bigInteger;
        this.memo = str4;
        this.domain = str5;
    }
}
