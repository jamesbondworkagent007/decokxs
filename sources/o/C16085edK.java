package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16085edK extends ConstraintLayout {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final C55008xbo copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16085edK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        java.lang.String string;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        } else {
            getLayoutParams().height = -2;
            setLayoutParams(getLayoutParams());
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C13754dXa.TaskDescription.ixgjPv, (android.view.ViewGroup) this, true);
        if (viewInflate instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewInflate;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(C13754dXa.ActionBar.UNDaji);
        this.KWHzl = textView;
        this.copydefault = (C55008xbo) findViewById(C13754dXa.ActionBar.RidNCX);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C13754dXa.ActionBar.getCustomActions);
        this.AEQbTJ = imageView;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.KWHzl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C13754dXa.PendingIntent.AEQbTJ, -1);
        if (resourceId != -1) {
            string = context.getString(resourceId);
        } else {
            string = typedArrayObtainStyledAttributes.getString(C13754dXa.PendingIntent.AEQbTJ);
        }
        textView.setText(string);
        imageView.setVisibility(typedArrayObtainStyledAttributes.getInt(C13754dXa.PendingIntent.copydefault, 4));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16085edK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16085edK(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setTipClick(@NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.edL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function1.invoke(view);
            }
        });
    }

    public final void setHitText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setHintText(str);
    }

    public final void OLrzqt() {
        this.copydefault.setState(3);
    }

    public final void setChainIdTxt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setText(str);
    }

    public final void EZpvd() {
        this.copydefault.setState(0);
    }

    public final android.widget.EditText copydefault() {
        C54957xaq c54957xaqAEQbTJ;
        C55009xbp c55009xbpFIwbmz = this.copydefault.fIwbmz();
        if (c55009xbpFIwbmz == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) == null) {
            return null;
        }
        return c54957xaqAEQbTJ.AEQbTJ;
    }

    public final void copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            this.copydefault.values();
        } else {
            this.copydefault.setErrorText(str);
        }
    }
}
