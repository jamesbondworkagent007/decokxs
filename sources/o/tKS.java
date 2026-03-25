package o;

import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.tTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class tKS extends tTL {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKS.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ tKS(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private tKS() {
        super("Leaderboard_HomePage_Button_Click");
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final class LoaderManager extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.LoaderManager.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ LoaderManager(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ LoaderManager m8725copysnCYxlk$default(LoaderManager loaderManager, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = loaderManager.OLrzqt;
            }
            return loaderManager.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new LoaderManager(str, str2, null);
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
            java.lang.String str = this.EZpvd;
            java.lang.String str2 = loaderManager.EZpvd;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) loaderManager.OLrzqt);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.EZpvd;
            return "Follow(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AEQbTJ = EZpvd(EZpvd(), "follow", str2);
        }
    }

    public static final class VoiceInteractor extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, tTL.Application> EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.VoiceInteractor.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ VoiceInteractor(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ VoiceInteractor m8731copysnCYxlk$default(VoiceInteractor voiceInteractor, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = voiceInteractor.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = voiceInteractor.KWHzl;
            }
            return voiceInteractor.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new VoiceInteractor(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.EZpvd;
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
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = voiceInteractor.AEQbTJ;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) voiceInteractor.KWHzl);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AEQbTJ;
            return "Unfollow(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.EZpvd = EZpvd(KWHzl(), "unfollow", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskStackBuilder extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, tTL.Application> KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.TaskStackBuilder.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskStackBuilder(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ TaskStackBuilder m8730copysnCYxlk$default(TaskStackBuilder taskStackBuilder, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskStackBuilder.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskStackBuilder.OLrzqt;
            }
            return taskStackBuilder.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskStackBuilder(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.KWHzl;
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
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = taskStackBuilder.AEQbTJ;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskStackBuilder.OLrzqt);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AEQbTJ;
            return "Share(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = EZpvd(OLrzqt(), "share", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Fragment extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, tTL.Application> KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.Fragment.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Fragment(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ Fragment m8723copysnCYxlk$default(Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = fragment.AEQbTJ;
            }
            return fragment.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new Fragment(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.KWHzl;
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
            java.lang.String str = this.copydefault;
            java.lang.String str2 = fragment.copydefault;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragment.AEQbTJ);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.copydefault;
            return "GraphPnlRatio(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.KWHzl = EZpvd(EZpvd(), "graph_pnl_ratio", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Dialog extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.Dialog.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ Dialog m8722copysnCYxlk$default(Dialog dialog, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = dialog.copydefault;
            }
            return dialog.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new Dialog(str, str2, null);
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
            java.lang.String str = this.KWHzl;
            java.lang.String str2 = dialog.KWHzl;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dialog.copydefault);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.KWHzl;
            return "GraphPnl(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = EZpvd(EZpvd(), "graph_pnl", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ Application m8720copysnCYxlk$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.EZpvd;
            }
            return application.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2, null);
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
            java.lang.String str = this.KWHzl;
            java.lang.String str2 = application.KWHzl;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.KWHzl;
            return "FilterSevenDays(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.AEQbTJ = EZpvd(OLrzqt(), "filter_seven_days", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class FragmentManager extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.FragmentManager.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ FragmentManager(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ FragmentManager m8724copysnCYxlk$default(FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = fragmentManager.OLrzqt;
            }
            return fragmentManager.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new FragmentManager(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.AEQbTJ;
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
            java.lang.String str = this.EZpvd;
            java.lang.String str2 = fragmentManager.EZpvd;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragmentManager.OLrzqt);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.EZpvd;
            return "FilterThirtyDays(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AEQbTJ = EZpvd(AEQbTJ(), "filter_thirty_days", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, tTL.Application> EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.StateListAnimator.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ StateListAnimator m8728copysnCYxlk$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            return stateListAnimator.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.EZpvd;
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
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = stateListAnimator.AEQbTJ;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AEQbTJ;
            return "FilterNinetyDays(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.EZpvd = EZpvd(EZpvd(), "filter_ninety_days", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.util.Map<java.lang.String, tTL.Application> copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.TaskDescription.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ TaskDescription m8729copysnCYxlk$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.copydefault;
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
            java.lang.String str = this.KWHzl;
            java.lang.String str2 = taskDescription.KWHzl;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.KWHzl;
            return "FilterOneYear(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.copydefault = EZpvd(AEQbTJ(), "filter_one_year", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.ActionBar.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ ActionBar m8719copysnCYxlk$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.KWHzl;
            }
            return actionBar.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            java.lang.String str = this.OLrzqt;
            java.lang.String str2 = actionBar.OLrzqt;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.OLrzqt;
            return "FilterAll(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.AEQbTJ = EZpvd(KWHzl(), "filter_all", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class AssistContent extends tKS {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, tTL.Application> KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.AssistContent.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ AssistContent(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ AssistContent m8721copysnCYxlk$default(AssistContent assistContent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = assistContent.OLrzqt;
            }
            return assistContent.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new AssistContent(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.KWHzl;
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
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = assistContent.AEQbTJ;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) assistContent.OLrzqt);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AEQbTJ;
            return "Positions(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = EZpvd(AEQbTJ(), "positions", str2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class PendingIntent extends tKS {
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.util.Map<java.lang.String, tTL.Application> copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.PendingIntent.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PendingIntent(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ PendingIntent m8726copysnCYxlk$default(PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = pendingIntent.OLrzqt;
            }
            return pendingIntent.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new PendingIntent(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
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
            java.lang.String str = this.EZpvd;
            java.lang.String str2 = pendingIntent.EZpvd;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pendingIntent.OLrzqt);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.EZpvd;
            return "LatestRecords(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.copydefault = EZpvd(EZpvd(), "latest_records", str2);
        }
    }

    public static final class PictureInPictureParams extends tKS {
        public final java.util.Map<java.lang.String, tTL.Application> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: o.tKS.PictureInPictureParams.<init>(java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PictureInPictureParams(java.lang.String str, java.lang.String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-snCYxlk$default, reason: not valid java name */
        public static /* synthetic */ PictureInPictureParams m8727copysnCYxlk$default(PictureInPictureParams pictureInPictureParams, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pictureInPictureParams.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = pictureInPictureParams.copydefault;
            }
            return pictureInPictureParams.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new PictureInPictureParams(str, str2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tTL
        public java.util.Map<java.lang.String, tTL.Application> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PictureInPictureParams)) {
                return false;
            }
            PictureInPictureParams pictureInPictureParams = (PictureInPictureParams) obj;
            java.lang.String str = this.OLrzqt;
            java.lang.String str2 = pictureInPictureParams.OLrzqt;
            if (str != null ? str2 != null && PlanetUniqueName.KWHzl(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pictureInPictureParams.copydefault);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            return ((str == null ? 0 : PlanetUniqueName.OLrzqt(str)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.OLrzqt;
            return "Setting(uniqueName=" + (str == null ? AbstractJsonLexerKt.NULL : PlanetUniqueName.copydefault(str)) + ", page=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PictureInPictureParams(java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
            this.KWHzl = EZpvd(KWHzl(), "settings", str2);
        }
    }

    public final java.util.Map<java.lang.String, tTL.Application> EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("button", new tTL.Application(str2, true)), C56390yDp.OLrzqt("type", new tTL.Application(tKU.Companion.KWHzl().valueOf() ? "main" : "objective", false)), C56390yDp.OLrzqt("page", new tTL.Application(str3, true)));
    }
}
