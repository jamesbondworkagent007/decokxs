package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25405iwB extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25405iwB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25405iwB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25405iwB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    private final void KWHzl() {
        setTextSize(2, 12.0f);
        setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.aappFQ));
    }

    public final void setCountDownState(@NotNull DefiBridgeOrderInfo defiBridgeOrderInfo) {
        Intrinsics.checkNotNullParameter(defiBridgeOrderInfo, "");
        java.lang.String status = defiBridgeOrderInfo.getStatus();
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) "-4")) {
            kotlin.Pair<java.lang.Boolean, java.lang.String> outOfFormatTime = defiBridgeOrderInfo.getOutOfFormatTime();
            if (!outOfFormatTime.getFirst().booleanValue()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.aappFQ));
            java.lang.String second = outOfFormatTime.getSecond();
            setText(((java.lang.Object) second) + " " + C33070mpX.AYXKKw(C23274hvD.Fragment.gdLjtZ));
            return;
        }
        setVisibility(8);
    }
}
