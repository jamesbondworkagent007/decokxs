package com.okinc.oklive.app.ui.list.displaymodel;

import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.PinnedMessageModel;
import com.okinc.oklive.app.data.model.remote.TokenIcon;
import com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44442sPz;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LiveStreamCustomMessageUpdate {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LiveStreamCustomMessageUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LiveStreamCustomMessageUpdate() {
    }

    public static final class AssistContent extends LiveStreamCustomMessageUpdate {
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = assistContent.KWHzl;
            }
            return assistContent.KWHzl(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent KWHzl(long j) {
            return new AssistContent(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && this.KWHzl == ((AssistContent) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewerCountUpdate(viewerCount=" + this.KWHzl + ")";
        }

        public AssistContent(long j) {
            super(null);
            this.KWHzl = j;
        }
    }

    public static final class Application extends LiveStreamCustomMessageUpdate {
        public final LiveStreamStatus AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, LiveStreamStatus liveStreamStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                liveStreamStatus = application.AEQbTJ;
            }
            return application.OLrzqt(liveStreamStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull LiveStreamStatus liveStreamStatus) {
            Intrinsics.checkNotNullParameter(liveStreamStatus, "");
            return new Application(liveStreamStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LiveStreamStatus copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.AEQbTJ == ((Application) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LiveStreamStatusUpdate(status=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LiveStreamStatus liveStreamStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(liveStreamStatus, "");
            this.AEQbTJ = liveStreamStatus;
        }
    }

    public static final class FragmentManager extends LiveStreamCustomMessageUpdate {
        public final LoaderManager.ActionBar AEQbTJ;
        public final String AYXKKw;
        public final List<TokenIcon> AhwBna;
        public final int AkhnZx;
        public final LoaderManager.Application EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final String fetchVPNInfo;
        public final Boolean gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean DbNXlk() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager.Application OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault(int i, LoaderManager.ActionBar actionBar, LoaderManager.Application application, String str, String str2, Boolean bool, String str3, String str4, List<TokenIcon> list, String str5, String str6, String str7) {
            return new FragmentManager(i, actionBar, application, str, str2, bool, str3, str4, list, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager.ActionBar copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return this.AkhnZx == fragmentManager.AkhnZx && Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, fragmentManager.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) fragmentManager.AYXKKw) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) fragmentManager.fetchVPNInfo) && Intrinsics.EZpvd(this.gEmmrt, fragmentManager.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) fragmentManager.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fragmentManager.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, fragmentManager.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) fragmentManager.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) fragmentManager.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) fragmentManager.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TokenIcon> gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.AkhnZx);
            LoaderManager.ActionBar actionBar = this.AEQbTJ;
            int iHashCode2 = actionBar == null ? 0 : actionBar.hashCode();
            LoaderManager.Application application = this.EZpvd;
            int iHashCode3 = application == null ? 0 : application.hashCode();
            String str = this.AYXKKw;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.fetchVPNInfo;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.gEmmrt;
            int iHashCode6 = bool == null ? 0 : bool.hashCode();
            String str3 = this.valueOf;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.OLrzqt;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            List<TokenIcon> list = this.AhwBna;
            int iHashCode9 = list == null ? 0 : list.hashCode();
            String str5 = this.copydefault;
            int iHashCode10 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.KWHzl;
            int iHashCode11 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.djBIcL;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenUpdate(tokenType=" + this.AkhnZx + ", cefiToken=" + this.AEQbTJ + ", cedefiToken=" + this.EZpvd + ", tokenName=" + this.AYXKKw + ", tokenSymbol=" + this.fetchVPNInfo + ", isDexListed=" + this.gEmmrt + ", tokenLogo=" + this.valueOf + ", chainLogo=" + this.OLrzqt + ", icons=" + this.AhwBna + ", currentPrice=" + this.copydefault + ", change1h=" + this.KWHzl + ", marketCap=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.fetchVPNInfo;
        }

        public FragmentManager(int i, LoaderManager.ActionBar actionBar, LoaderManager.Application application, String str, String str2, Boolean bool, String str3, String str4, List<TokenIcon> list, String str5, String str6, String str7) {
            super(null);
            this.AkhnZx = i;
            this.AEQbTJ = actionBar;
            this.EZpvd = application;
            this.AYXKKw = str;
            this.fetchVPNInfo = str2;
            this.gEmmrt = bool;
            this.valueOf = str3;
            this.OLrzqt = str4;
            this.AhwBna = list;
            this.copydefault = str5;
            this.KWHzl = str6;
            this.djBIcL = str7;
        }
    }

    public static final class StateListAnimator extends LiveStreamCustomMessageUpdate {
        public final Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Fragment fragment, int i, Object obj) {
            if ((i & 1) != 0) {
                fragment = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return new StateListAnimator(fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ModeratorAssignUpdate(participant=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.AEQbTJ = fragment;
        }
    }

    public static final class Activity extends LiveStreamCustomMessageUpdate {
        public final Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, Fragment fragment, int i, Object obj) {
            if ((i & 1) != 0) {
                fragment = activity.KWHzl;
            }
            return activity.OLrzqt(fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return new Activity(fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ModeratorRevokeUpdate(participant=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.KWHzl = fragment;
        }
    }

    public static final class TaskDescription extends LiveStreamCustomMessageUpdate {
        public final String AEQbTJ;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            String str = this.AEQbTJ;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GenericUpdate(bizName=" + this.KWHzl + ", data=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class LoaderManager {
        public static final LoaderManager AEQbTJ = new LoaderManager();

        private LoaderManager() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar {
            public final String AEQbTJ;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = actionBar.OLrzqt;
                }
                return actionBar.AEQbTJ(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ActionBar(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
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
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CefiToken(instId=" + this.AEQbTJ + ", instType=" + this.OLrzqt + ")";
            }

            public ActionBar(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.OLrzqt = str2;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application {
            public final String EZpvd;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = application.OLrzqt;
                }
                return application.copydefault(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(str, str2);
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
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) application.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CedefiToken(chainId=" + this.EZpvd + ", contractAddress=" + this.OLrzqt + ")";
            }

            public Application(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.EZpvd = str;
                this.OLrzqt = str2;
            }
        }
    }

    public static final class ActionBar extends LiveStreamCustomMessageUpdate {
        public final Fragment AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, Fragment fragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                fragment = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull String str, @NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            return new ActionBar(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MuteUserUpdate(bizName=" + this.copydefault + ", participant=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull String str, @NotNull Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            this.copydefault = str;
            this.AEQbTJ = fragment;
        }
    }

    public static final class PendingIntent extends LiveStreamCustomMessageUpdate {
        public final String AEQbTJ;
        public final Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, String str, Fragment fragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.AEQbTJ;
            }
            if ((i & 2) != 0) {
                fragment = pendingIntent.copydefault;
            }
            return pendingIntent.copydefault(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent copydefault(@NotNull String str, @NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            return new PendingIntent(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) pendingIntent.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RemoveViewerUpdate(bizName=" + this.AEQbTJ + ", participant=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull String str, @NotNull Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            this.AEQbTJ = str;
            this.copydefault = fragment;
        }
    }

    public static final class Dialog extends LiveStreamCustomMessageUpdate {
        public final long AEQbTJ;
        public final PinnedMessageModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, long j, PinnedMessageModel pinnedMessageModel, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dialog.AEQbTJ;
            }
            if ((i & 2) != 0) {
                pinnedMessageModel = dialog.EZpvd;
            }
            return dialog.EZpvd(j, pinnedMessageModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PinnedMessageModel EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog EZpvd(long j, PinnedMessageModel pinnedMessageModel) {
            return new Dialog(j, pinnedMessageModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return this.AEQbTJ == dialog.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, dialog.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.AEQbTJ);
            PinnedMessageModel pinnedMessageModel = this.EZpvd;
            return (iHashCode * 31) + (pinnedMessageModel == null ? 0 : pinnedMessageModel.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PinMessageUpdate(messageSeq=" + this.AEQbTJ + ", message=" + this.EZpvd + ")";
        }

        public Dialog(long j, PinnedMessageModel pinnedMessageModel) {
            super(null);
            this.AEQbTJ = j;
            this.EZpvd = pinnedMessageModel;
        }
    }

    public static final class SharedElementCallback extends LiveStreamCustomMessageUpdate {
        public final long AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sharedElementCallback.AEQbTJ;
            }
            return sharedElementCallback.KWHzl(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback KWHzl(long j) {
            return new SharedElementCallback(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SharedElementCallback) && this.AEQbTJ == ((SharedElementCallback) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnpinMessageUpdate(messageSeq=" + this.AEQbTJ + ")";
        }

        public SharedElementCallback(long j) {
            super(null);
            this.AEQbTJ = j;
        }
    }

    public static final class Fragment {
        public static final int KWHzl = 8;
        public final UserRole AEQbTJ;
        public final long AYXKKw;
        public final String EZpvd;
        public final boolean OLrzqt;
        public final String copydefault;
        public final List<String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment AEQbTJ(long j, String str, String str2, @NotNull UserRole userRole, boolean z, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(userRole, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Fragment(j, str, str2, userRole, z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return this.AYXKKw == fragment.AYXKKw && Intrinsics.EZpvd((Object) this.copydefault, (Object) fragment.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) fragment.EZpvd) && this.AEQbTJ == fragment.AEQbTJ && this.OLrzqt == fragment.OLrzqt && Intrinsics.EZpvd(this.valueOf, fragment.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.AYXKKw);
            String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ParticipantInfo(userUid=" + this.AYXKKw + ", nickname=" + this.copydefault + ", avatar=" + this.EZpvd + ", role=" + this.AEQbTJ + ", isMuted=" + this.OLrzqt + ", tags=" + this.valueOf + ")";
        }

        public Fragment(long j, String str, String str2, @NotNull UserRole userRole, boolean z, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(userRole, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AYXKKw = j;
            this.copydefault = str;
            this.EZpvd = str2;
            this.AEQbTJ = userRole;
            this.OLrzqt = z;
            this.valueOf = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable(with = VoiceInteractor.class)
    public static final class UserRole {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UserRole[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private final int code;
        public static final UserRole HOST = new UserRole("HOST", 0, 1);
        public static final UserRole VIEWER = new UserRole("VIEWER", 1, 2);
        public static final UserRole MODERATOR = new UserRole("MODERATOR", 2, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UserRole[] $values() {
            return new UserRole[]{HOST, VIEWER, MODERATOR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UserRole> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        private UserRole(String str, int i, int i2) {
            this.code = i2;
        }

        static {
            UserRole[] userRoleArr$values = $values();
            $VALUES = userRoleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(userRoleArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sUt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LiveStreamCustomMessageUpdate.UserRole._init_$_anonymous_();
                }
            });
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.code);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate.UserRole.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ KSerializer AEQbTJ() {
                return (KSerializer) UserRole.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<UserRole> serializer() {
                return AEQbTJ();
            }

            public final UserRole copydefault(int i) {
                UserRole next;
                Iterator<UserRole> it = UserRole.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.getCode() == i) {
                        break;
                    }
                }
                return next;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new VoiceInteractor();
        }

        public static UserRole valueOf(String str) {
            return (UserRole) Enum.valueOf(UserRole.class, str);
        }

        public static UserRole[] values() {
            return (UserRole[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class VoiceInteractor extends C44442sPz<UserRole> {
        public VoiceInteractor() {
            super("UserRole", UserRole.values(), new Function1() { // from class: o.sUA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(LiveStreamCustomMessageUpdate.VoiceInteractor.copydefault((LiveStreamCustomMessageUpdate.UserRole) obj));
                }
            }, new Function1() { // from class: o.sUB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LiveStreamCustomMessageUpdate.VoiceInteractor.copydefault(((java.lang.Integer) obj).intValue());
                }
            });
        }

        public static final int copydefault(UserRole userRole) {
            Intrinsics.checkNotNullParameter(userRole, "");
            return userRole.getCode();
        }

        public static final UserRole copydefault(int i) {
            UserRole userRoleCopydefault = UserRole.Companion.copydefault(i);
            return userRoleCopydefault == null ? UserRole.VIEWER : userRoleCopydefault;
        }
    }
}
