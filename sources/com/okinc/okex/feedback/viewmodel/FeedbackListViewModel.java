package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.net.FeedbackApiService;
import com.okinc.okex.feedback.net.bean.LoopholeListResp;
import com.okinc.okex.feedback.net.bean.LoopholeResp;
import com.okinc.okex.feedback.net.bean.ReceiptReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44711scA;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackListViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<TaskDescription> AEQbTJ;
    public final StateFlow<Activity> AYXKKw;
    public final MutableLiveData<ActionBar> EZpvd;
    public final FeedbackApiService KWHzl;
    public final MutableStateFlow<Application> OLrzqt;
    public final MutableStateFlow<Activity> copydefault;
    public final StateFlow<Application> gEmmrt;
    public final StateFlow<TaskDescription> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ActionBar> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> OLrzqt() {
        return this.gEmmrt;
    }

    @yCM
    public FeedbackListViewModel(@NotNull FeedbackApiService feedbackApiService) {
        Intrinsics.checkNotNullParameter(feedbackApiService, "");
        this.KWHzl = feedbackApiService;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(new TaskDescription.StateListAnimator(0, i, defaultConstructorMarker));
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Application> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Application.Activity(0 == true ? 1 : 0, i, defaultConstructorMarker));
        this.OLrzqt = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Activity> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new Activity.Application(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, defaultConstructorMarker));
        this.copydefault = MutableStateFlow3;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow3);
        this.EZpvd = new MutableLiveData<>();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public final int EZpvd;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = actionBar.EZpvd;
            }
            if ((i3 & 2) != 0) {
                i2 = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(int i, int i2) {
            return new ActionBar(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.EZpvd == actionBar.EZpvd && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.EZpvd) * 31) + Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ActionCallBack(id=" + this.EZpvd + ", status=" + this.KWHzl + ")";
        }

        public ActionBar(int i, int i2) {
            this.EZpvd = i;
            this.KWHzl = i2;
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int AEQbTJ();

        private TaskDescription() {
        }

        public static final class StateListAnimator extends TaskDescription {
            public final int EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator() {
                this(0, 1, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = stateListAnimator.EZpvd;
                }
                return stateListAnimator.KWHzl(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription
            public int AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(int i) {
                return new StateListAnimator(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && this.EZpvd == ((StateListAnimator) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(listType=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:32) call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription.StateListAnimator.<init>(int):void type: THIS */
            public /* synthetic */ StateListAnimator(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -1 : i);
            }

            public StateListAnimator(int i) {
                super(null);
                this.EZpvd = i;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0548TaskDescription extends TaskDescription {
            public final int AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0548TaskDescription copy$default(C0548TaskDescription c0548TaskDescription, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = c0548TaskDescription.AEQbTJ;
                }
                return c0548TaskDescription.OLrzqt(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription
            public int AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0548TaskDescription OLrzqt(int i) {
                return new C0548TaskDescription(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0548TaskDescription) && this.AEQbTJ == ((C0548TaskDescription) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Empty(listType=" + this.AEQbTJ + ")";
            }

            public C0548TaskDescription(int i) {
                super(null);
                this.AEQbTJ = i;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends TaskDescription {
            public final int AEQbTJ;
            public final boolean OLrzqt;
            public final LoopholeListResp copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, LoopholeListResp loopholeListResp, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = activity.AEQbTJ;
                }
                if ((i2 & 2) != 0) {
                    loopholeListResp = activity.copydefault;
                }
                if ((i2 & 4) != 0) {
                    z = activity.OLrzqt;
                }
                return activity.AEQbTJ(i, loopholeListResp, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription
            public int AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(int i, @NotNull LoopholeListResp loopholeListResp, boolean z) {
                Intrinsics.checkNotNullParameter(loopholeListResp, "");
                return new Activity(i, loopholeListResp, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoopholeListResp copydefault() {
                return this.copydefault;
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
                return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.OLrzqt == activity.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(listType=" + this.AEQbTJ + ", data=" + this.copydefault + ", isReset=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(int i, @NotNull LoopholeListResp loopholeListResp, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(loopholeListResp, "");
                this.AEQbTJ = i;
                this.copydefault = loopholeListResp;
                this.OLrzqt = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends TaskDescription {
            public final Exception AEQbTJ;
            public final int KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, int i, Exception exc, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = application.KWHzl;
                }
                if ((i2 & 2) != 0) {
                    exc = application.AEQbTJ;
                }
                return application.EZpvd(i, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.TaskDescription
            public int AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(int i, @NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new Application(i, exc);
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
                return this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(listType=" + this.KWHzl + ", error=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(int i, @NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.KWHzl = i;
                this.AEQbTJ = exc;
            }
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int AEQbTJ();

        private Application() {
        }

        public static final class Activity extends Application {
            public final int AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity() {
                this(0, 1, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = activity.AEQbTJ;
                }
                return activity.KWHzl(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Application
            public int AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(int i) {
                return new Activity(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.AEQbTJ == ((Activity) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(feedbackId=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:55) call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Application.Activity.<init>(int):void type: THIS */
            public /* synthetic */ Activity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -1 : i);
            }

            public Activity(int i) {
                super(null);
                this.AEQbTJ = i;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends Application {
            public final LoopholeResp KWHzl;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, LoopholeResp loopholeResp, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = actionBar.copydefault;
                }
                if ((i2 & 2) != 0) {
                    loopholeResp = actionBar.KWHzl;
                }
                return actionBar.copydefault(i, loopholeResp);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Application
            public int AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoopholeResp OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(int i, @NotNull LoopholeResp loopholeResp) {
                Intrinsics.checkNotNullParameter(loopholeResp, "");
                return new ActionBar(i, loopholeResp);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(feedbackId=" + this.copydefault + ", data=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(int i, @NotNull LoopholeResp loopholeResp) {
                super(null);
                Intrinsics.checkNotNullParameter(loopholeResp, "");
                this.copydefault = i;
                this.KWHzl = loopholeResp;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0547Application extends Application {
            public final Exception EZpvd;
            public final int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0547Application copy$default(C0547Application c0547Application, int i, Exception exc, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = c0547Application.OLrzqt;
                }
                if ((i2 & 2) != 0) {
                    exc = c0547Application.EZpvd;
                }
                return c0547Application.copydefault(i, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Application
            public int AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0547Application copydefault(int i, @NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new C0547Application(i, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0547Application)) {
                    return false;
                }
                C0547Application c0547Application = (C0547Application) obj;
                return this.OLrzqt == c0547Application.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c0547Application.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(feedbackId=" + this.OLrzqt + ", error=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0547Application(int i, @NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.OLrzqt = i;
                this.EZpvd = exc;
            }
        }
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int EZpvd();

        private Activity() {
        }

        public static final class Application extends Activity {
            public final int EZpvd;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = application.EZpvd;
                }
                if ((i2 & 2) != 0) {
                    z = application.copydefault;
                }
                return application.copydefault(i, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Activity
            public int EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(int i, boolean z) {
                return new Application(i, z);
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
                return this.EZpvd == application.EZpvd && this.copydefault == application.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.EZpvd) * 31) + Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(feedbackId=" + this.EZpvd + ", isLoading=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 int))
  (r2v0 boolean)
 A[MD:(int, boolean):void (m)] (LINE:73) call: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Activity.Application.<init>(int, boolean):void type: THIS */
            public /* synthetic */ Application(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -1 : i, z);
            }

            public Application(int i, boolean z) {
                super(null);
                this.EZpvd = i;
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.feedback.viewmodel.FeedbackListViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0546Activity extends Activity {
            public final int AEQbTJ;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0546Activity copy$default(C0546Activity c0546Activity, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = c0546Activity.AEQbTJ;
                }
                if ((i3 & 2) != 0) {
                    i2 = c0546Activity.copydefault;
                }
                return c0546Activity.copydefault(i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Activity
            public int EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0546Activity copydefault(int i, int i2) {
                return new C0546Activity(i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0546Activity)) {
                    return false;
                }
                C0546Activity c0546Activity = (C0546Activity) obj;
                return this.AEQbTJ == c0546Activity.AEQbTJ && this.copydefault == c0546Activity.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.AEQbTJ) * 31) + Integer.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(feedbackId=" + this.AEQbTJ + ", statusId=" + this.copydefault + ")";
            }

            public C0546Activity(int i, int i2) {
                super(null);
                this.AEQbTJ = i;
                this.copydefault = i2;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends Activity {
            public final int OLrzqt;
            public final Exception copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, Exception exc, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = stateListAnimator.OLrzqt;
                }
                if ((i2 & 2) != 0) {
                    exc = stateListAnimator.copydefault;
                }
                return stateListAnimator.OLrzqt(i, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.okex.feedback.viewmodel.FeedbackListViewModel.Activity
            public int EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(int i, @NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new StateListAnimator(i, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(feedbackId=" + this.OLrzqt + ", error=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(int i, @NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.OLrzqt = i;
                this.copydefault = exc;
            }
        }
    }

    public final void copydefault(int i, int i2) {
        this.EZpvd.setValue(new ActionBar(i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0082, B:29:0x008a, B:31:0x0090, B:32:0x009d), top: B:59:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(int i, int i2, Integer num, int i3, boolean z, int i4, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FeedbackListViewModel$getLoopholeList$1 feedbackListViewModel$getLoopholeList$1;
        int i5;
        boolean z2;
        FeedbackListViewModel feedbackListViewModel;
        Object objWithContext;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof FeedbackListViewModel$getLoopholeList$1) {
            feedbackListViewModel$getLoopholeList$1 = (FeedbackListViewModel$getLoopholeList$1) continuation;
            int i6 = feedbackListViewModel$getLoopholeList$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                feedbackListViewModel$getLoopholeList$1.label = i6 - Integer.MIN_VALUE;
            } else {
                feedbackListViewModel$getLoopholeList$1 = new FeedbackListViewModel$getLoopholeList$1(this, continuation);
            }
        }
        FeedbackListViewModel$getLoopholeList$1 feedbackListViewModel$getLoopholeList$12 = feedbackListViewModel$getLoopholeList$1;
        Object obj = feedbackListViewModel$getLoopholeList$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i7 = feedbackListViewModel$getLoopholeList$12.label;
        if (i7 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
                FeedbackListViewModel$getLoopholeList$2$1 feedbackListViewModel$getLoopholeList$2$1 = new FeedbackListViewModel$getLoopholeList$2$1(this, i, i2, num, z, i4, i3, null);
                feedbackListViewModel$getLoopholeList$12.L$0 = this;
                i5 = i2;
                try {
                    feedbackListViewModel$getLoopholeList$12.I$0 = i5;
                    z2 = z;
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    feedbackListViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    if (actionBar instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                    feedbackListViewModel$getLoopholeList$12.Z$0 = z2;
                    feedbackListViewModel$getLoopholeList$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, feedbackListViewModel$getLoopholeList$2$1, feedbackListViewModel$getLoopholeList$12);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    feedbackListViewModel = this;
                    responseData = (ResponseData) objWithContext;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    feedbackListViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    if (actionBar instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                i5 = i2;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = feedbackListViewModel$getLoopholeList$12.Z$0;
            int i8 = feedbackListViewModel$getLoopholeList$12.I$0;
            feedbackListViewModel = (FeedbackListViewModel) feedbackListViewModel$getLoopholeList$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
                i5 = i8;
            } catch (Throwable th4) {
                th = th4;
                i5 = i8;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
                if (actionBar instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            try {
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th5) {
                th = th5;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            LoopholeListResp loopholeListResp = (LoopholeListResp) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            feedbackListViewModel.AEQbTJ.setValue(loopholeListResp.getList().isEmpty() ^ true ? new TaskDescription.Activity(i5, loopholeListResp, z2) : new TaskDescription.C0548TaskDescription(i5));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            feedbackListViewModel.AEQbTJ.setValue(new TaskDescription.Application(i5, (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:23:0x005b, B:25:0x0063, B:27:0x0069, B:28:0x0076), top: B:41:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FeedbackListViewModel$getLoopholeDetail$1 feedbackListViewModel$getLoopholeDetail$1;
        FeedbackListViewModel feedbackListViewModel;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof FeedbackListViewModel$getLoopholeDetail$1) {
            feedbackListViewModel$getLoopholeDetail$1 = (FeedbackListViewModel$getLoopholeDetail$1) continuation;
            int i2 = feedbackListViewModel$getLoopholeDetail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackListViewModel$getLoopholeDetail$1.label = i2 - Integer.MIN_VALUE;
            } else {
                feedbackListViewModel$getLoopholeDetail$1 = new FeedbackListViewModel$getLoopholeDetail$1(this, continuation);
            }
        }
        Object objWithContext = feedbackListViewModel$getLoopholeDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = feedbackListViewModel$getLoopholeDetail$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
                FeedbackListViewModel$getLoopholeDetail$2$1 feedbackListViewModel$getLoopholeDetail$2$1 = new FeedbackListViewModel$getLoopholeDetail$2$1(this, i, null);
                feedbackListViewModel$getLoopholeDetail$1.L$0 = this;
                feedbackListViewModel$getLoopholeDetail$1.I$0 = i;
                feedbackListViewModel$getLoopholeDetail$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, feedbackListViewModel$getLoopholeDetail$2$1, feedbackListViewModel$getLoopholeDetail$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                feedbackListViewModel = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                th = th;
                feedbackListViewModel = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = feedbackListViewModel$getLoopholeDetail$1.I$0;
            feedbackListViewModel = (FeedbackListViewModel) feedbackListViewModel$getLoopholeDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            feedbackListViewModel.OLrzqt.setValue(new Application.ActionBar(i, (LoopholeResp) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            feedbackListViewModel.OLrzqt.setValue(new Application.C0547Application(i, (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object postFeedbackReceipt$default(FeedbackListViewModel feedbackListViewModel, int i, boolean z, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "";
        }
        return feedbackListViewModel.OLrzqt(i, z, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:27:0x0078, B:29:0x0080, B:31:0x0086, B:32:0x0093), top: B:47:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(int i, boolean z, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FeedbackListViewModel$postFeedbackReceipt$1 feedbackListViewModel$postFeedbackReceipt$1;
        FeedbackListViewModel feedbackListViewModel;
        int i2;
        String str2;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        int i3 = i;
        if (continuation instanceof FeedbackListViewModel$postFeedbackReceipt$1) {
            feedbackListViewModel$postFeedbackReceipt$1 = (FeedbackListViewModel$postFeedbackReceipt$1) continuation;
            int i4 = feedbackListViewModel$postFeedbackReceipt$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                feedbackListViewModel$postFeedbackReceipt$1.label = i4 - Integer.MIN_VALUE;
            } else {
                feedbackListViewModel$postFeedbackReceipt$1 = new FeedbackListViewModel$postFeedbackReceipt$1(this, continuation);
            }
        }
        Object objWithContext = feedbackListViewModel$postFeedbackReceipt$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i5 = feedbackListViewModel$postFeedbackReceipt$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            this.copydefault.setValue(new Activity.Application(i3, true));
            try {
                if (z) {
                    str2 = str;
                    i2 = 1;
                } else {
                    i2 = 2;
                    str2 = str;
                }
                ReceiptReq receiptReq = new ReceiptReq(i3, i2, str2);
                CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
                FeedbackListViewModel$postFeedbackReceipt$2$1 feedbackListViewModel$postFeedbackReceipt$2$1 = new FeedbackListViewModel$postFeedbackReceipt$2$1(this, receiptReq, null);
                feedbackListViewModel$postFeedbackReceipt$1.L$0 = this;
                feedbackListViewModel$postFeedbackReceipt$1.I$0 = i3;
                feedbackListViewModel$postFeedbackReceipt$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, feedbackListViewModel$postFeedbackReceipt$2$1, feedbackListViewModel$postFeedbackReceipt$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                feedbackListViewModel = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                th = th;
                feedbackListViewModel = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = feedbackListViewModel$postFeedbackReceipt$1.I$0;
            feedbackListViewModel = (FeedbackListViewModel) feedbackListViewModel$postFeedbackReceipt$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            int iIntValue = ((Number) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).intValue();
            feedbackListViewModel.copydefault.setValue(new Activity.Application(i3, false));
            feedbackListViewModel.copydefault.setValue(new Activity.C0546Activity(i3, iIntValue));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl();
            feedbackListViewModel.copydefault.setValue(new Activity.Application(i3, false));
            feedbackListViewModel.copydefault.setValue(new Activity.StateListAnimator(i3, oKServerException));
        }
        return Unit.INSTANCE;
    }
}
