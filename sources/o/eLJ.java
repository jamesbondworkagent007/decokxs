package o;

import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.wallet.approve.ApproveRiskyTagType;
import com.okinc.business.defi.wallet.home.ApproveConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eLJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public abstract java.util.List<ApproveItem> EZpvd();

    public abstract InterfaceC9738bbJ OLrzqt();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            r0 = r0.getSupportMinAppVersion();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean AEQbTJ() {
            java.lang.String supportMinAppVersion;
            ApproveConfig approveConfig = (ApproveConfig) C48787ucK.AEQbTJ.EZpvd("walletApproveABConfig", ApproveConfig.class);
            if (approveConfig != null && supportMinAppVersion != null) {
                java.lang.String strEZpvd = C32979mnm.EZpvd.EZpvd();
                try {
                    if (C33573myx.copydefault(strEZpvd, supportMinAppVersion) >= 0) {
                        return true;
                    }
                } catch (java.lang.Throwable th) {
                    pUU.AEQbTJ("BaseApprovalManager", "appVersion: " + strEZpvd + ", configVersion: " + supportMinAppVersion, th);
                }
            }
            return false;
        }

        public static /* synthetic */ eLJ getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.KWHzl(context);
        }

        public final eLJ KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return AEQbTJ() ? C15530eLt.Companion.OLrzqt(context) : C15523eLm.KWHzl;
        }
    }

    public final ApproveItem KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.List<ApproveItem> listEZpvd = EZpvd();
        java.lang.Object obj = null;
        if (listEZpvd == null) {
            return null;
        }
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            ApproveItem approveItem = (ApproveItem) next;
            if (Intrinsics.EZpvd((java.lang.Object) approveItem.getProjectName(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) approveItem.getNetwork(), (java.lang.Object) str2) && Intrinsics.EZpvd((java.lang.Object) approveItem.getApprovalAddress(), (java.lang.Object) str3)) {
                obj = next;
                break;
            }
        }
        return (ApproveItem) obj;
    }

    public final java.util.List<ApproveItem> gEmmrt() {
        java.util.ArrayList arrayList;
        java.util.List<ApproveItem> listEZpvd = EZpvd();
        if (listEZpvd != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                ApproveItem approveItem = (ApproveItem) obj;
                if (approveItem.isRiskyProject() && approveItem.getBlackTagType() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final java.util.List<ApproveItem> valueOf() {
        java.util.ArrayList arrayList;
        java.util.List<ApproveItem> listEZpvd = EZpvd();
        if (listEZpvd != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                ApproveItem approveItem = (ApproveItem) obj;
                if (approveItem.isRiskyProject()) {
                    java.lang.Integer blackTagType = approveItem.getBlackTagType();
                    int value = ApproveRiskyTagType.MALICIOUS_ADDRESS.getValue();
                    if (blackTagType != null && blackTagType.intValue() == value) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }
}
