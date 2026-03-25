package o;

import com.okinc.auth.impl.passkey.utils.DeviceSystemHelperModule;

/* JADX INFO: renamed from: o.aRX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6553aRX implements InterfaceC58162ywA<C6555aRZ> {
    public final DeviceSystemHelperModule KWHzl;
    public final InterfaceC58164ywC<android.content.Context> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C6555aRZ get() {
        return OLrzqt(this.KWHzl, this.OLrzqt.get());
    }

    public static C6555aRZ OLrzqt(DeviceSystemHelperModule deviceSystemHelperModule, android.content.Context context) {
        return (C6555aRZ) C58165ywD.KWHzl(deviceSystemHelperModule.OLrzqt(context));
    }
}
