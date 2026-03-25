package o;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.floatwindow.data.FloatWindowState;
import com.okinc.business.market.features.floatwindow.state.FloatWindowStateManager$getWindowState$1;
import com.okinc.business.market.features.floatwindow.state.FloatWindowStateManager$restoreFromSavedState$1;
import com.okinc.business.market.features.floatwindow.state.FloatWindowStateManager$saveWindowState$1;
import com.okinc.business.market.features.floatwindow.state.FloatWindowStateManager$saveWindowState$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class jWQ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C26235jWy AEQbTJ;

    @yCM
    public jWQ(@NotNull C26235jWy c26235jWy) {
        Intrinsics.checkNotNullParameter(c26235jWy, "");
        this.AEQbTJ = c26235jWy;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jWQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ java.lang.Object saveWindowState$default(jWQ jwq, boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 200;
        }
        return jwq.AEQbTJ(z, dexFloatWindowMode, i4, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FloatWindowStateManager$saveWindowState$1 floatWindowStateManager$saveWindowState$1;
        boolean zBooleanValue;
        if (continuation instanceof FloatWindowStateManager$saveWindowState$1) {
            floatWindowStateManager$saveWindowState$1 = (FloatWindowStateManager$saveWindowState$1) continuation;
            int i3 = floatWindowStateManager$saveWindowState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                floatWindowStateManager$saveWindowState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                floatWindowStateManager$saveWindowState$1 = new FloatWindowStateManager$saveWindowState$1(this, continuation);
            }
        }
        FloatWindowStateManager$saveWindowState$1 floatWindowStateManager$saveWindowState$12 = floatWindowStateManager$saveWindowState$1;
        java.lang.Object objAEQbTJ = floatWindowStateManager$saveWindowState$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = floatWindowStateManager$saveWindowState$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                C26235jWy c26235jWy = this.AEQbTJ;
                floatWindowStateManager$saveWindowState$12.label = 1;
                objAEQbTJ = c26235jWy.AEQbTJ(z, dexFloatWindowMode, i, i2, floatWindowStateManager$saveWindowState$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            zBooleanValue = ((java.lang.Boolean) objAEQbTJ).booleanValue();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatWindowStateManager", "Failed to save window state", e);
            zBooleanValue = false;
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static /* synthetic */ void saveWindowState$default(jWQ jwq, boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, CoroutineScope coroutineScope, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 200;
        }
        jwq.KWHzl(z, dexFloatWindowMode, i4, i2, coroutineScope);
    }

    public final void KWHzl(boolean z, @NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatWindowStateManager$saveWindowState$2(this, z, dexFloatWindowMode, i, i2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super FloatWindowState> continuation) throws java.lang.Throwable {
        FloatWindowStateManager$getWindowState$1 floatWindowStateManager$getWindowState$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof FloatWindowStateManager$getWindowState$1) {
            floatWindowStateManager$getWindowState$1 = (FloatWindowStateManager$getWindowState$1) continuation;
            int i = floatWindowStateManager$getWindowState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatWindowStateManager$getWindowState$1.label = i - Integer.MIN_VALUE;
            } else {
                floatWindowStateManager$getWindowState$1 = new FloatWindowStateManager$getWindowState$1(this, continuation);
            }
        }
        java.lang.Object obj = floatWindowStateManager$getWindowState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = floatWindowStateManager$getWindowState$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C26235jWy c26235jWy = this.AEQbTJ;
                floatWindowStateManager$getWindowState$1.label = 1;
                objOLrzqt = c26235jWy.OLrzqt(floatWindowStateManager$getWindowState$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            return (FloatWindowState) objOLrzqt;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatWindowStateManager", "Failed to load window state", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super StateListAnimator> continuation) throws java.lang.Throwable {
        FloatWindowStateManager$restoreFromSavedState$1 floatWindowStateManager$restoreFromSavedState$1;
        DexFloatWindowManager.DexFloatWindowMode dexFloatWindowModeValueOf;
        if (continuation instanceof FloatWindowStateManager$restoreFromSavedState$1) {
            floatWindowStateManager$restoreFromSavedState$1 = (FloatWindowStateManager$restoreFromSavedState$1) continuation;
            int i = floatWindowStateManager$restoreFromSavedState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatWindowStateManager$restoreFromSavedState$1.label = i - Integer.MIN_VALUE;
            } else {
                floatWindowStateManager$restoreFromSavedState$1 = new FloatWindowStateManager$restoreFromSavedState$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = floatWindowStateManager$restoreFromSavedState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = floatWindowStateManager$restoreFromSavedState$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                floatWindowStateManager$restoreFromSavedState$1.label = 1;
                objOLrzqt = OLrzqt(floatWindowStateManager$restoreFromSavedState$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            FloatWindowState floatWindowState = (FloatWindowState) objOLrzqt;
            if (floatWindowState != null && floatWindowState.OLrzqt()) {
                try {
                    dexFloatWindowModeValueOf = DexFloatWindowManager.DexFloatWindowMode.valueOf(floatWindowState.copydefault());
                } catch (java.lang.Exception unused) {
                    pUU.valueOf("FloatWindowStateManager", "Invalid mode '" + floatWindowState.copydefault() + "', using default MEDIUM");
                    dexFloatWindowModeValueOf = DexFloatWindowManager.DexFloatWindowMode.MEDIUM;
                }
                return new StateListAnimator(true, dexFloatWindowModeValueOf, floatWindowState.KWHzl(), floatWindowState.EZpvd());
            }
            return new StateListAnimator(false, null, 0, 0, 14, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FloatWindowStateManager", "Failed to restore from saved state", e);
            return null;
        }
    }

    public static final class StateListAnimator {
        public final DexFloatWindowManager.DexFloatWindowMode AEQbTJ;
        public final boolean EZpvd;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                z = stateListAnimator.EZpvd;
            }
            if ((i3 & 2) != 0) {
                dexFloatWindowMode = stateListAnimator.AEQbTJ;
            }
            if ((i3 & 4) != 0) {
                i = stateListAnimator.KWHzl;
            }
            if ((i3 & 8) != 0) {
                i2 = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(z, dexFloatWindowMode, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexFloatWindowManager.DexFloatWindowMode KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z, @NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2) {
            Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
            return new StateListAnimator(z, dexFloatWindowMode, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && this.AEQbTJ == stateListAnimator.AEQbTJ && this.KWHzl == stateListAnimator.KWHzl && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WindowRestorationInfo(shouldRestore=" + this.EZpvd + ", mode=" + this.AEQbTJ + ", x=" + this.KWHzl + ", y=" + this.copydefault + ")";
        }

        public StateListAnimator(boolean z, @NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2) {
            Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
            this.EZpvd = z;
            this.AEQbTJ = dexFloatWindowMode;
            this.KWHzl = i;
            this.copydefault = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode:0x0004: SGET  A[WRAPPED] (LINE:89) com.okinc.business.market.features.floatwindow.DexFloatWindowManager.DexFloatWindowMode.MEDIUM com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode) : (r2v0 com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (200 int) : (r4v0 int))
 A[MD:(boolean, com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode, int, int):void (m)] (LINE:87) call: o.jWQ.StateListAnimator.<init>(boolean, com.okinc.business.market.features.floatwindow.DexFloatWindowManager$DexFloatWindowMode, int, int):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i3 & 2) != 0 ? DexFloatWindowManager.DexFloatWindowMode.MEDIUM : dexFloatWindowMode, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 200 : i2);
        }
    }
}
