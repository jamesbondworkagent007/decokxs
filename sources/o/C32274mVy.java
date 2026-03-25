package o;

import com.okinc.dexkline.market.di.DataSerializerModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.mVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32274mVy implements InterfaceC58162ywA<Json> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Json get() {
        return KWHzl();
    }

    public static Json KWHzl() {
        return (Json) C58165ywD.KWHzl(DataSerializerModule.copydefault.EZpvd());
    }
}
