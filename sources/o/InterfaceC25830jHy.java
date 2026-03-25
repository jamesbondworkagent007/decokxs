package o;

import com.okinc.business.market.data.model.alert.AlertUiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC25830jHy {

    /* JADX INFO: renamed from: o.jHy$ActionBar */
    public static abstract class ActionBar implements InterfaceC25830jHy {
        public final boolean KWHzl;
        public final java.util.List<AlertUiItem> OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.List), (r2v0 boolean) A[MD:(java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem>, boolean):void (m)] call: o.jHy.ActionBar.<init>(java.util.List, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(java.util.List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<AlertUiItem> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.util.List<? extends AlertUiItem> list, boolean z) {
            this.OLrzqt = list;
            this.KWHzl = z;
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$AssistContent */
        public static final class AssistContent extends ActionBar {
            public final java.util.List<AlertUiItem> AEQbTJ;
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$AssistContent */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = assistContent.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = assistContent.EZpvd;
                }
                return assistContent.KWHzl(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AssistContent KWHzl(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new AssistContent(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssistContent)) {
                    return false;
                }
                AssistContent assistContent = (AssistContent) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, assistContent.AEQbTJ) && this.EZpvd == assistContent.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Response(alertList=" + this.AEQbTJ + ", isManageMode=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AssistContent(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$VoiceInteractor */
        public static final class VoiceInteractor extends ActionBar {
            public final boolean AEQbTJ;
            public final java.util.List<AlertUiItem> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$VoiceInteractor */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = voiceInteractor.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = voiceInteractor.AEQbTJ;
                }
                return voiceInteractor.copydefault(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VoiceInteractor copydefault(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new VoiceInteractor(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VoiceInteractor)) {
                    return false;
                }
                VoiceInteractor voiceInteractor = (VoiceInteractor) obj;
                return Intrinsics.EZpvd(this.EZpvd, voiceInteractor.EZpvd) && this.AEQbTJ == voiceInteractor.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnExpandAlertListGroup(alertList=" + this.EZpvd + ", isManageMode=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public VoiceInteractor(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$PendingIntent */
        public static final class PendingIntent extends ActionBar {
            public final boolean EZpvd;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$PendingIntent */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = pendingIntent.copydefault;
                }
                if ((i & 2) != 0) {
                    z = pendingIntent.EZpvd;
                }
                return pendingIntent.AEQbTJ(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent AEQbTJ(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new PendingIntent(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PendingIntent)) {
                    return false;
                }
                PendingIntent pendingIntent = (PendingIntent) obj;
                return Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault) && this.EZpvd == pendingIntent.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnCollapseAlertListGroup(alertList=" + this.copydefault + ", isManageMode=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public PendingIntent(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$TaskStackBuilder */
        public static final class TaskStackBuilder extends ActionBar {
            public final boolean EZpvd;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$TaskStackBuilder */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = taskStackBuilder.copydefault;
                }
                if ((i & 2) != 0) {
                    z = taskStackBuilder.EZpvd;
                }
                return taskStackBuilder.EZpvd(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskStackBuilder EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new TaskStackBuilder(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskStackBuilder)) {
                    return false;
                }
                TaskStackBuilder taskStackBuilder = (TaskStackBuilder) obj;
                return Intrinsics.EZpvd(this.copydefault, taskStackBuilder.copydefault) && this.EZpvd == taskStackBuilder.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnSelectAlertListGroup(alertList=" + this.copydefault + ", isManageMode=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskStackBuilder(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$FragmentManager */
        public static final class FragmentManager extends ActionBar {
            public final boolean AEQbTJ;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$FragmentManager */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = fragmentManager.copydefault;
                }
                if ((i & 2) != 0) {
                    z = fragmentManager.AEQbTJ;
                }
                return fragmentManager.KWHzl(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager KWHzl(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new FragmentManager(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FragmentManager)) {
                    return false;
                }
                FragmentManager fragmentManager = (FragmentManager) obj;
                return Intrinsics.EZpvd(this.copydefault, fragmentManager.copydefault) && this.AEQbTJ == fragmentManager.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ManageAlertList(alertList=" + this.copydefault + ", isManageMode=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FragmentManager(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$LoaderManager */
        public static final class LoaderManager extends ActionBar {
            public final boolean EZpvd;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$LoaderManager */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = loaderManager.copydefault;
                }
                if ((i & 2) != 0) {
                    z = loaderManager.EZpvd;
                }
                return loaderManager.copydefault(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager copydefault(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new LoaderManager(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoaderManager)) {
                    return false;
                }
                LoaderManager loaderManager = (LoaderManager) obj;
                return Intrinsics.EZpvd(this.copydefault, loaderManager.copydefault) && this.EZpvd == loaderManager.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "DoneManagingAlertList(alertList=" + this.copydefault + ", isManageMode=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public LoaderManager(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$Dialog */
        public static final class Dialog extends ActionBar {
            public final java.util.List<AlertUiItem> EZpvd;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$Dialog */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = dialog.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = dialog.copydefault;
                }
                return dialog.KWHzl(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog KWHzl(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Dialog(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) obj;
                return Intrinsics.EZpvd(this.EZpvd, dialog.EZpvd) && this.copydefault == dialog.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "DeletingAlert(alertList=" + this.EZpvd + ", isManageMode=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Dialog(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$TaskDescription */
        public static final class TaskDescription extends ActionBar {
            public final boolean EZpvd;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = taskDescription.copydefault;
                }
                if ((i & 2) != 0) {
                    z = taskDescription.EZpvd;
                }
                return taskDescription.EZpvd(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new TaskDescription(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && this.EZpvd == taskDescription.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AlertsDeleteSuccess(alertList=" + this.copydefault + ", isManageMode=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.EZpvd = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$Application */
        public static final class Application extends ActionBar {
            public final boolean AEQbTJ;
            public final java.util.List<AlertUiItem> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = application.copydefault;
                }
                if ((i & 2) != 0) {
                    z = application.AEQbTJ;
                }
                return application.AEQbTJ(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.AEQbTJ == application.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AlertsDeleteFailed(alertList=" + this.copydefault + ", isManageMode=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Application(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$Fragment */
        public static final class Fragment extends ActionBar {
            public final boolean AEQbTJ;
            public final java.util.List<AlertUiItem> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$Fragment */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = fragment.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = fragment.AEQbTJ;
                }
                return fragment.copydefault(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment copydefault(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Fragment(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                Fragment fragment = (Fragment) obj;
                return Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd) && this.AEQbTJ == fragment.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AlertsStateChanging(alertList=" + this.EZpvd + ", isManageMode=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Fragment(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0856ActionBar extends ActionBar {
            public final java.util.List<AlertUiItem> AEQbTJ;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$ActionBar */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0856ActionBar copy$default(C0856ActionBar c0856ActionBar, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = c0856ActionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = c0856ActionBar.copydefault;
                }
                return c0856ActionBar.copydefault(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0856ActionBar copydefault(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0856ActionBar(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0856ActionBar)) {
                    return false;
                }
                C0856ActionBar c0856ActionBar = (C0856ActionBar) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, c0856ActionBar.AEQbTJ) && this.copydefault == c0856ActionBar.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AlertsStateChangeSuccess(alertList=" + this.AEQbTJ + ", isManageMode=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0856ActionBar(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$StateListAnimator */
        public static final class StateListAnimator extends ActionBar {
            public final java.util.List<AlertUiItem> AEQbTJ;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = stateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = stateListAnimator.copydefault;
                }
                return stateListAnimator.EZpvd(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AlertsStateChangeFailed(alertList=" + this.AEQbTJ + ", isManageMode=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: o.jHy$ActionBar$Activity */
        public static final class Activity extends ActionBar {
            public final java.util.List<AlertUiItem> AEQbTJ;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHy$ActionBar$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = activity.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = activity.copydefault;
                }
                return activity.AEQbTJ(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC25830jHy.ActionBar
            public java.util.List<AlertUiItem> EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && this.copydefault == activity.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AddedOrModifiedAlert(alertList=" + this.AEQbTJ + ", isManageMode=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.data.model.alert.AlertUiItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
                super(list, z, null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
                this.copydefault = z;
            }
        }
    }

    /* JADX INFO: renamed from: o.jHy$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25830jHy {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jHy$Application */
    public static final class Application implements InterfaceC25830jHy {
        public final boolean AEQbTJ;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public Application() {
            boolean z = false;
            this(z, z, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.KWHzl;
            }
            if ((i & 2) != 0) {
                z2 = application.AEQbTJ;
            }
            return application.AEQbTJ(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(boolean z, boolean z2) {
            return new Application(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.KWHzl == application.KWHzl && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(isDeleteAll=" + this.KWHzl + ", showAddNewAlert=" + this.AEQbTJ + ")";
        }

        public Application(boolean z, boolean z2) {
            this.KWHzl = z;
            this.AEQbTJ = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:64) call: o.jHy.Application.<init>(boolean, boolean):void type: THIS */
        public /* synthetic */ Application(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    /* JADX INFO: renamed from: o.jHy$TaskDescription */
    public static final class TaskDescription implements InterfaceC25830jHy {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }
}
