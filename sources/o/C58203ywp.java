package o;

import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* JADX INFO: renamed from: o.ywp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58203ywp implements InterfaceC58162ywA<android.content.Context> {
    public final ApplicationContextModule AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.content.Context get() {
        return AEQbTJ(this.AEQbTJ);
    }

    public static android.content.Context AEQbTJ(ApplicationContextModule applicationContextModule) {
        return (android.content.Context) C58165ywD.KWHzl(applicationContextModule.AEQbTJ());
    }
}
