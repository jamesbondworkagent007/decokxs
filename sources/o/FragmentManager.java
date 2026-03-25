package o;

import app.cash.sqldelight.RollbackException;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ComponentCallbacks2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    private final PackageManager driver;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PackageManager getDriver() {
        return this.driver;
    }

    public FragmentManager(@NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        this.driver = packageManager;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final <R> R postTransactionCleanup(@NotNull ComponentCallbacks2.Application application, ComponentCallbacks2.Application application2, java.lang.Throwable th, R r) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(application, "");
        if (application2 == null) {
            if (application.AhwBna() && application.copydefault()) {
                if (true ^ application.gEmmrt().isEmpty()) {
                    PackageManager packageManager = this.driver;
                    java.lang.String[] strArr = (java.lang.String[]) application.gEmmrt().toArray(new java.lang.String[0]);
                    packageManager.EZpvd((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
                }
                application.gEmmrt().clear();
                application.AYXKKw().clear();
                java.util.Iterator<T> it = application.valueOf().iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                application.valueOf().clear();
            } else {
                try {
                    java.util.Iterator<T> it2 = application.djBIcL().iterator();
                    while (it2.hasNext()) {
                        ((Function0) it2.next()).invoke();
                    }
                    application.djBIcL().clear();
                } catch (java.lang.Throwable th2) {
                    if (th != null) {
                        throw new java.lang.Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th + "\nwith cause " + th.getCause() + "\n\nRollback exception: " + th2, th2);
                    }
                    throw th2;
                }
            }
        } else {
            application2.AEQbTJ(application.AhwBna() && application.copydefault());
            application2.valueOf().addAll(application.valueOf());
            application2.djBIcL().addAll(application.djBIcL());
            application2.AYXKKw().addAll(application.AYXKKw());
            application2.gEmmrt().addAll(application.gEmmrt());
        }
        if (application2 == null && (th instanceof RollbackException)) {
            return (R) ((RollbackException) th).getValue();
        }
        if (th == null) {
            return r;
        }
        throw th;
    }

    public final void notifyQueries(int i, @NotNull Function1<? super Function1<? super java.lang.String, Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final ComponentCallbacks2.Application applicationOLrzqt = this.driver.OLrzqt();
        if (applicationOLrzqt != null) {
            if (applicationOLrzqt.AYXKKw().add(java.lang.Integer.valueOf(i))) {
                function1.invoke(new Function1<java.lang.String, Unit>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "");
                        applicationOLrzqt.gEmmrt().add(str);
                    }
                });
            }
        } else {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            function1.invoke(new Function1<java.lang.String, Unit>() { // from class: app.cash.sqldelight.BaseTransacterImpl$notifyQueries$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    linkedHashSet.add(str);
                }
            });
            PackageManager packageManager = this.driver;
            java.lang.String[] strArr = (java.lang.String[]) linkedHashSet.toArray(new java.lang.String[0]);
            packageManager.EZpvd((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final java.lang.String createArguments(int i) {
        if (i == 0) {
            return "()";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i + 2);
        sb.append("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
