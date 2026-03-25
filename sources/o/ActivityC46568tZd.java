package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.preference.ui.language.SelectLangCoreActivity$setupObservers$2;
import com.okinc.preference.ui.language.SelectLangCoreViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC46568tZd extends AbstractActivityC46569tZe {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AkhnZx;
    public C46531tXu djBIcL;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.tZh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46568tZd.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tZf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46568tZd.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tZg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46568tZd.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.tZj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46568tZd.gEmmrt(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.tZd$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    @Override // o.AbstractActivityC33041mov
    public boolean needChangeLang() {
        return false;
    }

    public ActivityC46568tZd() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(SelectLangCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.preference.ui.language.SelectLangCoreActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.preference.ui.language.SelectLangCoreActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.preference.ui.language.SelectLangCoreActivity$special$$inlined$viewModels$default$3
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

    public final SelectLangCoreViewModel valueOf() {
        return (SelectLangCoreViewModel) this.AkhnZx.getValue();
    }

    public final C46575tZk AYXKKw() {
        return (C46575tZk) this.AhwBna.getValue();
    }

    public static final C46575tZk djBIcL(final ActivityC46568tZd activityC46568tZd) {
        return new C46575tZk(activityC46568tZd.OLrzqt(), new Function1() { // from class: o.tZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46568tZd.KWHzl(this.copydefault, (AXZ) obj);
            }
        });
    }

    public static final Unit KWHzl(ActivityC46568tZd activityC46568tZd, AXZ axz) {
        Intrinsics.checkNotNullParameter(axz, "");
        activityC46568tZd.valueOf().OLrzqt(axz);
        return Unit.INSTANCE;
    }

    public static final C46565tZa valueOf(ActivityC46568tZd activityC46568tZd) {
        return new C46565tZa(activityC46568tZd.OLrzqt());
    }

    public final C46565tZa AhwBna() {
        return (C46565tZa) this.AYXKKw.getValue();
    }

    public static final ConcatAdapter EZpvd(ActivityC46568tZd activityC46568tZd) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{activityC46568tZd.AhwBna(), activityC46568tZd.AYXKKw()});
    }

    private final ConcatAdapter isConnected() {
        return (ConcatAdapter) this.valueOf.getValue();
    }

    /* JADX DEBUG: Possible override for method o.tZe.OLrzqt()V */
    public final LanguageItem.NameType OLrzqt() {
        return (LanguageItem.NameType) this.gEmmrt.getValue();
    }

    public static final LanguageItem.NameType gEmmrt(ActivityC46568tZd activityC46568tZd) {
        android.content.Intent intent = activityC46568tZd.getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_KEY_LANGUAGE_MODE") : null;
        LanguageItem.NameType nameType = serializableExtra instanceof LanguageItem.NameType ? (LanguageItem.NameType) serializableExtra : null;
        return nameType == null ? LanguageItem.NameType.CEFI : nameType;
    }

    /* JADX INFO: renamed from: o.tZd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tZd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull LanguageItem.NameType nameType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nameType, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46568tZd.class);
            intent.putExtra("EXTRA_KEY_LANGUAGE_MODE", nameType);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC46569tZe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46531tXu c46531tXuEZpvd = C46531tXu.EZpvd(getLayoutInflater());
        this.djBIcL = c46531tXuEZpvd;
        C46531tXu c46531tXu = null;
        if (c46531tXuEZpvd == null) {
            Intrinsics.gEmmrt("");
            c46531tXuEZpvd = null;
        }
        setContentView(c46531tXuEZpvd.getRoot());
        C46531tXu c46531tXu2 = this.djBIcL;
        if (c46531tXu2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46531tXu = c46531tXu2;
        }
        c46531tXu.AEQbTJ.setTitle(gEmmrt());
        DbNXlk();
        values();
        valueOf().copydefault();
    }

    private final void DbNXlk() {
        C46531tXu c46531tXu = this.djBIcL;
        if (c46531tXu == null) {
            Intrinsics.gEmmrt("");
            c46531tXu = null;
        }
        RecyclerView recyclerView = c46531tXu.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(isConnected());
    }

    private final void values() {
        valueOf().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.tZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46568tZd.OLrzqt(this.OLrzqt, (BnW) obj);
            }
        }));
        FlowKt.launchIn(FlowKt.onEach(valueOf().KWHzl(), new SelectLangCoreActivity$setupObservers$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final Unit OLrzqt(ActivityC46568tZd activityC46568tZd, BnW bnW) {
        pUU.KWHzl(activityC46568tZd.getClass().getSimpleName(), "onUiState: " + bnW);
        activityC46568tZd.djBIcL();
        activityC46568tZd.AYXKKw().submitList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) bnW.copydefault()));
        activityC46568tZd.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C46531tXu c46531tXu = this.djBIcL;
        if (c46531tXu == null) {
            Intrinsics.gEmmrt("");
            c46531tXu = null;
        }
        c46531tXu.AEQbTJ.setTitle(gEmmrt());
        AhwBna().notifyDataSetChanged();
    }

    public final void fetchVPNInfo() {
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        C46531tXu c46531tXu = null;
        if (android.text.TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            C46531tXu c46531tXu2 = this.djBIcL;
            if (c46531tXu2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46531tXu = c46531tXu2;
            }
            c46531tXu.EZpvd.setLayoutDirection(1);
            return;
        }
        C46531tXu c46531tXu3 = this.djBIcL;
        if (c46531tXu3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46531tXu = c46531tXu3;
        }
        c46531tXu.EZpvd.setLayoutDirection(0);
    }

    /* JADX DEBUG: Possible override for method o.tZe.gEmmrt()V */
    public final java.lang.String gEmmrt() {
        if (OLrzqt() == LanguageItem.NameType.CEFI) {
            java.lang.String string = getString(C46526tXp.TaskDescription.AYXKKw);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String string2 = getString(C46526tXp.TaskDescription.EZpvd);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }

    @Override // o.AbstractActivityC46569tZe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC46569tZe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC46569tZe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC46569tZe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
