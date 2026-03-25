package com.okinc.business.defi.wallet.detail.binders.accountDetail;

import androidx.annotation.ColorRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface DefiWalletAccountDetailBean {

    public static final class Application implements DefiWalletAccountDetailBean {
        public final AbstractC12782ctV EZpvd;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, AbstractC12782ctV abstractC12782ctV, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC12782ctV = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str = application.copydefault;
            }
            return application.KWHzl(abstractC12782ctV, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(abstractC12782ctV, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12782ctV OLrzqt() {
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
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletAccountNameBean(wallet=" + this.EZpvd + ", walletName=" + this.copydefault + ")";
        }

        public Application(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = abstractC12782ctV;
            this.copydefault = str;
        }
    }

    public static final class StateListAnimator implements DefiWalletAccountDetailBean {
        public final int AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@ColorRes int i) {
            return new StateListAnimator(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.AEQbTJ == ((StateListAnimator) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletAccountLineBean(color=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@ColorRes int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean.StateListAnimator.<init>(int):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C52761wXj.Activity.zuBGHE : i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AccountDetailType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AccountDetailType[] $VALUES;
        public static final AccountDetailType AccountAddress = new AccountDetailType("AccountAddress", 0);
        public static final AccountDetailType CheckPrivateKey = new AccountDetailType("CheckPrivateKey", 1);
        public static final AccountDetailType BindSmartAccount = new AccountDetailType("BindSmartAccount", 2);
        public static final AccountDetailType RemoveWallet = new AccountDetailType("RemoveWallet", 3);
        public static final AccountDetailType MPCCheckPrivateKey = new AccountDetailType("MPCCheckPrivateKey", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AccountDetailType[] $values() {
            return new AccountDetailType[]{AccountAddress, CheckPrivateKey, BindSmartAccount, RemoveWallet, MPCCheckPrivateKey};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AccountDetailType> getEntries() {
            return $ENTRIES;
        }

        private AccountDetailType(String str, int i) {
        }

        static {
            AccountDetailType[] accountDetailTypeArr$values = $values();
            $VALUES = accountDetailTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(accountDetailTypeArr$values);
        }

        public static AccountDetailType valueOf(String str) {
            return (AccountDetailType) Enum.valueOf(AccountDetailType.class, str);
        }

        public static AccountDetailType[] values() {
            return (AccountDetailType[]) $VALUES.clone();
        }
    }

    public static final class ActionBar implements DefiWalletAccountDetailBean {
        public final String AEQbTJ;
        public final boolean AhwBna;
        public final int EZpvd;
        public final String KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final boolean gEmmrt;
        public final AccountDetailType valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull AccountDetailType accountDetailType, @NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, int i3) {
            Intrinsics.checkNotNullParameter(accountDetailType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(accountDetailType, str, str2, i, i2, z, z2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountDetailType KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
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
            return this.valueOf == actionBar.valueOf && Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && this.EZpvd == actionBar.EZpvd && this.copydefault == actionBar.copydefault && this.AhwBna == actionBar.AhwBna && this.gEmmrt == actionBar.gEmmrt && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.valueOf.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletAccountTypeBean(type=" + this.valueOf + ", leftContent=" + this.KWHzl + ", rightContent=" + this.AEQbTJ + ", leftTextColor=" + this.EZpvd + ", rightTextColor=" + this.copydefault + ", showRightIcon=" + this.AhwBna + ", showRightTextLeftPoint=" + this.gEmmrt + ", rightIcon=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull AccountDetailType accountDetailType, @NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, int i3) {
            Intrinsics.checkNotNullParameter(accountDetailType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.valueOf = accountDetailType;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = i;
            this.copydefault = i2;
            this.AhwBna = z;
            this.gEmmrt = z2;
            this.OLrzqt = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r12v0 com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountDetailType)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] o.wXj.TaskDescription.DGUQLI int) : (r19v0 int))
 A[MD:(com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountDetailType, java.lang.String, java.lang.String, int, int, boolean, boolean, int):void (m)] (LINE:20) call: com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean.ActionBar.<init>(com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountDetailType, java.lang.String, java.lang.String, int, int, boolean, boolean, int):void type: THIS */
        public /* synthetic */ ActionBar(AccountDetailType accountDetailType, String str, String str2, int i, int i2, boolean z, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(accountDetailType, str, str2, (i4 & 8) != 0 ? C52761wXj.Activity.fdOvFl : i, (i4 & 16) != 0 ? C52761wXj.Activity.QwvEab : i2, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? C52761wXj.TaskDescription.DGUQLI : i3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AccountContentType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AccountContentType[] $VALUES;
        public static final AccountContentType AccountAddress = new AccountContentType("AccountAddress", 0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AccountContentType[] $values() {
            return new AccountContentType[]{AccountAddress};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AccountContentType> getEntries() {
            return $ENTRIES;
        }

        static {
            AccountContentType[] accountContentTypeArr$values = $values();
            $VALUES = accountContentTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(accountContentTypeArr$values);
        }

        private AccountContentType(String str, int i) {
        }

        public static AccountContentType valueOf(String str) {
            return (AccountContentType) Enum.valueOf(AccountContentType.class, str);
        }

        public static AccountContentType[] values() {
            return (AccountContentType[]) $VALUES.clone();
        }
    }

    public static final class Activity implements DefiWalletAccountDetailBean {
        public final String AEQbTJ;
        public final AccountContentType KWHzl;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, AccountContentType accountContentType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                accountContentType = activity.KWHzl;
            }
            return activity.OLrzqt(str, str2, accountContentType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountContentType AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull String str, @NotNull String str2, @NotNull AccountContentType accountContentType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(accountContentType, "");
            return new Activity(str, str2, accountContentType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletAccountContentBean(title=" + this.OLrzqt + ", content=" + this.AEQbTJ + ", type=" + this.KWHzl + ")";
        }

        public Activity(@NotNull String str, @NotNull String str2, @NotNull AccountContentType accountContentType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(accountContentType, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.KWHzl = accountContentType;
        }
    }

    public static final class TaskDescription implements DefiWalletAccountDetailBean {
        public final String AEQbTJ;
        public final AccountDetailType EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, AccountDetailType accountDetailType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            if ((i & 4) != 0) {
                accountDetailType = taskDescription.EZpvd;
            }
            return taskDescription.EZpvd(str, str2, accountDetailType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountDetailType AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull String str, @NotNull String str2, @NotNull AccountDetailType accountDetailType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(accountDetailType, "");
            return new TaskDescription(str, str2, accountDetailType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletAccountLinkTypeBean(title=" + this.AEQbTJ + ", linkContent=" + this.OLrzqt + ", type=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull String str, @NotNull String str2, @NotNull AccountDetailType accountDetailType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(accountDetailType, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.EZpvd = accountDetailType;
        }
    }
}
