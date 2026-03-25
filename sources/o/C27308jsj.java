package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27308jsj extends android.widget.LinearLayout {
    public AbstractC23889iNb KWHzl;
    public View.OnClickListener OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.OLrzqt = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27308jsj(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27308jsj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27308jsj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void EZpvd() {
        this.KWHzl = (AbstractC23889iNb) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.dIjzlO, this, true);
    }

    public final void setData(@NotNull final C25536iya c25536iya) {
        Intrinsics.checkNotNullParameter(c25536iya, "");
        AbstractC23889iNb abstractC23889iNb = this.KWHzl;
        if (abstractC23889iNb != null) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, abstractC23889iNb.EZpvd.AEQbTJ(), c25536iya.copydefault().getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
            abstractC23889iNb.EZpvd.EZpvd().setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(c25536iya.AEQbTJ()), C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", c25536iya.copydefault().getTokenSymbol()), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c25536iya.copydefault().getTokenSymbol()))));
            abstractC23889iNb.EZpvd.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            abstractC23889iNb.EZpvd.OLrzqt().setVisibility(c25536iya.KWHzl() ? 0 : 8);
            setOnClickListener(new View.OnClickListener() { // from class: o.jsi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27308jsj.setData$lambda$1$lambda$0(c25536iya, this, view);
                }
            });
        }
    }

    public static final void setData$lambda$1$lambda$0(C25536iya c25536iya, C27308jsj c27308jsj, android.view.View view) {
        View.OnClickListener onClickListener;
        if (!c25536iya.KWHzl() || (onClickListener = c27308jsj.OLrzqt) == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
