package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mPr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32105mPr extends android.widget.FrameLayout {
    public Function0<Unit> AEQbTJ;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> KWHzl;
    public AbstractC32044mNk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClose(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirm(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32105mPr(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32105mPr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32105mPr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C31976mKx.Application.QKVWgx, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC32044mNk) viewDataBindingInflate;
        copydefault();
    }

    public final void copydefault() {
        this.copydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.mPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C32105mPr.copydefault(this.OLrzqt, view);
            }
        });
        this.copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.mPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C32105mPr.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void copydefault(C32105mPr c32105mPr, android.view.View view) {
        Function0<Unit> function0 = c32105mPr.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(C32105mPr c32105mPr, android.view.View view) {
        android.text.Editable text = c32105mPr.copydefault.OLrzqt.getText();
        if (text == null || text.length() == 0) {
            C33134mqi.AEQbTJ("domain is empty");
            c32105mPr.copydefault.OLrzqt.requestFocus();
            return;
        }
        android.text.Editable text2 = c32105mPr.copydefault.copydefault.getText();
        if (text2 == null || text2.length() == 0) {
            C33134mqi.AEQbTJ("ip is empty");
            c32105mPr.copydefault.copydefault.requestFocus();
            return;
        }
        java.lang.String strEZpvd = mNB.Companion.EZpvd(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c32105mPr.copydefault.OLrzqt.getText().toString()).toString());
        if (strEZpvd == null || strEZpvd.length() == 0) {
            C33134mqi.AEQbTJ("invalid domain");
            c32105mPr.copydefault.OLrzqt.requestFocus();
        } else {
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c32105mPr.KWHzl;
            if (function2 != null) {
                function2.invoke(strEZpvd, StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c32105mPr.copydefault.copydefault.getText().toString()).toString());
            }
        }
    }

    public final void setType(int i) {
        java.lang.String strCopydefault;
        if (i == 1) {
            strCopydefault = C43368rnv.copydefault.copydefault("doh_debug_http_", true);
        } else if (i == 2) {
            strCopydefault = C43368rnv.copydefault.copydefault("doh_debug_v5_", true);
        } else if (i == 3) {
            strCopydefault = C43368rnv.copydefault.copydefault("doh_debug_http_", false);
        } else if (i == 4) {
            strCopydefault = C43368rnv.copydefault.copydefault("doh_debug_v5_", false);
        } else {
            strCopydefault = i != 5 ? "" : C43368rnv.copydefault.copydefault("doh_debug_dexpri_", true);
        }
        java.lang.String string = SPUtils.getString(C43368rnv.copydefault.EZpvd(strCopydefault), "");
        this.copydefault.OLrzqt.setText(strCopydefault);
        this.copydefault.copydefault.setText(string);
    }
}
