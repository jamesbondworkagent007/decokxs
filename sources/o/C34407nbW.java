package o;

import com.okinc.dexkline.market.features.position.PositionModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.nbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34407nbW implements InterfaceC58162ywA<C34476ncm> {
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C34476ncm get() {
        return copydefault(this.copydefault.get());
    }

    public static C34476ncm copydefault(Json json) {
        return (C34476ncm) C58165ywD.KWHzl(PositionModule.copydefault.KWHzl(json));
    }
}
