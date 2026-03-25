package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52870wal extends ConstraintLayout implements InterfaceC50054vAe {
    public Function1<? super android.view.View, Unit> AEQbTJ;
    public boolean KWHzl;
    public Function0<Unit> OLrzqt;
    public final AbstractC50913vdC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52870wal(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52870wal(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50054vAe
    public void AEQbTJ(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvaTextShow(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHlAvaClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.wal.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52870wal(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52870wal(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.gqESXP, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC50913vdC) viewDataBindingInflate;
        EZpvd();
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDcMfJK)));
    }

    private final void EZpvd() {
        this.copydefault.KWHzl.AEQbTJ(new Function1() { // from class: o.wam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52870wal.AEQbTJ(this.OLrzqt, (android.view.View) obj);
            }
        });
        C55258xgZ c55258xgZ = this.copydefault.AEQbTJ;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static final Unit AEQbTJ(C52870wal c52870wal, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c52870wal.AEQbTJ;
        if (function1 != null) {
            function1.invoke(view);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(Function2<? super C47988uAv, ? super java.lang.String, Unit> function2) {
        this.copydefault.EZpvd.setOnTextChangeCallback(function2);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.KWHzl.setTitle(str);
    }

    public final void setInputEnable(boolean z) {
        InputLayoutState inputLayoutState;
        if (z) {
            inputLayoutState = InputLayoutState.NORMAL;
        } else {
            inputLayoutState = InputLayoutState.GREY_UN_CLICKABLE;
        }
        C47988uAv.setInputLayoutState$default(this.copydefault.EZpvd, inputLayoutState, false, 2, null);
    }

    public static /* synthetic */ void setInputViewConfig$default(C52870wal c52870wal, java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c52870wal.setInputViewConfig(str, str2, num, z);
    }

    public final void setInputViewConfig(java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C47988uAv.setInputLabel$default(this.copydefault.EZpvd, str, null, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            this.copydefault.EZpvd.setInputUnit(str2);
        }
        if (num != null) {
            this.copydefault.EZpvd.setMaxDecimal(num.intValue());
        }
        this.copydefault.EZpvd.setEnabled(z);
    }

    public final void setInputContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv.setInputContent$default(this.copydefault.EZpvd, str, false, false, 6, null);
    }

    public final void setInputError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            this.copydefault.EZpvd.setInputErrorMsg(str);
        }
    }

    @Override // o.InterfaceC50054vAe
    public void setSelect(boolean z) {
        this.copydefault.KWHzl.setSelect(z);
        if (z) {
            C47988uAv c47988uAv = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            c47988uAv.setVisibility(0);
            KWHzl(this.KWHzl);
            return;
        }
        C47988uAv c47988uAv2 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        c47988uAv2.setVisibility(8);
        C47988uAv.setInputContent$default(this.copydefault.EZpvd, "", false, false, 6, null);
        KWHzl(false);
    }

    private final void KWHzl(boolean z) {
        C55258xgZ c55258xgZ = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
    }

    public final void setHlAvaText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AEQbTJ.setText(str);
    }

    public final void setAvaValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.OLrzqt.setText(str);
    }

    /* JADX INFO: renamed from: o.wal$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52870wal EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52870wal c52870wal) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c52870wal;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
