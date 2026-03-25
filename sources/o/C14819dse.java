package o;

import com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter;
import com.okinc.business.defi.dapp.bridge.DappBridge;
import com.okinc.business.defi.dapp.bridge.DappDeepLinkBridge;
import com.okinc.business.defi.dapp.bridge.UDDappHistory;
import com.okinc.business.defi.dapp.support.UDFeedsDetailBridge;
import com.okinc.business.defi.dapp.view.DiscoverOKFilterChip;
import com.okinc.business.defi.dapp.view.cardSwipe.UDCardRecyclerView;
import com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2;
import com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2Adapter;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.dse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14819dse extends AbstractC7372aib {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        if (C34703nhO.copydefault()) {
            return new C15138dyf();
        }
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        if (C34703nhO.copydefault()) {
            return new C7325ahh.Application[]{new C7325ahh.Application(DappBridge.LUA_CLASS_NAME, DappBridge.class), new C7325ahh.Application(DappDeepLinkBridge.LUA_CLASS_NAME, DappDeepLinkBridge.class), new C7325ahh.Application("OKMarketBridge", UDFeedsDetailBridge.class)};
        }
        return new C7325ahh.Application[]{new C7325ahh.Application(DappBridge.LUA_CLASS_NAME, DappBridge.class), new C7325ahh.Application(DappDeepLinkBridge.LUA_CLASS_NAME, DappDeepLinkBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArr = UDDappHistory.methods;
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault(UDDappHistory.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDDappHistory.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        java.lang.String[] strArr2 = UDCardRecyclerView.KWHzl;
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault("OKDAppCardView", (java.lang.Class<? extends LuaUserdata>) UDCardRecyclerView.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length));
        java.lang.String[] strArrOLrzqt = DiscoverOKFilterChip.Companion.OLrzqt();
        C8010aue.AssistContent assistContentCopydefault3 = C8010aue.copydefault("OKDiscoverFilterChip", (java.lang.Class<? extends LuaUserdata>) DiscoverOKFilterChip.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length));
        java.lang.String[] strArr3 = UDViewPager2.copydefault;
        C8010aue.AssistContent assistContentCopydefault4 = C8010aue.copydefault("OKViewPager2", (java.lang.Class<? extends LuaUserdata>) UDViewPager2.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr3, strArr3.length));
        java.lang.String[] strArr4 = UDBaseNeedHeightAdapter.copydefault;
        return new C8010aue.AssistContent[]{assistContentCopydefault, assistContentCopydefault2, assistContentCopydefault3, assistContentCopydefault4, C8010aue.copydefault("ViewPager2Adapter", (java.lang.Class<? extends LuaUserdata>) UDViewPager2Adapter.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr4, strArr4.length))};
    }
}
