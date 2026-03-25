package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.message.contractaddress.repository.remote.InHouseIMContractAddressService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEQ implements InterfaceC58162ywA<InHouseIMContractAddressService> {
    public final ApiModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InHouseIMContractAddressService get() {
        return AEQbTJ(this.copydefault);
    }

    public static InHouseIMContractAddressService AEQbTJ(ApiModule apiModule) {
        return (InHouseIMContractAddressService) C58165ywD.KWHzl(apiModule.AYXKKw());
    }
}
