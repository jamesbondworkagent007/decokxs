package com.okinc.assets.backend.api.model.tax.receivedasset;

/* JADX INFO: loaded from: classes22.dex */
public final class PostCostBasisListRequest {
    public static final int $stable = 8;
    private String costBasisStatus;
    private String currency;
    private Boolean dueTaxYearOnly;
    private Boolean includeFullHistory;
    private String lastTransactionId;
    private Long lastTransactionTime;
    private Integer limit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostBasisStatus() {
        return this.costBasisStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDueTaxYearOnly() {
        return this.dueTaxYearOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIncludeFullHistory() {
        return this.includeFullHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTransactionId() {
        return this.lastTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastTransactionTime() {
        return this.lastTransactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostBasisStatus(String str) {
        this.costBasisStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDueTaxYearOnly(Boolean bool) {
        this.dueTaxYearOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncludeFullHistory(Boolean bool) {
        this.includeFullHistory = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastTransactionId(String str) {
        this.lastTransactionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastTransactionTime(Long l) {
        this.lastTransactionTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(Integer num) {
        this.limit = num;
    }
}
