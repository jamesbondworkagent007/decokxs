package o;

import com.tinder.scarlet.lifecycle.LifecycleRegistry$1;
import com.tinder.scarlet.lifecycle.LifecycleRegistry$3;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.InterfaceC58028ytZ;
import o.InterfaceC60096zvd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58071yuP implements InterfaceC58028ytZ, InterfaceC60097zve<InterfaceC58028ytZ.StateListAnimator> {
    public final yBC<InterfaceC58028ytZ.StateListAnimator> AEQbTJ;
    public final yBC<InterfaceC58028ytZ.StateListAnimator> EZpvd;
    public final /* synthetic */ C58064yuI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC58028ytZ AEQbTJ(@NotNull InterfaceC58028ytZ... interfaceC58028ytZArr) {
        Intrinsics.checkNotNullParameter(interfaceC58028ytZArr, "");
        return this.KWHzl.OLrzqt(interfaceC58028ytZArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
    @Override // o.InterfaceC60097zve
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onNext(InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
        this.AEQbTJ.onNext(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60097zve
    public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        this.AEQbTJ.onSubscribe(interfaceC60094zvb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.KWHzl.subscribe(interfaceC60097zve);
    }

    public C58071yuP(@NotNull yBC<InterfaceC58028ytZ.StateListAnimator> ybc, @NotNull yBC<InterfaceC58028ytZ.StateListAnimator> ybc2, final long j, @NotNull final AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(ybc, "");
        Intrinsics.checkNotNullParameter(ybc2, "");
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        this.AEQbTJ = ybc;
        this.EZpvd = ybc2;
        AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> abstractC58185ywXDjBIcL = ybc2.djBIcL();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        this.KWHzl = new C58064yuI(abstractC58185ywXDjBIcL, abstractC58253yxm);
        AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> abstractC58185ywXDjBIcL2 = ybc.djBIcL();
        final LifecycleRegistry$1 lifecycleRegistry$1 = LifecycleRegistry$1.INSTANCE;
        AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> abstractC58185ywXCopydefault = abstractC58185ywXDjBIcL2.copydefault(new InterfaceC58224yxJ() { // from class: o.yuL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58224yxJ
            public final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
                return C58071yuP.EZpvd(lifecycleRegistry$1, obj, obj2);
            }
        });
        final Function1<AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator>, InterfaceC60096zvd<InterfaceC58028ytZ.StateListAnimator>> function1 = new Function1<AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator>, InterfaceC60096zvd<InterfaceC58028ytZ.StateListAnimator>>() { // from class: com.tinder.scarlet.lifecycle.LifecycleRegistry$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC60096zvd<InterfaceC58028ytZ.StateListAnimator> invoke(@NotNull AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> abstractC58185ywX) {
                Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
                long j2 = j;
                return j2 != 0 ? abstractC58185ywX.djBIcL(j2, TimeUnit.MILLISECONDS, abstractC58253yxm) : abstractC58185ywX;
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXEZpvd = abstractC58185ywXCopydefault.EZpvd(new InterfaceC58241yxa() { // from class: o.yuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58241yxa
            public final InterfaceC60096zvd copydefault(AbstractC58185ywX abstractC58185ywX) {
                return C58071yuP.KWHzl(function1, abstractC58185ywX);
            }
        });
        final LifecycleRegistry$3 lifecycleRegistry$3 = LifecycleRegistry$3.INSTANCE;
        abstractC58185ywXEZpvd.copydefault((InterfaceC58224yxJ<? super R, ? super R>) new InterfaceC58224yxJ() { // from class: o.yuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58224yxJ
            public final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
                return C58071yuP.OLrzqt(lifecycleRegistry$3, obj, obj2);
            }
        }).copydefault(new Application());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C58071yuP(long j, @NotNull AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        PublishProcessor publishProcessorIsConnected = PublishProcessor.isConnected();
        Intrinsics.checkNotNullExpressionValue(publishProcessorIsConnected, "");
        BehaviorProcessor behaviorProcessorValues = BehaviorProcessor.values();
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorValues, "");
        this(publishProcessorIsConnected, behaviorProcessorValues, j, abstractC58253yxm);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:35) call: o.yuP.<init>(long):void type: THIS */
    public /* synthetic */ C58071yuP(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C58071yuP(long j) {
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl();
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        this(j, abstractC58253yxmKWHzl);
    }

    public static final boolean EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return ((java.lang.Boolean) function2.invoke(obj, obj2)).booleanValue();
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, AbstractC58185ywX abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        return (InterfaceC60096zvd) function1.invoke(abstractC58185ywX);
    }

    public static final boolean OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return ((java.lang.Boolean) function2.invoke(obj, obj2)).booleanValue();
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        this.AEQbTJ.onNext(InterfaceC58028ytZ.StateListAnimator.TaskDescription.AEQbTJ);
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        this.AEQbTJ.onNext(InterfaceC58028ytZ.StateListAnimator.TaskDescription.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.yuP$Application */
    public final class Application extends yBS<InterfaceC58028ytZ.StateListAnimator> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
        @Override // o.InterfaceC60097zve
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onNext(@NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C58071yuP.this.EZpvd.onNext(stateListAnimator);
            if (Intrinsics.EZpvd(stateListAnimator, InterfaceC58028ytZ.StateListAnimator.TaskDescription.AEQbTJ)) {
                C58071yuP.this.EZpvd.onComplete();
                dispose();
            }
        }

        @Override // o.InterfaceC60097zve
        public void onError(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            throw new java.lang.IllegalStateException("Stream is terminated", th);
        }

        @Override // o.InterfaceC60097zve
        public void onComplete() {
            throw new java.lang.IllegalStateException("Stream is terminated");
        }
    }
}
