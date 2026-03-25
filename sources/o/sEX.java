package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEX implements InterfaceC58162ywA<InHouseIMUploadMediaService> {
    public final ApiModule AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InHouseIMUploadMediaService get() {
        return copydefault(this.AEQbTJ);
    }

    public static InHouseIMUploadMediaService copydefault(ApiModule apiModule) {
        return (InHouseIMUploadMediaService) C58165ywD.KWHzl(apiModule.isConnected());
    }
}
