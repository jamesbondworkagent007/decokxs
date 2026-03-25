package o;

import com.google.gson.Gson;
import com.okinc.business.market.di.DataSerializerModule;

/* JADX INFO: renamed from: o.jze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27674jze implements InterfaceC58162ywA<Gson> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Gson get() {
        return EZpvd();
    }

    public static Gson EZpvd() {
        return (Gson) C58165ywD.KWHzl(DataSerializerModule.EZpvd.OLrzqt());
    }
}
