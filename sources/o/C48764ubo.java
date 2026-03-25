package o;

import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;
import com.okinc.referral.mlnservice.bean.UDAddressItem;
import com.okinc.referral.mlnservice.instance.OKMLNReferralAddress;
import com.okinc.referral.mlnservice.instance.OKReferralBridge;
import com.okinc.referral.mlnservice.view.OKReferralAvatarView;
import com.okinc.referral.mlnservice.view.UDGalleryLayout;
import com.okinc.referral.mlnservice.view.UDGrowthReferralRecyclerView;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.ubo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48764ubo extends AbstractC43215rlA implements InterfaceC7377aig {
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
        return new C48765ubp();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(OKReferralBridge.LUA_CLASS_NAME, OKReferralBridge.class), new C7325ahh.Application(OKMLNReferralAddress.LUA_CLASS_NAME, OKMLNReferralAddress.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        C8010aue.AssistContent assistContent = new C8010aue.AssistContent("OKReferralAvatarView", OKReferralAvatarView.class, false, OKReferralAvatarView.OLrzqt);
        java.lang.String str = UDGrowthReferralRecyclerView.sSMYrx[0];
        java.lang.String[] strArr = UDGrowthReferralRecyclerView.AwvSrB;
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault(str, (java.lang.Class<? extends LuaUserdata>) UDGrowthReferralRecyclerView.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        java.lang.String str2 = UDGalleryLayout.LUA_CLASS_NAME[0];
        java.lang.String[] strArr2 = UDCollectionLayout.methods;
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault(str2, (java.lang.Class<? extends LuaUserdata>) UDGalleryLayout.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length));
        java.lang.String[] strArr3 = UDAddressItem.methods;
        return new C8010aue.AssistContent[]{assistContent, assistContentCopydefault, assistContentCopydefault2, C8010aue.copydefault(UDAddressItem.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDAddressItem.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr3, strArr3.length))};
    }
}
