package o;

import com.okinc.business.dex.tee.common.wallet.model.SmartAccountState$NotSmartAccount$onButtonClick$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.dTQ;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gLQ {

    public interface Fragment {
        java.lang.String AEQbTJ(@NotNull android.content.Context context);

        void KWHzl(@NotNull android.content.Context context);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gLQ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ gLQ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean AEQbTJ();

    public abstract java.lang.String EZpvd(@NotNull android.content.Context context);

    public abstract Function2<android.content.Context, CoroutineScope, Unit> EZpvd();

    public abstract Fragment KWHzl();

    public abstract java.lang.String copydefault(@NotNull android.content.Context context);

    public abstract boolean copydefault();

    private gLQ() {
    }

    public static final class Dialog extends gLQ {
        public static final Fragment AYXKKw = null;
        public static final boolean EZpvd = false;
        public static final Function2<android.content.Context, CoroutineScope, Unit> KWHzl = null;
        public static final boolean copydefault = false;
        public static final Dialog OLrzqt = new Dialog();
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return copydefault;
        }

        private Dialog() {
            super(null);
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.handleMediaPlayPauseKeySingleTapIfPending);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class ActionBar extends gLQ {
        public final boolean AEQbTJ;
        public final Fragment AhwBna;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final Function2<android.content.Context, CoroutineScope, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.copydefault(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
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
            return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NotSmartAccount(isLimitOrder=" + this.KWHzl + ", accountId=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(boolean z, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = z;
            this.EZpvd = str;
            this.AEQbTJ = true;
            this.copydefault = new Function2() { // from class: o.gLR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return gLQ.ActionBar.AEQbTJ(this.AEQbTJ, (android.content.Context) obj, (CoroutineScope) obj2);
                }
            };
        }

        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(context, "");
            if (this.KWHzl) {
                string = context.getString(C23274hvD.Fragment.MediaSessionCompat2);
            } else {
                string = context.getString(C23274hvD.Fragment.setRatingType);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }

        public static final Unit AEQbTJ(ActionBar actionBar, android.content.Context context, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SmartAccountState$NotSmartAccount$onButtonClick$1$1(context, actionBar, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager extends gLQ {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final boolean djBIcL;
        public final Fragment gEmmrt;
        public final Function2<android.content.Context, CoroutineScope, Unit> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, boolean z, java.lang.String str, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = fragmentManager.copydefault;
            }
            if ((i & 2) != 0) {
                str = fragmentManager.EZpvd;
            }
            if ((i & 4) != 0) {
                z2 = fragmentManager.KWHzl;
            }
            if ((i & 8) != 0) {
                z3 = fragmentManager.djBIcL;
            }
            return fragmentManager.copydefault(z, str, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FragmentManager(z, str, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return this.OLrzqt;
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
            return this.copydefault == fragmentManager.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fragmentManager.EZpvd) && this.KWHzl == fragmentManager.KWHzl && this.djBIcL == fragmentManager.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.copydefault) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmartAccountDisabled(isLimitOrder=" + this.copydefault + ", accountId=" + this.EZpvd + ", isCopyTrading=" + this.KWHzl + ", isManualClose=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 boolean)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, java.lang.String, boolean, boolean):void (m)] (LINE:67) call: o.gLQ.FragmentManager.<init>(boolean, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ FragmentManager(boolean z, java.lang.String str, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = z;
            this.EZpvd = str;
            this.KWHzl = z2;
            this.djBIcL = z3;
            this.OLrzqt = true;
            this.valueOf = new Function2() { // from class: o.gLX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return gLQ.FragmentManager.KWHzl(this.AEQbTJ, (android.content.Context) obj, (CoroutineScope) obj2);
                }
            };
        }

        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(context, "");
            if (this.copydefault) {
                string = context.getString(C23274hvD.Fragment.setSessionActivity);
            } else {
                string = context.getString(C23274hvD.Fragment.MediaSessionCompat1);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }

        public static final Unit KWHzl(FragmentManager fragmentManager, android.content.Context context, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default((dTQ) C43251rlk.copydefault(dTQ.class), context, fragmentManager.EZpvd, null, gLZ.EZpvd(fragmentManager.KWHzl, fragmentManager.copydefault), 4, null);
            return Unit.INSTANCE;
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.MediaSessionCompatApi21QueueItem);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class LoaderManager extends gLQ {
        public static final Function2<android.content.Context, CoroutineScope, Unit> EZpvd = null;
        public static final boolean KWHzl = false;
        public static final boolean OLrzqt = false;
        public static final Fragment gEmmrt = null;
        public static final LoaderManager AEQbTJ = new LoaderManager();
        public static final int copydefault = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return OLrzqt;
        }

        private LoaderManager() {
            super(null);
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.onCommand);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class AssistContent extends gLQ {
        public final boolean AEQbTJ;
        public final Fragment AhwBna;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final Function2<android.content.Context, CoroutineScope, Unit> djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = assistContent.EZpvd;
            }
            if ((i & 2) != 0) {
                str = assistContent.copydefault;
            }
            if ((i & 4) != 0) {
                z2 = assistContent.AEQbTJ;
            }
            return assistContent.OLrzqt(z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent OLrzqt(boolean z, @NotNull java.lang.String str, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
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
            return this.EZpvd == assistContent.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) assistContent.copydefault) && this.AEQbTJ == assistContent.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TeeServiceUpgradedRenewRequired(isLimitOrder=" + this.EZpvd + ", accountId=" + this.copydefault + ", isCopyTrading=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:105) call: o.gLQ.AssistContent.<init>(boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ AssistContent(boolean z, java.lang.String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, (i & 4) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(boolean z, @NotNull java.lang.String str, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = z;
            this.copydefault = str;
            this.AEQbTJ = z2;
            this.KWHzl = true;
            this.djBIcL = new Function2() { // from class: o.gLY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return gLQ.AssistContent.AEQbTJ(this.EZpvd, (android.content.Context) obj, (CoroutineScope) obj2);
                }
            };
        }

        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(context, "");
            if (this.EZpvd) {
                string = context.getString(C23274hvD.Fragment.setSessionActivity);
            } else {
                string = context.getString(C23274hvD.Fragment.MediaSessionCompat1);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }

        public static final Unit AEQbTJ(AssistContent assistContent, android.content.Context context, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default((dTQ) C43251rlk.copydefault(dTQ.class), context, assistContent.copydefault, null, gLZ.EZpvd(assistContent.AEQbTJ, assistContent.EZpvd), 4, null);
            return Unit.INSTANCE;
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.onCustomAction);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class Activity extends gLQ {
        public final boolean AEQbTJ;
        public final Fragment AYXKKw;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final Function2<android.content.Context, CoroutineScope, Unit> djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str = activity.copydefault;
            }
            if ((i & 4) != 0) {
                z2 = activity.AEQbTJ;
            }
            return activity.EZpvd(z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(boolean z, @NotNull java.lang.String str, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return this.OLrzqt;
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
            return this.KWHzl == activity.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NeedToUpdateApp(isLimitOrder=" + this.KWHzl + ", accountId=" + this.copydefault + ", isCopyTrading=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:134) call: o.gLQ.Activity.<init>(boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Activity(boolean z, java.lang.String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, (i & 4) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(boolean z, @NotNull java.lang.String str, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = z;
            this.copydefault = str;
            this.AEQbTJ = z2;
            this.OLrzqt = true;
            this.djBIcL = new Function2() { // from class: o.gLT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return gLQ.Activity.AEQbTJ(this.copydefault, (android.content.Context) obj, (CoroutineScope) obj2);
                }
            };
        }

        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(context, "");
            if (this.KWHzl) {
                string = context.getString(C23274hvD.Fragment.setSessionActivity);
            } else {
                string = context.getString(C23274hvD.Fragment.MediaSessionCompat1);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default(o.dTQ, android.content.Context, java.lang.String, java.lang.Boolean, java.lang.String, int, java.lang.Object):void */
        public static final Unit AEQbTJ(Activity activity, android.content.Context context, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default((dTQ) C43251rlk.copydefault(dTQ.class), context, activity.copydefault, null, gLZ.EZpvd(activity.AEQbTJ, activity.KWHzl), 4, null);
            return Unit.INSTANCE;
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.onCustomAction);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class PendingIntent extends gLQ {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final Fragment OLrzqt;
        public final java.lang.Void copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Void OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SAVersionNeedUpgrade(accountId=" + this.EZpvd + ")";
        }

        @Override // o.gLQ
        public /* synthetic */ Function2 EZpvd() {
            return (Function2) OLrzqt();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = true;
            this.OLrzqt = new Activity();
            this.AEQbTJ = true;
        }

        public static final class Activity implements Fragment {
            public Activity() {
            }

            @Override // o.gLQ.Fragment
            public java.lang.String AEQbTJ(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                java.lang.String string = context.getString(C23274hvD.Fragment.sILrnl);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }

            @Override // o.gLQ.Fragment
            public void KWHzl(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault(context, PendingIntent.this.EZpvd, java.lang.Boolean.TRUE, "");
            }
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.fZc);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class StateListAnimator extends gLQ {
        public final Fragment AEQbTJ;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.Void copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Void OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OrderExpiredTimeGtSaExpiredTime(accountId=" + this.OLrzqt + ")";
        }

        @Override // o.gLQ
        public /* synthetic */ Function2 EZpvd() {
            return (Function2) OLrzqt();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.EZpvd = true;
            this.AEQbTJ = new ActionBar();
            this.KWHzl = true;
        }

        public static final class ActionBar implements Fragment {
            public ActionBar() {
            }

            @Override // o.gLQ.Fragment
            public java.lang.String AEQbTJ(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                java.lang.String string = context.getString(C23274hvD.Fragment.QKDJJA);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }

            @Override // o.gLQ.Fragment
            public void KWHzl(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault(context, StateListAnimator.this.OLrzqt, java.lang.Boolean.TRUE, "");
            }
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.fTEjYi);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    public static final class Application extends gLQ {
        public final boolean AEQbTJ;
        public final Fragment AYXKKw;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final long OLrzqt;
        public final Function2<android.content.Context, CoroutineScope, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, long j, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = application.KWHzl;
            }
            return application.OLrzqt(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return this.AEQbTJ;
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Long.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExpiringSoon(days=" + this.OLrzqt + ", accountId=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(long j, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = j;
            this.KWHzl = str;
            this.AEQbTJ = true;
            this.AYXKKw = new C0852Application();
            this.EZpvd = true;
        }

        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            int i = C23274hvD.FragmentManager.fARcdN;
            long j = this.OLrzqt;
            return pTD.EZpvd(context, i, (int) j, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(j))));
        }

        /* JADX INFO: renamed from: o.gLQ$Application$Application, reason: collision with other inner class name */
        public static final class C0852Application implements Fragment {
            public C0852Application() {
            }

            @Override // o.gLQ.Fragment
            public java.lang.String AEQbTJ(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                java.lang.String string = context.getString(C23274hvD.Fragment.createItem);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }

            @Override // o.gLQ.Fragment
            public void KWHzl(android.content.Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault(context, Application.this.KWHzl, java.lang.Boolean.TRUE, "");
            }
        }
    }

    public static final class TaskDescription extends gLQ {
        public static final Fragment AhwBna = null;
        public static final Function2<android.content.Context, CoroutineScope, Unit> EZpvd = null;
        public static final TaskDescription copydefault = new TaskDescription();
        public static final boolean AEQbTJ = true;
        public static final boolean KWHzl = true;
        public static final int OLrzqt = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Function2<android.content.Context, CoroutineScope, Unit> EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public Fragment KWHzl() {
            return AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gLQ
        public boolean copydefault() {
            return AEQbTJ;
        }

        private TaskDescription() {
            super(null);
        }
    }
}
