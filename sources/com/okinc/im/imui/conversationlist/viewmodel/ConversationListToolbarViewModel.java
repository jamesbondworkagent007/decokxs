package com.okinc.im.imui.conversationlist.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C33129mqd;
import o.oDZ;
import o.pUU;
import o.sKH;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListToolbarViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<Application>> AEQbTJ;
    public Job AYXKKw;
    public final sKH AhwBna;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableLiveData<List<IMenuItemPerformer>> copydefault;
    public final oDZ djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> gEmmrt() {
        return this.KWHzl;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.ConversationListToolbarViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends Application {
            public final List<IMenuItemPerformer> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.conversationlist.viewmodel.ConversationListToolbarViewModel$Application$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = activity.AEQbTJ;
                }
                return activity.KWHzl(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull List<? extends IMenuItemPerformer> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<IMenuItemPerformer> KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OpenMenuItemBottomSheet(menuList=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(@NotNull List<? extends IMenuItemPerformer> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Application {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.OLrzqt;
                }
                return taskDescription.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Toast(message=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }

    @yCM
    public ConversationListToolbarViewModel(@NotNull sKH skh, @NotNull oDZ odz) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(odz, "");
        this.AhwBna = skh;
        this.djBIcL = odz;
        this.copydefault = new MutableLiveData<>(yDY.AhwBna());
        this.AEQbTJ = new MutableLiveData<>();
        this.KWHzl = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.ConversationListToolbarViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd() {
        valueOf();
        KWHzl();
        djBIcL();
    }

    public final void AYXKKw() {
        List<IMenuItemPerformer> value;
        if (this.gEmmrt || (value = this.copydefault.getValue()) == null) {
            return;
        }
        if (!C33129mqd.KWHzl((Collection) value)) {
            value = null;
        }
        if (value != null) {
            OLrzqt(true);
            List<IMenuItemPerformer> value2 = this.copydefault.getValue();
            if (value2 != null) {
                this.AEQbTJ.setValue(new C32989mnw<>(new Application.Activity(value2)));
            }
        }
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListToolbarViewModel$observeBottomSheetMenuItems$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListToolbarViewModel$checkKyc$1(this, null), 3, null);
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListToolbarViewModel$startStatusBannerUpdatesListener$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        Job job = this.AYXKKw;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        pUU.KWHzl("ConversationListToolbarViewModel", "updateConnectionState - emit connection state: Connected");
        this.OLrzqt.tryEmit(Boolean.FALSE);
    }

    public final void OLrzqt() {
        Job job = this.AYXKKw;
        if (job == null || !job.isActive()) {
            this.AYXKKw = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConversationListToolbarViewModel$handleDisconnectedState$1(this, null), 3, null);
        } else {
            pUU.KWHzl("ConversationListToolbarViewModel", "updateConnectionState - drop state change");
        }
    }
}
