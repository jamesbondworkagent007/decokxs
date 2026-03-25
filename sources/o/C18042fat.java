package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.business.defi.wallet.home.custom.ProfitAndLossGroupView$setText$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18042fat extends AppCompatTextView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public int EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormattedPercentValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormattedValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiseState(int i) {
        this.EZpvd = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18042fat(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.copydefault = "";
        this.AEQbTJ = "";
    }

    public static /* synthetic */ void setText$default(C18042fat c18042fat, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            TaskDescription taskDescription = Companion;
            android.content.Context context = c18042fat.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = taskDescription.EZpvd(context);
        }
        c18042fat.setText(bigDecimal, bigDecimal2, i);
    }

    public final void setText(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new ProfitAndLossGroupView$setText$1(this, i, bigDecimal, bigDecimal2, null), 3, null);
    }

    public final java.lang.String KWHzl(BigDecimal bigDecimal) {
        java.lang.String plainString = bigDecimal.abs().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return C54880xYt.formatValuationFromAsset$default(plainString, null, false, 3, false, 11, null);
    }

    public final java.lang.String OLrzqt(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
            DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
            return pTB.formatICUPercent$default(bigDecimal2, RoundingMode.FLOOR, C38307pTy.Companion.EZpvd(2), displaySign, null, null, 24, null);
        }
        DisplaySign displaySign2 = DisplaySign.ALWAYS;
        return pTB.formatICUPercent$default(bigDecimal, RoundingMode.FLOOR, C38307pTy.Companion.EZpvd(2), displaySign2, null, null, 24, null);
    }

    /* JADX INFO: renamed from: o.fat$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fat.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.mxp.tradeFallDefault$default(o.mxp, android.content.Context, float, int, java.lang.Object):int */
        public final int AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }

        public final int EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        }
    }
}
