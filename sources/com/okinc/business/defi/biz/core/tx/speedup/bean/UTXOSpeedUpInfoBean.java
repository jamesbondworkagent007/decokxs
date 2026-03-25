package com.okinc.business.defi.biz.core.tx.speedup.bean;

import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class UTXOSpeedUpInfoBean extends SpeedUpInfoBean {
    public static final int $stable = 8;
    private List<UtxoInfo> cpfpSpeedUpUtxo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoInfo> getCpfpSpeedUpUtxo() {
        return this.cpfpSpeedUpUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCpfpSpeedUpUtxo(List<UtxoInfo> list) {
        this.cpfpSpeedUpUtxo = list;
    }
}
