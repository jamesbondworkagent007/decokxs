package o;

import com.okinc.im.imui.tracking.IMTracker$dispatchResult$1;
import com.okinc.im.imui.tracking.IMTracker$dispatchResultSuspend$2;
import com.okinc.im.imui.tracking.IMTracker$executeAndLogSuspend$1;
import com.okinc.im.imui.tracking.IMTrackerMetadataImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37708oyt {
    public final java.util.List<yHS<java.lang.Integer, java.lang.Long, java.lang.Object[], IMTrackerMetadataImpl, java.lang.Object, Unit>> AEQbTJ = new java.util.ArrayList();

    public final void OLrzqt(@NotNull yHS<? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Object[], ? super IMTrackerMetadataImpl, java.lang.Object, Unit> yhs) {
        Intrinsics.checkNotNullParameter(yhs, "");
        this.AEQbTJ.add(yhs);
    }

    public final void KWHzl(CoroutineScope coroutineScope, int i, long j, java.lang.Object obj, IMTrackerMetadataImpl iMTrackerMetadataImpl, java.lang.Object[] objArr) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, sDN.copydefault.copydefault(), null, new IMTracker$dispatchResult$1(this, i, j, objArr, iMTrackerMetadataImpl, obj, null), 2, null);
    }

    public final java.lang.Object AEQbTJ(int i, long j, java.lang.Object obj, IMTrackerMetadataImpl iMTrackerMetadataImpl, java.lang.Object[] objArr, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(sDN.copydefault.copydefault(), new IMTracker$dispatchResultSuspend$2(this, i, j, objArr, iMTrackerMetadataImpl, obj, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final <T> T OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull Function1<? super InterfaceC37705oyq, ? extends T> function1, int i, @NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        IMTrackerMetadataImpl iMTrackerMetadataImpl = new IMTrackerMetadataImpl();
        iMTrackerMetadataImpl.setLastLogTime(jCurrentTimeMillis);
        try {
            T tInvoke = function1.invoke(iMTrackerMetadataImpl);
            KWHzl(coroutineScope, i, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, tInvoke, iMTrackerMetadataImpl, objArr);
            return tInvoke;
        } catch (java.lang.Throwable th) {
            KWHzl(coroutineScope, i, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, th, iMTrackerMetadataImpl, objArr);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object copydefault(@NotNull Function2<? super InterfaceC37705oyq, ? super Continuation<? super T>, ? extends java.lang.Object> function2, int i, @NotNull java.lang.Object[] objArr, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        IMTracker$executeAndLogSuspend$1 iMTracker$executeAndLogSuspend$1;
        int i2;
        java.lang.Object[] objArr2;
        long j;
        int i3;
        java.lang.Object[] objArr3;
        IMTrackerMetadataImpl iMTrackerMetadataImpl;
        C37708oyt c37708oyt;
        IMTrackerMetadataImpl iMTrackerMetadataImpl2;
        java.lang.Object[] objArr4;
        int i4;
        C37708oyt c37708oyt2;
        long j2;
        C37708oyt c37708oyt3;
        long j3;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        int i5;
        IMTrackerMetadataImpl iMTrackerMetadataImpl3;
        java.lang.Object[] objArr5;
        C37708oyt c37708oyt4;
        if (continuation instanceof IMTracker$executeAndLogSuspend$1) {
            iMTracker$executeAndLogSuspend$1 = (IMTracker$executeAndLogSuspend$1) continuation;
            int i6 = iMTracker$executeAndLogSuspend$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iMTracker$executeAndLogSuspend$1.label = i6 - Integer.MIN_VALUE;
            } else {
                iMTracker$executeAndLogSuspend$1 = new IMTracker$executeAndLogSuspend$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = iMTracker$executeAndLogSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = iMTracker$executeAndLogSuspend$1.label;
        if (i7 != 0) {
            if (i7 == 1) {
                j = iMTracker$executeAndLogSuspend$1.J$0;
                i5 = iMTracker$executeAndLogSuspend$1.I$0;
                iMTrackerMetadataImpl3 = (IMTrackerMetadataImpl) iMTracker$executeAndLogSuspend$1.L$2;
                objArr5 = (java.lang.Object[]) iMTracker$executeAndLogSuspend$1.L$1;
                c37708oyt4 = (C37708oyt) iMTracker$executeAndLogSuspend$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                    i4 = i5;
                    iMTrackerMetadataImpl2 = iMTrackerMetadataImpl3;
                    objArr4 = objArr5;
                    c37708oyt2 = c37708oyt4;
                    j2 = j;
                    try {
                        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        iMTracker$executeAndLogSuspend$1.L$0 = c37708oyt2;
                        iMTracker$executeAndLogSuspend$1.L$1 = objArr4;
                        iMTracker$executeAndLogSuspend$1.L$2 = iMTrackerMetadataImpl2;
                        iMTracker$executeAndLogSuspend$1.L$3 = objInvoke;
                        iMTracker$executeAndLogSuspend$1.I$0 = i4;
                        iMTracker$executeAndLogSuspend$1.J$0 = j2;
                        iMTracker$executeAndLogSuspend$1.label = 2;
                        c37708oyt3 = c37708oyt2;
                        j3 = j2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c37708oyt3 = c37708oyt2;
                        j3 = j2;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i3 = i5;
                    c37708oyt = c37708oyt4;
                    objArr3 = objArr5;
                    iMTrackerMetadataImpl = iMTrackerMetadataImpl3;
                }
                try {
                    return c37708oyt2.AEQbTJ(i4, jCurrentTimeMillis - j2, objInvoke, iMTrackerMetadataImpl2, objArr4, iMTracker$executeAndLogSuspend$1) != objCopydefault ? objCopydefault : objInvoke;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    i3 = i4;
                    objArr3 = objArr4;
                    iMTrackerMetadataImpl = iMTrackerMetadataImpl2;
                    c37708oyt = c37708oyt3;
                    j = j3;
                    jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    iMTracker$executeAndLogSuspend$1.L$0 = th;
                    iMTracker$executeAndLogSuspend$1.L$1 = null;
                    iMTracker$executeAndLogSuspend$1.L$2 = null;
                    iMTracker$executeAndLogSuspend$1.L$3 = null;
                    iMTracker$executeAndLogSuspend$1.label = 3;
                    if (c37708oyt.AEQbTJ(i3, jCurrentTimeMillis2 - j, th, iMTrackerMetadataImpl, objArr3, iMTracker$executeAndLogSuspend$1) != objCopydefault) {
                    }
                }
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th4 = (java.lang.Throwable) iMTracker$executeAndLogSuspend$1.L$0;
                    C56391yDq.AEQbTJ(objInvoke);
                    throw th4;
                }
                long j4 = iMTracker$executeAndLogSuspend$1.J$0;
                int i8 = iMTracker$executeAndLogSuspend$1.I$0;
                java.lang.Object obj = iMTracker$executeAndLogSuspend$1.L$3;
                iMTrackerMetadataImpl3 = (IMTrackerMetadataImpl) iMTracker$executeAndLogSuspend$1.L$2;
                objArr5 = (java.lang.Object[]) iMTracker$executeAndLogSuspend$1.L$1;
                c37708oyt4 = (C37708oyt) iMTracker$executeAndLogSuspend$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                    return obj;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    i5 = i8;
                    j = j4;
                }
            }
            i3 = i5;
            c37708oyt = c37708oyt4;
            objArr3 = objArr5;
            iMTrackerMetadataImpl = iMTrackerMetadataImpl3;
        } else {
            C56391yDq.AEQbTJ(objInvoke);
            long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
            IMTrackerMetadataImpl iMTrackerMetadataImpl4 = new IMTrackerMetadataImpl();
            iMTrackerMetadataImpl4.setLastLogTime(jCurrentTimeMillis3);
            try {
                iMTracker$executeAndLogSuspend$1.L$0 = this;
                objArr2 = objArr;
                try {
                    iMTracker$executeAndLogSuspend$1.L$1 = objArr2;
                    iMTracker$executeAndLogSuspend$1.L$2 = iMTrackerMetadataImpl4;
                    i2 = i;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i2 = i;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                i2 = i;
                objArr2 = objArr;
            }
            try {
                iMTracker$executeAndLogSuspend$1.I$0 = i2;
                iMTracker$executeAndLogSuspend$1.J$0 = jCurrentTimeMillis3;
                iMTracker$executeAndLogSuspend$1.label = 1;
                objInvoke = function2.invoke(iMTrackerMetadataImpl4, iMTracker$executeAndLogSuspend$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                iMTrackerMetadataImpl2 = iMTrackerMetadataImpl4;
                objArr4 = objArr2;
                i4 = i2;
                c37708oyt2 = this;
                j2 = jCurrentTimeMillis3;
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                iMTracker$executeAndLogSuspend$1.L$0 = c37708oyt2;
                iMTracker$executeAndLogSuspend$1.L$1 = objArr4;
                iMTracker$executeAndLogSuspend$1.L$2 = iMTrackerMetadataImpl2;
                iMTracker$executeAndLogSuspend$1.L$3 = objInvoke;
                iMTracker$executeAndLogSuspend$1.I$0 = i4;
                iMTracker$executeAndLogSuspend$1.J$0 = j2;
                iMTracker$executeAndLogSuspend$1.label = 2;
                c37708oyt3 = c37708oyt2;
                j3 = j2;
                if (c37708oyt2.AEQbTJ(i4, jCurrentTimeMillis - j2, objInvoke, iMTrackerMetadataImpl2, objArr4, iMTracker$executeAndLogSuspend$1) != objCopydefault) {
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                j = jCurrentTimeMillis3;
                i3 = i2;
                objArr3 = objArr2;
                iMTrackerMetadataImpl = iMTrackerMetadataImpl4;
                c37708oyt = this;
            }
        }
        jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        iMTracker$executeAndLogSuspend$1.L$0 = th;
        iMTracker$executeAndLogSuspend$1.L$1 = null;
        iMTracker$executeAndLogSuspend$1.L$2 = null;
        iMTracker$executeAndLogSuspend$1.L$3 = null;
        iMTracker$executeAndLogSuspend$1.label = 3;
        if (c37708oyt.AEQbTJ(i3, jCurrentTimeMillis2 - j, th, iMTrackerMetadataImpl, objArr3, iMTracker$executeAndLogSuspend$1) != objCopydefault) {
            return objCopydefault;
        }
        throw th;
    }
}
