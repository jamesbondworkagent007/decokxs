package com.okinc.web3.security.features.importing.viewmodel;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.web3.security.bridge.MnemonicValidateResult;
import com.okinc.web3.security.core.MnemonicManager;
import com.okinc.web3.security.features.importing.activity.ImportWalletActivity;
import com.okinc.web3.security.features.importing.model.SuggestedWord;
import com.okinc.web3.security.features.importing.model.SuggestedWordInput;
import com.okinc.web3.security.features.importing.model.SuggestedWordsState;
import com.okinc.web3.security.features.importing.model.WalletImportInput;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import com.okinc.web3.security.features.importing.utils.Regexes;
import com.okinc.web3.security.features.importing.utils.WalletImportUtilsKt;
import com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel;
import com.okinc.web3.security.model.ButtonEvent;
import com.okinc.web3.security.model.ImportMode;
import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.utils.WrapApi;
import com.okinc.web3.security.view.CharSequencesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33070mpX;
import o.C43246rlf;
import o.C52761wXj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C56548yJl;
import o.C57407yho;
import o.C59454zhO;
import o.C59467zhb;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletImportViewModel extends ViewModel {
    private static final String KEY_ERROR_MESSAGE = "errorMessage";
    private static final String KEY_INPUT = "input";
    private static final String TAG = "Web3SecurityWalletImportViewModel";
    private final MutableStateFlow<ButtonEvent> _onButtonEvent;
    private MutableStateFlow<TonAddress> _tonAddress;
    private final DataWrapper dataWrapper;
    private final StateFlow<ErrorMessage> errorMessageState;
    private final ImportMode importMode;
    private String importSource;
    private final StateFlow<WalletImportInput> inputFlow;
    private final StateFlow<WalletImportInputState> inputUiState;
    private final StateFlow<Boolean> isConfirmButtonEnabledState;
    private final StateFlow<Boolean> isContentNotEmptyState;
    private final MnemonicManager mnemonicManager;
    private final StateFlow<ButtonEvent> onButtonClick;
    private final Channel<Result> resultChannel;
    private final SavedStateHandle savedStateHandle;
    private final SeedPhraseWordIdGenerator seedPhraseWordIdGenerator;
    private final MutableStateFlow<Boolean> shouldShowSuggestedWords;
    private final StateFlow<SuggestedWordsState> suggestedWordsState;
    private final StateFlow<TonAddress> tonAddress;
    private final VersionGenerator versionGenerator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public interface DataWrapper {
        String wrap(@NotNull Context context, @NotNull String str);
    }

    public interface SeedPhraseWordIdGenerator {
        int generateId();
    }

    public interface VersionGenerator {
        long generateVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ErrorMessage> getErrorMessageState() {
        return this.errorMessageState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<WalletImportInputState> getInputUiState() {
        return this.inputUiState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ButtonEvent> getOnButtonClick() {
        return this.onButtonClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SuggestedWordsState> getSuggestedWordsState() {
        return this.suggestedWordsState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TonAddress> getTonAddress() {
        return this.tonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isConfirmButtonEnabledState() {
        return this.isConfirmButtonEnabledState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isContentNotEmptyState() {
        return this.isContentNotEmptyState;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public final int getWordBackground(boolean z, boolean z2, boolean z3) {
            return (z2 && z3) ? z ? C57407yho.ActionBar.EZpvd : C57407yho.ActionBar.KWHzl : z ? C57407yho.ActionBar.AEQbTJ : C57407yho.ActionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public final int getWordTextColor(boolean z) {
            return z ? C52761wXj.Activity.gLWkOL : C52761wXj.Activity.fhUrPt;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WalletImportViewModel _get_factory_$lambda$1$lambda$0(CreationExtras creationExtras) {
            Intrinsics.checkNotNullParameter(creationExtras, "");
            return new WalletImportViewModel(MnemonicManager.INSTANCE, WalletImportViewModel$Companion$factory$1$1$1.INSTANCE, WalletImportViewModel$Companion$factory$1$1$2.INSTANCE, new WalletImportViewModel$Companion$factory$1$1$3(WrapApi.INSTANCE), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean isConfirmButtonEnabled(WalletImportInput walletImportInput) {
            if (walletImportInput instanceof WalletImportInput.PrivateKey) {
                return ((WalletImportInput.PrivateKey) walletImportInput).getText().length() > 0;
            }
            if (!(walletImportInput instanceof WalletImportInput.SeedPhrase)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = ((WalletImportInput.SeedPhrase) walletImportInput).getWords().size();
            if (12 > size || size >= 25) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean isContentNotEmpty(WalletImportInput walletImportInput) {
            if (walletImportInput instanceof WalletImportInput.PrivateKey) {
                return ((WalletImportInput.PrivateKey) walletImportInput).getText().length() > 0;
            }
            if (!(walletImportInput instanceof WalletImportInput.SeedPhrase)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((WalletImportInput.SeedPhrase) walletImportInput).getWords().isEmpty()) {
            }
        }

        public final ViewModelProvider.Factory getFactory() {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(WalletImportViewModel.class), new Function1() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$Companion$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WalletImportViewModel.Companion._get_factory_$lambda$1$lambda$0((CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    public WalletImportViewModel(@NotNull MnemonicManager mnemonicManager, @NotNull SeedPhraseWordIdGenerator seedPhraseWordIdGenerator, @NotNull VersionGenerator versionGenerator, @NotNull DataWrapper dataWrapper, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(mnemonicManager, "");
        Intrinsics.checkNotNullParameter(seedPhraseWordIdGenerator, "");
        Intrinsics.checkNotNullParameter(versionGenerator, "");
        Intrinsics.checkNotNullParameter(dataWrapper, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.mnemonicManager = mnemonicManager;
        this.seedPhraseWordIdGenerator = seedPhraseWordIdGenerator;
        this.versionGenerator = versionGenerator;
        this.dataWrapper = dataWrapper;
        this.savedStateHandle = savedStateHandle;
        final StateFlow<WalletImportInput> stateFlow = savedStateHandle.getStateFlow("input", new WalletImportInput.PrivateKey("", 0, versionGenerator.generateVersion()));
        this.inputFlow = stateFlow;
        Flow<WalletImportInputState> flow = new Flow<WalletImportInputState>() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WalletImportInputState> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $$this_unsafeFlow;
                final /* synthetic */ WalletImportViewModel this$0;

                /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector, WalletImportViewModel walletImportViewModel) {
                    this.$$this_unsafeFlow = flowCollector;
                    this.this$0 = walletImportViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$$this_unsafeFlow;
                        WalletImportInputState state = this.this$0.toState((WalletImportInput) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(state, anonymousClass1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.inputUiState = FlowKt.stateIn(flow, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), toState(getInput()));
        ImportMode importMode = (ImportMode) savedStateHandle.get(ImportWalletActivity.KEY_IMPORT_MODE);
        this.importMode = importMode == null ? ImportMode.All : importMode;
        this.errorMessageState = savedStateHandle.getStateFlow("errorMessage", null);
        this.resultChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        Flow<Boolean> flow2 = new Flow<Boolean>() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $$this_unsafeFlow;
                final /* synthetic */ WalletImportViewModel this$0;

                /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector, WalletImportViewModel walletImportViewModel) {
                    this.$$this_unsafeFlow = flowCollector;
                    this.this$0 = walletImportViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$$this_unsafeFlow;
                        Boolean boolKWHzl = C56443yFo.KWHzl(WalletImportViewModel.Companion.isConfirmButtonEnabled((WalletImportInput) obj) && this.this$0.getErrorMessage() == null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolKWHzl, anonymousClass1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        Companion companion2 = Companion;
        this.isConfirmButtonEnabledState = FlowKt.stateIn(flow2, viewModelScope2, sharingStartedWhileSubscribed$default, Boolean.valueOf(companion2.isConfirmButtonEnabled(getInput())));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.shouldShowSuggestedWords = MutableStateFlow;
        this.suggestedWordsState = FlowKt.stateIn(FlowKt.combine(stateFlow, MutableStateFlow, new WalletImportViewModel$suggestedWordsState$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), !MutableStateFlow.getValue().booleanValue() ? null : getSuggestedWords(getInput()));
        this.isContentNotEmptyState = FlowKt.stateIn(FlowKt.onEach(new Flow<Boolean>() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$3
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $$this_unsafeFlow;

                /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$$this_unsafeFlow;
                        Boolean boolKWHzl = C56443yFo.KWHzl(WalletImportViewModel.Companion.isContentNotEmpty((WalletImportInput) obj));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolKWHzl, anonymousClass1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new AnonymousClass2(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), Boolean.valueOf(companion2.isContentNotEmpty(getInput())));
        MutableStateFlow<ButtonEvent> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._onButtonEvent = MutableStateFlow2;
        this.onButtonClick = FlowKt.asStateFlow(MutableStateFlow2);
        this.importSource = "input";
        MutableStateFlow<TonAddress> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._tonAddress = MutableStateFlow3;
        this.tonAddress = MutableStateFlow3;
    }

    public static final class ErrorMessage implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ErrorMessage> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<ErrorMessage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorMessage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ErrorMessage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorMessage[] newArray(int i) {
                return new ErrorMessage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorMessage.message;
            }
            return errorMessage.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorMessage copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ErrorMessage(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorMessage) && Intrinsics.EZpvd((Object) this.message, (Object) ((ErrorMessage) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ErrorMessage(message=" + this.message + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.message);
        }

        public ErrorMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface Result {

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ValidSeedPhrase implements Result {
            public static final int $stable = 0;
            private final boolean isTon;
            private final String seedPhrase;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ValidSeedPhrase copy$default(ValidSeedPhrase validSeedPhrase, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = validSeedPhrase.seedPhrase;
                }
                if ((i & 2) != 0) {
                    z = validSeedPhrase.isTon;
                }
                return validSeedPhrase.copy(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component2() {
                return this.isTon;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ValidSeedPhrase copy(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ValidSeedPhrase(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ValidSeedPhrase)) {
                    return false;
                }
                ValidSeedPhrase validSeedPhrase = (ValidSeedPhrase) obj;
                return Intrinsics.EZpvd((Object) this.seedPhrase, (Object) validSeedPhrase.seedPhrase) && this.isTon == validSeedPhrase.isTon;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSeedPhrase() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.seedPhrase.hashCode() * 31) + Boolean.hashCode(this.isTon);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean isTon() {
                return this.isTon;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidSeedPhrase(seedPhrase=" + this.seedPhrase + ", isTon=" + this.isTon + ")";
            }

            public ValidSeedPhrase(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                this.seedPhrase = str;
                this.isTon = z;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ShowTonWalletTips implements Result {
            public static final int $stable = 0;
            private final String seedPhrase;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ShowTonWalletTips copy$default(ShowTonWalletTips showTonWalletTips, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = showTonWalletTips.seedPhrase;
                }
                return showTonWalletTips.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ShowTonWalletTips copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ShowTonWalletTips(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowTonWalletTips) && Intrinsics.EZpvd((Object) this.seedPhrase, (Object) ((ShowTonWalletTips) obj).seedPhrase);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSeedPhrase() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.seedPhrase.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowTonWalletTips(seedPhrase=" + this.seedPhrase + ")";
            }

            public ShowTonWalletTips(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.seedPhrase = str;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class CollisionTips implements Result {
            public static final int $stable = 0;
            private final String seedPhrase;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CollisionTips copy$default(CollisionTips collisionTips, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = collisionTips.seedPhrase;
                }
                return collisionTips.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CollisionTips copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new CollisionTips(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CollisionTips) && Intrinsics.EZpvd((Object) this.seedPhrase, (Object) ((CollisionTips) obj).seedPhrase);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSeedPhrase() {
                return this.seedPhrase;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.seedPhrase.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CollisionTips(seedPhrase=" + this.seedPhrase + ")";
            }

            public CollisionTips(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.seedPhrase = str;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ValidPrivateKey implements Result {
            public static final int $stable = 0;
            private final String privateKey;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ValidPrivateKey copy$default(ValidPrivateKey validPrivateKey, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = validPrivateKey.privateKey;
                }
                return validPrivateKey.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.privateKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ValidPrivateKey copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ValidPrivateKey(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ValidPrivateKey) && Intrinsics.EZpvd((Object) this.privateKey, (Object) ((ValidPrivateKey) obj).privateKey);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPrivateKey() {
                return this.privateKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.privateKey.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidPrivateKey(privateKey=" + this.privateKey + ")";
            }

            public ValidPrivateKey(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.privateKey = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletImportInput getInput() {
        return this.inputFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInput(WalletImportInput walletImportInput) {
        this.savedStateHandle.set("input", walletImportInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorMessage getErrorMessage() {
        return this.errorMessageState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setErrorMessage(ErrorMessage errorMessage) {
        this.savedStateHandle.set("errorMessage", errorMessage);
    }

    public final Flow<Result> getResultEvent() {
        return FlowKt.receiveAsFlow(this.resultChannel);
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$isContentNotEmptyState$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = WalletImportViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.Z$0) {
                    WalletImportViewModel.this.importSource = "input";
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SuggestedWordsState getSuggestedWords(WalletImportInput walletImportInput) {
        if (walletImportInput instanceof WalletImportInput.PrivateKey) {
            List<String> wordsStartWith = this.mnemonicManager.getWordsStartWith(((WalletImportInput.PrivateKey) walletImportInput).getText());
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(wordsStartWith, 10));
            Iterator<T> it = wordsStartWith.iterator();
            while (it.hasNext()) {
                arrayList.add(new SuggestedWord(SuggestedWordInput.PrivateKey.INSTANCE, (String) it.next()));
            }
            return new SuggestedWordsState.SuggestedWords(arrayList);
        }
        if (!(walletImportInput instanceof WalletImportInput.SeedPhrase)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletImportInput.SeedPhrase seedPhrase = (WalletImportInput.SeedPhrase) walletImportInput;
        int selectedIndex = seedPhrase.getSelectedIndex();
        WalletImportInput.Word word = (WalletImportInput.Word) CollectionsKt___CollectionsKt.AkhnZx(seedPhrase.getWords(), selectedIndex);
        if (word == null) {
            return new SuggestedWordsState.SuggestedWords(yDY.AhwBna());
        }
        List<String> wordsStartWith2 = this.mnemonicManager.getWordsStartWith(word.getText());
        String str = (String) CollectionsKt___CollectionsKt.zuBGHE(wordsStartWith2);
        if (str != null && Intrinsics.EZpvd((Object) word.getText(), (Object) str) && seedPhrase.getWords().size() == 12 && selectedIndex == yDY.AuCTel(seedPhrase.getWords())) {
            return SuggestedWordsState.SeedPhrasePrompt.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(wordsStartWith2, 10));
        Iterator<T> it2 = wordsStartWith2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new SuggestedWord(new SuggestedWordInput.SeedPhrase(selectedIndex), (String) it2.next()));
        }
        return new SuggestedWordsState.SuggestedWords(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletImportInputState toState(WalletImportInput walletImportInput) {
        WalletImportViewModel walletImportViewModel = this;
        if (walletImportInput instanceof WalletImportInput.PrivateKey) {
            WalletImportInput.PrivateKey privateKey = (WalletImportInput.PrivateKey) walletImportInput;
            return new WalletImportInputState.PrivateKeyState(privateKey.getText(), privateKey.getSelection(), privateKey.getVersion(), walletImportViewModel.mnemonicManager.getWordsStartWith(privateKey.getText()));
        }
        if (!(walletImportInput instanceof WalletImportInput.SeedPhrase)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletImportInput.SeedPhrase seedPhrase = (WalletImportInput.SeedPhrase) walletImportInput;
        List<WalletImportInput.Word> words = seedPhrase.getWords();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(words, 10));
        int i = 0;
        for (Object obj : words) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            WalletImportInput.Word word = (WalletImportInput.Word) obj;
            boolean z = i == seedPhrase.getSelectedIndex();
            List<String> wordsStartWith = walletImportViewModel.mnemonicManager.getWordsStartWith(word.getText());
            boolean zValidateWord = walletImportViewModel.validateWord(z, wordsStartWith, word.getText());
            int id = word.getId();
            String text = word.getText();
            int selection = word.getSelection();
            String lastSuggestedWord = word.getLastSuggestedWord();
            int selectedIndex = seedPhrase.getSelectedIndex();
            Companion companion = Companion;
            arrayList.add(new WalletImportInputState.SeedPhraseState.WordState(id, text, selection, lastSuggestedWord, i, selectedIndex, wordsStartWith, companion.getWordTextColor(zValidateWord), companion.getWordBackground(z, zValidateWord, seedPhrase.isSeedPhraseValid())));
            i++;
            walletImportViewModel = this;
        }
        return new WalletImportInputState.SeedPhraseState(arrayList, seedPhrase.getVersion());
    }

    public final void setTonAddress(@NotNull TonAddress tonAddress) {
        Intrinsics.checkNotNullParameter(tonAddress, "");
        this._tonAddress.setValue(tonAddress);
    }

    public final void setErrorMsg(String str) {
        setErrorMessage(str == null ? null : new ErrorMessage(str));
    }

    private final boolean validateWord(boolean z, List<String> list, String str) {
        if (str.length() == 0) {
            return z;
        }
        if (z) {
            return !list.isEmpty();
        }
        return this.mnemonicManager.isWordLegitimate(str);
    }

    public final void setShouldShowSuggestedWords(boolean z) {
        this.shouldShowSuggestedWords.setValue(Boolean.valueOf(z));
    }

    public final void onPasteContent(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.importSource = Web3SecurityTrackEvent.VALUE_PASTE;
        onReceiveContent(charSequence);
        trackButtonClick(Web3SecurityTrackEvent.VALUE_PASTE);
    }

    private final void onReceiveContent(CharSequence charSequence) {
        if (!WalletImportUtilsKt.isPossibleSeedPhraseText$default(charSequence, false, 1, null)) {
            setErrorMessage(null);
            String string = StringsKt__StringsKt.hDKMBd((CharSequence) Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().replace(charSequence, " ")).toString();
            setInput(new WalletImportInput.PrivateKey(string, string.length(), this.versionGenerator.generateVersion()));
        } else {
            Sequence<String> sequenceSplitIntoSeedPhraseWords = WalletImportUtilsKt.splitIntoSeedPhraseWords(charSequence);
            boolean validate = this.mnemonicManager.validatePhrase(this.dataWrapper.wrap(C43246rlf.OLrzqt.valueOf(), C59467zhb.joinToString$default(sequenceSplitIntoSeedPhraseWords, " ", null, null, 0, null, null, 62, null))).getValidate();
            setErrorMessage(validate ? null : new ErrorMessage(C33070mpX.AYXKKw(C57407yho.Activity.iwGUEr)));
            setInput(new WalletImportInput.SeedPhrase(C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(sequenceSplitIntoSeedPhraseWords, new Function1() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WalletImportViewModel.onReceiveContent$lambda$8(this.f$0, (String) obj);
                }
            })), -1, validate, this.versionGenerator.generateVersion()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletImportInput.Word onReceiveContent$lambda$8(WalletImportViewModel walletImportViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletImportInput.Word(walletImportViewModel.seedPhraseWordIdGenerator.generateId(), str, str.length(), walletImportViewModel.mnemonicManager.isWordLegitimate(str) ? str : null);
    }

    public final void onPrivateKeyChanged(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        setErrorMessage(null);
        int selectionEnd = Selection.getSelectionEnd(charSequence2);
        boolean z = selectionEnd == -1 || selectionEnd == charSequence2.length();
        boolean z2 = charSequence2.length() <= charSequence.length();
        if (!z || z2) {
            Editable editableWithSelection = CharSequencesKt.toEditableWithSelection(charSequence2);
            CharSequencesKt.trimMaintainingSelection(editableWithSelection);
            setInput(new WalletImportInput.PrivateKey(Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().replace(editableWithSelection, " "), Selection.getSelectionEnd(editableWithSelection), this.versionGenerator.generateVersion()));
            return;
        }
        if (!WalletImportUtilsKt.isPossibleSeedPhraseText$default(charSequence2, false, 1, null)) {
            Editable editableWithSelection2 = CharSequencesKt.toEditableWithSelection(charSequence2);
            CharSequencesKt.trimMaintainingSelection(editableWithSelection2);
            setInput(new WalletImportInput.PrivateKey(Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().replace(editableWithSelection2, " "), Selection.getSelectionEnd(editableWithSelection2), this.versionGenerator.generateVersion()));
            return;
        }
        Sequence<String> sequenceSplitIntoSeedPhraseWords = WalletImportUtilsKt.splitIntoSeedPhraseWords(charSequence2);
        ArrayList arrayList = new ArrayList();
        for (String str : sequenceSplitIntoSeedPhraseWords) {
            arrayList.add(new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), str, str.length(), this.mnemonicManager.isWordLegitimate(str) ? str : null));
        }
        Character chGHZMYf = C59454zhO.gHZMYf(charSequence2);
        if (chGHZMYf != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf.charValue()) && arrayList.size() < 24) {
            arrayList.add(new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), "", 0, null));
        }
        setInput(new WalletImportInput.SeedPhrase(arrayList, yDY.AuCTel(arrayList), true, this.versionGenerator.generateVersion()));
    }

    public final void onClearContent() {
        setErrorMessage(null);
        trackButtonClick(Web3SecurityTrackEvent.VALUE_CLEAR);
        setInput(new WalletImportInput.PrivateKey("", 0, this.versionGenerator.generateVersion()));
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$trackButtonClick$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $buttonName;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17611(String str, Continuation<? super C17611> continuation) {
            super(2, continuation);
            this.$buttonName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletImportViewModel.this.new C17611(this.$buttonName, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                ButtonEvent buttonEvent = new ButtonEvent(this.$buttonName, null, null);
                this.label = 1;
                if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
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

    private final void trackButtonClick(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C17611(str, null), 3, null);
    }

    public final void onSeedPhraseWordChanged(int i, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        WalletImportInput.Word word;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        String str = null;
        setErrorMessage(null);
        WalletImportInput input = getInput();
        WalletImportInput.SeedPhrase seedPhrase = input instanceof WalletImportInput.SeedPhrase ? (WalletImportInput.SeedPhrase) input : null;
        if (seedPhrase == null) {
            return;
        }
        if (i < 0 || i >= seedPhrase.getWords().size()) {
            pUU.copydefault(TAG, "onSeedPhraseWordChanged: index " + i + " is out of bounds");
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(charSequence2);
        boolean z = selectionEnd == -1 || selectionEnd == charSequence2.length();
        boolean z2 = charSequence2.length() <= charSequence.length();
        List<WalletImportInput.Word> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) seedPhrase.getWords());
        if (i != yDY.AuCTel(seedPhrase.getWords())) {
            if (!z || z2) {
                Editable editableWithSelection = CharSequencesKt.toEditableWithSelection(charSequence2);
                for (int iFIwbmz = StringsKt__StringsKt.fIwbmz(editableWithSelection); -1 < iFIwbmz; iFIwbmz--) {
                    if (CharsKt__CharJVMKt.EZpvd(editableWithSelection.charAt(iFIwbmz))) {
                        editableWithSelection.delete(iFIwbmz, iFIwbmz + 1);
                    }
                }
                if (editableWithSelection.length() > 10) {
                    editableWithSelection.delete(10, editableWithSelection.length());
                }
                listFJNWhG.set(i, WalletImportInput.Word.copy$default(listFJNWhG.get(i), 0, editableWithSelection.toString(), Selection.getSelectionEnd(editableWithSelection), null, 9, null));
                setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, listFJNWhG, 0, true, this.versionGenerator.generateVersion(), 2, null));
                return;
            }
            String strAkhnZx = C59454zhO.AkhnZx(Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().replace(charSequence2, ""), 10);
            listFJNWhG.set(i, WalletImportInput.Word.copy$default(listFJNWhG.get(i), 0, strAkhnZx, strAkhnZx.length(), null, 9, null));
            Character chGHZMYf = C59454zhO.gHZMYf(charSequence2);
            if (chGHZMYf != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf.charValue())) {
                int i2 = i + 1;
                WalletImportInput.Word word2 = (WalletImportInput.Word) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i2);
                if (word2 != null && StringsKt__StringsKt.fARcdN((CharSequence) word2.getText())) {
                    setInput(seedPhrase.copy(listFJNWhG, i2, true, this.versionGenerator.generateVersion()));
                    return;
                } else if (listFJNWhG.size() < 24) {
                    listFJNWhG.add(i2, new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), "", 0, null));
                    setInput(seedPhrase.copy(listFJNWhG, i2, true, this.versionGenerator.generateVersion()));
                    return;
                } else {
                    setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, listFJNWhG, 0, true, this.versionGenerator.generateVersion(), 2, null));
                    return;
                }
            }
            setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, listFJNWhG, 0, true, this.versionGenerator.generateVersion(), 2, null));
            return;
        }
        if (!z || z2) {
            Editable editableWithSelection2 = CharSequencesKt.toEditableWithSelection(charSequence2);
            for (int iFIwbmz2 = StringsKt__StringsKt.fIwbmz(editableWithSelection2); -1 < iFIwbmz2; iFIwbmz2--) {
                if (CharsKt__CharJVMKt.EZpvd(editableWithSelection2.charAt(iFIwbmz2))) {
                    editableWithSelection2.delete(iFIwbmz2, iFIwbmz2 + 1);
                }
            }
            if (editableWithSelection2.length() > 10) {
                editableWithSelection2.delete(10, editableWithSelection2.length());
            }
            listFJNWhG.set(i, WalletImportInput.Word.copy$default(listFJNWhG.get(i), 0, editableWithSelection2.toString(), Selection.getSelectionEnd(editableWithSelection2), null, 9, null));
            setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, listFJNWhG, 0, true, this.versionGenerator.generateVersion(), 2, null));
            return;
        }
        if (!WalletImportUtilsKt.isPossibleSeedPhraseText(charSequence2, false)) {
            String strAkhnZx2 = C59454zhO.AkhnZx(Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().replace(charSequence2, ""), 10);
            listFJNWhG.set(i, WalletImportInput.Word.copy$default(listFJNWhG.get(i), 0, strAkhnZx2, strAkhnZx2.length(), null, 1, null));
            setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, listFJNWhG, 0, true, this.versionGenerator.generateVersion(), 2, null));
            return;
        }
        List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.AYXKKw(WalletImportUtilsKt.splitIntoSeedPhraseWords(charSequence2), 24 - (listFJNWhG.size() - 1)));
        WalletImportInput.Word word3 = listFJNWhG.get(i);
        listFJNWhG.remove(i);
        int i3 = 0;
        for (Object obj : listZuBGHE) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            String str2 = (String) obj;
            if (i3 == 0) {
                word = WalletImportInput.Word.copy$default(word3, 0, str2, str2.length(), this.mnemonicManager.isWordLegitimate(str2) ? str2 : str, 1, null);
            } else {
                word = new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), str2, str2.length(), this.mnemonicManager.isWordLegitimate(str2) ? str2 : null);
            }
            listFJNWhG.add(word);
            i3++;
            str = null;
        }
        Character chGHZMYf2 = C59454zhO.gHZMYf(charSequence2);
        if (chGHZMYf2 != null && CharsKt__CharJVMKt.EZpvd(chGHZMYf2.charValue()) && listFJNWhG.size() < 24) {
            listFJNWhG.add(new WalletImportInput.Word(listZuBGHE.isEmpty() ? word3.getId() : this.seedPhraseWordIdGenerator.generateId(), "", 0, null));
        }
        setInput(seedPhrase.copy(listFJNWhG, yDY.AuCTel(listFJNWhG), true, this.versionGenerator.generateVersion()));
    }

    public final void acceptSuggestionForSeedPhrase(int i, @NotNull String str) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "");
        setErrorMessage(null);
        WalletImportInput input = getInput();
        WalletImportInput.SeedPhrase seedPhrase = input instanceof WalletImportInput.SeedPhrase ? (WalletImportInput.SeedPhrase) input : null;
        if (seedPhrase == null) {
            return;
        }
        if (i < 0 || i >= seedPhrase.getWords().size()) {
            pUU.copydefault(TAG, "acceptSuggestionForSeedPhrase: index " + i + " is out of bounds");
            return;
        }
        List<WalletImportInput.Word> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) seedPhrase.getWords());
        listFJNWhG.set(i, WalletImportInput.Word.copy$default(listFJNWhG.get(i), 0, str, str.length(), str, 1, null));
        int i3 = i + 1;
        WalletImportInput.Word word = (WalletImportInput.Word) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i3);
        if (word == null || word.getText().length() != 0) {
            if (listFJNWhG.size() != 12 || i != yDY.AuCTel(listFJNWhG)) {
                if (listFJNWhG.size() < 24) {
                    listFJNWhG.add(i3, new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), "", 0, null));
                    i2 = i3;
                } else if (listFJNWhG.size() == 24) {
                    i = -1;
                }
            }
            i2 = i;
        } else {
            i2 = i3;
        }
        setInput(seedPhrase.copy(listFJNWhG, i2, true, this.versionGenerator.generateVersion()));
    }

    public final void acceptSuggestionForPrivateKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setErrorMessage(null);
        if (getInput() instanceof WalletImportInput.PrivateKey) {
            setInput(new WalletImportInput.SeedPhrase(yDY.gEmmrt(new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), str, str.length(), str), new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), "", 0, null)), 1, true, this.versionGenerator.generateVersion()));
        }
    }

    public final void onSeedPhraseWordFocusGained(int i) {
        WalletImportInput input = getInput();
        WalletImportInput.SeedPhrase seedPhrase = input instanceof WalletImportInput.SeedPhrase ? (WalletImportInput.SeedPhrase) input : null;
        if (seedPhrase == null) {
            return;
        }
        if (i < 0 || i >= seedPhrase.getWords().size()) {
            pUU.copydefault(TAG, "onSeedPhraseWordFocusGained: index " + i + " is out of bounds");
            return;
        }
        List<WalletImportInput.Word> words = seedPhrase.getWords();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(words, 10));
        int i2 = 0;
        for (Object obj : words) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            WalletImportInput.Word wordCopy$default = (WalletImportInput.Word) obj;
            if (i2 == i) {
                wordCopy$default = WalletImportInput.Word.copy$default(wordCopy$default, 0, null, -1, null, 11, null);
            }
            arrayList.add(wordCopy$default);
            i2++;
        }
        setInput(WalletImportInput.SeedPhrase.copy$default(seedPhrase, arrayList, i, false, this.versionGenerator.generateVersion(), 4, null));
    }

    public final void onSeedPhraseWordDeleted(int i) {
        setErrorMessage(null);
        WalletImportInput input = getInput();
        WalletImportInput.SeedPhrase seedPhrase = input instanceof WalletImportInput.SeedPhrase ? (WalletImportInput.SeedPhrase) input : null;
        if (seedPhrase == null) {
            return;
        }
        if (i < 0 || i >= seedPhrase.getWords().size()) {
            pUU.copydefault(TAG, "onSeedPhraseWordDeleted: index " + i + " is out of bounds");
            return;
        }
        List<WalletImportInput.Word> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) seedPhrase.getWords());
        if (listFJNWhG.size() == 1) {
            setInput(new WalletImportInput.PrivateKey("", 0, this.versionGenerator.generateVersion()));
            return;
        }
        listFJNWhG.remove(i);
        int iCopydefault = C56548yJl.copydefault(i - 1, 0);
        listFJNWhG.set(iCopydefault, WalletImportInput.Word.copy$default(listFJNWhG.get(iCopydefault), 0, null, listFJNWhG.get(iCopydefault).getText().length(), null, 11, null));
        setInput(seedPhrase.copy(listFJNWhG, iCopydefault, true, this.versionGenerator.generateVersion()));
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$onConfirmClicked$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletImportViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x01fc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            WalletImportInput input;
            boolean zBooleanValue;
            Boolean boolKWHzl;
            Boolean bool;
            String str;
            MutableStateFlow mutableStateFlow;
            ButtonEvent buttonEvent;
            Object objCopydefault = C56442yFn.copydefault();
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    input = WalletImportViewModel.this.getInput();
                    if (input instanceof WalletImportInput.PrivateKey) {
                        if (WalletImportViewModel.this.importMode.contain(ImportMode.PrivateKey)) {
                            String strWrap = WalletImportViewModel.this.dataWrapper.wrap(C43246rlf.OLrzqt.valueOf(), StringsKt__StringsKt.hDKMBd((CharSequence) ((WalletImportInput.PrivateKey) input).getText()).toString());
                            Channel channel = WalletImportViewModel.this.resultChannel;
                            Result.ValidPrivateKey validPrivateKey = new Result.ValidPrivateKey(strWrap);
                            this.label = 1;
                            if (channel.send(validPrivateKey, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            WalletImportViewModel.this.setErrorMessage(new ErrorMessage(C33070mpX.AYXKKw(C57407yho.Activity.iwGUEr)));
                        }
                        str = Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
                        mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                        buttonEvent = new ButtonEvent(Web3SecurityTrackEvent.VALUE_CONFIRM, str, WalletImportViewModel.this.importSource);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                        if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (input instanceof WalletImportInput.SeedPhrase) {
                        boolean zContain = WalletImportViewModel.this.importMode.contain(ImportMode.SeedPhraseNormal);
                        boolean zContain2 = WalletImportViewModel.this.importMode.contain(ImportMode.SeedPhraseTON);
                        zBooleanValue = false;
                        if (zContain || zContain2) {
                            List<WalletImportInput.Word> words = ((WalletImportInput.SeedPhrase) input).getWords();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : words) {
                                if (((WalletImportInput.Word) obj2).getText().length() > 0) {
                                    arrayList.add(obj2);
                                }
                            }
                            String strWrap2 = WalletImportViewModel.this.dataWrapper.wrap(C43246rlf.OLrzqt.valueOf(), CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, new Function1() { // from class: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$onConfirmClicked$1$$ExternalSyntheticLambda0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return WalletImportViewModel.AnonymousClass1.invokeSuspend$lambda$1((WalletImportInput.Word) obj3);
                                }
                            }, 30, null));
                            MnemonicValidateResult mnemonicValidateResultValidatePhrase = WalletImportViewModel.this.mnemonicManager.validatePhrase(strWrap2);
                            boolKWHzl = C56443yFo.KWHzl(mnemonicValidateResultValidatePhrase.getValidate());
                            WalletImportViewModel walletImportViewModel = WalletImportViewModel.this;
                            if (!boolKWHzl.booleanValue()) {
                                walletImportViewModel.setErrorMessage(new ErrorMessage(C33070mpX.AYXKKw(C57407yho.Activity.iwGUEr)));
                            } else {
                                int type = mnemonicValidateResultValidatePhrase.getType();
                                if (type != 1) {
                                    if (type == 2) {
                                        if (zContain && zContain2) {
                                            Channel channel2 = walletImportViewModel.resultChannel;
                                            Result.CollisionTips collisionTips = new Result.CollisionTips(strWrap2);
                                            this.L$0 = input;
                                            this.L$1 = boolKWHzl;
                                            this.label = 2;
                                            if (channel2.send(collisionTips, this) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        } else if (zContain) {
                                            Channel channel3 = walletImportViewModel.resultChannel;
                                            Result.ValidSeedPhrase validSeedPhrase = new Result.ValidSeedPhrase(strWrap2, false);
                                            this.L$0 = input;
                                            this.L$1 = boolKWHzl;
                                            this.label = 3;
                                            if (channel3.send(validSeedPhrase, this) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        } else if (zContain2) {
                                            Channel channel4 = walletImportViewModel.resultChannel;
                                            Result.ShowTonWalletTips showTonWalletTips = new Result.ShowTonWalletTips(strWrap2);
                                            this.L$0 = input;
                                            this.L$1 = boolKWHzl;
                                            this.label = 4;
                                            if (channel4.send(showTonWalletTips, this) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        }
                                        bool = boolKWHzl;
                                        boolKWHzl = bool;
                                    } else if (zContain) {
                                        Channel channel5 = walletImportViewModel.resultChannel;
                                        Result.ValidSeedPhrase validSeedPhrase2 = new Result.ValidSeedPhrase(strWrap2, false);
                                        this.L$0 = input;
                                        this.L$1 = boolKWHzl;
                                        this.label = 6;
                                        if (channel5.send(validSeedPhrase2, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        bool = boolKWHzl;
                                        boolKWHzl = bool;
                                    }
                                } else if (zContain2) {
                                    Channel channel6 = walletImportViewModel.resultChannel;
                                    Result.ShowTonWalletTips showTonWalletTips2 = new Result.ShowTonWalletTips(strWrap2);
                                    this.L$0 = input;
                                    this.L$1 = boolKWHzl;
                                    this.label = 5;
                                    if (channel6.send(showTonWalletTips2, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    bool = boolKWHzl;
                                    boolKWHzl = bool;
                                } else {
                                    walletImportViewModel.setErrorMessage(new ErrorMessage(C33070mpX.AYXKKw(C57407yho.Activity.valueOf)));
                                }
                                mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                                buttonEvent = new ButtonEvent(Web3SecurityTrackEvent.VALUE_CONFIRM, str, WalletImportViewModel.this.importSource);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 7;
                                if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
                                }
                                return Unit.INSTANCE;
                            }
                            zBooleanValue = boolKWHzl.booleanValue();
                        }
                        WalletImportViewModel walletImportViewModel2 = WalletImportViewModel.this;
                        walletImportViewModel2.setInput(WalletImportInput.SeedPhrase.copy$default((WalletImportInput.SeedPhrase) input, null, -1, zBooleanValue, walletImportViewModel2.versionGenerator.generateVersion(), 1, null));
                        str = Web3SecurityTrackEvent.VALUE_SEED_PHRASE;
                        mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                        buttonEvent = new ButtonEvent(Web3SecurityTrackEvent.VALUE_CONFIRM, str, WalletImportViewModel.this.importSource);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                        if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                    throw new NoWhenBranchMatchedException();
                case 1:
                    C56391yDq.AEQbTJ(obj);
                    str = Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
                    mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                    buttonEvent = new ButtonEvent(Web3SecurityTrackEvent.VALUE_CONFIRM, str, WalletImportViewModel.this.importSource);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 7;
                    if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    bool = (Boolean) this.L$1;
                    input = (WalletImportInput) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    boolKWHzl = bool;
                    zBooleanValue = boolKWHzl.booleanValue();
                    WalletImportViewModel walletImportViewModel22 = WalletImportViewModel.this;
                    walletImportViewModel22.setInput(WalletImportInput.SeedPhrase.copy$default((WalletImportInput.SeedPhrase) input, null, -1, zBooleanValue, walletImportViewModel22.versionGenerator.generateVersion(), 1, null));
                    str = Web3SecurityTrackEvent.VALUE_SEED_PHRASE;
                    mutableStateFlow = WalletImportViewModel.this._onButtonEvent;
                    buttonEvent = new ButtonEvent(Web3SecurityTrackEvent.VALUE_CONFIRM, str, WalletImportViewModel.this.importSource);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 7;
                    if (mutableStateFlow.emit(buttonEvent, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$1(WalletImportInput.Word word) {
            return StringsKt__StringsKt.hDKMBd((CharSequence) word.getText()).toString();
        }
    }

    public final void onConfirmClicked() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.viewmodel.WalletImportViewModel$onTonSeedPhraseTipsConfirmed$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $seedPhrase;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17601(String str, Continuation<? super C17601> continuation) {
            super(2, continuation);
            this.$seedPhrase = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WalletImportViewModel.this.new C17601(this.$seedPhrase, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Channel channel = WalletImportViewModel.this.resultChannel;
                Result.ValidSeedPhrase validSeedPhrase = new Result.ValidSeedPhrase(this.$seedPhrase, true);
                this.label = 1;
                if (channel.send(validSeedPhrase, this) == objCopydefault) {
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

    public final void onTonSeedPhraseTipsConfirmed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C17601(str, null), 3, null);
    }

    public final void moveToNextWord(int i) {
        int i2;
        setErrorMessage(null);
        WalletImportInput input = getInput();
        WalletImportInput.SeedPhrase seedPhrase = input instanceof WalletImportInput.SeedPhrase ? (WalletImportInput.SeedPhrase) input : null;
        if (seedPhrase == null) {
            return;
        }
        if (i < 0 || i >= seedPhrase.getWords().size()) {
            pUU.copydefault(TAG, "moveToNextWord: index " + i + " is out of bounds");
            return;
        }
        List<WalletImportInput.Word> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) seedPhrase.getWords());
        int i3 = i + 1;
        WalletImportInput.Word word = (WalletImportInput.Word) CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, i3);
        if (word != null && word.getText().length() == 0) {
            i2 = i3;
        } else if (listFJNWhG.size() < 24) {
            listFJNWhG.add(i3, new WalletImportInput.Word(this.seedPhraseWordIdGenerator.generateId(), "", 0, null));
            i2 = i3;
        } else {
            if (listFJNWhG.size() == 24) {
                i = -1;
            }
            i2 = i;
        }
        setInput(seedPhrase.copy(listFJNWhG, i2, true, this.versionGenerator.generateVersion()));
    }
}
