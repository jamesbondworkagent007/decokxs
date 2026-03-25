package com.amplifyframework.statemachine;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Action {
    public static final Companion Companion = Companion.$$INSTANCE;

    Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation);

    String getId();

    public static final class DefaultImpls {
        public static String getId(@NotNull Action action) {
            String simpleName = action.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            return simpleName;
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BasicAction basic(@NotNull String str, @NotNull yHO<? super EventDispatcher, ? super Environment, ? super Continuation<? super Unit>, ? extends Object> yho) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(yho, "");
            return new BasicAction(str, yho);
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, yHO yho, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            Intrinsics.checkNotNullParameter(yho, "");
            return new Action$Companion$invoke$1(str, yho);
        }

        public final Action invoke(String str, @NotNull yHO<? super EventDispatcher, ? super Environment, ? super Continuation<? super Unit>, ? extends Object> yho) {
            Intrinsics.checkNotNullParameter(yho, "");
            return new Action$Companion$invoke$1(str, yho);
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, yHT yht, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            Intrinsics.checkNotNullParameter(yht, "");
            return new Action$Companion$invoke$2(str, yht);
        }

        public final <EnvType extends Environment> Action invoke(String str, @NotNull yHT<? super EnvType, ? super String, ? super EventDispatcher, ? super Continuation<? super Unit>, ? extends Object> yht) {
            Intrinsics.checkNotNullParameter(yht, "");
            return new Action$Companion$invoke$2(str, yht);
        }
    }
}
