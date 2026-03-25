package o;

import com.okinc.market.ext.CryptoCellTagColor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41348qpC {

    /* JADX INFO: renamed from: o.qpC$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CryptoCellTagColor.values().length];
            try {
                iArr[CryptoCellTagColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCellTagColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCellTagColor.NATURAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static final void copydefault(@NotNull C55071xcy c55071xcy, @NotNull CryptoCellTagColor cryptoCellTagColor) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        Intrinsics.checkNotNullParameter(cryptoCellTagColor, "");
        int i = TaskDescription.OLrzqt[cryptoCellTagColor.ordinal()];
        if (i == 1) {
            c55071xcy.setStyle(0);
        } else if (i == 2) {
            c55071xcy.setStyle(1);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c55071xcy.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
    }
}
