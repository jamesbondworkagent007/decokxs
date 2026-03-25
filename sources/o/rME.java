package o;

import android.content.pm.PackageManager;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rME extends android.widget.FrameLayout {
    public final AbstractC43860rxJ OLrzqt;
    public ViewStatus copydefault;

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

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.copydefault = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rME(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QKudOq, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43860rxJ) viewDataBindingInflate;
        this.copydefault = ViewStatus.Form;
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final IllustrationAppModel illustrationAppModel = uIComponentAppModel instanceof IllustrationAppModel ? (IllustrationAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (illustrationAppModel != null ? illustrationAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (illustrationAppModel != null && Intrinsics.EZpvd(illustrationAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rMH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rME.copydefault(illustrationAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (illustrationAppModel != null ? illustrationAppModel.getId() : null))) {
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
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (illustrationAppModel != null ? illustrationAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit copydefault(IllustrationAppModel illustrationAppModel, rME rme, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), illustrationAppModel != null ? illustrationAppModel.getId() : null) && rme.getVisibility() == 8) {
                rme.setVisibility(0);
                if (illustrationAppModel != null) {
                    illustrationAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), illustrationAppModel != null ? illustrationAppModel.getId() : null) && rme.getVisibility() == 0) {
                rme.setVisibility(8);
                if (illustrationAppModel != null) {
                    illustrationAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
        android.graphics.drawable.Drawable drawable;
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        IllustrationAppModel illustrationAppModel = uIComponentAppModel instanceof IllustrationAppModel ? (IllustrationAppModel) uIComponentAppModel : null;
        if (illustrationAppModel != null) {
            android.widget.LinearLayout linearLayout = this.OLrzqt.copydefault;
            UIAlignment align = illustrationAppModel.getAlign();
            int i = align == null ? -1 : TaskDescription.EZpvd[align.ordinal()];
            linearLayout.setGravity(i != 1 ? i != 2 ? 1 : 8388613 : 8388611);
            IllustrationAppModel illustrationAppModel2 = (IllustrationAppModel) uIComponentAppModel;
            java.lang.Integer numEZpvd = rQW.EZpvd(illustrationAppModel2.getName(), illustrationAppModel2.getType());
            if (numEZpvd != null) {
                int iIntValue = numEZpvd.intValue();
                this.OLrzqt.copydefault.setVisibility(0);
                if (Intrinsics.EZpvd((java.lang.Object) getResources().getResourceTypeName(iIntValue), (java.lang.Object) "drawable")) {
                    this.OLrzqt.AEQbTJ.setVisibility(0);
                    this.OLrzqt.EZpvd.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    java.lang.String width = illustrationAppModel.getWidth();
                    if (width != null) {
                        layoutParams.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(width), null, 1, null);
                    }
                    java.lang.String height = illustrationAppModel.getHeight();
                    if (height != null) {
                        layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(height), null, 1, null);
                    }
                    this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams);
                    this.OLrzqt.AEQbTJ.setImageResource(iIntValue);
                } else {
                    this.OLrzqt.AEQbTJ.setVisibility(8);
                    this.OLrzqt.EZpvd.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = this.OLrzqt.EZpvd.getLayoutParams();
                    layoutParams2.width = C55298xhM.dp2px$default(200.0f, null, 1, null);
                    layoutParams2.height = C55298xhM.dp2px$default(200.0f, null, 1, null);
                    java.lang.String width2 = illustrationAppModel.getWidth();
                    if (width2 != null) {
                        layoutParams2.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(width2), null, 1, null);
                    }
                    java.lang.String height2 = illustrationAppModel.getHeight();
                    if (height2 != null) {
                        layoutParams2.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(height2), null, 1, null);
                    }
                    this.OLrzqt.EZpvd.setLayoutParams(layoutParams2);
                    LottieAnimationView lottieAnimationView = this.OLrzqt.EZpvd;
                    lottieAnimationView.setAnimation(iIntValue);
                    if (!Intrinsics.EZpvd((java.lang.Object) illustrationAppModel2.getName(), (java.lang.Object) "waiting") && !Intrinsics.EZpvd((java.lang.Object) illustrationAppModel2.getName(), (java.lang.Object) "processing") && !Intrinsics.EZpvd((java.lang.Object) illustrationAppModel2.getName(), (java.lang.Object) "reviewInProgress") && !Intrinsics.EZpvd((java.lang.Object) illustrationAppModel2.getName(), (java.lang.Object) "inProgress")) {
                        lottieAnimationView.setRepeatCount(0);
                    } else {
                        lottieAnimationView.setRepeatCount(-1);
                    }
                    lottieAnimationView.playAnimation();
                }
            }
            if (numEZpvd == null && C33129mqd.OLrzqt((java.lang.CharSequence) illustrationAppModel.getImageUrl())) {
                this.OLrzqt.copydefault.setVisibility(0);
                this.OLrzqt.AEQbTJ.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.OLrzqt.AEQbTJ.getLayoutParams();
                layoutParams3.width = C55298xhM.dp2px$default(350.0f, null, 1, null);
                layoutParams3.height = C55298xhM.dp2px$default(200.0f, null, 1, null);
                java.lang.String width3 = illustrationAppModel.getWidth();
                if (width3 != null) {
                    layoutParams3.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(width3), null, 1, null);
                }
                java.lang.String height3 = illustrationAppModel.getHeight();
                if (height3 != null) {
                    layoutParams3.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(height3), null, 1, null);
                }
                this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams3);
                if (C33492mxV.OLrzqt()) {
                    strKWHzl = C55297xhL.KWHzl(illustrationAppModel.getBlackImageUrl(), "lfit", layoutParams3.height, layoutParams3.width);
                    if (strKWHzl == null) {
                        strKWHzl = illustrationAppModel.getBlackImageUrl();
                    }
                } else {
                    strKWHzl = C55297xhL.KWHzl(illustrationAppModel.getImageUrl(), "lfit", layoutParams3.height, layoutParams3.width);
                    if (strKWHzl == null) {
                        strKWHzl = illustrationAppModel.getImageUrl();
                    }
                }
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(getContext()).EZpvd(C42462rTt.AEQbTJ.OLrzqt(strKWHzl));
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                C5335Nt c5335NtAEQbTJ = c5335NtEZpvd.AEQbTJ(new C42516rVt(context3, C43662rtX.Activity.UeEOUB, layoutParams3.width, layoutParams3.height));
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                c5335NtAEQbTJ.OLrzqt((android.graphics.drawable.Drawable) new C42516rVt(context4, C43662rtX.Activity.UeEOUB, layoutParams3.width, layoutParams3.height)).EZpvd(this.OLrzqt.AEQbTJ);
                return;
            }
            if (numEZpvd == null && C33129mqd.OLrzqt((java.lang.CharSequence) illustrationAppModel.getAndroidAppIconId())) {
                try {
                    android.content.pm.PackageManager packageManager = getContext().getPackageManager();
                    java.lang.String androidAppIconId = illustrationAppModel.getAndroidAppIconId();
                    Intrinsics.copydefault((java.lang.Object) androidAppIconId);
                    drawable = packageManager.getApplicationIcon(androidAppIconId);
                } catch (PackageManager.NameNotFoundException unused) {
                    drawable = ContextCompat.getDrawable(getContext(), android.R.drawable.sym_def_app_icon);
                } catch (java.lang.Exception unused2) {
                    drawable = null;
                }
                if (drawable != null) {
                    this.OLrzqt.copydefault.setVisibility(0);
                    this.OLrzqt.AEQbTJ.setVisibility(0);
                    this.OLrzqt.EZpvd.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams4 = this.OLrzqt.AEQbTJ.getLayoutParams();
                    layoutParams4.width = -2;
                    layoutParams4.height = -2;
                    java.lang.String width4 = illustrationAppModel.getWidth();
                    if (width4 != null) {
                        layoutParams4.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(width4), null, 1, null);
                    }
                    java.lang.String height4 = illustrationAppModel.getHeight();
                    if (height4 != null) {
                        layoutParams4.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(height4), null, 1, null);
                    }
                    this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams4);
                    this.OLrzqt.AEQbTJ.setImageDrawable(drawable);
                }
            }
        }
    }
}
