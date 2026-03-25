package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.pJX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pJU {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    void KWHzl(@NotNull android.app.Application application);

    void copydefault(@NotNull pJZ... pjzArr);

    public static final class StateListAnimator {
        public static volatile pJU EZpvd;
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final pJU copydefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull pJX.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            if (EZpvd == null) {
                synchronized (this) {
                    EZpvd = new C38025pJl(stateListAnimator, coroutineDispatcher);
                    Unit unit = Unit.INSTANCE;
                }
            }
            pJU pju = EZpvd;
            Intrinsics.copydefault(pju);
            return pju;
        }
    }
}
