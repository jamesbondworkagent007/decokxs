package com.okinc.im.widgets.audiocall;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C33566myq;
import o.C37170ool;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.C56529yIt;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsOKIMMediaCallFloatingView<T extends ViewDataBinding> extends FrameLayout {
    public int AEQbTJ;
    public T AYXKKw;
    public WindowManager.LayoutParams AhwBna;
    public Job DbNXlk;
    public boolean EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public Direction djBIcL;
    public WindowManager fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public int valueOf;
    public final CoroutineScope values;

    public abstract void EZpvd();

    public abstract int copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public abstract void setCountingTimeText(@NotNull String str);

    public abstract void setDefaultWidth(int i);

    public abstract void setLeftBg(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMDirection(@NotNull Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "");
        this.djBIcL = direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMLayoutParams(@NotNull WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "");
        this.AhwBna = layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMOrientation(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMWidthPixels(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMWindowManager(@NotNull WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(windowManager, "");
        this.fetchVPNInfo = windowManager;
    }

    public abstract void setMoveBg(int i);

    public abstract void setRightBg(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowing(boolean z) {
        this.copydefault = z;
    }

    public abstract void setViewAtRight(boolean z);

    public final WindowManager gEmmrt() {
        WindowManager windowManager = this.fetchVPNInfo;
        if (windowManager != null) {
            return windowManager;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final WindowManager.LayoutParams AEQbTJ() {
        WindowManager.LayoutParams layoutParams = this.AhwBna;
        if (layoutParams != null) {
            return layoutParams;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOKIMMediaCallFloatingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.djBIcL = Direction.LEFT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOKIMMediaCallFloatingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.djBIcL = Direction.LEFT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOKIMMediaCallFloatingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.djBIcL = Direction.LEFT;
    }

    public final T KWHzl() {
        T t = this.AYXKKw;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void valueOf() {
        this.AYXKKw = (T) DataBindingUtil.inflate(LayoutInflater.from(getContext()), copydefault(), this, true);
        Object systemService = getContext().getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        setMWindowManager((WindowManager) systemService);
        setMLayoutParams(new WindowManager.LayoutParams());
        if (Build.VERSION.SDK_INT >= 26) {
            AEQbTJ().type = 2038;
        } else {
            AEQbTJ().type = MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        }
        AEQbTJ().format = 1;
        AEQbTJ().gravity = 8388659;
        AEQbTJ().flags = 40;
        AEQbTJ().width = -2;
        AEQbTJ().height = -2;
        WindowManager.LayoutParams layoutParamsAEQbTJ = AEQbTJ();
        C33566myq c33566myq = C33566myq.EZpvd;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParamsAEQbTJ.y = (c33566myq.OLrzqt(context) - getHeight()) / 2;
        AYXKKw();
    }

    /* JADX INFO: renamed from: com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView$setCountTime$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AbsOKIMMediaCallFloatingView<T> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbsOKIMMediaCallFloatingView<T> absOKIMMediaCallFloatingView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = absOKIMMediaCallFloatingView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView$setCountTime$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04881 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ AbsOKIMMediaCallFloatingView<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04881(AbsOKIMMediaCallFloatingView<T> absOKIMMediaCallFloatingView, Continuation<? super C04881> continuation) {
                super(2, continuation);
                this.this$0 = absOKIMMediaCallFloatingView;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04881 c04881 = new C04881(this.this$0, continuation);
                c04881.J$0 = ((Number) obj).longValue();
                return c04881;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(long j, Continuation<? super Unit> continuation) {
                return ((C04881) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
                return invoke(l.longValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    long j = this.J$0;
                    AbsOKIMMediaCallFloatingView<T> absOKIMMediaCallFloatingView = this.this$0;
                    absOKIMMediaCallFloatingView.setCountingTimeText(absOKIMMediaCallFloatingView.EZpvd(j));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Long> stateFlowAEQbTJ = C37170ool.AEQbTJ.AEQbTJ();
                C04881 c04881 = new C04881(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAEQbTJ, c04881, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setCountTime(Long l) {
        Job job = this.DbNXlk;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.DbNXlk = BuildersKt__Builders_commonKt.launch$default(this.values, null, null, new AnonymousClass1(this, null), 3, null);
    }

    public final String EZpvd(long j) {
        if (j >= 3600) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            Locale locale = Locale.getDefault();
            long j2 = IMarketApiService.SIXTY_MINUTES;
            long j3 = 60;
            String str = String.format(locale, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf((j % j2) / j3), Long.valueOf(j % j3)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        C56529yIt c56529yIt2 = C56529yIt.KWHzl;
        long j4 = 60;
        String str2 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j % ((long) IMarketApiService.SIXTY_MINUTES)) / j4), Long.valueOf(j % j4)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final void AYXKKw() {
        this.gEmmrt = getResources().getConfiguration().orientation;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        gEmmrt().getDefaultDisplay().getMetrics(displayMetrics);
        this.isConnected = displayMetrics.widthPixels;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getResources().getConfiguration().orientation != this.gEmmrt) {
            AYXKKw();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.OLrzqt = (int) motionEvent.getRawX();
            this.valueOf = (int) motionEvent.getRawY();
            this.AEQbTJ = (int) motionEvent.getRawX();
            this.KWHzl = (int) motionEvent.getRawY();
            this.EZpvd = false;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int i = this.OLrzqt;
            int i2 = this.valueOf;
            this.OLrzqt = rawX;
            this.valueOf = rawY;
            AEQbTJ().x += rawX - i;
            AEQbTJ().y += rawY - i2;
            if (AEQbTJ().x < 0) {
                AEQbTJ().x = 0;
            }
            if (AEQbTJ().y < 0) {
                AEQbTJ().y = 0;
            }
            Direction direction = this.djBIcL;
            Direction direction2 = Direction.MOVE;
            if (direction != direction2) {
                this.djBIcL = direction2;
                invalidate();
            }
            if (AEQbTJ().x > 0) {
                EZpvd();
            }
            gEmmrt().updateViewLayout(this, AEQbTJ());
            if (Math.abs(this.AEQbTJ - this.OLrzqt) >= 20 || Math.abs(this.KWHzl - this.valueOf) >= 20) {
                this.EZpvd = true;
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            KWHzl((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            invalidate();
            gEmmrt().updateViewLayout(this, AEQbTJ());
            setViewAtRight(this.djBIcL != Direction.LEFT);
            if (this.EZpvd) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void DbNXlk() {
        Job job = this.DbNXlk;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.DbNXlk = null;
    }

    public final void setPosition(Float f, Float f2) {
        if (f != null) {
            AEQbTJ().x = (int) f.floatValue();
        }
        if (f2 != null) {
            AEQbTJ().y = (int) f2.floatValue();
        }
    }

    public final void AhwBna() {
        if (djBIcL()) {
            return;
        }
        if (AEQbTJ().x == 0) {
            int i = AEQbTJ().y;
            C33566myq c33566myq = C33566myq.EZpvd;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (i == (c33566myq.OLrzqt(context) - getHeight()) / 2) {
                AEQbTJ().x = 0;
                WindowManager.LayoutParams layoutParamsAEQbTJ = AEQbTJ();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                layoutParamsAEQbTJ.y = (c33566myq.OLrzqt(context2) - getHeight()) / 2;
                this.djBIcL = Direction.LEFT;
            }
        }
        if (this.djBIcL == Direction.MOVE) {
            KWHzl(AEQbTJ().x, AEQbTJ().y);
        }
        gEmmrt().addView(this, AEQbTJ());
        this.copydefault = true;
    }

    public final void OLrzqt() {
        if (djBIcL()) {
            gEmmrt().removeView(this);
            this.copydefault = false;
        }
    }

    public final void KWHzl(int i, int i2) {
        if (i > this.isConnected / 2) {
            this.djBIcL = Direction.RIGHT;
            AEQbTJ().x = this.isConnected - getMeasuredWidth();
        } else {
            this.djBIcL = Direction.LEFT;
            AEQbTJ().x = 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction LEFT = new Direction("LEFT", 0);
        public static final Direction RIGHT = new Direction("RIGHT", 1);
        public static final Direction MOVE = new Direction("MOVE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{LEFT, RIGHT, MOVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i) {
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(directionArr$values);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }
}
