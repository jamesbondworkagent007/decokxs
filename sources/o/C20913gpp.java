package o;

import android.os.Build;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20913gpp extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C20835goQ OLrzqt;
    public AbstractC16593emp copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gpo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20913gpp.OLrzqt(this.AEQbTJ);
        }
    });
    public boolean AEQbTJ = true;

    /* JADX INFO: renamed from: o.gpp$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DKtBnz;
    }

    public final C20959gqi EZpvd() {
        return (C20959gqi) this.KWHzl.getValue();
    }

    public static final C20959gqi OLrzqt(C20913gpp c20913gpp) {
        return (C20959gqi) new ViewModelProvider(c20913gpp).get(C20959gqi.class);
    }

    /* JADX INFO: renamed from: o.gpp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gpp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.os.Bundle KWHzl(int i, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.ArrayList<java.lang.String> arrayList, int i2, ExchangeAddressData exchangeAddressData) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("multi_transfer_mode", i);
            bundle.putString("coinId", str);
            bundle.putString("chain_id", str3);
            bundle.putString("wallet_id", str2);
            bundle.putStringArrayList("address_list", arrayList);
            bundle.putInt("list_size", i2);
            bundle.putParcelable("exchange_address_data", exchangeAddressData);
            return bundle;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.copydefault = (AbstractC16593emp) viewDataBindingBind;
        FragmentActivity activity = getActivity();
        ActivityC20904gpg activityC20904gpg = activity instanceof ActivityC20904gpg ? (ActivityC20904gpg) activity : null;
        if (activityC20904gpg == null) {
            return;
        }
        AEQbTJ();
        AEQbTJ(activityC20904gpg);
        java.lang.Integer numValueOf = EZpvd().valueOf();
        activityC20904gpg.OLrzqt(numValueOf != null ? numValueOf.intValue() : MultiTransferMode.MODE_NONE.getValue());
        copydefault(activityC20904gpg);
    }

    public final void copydefault(final ActivityC20904gpg activityC20904gpg) {
        activityC20904gpg.copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.gpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20913gpp.OLrzqt(this.KWHzl, view);
            }
        });
        activityC20904gpg.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.gpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20913gpp.AEQbTJ(activityC20904gpg, this, view);
            }
        });
    }

    public static final void OLrzqt(C20913gpp c20913gpp, android.view.View view) {
        c20913gpp.EZpvd().EZpvd(c20913gpp.EZpvd().OLrzqt());
    }

    public static final void AEQbTJ(ActivityC20904gpg activityC20904gpg, C20913gpp c20913gpp, android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putParcelableArrayListExtra("result", c20913gpp.EZpvd().EZpvd());
        intent.putExtra("data", c20913gpp.EZpvd().AEQbTJ());
        activityC20904gpg.setResult(PointerIconCompat.TYPE_ALIAS, intent);
        activityC20904gpg.finish();
    }

    public final void AEQbTJ(final ActivityC20904gpg activityC20904gpg) {
        EZpvd().copydefault().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20913gpp.OLrzqt(this.KWHzl, activityC20904gpg, (java.util.ArrayList) obj);
            }
        }));
        EZpvd().AhwBna().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20913gpp.AEQbTJ(this.copydefault, (java.util.Map) obj);
            }
        }));
    }

    public static final Unit OLrzqt(final C20913gpp c20913gpp, ActivityC20904gpg activityC20904gpg, java.util.ArrayList arrayList) {
        c20913gpp.dismissLoading();
        if (arrayList == null) {
            return Unit.INSTANCE;
        }
        if ((!arrayList.isEmpty()) && c20913gpp.AEQbTJ) {
            c20913gpp.copydefault(c20913gpp.EZpvd().AEQbTJ(arrayList));
            c20913gpp.AEQbTJ = false;
            android.view.View view = c20913gpp.getView();
            if (view != null) {
                view.post(new java.lang.Runnable() { // from class: o.gpu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20913gpp.AEQbTJ(this.KWHzl);
                    }
                });
            }
        }
        activityC20904gpg.AEQbTJ().setEnabled(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c20913gpp.EZpvd().EZpvd().size()), 0));
        if (c20913gpp.EZpvd().AkhnZx()) {
            activityC20904gpg.AEQbTJ().setText(C33069mpW.copydefault(c20913gpp, C13754dXa.FragmentManager.ActivityResultCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(c20913gpp.EZpvd().EZpvd().size())))));
        }
        android.widget.LinearLayout linearLayoutCopydefault = activityC20904gpg.copydefault();
        java.lang.Boolean bool = c20913gpp.EZpvd().djBIcL().get(c20913gpp.EZpvd().OLrzqt());
        linearLayoutCopydefault.setSelected(bool != null ? bool.booleanValue() : false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C20913gpp c20913gpp) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20913gpp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C20913gpp c20913gpp, java.util.Map map) {
        if (map == null) {
            return Unit.INSTANCE;
        }
        java.lang.Object obj = map.get(0);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(obj, bool)) {
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.getCallerContract, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(100)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(map.get(1), bool)) {
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultCallerLauncherresultContract2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(c20913gpp.EZpvd().gEmmrt().size()))))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.util.List<C20832goN> list) {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.OLrzqt = new C20835goQ(childFragmentManager, lifecycle, list);
        AbstractC16593emp abstractC16593emp = this.copydefault;
        AbstractC16593emp abstractC16593emp2 = null;
        if (abstractC16593emp == null) {
            Intrinsics.gEmmrt("");
            abstractC16593emp = null;
        }
        abstractC16593emp.AEQbTJ.setAdapter(this.OLrzqt);
        AbstractC16593emp abstractC16593emp3 = this.copydefault;
        if (abstractC16593emp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16593emp3 = null;
        }
        TabLayout tabLayout = abstractC16593emp3.OLrzqt;
        AbstractC16593emp abstractC16593emp4 = this.copydefault;
        if (abstractC16593emp4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16593emp4 = null;
        }
        new TabLayoutMediator(tabLayout, abstractC16593emp4.AEQbTJ, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C20913gpp.copydefault(list, tab, i);
            }
        }).attach();
        AbstractC16593emp abstractC16593emp5 = this.copydefault;
        if (abstractC16593emp5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16593emp2 = abstractC16593emp5;
        }
        abstractC16593emp2.OLrzqt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
    }

    public static final void copydefault(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(((C20832goN) list.get(i)).KWHzl());
        tab.setTag(((C20832goN) list.get(i)).EZpvd());
    }

    /* JADX INFO: renamed from: o.gpp$TaskDescription */
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
            android.widget.LinearLayout linearLayoutCopydefault;
            if (tab != null) {
                C20913gpp c20913gpp = C20913gpp.this;
                java.lang.Object tag = tab.getTag();
                java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (str != null && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    C20959gqi c20959gqiEZpvd = c20913gpp.EZpvd();
                    java.lang.Object tag2 = tab.getTag();
                    c20959gqiEZpvd.OLrzqt(java.lang.String.valueOf(tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null));
                    c20913gpp.EZpvd().EZpvd(tab.getPosition());
                }
                if (c20913gpp.EZpvd().AkhnZx()) {
                    FragmentActivity activity = c20913gpp.getActivity();
                    ActivityC20904gpg activityC20904gpg = activity instanceof ActivityC20904gpg ? (ActivityC20904gpg) activity : null;
                    if (activityC20904gpg == null || (linearLayoutCopydefault = activityC20904gpg.copydefault()) == null) {
                        return;
                    }
                    java.lang.Boolean bool = c20913gpp.EZpvd().djBIcL().get(tab.getTag());
                    linearLayoutCopydefault.setSelected(bool != null ? bool.booleanValue() : false);
                }
            }
        }
    }

    public final void AEQbTJ() {
        ExchangeAddressData exchangeAddressData;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            showLoadingAtOnceCannotCancel();
            if (Build.VERSION.SDK_INT >= 33) {
                exchangeAddressData = (ExchangeAddressData) arguments.getParcelable("exchange_address_data", ExchangeAddressData.class);
            } else {
                exchangeAddressData = (ExchangeAddressData) arguments.getParcelable("exchange_address_data");
            }
            ExchangeAddressData exchangeAddressData2 = exchangeAddressData;
            C20959gqi c20959gqiEZpvd = EZpvd();
            java.lang.String string = arguments.getString("wallet_id");
            java.lang.String str = string == null ? "" : string;
            java.lang.String string2 = arguments.getString("from_address");
            java.lang.String str2 = string2 == null ? "" : string2;
            java.lang.String string3 = arguments.getString("coinId");
            java.lang.String str3 = string3 == null ? "" : string3;
            int i = arguments.getInt("multi_transfer_mode");
            boolean zKWHzl = KWHzl();
            java.util.ArrayList<java.lang.String> stringArrayList = arguments.getStringArrayList("address_list");
            if (stringArrayList == null) {
                stringArrayList = new java.util.ArrayList<>();
            }
            c20959gqiEZpvd.copydefault(this, str, str2, str3, java.lang.Integer.valueOf(i), zKWHzl, stringArrayList, arguments.getInt("list_size"), exchangeAddressData2);
        }
    }

    public final boolean KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("coinId")) != null) {
            if (C33129mqd.valueOf(string) < 0) {
                return true;
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(string)));
            if (c10854bwMKWHzl != null) {
                return c10854bwMKWHzl.uzCIH();
            }
        }
        return false;
    }
}
