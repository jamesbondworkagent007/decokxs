package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okex.feedback.net.bean.ChildCategory;
import com.okinc.okex.feedback.net.bean.FileUpload;
import com.okinc.okex.feedback.net.bean.MainCategory;
import com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45618stT;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackSubmitViewModel extends ViewModel {
    public final MutableLiveData<C45618stT.TaskDescription> AEQbTJ;
    public final MutableLiveData<List<MainCategory>> AYXKKw;
    public final MutableLiveData<Integer> AhwBna;
    public final MutableLiveData<String> AkhnZx;
    public final LiveData<TaskDescription> DbNXlk;
    public final MutableLiveData<List<Application>> EZpvd;
    public final MutableLiveData<ActionBar> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<Boolean> copydefault;
    public final MutableLiveData<Integer> djBIcL;
    public final C45618stT fetchVPNInfo;
    public final MutableLiveData<MainCategory> gEmmrt;
    public final MutableLiveData<ChildCategory> valueOf;
    public final MutableLiveData<String> values;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C45618stT.TaskDescription> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<MainCategory>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MainCategory> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TaskDescription> DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ActionBar> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Application>> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ChildCategory> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fetchVPNInfo() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> values() {
        return this.copydefault;
    }

    @yCM
    public FeedbackSubmitViewModel(@NotNull C45618stT c45618stT) {
        Intrinsics.checkNotNullParameter(c45618stT, "");
        this.fetchVPNInfo = c45618stT;
        this.OLrzqt = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        MutableLiveData<MainCategory> mutableLiveData = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData;
        MutableLiveData<ChildCategory> mutableLiveData2 = new MutableLiveData<>();
        this.valueOf = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.values = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this.AkhnZx = mutableLiveData4;
        this.copydefault = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData, new StateListAnimator(new Function1() { // from class: o.suc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FeedbackSubmitViewModel.OLrzqt(mediatorLiveData, this, (MainCategory) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData2, new StateListAnimator(new Function1() { // from class: o.suf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FeedbackSubmitViewModel.copydefault(mediatorLiveData, this, (ChildCategory) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData3, new StateListAnimator(new Function1() { // from class: o.sub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FeedbackSubmitViewModel.EZpvd(mediatorLiveData, this, (java.lang.String) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData4, new StateListAnimator(new Function1() { // from class: o.sue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FeedbackSubmitViewModel.AEQbTJ(mediatorLiveData, this, (java.lang.String) obj);
            }
        }));
        mediatorLiveData.addSource(values(), new StateListAnimator(new Function1() { // from class: o.sud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FeedbackSubmitViewModel.AEQbTJ(mediatorLiveData, this, (java.lang.Boolean) obj);
            }
        }));
        this.DbNXlk = mediatorLiveData;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final String AEQbTJ;
        public final FileUpload EZpvd;
        public final long OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, long j, String str2, FileUpload fileUpload, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                j = application.OLrzqt;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                str2 = application.AEQbTJ;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                fileUpload = application.EZpvd;
            }
            return application.AEQbTJ(str, j2, str3, fileUpload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull String str, long j, @NotNull String str2, @NotNull FileUpload fileUpload) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fileUpload, "");
            return new Application(str, j, str2, fileUpload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FileUpload copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.copydefault.hashCode() * 31) + Long.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Attachment(name=" + this.copydefault + ", size=" + this.OLrzqt + ", extension=" + this.AEQbTJ + ", originalModel=" + this.EZpvd + ")";
        }

        public Application(@NotNull String str, long j, @NotNull String str2, @NotNull FileUpload fileUpload) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fileUpload, "");
            this.copydefault = str;
            this.OLrzqt = j;
            this.AEQbTJ = str2;
            this.EZpvd = fileUpload;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Activity extends ActionBar {
            public static final Activity EZpvd = new Activity();

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0549ActionBar extends ActionBar {
            public static final C0549ActionBar AEQbTJ = new C0549ActionBar();

            private C0549ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final int AEQbTJ = OKServerException.$stable;
            public final OKServerException KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, OKServerException oKServerException, int i, Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = stateListAnimator.KWHzl;
                }
                return stateListAnimator.KWHzl(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new StateListAnimator(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Failure(exception=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.KWHzl = oKServerException;
            }
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final class Activity extends TaskDescription {
            public final int AEQbTJ;
            public final String EZpvd;
            public final int KWHzl;
            public final String OLrzqt;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, String str, String str2, boolean z, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = activity.AEQbTJ;
                }
                if ((i3 & 2) != 0) {
                    i2 = activity.KWHzl;
                }
                int i4 = i2;
                if ((i3 & 4) != 0) {
                    str = activity.OLrzqt;
                }
                String str3 = str;
                if ((i3 & 8) != 0) {
                    str2 = activity.EZpvd;
                }
                String str4 = str2;
                if ((i3 & 16) != 0) {
                    z = activity.copydefault;
                }
                return activity.KWHzl(i, i4, str3, str4, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(int i, int i2, @NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Activity(i, i2, str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return this.AEQbTJ == activity.AEQbTJ && this.KWHzl == activity.KWHzl && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && this.copydefault == activity.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((((Integer.hashCode(this.AEQbTJ) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Valid(primaryCategory=" + this.AEQbTJ + ", secondaryCategory=" + this.KWHzl + ", subject=" + this.OLrzqt + ", description=" + this.EZpvd + ", isAcceptAgreement=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(int i, int i2, @NotNull String str, @NotNull String str2, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = i;
                this.KWHzl = i2;
                this.OLrzqt = str;
                this.EZpvd = str2;
                this.copydefault = z;
            }
        }

        public static final class StateListAnimator extends TaskDescription {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, FeedbackSubmitViewModel feedbackSubmitViewModel, MainCategory mainCategory) {
        mediatorLiveData.setValue(feedbackSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, FeedbackSubmitViewModel feedbackSubmitViewModel, ChildCategory childCategory) {
        mediatorLiveData.setValue(feedbackSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, FeedbackSubmitViewModel feedbackSubmitViewModel, String str) {
        mediatorLiveData.setValue(feedbackSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, FeedbackSubmitViewModel feedbackSubmitViewModel, String str) {
        mediatorLiveData.setValue(feedbackSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, FeedbackSubmitViewModel feedbackSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(feedbackSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public final TaskDescription EZpvd() {
        MainCategory value = this.gEmmrt.getValue();
        Integer numValueOf = value != null ? Integer.valueOf(value.getId()) : null;
        ChildCategory value2 = this.valueOf.getValue();
        Integer numValueOf2 = value2 != null ? Integer.valueOf(value2.getId()) : null;
        String value3 = this.values.getValue();
        String value4 = this.AkhnZx.getValue();
        Boolean value5 = values().getValue();
        boolean zBooleanValue = value5 != null ? value5.booleanValue() : false;
        if (numValueOf != null && numValueOf.intValue() > 0 && numValueOf2 != null && numValueOf2.intValue() > 0 && value3 != null && !StringsKt__StringsKt.fARcdN((CharSequence) value3) && value4 != null && !StringsKt__StringsKt.fARcdN((CharSequence) value4) && zBooleanValue) {
            return new TaskDescription.Activity(numValueOf.intValue(), numValueOf2.intValue(), value3, value4, zBooleanValue);
        }
        return TaskDescription.StateListAnimator.copydefault;
    }

    public final void KWHzl(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedbackSubmitViewModel$initialize$1(this, i, null), 3, null);
    }

    public final void OLrzqt(Integer num) {
        MainCategory mainCategory;
        Object next;
        if (num == null) {
            this.gEmmrt.setValue(null);
        } else {
            List<MainCategory> value = this.AYXKKw.getValue();
            MutableLiveData<MainCategory> mutableLiveData = this.gEmmrt;
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((MainCategory) next).getId() == num.intValue()) {
                            break;
                        }
                    }
                }
                mainCategory = (MainCategory) next;
            } else {
                mainCategory = null;
            }
            mutableLiveData.setValue(mainCategory);
        }
        EZpvd((Integer) null);
    }

    public final void EZpvd(Integer num) {
        Object obj = null;
        if (num == null) {
            this.valueOf.setValue(null);
            return;
        }
        MainCategory value = this.gEmmrt.getValue();
        if (value == null) {
            return;
        }
        Iterator<T> it = value.getChildrenList().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ChildCategory) next).getId() == num.intValue()) {
                obj = next;
                break;
            }
        }
        ChildCategory childCategory = (ChildCategory) obj;
        if (childCategory == null) {
            return;
        }
        this.valueOf.setValue(childCategory);
    }

    public final void fIwbmz() {
        MutableLiveData<Boolean> mutableLiveData = this.copydefault;
        mutableLiveData.setValue(Boolean.valueOf(!(mutableLiveData.getValue() != null ? r1.booleanValue() : false)));
    }

    public final boolean isConnected() {
        List arrayList;
        Integer value = this.AhwBna.getValue();
        List<Application> value2 = this.EZpvd.getValue();
        if (value2 == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((Collection) value2)) == null) {
            arrayList = new ArrayList();
        }
        return value != null && arrayList.size() == value.intValue();
    }

    public final void EZpvd(@NotNull File file) {
        List arrayList;
        Integer value;
        Intrinsics.checkNotNullParameter(file, "");
        List<Application> value2 = this.EZpvd.getValue();
        if (value2 == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((Collection) value2)) == null) {
            arrayList = new ArrayList();
        }
        if (isConnected() || (value = this.djBIcL.getValue()) == null) {
            return;
        }
        if (file.length() <= value.intValue() * 1048576) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedbackSubmitViewModel$submitAttachment$1(this, file, arrayList, null), 3, null);
        } else {
            this.KWHzl.setValue(ActionBar.C0549ActionBar.AEQbTJ);
        }
    }

    public final void copydefault(int i) {
        List<Application> arrayList;
        List<Application> value = this.EZpvd.getValue();
        if (value == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((Collection) value)) == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.remove(i);
        this.EZpvd.setValue(arrayList);
    }

    public final void fARcdN() {
        TaskDescription taskDescriptionEZpvd = EZpvd();
        if (taskDescriptionEZpvd instanceof TaskDescription.Activity) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedbackSubmitViewModel$submit$1(this, taskDescriptionEZpvd, null), 3, null);
        }
    }
}
