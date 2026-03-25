package com.okinc.okex.uploadlog.viewmodel;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C44078sCn;
import o.C44081sCq;
import o.C44083sCs;
import o.C44084sCt;
import o.C44085sCu;
import o.C44086sCv;
import o.C44089sCy;
import o.C44090sCz;
import o.C44760scx;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sCP;
import o.sCR;
import o.sCT;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final String KWHzl;
    public final MutableStateFlow<List<Uri>> AEQbTJ;
    public final MutableLiveData<C32989mnw<String>> AYXKKw;
    public final StateFlow<List<FormElementDisplayModel>> AhwBna;
    public final C44083sCs AkhnZx;
    public final C44086sCv AuCTel;
    public final C44084sCt DbNXlk;
    public final MutableStateFlow<Map<String, ElementValue>> OLrzqt;
    public final ConcurrentHashMap<String, MutableStateFlow<ElementValue>> copydefault;
    public final C44081sCq djBIcL;
    public final C44090sCz fARcdN;
    public final C44085sCu fetchVPNInfo;
    public final MutableStateFlow<TaskDescription> gEmmrt;
    public final SavedStateHandle isConnected;
    public final C44078sCn valueOf;
    public final C44089sCy values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> KWHzl() {
        return this.AYXKKw;
    }

    public static final class ActionBar implements Flow<List<? extends FormElementDisplayModel>> {
        public final /* synthetic */ UploadLogViewModel OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ UploadLogViewModel KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, UploadLogViewModel uploadLogViewModel) {
                this.copydefault = flowCollector;
                this.KWHzl = uploadLogViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                UploadLogViewModel$special$$inlined$map$1$2$1 uploadLogViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof UploadLogViewModel$special$$inlined$map$1$2$1) {
                    uploadLogViewModel$special$$inlined$map$1$2$1 = (UploadLogViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = uploadLogViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        uploadLogViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        uploadLogViewModel$special$$inlined$map$1$2$1 = new UploadLogViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = uploadLogViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = uploadLogViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List listCopydefault = this.KWHzl.copydefault((List<FormElementDisplayModel>) obj);
                    uploadLogViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listCopydefault, uploadLogViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, UploadLogViewModel uploadLogViewModel) {
            this.copydefault = flow;
            this.OLrzqt = uploadLogViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends FormElementDisplayModel>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements Flow<Boolean> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                UploadLogViewModel$special$$inlined$map$2$2$1 uploadLogViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof UploadLogViewModel$special$$inlined$map$2$2$1) {
                    uploadLogViewModel$special$$inlined$map$2$2$1 = (UploadLogViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = uploadLogViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        uploadLogViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        uploadLogViewModel$special$$inlined$map$2$2$1 = new UploadLogViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = uploadLogViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = uploadLogViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    int size = ((List) obj).size();
                    C44760scx.log$default(UploadLogViewModel.KWHzl + " Current total attachment size: " + size, null, 2, null);
                    Boolean boolKWHzl = C56443yFo.KWHzl(size >= 5);
                    uploadLogViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, uploadLogViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public UploadLogViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44085sCu c44085sCu, @NotNull C44084sCt c44084sCt, @NotNull C44078sCn c44078sCn, @NotNull C44081sCq c44081sCq, @NotNull C44086sCv c44086sCv, @NotNull C44090sCz c44090sCz, @NotNull C44083sCs c44083sCs, @NotNull C44089sCy c44089sCy) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44085sCu, "");
        Intrinsics.checkNotNullParameter(c44084sCt, "");
        Intrinsics.checkNotNullParameter(c44078sCn, "");
        Intrinsics.checkNotNullParameter(c44081sCq, "");
        Intrinsics.checkNotNullParameter(c44086sCv, "");
        Intrinsics.checkNotNullParameter(c44090sCz, "");
        Intrinsics.checkNotNullParameter(c44083sCs, "");
        Intrinsics.checkNotNullParameter(c44089sCy, "");
        this.isConnected = savedStateHandle;
        this.fetchVPNInfo = c44085sCu;
        this.DbNXlk = c44084sCt;
        this.valueOf = c44078sCn;
        this.djBIcL = c44081sCq;
        this.AuCTel = c44086sCv;
        this.fARcdN = c44090sCz;
        this.AkhnZx = c44083sCs;
        this.values = c44089sCy;
        this.gEmmrt = StateFlowKt.MutableStateFlow(TaskDescription.ActionBar.OLrzqt);
        this.copydefault = new ConcurrentHashMap<>();
        this.OLrzqt = StateFlowKt.MutableStateFlow(C56424yEw.KWHzl());
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AhwBna = FlowKt.stateIn(new ActionBar(savedStateHandle.getStateFlow("CURRENT_FORM_ELEMENTS", yDY.AhwBna()), this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), copydefault(AhwBna()));
        this.AYXKKw = new MutableLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String copydefault() {
            return UploadLogViewModel.KWHzl;
        }
    }

    static {
        String simpleName = UploadLogViewModel.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        KWHzl = simpleName;
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final class ActionBar extends TaskDescription {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends TaskDescription {
            public final sCT EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, sCT sct, int i, Object obj) {
                if ((i & 1) != 0) {
                    sct = application.EZpvd;
                }
                return application.AEQbTJ(sct);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull sCT sct) {
                Intrinsics.checkNotNullParameter(sct, "");
                return new Application(sct);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final sCT copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FormConfig(data=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull sCT sct) {
                super(null);
                Intrinsics.checkNotNullParameter(sct, "");
                this.EZpvd = sct;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0574TaskDescription extends TaskDescription {
            public final List<FormElementDisplayModel> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel$TaskDescription$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0574TaskDescription copy$default(C0574TaskDescription c0574TaskDescription, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0574TaskDescription.OLrzqt;
                }
                return c0574TaskDescription.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<FormElementDisplayModel> OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0574TaskDescription copydefault(@NotNull List<FormElementDisplayModel> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0574TaskDescription(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0574TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((C0574TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FormContent(data=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0574TaskDescription(@NotNull List<FormElementDisplayModel> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends TaskDescription {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = activity.KWHzl;
                }
                return activity.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(boolean z) {
                return new Activity(z);
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
                return Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SubmitLoading(isLoading=" + this.KWHzl + ")";
            }

            public Activity(boolean z) {
                super(null);
                this.KWHzl = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class FragmentManager extends TaskDescription {
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fragmentManager.OLrzqt;
                }
                return fragmentManager.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager OLrzqt(boolean z) {
                return new FragmentManager(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FragmentManager) && this.OLrzqt == ((FragmentManager) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SubmitResult(isSuccess=" + this.OLrzqt + ")";
            }

            public FragmentManager(boolean z) {
                super(null);
                this.OLrzqt = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.EZpvd(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    public final StateFlow<TaskDescription> OLrzqt() {
        return FlowKt.asStateFlow(this.gEmmrt);
    }

    public final Flow<Boolean> copydefault() {
        return FlowKt.distinctUntilChanged(FlowKt.combine(this.OLrzqt, this.AEQbTJ, new UploadLogViewModel$validFormState$1(this, null)));
    }

    public final Flow<Boolean> EZpvd() {
        return FlowKt.distinctUntilChanged(new Activity(this.isConnected.getStateFlow("ATTACHED_FILE_ELEMENTS", yDY.AhwBna())));
    }

    public final List<FormElementDisplayModel> AhwBna() {
        List<FormElementDisplayModel> list = (List) this.isConnected.get("CURRENT_FORM_ELEMENTS");
        return list == null ? yDY.AhwBna() : list;
    }

    public final List<FormElementDisplayModel> djBIcL() {
        List<FormElementDisplayModel> list = (List) this.isConnected.get("ATTACHED_FILE_ELEMENTS");
        return list == null ? yDY.AhwBna() : list;
    }

    public final long gEmmrt() {
        Long l = (Long) this.isConnected.get("CURRENT_TOTAL_ATTACHED_SIZE");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String valueOf() {
        String str = (String) this.isConnected.get("FIELD_ID_ATTACHMENTS");
        return str == null ? "" : str;
    }

    public final List<String> AYXKKw() {
        List<String> list = (List) this.isConnected.get("ATTACHED_FILE_IDS");
        return list == null ? yDY.AhwBna() : list;
    }

    public final String fetchVPNInfo() {
        String str = (String) this.isConnected.get("FIELD_ID_LOGFILE");
        return str == null ? "" : str;
    }

    public final String values() {
        String str = (String) this.isConnected.get("FIELD_ID_LOGFILE_STATUS");
        return str == null ? "" : str;
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$getFormConfig$1(this, str, str2, str3, null), 3, null);
    }

    public final MutableStateFlow<ElementValue> EZpvd(String str, ElementValue elementValue) {
        MutableStateFlow<ElementValue> MutableStateFlow = StateFlowKt.MutableStateFlow(elementValue);
        C44760scx.log$default(KWHzl + " createElementIdFlow: elementFlow_elementId: " + str, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$createApiElementIdFlow$1(MutableStateFlow, this, str, null), 3, null);
        this.copydefault.put(str, MutableStateFlow);
        return MutableStateFlow;
    }

    public final void KWHzl(String str, ElementValue elementValue) {
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            MutableStateFlow<ElementValue> mutableStateFlowEZpvd = this.copydefault.get(str);
            if (mutableStateFlowEZpvd == null) {
                mutableStateFlowEZpvd = EZpvd(str, elementValue);
            }
            mutableStateFlowEZpvd.tryEmit(elementValue);
        }
    }

    public final void OLrzqt(String str, FormElementDisplayModel formElementDisplayModel, ElementValue elementValue) {
        this.isConnected.set("CURRENT_FORM_ELEMENTS", this.DbNXlk.AEQbTJ(AhwBna(), formElementDisplayModel));
        KWHzl(str, elementValue);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$updateDisplayFormElement$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str, new ElementValue.ElementBoolean(z));
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl(str, new ElementValue.ElementString(str2));
    }

    public final void OLrzqt(@NotNull String str, @NotNull ExtraFormData.DateInfo dateInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dateInfo, "");
        Iterator<T> it = AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((FormElementDisplayModel) next).KWHzl(), (Object) str)) {
                    break;
                }
            }
        }
        FormElementDisplayModel formElementDisplayModel = (FormElementDisplayModel) next;
        if (formElementDisplayModel != null) {
            Pair<FormElementDisplayModel, ElementValue.ElementString> pairEZpvd = this.valueOf.EZpvd(formElementDisplayModel, dateInfo);
            OLrzqt(str, pairEZpvd.component1(), pairEZpvd.component2());
        }
    }

    public final void AEQbTJ(@NotNull String str, String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((FormElementDisplayModel) next).KWHzl(), (Object) str)) {
                    break;
                }
            }
        }
        FormElementDisplayModel formElementDisplayModel = (FormElementDisplayModel) next;
        if (formElementDisplayModel != null) {
            Pair<FormElementDisplayModel, ElementValue.ElementString> pairEZpvd = this.djBIcL.EZpvd(formElementDisplayModel, str2);
            OLrzqt(str, pairEZpvd.component1(), pairEZpvd.component2());
        }
    }

    public final void AEQbTJ(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        C44760scx.log$default("Selected attachment: " + uri, null, 2, null);
        List<FormElementDisplayModel> listDjBIcL = djBIcL();
        if (!(listDjBIcL instanceof Collection) || !listDjBIcL.isEmpty()) {
            for (FormElementDisplayModel formElementDisplayModel : listDjBIcL) {
                if ((formElementDisplayModel.AEQbTJ() instanceof ExtraFormData.AttachmentInfo) && Intrinsics.EZpvd(((ExtraFormData.AttachmentInfo) formElementDisplayModel.AEQbTJ()).valueOf(), uri)) {
                    C44760scx.log$default("Attachment already uploaded: " + uri, null, 2, null);
                    return;
                }
            }
        }
        if (!this.AEQbTJ.getValue().contains(uri)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$selectAttachment$2(this, uri, null), 3, null);
            return;
        }
        C44760scx.log$default("Attachment already uploading: " + uri, null, 2, null);
    }

    public final void KWHzl(sCR scr) {
        Iterator<FormElementDisplayModel> it = djBIcL().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((Object) it.next().KWHzl(), (Object) scr.AEQbTJ())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) djBIcL());
            listFJNWhG.remove(i);
            listFJNWhG.add(i, sCP.AEQbTJ(scr));
            this.isConnected.set("ATTACHED_FILE_ELEMENTS", listFJNWhG);
            if (scr instanceof sCR.StateListAnimator) {
                sCR.StateListAnimator stateListAnimator = (sCR.StateListAnimator) scr;
                this.isConnected.set("ATTACHED_FILE_IDS", CollectionsKt___CollectionsKt.copydefault((Collection<? extends String>) AYXKKw(), stateListAnimator.OLrzqt()));
                KWHzl(valueOf(), CollectionsKt___CollectionsKt.joinToString$default(AYXKKw(), ",", null, null, 0, null, null, 62, null));
                this.isConnected.set("CURRENT_TOTAL_ATTACHED_SIZE", Long.valueOf(gEmmrt() + stateListAnimator.copydefault()));
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$updateAttachmentResult$1(this, null), 3, null);
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = djBIcL().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((FormElementDisplayModel) next).KWHzl(), (Object) str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FormElementDisplayModel formElementDisplayModel = (FormElementDisplayModel) next;
        if (formElementDisplayModel == null || !(formElementDisplayModel.AEQbTJ() instanceof ExtraFormData.AttachmentInfo)) {
            return;
        }
        SavedStateHandle savedStateHandle = this.isConnected;
        List<String> listAYXKKw = AYXKKw();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAYXKKw) {
            if (!Intrinsics.EZpvd(obj, (Object) ((ExtraFormData.AttachmentInfo) formElementDisplayModel.AEQbTJ()).AEQbTJ())) {
                arrayList.add(obj);
            }
        }
        savedStateHandle.set("ATTACHED_FILE_IDS", arrayList);
        SavedStateHandle savedStateHandle2 = this.isConnected;
        List<FormElementDisplayModel> listDjBIcL = djBIcL();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listDjBIcL) {
            if (!Intrinsics.EZpvd((FormElementDisplayModel) obj2, formElementDisplayModel)) {
                arrayList2.add(obj2);
            }
        }
        savedStateHandle2.set("ATTACHED_FILE_ELEMENTS", arrayList2);
        KWHzl(valueOf(), CollectionsKt___CollectionsKt.joinToString$default(AYXKKw(), ",", null, null, 0, null, null, 62, null));
        this.isConnected.set("CURRENT_TOTAL_ATTACHED_SIZE", Long.valueOf(gEmmrt() - ((ExtraFormData.AttachmentInfo) formElementDisplayModel.AEQbTJ()).EZpvd()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$removeAttachment$3(this, null), 3, null);
    }

    public final Object AEQbTJ(Continuation<? super Unit> continuation) {
        Object objEmit = this.gEmmrt.emit(new TaskDescription.C0574TaskDescription(this.DbNXlk.AEQbTJ(AhwBna(), djBIcL())), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UploadLogViewModel$submitLogs$1(this, null), 3, null);
    }

    public final void EZpvd(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        pUU.AEQbTJ(KWHzl, message, th);
        if (!StringsKt__StringsKt.fARcdN((CharSequence) message)) {
            this.AYXKKw.postValue(new C32989mnw<>(message));
        }
    }

    public final List<FormElementDisplayModel> copydefault(List<FormElementDisplayModel> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FormElementDisplayModel) obj).AhwBna()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
