package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gSN extends ActivityResultContract<Application, StateListAnimator> {

    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final DexTrackEventParameter.EditStrategyFrom OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, false, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, DexTrackEventParameter.EditStrategyFrom editStrategyFrom, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                z = application.copydefault;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str3 = application.AEQbTJ;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                editStrategyFrom = application.OLrzqt;
            }
            return application.copydefault(str, str4, z2, str5, editStrategyFrom);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexTrackEventParameter.EditStrategyFrom EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, @NotNull DexTrackEventParameter.EditStrategyFrom editStrategyFrom) {
            Intrinsics.checkNotNullParameter(editStrategyFrom, "");
            return new Application(str, str2, z, str3, editStrategyFrom);
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && this.copydefault == application.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.String str3 = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(strategyId=" + this.EZpvd + ", copyFromAddress=" + this.KWHzl + ", isEditMode=" + this.copydefault + ", chainId=" + this.AEQbTJ + ", openFrom=" + this.OLrzqt + ")";
        }

        public Application(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, @NotNull DexTrackEventParameter.EditStrategyFrom editStrategyFrom) {
            Intrinsics.checkNotNullParameter(editStrategyFrom, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.copydefault = z;
            this.AEQbTJ = str3;
            this.OLrzqt = editStrategyFrom;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (null java.lang.String))
  (wrap:com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom:0x001f: SGET  A[WRAPPED] (LINE:18) com.okinc.business.dexlogic.track.DexTrackEventParameter.EditStrategyFrom.DASHBOARD com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom) : (r8v0 com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom):void (m)] (LINE:13) call: o.gSN.Application.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.dexlogic.track.DexTrackEventParameter$EditStrategyFrom):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, DexTrackEventParameter.EditStrategyFrom editStrategyFrom, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : editStrategyFrom);
        }
    }

    public static final class StateListAnimator {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(java.lang.String str) {
            return new StateListAnimator(str);
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
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OutPut(strategyId=" + this.OLrzqt + ")";
        }

        public StateListAnimator(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:21) call: o.gSN.StateListAnimator.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(application, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) CopyTradingEditStrategyActivity.class);
        java.lang.String strKWHzl = application.KWHzl();
        if (strKWHzl != null) {
            intent.putExtra("id", strKWHzl);
        }
        java.lang.String strCopydefault = application.copydefault();
        if (strCopydefault != null) {
            intent.putExtra("user_wallet_address", strCopydefault);
        }
        java.lang.String strOLrzqt = application.OLrzqt();
        if (strOLrzqt != null) {
            intent.putExtra("chain_id", strOLrzqt);
        }
        intent.putExtra("type", application.AEQbTJ());
        intent.putExtra("key.page_from", application.EZpvd());
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator parseResult(int i, android.content.Intent intent) {
        if (i == -1) {
            return new StateListAnimator(intent != null ? intent.getStringExtra("id") : null);
        }
        return null;
    }
}
