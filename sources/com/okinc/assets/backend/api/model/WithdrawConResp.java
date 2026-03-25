package com.okinc.assets.backend.api.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawConResp {
    public static final int $stable = 8;
    private ArrayList<Conditions> conditions;
    private String country;
    private double depositLimit;
    private String dualAccountCardType;
    private Long expireTime;
    private Boolean hasDualAccount;
    private boolean isKorean;
    private boolean isShowDepositFreezeWarningBanner;
    private boolean isShowEEATravelRuleExchangeList;
    private int kycLevel = -1;
    private Boolean limitExceeded;
    private boolean modifyLoginPwdLimit;
    private String primaryAccountUid;
    private String province;
    private String secondaryAccountUid;
    private boolean show;
    private Boolean usdAllowed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Conditions> getConditions() {
        return this.conditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getDepositLimit() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDualAccountCardType() {
        return this.dualAccountCardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasDualAccount() {
        return this.hasDualAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLimitExceeded() {
        return this.limitExceeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getModifyLoginPwdLimit() {
        return this.modifyLoginPwdLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryAccountUid() {
        return this.primaryAccountUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryAccountUid() {
        return this.secondaryAccountUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUsdAllowed() {
        return this.usdAllowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isKorean() {
        return this.isKorean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDepositFreezeWarningBanner() {
        return this.isShowDepositFreezeWarningBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowEEATravelRuleExchangeList() {
        return this.isShowEEATravelRuleExchangeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConditions(ArrayList<Conditions> arrayList) {
        this.conditions = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(String str) {
        this.country = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositLimit(double d) {
        this.depositLimit = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDualAccountCardType(String str) {
        this.dualAccountCardType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTime(Long l) {
        this.expireTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasDualAccount(Boolean bool) {
        this.hasDualAccount = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKorean(boolean z) {
        this.isKorean = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycLevel(int i) {
        this.kycLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitExceeded(Boolean bool) {
        this.limitExceeded = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyLoginPwdLimit(boolean z) {
        this.modifyLoginPwdLimit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryAccountUid(String str) {
        this.primaryAccountUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProvince(String str) {
        this.province = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryAccountUid(String str) {
        this.secondaryAccountUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShow(boolean z) {
        this.show = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDepositFreezeWarningBanner(boolean z) {
        this.isShowDepositFreezeWarningBanner = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowEEATravelRuleExchangeList(boolean z) {
        this.isShowEEATravelRuleExchangeList = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAllowed(Boolean bool) {
        this.usdAllowed = bool;
    }
}
