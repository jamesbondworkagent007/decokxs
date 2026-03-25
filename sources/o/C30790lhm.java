package o;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C30790lhm {
    public final C30793lhp OLrzqt;
    public final C30791lhn copydefault;

    /* JADX INFO: renamed from: o.lhm$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C30790lhm(@NotNull C30793lhp c30793lhp, @NotNull C30791lhn c30791lhn) {
        Intrinsics.checkNotNullParameter(c30793lhp, "");
        Intrinsics.checkNotNullParameter(c30791lhn, "");
        this.OLrzqt = c30793lhp;
        this.copydefault = c30791lhn;
    }

    public final InterfaceC30792lho OLrzqt(@NotNull AdvancedOrderType advancedOrderType) {
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        int i = ActionBar.KWHzl[advancedOrderType.ordinal()];
        if (i == 1) {
            return this.OLrzqt;
        }
        if (i == 2) {
            return this.copydefault;
        }
        throw new java.lang.IllegalArgumentException("Unsupported advanced strategy: " + advancedOrderType);
    }
}
