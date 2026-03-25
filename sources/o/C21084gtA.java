package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21084gtA extends ActivityResultContract<StateListAnimator, java.lang.Integer> {

    /* JADX INFO: renamed from: o.gtA$StateListAnimator */
    public static final class StateListAnimator {
        public final int AEQbTJ;
        public final java.util.ArrayList<AssetWalletNetwork> EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.gtA$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, java.lang.String str, java.util.ArrayList arrayList, boolean z, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                str = stateListAnimator.KWHzl;
            }
            java.lang.String str3 = str;
            if ((i2 & 4) != 0) {
                arrayList = stateListAnimator.EZpvd;
            }
            java.util.ArrayList arrayList2 = arrayList;
            if ((i2 & 8) != 0) {
                z = stateListAnimator.copydefault;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(i, str3, arrayList2, z2, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.util.ArrayList<AssetWalletNetwork> arrayList, boolean z, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(i, str, arrayList, z, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<AssetWalletNetwork> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(currencyId=" + this.AEQbTJ + ", walletId=" + this.KWHzl + ", networks=" + this.EZpvd + ", isFirstTimeUse=" + this.copydefault + ", baseCurrencySymbol=" + this.OLrzqt + ")";
        }

        public StateListAnimator(int i, @NotNull java.lang.String str, @NotNull java.util.ArrayList<AssetWalletNetwork> arrayList, boolean z, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = i;
            this.KWHzl = str;
            this.EZpvd = arrayList;
            this.copydefault = z;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 int)
  (r8v0 java.lang.String)
  (r9v0 java.util.ArrayList)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(int, java.lang.String, java.util.ArrayList<com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork>, boolean, java.lang.String):void (m)] (LINE:66) call: o.gtA.StateListAnimator.<init>(int, java.lang.String, java.util.ArrayList, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, java.lang.String str, java.util.ArrayList arrayList, boolean z, java.lang.String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, arrayList, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "" : str2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return ActivityC21108gtY.Companion.KWHzl(context, stateListAnimator.AEQbTJ(), stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), stateListAnimator.EZpvd(), stateListAnimator.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer parseResult(int i, android.content.Intent intent) {
        return java.lang.Integer.valueOf(i);
    }
}
