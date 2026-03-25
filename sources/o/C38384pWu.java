package o;

import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.alert.database.MarketAlertDataBase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38384pWu implements InterfaceC38379pWp {
    public final InterfaceC38379pWp KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, marketUserAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.KWHzl.AEQbTJ(str, str2, str3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, str, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return EZpvd(this, str, str2, str3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object KWHzl(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, marketUserAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38379pWp
    public java.lang.Object copydefault(@NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, list, continuation);
    }

    public C38384pWu(@NotNull InterfaceC38379pWp interfaceC38379pWp) {
        Intrinsics.checkNotNullParameter(interfaceC38379pWp, "");
        this.KWHzl = interfaceC38379pWp;
    }

    /* JADX INFO: renamed from: o.pWu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pWu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C38384pWu copydefault(@NotNull MarketAlertDataBase marketAlertDataBase) {
            Intrinsics.checkNotNullParameter(marketAlertDataBase, "");
            return new C38384pWu(new C38377pWn(marketAlertDataBase.copydefault()));
        }
    }

    public static /* synthetic */ java.lang.Object EZpvd(C38384pWu c38384pWu, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super java.lang.Boolean> continuation) {
        return c38384pWu.KWHzl.EZpvd(str, str2, str3, continuation);
    }

    public static /* synthetic */ java.lang.Object copydefault(C38384pWu c38384pWu, java.util.List<MarketUserAlert> list, Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = c38384pWu.KWHzl.copydefault(list, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object EZpvd(C38384pWu c38384pWu, MarketUserAlert marketUserAlert, Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = c38384pWu.KWHzl.AEQbTJ(marketUserAlert, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C38384pWu c38384pWu, java.lang.String str, java.util.List<MarketUserAlert> list, Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = c38384pWu.KWHzl.AEQbTJ(str, list, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object copydefault(C38384pWu c38384pWu, MarketUserAlert marketUserAlert, Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = c38384pWu.KWHzl.KWHzl(marketUserAlert, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
