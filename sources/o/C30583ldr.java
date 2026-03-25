package o;

import android.view.View;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30583ldr extends AbstractC30580ldo {
    public static final Activity Companion = new Activity(null);
    public static final int DbNXlk = 8;
    public static final BigDecimal isConnected = new BigDecimal("1000000000");
    public android.widget.TextView AkhnZx;

    /* JADX INFO: renamed from: o.ldr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ldr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30583ldr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode);
        setupPositivePrefix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30583ldr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode);
        setupPositivePrefix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30583ldr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode);
        setupPositivePrefix();
    }

    public final void setupPositivePrefix() {
        this.AkhnZx = OLrzqt(copydefault());
        C55001xbh c55001xbhKWHzl = KWHzl();
        final View.OnFocusChangeListener onFocusChangeListener = c55001xbhKWHzl != null ? c55001xbhKWHzl.getOnFocusChangeListener() : null;
        C55001xbh c55001xbhKWHzl2 = KWHzl();
        if (c55001xbhKWHzl2 != null) {
            c55001xbhKWHzl2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C30583ldr.setupPositivePrefix$lambda$0(this.KWHzl, onFocusChangeListener, view, z);
                }
            });
        }
        C55001xbh c55001xbhKWHzl3 = KWHzl();
        if (c55001xbhKWHzl3 != null) {
            c55001xbhKWHzl3.addTextChangedListener(new ActionBar());
        }
    }

    public static final void setupPositivePrefix$lambda$0(C30583ldr c30583ldr, View.OnFocusChangeListener onFocusChangeListener, android.view.View view, boolean z) {
        c30583ldr.OLrzqt(c30583ldr.AkhnZx, c30583ldr.KWHzl());
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    @Override // o.AbstractC30580ldo
    public boolean AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return C23313hvq.valueOf(bigDecimal, isConnected) && C23313hvq.EZpvd(bigDecimal, BigDecimal.ZERO);
    }

    @Override // o.AbstractC30580ldo
    public AdvancedAutoSellStrategy OLrzqt() {
        java.lang.String strIsConnected;
        java.lang.String strIsConnected2;
        C55001xbh c55001xbhKWHzl = KWHzl();
        java.lang.String str = (c55001xbhKWHzl == null || (strIsConnected2 = c55001xbhKWHzl.isConnected()) == null) ? "0" : strIsConnected2;
        C55001xbh c55001xbhEZpvd = EZpvd();
        return new AdvancedAutoSellStrategy.TakeProfit(str, (c55001xbhEZpvd == null || (strIsConnected = c55001xbhEZpvd.isConnected()) == null) ? "0" : strIsConnected, false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.ldr$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C30583ldr c30583ldr = C30583ldr.this;
            c30583ldr.OLrzqt(c30583ldr.AkhnZx, C30583ldr.this.KWHzl());
        }
    }
}
