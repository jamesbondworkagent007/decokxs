package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C52761wXj;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49487upV {
    public static final C49487upV KWHzl = new C49487upV();

    /* JADX INFO: renamed from: o.upV$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    private C49487upV() {
    }

    public final void copydefault(@NotNull wYK wyk, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(wyk, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.QVAiDq);
        java.lang.String strCopydefault = C33069mpW.copydefault(C49511upt.Activity.QKVWgx, C56423yEv.EZpvd(C56390yDp.OLrzqt("borrowRules", strAYXKKw)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        int length = strAYXKKw.length() + iIndexOf$default;
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, length, 33);
        spannableStringBuilder.setSpan(new TaskDescription(wyk, onClickListener), iIndexOf$default, length, 33);
        wyk.setMovementMethod(new android.text.method.LinkMovementMethod());
        wyk.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o.upV$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ View.OnClickListener AEQbTJ;
        public final /* synthetic */ wYK KWHzl;

        public TaskDescription(wYK wyk, View.OnClickListener onClickListener) {
            this.KWHzl = wyk;
            this.AEQbTJ = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.cancelPendingInputEvents();
            this.AEQbTJ.onClick(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.upV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSimpleModeTradeAgreement$default(C49487upV c49487upV, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        c49487upV.KWHzl(lifecycleOwner, function1, function12);
    }

    public final void KWHzl(@NotNull LifecycleOwner lifecycleOwner, final Function1<? super java.lang.Boolean, Unit> function1, final Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final C56162xxc c56162xxc = new C56162xxc();
        c56162xxc.AhwBna().observe(lifecycleOwner, new Application(new Function1() { // from class: o.uqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49487upV.OLrzqt(function12, (java.lang.Exception) obj);
            }
        }));
        c56162xxc.KWHzl(new Function1() { // from class: o.uqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49487upV.EZpvd(function1, function12, c56162xxc, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56162xxc, 0L, 1, null);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null && function1 != null) {
            function1.invoke(message);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.upV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSimpleBorrowTradeAgreementDialog$default(C49487upV c49487upV, android.content.Context context, View.OnClickListener onClickListener, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        c49487upV.OLrzqt(context, onClickListener, (Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void OLrzqt(@NotNull final android.content.Context context, @NotNull View.OnClickListener onClickListener, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: o.upY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C49487upV.OLrzqt(viewOnClickListenerC54939xaY, context, compoundButton, z);
            }
        };
        final C49539uqU c49539uqUOLrzqt = C49539uqU.OLrzqt(android.view.LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c49539uqUOLrzqt, "");
        wYK wyk = c49539uqUOLrzqt.KWHzl;
        wyk.setOnCheckedChangeListener(onCheckedChangeListener);
        C49487upV c49487upV = KWHzl;
        Intrinsics.copydefault(wyk);
        c49487upV.copydefault(wyk, onClickListener);
        NestedScrollView root = c49539uqUOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        viewOnClickListenerC54939xaY.EZpvd(C49511upt.Activity.AEQbTJ, new View.OnClickListener() { // from class: o.upZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49487upV.AEQbTJ(c49539uqUOLrzqt, function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C49511upt.Activity.EZpvd, new View.OnClickListener() { // from class: o.upX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49487upV.AEQbTJ(viewOnClickListenerC54939xaY, function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.upW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C49487upV.EZpvd(c49539uqUOLrzqt, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        viewOnClickListenerC54939xaY.show();
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(false);
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.content.Context context, android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(z);
        }
        if (z) {
            viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        } else {
            viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        }
    }

    public static final void AEQbTJ(C49539uqU c49539uqU, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (c49539uqU.KWHzl.isChecked()) {
            if (function0 != null) {
                function0.invoke();
            }
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void EZpvd(C49539uqU c49539uqU, android.content.DialogInterface dialogInterface) {
        c49539uqU.KWHzl.setOnCheckedChangeListener(null);
    }

    public static final Unit EZpvd(Function1 function1, Function1 function12, C56162xxc c56162xxc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(responseData.getCode() == 0));
        }
        if (responseData.getCode() != 0 && function12 != null) {
            function12.invoke(responseData.getMsg());
        }
        c56162xxc.AYXKKw();
        return Unit.INSTANCE;
    }
}
