package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;

/* JADX INFO: loaded from: classes7.dex */
public final class jWF implements InterfaceC58162ywA<jWL> {
    public final InterfaceC58164ywC<android.content.Context> OLrzqt;
    public final InterfaceC58164ywC<jWM> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jWL get() {
        return copydefault(this.OLrzqt.get(), this.copydefault.get());
    }

    public static jWL copydefault(android.content.Context context, jWM jwm) {
        return (jWL) C58165ywD.KWHzl(FloatWindowModule.KWHzl.EZpvd(context, jwm));
    }
}
