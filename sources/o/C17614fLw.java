package o;

import android.media.AudioAttributes;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17614fLw extends RecyclerView.ViewHolder {
    public final C16993euR EZpvd;

    /* JADX INFO: renamed from: o.fLw$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EscapeSignStatus.values().length];
            try {
                iArr[EscapeSignStatus.ESCAPE_SIGN_STATUS_UNSTARTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EscapeSignStatus.ESCAPE_SIGN_STATUS_COMPLETED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17614fLw(@NotNull C16993euR c16993euR) {
        super(c16993euR.getRoot());
        Intrinsics.checkNotNullParameter(c16993euR, "");
        this.EZpvd = c16993euR;
    }

    public final void AEQbTJ(@NotNull EscapeSignAddressData escapeSignAddressData) {
        android.graphics.drawable.Drawable drawable;
        android.text.SpannableStringBuilder spannableStringBuilderOLrzqt;
        Intrinsics.checkNotNullParameter(escapeSignAddressData, "");
        Glide.AEQbTJ(this.EZpvd.getRoot().getContext()).EZpvd(escapeSignAddressData.getIconUrl()).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(this.EZpvd.getRoot().getContext())).EZpvd((android.widget.ImageView) this.EZpvd.copydefault);
        this.EZpvd.AEQbTJ.setText(escapeSignAddressData.getChainName());
        this.EZpvd.KWHzl.setText(C17655fNj.AEQbTJ.EZpvd(escapeSignAddressData.getChainAddress()));
        AppCompatImageView appCompatImageView = this.EZpvd.OLrzqt;
        EscapeSignStatus escapeSignStatus = escapeSignAddressData.getEscapeSignStatus();
        int[] iArr = Activity.OLrzqt;
        int i = iArr[escapeSignStatus.ordinal()];
        android.graphics.drawable.Drawable drawable2 = null;
        if (i == 1) {
            int color = ContextCompat.getColor(this.EZpvd.getRoot().getContext(), C52761wXj.Activity.DCUTEIddSDPG);
            drawable = ContextCompat.getDrawable(this.EZpvd.getRoot().getContext(), C52761wXj.TaskDescription.RXzakW);
            if (drawable != null) {
                DrawableCompat.setTint(drawable, color);
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
                drawable2 = drawable;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int color2 = ContextCompat.getColor(this.EZpvd.getRoot().getContext(), C52761wXj.Activity.QIZEnU);
            drawable = ContextCompat.getDrawable(this.EZpvd.getRoot().getContext(), C52761wXj.TaskDescription.Dmq);
            if (drawable != null) {
                DrawableCompat.setTint(drawable, color2);
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
                drawable2 = drawable;
            }
        }
        appCompatImageView.setImageDrawable(drawable2);
        android.widget.TextView textView = this.EZpvd.djBIcL;
        int i2 = iArr[escapeSignAddressData.getEscapeSignStatus().ordinal()];
        if (i2 == 1) {
            java.lang.String string = this.EZpvd.getRoot().getContext().getString(C13754dXa.FragmentManager.getLegacyAudioStream);
            Intrinsics.checkNotNullExpressionValue(string, "");
            spannableStringBuilderOLrzqt = OLrzqt(string, ContextCompat.getColor(this.EZpvd.getRoot().getContext(), C52761wXj.Activity.DCUTEIddSDPG));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String string2 = this.EZpvd.getRoot().getContext().getString(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            spannableStringBuilderOLrzqt = OLrzqt(string2, ContextCompat.getColor(this.EZpvd.getRoot().getContext(), C52761wXj.Activity.QIZEnU));
        }
        textView.setText(spannableStringBuilderOLrzqt);
        AppCompatImageView appCompatImageView2 = this.EZpvd.EZpvd;
        appCompatImageView2.setOnClickListener(new TaskDescription(appCompatImageView2, 1000L, this, escapeSignAddressData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.CharSequence charSequence) {
        copydefault();
        java.lang.Object systemService = this.EZpvd.getRoot().getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, charSequence));
        }
        java.lang.String string = this.EZpvd.getRoot().getContext().getString(C13754dXa.FragmentManager.gvFztT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    private final void copydefault() {
        java.lang.Object systemService = this.EZpvd.getRoot().getContext().getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            android.os.Vibrator vibrator2 = vibrator.hasVibrator() ? vibrator : null;
            if (vibrator2 != null) {
                vibrator2.vibrate(100L, new AudioAttributes.Builder().build());
            }
        }
    }

    public final android.text.SpannableStringBuilder OLrzqt(java.lang.String str, int i) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.fLw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ EscapeSignAddressData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C17614fLw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17614fLw c17614fLw, EscapeSignAddressData escapeSignAddressData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c17614fLw;
            this.EZpvd = escapeSignAddressData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd(this.EZpvd.getChainAddress());
            }
        }
    }
}
