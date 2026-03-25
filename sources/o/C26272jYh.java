package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26272jYh extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public hBS EZpvd;
    public Function1<? super TxType, Unit> KWHzl = new Function1() { // from class: o.jYl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C26272jYh.KWHzl((TxType) obj);
        }
    };
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jYk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26272jYh.copydefault(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jYn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26272jYh.KWHzl(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.jYh$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    public static final Unit KWHzl(TxType txType) {
        return Unit.INSTANCE;
    }

    public final TxType EZpvd() {
        return (TxType) this.OLrzqt.getValue();
    }

    public static final TxType copydefault(C26272jYh c26272jYh) {
        android.os.Bundle arguments = c26272jYh.getArguments();
        if (arguments != null) {
            return (TxType) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "type", TxType.class));
        }
        return null;
    }

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String KWHzl(C26272jYh c26272jYh) {
        java.lang.String string;
        android.os.Bundle arguments = c26272jYh.getArguments();
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
        this.EZpvd = hBS.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        hBS hbs = this.EZpvd;
        if (hbs != null) {
            final android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else {
                drawableKWHzl = null;
            }
            EZpvd(EZpvd(), drawableKWHzl);
            hbs.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jYi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26272jYh.AEQbTJ(this.OLrzqt, drawableKWHzl, view);
                }
            });
            hbs.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.jYf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26272jYh.copydefault(this.AEQbTJ, drawableKWHzl, view);
                }
            });
            hbs.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jYg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26272jYh.djBIcL(this.AEQbTJ, drawableKWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C26272jYh c26272jYh, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c26272jYh.EZpvd(TxType.ALL, drawable);
    }

    public static final void copydefault(C26272jYh c26272jYh, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c26272jYh.EZpvd(TxType.BUY, drawable);
    }

    public static final void djBIcL(C26272jYh c26272jYh, android.graphics.drawable.Drawable drawable, android.view.View view) {
        c26272jYh.EZpvd(TxType.SELL, drawable);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
    }

    public static /* synthetic */ void setSelected$default(C26272jYh c26272jYh, TxType txType, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            txType = TxType.ALL;
        }
        c26272jYh.EZpvd(txType, drawable);
    }

    public final void EZpvd(TxType txType, android.graphics.drawable.Drawable drawable) {
        android.widget.TextView textView;
        hBS hbs = this.EZpvd;
        if (hbs != null) {
            hbs.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            hbs.OLrzqt.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            hbs.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            int i = txType == null ? -1 : TaskDescription.AEQbTJ[txType.ordinal()];
            if (i == 1) {
                textView = hbs.KWHzl;
            } else if (i == 2) {
                textView = hbs.OLrzqt;
            } else {
                textView = hbs.AEQbTJ;
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        }
        if (txType != EZpvd()) {
            this.KWHzl.invoke(txType);
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.KWHzl.invoke(null);
        super.onDismiss(dialogInterface);
    }

    private final void copydefault() {
        C32866mlf.onEvent$default("DEXMarket_Token_History_Tnxs_View", (TrackChannel[]) null, new Function1() { // from class: o.jYe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26272jYh.OLrzqt(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C26272jYh c26272jYh, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", c26272jYh.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jYh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jYh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C26272jYh newInstance$default(Activity activity, TxType txType, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return activity.EZpvd(txType, str, function1);
        }

        public final C26272jYh EZpvd(@NotNull TxType txType, @NotNull java.lang.String str, @NotNull Function1<? super TxType, Unit> function1) {
            Intrinsics.checkNotNullParameter(txType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C26272jYh c26272jYh = new C26272jYh();
            android.os.Bundle bundle = new android.os.Bundle();
            c26272jYh.KWHzl = function1;
            bundle.putParcelable("type", txType);
            bundle.putString("history.track", str);
            c26272jYh.setArguments(bundle);
            return c26272jYh;
        }
    }
}
