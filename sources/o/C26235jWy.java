package o;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.floatwindow.data.FloatWindowState;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$getFloatWindowStateData$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$getThemeColorsData$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$getWindowState$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$getWindowStateIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$saveThemeColors$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowStateRepository$saveWindowState$1;
import com.okinc.business.market.features.floatwindow.data.FloatWindowThemeColors;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jWy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26235jWy {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C27670jza OLrzqt;

    @yCM
    public C26235jWy(@NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c27670jza;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static /* synthetic */ java.lang.Object saveWindowState$default(C26235jWy c26235jWy, boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 200;
        }
        return c26235jWy.AEQbTJ(z, dexFloatWindowMode, i4, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, @NotNull DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        FloatWindowStateRepository$saveWindowState$1 floatWindowStateRepository$saveWindowState$1;
        boolean zM7384isSuccessimpl;
        java.lang.Object objEZpvd;
        if (continuation instanceof FloatWindowStateRepository$saveWindowState$1) {
            floatWindowStateRepository$saveWindowState$1 = (FloatWindowStateRepository$saveWindowState$1) continuation;
            int i3 = floatWindowStateRepository$saveWindowState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                floatWindowStateRepository$saveWindowState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                floatWindowStateRepository$saveWindowState$1 = new FloatWindowStateRepository$saveWindowState$1(this, continuation);
            }
        }
        java.lang.Object obj = floatWindowStateRepository$saveWindowState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = floatWindowStateRepository$saveWindowState$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(obj);
                FloatWindowState floatWindowState = new FloatWindowState(z, dexFloatWindowMode.name(), i, i2);
                C27670jza c27670jza = this.OLrzqt;
                KSerializer<FloatWindowState> kSerializerSerializer = FloatWindowState.Companion.serializer();
                floatWindowStateRepository$saveWindowState$1.label = 1;
                objEZpvd = c27670jza.EZpvd("key.dex_float_window_state", kSerializerSerializer, floatWindowState, floatWindowStateRepository$saveWindowState$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            zM7384isSuccessimpl = Result.m7384isSuccessimpl(objEZpvd);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            zM7384isSuccessimpl = false;
        }
        return C56443yFo.KWHzl(zM7384isSuccessimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<FloatWindowState>> continuation) {
        FloatWindowStateRepository$getWindowState$1 floatWindowStateRepository$getWindowState$1;
        if (continuation instanceof FloatWindowStateRepository$getWindowState$1) {
            floatWindowStateRepository$getWindowState$1 = (FloatWindowStateRepository$getWindowState$1) continuation;
            int i = floatWindowStateRepository$getWindowState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatWindowStateRepository$getWindowState$1.label = i - Integer.MIN_VALUE;
            } else {
                floatWindowStateRepository$getWindowState$1 = new FloatWindowStateRepository$getWindowState$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = floatWindowStateRepository$getWindowState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = floatWindowStateRepository$getWindowState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FloatWindowStateRepository$getWindowStateIoAF18A$$inlined$dexRunCatching$1 floatWindowStateRepository$getWindowStateIoAF18A$$inlined$dexRunCatching$1 = new FloatWindowStateRepository$getWindowStateIoAF18A$$inlined$dexRunCatching$1(null, this);
            floatWindowStateRepository$getWindowState$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, floatWindowStateRepository$getWindowStateIoAF18A$$inlined$dexRunCatching$1, floatWindowStateRepository$getWindowState$1);
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
    public final java.lang.Object EZpvd(Continuation<? super FloatWindowState> continuation) throws java.lang.Throwable {
        FloatWindowStateRepository$getFloatWindowStateData$1 floatWindowStateRepository$getFloatWindowStateData$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof FloatWindowStateRepository$getFloatWindowStateData$1) {
            floatWindowStateRepository$getFloatWindowStateData$1 = (FloatWindowStateRepository$getFloatWindowStateData$1) continuation;
            int i = floatWindowStateRepository$getFloatWindowStateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatWindowStateRepository$getFloatWindowStateData$1.label = i - Integer.MIN_VALUE;
            } else {
                floatWindowStateRepository$getFloatWindowStateData$1 = new FloatWindowStateRepository$getFloatWindowStateData$1(this, continuation);
            }
        }
        java.lang.Object obj = floatWindowStateRepository$getFloatWindowStateData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = floatWindowStateRepository$getFloatWindowStateData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C27670jza c27670jza = this.OLrzqt;
                KSerializer<FloatWindowState> kSerializerSerializer = FloatWindowState.Companion.serializer();
                floatWindowStateRepository$getFloatWindowStateData$1.label = 1;
                objAEQbTJ = c27670jza.AEQbTJ("key.dex_float_window_state", kSerializerSerializer, floatWindowStateRepository$getFloatWindowStateData$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            return (FloatWindowState) objAEQbTJ;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, int i2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FloatWindowStateRepository$saveThemeColors$1 floatWindowStateRepository$saveThemeColors$1;
        boolean zM7384isSuccessimpl;
        java.lang.Object objEZpvd;
        if (continuation instanceof FloatWindowStateRepository$saveThemeColors$1) {
            floatWindowStateRepository$saveThemeColors$1 = (FloatWindowStateRepository$saveThemeColors$1) continuation;
            int i3 = floatWindowStateRepository$saveThemeColors$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                floatWindowStateRepository$saveThemeColors$1.label = i3 - Integer.MIN_VALUE;
            } else {
                floatWindowStateRepository$saveThemeColors$1 = new FloatWindowStateRepository$saveThemeColors$1(this, continuation);
            }
        }
        java.lang.Object obj = floatWindowStateRepository$saveThemeColors$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = floatWindowStateRepository$saveThemeColors$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(obj);
                FloatWindowThemeColors floatWindowThemeColors = new FloatWindowThemeColors(i, i2, java.lang.System.currentTimeMillis());
                C27670jza c27670jza = this.OLrzqt;
                KSerializer<FloatWindowThemeColors> kSerializerSerializer = FloatWindowThemeColors.Companion.serializer();
                floatWindowStateRepository$saveThemeColors$1.label = 1;
                objEZpvd = c27670jza.EZpvd("key.dex_float_window_theme_colors", kSerializerSerializer, floatWindowThemeColors, floatWindowStateRepository$saveThemeColors$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            zM7384isSuccessimpl = Result.m7384isSuccessimpl(objEZpvd);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            zM7384isSuccessimpl = false;
        }
        return C56443yFo.KWHzl(zM7384isSuccessimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super FloatWindowThemeColors> continuation) throws java.lang.Throwable {
        FloatWindowStateRepository$getThemeColorsData$1 floatWindowStateRepository$getThemeColorsData$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof FloatWindowStateRepository$getThemeColorsData$1) {
            floatWindowStateRepository$getThemeColorsData$1 = (FloatWindowStateRepository$getThemeColorsData$1) continuation;
            int i = floatWindowStateRepository$getThemeColorsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatWindowStateRepository$getThemeColorsData$1.label = i - Integer.MIN_VALUE;
            } else {
                floatWindowStateRepository$getThemeColorsData$1 = new FloatWindowStateRepository$getThemeColorsData$1(this, continuation);
            }
        }
        java.lang.Object obj = floatWindowStateRepository$getThemeColorsData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = floatWindowStateRepository$getThemeColorsData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C27670jza c27670jza = this.OLrzqt;
                KSerializer<FloatWindowThemeColors> kSerializerSerializer = FloatWindowThemeColors.Companion.serializer();
                floatWindowStateRepository$getThemeColorsData$1.label = 1;
                objAEQbTJ = c27670jza.AEQbTJ("key.dex_float_window_theme_colors", kSerializerSerializer, floatWindowStateRepository$getThemeColorsData$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            return (FloatWindowThemeColors) objAEQbTJ;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o.jWy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jWy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
