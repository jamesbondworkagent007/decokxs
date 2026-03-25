package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.ValidationStatus;
import com.okinc.planet.biz_content.reply.ReplyInputFragment$setupContentValidationObserver$1;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C47576tsi;
import o.C52761wXj;
import o.InterfaceC47543tsB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47803twx extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C47576tsi AEQbTJ;
    public C55284xgz AYXKKw;
    public boolean EZpvd;
    public Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> KWHzl;
    public Function1<? super java.lang.String, Unit> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public tNY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.gwTjWJ;
    }

    public C47803twx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.reply.ReplyInputFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.reply.ReplyInputFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47759twF.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.reply.ReplyInputFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.reply.ReplyInputFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.reply.ReplyInputFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.twx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.twx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C47803twx newInstance$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return taskDescription.OLrzqt(str, i, str2);
        }

        public final C47803twx OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C47803twx c47803twx = new C47803twx();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("reply_to_username", str);
            bundle.putInt("maxTextCount", i);
            bundle.putString("preText", str2);
            c47803twx.setArguments(bundle);
            return c47803twx;
        }
    }

    public final C47759twF copydefault() {
        return (C47759twF) this.djBIcL.getValue();
    }

    private final java.lang.String fetchVPNInfo() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("reply_to_username")) == null) ? "" : string;
    }

    public final int OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("maxTextCount");
        }
        return -1;
    }

    public final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("preText")) == null) ? "" : string;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        values();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        tNY tnyKWHzl = tNY.KWHzl(layoutInflater, viewGroup, false);
        this.valueOf = tnyKWHzl;
        if (tnyKWHzl != null) {
            return tnyKWHzl.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.twE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47803twx.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C47803twx c47803twx) {
        if (c47803twx.EZpvd) {
            return;
        }
        c47803twx.EZpvd = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47803twx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void values() {
        tNY tny = this.valueOf;
        if (tny != null) {
            tny.OLrzqt.setText(C33069mpW.copydefault(C47501trL.Fragment.gCZUJG, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", ""))));
            tny.AhwBna.setText(fetchVPNInfo());
            tny.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.twG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C47803twx.KWHzl(this.OLrzqt, view);
                }
            });
            KWHzl(OLrzqt(), 0);
            C47576tsi.TaskDescription taskDescription = C47576tsi.Companion;
            java.lang.String strKWHzl = KWHzl();
            C47576tsi c47576tsiNewInstance$default = C47576tsi.TaskDescription.newInstance$default(taskDescription, new C47574tsg(C33070mpX.AYXKKw(C47501trL.Fragment.abAflu), strKWHzl, OLrzqt(), 0, false, false, 0, false, false, 0, false, true, "reply_input_state_" + fetchVPNInfo(), C55298xhM.dp2px$default(12.0f, null, 1, null), 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null), 8, null), copydefault(), new Activity(), false, 8, null);
            this.AEQbTJ = c47576tsiNewInstance$default;
            if (c47576tsiNewInstance$default != null) {
                getChildFragmentManager().beginTransaction().replace(tny.EZpvd.getId(), c47576tsiNewInstance$default).commitNow();
            }
            AhwBna();
        }
    }

    public static final void KWHzl(C47803twx c47803twx, android.view.View view) {
        c47803twx.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.twx$Activity */
    public static final class Activity implements InterfaceC47543tsB {
        @Override // o.InterfaceC47543tsB
        public void OLrzqt() {
        }

        public Activity() {
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ() {
            InterfaceC47543tsB.Activity.AEQbTJ(this);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.copydefault(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(java.lang.String str) {
            InterfaceC47543tsB.Activity.copydefault(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void EZpvd() {
            InterfaceC47543tsB.Activity.copydefault(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl() {
            InterfaceC47543tsB.Activity.EZpvd(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.KWHzl(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault() {
            InterfaceC47543tsB.Activity.OLrzqt(this);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str) {
            InterfaceC47543tsB.Activity.EZpvd(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str, int i) {
            InterfaceC47543tsB.Activity.OLrzqt(this, str, i);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt(java.lang.String str, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Function1<java.lang.String, Unit> function1EZpvd = C47803twx.this.EZpvd();
            if (function1EZpvd != null) {
                function1EZpvd.invoke(str);
            }
            C47803twx.this.DbNXlk();
            C47803twx.this.KWHzl(i2, i);
        }
    }

    public final void KWHzl(int i, int i2) {
        tNY tny = this.valueOf;
        if (tny != null) {
            int i3 = i - i2;
            tny.AEQbTJ.setText(pTB.formatLocalized$default(java.lang.String.valueOf(i3), null, 1, null));
            tny.AEQbTJ.setTextColor(getResources().getColor(i3 <= 0 ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.QwvEab, null));
        }
    }

    public final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ReplyInputFragment$setupContentValidationObserver$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(C47577tsj c47577tsj) {
        java.lang.String strValues;
        tNY tny = this.valueOf;
        if (tny != null) {
            C47576tsi c47576tsi = this.AEQbTJ;
            boolean z = false;
            boolean z2 = (c47576tsi == null || (strValues = c47576tsi.values()) == null || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues) ^ true)) ? false : true;
            C52794wYp c52794wYp = tny.copydefault;
            if (z2 && c47577tsj.AEQbTJ()) {
                z = true;
            }
            c52794wYp.setEnabled(z);
            C47572tse c47572tse = c47577tsj.OLrzqt().get(ContentValidationType.URL_DETECTION);
            if ((c47572tse != null ? c47572tse.EZpvd() : null) == ValidationStatus.FAIL) {
                djBIcL();
            } else {
                gEmmrt();
            }
            if (c47577tsj.AEQbTJ()) {
                return;
            }
            java.util.List<C47572tse> listEZpvd = c47577tsj.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (C47572tse c47572tse2 : listEZpvd) {
                arrayList.add(c47572tse2.KWHzl() + ": " + c47572tse2.AEQbTJ());
            }
            pUU.EZpvd("Reply", "Reply cannot be sent: " + arrayList);
        }
    }

    public final void djBIcL() {
        android.view.View view;
        C52794wYp c52794wYp;
        C55284xgz c55284xgz = this.AYXKKw;
        if ((c55284xgz == null || !c55284xgz.values()) && (view = getView()) != null) {
            C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, "Links aren't supported");
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(2);
                c55284xgzKWHzl.djBIcL(0);
                tNY tny = this.valueOf;
                if (tny != null && (c52794wYp = tny.copydefault) != null) {
                    c55284xgzKWHzl.AEQbTJ(c52794wYp);
                }
                c55284xgzKWHzl.hDKMBd();
            } else {
                c55284xgzKWHzl = null;
            }
            this.AYXKKw = c55284xgzKWHzl;
        }
    }

    public final void gEmmrt() {
        C55284xgz c55284xgz = this.AYXKKw;
        if (c55284xgz != null) {
            c55284xgz.copydefault();
        }
        this.AYXKKw = null;
    }

    public final void AEQbTJ() {
        C47577tsj value = copydefault().AEQbTJ().getValue();
        if (value.AEQbTJ()) {
            AYXKKw();
            return;
        }
        java.util.List<C47572tse> listEZpvd = value.EZpvd();
        C47572tse c47572tse = value.OLrzqt().get(ContentValidationType.BLANK_ALL);
        if ((c47572tse != null ? c47572tse.EZpvd() : null) == ValidationStatus.FAIL) {
            valueOf();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (C47572tse c47572tse2 : listEZpvd) {
            arrayList.add(c47572tse2.KWHzl() + ": " + c47572tse2.AEQbTJ());
        }
        pUU.EZpvd("Reply", "Cannot send reply - validation failures: " + arrayList);
    }

    public final void valueOf() {
        C55284xgz c55284xgzKWHzl;
        C52794wYp c52794wYp;
        android.view.View view = getView();
        if (view == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, "Tell us why you want to share this")) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(1);
        c55284xgzKWHzl.djBIcL(0);
        tNY tny = this.valueOf;
        if (tny != null && (c52794wYp = tny.copydefault) != null) {
            c55284xgzKWHzl.AEQbTJ(c52794wYp);
        }
        c55284xgzKWHzl.hDKMBd();
    }

    public final void DbNXlk() {
        java.lang.String strValues;
        C52794wYp c52794wYp;
        C47576tsi c47576tsi = this.AEQbTJ;
        if (c47576tsi == null || (strValues = c47576tsi.values()) == null) {
            strValues = "";
        }
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues);
        C47577tsj value = copydefault().AEQbTJ().getValue();
        tNY tny = this.valueOf;
        if (tny == null || (c52794wYp = tny.copydefault) == null) {
            return;
        }
        c52794wYp.setEnabled((zFARcdN ^ true) && value.AEQbTJ());
    }

    public final void AYXKKw() {
        java.lang.String strValues;
        C47576tsi c47576tsi = this.AEQbTJ;
        if (c47576tsi == null || (strValues = c47576tsi.values()) == null) {
            strValues = "";
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues)) {
            C47576tsi c47576tsi2 = this.AEQbTJ;
            if (c47576tsi2 != null) {
                c47576tsi2.copydefault();
            }
            copydefault().ejfBZ();
            Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> function2 = this.KWHzl;
            if (function2 != null) {
                function2.invoke(strValues, yDY.AhwBna());
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C47576tsi c47576tsi = this.AEQbTJ;
        if (c47576tsi != null) {
            c47576tsi.fJNWhG();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        gEmmrt();
        this.valueOf = null;
    }
}
