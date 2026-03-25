package o;

import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;

/* JADX INFO: renamed from: o.aSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6615aSg implements InterfaceC58162ywA<Reset2faRemoteDataSource> {
    public final Reset2faRemoteDataSource.Rebind2faRemoteDataSourceModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Reset2faRemoteDataSource get() {
        return AEQbTJ(this.OLrzqt);
    }

    public static Reset2faRemoteDataSource AEQbTJ(Reset2faRemoteDataSource.Rebind2faRemoteDataSourceModule rebind2faRemoteDataSourceModule) {
        return (Reset2faRemoteDataSource) C58165ywD.KWHzl(rebind2faRemoteDataSourceModule.AEQbTJ());
    }
}
