package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23182htR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23260huq extends AbstractC23180htP {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public AbstractC57556yke AEQbTJ;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX INFO: renamed from: o.huq$Activity */
    public static final class Activity extends TypeToken<java.util.List<? extends MarketTradeRealTimeBean>> {
    }

    public abstract void OLrzqt(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean);

    public AbstractC23260huq(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = "";
    }

    /* JADX INFO: renamed from: o.huq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.huq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556ykeEZpvd = EZpvd("dex-market-tradeRealTime", new WsArgV5ForWeb3("dex-market-tradeRealTime", null, this.copydefault, this.KWHzl, null, 18, null));
        this.AEQbTJ = abstractC57556ykeEZpvd;
        abstractC57556ykeEZpvd.AhwBna();
        InterfaceC23182htR.Application.startCheckCacheValid$default(this, 0L, 1, null);
    }

    public void AEQbTJ() {
        AbstractC57556yke abstractC57556yke = this.AEQbTJ;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCValueOf = valueOf();
        if (interfaceC58217yxCValueOf != null) {
            interfaceC58217yxCValueOf.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.AEQbTJ;
        if (abstractC57556yke2 != null) {
            C23252hui.Companion.KWHzl("dex-market-tradeRealTime", abstractC57556yke2);
            this.AEQbTJ = null;
        }
    }

    @Override // o.InterfaceC23182htR
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(true);
        this.OLrzqt = str;
    }

    @Override // o.InterfaceC23182htR
    public void copydefault() {
        java.lang.Object objM7377constructorimpl;
        MarketTradeRealTimeBean marketTradeRealTimeBean;
        java.lang.String str = this.OLrzqt;
        if (str == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(str, new Activity().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        java.util.List list = (java.util.List) objM7377constructorimpl;
        if (list == null || (marketTradeRealTimeBean = (MarketTradeRealTimeBean) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) {
            return;
        }
        OLrzqt(marketTradeRealTimeBean);
    }
}
