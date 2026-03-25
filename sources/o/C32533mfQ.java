package o;

import com.okinc.common.okcore.net.OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import uniffi.network.OkdohfFiException;

/* JADX INFO: renamed from: o.mfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32533mfQ implements InterfaceC4274BaX {
    public final Function1<Continuation<? super java.lang.Boolean>, java.lang.Object> AEQbTJ;
    public Job KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32533mfQ(@NotNull Function1<? super Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:32:0x006e, B:34:0x0092, B:35:0x00ab, B:36:0x00ae, B:39:0x00b1, B:44:0x00b6, B:45:0x00c6), top: B:48:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.okinc.common.okcore.net.OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1, java.lang.Object, kotlin.coroutines.Continuation, o.mfQ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC4274BaX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ?? oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1;
        C32533mfQ c32533mfQ;
        java.lang.String message;
        if (continuation instanceof OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1) {
            OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1 oKNativeTaskboolWithOkdohfFiErrorImpl$execute$12 = (OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1) continuation;
            int i = oKNativeTaskboolWithOkdohfFiErrorImpl$execute$12.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKNativeTaskboolWithOkdohfFiErrorImpl$execute$12.label = i - Integer.MIN_VALUE;
                oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1 = oKNativeTaskboolWithOkdohfFiErrorImpl$execute$12;
            } else {
                oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1 = new OKNativeTaskboolWithOkdohfFiErrorImpl$execute$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                this.KWHzl = (Job) oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.getContext().get(Job.Key);
                try {
                    Function1<Continuation<? super java.lang.Boolean>, java.lang.Object> function1 = this.AEQbTJ;
                    oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.L$0 = this;
                    oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.label = 1;
                    objInvoke = function1.invoke(oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1);
                    if (objInvoke == objCopydefault) {
                        return objCopydefault;
                    }
                    c32533mfQ = this;
                } catch (CancellationException e) {
                    e = e;
                    pUU.KWHzl("OKCoreDohManagerImpl", "catch CancellationException", e);
                    throw new OkdohfFiException.Exception(C32529mfM.Companion.AEQbTJ());
                } catch (OkdohfFiException e2) {
                    throw e2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    pUU.OLrzqt("OKCoreDohManagerImpl", "Unexpected error in DoH execute: " + th.getClass().getSimpleName(), th);
                    message = th.getMessage();
                    if (message == null) {
                        message = "DoH request failed: " + th.getClass().getSimpleName();
                    }
                    throw new OkdohfFiException.Exception(message);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c32533mfQ = (C32533mfQ) oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                } catch (CancellationException e3) {
                    e = e3;
                    pUU.KWHzl("OKCoreDohManagerImpl", "catch CancellationException", e);
                    throw new OkdohfFiException.Exception(C32529mfM.Companion.AEQbTJ());
                } catch (OkdohfFiException e4) {
                    throw e4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.OLrzqt("OKCoreDohManagerImpl", "Unexpected error in DoH execute: " + th.getClass().getSimpleName(), th);
                    message = th.getMessage();
                    if (message == null) {
                    }
                    throw new OkdohfFiException.Exception(message);
                }
            }
            boolean zBooleanValue = ((java.lang.Boolean) objInvoke).booleanValue();
            c32533mfQ.KWHzl = null;
            return C56443yFo.KWHzl(zBooleanValue);
        } catch (java.lang.Throwable th3) {
            oKNativeTaskboolWithOkdohfFiErrorImpl$execute$1.KWHzl = null;
            throw th3;
        }
    }

    @Override // o.InterfaceC4274BaX
    public void OLrzqt() {
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
