package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMD extends ConstraintLayout {
    public ViewStatus KWHzl;
    public HyperlinkAppModel OLrzqt;
    public final AbstractC43863rxM copydefault;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Leading.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UIAlignment.Center.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMD(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DAIeex, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43863rxM) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMD(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DAIeex, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43863rxM) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DAIeex, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43863rxM) viewDataBindingInflate;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final HyperlinkAppModel hyperlinkAppModel = uIComponentAppModel instanceof HyperlinkAppModel ? (HyperlinkAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (hyperlinkAppModel != null ? hyperlinkAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            setVisibility((hyperlinkAppModel != null ? Intrinsics.EZpvd(hyperlinkAppModel.isHidden(), java.lang.Boolean.TRUE) : false) ^ true ? 0 : 8);
            rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rMG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rMD.EZpvd(hyperlinkAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (hyperlinkAppModel != null ? hyperlinkAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (hyperlinkAppModel != null ? hyperlinkAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit EZpvd(HyperlinkAppModel hyperlinkAppModel, rMD rmd, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), hyperlinkAppModel != null ? hyperlinkAppModel.getId() : null) && rmd.getVisibility() == 8) {
                rmd.setVisibility(0);
                if (hyperlinkAppModel != null) {
                    hyperlinkAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), hyperlinkAppModel != null ? hyperlinkAppModel.getId() : null) && rmd.getVisibility() == 0) {
                rmd.setVisibility(8);
                if (hyperlinkAppModel != null) {
                    hyperlinkAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        HyperlinkAppModel hyperlinkAppModel = uIComponentAppModel instanceof HyperlinkAppModel ? (HyperlinkAppModel) uIComponentAppModel : null;
        if (hyperlinkAppModel != null) {
            this.OLrzqt = (HyperlinkAppModel) uIComponentAppModel;
            this.copydefault.OLrzqt.setText(hyperlinkAppModel.getText());
            C55390xiz c55390xiz = this.copydefault.OLrzqt;
            c55390xiz.setOnClickListener(new ActionBar(c55390xiz, 1000L, this, fragmentActivity));
            UIAlignment align = hyperlinkAppModel.getAlign();
            if (align != null) {
                ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                int i = Application.KWHzl[align.ordinal()];
                if (i == 1) {
                    layoutParams2.startToStart = 0;
                    layoutParams2.topToTop = 0;
                    layoutParams2.bottomToBottom = 0;
                    layoutParams2.endToEnd = -1;
                    return;
                }
                if (i == 2) {
                    layoutParams2.endToEnd = 0;
                    layoutParams2.topToTop = 0;
                    layoutParams2.bottomToBottom = 0;
                    layoutParams2.startToStart = -1;
                    return;
                }
                if (i == 3) {
                    layoutParams2.startToStart = 0;
                    layoutParams2.endToEnd = 0;
                    layoutParams2.topToTop = 0;
                    layoutParams2.bottomToBottom = 0;
                    return;
                }
                layoutParams2.startToStart = 0;
                layoutParams2.topToTop = 0;
                layoutParams2.endToEnd = -1;
                layoutParams2.bottomToBottom = -1;
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rMD KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ FragmentActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, rMD rmd, FragmentActivity fragmentActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = rmd;
            this.copydefault = fragmentActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                HyperlinkAppModel hyperlinkAppModel = this.KWHzl.OLrzqt;
                android.net.Uri uri = null;
                if (hyperlinkAppModel == null) {
                    Intrinsics.gEmmrt("");
                    hyperlinkAppModel = null;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) hyperlinkAppModel.getDeeplink())) {
                    C42463rTu c42463rTu = C42463rTu.KWHzl;
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.lang.String deeplink = hyperlinkAppModel.getDeeplink();
                    Intrinsics.copydefault((java.lang.Object) deeplink);
                    c42463rTu.EZpvd(context, deeplink, "hyperlink");
                    return;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) hyperlinkAppModel.getUri())) {
                    java.lang.String relativeUriType = hyperlinkAppModel.getRelativeUriType();
                    if (Intrinsics.EZpvd((java.lang.Object) relativeUriType, (java.lang.Object) "cdn")) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setAction("android.intent.action.VIEW");
                        android.net.Uri uri2 = android.net.Uri.parse(C43386roM.EZpvd.EZpvd() + hyperlinkAppModel.getUri());
                        Intrinsics.checkNotNullExpressionValue(uri2, "");
                        intent.setData(uri2);
                        try {
                            this.copydefault.startActivity(intent);
                            return;
                        } catch (java.lang.Exception e) {
                            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
                            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
                            pUU.copydefault("ProcessingFragment", stackTraceString);
                            return;
                        }
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) relativeUriType, (java.lang.Object) "externalUrl")) {
                        this.KWHzl.copydefault.OLrzqt.copydefault(true);
                        java.lang.String uri3 = hyperlinkAppModel.getUri();
                        if (uri3 != null) {
                            uri = android.net.Uri.parse(uri3);
                            Intrinsics.checkNotNullExpressionValue(uri, "");
                        }
                        try {
                            this.copydefault.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
                            return;
                        } catch (java.lang.Exception e2) {
                            java.lang.String stackTraceString2 = android.util.Log.getStackTraceString(e2);
                            Intrinsics.checkNotNullExpressionValue(stackTraceString2, "");
                            pUU.copydefault("ProcessingFragment", stackTraceString2);
                            return;
                        }
                    }
                    java.lang.String uri4 = hyperlinkAppModel.getUri();
                    Intrinsics.copydefault((java.lang.Object) uri4);
                    WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.copydefault, BundleKt.bundleOf(C56390yDp.OLrzqt("url", uri4)), null, 4, null);
                }
            }
        }
    }
}
