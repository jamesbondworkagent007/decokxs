package o;

import com.okinc.okimcore.di.ManagerModule;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: o.sFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44153sFg implements InterfaceC58162ywA<InterfaceC44301sKt> {
    public final InterfaceC58164ywC<sGI> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> AYXKKw;
    public final InterfaceC58164ywC<InHouseIMGroupService> AhwBna;
    public final InterfaceC58164ywC<sMF> AkhnZx;
    public final InterfaceC58164ywC<C44504sSg> AuCTel;
    public final InterfaceC58164ywC<MutableSharedFlow<InHouseIMMessageEntity>> DbNXlk;
    public final InterfaceC58164ywC<sGH> EZpvd;
    public final InterfaceC58164ywC<InHouseIMConversationService> KWHzl;
    public final InterfaceC58164ywC<sHZ> OLrzqt;
    public final InterfaceC58164ywC<CoroutineScope> copydefault;
    public final InterfaceC58164ywC<C44498sSa> djBIcL;
    public final InterfaceC58164ywC<C44489sRs> fARcdN;
    public final InterfaceC58164ywC<sED> fIwbmz;
    public final ManagerModule fetchVPNInfo;
    public final InterfaceC58164ywC<C44272sJr> gEmmrt;
    public final InterfaceC58164ywC<InterfaceC44293sKl> isConnected;
    public final InterfaceC58164ywC<sIC> valueOf;
    public final InterfaceC58164ywC<MutableStateFlow<java.util.List<InHouseIMMessageEntity>>> values;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC44301sKt get() {
        return KWHzl(this.fetchVPNInfo, this.AEQbTJ.get(), this.valueOf.get(), this.djBIcL.get(), this.fARcdN.get(), this.KWHzl.get(), this.AhwBna.get(), this.OLrzqt.get(), this.isConnected.get(), this.fIwbmz.get(), this.EZpvd.get(), this.values.get(), this.DbNXlk.get(), this.AuCTel.get(), this.AkhnZx.get(), this.gEmmrt.get(), this.AYXKKw.get(), this.copydefault.get());
    }

    public static InterfaceC44301sKt KWHzl(ManagerModule managerModule, sGI sgi, sIC sic, C44498sSa c44498sSa, C44489sRs c44489sRs, InHouseIMConversationService inHouseIMConversationService, InHouseIMGroupService inHouseIMGroupService, sHZ shz, InterfaceC44293sKl interfaceC44293sKl, sED sed, sGH sgh, MutableStateFlow<java.util.List<InHouseIMMessageEntity>> mutableStateFlow, MutableSharedFlow<InHouseIMMessageEntity> mutableSharedFlow, C44504sSg c44504sSg, sMF smf, C44272sJr c44272sJr, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        return (InterfaceC44301sKt) C58165ywD.KWHzl(managerModule.OLrzqt(sgi, sic, c44498sSa, c44489sRs, inHouseIMConversationService, inHouseIMGroupService, shz, interfaceC44293sKl, sed, sgh, mutableStateFlow, mutableSharedFlow, c44504sSg, smf, c44272sJr, coroutineDispatcher, coroutineScope));
    }
}
