package o;

import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5084Ec {

    /* JADX INFO: renamed from: o.Ec$Application */
    public interface Application {

        /* JADX INFO: renamed from: o.Ec$Application$TaskDescription */
        public interface TaskDescription {
        }

        Function1<TaskDescription, Unit> AYXKKw();
    }

    java.lang.Object EZpvd(RetryErrorType retryErrorType, @NotNull Continuation<? super Unit> continuation);

    Application EZpvd();

    java.lang.Object copydefault(int i, @NotNull Continuation<? super Unit> continuation);
}
