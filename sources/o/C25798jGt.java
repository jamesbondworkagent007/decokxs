package o;

import com.okinc.business.market.data.model.alert.AlertListRequest;
import com.okinc.business.market.data.model.alert.CheckSubscribeRequest;
import com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkAlertListEmpty$1;
import com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkCoinAlertSubscribeStatus$1;
import com.okinc.business.market.features.alert.core.AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25798jGt {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final yCP<InterfaceC2147AAo> EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C25798jGt(@NotNull yCP<InterfaceC2147AAo> ycp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ycp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = ycp;
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25798jGt.EZpvd(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.jGt$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final InterfaceC2147AAo EZpvd(C25798jGt c25798jGt) {
        return c25798jGt.EZpvd.get();
    }

    public final InterfaceC2147AAo EZpvd() {
        return (InterfaceC2147AAo) this.AEQbTJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull CheckSubscribeRequest checkSubscribeRequest, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        AlertCoreAdapter$checkCoinAlertSubscribeStatus$1 alertCoreAdapter$checkCoinAlertSubscribeStatus$1;
        if (continuation instanceof AlertCoreAdapter$checkCoinAlertSubscribeStatus$1) {
            alertCoreAdapter$checkCoinAlertSubscribeStatus$1 = (AlertCoreAdapter$checkCoinAlertSubscribeStatus$1) continuation;
            int i = alertCoreAdapter$checkCoinAlertSubscribeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertCoreAdapter$checkCoinAlertSubscribeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                alertCoreAdapter$checkCoinAlertSubscribeStatus$1 = new AlertCoreAdapter$checkCoinAlertSubscribeStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertCoreAdapter$checkCoinAlertSubscribeStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertCoreAdapter$checkCoinAlertSubscribeStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1 alertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1 = new AlertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1(null, this, checkSubscribeRequest);
            alertCoreAdapter$checkCoinAlertSubscribeStatus$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertCoreAdapter$checkCoinAlertSubscribeStatusgIAlus$$inlined$dexRunCatching$1, alertCoreAdapter$checkCoinAlertSubscribeStatus$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AlertListRequest alertListRequest, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AlertCoreAdapter$checkAlertListEmpty$1 alertCoreAdapter$checkAlertListEmpty$1;
        if (continuation instanceof AlertCoreAdapter$checkAlertListEmpty$1) {
            alertCoreAdapter$checkAlertListEmpty$1 = (AlertCoreAdapter$checkAlertListEmpty$1) continuation;
            int i = alertCoreAdapter$checkAlertListEmpty$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                alertCoreAdapter$checkAlertListEmpty$1.label = i - Integer.MIN_VALUE;
            } else {
                alertCoreAdapter$checkAlertListEmpty$1 = new AlertCoreAdapter$checkAlertListEmpty$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = alertCoreAdapter$checkAlertListEmpty$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = alertCoreAdapter$checkAlertListEmpty$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1 alertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1 = new AlertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1(null, this, alertListRequest);
            alertCoreAdapter$checkAlertListEmpty$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, alertCoreAdapter$checkAlertListEmptygIAlus$$inlined$dexRunCatching$1, alertCoreAdapter$checkAlertListEmpty$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
