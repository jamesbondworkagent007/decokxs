package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle;
import com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressBottomSheet$loadAndShowData$1;
import com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C32113mPz;
import o.C42414rRz;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42414rRz extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public ChinaAddressBean AYXKKw;
    public ChinaAddressBean AhwBna;
    public Function1<? super AddressCascaderFildValue, Unit> EZpvd;
    public AbstractC43837rwn KWHzl;
    public ChinaAddressBean gEmmrt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rRy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42414rRz.gEmmrt(this.AEQbTJ);
        }
    });
    public ChinaAddressType djBIcL = ChinaAddressType.province;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX INFO: renamed from: o.rRz$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChinaAddressType.values().length];
            try {
                iArr[ChinaAddressType.province.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChinaAddressType.city.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChinaAddressType.district.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super AddressCascaderFildValue, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue, kotlin.Unit> */
    public final Function1<AddressCascaderFildValue, Unit> KWHzl() {
        return this.EZpvd;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    /* JADX INFO: renamed from: o.rRz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rRz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C42414rRz newInstance$default(ActionBar actionBar, AddressCascaderFildValue addressCascaderFildValue, DivisionTitle divisionTitle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressCascaderFildValue = null;
            }
            if ((i & 2) != 0) {
                divisionTitle = null;
            }
            return actionBar.KWHzl(addressCascaderFildValue, divisionTitle);
        }

        public final C42414rRz KWHzl(AddressCascaderFildValue addressCascaderFildValue, DivisionTitle divisionTitle) {
            C42414rRz c42414rRz = new C42414rRz();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("AddressCascaderFildValue", addressCascaderFildValue);
            bundle.putParcelable("DivisionTitle", divisionTitle);
            c42414rRz.setArguments(bundle);
            return c42414rRz;
        }
    }

    public final DivisionTitle copydefault() {
        return (DivisionTitle) this.AEQbTJ.getValue();
    }

    public static final DivisionTitle gEmmrt(C42414rRz c42414rRz) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = c42414rRz.getArguments();
            if (arguments != null) {
                return (DivisionTitle) arguments.getParcelable("DivisionTitle", DivisionTitle.class);
            }
        } else {
            android.os.Bundle arguments2 = c42414rRz.getArguments();
            if (arguments2 != null) {
                return (DivisionTitle) arguments2.getParcelable("DivisionTitle");
            }
        }
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        AddressCascaderFildValue addressCascaderFildValue;
        AddressCascaderValue district;
        AddressCascaderValue city;
        AddressCascaderValue province;
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.EZpvd);
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = getArguments();
            addressCascaderFildValue = arguments != null ? (AddressCascaderFildValue) arguments.getParcelable("AddressCascaderFildValue", AddressCascaderFildValue.class) : null;
        } else {
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                addressCascaderFildValue = (AddressCascaderFildValue) arguments2.getParcelable("AddressCascaderFildValue");
            }
        }
        if (addressCascaderFildValue != null && (province = addressCascaderFildValue.getProvince()) != null) {
            this.AYXKKw = new ChinaAddressBean((java.lang.String) null, (java.lang.String) null, province.getCode(), (java.lang.String) null, province.getName(), (java.lang.String) null, 43, (DefaultConstructorMarker) null);
        }
        if (addressCascaderFildValue != null && (city = addressCascaderFildValue.getCity()) != null) {
            this.AhwBna = new ChinaAddressBean((java.lang.String) null, (java.lang.String) null, city.getCode(), (java.lang.String) null, city.getName(), (java.lang.String) null, 43, (DefaultConstructorMarker) null);
        }
        if (addressCascaderFildValue == null || (district = addressCascaderFildValue.getDistrict()) == null) {
            return;
        }
        this.gEmmrt = new ChinaAddressBean((java.lang.String) null, (java.lang.String) null, district.getCode(), (java.lang.String) null, district.getName(), (java.lang.String) null, 43, (DefaultConstructorMarker) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.rRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C42414rRz.KWHzl(this.AEQbTJ, view);
            }
        });
    }

    public static final void KWHzl(C42414rRz c42414rRz, android.view.View view) {
        c42414rRz.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String province;
        java.lang.String city;
        java.lang.String district;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC43837rwn abstractC43837rwn = (AbstractC43837rwn) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.iwGUEr, constraintLayout, true);
        this.KWHzl = abstractC43837rwn;
        AbstractC43837rwn abstractC43837rwn2 = null;
        if (abstractC43837rwn == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn = null;
        }
        abstractC43837rwn.EZpvd.setOKDSType(257);
        AbstractC43837rwn abstractC43837rwn3 = this.KWHzl;
        if (abstractC43837rwn3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn3 = null;
        }
        C52794wYp c52794wYp = abstractC43837rwn3.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        AbstractC43837rwn abstractC43837rwn4 = this.KWHzl;
        if (abstractC43837rwn4 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn4 = null;
        }
        C55254xgV c55254xgV = abstractC43837rwn4.KWHzl;
        TabLayout.Tab tabGEmmrt = c55254xgV.gEmmrt();
        ChinaAddressBean chinaAddressBean = this.AYXKKw;
        if (chinaAddressBean == null || (province = chinaAddressBean.getName()) == null) {
            DivisionTitle divisionTitleCopydefault = copydefault();
            province = divisionTitleCopydefault != null ? divisionTitleCopydefault.getProvince() : null;
            if (province == null) {
                province = "";
            }
        }
        TabLayout.Tab text = tabGEmmrt.setText(province);
        Intrinsics.checkNotNullExpressionValue(text, "");
        c55254xgV.EZpvd(text);
        TabLayout.Tab tabGEmmrt2 = c55254xgV.gEmmrt();
        ChinaAddressBean chinaAddressBean2 = this.AhwBna;
        if (chinaAddressBean2 == null || (city = chinaAddressBean2.getName()) == null) {
            DivisionTitle divisionTitleCopydefault2 = copydefault();
            city = divisionTitleCopydefault2 != null ? divisionTitleCopydefault2.getCity() : null;
            if (city == null) {
                city = "";
            }
        }
        TabLayout.Tab text2 = tabGEmmrt2.setText(city);
        Intrinsics.checkNotNullExpressionValue(text2, "");
        c55254xgV.EZpvd(text2);
        TabLayout.Tab tabGEmmrt3 = c55254xgV.gEmmrt();
        ChinaAddressBean chinaAddressBean3 = this.gEmmrt;
        if (chinaAddressBean3 == null || (district = chinaAddressBean3.getName()) == null) {
            DivisionTitle divisionTitleCopydefault3 = copydefault();
            district = divisionTitleCopydefault3 != null ? divisionTitleCopydefault3.getDistrict() : null;
            if (district == null) {
                district = "";
            }
        }
        TabLayout.Tab text3 = tabGEmmrt3.setText(district);
        Intrinsics.checkNotNullExpressionValue(text3, "");
        c55254xgV.EZpvd(text3);
        c55254xgV.AEQbTJ(new TaskDescription());
        this.copydefault.register(ChinaAddressBean.class, new StateListAnimator(this, new Function1() { // from class: o.rRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42414rRz.copydefault(this.OLrzqt, (ChinaAddressBean) obj);
            }
        }));
        AbstractC43837rwn abstractC43837rwn5 = this.KWHzl;
        if (abstractC43837rwn5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43837rwn2 = abstractC43837rwn5;
        }
        RecyclerView recyclerView = abstractC43837rwn2.AEQbTJ;
        recyclerView.setLayoutManager(C33047mpA.KWHzl(recyclerView.getContext()));
        recyclerView.setAdapter(this.copydefault);
        EZpvd();
        KWHzl("province", "1");
    }

    /* JADX INFO: renamed from: o.rRz$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                C42414rRz.this.djBIcL = ChinaAddressType.province;
                C42414rRz.this.KWHzl("province", "1");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                C42414rRz.this.djBIcL = ChinaAddressType.city;
                C42414rRz c42414rRz = C42414rRz.this;
                ChinaAddressBean chinaAddressBean = c42414rRz.AYXKKw;
                c42414rRz.KWHzl("city", chinaAddressBean != null ? chinaAddressBean.getId() : null);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                C42414rRz.this.djBIcL = ChinaAddressType.district;
                C42414rRz c42414rRz2 = C42414rRz.this;
                ChinaAddressBean chinaAddressBean2 = c42414rRz2.AhwBna;
                c42414rRz2.KWHzl("district", chinaAddressBean2 != null ? chinaAddressBean2.getId() : null);
            }
        }
    }

    public static final Unit copydefault(C42414rRz c42414rRz, ChinaAddressBean chinaAddressBean) {
        java.lang.String name;
        java.lang.String city;
        java.lang.String province;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(chinaAddressBean, "");
        int i = Activity.OLrzqt[c42414rRz.djBIcL.ordinal()];
        if (i == 1) {
            java.lang.String id = chinaAddressBean.getId();
            ChinaAddressBean chinaAddressBean2 = c42414rRz.AYXKKw;
            if (!Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (chinaAddressBean2 != null ? chinaAddressBean2.getId() : null))) {
                c42414rRz.AYXKKw = chinaAddressBean;
                c42414rRz.AhwBna = null;
                c42414rRz.gEmmrt = null;
            }
            AbstractC43837rwn abstractC43837rwn = c42414rRz.KWHzl;
            if (abstractC43837rwn == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn = null;
            }
            TabLayout.Tab tabCopydefault = abstractC43837rwn.KWHzl.copydefault(1);
            if (tabCopydefault != null) {
                tabCopydefault.select();
            }
        } else if (i == 2) {
            java.lang.String id2 = chinaAddressBean.getId();
            ChinaAddressBean chinaAddressBean3 = c42414rRz.AYXKKw;
            if (!Intrinsics.EZpvd((java.lang.Object) id2, (java.lang.Object) (chinaAddressBean3 != null ? chinaAddressBean3.getId() : null))) {
                c42414rRz.AhwBna = chinaAddressBean;
                c42414rRz.gEmmrt = null;
            }
            AbstractC43837rwn abstractC43837rwn2 = c42414rRz.KWHzl;
            if (abstractC43837rwn2 == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn2 = null;
            }
            TabLayout.Tab tabCopydefault2 = abstractC43837rwn2.KWHzl.copydefault(2);
            if (tabCopydefault2 != null) {
                tabCopydefault2.select();
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c42414rRz.gEmmrt = chinaAddressBean;
            c42414rRz.copydefault.notifyDataSetChanged();
        }
        AbstractC43837rwn abstractC43837rwn3 = c42414rRz.KWHzl;
        if (abstractC43837rwn3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn3 = null;
        }
        TabLayout.Tab tabCopydefault3 = abstractC43837rwn3.KWHzl.copydefault(0);
        if (tabCopydefault3 != null) {
            ChinaAddressBean chinaAddressBean4 = c42414rRz.AYXKKw;
            if (chinaAddressBean4 == null || (province = chinaAddressBean4.getName()) == null) {
                DivisionTitle divisionTitleCopydefault = c42414rRz.copydefault();
                province = divisionTitleCopydefault != null ? divisionTitleCopydefault.getProvince() : null;
                if (province == null) {
                    province = "";
                }
            }
            tabCopydefault3.setText(province);
        }
        AbstractC43837rwn abstractC43837rwn4 = c42414rRz.KWHzl;
        if (abstractC43837rwn4 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn4 = null;
        }
        TabLayout.Tab tabCopydefault4 = abstractC43837rwn4.KWHzl.copydefault(1);
        if (tabCopydefault4 != null) {
            ChinaAddressBean chinaAddressBean5 = c42414rRz.AhwBna;
            if (chinaAddressBean5 == null || (city = chinaAddressBean5.getName()) == null) {
                DivisionTitle divisionTitleCopydefault2 = c42414rRz.copydefault();
                city = divisionTitleCopydefault2 != null ? divisionTitleCopydefault2.getCity() : null;
                if (city == null) {
                    city = "";
                }
            }
            tabCopydefault4.setText(city);
        }
        AbstractC43837rwn abstractC43837rwn5 = c42414rRz.KWHzl;
        if (abstractC43837rwn5 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn5 = null;
        }
        TabLayout.Tab tabCopydefault5 = abstractC43837rwn5.KWHzl.copydefault(2);
        if (tabCopydefault5 != null) {
            ChinaAddressBean chinaAddressBean6 = c42414rRz.gEmmrt;
            if (chinaAddressBean6 == null || (name = chinaAddressBean6.getName()) == null) {
                DivisionTitle divisionTitleCopydefault3 = c42414rRz.copydefault();
                java.lang.String district = divisionTitleCopydefault3 != null ? divisionTitleCopydefault3.getDistrict() : null;
                if (district != null) {
                    str = district;
                }
            } else {
                str = name;
            }
            tabCopydefault5.setText(str);
        }
        c42414rRz.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rRz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42414rRz AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42414rRz c42414rRz) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c42414rRz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.AEQbTJ.AYXKKw == null || this.AEQbTJ.AhwBna == null || this.AEQbTJ.gEmmrt == null) {
                    return;
                }
                ChinaAddressBean chinaAddressBean = this.AEQbTJ.AYXKKw;
                java.lang.String id = chinaAddressBean != null ? chinaAddressBean.getId() : null;
                ChinaAddressBean chinaAddressBean2 = this.AEQbTJ.AYXKKw;
                AddressCascaderValue addressCascaderValue = new AddressCascaderValue(id, chinaAddressBean2 != null ? chinaAddressBean2.getName() : null);
                ChinaAddressBean chinaAddressBean3 = this.AEQbTJ.AhwBna;
                java.lang.String id2 = chinaAddressBean3 != null ? chinaAddressBean3.getId() : null;
                ChinaAddressBean chinaAddressBean4 = this.AEQbTJ.AhwBna;
                AddressCascaderValue addressCascaderValue2 = new AddressCascaderValue(id2, chinaAddressBean4 != null ? chinaAddressBean4.getName() : null);
                ChinaAddressBean chinaAddressBean5 = this.AEQbTJ.gEmmrt;
                java.lang.String id3 = chinaAddressBean5 != null ? chinaAddressBean5.getId() : null;
                ChinaAddressBean chinaAddressBean6 = this.AEQbTJ.gEmmrt;
                AddressCascaderFildValue addressCascaderFildValue = new AddressCascaderFildValue(addressCascaderValue, addressCascaderValue2, new AddressCascaderValue(id3, chinaAddressBean6 != null ? chinaAddressBean6.getName() : null));
                Function1<AddressCascaderFildValue, Unit> function1KWHzl = this.AEQbTJ.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(addressCascaderFildValue);
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public final void EZpvd() {
        TabLayout.TabView tabView;
        TabLayout.TabView tabView2;
        AbstractC43837rwn abstractC43837rwn = this.KWHzl;
        AbstractC43837rwn abstractC43837rwn2 = null;
        if (abstractC43837rwn == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn = null;
        }
        abstractC43837rwn.EZpvd.setEnabled((this.AYXKKw == null || this.AhwBna == null || this.gEmmrt == null) ? false : true);
        AbstractC43837rwn abstractC43837rwn3 = this.KWHzl;
        if (abstractC43837rwn3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn3 = null;
        }
        TabLayout.Tab tabCopydefault = abstractC43837rwn3.KWHzl.copydefault(1);
        if (tabCopydefault != null && (tabView2 = tabCopydefault.view) != null) {
            tabView2.setEnabled(this.AYXKKw != null);
        }
        AbstractC43837rwn abstractC43837rwn4 = this.KWHzl;
        if (abstractC43837rwn4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43837rwn2 = abstractC43837rwn4;
        }
        TabLayout.Tab tabCopydefault2 = abstractC43837rwn2.KWHzl.copydefault(2);
        if (tabCopydefault2 == null || (tabView = tabCopydefault2.view) == null) {
            return;
        }
        tabView.setEnabled(this.AhwBna != null);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        AbstractC43837rwn abstractC43837rwn = this.KWHzl;
        if (abstractC43837rwn == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn = null;
        }
        C55113xdn.showLoading$default(abstractC43837rwn.copydefault, 0L, 1, null);
        this.copydefault.setItems(new java.util.ArrayList());
        this.copydefault.notifyDataSetChanged();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new ChinaAddressBottomSheet$loadAndShowData$1(str, str2, this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.rRz$StateListAnimator */
    public final class StateListAnimator extends AbstractC43310rmq<ChinaAddressBean, AbstractC43881rxe> {
        public final Function1<ChinaAddressBean, Unit> EZpvd;
        public final /* synthetic */ C42414rRz copydefault;

        /* JADX INFO: renamed from: o.rRz$StateListAnimator$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ChinaAddressType.values().length];
                try {
                    iArr[ChinaAddressType.province.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ChinaAddressType.city.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChinaAddressType.district.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.aKErDB;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C42414rRz c42414rRz, Function1<? super ChinaAddressBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = c42414rRz;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43881rxe> c43312rms, @NotNull final ChinaAddressBean chinaAddressBean) {
            ChinaAddressBean chinaAddressBean2;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(chinaAddressBean, "");
            super.onBindViewHolder((C43312rms) c43312rms, chinaAddressBean);
            ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setText(chinaAddressBean.getName());
            int i = Application.EZpvd[this.copydefault.djBIcL.ordinal()];
            if (i == 1) {
                chinaAddressBean2 = this.copydefault.AYXKKw;
            } else if (i == 2) {
                chinaAddressBean2 = this.copydefault.AhwBna;
            } else if (i == 3) {
                chinaAddressBean2 = this.copydefault.gEmmrt;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.EZpvd((java.lang.Object) chinaAddressBean.getId(), (java.lang.Object) (chinaAddressBean2 != null ? chinaAddressBean2.getId() : null))) {
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextSize(16.0f);
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextColor(ContextCompat.getColor(c43312rms.itemView.getContext(), C52761wXj.Activity.fdOvFl));
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextAppearance(this.copydefault.getContext(), C52761wXj.LoaderManager.AwvSrB);
                ((AbstractC43881rxe) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
            } else {
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextSize(14.0f);
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextColor(ContextCompat.getColor(c43312rms.itemView.getContext(), C52761wXj.Activity.DCUTEIddSDPG));
                ((AbstractC43881rxe) c43312rms.OLrzqt()).EZpvd.setTextAppearance(c43312rms.itemView.getContext(), C52761wXj.LoaderManager.zuBGHE);
                ((AbstractC43881rxe) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
            }
            ((AbstractC43881rxe) c43312rms.OLrzqt()).copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rRB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42414rRz.StateListAnimator.KWHzl(this.OLrzqt, chinaAddressBean, view);
                }
            });
        }

        public static final void KWHzl(StateListAnimator stateListAnimator, ChinaAddressBean chinaAddressBean, android.view.View view) {
            stateListAnimator.EZpvd.invoke(chinaAddressBean);
        }
    }
}
