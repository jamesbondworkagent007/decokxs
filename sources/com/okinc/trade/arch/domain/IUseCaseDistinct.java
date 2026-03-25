package com.okinc.trade.arch.domain;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface IUseCaseDistinct<R> {
    String AYXKKw();

    Object EZpvd(@NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull DistinctStrategy distinctStrategy, @NotNull String str, @NotNull Continuation<? super R> continuation);

    Object copydefault(@NotNull DistinctStrategy distinctStrategy, @NotNull String str, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation);

    public static final class RedundantExecutionException extends Throwable {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedundantExecutionException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class TaskDescription {
        public static /* synthetic */ Object distinct$default(IUseCaseDistinct iUseCaseDistinct, DistinctStrategy distinctStrategy, String str, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: distinct");
            }
            if ((i & 1) != 0) {
                distinctStrategy = DistinctStrategy.NORMAL;
            }
            if ((i & 2) != 0) {
                str = iUseCaseDistinct.AYXKKw();
            }
            return iUseCaseDistinct.copydefault(distinctStrategy, str, function1, continuation);
        }

        public static /* synthetic */ Object distinct$default(IUseCaseDistinct iUseCaseDistinct, Function1 function1, DistinctStrategy distinctStrategy, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: distinct");
            }
            if ((i & 1) != 0) {
                distinctStrategy = DistinctStrategy.NORMAL;
            }
            if ((i & 2) != 0) {
                str = iUseCaseDistinct.AYXKKw();
            }
            return iUseCaseDistinct.EZpvd(function1, distinctStrategy, str, continuation);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DistinctStrategy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DistinctStrategy[] $VALUES;
        public static final DistinctStrategy NORMAL = new DistinctStrategy("NORMAL", 0);
        public static final DistinctStrategy OVERRIDE = new DistinctStrategy("OVERRIDE", 1);
        public static final DistinctStrategy STRICT = new DistinctStrategy("STRICT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DistinctStrategy[] $values() {
            return new DistinctStrategy[]{NORMAL, OVERRIDE, STRICT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DistinctStrategy> getEntries() {
            return $ENTRIES;
        }

        private DistinctStrategy(String str, int i) {
        }

        static {
            DistinctStrategy[] distinctStrategyArr$values = $values();
            $VALUES = distinctStrategyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(distinctStrategyArr$values);
        }

        public static DistinctStrategy valueOf(String str) {
            return (DistinctStrategy) Enum.valueOf(DistinctStrategy.class, str);
        }

        public static DistinctStrategy[] values() {
            return (DistinctStrategy[]) $VALUES.clone();
        }
    }
}
