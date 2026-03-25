package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVMTransferSpeedUpSignData extends TransferSignData implements SpeedUpSignDataHolder, IEVMSpeedUpSignData {
    public static final int $stable = 8;
    private final String gasLimit;
    private final String gasPrice;
    private final String inputData;
    private final String nonce;
    private final String priorityFee;
    private final SpeedUpSignData speedUpSignData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.IEVMSpeedUpSignData
    public String getNonce() {
        return this.nonce;
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
    public EVMTransferSpeedUpSignData(@NotNull SpeedUpSignData speedUpSignData, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        super(speedUpSignData.getCoinId(), "", speedUpSignData.getTo(), speedUpSignData.getCoinAmount(), null, null, 48, null);
        Intrinsics.checkNotNullParameter(speedUpSignData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.speedUpSignData = speedUpSignData;
        this.gasPrice = str;
        this.priorityFee = str2;
        this.gasLimit = str3;
        this.nonce = str4;
        this.inputData = str5;
    }
}
