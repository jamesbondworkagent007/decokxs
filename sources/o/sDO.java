package o;

import com.okinc.okimcore.ImCoreLifeCycleEvent;
import com.okinc.okimcore.OKIMCoreManager$addUserLoginStatusListener$1;
import com.okinc.okimcore.OKIMCoreManager$checkAndHandleSwitchAccount$2;
import com.okinc.okimcore.OKIMCoreManager$reconnect$1;
import dagger.Lazy;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sDO {
    public final InterfaceC56387yDm AEQbTJ;
    public final Lazy<C44181sGh> AYXKKw;
    public Job AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC47278tmy AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final CoroutineScope EZpvd;
    public final Lazy<sGB> KWHzl;
    public final MutableSharedFlow<ImCoreLifeCycleEvent> OLrzqt;
    public final Lazy<C44125sEf> copydefault;
    public final Lazy<C44182sGi> djBIcL;
    public java.lang.String ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final CoroutineDispatcher fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final Lazy<sMX> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final Lazy<C44180sGg> valueOf;
    public final java.util.List<Lazy<sEH>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ImCoreLifeCycleEvent> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.ejfBZ;
    }

    @yCM
    public sDO(@NotNull Lazy<sIC> lazy, @NotNull Lazy<sFV> lazy2, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull Lazy<sGB> lazy3, @NotNull Lazy<sMX> lazy4, @NotNull Lazy<C44125sEf> lazy5, @NotNull Lazy<C44180sGg> lazy6, @NotNull Lazy<C44181sGh> lazy7, @NotNull Lazy<C44182sGi> lazy8, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(lazy3, "");
        Intrinsics.checkNotNullParameter(lazy4, "");
        Intrinsics.checkNotNullParameter(lazy5, "");
        Intrinsics.checkNotNullParameter(lazy6, "");
        Intrinsics.checkNotNullParameter(lazy7, "");
        Intrinsics.checkNotNullParameter(lazy8, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.AuCTel = interfaceC47278tmy;
        this.KWHzl = lazy3;
        this.gEmmrt = lazy4;
        this.copydefault = lazy5;
        this.valueOf = lazy6;
        this.AYXKKw = lazy7;
        this.djBIcL = lazy8;
        this.fJNWhG = coroutineDispatcher;
        this.EZpvd = coroutineScope;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.valueOf(this.KWHzl);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.sDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.DbNXlk(this.AEQbTJ);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.AhwBna(this.copydefault);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.fetchVPNInfo(this.AEQbTJ);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.values(this.copydefault);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.sDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDO.isConnected(this.AEQbTJ);
            }
        });
        this.OLrzqt = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        java.util.List listGEmmrt = yDY.gEmmrt(lazy5, lazy, lazy2, lazy8, lazy3, lazy4, lazy5, lazy6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            if (obj instanceof Lazy) {
                arrayList.add(obj);
            }
        }
        this.values = arrayList;
    }

    public static final sGB valueOf(sDO sdo) {
        return sdo.KWHzl.get();
    }

    public final sGB OLrzqt() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (sGB) value;
    }

    public static final sMX DbNXlk(sDO sdo) {
        return sdo.gEmmrt.get();
    }

    public final sMX AEQbTJ() {
        java.lang.Object value = this.isConnected.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (sMX) value;
    }

    public static final C44125sEf AhwBna(sDO sdo) {
        return sdo.copydefault.get();
    }

    public final C44125sEf copydefault() {
        java.lang.Object value = this.fetchVPNInfo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C44125sEf) value;
    }

    public static final C44180sGg fetchVPNInfo(sDO sdo) {
        return sdo.valueOf.get();
    }

    public final C44180sGg djBIcL() {
        java.lang.Object value = this.DbNXlk.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C44180sGg) value;
    }

    public static final C44181sGh values(sDO sdo) {
        return sdo.AYXKKw.get();
    }

    public final C44181sGh AhwBna() {
        java.lang.Object value = this.AkhnZx.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C44181sGh) value;
    }

    public static final C44182sGi isConnected(sDO sdo) {
        return sdo.djBIcL.get();
    }

    public final C44182sGi valueOf() {
        java.lang.Object value = this.fARcdN.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C44182sGi) value;
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C44124sEe.imLogInit$default("Init IM service", null, 2, null);
        this.copydefault.get().fARcdN();
    }

    public final void EZpvd() {
        C44124sEe.imLogInit$default("Add user login status listener...", null, 2, null);
        Job job = this.AhwBna;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AhwBna = BuildersKt__Builders_commonKt.launch$default(this.EZpvd, sDN.copydefault.AEQbTJ(), null, new OKIMCoreManager$addUserLoginStatusListener$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKIMCoreManager$reconnect$1 oKIMCoreManager$reconnect$1;
        sDO sdo;
        if (continuation instanceof OKIMCoreManager$reconnect$1) {
            oKIMCoreManager$reconnect$1 = (OKIMCoreManager$reconnect$1) continuation;
            int i = oKIMCoreManager$reconnect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMCoreManager$reconnect$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMCoreManager$reconnect$1 = new OKIMCoreManager$reconnect$1(this, continuation);
            }
        }
        java.lang.Object obj = oKIMCoreManager$reconnect$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMCoreManager$reconnect$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogLogin$default("reconnect", null, 2, null);
            oKIMCoreManager$reconnect$1.L$0 = this;
            oKIMCoreManager$reconnect$1.label = 1;
            if (copydefault(oKIMCoreManager$reconnect$1) == objCopydefault) {
                return objCopydefault;
            }
            sdo = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sdo = (sDO) oKIMCoreManager$reconnect$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        sdo.copydefault().AEQbTJ();
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.fJNWhG, new OKIMCoreManager$checkAndHandleSwitchAccount$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C44124sEe.imLogLogin$default("Handle user login", null, 2, null);
        this.ejfBZ = str;
        pUU.EZpvd("OKIMCoreManager", "After user login " + str);
        java.util.Iterator<T> it = this.values.iterator();
        while (it.hasNext()) {
            ((sEH) ((Lazy) it.next()).get()).bp_();
        }
        this.OLrzqt.tryEmit(ImCoreLifeCycleEvent.Login);
    }

    public final void AYXKKw() {
        C44124sEe.imLogLogin$default("Handle user logout", null, 2, null);
        this.OLrzqt.tryEmit(ImCoreLifeCycleEvent.Logout);
        java.util.Iterator<T> it = this.values.iterator();
        while (it.hasNext()) {
            ((sEH) ((Lazy) it.next()).get()).bq_();
        }
        pUU.EZpvd("OKIMCoreManager", "After user logout");
        this.ejfBZ = null;
    }
}
