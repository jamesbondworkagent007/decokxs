package o;

import com.okinc.biz.model.VipManagerInfo;
import com.okinc.im.usecase.relationlist.GetVipManagerInfoUseCase$execute$1;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35865oGo {
    public final InterfaceC6804aWL copydefault;

    @yCM
    public C35865oGo(@yCL(AEQbTJ = "IMOnlineServiceService") InterfaceC6804aWL interfaceC6804aWL) {
        this.copydefault = interfaceC6804aWL;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super VipManagerRelationInfo> continuation) throws java.lang.Throwable {
        GetVipManagerInfoUseCase$execute$1 getVipManagerInfoUseCase$execute$1;
        if (continuation instanceof GetVipManagerInfoUseCase$execute$1) {
            getVipManagerInfoUseCase$execute$1 = (GetVipManagerInfoUseCase$execute$1) continuation;
            int i = getVipManagerInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getVipManagerInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getVipManagerInfoUseCase$execute$1 = new GetVipManagerInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getVipManagerInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getVipManagerInfoUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC6804aWL interfaceC6804aWL = this.copydefault;
            if (interfaceC6804aWL != null) {
                getVipManagerInfoUseCase$execute$1.label = 1;
                objAEQbTJ = interfaceC6804aWL.AEQbTJ(getVipManagerInfoUseCase$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        VipManagerInfo vipManagerInfo = (VipManagerInfo) objAEQbTJ;
        if (vipManagerInfo != null) {
            return new VipManagerRelationInfo(vipManagerInfo.getAgentTitle(), new RelationInfo((java.lang.String) null, vipManagerInfo.getAvatarUrl(), vipManagerInfo.getAgentName(), (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, C56402yEa.EZpvd(OfficialTagType.VipManager), 7, (DefaultConstructorMarker) null), 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -8199, 63, (DefaultConstructorMarker) null));
        }
        return null;
    }
}
