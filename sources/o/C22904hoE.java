package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.dexlogic.main.swap.trade.referral.ReferralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1;
import com.okinc.business.dexlogic.main.swap.trade.referral.ReferralCodeVisibilityHandler$observeDataOnce$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22904hoE<T> {
    public final LifecycleOwner AEQbTJ;
    public final Flow<T> KWHzl;
    public final Function0<java.lang.String> OLrzqt;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22904hoE(@NotNull Function0<java.lang.String> function0, @NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.OLrzqt = function0;
        this.KWHzl = flow;
        this.AEQbTJ = lifecycleOwner;
        this.copydefault = function02;
    }

    public final LifecycleCoroutineScope AEQbTJ() {
        return LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ);
    }

    public final void copydefault() {
        if (this.OLrzqt.invoke().length() > 0) {
            this.copydefault.invoke();
        } else {
            KWHzl();
        }
    }

    public final void KWHzl() {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.take(new Activity(this.KWHzl, this), 1), new ReferralCodeVisibilityHandler$observeDataOnce$2(this, null)), AEQbTJ());
    }

    /* JADX INFO: renamed from: o.hoE$Activity */
    public static final class Activity implements Flow<T> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C22904hoE KWHzl;

        /* JADX INFO: renamed from: o.hoE$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ C22904hoE copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C22904hoE c22904hoE) {
                this.OLrzqt = flowCollector;
                this.copydefault = c22904hoE;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ReferralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1 referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1;
                if (continuation instanceof ReferralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1) {
                    referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1 = (ReferralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1) continuation;
                    int i = referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1 = new ReferralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    if (obj != null && ((java.lang.CharSequence) this.copydefault.OLrzqt.invoke()).length() > 0) {
                        referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, referralCodeVisibilityHandler$observeDataOnce$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C22904hoE c22904hoE) {
            this.AEQbTJ = flow;
            this.KWHzl = c22904hoE;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
