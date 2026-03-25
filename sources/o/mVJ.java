package o;

import com.okinc.dexkline.market.di.SpModule;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes8.dex */
public final class mVJ implements InterfaceC58162ywA<C32272mVw> {
    public final InterfaceC58164ywC<android.content.Context> EZpvd;
    public final InterfaceC58164ywC<Json> KWHzl;
    public final InterfaceC58164ywC<CoroutineDispatcher> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C32272mVw get() {
        return AEQbTJ(this.EZpvd.get(), this.KWHzl.get(), this.OLrzqt.get());
    }

    public static C32272mVw AEQbTJ(android.content.Context context, Json json, CoroutineDispatcher coroutineDispatcher) {
        return (C32272mVw) C58165ywD.KWHzl(SpModule.AEQbTJ.copydefault(context, json, coroutineDispatcher));
    }
}
