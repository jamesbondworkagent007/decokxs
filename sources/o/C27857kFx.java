package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.market.market.MarketTabFragment$initViewPager$1;
import com.okinc.business.market.market.MarketTabFragment$initViewPager$3;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43035rhg;
import o.C6814aWV;
import o.InterfaceC54581xNr;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C27857kFx extends AbstractC32998moE implements pWM {
    public qZL EZpvd;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public final java.util.ArrayList<pWN> valueOf = yDY.copydefault(new pWN(qZH.PendingIntent.gkJEwt, "COIN", null, null, 12, null), new pWN(qZH.PendingIntent.hUfVAv, "SPOT", null, null, 12, null), new pWN(qZH.PendingIntent.DQnQnb, "SWAP", null, null, 12, null), new pWN(qZH.PendingIntent.iZzfmt, "OPTION", null, null, 12, null));
    public java.lang.String djBIcL = "SPOT";
    public boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qZL AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<pWN> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.ejfBZ;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public boolean KWHzl() {
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        return xndAEQbTJ != null && true == xndAEQbTJ.fJNWhG();
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C33542myS c33542myS;
        qZL qzl = this.EZpvd;
        if (qzl != null && (c33542myS = qzl.KWHzl) != null) {
            c33542myS.setOffscreenPageLimit(copydefault().size());
        }
        C32866mlf.onEvent$default("Discover_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.kFA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27857kFx.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "markets", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55254xgV c55254xgV;
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = qZL.AEQbTJ(view);
        valueOf();
        qZL qzl = this.EZpvd;
        if (qzl != null && (c55254xgV = qzl.copydefault) != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(requireActivity()).inflate(qZH.ActionBar.fARcdN, (android.view.ViewGroup) c55254xgV, false);
            Intrinsics.copydefault(viewInflate);
            c55254xgV.OLrzqt(viewInflate);
        }
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final java.lang.Object obj = this.KWHzl;
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<C6814aWV>(obj) { // from class: com.okinc.business.market.market.MarketTabFragment$initView$2
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C6814aWV c6814aWV) {
                Intrinsics.checkNotNullParameter(c6814aWV, "");
                this.this$0.copydefault(c6814aWV);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        this.djBIcL = str;
        C27986kKr.AEQbTJ.OLrzqt("payment_channel", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(C6814aWV c6814aWV) {
        java.lang.String strEZpvd = c6814aWV.EZpvd();
        int iHashCode = strEZpvd.hashCode();
        if (iHashCode == -1350588368) {
            if (strEZpvd.equals("main/market/swap")) {
                RxBus.AEQbTJ(C6814aWV.class);
                this.djBIcL = "SWAP";
                EZpvd("SWAP");
                return;
            }
            return;
        }
        if (iHashCode == -1208749792) {
            if (strEZpvd.equals("main/market/future")) {
                RxBus.AEQbTJ(C6814aWV.class);
                this.djBIcL = "FUTURES";
                EZpvd("FUTURES");
                return;
            }
            return;
        }
        if (iHashCode == -955716654 && strEZpvd.equals("main/market/option")) {
            RxBus.AEQbTJ(C6814aWV.class);
            this.djBIcL = "OPTION";
            EZpvd("OPTION");
        }
    }

    public androidx.fragment.app.Fragment KWHzl(@NotNull pWN pwn) {
        Intrinsics.checkNotNullParameter(pwn, "");
        return kFE.Companion.EZpvd(pwn);
    }

    private final void EZpvd(java.lang.String str) {
        C33542myS c33542myS;
        java.util.Iterator<pWN> it = copydefault().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ(), (java.lang.Object) str)) {
                break;
            } else {
                i++;
            }
        }
        qZL qzl = this.EZpvd;
        if (qzl == null || (c33542myS = qzl.KWHzl) == null) {
            return;
        }
        if (i == -1) {
            i = 0;
        }
        c33542myS.setCurrentItem(i, false);
    }

    private final void valueOf() {
        C33542myS c33542myS;
        C55254xgV c55254xgV;
        C33542myS c33542myS2;
        C33542myS c33542myS3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null)) {
            C43296rmc.EZpvd(getTAG(), "initViewPager: updateTabList");
            EZpvd();
        }
        qZL qzl = this.EZpvd;
        if (qzl != null && (c33542myS3 = qzl.KWHzl) != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            qZL qzl2 = this.EZpvd;
            c33542myS3.setAdapter(new Application(childFragmentManager, this, copydefault(), new MarketTabFragment$initViewPager$1(this), qzl2 != null ? qzl2.copydefault : null));
        }
        qZL qzl3 = this.EZpvd;
        if (qzl3 != null && (c33542myS2 = qzl3.KWHzl) != null) {
            c33542myS2.addOnPageChangeListener(new StateListAnimator());
        }
        qZL qzl4 = this.EZpvd;
        if (qzl4 != null && (c55254xgV = qzl4.copydefault) != null) {
            c55254xgV.setupWithViewPager(qzl4 != null ? qzl4.KWHzl : null);
        }
        qZL qzl5 = this.EZpvd;
        if (qzl5 != null && (c33542myS = qzl5.KWHzl) != null) {
            c33542myS.setOffscreenPageLimit(copydefault().size());
        }
        if (interfaceC54581xNrOLrzqt == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null)) {
            C43296rmc.EZpvd(getTAG(), "initViewPager: updateTabList wait init");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketTabFragment$initViewPager$3(this, null), 3, null);
        }
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.kFx$StateListAnimator */
    public static final class StateListAnimator extends ViewPager.SimpleOnPageChangeListener {
        public StateListAnimator() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            C27857kFx c27857kFx = C27857kFx.this;
            c27857kFx.AEQbTJ(c27857kFx.copydefault().get(i).AEQbTJ());
        }
    }

    public void EZpvd() {
        C33542myS c33542myS;
        PagerAdapter adapter;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.util.ArrayList<java.lang.String> arrayListEjfBZ = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.ejfBZ() : null;
        if (C33129mqd.KWHzl((java.util.Collection) arrayListEjfBZ)) {
            java.util.List<pWN> listCopydefault = copydefault(arrayListEjfBZ);
            C43296rmc.EZpvd(getTAG(), "updateTabList: " + listCopydefault + " ");
            copydefault().clear();
            copydefault().addAll(listCopydefault);
            qZL qzl = this.EZpvd;
            if (qzl != null && (c33542myS = qzl.KWHzl) != null && (adapter = c33542myS.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            OLrzqt();
        }
        copydefault(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public java.util.List<pWN> copydefault(java.util.ArrayList<java.lang.String> arrayList) {
        int iNextIndex;
        java.util.ArrayList<pWN> arrayListCopydefault = copydefault();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListCopydefault) {
            pWN pwn = (pWN) obj;
            if (arrayList == null || arrayList.contains(pwn.AEQbTJ()) || Intrinsics.EZpvd((java.lang.Object) pwn.AEQbTJ(), (java.lang.Object) "COIN") || Intrinsics.EZpvd((java.lang.Object) pwn.AEQbTJ(), (java.lang.Object) "Watchlist")) {
                arrayList2.add(obj);
            }
        }
        java.util.List<pWN> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        if (KWHzl()) {
            java.util.ListIterator<pWN> listIterator = listFJNWhG.listIterator(listFJNWhG.size());
            while (listIterator.hasPrevious()) {
                pWN pwnPrevious = listIterator.previous();
                if (Intrinsics.EZpvd((java.lang.Object) pwnPrevious.AEQbTJ(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) pwnPrevious.AEQbTJ(), (java.lang.Object) "FUTURES")) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            iNextIndex = -1;
            if (iNextIndex >= 0) {
                pWN pwn2 = new pWN(C43035rhg.Application.copydefault, "pre_market", null, null, 12, null);
                if (kFE.Companion.AEQbTJ()) {
                    listFJNWhG.add(iNextIndex + 1, pwn2);
                } else {
                    listFJNWhG.add(pwn2);
                }
            }
        }
        return listFJNWhG;
    }

    public final void OLrzqt() {
        final C55254xgV c55254xgV;
        qZL qzl = this.EZpvd;
        if (qzl == null || (c55254xgV = qzl.copydefault) == null) {
            return;
        }
        c55254xgV.post(new java.lang.Runnable() { // from class: o.kFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27857kFx.AEQbTJ(c55254xgV);
            }
        });
    }

    public static final void AEQbTJ(C55254xgV c55254xgV) {
        c55254xgV.setOKDSSize(c55254xgV.OLrzqt());
    }

    public void copydefault(boolean z) {
        if (this.OLrzqt) {
            this.OLrzqt = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    @Override // o.pWM
    public void OLrzqt(boolean z) {
        ActivityResultCaller parentFragment = getParentFragment();
        pWM pwm = parentFragment instanceof pWM ? (pWM) parentFragment : null;
        if (pwm != null) {
            pwm.OLrzqt(z);
        }
    }

    /* JADX INFO: renamed from: o.kFx$Application */
    public static final class Application extends AbstractC33000moG {
        public java.util.ArrayList<pWN> OLrzqt;
        public final Function1<pWN, androidx.fragment.app.Fragment> copydefault;

        @Override // o.AbstractC33000moG
        public boolean AEQbTJ() {
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.pWN, ? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC32998moE abstractC32998moE, @NotNull java.util.ArrayList<pWN> arrayList, @NotNull Function1<? super pWN, ? extends androidx.fragment.app.Fragment> function1, C55254xgV c55254xgV) {
            super(fragmentManager, abstractC32998moE);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(abstractC32998moE, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = arrayList;
            this.copydefault = function1;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            Function1<pWN, androidx.fragment.app.Fragment> function1 = this.copydefault;
            pWN pwn = this.OLrzqt.get(i);
            Intrinsics.checkNotNullExpressionValue(pwn, "");
            return function1.invoke(pwn);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public long getItemId(int i) {
            return this.OLrzqt.get(i).OLrzqt();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            pWN pwn = (pWN) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
            return pwn == null ? "" : C33070mpX.AYXKKw(pwn.OLrzqt());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this.KWHzl);
    }
}
