package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import com.okinc.dexkline.dexlogic.txs.TxType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.naj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34367naj extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public C36069oOc AEQbTJ;
    public final boolean KWHzl;
    public Function1<? super TxType, Unit> EZpvd = new Function1() { // from class: o.nap
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C34367naj.KWHzl((TxType) obj);
        }
    };
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nar
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34367naj.EZpvd(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nao
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34367naj.AEQbTJ(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.naj$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.KWHzl;
    }

    public static final Unit KWHzl(TxType txType) {
        return Unit.INSTANCE;
    }

    public final TxType copydefault() {
        return (TxType) this.copydefault.getValue();
    }

    public static final TxType EZpvd(C34367naj c34367naj) {
        android.os.Bundle arguments = c34367naj.getArguments();
        if (arguments != null) {
            return (TxType) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "type", TxType.class));
        }
        return null;
    }

    public static final java.lang.String AEQbTJ(C34367naj c34367naj) {
        java.lang.String string;
        android.os.Bundle arguments = c34367naj.getArguments();
        return (arguments == null || (string = arguments.getString("history.track")) == null) ? "" : string;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C36069oOc.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        C36069oOc c36069oOc = this.AEQbTJ;
        if (c36069oOc != null) {
            final android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fdt);
            AEQbTJ(copydefault(), drawableKWHzl);
            c36069oOc.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nam
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34367naj.KWHzl(this.KWHzl, drawableKWHzl, view);
                }
            });
            c36069oOc.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.nal
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34367naj.EZpvd(this.copydefault, drawableKWHzl, view);
                }
            });
            c36069oOc.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nai
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34367naj.djBIcL(this.AEQbTJ, drawableKWHzl, view);
                }
            });
        }
    }

    public static final void KWHzl(C34367naj c34367naj, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c34367naj.AEQbTJ(TxType.ALL, drawable);
    }

    public static final void EZpvd(C34367naj c34367naj, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c34367naj.AEQbTJ(TxType.BUY, drawable);
    }

    public static final void djBIcL(C34367naj c34367naj, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c34367naj.AEQbTJ(TxType.SELL, drawable);
    }

    public static /* synthetic */ void setSelected$default(C34367naj c34367naj, TxType txType, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c34367naj.AEQbTJ(txType, drawable);
    }

    public final void AEQbTJ(TxType txType, android.graphics.drawable.Drawable drawable) {
        android.widget.TextView textView;
        C36069oOc c36069oOc = this.AEQbTJ;
        if (c36069oOc != null) {
            c36069oOc.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c36069oOc.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c36069oOc.copydefault.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            int i = txType == null ? -1 : ActionBar.EZpvd[txType.ordinal()];
            if (i == 1) {
                textView = c36069oOc.KWHzl;
            } else if (i == 2) {
                textView = c36069oOc.EZpvd;
            } else {
                textView = c36069oOc.copydefault;
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        }
        if (txType != copydefault()) {
            this.EZpvd.invoke(txType);
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.EZpvd.invoke(null);
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.naj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.naj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C34367naj newInstance$default(Application application, TxType txType, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return application.EZpvd(txType, str, function1);
        }

        public final C34367naj EZpvd(@NotNull TxType txType, @NotNull java.lang.String str, @NotNull Function1<? super TxType, Unit> function1) {
            Intrinsics.checkNotNullParameter(txType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C34367naj c34367naj = new C34367naj();
            android.os.Bundle bundle = new android.os.Bundle();
            c34367naj.EZpvd = function1;
            bundle.putParcelable("type", txType);
            bundle.putString("history.track", str);
            c34367naj.setArguments(bundle);
            return c34367naj;
        }
    }
}
