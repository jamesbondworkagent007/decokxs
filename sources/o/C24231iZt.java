package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24232iZu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24231iZt {

    /* JADX INFO: renamed from: o.iZt$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAssetPositionType.values().length];
            try {
                iArr[InvestAssetPositionType.UNI_V3_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAssetPositionType.EXPIRY_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[DeFiTokenModelAssetDetail.StyleType.values().length];
            try {
                iArr2[DeFiTokenModelAssetDetail.StyleType.BASIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[DeFiTokenModelAssetDetail.StyleType.POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr2;
        }
    }

    public static /* synthetic */ AbstractC24232iZu toExpandedContent$default(C24230iZs c24230iZs, DeFiTokenModelAssetDetail.StyleType styleType, InvestAssetPositionType investAssetPositionType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            investAssetPositionType = null;
        }
        return copydefault(c24230iZs, styleType, investAssetPositionType);
    }

    public static final AbstractC24232iZu copydefault(@NotNull C24230iZs c24230iZs, @NotNull DeFiTokenModelAssetDetail.StyleType styleType, InvestAssetPositionType investAssetPositionType) {
        Intrinsics.checkNotNullParameter(c24230iZs, "");
        Intrinsics.checkNotNullParameter(styleType, "");
        int i = Activity.EZpvd[styleType.ordinal()];
        if (i == 1) {
            return new AbstractC24232iZu.StateListAnimator(c24230iZs.EZpvd(), c24230iZs.OLrzqt(), c24230iZs.KWHzl(), c24230iZs.AEQbTJ(), c24230iZs.copydefault());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = investAssetPositionType == null ? -1 : Activity.copydefault[investAssetPositionType.ordinal()];
        if (i2 == 1) {
            return new AbstractC24232iZu.Activity(c24230iZs.EZpvd(), c24230iZs.valueOf());
        }
        if (i2 == 2) {
            return new AbstractC24232iZu.Application(c24230iZs.EZpvd(), c24230iZs.OLrzqt(), c24230iZs.KWHzl());
        }
        return new AbstractC24232iZu.Activity(c24230iZs.EZpvd(), c24230iZs.valueOf());
    }
}
