package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;

/* JADX INFO: loaded from: classes7.dex */
public final class jWH implements InterfaceC58162ywA<jWM> {
    public final InterfaceC58164ywC<C26235jWy> KWHzl;
    public final InterfaceC58164ywC<android.content.Context> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jWM get() {
        return KWHzl(this.KWHzl.get(), this.copydefault.get());
    }

    public static jWM KWHzl(C26235jWy c26235jWy, android.content.Context context) {
        return (jWM) C58165ywD.KWHzl(FloatWindowModule.KWHzl.OLrzqt(c26235jWy, context));
    }
}
