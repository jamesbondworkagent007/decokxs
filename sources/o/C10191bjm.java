package o;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10191bjm extends RecyclerView.ViewHolder {
    public final AbstractC16988euM EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10191bjm(@NotNull AbstractC16988euM abstractC16988euM) {
        super(abstractC16988euM.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16988euM, "");
        this.EZpvd = abstractC16988euM;
    }

    public final void EZpvd(@NotNull final BaseItem.Application application, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, final long j, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd.EZpvd.setText(application.AYXKKw());
        this.EZpvd.KWHzl.setText(application.KWHzl());
        if (application.gEmmrt()) {
            this.EZpvd.AEQbTJ.setVisibility(0);
        } else {
            this.EZpvd.AEQbTJ.setVisibility(8);
        }
        if (application.AEQbTJ() != -1) {
            this.EZpvd.KWHzl.setMaxLines(application.AEQbTJ());
            this.EZpvd.KWHzl.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) application.copydefault())) {
            this.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.bjl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C10191bjm.OLrzqt(this.AEQbTJ, application, view);
                }
            });
        }
        this.EZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.bjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10191bjm.KWHzl(application, fragmentManager, this, j, view);
            }
        });
    }

    public static final void OLrzqt(C10191bjm c10191bjm, BaseItem.Application application, android.view.View view) {
        C14320djI c14320djI = C14320djI.OLrzqt;
        android.content.Context context = c10191bjm.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String strCopydefault = application.copydefault();
        C14320djI.openHistoryWebPageWithShare$default(c14320djI, context, strCopydefault == null ? "" : strCopydefault, C33129mqd.gEmmrt(application.OLrzqt()), null, 8, null);
    }

    public static final void KWHzl(final BaseItem.Application application, androidx.fragment.app.FragmentManager fragmentManager, final C10191bjm c10191bjm, final long j, android.view.View view) {
        if (application.gEmmrt()) {
            C21027grx.copydefault.AEQbTJ(application.AhwBna(), fragmentManager, new Function0() { // from class: o.bjj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C10191bjm.copydefault(this.OLrzqt, j, application);
                }
            });
        }
    }

    public static final Unit copydefault(C10191bjm c10191bjm, long j, BaseItem.Application application) {
        C10186bjh c10186bjh = C10186bjh.KWHzl;
        android.content.Context context = c10191bjm.EZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c10186bjh.KWHzl(context, j, application.EZpvd(), application.OLrzqt());
        return Unit.INSTANCE;
    }
}
