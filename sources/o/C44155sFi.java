package o;

import com.okinc.okimcore.di.ManagerModule;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: o.sFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44155sFi implements InterfaceC58162ywA<MutableStateFlow<java.util.List<InHouseIMMessageEntity>>> {
    public final ManagerModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<java.util.List<InHouseIMMessageEntity>> get() {
        return KWHzl(this.copydefault);
    }

    public static MutableStateFlow<java.util.List<InHouseIMMessageEntity>> KWHzl(ManagerModule managerModule) {
        return (MutableStateFlow) C58165ywD.KWHzl(managerModule.EZpvd());
    }
}
