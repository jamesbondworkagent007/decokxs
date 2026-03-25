package o;

import android.content.ClipData;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17616fLy extends RecyclerView.ViewHolder {
    public final Function2<fLJ, java.lang.Integer, Unit> OLrzqt;
    public final C16991euP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16991euP KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.fLJ, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17616fLy(@NotNull C16991euP c16991euP, @NotNull Function2<? super fLJ, ? super java.lang.Integer, Unit> function2) {
        super(c16991euP.getRoot());
        Intrinsics.checkNotNullParameter(c16991euP, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = c16991euP;
        this.OLrzqt = function2;
    }

    public final void copydefault(@NotNull fLJ flj) {
        Intrinsics.checkNotNullParameter(flj, "");
        AEQbTJ(flj);
        C16991euP c16991euP = this.copydefault;
        android.widget.TextView textView = c16991euP.copydefault;
        android.content.Context context = c16991euP.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.MediaControllerCompatApi21, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", flj.AEQbTJ()))));
        if (flj.OLrzqt()) {
            C52794wYp c52794wYp = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            int i = C52761wXj.TaskDescription.alsFma;
            java.lang.String string = this.copydefault.getRoot().getContext().getString(C13754dXa.FragmentManager.validateCustomAction);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(c52794wYp, i, string);
        } else {
            C52794wYp c52794wYp2 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            int i2 = C52761wXj.TaskDescription.tIwhY;
            java.lang.String string2 = this.copydefault.getRoot().getContext().getString(C13754dXa.FragmentManager.getSessionActivity);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            OLrzqt(c52794wYp2, i2, string2);
        }
        C52794wYp c52794wYp3 = this.copydefault.EZpvd;
        c52794wYp3.setOnClickListener(new TaskDescription(c52794wYp3, 1000L, flj, this));
    }

    /* JADX INFO: renamed from: o.fLy$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ fLJ copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(fLJ flj) {
            this.copydefault = flj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            if (string.length() > 0) {
                C17616fLy c17616fLy = C17616fLy.this;
                C52794wYp c52794wYp = c17616fLy.KWHzl().EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                int i = C52761wXj.TaskDescription.alsFma;
                java.lang.String string2 = C17616fLy.this.KWHzl().getRoot().getContext().getString(C13754dXa.FragmentManager.validateCustomAction);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c17616fLy.OLrzqt(c52794wYp, i, string2);
                this.copydefault.OLrzqt(true);
            } else {
                C17616fLy c17616fLy2 = C17616fLy.this;
                C52794wYp c52794wYp2 = c17616fLy2.KWHzl().EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                int i2 = C52761wXj.TaskDescription.tIwhY;
                java.lang.String string3 = C17616fLy.this.KWHzl().getRoot().getContext().getString(C13754dXa.FragmentManager.getSessionActivity);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c17616fLy2.OLrzqt(c52794wYp2, i2, string3);
                this.copydefault.OLrzqt(false);
            }
            boolean zKWHzl = C17655fNj.AEQbTJ.KWHzl(false, this.copydefault.KWHzl(), this.copydefault.copydefault(), string);
            C17616fLy.setErrInfo$default(C17616fLy.this, !zKWHzl, null, 2, null);
            this.copydefault.AEQbTJ(zKWHzl);
            this.copydefault.AEQbTJ(string);
            C17616fLy.this.OLrzqt.invoke(this.copydefault, java.lang.Integer.valueOf(C17616fLy.this.getPosition()));
        }
    }

    public final void AEQbTJ(fLJ flj) {
        this.copydefault.AEQbTJ.addTextChangedListener(new Activity(flj));
    }

    public final boolean KWHzl(android.widget.TextView textView) {
        ClipData.Item itemAt;
        java.lang.CharSequence text;
        android.content.Context context = this.copydefault.getRoot().getContext();
        java.lang.CharSequence charSequence = "";
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) ContextCompat.getSystemService(context, android.content.ClipboardManager.class);
        android.content.ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
        if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
            charSequence = text;
        }
        textView.setText(charSequence);
        return charSequence.length() > 0;
    }

    public final void OLrzqt(C52794wYp c52794wYp, @androidx.annotation.DrawableRes int i, java.lang.String str) {
        int color = ContextCompat.getColor(this.copydefault.getRoot().getContext(), C52761wXj.Activity.fdOvFl);
        c52794wYp.setText(str);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this.copydefault.getRoot().getContext(), i);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, color);
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        } else {
            drawable = null;
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
    }

    public static /* synthetic */ void setErrInfo$default(C17616fLy c17616fLy, boolean z, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charSequence = c17616fLy.copydefault.getRoot().getContext().getString(C13754dXa.FragmentManager.MediaControllerCompatPlaybackInfo);
        }
        c17616fLy.AEQbTJ(z, charSequence);
    }

    public final void AEQbTJ(boolean z, java.lang.CharSequence charSequence) {
        if (z) {
            if (this.copydefault.OLrzqt.getVisibility() != 0) {
                this.copydefault.OLrzqt.setVisibility(0);
            }
            this.copydefault.OLrzqt.setText(charSequence);
            C16991euP c16991euP = this.copydefault;
            c16991euP.KWHzl.setStrokeColor(ContextCompat.getColor(c16991euP.getRoot().getContext(), C52761wXj.Activity.DcMfJKgMxgjU));
            return;
        }
        if (this.copydefault.OLrzqt.getVisibility() != 8) {
            this.copydefault.OLrzqt.setVisibility(8);
        }
        C16991euP c16991euP2 = this.copydefault;
        c16991euP2.KWHzl.setStrokeColor(ContextCompat.getColor(c16991euP2.getRoot().getContext(), C52761wXj.Activity.aBDePw));
    }

    /* JADX INFO: renamed from: o.fLy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C17616fLy KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fLJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fLJ flj, C17616fLy c17616fLy) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = flj;
            this.KWHzl = c17616fLy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.OLrzqt()) {
                    this.KWHzl.KWHzl().AEQbTJ.getText().clear();
                } else {
                    C17616fLy c17616fLy = this.KWHzl;
                    android.widget.EditText editText = c17616fLy.KWHzl().AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(editText, "");
                    c17616fLy.KWHzl(editText);
                }
                this.KWHzl.OLrzqt.invoke(this.copydefault, java.lang.Integer.valueOf(this.KWHzl.getBindingAdapterPosition()));
            }
        }
    }
}
