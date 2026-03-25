package com.okinc.web3.security.features.importing.activity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.databinding.ActivityWeb3SecurityWalletImportBinding;
import com.okinc.web3.security.features.importing.activity.ImportWalletActivity;
import com.okinc.web3.security.features.importing.adapter.SuggestedWordsAdapter;
import com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet;
import com.okinc.web3.security.features.importing.bottomsheet.ImportSecurityTipsBottomSheet;
import com.okinc.web3.security.features.importing.bottomsheet.ImportTonWalletTipsBottomSheet;
import com.okinc.web3.security.features.importing.model.SuggestedWord;
import com.okinc.web3.security.features.importing.model.SuggestedWordInput;
import com.okinc.web3.security.features.importing.model.SuggestedWordsState;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import com.okinc.web3.security.features.importing.utils.Regexes;
import com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout;
import com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout;
import com.okinc.web3.security.listener.ImportWalletListener;
import com.okinc.web3.security.model.ButtonEvent;
import com.okinc.web3.security.model.ImportMode;
import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.model.ValidSeedPhraseResult;
import com.okinc.web3.security.view.TextChangedListener;
import com.okinc.web3.security.view.TextViewsKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33013moT;
import o.C33070mpX;
import o.C33492mxV;
import o.C33567myr;
import o.C33570myu;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C57407yho;
import o.C57583ylE;
import o.C6777aVl;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ImportWalletActivity extends AbstractActivityC33013moT {
    public static final String KEY_IMPORT_MODE = "import_mode";
    private static ImportWalletListener mImportWalletListener;
    private final boolean applyNavigationBarInsets;
    private ActivityWeb3SecurityWalletImportBinding binding;
    private CollisionChooseBottomSheet.OnItemClickListener mOnItemClickListener;
    private final InterfaceC56387yDm viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.applyNavigationBarInsets;
    }

    public ImportWalletActivity() {
        final Function0 function0 = null;
        this.viewModel$delegate = new ViewModelLazy(C56524yIo.AEQbTJ(WalletImportViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImportWalletActivity.viewModel_delegate$lambda$0();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$special$$inlined$viewModels$default$3
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

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.activity.ImportWalletActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(@NotNull Context context, @NotNull ImportMode importMode, @NotNull ImportWalletListener importWalletListener) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(importMode, "");
            Intrinsics.checkNotNullParameter(importWalletListener, "");
            ImportWalletActivity.mImportWalletListener = null;
            try {
                Intent intent = new Intent(context, (Class<?>) ImportWalletActivity.class);
                intent.putExtra(ImportWalletActivity.KEY_IMPORT_MODE, importMode);
                context.startActivity(intent);
                ImportWalletActivity.mImportWalletListener = importWalletListener;
            } catch (Exception e) {
                ImportWalletActivity.mImportWalletListener = null;
                C6777aVl.Companion.EZpvd(e);
                pUU.AEQbTJ("Web3SecurityWalletImportActivity", "startActivity", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletImportViewModel getViewModel() {
        return (WalletImportViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0() {
        return WalletImportViewModel.Companion.getFactory();
    }

    private final ImportMode getImportMode() {
        Object serializableExtra;
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra(KEY_IMPORT_MODE, ImportMode.class);
            } else {
                serializableExtra = (ImportMode) intent.getSerializableExtra(KEY_IMPORT_MODE);
            }
            ImportMode importMode = (ImportMode) serializableExtra;
            if (importMode != null) {
                return importMode;
            }
        }
        return ImportMode.All;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBindingInflate = ActivityWeb3SecurityWalletImportBinding.inflate(getLayoutInflater());
        this.binding = activityWeb3SecurityWalletImportBindingInflate;
        ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding = null;
        if (activityWeb3SecurityWalletImportBindingInflate == null) {
            Intrinsics.gEmmrt("");
            activityWeb3SecurityWalletImportBindingInflate = null;
        }
        setContentView(activityWeb3SecurityWalletImportBindingInflate.getRoot());
        if (getImportMode() == ImportMode.All) {
            ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding2 = this.binding;
            if (activityWeb3SecurityWalletImportBinding2 == null) {
                Intrinsics.gEmmrt("");
                activityWeb3SecurityWalletImportBinding2 = null;
            }
            activityWeb3SecurityWalletImportBinding2.title.setText(C33070mpX.AYXKKw(C57407yho.Activity.hDKMBd));
            ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding3 = this.binding;
            if (activityWeb3SecurityWalletImportBinding3 == null) {
                Intrinsics.gEmmrt("");
                activityWeb3SecurityWalletImportBinding3 = null;
            }
            activityWeb3SecurityWalletImportBinding3.importDataInput.setPrivateKeyHint(C33070mpX.AYXKKw(C57407yho.Activity.getFieldNames));
        } else if (!getImportMode().contain(ImportMode.PrivateKey)) {
            ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding4 = this.binding;
            if (activityWeb3SecurityWalletImportBinding4 == null) {
                Intrinsics.gEmmrt("");
                activityWeb3SecurityWalletImportBinding4 = null;
            }
            activityWeb3SecurityWalletImportBinding4.title.setText(C33070mpX.AYXKKw(C57407yho.Activity.gEmmrt));
            ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding5 = this.binding;
            if (activityWeb3SecurityWalletImportBinding5 == null) {
                Intrinsics.gEmmrt("");
                activityWeb3SecurityWalletImportBinding5 = null;
            }
            activityWeb3SecurityWalletImportBinding5.importDataInput.setPrivateKeyHint(C33070mpX.AYXKKw(C57407yho.Activity.isConnected));
        }
        ImportWalletListener importWalletListener = mImportWalletListener;
        if (importWalletListener != null) {
            importWalletListener.onActivityCreated(this);
        }
        handleShowImportDialog();
        ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding6 = this.binding;
        if (activityWeb3SecurityWalletImportBinding6 == null) {
            Intrinsics.gEmmrt("");
            activityWeb3SecurityWalletImportBinding6 = null;
        }
        setUpViews(activityWeb3SecurityWalletImportBinding6);
        ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding7 = this.binding;
        if (activityWeb3SecurityWalletImportBinding7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            activityWeb3SecurityWalletImportBinding = activityWeb3SecurityWalletImportBinding7;
        }
        observeData(activityWeb3SecurityWalletImportBinding);
        setupListener();
    }

    private final void setUpViews(final ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding) {
        ViewCompat.setOnApplyWindowInsetsListener(activityWeb3SecurityWalletImportBinding.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ImportWalletActivity.setUpViews$lambda$1(this.f$0, view, windowInsetsCompat);
            }
        });
        activityWeb3SecurityWalletImportBinding.suggestedWords.addItemDecoration(new C57583ylE(C55298xhM.OLrzqt(10, (Context) this), false, false));
        activityWeb3SecurityWalletImportBinding.suggestedWords.setAdapter(new SuggestedWordsAdapter(new SuggestedWordsAdapter.OnWordClickListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.adapter.SuggestedWordsAdapter.OnWordClickListener
            public final void onWordClick(SuggestedWord suggestedWord) {
                ImportWalletActivity.setUpViews$lambda$2(this.f$0, suggestedWord);
            }
        }));
        activityWeb3SecurityWalletImportBinding.importDataInput.setOnPrivateKeyTextChangedListener(new C17563(getViewModel()));
        activityWeb3SecurityWalletImportBinding.importDataInput.setOnWordTextChangedListener(new C17574(getViewModel()));
        activityWeb3SecurityWalletImportBinding.importDataInput.setOnWordFocusGainedListener(new C17585(getViewModel()));
        activityWeb3SecurityWalletImportBinding.importDataInput.setOnWordBackspaceDownListener(new SeedPhraseWordInputLayout.OnWordBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordBackspaceDownListener
            public final boolean onBackspaceDown(int i, CharSequence charSequence) {
                return ImportWalletActivity.setUpViews$lambda$3(this.f$0, i, charSequence);
            }
        });
        activityWeb3SecurityWalletImportBinding.importDataInput.setOnWordEditorActionListener(new SeedPhraseWordInputLayout.OnWordEditorActionListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordEditorActionListener
            public final boolean onEditorAction(int i, int i2, KeyEvent keyEvent) {
                return ImportWalletActivity.setUpViews$lambda$4(this.f$0, i, i2, keyEvent);
            }
        });
        C52794wYp c52794wYp = activityWeb3SecurityWalletImportBinding.clear;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        TextViewsKt.setCompoundDrawablesRelativeWithSize(c52794wYp, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.dTTfOR, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        final C52794wYp c52794wYp2 = activityWeb3SecurityWalletImportBinding.clear;
        final long j = 1000;
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp2) > j || (c52794wYp2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp2, jCurrentTimeMillis);
                    this.getViewModel().onClearContent();
                }
            }
        });
        C52794wYp c52794wYp3 = activityWeb3SecurityWalletImportBinding.paste;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        TextViewsKt.setCompoundDrawablesRelativeWithSize(c52794wYp3, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.ZxnNGp, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        final C52794wYp c52794wYp4 = activityWeb3SecurityWalletImportBinding.paste;
        final long j2 = 1000;
        c52794wYp4.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$$inlined$singleClick$default$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp4) > j2 || (c52794wYp4 instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp4, jCurrentTimeMillis);
                    ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(this, ClipboardManager.class);
                    if (clipboardManager == null) {
                        return;
                    }
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C57407yho.Activity.uzCIH), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                        return;
                    }
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    CharSequence charSequenceHDKMBd = text != null ? StringsKt__StringsKt.hDKMBd(text) : null;
                    if (charSequenceHDKMBd == null || charSequenceHDKMBd.length() == 0) {
                        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C57407yho.Activity.uzCIH), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                        return;
                    }
                    if (Regexes.INSTANCE.getSEED_PHRASE_PRIVATE_KEY().matches(charSequenceHDKMBd)) {
                        this.getViewModel().onPasteContent(charSequenceHDKMBd);
                        C33570myu.AEQbTJ(this, activityWeb3SecurityWalletImportBinding.importDataInput);
                        View currentFocus = this.getCurrentFocus();
                        if (currentFocus != null) {
                            currentFocus.clearFocus();
                            return;
                        }
                        return;
                    }
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C57407yho.Activity.getNewProxyInstance), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                }
            }
        });
        final C52794wYp c52794wYpCopydefault = activityWeb3SecurityWalletImportBinding.confirm.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$$inlined$singleClick$default$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpCopydefault) > j || (c52794wYpCopydefault instanceof Checkable)) {
                        C55296xhK.OLrzqt(c52794wYpCopydefault, jCurrentTimeMillis);
                        C33570myu.copydefault((Activity) this);
                        this.getViewModel().onConfirmClicked();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat setUpViews$lambda$1(ImportWalletActivity importWalletActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), insets.bottom);
        importWalletActivity.getViewModel().setShouldShowSuggestedWords(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime()));
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpViews$lambda$2(ImportWalletActivity importWalletActivity, SuggestedWord suggestedWord) {
        Intrinsics.checkNotNullParameter(suggestedWord, "");
        SuggestedWordInput input = suggestedWord.getInput();
        if (Intrinsics.EZpvd(input, SuggestedWordInput.PrivateKey.INSTANCE)) {
            importWalletActivity.getViewModel().acceptSuggestionForPrivateKey(suggestedWord.getWord());
        } else {
            if (!(input instanceof SuggestedWordInput.SeedPhrase)) {
                throw new NoWhenBranchMatchedException();
            }
            importWalletActivity.getViewModel().acceptSuggestionForSeedPhrase(((SuggestedWordInput.SeedPhrase) suggestedWord.getInput()).getIndex(), suggestedWord.getWord());
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C17563 implements TextChangedListener, InterfaceC56514yIe {
        final /* synthetic */ WalletImportViewModel $tmp0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17563(WalletImportViewModel walletImportViewModel) {
            this.$tmp0 = walletImportViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof TextChangedListener) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, WalletImportViewModel.class, "onPrivateKeyChanged", "onPrivateKeyChanged(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.okinc.web3.security.view.TextChangedListener
        public final void onTextChanged(CharSequence charSequence, CharSequence charSequence2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.$tmp0.onPrivateKeyChanged(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$4, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C17574 implements SeedPhraseWordInputLayout.OnWordTextChangedListener, InterfaceC56514yIe {
        final /* synthetic */ WalletImportViewModel $tmp0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17574(WalletImportViewModel walletImportViewModel) {
            this.$tmp0 = walletImportViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof SeedPhraseWordInputLayout.OnWordTextChangedListener) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(3, this.$tmp0, WalletImportViewModel.class, "onSeedPhraseWordChanged", "onSeedPhraseWordChanged(ILjava/lang/CharSequence;Ljava/lang/CharSequence;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordTextChangedListener
        public final void onWordTextChanged(int i, CharSequence charSequence, CharSequence charSequence2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.$tmp0.onSeedPhraseWordChanged(i, charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$setUpViews$5, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C17585 implements SeedPhraseWordInputLayout.OnWordFocusGainedListener, InterfaceC56514yIe {
        final /* synthetic */ WalletImportViewModel $tmp0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17585(WalletImportViewModel walletImportViewModel) {
            this.$tmp0 = walletImportViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof SeedPhraseWordInputLayout.OnWordFocusGainedListener) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.$tmp0, WalletImportViewModel.class, "onSeedPhraseWordFocusGained", "onSeedPhraseWordFocusGained(I)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordFocusGainedListener
        public final void onFocusGained(int i) {
            this.$tmp0.onSeedPhraseWordFocusGained(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUpViews$lambda$3(ImportWalletActivity importWalletActivity, int i, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        importWalletActivity.getViewModel().onSeedPhraseWordDeleted(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUpViews$lambda$4(ImportWalletActivity importWalletActivity, int i, int i2, KeyEvent keyEvent) {
        if (i2 != 5) {
            return false;
        }
        importWalletActivity.getViewModel().moveToNextWord(i);
        return true;
    }

    private final void observeData(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding) {
        StateFlow<WalletImportViewModel.ErrorMessage> errorMessageState = getViewModel().getErrorMessageState();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(errorMessageState, lifecycle, null, 2, null), new AnonymousClass1(activityWeb3SecurityWalletImportBinding, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Flow<WalletImportViewModel.Result> resultEvent = getViewModel().getResultEvent();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(resultEvent, lifecycle2, null, 2, null), new AnonymousClass2(null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<TonAddress> tonAddress = getViewModel().getTonAddress();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(tonAddress, lifecycle3, null, 2, null), new AnonymousClass3(null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<SuggestedWordsState> suggestedWordsState = getViewModel().getSuggestedWordsState();
        Lifecycle lifecycle4 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle4, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(suggestedWordsState, lifecycle4, null, 2, null), new AnonymousClass4(activityWeb3SecurityWalletImportBinding, null)), LifecycleOwnerKt.getLifecycleScope(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass5(activityWeb3SecurityWalletImportBinding, null), 3, null);
        StateFlow<Boolean> stateFlowIsConfirmButtonEnabledState = getViewModel().isConfirmButtonEnabledState();
        Lifecycle lifecycle5 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle5, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowIsConfirmButtonEnabledState, lifecycle5, null, 2, null), new AnonymousClass6(activityWeb3SecurityWalletImportBinding, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<Boolean> stateFlowIsContentNotEmptyState = getViewModel().isContentNotEmptyState();
        Lifecycle lifecycle6 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle6, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowIsContentNotEmptyState, lifecycle6, null, 2, null), new AnonymousClass7(activityWeb3SecurityWalletImportBinding, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<ButtonEvent> onButtonClick = getViewModel().getOnButtonClick();
        Lifecycle lifecycle7 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle7, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(onButtonClick, lifecycle7, null, 2, null), new AnonymousClass8(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WalletImportViewModel.ErrorMessage, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_observeData = activityWeb3SecurityWalletImportBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_observeData, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WalletImportViewModel.ErrorMessage errorMessage, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(errorMessage, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletImportViewModel.ErrorMessage errorMessage = (WalletImportViewModel.ErrorMessage) this.L$0;
                if (errorMessage != null) {
                    TextView textView = this.$this_observeData.errorMessage;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(0);
                    this.$this_observeData.errorMessage.setText(errorMessage.getMessage());
                    final ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding = this.$this_observeData;
                    C56443yFo.KWHzl(activityWeb3SecurityWalletImportBinding.errorMessage.post(new Runnable() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$1$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ImportWalletActivity.AnonymousClass1.invokeSuspend$lambda$0(activityWeb3SecurityWalletImportBinding);
                        }
                    }));
                } else {
                    TextView textView2 = this.$this_observeData.errorMessage;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding) {
            activityWeb3SecurityWalletImportBinding.errorMessage.requestRectangleOnScreen(new Rect(0, 0, activityWeb3SecurityWalletImportBinding.errorMessage.getRight(), activityWeb3SecurityWalletImportBinding.errorMessage.getBottom()));
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<WalletImportViewModel.Result, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ImportWalletActivity.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WalletImportViewModel.Result result, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletImportViewModel.Result result = (WalletImportViewModel.Result) this.L$0;
                if (result instanceof WalletImportViewModel.Result.ValidSeedPhrase) {
                    ImportWalletListener importWalletListener = ImportWalletActivity.mImportWalletListener;
                    if (importWalletListener != null) {
                        ImportWalletActivity importWalletActivity = ImportWalletActivity.this;
                        WalletImportViewModel.Result.ValidSeedPhrase validSeedPhrase = (WalletImportViewModel.Result.ValidSeedPhrase) result;
                        ValidSeedPhraseResult validSeedPhraseResult = new ValidSeedPhraseResult(validSeedPhrase.getSeedPhrase(), validSeedPhrase.isTon(), false, false);
                        final ImportWalletActivity importWalletActivity2 = ImportWalletActivity.this;
                        importWalletListener.onSeedPhraseValid(importWalletActivity, validSeedPhraseResult, new Function1() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$2$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ImportWalletActivity.AnonymousClass2.invokeSuspend$lambda$0(importWalletActivity2, (String) obj2);
                            }
                        });
                    }
                } else if (result instanceof WalletImportViewModel.Result.ShowTonWalletTips) {
                    ImportWalletActivity.this.handleShowTonWalletTips(((WalletImportViewModel.Result.ShowTonWalletTips) result).getSeedPhrase());
                } else if (result instanceof WalletImportViewModel.Result.ValidPrivateKey) {
                    ImportWalletListener importWalletListener2 = ImportWalletActivity.mImportWalletListener;
                    if (importWalletListener2 != null) {
                        ImportWalletActivity importWalletActivity3 = ImportWalletActivity.this;
                        String privateKey = ((WalletImportViewModel.Result.ValidPrivateKey) result).getPrivateKey();
                        final ImportWalletActivity importWalletActivity4 = ImportWalletActivity.this;
                        importWalletListener2.onPrivateKeyValid(importWalletActivity3, privateKey, new Function1() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$2$$ExternalSyntheticLambda1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ImportWalletActivity.AnonymousClass2.invokeSuspend$lambda$1(importWalletActivity4, (String) obj2);
                            }
                        });
                    }
                } else {
                    if (!(result instanceof WalletImportViewModel.Result.CollisionTips)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ImportWalletListener importWalletListener3 = ImportWalletActivity.mImportWalletListener;
                    if (importWalletListener3 != null) {
                        ImportWalletActivity importWalletActivity5 = ImportWalletActivity.this;
                        String seedPhrase = ((WalletImportViewModel.Result.CollisionTips) result).getSeedPhrase();
                        final ImportWalletActivity importWalletActivity6 = ImportWalletActivity.this;
                        Function1<? super TonAddress, Unit> function1 = new Function1() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$2$$ExternalSyntheticLambda2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ImportWalletActivity.AnonymousClass2.invokeSuspend$lambda$2(importWalletActivity6, (TonAddress) obj2);
                            }
                        };
                        final ImportWalletActivity importWalletActivity7 = ImportWalletActivity.this;
                        importWalletListener3.onSeedPhraseCollide(importWalletActivity5, seedPhrase, function1, new Function1() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$2$$ExternalSyntheticLambda3
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ImportWalletActivity.AnonymousClass2.invokeSuspend$lambda$3(importWalletActivity7, (String) obj2);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ImportWalletActivity importWalletActivity, String str) {
            importWalletActivity.getViewModel().setErrorMsg(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ImportWalletActivity importWalletActivity, String str) {
            importWalletActivity.getViewModel().setErrorMsg(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(ImportWalletActivity importWalletActivity, TonAddress tonAddress) {
            importWalletActivity.getViewModel().setErrorMsg(null);
            importWalletActivity.getViewModel().setTonAddress(tonAddress);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(ImportWalletActivity importWalletActivity, String str) {
            importWalletActivity.getViewModel().setErrorMsg(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<TonAddress, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = ImportWalletActivity.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TonAddress tonAddress, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(tonAddress, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                TonAddress tonAddress = (TonAddress) this.L$0;
                if (tonAddress == null) {
                    return Unit.INSTANCE;
                }
                CollisionChooseBottomSheet collisionChooseBottomSheetNewInstance = CollisionChooseBottomSheet.Companion.newInstance(tonAddress);
                FragmentManager supportFragmentManager = ImportWalletActivity.this.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                collisionChooseBottomSheetNewInstance.show(supportFragmentManager, ImportWalletActivity.this.mOnItemClickListener);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<SuggestedWordsState, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$this_observeData = activityWeb3SecurityWalletImportBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_observeData, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SuggestedWordsState suggestedWordsState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(suggestedWordsState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SuggestedWordsState suggestedWordsState = (SuggestedWordsState) this.L$0;
                if (suggestedWordsState == null) {
                    FrameLayout frameLayout = this.$this_observeData.suggestedWordsArea;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    frameLayout.setVisibility(8);
                } else if (Intrinsics.EZpvd(suggestedWordsState, SuggestedWordsState.SeedPhrasePrompt.INSTANCE)) {
                    FrameLayout frameLayout2 = this.$this_observeData.suggestedWordsArea;
                    Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                    frameLayout2.setVisibility(0);
                    RecyclerView recyclerView = this.$this_observeData.suggestedWords;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                    TextView textView = this.$this_observeData.tvSeedPhrasePrompt;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(0);
                } else {
                    if (!(suggestedWordsState instanceof SuggestedWordsState.SuggestedWords)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SuggestedWordsState.SuggestedWords suggestedWords = (SuggestedWordsState.SuggestedWords) suggestedWordsState;
                    if (!suggestedWords.getWords().isEmpty()) {
                        FrameLayout frameLayout3 = this.$this_observeData.suggestedWordsArea;
                        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                        frameLayout3.setVisibility(0);
                        RecyclerView recyclerView2 = this.$this_observeData.suggestedWords;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                        recyclerView2.setVisibility(0);
                        RecyclerView.Adapter adapter = this.$this_observeData.suggestedWords.getAdapter();
                        SuggestedWordsAdapter suggestedWordsAdapter = adapter instanceof SuggestedWordsAdapter ? (SuggestedWordsAdapter) adapter : null;
                        if (suggestedWordsAdapter != null) {
                            suggestedWordsAdapter.setWords(suggestedWords.getWords());
                        }
                        this.$this_observeData.suggestedWords.scrollToPosition(0);
                        TextView textView2 = this.$this_observeData.tvSeedPhrasePrompt;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(8);
                    } else {
                        FrameLayout frameLayout4 = this.$this_observeData.suggestedWordsArea;
                        Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                        frameLayout4.setVisibility(4);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$this_observeData = activityWeb3SecurityWalletImportBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImportWalletActivity.this.new AnonymousClass5(this.$this_observeData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
            int label;
            final /* synthetic */ ImportWalletActivity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ImportWalletActivity importWalletActivity, ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = importWalletActivity;
                this.$this_observeData = activityWeb3SecurityWalletImportBinding;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_observeData, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$5$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06831 extends SuspendLambda implements Function2<WalletImportInputState, Continuation<? super Unit>, Object> {
                final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
                /* synthetic */ Object L$0;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06831(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super C06831> continuation) {
                    super(2, continuation);
                    this.$this_observeData = activityWeb3SecurityWalletImportBinding;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06831 c06831 = new C06831(this.$this_observeData, continuation);
                    c06831.L$0 = obj;
                    return c06831;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(WalletImportInputState walletImportInputState, Continuation<? super Unit> continuation) {
                    return ((C06831) create(walletImportInputState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    WalletImportInputState walletImportInputState;
                    WalletImportDataInputLayout walletImportDataInputLayout;
                    WalletImportDataInputLayout walletImportDataInputLayout2;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        walletImportInputState = (WalletImportInputState) this.L$0;
                        if (walletImportInputState instanceof WalletImportInputState.PrivateKeyState) {
                            WalletImportDataInputLayout walletImportDataInputLayout3 = this.$this_observeData.importDataInput;
                            List<WalletImportInputState.SeedPhraseState.WordState> listAhwBna = yDY.AhwBna();
                            this.L$0 = walletImportInputState;
                            this.label = 1;
                            if (walletImportDataInputLayout3.submitWordList(listAhwBna, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            this.$this_observeData.importDataInput.showKeyboardForPrivateKey();
                            WalletImportInputState.PrivateKeyState privateKeyState = (WalletImportInputState.PrivateKeyState) walletImportInputState;
                            this.$this_observeData.importDataInput.updatePrivateKey(privateKeyState.getText(), privateKeyState.getSelection());
                            walletImportDataInputLayout = this.$this_observeData.importDataInput;
                            this.L$0 = null;
                            this.label = 2;
                            if (walletImportDataInputLayout.awaitItemAnimatorFinished(false, this) == objCopydefault) {
                            }
                            this.$this_observeData.importDataInput.setWordListInvisible(true);
                            this.$this_observeData.importDataInput.makePrivateKeyFullyVisible();
                        } else {
                            if (!(walletImportInputState instanceof WalletImportInputState.SeedPhraseState)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.$this_observeData.importDataInput.hidePrivateKey();
                            this.$this_observeData.importDataInput.setWordListInvisible(false);
                            WalletImportDataInputLayout walletImportDataInputLayout4 = this.$this_observeData.importDataInput;
                            List<WalletImportInputState.SeedPhraseState.WordState> words = ((WalletImportInputState.SeedPhraseState) walletImportInputState).getWords();
                            this.label = 3;
                            if (walletImportDataInputLayout4.submitWordList(words, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            walletImportDataInputLayout2 = this.$this_observeData.importDataInput;
                            this.label = 4;
                            if (walletImportDataInputLayout2.awaitItemAnimatorFinished(true, this) == objCopydefault) {
                            }
                        }
                    } else if (i == 1) {
                        walletImportInputState = (WalletImportInputState) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        this.$this_observeData.importDataInput.showKeyboardForPrivateKey();
                        WalletImportInputState.PrivateKeyState privateKeyState2 = (WalletImportInputState.PrivateKeyState) walletImportInputState;
                        this.$this_observeData.importDataInput.updatePrivateKey(privateKeyState2.getText(), privateKeyState2.getSelection());
                        walletImportDataInputLayout = this.$this_observeData.importDataInput;
                        this.L$0 = null;
                        this.label = 2;
                        if (walletImportDataInputLayout.awaitItemAnimatorFinished(false, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.$this_observeData.importDataInput.setWordListInvisible(true);
                        this.$this_observeData.importDataInput.makePrivateKeyFullyVisible();
                    } else if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                        this.$this_observeData.importDataInput.setWordListInvisible(true);
                        this.$this_observeData.importDataInput.makePrivateKeyFullyVisible();
                    } else if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                        walletImportDataInputLayout2 = this.$this_observeData.importDataInput;
                        this.label = 4;
                        if (walletImportDataInputLayout2.awaitItemAnimatorFinished(true, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<WalletImportInputState> inputUiState = this.this$0.getViewModel().getInputUiState();
                    C06831 c06831 = new C06831(this.$this_observeData, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(inputUiState, c06831, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ImportWalletActivity importWalletActivity = ImportWalletActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(importWalletActivity, this.$this_observeData, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(importWalletActivity, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$this_observeData = activityWeb3SecurityWalletImportBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$this_observeData, continuation);
            anonymousClass6.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C52794wYp c52794wYpCopydefault = this.$this_observeData.confirm.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityWeb3SecurityWalletImportBinding $this_observeData;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ActivityWeb3SecurityWalletImportBinding activityWeb3SecurityWalletImportBinding, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$this_observeData = activityWeb3SecurityWalletImportBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$this_observeData, continuation);
            anonymousClass7.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass7;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                C52794wYp c52794wYp = this.$this_observeData.paste;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(z ^ true ? 0 : 8);
                C52794wYp c52794wYp2 = this.$this_observeData.clear;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(z ? 0 : 8);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$observeData$8, reason: invalid class name */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<ButtonEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8(Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass8 anonymousClass8 = ImportWalletActivity.this.new AnonymousClass8(continuation);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ButtonEvent buttonEvent, Continuation<? super Unit> continuation) {
            return ((AnonymousClass8) create(buttonEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ButtonEvent buttonEvent = (ButtonEvent) this.L$0;
                if (buttonEvent == null) {
                    return Unit.INSTANCE;
                }
                ImportWalletListener importWalletListener = ImportWalletActivity.mImportWalletListener;
                if (importWalletListener != null) {
                    importWalletListener.onButtonEvent(ImportWalletActivity.this, buttonEvent);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int color = ContextCompat.getColor(this, C52761wXj.Activity.registerUser);
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setNavigationBarColor(color);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShowTonWalletTips(final String str) {
        ImportTonWalletTipsBottomSheet importTonWalletTipsBottomSheetNewInstance = ImportTonWalletTipsBottomSheet.Companion.newInstance();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        importTonWalletTipsBottomSheetNewInstance.show(supportFragmentManager, getTAG(), new Function0() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImportWalletActivity.handleShowTonWalletTips$lambda$8(this.f$0, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleShowTonWalletTips$lambda$8(ImportWalletActivity importWalletActivity, String str) {
        importWalletActivity.getViewModel().onTonSeedPhraseTipsConfirmed(str);
        return Unit.INSTANCE;
    }

    private final void handleShowImportDialog() {
        ImportSecurityTipsBottomSheet.Companion companion = ImportSecurityTipsBottomSheet.Companion;
        if (companion.getHasShown()) {
            return;
        }
        companion.newInstance().show(getSupportFragmentManager(), getTAG());
    }

    private final void setupListener() {
        this.mOnItemClickListener = new CollisionChooseBottomSheet.OnItemClickListener() { // from class: com.okinc.web3.security.features.importing.activity.ImportWalletActivity.setupListener.1
            @Override // com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet.OnItemClickListener
            public void hdItemClick(TonAddress tonAddress) {
                if (tonAddress == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ImportWalletActivity.this), null, null, new ImportWalletActivity$setupListener$1$hdItemClick$1(ImportWalletActivity.this, tonAddress, null), 3, null);
            }

            @Override // com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet.OnItemClickListener
            public void tonItemClick(TonAddress tonAddress) {
                if (tonAddress == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ImportWalletActivity.this), null, null, new ImportWalletActivity$setupListener$1$tonItemClick$1(ImportWalletActivity.this, tonAddress, null), 3, null);
            }
        };
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mImportWalletListener = null;
        this.mOnItemClickListener = null;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
