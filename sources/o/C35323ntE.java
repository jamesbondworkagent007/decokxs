package o;

import com.okinc.im.di.CoreModule;

/* JADX INFO: renamed from: o.ntE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35323ntE implements InterfaceC58162ywA<InterfaceC47278tmy> {
    public final InterfaceC58164ywC<android.content.Context> AEQbTJ;
    public final CoreModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC47278tmy get() {
        return OLrzqt(this.OLrzqt, this.AEQbTJ.get());
    }

    public static InterfaceC47278tmy OLrzqt(CoreModule coreModule, android.content.Context context) {
        return (InterfaceC47278tmy) C58165ywD.KWHzl(coreModule.AEQbTJ(context));
    }
}
