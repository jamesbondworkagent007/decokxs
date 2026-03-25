package o;

import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* JADX INFO: renamed from: o.ywr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58205ywr implements InterfaceC58162ywA<android.app.Application> {
    public final ApplicationContextModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.app.Application get() {
        return OLrzqt(this.EZpvd);
    }

    public static android.app.Application OLrzqt(ApplicationContextModule applicationContextModule) {
        return (android.app.Application) C58165ywD.KWHzl(applicationContextModule.copydefault());
    }
}
