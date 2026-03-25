package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVMContractSpeedUpSignData extends EVMContractSignData implements SpeedUpSignDataHolder, IEVMSpeedUpSignData {
    public static final int $stable = 8;
    private final String inputData;
    private final String priorityFee;
    private final SpeedUpSignData speedUpSignData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignDataHolder
    public SpeedUpSignData getSpeedUpSignData() {
        return this.speedUpSignData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVMContractSpeedUpSignData(@NotNull SpeedUpSignData speedUpSignData, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        super(null, str, str3, null, speedUpSignData.getTo(), str5 == null ? "" : str5, speedUpSignData.getFrom(), str4, null, null, null, null, null, null, 16137, null);
        Intrinsics.checkNotNullParameter(speedUpSignData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.speedUpSignData = speedUpSignData;
        this.priorityFee = str2;
        this.inputData = str5;
    }
}
