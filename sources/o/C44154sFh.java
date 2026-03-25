package o;

import com.okinc.okimcore.di.RepositoryModule;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;

/* JADX INFO: renamed from: o.sFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44154sFh implements InterfaceC58162ywA<C44489sRs> {
    public final InterfaceC58164ywC<android.content.Context> AEQbTJ;
    public final InterfaceC58164ywC<sED> KWHzl;
    public final InterfaceC58164ywC<InHouseIMUploadMediaService> OLrzqt;
    public final RepositoryModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C44489sRs get() {
        return OLrzqt(this.copydefault, this.KWHzl.get(), this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static C44489sRs OLrzqt(RepositoryModule repositoryModule, sED sed, InHouseIMUploadMediaService inHouseIMUploadMediaService, android.content.Context context) {
        return (C44489sRs) C58165ywD.KWHzl(repositoryModule.copydefault(sed, inHouseIMUploadMediaService, context));
    }
}
