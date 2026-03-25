package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public class EosTxReq {
    private List<EosTxAction> actions;
    private long coinId;
    private String memo;
    private String signedTx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<EosTxAction> getActions() {
        return this.actions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setActions(List<EosTxAction> list) {
        this.actions = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSignedTx(String str) {
        this.signedTx = str;
    }

    public EosTxReq(String str, long j, List<EosTxAction> list, String str2) {
        this.signedTx = str;
        this.coinId = j;
        this.actions = list;
        this.memo = str2;
    }
}
