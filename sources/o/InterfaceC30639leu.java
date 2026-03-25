package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30639leu {

    /* JADX INFO: renamed from: o.leu$ActionBar */
    public static final class ActionBar implements InterfaceC30639leu {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(boolean z) {
            return new ActionBar(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ConnectWallet(needSmartAccount=" + this.OLrzqt + ")";
        }

        public ActionBar(boolean z) {
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.leu$LoaderManager */
    public static final class LoaderManager implements InterfaceC30639leu {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
        }
    }

    /* JADX INFO: renamed from: o.leu$Fragment */
    public static final class Fragment implements InterfaceC30639leu {
        public static final Fragment AEQbTJ = new Fragment();

        private Fragment() {
        }
    }

    /* JADX INFO: renamed from: o.leu$PendingIntent */
    public static final class PendingIntent implements InterfaceC30639leu {
        public static final PendingIntent copydefault = new PendingIntent();

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.leu$FragmentManager */
    public static final class FragmentManager implements InterfaceC30639leu {
        public static final FragmentManager copydefault = new FragmentManager();

        private FragmentManager() {
        }
    }

    /* JADX INFO: renamed from: o.leu$TaskDescription */
    public static final class TaskDescription implements InterfaceC30639leu {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.leu$Activity */
    public static final class Activity implements InterfaceC30639leu {
        public final DexMultiTokenInfoBean AEQbTJ;
        public final DexMultiTokenInfoBean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dexMultiTokenInfoBean = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                dexMultiTokenInfoBean2 = activity.AEQbTJ;
            }
            return activity.KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
            return new Activity(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean copydefault() {
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
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.OLrzqt;
            int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.AEQbTJ;
            return (iHashCode * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DAppTrade(fromToken=" + this.OLrzqt + ", toToken=" + this.AEQbTJ + ")";
        }

        public Activity(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
            this.OLrzqt = dexMultiTokenInfoBean;
            this.AEQbTJ = dexMultiTokenInfoBean2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r2v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r3v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:32) call: o.leu.Activity.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
        public /* synthetic */ Activity(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dexMultiTokenInfoBean, (i & 2) != 0 ? null : dexMultiTokenInfoBean2);
        }
    }

    /* JADX INFO: renamed from: o.leu$Dialog */
    public static final class Dialog implements InterfaceC30639leu {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
            this(null, null, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = dialog.EZpvd;
            }
            if ((i & 4) != 0) {
                z = dialog.copydefault;
            }
            return dialog.AEQbTJ(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Dialog(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) dialog.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dialog.EZpvd) && this.copydefault == dialog.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MaxNativeAmount(amount=" + this.AEQbTJ + ", token=" + this.EZpvd + ", hasGasBal=" + this.copydefault + ")";
        }

        public Dialog(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:37) call: o.leu.Dialog.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Dialog(java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.leu$Application */
    public static final class Application implements InterfaceC30639leu {
        public final DexMultiTokenInfoBean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dexMultiTokenInfoBean = application.AEQbTJ;
            }
            return application.OLrzqt(dexMultiTokenInfoBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            return new Application(dexMultiTokenInfoBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AEQbTJ;
            if (dexMultiTokenInfoBean == null) {
                return 0;
            }
            return dexMultiTokenInfoBean.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CopyAddress(token=" + this.AEQbTJ + ")";
        }

        public Application(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            this.AEQbTJ = dexMultiTokenInfoBean;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Application(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
            /*
                r65 = this;
                r0 = r67 & 1
                if (r0 == 0) goto L7d
                com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean r0 = new com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean
                r1 = r0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = 0
                r56 = 0
                r57 = 0
                r58 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = -1
                r63 = 134217727(0x7ffffff, float:3.8518597E-34)
                r64 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
                r1 = r65
                goto L81
            L7d:
                r1 = r65
                r0 = r66
            L81:
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC30639leu.Application.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX INFO: renamed from: o.leu$TaskStackBuilder */
    public static final class TaskStackBuilder implements InterfaceC30639leu {
        public final Function2<DexMultiTokenInfoBean, java.lang.String, Unit> EZpvd;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leu$TaskStackBuilder */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.lang.String str, boolean z, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskStackBuilder.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskStackBuilder.copydefault;
            }
            if ((i & 4) != 0) {
                function2 = taskStackBuilder.EZpvd;
            }
            return taskStackBuilder.OLrzqt(str, z, function2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function2<DexMultiTokenInfoBean, java.lang.String, Unit> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Function2<? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return new TaskStackBuilder(str, z, function2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskStackBuilder.OLrzqt) && this.copydefault == taskStackBuilder.copydefault && Intrinsics.EZpvd(this.EZpvd, taskStackBuilder.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAdvancedSearch(selectedChainId=" + this.OLrzqt + ", isBuy=" + this.copydefault + ", onTokenSelected=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskStackBuilder(@NotNull java.lang.String str, boolean z, @NotNull Function2<? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.OLrzqt = str;
            this.copydefault = z;
            this.EZpvd = function2;
        }
    }

    /* JADX INFO: renamed from: o.leu$ComponentCallbacks */
    public static final class ComponentCallbacks implements InterfaceC30639leu {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ComponentCallbacks copy$default(ComponentCallbacks componentCallbacks, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentCallbacks.AEQbTJ;
            }
            return componentCallbacks.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComponentCallbacks AEQbTJ(java.lang.String str) {
            return new ComponentCallbacks(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComponentCallbacks) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ComponentCallbacks) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SwitchWallet(chainId=" + this.AEQbTJ + ")";
        }

        public ComponentCallbacks(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("-100000000") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:53) call: o.leu.ComponentCallbacks.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ ComponentCallbacks(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "-100000000" : str);
        }
    }

    /* JADX INFO: renamed from: o.leu$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC30639leu {
        public final Function1<UIPricingToken, Unit> AEQbTJ;
        public final AdvancedTradeType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leu$PictureInPictureParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, AdvancedTradeType advancedTradeType, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                advancedTradeType = pictureInPictureParams.copydefault;
            }
            if ((i & 2) != 0) {
                function1 = pictureInPictureParams.AEQbTJ;
            }
            return pictureInPictureParams.EZpvd(advancedTradeType, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<UIPricingToken, Unit> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams EZpvd(@NotNull AdvancedTradeType advancedTradeType, Function1<? super UIPricingToken, Unit> function1) {
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            return new PictureInPictureParams(advancedTradeType, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedTradeType copydefault() {
            return this.copydefault;
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
            return this.copydefault == pictureInPictureParams.copydefault && Intrinsics.EZpvd(this.AEQbTJ, pictureInPictureParams.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            Function1<UIPricingToken, Unit> function1 = this.AEQbTJ;
            return (iHashCode * 31) + (function1 == null ? 0 : function1.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowPricingTokenSheet(tradeType=" + this.copydefault + ", onItemClick=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public PictureInPictureParams(@NotNull AdvancedTradeType advancedTradeType, Function1<? super UIPricingToken, Unit> function1) {
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            this.copydefault = advancedTradeType;
            this.AEQbTJ = function1;
        }
    }

    /* JADX INFO: renamed from: o.leu$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC30639leu {
        public final java.lang.String AEQbTJ;
        public final DexMultiTokenInfoBean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sharedElementCallback.AEQbTJ;
            }
            if ((i & 2) != 0) {
                dexMultiTokenInfoBean = sharedElementCallback.EZpvd;
            }
            return sharedElementCallback.copydefault(str, dexMultiTokenInfoBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback copydefault(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SharedElementCallback(str, dexMultiTokenInfoBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedElementCallback)) {
                return false;
            }
            SharedElementCallback sharedElementCallback = (SharedElementCallback) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) sharedElementCallback.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, sharedElementCallback.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.EZpvd;
            return (iHashCode * 31) + (dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowKLine(sourceType=" + this.AEQbTJ + ", token=" + this.EZpvd + ")";
        }

        public SharedElementCallback(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.EZpvd = dexMultiTokenInfoBean;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ SharedElementCallback(java.lang.String r67, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean r68, int r69, kotlin.jvm.internal.DefaultConstructorMarker r70) {
            /*
                r66 = this;
                r0 = r69 & 1
                if (r0 == 0) goto L7
                java.lang.String r0 = ""
                goto L9
            L7:
                r0 = r67
            L9:
                r1 = r69 & 2
                if (r1 == 0) goto L86
                com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean r1 = new com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean
                r2 = r1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = 0
                r56 = 0
                r57 = 0
                r58 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = 0
                r63 = -1
                r64 = 134217727(0x7ffffff, float:3.8518597E-34)
                r65 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
                r2 = r66
                goto L8a
            L86:
                r2 = r66
                r1 = r68
            L8a:
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC30639leu.SharedElementCallback.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX INFO: renamed from: o.leu$AssistContent */
    public static final class AssistContent implements InterfaceC30639leu {
        public final int AEQbTJ;
        public final AdvancedOrderType KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
            this(null, 0, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, AdvancedOrderType advancedOrderType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = assistContent.copydefault;
            }
            if ((i2 & 2) != 0) {
                i = assistContent.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                advancedOrderType = assistContent.KWHzl;
            }
            return assistContent.copydefault(str, i, advancedOrderType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedOrderType OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent copydefault(@NotNull java.lang.String str, int i, @NotNull AdvancedOrderType advancedOrderType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(advancedOrderType, "");
            return new AssistContent(str, i, advancedOrderType);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) assistContent.copydefault) && this.AEQbTJ == assistContent.AEQbTJ && this.KWHzl == assistContent.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowMoreBottomSheet(sourceType=" + this.copydefault + ", pendingOrderCount=" + this.AEQbTJ + ", orderType=" + this.KWHzl + ")";
        }

        public AssistContent(@NotNull java.lang.String str, int i, @NotNull AdvancedOrderType advancedOrderType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(advancedOrderType, "");
            this.copydefault = str;
            this.AEQbTJ = i;
            this.KWHzl = advancedOrderType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType:0x000f: SGET  A[WRAPPED] (LINE:70) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType.MARKET com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType) : (r3v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType))
 A[MD:(java.lang.String, int, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType):void (m)] (LINE:67) call: o.leu.AssistContent.<init>(java.lang.String, int, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType):void type: THIS */
        public /* synthetic */ AssistContent(java.lang.String str, int i, AdvancedOrderType advancedOrderType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AdvancedOrderType.MARKET : advancedOrderType);
        }
    }

    /* JADX INFO: renamed from: o.leu$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC30639leu {
        public final Function0<Unit> AEQbTJ;
        public final Function1<java.lang.String, Unit> OLrzqt;
        public final StateFlow<C30457lbX> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leu$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, StateFlow stateFlow, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                stateFlow = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                function1 = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                function0 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(stateFlow, function1, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateFlow<C30457lbX> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<java.lang.String, Unit> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull StateFlow<C30457lbX> stateFlow, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(stateFlow, "");
            return new StateListAnimator(stateFlow, function1, function0);
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
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            Function1<java.lang.String, Unit> function1 = this.OLrzqt;
            int iHashCode2 = function1 == null ? 0 : function1.hashCode();
            Function0<Unit> function0 = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ConfirmOrder(dataFlow=" + this.copydefault + ", onApproveAmountChange=" + this.OLrzqt + ", onConfirmClick=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull StateFlow<C30457lbX> stateFlow, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(stateFlow, "");
            this.copydefault = stateFlow;
            this.OLrzqt = function1;
            this.AEQbTJ = function0;
        }
    }

    /* JADX INFO: renamed from: o.leu$VoiceInteractor */
    public static final class VoiceInteractor implements InterfaceC30639leu {
        public final ServiceFeeInfo AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, ServiceFeeInfo serviceFeeInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                serviceFeeInfo = voiceInteractor.AEQbTJ;
            }
            return voiceInteractor.KWHzl(serviceFeeInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceFeeInfo AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor KWHzl(ServiceFeeInfo serviceFeeInfo) {
            return new VoiceInteractor(serviceFeeInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VoiceInteractor) && Intrinsics.EZpvd(this.AEQbTJ, ((VoiceInteractor) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ServiceFeeInfo serviceFeeInfo = this.AEQbTJ;
            if (serviceFeeInfo == null) {
                return 0;
            }
            return serviceFeeInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ServiceFeeLabel(feeInfo=" + this.AEQbTJ + ")";
        }

        public VoiceInteractor(ServiceFeeInfo serviceFeeInfo) {
            this.AEQbTJ = serviceFeeInfo;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r1v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
 A[MD:(com.okinc.business.dexlogic.bean.ServiceFeeInfo):void (m)] (LINE:79) call: o.leu.VoiceInteractor.<init>(com.okinc.business.dexlogic.bean.ServiceFeeInfo):void type: THIS */
        public /* synthetic */ VoiceInteractor(ServiceFeeInfo serviceFeeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : serviceFeeInfo);
        }
    }

    /* JADX INFO: renamed from: o.leu$BroadcastReceiver */
    public static final class BroadcastReceiver implements InterfaceC30639leu {
        public final Function0<Unit> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leu$BroadcastReceiver */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BroadcastReceiver copy$default(BroadcastReceiver broadcastReceiver, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = broadcastReceiver.copydefault;
            }
            if ((i & 2) != 0) {
                function0 = broadcastReceiver.OLrzqt;
            }
            return broadcastReceiver.copydefault(str, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BroadcastReceiver copydefault(java.lang.String str, Function0<Unit> function0) {
            return new BroadcastReceiver(str, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastReceiver)) {
                return false;
            }
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) broadcastReceiver.copydefault) && Intrinsics.EZpvd(this.OLrzqt, broadcastReceiver.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            Function0<Unit> function0 = this.OLrzqt;
            return (iHashCode * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowValueDiffDialog(diffValue=" + this.copydefault + ", onContinue=" + this.OLrzqt + ")";
        }

        public BroadcastReceiver(java.lang.String str, Function0<Unit> function0) {
            this.copydefault = str;
            this.OLrzqt = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:83) call: o.leu.BroadcastReceiver.<init>(java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ BroadcastReceiver(java.lang.String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : function0);
        }
    }
}
