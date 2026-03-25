package o;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15909eZu extends RecyclerView.ViewHolder {
    public final Function1<BaseItem.Application, Unit> EZpvd;
    public final AbstractC16988euM KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<BaseItem.Application, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC16988euM EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.assets.detail.biz.BaseItem$Application, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15909eZu(@NotNull AbstractC16988euM abstractC16988euM, @NotNull Function1<? super BaseItem.Application, Unit> function1) {
        super(abstractC16988euM.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16988euM, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = abstractC16988euM;
        this.EZpvd = function1;
    }

    public final void copydefault(@NotNull BaseItem.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl.EZpvd.setText(application.AYXKKw());
        this.KWHzl.KWHzl.setText(application.KWHzl());
        if (application.gEmmrt()) {
            this.KWHzl.AEQbTJ.setVisibility(0);
        } else {
            this.KWHzl.AEQbTJ.setVisibility(8);
        }
        if (application.AEQbTJ() != -1) {
            this.KWHzl.KWHzl.setMaxLines(application.AEQbTJ());
            this.KWHzl.KWHzl.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) application.copydefault())) {
            android.widget.TextView textView = this.KWHzl.KWHzl;
            textView.setOnClickListener(new ActionBar(textView, 1000L, this, application));
        }
        android.widget.ImageView imageView = this.KWHzl.AEQbTJ;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this, application));
    }

    /* JADX INFO: renamed from: o.eZu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C15909eZu AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ BaseItem.Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C15909eZu c15909eZu, BaseItem.Application application) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c15909eZu;
            this.copydefault = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C14320djI c14320djI = C14320djI.OLrzqt;
                android.content.Context context = this.AEQbTJ.EZpvd().getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strCopydefault = this.copydefault.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                C14320djI.openHistoryWebPageWithShare$default(c14320djI, context, strCopydefault, C33129mqd.gEmmrt(this.copydefault.OLrzqt()), null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.eZu$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C15909eZu EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ BaseItem.Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C15909eZu c15909eZu, BaseItem.Application application) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c15909eZu;
            this.copydefault = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ().invoke(this.copydefault);
            }
        }
    }
}
