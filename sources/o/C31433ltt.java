package o;

import com.okinc.buysell.data.ConvertChipAmount;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ltt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31433ltt {

    /* JADX INFO: renamed from: o.ltt$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConvertChipAmount.values().length];
            try {
                iArr[ConvertChipAmount.TWENTY_FIVE_PERCENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ConvertChipAmount.FIFTY_PERCENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ConvertChipAmount.SEVENTY_FIVE_PERCENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ConvertChipAmount.ALL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ConvertChipAmount.CONVERT_ALL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ConvertChipAmount.CONVERT_MAX.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ConvertChipAmount.ADD_MORE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ConvertChipAmount.TRANSFER.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull ConvertChipAmount convertChipAmount, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(convertChipAmount, "");
        Intrinsics.checkNotNullParameter(context, "");
        switch (ActionBar.EZpvd[convertChipAmount.ordinal()]) {
            case 1:
                return pTB.formatICUPercent$default(new BigDecimal(25), null, C38307pTy.Companion.AEQbTJ(0), null, null, null, 29, null);
            case 2:
                return pTB.formatICUPercent$default(new BigDecimal(50), null, C38307pTy.Companion.AEQbTJ(0), null, null, null, 29, null);
            case 3:
                return pTB.formatICUPercent$default(new BigDecimal(75), null, C38307pTy.Companion.AEQbTJ(0), null, null, null, 29, null);
            case 4:
                java.lang.String string = context.getString(C31351lsQ.Activity.profile);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            case 5:
                java.lang.String string2 = context.getString(C31351lsQ.Activity.fARcdN);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            case 6:
                java.lang.String string3 = context.getString(C31351lsQ.Activity.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                return string3;
            case 7:
                java.lang.String string4 = context.getString(C31351lsQ.Activity.uzCIH);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                return string4;
            case 8:
                java.lang.String string5 = context.getString(C31351lsQ.Activity.OJuSTm);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                return string5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
