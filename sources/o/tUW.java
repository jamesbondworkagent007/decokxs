package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUW extends android.widget.LinearLayout {
    public final AppCompatImageView KWHzl;
    public final tUU OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.tUW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        android.view.View.inflate(context, C47501trL.Application.DCUTEIddSDPG, this);
        setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null));
        this.OLrzqt = (tUU) findViewById(C47501trL.TaskDescription.DcMfJKDIADVb);
        this.KWHzl = (AppCompatImageView) findViewById(C47501trL.TaskDescription.jNexW);
    }

    public final void setTextAndAvatars(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, boolean z, boolean z2, Function0<Unit> function0) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.setTextAndAvatars(str, str2, list, function0, z2);
        if (z) {
            if (z2) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO), java.lang.Integer.valueOf(C52761wXj.Activity.DLGVGj));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO), java.lang.Integer.valueOf(C52761wXj.Activity.DKtBnz));
            }
        } else if (z2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddhgMB), java.lang.Integer.valueOf(C52761wXj.Activity.zzQwtT));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddhgMB), java.lang.Integer.valueOf(C52761wXj.Activity.gwwfep));
        }
        this.KWHzl.setImageDrawable(ContextCompat.getDrawable(getContext(), ((java.lang.Number) pairOLrzqt.getFirst()).intValue()));
        this.KWHzl.setImageTintList(ContextCompat.getColorStateList(getContext(), ((java.lang.Number) pairOLrzqt.getSecond()).intValue()));
    }
}
