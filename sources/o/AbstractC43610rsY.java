package o;

import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43675rtk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC43610rsY {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public volatile boolean AhwBna;
    public InterfaceC58217yxC djBIcL;

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AhwBna = z;
    }

    /* JADX INFO: renamed from: o.rsY$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rsY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final AbstractC57556yke KWHzl(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
        C43675rtk.TaskDescription taskDescription = C43675rtk.Companion;
        C57567ykp c57567ykpKWHzl = KWHzl();
        Unit unit = Unit.INSTANCE;
        return taskDescription.KWHzl(str, arrayList, c57567ykpKWHzl, this);
    }

    public final AbstractC57556yke copydefault(@NotNull java.lang.String str, @NotNull WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsArgV5ForWeb3, "");
        return KWHzl(str, yDY.copydefault(wsArgV5ForWeb3));
    }

    public C57567ykp KWHzl() {
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values();
    }

    public static /* synthetic */ void startCheckCacheValid$default(AbstractC43610rsY abstractC43610rsY, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCheckCacheValid");
        }
        if ((i & 1) != 0) {
            j = 200;
        }
        abstractC43610rsY.EZpvd(j);
    }

    public void EZpvd(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, j, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.rta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC43610rsY.KWHzl(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.djBIcL = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.rsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC43610rsY.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC43610rsY abstractC43610rsY, java.lang.Long l) {
        if (abstractC43610rsY.AhwBna) {
            abstractC43610rsY.EZpvd();
            abstractC43610rsY.AhwBna = false;
        }
        return Unit.INSTANCE;
    }
}
