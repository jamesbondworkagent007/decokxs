package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19254fxn extends android.widget.LinearLayout {
    public C17168exh OLrzqt;
    public Function1<? super SearchCompletionUiModel, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemClick(@NotNull Function1<? super SearchCompletionUiModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19254fxn(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19254fxn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19254fxn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        this.OLrzqt = C17168exh.EZpvd(android.view.LayoutInflater.from(context), this, true);
    }

    public final void setItems(java.util.List<SearchCompletionUiModel> list) {
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            requestLayout();
        } else {
            setVisibility(0);
            copydefault(EZpvd(list));
        }
    }

    public final java.util.List<android.view.View> EZpvd(java.util.List<SearchCompletionUiModel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SearchCompletionUiModel searchCompletionUiModel = (SearchCompletionUiModel) obj;
            if (i != 0) {
                arrayList.add(EZpvd());
            }
            arrayList.add(EZpvd(searchCompletionUiModel));
            i++;
        }
        return arrayList;
    }

    public final AppCompatTextView EZpvd(SearchCompletionUiModel searchCompletionUiModel) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(searchCompletionUiModel.getText());
        appCompatTextView.setTextSize(C55298xhM.sp2pxFloat$default(14.0f, null, 1, null));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, searchCompletionUiModel));
        return appCompatTextView;
    }

    private final android.view.View EZpvd() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatImageView.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.ejfBZ));
        return appCompatImageView;
    }

    public final void copydefault(final java.util.List<? extends android.view.View> list) {
        final C55372xih c55372xih;
        C17168exh c17168exh = this.OLrzqt;
        if (c17168exh == null || (c55372xih = c17168exh.EZpvd) == null) {
            return;
        }
        c55372xih.setVerticalSpacing(C55298xhM.dp2px$default(4.0f, null, 1, null));
        c55372xih.setHorizontalSpacing(C55298xhM.dp2px$default(1.0f, null, 1, null));
        OLrzqt(c55372xih, list);
        c55372xih.KWHzl();
        c55372xih.setOnFirstTimeMeasureCallback(new Function1() { // from class: o.fxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19254fxn.KWHzl(this.AEQbTJ, c55372xih, list, ((java.lang.Integer) obj).intValue());
            }
        });
        c55372xih.setOnMeasureCallback(new Function1() { // from class: o.fxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19254fxn.EZpvd(this.AEQbTJ, c55372xih, list, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(C19254fxn c19254fxn, C55372xih c55372xih, java.util.List list, int i) {
        c19254fxn.OLrzqt(c55372xih, list);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19254fxn c19254fxn, C55372xih c55372xih, java.util.List list, int i) {
        c19254fxn.OLrzqt(c55372xih, list);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C55372xih c55372xih, java.util.List<? extends android.view.View> list) {
        c55372xih.removeAllViews();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c55372xih.addView((android.view.View) it.next());
        }
    }

    /* JADX INFO: renamed from: o.fxn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C19254fxn KWHzl;
        public final /* synthetic */ SearchCompletionUiModel OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19254fxn c19254fxn, SearchCompletionUiModel searchCompletionUiModel) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c19254fxn;
            this.OLrzqt = searchCompletionUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.copydefault;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }
}
