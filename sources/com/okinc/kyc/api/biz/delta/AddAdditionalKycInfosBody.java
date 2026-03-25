package com.okinc.kyc.api.biz.delta;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class AddAdditionalKycInfosBody implements Serializable {
    public static final int $stable = 8;
    private String countryId;
    private AdditionalKycInfosPersonalInfo form;
    private String idCard;
    private Integer level;
    private Boolean swap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryId() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdditionalKycInfosPersonalInfo getForm() {
        return this.form;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdCard() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSwap() {
        return this.swap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryId(String str) {
        this.countryId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForm(AdditionalKycInfosPersonalInfo additionalKycInfosPersonalInfo) {
        this.form = additionalKycInfosPersonalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdCard(String str) {
        this.idCard = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(Integer num) {
        this.level = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwap(Boolean bool) {
        this.swap = bool;
    }
}
