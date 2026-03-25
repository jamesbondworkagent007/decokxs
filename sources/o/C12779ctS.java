package o;

import android.view.View;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C14140dfo;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12779ctS {
    public static boolean AEQbTJ;
    public static final C12779ctS KWHzl = new C12779ctS();
    public static final int EZpvd = 8;

    private C12779ctS() {
    }

    public final void copydefault(boolean z) {
        AEQbTJ = z;
        SPUtils.put("mpc_derive_db_update", java.lang.Boolean.valueOf(z));
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("mpc_derive_db_update", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ctS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void urgentEscapeDialog$default(C12779ctS c12779ctS, android.app.Activity activity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c12779ctS.EZpvd(activity, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.isDestroyed()) {
            return;
        }
        final android.view.View viewInflate = android.view.LayoutInflater.from(activity).inflate(C13754dXa.TaskDescription.isTimeProfileEmpty, (android.view.ViewGroup) null);
        android.widget.EditText editText = (android.widget.EditText) viewInflate.findViewById(C13754dXa.ActionBar.DQnQnb);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplApi23);
        editText.setInputType(editText.getInputType() | 4096);
        editText.setHint(strAYXKKw);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMaxVolume));
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCurrentVolume), C56423yEv.EZpvd(C56390yDp.OLrzqt("text", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.ctQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12779ctS.EZpvd(viewInflate, (java.util.List) obj);
            }
        }, 14, null));
        editText.addTextChangedListener(new Activity(viewOnClickListenerC54939xaY, strAYXKKw));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPlaybackType), new View.OnClickListener() { // from class: o.ctR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C12779ctS.AEQbTJ(viewOnClickListenerC54939xaY, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVolumeControl), new View.OnClickListener() { // from class: o.ctT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C12779ctS.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        if (!activity.isFinishing()) {
            viewOnClickListenerC54939xaY.show();
        }
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(false);
            textViewEZpvd.setAlpha(0.2f);
            textViewEZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRGtXKCDKRTZD));
        }
        float f = C33492mxV.OLrzqt() ? 0.85f : 0.4f;
        android.view.Window window = activity.getWindow();
        if (window != null) {
            window.setDimAmount(f);
        }
    }

    public static final Unit EZpvd(android.view.View view, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(view.getContext(), C13754dXa.LoaderManager.fIwbmz));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ctS$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.String str) {
            this.KWHzl = viewOnClickListenerC54939xaY;
            this.copydefault = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            android.widget.TextView textViewEZpvd = this.KWHzl.EZpvd();
            if (textViewEZpvd != null) {
                java.lang.String str = this.copydefault;
                textViewEZpvd.setAlpha(string.contentEquals(str) ? 1.0f : 0.2f);
                textViewEZpvd.setEnabled(string.contentEquals(str));
            }
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(fragmentManager, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatTransportControlsApi24), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRating), C33070mpX.AYXKKw(C13754dXa.FragmentManager.dispatchMediaButtonEvent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPlaybackInfo), new Function0() { // from class: o.ctY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12779ctS.EZpvd(function0);
            }
        });
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ctS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void mpcPrivateKeyBackupSuccessDialog$default(C12779ctS c12779ctS, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c12779ctS.copydefault(fragmentManager, (Function1<? super java.lang.String, Unit>) function1);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        fIV.Companion.EZpvd().copydefault(fragmentManager, new Function2() { // from class: o.ctU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12779ctS.copydefault(function1, (java.lang.Integer) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, java.lang.Integer num, java.lang.String str) {
        if (num != null && num.intValue() == 1) {
            if (function1 != null) {
            }
        } else if (num != null) {
            num.intValue();
        }
        return Unit.INSTANCE;
    }
}
