package o;

import com.okinc.okimcore.di.ManagerModule;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: o.sFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44150sFd implements InterfaceC58162ywA<MutableSharedFlow<InHouseIMMessageEntity>> {
    public final ManagerModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow<InHouseIMMessageEntity> get() {
        return OLrzqt(this.EZpvd);
    }

    public static MutableSharedFlow<InHouseIMMessageEntity> OLrzqt(ManagerModule managerModule) {
        return (MutableSharedFlow) C58165ywD.KWHzl(managerModule.AEQbTJ());
    }
}
