package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ComponentCallbacks2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContentResolver extends FragmentManager implements ComponentCallbacks2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentResolver(@NotNull PackageManager packageManager) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
    }

    public void transaction(boolean z, @NotNull Function1<? super java.lang.Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        transactionWithWrapper(z, function1);
    }

    public <R> R transactionWithResult(boolean z, @NotNull Function1<? super java.lang.Object<R>, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return (R) transactionWithWrapper(z, function1);
    }

    public final <R> R transactionWithWrapper(boolean z, Function1<? super ContextWrapper<R>, ? extends R> function1) {
        R rInvoke;
        ComponentCallbacks2.Application applicationCopydefault = getDriver().AEQbTJ().copydefault();
        ComponentCallbacks2.Application applicationAEQbTJ = applicationCopydefault.AEQbTJ();
        if (applicationAEQbTJ != null && z) {
            throw new java.lang.IllegalStateException("Already in a transaction".toString());
        }
        java.lang.Throwable th = null;
        try {
            applicationCopydefault.AEQbTJ(this);
            rInvoke = function1.invoke(new ContextWrapper(applicationCopydefault));
            try {
                applicationCopydefault.EZpvd(true);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            rInvoke = null;
            th = th3;
        }
        applicationCopydefault.OLrzqt();
        return (R) postTransactionCleanup(applicationCopydefault, applicationAEQbTJ, th, rInvoke);
    }
}
