package o;

import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wYP extends AppCompatRadioButton implements InterfaceC55066xct {
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public CompoundButton.OnCheckedChangeListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] androidx.appcompat.R.attr.radioButtonStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.wYP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? androidx.appcompat.R.attr.radioButtonStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYP.EZpvd(this.copydefault);
            }
        });
        InterfaceC52764wXm.Application.loadFromAttributes$default(AEQbTJ(), attributeSet, i, 0, 4, null);
        this.KWHzl = true;
    }

    private final wYM AEQbTJ() {
        return (wYM) this.EZpvd.getValue();
    }

    public static final wYM EZpvd(wYP wyp) {
        return new wYM(wyp);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        AEQbTJ().setOKDSSize(i);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (android.text.TextUtils.isEmpty(charSequence) || !this.KWHzl) {
            return;
        }
        setPaddingRelative(AEQbTJ().copydefault(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public final void setCheckedIgnoreListener(boolean z) {
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.copydefault);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.copydefault = onCheckedChangeListener;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
