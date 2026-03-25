package o;

import com.okinc.auth.impl.reset2fa.data.datasource.SecurityMfaRemoteDataSource;

/* JADX INFO: renamed from: o.aSh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6616aSh implements InterfaceC58162ywA<SecurityMfaRemoteDataSource> {
    public final SecurityMfaRemoteDataSource.SecurityMfaRemoteDataSourceHiltModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public SecurityMfaRemoteDataSource get() {
        return KWHzl(this.EZpvd);
    }

    public static SecurityMfaRemoteDataSource KWHzl(SecurityMfaRemoteDataSource.SecurityMfaRemoteDataSourceHiltModule securityMfaRemoteDataSourceHiltModule) {
        return (SecurityMfaRemoteDataSource) C58165ywD.KWHzl(securityMfaRemoteDataSourceHiltModule.KWHzl());
    }
}
