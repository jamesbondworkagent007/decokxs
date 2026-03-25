package o;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pPO extends CardView {
    public android.widget.ImageView AEQbTJ;
    public android.widget.TextView KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pPO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pPO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pPO(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        android.view.View viewInflate = android.view.View.inflate(getContext(), pKK.ActionBar.DbNXlk, this);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(pKK.StateListAnimator.isConnected);
        this.AEQbTJ = (android.widget.ImageView) viewInflate.findViewById(pKK.StateListAnimator.iwGUEr);
    }

    public final void setup(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.widget.TextView textView = this.KWHzl;
        android.widget.ImageView imageView = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
        android.widget.ImageView imageView2 = this.AEQbTJ;
        if (imageView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.pPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function1.invoke(str);
            }
        });
    }
}
