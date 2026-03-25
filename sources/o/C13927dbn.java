package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.wallet.transaction.moduleModel.ModuleAdapter;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.network.okg.tag.RequestTagEnum;
import okhttp3.Interceptor;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.dbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13927dbn extends C43280rmM {
    public final java.util.List<Converter.Factory> KWHzl;
    public final Gson OLrzqt;
    public final ModuleAdapter copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return this.KWHzl;
    }

    public C13927dbn() {
        super(null, 1, 0 == true ? 1 : 0);
        ModuleAdapter moduleAdapter = new ModuleAdapter();
        this.copydefault = moduleAdapter;
        Gson gsonCreate = new GsonBuilder().registerTypeAdapter(BaseModel.class, moduleAdapter).create();
        this.OLrzqt = gsonCreate;
        this.KWHzl = yDY.gEmmrt(super.getConvertFactories().get(0), GsonConverterFactory.create(gsonCreate));
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return yDY.gEmmrt(new xYR(), new C13929dbp());
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }
}
