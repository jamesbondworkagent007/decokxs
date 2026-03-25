package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC13987dcu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13990dcx {
    public static final java.util.List<C13983dcq> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) abstractC12782ctV.isConnected(), (java.lang.Iterable) abstractC12782ctV.AxsJAYsNCnLh());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listDjBIcL.iterator();
        while (it.hasNext()) {
            C13983dcq c13983dcqOLrzqt = OLrzqt((ChainAddress) it.next());
            if (c13983dcqOLrzqt != null) {
                arrayList.add(c13983dcqOLrzqt);
            }
        }
        return arrayList;
    }

    public static final C13983dcq OLrzqt(@NotNull ChainAddress chainAddress) {
        InterfaceC13987dcu interfaceC13987dcuAEQbTJ;
        Intrinsics.checkNotNullParameter(chainAddress, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress.getCoinId()));
        if (c10854bwMKWHzl != null) {
            if (c10854bwMKWHzl.QkdxfA()) {
                interfaceC13987dcuAEQbTJ = new InterfaceC13987dcu.Dialog(InterfaceC13987dcu.LoaderManager.OLrzqt(java.lang.String.valueOf(c10854bwMKWHzl.isConnected())), InterfaceC13987dcu.PendingIntent.OLrzqt(c10854bwMKWHzl.fetchVPNInfo()), null);
            } else if (c10854bwMKWHzl.fARcdN()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.FragmentManager.Companion.EZpvd(c10854bwMKWHzl.fetchVPNInfo());
                if (interfaceC13987dcuAEQbTJ == null) {
                    return null;
                }
            } else if (c10854bwMKWHzl.DGOPHZ()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.VoiceInteractor.EZpvd;
            } else if (c10854bwMKWHzl.ixgjPv()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.AssistContent.EZpvd;
            } else if (c10854bwMKWHzl.iRxXKY() && chainAddress.isDefault()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.ActionBar.Companion.copydefault(c10854bwMKWHzl.fetchVPNInfo());
                if (interfaceC13987dcuAEQbTJ == null) {
                    return null;
                }
            } else if (c10854bwMKWHzl.fIwbmz()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.TaskDescription.Companion.AEQbTJ(c10854bwMKWHzl.fetchVPNInfo());
                if (interfaceC13987dcuAEQbTJ == null) {
                    return null;
                }
            } else if (c10854bwMKWHzl.DXXBbs()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.StateListAnimator.Companion.AEQbTJ(c10854bwMKWHzl.AhwBna(), c10854bwMKWHzl.fetchVPNInfo());
                if (interfaceC13987dcuAEQbTJ == null) {
                    return null;
                }
            } else if (c10854bwMKWHzl.run()) {
                interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.TaskStackBuilder.Companion.OLrzqt(c10854bwMKWHzl.fetchVPNInfo());
                if (interfaceC13987dcuAEQbTJ == null) {
                    return null;
                }
            } else if (!c10854bwMKWHzl.DCUTEIdCUTEI() || (interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.SharedElementCallback.Companion.AEQbTJ(c10854bwMKWHzl.fetchVPNInfo())) == null) {
                return null;
            }
            return new C13983dcq(interfaceC13987dcuAEQbTJ, chainAddress.getAddress());
        }
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(chainAddress.getCoinId());
        if (customChainCoinMetaOLrzqt != null) {
            return new C13983dcq(new InterfaceC13987dcu.Dialog(InterfaceC13987dcu.LoaderManager.OLrzqt(java.lang.String.valueOf(customChainCoinMetaOLrzqt.DbNXlk())), InterfaceC13987dcu.PendingIntent.OLrzqt(customChainCoinMetaOLrzqt.copydefault()), null), chainAddress.getAddress());
        }
        return null;
    }
}
