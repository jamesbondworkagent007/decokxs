package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mgl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32607mgl<T> extends InterfaceC32664mhp {
    public static final Application Companion = Application.OLrzqt;

    JSONObject EZpvd(boolean z);

    java.lang.String KWHzl();

    void copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.mgl$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void clearConfig$default(InterfaceC32607mgl interfaceC32607mgl, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearConfig");
            }
            if ((i & 1) != 0) {
                str = "Remove from SharedPrefs";
            }
            interfaceC32607mgl.copydefault(str);
        }

        public static <T> void EZpvd(@NotNull InterfaceC32607mgl<T> interfaceC32607mgl, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (SPUtils.contains(interfaceC32607mgl.KWHzl())) {
                pUU.KWHzl(interfaceC32607mgl.OLrzqt(), str);
                SPUtils.remove(interfaceC32607mgl.KWHzl());
            }
        }

        public static /* synthetic */ JSONObject getConfig$default(InterfaceC32607mgl interfaceC32607mgl, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfig");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return interfaceC32607mgl.EZpvd(z);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x005c */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0001 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v2, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public static <T> JSONObject copydefault(@NotNull InterfaceC32607mgl<T> interfaceC32607mgl, boolean z) {
            ?? jSONObject = 0;
            jSONObject = 0;
            jSONObject = 0;
            try {
                if (z) {
                    java.lang.String string = SPUtils.getString(interfaceC32607mgl.KWHzl(), "");
                    Intrinsics.copydefault((java.lang.Object) string);
                    if (string.length() == 0) {
                        pUU.KWHzl(interfaceC32607mgl.OLrzqt(), interfaceC32607mgl.OLrzqt() + " no local config found");
                    } else {
                        jSONObject = new JSONObject(string);
                    }
                } else {
                    java.lang.Object objCopydefault = ABTestManager.AEQbTJ.copydefault(interfaceC32607mgl.KWHzl(), AmplitudeName.CEFI, ABTestManager.CacheType.Session);
                    if (objCopydefault instanceof JSONObject) {
                        jSONObject = (JSONObject) objCopydefault;
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(interfaceC32607mgl.OLrzqt(), e);
                clearConfig$default(interfaceC32607mgl, jSONObject, 1, jSONObject);
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: o.mgl$Application */
    public static final class Application {
        public static final /* synthetic */ Application OLrzqt = new Application();

        private Application() {
        }

        /* JADX INFO: renamed from: o.mgl$Application$TaskDescription */
        public static final class TaskDescription implements InterfaceC32861mla {
            public final /* synthetic */ CancellableContinuation<java.lang.Boolean> AEQbTJ;
            public final /* synthetic */ AtomicBoolean KWHzl;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
                this.KWHzl = atomicBoolean;
                this.AEQbTJ = cancellableContinuation;
            }

            @Override // o.InterfaceC32861mla
            public void KWHzl(AmplitudeName amplitudeName) {
                Intrinsics.checkNotNullParameter(amplitudeName, "");
                if (this.KWHzl.compareAndSet(false, true)) {
                    CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
                }
            }

            @Override // o.InterfaceC32861mla
            public void EZpvd(AmplitudeName amplitudeName) {
                Intrinsics.checkNotNullParameter(amplitudeName, "");
                if (this.KWHzl.compareAndSet(false, true)) {
                    CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
                }
            }
        }

        /* JADX INFO: renamed from: o.mgl$Application$StateListAnimator */
        public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
            public final /* synthetic */ TaskDescription EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(TaskDescription taskDescription) {
                this.EZpvd = taskDescription;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(java.lang.Throwable th) {
                AEQbTJ(th);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(java.lang.Throwable th) {
                ABTestManager.unRegisterCallback$default(ABTestManager.AEQbTJ, this.EZpvd, null, 2, null);
            }
        }

        public final java.lang.String AEQbTJ(InterfaceC32484meU interfaceC32484meU) {
            return C34703nhO.copydefault() ? "okx_wallet" : C34703nhO.AEQbTJ() ? "okx_tr" : interfaceC32484meU.fARcdN() ? "alpha" : "okx";
        }

        /* JADX INFO: renamed from: o.mgl$Application$Application, reason: collision with other inner class name */
        public static final class C0882Application implements InterfaceC32897mmJ {
            public final /* synthetic */ InterfaceC32484meU OLrzqt;

            public C0882Application(InterfaceC32484meU interfaceC32484meU) {
                this.OLrzqt = interfaceC32484meU;
            }

            @Override // o.InterfaceC32897mmJ
            public java.lang.String AEQbTJ() {
                java.lang.String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                return strCopydefault;
            }

            @Override // o.InterfaceC32897mmJ
            public java.lang.String EZpvd() {
                return Application.OLrzqt.AEQbTJ(this.OLrzqt);
            }
        }

        public final InterfaceC32897mmJ copydefault(@NotNull InterfaceC32484meU interfaceC32484meU) {
            Intrinsics.checkNotNullParameter(interfaceC32484meU, "");
            return new C0882Application(interfaceC32484meU);
        }

        public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            TaskDescription taskDescription = new TaskDescription(new AtomicBoolean(false), cancellableContinuationImpl);
            cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(taskDescription));
            ABTestManager.registerCallback$default(ABTestManager.AEQbTJ, taskDescription, null, 2, null);
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(continuation);
            }
            return result;
        }
    }
}
