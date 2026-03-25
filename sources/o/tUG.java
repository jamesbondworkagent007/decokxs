package o;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUG extends android.widget.FrameLayout {
    public final android.content.Context AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextViewToCopy(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.copydefault = textView;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.tUG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.KWHzl = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.valueOf);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.AhwBna, true);
        this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.AYXKKw, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void EZpvd(android.view.View view, final java.lang.String str) {
        int measuredWidth;
        this.OLrzqt = getResources().getConfiguration().getLayoutDirection() == 1;
        final mAE mae = new mAE(this.AEQbTJ, C33070mpX.AYXKKw(C47501trL.Fragment.iRxXKY));
        mae.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tUG.OLrzqt(mae, this, str, view2);
            }
        });
        mae.getContentView().measure(AnchorPopupWindow.KWHzl(-2), AnchorPopupWindow.KWHzl(-2));
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        if (this.OLrzqt) {
            measuredWidth = ((getRootView().getMeasuredWidth() - width) - (mae.AEQbTJ.getMeasuredWidth() / 2)) - 24;
        } else {
            measuredWidth = width - (mae.AEQbTJ.getMeasuredWidth() / 2);
        }
        mae.KWHzl(view, AnchorPopupWindow.VerticalPosition.ABOVE, 0, 0, 8388611, 1, new android.graphics.Rect(measuredWidth, 0, 0, 0), new android.graphics.Rect(0, 0, 0, 0), new int[]{0, 0}, AnchorPopupWindow.Style.Gray);
    }

    public static final void OLrzqt(mAE mae, tUG tug, java.lang.String str, android.view.View view) {
        mae.dismiss();
        java.lang.Object systemService = tug.AEQbTJ.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("", str));
        }
        java.lang.String string = tug.AEQbTJ.getString(C47501trL.Fragment.jh);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public final void KWHzl(android.widget.TextView textView, java.lang.String str) {
        if (KWHzl(textView)) {
            new tUM(this.AEQbTJ, str).KWHzl(textView);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new java.lang.Runnable() { // from class: o.tUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tUG.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(final tUG tug) {
        android.view.View next;
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(tug).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            android.view.View view = next;
            if ((view instanceof android.widget.TextView ? (android.widget.TextView) view : null) != null) {
                break;
            }
        }
        android.view.View view2 = next;
        if (view2 != null) {
            tug.copydefault = view2 instanceof android.widget.TextView ? (android.widget.TextView) view2 : null;
        }
        if (tug.KWHzl) {
            android.widget.TextView textView = tug.copydefault;
            if (textView != null) {
                textView.setLongClickable(true);
            }
            android.widget.TextView textView2 = tug.copydefault;
            if (textView2 != null) {
                textView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.tUH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view3) {
                        return tUG.EZpvd(this.copydefault, view3);
                    }
                });
            }
        }
        if (tug.EZpvd) {
            android.widget.TextView textView3 = tug.copydefault;
            if (textView3 != null) {
                textView3.setClickable(true);
            }
            android.widget.TextView textView4 = tug.copydefault;
            if (textView4 != null) {
                textView4.setOnClickListener(new TaskDescription(textView4, 300L, textView4, tug));
            }
        }
    }

    public static final boolean EZpvd(tUG tug, android.view.View view) {
        android.widget.TextView textView = tug.copydefault;
        if (textView == null) {
            return false;
        }
        tug.EZpvd(textView, tug.OLrzqt(textView));
        return true;
    }

    public final java.lang.String OLrzqt(android.widget.TextView textView) {
        java.lang.Object tag = textView.getTag();
        java.util.Map map = tag instanceof java.util.Map ? (java.util.Map) tag : null;
        java.lang.Object obj = map != null ? map.get("trailing_textview_key") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null) {
            return Intrinsics.EZpvd(str, textView.getText()) ? textView.getText().toString() : str;
        }
        return textView.getText().toString();
    }

    public final boolean KWHzl(android.widget.TextView textView) {
        int lineCount = textView.getLayout().getLineCount();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) textView.getText(), (java.lang.Object) OLrzqt(textView));
        boolean z = textView.getLayout().getEllipsisCount(lineCount + (-1)) > 0;
        if (lineCount > 1) {
            return (zEZpvd ^ true) || z;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.copydefault = null;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tUG KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.view.View view2, tUG tug) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = view2;
            this.KWHzl = tug;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.TextView textView = this.KWHzl.copydefault;
                if (textView == null) {
                    return;
                }
                tUG tug = this.KWHzl;
                tug.KWHzl(textView, tug.OLrzqt(textView));
            }
        }
    }
}
