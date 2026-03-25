package o;

import app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import o.ComponentCallbacks2;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ComponentName extends FragmentManager implements ClipData {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14, types: [o.ComponentName, o.FragmentManager] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.FragmentManager] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.FragmentManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object EZpvd(boolean z, Function2<? super ComponentCallbacks<R>, ? super Continuation<? super R>, ? extends java.lang.Object> function2, Continuation<? super R> continuation) throws java.lang.Throwable {
        SuspendingTransacterImpl$transactionWithWrapper$1 suspendingTransacterImpl$transactionWithWrapper$1;
        ComponentName componentName;
        ComponentCallbacks2.Application application;
        java.lang.Throwable th;
        ComponentCallbacks2.Application application2;
        ComponentCallbacks2.Application application3;
        ComponentCallbacks2.Application application4;
        IntentSender<Unit> intentSenderOLrzqt;
        ComponentCallbacks2.Application application5;
        ?? r0;
        java.lang.Object obj;
        ComponentCallbacks2.Application application6;
        ComponentCallbacks2.Application application7;
        IntentSender<Unit> intentSenderOLrzqt2;
        ComponentCallbacks2.Application application8;
        java.lang.Object obj2;
        ?? r02;
        if (continuation instanceof SuspendingTransacterImpl$transactionWithWrapper$1) {
            suspendingTransacterImpl$transactionWithWrapper$1 = (SuspendingTransacterImpl$transactionWithWrapper$1) continuation;
            int i = suspendingTransacterImpl$transactionWithWrapper$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                suspendingTransacterImpl$transactionWithWrapper$1.label = i - Integer.MIN_VALUE;
            } else {
                suspendingTransacterImpl$transactionWithWrapper$1 = new SuspendingTransacterImpl$transactionWithWrapper$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = suspendingTransacterImpl$transactionWithWrapper$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = suspendingTransacterImpl$transactionWithWrapper$1.label;
        java.lang.Object obj3 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            IntentSender<ComponentCallbacks2.Application> intentSenderAEQbTJ = getDriver().AEQbTJ();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = this;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = function2;
            suspendingTransacterImpl$transactionWithWrapper$1.Z$0 = z;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 1;
            objCopydefault = intentSenderAEQbTJ.copydefault(suspendingTransacterImpl$transactionWithWrapper$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            componentName = this;
        } else if (i2 == 1) {
            z = suspendingTransacterImpl$transactionWithWrapper$1.Z$0;
            function2 = (Function2) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
            componentName = (ComponentName) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    obj2 = suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                    application3 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                    application8 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                    ComponentName componentName2 = (ComponentName) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    r02 = componentName2;
                    return r02.postTransactionCleanup(application8, application3, null, obj2);
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj4 = suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                    ComponentCallbacks2.Application application9 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                    ComponentCallbacks2.Application application10 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                    ?? r03 = (ComponentName) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    return r03.postTransactionCleanup(application10, application9, null, obj4);
                }
                obj = suspendingTransacterImpl$transactionWithWrapper$1.L$4;
                th = (java.lang.Throwable) suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                application5 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                application6 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                ComponentName componentName3 = (ComponentName) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                r0 = componentName3;
                return r0.postTransactionCleanup(application6, application5, th, obj);
            }
            application2 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
            ComponentCallbacks2.Application application11 = (ComponentCallbacks2.Application) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
            componentName = (ComponentName) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                application4 = application11;
                application3 = application2;
                application7 = application4;
                try {
                    application7.EZpvd(true);
                    intentSenderOLrzqt2 = application7.OLrzqt();
                    suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application7;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$2 = application3;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$3 = objCopydefault;
                    suspendingTransacterImpl$transactionWithWrapper$1.label = 3;
                    if (intentSenderOLrzqt2.copydefault(suspendingTransacterImpl$transactionWithWrapper$1) != objCopydefault2) {
                        return objCopydefault2;
                    }
                    application8 = application7;
                    obj2 = objCopydefault;
                    r02 = componentName;
                    return r02.postTransactionCleanup(application8, application3, null, obj2);
                } catch (java.lang.Throwable th2) {
                    obj3 = objCopydefault;
                    application = application7;
                    application2 = application3;
                    th = th2;
                    intentSenderOLrzqt = application.OLrzqt();
                    suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$2 = application2;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
                    suspendingTransacterImpl$transactionWithWrapper$1.L$4 = obj3;
                    suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
                    if (intentSenderOLrzqt.copydefault(suspendingTransacterImpl$transactionWithWrapper$1) == objCopydefault2) {
                    }
                }
            } catch (java.lang.Throwable th3) {
                application = application11;
                th = th3;
                intentSenderOLrzqt = application.OLrzqt();
                suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
                suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application;
                suspendingTransacterImpl$transactionWithWrapper$1.L$2 = application2;
                suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
                suspendingTransacterImpl$transactionWithWrapper$1.L$4 = obj3;
                suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
                if (intentSenderOLrzqt.copydefault(suspendingTransacterImpl$transactionWithWrapper$1) == objCopydefault2) {
                }
            }
        }
        application = (ComponentCallbacks2.Application) objCopydefault;
        ComponentCallbacks2.Application applicationAEQbTJ = application.AEQbTJ();
        if (applicationAEQbTJ != null && z) {
            throw new java.lang.IllegalStateException("Already in a transaction".toString());
        }
        try {
            application.AEQbTJ(componentName);
            ComponentCallbacks componentCallbacks = new ComponentCallbacks(application);
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = applicationAEQbTJ;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 2;
            java.lang.Object objInvoke = function2.invoke(componentCallbacks, suspendingTransacterImpl$transactionWithWrapper$1);
            if (objInvoke == objCopydefault2) {
                return objCopydefault2;
            }
            application3 = applicationAEQbTJ;
            application4 = application;
            objCopydefault = objInvoke;
            application7 = application4;
            application7.EZpvd(true);
            intentSenderOLrzqt2 = application7.OLrzqt();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application7;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = application3;
            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = objCopydefault;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 3;
            if (intentSenderOLrzqt2.copydefault(suspendingTransacterImpl$transactionWithWrapper$1) != objCopydefault2) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            application2 = applicationAEQbTJ;
            intentSenderOLrzqt = application.OLrzqt();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = componentName;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = application;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = application2;
            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
            suspendingTransacterImpl$transactionWithWrapper$1.L$4 = obj3;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
            if (intentSenderOLrzqt.copydefault(suspendingTransacterImpl$transactionWithWrapper$1) == objCopydefault2) {
                return objCopydefault2;
            }
            application5 = application2;
            r0 = componentName;
            obj = obj3;
            application6 = application;
            return r0.postTransactionCleanup(application6, application5, th, obj);
        }
    }
}
