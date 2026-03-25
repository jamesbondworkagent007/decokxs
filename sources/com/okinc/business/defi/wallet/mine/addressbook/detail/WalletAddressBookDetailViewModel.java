package com.okinc.business.defi.wallet.mine.addressbook.detail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC11252cHi;
import o.InterfaceC18734fnw;
import o.InterfaceC56445yFq;
import o.Point;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel extends ViewModel {
    public final MutableStateFlow<AddressBookEntity> AEQbTJ;
    public final StateFlow<AddressInputFieldState> AYXKKw;
    public final InterfaceC11252cHi AhwBna;
    public final StateFlow<AddressBookEntity> AkhnZx;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<Point<Unit>> EZpvd;
    public final MutableStateFlow<List<AddressChainUiData>> KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final MutableStateFlow<String> copydefault;
    public final StateFlow<Point<Unit>> djBIcL;
    public final StateFlow<String> fARcdN;
    public final C13934dbu fIwbmz;
    public final StateFlow<NameInputFieldState> fJNWhG;
    public final InterfaceC18734fnw fetchVPNInfo;
    public final StateFlow<String> gEmmrt;
    public final String isConnected;
    public final StateFlow<List<AddressChainUiData>> valueOf;
    public final CoroutineDispatcher values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<NameInputFieldState> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<Unit>> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AddressInputFieldState> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<AddressChainUiData>> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AddressBookEntity> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> valueOf() {
        return this.fARcdN;
    }

    @yCM
    public WalletAddressBookDetailViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC18734fnw interfaceC18734fnw, @NotNull InterfaceC11252cHi interfaceC11252cHi, @NotNull C13934dbu c13934dbu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC18734fnw, "");
        Intrinsics.checkNotNullParameter(interfaceC11252cHi, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = interfaceC18734fnw;
        this.AhwBna = interfaceC11252cHi;
        this.fIwbmz = c13934dbu;
        this.values = coroutineDispatcher;
        this.isConnected = (String) savedStateHandle.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.OLrzqt = MutableStateFlow;
        StateFlow<String> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.fARcdN = stateFlowAsStateFlow;
        Flow flowMapLatest = FlowKt.mapLatest(stateFlowAsStateFlow, new WalletAddressBookDetailViewModel$nameInputFieldState$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<NameInputFieldState> stateFlowStateIn = FlowKt.stateIn(flowMapLatest, viewModelScope, companion.getEagerly(), NameInputFieldState.ActionBar.copydefault);
        this.fJNWhG = stateFlowStateIn;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.copydefault = MutableStateFlow2;
        StateFlow<String> stateFlowAsStateFlow2 = FlowKt.asStateFlow(MutableStateFlow2);
        this.gEmmrt = stateFlowAsStateFlow2;
        StateFlow<AddressInputFieldState> stateFlowStateIn2 = FlowKt.stateIn(FlowKt.transformLatest(stateFlowAsStateFlow2, new WalletAddressBookDetailViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), AddressInputFieldState.Application.AEQbTJ);
        this.AYXKKw = stateFlowStateIn2;
        MutableStateFlow<List<AddressChainUiData>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow3;
        StateFlow<List<AddressChainUiData>> stateFlowAsStateFlow3 = FlowKt.asStateFlow(MutableStateFlow3);
        this.valueOf = stateFlowAsStateFlow3;
        this.DbNXlk = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, stateFlowStateIn2, stateFlowAsStateFlow3, new WalletAddressBookDetailViewModel$buttonEnabledState$1(null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), Boolean.FALSE);
        MutableStateFlow<AddressBookEntity> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow4;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Point<Unit>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow5;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow5);
        AhwBna();
    }

    public final void AhwBna() {
        String str = this.isConnected;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletAddressBookDetailViewModel$setupExistingAddressBook$1$1(this, str, null), 3, null);
        }
    }

    public final NameInputFieldState EZpvd(String str) {
        if (str.length() == 0) {
            return new NameInputFieldState.Activity(NameInputFieldState.NameInputFieldError.EMPTY_NAME);
        }
        if (str.length() > 20) {
            return new NameInputFieldState.Activity(NameInputFieldState.NameInputFieldError.MAX_20_CHARACTERS);
        }
        return NameInputFieldState.ActionBar.copydefault;
    }

    public final Object OLrzqt(String str, Continuation<? super Flow<? extends AddressInputFieldState>> continuation) {
        return FlowKt.m7441catch(FlowKt.flow(new WalletAddressBookDetailViewModel$checkAddressFieldState$2(str, this, null)), new WalletAddressBookDetailViewModel$checkAddressFieldState$3(null));
    }

    public final Object OLrzqt(String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AbstractC43419rot<? extends List<AddressChainUiData>, Unit>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletAddressBookDetailViewModel$handleExistingAddressBook$2(this, str, function1, null), continuation);
    }

    public final void gEmmrt() {
        String value = this.fARcdN.getValue();
        String value2 = this.gEmmrt.getValue();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<AddressChainUiData> value3 = this.valueOf.getValue();
        ArrayList<AddressChainUiData> arrayList3 = new ArrayList();
        for (Object obj : value3) {
            if (((AddressChainUiData) obj).AhwBna()) {
                arrayList3.add(obj);
            }
        }
        for (AddressChainUiData addressChainUiData : arrayList3) {
            arrayList.add(addressChainUiData.EZpvd());
            arrayList2.add(addressChainUiData.copydefault());
        }
        AddressBookEntity addressBookEntity = new AddressBookEntity(value, value2, arrayList, arrayList2, System.currentTimeMillis(), System.currentTimeMillis(), 0, false, 192, null);
        MutableStateFlow<Point<Unit>> mutableStateFlow = this.EZpvd;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Point.StateListAnimator(null, 1, null))) {
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletAddressBookDetailViewModel$insertOrUpdateAddressBook$4(addressBookEntity, this, value2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super Result<Unit>> continuation) throws Throwable {
        WalletAddressBookDetailViewModel$deleteAddressBook$1 walletAddressBookDetailViewModel$deleteAddressBook$1;
        if (continuation instanceof WalletAddressBookDetailViewModel$deleteAddressBook$1) {
            walletAddressBookDetailViewModel$deleteAddressBook$1 = (WalletAddressBookDetailViewModel$deleteAddressBook$1) continuation;
            int i = walletAddressBookDetailViewModel$deleteAddressBook$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAddressBookDetailViewModel$deleteAddressBook$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAddressBookDetailViewModel$deleteAddressBook$1 = new WalletAddressBookDetailViewModel$deleteAddressBook$1(this, continuation);
            }
        }
        Object obj = walletAddressBookDetailViewModel$deleteAddressBook$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletAddressBookDetailViewModel$deleteAddressBook$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                String str = this.isConnected;
                if (str == null) {
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new IllegalStateException("existing address book is null")));
                }
                InterfaceC11252cHi interfaceC11252cHi = this.AhwBna;
                walletAddressBookDetailViewModel$deleteAddressBook$1.label = 1;
                if (interfaceC11252cHi.KWHzl(str, walletAddressBookDetailViewModel$deleteAddressBook$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static abstract class NameInputFieldState {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel.NameInputFieldState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ NameInputFieldState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NameInputFieldError {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ NameInputFieldError[] $VALUES;
            public static final NameInputFieldError EMPTY_NAME = new NameInputFieldError("EMPTY_NAME", 0);
            public static final NameInputFieldError MAX_20_CHARACTERS = new NameInputFieldError("MAX_20_CHARACTERS", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ NameInputFieldError[] $values() {
                return new NameInputFieldError[]{EMPTY_NAME, MAX_20_CHARACTERS};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<NameInputFieldError> getEntries() {
                return $ENTRIES;
            }

            private NameInputFieldError(String str, int i) {
            }

            static {
                NameInputFieldError[] nameInputFieldErrorArr$values = $values();
                $VALUES = nameInputFieldErrorArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(nameInputFieldErrorArr$values);
            }

            public static NameInputFieldError valueOf(String str) {
                return (NameInputFieldError) Enum.valueOf(NameInputFieldError.class, str);
            }

            public static NameInputFieldError[] values() {
                return (NameInputFieldError[]) $VALUES.clone();
            }
        }

        private NameInputFieldState() {
        }

        public static final class ActionBar extends NameInputFieldState {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class Activity extends NameInputFieldState {
            public final NameInputFieldError KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, NameInputFieldError nameInputFieldError, int i, Object obj) {
                if ((i & 1) != 0) {
                    nameInputFieldError = activity.KWHzl;
                }
                return activity.OLrzqt(nameInputFieldError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final NameInputFieldError KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull NameInputFieldError nameInputFieldError) {
                Intrinsics.checkNotNullParameter(nameInputFieldError, "");
                return new Activity(nameInputFieldError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InvalidInput(error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull NameInputFieldError nameInputFieldError) {
                super(null);
                Intrinsics.checkNotNullParameter(nameInputFieldError, "");
                this.KWHzl = nameInputFieldError;
            }
        }

        public final boolean EZpvd() {
            return this instanceof ActionBar;
        }
    }

    public static abstract class AddressInputFieldState {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel.AddressInputFieldState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ AddressInputFieldState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class AddressInputFieldError {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ AddressInputFieldError[] $VALUES;
            public static final AddressInputFieldError EMPTY_ADDRESS = new AddressInputFieldError("EMPTY_ADDRESS", 0);
            public static final AddressInputFieldError DUPLICATE_ADDRESS = new AddressInputFieldError("DUPLICATE_ADDRESS", 1);
            public static final AddressInputFieldError WRONG_ADDRESS = new AddressInputFieldError("WRONG_ADDRESS", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ AddressInputFieldError[] $values() {
                return new AddressInputFieldError[]{EMPTY_ADDRESS, DUPLICATE_ADDRESS, WRONG_ADDRESS};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<AddressInputFieldError> getEntries() {
                return $ENTRIES;
            }

            private AddressInputFieldError(String str, int i) {
            }

            static {
                AddressInputFieldError[] addressInputFieldErrorArr$values = $values();
                $VALUES = addressInputFieldErrorArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(addressInputFieldErrorArr$values);
            }

            public static AddressInputFieldError valueOf(String str) {
                return (AddressInputFieldError) Enum.valueOf(AddressInputFieldError.class, str);
            }

            public static AddressInputFieldError[] values() {
                return (AddressInputFieldError[]) $VALUES.clone();
            }
        }

        private AddressInputFieldState() {
        }

        public static final class Application extends AddressInputFieldState {
            public static final Application AEQbTJ = new Application();

            private Application() {
                super(null);
            }
        }

        public static final class StateListAnimator extends AddressInputFieldState {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        public static final class Activity extends AddressInputFieldState {
            public final AddressInputFieldError KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, AddressInputFieldError addressInputFieldError, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressInputFieldError = activity.KWHzl;
                }
                return activity.copydefault(addressInputFieldError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AddressInputFieldError AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull AddressInputFieldError addressInputFieldError) {
                Intrinsics.checkNotNullParameter(addressInputFieldError, "");
                return new Activity(addressInputFieldError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InvalidInput(error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull AddressInputFieldError addressInputFieldError) {
                super(null);
                Intrinsics.checkNotNullParameter(addressInputFieldError, "");
                this.KWHzl = addressInputFieldError;
            }
        }

        public static final class ActionBar extends AddressInputFieldState {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class TaskDescription extends AddressInputFieldState {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(String str) {
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnknownError(message=" + this.KWHzl + ")";
            }

            public TaskDescription(String str) {
                super(null);
                this.KWHzl = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:276) call: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel.AddressInputFieldState.TaskDescription.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ TaskDescription(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }

        public final boolean KWHzl() {
            return this instanceof StateListAnimator;
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<String> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), str)) {
        }
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<String> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), str)) {
        }
    }

    public final void OLrzqt(@NotNull List<AddressChainUiData> list) {
        List<AddressChainUiData> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((AddressChainUiData) it.next()).OLrzqt()));
        }
        Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        MutableStateFlow<List<AddressChainUiData>> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            List<AddressChainUiData> list2 = value;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (AddressChainUiData addressChainUiData : list2) {
                arrayList.add(addressChainUiData.EZpvd((255 & 1) != 0 ? addressChainUiData.AEQbTJ : null, (255 & 2) != 0 ? addressChainUiData.EZpvd : 0L, (255 & 4) != 0 ? addressChainUiData.KWHzl : null, (255 & 8) != 0 ? addressChainUiData.gEmmrt : false, (255 & 16) != 0 ? addressChainUiData.AYXKKw : false, (255 & 32) != 0 ? addressChainUiData.OLrzqt : false, (255 & 64) != 0 ? addressChainUiData.copydefault : false, (255 & 128) != 0 ? addressChainUiData.AhwBna : setOqFWZa.contains(Long.valueOf(addressChainUiData.OLrzqt()))));
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }
}
