package o;

import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import o.rMK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMK extends android.widget.FrameLayout {
    public final C43316rmw AEQbTJ;
    public ViewStatus OLrzqt;
    public final AbstractC43872rxV copydefault;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.OLrzqt = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.rMK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rMK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        this.AEQbTJ = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.OqFWZa, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43872rxV) viewDataBindingInflate;
    }

    public final void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final FragmentActivity fragmentActivity, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.List<rAX<java.util.List<FieldDisplay>>> listDjSkpj = rgl.djSkpj();
            if (listDjSkpj != null) {
                java.util.Iterator<T> it = listDjSkpj.iterator();
                while (it.hasNext()) {
                    final rAX rax = (rAX) it.next();
                    final InfoFormEntryAppModel infoFormEntryAppModel = uIComponentAppModel instanceof InfoFormEntryAppModel ? (InfoFormEntryAppModel) uIComponentAppModel : null;
                    if (infoFormEntryAppModel != null && Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) infoFormEntryAppModel.getId())) {
                        rax.setValue(infoFormEntryAppModel.getFieldValue());
                        if (Intrinsics.EZpvd(infoFormEntryAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            setVisibility(8);
                            rax.EZpvd(false);
                            rax.setValue(null);
                        } else {
                            setVisibility(0);
                            java.lang.Boolean required = infoFormEntryAppModel.getRequired();
                            rax.EZpvd(required != null ? required.booleanValue() : false);
                            rax.setValue(infoFormEntryAppModel.getFieldValue());
                        }
                        AlertCardAppModel alertCard = infoFormEntryAppModel.getAlertCard();
                        if (alertCard != null) {
                            this.copydefault.EZpvd.setVisibility(0);
                            alertCard.setBottomMargin(java.lang.Float.valueOf(8.0f));
                            this.copydefault.EZpvd.copydefault(fragmentActivity, abstractC42074rFj, alertCard);
                        }
                        rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rMM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rMK.KWHzl(infoFormEntryAppModel, this, rax, (C42156rIk) obj);
                            }
                        }));
                        rgl.fZBcTu().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rMJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rMK.AEQbTJ(infoFormEntryAppModel, rax, this, (java.util.ArrayList) obj);
                            }
                        }));
                        this.AEQbTJ.register(FieldDisplay.class, new Activity(this, new Function1() { // from class: o.rML
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rMK.AEQbTJ(abstractC42074rFj, infoFormEntryAppModel, fragmentActivity, (FieldDisplay) obj);
                            }
                        }));
                        C52794wYp c52794wYp = this.copydefault.copydefault;
                        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, infoFormEntryAppModel, abstractC42074rFj));
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit KWHzl(InfoFormEntryAppModel infoFormEntryAppModel, rMK rmk, rAX rax, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(infoFormEntryAppModel.getId()) && rmk.getVisibility() == 8) {
            rmk.setVisibility(0);
            infoFormEntryAppModel.setHidden(java.lang.Boolean.FALSE);
            rax.setValue(null);
            infoFormEntryAppModel.setFieldValue(new java.util.ArrayList<>());
            rmk.copydefault.AEQbTJ.removeAllViews();
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(infoFormEntryAppModel.getId()) && rmk.getVisibility() == 0) {
            rmk.setVisibility(8);
            infoFormEntryAppModel.setHidden(java.lang.Boolean.TRUE);
            rax.setValue(null);
            infoFormEntryAppModel.setFieldValue(new java.util.ArrayList<>());
            rmk.copydefault.AEQbTJ.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InfoFormEntryAppModel infoFormEntryAppModel, rAX rax, rMK rmk, java.util.ArrayList arrayList) {
        infoFormEntryAppModel.setFieldValue(arrayList);
        rax.setValue(infoFormEntryAppModel.getFieldValue());
        C52794wYp c52794wYp = rmk.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        rmk.KWHzl(infoFormEntryAppModel, c52794wYp);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final AbstractC42074rFj abstractC42074rFj, final InfoFormEntryAppModel infoFormEntryAppModel, FragmentActivity fragmentActivity, final FieldDisplay fieldDisplay) {
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl;
        java.lang.String api2;
        Intrinsics.checkNotNullParameter(fieldDisplay, "");
        C43693ruB.OLrzqt("KYC_PEP_InfoForm_Detail_Click");
        rGL rgl = (rGL) abstractC42074rFj;
        CallApiModel details = infoFormEntryAppModel.getDetails();
        java.lang.String str = (details == null || (api2 = details.getApi()) == null) ? "" : api2;
        java.lang.String id = fieldDisplay.getId();
        java.lang.String str2 = id == null ? "" : id;
        CallApiModel details2 = infoFormEntryAppModel.getDetails();
        if (details2 == null || (mapKWHzl = details2.getExtraParams()) == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        rgl.EZpvd(str, str2, mapKWHzl, fragmentActivity, new Function1() { // from class: o.rMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rMK.EZpvd(infoFormEntryAppModel, fieldDisplay, abstractC42074rFj, (java.util.HashMap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InfoFormEntryAppModel infoFormEntryAppModel, FieldDisplay fieldDisplay, AbstractC42074rFj abstractC42074rFj, java.util.HashMap map) {
        java.lang.String pageTitle;
        java.util.List<UIComponentAppModel> items;
        java.util.Set setOqFWZa;
        java.util.Set setOqFWZa2;
        java.lang.Boolean boolIsHidden;
        Value value;
        java.lang.Boolean boolIsHidden2;
        java.lang.Object next;
        AlertCard alertCard;
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList<UIComponentAppModel> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = infoFormEntryAppModel.getTemplate().getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(C43747rvC.KWHzl((UIComponentAppModel) it.next()));
        }
        ValueAndName valueAndName = (ValueAndName) map.get("alertCard");
        AlertCardAppModel appModel = (valueAndName == null || (alertCard = valueAndName.getAlertCard()) == null) ? null : alertCard.toAppModel();
        map.remove("alertCard");
        for (UIComponentAppModel uIComponentAppModel : arrayList) {
            for (Map.Entry entry : map.entrySet()) {
                if (Intrinsics.EZpvd(uIComponentAppModel.getId(), entry.getKey())) {
                    ValueAndName valueAndName2 = (ValueAndName) entry.getValue();
                    uIComponentAppModel.setValue(valueAndName2 != null ? valueAndName2.getValue() : null);
                    if (uIComponentAppModel instanceof InputSelectAppModel) {
                        InputSelectAppModel inputSelectAppModel = (InputSelectAppModel) uIComponentAppModel;
                        ValueAndName valueAndName3 = (ValueAndName) entry.getValue();
                        inputSelectAppModel.setValueName(valueAndName3 != null ? valueAndName3.getValueName() : null);
                        java.lang.Boolean boolIsControlOtherViewShow = inputSelectAppModel.isControlOtherViewShow();
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        if (Intrinsics.EZpvd(boolIsControlOtherViewShow, bool) && !Intrinsics.EZpvd(inputSelectAppModel.isHidden(), bool)) {
                            java.util.List<Value> values = inputSelectAppModel.getChoices().getValues();
                            if (values != null) {
                                java.util.Iterator<T> it2 = values.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) ((Value) next).getValue(), (java.lang.Object) inputSelectAppModel.getValue())) {
                                        break;
                                    }
                                }
                                value = (Value) next;
                            } else {
                                value = null;
                            }
                            if (value != null) {
                                java.util.List<java.lang.String> hiddenItemIds = value.getHiddenItemIds();
                                if (hiddenItemIds == null) {
                                    hiddenItemIds = yDY.AhwBna();
                                }
                                java.util.Set setOqFWZa3 = CollectionsKt___CollectionsKt.OqFWZa(hiddenItemIds);
                                java.util.List<java.lang.String> displayedItemIds = value.getDisplayedItemIds();
                                if (displayedItemIds == null) {
                                    displayedItemIds = yDY.AhwBna();
                                }
                                java.util.Set setOqFWZa4 = CollectionsKt___CollectionsKt.OqFWZa(displayedItemIds);
                                for (UIComponentAppModel uIComponentAppModel2 : arrayList) {
                                    java.lang.String id = uIComponentAppModel2.getId();
                                    if (setOqFWZa3.contains(id)) {
                                        boolIsHidden2 = java.lang.Boolean.TRUE;
                                    } else {
                                        boolIsHidden2 = setOqFWZa4.contains(id) ? java.lang.Boolean.FALSE : uIComponentAppModel2.isHidden();
                                    }
                                    uIComponentAppModel2.setHidden(boolIsHidden2);
                                }
                            }
                        }
                    }
                    if (uIComponentAppModel instanceof InputDateRangeAppModel) {
                        InputDateRangeAppModel inputDateRangeAppModel = (InputDateRangeAppModel) uIComponentAppModel;
                        ValueAndName valueAndName4 = (ValueAndName) entry.getValue();
                        java.lang.String start = valueAndName4 != null ? valueAndName4.getStart() : null;
                        ValueAndName valueAndName5 = (ValueAndName) entry.getValue();
                        java.lang.String end = valueAndName5 != null ? valueAndName5.getEnd() : null;
                        ValueAndName valueAndName6 = (ValueAndName) entry.getValue();
                        inputDateRangeAppModel.setFieldValue(new InputDateRangeText(start, end, valueAndName6 != null ? valueAndName6.getToPresent() : null));
                    }
                    if (uIComponentAppModel instanceof CheckboxAppModel) {
                        CheckboxAppModel checkboxAppModel = (CheckboxAppModel) uIComponentAppModel;
                        if (!Intrinsics.EZpvd(checkboxAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            if (java.lang.Boolean.parseBoolean(checkboxAppModel.getValue())) {
                                java.util.List<java.lang.String> checkHiddenItemIds = checkboxAppModel.getCheckHiddenItemIds();
                                if (checkHiddenItemIds == null) {
                                    checkHiddenItemIds = yDY.AhwBna();
                                }
                                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(checkHiddenItemIds);
                            } else {
                                java.util.List<java.lang.String> uncheckHiddenItemIds = checkboxAppModel.getUncheckHiddenItemIds();
                                if (uncheckHiddenItemIds == null) {
                                    uncheckHiddenItemIds = yDY.AhwBna();
                                }
                                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(uncheckHiddenItemIds);
                            }
                            if (java.lang.Boolean.parseBoolean(checkboxAppModel.getValue())) {
                                java.util.List<java.lang.String> uncheckHiddenItemIds2 = checkboxAppModel.getUncheckHiddenItemIds();
                                if (uncheckHiddenItemIds2 == null) {
                                    uncheckHiddenItemIds2 = yDY.AhwBna();
                                }
                                setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(uncheckHiddenItemIds2);
                            } else {
                                java.util.List<java.lang.String> checkHiddenItemIds2 = checkboxAppModel.getCheckHiddenItemIds();
                                if (checkHiddenItemIds2 == null) {
                                    checkHiddenItemIds2 = yDY.AhwBna();
                                }
                                setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(checkHiddenItemIds2);
                            }
                            for (UIComponentAppModel uIComponentAppModel3 : arrayList) {
                                java.lang.String id2 = uIComponentAppModel3.getId();
                                if (setOqFWZa.contains(id2)) {
                                    boolIsHidden = java.lang.Boolean.TRUE;
                                } else {
                                    boolIsHidden = setOqFWZa2.contains(id2) ? java.lang.Boolean.FALSE : uIComponentAppModel3.isHidden();
                                }
                                uIComponentAppModel3.setHidden(boolIsHidden);
                            }
                        }
                    }
                }
            }
        }
        CtaAppModel cta = infoFormEntryAppModel.getTemplate().getCta();
        CtaAppModel ctaAppModelCopy$default = cta != null ? CtaAppModel.copy$default(cta, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        CtaAppModel cta2 = infoFormEntryAppModel.getTemplate().getCta();
        if (cta2 != null && (items = cta2.getItems()) != null) {
            java.util.Iterator<T> it3 = items.iterator();
            while (it3.hasNext()) {
                UIComponentAppModel uIComponentAppModelKWHzl = C43747rvC.KWHzl((UIComponentAppModel) it3.next());
                if (uIComponentAppModelKWHzl instanceof CTAButtonAppModel) {
                    ((CTAButtonAppModel) uIComponentAppModelKWHzl).setInfoFormId(fieldDisplay.getId());
                }
                arrayList2.add(uIComponentAppModelKWHzl);
            }
        }
        if (ctaAppModelCopy$default != null) {
            ctaAppModelCopy$default.setItems(arrayList2);
        }
        FormAppModel template = infoFormEntryAppModel.getTemplate();
        FormAppModel formAppModelCopy = template.copy((536870908 & 1) != 0 ? template.items : null, (536870908 & 2) != 0 ? template.cta : null, (536870908 & 4) != 0 ? template.stepper : null, (536870908 & 8) != 0 ? template.titleWithSteps : null, (536870908 & 16) != 0 ? template.pageTitle : null, (536870908 & 32) != 0 ? template.quit : null, (536870908 & 64) != 0 ? template.onExit : null, (536870908 & 128) != 0 ? template.align : null, (536870908 & 256) != 0 ? template.canGoBack : null, (536870908 & 512) != 0 ? template.canClose : null, (536870908 & 1024) != 0 ? template.skipCta : null, (536870908 & 2048) != 0 ? template.faqUrl : null, (536870908 & 4096) != 0 ? template.richTitle : null, (536870908 & 8192) != 0 ? template.richSubtitle : null, (536870908 & 16384) != 0 ? template.notifications : null, (536870908 & 32768) != 0 ? template.id : null, (536870908 & 65536) != 0 ? template.required : null, (536870908 & 131072) != 0 ? template.version : null, (536870908 & 262144) != 0 ? template.value : null, (536870908 & 524288) != 0 ? template.title : null, (536870908 & 1048576) != 0 ? template.subtitle : null, (536870908 & 2097152) != 0 ? template.pageStack : null, (536870908 & 4194304) != 0 ? template.dynamicTitle : null, (536870908 & 8388608) != 0 ? template.deleteButton : null, (536870908 & 16777216) != 0 ? template.amplitudeParams : null, (536870908 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? template.rightButton : null, (536870908 & 67108864) != 0 ? template.alertCard : null, (536870908 & 134217728) != 0 ? template.isFormRefresh : null, (536870908 & 268435456) != 0 ? template.pageStackType : null);
        formAppModelCopy.setCanGoBack(java.lang.Boolean.TRUE);
        formAppModelCopy.setItems(arrayList);
        formAppModelCopy.setCta(ctaAppModelCopy$default);
        CTAButtonAppModel deleteButton = formAppModelCopy.getDeleteButton();
        if (deleteButton != null) {
            deleteButton.setInfoFormId(fieldDisplay.getId());
        }
        DynamicTitle dynamicTitle = formAppModelCopy.getDynamicTitle();
        if (dynamicTitle == null || (pageTitle = dynamicTitle.getUpdate()) == null) {
            pageTitle = formAppModelCopy.getPageTitle();
        }
        formAppModelCopy.setPageTitle(pageTitle);
        formAppModelCopy.setAlertCard(appModel);
        ((rGL) abstractC42074rFj).KWHzl(formAppModelCopy);
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC42074rFj KWHzl;
        public final /* synthetic */ InfoFormEntryAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, InfoFormEntryAppModel infoFormEntryAppModel, AbstractC42074rFj abstractC42074rFj) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = infoFormEntryAppModel;
            this.KWHzl = abstractC42074rFj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String pageTitle;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C43693ruB.OLrzqt("KYC_PEP_InfoForm_Add_More_Click");
                FormAppModel template = this.copydefault.getTemplate();
                FormAppModel formAppModelCopy = template.copy((536870908 & 1) != 0 ? template.items : null, (536870908 & 2) != 0 ? template.cta : null, (536870908 & 4) != 0 ? template.stepper : null, (536870908 & 8) != 0 ? template.titleWithSteps : null, (536870908 & 16) != 0 ? template.pageTitle : null, (536870908 & 32) != 0 ? template.quit : null, (536870908 & 64) != 0 ? template.onExit : null, (536870908 & 128) != 0 ? template.align : null, (536870908 & 256) != 0 ? template.canGoBack : null, (536870908 & 512) != 0 ? template.canClose : null, (536870908 & 1024) != 0 ? template.skipCta : null, (536870908 & 2048) != 0 ? template.faqUrl : null, (536870908 & 4096) != 0 ? template.richTitle : null, (536870908 & 8192) != 0 ? template.richSubtitle : null, (536870908 & 16384) != 0 ? template.notifications : null, (536870908 & 32768) != 0 ? template.id : null, (536870908 & 65536) != 0 ? template.required : null, (536870908 & 131072) != 0 ? template.version : null, (536870908 & 262144) != 0 ? template.value : null, (536870908 & 524288) != 0 ? template.title : null, (536870908 & 1048576) != 0 ? template.subtitle : null, (536870908 & 2097152) != 0 ? template.pageStack : null, (536870908 & 4194304) != 0 ? template.dynamicTitle : null, (536870908 & 8388608) != 0 ? template.deleteButton : null, (536870908 & 16777216) != 0 ? template.amplitudeParams : null, (536870908 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? template.rightButton : null, (536870908 & 67108864) != 0 ? template.alertCard : null, (536870908 & 134217728) != 0 ? template.isFormRefresh : null, (536870908 & 268435456) != 0 ? template.pageStackType : null);
                DynamicTitle dynamicTitle = formAppModelCopy.getDynamicTitle();
                if (dynamicTitle == null || (pageTitle = dynamicTitle.getCreate()) == null) {
                    pageTitle = formAppModelCopy.getPageTitle();
                }
                formAppModelCopy.setPageTitle(pageTitle);
                formAppModelCopy.setDeleteButton(null);
                formAppModelCopy.setCanGoBack(java.lang.Boolean.TRUE);
                formAppModelCopy.setCanClose(java.lang.Boolean.FALSE);
                ((rGL) this.KWHzl).KWHzl(formAppModelCopy);
            }
        }
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.OLrzqt, uIComponentAppModel.getBottomMargin()));
        InfoFormEntryAppModel infoFormEntryAppModel = uIComponentAppModel instanceof InfoFormEntryAppModel ? (InfoFormEntryAppModel) uIComponentAppModel : null;
        if (infoFormEntryAppModel != null) {
            this.copydefault.KWHzl.setVisibility(0);
            this.copydefault.KWHzl.setContentDescription(infoFormEntryAppModel.getId());
            this.copydefault.copydefault.setText(infoFormEntryAppModel.getButtonText());
            this.copydefault.copydefault.setContentDescription(infoFormEntryAppModel.getId() + "_button");
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onLocationChanged);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
            }
            this.copydefault.copydefault.setCompoundDrawables(drawableKWHzl, null, null, null);
            this.copydefault.OLrzqt.setText(infoFormEntryAppModel.getTitle());
            C31695mAm c31695mAm = this.copydefault.AEQbTJ;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context3 = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c31695mAm.addItemDecoration(new TaskDescription(context3));
            c31695mAm.setAdapter(this.AEQbTJ);
            C52794wYp c52794wYp = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            KWHzl(infoFormEntryAppModel, c52794wYp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(InfoFormEntryAppModel infoFormEntryAppModel, C52794wYp c52794wYp) {
        java.lang.Long max;
        Rule rule = infoFormEntryAppModel.getRule();
        if (rule == null || (max = rule.getMax()) == null) {
            c52794wYp.setEnabled(true);
            if (infoFormEntryAppModel.getFieldValue().size() > 0) {
                c52794wYp.setOKDSType(257);
                c52794wYp.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.Dmq));
            } else {
                c52794wYp.setOKDSType(260);
                c52794wYp.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.htlTjW));
            }
        } else if (infoFormEntryAppModel.getFieldValue().size() >= max.longValue()) {
            c52794wYp.setOKDSType(257);
            c52794wYp.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.Dmq));
            c52794wYp.setEnabled(false);
        }
        this.AEQbTJ.setItems(infoFormEntryAppModel.getFieldValue());
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final class Activity extends AbstractC43310rmq<FieldDisplay, AbstractC43870rxT> {
        public final Function1<FieldDisplay, Unit> EZpvd;
        public final /* synthetic */ rMK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.DCJXGO;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull rMK rmk, Function1<? super FieldDisplay, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = rmk;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43870rxT> c43312rms, @NotNull final FieldDisplay fieldDisplay) {
            android.graphics.drawable.Drawable drawableKWHzl;
            android.graphics.drawable.Drawable drawableKWHzl2;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(fieldDisplay, "");
            super.onBindViewHolder((C43312rms) c43312rms, fieldDisplay);
            if (Intrinsics.EZpvd((java.lang.Object) fieldDisplay.getStatus(), (java.lang.Object) "4")) {
                ((AbstractC43870rxT) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
                ((AbstractC43870rxT) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.AEQbTJ);
            } else {
                ((AbstractC43870rxT) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
                ((AbstractC43870rxT) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.AhwBna);
            }
            java.lang.String status = fieldDisplay.getStatus();
            if (status != null) {
                switch (status.hashCode()) {
                    case 48:
                        if (status.equals("0")) {
                            ((AbstractC43870rxT) c43312rms.OLrzqt()).AEQbTJ.setImageResource(C52761wXj.TaskDescription.gqESXP);
                        }
                        break;
                    case 50:
                        if (status.equals("2")) {
                        }
                        break;
                    case 51:
                        if (status.equals("3") && (drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.shErWi)) != null) {
                            DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
                            ((AbstractC43870rxT) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableKWHzl);
                        }
                        break;
                    case 52:
                        if (status.equals("4") && (drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP)) != null) {
                            DrawableCompat.setTint(drawableKWHzl2, C33070mpX.copydefault(C52761wXj.Activity.finishInit));
                            ((AbstractC43870rxT) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableKWHzl2);
                        }
                        break;
                }
            }
            ((AbstractC43870rxT) c43312rms.OLrzqt()).EZpvd.removeAllViews();
            java.lang.String title = fieldDisplay.getTitle();
            if (title != null) {
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(this.copydefault.getContext()), C43662rtX.TaskDescription.DarRvM, ((AbstractC43870rxT) c43312rms.OLrzqt()).EZpvd, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43871rxU abstractC43871rxU = (AbstractC43871rxU) viewDataBindingInflate;
                abstractC43871rxU.EZpvd.setText(title);
                ((AbstractC43870rxT) c43312rms.OLrzqt()).EZpvd.addView(abstractC43871rxU.getRoot());
            }
            java.util.ArrayList<java.lang.String> contentList = fieldDisplay.getContentList();
            if (contentList != null) {
                rMK rmk = this.copydefault;
                for (java.lang.String str : contentList) {
                    ViewDataBinding viewDataBindingInflate2 = DataBindingUtil.inflate(android.view.LayoutInflater.from(rmk.getContext()), C43662rtX.TaskDescription.DarRvM, ((AbstractC43870rxT) c43312rms.OLrzqt()).EZpvd, false);
                    Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate2, "");
                    AbstractC43871rxU abstractC43871rxU2 = (AbstractC43871rxU) viewDataBindingInflate2;
                    abstractC43871rxU2.EZpvd.setTextAppearance(rmk.getContext(), C52761wXj.LoaderManager.AYXKKw);
                    abstractC43871rxU2.EZpvd.setTextSize(12.0f);
                    abstractC43871rxU2.EZpvd.setPadding(0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, 0);
                    abstractC43871rxU2.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
                    abstractC43871rxU2.EZpvd.setText(str);
                    ((AbstractC43870rxT) c43312rms.OLrzqt()).EZpvd.addView(abstractC43871rxU2.getRoot());
                }
            }
            ((AbstractC43870rxT) c43312rms.OLrzqt()).copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rMR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rMK.Activity.EZpvd(fieldDisplay, this, view);
                }
            });
        }

        public static final void EZpvd(FieldDisplay fieldDisplay, Activity activity, android.view.View view) {
            if (Intrinsics.EZpvd((java.lang.Object) fieldDisplay.getStatus(), (java.lang.Object) "4")) {
                return;
            }
            activity.EZpvd.invoke(fieldDisplay);
        }
    }

    public static final class TaskDescription extends RecyclerView.ItemDecoration {
        public final android.content.Context KWHzl;

        public TaskDescription(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.KWHzl.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.RJOkX);
            }
        }
    }
}
