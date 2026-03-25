package o;

import com.okinc.business.market.features.address_tracker.domain.BatchToggleAddressAlertUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C25653jBj AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final C28603kdr OLrzqt;
    public final C28586kda copydefault;

    @yCM
    public jAD(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c25653jBj;
        this.copydefault = c28586kda;
        this.OLrzqt = c28603kdr;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jAD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super Result<ResponseData<java.lang.Object>>> continuation) throws java.lang.Throwable {
        BatchToggleAddressAlertUseCase$invoke$1 batchToggleAddressAlertUseCase$invoke$1;
        if (continuation instanceof BatchToggleAddressAlertUseCase$invoke$1) {
            batchToggleAddressAlertUseCase$invoke$1 = (BatchToggleAddressAlertUseCase$invoke$1) continuation;
            int i2 = batchToggleAddressAlertUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                batchToggleAddressAlertUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                batchToggleAddressAlertUseCase$invoke$1 = new BatchToggleAddressAlertUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = batchToggleAddressAlertUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = batchToggleAddressAlertUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 batchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, list, i);
            batchToggleAddressAlertUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, batchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, batchToggleAddressAlertUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
