package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.okinc.business.dexui.main.limitorder.orderdetail.widget.LimitExecutionHistoryItemBinder$1;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMP extends AbstractC25436iwg<hMR, C21612hFv> {
    public final hMC OLrzqt;

    public hMP() {
        super(LimitExecutionHistoryItemBinder$1.INSTANCE);
        this.OLrzqt = new hMC();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21612hFv> c25435iwf, @NotNull hMR hmr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(hmr, "");
        C21612hFv c21612hFv = (C21612hFv) c25435iwf.EZpvd();
        java.lang.String str = pTA.format$default(new Date(C33129mqd.valueOf(hmr.copydefault())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        final android.content.Context context = c21612hFv.getRoot().getContext();
        int iAEQbTJ = this.OLrzqt.AEQbTJ(hmr.KWHzl());
        if (iAEQbTJ == -1) {
            AppCompatTextView appCompatTextView = c21612hFv.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
        } else {
            c21612hFv.KWHzl.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str + " " + context.getString(iAEQbTJ), new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.hMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hMP.OLrzqt(context, (java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{hmr.AEQbTJ()}, 0, null, false, new Function1() { // from class: o.hMQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hMP.KWHzl(context, (java.util.List) obj);
                }
            }, 14, null));
            AppCompatTextView appCompatTextView2 = c21612hFv.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) hmr.OLrzqt())) {
            android.widget.FrameLayout frameLayout = c21612hFv.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = c21612hFv.EZpvd;
            frameLayout2.setOnClickListener(new Application(frameLayout2, 1000L, c21612hFv, hmr));
            return;
        }
        android.widget.FrameLayout frameLayout3 = c21612hFv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        frameLayout3.setVisibility(8);
    }

    public static final Unit OLrzqt(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C21612hFv KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ hMR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C21612hFv c21612hFv, hMR hmr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c21612hFv;
            this.copydefault = hmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.OLrzqt.getContext();
                if (context != null) {
                    C25352ivB.OLrzqt(context, this.copydefault.OLrzqt());
                }
            }
        }
    }
}
