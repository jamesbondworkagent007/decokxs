package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.market.market.fragment.OptionQuoteFragment$handleTradeInitResult$1;
import com.okinc.business.market.market.fragment.OptionQuoteFragment$tryInitOKTrade$1;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kHF extends AbstractC32998moE {
    public java.util.List<java.lang.String> AhwBna;
    public boolean KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> djBIcL;
    public qZM gEmmrt;
    public android.widget.LinearLayout valueOf;
    public final int AEQbTJ = qZH.ActionBar.isConnected;
    public boolean AYXKKw = true;
    public boolean EZpvd = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    private final void KWHzl(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AYXKKw || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AYXKKw = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = qZM.copydefault(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.hQufeQ);
        this.valueOf = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        KWHzl(true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk);
        if (viewGroup != null) {
            C6873aXb.OLrzqt(viewGroup);
        }
    }

    public final void KWHzl(boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new OptionQuoteFragment$handleTradeInitResult$1(z, interfaceC54581xNr, this, null));
    }

    public final void EZpvd(boolean z) {
        if (this.EZpvd) {
            this.EZpvd = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    public final void AEQbTJ(java.util.List<java.lang.String> list) {
        java.lang.String str;
        C33542myS c33542myS;
        C33542myS c33542myS2;
        C33542myS c33542myS3;
        this.AhwBna = list;
        copydefault(0, list);
        qZM qzm = this.gEmmrt;
        if (qzm != null && (c33542myS3 = qzm.valueOf) != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c33542myS3.setAdapter(new Application(childFragmentManager, this, list));
        }
        qZM qzm2 = this.gEmmrt;
        if (qzm2 != null && (c33542myS2 = qzm2.valueOf) != null) {
            c33542myS2.addOnPageChangeListener(new TaskDescription(list));
        }
        qZM qzm3 = this.gEmmrt;
        if (qzm3 != null && (c33542myS = qzm3.valueOf) != null) {
            c33542myS.setOffscreenPageLimit(list.size());
        }
        java.util.List<java.lang.String> list2 = this.AhwBna;
        if (list2 == null || (str = list2.get(this.copydefault)) == null) {
            return;
        }
        EZpvd(str);
    }

    public static final class TaskDescription implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ java.util.List<java.lang.String> EZpvd;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public TaskDescription(java.util.List<java.lang.String> list) {
            this.EZpvd = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            kHF.this.copydefault = i;
            kHF.this.copydefault(i, this.EZpvd);
            kHF.this.EZpvd(this.EZpvd.get(i));
        }
    }

    public final void copydefault(int i, java.util.List<java.lang.String> list) {
        C28001kLf c28001kLf;
        qZM qzm = this.gEmmrt;
        if (qzm == null || (c28001kLf = qzm.AEQbTJ) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String upperCase = C44585sZg.AEQbTJ((java.lang.String) it.next()).copydefault().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList.add(upperCase);
        }
        c28001kLf.setFilterData(arrayList, i, new Function1() { // from class: o.kHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kHF.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit copydefault(kHF khf, int i) {
        C33542myS c33542myS;
        qZM qzm = khf.gEmmrt;
        if (qzm != null && (c33542myS = qzm.valueOf) != null) {
            c33542myS.setCurrentItem(i);
        }
        return Unit.INSTANCE;
    }

    public static final class Application extends AbstractC33000moG {
        public java.util.List<java.lang.String> AEQbTJ;
        public final androidx.fragment.app.FragmentManager copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC32998moE abstractC32998moE, @NotNull java.util.List<java.lang.String> list) {
            super(fragmentManager, abstractC32998moE);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(abstractC32998moE, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = fragmentManager;
            this.AEQbTJ = list;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            kGD kgd = new kGD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("name", this.AEQbTJ.get(i));
            kgd.setArguments(bundle);
            return kgd;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.AEQbTJ.size();
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C33542myS c33542myS;
        java.lang.String str;
        android.view.ViewGroup viewGroup;
        if (!this.KWHzl) {
            this.KWHzl = true;
            android.view.View view = getView();
            if (view != null && (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) != null) {
                C6873aXb.EZpvd(viewGroup);
            }
        }
        if (!this.OLrzqt) {
            EZpvd();
        } else {
            qZM qzm = this.gEmmrt;
            PagerAdapter adapter = (qzm == null || (c33542myS = qzm.valueOf) == null) ? null : c33542myS.getAdapter();
            if (adapter == null || adapter.getCount() == 0) {
                EZpvd();
            }
        }
        java.util.List<java.lang.String> list = this.AhwBna;
        if (list == null || (str = list.get(this.copydefault)) == null) {
            return;
        }
        EZpvd(str);
    }

    private final void EZpvd() {
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.EZpvd(this), LifecycleOwnerKt.getLifecycleScope(this), null, new OptionQuoteFragment$tryInitOKTrade$1(this), 2, null);
    }

    public static final /* synthetic */ java.lang.Object EZpvd(kHF khf, boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc, Continuation continuation) {
        khf.KWHzl(z, interfaceC54581xNr, exc);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C55629xnZ.EZpvd(this).OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.String str) {
        new C27989kKu().OLrzqt("OPTION", str);
    }

    private final void AEQbTJ(boolean z) {
        android.widget.FrameLayout frameLayout;
        qZM qzm = this.gEmmrt;
        if (qzm != null && (frameLayout = qzm.EZpvd) != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (z) {
            qZM qzm2 = this.gEmmrt;
            android.widget.FrameLayout frameLayout2 = qzm2 != null ? qzm2.EZpvd : null;
            Intrinsics.copydefault(frameLayout2);
            java.lang.String string = getString(qZH.PendingIntent.DsL);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C6980aZc.AEQbTJ(this, frameLayout2, string, C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj), (16 & 8) != 0 ? null : getString(qZH.PendingIntent.fetchVPNInfo), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.kHH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kHF.djBIcL(this.OLrzqt);
                }
            });
            return;
        }
        qZM qzm3 = this.gEmmrt;
        android.widget.FrameLayout frameLayout3 = qzm3 != null ? qzm3.EZpvd : null;
        Intrinsics.copydefault(frameLayout3);
        C6980aZc.OLrzqt(this, frameLayout3);
    }

    public static final Unit djBIcL(kHF khf) {
        khf.onVisible();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        KWHzl(false);
        AEQbTJ(false);
        EZpvd(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        KWHzl(false);
        AEQbTJ(true);
        EZpvd(false);
    }
}
