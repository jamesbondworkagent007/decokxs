package o;

import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AAAndMpcWalletStatus;
import com.okinc.wallet.api.bean.AAWalletEnableState;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cUI extends AbstractC43215rlA implements InterfaceC54825xWs {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AAWalletEnableState.values().length];
            try {
                iArr[AAWalletEnableState.Normal.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AAWalletEnableState.OwnerAbnormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AAWalletEnableState.ProxyAbnormal.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[AAStatus.values().length];
            try {
                iArr2[AAStatus.OwnerAbnormal.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[AAStatus.ProxyAbnormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    @Override // o.InterfaceC54825xWs
    public AAAndMpcWalletStatus OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
            mpcWalletAbleStatusCopydefault = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ);
        } else {
            mpcWalletAbleStatusCopydefault = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
        }
        java.util.HashMap<java.lang.String, AAStatus> mapEZpvd = fNC.OLrzqt.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(mapEZpvd.size());
        for (Map.Entry<java.lang.String, AAStatus> entry : mapEZpvd.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), OLrzqt(entry.getValue())));
        }
        AAWalletEnableState aAWalletEnableState = (AAWalletEnableState) C56424yEw.copydefault(arrayList).get(interfaceC9738bbJ.DbNXlk());
        if (aAWalletEnableState == null) {
            aAWalletEnableState = AAWalletEnableState.Normal;
        }
        return new AAAndMpcWalletStatus(aAWalletEnableState, mpcWalletAbleStatusCopydefault);
    }

    @Override // o.InterfaceC54825xWs
    public java.lang.String copydefault(@NotNull AAWalletEnableState aAWalletEnableState, @NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(aAWalletEnableState, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        int i = StateListAnimator.KWHzl[aAWalletEnableState.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Keep);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.LayoutRes);
    }

    public final AAWalletEnableState OLrzqt(AAStatus aAStatus) {
        int i = StateListAnimator.OLrzqt[aAStatus.ordinal()];
        if (i == 1) {
            return AAWalletEnableState.OwnerAbnormal;
        }
        if (i == 2) {
            return AAWalletEnableState.ProxyAbnormal;
        }
        return AAWalletEnableState.Normal;
    }
}
