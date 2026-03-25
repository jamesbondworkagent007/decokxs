package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class fZQ {
    public static final boolean OLrzqt(TipMessageInfo tipMessageInfo) {
        java.lang.Integer level;
        if (tipMessageInfo == null || (level = tipMessageInfo.getLevel()) == null) {
            return false;
        }
        level.intValue();
        return new kotlin.ranges.IntRange(TypedValues.TransitionType.TYPE_DURATION, 799).AEQbTJ(tipMessageInfo.getLevel().intValue());
    }

    public static final boolean copydefault(TipMessageInfo tipMessageInfo) {
        java.lang.Integer level;
        if (tipMessageInfo == null || (level = tipMessageInfo.getLevel()) == null) {
            return false;
        }
        level.intValue();
        return new kotlin.ranges.IntRange(300, 399).AEQbTJ(tipMessageInfo.getLevel().intValue());
    }
}
