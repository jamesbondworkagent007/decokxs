package o;

import o.InterfaceC57154yd;
import o.InterfaceC57313yg;
import o.InterfaceC57313yg.Activity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC54698xS<TConfig extends InterfaceC57313yg, TConfigBuilder extends InterfaceC57313yg.Activity<TConfig>, TClient extends InterfaceC57154yd> implements InterfaceC57154yd.StateListAnimator<TConfig, TConfigBuilder, TClient> {
    public abstract TClient copydefault(@NotNull TConfig tconfig);

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
    @Override // o.InterfaceC5183Hx
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public final TClient OLrzqt() {
        return (TClient) copydefault((InterfaceC57313yg) EZpvd().OLrzqt());
    }
}
