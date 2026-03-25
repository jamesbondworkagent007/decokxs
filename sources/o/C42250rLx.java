package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.CtaCardView$observe$1$3$1$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rLx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42250rLx extends android.widget.FrameLayout {
    public final C42519rVw AEQbTJ;
    public ViewStatus EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final AbstractC43887rxk OLrzqt;
    public rQO copydefault;

    /* JADX INFO: renamed from: o.rLx$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.rLx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42250rLx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42250rLx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.rLx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42250rLx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42250rLx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.finit, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43887rxk) viewDataBindingInflate;
        this.AEQbTJ = new C42519rVw(context, attributeSet, i);
        this.KWHzl = new LinkedHashMap();
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final CtaCardAppModel ctaCardAppModel = uIComponentAppModel instanceof CtaCardAppModel ? (CtaCardAppModel) uIComponentAppModel : null;
            if (ctaCardAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) ctaCardAppModel.getId())) {
                        rax.setValue(null);
                    }
                }
                rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rLy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42250rLx.AEQbTJ(ctaCardAppModel, this, (C42156rIk) obj);
                    }
                }));
                if (Intrinsics.EZpvd(ctaCardAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                } else {
                    setVisibility(0);
                }
                rgl.sSMYrx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rLz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42250rLx.EZpvd(ctaCardAppModel, this, lifecycleOwner, abstractC42074rFj, (java.util.Map) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            CtaCardAppModel ctaCardAppModel2 = uIComponentAppModel instanceof CtaCardAppModel ? (CtaCardAppModel) uIComponentAppModel : null;
            if (ctaCardAppModel2 != null) {
                java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) ctaCardAppModel2.getId())) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof rIM) {
            CtaCardAppModel ctaCardAppModel3 = uIComponentAppModel instanceof CtaCardAppModel ? (CtaCardAppModel) uIComponentAppModel : null;
            if (ctaCardAppModel3 != null) {
                java.util.Iterator<T> it3 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it3.hasNext()) {
                    rAX rax3 = (rAX) it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) ctaCardAppModel3.getId())) {
                        rax3.setValue(null);
                    }
                }
            }
        }
    }

    public static final Unit AEQbTJ(CtaCardAppModel ctaCardAppModel, C42250rLx c42250rLx, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(ctaCardAppModel.getId()) && c42250rLx.getVisibility() == 8) {
            c42250rLx.setVisibility(0);
            ctaCardAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(ctaCardAppModel.getId()) && c42250rLx.getVisibility() == 0) {
            c42250rLx.setVisibility(8);
            ctaCardAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.LinkedHashMap] */
    public static final Unit EZpvd(CtaCardAppModel ctaCardAppModel, C42250rLx c42250rLx, LifecycleOwner lifecycleOwner, AbstractC42074rFj abstractC42074rFj, java.util.Map map) {
        java.util.HashMap<java.lang.String, java.lang.String> params;
        java.lang.String str;
        GroupDynamic dynamic = ctaCardAppModel.getDynamic();
        if (dynamic != null && C33129mqd.OLrzqt((java.lang.CharSequence) dynamic.getUri()) && (params = dynamic.getParams()) != null && (!params.isEmpty())) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new LinkedHashMap();
            if (dynamic.getParams() != null) {
                for (java.lang.String str2 : dynamic.getParams().keySet()) {
                    java.lang.String str3 = "";
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    java.lang.String str4 = str2;
                    ((java.util.Map) objectRef.element).put(str4, "");
                    java.util.Iterator it = map.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.lang.String str5 = (java.lang.String) it.next();
                            kotlin.Pair pair = (kotlin.Pair) map.get(str5);
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) (pair != null ? (java.lang.String) pair.getFirst() : null)) && Intrinsics.EZpvd((java.lang.Object) dynamic.getParams().get(str4), (java.lang.Object) str5)) {
                                java.util.Map map2 = (java.util.Map) objectRef.element;
                                kotlin.Pair pair2 = (kotlin.Pair) map.get(str5);
                                if (pair2 != null && (str = (java.lang.String) pair2.getSecond()) != null) {
                                    str3 = str;
                                }
                                map2.put(str4, str3);
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry : ((java.util.Map) objectRef.element).entrySet()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.String str7 = (java.lang.String) entry.getValue();
                if (!c42250rLx.KWHzl.containsKey(str6) || !C59449zhJ.equals$default(c42250rLx.KWHzl.get(str6), str7, false, 2, null)) {
                    c42250rLx.KWHzl.clear();
                    for (Map.Entry entry2 : ((java.util.Map) objectRef.element).entrySet()) {
                        c42250rLx.KWHzl.put((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
                    }
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), null, new CtaCardView$observe$1$3$1$1(ctaCardAppModel, c42250rLx, abstractC42074rFj, dynamic, objectRef, lifecycleOwner, null), 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rLx$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ CTAButtonAppModel KWHzl;
        public final /* synthetic */ AbstractC42074rFj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = abstractC42074rFj;
            this.KWHzl = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AbstractC42074rFj abstractC42074rFj = this.OLrzqt;
                if (abstractC42074rFj == null || (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) == null) {
                    return;
                }
                mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(this.KWHzl, new DialogInformation("", false, null, 4, null))));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [212=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, @NotNull rQO rqo) {
        java.lang.String tag;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        android.widget.LinearLayout linearLayout3;
        java.util.List<android.view.View> listAEQbTJ;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.copydefault = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
        Unit unit = null;
        CtaCardAppModel ctaCardAppModel = uIComponentAppModel instanceof CtaCardAppModel ? (CtaCardAppModel) uIComponentAppModel : null;
        if (ctaCardAppModel != null) {
            this.OLrzqt.EZpvd.setContentDescription(ctaCardAppModel.getId());
            this.OLrzqt.EZpvd.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ctaCardAppModel.getTitle())) {
                this.OLrzqt.copydefault.setText(ctaCardAppModel.getTitle());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ctaCardAppModel.getTag())) {
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.call, this.OLrzqt.copydefault, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43959rzC abstractC43959rzC = (AbstractC43959rzC) viewDataBindingInflate;
                abstractC43959rzC.KWHzl.setText(ctaCardAppModel.getTag());
                this.OLrzqt.copydefault.setAttachingView(abstractC43959rzC.getRoot());
            }
            java.lang.String title = ctaCardAppModel.getTitle();
            if ((title == null || title.length() == 0) && ((tag = ctaCardAppModel.getTag()) == null || tag.length() == 0)) {
                C55258xgZ c55258xgZ = this.OLrzqt.copydefault;
                if (c55258xgZ != null) {
                    c55258xgZ.setVisibility(8);
                }
            } else {
                C55258xgZ c55258xgZ2 = this.OLrzqt.copydefault;
                if (c55258xgZ2 != null) {
                    c55258xgZ2.setVisibility(0);
                }
            }
            java.lang.String backgroundType = ctaCardAppModel.getBackgroundType();
            if (backgroundType != null) {
                switch (backgroundType.hashCode()) {
                    case -1106245566:
                        if (backgroundType.equals("outline")) {
                            this.OLrzqt.EZpvd.setBackgroundResource(C43662rtX.Activity.AhwBna);
                            java.lang.Integer numOLrzqt = rqr.OLrzqt(ctaCardAppModel.getBackgroundColor(), this.AEQbTJ);
                            if (numOLrzqt != null) {
                                int iIntValue = numOLrzqt.intValue();
                                android.graphics.drawable.Drawable background = this.OLrzqt.EZpvd.getBackground();
                                Intrinsics.copydefault(background, "");
                                ((GradientDrawable) background).setStroke(C55298xhM.dp2px$default(1.0f, null, 1, null), iIntValue);
                            }
                        } else {
                            pUU.copydefault("qjf", "Shouldn't reach here");
                        }
                        break;
                    case 3237038:
                        if (backgroundType.equals("info")) {
                            this.OLrzqt.EZpvd.setBackgroundResource(C43662rtX.Activity.copydefault);
                            java.lang.Integer numOLrzqt2 = rqr.OLrzqt(ctaCardAppModel.getBackgroundColor(), this.AEQbTJ);
                            if (numOLrzqt2 != null) {
                                int iIntValue2 = numOLrzqt2.intValue();
                                android.graphics.drawable.Drawable background2 = this.OLrzqt.EZpvd.getBackground();
                                Intrinsics.copydefault(background2, "");
                                ((GradientDrawable) background2).setColor(iIntValue2);
                            }
                            break;
                        }
                        break;
                    case 270940796:
                        if (backgroundType.equals("disabled")) {
                            this.OLrzqt.EZpvd.setBackgroundResource(C43662rtX.Activity.AEQbTJ);
                            break;
                        }
                        break;
                    case 1124446108:
                        if (backgroundType.equals("warning")) {
                            this.OLrzqt.EZpvd.setBackgroundResource(C43662rtX.Activity.EZpvd);
                            break;
                        }
                        break;
                }
            }
            java.lang.Float cornerRadius = ctaCardAppModel.getCornerRadius();
            if (cornerRadius != null) {
                float fFloatValue2 = cornerRadius.floatValue();
                android.graphics.drawable.Drawable background3 = this.OLrzqt.EZpvd.getBackground();
                if (background3 instanceof GradientDrawable) {
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    ((GradientDrawable) background3).setCornerRadius(C55298xhM.EZpvd(fFloatValue2, context3));
                } else {
                    java.lang.Integer numOLrzqt3 = rqr.OLrzqt(ctaCardAppModel.getBackgroundColor(), this.AEQbTJ);
                    int iIntValue3 = numOLrzqt3 != null ? numOLrzqt3.intValue() : background3 instanceof ColorDrawable ? ((ColorDrawable) background3).getColor() : ContextCompat.getColor(getContext(), C52761wXj.Activity.scanPackages);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(iIntValue3);
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    gradientDrawable.setCornerRadius(C55298xhM.EZpvd(fFloatValue2, context4));
                    this.OLrzqt.EZpvd.setBackground(gradientDrawable);
                }
            }
            android.widget.LinearLayout linearLayout6 = this.OLrzqt.EZpvd;
            java.lang.Float paddingLeft = ctaCardAppModel.getPaddingLeft();
            int iDp2px$default = paddingLeft != null ? C55298xhM.dp2px$default(paddingLeft.floatValue(), null, 1, null) : C55298xhM.dp2px$default(16.0f, null, 1, null);
            java.lang.Float paddingTop = ctaCardAppModel.getPaddingTop();
            int iDp2px$default2 = paddingTop != null ? C55298xhM.dp2px$default(paddingTop.floatValue(), null, 1, null) : C55298xhM.dp2px$default(16.0f, null, 1, null);
            java.lang.Float paddingRight = ctaCardAppModel.getPaddingRight();
            int iDp2px$default3 = paddingRight != null ? C55298xhM.dp2px$default(paddingRight.floatValue(), null, 1, null) : C55298xhM.dp2px$default(16.0f, null, 1, null);
            java.lang.Float paddingBottom = ctaCardAppModel.getPaddingBottom();
            linearLayout6.setPadding(iDp2px$default, iDp2px$default2, iDp2px$default3, paddingBottom != null ? C55298xhM.dp2px$default(paddingBottom.floatValue(), null, 1, null) : C55298xhM.dp2px$default(16.0f, null, 1, null));
            CtaCardAppModel ctaCardAppModel2 = (CtaCardAppModel) uIComponentAppModel;
            if (!ctaCardAppModel2.getContentList().isEmpty()) {
                AbstractC43887rxk abstractC43887rxk = this.OLrzqt;
                if (abstractC43887rxk != null && (linearLayout5 = abstractC43887rxk.EZpvd) != null) {
                    linearLayout5.setVisibility(0);
                }
                if (abstractC42074rFj == null || lifecycleOwner == null) {
                    listAEQbTJ = rqo.AEQbTJ(fragmentActivity, ctaCardAppModel2.getContentList(), ViewStatus.Card);
                } else {
                    if (abstractC42074rFj instanceof rGL) {
                        rGL.setUpFormWithAppModel$default((rGL) abstractC42074rFj, ctaCardAppModel2.getContentList(), null, 2, null);
                    }
                    ((UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(ctaCardAppModel2.getContentList())).setBottomMargin(java.lang.Float.valueOf(0.0f));
                    android.content.Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    listAEQbTJ = rqo.EZpvd(context5, ctaCardAppModel2.getContentList(), abstractC42074rFj, lifecycleOwner, ViewStatus.Card);
                }
                for (android.view.View view : listAEQbTJ) {
                    AbstractC43887rxk abstractC43887rxk2 = this.OLrzqt;
                    if (abstractC43887rxk2 != null && (linearLayout4 = abstractC43887rxk2.KWHzl) != null) {
                        linearLayout4.addView(view);
                    }
                }
            } else {
                AbstractC43887rxk abstractC43887rxk3 = this.OLrzqt;
                if (abstractC43887rxk3 != null && (linearLayout = abstractC43887rxk3.EZpvd) != null) {
                    linearLayout.setVisibility(8);
                }
            }
            CtaPopUp cta = ctaCardAppModel2.getCta();
            if (cta != null) {
                AbstractC43887rxk abstractC43887rxk4 = this.OLrzqt;
                if (abstractC43887rxk4 != null && (linearLayout3 = abstractC43887rxk4.OLrzqt) != null) {
                    linearLayout3.setVisibility(0);
                }
                AbstractC43887rxk abstractC43887rxk5 = this.OLrzqt;
                if (abstractC43887rxk5 != null && (c52794wYp2 = abstractC43887rxk5.AEQbTJ) != null) {
                    c52794wYp2.setContentDescription("compliance" + ctaCardAppModel2.getTitle() + "CtaCardPrimaryButton");
                    setCtaButton(c52794wYp2, cta.getPrimaryButton(), abstractC42074rFj);
                }
                AbstractC43887rxk abstractC43887rxk6 = this.OLrzqt;
                if (abstractC43887rxk6 != null && (c52794wYp = abstractC43887rxk6.valueOf) != null) {
                    c52794wYp.setContentDescription("compliance" + ctaCardAppModel2.getTitle() + "CtaCardSecondaryButton");
                    setCtaButton(c52794wYp, cta.getSecondaryButton(), abstractC42074rFj);
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            AbstractC43887rxk abstractC43887rxk7 = this.OLrzqt;
            if (abstractC43887rxk7 == null || (linearLayout2 = abstractC43887rxk7.OLrzqt) == null) {
                return;
            }
            linearLayout2.setVisibility(8);
        }
    }

    public final void setCtaButton(C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel, AbstractC42074rFj abstractC42074rFj) {
        rQR rqr;
        android.graphics.drawable.Drawable drawableKWHzl;
        int iCopydefault;
        if (cTAButtonAppModel != null) {
            c52794wYp.setVisibility(0);
            java.lang.String text = cTAButtonAppModel.getText();
            if (text == null) {
                text = "";
            }
            c52794wYp.setText(text);
            CtaIcon icon = cTAButtonAppModel.getIcon();
            if (icon != null && (drawableKWHzl = (rqr = rQR.AEQbTJ).KWHzl(icon.getName(), this.AEQbTJ)) != null) {
                android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl.mutate());
                Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                if (C33129mqd.djBIcL(icon.getWidth()) > 0.0f && C33129mqd.djBIcL(icon.getHeight()) > 0.0f) {
                    drawableWrap.setBounds(0, 0, C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getWidth()), null, 1, null), C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getHeight()), null, 1, null));
                } else {
                    drawableWrap.setBounds(0, 0, drawableWrap.getIntrinsicWidth(), drawableWrap.getIntrinsicHeight());
                }
                java.lang.Integer numCopydefault = rqr.copydefault(icon.getRenderColor(), this.AEQbTJ);
                if (numCopydefault != null) {
                    DrawableCompat.setTint(drawableWrap, numCopydefault.intValue());
                } else {
                    if (cTAButtonAppModel.getStyle() == ButtonStyle.Primary) {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
                    } else {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                    }
                    DrawableCompat.setTint(drawableWrap, iCopydefault);
                }
                CtaIcon icon2 = cTAButtonAppModel.getIcon();
                UIAlignment position = icon2 != null ? icon2.getPosition() : null;
                if (position != null && StateListAnimator.OLrzqt[position.ordinal()] == 1) {
                    c52794wYp.setCompoundDrawablesRelative(null, null, drawableWrap, null);
                } else {
                    c52794wYp.setCompoundDrawablesRelative(drawableWrap, null, null, null);
                }
            }
            java.lang.Boolean enabled = cTAButtonAppModel.getEnabled();
            c52794wYp.setEnabled(enabled != null ? enabled.booleanValue() : true);
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, abstractC42074rFj, cTAButtonAppModel));
            ButtonStyle style = cTAButtonAppModel.getStyle();
            int i = style == null ? -1 : StateListAnimator.EZpvd[style.ordinal()];
            if (i == 1) {
                c52794wYp.setOKDSType(257);
                return;
            } else if (i == 2) {
                c52794wYp.setOKDSType(260);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                c52794wYp.setOKDSType(258);
                return;
            }
        }
        c52794wYp.setVisibility(8);
    }
}
