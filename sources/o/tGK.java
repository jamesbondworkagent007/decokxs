package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGK extends AbstractActivityC33041mov {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public C46080tHb KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C46248tNh copydefault;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public tGK() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C46097tHs.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_search.activity.SearchOrbitersActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_search.activity.SearchOrbitersActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_search.activity.SearchOrbitersActivity$special$$inlined$viewModels$default$3
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

    public final C46097tHs KWHzl() {
        return (C46097tHs) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46248tNh c46248tNhCopydefault = C46248tNh.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46248tNhCopydefault, "");
        setContentView(c46248tNhCopydefault.getRoot());
        this.copydefault = c46248tNhCopydefault;
        C46097tHs c46097tHsKWHzl = KWHzl();
        java.lang.String stringExtra = getIntent().getStringExtra("extra_search_key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        c46097tHsKWHzl.AEQbTJ(stringExtra);
        C46248tNh c46248tNh = this.copydefault;
        if (c46248tNh == null) {
            Intrinsics.gEmmrt("");
            c46248tNh = null;
        }
        C33537myN c33537myN = c46248tNh.valueOf;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tGJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tGK.copydefault(this.copydefault, view);
                }
            });
            c33537myN.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.zqTOFw));
            C46080tHb c46080tHb = new C46080tHb();
            this.KWHzl = c46080tHb;
            c46080tHb.KWHzl(KWHzl().AEQbTJ());
            c46248tNh.KWHzl.setLayoutManager(new LinearLayoutManager(this, 1, false));
            RecyclerView recyclerView = c46248tNh.KWHzl;
            C46080tHb c46080tHb2 = this.KWHzl;
            if (c46080tHb2 == null) {
                Intrinsics.gEmmrt("");
                c46080tHb2 = null;
            }
            recyclerView.setAdapter(c46080tHb2);
            C33546myW c33546myW = c46248tNh.AEQbTJ;
            c33546myW.AhwBna(true);
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tGH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    tGK.OLrzqt(this.OLrzqt, interfaceC57934yrl);
                }
            });
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tGL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    tGK.EZpvd(this.AEQbTJ, interfaceC57934yrl);
                }
            });
            EZpvd();
            C46097tHs.loadData$default(KWHzl(), false, 1, null);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void copydefault(tGK tgk, android.view.View view) {
        tgk.finish();
    }

    public static final void OLrzqt(tGK tgk, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        tgk.KWHzl().AEQbTJ(true);
    }

    public static final void EZpvd(tGK tgk, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        tgk.KWHzl().AEQbTJ(false);
    }

    private final void EZpvd() {
        KWHzl().EZpvd().observe(this, new Application(new Function1() { // from class: o.tGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tGK.EZpvd(this.KWHzl, (C47655tuH) obj);
            }
        }));
    }

    public static final Unit EZpvd(tGK tgk, C47655tuH c47655tuH) {
        C46248tNh c46248tNh = tgk.copydefault;
        if (c46248tNh == null) {
            Intrinsics.gEmmrt("");
            c46248tNh = null;
        }
        C33546myW c33546myW = c46248tNh.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C46248tNh c46248tNh2 = tgk.copydefault;
        if (c46248tNh2 == null) {
            Intrinsics.gEmmrt("");
            c46248tNh2 = null;
        }
        C55237xgE c55237xgE = c46248tNh2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
        int i = StateListAnimator.EZpvd[c47655tuH.EZpvd().ordinal()];
        if (i == 1) {
            tgk.OLrzqt(c55237xgE);
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            if (!tgk.AEQbTJ) {
                tgk.AEQbTJ = true;
                rVN.reportFullyDrawn$default((android.app.Activity) tgk, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 2) {
            tgk.OLrzqt(c55237xgE);
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            if (!tgk.AEQbTJ) {
                tgk.AEQbTJ = true;
                rVN.reportFullyDrawn$default((android.app.Activity) tgk, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 3) {
            c55237xgE.setStatus(StatefulView.Status.Content);
            if (c47655tuH.copydefault()) {
                if (c47655tuH.AEQbTJ()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (c47655tuH.AEQbTJ()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            C46080tHb c46080tHb = tgk.KWHzl;
            if (c46080tHb == null) {
                Intrinsics.gEmmrt("");
                c46080tHb = null;
            }
            java.util.List<java.lang.Object> listKWHzl = c47655tuH.KWHzl();
            Intrinsics.copydefault(listKWHzl, "");
            c46080tHb.submitList(listKWHzl);
            if (!tgk.AEQbTJ) {
                tgk.AEQbTJ = true;
                rVN.reportFullyDrawn$default((android.app.Activity) tgk, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else {
            c55237xgE.setStatus(c47655tuH.EZpvd());
        }
        return Unit.INSTANCE;
    }

    private final void OLrzqt(C55237xgE c55237xgE) {
        StatefulView.Status status = StatefulView.Status.Error;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        C55173xeu c55173xeu = viewAEQbTJ != null ? (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW) : null;
        if (c55173xeu != null) {
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.DCUTEIddSDPG));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.run));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C47501trL.Fragment.AkhnZx));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.tGI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tGK.KWHzl(this.EZpvd, view);
                }
            });
        }
    }

    public static final void KWHzl(tGK tgk, android.view.View view) {
        C46097tHs.loadData$default(tgk.KWHzl(), false, 1, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tGK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void start$default(ActionBar actionBar, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            actionBar.OLrzqt(context, str);
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tGK.class);
            intent.putExtra("extra_search_key", str);
            context.startActivity(intent);
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
