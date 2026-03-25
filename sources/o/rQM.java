package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_widget.Content;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rQM extends android.widget.FrameLayout {
    public ViewStatus EZpvd;
    public java.lang.String KWHzl;
    public final AbstractC44004rzv copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Leading.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UIAlignment.Center.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "";
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.ixgjPv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC44004rzv) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQM(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = "";
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.ixgjPv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC44004rzv) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "";
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.ixgjPv, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC44004rzv) viewDataBindingInflate;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        TextContentAppModel textContentAppModel = uIComponentAppModel instanceof TextContentAppModel ? (TextContentAppModel) uIComponentAppModel : null;
        if (!(abstractC42074rFj instanceof rGL)) {
            if (!(abstractC42074rFj instanceof C42179rJg)) {
                if (abstractC42074rFj instanceof rIM) {
                    java.util.Iterator<T> it = ((rIM) abstractC42074rFj).AubY().iterator();
                    while (it.hasNext()) {
                        rAX rax = (rAX) it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (textContentAppModel != null ? textContentAppModel.getId() : null))) {
                            rax.setValue(null);
                        }
                    }
                    return;
                }
                return;
            }
            java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
            while (it2.hasNext()) {
                rAX rax2 = (rAX) it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (textContentAppModel != null ? textContentAppModel.getId() : null))) {
                    rax2.setValue(null);
                }
            }
            return;
        }
        java.util.Iterator<T> it3 = ((rGL) abstractC42074rFj).dNCPSb().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (textContentAppModel != null ? textContentAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
        TextContentAppModel textContentAppModel = uIComponentAppModel instanceof TextContentAppModel ? (TextContentAppModel) uIComponentAppModel : null;
        if (textContentAppModel != null) {
            this.KWHzl = textContentAppModel.getId();
            Content content = this.copydefault.AEQbTJ;
            java.lang.String title = textContentAppModel.getTitle();
            java.lang.String label = textContentAppModel.getLabel();
            java.util.List<java.lang.String> content2 = textContentAppModel.getContent();
            content.setContent(title, label, (content2 == null || content2.isEmpty()) ? yDY.AhwBna() : textContentAppModel.getContent(), textContentAppModel.getRichContent(), EZpvd(textContentAppModel.getAlign()), this.EZpvd);
        }
    }

    public final Content.Alignment EZpvd(UIAlignment uIAlignment) {
        int i = uIAlignment == null ? -1 : Application.OLrzqt[uIAlignment.ordinal()];
        if (i == 1) {
            return Content.Alignment.LEFT;
        }
        if (i == 2) {
            return Content.Alignment.CENTER;
        }
        if (i == 3) {
            return Content.Alignment.RIGHT;
        }
        return Content.Alignment.LEFT;
    }
}
