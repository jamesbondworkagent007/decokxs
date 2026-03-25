package o;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55043xcW extends RecyclerView.ViewHolder {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public android.view.View EZpvd;
    public android.content.Context KWHzl;
    public int copydefault;
    public android.util.SparseArray<android.view.View> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.copydefault = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55043xcW(@NotNull android.content.Context context, @NotNull android.view.View view, int i) {
        super(view);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = context;
        this.copydefault = i;
        this.EZpvd = view;
        this.gEmmrt = new android.util.SparseArray<>();
        this.EZpvd.setTag(this);
    }

    public final <T extends android.view.View> T EZpvd(int i) {
        T t = (T) this.gEmmrt.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.EZpvd.findViewById(i);
        this.gEmmrt.put(i, t2);
        return t2;
    }

    public final C55043xcW EZpvd(int i, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) EZpvd(i);
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public final C55043xcW AEQbTJ(int i, android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = (android.widget.ImageView) EZpvd(i);
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        return this;
    }

    public final C55043xcW OLrzqt(int i, int i2) {
        android.widget.TextView textView = (android.widget.TextView) EZpvd(i);
        if (textView != null) {
            textView.setTextColor(i2);
        }
        return this;
    }

    public final C55043xcW OLrzqt(int i, boolean z) {
        android.view.View viewEZpvd = EZpvd(i);
        if (viewEZpvd != null) {
            viewEZpvd.setVisibility(z ? 0 : 8);
        }
        return this;
    }

    public final C55043xcW KWHzl(int i, boolean z) {
        KeyEvent.Callback callbackEZpvd = EZpvd(i);
        Intrinsics.copydefault(callbackEZpvd, "");
        ((android.widget.Checkable) callbackEZpvd).setChecked(z);
        return this;
    }

    public final C55043xcW AEQbTJ(int i, View.OnClickListener onClickListener) {
        android.view.View viewEZpvd = EZpvd(i);
        if (viewEZpvd != null) {
            viewEZpvd.setOnClickListener(onClickListener);
        }
        return this;
    }

    /* JADX INFO: renamed from: o.xcW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C55043xcW KWHzl(@NotNull android.content.Context context, android.view.View view, android.view.ViewGroup viewGroup, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "");
            if (view == null) {
                android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(i, viewGroup, false);
                Intrinsics.copydefault(viewInflate);
                C55043xcW c55043xcW = new C55043xcW(context, viewInflate, i2);
                c55043xcW.AEQbTJ(i);
                return c55043xcW;
            }
            java.lang.Object tag = view.getTag();
            Intrinsics.copydefault(tag, "");
            C55043xcW c55043xcW2 = (C55043xcW) tag;
            c55043xcW2.copydefault = i2;
            return c55043xcW2;
        }
    }
}
