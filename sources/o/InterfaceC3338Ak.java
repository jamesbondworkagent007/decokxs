package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC4078Ay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3338Ak {
    InterfaceC3972Aw djBIcL();

    /* JADX INFO: renamed from: o.Ak$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1);

        <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1);

        /* JADX INFO: renamed from: o.Ak$StateListAnimator$ActionBar */
        /* JADX INFO: loaded from: classes14.dex */
        public static final class ActionBar {
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Ak$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void httpClient$default(StateListAnimator stateListAnimator, Function1 function1, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpClient");
                }
                if ((i & 1) != 0) {
                    function1 = new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.config.HttpEngineConfig$Builder$httpClient$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                            Intrinsics.checkNotNullParameter(actionBar, "");
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                            invoke2(actionBar);
                            return Unit.INSTANCE;
                        }
                    };
                }
                stateListAnimator.EZpvd(function1);
            }

            public static /* synthetic */ void httpClient$default(StateListAnimator stateListAnimator, InterfaceC3232Ai interfaceC3232Ai, Function1 function1, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpClient");
                }
                if ((i & 2) != 0) {
                    function1 = new Function1<java.lang.Object, Unit>() { // from class: aws.smithy.kotlin.runtime.http.config.HttpEngineConfig$Builder$httpClient$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final void invoke(@NotNull Object obj2) {
                            Intrinsics.checkNotNullParameter(obj2, "");
                        }

                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke(obj2);
                            return Unit.INSTANCE;
                        }
                    };
                }
                stateListAnimator.KWHzl(interfaceC3232Ai, function1);
            }
        }
    }
}
