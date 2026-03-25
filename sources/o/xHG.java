package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.dex.biz.OKTDexBaseTokenModel;

/* JADX INFO: loaded from: classes24.dex */
public final class xHG {
    public static final xHG AEQbTJ = new xHG();

    private xHG() {
    }

    public final OKTDexBaseTokenModel EZpvd() {
        return (OKTDexBaseTokenModel) SPUtils.getObject("okt_dex_select_token_key_" + C54589xNz.EZpvd.DbNXlk(), OKTDexBaseTokenModel.class, "okt_dex_cache_file");
    }
}
