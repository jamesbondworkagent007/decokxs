package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService;

/* JADX INFO: renamed from: o.sET, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44119sET implements InterfaceC58162ywA<InHouseIMRelationService> {
    public final ApiModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InHouseIMRelationService get() {
        return OLrzqt(this.KWHzl);
    }

    public static InHouseIMRelationService OLrzqt(ApiModule apiModule) {
        return (InHouseIMRelationService) C58165ywD.KWHzl(apiModule.gEmmrt());
    }
}
