package com.okinc.business.defi.biz.core.transaction.sign.utxo.bean;

import com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignData;
import com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignDataHolder;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferBaseSignData;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class BTCSpeedUpSignData extends UTXOTransferBaseSignData implements SpeedUpSignDataHolder {
    public static final int $stable = 8;
    private final List<UtxoInfo> cpfpSpeedUpUTXO;
    private final SpeedUpSignData speedUpSignData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> getCpfpSpeedUpUTXO() {
        return this.cpfpSpeedUpUTXO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignDataHolder
    public SpeedUpSignData getSpeedUpSignData() {
        return this.speedUpSignData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BTCSpeedUpSignData(List<UtxoInfo> list, @NotNull SpeedUpSignData speedUpSignData) {
        super(speedUpSignData.getMainCoinId(), "", "", "", false, false, null, 64, null);
        Intrinsics.checkNotNullParameter(speedUpSignData, "");
        this.cpfpSpeedUpUTXO = list;
        this.speedUpSignData = speedUpSignData;
    }
}
