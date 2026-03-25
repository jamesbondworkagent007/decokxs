package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.SelectCardItemView$observe$1$1$1$9$1;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C43662rtX;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rQE extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public final C42519rVw AhwBna;
    public boolean EZpvd;
    public AbstractC43984rzb OLrzqt;
    public boolean copydefault;
    public ViewStatus djBIcL;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rQE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rQE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.djBIcL = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.rQE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rQE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rQE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = ViewStatus.Form;
        this.AhwBna = new C42519rVw(context, attributeSet, i);
        this.EZpvd = true;
        this.OLrzqt = (AbstractC43984rzb) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QwvEab, this, true);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rQE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:147:0x0375 */
    /* JADX DEBUG: Type inference failed for r0v40. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r0v57. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r0v69. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v73. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r18v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r1v17. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v24. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r3v14. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r3v7. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [T] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r12v1, types: [T] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        rGL rgl;
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        SelectCardAppModel selectCardAppModel;
        AbstractC43984rzb abstractC43984rzb;
        ?? r23;
        java.lang.CharSequence charSequence;
        ?? r0;
        Choices choices;
        java.util.List<GroupedValue> groupedValues;
        Choices choices2;
        boolean zBooleanValue;
        Choices choices3;
        java.lang.String subtitle;
        java.lang.String title;
        java.lang.Boolean search;
        java.util.List<Value> values;
        java.util.Iterator it;
        java.util.Iterator it2;
        rRH.TaskDescription taskDescription;
        Ref.BooleanRef booleanRef;
        rRH.StateListAnimator stateListAnimator;
        java.util.Iterator it3;
        rRH.TaskDescription taskDescription2;
        final rQE rqe = this;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
        AbstractC43984rzb abstractC43984rzb2 = rqe.OLrzqt;
        if (abstractC43984rzb2 == null || !(abstractC42074rFj instanceof rGL)) {
            return;
        }
        final SelectCardAppModel selectCardAppModel2 = uIComponentAppModel instanceof SelectCardAppModel ? (SelectCardAppModel) uIComponentAppModel : null;
        if (selectCardAppModel2 == null || (listDNCPSb = (rgl = (rGL) abstractC42074rFj).dNCPSb()) == null) {
            return;
        }
        java.util.Iterator it4 = listDNCPSb.iterator();
        java.lang.Object obj = null;
        ?? r12 = str;
        while (it4.hasNext()) {
            final rAX rax = (rAX) it4.next();
            final java.lang.String id = selectCardAppModel2.getId();
            if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) id)) {
                if (Intrinsics.EZpvd(selectCardAppModel2.isHidden(), java.lang.Boolean.TRUE)) {
                    rqe.setVisibility(8);
                    rax.EZpvd(false);
                    if (!Intrinsics.EZpvd(selectCardAppModel2.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(obj);
                    }
                } else {
                    rqe.setVisibility(0);
                    java.lang.Boolean required = selectCardAppModel2.getRequired();
                    rax.EZpvd(required != null ? required.booleanValue() : false);
                    if (!Intrinsics.EZpvd(selectCardAppModel2.getEnabled(), java.lang.Boolean.FALSE)) {
                        rax.setValue(obj);
                    }
                }
                C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rQC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rQE.OLrzqt(selectCardAppModel2, rax, (java.lang.String) obj2);
                    }
                }, new Function1() { // from class: o.rQD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rQE.OLrzqt((java.lang.String) obj2);
                    }
                }, new Function1() { // from class: o.rQJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rQE.AEQbTJ((java.lang.String) obj2);
                    }
                }, new Function0() { // from class: o.rQH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rQE.KWHzl();
                    }
                });
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                java.lang.String value = selectCardAppModel2.getValue();
                if ((value != null && value.length() != 0) || ((charSequence = (java.lang.CharSequence) rax.getValue()) != null && charSequence.length() != 0)) {
                    rqe.AEQbTJ = true;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) rax.getValue())) {
                        java.lang.Object value2 = rax.getValue();
                        Intrinsics.copydefault(value2);
                        r0 = (java.lang.String) value2;
                    } else {
                        java.lang.String value3 = selectCardAppModel2.getValue();
                        r0 = value3;
                        if (value3 == null) {
                        }
                    }
                    objectRef3.element = r0;
                    choices = selectCardAppModel2.getChoices();
                    if (choices != null) {
                        objectRef.element = new LinkedHashMap();
                        objectRef2.element = choices.getUri();
                        java.lang.Boolean boolIsGroupedValueUri = choices.isGroupedValueUri();
                        booleanRef2.element = boolIsGroupedValueUri == null ? boolIsGroupedValueUri.booleanValue() : false;
                        if (rqe.EZpvd) {
                        }
                    }
                    rgl.gasjUx().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rQF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return rQE.OLrzqt(id, rqe, rax, selectCardAppModel2, (C42156rIk) obj2);
                        }
                    }));
                    final java.util.ArrayList arrayList = new java.util.ArrayList();
                    final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    objectRef4.element = r12;
                    Choices choices4 = selectCardAppModel2.getChoices();
                    if (choices4 == null) {
                    }
                    if (groupedValues != null) {
                    }
                    final Ref.BooleanRef booleanRef3 = booleanRef2;
                    choices2 = selectCardAppModel2.getChoices();
                    if (choices2 != null) {
                        it = values.iterator();
                        while (it.hasNext()) {
                        }
                    }
                    zBooleanValue = false;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) objectRef3.element)) {
                    }
                    choices3 = selectCardAppModel2.getChoices();
                    if (choices3 != null) {
                        zBooleanValue = search.booleanValue();
                    }
                    final boolean z = zBooleanValue;
                    Choices choices5 = selectCardAppModel2.getChoices();
                    if (choices5 != null) {
                        Choices choices6 = selectCardAppModel2.getChoices();
                        if (choices6 != null) {
                            final Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                            final ?? r4 = ;
                            selectCardAppModel = selectCardAppModel2;
                            abstractC43984rzb = abstractC43984rzb2;
                            r23 = r12;
                            abstractC43984rzb2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rQG
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    rQE.copydefault(booleanRef4, this, , r4, z, fragmentManager, lifecycleOwner, rax, arrayList, abstractC42074rFj, objectRef2, objectRef4, objectRef3, booleanRef3, objectRef, view);
                                }
                            });
                            obj = null;
                        }
                    }
                } else {
                    r0 = r12;
                    objectRef3.element = r0;
                    choices = selectCardAppModel2.getChoices();
                    if (choices != null && choices.getUri() != null) {
                        objectRef.element = new LinkedHashMap();
                        objectRef2.element = choices.getUri();
                        java.lang.Boolean boolIsGroupedValueUri2 = choices.isGroupedValueUri();
                        booleanRef2.element = boolIsGroupedValueUri2 == null ? boolIsGroupedValueUri2.booleanValue() : false;
                        if (rqe.EZpvd) {
                            rqe.copydefault = true;
                            if (rqe.AEQbTJ) {
                                rqe.AEQbTJ = false;
                                rqe.EZpvd = true;
                            } else {
                                rqe.EZpvd = false;
                            }
                        }
                    }
                    rgl.gasjUx().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rQF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return rQE.OLrzqt(id, rqe, rax, selectCardAppModel2, (C42156rIk) obj2);
                        }
                    }));
                    final java.util.List arrayList2 = new java.util.ArrayList();
                    final Ref.ObjectRef objectRef42 = new Ref.ObjectRef();
                    objectRef42.element = r12;
                    Choices choices42 = selectCardAppModel2.getChoices();
                    groupedValues = choices42 == null ? choices42.getGroupedValues() : null;
                    if (groupedValues != null) {
                        java.util.Iterator it5 = groupedValues.iterator();
                        while (it5.hasNext()) {
                            GroupedValue groupedValue = (GroupedValue) it5.next();
                            java.util.Iterator it6 = it5;
                            java.lang.String name = groupedValue.getName();
                            if (name != null) {
                                booleanRef = booleanRef2;
                                stateListAnimator = new rRH.StateListAnimator(name);
                            } else {
                                booleanRef = booleanRef2;
                                stateListAnimator = null;
                            }
                            if (stateListAnimator != null) {
                                arrayList2.add(stateListAnimator);
                            }
                            java.util.List<Value> values2 = groupedValue.getValues();
                            if (values2 != null) {
                                java.util.Iterator it7 = values2.iterator();
                                while (it7.hasNext()) {
                                    Value value4 = (Value) it7.next();
                                    java.lang.String text = value4.getText();
                                    if (text != null) {
                                        if (rqe.EZpvd) {
                                            it3 = it7;
                                            if (Intrinsics.EZpvd(value4.getValue(), objectRef3.element)) {
                                                rax.setValue(value4.getValue());
                                            }
                                        } else {
                                            it3 = it7;
                                        }
                                        java.lang.String tip = value4.getTip();
                                        java.lang.String icon = value4.getIcon();
                                        java.lang.String value5 = value4.getValue();
                                        java.lang.String helperText = value4.getHelperText();
                                        java.lang.Boolean enabled = value4.getEnabled();
                                        taskDescription2 = new rRH.TaskDescription(text, tip, icon, value5, helperText, enabled != null ? enabled.booleanValue() : true, Intrinsics.EZpvd(value4.getValue(), objectRef3.element), value4.getHiddenItemIds(), value4.getDisplayedItemIds(), null, null, null, value4.getReminder(), value4.getPicture(), null, value4.getCountryFlagUrl(), null, value4.getPictureMeta(), null, 347648, null);
                                    } else {
                                        it3 = it7;
                                        taskDescription2 = null;
                                    }
                                    if (taskDescription2 != null) {
                                        arrayList2.add(taskDescription2);
                                    }
                                    it7 = it3;
                                }
                            }
                            it5 = it6;
                            booleanRef2 = booleanRef;
                        }
                    }
                    final Ref.BooleanRef booleanRef32 = booleanRef2;
                    choices2 = selectCardAppModel2.getChoices();
                    if (choices2 != null && (values = choices2.getValues()) != null) {
                        it = values.iterator();
                        while (it.hasNext()) {
                            Value value6 = (Value) it.next();
                            java.lang.String text2 = value6.getText();
                            if (text2 != null) {
                                if (rqe.EZpvd) {
                                    it2 = it;
                                    if (Intrinsics.EZpvd(value6.getValue(), objectRef3.element)) {
                                        rax.setValue(value6.getValue());
                                    }
                                } else {
                                    it2 = it;
                                }
                                java.lang.String tip2 = value6.getTip();
                                java.lang.String icon2 = value6.getIcon();
                                java.lang.String value7 = value6.getValue();
                                java.lang.String helperText2 = value6.getHelperText();
                                java.lang.Boolean enabled2 = value6.getEnabled();
                                taskDescription = new rRH.TaskDescription(text2, tip2, icon2, value7, helperText2, enabled2 != null ? enabled2.booleanValue() : true, Intrinsics.EZpvd(value6.getValue(), objectRef3.element), value6.getHiddenItemIds(), value6.getDisplayedItemIds(), null, null, null, value6.getReminder(), value6.getPicture(), null, value6.getCountryFlagUrl(), null, value6.getPictureMeta(), null, 347648, null);
                            } else {
                                it2 = it;
                                taskDescription = null;
                            }
                            if (taskDescription != null) {
                                arrayList2.add(taskDescription);
                            }
                            rqe.copydefault = false;
                            it = it2;
                        }
                    }
                    zBooleanValue = false;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) objectRef3.element)) {
                        rax.setValue(objectRef3.element);
                    }
                    choices3 = selectCardAppModel2.getChoices();
                    if (choices3 != null && (search = choices3.getSearch()) != null) {
                        zBooleanValue = search.booleanValue();
                    }
                    final boolean z2 = zBooleanValue;
                    Choices choices52 = selectCardAppModel2.getChoices();
                    final java.lang.String r3 = (choices52 != null || (title = choices52.getTitle()) == null) ? r12 : title;
                    Choices choices62 = selectCardAppModel2.getChoices();
                    ?? r20 = (choices62 != null || (subtitle = choices62.getSubtitle()) == null) ? r12 : subtitle;
                    final Ref.BooleanRef booleanRef42 = new Ref.BooleanRef();
                    final java.lang.String r42 = r20;
                    selectCardAppModel = selectCardAppModel2;
                    abstractC43984rzb = abstractC43984rzb2;
                    r23 = r12;
                    abstractC43984rzb2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rQG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rQE.copydefault(booleanRef42, this, r3, r42, z2, fragmentManager, lifecycleOwner, rax, arrayList2, abstractC42074rFj, objectRef2, objectRef42, objectRef3, booleanRef32, objectRef, view);
                        }
                    });
                    obj = null;
                }
            } else {
                selectCardAppModel = selectCardAppModel2;
                abstractC43984rzb = abstractC43984rzb2;
                r23 = r12;
            }
            rqe = this;
            lifecycleOwner2 = lifecycleOwner;
            r12 = r23;
            abstractC43984rzb2 = abstractC43984rzb;
            selectCardAppModel2 = selectCardAppModel;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(SelectCardAppModel selectCardAppModel, rAX rax, java.lang.String str) {
        selectCardAppModel.setValue((java.lang.String) rax.getValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, rQE rqe, rAX rax, SelectCardAppModel selectCardAppModel, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(str) && rqe.getVisibility() == 8) {
            rqe.setVisibility(0);
            java.lang.Boolean required = selectCardAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            selectCardAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(str) && rqe.getVisibility() == 0) {
            rqe.setVisibility(8);
            rax.EZpvd(false);
            selectCardAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(final Ref.BooleanRef booleanRef, final rQE rqe, java.lang.String str, java.lang.String str2, boolean z, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, final rAX rax, final java.util.List list, final AbstractC42074rFj abstractC42074rFj, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef4, android.view.View view) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        android.content.Context context = rqe.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        rRH rrh = new rRH(context, str, str2, z, null, false, new Function0() { // from class: o.rQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rQE.EZpvd(booleanRef);
            }
        }, new Function1() { // from class: o.rQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rQE.OLrzqt(rax, booleanRef, list, rqe, abstractC42074rFj, (rRH.TaskDescription) obj);
            }
        }, 32, null);
        rrh.showNow(fragmentManager, rRH.class.getCanonicalName());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), null, new SelectCardItemView$observe$1$1$1$9$1(rqe, objectRef, rrh, list, objectRef2, objectRef3, rax, booleanRef2, abstractC42074rFj, objectRef4, null), 2, null);
    }

    public static final Unit EZpvd(Ref.BooleanRef booleanRef) {
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, Ref.BooleanRef booleanRef, java.util.List list, rQE rqe, AbstractC42074rFj abstractC42074rFj, rRH.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C43296rmc.EZpvd("select-card", "contentClick");
        if (Intrinsics.EZpvd((java.lang.Object) rax.getValue(), (java.lang.Object) taskDescription.fetchVPNInfo())) {
            booleanRef.element = false;
            return Unit.INSTANCE;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            rRH.Dialog dialog = (rRH.Dialog) it.next();
            if (dialog instanceof rRH.TaskDescription) {
                rRH.TaskDescription taskDescription2 = (rRH.TaskDescription) dialog;
                taskDescription2.KWHzl(Intrinsics.EZpvd((java.lang.Object) taskDescription2.fetchVPNInfo(), (java.lang.Object) taskDescription.fetchVPNInfo()));
            }
        }
        rqe.EZpvd = false;
        C43296rmc.EZpvd("select-card", "cur=" + rax.getValue() + " it=" + taskDescription.fetchVPNInfo());
        rax.setValue(taskDescription.fetchVPNInfo());
        ((rGL) abstractC42074rFj).gasjUx().setValue(new C42156rIk(taskDescription.AYXKKw(), taskDescription.EZpvd()));
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setPadding(0, 0, 0, rqr.AEQbTJ(context, this.djBIcL, uIComponentAppModel.getBottomMargin()));
        C43296rmc.EZpvd("select-card", "bindData");
        SelectCardAppModel selectCardAppModel = uIComponentAppModel instanceof SelectCardAppModel ? (SelectCardAppModel) uIComponentAppModel : null;
        if (selectCardAppModel != null) {
            C43296rmc.EZpvd("select-card", "SelectCardAppModel");
            AbstractC43984rzb abstractC43984rzb = this.OLrzqt;
            if (abstractC43984rzb != null) {
                Intrinsics.EZpvd(selectCardAppModel.getEnabled(), java.lang.Boolean.TRUE);
                abstractC43984rzb.AEQbTJ.setText(selectCardAppModel.getText());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC43984rzb abstractC43984rzb = this.OLrzqt;
        if (abstractC43984rzb != null) {
            abstractC43984rzb.unbind();
        }
        this.OLrzqt = null;
    }
}
