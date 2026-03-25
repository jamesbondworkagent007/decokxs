package com.okinc.okmarket.home.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C40398qUj;
import o.C46608taQ;
import o.C46684tbn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.qUY;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class CountingBannerViewModel extends AbstractC49411unz<Activity> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final qUY AEQbTJ;
    public final C46608taQ KWHzl;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public CountingBannerViewModel(@NotNull C46608taQ c46608taQ, @NotNull qUY quy) {
        super(new Activity(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(c46608taQ, "");
        Intrinsics.checkNotNullParameter(quy, "");
        this.KWHzl = c46608taQ;
        this.AEQbTJ = quy;
    }

    public static final class Activity extends AbstractC49408unw<Activity> {
        public InterfaceC49371unL<NewCoinInfo> AEQbTJ;
        public InterfaceC49371unL<? extends List<C46684tbn>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL2 = activity.AEQbTJ;
            }
            return activity.EZpvd(interfaceC49371unL, interfaceC49371unL2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull InterfaceC49371unL<? extends List<C46684tbn>> interfaceC49371unL, @NotNull InterfaceC49371unL<NewCoinInfo> interfaceC49371unL2) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            return new Activity(interfaceC49371unL, interfaceC49371unL2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<NewCoinInfo> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<NewCoinInfo> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.AEQbTJ = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.tbn>>, o.unL<java.util.List<o.tbn>> */
        public final InterfaceC49371unL<List<C46684tbn>> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull InterfaceC49371unL<? extends List<C46684tbn>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CountingBannerUiState(banners=" + this.EZpvd + ", newCoinInfo=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:36) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<o.tbn>>, o.unL<com.okinc.okmarket.home.NewCoinInfo>):void (m)] (LINE:34) call: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel.Activity.<init>(o.unL, o.unL):void type: THIS */
        public /* synthetic */ Activity(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC49371unL<? extends List<C46684tbn>> interfaceC49371unL, @NotNull InterfaceC49371unL<NewCoinInfo> interfaceC49371unL2) {
            super(new Function1() { // from class: o.tbl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CountingBannerViewModel.Activity.EZpvd((CountingBannerViewModel.Activity) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            this.EZpvd = interfaceC49371unL;
            this.AEQbTJ = interfaceC49371unL2;
        }

        public static final Activity EZpvd(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return copy$default(activity, null, null, 3, null);
        }
    }

    public final void AEQbTJ() {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CountingBannerViewModel$loadData$1(this, null), 3, null), "loadData");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        CountingBannerViewModel$listenCountDownEvent$1 countingBannerViewModel$listenCountDownEvent$1;
        if (continuation instanceof CountingBannerViewModel$listenCountDownEvent$1) {
            countingBannerViewModel$listenCountDownEvent$1 = (CountingBannerViewModel$listenCountDownEvent$1) continuation;
            int i = countingBannerViewModel$listenCountDownEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                countingBannerViewModel$listenCountDownEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                countingBannerViewModel$listenCountDownEvent$1 = new CountingBannerViewModel$listenCountDownEvent$1(this, continuation);
            }
        }
        Object obj = countingBannerViewModel$listenCountDownEvent$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = countingBannerViewModel$listenCountDownEvent$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                Flow flowM7441catch = FlowKt.m7441catch(this.AEQbTJ.KWHzl(), new CountingBannerViewModel$listenCountDownEvent$2$1(null));
                TaskDescription taskDescription = new TaskDescription();
                countingBannerViewModel$listenCountDownEvent$1.label = 1;
                if (flowM7441catch.collect(taskDescription, countingBannerViewModel$listenCountDownEvent$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C40398qUj c40398qUj, Continuation<? super Unit> continuation) {
            CountingBannerViewModel.this.AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd() {
        AEQbTJ();
    }
}
