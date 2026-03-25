package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57154yd;
import o.InterfaceC57154yd.StateListAnimator;
import o.InterfaceC57313yg;
import o.InterfaceC57313yg.Activity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC57101yc<TConfig extends InterfaceC57313yg, TConfigBuilder extends InterfaceC57313yg.Activity<TConfig>, TClient extends InterfaceC57154yd, TClientBuilder extends InterfaceC57154yd.StateListAnimator<TConfig, TConfigBuilder, ? extends TClient>> {
    TClientBuilder EZpvd();

    /* JADX INFO: renamed from: o.yc$Activity */
    public static final class Activity {
        public static <TConfig extends InterfaceC57313yg, TConfigBuilder extends InterfaceC57313yg.Activity<TConfig>, TClient extends InterfaceC57154yd, TClientBuilder extends InterfaceC57154yd.StateListAnimator<TConfig, TConfigBuilder, ? extends TClient>> TClient OLrzqt(@NotNull InterfaceC57101yc<TConfig, TConfigBuilder, TClient, ? extends TClientBuilder> interfaceC57101yc, @NotNull Function1<? super TConfigBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            InterfaceC57154yd.StateListAnimator stateListAnimatorEZpvd = interfaceC57101yc.EZpvd();
            function1.invoke(stateListAnimatorEZpvd.EZpvd());
            return (TClient) stateListAnimatorEZpvd.OLrzqt();
        }
    }
}
