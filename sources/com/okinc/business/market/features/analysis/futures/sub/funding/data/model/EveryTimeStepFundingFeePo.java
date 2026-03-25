package com.okinc.business.market.features.analysis.futures.sub.funding.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class EveryTimeStepFundingFeePo {
    public static final int $stable = 0;

    @SerializedName("dateTime")
    private final long dateTime;

    @SerializedName("fundingFee")
    private final String fundingFee;

    @SerializedName("timeStep")
    private final int timeStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EveryTimeStepFundingFeePo copy$default(EveryTimeStepFundingFeePo everyTimeStepFundingFeePo, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = everyTimeStepFundingFeePo.dateTime;
        }
        if ((i2 & 2) != 0) {
            str = everyTimeStepFundingFeePo.fundingFee;
        }
        if ((i2 & 4) != 0) {
            i = everyTimeStepFundingFeePo.timeStep;
        }
        return everyTimeStepFundingFeePo.copy(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EveryTimeStepFundingFeePo copy(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EveryTimeStepFundingFeePo(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EveryTimeStepFundingFeePo)) {
            return false;
        }
        EveryTimeStepFundingFeePo everyTimeStepFundingFeePo = (EveryTimeStepFundingFeePo) obj;
        return this.dateTime == everyTimeStepFundingFeePo.dateTime && Intrinsics.EZpvd((Object) this.fundingFee, (Object) everyTimeStepFundingFeePo.fundingFee) && this.timeStep == everyTimeStepFundingFeePo.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimeStep() {
        return this.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.dateTime) * 31) + this.fundingFee.hashCode()) * 31) + Integer.hashCode(this.timeStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EveryTimeStepFundingFeePo(dateTime=" + this.dateTime + ", fundingFee=" + this.fundingFee + ", timeStep=" + this.timeStep + ")";
    }

    public EveryTimeStepFundingFeePo(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dateTime = j;
        this.fundingFee = str;
        this.timeStep = i;
    }
}
