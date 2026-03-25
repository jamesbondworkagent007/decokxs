package o;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.material3.TooltipKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55328xhq {
    public static android.content.Context AEQbTJ;
    public static android.widget.Toast AhwBna;
    public static boolean KWHzl;
    public static LottieDrawable copydefault;
    public static WeakReference<android.widget.Toast> djBIcL;
    public static final C55328xhq OLrzqt = new C55328xhq();
    public static final Application AYXKKw = new Application(android.os.Looper.getMainLooper());
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.Toast AEQbTJ() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<android.widget.Toast> KWHzl() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ = context;
    }

    private C55328xhq() {
    }

    public final android.content.Context copydefault() {
        android.content.Context context = AEQbTJ;
        if (context != null) {
            return context;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        OLrzqt(application);
    }

    /* JADX INFO: renamed from: o.xhq$Application */
    public static final class Application extends android.os.Handler {
        public Application(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            if (message.what == 1024) {
                java.lang.Object obj = message.obj;
                Intrinsics.copydefault(obj, "");
                ((android.widget.Toast) obj).cancel();
                C55328xhq.OLrzqt.AEQbTJ(false);
                LottieDrawable lottieDrawable = C55328xhq.copydefault;
                if (lottieDrawable != null) {
                    lottieDrawable.stop();
                }
            }
        }
    }

    public static /* synthetic */ android.widget.Toast show$default(C55328xhq c55328xhq, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num2, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            num = null;
        }
        if ((i4 & 2) != 0) {
            drawable = null;
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            num2 = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return c55328xhq.KWHzl(num, drawable, i, num2, i2, i3);
    }

    public final android.widget.Toast KWHzl(java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num2, int i2, int i3) {
        if (num == null) {
            return null;
        }
        num.intValue();
        C55328xhq c55328xhq = OLrzqt;
        return c55328xhq.AEQbTJ(c55328xhq.copydefault().getString(num.intValue()), drawable, i, num2, i2, i3);
    }

    public static /* synthetic */ android.widget.Toast show$default(C55328xhq c55328xhq, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = null;
        }
        if ((i4 & 2) != 0) {
            drawable = null;
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return c55328xhq.AEQbTJ(charSequence, drawable, i, num, i2, i3);
    }

    public final android.widget.Toast AEQbTJ(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3) {
        android.widget.Toast toastAEQbTJ;
        long jKWHzl;
        android.widget.Toast toast;
        WeakReference<android.widget.Toast> weakReference = djBIcL;
        if (weakReference != null && (toast = weakReference.get()) != null) {
            toast.cancel();
        }
        KWHzl = false;
        if (drawable != null) {
            toastAEQbTJ = EZpvd(charSequence, drawable);
        } else {
            toastAEQbTJ = AEQbTJ(charSequence);
        }
        toastAEQbTJ.setDuration(i);
        if (num != null) {
            toastAEQbTJ.setGravity(num.intValue(), i2, i3);
        } else if (drawable != null) {
            toastAEQbTJ.setGravity(17, i2, i3);
        } else {
            toastAEQbTJ.setGravity(17, i2, i3);
        }
        if (android.text.TextUtils.isEmpty(charSequence) && drawable == null) {
            return toastAEQbTJ;
        }
        if (i == 0 || i == 1) {
            jKWHzl = KWHzl(charSequence);
        } else {
            jKWHzl = i;
            if (jKWHzl < TooltipKt.TooltipDuration) {
                jKWHzl = KWHzl(charSequence);
            }
        }
        toastAEQbTJ.show();
        KWHzl = true;
        if (jKWHzl > 0) {
            Application application = AYXKKw;
            application.removeMessages(1024);
            application.sendMessageDelayed(application.obtainMessage(1024, toastAEQbTJ), jKWHzl);
        }
        djBIcL = new WeakReference<>(toastAEQbTJ);
        return toastAEQbTJ;
    }

    public static /* synthetic */ android.widget.Toast showWithLoading$default(C55328xhq c55328xhq, java.lang.CharSequence charSequence, LottieDrawable lottieDrawable, int i, java.lang.Integer num, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = null;
        }
        if ((i4 & 2) != 0) {
            lottieDrawable = new LottieDrawable();
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return c55328xhq.OLrzqt(charSequence, lottieDrawable, i, num, i2, i3);
    }

    public final android.widget.Toast OLrzqt(java.lang.CharSequence charSequence, LottieDrawable lottieDrawable, int i, java.lang.Integer num, int i2, int i3) {
        return AEQbTJ(charSequence, lottieDrawable, i, num, i2, i3);
    }

    public final long KWHzl(java.lang.CharSequence charSequence) {
        long jEZpvd = EZpvd(charSequence);
        if (jEZpvd >= 3000) {
            return 3000L;
        }
        return jEZpvd;
    }

    public final long EZpvd(java.lang.CharSequence charSequence) {
        return ((long) ((charSequence != null ? charSequence.length() : 0) * 60)) + TooltipKt.TooltipDuration;
    }

    public final android.widget.Toast AEQbTJ(java.lang.CharSequence charSequence) {
        C55324xhm c55324xhmEZpvd = C55324xhm.EZpvd(copydefault(), "", 0);
        android.view.View viewInflate = android.view.LayoutInflater.from(OLrzqt.copydefault()).inflate(C52761wXj.Fragment.OqFWZa, (android.view.ViewGroup) null);
        c55324xhmEZpvd.setView(viewInflate);
        ((android.widget.TextView) viewInflate.findViewById(C52761wXj.FragmentManager.DQzvGNdrmXxudrmXxu)).setText(charSequence);
        Intrinsics.checkNotNullExpressionValue(c55324xhmEZpvd, "");
        return c55324xhmEZpvd;
    }

    public final android.widget.Toast EZpvd(final java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable) {
        final android.content.Context contextCopydefault = copydefault();
        C55324xhm c55324xhmEZpvd = C55324xhm.EZpvd(contextCopydefault, "", 0);
        android.view.View viewInflate = android.view.LayoutInflater.from(contextCopydefault).inflate(C52761wXj.Fragment.DCJXGO, (android.view.ViewGroup) null);
        c55324xhmEZpvd.setView(viewInflate);
        final android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C52761wXj.FragmentManager.QCjLjM);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C52761wXj.FragmentManager.DQzvGNdrmXxudrmXxu);
        Intrinsics.copydefault(textView);
        C55307xhV.AEQbTJ(textView, charSequence);
        if (drawable instanceof LottieDrawable) {
            LottieCompositionFactory.fromRawRes(OLrzqt.copydefault(), C52761wXj.PendingIntent.AYXKKw).addListener(new LottieListener() { // from class: o.xht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C55328xhq.OLrzqt(charSequence, imageView, contextCopydefault, (LottieComposition) obj);
                }
            });
        } else {
            textView.setVisibility(0);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        Intrinsics.checkNotNullExpressionValue(c55324xhmEZpvd, "");
        return c55324xhmEZpvd;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xhM.dpInt$default(float, android.content.Context, int, java.lang.Object):int */
    public static final void OLrzqt(java.lang.CharSequence charSequence, android.widget.ImageView imageView, android.content.Context context, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(-1);
        lottieDrawable.playAnimation();
        copydefault = lottieDrawable;
        KeyPath keyPath = new KeyPath("**");
        LottieValueCallback lottieValueCallback = new LottieValueCallback(new SimpleColorFilter(ContextCompat.getColor(OLrzqt.copydefault(), C52761wXj.Activity.DpxfQh)));
        LottieDrawable lottieDrawable2 = copydefault;
        if (lottieDrawable2 != null) {
            lottieDrawable2.addValueCallback(keyPath, LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) lottieValueCallback);
            lottieDrawable2.setBounds(0, 0, C55298xhM.KWHzl(32.0f, context), C55298xhM.KWHzl(32.0f, context));
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            C55296xhK.AEQbTJ(layoutParams2, C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            layoutParams2.bottomToBottom = 0;
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setImageDrawable(copydefault);
    }

    public final void copydefault(android.app.Activity activity, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, long j, java.lang.Integer num, int i, int i2) {
        android.widget.TextView textView;
        if (activity == null) {
            return;
        }
        DialogC55319xhh dialogC55319xhh = new DialogC55319xhh(activity, j);
        C54929xaO c54929xaOKWHzl = dialogC55319xhh.KWHzl();
        if (c54929xaOKWHzl != null && (textView = c54929xaOKWHzl.copydefault) != null) {
            textView.setText(charSequence);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        android.view.Window window = dialogC55319xhh.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.x = i;
        }
        if (attributes != null) {
            attributes.y = i2;
        }
        android.view.Window window2 = dialogC55319xhh.getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        android.view.Window window3 = dialogC55319xhh.getWindow();
        if (window3 != null) {
            window3.setFlags(32, 32);
        }
        android.view.Window window4 = dialogC55319xhh.getWindow();
        if (window4 != null) {
            window4.setFlags(262144, 262144);
        }
        android.view.Window window5 = dialogC55319xhh.getWindow();
        if (window5 != null) {
            window5.setGravity(num != null ? num.intValue() : 17);
        }
        dialogC55319xhh.show();
    }
}
