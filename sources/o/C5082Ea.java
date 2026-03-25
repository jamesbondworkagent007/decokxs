package o;

import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5087Ef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5082Ea implements InterfaceC5087Ef {
    public static final C5082Ea copydefault = new C5082Ea();
    public static final InterfaceC5087Ef.StateListAnimator AEQbTJ = new Activity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5087Ef
    public InterfaceC5087Ef.StateListAnimator OLrzqt() {
        return AEQbTJ;
    }

    private C5082Ea() {
    }

    /* JADX INFO: renamed from: o.Ea$Activity */
    public static final class Activity implements InterfaceC5087Ef.StateListAnimator {
        @Override // o.InterfaceC5087Ef.StateListAnimator
        public Function1<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, Unit> EZpvd() {
            return new Function1<InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator, Unit>() { // from class: aws.smithy.kotlin.runtime.retries.delay.InfiniteTokenBucket$config$1$toBuilderApplicator$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator interfaceC0801StateListAnimator) {
                    Intrinsics.checkNotNullParameter(interfaceC0801StateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5087Ef.StateListAnimator.InterfaceC0801StateListAnimator interfaceC0801StateListAnimator) {
                    invoke2(interfaceC0801StateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: o.Ea$TaskDescription */
    public static final class TaskDescription implements InterfaceC5088Eg {
        @Override // o.InterfaceC5088Eg
        public java.lang.Object copydefault(@NotNull RetryErrorType retryErrorType, @NotNull Continuation<? super InterfaceC5088Eg> continuation) {
            return this;
        }

        @Override // o.InterfaceC5088Eg
        public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC5088Eg
        public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC5087Ef
    public java.lang.Object copydefault(@NotNull Continuation<? super InterfaceC5088Eg> continuation) {
        return new TaskDescription();
    }
}
