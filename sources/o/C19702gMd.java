package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19702gMd {
    public final InterfaceC19715gMq KWHzl;

    @yCM
    public C19702gMd(@NotNull InterfaceC19715gMq interfaceC19715gMq) {
        Intrinsics.checkNotNullParameter(interfaceC19715gMq, "");
        this.KWHzl = interfaceC19715gMq;
    }

    /* JADX INFO: renamed from: o.gMd$ActionBar */
    public static final class ActionBar implements InterfaceC19701gMc {
        public final /* synthetic */ C19702gMd EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        public ActionBar(Function1<? super TeeWsOriginData, Unit> function1, C19702gMd c19702gMd) {
            this.EZpvd = c19702gMd;
            this.copydefault = "WsLimitOrderHandler." + function1 + JwtUtilsKt.JWT_DELIMITER + java.lang.System.currentTimeMillis() + java.lang.Math.random();
            c19702gMd.KWHzl.copydefault(copydefault(), function1);
        }

        @Override // o.InterfaceC19701gMc
        public void KWHzl() {
            this.EZpvd.KWHzl.EZpvd(copydefault());
        }
    }

    public final InterfaceC19701gMc EZpvd(@NotNull Function1<? super TeeWsOriginData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new ActionBar(function1, this);
    }

    /* JADX INFO: renamed from: o.gMd$TaskDescription */
    public static final class TaskDescription implements InterfaceC19701gMc {
        public final java.lang.String EZpvd;
        public final /* synthetic */ C19702gMd KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.EZpvd;
        }

        public TaskDescription(Function1<? super WsMarketOrderInfo, Unit> function1, C19702gMd c19702gMd) {
            this.KWHzl = c19702gMd;
            this.EZpvd = "WsMarketOrderHandler." + function1 + JwtUtilsKt.JWT_DELIMITER + java.lang.System.currentTimeMillis() + java.lang.Math.random();
            c19702gMd.KWHzl.AEQbTJ(copydefault(), function1);
        }

        @Override // o.InterfaceC19701gMc
        public void KWHzl() {
            this.KWHzl.KWHzl.KWHzl(copydefault());
        }
    }

    public final InterfaceC19701gMc copydefault(@NotNull Function1<? super WsMarketOrderInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new TaskDescription(function1, this);
    }
}
