package o;

import androidx.lifecycle.ViewModel;
import com.okinc.share.api.viewmodel.ShareDialogSharedViewModel$emit$1;
import com.okinc.share.api.viewmodel.ShareDialogSharedViewModel$emit$3;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48974ufm extends ViewModel {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final java.lang.Object copydefault = new java.lang.Object();
    public final LinkedHashMap<java.lang.String, MutableSharedFlow<java.lang.Object>> AEQbTJ = new LinkedHashMap<>();
    public final LinkedHashMap<java.lang.String, java.lang.Object> KWHzl = new LinkedHashMap<>();

    /* JADX INFO: renamed from: o.ufm$Activity */
    public static final class Activity<T> {
        public final java.lang.String AEQbTJ;
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.EZpvd = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:31) call: o.ufm.Activity.<init>(java.lang.String, int):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public final MutableSharedFlow<java.lang.Object> copydefault(java.lang.String str, int i) {
        MutableSharedFlow<java.lang.Object> mutableSharedFlow;
        synchronized (this.copydefault) {
            LinkedHashMap<java.lang.String, MutableSharedFlow<java.lang.Object>> linkedHashMap = this.AEQbTJ;
            MutableSharedFlow<java.lang.Object> MutableSharedFlow = linkedHashMap.get(str);
            if (MutableSharedFlow == null) {
                MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i, 64, BufferOverflow.DROP_OLDEST);
                linkedHashMap.put(str, MutableSharedFlow);
            }
            mutableSharedFlow = MutableSharedFlow;
        }
        return mutableSharedFlow;
    }

    public static /* synthetic */ SharedFlow getFlow$default(C48974ufm c48974ufm, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c48974ufm.KWHzl(str, i);
    }

    public final <T> SharedFlow<T> KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableSharedFlow<java.lang.Object> mutableSharedFlowCopydefault = copydefault(str, i);
        Intrinsics.copydefault(mutableSharedFlowCopydefault, "");
        return mutableSharedFlowCopydefault;
    }

    public final <T> SharedFlow<T> copydefault(@NotNull Activity<T> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return KWHzl(activity.copydefault(), activity.AEQbTJ());
    }

    public final <T> T AEQbTJ(@NotNull java.lang.String str) {
        T t;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this.copydefault) {
            t = (T) this.KWHzl.get(str);
            if (t == null) {
                t = null;
            }
        }
        return t;
    }

    public final <T> T KWHzl(@NotNull Activity<T> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return (T) AEQbTJ(activity.copydefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object KWHzl(@NotNull java.lang.String str, T t, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ShareDialogSharedViewModel$emit$1 shareDialogSharedViewModel$emit$1;
        C48974ufm c48974ufm;
        java.lang.Object obj;
        Unit unit;
        if (continuation instanceof ShareDialogSharedViewModel$emit$1) {
            shareDialogSharedViewModel$emit$1 = (ShareDialogSharedViewModel$emit$1) continuation;
            int i = shareDialogSharedViewModel$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareDialogSharedViewModel$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                shareDialogSharedViewModel$emit$1 = new ShareDialogSharedViewModel$emit$1(this, continuation);
            }
        }
        java.lang.Object obj2 = shareDialogSharedViewModel$emit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shareDialogSharedViewModel$emit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            MutableSharedFlow<java.lang.Object> mutableSharedFlowCopydefault = copydefault(str, 0);
            shareDialogSharedViewModel$emit$1.L$0 = this;
            shareDialogSharedViewModel$emit$1.L$1 = str;
            shareDialogSharedViewModel$emit$1.L$2 = t;
            shareDialogSharedViewModel$emit$1.label = 1;
            if (mutableSharedFlowCopydefault.emit(t, shareDialogSharedViewModel$emit$1) == objCopydefault) {
                return objCopydefault;
            }
            c48974ufm = this;
            obj = t;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = shareDialogSharedViewModel$emit$1.L$2;
            str = (java.lang.String) shareDialogSharedViewModel$emit$1.L$1;
            c48974ufm = (C48974ufm) shareDialogSharedViewModel$emit$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            obj = obj3;
        }
        synchronized (c48974ufm.copydefault) {
            c48974ufm.KWHzl.put(str, obj);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object KWHzl(@NotNull Activity<T> activity, T t, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ShareDialogSharedViewModel$emit$3 shareDialogSharedViewModel$emit$3;
        C48974ufm c48974ufm;
        java.lang.Object obj;
        Unit unit;
        if (continuation instanceof ShareDialogSharedViewModel$emit$3) {
            shareDialogSharedViewModel$emit$3 = (ShareDialogSharedViewModel$emit$3) continuation;
            int i = shareDialogSharedViewModel$emit$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareDialogSharedViewModel$emit$3.label = i - Integer.MIN_VALUE;
            } else {
                shareDialogSharedViewModel$emit$3 = new ShareDialogSharedViewModel$emit$3(this, continuation);
            }
        }
        java.lang.Object obj2 = shareDialogSharedViewModel$emit$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shareDialogSharedViewModel$emit$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            MutableSharedFlow<java.lang.Object> mutableSharedFlowCopydefault = copydefault(activity.copydefault(), activity.AEQbTJ());
            shareDialogSharedViewModel$emit$3.L$0 = this;
            shareDialogSharedViewModel$emit$3.L$1 = activity;
            shareDialogSharedViewModel$emit$3.L$2 = t;
            shareDialogSharedViewModel$emit$3.label = 1;
            if (mutableSharedFlowCopydefault.emit(t, shareDialogSharedViewModel$emit$3) == objCopydefault) {
                return objCopydefault;
            }
            c48974ufm = this;
            obj = t;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = shareDialogSharedViewModel$emit$3.L$2;
            activity = (Activity) shareDialogSharedViewModel$emit$3.L$1;
            c48974ufm = (C48974ufm) shareDialogSharedViewModel$emit$3.L$0;
            C56391yDq.AEQbTJ(obj2);
            obj = obj3;
        }
        synchronized (c48974ufm.copydefault) {
            c48974ufm.KWHzl.put(activity.copydefault(), obj);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public final <T> boolean OLrzqt(@NotNull Activity<T> activity, T t) {
        Intrinsics.checkNotNullParameter(activity, "");
        boolean zTryEmit = copydefault(activity.copydefault(), activity.AEQbTJ()).tryEmit(t);
        if (zTryEmit) {
            synchronized (this.copydefault) {
                this.KWHzl.put(activity.copydefault(), t);
                Unit unit = Unit.INSTANCE;
            }
        }
        return zTryEmit;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        synchronized (this.copydefault) {
            this.AEQbTJ.clear();
            this.KWHzl.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ufm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ufm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
