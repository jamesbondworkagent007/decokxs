package o;

import com.okinc.im.di.CoreModule;

/* JADX INFO: renamed from: o.ntH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35326ntH implements InterfaceC58162ywA<android.content.SharedPreferences> {
    public final InterfaceC58164ywC<android.content.Context> AEQbTJ;
    public final CoreModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.content.SharedPreferences get() {
        return OLrzqt(this.KWHzl, this.AEQbTJ.get());
    }

    public static android.content.SharedPreferences OLrzqt(CoreModule coreModule, android.content.Context context) {
        return (android.content.SharedPreferences) C58165ywD.KWHzl(coreModule.copydefault(context));
    }
}
