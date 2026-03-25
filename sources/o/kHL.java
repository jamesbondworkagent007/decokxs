package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kHL extends AbstractC32998moE {
    public android.widget.FrameLayout AhwBna;
    public C33542myS EZpvd;
    public Application OLrzqt;
    public C55241xgI copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> KWHzl = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kHM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kHL.OLrzqt(this.KWHzl);
        }
    });
    public boolean djBIcL = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DbNXlk;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kHL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.copydefault = (C55241xgI) view.findViewById(qZH.StateListAnimator.GQzpsZgQzpsZ);
        this.EZpvd = (C33542myS) view.findViewById(qZH.StateListAnimator.GcnicV);
        android.content.Context context = getContext();
        if (context != null) {
            this.KWHzl.clear();
            java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList = this.KWHzl;
            arrayList.add(C56390yDp.OLrzqt("options_chain", context.getResources().getString(qZH.PendingIntent.itxZVF)));
            arrayList.add(C56390yDp.OLrzqt("contract_list", context.getResources().getString(qZH.PendingIntent.ONJgbh)));
            if (C55687xoe.AEQbTJ.AEQbTJ()) {
                arrayList.add(C56390yDp.OLrzqt("simple_mode", context.getResources().getString(qZH.PendingIntent.config)));
            }
            if (((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(null).getFirst().booleanValue()) {
                arrayList.add(C56390yDp.OLrzqt("option_strategy", C33070mpX.AYXKKw(qZH.PendingIntent.zbGDDc)));
            }
        }
        C33542myS c33542myS = this.EZpvd;
        if (c33542myS != null) {
            c33542myS.setOffscreenPageLimit(this.KWHzl.size());
        }
        java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList2 = this.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Application application = new Application(this, arrayList2, childFragmentManager);
        this.OLrzqt = application;
        C33542myS c33542myS2 = this.EZpvd;
        if (c33542myS2 != null) {
            c33542myS2.setAdapter(application);
        }
        C55241xgI c55241xgI = this.copydefault;
        if (c55241xgI != null) {
            c55241xgI.setupWithViewPager(this.EZpvd);
        }
        C33542myS c33542myS3 = this.EZpvd;
        if (c33542myS3 != null) {
            c33542myS3.addOnPageChangeListener(new ActionBar());
        }
    }

    public static final class ActionBar implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                RxBus.KWHzl("OPTIONS_CHAIN");
            } else {
                if (i != 2) {
                    return;
                }
                RxBus.KWHzl("SIMPLE_MODE");
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.QVsKAR);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        EZpvd();
    }

    public final void EZpvd() {
        android.content.Context context = getContext();
        if (context != null) {
            if (!C43453rpa.AEQbTJ.KWHzl(context)) {
                KWHzl(true);
                C55241xgI c55241xgI = this.copydefault;
                if (c55241xgI != null) {
                    c55241xgI.setVisibility(8);
                }
                C33542myS c33542myS = this.EZpvd;
                if (c33542myS != null) {
                    c33542myS.setVisibility(8);
                }
            } else {
                KWHzl(false);
                C55241xgI c55241xgI2 = this.copydefault;
                if (c55241xgI2 != null) {
                    c55241xgI2.setVisibility(0);
                }
                C33542myS c33542myS2 = this.EZpvd;
                if (c33542myS2 != null) {
                    c33542myS2.setVisibility(0);
                }
            }
        }
        EZpvd(false);
    }

    public final C55173xeu KWHzl() {
        return (C55173xeu) this.AYXKKw.getValue();
    }

    public static final C55173xeu OLrzqt(kHL khl) {
        android.content.Context contextRequireContext = khl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    private final void KWHzl(boolean z) {
        android.widget.FrameLayout frameLayout = this.AhwBna;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            android.widget.FrameLayout frameLayout2 = this.AhwBna;
            if (frameLayout2 == null || frameLayout2 == null) {
                return;
            }
            frameLayout2.removeAllViews();
            return;
        }
        C55173xeu c55173xeuKWHzl = KWHzl();
        java.lang.String string = getString(qZH.PendingIntent.DsL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeuKWHzl.setTitle(string);
        KWHzl().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
        C55173xeu c55173xeuKWHzl2 = KWHzl();
        java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeuKWHzl2.setRetry(string2);
        KWHzl().setRetryClickListener(new View.OnClickListener() { // from class: o.kHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kHL.OLrzqt(this.EZpvd, view);
            }
        });
        KWHzl().setEmptyTypeImage(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        KWHzl().setLayoutParams(layoutParams);
        if (KWHzl().getParent() != null) {
            android.view.ViewParent parent = KWHzl().getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(KWHzl());
        }
        android.widget.FrameLayout frameLayout3 = this.AhwBna;
        if (frameLayout3 != null) {
            frameLayout3.addView(KWHzl());
        }
    }

    public static final void OLrzqt(kHL khl, android.view.View view) {
        android.widget.FrameLayout frameLayout = khl.AhwBna;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        khl.djBIcL = true;
        khl.EZpvd(true);
        khl.EZpvd();
    }

    public final void EZpvd(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.djBIcL || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.QCjLjM)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.djBIcL = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public final class Application extends AbstractC33000moG {
        public final /* synthetic */ kHL EZpvd;
        public java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull kHL khl, @NotNull java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList, androidx.fragment.app.FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.EZpvd = khl;
            this.copydefault = arrayList;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            java.lang.String str = (java.lang.String) ((kotlin.Pair) this.EZpvd.KWHzl.get(i)).getFirst();
            int iHashCode = str.hashCode();
            if (iHashCode != -907882016) {
                if (iHashCode != -512609365) {
                    if (iHashCode == -116129795 && str.equals("option_strategy")) {
                        return ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(null).getSecond();
                    }
                } else if (str.equals("contract_list")) {
                    return new kHF();
                }
            } else if (str.equals("options_chain")) {
                return C27903kHp.Companion.KWHzl("Option Chain");
            }
            return C27903kHp.Companion.KWHzl("Simple mode");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return this.copydefault.get(i).getSecond();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.copydefault.size();
        }
    }
}
