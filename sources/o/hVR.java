package o;

import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hVR {
    public static final java.util.Map<java.lang.String, Application> AEQbTJ;
    public static final java.util.Map<java.lang.String, TaskDescription> EZpvd;
    public static final hVR KWHzl = new hVR();
    public static final int OLrzqt;
    public static final java.util.Map<java.lang.String, Activity> copydefault;

    private hVR() {
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        public final ErrorCodeLinkType EZpvd;
        public final int OLrzqt;
        public final java.util.List<java.lang.Integer> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hVR$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, int i, ErrorCodeLinkType errorCodeLinkType, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                errorCodeLinkType = application.EZpvd;
            }
            if ((i2 & 4) != 0) {
                list = application.copydefault;
            }
            return application.AEQbTJ(i, errorCodeLinkType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(i, errorCodeLinkType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorCodeLinkType KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> copydefault() {
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
            return this.OLrzqt == application.OLrzqt && this.EZpvd == application.EZpvd && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SimpleErrorConfig(titleRes=" + this.OLrzqt + ", linkType=" + this.EZpvd + ", subTitleRes=" + this.copydefault + ")";
        }

        public Application(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = i;
            this.EZpvd = errorCodeLinkType;
            this.copydefault = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 int)
  (wrap:com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType:0x0004: SGET  A[WRAPPED] (LINE:93) com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType.DEFAULT_TYPE com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType) : (r2v0 com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:94)) : (r3v0 java.util.List))
 A[MD:(int, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, java.util.List<java.lang.Integer>):void (m)] (LINE:91) call: o.hVR.Application.<init>(int, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, java.util.List):void type: THIS */
        public /* synthetic */ Application(int i, ErrorCodeLinkType errorCodeLinkType, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? ErrorCodeLinkType.DEFAULT_TYPE : errorCodeLinkType, (i2 & 4) != 0 ? yDY.AhwBna() : list);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public final int AEQbTJ;
        public final boolean EZpvd;
        public final ErrorCodeLinkType KWHzl;
        public final java.util.List<java.lang.Integer> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hVR$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, ErrorCodeLinkType errorCodeLinkType, java.util.List list, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                errorCodeLinkType = activity.KWHzl;
            }
            if ((i2 & 4) != 0) {
                list = activity.copydefault;
            }
            if ((i2 & 8) != 0) {
                z = activity.EZpvd;
            }
            return activity.EZpvd(i, errorCodeLinkType, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorCodeLinkType EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull java.util.List<java.lang.Integer> list, boolean z) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(i, errorCodeLinkType, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> copydefault() {
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
            return this.AEQbTJ == activity.AEQbTJ && this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormattedErrorConfig(titleRes=" + this.AEQbTJ + ", linkType=" + this.KWHzl + ", subTitleRes=" + this.copydefault + ", useRefundChain=" + this.EZpvd + ")";
        }

        public Activity(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull java.util.List<java.lang.Integer> list, boolean z) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = i;
            this.KWHzl = errorCodeLinkType;
            this.copydefault = list;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r1v0 int)
  (wrap:com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType:0x0004: SGET  A[WRAPPED] (LINE:102) com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType.DEFAULT_TYPE com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType) : (r2v0 com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:103)) : (r3v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, java.util.List<java.lang.Integer>, boolean):void (m)] (LINE:100) call: o.hVR.Activity.<init>(int, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, java.util.List, boolean):void type: THIS */
        public /* synthetic */ Activity(int i, ErrorCodeLinkType errorCodeLinkType, java.util.List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? ErrorCodeLinkType.DEFAULT_TYPE : errorCodeLinkType, (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? false : z);
        }
    }

    static {
        int i = C23274hvD.Fragment.dtVxwd;
        ErrorCodeLinkType errorCodeLinkType = ErrorCodeLinkType.CUSTOMER_SERVICE_TYPE;
        java.util.List list = null;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("9999", new Application(i, errorCodeLinkType, list, 4, null));
        ErrorCodeLinkType errorCodeLinkType2 = null;
        int i2 = 6;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("1", new Application(C23274hvD.Fragment.RIKbBf, errorCodeLinkType2, list, i2, 0 == true ? 1 : 0));
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("2", new Application(C23274hvD.Fragment.zEkrwr, errorCodeLinkType2, list, i2, 0 == true ? 1 : 0));
        int i3 = 2;
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt("3", new Application(C23274hvD.Fragment.fGsPTM, null, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.isScanInProgress), java.lang.Integer.valueOf(C23274hvD.Fragment.isInitInProgress)), i3, 0 == true ? 1 : 0));
        kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt("4", new Application(C23274hvD.Fragment.fGsPTM, null, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.hfFNez), java.lang.Integer.valueOf(C23274hvD.Fragment.vqBjd), java.lang.Integer.valueOf(C23274hvD.Fragment.zHQtTQ)), i3, 0 == true ? 1 : 0));
        ErrorCodeLinkType errorCodeLinkType3 = null;
        kotlin.Pair pairOLrzqt6 = C56390yDp.OLrzqt("5", new Application(C23274hvD.Fragment.fGsPTM, errorCodeLinkType3, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.OqhRBMiKdSzF), java.lang.Integer.valueOf(C23274hvD.Fragment.isInitInProgress), java.lang.Integer.valueOf(C23274hvD.Fragment.OqhRBM)), i3, 0 == true ? 1 : 0));
        java.util.List list2 = null;
        int i4 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ErrorCodeLinkType errorCodeLinkType4 = null;
        int i5 = 6;
        AEQbTJ = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, C56390yDp.OLrzqt(OrderDetailListItem.SLIP_OUT, new Application(C23274hvD.Fragment.OhcwxsRkSIEV, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("7", new Application(C23274hvD.Fragment.DDjgSw, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("12", new Application(C23274hvD.Fragment.invokespecialRtjmuc, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2003", new Application(C23274hvD.Fragment.DDDCac, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2502", new Application(C23274hvD.Fragment.fRNHEq, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2506", new Application(C23274hvD.Fragment.aChkwz, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2508", new Application(C23274hvD.Fragment.aChkwz, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2514", new Application(C23274hvD.Fragment.UJpkuA, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2504", new Application(C23274hvD.Fragment.DcNNRp, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2518", new Application(C23274hvD.Fragment.OtZEmZ, errorCodeLinkType3, list2, i4, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("9", new Application(C23274hvD.Fragment.sTzBva, errorCodeLinkType, 0 == true ? 1 : 0, 4, defaultConstructorMarker)), C56390yDp.OLrzqt("10", new Application(C23274hvD.Fragment.iPSTqm, null, null, 6, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("2599", new Application(C23274hvD.Fragment.gqESXP, errorCodeLinkType, 0 == true ? 1 : 0, 4, defaultConstructorMarker)), C56390yDp.OLrzqt("2520", new Application(C23274hvD.Fragment.QhYuFg, errorCodeLinkType4, null, i5, 0 == true ? 1 : 0)), C56390yDp.OLrzqt("13", new Application(C23274hvD.Fragment.setEnabled, errorCodeLinkType4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0)));
        kotlin.Pair pairOLrzqt7 = C56390yDp.OLrzqt("2501", new Activity(C23274hvD.Fragment.sJPPOI, 0 == true ? 1 : 0, null, false, 14, defaultConstructorMarker));
        ErrorCodeLinkType errorCodeLinkType5 = null;
        boolean z = false;
        int i6 = 14;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        kotlin.Pair pairOLrzqt8 = C56390yDp.OLrzqt("2503", new Activity(C23274hvD.Fragment.OtRJxF, errorCodeLinkType5, 0 == true ? 1 : 0, z, i6, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt9 = C56390yDp.OLrzqt("2507", new Activity(C23274hvD.Fragment.sVaiLC, errorCodeLinkType5, 0 == true ? 1 : 0, z, i6, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt10 = C56390yDp.OLrzqt("2513", new Activity(C23274hvD.Fragment.registerKeyboardTarget, errorCodeLinkType5, 0 == true ? 1 : 0, z, i6, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt11 = C56390yDp.OLrzqt("2517", new Activity(C23274hvD.Fragment.setCurrentKeyboardTarget, errorCodeLinkType5, 0 == true ? 1 : 0, z, i6, defaultConstructorMarker2));
        ErrorCodeLinkType errorCodeLinkType6 = null;
        kotlin.Pair pairOLrzqt12 = C56390yDp.OLrzqt("3502", new Activity(C23274hvD.Fragment.fraLem, errorCodeLinkType6, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.isScanInProgress), java.lang.Integer.valueOf(C23274hvD.Fragment.isInitInProgress)), z, 10, defaultConstructorMarker2));
        java.util.List list3 = null;
        int i7 = 14;
        kotlin.Pair pairOLrzqt13 = C56390yDp.OLrzqt("3504", new Activity(C23274hvD.Fragment.PUZqN, errorCodeLinkType6, list3, z, i7, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt14 = C56390yDp.OLrzqt("3505", new Activity(C23274hvD.Fragment.PUZqN, errorCodeLinkType6, list3, z, i7, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt15 = C56390yDp.OLrzqt("3506", new Activity(C23274hvD.Fragment.clearCurrentKeyboardTarget, errorCodeLinkType6, list3, z, i7, defaultConstructorMarker2));
        int i8 = 10;
        kotlin.Pair pairOLrzqt16 = C56390yDp.OLrzqt("3507", new Activity(C23274hvD.Fragment.fraLem, null, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.isScanInProgress), java.lang.Integer.valueOf(C23274hvD.Fragment.isInitInProgress)), z, i8, defaultConstructorMarker2));
        kotlin.Pair pairOLrzqt17 = C56390yDp.OLrzqt("3508", new Activity(C23274hvD.Fragment.fraLem, null, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.hfFNez), java.lang.Integer.valueOf(C23274hvD.Fragment.vqBjd), java.lang.Integer.valueOf(C23274hvD.Fragment.zHQtTQ)), z, i8, defaultConstructorMarker2));
        ErrorCodeLinkType errorCodeLinkType7 = null;
        kotlin.Pair pairOLrzqt18 = C56390yDp.OLrzqt("3509", new Activity(C23274hvD.Fragment.fraLem, errorCodeLinkType7, yDY.gEmmrt(java.lang.Integer.valueOf(C23274hvD.Fragment.OqhRBMiKdSzF), java.lang.Integer.valueOf(C23274hvD.Fragment.isInitInProgress), java.lang.Integer.valueOf(C23274hvD.Fragment.OqhRBM)), z, i8, defaultConstructorMarker2));
        java.util.List list4 = null;
        int i9 = 14;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        copydefault = C56424yEw.gEmmrt(pairOLrzqt7, pairOLrzqt8, pairOLrzqt9, pairOLrzqt10, pairOLrzqt11, pairOLrzqt12, pairOLrzqt13, pairOLrzqt14, pairOLrzqt15, pairOLrzqt16, pairOLrzqt17, pairOLrzqt18, C56390yDp.OLrzqt("3510", new Activity(C23274hvD.Fragment.hBUiXU, errorCodeLinkType7, list4, z, i9, defaultConstructorMarker2)), C56390yDp.OLrzqt("3511", new Activity(C23274hvD.Fragment.DjWNei, errorCodeLinkType7, list4, z, i9, defaultConstructorMarker2)), C56390yDp.OLrzqt("3512", new Activity(C23274hvD.Fragment.QSbQqJ, errorCodeLinkType7, list4, z, i9, defaultConstructorMarker2)), C56390yDp.OLrzqt("3599", new Activity(C23274hvD.Fragment.hQufeQ, errorCodeLinkType, null, false, 12, defaultConstructorMarker3)), C56390yDp.OLrzqt("2519", new Activity(C23274hvD.Fragment.OEsIKP, null, null, true, 6, null)), C56390yDp.OLrzqt("2598", new Activity(C23274hvD.Fragment.keyboardTargetTextChanged, errorCodeLinkType, null, true, 4, defaultConstructorMarker3)));
        int i10 = C23274hvD.Fragment.setHandler;
        ErrorCodeLinkType errorCodeLinkType8 = ErrorCodeLinkType.GUIDE_URL_TYPE;
        kotlin.Pair pairOLrzqt19 = C56390yDp.OLrzqt("2600", new TaskDescription(i10, errorCodeLinkType8));
        kotlin.Pair pairOLrzqt20 = C56390yDp.OLrzqt("2602", new TaskDescription(C23274hvD.Fragment.MediaControllerCompatCallbackMessageHandler, errorCodeLinkType8));
        int i11 = C23274hvD.Fragment.MediaControllerCompatCallbackStubApi21;
        ErrorCodeLinkType errorCodeLinkType9 = ErrorCodeLinkType.DEFAULT_TYPE;
        EZpvd = C56424yEw.gEmmrt(pairOLrzqt19, pairOLrzqt20, C56390yDp.OLrzqt("2603", new TaskDescription(i11, errorCodeLinkType9)), C56390yDp.OLrzqt("2604", new TaskDescription(C23274hvD.Fragment.MediaControllerCompatCallbackStubCompat, errorCodeLinkType9)), C56390yDp.OLrzqt("2605", new TaskDescription(C23274hvD.Fragment.MediaControllerCompatMediaControllerImpl, errorCodeLinkType9)), C56390yDp.OLrzqt("2606", new TaskDescription(C23274hvD.Fragment.MediaControllerCompatMediaControllerExtraData, errorCodeLinkType9)));
        OLrzqt = 8;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        public final int EZpvd;
        public final ErrorCodeLinkType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, ErrorCodeLinkType errorCodeLinkType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                errorCodeLinkType = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(i, errorCodeLinkType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorCodeLinkType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            return new TaskDescription(i, errorCodeLinkType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
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
            return this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BridgeNameErrorConfig(titleRes=" + this.EZpvd + ", linkType=" + this.OLrzqt + ")";
        }

        public TaskDescription(@androidx.annotation.StringRes int i, @NotNull ErrorCodeLinkType errorCodeLinkType) {
            Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
            this.EZpvd = i;
            this.OLrzqt = errorCodeLinkType;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [284=9] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C22034hVl copydefault(@NotNull java.lang.String str, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        java.lang.String str2;
        java.lang.String bridgeName;
        java.lang.String shadowTokenSymbol;
        java.lang.String bridgeName2;
        str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, dexMultiChildOrderInfoVo.getRefundAmount(), false, RoundingMode.DOWN, false, false, 26, null);
        Application application = AEQbTJ.get(str);
        if (application != null) {
            return KWHzl.AEQbTJ(application, dexMultiChildOrderInfoVo);
        }
        Activity activity = copydefault.get(str);
        if (activity != null) {
            return KWHzl.AEQbTJ(activity, dexMultiChildOrderInfoVo, showData$default);
        }
        TaskDescription taskDescription = EZpvd.get(str);
        if (taskDescription != null) {
            return KWHzl.OLrzqt(taskDescription.OLrzqt(), taskDescription.AEQbTJ(), dexMultiChildOrderInfoVo);
        }
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return EZpvd(dexMultiChildOrderInfoVo);
                }
                break;
            case 56:
                if (str.equals("8")) {
                    return buildErrorBean$default(this, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.OeawrHOeawrH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("chain", dexMultiChildOrderInfoVo.getCrossChainName()), C56390yDp.OLrzqt("value", dexMultiChildOrderInfoVo.getOfficialBridgeTime()))), dexMultiChildOrderInfoVo, null, null, 12, null);
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    return buildErrorBean$default(this, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.hvKCwS, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("wrappedcoin", dexMultiChildOrderInfoVo.getOriginalTokenSymbol()), C56390yDp.OLrzqt("nativecoin", dexMultiChildOrderInfoVo.getToTokenSymbol()))), dexMultiChildOrderInfoVo, null, null, 12, null);
                }
                break;
            case 1542055:
                if (str.equals("2515")) {
                    return buildErrorBean$default(this, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QBiWsm, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, showData$default), C56390yDp.OLrzqt("symbol", dexMultiChildOrderInfoVo.getRefundSymbol()), C56390yDp.OLrzqt("chain", dexMultiChildOrderInfoVo.getCrossChainName()))), dexMultiChildOrderInfoVo, null, null, 12, null);
                }
                break;
            case 1542056:
                if (str.equals("2516")) {
                    return buildErrorBean$default(this, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QjzqRB, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("symbol", dexMultiChildOrderInfoVo.getRefundSymbol()), C56390yDp.OLrzqt("chain", dexMultiChildOrderInfoVo.getCrossChainName()))), dexMultiChildOrderInfoVo, null, null, 12, null);
                }
                break;
            case 1542981:
                if (str.equals("2601")) {
                    android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                    int i = C23274hvD.Fragment.postToHandler;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
                    bridgeName = bridgeOrderInfoVo != null ? bridgeOrderInfoVo.getBridgeName() : null;
                    if (bridgeName == null) {
                        bridgeName = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt("bridgeName", bridgeName);
                    pairArr[1] = C56390yDp.OLrzqt("min", dexMultiChildOrderInfoVo.getOfficialBridgeTime());
                    java.lang.String strKWHzl = C33069mpW.KWHzl(applicationOLrzqt, i, ArrayMapKt.arrayMapOf(pairArr));
                    ErrorCodeLinkType errorCodeLinkType = ErrorCodeLinkType.GUIDE_URL_TYPE;
                    java.lang.String guideUrl = dexMultiChildOrderInfoVo.getGuideUrl();
                    return new C22034hVl(strKWHzl, null, guideUrl == null ? "" : guideUrl, errorCodeLinkType, copydefault(dexMultiChildOrderInfoVo), 2, null);
                }
                break;
            case 1571811:
                if (str.equals("3501")) {
                    android.app.Application applicationOLrzqt2 = C32979mnm.EZpvd.OLrzqt();
                    int i2 = C23274hvD.Fragment.zAGdSp;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo = dexMultiChildOrderInfoVo.getDexBridgeShadowTokenPairInfoVo();
                    if (dexBridgeShadowTokenPairInfoVo == null || (shadowTokenSymbol = dexBridgeShadowTokenPairInfoVo.getShadowTokenSymbol()) == null) {
                        shadowTokenSymbol = "";
                    }
                    pairArr2[0] = C56390yDp.OLrzqt("token", shadowTokenSymbol);
                    DexBridgeOrderInfoVo bridgeOrderInfoVo2 = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
                    if (bridgeOrderInfoVo2 != null && (bridgeName2 = bridgeOrderInfoVo2.getBridgeName()) != null) {
                        str2 = bridgeName2;
                    }
                    pairArr2[1] = C56390yDp.OLrzqt("name", str2);
                    return new C22034hVl(C33069mpW.KWHzl(applicationOLrzqt2, i2, ArrayMapKt.arrayMapOf(pairArr2)), null, null, ErrorCodeLinkType.SHADOW_ASSETS_TYPE, copydefault(dexMultiChildOrderInfoVo), 6, null);
                }
                break;
            case 1596797:
                if (str.equals("4001")) {
                    return new C22034hVl(C33070mpX.AYXKKw(C23274hvD.Fragment.getRepeatMode), null, null, null, null, 30, null);
                }
                break;
            case 1596798:
                if (str.equals("4002")) {
                    int i3 = C23274hvD.Fragment.RIuxYh;
                    DexBridgeOrderInfoVo bridgeOrderInfoVo3 = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
                    bridgeName = bridgeOrderInfoVo3 != null ? bridgeOrderInfoVo3.getBridgeName() : null;
                    return new C22034hVl(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, bridgeName != null ? bridgeName : ""))), null, null, null, null, 30, null);
                }
                break;
        }
        return EZpvd(dexMultiChildOrderInfoVo);
    }

    public final C22035hVm copydefault(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        return new C22035hVm(dexMultiChildOrderInfoVo.getDataType(), dexMultiChildOrderInfoVo.getMainFromAddress(), dexMultiChildOrderInfoVo.getChildOrderId());
    }

    public final C22034hVl EZpvd(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        return new C22034hVl(null, null, null, null, copydefault(dexMultiChildOrderInfoVo), 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hVR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22034hVl buildErrorBean$default(hVR hvr, java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, ErrorCodeLinkType errorCodeLinkType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            errorCodeLinkType = ErrorCodeLinkType.DEFAULT_TYPE;
        }
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        return hvr.copydefault(str, dexMultiChildOrderInfoVo, errorCodeLinkType, list);
    }

    public final C22034hVl copydefault(java.lang.String str, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, ErrorCodeLinkType errorCodeLinkType, java.util.List<java.lang.String> list) {
        return new C22034hVl(str, list, null, errorCodeLinkType, copydefault(dexMultiChildOrderInfoVo), 4, null);
    }

    public final C22034hVl AEQbTJ(Application application, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        java.util.List<java.lang.Integer> listCopydefault = application.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(C33070mpX.AYXKKw(((java.lang.Number) it.next()).intValue()));
        }
        return new C22034hVl(C33070mpX.AYXKKw(application.EZpvd()), arrayList, null, application.KWHzl(), copydefault(dexMultiChildOrderInfoVo), 4, null);
    }

    public final C22034hVl AEQbTJ(Activity activity, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str) {
        java.lang.String crossChainName;
        if (activity.OLrzqt()) {
            crossChainName = dexMultiChildOrderInfoVo.getRefundChain();
        } else {
            crossChainName = dexMultiChildOrderInfoVo.getCrossChainName();
        }
        java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), activity.AEQbTJ(), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str), C56390yDp.OLrzqt("symbol", dexMultiChildOrderInfoVo.getRefundSymbol()), C56390yDp.OLrzqt("chain", crossChainName)));
        java.util.List<java.lang.Integer> listCopydefault = activity.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(C33070mpX.AYXKKw(((java.lang.Number) it.next()).intValue()));
        }
        return new C22034hVl(strKWHzl, arrayList, null, activity.EZpvd(), copydefault(dexMultiChildOrderInfoVo), 4, null);
    }

    public final C22034hVl OLrzqt(@androidx.annotation.StringRes int i, ErrorCodeLinkType errorCodeLinkType, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        java.lang.String guideUrl;
        DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
        java.lang.String bridgeName = bridgeOrderInfoVo != null ? bridgeOrderInfoVo.getBridgeName() : null;
        if (bridgeName == null) {
            bridgeName = "";
        }
        return new C22034hVl(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("bridgeName", bridgeName))), null, (errorCodeLinkType != ErrorCodeLinkType.GUIDE_URL_TYPE || (guideUrl = dexMultiChildOrderInfoVo.getGuideUrl()) == null) ? "" : guideUrl, errorCodeLinkType, copydefault(dexMultiChildOrderInfoVo), 2, null);
    }
}
