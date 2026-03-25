package o;

import com.okinc.core.util.SPUtils;
import com.okinc.wallet.api.bean.Web3BusinessLine;
import com.okinc.wallet.api.bean.Web3ReferralCodeInfo;
import com.okinc.wallet.api.bean.Web3ReferralCodeSource;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17668fNw {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.fNw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fNw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C17668fNw getInstance$default(Activity activity, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return activity.KWHzl(context);
        }

        public final C17668fNw KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).RcXXUw();
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Web3ReferralCodeSource web3ReferralCodeSource, @NotNull Web3BusinessLine web3BusinessLine) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(web3ReferralCodeSource, "");
        Intrinsics.checkNotNullParameter(web3BusinessLine, "");
        java.util.List<Web3ReferralCodeInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) AEQbTJ());
        listFJNWhG.add(0, new Web3ReferralCodeInfo(str, java.lang.System.currentTimeMillis(), str2, web3ReferralCodeSource, web3BusinessLine));
        if (listFJNWhG.size() > 100) {
            listFJNWhG.subList(100, listFJNWhG.size()).clear();
        }
        EZpvd(listFJNWhG);
        xWP xwp = (xWP) C43251rlk.OLrzqt(xWP.class);
        if (xwp != null) {
            xwp.AEQbTJ(str);
        }
    }

    public final Web3ReferralCodeInfo KWHzl(@NotNull Web3BusinessLine web3BusinessLine) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(web3BusinessLine, "");
        java.util.List<Web3ReferralCodeInfo> listAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : listAEQbTJ) {
            if (((Web3ReferralCodeInfo) obj2).getBusinessLine() == web3BusinessLine) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long timestamp = ((Web3ReferralCodeInfo) next).getTimestamp();
                do {
                    java.lang.Object next2 = it.next();
                    long timestamp2 = ((Web3ReferralCodeInfo) next2).getTimestamp();
                    if (timestamp < timestamp2) {
                        next = next2;
                        timestamp = timestamp2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Web3ReferralCodeInfo) obj;
    }

    public final java.util.List<Web3ReferralCodeInfo> AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(SPUtils.getArrayList("referralCodes", Web3ReferralCodeInfo.class, "Web3ReferralCodes"));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List<Web3ReferralCodeInfo> list = (java.util.List) objM7377constructorimpl;
        return list == null ? yDY.AhwBna() : list;
    }

    public final void EZpvd(java.util.List<Web3ReferralCodeInfo> list) {
        SPUtils.put("referralCodes", list, "Web3ReferralCodes");
    }
}
