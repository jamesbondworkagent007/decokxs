package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.upi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49500upi {
    public IdxConfig AEQbTJ;
    public TradeInfo AYXKKw;
    public UserTradeConfigInfo AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public IdxCcyConfig OLrzqt;
    public BizInstrument copydefault;

    public C49500upi(BizInstrument bizInstrument, IdxConfig idxConfig, IdxCcyConfig idxCcyConfig, java.lang.String str, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, java.lang.String str2) {
        this.copydefault = bizInstrument;
        this.AEQbTJ = idxConfig;
        this.OLrzqt = idxCcyConfig;
        this.EZpvd = str;
        this.AhwBna = userTradeConfigInfo;
        this.AYXKKw = tradeInfo;
        this.KWHzl = str2;
    }

    public boolean equals(java.lang.Object obj) {
        IdxConfig idxConfig;
        IdxCcyConfig idxCcyConfig;
        UserTradeConfigInfo userTradeConfigInfo;
        TradeInfo tradeInfo;
        if (!(obj instanceof C49500upi)) {
            return super.equals(obj);
        }
        BizInstrument bizInstrument = this.copydefault;
        if (bizInstrument != null) {
            C49500upi c49500upi = (C49500upi) obj;
            if (bizInstrument.equals(c49500upi.copydefault) && (idxConfig = this.AEQbTJ) != null && idxConfig.equals(c49500upi.AEQbTJ) && (idxCcyConfig = this.OLrzqt) != null && idxCcyConfig.equals(c49500upi.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c49500upi.EZpvd) && (userTradeConfigInfo = this.AhwBna) != null && userTradeConfigInfo.equals(c49500upi.AhwBna) && (tradeInfo = this.AYXKKw) != null && tradeInfo.equals(c49500upi.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c49500upi.KWHzl)) {
                return true;
            }
        }
        return false;
    }
}
