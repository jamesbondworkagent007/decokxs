package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.core.util.SPUtils;
import com.okinc.mln.miniapp.AppDiffSP;
import com.okinc.mln.miniapp.AppJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43084ric;
import o.C43114rjF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.riU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC43076riU extends AbstractActivityC33041mov implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public AbstractC43098riq KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.riS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ViewOnClickListenerC43076riU.EZpvd();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.riV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ViewOnClickListenerC43076riU.AYXKKw(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.riU$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    public ViewOnClickListenerC43076riU() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C43114rjF.class), new Function0<ViewModelStore>() { // from class: com.okinc.mln_ui.ui.MLNDebugActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.mln_ui.ui.MLNDebugActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.mln_ui.ui.MLNDebugActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final C43114rjF AEQbTJ() {
        return (C43114rjF) this.copydefault.getValue();
    }

    public static final C43043rho EZpvd() {
        return C43047rhs.AEQbTJ.OLrzqt();
    }

    private final C43043rho KWHzl() {
        return (C43043rho) this.EZpvd.getValue();
    }

    public final ViewOnClickListenerC43147rjm OLrzqt() {
        return (ViewOnClickListenerC43147rjm) this.AEQbTJ.getValue();
    }

    public static final ViewOnClickListenerC43147rjm AYXKKw(ViewOnClickListenerC43076riU viewOnClickListenerC43076riU) {
        return new ViewOnClickListenerC43147rjm(viewOnClickListenerC43076riU);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPaddingRelative(0, C7857arj.valueOf(this), 0, 0);
        AbstractC43098riq abstractC43098riq = (AbstractC43098riq) DataBindingUtil.setContentView(this, C43084ric.Application.copydefault);
        this.KWHzl = abstractC43098riq;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        abstractC43098riq.setLifecycleOwner(this);
        valueOf();
    }

    public final void AEQbTJ(C43114rjF.Activity activity) {
        AbstractC43098riq abstractC43098riq = this.KWHzl;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        abstractC43098riq.KWHzl.setText(activity.OLrzqt() + " - " + activity.AhwBna());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.copydefault())) {
            abstractC43098riq.gEmmrt.setVisibility(0);
            abstractC43098riq.gEmmrt.setText("MD5: " + activity.copydefault());
        } else {
            abstractC43098riq.gEmmrt.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.valueOf())) {
            abstractC43098riq.AYXKKw.setVisibility(0);
            abstractC43098riq.AYXKKw.setOKDSStyle(13);
            abstractC43098riq.AYXKKw.setText(activity.valueOf());
            return;
        }
        abstractC43098riq.AYXKKw.setVisibility(8);
    }

    private final void valueOf() {
        java.lang.String str;
        java.lang.String str2;
        AbstractC43098riq abstractC43098riq = this.KWHzl;
        AbstractC43098riq abstractC43098riq2 = null;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        abstractC43098riq.EZpvd.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq3 = this.KWHzl;
        if (abstractC43098riq3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq3 = null;
        }
        abstractC43098riq3.copydefault.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq4 = this.KWHzl;
        if (abstractC43098riq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq4 = null;
        }
        abstractC43098riq4.fARcdN.setChecked(AEQbTJ().fJNWhG());
        AbstractC43098riq abstractC43098riq5 = this.KWHzl;
        if (abstractC43098riq5 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq5 = null;
        }
        abstractC43098riq5.fARcdN.setOnCheckedChangeListener(this);
        java.lang.String stringExtra = getIntent().getStringExtra("appId");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("packagePath");
        AbstractC43098riq abstractC43098riq6 = this.KWHzl;
        if (abstractC43098riq6 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq6 = null;
        }
        abstractC43098riq6.AYXKKw.setOKDSStyle(13);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) stringExtra)) {
            Intrinsics.copydefault((java.lang.Object) stringExtra);
            C43047rhs c43047rhs = C43047rhs.AEQbTJ;
            AppJson appJsonKWHzl = c43047rhs.KWHzl(stringExtra);
            java.lang.String version = appJsonKWHzl != null ? appJsonKWHzl.getVersion() : null;
            java.lang.String strCopydefault = c43047rhs.valueOf(stringExtra).copydefault();
            if (KWHzl().EZpvd(stringExtra)) {
                str2 = "HotReload";
            } else if (KWHzl().OLrzqt(stringExtra)) {
                str2 = "TestPacket";
            } else {
                str = "";
                AEQbTJ(new C43114rjF.Activity(stringExtra, version, strCopydefault, str, null, null, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
            }
            str = str2;
            AEQbTJ(new C43114rjF.Activity(stringExtra, version, strCopydefault, str, null, null, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
        } else {
            AEQbTJ().DbNXlk().observe(this, new StateListAnimator(new Function1() { // from class: o.rjb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC43076riU.OLrzqt(this.KWHzl, (C43114rjF.Activity) obj);
                }
            }));
            abstractC43098riq6.AEQbTJ.setOnClickListener(this);
        }
        abstractC43098riq6.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.riZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return ViewOnClickListenerC43076riU.KWHzl(stringExtra2, view);
            }
        });
        AbstractC43098riq abstractC43098riq7 = this.KWHzl;
        if (abstractC43098riq7 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq7 = null;
        }
        abstractC43098riq7.OLrzqt.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq8 = this.KWHzl;
        if (abstractC43098riq8 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq8 = null;
        }
        abstractC43098riq8.valueOf.setChecked(AEQbTJ().AuCTel());
        AbstractC43098riq abstractC43098riq9 = this.KWHzl;
        if (abstractC43098riq9 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq9 = null;
        }
        abstractC43098riq9.valueOf.setOnCheckedChangeListener(this);
        AbstractC43098riq abstractC43098riq10 = this.KWHzl;
        if (abstractC43098riq10 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq10 = null;
        }
        abstractC43098riq10.AhwBna.setChecked(AEQbTJ().ejfBZ());
        AbstractC43098riq abstractC43098riq11 = this.KWHzl;
        if (abstractC43098riq11 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq11 = null;
        }
        abstractC43098riq11.AhwBna.setOnCheckedChangeListener(this);
        AbstractC43098riq abstractC43098riq12 = this.KWHzl;
        if (abstractC43098riq12 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq12 = null;
        }
        abstractC43098riq12.values.setChecked(AEQbTJ().fIwbmz());
        AbstractC43098riq abstractC43098riq13 = this.KWHzl;
        if (abstractC43098riq13 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq13 = null;
        }
        abstractC43098riq13.values.setOnCheckedChangeListener(this);
        final C59534zip c59534zip = new C59534zip();
        c59534zip.register(C43155rju.class, new ActionBar());
        AbstractC43098riq abstractC43098riq14 = this.KWHzl;
        if (abstractC43098riq14 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq14 = null;
        }
        abstractC43098riq14.AuCTel.setAdapter(c59534zip);
        AbstractC43098riq abstractC43098riq15 = this.KWHzl;
        if (abstractC43098riq15 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq15 = null;
        }
        abstractC43098riq15.fJNWhG.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity());
        AEQbTJ().isConnected().observe(this, new StateListAnimator(new Function1() { // from class: o.riY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC43076riU.AEQbTJ(this.EZpvd, c59534zip, (java.util.Map) obj);
            }
        }));
        AEQbTJ().fetchVPNInfo().observe(this, new StateListAnimator(new Function1() { // from class: o.rja
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC43076riU.OLrzqt(this.OLrzqt, c59534zip, (java.lang.String) obj);
            }
        }));
        AbstractC43098riq abstractC43098riq16 = this.KWHzl;
        if (abstractC43098riq16 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq16 = null;
        }
        abstractC43098riq16.fetchVPNInfo.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq17 = this.KWHzl;
        if (abstractC43098riq17 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq17 = null;
        }
        abstractC43098riq17.fIwbmz.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq18 = this.KWHzl;
        if (abstractC43098riq18 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq18 = null;
        }
        abstractC43098riq18.isConnected.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq19 = this.KWHzl;
        if (abstractC43098riq19 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq19 = null;
        }
        abstractC43098riq19.AkhnZx.setOnClickListener(this);
        AbstractC43098riq abstractC43098riq20 = this.KWHzl;
        if (abstractC43098riq20 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq20 = null;
        }
        abstractC43098riq20.DbNXlk.setChecked(C43192rke.values.AhwBna());
        AbstractC43098riq abstractC43098riq21 = this.KWHzl;
        if (abstractC43098riq21 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq21 = null;
        }
        abstractC43098riq21.DbNXlk.setOnCheckedChangeListener(this);
        AbstractC43098riq abstractC43098riq22 = this.KWHzl;
        if (abstractC43098riq22 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq22 = null;
        }
        abstractC43098riq22.djBIcL.setChecked(KWHzl().EZpvd());
        AbstractC43098riq abstractC43098riq23 = this.KWHzl;
        if (abstractC43098riq23 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43098riq2 = abstractC43098riq23;
        }
        abstractC43098riq2.djBIcL.setOnCheckedChangeListener(this);
    }

    public static final Unit OLrzqt(ViewOnClickListenerC43076riU viewOnClickListenerC43076riU, C43114rjF.Activity activity) {
        Intrinsics.copydefault(activity);
        viewOnClickListenerC43076riU.AEQbTJ(activity);
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(java.lang.String str, android.view.View view) {
        C55328xhq.show$default(C55328xhq.OLrzqt, "PATH: " + str, (android.graphics.drawable.Drawable) null, 1, (java.lang.Integer) null, 0, 0, 58, (java.lang.Object) null);
        return true;
    }

    /* JADX INFO: renamed from: o.riU$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<C43155rju, C43312rms<AbstractC43096rio>> implements View.OnClickListener {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C43312rms<AbstractC43096rio> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC43096rio abstractC43096rioCopydefault = AbstractC43096rio.copydefault(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC43096rioCopydefault, "");
            abstractC43096rioCopydefault.setLifecycleOwner(ViewOnClickListenerC43076riU.this);
            abstractC43096rioCopydefault.getRoot().setOnClickListener(this);
            return new C43312rms<>(abstractC43096rioCopydefault.getRoot(), abstractC43096rioCopydefault);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC43096rio> c43312rms, C43155rju c43155rju) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c43155rju, "");
            c43312rms.itemView.setTag(c43155rju);
            AbstractC43096rio abstractC43096rio = (AbstractC43096rio) c43312rms.OLrzqt();
            if (abstractC43096rio != null) {
                abstractC43096rio.copydefault(c43155rju);
            }
            ((AbstractC43096rio) c43312rms.OLrzqt()).executePendingBindings();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view != null) {
                ViewOnClickListenerC43076riU viewOnClickListenerC43076riU = ViewOnClickListenerC43076riU.this;
                java.lang.Object tag = view.getTag();
                if (tag instanceof C43155rju) {
                    C43155rju c43155rju = (C43155rju) tag;
                    if (c43155rju.copydefault() == 0) {
                        viewOnClickListenerC43076riU.OLrzqt().show();
                        viewOnClickListenerC43076riU.OLrzqt().EZpvd();
                        viewOnClickListenerC43076riU.AEQbTJ().AEQbTJ(c43155rju, viewOnClickListenerC43076riU.OLrzqt());
                    } else {
                        viewOnClickListenerC43076riU.AEQbTJ().KWHzl(c43155rju);
                    }
                }
                AbstractC43098riq abstractC43098riq = viewOnClickListenerC43076riU.KWHzl;
                if (abstractC43098riq == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43098riq = null;
                }
                abstractC43098riq.fARcdN.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.riU$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                ViewOnClickListenerC43076riU.this.AEQbTJ().fetchVPNInfo().postValue(java.lang.String.valueOf(tab.getText()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.riU */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ViewOnClickListenerC43076riU viewOnClickListenerC43076riU, C59534zip c59534zip, java.util.Map map) {
        AbstractC43098riq abstractC43098riq = viewOnClickListenerC43076riU.KWHzl;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        C55241xgI c55241xgI = abstractC43098riq.fJNWhG;
        c55241xgI.removeAllTabs();
        for (java.lang.String str : map.keySet()) {
            TabLayout.Tab text = c55241xgI.newTab().setText(str);
            Intrinsics.checkNotNullExpressionValue(text, "");
            c55241xgI.addTab(text, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) viewOnClickListenerC43076riU.AEQbTJ().fetchVPNInfo().getValue()));
        }
        java.util.List<C43155rju> listAkhnZx = viewOnClickListenerC43076riU.AEQbTJ().AkhnZx();
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.copydefault(items, "");
        DiffUtil.Callback callbackAEQbTJ = viewOnClickListenerC43076riU.AEQbTJ(items, listAkhnZx);
        c59534zip.setItems(listAkhnZx);
        DiffUtil.calculateDiff(callbackAEQbTJ).dispatchUpdatesTo(c59534zip);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.riU */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ViewOnClickListenerC43076riU viewOnClickListenerC43076riU, C59534zip c59534zip, java.lang.String str) {
        AbstractC43098riq abstractC43098riq = viewOnClickListenerC43076riU.KWHzl;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        C55241xgI c55241xgI = abstractC43098riq.fJNWhG;
        int tabCount = c55241xgI.getTabCount();
        int i = 0;
        while (true) {
            if (i >= tabCount) {
                break;
            }
            TabLayout.Tab tabAt = c55241xgI.getTabAt(i);
            if (Intrinsics.EZpvd((java.lang.Object) (tabAt != null ? tabAt.getText() : null), (java.lang.Object) str)) {
                c55241xgI.selectTab(c55241xgI.getTabAt(i));
                break;
            }
            i++;
        }
        java.util.List<C43155rju> listAkhnZx = viewOnClickListenerC43076riU.AEQbTJ().AkhnZx();
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.copydefault(items, "");
        DiffUtil.Callback callbackAEQbTJ = viewOnClickListenerC43076riU.AEQbTJ(items, listAkhnZx);
        c59534zip.setItems(listAkhnZx);
        DiffUtil.calculateDiff(callbackAEQbTJ).dispatchUpdatesTo(c59534zip);
        return Unit.INSTANCE;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        AbstractC43098riq abstractC43098riq = this.KWHzl;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.fARcdN)) {
            AEQbTJ().OLrzqt(z);
            return;
        }
        if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.valueOf)) {
            AEQbTJ().KWHzl(z);
            return;
        }
        if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.AhwBna)) {
            AEQbTJ().AEQbTJ(z);
            return;
        }
        if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.values)) {
            AEQbTJ().copydefault(z);
        } else if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.DbNXlk)) {
            C43192rke.values.OLrzqt(z);
        } else if (Intrinsics.EZpvd(compoundButton, abstractC43098riq.djBIcL)) {
            KWHzl().OLrzqt(z);
        }
    }

    /* JADX INFO: renamed from: o.riU$Application */
    public static final class Application extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<C43155rju> OLrzqt;
        public final /* synthetic */ java.util.List<C43155rju> copydefault;

        public Application(java.util.List<C43155rju> list, java.util.List<C43155rju> list2) {
            this.copydefault = list;
            this.OLrzqt = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.copydefault.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.copydefault.get(i), this.OLrzqt.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.copydefault.get(i), this.OLrzqt.get(i2));
        }
    }

    public final DiffUtil.Callback AEQbTJ(java.util.List<C43155rju> list, java.util.List<C43155rju> list2) {
        return new Application(list, list2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        AbstractC43098riq abstractC43098riq = this.KWHzl;
        AbstractC43098riq abstractC43098riq2 = null;
        if (abstractC43098riq == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq.fetchVPNInfo)) {
            AEQbTJ().fARcdN();
            return;
        }
        AbstractC43098riq abstractC43098riq3 = this.KWHzl;
        if (abstractC43098riq3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq3 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq3.AEQbTJ)) {
            AEQbTJ().gEmmrt();
            return;
        }
        AbstractC43098riq abstractC43098riq4 = this.KWHzl;
        if (abstractC43098riq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq4 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq4.EZpvd)) {
            onBackPressed();
            return;
        }
        AbstractC43098riq abstractC43098riq5 = this.KWHzl;
        if (abstractC43098riq5 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq5 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq5.copydefault)) {
            showLoading();
            AEQbTJ().AEQbTJ(new Function0() { // from class: o.riX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ViewOnClickListenerC43076riU.gEmmrt(this.EZpvd);
                }
            });
            return;
        }
        AbstractC43098riq abstractC43098riq6 = this.KWHzl;
        if (abstractC43098riq6 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq6 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq6.fIwbmz)) {
            C43114rjF c43114rjFAEQbTJ = AEQbTJ();
            ViewOnClickListenerC43147rjm viewOnClickListenerC43147rjmOLrzqt = OLrzqt();
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c43114rjFAEQbTJ.EZpvd(viewOnClickListenerC43147rjmOLrzqt, supportFragmentManager);
            return;
        }
        AbstractC43098riq abstractC43098riq7 = this.KWHzl;
        if (abstractC43098riq7 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq7 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq7.isConnected)) {
            AEQbTJ().EZpvd(this);
            return;
        }
        AbstractC43098riq abstractC43098riq8 = this.KWHzl;
        if (abstractC43098riq8 == null) {
            Intrinsics.gEmmrt("");
            abstractC43098riq8 = null;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq8.AkhnZx)) {
            AEQbTJ().KWHzl(this);
            return;
        }
        AbstractC43098riq abstractC43098riq9 = this.KWHzl;
        if (abstractC43098riq9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43098riq2 = abstractC43098riq9;
        }
        if (Intrinsics.EZpvd(view, abstractC43098riq2.OLrzqt)) {
            TaskDescription taskDescription = new TaskDescription();
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            taskDescription.show(supportFragmentManager2);
        }
    }

    public static final Unit gEmmrt(ViewOnClickListenerC43076riU viewOnClickListenerC43076riU) {
        C55328xhq.show$default(C55328xhq.OLrzqt, "Clear success", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        viewOnClickListenerC43076riU.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.riU$TaskDescription */
    public static final class TaskDescription extends AbstractC52789wYk {

        /* JADX INFO: renamed from: o.riU$TaskDescription$ActionBar */
        public static final class ActionBar extends TypeToken<AppDiffSP> {
        }

        @Override // o.AbstractC52789wYk, o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            super.onCreateHeader(c52781wYc);
            c52781wYc.setType(2);
        }

        @Override // o.AbstractC52789wYk, o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            super.onCreateContent(constraintLayout);
            KWHzl();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void KWHzl() {
            AppDiffSP appDiffSP;
            java.lang.String str;
            boolean z;
            java.lang.String str2;
            byte b;
            byte b2;
            C43114rjF.Application application = C43114rjF.Companion;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.util.List<C43114rjF.Activity> listAhwBna = yDY.AhwBna(application.copydefault(contextRequireContext));
            java.util.Iterator<T> it = application.OLrzqt().iterator();
            while (true) {
                java.lang.String diffMd5 = null;
                b2 = 0;
                b = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) it.next();
                C43047rhs c43047rhs = C43047rhs.AEQbTJ;
                AppJson appJsonKWHzl = c43047rhs.KWHzl(str3);
                java.lang.String version = appJsonKWHzl != null ? appJsonKWHzl.getVersion() : null;
                java.lang.String strCopydefault = c43047rhs.valueOf(str3).copydefault();
                java.lang.String string = SPUtils.getString("miniapp_diff_" + str3, "", "miniapp_diff_sp");
                Intrinsics.copydefault((java.lang.Object) string);
                if (string.length() > 0) {
                    try {
                        appDiffSP = (AppDiffSP) new Gson().fromJson(string, new ActionBar().getType());
                    } catch (java.lang.Exception unused) {
                        appDiffSP = null;
                    }
                } else {
                    appDiffSP = null;
                }
                C43047rhs c43047rhs2 = C43047rhs.AEQbTJ;
                if (c43047rhs2.OLrzqt().EZpvd(str3)) {
                    str2 = "HotReload";
                } else if (c43047rhs2.OLrzqt().OLrzqt(str3)) {
                    str2 = "TestPacket";
                } else {
                    C43045rhq c43045rhqAEQbTJ = c43047rhs2.AEQbTJ(str3);
                    if (c43045rhqAEQbTJ == null || c43045rhqAEQbTJ.OLrzqt() != C43045rhq.Companion.copydefault()) {
                        str = "";
                        z = true;
                        java.lang.String diffVersion = appDiffSP == null ? appDiffSP.getDiffVersion() : null;
                        if (appDiffSP == null) {
                            diffMd5 = appDiffSP.getDiffMd5();
                        }
                        listAhwBna.add(new C43114rjF.Activity(str3, version, strCopydefault, str, diffVersion, diffMd5, z));
                    } else {
                        str2 = "BuiltIn";
                    }
                }
                z = false;
                str = str2;
                if (appDiffSP == null) {
                }
                if (appDiffSP == null) {
                }
                listAhwBna.add(new C43114rjF.Activity(str3, version, strCopydefault, str, diffVersion, diffMd5, z));
            }
            OLrzqt(new java.util.ArrayList());
            java.util.List<C55371xig> listEZpvd = EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            for (C43114rjF.Activity activity : listAhwBna) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                C55371xig c55371xig = new C55371xig(fragmentActivityRequireActivity, b == true ? 1 : 0, 2, b2 == true ? 1 : 0);
                c55371xig.setTitleText(activity.OLrzqt() + " - " + activity.AhwBna() + " ");
                java.lang.String strCopydefault2 = activity.copydefault();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("MD5: ");
                sb.append(strCopydefault2);
                java.lang.String string2 = sb.toString();
                if (activity.AEQbTJ() && C33129mqd.OLrzqt((java.lang.CharSequence) activity.KWHzl()) && C33129mqd.OLrzqt((java.lang.CharSequence) activity.EZpvd())) {
                    string2 = string2 + "\n" + activity.OLrzqt() + "diff -" + activity.AhwBna() + " - " + activity.KWHzl() + "\ndiffmd5: " + activity.EZpvd();
                }
                c55371xig.setDescriptionText(string2);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.valueOf())) {
                    C55258xgZ c55258xgZAhwBna = c55371xig.AhwBna();
                    android.content.Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    C55251xgS c55251xgS = new C55251xgS(contextRequireContext2, null, 0, 6, null);
                    c55251xgS.setText(activity.valueOf());
                    c55251xgS.setOKDSStyle(13);
                    c55258xgZAhwBna.setAttachingView(c55251xgS);
                }
                arrayList.add(c55371xig);
            }
            listEZpvd.addAll(arrayList);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
