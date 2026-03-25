package o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSF implements LayoutInflater.Factory2, View.OnLongClickListener {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public android.util.DisplayMetrics AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pSF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View onCreateView(android.view.View view, @NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        AppCompatActivity appCompatActivity;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AEQbTJ = context.getResources().getDisplayMetrics();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        android.view.View viewCreateView = null;
        if (view == null) {
            appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        } else if (view.getContext() instanceof AppCompatActivity) {
            android.content.Context context2 = view.getContext();
            Intrinsics.copydefault(context2, "");
            appCompatActivity = (AppCompatActivity) context2;
        } else if (view.getContext() != null) {
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(view.getContext());
            if (activityOLrzqt instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) activityOLrzqt;
            }
        }
        if (appCompatActivity == null) {
            try {
                viewCreateView = layoutInflaterFrom.createView(str, null, attributeSet);
            } catch (java.lang.Exception unused) {
            }
        } else {
            AppCompatDelegate delegate = appCompatActivity.getDelegate();
            Intrinsics.checkNotNullExpressionValue(delegate, "");
            android.view.View viewCreateView2 = delegate.createView(view, str, context, attributeSet);
            if (viewCreateView2 != null || StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, '.', 0, false, 6, (java.lang.Object) null) <= 0) {
                viewCreateView = viewCreateView2;
            } else {
                try {
                    pUU.EZpvd("OKLayoutFactory", "name = " + str);
                    viewCreateView = layoutInflaterFrom.createView(str, null, attributeSet);
                } catch (java.lang.Exception unused2) {
                    viewCreateView = viewCreateView2;
                }
            }
        }
        if (viewCreateView instanceof android.widget.TextView) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.text, android.R.attr.hint, android.R.attr.title});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                java.lang.String string = context.getString(resourceId);
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (string.length() > 0) {
                    ((android.widget.TextView) viewCreateView).setText(string);
                }
            }
            if (resourceId2 != 0) {
                java.lang.String string2 = context.getString(resourceId2);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (string2.length() > 0) {
                    ((android.widget.TextView) viewCreateView).setHint(string2);
                }
            }
            if (C38302pTt.KWHzl.copydefault()) {
                ((android.widget.TextView) viewCreateView).setOnLongClickListener(this);
            }
        }
        return viewCreateView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof android.widget.TextView)) {
            return false;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            java.lang.Object systemService = activityAEQbTJ.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", ((android.widget.TextView) view).getText()));
        }
        android.widget.Toast.makeText(view.getContext(), C59442zhC.fJNWhG(((java.lang.Object) ((android.widget.TextView) view).getText()) + " Copied to clipboard"), 1).show();
        return false;
    }
}
