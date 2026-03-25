package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class xBM extends xKE<java.util.List<? extends InstrumentInfo>> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.lang.String copydefault = "";

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xBM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), this.copydefault, 0, 2, null);
    }
}
