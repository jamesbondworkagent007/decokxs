package o;

import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.okimcore.model.im.OKCallSession;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ood, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC37162ood {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ood.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC37162ood(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.Float AEQbTJ();

    public abstract AudioCallUIParams EZpvd();

    public abstract java.lang.Float OLrzqt();

    private AbstractC37162ood() {
    }

    /* JADX INFO: renamed from: o.ood$Activity */
    public static final class Activity extends AbstractC37162ood {
        public static final int EZpvd = OKCallSession.$stable;
        public final java.lang.Float AEQbTJ;
        public final AudioCallUIParams AhwBna;
        public final java.lang.String KWHzl;
        public final OKCallSession OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;
        public final java.lang.Float valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = activity.gEmmrt;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                oKCallSession = activity.OLrzqt;
            }
            OKCallSession oKCallSession2 = oKCallSession;
            if ((i & 16) != 0) {
                audioCallUIParams = activity.AhwBna;
            }
            AudioCallUIParams audioCallUIParams2 = audioCallUIParams;
            if ((i & 32) != 0) {
                f = activity.AEQbTJ;
            }
            java.lang.Float f3 = f;
            if ((i & 64) != 0) {
                f2 = activity.valueOf;
            }
            return activity.OLrzqt(str, str4, str5, oKCallSession2, audioCallUIParams2, f3, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public AudioCallUIParams EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, str2, str3, oKCallSession, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCallSession copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, activity.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.gEmmrt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            OKCallSession oKCallSession = this.OLrzqt;
            int iHashCode4 = oKCallSession == null ? 0 : oKCallSession.hashCode();
            AudioCallUIParams audioCallUIParams = this.AhwBna;
            int iHashCode5 = audioCallUIParams == null ? 0 : audioCallUIParams.hashCode();
            java.lang.Float f = this.AEQbTJ;
            int iHashCode6 = f == null ? 0 : f.hashCode();
            java.lang.Float f2 = this.valueOf;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OneToOneCall(action=" + this.KWHzl + ", conversationId=" + this.copydefault + ", remoteUserId=" + this.gEmmrt + ", callSession=" + this.OLrzqt + ", uiParams=" + this.AhwBna + ", floatingViewX=" + this.AEQbTJ + ", floatingViewY=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKCallSession:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKCallSession) : (r11v0 com.okinc.okimcore.model.im.OKCallSession))
  (wrap:com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams) : (r12v0 com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r13v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0024: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.Float) : (null java.lang.Float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKCallSession, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void (m)] (LINE:31) call: o.ood.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKCallSession, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : oKCallSession, (i & 16) != 0 ? null : audioCallUIParams, (i & 32) != 0 ? null : f, (i & 64) == 0 ? f2 : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.gEmmrt = str3;
            this.OLrzqt = oKCallSession;
            this.AhwBna = audioCallUIParams;
            this.AEQbTJ = f;
            this.valueOf = f2;
        }
    }

    /* JADX INFO: renamed from: o.ood$LoaderManager */
    public static final class LoaderManager extends AbstractC37162ood {
        public final java.lang.Float AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.Float KWHzl;
        public final java.util.List<java.lang.String> OLrzqt;
        public final AudioCallUIParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ood$LoaderManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, java.util.List list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.EZpvd;
            }
            if ((i & 2) != 0) {
                list = loaderManager.OLrzqt;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                audioCallUIParams = loaderManager.copydefault;
            }
            AudioCallUIParams audioCallUIParams2 = audioCallUIParams;
            if ((i & 8) != 0) {
                f = loaderManager.AEQbTJ;
            }
            java.lang.Float f3 = f;
            if ((i & 16) != 0) {
                f2 = loaderManager.KWHzl;
            }
            return loaderManager.KWHzl(str, list2, audioCallUIParams2, f3, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public AudioCallUIParams EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new LoaderManager(str, list, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) loaderManager.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, loaderManager.OLrzqt) && Intrinsics.EZpvd(this.copydefault, loaderManager.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, loaderManager.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, loaderManager.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            AudioCallUIParams audioCallUIParams = this.copydefault;
            int iHashCode3 = audioCallUIParams == null ? 0 : audioCallUIParams.hashCode();
            java.lang.Float f = this.AEQbTJ;
            int iHashCode4 = f == null ? 0 : f.hashCode();
            java.lang.Float f2 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StartGroupCall(groupId=" + this.EZpvd + ", targetUids=" + this.OLrzqt + ", uiParams=" + this.copydefault + ", floatingViewX=" + this.AEQbTJ + ", floatingViewY=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.util.List)
  (wrap:com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams) : (r10v0 com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r11v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r12v0 java.lang.Float))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void (m)] (LINE:47) call: o.ood.LoaderManager.<init>(java.lang.String, java.util.List, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void type: THIS */
        public /* synthetic */ LoaderManager(java.lang.String str, java.util.List list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? null : audioCallUIParams, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : f2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = str;
            this.OLrzqt = list;
            this.copydefault = audioCallUIParams;
            this.AEQbTJ = f;
            this.KWHzl = f2;
        }
    }

    /* JADX INFO: renamed from: o.ood$ActionBar */
    public static final class ActionBar extends AbstractC37162ood {
        public final java.lang.Float EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.Float OLrzqt;
        public final AudioCallUIParams copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                audioCallUIParams = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                f = actionBar.OLrzqt;
            }
            if ((i & 8) != 0) {
                f2 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public AudioCallUIParams EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float OLrzqt() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            AudioCallUIParams audioCallUIParams = this.copydefault;
            int iHashCode2 = audioCallUIParams == null ? 0 : audioCallUIParams.hashCode();
            java.lang.Float f = this.OLrzqt;
            int iHashCode3 = f == null ? 0 : f.hashCode();
            java.lang.Float f2 = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "JoinGroupCall(groupId=" + this.KWHzl + ", uiParams=" + this.copydefault + ", floatingViewX=" + this.OLrzqt + ", floatingViewY=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams) : (r3v0 com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r4v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r5v0 java.lang.Float))
 A[MD:(java.lang.String, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void (m)] (LINE:61) call: o.ood.ActionBar.<init>(java.lang.String, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : audioCallUIParams, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.copydefault = audioCallUIParams;
            this.OLrzqt = f;
            this.EZpvd = f2;
        }
    }

    /* JADX INFO: renamed from: o.ood$Application */
    public static final class Application extends AbstractC37162ood {
        public static final int AEQbTJ = OKCallSession.$stable;
        public final java.lang.String EZpvd;
        public final java.lang.Float KWHzl;
        public final OKCallSession OLrzqt;
        public final java.lang.Float copydefault;
        public final AudioCallUIParams valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                oKCallSession = application.OLrzqt;
            }
            OKCallSession oKCallSession2 = oKCallSession;
            if ((i & 4) != 0) {
                audioCallUIParams = application.valueOf;
            }
            AudioCallUIParams audioCallUIParams2 = audioCallUIParams;
            if ((i & 8) != 0) {
                f = application.KWHzl;
            }
            java.lang.Float f3 = f;
            if ((i & 16) != 0) {
                f2 = application.copydefault;
            }
            return application.AEQbTJ(str, oKCallSession2, audioCallUIParams2, f3, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKCallSession, "");
            return new Application(str, oKCallSession, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public AudioCallUIParams EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCallSession KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.valueOf, application.valueOf) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            AudioCallUIParams audioCallUIParams = this.valueOf;
            int iHashCode3 = audioCallUIParams == null ? 0 : audioCallUIParams.hashCode();
            java.lang.Float f = this.KWHzl;
            int iHashCode4 = f == null ? 0 : f.hashCode();
            java.lang.Float f2 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IncomingGroupCall(groupId=" + this.EZpvd + ", callSession=" + this.OLrzqt + ", uiParams=" + this.valueOf + ", floatingViewX=" + this.KWHzl + ", floatingViewY=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.okimcore.model.im.OKCallSession)
  (wrap:com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams) : (r10v0 com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r11v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r12v0 java.lang.Float))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.OKCallSession, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void (m)] (LINE:78) call: o.ood.Application.<init>(java.lang.String, com.okinc.okimcore.model.im.OKCallSession, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams, java.lang.Float, java.lang.Float):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, oKCallSession, (i & 4) != 0 ? null : audioCallUIParams, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : f2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull OKCallSession oKCallSession, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKCallSession, "");
            this.EZpvd = str;
            this.OLrzqt = oKCallSession;
            this.valueOf = audioCallUIParams;
            this.KWHzl = f;
            this.copydefault = f2;
        }
    }

    /* JADX INFO: renamed from: o.ood$StateListAnimator */
    public static final class StateListAnimator extends AbstractC37162ood {
        public final AudioCallUIParams AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final java.lang.Float OLrzqt;
        public final java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ood$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                audioCallUIParams = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                f = stateListAnimator.OLrzqt;
            }
            if ((i & 8) != 0) {
                f2 = stateListAnimator.copydefault;
            }
            return stateListAnimator.KWHzl(list, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public AudioCallUIParams EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.util.List<java.lang.String> list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, audioCallUIParams, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC37162ood
        public java.lang.Float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
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
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            AudioCallUIParams audioCallUIParams = this.AEQbTJ;
            int iHashCode2 = audioCallUIParams == null ? 0 : audioCallUIParams.hashCode();
            java.lang.Float f = this.OLrzqt;
            int iHashCode3 = f == null ? 0 : f.hashCode();
            java.lang.Float f2 = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f2 != null ? f2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RingGroupCallUsers(targetUids=" + this.EZpvd + ", uiParams=" + this.AEQbTJ + ", floatingViewX=" + this.OLrzqt + ", floatingViewY=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.util.List<java.lang.String> list, AudioCallUIParams audioCallUIParams, java.lang.Float f, java.lang.Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.AEQbTJ = audioCallUIParams;
            this.OLrzqt = f;
            this.copydefault = f2;
        }
    }

    /* JADX INFO: renamed from: o.ood$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ood.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull AbstractC37162ood abstractC37162ood) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(abstractC37162ood, "");
            C44124sEe.imLogVoiceCall$default("AudioCallServiceRequest:createServiceIntent " + C37167ooi.EZpvd(abstractC37162ood), null, 2, null);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ServiceC37177oos.class);
            AudioCallUIParams audioCallUIParamsEZpvd = abstractC37162ood.EZpvd();
            if (audioCallUIParamsEZpvd != null) {
                intent.putExtra("key_audio_call_ui_params", audioCallUIParamsEZpvd);
            }
            java.lang.Float fOLrzqt = abstractC37162ood.OLrzqt();
            if (fOLrzqt != null) {
                if (fOLrzqt.floatValue() < 0.0f) {
                    fOLrzqt = null;
                }
                if (fOLrzqt != null) {
                    intent.putExtra("key_floating_view_x", fOLrzqt.floatValue());
                }
            }
            java.lang.Float fAEQbTJ = abstractC37162ood.AEQbTJ();
            if (fAEQbTJ != null) {
                java.lang.Float f = fAEQbTJ.floatValue() >= 0.0f ? fAEQbTJ : null;
                if (f != null) {
                    intent.putExtra("key_floating_view_y", f.floatValue());
                }
            }
            if (abstractC37162ood instanceof Activity) {
                Activity activity = (Activity) abstractC37162ood;
                intent.putExtra("key_audio_call_event", activity.KWHzl());
                java.lang.String strDjBIcL = activity.djBIcL();
                if (strDjBIcL != null) {
                    intent.putExtra("key_audio_call_target_id", strDjBIcL);
                }
                java.lang.String strAYXKKw = activity.AYXKKw();
                if (strAYXKKw != null) {
                    intent.putExtra("key_audio_call_contact_id", strAYXKKw);
                }
                OKCallSession oKCallSessionCopydefault = activity.copydefault();
                if (oKCallSessionCopydefault != null) {
                    intent.putExtra("key_audio_call_call_session_event", oKCallSessionCopydefault);
                    Unit unit = Unit.INSTANCE;
                }
            } else if (abstractC37162ood instanceof LoaderManager) {
                intent.putExtra("key_audio_call_event", "action_audio_call_start_group_call");
                LoaderManager loaderManager = (LoaderManager) abstractC37162ood;
                intent.putExtra("key_audio_call_group_id", loaderManager.copydefault());
                intent.putStringArrayListExtra("key_audio_call_target_uids", new java.util.ArrayList<>(loaderManager.KWHzl()));
            } else if (abstractC37162ood instanceof ActionBar) {
                intent.putExtra("key_audio_call_event", "action_audio_call_join_group_call");
                intent.putExtra("key_audio_call_group_id", ((ActionBar) abstractC37162ood).KWHzl());
            } else if (abstractC37162ood instanceof Application) {
                intent.putExtra("key_audio_call_event", "action_audio_call_incoming_group_call");
                Application application = (Application) abstractC37162ood;
                intent.putExtra("key_audio_call_group_id", application.copydefault());
                intent.putExtra("key_audio_call_call_session_event", application.KWHzl());
            } else {
                if (!(abstractC37162ood instanceof StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                intent.putExtra("key_audio_call_event", "action_audio_call_ring_group_call_users");
                intent.putStringArrayListExtra("key_audio_call_target_uids", new java.util.ArrayList<>(((StateListAnimator) abstractC37162ood).copydefault()));
            }
            return intent;
        }
    }
}
