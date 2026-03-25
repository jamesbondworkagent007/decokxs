package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ImageItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.ImageListItemView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC42074rFj;
import o.AbstractC43310rmq;
import o.AbstractC43864rxN;
import o.AbstractC43868rxR;
import o.C33047mpA;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C42156rIk;
import o.C42179rJg;
import o.C43312rms;
import o.C43316rmw;
import o.C43662rtX;
import o.C52761wXj;
import o.C55297xhL;
import o.C55298xhM;
import o.C56444yFp;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.rAX;
import o.rGL;
import o.rIM;
import o.rQR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageListItemView extends FrameLayout {
    public final AbstractC43868rxR EZpvd;
    public ViewStatus KWHzl;
    public final C43316rmw OLrzqt;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIAlignment.Stretch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageListItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageListItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: com.okinc.ok_kyc_core.presentation.views.ImageListItemView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ImageListItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageListItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        this.OLrzqt = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C43662rtX.TaskDescription.AxsJAYsNCnLh, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43868rxR) viewDataBindingInflate;
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final ImageListAppModel imageListAppModel = uIComponentAppModel instanceof ImageListAppModel ? (ImageListAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((Object) rax.OLrzqt(), (Object) (imageListAppModel != null ? imageListAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            this.OLrzqt.register(ImageItem.class, new Activity());
            OLrzqt();
            if (imageListAppModel != null && Intrinsics.EZpvd(imageListAppModel.isHidden(), Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rMF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ImageListItemView.EZpvd(imageListAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((Object) rax2.OLrzqt(), (Object) (imageListAppModel != null ? imageListAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((Object) rax3.OLrzqt(), (Object) (imageListAppModel != null ? imageListAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit EZpvd(ImageListAppModel imageListAppModel, ImageListItemView imageListItemView, C42156rIk c42156rIk) {
        List<String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listCopydefault), imageListAppModel != null ? imageListAppModel.getId() : null) && imageListItemView.getVisibility() == 8) {
                imageListItemView.setVisibility(0);
                if (imageListAppModel != null) {
                    imageListAppModel.setHidden(Boolean.FALSE);
                }
            }
        }
        List<String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listKWHzl), imageListAppModel != null ? imageListAppModel.getId() : null) && imageListItemView.getVisibility() == 0) {
                imageListItemView.setVisibility(8);
                if (imageListAppModel != null) {
                    imageListAppModel.setHidden(Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        if ((uIComponentAppModel instanceof ImageListAppModel ? (ImageListAppModel) uIComponentAppModel : null) != null) {
            ImageListAppModel imageListAppModel = (ImageListAppModel) uIComponentAppModel;
            if (imageListAppModel.getItems() != null) {
                UIAlignment align = imageListAppModel.getAlign();
                int i = align == null ? -1 : TaskDescription.KWHzl[align.ordinal()];
                if (i == 1) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                } else if (i == 2) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 8388611;
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388611;
                    this.EZpvd.EZpvd.addItemDecoration(C33047mpA.AEQbTJ(imageListAppModel.getItems().size(), C55298xhM.dp2px$default(6.0f, null, 1, null)));
                }
                this.EZpvd.EZpvd.setLayoutParams(layoutParams);
                RecyclerView recyclerView = this.EZpvd.EZpvd;
                Iterator<T> it = imageListAppModel.getItems().iterator();
                while (it.hasNext()) {
                    ((ImageItem) it.next()).setAdaptiveMode(imageListAppModel.getAdaptiveMode());
                }
                recyclerView.setLayoutManager(C33047mpA.KWHzl(recyclerView.getContext(), imageListAppModel.getItems().size()));
                recyclerView.setAdapter(this.OLrzqt);
                this.OLrzqt.setItems(imageListAppModel.getItems());
            }
        }
    }

    public final void OLrzqt() {
        this.OLrzqt.notifyDataSetChanged();
    }

    public final class Activity extends AbstractC43310rmq<ImageItem, AbstractC43864rxN> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.accept;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43864rxN> c43312rms, @NotNull ImageItem imageItem) {
            int iDp2px$default;
            int iDp2px$default2;
            String strKWHzl;
            Drawable drawableKWHzl;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(imageItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, imageItem);
            ViewGroup.LayoutParams layoutParams = ((AbstractC43864rxN) c43312rms.OLrzqt()).OLrzqt.getLayoutParams();
            String adaptiveMode = imageItem.getAdaptiveMode();
            ImageAdaptiveMode imageAdaptiveMode = ImageAdaptiveMode.LARGE;
            if (Intrinsics.EZpvd((Object) adaptiveMode, (Object) imageAdaptiveMode.getMode())) {
                layoutParams.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(imageItem.getImageWidth()), null, 1, null);
                layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(imageItem.getImageHeight()), null, 1, null);
                ((AbstractC43864rxN) c43312rms.OLrzqt()).copydefault.setTextSize(12.0f);
                iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
                iDp2px$default2 = C55298xhM.dp2px$default(8.0f, null, 1, null);
            } else if (Intrinsics.EZpvd((Object) adaptiveMode, (Object) ImageAdaptiveMode.SMALL.getMode())) {
                layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(imageItem.getImageHeight()), null, 1, null);
                ((AbstractC43864rxN) c43312rms.OLrzqt()).copydefault.setTextSize(10.0f);
                iDp2px$default = C55298xhM.dp2px$default(6.0f, null, 1, null);
                iDp2px$default2 = C55298xhM.dp2px$default(6.0f, null, 1, null);
            } else {
                ((AbstractC43864rxN) c43312rms.OLrzqt()).copydefault.setTextSize(10.0f);
                iDp2px$default = C55298xhM.dp2px$default(6.0f, null, 1, null);
                iDp2px$default2 = C55298xhM.dp2px$default(6.0f, null, 1, null);
            }
            ((AbstractC43864rxN) c43312rms.OLrzqt()).KWHzl.setPaddingRelative(iDp2px$default2, iDp2px$default2, iDp2px$default2, iDp2px$default2);
            ImageListItemView imageListItemView = ImageListItemView.this;
            String imageName = imageItem.getImageName();
            if (imageName == null) {
                imageName = "";
            }
            Integer numEZpvd = imageListItemView.EZpvd(imageName);
            if (numEZpvd != null) {
                ((AbstractC43864rxN) c43312rms.OLrzqt()).OLrzqt.setImageResource(numEZpvd.intValue());
            } else {
                ImageListItemView imageListItemView2 = ImageListItemView.this;
                if (C33129mqd.OLrzqt((CharSequence) imageItem.getUrl())) {
                    if (C33492mxV.OLrzqt()) {
                        strKWHzl = C55297xhL.KWHzl(imageItem.getUrlDark(), "lfit", layoutParams.height, layoutParams.width);
                        if (strKWHzl == null) {
                            strKWHzl = imageItem.getUrlDark();
                        }
                    } else {
                        strKWHzl = C55297xhL.KWHzl(imageItem.getUrl(), "lfit", layoutParams.height, layoutParams.width);
                        if (strKWHzl == null) {
                            strKWHzl = imageItem.getUrl();
                        }
                    }
                    Glide.AEQbTJ(imageListItemView2.getContext()).EZpvd(strKWHzl).KWHzl(C43662rtX.Activity.UeEOUB).copydefault(C43662rtX.Activity.UeEOUB).EZpvd(((AbstractC43864rxN) c43312rms.OLrzqt()).OLrzqt);
                }
            }
            ((AbstractC43864rxN) c43312rms.OLrzqt()).copydefault.setText(imageItem.getText());
            ImageView imageView = ((AbstractC43864rxN) c43312rms.OLrzqt()).EZpvd;
            ImageListItemView imageListItemView3 = ImageListItemView.this;
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(0, -iDp2px$default, 0, 0);
            String adaptiveMode2 = imageItem.getAdaptiveMode();
            if (Intrinsics.EZpvd((Object) adaptiveMode2, (Object) imageAdaptiveMode.getMode())) {
                ((ViewGroup.MarginLayoutParams) layoutParams3).width = C55298xhM.dp2px$default(24.0f, null, 1, null);
                ((ViewGroup.MarginLayoutParams) layoutParams3).height = C55298xhM.dp2px$default(24.0f, null, 1, null);
            } else if (Intrinsics.EZpvd((Object) adaptiveMode2, (Object) ImageAdaptiveMode.SMALL.getMode())) {
                ((ViewGroup.MarginLayoutParams) layoutParams3).width = C55298xhM.dp2px$default(20.0f, null, 1, null);
                ((ViewGroup.MarginLayoutParams) layoutParams3).height = C55298xhM.dp2px$default(20.0f, null, 1, null);
            }
            imageView.setLayoutParams(layoutParams3);
            String icon = imageItem.getIcon();
            Integer numKWHzl = imageListItemView3.KWHzl(icon != null ? icon : "");
            if (numKWHzl == null || (drawableKWHzl = C33070mpX.KWHzl(numKWHzl.intValue())) == null) {
                return;
            }
            String adaptiveMode3 = imageItem.getAdaptiveMode();
            if (Intrinsics.EZpvd((Object) adaptiveMode3, (Object) imageAdaptiveMode.getMode())) {
                DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.finishInit));
            } else if (Intrinsics.EZpvd((Object) adaptiveMode3, (Object) ImageAdaptiveMode.SMALL.getMode())) {
                DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
            }
            imageView.setImageDrawable(drawableKWHzl);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CARD {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CARD[] $VALUES;
        private final int imageId;
        private final String imageName;
        public static final CARD IDCARD_GOOD = new CARD("IDCARD_GOOD", 0, "idCardGood", C43662rtX.Activity.DAIeex);
        public static final CARD IDCARD_CROPPED = new CARD("IDCARD_CROPPED", 1, "idCardCropped", C43662rtX.Activity.flVtFt);
        public static final CARD IDCARD_GLARE = new CARD("IDCARD_GLARE", 2, "idCardGlare", C43662rtX.Activity.iZzfmt);
        public static final CARD IDCARD_BLURRY = new CARD("IDCARD_BLURRY", 3, "idCardBlurry", C43662rtX.Activity.fvQaOB);
        public static final CARD CN_IDCARD_GOOD = new CARD("CN_IDCARD_GOOD", 4, "cnIdCardGood", C43662rtX.Activity.RlQdEF);
        public static final CARD CN_IDCARD_CROPPED = new CARD("CN_IDCARD_CROPPED", 5, "cnIdCardCropped", C43662rtX.Activity.iRxXKY);
        public static final CARD CN_IDCARD_GLARE = new CARD("CN_IDCARD_GLARE", 6, "cnIdCardGlare", C43662rtX.Activity.AxsJAYaxsJAY);
        public static final CARD CN_IDCARD_BLURRY = new CARD("CN_IDCARD_BLURRY", 7, "cnIdCardBlurry", C43662rtX.Activity.gGvvIC);
        public static final CARD DRIVERLICENSE_GOOD = new CARD("DRIVERLICENSE_GOOD", 8, "driverLicenseGood", C43662rtX.Activity.AxsJAYsNCnLh);
        public static final CARD DRIVERLICENSE_CROPPED = new CARD("DRIVERLICENSE_CROPPED", 9, "driverLicenseCropped", C43662rtX.Activity.gasjUx);
        public static final CARD DRIVERLICENSE_GLARE = new CARD("DRIVERLICENSE_GLARE", 10, "driverLicenseGlare", C43662rtX.Activity.hUfVAv);
        public static final CARD DRIVERLICENSE_BLURRY = new CARD("DRIVERLICENSE_BLURRY", 11, "driverLicenseBlurry", C43662rtX.Activity.fZBcTu);
        public static final CARD PASSPORT_GOOD = new CARD("PASSPORT_GOOD", 12, "passportGood", C43662rtX.Activity.accept);
        public static final CARD PASSPORT_CROPPED = new CARD("PASSPORT_CROPPED", 13, "passportCropped", C43662rtX.Activity.gkJEwt);
        public static final CARD PASSPORT_GLARE = new CARD("PASSPORT_GLARE", 14, "passportGlare", C43662rtX.Activity.QKudOq);
        public static final CARD PASSPORT_BLURRY = new CARD("PASSPORT_BLURRY", 15, "passportBlurry", C43662rtX.Activity.giSNqX);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CARD[] $values() {
            return new CARD[]{IDCARD_GOOD, IDCARD_CROPPED, IDCARD_GLARE, IDCARD_BLURRY, CN_IDCARD_GOOD, CN_IDCARD_CROPPED, CN_IDCARD_GLARE, CN_IDCARD_BLURRY, DRIVERLICENSE_GOOD, DRIVERLICENSE_CROPPED, DRIVERLICENSE_GLARE, DRIVERLICENSE_BLURRY, PASSPORT_GOOD, PASSPORT_CROPPED, PASSPORT_GLARE, PASSPORT_BLURRY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CARD> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageName() {
            return this.imageName;
        }

        private CARD(String str, @IdRes int i, String str2, int i2) {
            this.imageName = str2;
            this.imageId = i2;
        }

        static {
            CARD[] cardArr$values = $values();
            $VALUES = cardArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cardArr$values);
        }

        public static CARD valueOf(String str) {
            return (CARD) Enum.valueOf(CARD.class, str);
        }

        public static CARD[] values() {
            return (CARD[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageAdaptiveMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImageAdaptiveMode[] $VALUES;
        public static final ImageAdaptiveMode LARGE = new ImageAdaptiveMode("LARGE", 0, "large");
        public static final ImageAdaptiveMode SMALL = new ImageAdaptiveMode("SMALL", 1, "small");
        private final String mode;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImageAdaptiveMode[] $values() {
            return new ImageAdaptiveMode[]{LARGE, SMALL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImageAdaptiveMode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMode() {
            return this.mode;
        }

        private ImageAdaptiveMode(String str, int i, String str2) {
            this.mode = str2;
        }

        static {
            ImageAdaptiveMode[] imageAdaptiveModeArr$values = $values();
            $VALUES = imageAdaptiveModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(imageAdaptiveModeArr$values);
        }

        public static ImageAdaptiveMode valueOf(String str) {
            return (ImageAdaptiveMode) Enum.valueOf(ImageAdaptiveMode.class, str);
        }

        public static ImageAdaptiveMode[] values() {
            return (ImageAdaptiveMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageIcon {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImageIcon[] $VALUES;
        private final String iconName;
        private final int imageId;
        public static final ImageIcon TICK = new ImageIcon("TICK", 0, "tick", C52761wXj.TaskDescription.fdt);
        public static final ImageIcon CROSS = new ImageIcon("CROSS", 1, "cross", C52761wXj.TaskDescription.apAOXX);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImageIcon[] $values() {
            return new ImageIcon[]{TICK, CROSS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImageIcon> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIconName() {
            return this.iconName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageId() {
            return this.imageId;
        }

        private ImageIcon(String str, @IdRes int i, String str2, int i2) {
            this.iconName = str2;
            this.imageId = i2;
        }

        static {
            ImageIcon[] imageIconArr$values = $values();
            $VALUES = imageIconArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(imageIconArr$values);
        }

        public static ImageIcon valueOf(String str) {
            return (ImageIcon) Enum.valueOf(ImageIcon.class, str);
        }

        public static ImageIcon[] values() {
            return (ImageIcon[]) $VALUES.clone();
        }
    }

    public final Integer KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (ImageIcon imageIcon : ImageIcon.values()) {
            if (Intrinsics.EZpvd((Object) imageIcon.getIconName(), (Object) str)) {
                return Integer.valueOf(imageIcon.getImageId());
            }
        }
        return null;
    }

    public final Integer EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (CARD card : CARD.values()) {
            if (Intrinsics.EZpvd((Object) card.getImageName(), (Object) str)) {
                return Integer.valueOf(card.getImageId());
            }
        }
        return null;
    }
}
