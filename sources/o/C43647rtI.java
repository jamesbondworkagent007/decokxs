package o;

import androidx.fragment.app.FragmentStatePagerAdapter;
import com.okinc.core.widget.OKSlidingTabLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43647rtI extends C57658yma {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.view.View EZpvd;
    public java.lang.String OLrzqt;
    public java.lang.Integer copydefault;
    public InterfaceC43645rtG djBIcL;
    public C33542myS gEmmrt;
    public OKSlidingTabLayout valueOf;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.rtK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43647rtI.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rtH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43647rtI.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC43645rtG interfaceC43645rtG) {
        Intrinsics.checkNotNullParameter(interfaceC43645rtG, "");
        this.djBIcL = interfaceC43645rtG;
    }

    public static final ActionBar copydefault(C43647rtI c43647rtI) {
        android.content.Context contextRequireContext = c43647rtI.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c43647rtI.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new ActionBar(contextRequireContext, childFragmentManager, c43647rtI.copydefault, c43647rtI.OLrzqt, c43647rtI.djBIcL);
    }

    public final ActionBar EZpvd() {
        return (ActionBar) this.AhwBna.getValue();
    }

    public static final java.util.List copydefault() {
        return new java.util.ArrayList();
    }

    public final java.util.List<java.lang.Integer> KWHzl() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.rtI$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rtI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C43647rtI EZpvd(java.lang.Integer num, java.lang.String str) {
            C43647rtI c43647rtI = new C43647rtI();
            android.os.Bundle bundle = new android.os.Bundle();
            if (num != null) {
                bundle.putInt("currentType", num.intValue());
            }
            if (str != null) {
                bundle.putString("currentPath", str);
            }
            c43647rtI.setArguments(bundle);
            return c43647rtI;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.copydefault = java.lang.Integer.valueOf(arguments.getInt("currentType", -1));
            this.OLrzqt = arguments.getString("currentPath", null);
        }
        android.view.View viewInflate = layoutInflater.inflate(C43471rps.TaskDescription.EZpvd, viewGroup, false);
        this.EZpvd = viewInflate;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.view.View view2 = this.EZpvd;
        Intrinsics.copydefault(view2);
        AEQbTJ(view2);
    }

    private final void AEQbTJ(android.view.View view) {
        int iIntValue;
        this.gEmmrt = (C33542myS) view.findViewById(C43471rps.Activity.ejfBZ);
        OKSlidingTabLayout oKSlidingTabLayout = (OKSlidingTabLayout) view.findViewById(C43471rps.Activity.values);
        this.valueOf = oKSlidingTabLayout;
        if (oKSlidingTabLayout == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout = null;
        }
        oKSlidingTabLayout.setBackgroundResource(C43471rps.Application.copydefault);
        OKSlidingTabLayout oKSlidingTabLayout2 = this.valueOf;
        if (oKSlidingTabLayout2 == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout2 = null;
        }
        oKSlidingTabLayout2.OLrzqt(new Activity());
        AEQbTJ();
        java.lang.Integer num = this.copydefault;
        if (num == null || (num != null && num.intValue() == -1)) {
            iIntValue = 0;
        } else {
            java.lang.Integer num2 = this.copydefault;
            Intrinsics.copydefault(num2);
            iIntValue = num2.intValue();
        }
        OKSlidingTabLayout oKSlidingTabLayout3 = this.valueOf;
        if (oKSlidingTabLayout3 == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout3 = null;
        }
        oKSlidingTabLayout3.setCurrentTab(iIntValue);
        for (int i = 0; i < 3; i++) {
            if (i == iIntValue) {
                OKSlidingTabLayout oKSlidingTabLayout4 = this.valueOf;
                if (oKSlidingTabLayout4 == null) {
                    Intrinsics.gEmmrt("");
                    oKSlidingTabLayout4 = null;
                }
                oKSlidingTabLayout4.OLrzqt(i).setBackgroundResource(C43471rps.Application.KWHzl);
            } else {
                OKSlidingTabLayout oKSlidingTabLayout5 = this.valueOf;
                if (oKSlidingTabLayout5 == null) {
                    Intrinsics.gEmmrt("");
                    oKSlidingTabLayout5 = null;
                }
                oKSlidingTabLayout5.OLrzqt(i).setBackgroundResource(0);
            }
        }
    }

    /* JADX INFO: renamed from: o.rtI$Activity */
    public static final class Activity implements OKSlidingTabLayout.TaskDescription {
        public Activity() {
        }

        @Override // com.okinc.core.widget.OKSlidingTabLayout.TaskDescription
        public void KWHzl(int i) {
            for (int i2 = 0; i2 < 3; i2++) {
                OKSlidingTabLayout oKSlidingTabLayout = null;
                if (i2 == i) {
                    OKSlidingTabLayout oKSlidingTabLayout2 = C43647rtI.this.valueOf;
                    if (oKSlidingTabLayout2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        oKSlidingTabLayout = oKSlidingTabLayout2;
                    }
                    oKSlidingTabLayout.OLrzqt(i2).setBackgroundResource(C43471rps.Application.KWHzl);
                } else {
                    OKSlidingTabLayout oKSlidingTabLayout3 = C43647rtI.this.valueOf;
                    if (oKSlidingTabLayout3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        oKSlidingTabLayout = oKSlidingTabLayout3;
                    }
                    oKSlidingTabLayout.OLrzqt(i2).setBackgroundResource(0);
                }
            }
        }
    }

    private final void AEQbTJ() {
        C33542myS c33542myS = this.gEmmrt;
        C33542myS c33542myS2 = null;
        if (c33542myS == null) {
            Intrinsics.gEmmrt("");
            c33542myS = null;
        }
        c33542myS.setOffscreenPageLimit(2);
        C33542myS c33542myS3 = this.gEmmrt;
        if (c33542myS3 == null) {
            Intrinsics.gEmmrt("");
            c33542myS3 = null;
        }
        c33542myS3.setAdapter(EZpvd());
        KWHzl().add(0);
        KWHzl().add(1);
        KWHzl().add(2);
        EZpvd().AEQbTJ(KWHzl());
        OKSlidingTabLayout oKSlidingTabLayout = this.valueOf;
        if (oKSlidingTabLayout == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout = null;
        }
        C33542myS c33542myS4 = this.gEmmrt;
        if (c33542myS4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33542myS2 = c33542myS4;
        }
        oKSlidingTabLayout.setViewPager(c33542myS2);
    }

    /* JADX INFO: renamed from: o.rtI$ActionBar */
    public static final class ActionBar extends FragmentStatePagerAdapter {
        public InterfaceC43645rtG AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public int KWHzl;
        public java.util.List<java.lang.Integer> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return -2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, java.lang.String str, InterfaceC43645rtG interfaceC43645rtG) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.OLrzqt = new java.util.ArrayList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.EZpvd = arrayList;
            this.KWHzl = -1;
            java.lang.String string = context.getString(C43471rps.ActionBar.fvQaOB);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(string);
            java.lang.String string2 = context.getString(C43471rps.ActionBar.gGvvIC);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(string2);
            java.lang.String string3 = context.getString(C43471rps.ActionBar.finit);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList.add(string3);
            if (num != null) {
                this.KWHzl = num.intValue();
            }
            this.copydefault = str;
            this.AEQbTJ = interfaceC43645rtG;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            if (i == 2) {
                return C43679rto.Companion.EZpvd(i == this.KWHzl ? this.copydefault : null, this.AEQbTJ);
            }
            return C43690rtz.Companion.KWHzl(i + 1, i == this.KWHzl ? this.copydefault : null, this.AEQbTJ);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return this.EZpvd.get(i);
        }

        public final void AEQbTJ(@NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt.clear();
            this.OLrzqt.addAll(list);
            notifyDataSetChanged();
        }
    }
}
