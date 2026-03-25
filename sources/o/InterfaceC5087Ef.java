package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5087Ef {

    /* JADX INFO: renamed from: o.Ef$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.Ef$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public interface InterfaceC0801StateListAnimator {
        }

        Function1<InterfaceC0801StateListAnimator, Unit> EZpvd();
    }

    StateListAnimator OLrzqt();

    java.lang.Object copydefault(@NotNull Continuation<? super InterfaceC5088Eg> continuation);
}
