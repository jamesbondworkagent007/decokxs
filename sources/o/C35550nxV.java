package o;

import com.okinc.im.imui.contacts.BlockedContactsLiveData$loadOriginal$1$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35550nxV extends AbstractC37675oyM<RelationInfo> {
    @Override // o.AbstractC37675oyM
    public AbstractC58185ywX<java.util.List<RelationInfo>> OLrzqt(long j) {
        AbstractC58185ywX<java.util.List<RelationInfo>> abstractC58185ywXKWHzl;
        sHZ shzAEQbTJ;
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        InterfaceC44177sGd interfaceC44177sGdAEQbTJ = (interfaceC35180nqU == null || (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) == null) ? null : shzAEQbTJ.AEQbTJ();
        if (interfaceC44177sGdAEQbTJ != null && (abstractC58185ywXKWHzl = C33527myD.KWHzl(C44525sTa.copydefault.EZpvd(new BlockedContactsLiveData$loadOriginal$1$1(interfaceC44177sGdAEQbTJ, null)))) != null) {
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.util.List<RelationInfo>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.util.List<com.okinc.okimcore.model.remote.RelationInfo>] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.okimcore.model.remote.RelationInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC37675oyM
    public java.util.List<RelationInfo> KWHzl(java.lang.String str, @NotNull java.util.List<? extends RelationInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (str == null || str.length() == 0) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) C44157sFk.getDisplayName$default((RelationInfo) obj, null, 1, null), (java.lang.CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
