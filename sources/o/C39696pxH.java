package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C39690pxB;
import o.C39696pxH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39696pxH extends wXX {
    public oOU KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pxF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39696pxH.AEQbTJ(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pxI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C39696pxH.djBIcL(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.pxH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pxH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C39696pxH AEQbTJ(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            C39696pxH c39696pxH = new C39696pxH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str);
            bundle.putInt("position", i);
            c39696pxH.setArguments(bundle);
            return c39696pxH;
        }
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AEQbTJ(C39696pxH c39696pxH) {
        java.lang.String string;
        android.os.Bundle arguments = c39696pxH.getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "" : string;
    }

    public final int KWHzl() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int djBIcL(C39696pxH c39696pxH) {
        android.os.Bundle arguments = c39696pxH.getArguments();
        if (arguments != null) {
            return arguments.getInt("position");
        }
        return 0;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        oOU oouKWHzl = oOU.KWHzl(getLayoutInflater(), constraintLayout, true);
        this.KWHzl = oouKWHzl;
        if (oouKWHzl != null) {
            oouKWHzl.KWHzl.setupWithViewPager(oouKWHzl.AEQbTJ);
            ViewPager viewPager = oouKWHzl.AEQbTJ;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            viewPager.setAdapter(new Application(this, childFragmentManager));
            oouKWHzl.AEQbTJ.addOnPageChangeListener(new StateListAnimator(oouKWHzl));
        }
    }

    /* JADX INFO: renamed from: o.pxH$StateListAnimator */
    public static final class StateListAnimator implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ oOU copydefault;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public StateListAnimator(oOU oou) {
            this.copydefault = oou;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(final int i) {
            C39690pxB[] c39690pxBArrAEQbTJ;
            PagerAdapter adapter = this.copydefault.AEQbTJ.getAdapter();
            Application application = adapter instanceof Application ? (Application) adapter : null;
            if (application != null && (c39690pxBArrAEQbTJ = application.AEQbTJ()) != null) {
                int length = c39690pxBArrAEQbTJ.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    C39690pxB c39690pxB = c39690pxBArrAEQbTJ[i2];
                    if (!(c39690pxB instanceof C39690pxB)) {
                        c39690pxB = null;
                    }
                    if (c39690pxB != null) {
                        c39690pxB.copydefault(i3 == i);
                    }
                    i2++;
                    i3++;
                }
            }
            C32866mlf.onEvent$default("TokenUnlock_Overview_ViewAll_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39696pxH.StateListAnimator.AEQbTJ(i, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit AEQbTJ(int i, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("eventlist_type", i == 0 ? "upcoming" : "past", true);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.pxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39696pxH.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(C39696pxH c39696pxH) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39696pxH, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager viewPager;
        super.onResume();
        oOU oou = this.KWHzl;
        if (oou == null || (viewPager = oou.AEQbTJ) == null) {
            return;
        }
        viewPager.setCurrentItem(KWHzl());
    }

    /* JADX INFO: renamed from: o.pxH$Application */
    public final class Application extends AbstractC33011moR {
        public final C39690pxB[] AhwBna;
        public final /* synthetic */ C39696pxH gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C39690pxB[] AEQbTJ() {
            return this.AhwBna;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C39696pxH c39696pxH, androidx.fragment.app.FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.gEmmrt = c39696pxH;
            C39690pxB.StateListAnimator stateListAnimator = C39690pxB.Companion;
            this.AhwBna = new C39690pxB[]{stateListAnimator.OLrzqt(c39696pxH.EZpvd(), "0"), stateListAnimator.OLrzqt(c39696pxH.EZpvd(), "1")};
        }

        @Override // o.AbstractC33011moR
        public androidx.fragment.app.Fragment KWHzl(int i) {
            return this.AhwBna[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return C33070mpX.AYXKKw(i == 0 ? C35964oKf.Fragment.OtZEmZ : C35964oKf.Fragment.zAGdSp);
        }
    }
}
