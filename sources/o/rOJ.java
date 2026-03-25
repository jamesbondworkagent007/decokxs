package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Picture;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.InputSelectItemView$observe$1$1$1$12$2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C43662rtX;
import o.C52761wXj;
import o.SQ;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rOJ extends android.widget.FrameLayout {
    public boolean AEQbTJ;
    public ViewStatus AhwBna;
    public final C42513rVq EZpvd;
    public boolean KWHzl;
    public AbstractC43914ryK OLrzqt;
    public boolean copydefault;
    public final C42519rVw valueOf;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rOJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rOJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AhwBna = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:68) call: o.rOJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rOJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rOJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = ViewStatus.Form;
        this.valueOf = new C42519rVw(context, attributeSet, i);
        this.AEQbTJ = true;
        this.OLrzqt = (AbstractC43914ryK) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.OHqIaq, this, true);
        C42513rVq c42513rVq = new C42513rVq(context, attributeSet, i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(c42513rVq.getResources().getDimensionPixelSize(SQ.Application.copydefault));
        c42513rVq.setLayoutParams(marginLayoutParams);
        this.EZpvd = c42513rVq;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:297:0x01ab */
    /* JADX DEBUG: Type inference failed for r0v11. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v137. Raw type applied. Possible types: java.util.Map<java.lang.String, java.lang.String>, java.util.Map */
    /* JADX DEBUG: Type inference failed for r0v146. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v150. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r0v23. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v55. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v98. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r11v31. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r1v40. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r1v42. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r22v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v29. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r4v32. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294  */
    /* JADX WARN: Type inference failed for: r0v116, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r0v117, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v133, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r0v138, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [T] */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v57, types: [android.widget.TextView, o.xbh] */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v39, types: [T] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6, types: [T] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        int i;
        InputSelectAppModel inputSelectAppModel;
        AbstractC43914ryK abstractC43914ryK;
        ?? r25;
        rOJ roj;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        java.lang.CharSequence charSequence;
        ?? r0;
        final Choices choices;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        java.lang.String str;
        rAX rax;
        InputSelectAppModel inputSelectAppModel2;
        ?? r20;
        Ref.BooleanRef booleanRef;
        final java.lang.String str2;
        final rAX rax2;
        java.util.List<GroupedValue> groupedValues;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        final InputSelectAppModel inputSelectAppModel3;
        java.util.List<Value> values;
        ?? r18;
        C55008xbo c55008xbo;
        final AbstractC43914ryK abstractC43914ryK2;
        ?? r252;
        java.lang.Object obj;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C55009xbp c55009xbpFIwbmz;
        java.util.List<Picture> pictures;
        java.util.List<Picture> listAhwBna;
        java.lang.Integer spanCount;
        C55009xbp c55009xbpFIwbmz2;
        C54957xaq c54957xaqAEQbTJ3;
        ?? r02;
        java.lang.String valueName;
        java.util.Iterator it;
        ?? r182;
        C54957xaq c54957xaqAEQbTJ4;
        C55001xbh c55001xbh3;
        java.util.Iterator it2;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        InputSelectAppModel inputSelectAppModel4;
        java.util.Iterator it3;
        java.util.Iterator it4;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        InputSelectAppModel inputSelectAppModel5;
        rRH.TaskDescription taskDescription;
        C54957xaq c54957xaqAEQbTJ5;
        C55001xbh c55001xbh4;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef10;
        boolean zBooleanValue;
        C54957xaq c54957xaqAEQbTJ6;
        C55001xbh c55001xbh5;
        ?? r202;
        ?? r203;
        rOJ roj2 = this;
        final AbstractC42074rFj abstractC42074rFj2 = abstractC42074rFj;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj2, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
        final AbstractC43914ryK abstractC43914ryK3 = roj2.OLrzqt;
        if (abstractC43914ryK3 != null) {
            if (abstractC42074rFj2 instanceof rGL) {
                final InputSelectAppModel inputSelectAppModel6 = uIComponentAppModel instanceof InputSelectAppModel ? (InputSelectAppModel) uIComponentAppModel : null;
                if (inputSelectAppModel6 != null) {
                    rGL rgl = (rGL) abstractC42074rFj2;
                    java.util.Iterator it5 = rgl.dNCPSb().iterator();
                    java.lang.Object obj2 = null;
                    ?? r12 = str3;
                    while (it5.hasNext()) {
                        final rAX rax3 = (rAX) it5.next();
                        final java.lang.String id = inputSelectAppModel6.getId();
                        if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) id)) {
                            C55009xbp c55009xbpFIwbmz3 = abstractC43914ryK3.copydefault.fIwbmz();
                            if (c55009xbpFIwbmz3 != null) {
                                c55009xbpFIwbmz3.setContentDescription(id);
                                Unit unit = Unit.INSTANCE;
                            }
                            java.lang.Boolean boolIsHidden = inputSelectAppModel6.isHidden();
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            if (Intrinsics.EZpvd(boolIsHidden, bool)) {
                                roj2.setVisibility(8);
                                rax3.EZpvd(false);
                                if (!Intrinsics.EZpvd(inputSelectAppModel6.getEnabled(), java.lang.Boolean.FALSE)) {
                                    rax3.setValue(obj2);
                                }
                            } else {
                                roj2.setVisibility(0);
                                java.lang.Boolean required = inputSelectAppModel6.getRequired();
                                rax3.EZpvd(required != null ? required.booleanValue() : false);
                                if (!Intrinsics.EZpvd(inputSelectAppModel6.getEnabled(), java.lang.Boolean.FALSE)) {
                                    rax3.setValue(obj2);
                                }
                            }
                            C41959rBc.EZpvd(rax3, lifecycleOwner, new Function1() { // from class: o.rON
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return rOJ.EZpvd(inputSelectAppModel6, rax3, abstractC42074rFj2, id, (java.lang.String) obj3);
                                }
                            }, new Function1() { // from class: o.rOK
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return rOJ.AEQbTJ((java.lang.String) obj3);
                                }
                            }, new Function1() { // from class: o.rOR
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return rOJ.KWHzl((java.lang.String) obj3);
                                }
                            }, new Function0() { // from class: o.rOO
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return rOJ.EZpvd();
                                }
                            });
                            abstractC43914ryK3.copydefault.setFieldState(3);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> value = rgl.sSMYrx().getValue();
                            if (value != null) {
                                linkedHashMap.putAll(value);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            java.lang.String valueName2 = inputSelectAppModel6.getValueName();
                            ?? r1 = valueName2;
                            if (valueName2 == null) {
                                r1 = r12;
                            }
                            java.lang.String value2 = inputSelectAppModel6.getValue();
                            ?? r2 = value2;
                            if (value2 == null) {
                                r2 = r12;
                            }
                            linkedHashMap.put(id, new kotlin.Pair<>(r1, r2));
                            rgl.sSMYrx().setValue(linkedHashMap);
                            Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                            java.lang.String value3 = inputSelectAppModel6.getValue();
                            if ((value3 != null && value3.length() != 0) || ((charSequence = (java.lang.CharSequence) rax3.getValue()) != null && charSequence.length() != 0)) {
                                abstractC43914ryK3.copydefault.setFieldState(0);
                                roj2.KWHzl = true;
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) rax3.getValue())) {
                                    java.lang.Object value4 = rax3.getValue();
                                    Intrinsics.copydefault(value4);
                                    r0 = (java.lang.String) value4;
                                } else {
                                    java.lang.String value5 = inputSelectAppModel6.getValue();
                                    r0 = value5;
                                    if (value5 == null) {
                                    }
                                }
                                objectRef11.element = r0;
                                final Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                                choices = inputSelectAppModel6.getChoices();
                                if (choices == null) {
                                }
                                final java.lang.String str4 = str;
                                final rAX rax4 = rax;
                                final InputSelectAppModel inputSelectAppModel7 = inputSelectAppModel2;
                                final AbstractC43914ryK abstractC43914ryK4 = abstractC43914ryK3;
                                rgl.gasjUx().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rOU
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return rOJ.copydefault(str4, this, rax4, inputSelectAppModel7, abstractC43914ryK4, (C42156rIk) obj3);
                                    }
                                }));
                                final Ref.ObjectRef objectRef14 = objectRef;
                                str2 = str;
                                rax2 = rax;
                                rgl.AuCTelauCTel().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rOT
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return rOJ.KWHzl(str2, rax2, abstractC43914ryK3, abstractC42074rFj, (java.util.Map) obj3);
                                    }
                                }));
                                final java.util.ArrayList<rRH.Dialog> arrayList = new java.util.ArrayList();
                                final Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                                ?? r5 = r20;
                                objectRef15.element = r5;
                                Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                                objectRef16.element = r5;
                                Choices choices2 = inputSelectAppModel2.getChoices();
                                if (choices2 == null) {
                                }
                                if (groupedValues == null) {
                                }
                                values = inputSelectAppModel3.getChoices().getValues();
                                if (values == null) {
                                }
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) objectRef5.element)) {
                                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "certificateType")) {
                                    }
                                    c55009xbpFIwbmz2 = abstractC43914ryK3.copydefault.fIwbmz();
                                    if (c55009xbpFIwbmz2 != null) {
                                        valueName = inputSelectAppModel3.getValueName();
                                        ?? r13 = valueName;
                                        if (valueName == null) {
                                        }
                                        r02.setText(r13);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    rax2.setValue(objectRef5.element);
                                }
                                java.lang.Boolean search = inputSelectAppModel3.getChoices().getSearch();
                                if (search == null) {
                                }
                                java.lang.String title = inputSelectAppModel3.getChoices().getTitle();
                                if (title != null) {
                                }
                                java.lang.String subtitle = inputSelectAppModel3.getChoices().getSubtitle();
                                if (subtitle != null) {
                                }
                                final Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                                final Ref.ObjectRef objectRef17 = objectRef5;
                                abstractC43914ryK3.KWHzl.setLayoutManager(new GridLayoutManager(getContext(), 2));
                                abstractC43914ryK3.KWHzl.addItemDecoration(C33047mpA.AEQbTJ(2, C55298xhM.dp2px$default(12.0f, null, 1, null)));
                                final Application application = new Application(0, yDY.AhwBna(), 1, null);
                                abstractC43914ryK3.KWHzl.setAdapter(application);
                                while (r0.hasNext()) {
                                }
                                c55008xbo = abstractC43914ryK3.copydefault;
                                if (c55008xbo != null) {
                                    abstractC43914ryK2 = abstractC43914ryK3;
                                    inputSelectAppModel = inputSelectAppModel3;
                                    r252 = r18;
                                    obj = null;
                                    if (Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                                    }
                                    obj2 = obj;
                                    r25 = r252;
                                }
                            } else {
                                r0 = r12;
                                objectRef11.element = r0;
                                final Ref.ObjectRef objectRef122 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef132 = new Ref.ObjectRef();
                                Ref.BooleanRef booleanRef32 = new Ref.BooleanRef();
                                choices = inputSelectAppModel6.getChoices();
                                if (choices == null) {
                                    if (choices.getParams() != null && choices.getUri() != null) {
                                        objectRef122.element = new LinkedHashMap();
                                        final Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                                        objectRef18.element = r12;
                                        for (java.lang.String str5 : choices.getParams().keySet()) {
                                            java.lang.Object obj3 = objectRef122.element;
                                            Intrinsics.copydefault(obj3);
                                            ((java.util.Map) obj3).put(str5, r12);
                                            java.lang.String str6 = choices.getParams().get(str5);
                                            if (str6 == 0) {
                                                str6 = r12;
                                            }
                                            objectRef18.element = str6;
                                        }
                                        rgl.AxsJAY().put(objectRef18.element, id);
                                        objectRef132.element = choices.getUri();
                                        java.lang.Boolean boolIsGroupedValueUri = choices.isGroupedValueUri();
                                        booleanRef32.element = boolIsGroupedValueUri != null ? boolIsGroupedValueUri.booleanValue() : false;
                                        r203 = r12;
                                        objectRef = objectRef132;
                                        objectRef10 = objectRef122;
                                        booleanRef2 = booleanRef32;
                                        objectRef3 = objectRef11;
                                        str = id;
                                        final InputSelectAppModel inputSelectAppModel8 = inputSelectAppModel6;
                                        rax = rax3;
                                        final AbstractC43914ryK abstractC43914ryK5 = abstractC43914ryK3;
                                        inputSelectAppModel2 = inputSelectAppModel6;
                                        rgl.sSMYrx().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rOV
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                                return rOJ.AEQbTJ(objectRef122, choices, abstractC42074rFj, id, rax3, inputSelectAppModel8, abstractC43914ryK5, this, objectRef18, (java.util.Map) obj4);
                                            }
                                        }));
                                    } else {
                                        booleanRef2 = booleanRef32;
                                        objectRef = objectRef132;
                                        objectRef10 = objectRef122;
                                        objectRef3 = objectRef11;
                                        str = id;
                                        rax = rax3;
                                        inputSelectAppModel2 = inputSelectAppModel6;
                                        ?? r204 = r12;
                                        r203 = r204;
                                        if (choices.getUri() != null) {
                                            objectRef10.element = new LinkedHashMap();
                                            objectRef.element = choices.getUri();
                                            java.lang.Boolean boolIsGroupedValueUri2 = choices.isGroupedValueUri();
                                            if (boolIsGroupedValueUri2 != null) {
                                                zBooleanValue = boolIsGroupedValueUri2.booleanValue();
                                                booleanRef = booleanRef2;
                                            } else {
                                                booleanRef = booleanRef2;
                                                zBooleanValue = false;
                                            }
                                            booleanRef.element = zBooleanValue;
                                            if (Intrinsics.EZpvd(inputSelectAppModel2.getEnabled(), bool)) {
                                                abstractC43914ryK3.copydefault.setState(0);
                                                Unit unit4 = Unit.INSTANCE;
                                                objectRef2 = objectRef10;
                                                roj2 = this;
                                            } else {
                                                abstractC43914ryK3.copydefault.setState(3);
                                                objectRef2 = objectRef10;
                                                roj2 = this;
                                                int iAEQbTJ = rQR.AEQbTJ.AEQbTJ(inputSelectAppModel2.getTextColor(), roj2.valueOf);
                                                C55009xbp c55009xbpFIwbmz4 = abstractC43914ryK3.copydefault.fIwbmz();
                                                if (c55009xbpFIwbmz4 != null && (c54957xaqAEQbTJ6 = c55009xbpFIwbmz4.AEQbTJ()) != null && (c55001xbh5 = c54957xaqAEQbTJ6.AEQbTJ) != null) {
                                                    c55001xbh5.setTextColor(iAEQbTJ);
                                                    Unit unit5 = Unit.INSTANCE;
                                                }
                                            }
                                            r202 = r204;
                                            if (roj2.AEQbTJ) {
                                                roj2.copydefault = true;
                                                if (roj2.KWHzl) {
                                                    roj2.KWHzl = false;
                                                    roj2.AEQbTJ = true;
                                                    r202 = r204;
                                                } else {
                                                    roj2.AEQbTJ = false;
                                                    r202 = r204;
                                                }
                                            }
                                        }
                                        Unit unit6 = Unit.INSTANCE;
                                        r20 = r202;
                                    }
                                    booleanRef = booleanRef2;
                                    objectRef2 = objectRef10;
                                    roj2 = this;
                                    r202 = r203;
                                    Unit unit62 = Unit.INSTANCE;
                                    r20 = r202;
                                } else {
                                    objectRef = objectRef132;
                                    objectRef2 = objectRef122;
                                    objectRef3 = objectRef11;
                                    str = id;
                                    rax = rax3;
                                    inputSelectAppModel2 = inputSelectAppModel6;
                                    r20 = r12;
                                    booleanRef = booleanRef32;
                                }
                                final java.lang.String str42 = str;
                                final rAX rax42 = rax;
                                final InputSelectAppModel inputSelectAppModel72 = inputSelectAppModel2;
                                final AbstractC43914ryK abstractC43914ryK42 = abstractC43914ryK3;
                                rgl.gasjUx().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rOU
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj32) {
                                        return rOJ.copydefault(str42, this, rax42, inputSelectAppModel72, abstractC43914ryK42, (C42156rIk) obj32);
                                    }
                                }));
                                final Ref.ObjectRef objectRef142 = objectRef;
                                str2 = str;
                                rax2 = rax;
                                rgl.AuCTelauCTel().observe(lifecycleOwner2, new Activity(new Function1() { // from class: o.rOT
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj32) {
                                        return rOJ.KWHzl(str2, rax2, abstractC43914ryK3, abstractC42074rFj, (java.util.Map) obj32);
                                    }
                                }));
                                final java.util.ArrayList<rRH.Dialog> arrayList2 = new java.util.ArrayList();
                                final Ref.ObjectRef objectRef152 = new Ref.ObjectRef();
                                ?? r52 = r20;
                                objectRef152.element = r52;
                                Ref.ObjectRef objectRef162 = new Ref.ObjectRef();
                                objectRef162.element = r52;
                                Choices choices22 = inputSelectAppModel2.getChoices();
                                groupedValues = choices22 == null ? choices22.getGroupedValues() : null;
                                if (groupedValues == null) {
                                    abstractC43914ryK3.copydefault.setFieldState(0);
                                    java.util.Iterator it6 = groupedValues.iterator();
                                    while (it6.hasNext()) {
                                        GroupedValue groupedValue = (GroupedValue) it6.next();
                                        java.lang.String name = groupedValue.getName();
                                        rRH.StateListAnimator stateListAnimator = name != null ? new rRH.StateListAnimator(name) : null;
                                        if (stateListAnimator != null) {
                                            arrayList2.add(stateListAnimator);
                                        }
                                        java.util.List<Value> values2 = groupedValue.getValues();
                                        if (values2 != null) {
                                            java.util.Iterator it7 = values2.iterator();
                                            while (it7.hasNext()) {
                                                Value value6 = (Value) it7.next();
                                                java.lang.String text = value6.getText();
                                                if (text != null) {
                                                    if (roj2.AEQbTJ) {
                                                        it3 = it6;
                                                        objectRef9 = objectRef3;
                                                        if (Intrinsics.EZpvd(value6.getValue(), objectRef9.element)) {
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> value7 = rgl.sSMYrx().getValue();
                                                            if (value7 != null) {
                                                                linkedHashMap2.putAll(value7);
                                                                Unit unit7 = Unit.INSTANCE;
                                                            }
                                                            it4 = it7;
                                                            objectRef8 = objectRef162;
                                                            linkedHashMap2.put(str2, new kotlin.Pair<>(value6.getText(), value6.getValue()));
                                                            rgl.sSMYrx().setValue(linkedHashMap2);
                                                            C55009xbp c55009xbpFIwbmz5 = abstractC43914ryK3.copydefault.fIwbmz();
                                                            if (c55009xbpFIwbmz5 != null && (c54957xaqAEQbTJ5 = c55009xbpFIwbmz5.AEQbTJ()) != null && (c55001xbh4 = c54957xaqAEQbTJ5.AEQbTJ) != null) {
                                                                c55001xbh4.setText(value6.getText());
                                                                Unit unit8 = Unit.INSTANCE;
                                                            }
                                                            if (C33129mqd.OLrzqt((java.lang.CharSequence) value6.getHelperText())) {
                                                                abstractC43914ryK3.djBIcL.setVisibility(0);
                                                                abstractC43914ryK3.djBIcL.setText(value6.getHelperText());
                                                            } else {
                                                                abstractC43914ryK3.djBIcL.setVisibility(8);
                                                            }
                                                            rax2.setValue(value6.getValue());
                                                            inputSelectAppModel5 = inputSelectAppModel2;
                                                            inputSelectAppModel5.setValueName(value6.getText());
                                                            java.lang.String tip = value6.getTip();
                                                            java.lang.String icon = value6.getIcon();
                                                            java.lang.String value8 = value6.getValue();
                                                            java.lang.String helperText = value6.getHelperText();
                                                            java.lang.Boolean enabled = value6.getEnabled();
                                                            taskDescription = new rRH.TaskDescription(text, tip, icon, value8, helperText, enabled == null ? enabled.booleanValue() : true, Intrinsics.EZpvd(value6.getValue(), objectRef9.element), value6.getHiddenItemIds(), value6.getDisplayedItemIds(), null, null, value6.getSearchKey(), value6.getReminder(), value6.getPicture(), null, value6.getCountryFlagUrl(), null, value6.getPictureMeta(), null, 345600, null);
                                                        } else {
                                                            it4 = it7;
                                                            objectRef8 = objectRef162;
                                                        }
                                                    } else {
                                                        it3 = it6;
                                                        it4 = it7;
                                                        objectRef8 = objectRef162;
                                                        objectRef9 = objectRef3;
                                                    }
                                                    inputSelectAppModel5 = inputSelectAppModel2;
                                                    java.lang.String tip2 = value6.getTip();
                                                    java.lang.String icon2 = value6.getIcon();
                                                    java.lang.String value82 = value6.getValue();
                                                    java.lang.String helperText2 = value6.getHelperText();
                                                    java.lang.Boolean enabled2 = value6.getEnabled();
                                                    taskDescription = new rRH.TaskDescription(text, tip2, icon2, value82, helperText2, enabled2 == null ? enabled2.booleanValue() : true, Intrinsics.EZpvd(value6.getValue(), objectRef9.element), value6.getHiddenItemIds(), value6.getDisplayedItemIds(), null, null, value6.getSearchKey(), value6.getReminder(), value6.getPicture(), null, value6.getCountryFlagUrl(), null, value6.getPictureMeta(), null, 345600, null);
                                                } else {
                                                    it3 = it6;
                                                    it4 = it7;
                                                    objectRef8 = objectRef162;
                                                    objectRef9 = objectRef3;
                                                    inputSelectAppModel5 = inputSelectAppModel2;
                                                    taskDescription = null;
                                                }
                                                if (taskDescription != null) {
                                                    arrayList2.add(taskDescription);
                                                    Unit unit9 = Unit.INSTANCE;
                                                }
                                                it6 = it3;
                                                objectRef3 = objectRef9;
                                                inputSelectAppModel2 = inputSelectAppModel5;
                                                it7 = it4;
                                                objectRef162 = objectRef8;
                                            }
                                            it2 = it6;
                                            objectRef6 = objectRef162;
                                            objectRef7 = objectRef3;
                                            inputSelectAppModel4 = inputSelectAppModel2;
                                            Unit unit10 = Unit.INSTANCE;
                                        } else {
                                            it2 = it6;
                                            objectRef6 = objectRef162;
                                            objectRef7 = objectRef3;
                                            inputSelectAppModel4 = inputSelectAppModel2;
                                        }
                                        it6 = it2;
                                        objectRef3 = objectRef7;
                                        inputSelectAppModel2 = inputSelectAppModel4;
                                        objectRef162 = objectRef6;
                                    }
                                    objectRef4 = objectRef162;
                                    objectRef5 = objectRef3;
                                    inputSelectAppModel3 = inputSelectAppModel2;
                                    Unit unit11 = Unit.INSTANCE;
                                } else {
                                    objectRef4 = objectRef162;
                                    objectRef5 = objectRef3;
                                    inputSelectAppModel3 = inputSelectAppModel2;
                                }
                                values = inputSelectAppModel3.getChoices().getValues();
                                if (values == null) {
                                    abstractC43914ryK3.copydefault.setFieldState(0);
                                    java.util.Iterator it8 = values.iterator();
                                    ?? r53 = r52;
                                    while (it8.hasNext()) {
                                        Value value9 = (Value) it8.next();
                                        java.lang.String text2 = value9.getText();
                                        if (roj2.AEQbTJ && Intrinsics.EZpvd(value9.getValue(), objectRef5.element)) {
                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                            java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> value10 = rgl.sSMYrx().getValue();
                                            if (value10 != null) {
                                                linkedHashMap3.putAll(value10);
                                                Unit unit12 = Unit.INSTANCE;
                                            }
                                            it = it8;
                                            r182 = r53;
                                            linkedHashMap3.put(str2, new kotlin.Pair<>(value9.getText(), value9.getValue()));
                                            rgl.sSMYrx().setValue(linkedHashMap3);
                                            C55009xbp c55009xbpFIwbmz6 = abstractC43914ryK3.copydefault.fIwbmz();
                                            if (c55009xbpFIwbmz6 != null && (c54957xaqAEQbTJ4 = c55009xbpFIwbmz6.AEQbTJ()) != null && (c55001xbh3 = c54957xaqAEQbTJ4.AEQbTJ) != null) {
                                                c55001xbh3.setText(value9.getText());
                                                Unit unit13 = Unit.INSTANCE;
                                            }
                                            if (C33129mqd.OLrzqt((java.lang.CharSequence) value9.getHelperText())) {
                                                abstractC43914ryK3.djBIcL.setVisibility(0);
                                                abstractC43914ryK3.djBIcL.setText(value9.getHelperText());
                                            } else {
                                                abstractC43914ryK3.djBIcL.setVisibility(8);
                                            }
                                            rax2.setValue(value9.getValue());
                                            inputSelectAppModel3.setValueName(value9.getText());
                                        } else {
                                            it = it8;
                                            r182 = r53;
                                        }
                                        java.lang.String tip3 = value9.getTip();
                                        java.lang.String icon3 = value9.getIcon();
                                        java.lang.String value11 = value9.getValue();
                                        java.lang.String helperText3 = value9.getHelperText();
                                        java.lang.Boolean enabled3 = value9.getEnabled();
                                        arrayList2.add(new rRH.TaskDescription(text2, tip3, icon3, value11, helperText3, enabled3 != null ? enabled3.booleanValue() : true, Intrinsics.EZpvd(value9.getValue(), objectRef5.element), value9.getHiddenItemIds(), value9.getDisplayedItemIds(), null, null, value9.getSearchKey(), value9.getReminder(), value9.getPicture(), null, value9.getCountryFlagUrl(), null, value9.getPictureMeta(), null, 345600, null));
                                        roj2.copydefault = false;
                                        it8 = it;
                                        r53 = r182;
                                    }
                                    r18 = r53;
                                    Unit unit14 = Unit.INSTANCE;
                                } else {
                                    r18 = r52;
                                }
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) objectRef5.element) && C33129mqd.OLrzqt((java.lang.CharSequence) inputSelectAppModel3.getValueName())) {
                                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "certificateType")) {
                                        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                                        C32866mlf.EZpvd("KYC_Select_Id_Type", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rOX
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                                return rOJ.EZpvd(inputSelectAppModel3, (EventParamsList) obj4);
                                            }
                                        });
                                    }
                                    c55009xbpFIwbmz2 = abstractC43914ryK3.copydefault.fIwbmz();
                                    if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz2.AEQbTJ()) != null && (r02 = c54957xaqAEQbTJ3.AEQbTJ) != 0) {
                                        valueName = inputSelectAppModel3.getValueName();
                                        ?? r132 = valueName;
                                        if (valueName == null) {
                                            r132 = r18;
                                        }
                                        r02.setText(r132);
                                        Unit unit32 = Unit.INSTANCE;
                                    }
                                    rax2.setValue(objectRef5.element);
                                }
                                java.lang.Boolean search2 = inputSelectAppModel3.getChoices().getSearch();
                                boolean zBooleanValue2 = search2 == null ? search2.booleanValue() : false;
                                java.lang.String title2 = inputSelectAppModel3.getChoices().getTitle();
                                final ?? r4 = title2 != null ? r18 : title2;
                                java.lang.String subtitle2 = inputSelectAppModel3.getChoices().getSubtitle();
                                final ?? r54 = subtitle2 != null ? r18 : subtitle2;
                                final Ref.BooleanRef booleanRef42 = new Ref.BooleanRef();
                                final Ref.ObjectRef objectRef172 = objectRef5;
                                abstractC43914ryK3.KWHzl.setLayoutManager(new GridLayoutManager(getContext(), 2));
                                abstractC43914ryK3.KWHzl.addItemDecoration(C33047mpA.AEQbTJ(2, C55298xhM.dp2px$default(12.0f, null, 1, null)));
                                final Application application2 = new Application(0, yDY.AhwBna(), 1, null);
                                abstractC43914ryK3.KWHzl.setAdapter(application2);
                                for (rRH.Dialog dialog : arrayList2) {
                                    if (dialog instanceof rRH.TaskDescription) {
                                        rRH.TaskDescription taskDescription2 = (rRH.TaskDescription) dialog;
                                        if (Intrinsics.EZpvd((java.lang.Object) inputSelectAppModel3.getValue(), (java.lang.Object) taskDescription2.fetchVPNInfo())) {
                                            PictureMeta pictureMetaValueOf = taskDescription2.valueOf();
                                            if (pictureMetaValueOf != null && (pictures = pictureMetaValueOf.getPictures()) != null && (!pictures.isEmpty())) {
                                                abstractC43914ryK3.KWHzl.setVisibility(0);
                                                PictureMeta pictureMetaValueOf2 = taskDescription2.valueOf();
                                                int iIntValue = (pictureMetaValueOf2 == null || (spanCount = pictureMetaValueOf2.getSpanCount()) == null) ? 2 : spanCount.intValue();
                                                PictureMeta pictureMetaValueOf3 = taskDescription2.valueOf();
                                                if (pictureMetaValueOf3 == null || (listAhwBna = pictureMetaValueOf3.getPictures()) == null) {
                                                    listAhwBna = yDY.AhwBna();
                                                }
                                                application2.EZpvd(iIntValue, listAhwBna);
                                            } else {
                                                abstractC43914ryK3.KWHzl.setVisibility(8);
                                            }
                                            if (taskDescription2.AhwBna() != null) {
                                                abstractC43914ryK3.AEQbTJ.setVisibility(0);
                                                android.widget.TextView textView = abstractC43914ryK3.AYXKKw;
                                                ChoiceReminder choiceReminderAhwBna = taskDescription2.AhwBna();
                                                textView.setText(choiceReminderAhwBna != null ? choiceReminderAhwBna.getTitle() : null);
                                                android.widget.TextView textView2 = abstractC43914ryK3.AhwBna;
                                                ChoiceReminder choiceReminderAhwBna2 = taskDescription2.AhwBna();
                                                textView2.setText(choiceReminderAhwBna2 != null ? choiceReminderAhwBna2.getContent() : null);
                                            } else {
                                                abstractC43914ryK3.AEQbTJ.setVisibility(8);
                                            }
                                        }
                                    }
                                }
                                c55008xbo = abstractC43914ryK3.copydefault;
                                if (c55008xbo != null || (c55009xbpFIwbmz = c55008xbo.fIwbmz()) == null) {
                                    abstractC43914ryK2 = abstractC43914ryK3;
                                    inputSelectAppModel = inputSelectAppModel3;
                                    r252 = r18;
                                    obj = null;
                                } else {
                                    final boolean z = zBooleanValue2;
                                    final InputSelectAppModel inputSelectAppModel9 = inputSelectAppModel3;
                                    abstractC43914ryK2 = abstractC43914ryK3;
                                    inputSelectAppModel = inputSelectAppModel3;
                                    final Ref.BooleanRef booleanRef5 = booleanRef;
                                    r252 = r18;
                                    obj = null;
                                    final Ref.ObjectRef objectRef19 = objectRef4;
                                    final Ref.ObjectRef objectRef20 = objectRef2;
                                    c55009xbpFIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.rOW
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            rOJ.AEQbTJ(booleanRef42, str2, this, r4, r54, z, inputSelectAppModel9, fragmentManager, lifecycleOwner, rax2, arrayList2, abstractC42074rFj, abstractC43914ryK2, application2, objectRef19, objectRef142, objectRef152, objectRef172, booleanRef5, objectRef20, view);
                                        }
                                    });
                                    Unit unit15 = Unit.INSTANCE;
                                }
                                if (Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                                    roj = this;
                                    abstractC43914ryK = abstractC43914ryK2;
                                    i = 3;
                                } else {
                                    abstractC43914ryK = abstractC43914ryK2;
                                    i = 3;
                                    abstractC43914ryK.copydefault.setFieldState(3);
                                    roj = this;
                                    int iAEQbTJ2 = rQR.AEQbTJ.AEQbTJ(inputSelectAppModel.getTextColor(), roj.valueOf);
                                    C55009xbp c55009xbpFIwbmz7 = abstractC43914ryK.copydefault.fIwbmz();
                                    if (c55009xbpFIwbmz7 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz7.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                                        c55001xbh2.setTextColor(iAEQbTJ2);
                                        Unit unit16 = Unit.INSTANCE;
                                    }
                                }
                                obj2 = obj;
                                r25 = r252;
                            }
                        } else {
                            i = 3;
                            inputSelectAppModel = inputSelectAppModel6;
                            abstractC43914ryK = abstractC43914ryK3;
                            r25 = r12;
                            roj = roj2;
                        }
                        if (Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                            abstractC43914ryK.copydefault.setFieldState(i);
                            int iAEQbTJ3 = rQR.AEQbTJ.AEQbTJ(inputSelectAppModel.getTextColor(), roj.valueOf);
                            C55009xbp c55009xbpFIwbmz8 = abstractC43914ryK.copydefault.fIwbmz();
                            if (c55009xbpFIwbmz8 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz8.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                                c55001xbh.setTextColor(iAEQbTJ3);
                                Unit unit17 = Unit.INSTANCE;
                            }
                        }
                        abstractC42074rFj2 = abstractC42074rFj;
                        lifecycleOwner2 = lifecycleOwner;
                        abstractC43914ryK3 = abstractC43914ryK;
                        roj2 = roj;
                        r12 = r25;
                        inputSelectAppModel6 = inputSelectAppModel;
                    }
                    Unit unit18 = Unit.INSTANCE;
                }
            } else {
                Unit unit19 = Unit.INSTANCE;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(InputSelectAppModel inputSelectAppModel, rAX rax, AbstractC42074rFj abstractC42074rFj, java.lang.String str, java.lang.String str2) {
        inputSelectAppModel.setValue((java.lang.String) rax.getValue());
        java.util.Map<java.lang.String, java.lang.String> mapAubY = ((rGL) abstractC42074rFj).AubY();
        java.lang.String str3 = (java.lang.String) rax.getValue();
        if (str3 == null) {
            str3 = "";
        }
        mapAubY.put(str, str3);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, Choices choices, AbstractC42074rFj abstractC42074rFj, java.lang.String str, rAX rax, InputSelectAppModel inputSelectAppModel, AbstractC43914ryK abstractC43914ryK, rOJ roj, Ref.ObjectRef objectRef2, java.util.Map map) {
        java.lang.String str2;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C54957xaq c54957xaqAEQbTJ3;
        C55001xbh c55001xbh3;
        android.text.Editable text;
        java.lang.String str3;
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            kotlin.Pair pair = (kotlin.Pair) map.get(str4);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (pair != null ? (java.lang.String) pair.getFirst() : null)) && objectRef.element != 0) {
                java.util.Iterator<java.lang.String> it2 = choices.getParams().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        java.lang.String next = it2.next();
                        if (Intrinsics.EZpvd((java.lang.Object) choices.getParams().get(next), (java.lang.Object) str4)) {
                            T t = objectRef.element;
                            Intrinsics.copydefault(t);
                            java.util.Map map2 = (java.util.Map) t;
                            kotlin.Pair pair2 = (kotlin.Pair) map.get(str4);
                            if (pair2 != null && (str3 = (java.lang.String) pair2.getSecond()) != null) {
                                str2 = str3;
                            }
                            map2.put(next, str2);
                        }
                    }
                }
            }
        }
        rGL rgl = (rGL) abstractC42074rFj;
        if (rgl.zsXlph().contains(str)) {
            rax.setValue(null);
            inputSelectAppModel.setValue(null);
            inputSelectAppModel.setValueName(null);
            Choices choices2 = inputSelectAppModel.getChoices();
            if (choices2 != null) {
                choices2.setValues(null);
            }
            C55009xbp c55009xbpFIwbmz = abstractC43914ryK.copydefault.fIwbmz();
            if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ3 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh3 = c54957xaqAEQbTJ3.AEQbTJ) != null && (text = c55001xbh3.getText()) != null) {
                text.clear();
            }
            C55008xbo c55008xbo = abstractC43914ryK.copydefault;
            java.lang.String placeholder = inputSelectAppModel.getPlaceholder();
            c55008xbo.setHintText(placeholder != null ? placeholder : "");
            roj.copydefault = true;
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it3 = rgl.AxsJAY().entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry<java.lang.String, java.lang.String> next2 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) next2.getValue(), (java.lang.Object) str)) {
                    java.lang.String key = next2.getKey();
                    java.util.Iterator it4 = map.keySet().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        java.lang.String str5 = (java.lang.String) it4.next();
                        if (Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) str5)) {
                            kotlin.Pair pair3 = (kotlin.Pair) map.get(str5);
                            java.lang.String str6 = pair3 != null ? (java.lang.String) pair3.getFirst() : null;
                            if (str6 == null || str6.length() == 0) {
                                abstractC43914ryK.copydefault.setFieldState(3);
                                int iAEQbTJ = rQR.AEQbTJ.AEQbTJ(inputSelectAppModel.getTextColor(), roj.valueOf);
                                C55009xbp c55009xbpFIwbmz2 = abstractC43914ryK.copydefault.fIwbmz();
                                if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                                    c55001xbh2.setTextColor(iAEQbTJ);
                                }
                            }
                        }
                    }
                }
            }
            pUU.EZpvd("qjf", "isDependencyChanged--->placeholder = " + inputSelectAppModel.getPlaceholder());
            abstractC43914ryK.djBIcL.setVisibility(8);
            abstractC43914ryK.KWHzl.setVisibility(8);
            abstractC43914ryK.AEQbTJ.setVisibility(8);
        }
        java.util.Iterator it5 = map.keySet().iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            java.lang.String str7 = (java.lang.String) it5.next();
            if (Intrinsics.EZpvd(str7, objectRef2.element)) {
                kotlin.Pair pair4 = (kotlin.Pair) map.get(str7);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (pair4 != null ? (java.lang.String) pair4.getFirst() : null))) {
                    if (Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), java.lang.Boolean.TRUE)) {
                        abstractC43914ryK.copydefault.setState(0);
                    } else {
                        abstractC43914ryK.copydefault.setState(3);
                        int iAEQbTJ2 = rQR.AEQbTJ.AEQbTJ(inputSelectAppModel.getTextColor(), roj.valueOf);
                        C55009xbp c55009xbpFIwbmz3 = abstractC43914ryK.copydefault.fIwbmz();
                        if (c55009xbpFIwbmz3 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz3.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                            c55001xbh.setTextColor(iAEQbTJ2);
                        }
                    }
                    if (roj.AEQbTJ) {
                        roj.copydefault = true;
                        if (roj.KWHzl) {
                            roj.KWHzl = false;
                            roj.AEQbTJ = true;
                        } else {
                            roj.AEQbTJ = false;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, rOJ roj, rAX rax, InputSelectAppModel inputSelectAppModel, AbstractC43914ryK abstractC43914ryK, C42156rIk c42156rIk) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(str) && roj.getVisibility() == 8) {
            roj.setVisibility(0);
            java.lang.Boolean required = inputSelectAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            java.lang.Boolean enabled = inputSelectAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!Intrinsics.EZpvd(enabled, bool)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz = abstractC43914ryK.copydefault.fIwbmz();
                if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                    c55001xbh2.setText("");
                }
                roj.EZpvd.setVisibility(8);
            }
            inputSelectAppModel.setHidden(bool);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(str) && roj.getVisibility() == 0) {
            roj.setVisibility(8);
            abstractC43914ryK.djBIcL.setVisibility(8);
            abstractC43914ryK.KWHzl.setVisibility(8);
            abstractC43914ryK.AEQbTJ.setVisibility(8);
            rax.EZpvd(false);
            if (!Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz2 = abstractC43914ryK.copydefault.fIwbmz();
                if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setText("");
                }
                roj.EZpvd.setVisibility(8);
            }
            inputSelectAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, rAX rax, AbstractC43914ryK abstractC43914ryK, AbstractC42074rFj abstractC42074rFj, java.util.Map map) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        kotlin.Pair pair = (kotlin.Pair) map.get(str);
        if (pair != null) {
            if (Intrinsics.EZpvd(rax.getValue(), pair.getFirst())) {
                return Unit.INSTANCE;
            }
            rax.setValue(pair.getFirst());
            C55009xbp c55009xbpFIwbmz = abstractC43914ryK.copydefault.fIwbmz();
            if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                c55001xbh.setText((java.lang.CharSequence) pair.getSecond());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> value = rgl.sSMYrx().getValue();
            if (value != null) {
                linkedHashMap.putAll(value);
            }
            linkedHashMap.put(str, new kotlin.Pair(pair.getSecond(), pair.getFirst()));
            rgl.sSMYrx().setValue(linkedHashMap);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InputSelectAppModel inputSelectAppModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("value", C33129mqd.gEmmrt(inputSelectAppModel.getValue()), true);
        eventParamsList.put("text", C33129mqd.gEmmrt(inputSelectAppModel.getValueName()), true);
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final Ref.BooleanRef booleanRef, final java.lang.String str, final rOJ roj, java.lang.String str2, java.lang.String str3, boolean z, final InputSelectAppModel inputSelectAppModel, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, final rAX rax, final java.util.List list, final AbstractC42074rFj abstractC42074rFj, final AbstractC43914ryK abstractC43914ryK, final Application application, final Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef5, android.view.View view) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "certificateType")) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_SelectID_Dropdown_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rOL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rOJ.copydefault((EventParamsList) obj);
                }
            });
        } else {
            C43693ruB.copydefault("KYC_InputSelect_Dropdown_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("viewId", str)));
        }
        java.util.Set setAhwBna = yEE.AhwBna("exchangeInfo", "countryOfResidence", "province", "nationality");
        android.content.Context context = roj.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        rRH rrh = new rRH(context, str2, str3, z, inputSelectAppModel.getDialogBottomText(), setAhwBna.contains(str), new Function0() { // from class: o.rOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rOJ.AEQbTJ(booleanRef);
            }
        }, new Function1() { // from class: o.rOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rOJ.KWHzl(rax, booleanRef, str, list, abstractC42074rFj, abstractC43914ryK, application, roj, inputSelectAppModel, objectRef, (rRH.TaskDescription) obj);
            }
        });
        rrh.showNow(fragmentManager, rRH.class.getCanonicalName());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getMain(), null, new InputSelectItemView$observe$1$1$1$12$2(roj, objectRef2, rrh, list, objectRef3, inputSelectAppModel, objectRef, objectRef4, rax, booleanRef2, abstractC42074rFj, objectRef5, null), 2, null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Ref.BooleanRef booleanRef) {
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, java.lang.String] */
    public static final Unit KWHzl(rAX rax, Ref.BooleanRef booleanRef, java.lang.String str, java.util.List list, AbstractC42074rFj abstractC42074rFj, AbstractC43914ryK abstractC43914ryK, Application application, rOJ roj, InputSelectAppModel inputSelectAppModel, Ref.ObjectRef objectRef, final rRH.TaskDescription taskDescription) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        PictureMeta pictureMetaValueOf;
        java.util.List<Picture> pictures;
        java.util.List<Picture> listAhwBna;
        java.lang.Integer spanCount;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (Intrinsics.EZpvd((java.lang.Object) rax.getValue(), (java.lang.Object) taskDescription.fetchVPNInfo())) {
            booleanRef.element = false;
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "certificateType")) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_Select_Id_Type", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rOY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rOJ.AEQbTJ(taskDescription, (EventParamsList) obj);
                }
            });
        }
        new C43739ruv().copydefault(str, C33129mqd.gEmmrt(taskDescription.fetchVPNInfo()), C33129mqd.gEmmrt(taskDescription.values()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            rRH.Dialog dialog = (rRH.Dialog) it.next();
            if (dialog instanceof rRH.TaskDescription) {
                rRH.TaskDescription taskDescription2 = (rRH.TaskDescription) dialog;
                taskDescription2.KWHzl(Intrinsics.EZpvd((java.lang.Object) taskDescription2.fetchVPNInfo(), (java.lang.Object) taskDescription.fetchVPNInfo()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rGL rgl = (rGL) abstractC42074rFj;
        java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> value = rgl.sSMYrx().getValue();
        if (value != null) {
            linkedHashMap.putAll(value);
        }
        linkedHashMap.put(str, new kotlin.Pair(taskDescription.values(), taskDescription.fetchVPNInfo()));
        rgl.zsXlph().clear();
        java.lang.String str2 = str;
        while (rgl.AxsJAY().containsKey(str2)) {
            java.lang.String str3 = rgl.AxsJAY().get(str);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put(str3, new kotlin.Pair("", ""));
            str2 = rgl.AxsJAY().get(str2);
            if (str2 == null) {
                str2 = "";
            }
            rgl.zsXlph().add(str2);
        }
        rgl.sSMYrx().setValue(linkedHashMap);
        java.lang.Boolean boolOLrzqt = taskDescription.OLrzqt();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolOLrzqt, bool) && (pictureMetaValueOf = taskDescription.valueOf()) != null && (pictures = pictureMetaValueOf.getPictures()) != null && (!pictures.isEmpty())) {
            abstractC43914ryK.KWHzl.setVisibility(0);
            PictureMeta pictureMetaValueOf2 = taskDescription.valueOf();
            int iIntValue = (pictureMetaValueOf2 == null || (spanCount = pictureMetaValueOf2.getSpanCount()) == null) ? 2 : spanCount.intValue();
            PictureMeta pictureMetaValueOf3 = taskDescription.valueOf();
            if (pictureMetaValueOf3 == null || (listAhwBna = pictureMetaValueOf3.getPictures()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            application.EZpvd(iIntValue, listAhwBna);
        } else {
            abstractC43914ryK.KWHzl.setVisibility(8);
        }
        if (taskDescription.AhwBna() != null) {
            abstractC43914ryK.AEQbTJ.setVisibility(0);
            android.widget.TextView textView = abstractC43914ryK.AYXKKw;
            ChoiceReminder choiceReminderAhwBna = taskDescription.AhwBna();
            textView.setText(choiceReminderAhwBna != null ? choiceReminderAhwBna.getTitle() : null);
            android.widget.TextView textView2 = abstractC43914ryK.AhwBna;
            ChoiceReminder choiceReminderAhwBna2 = taskDescription.AhwBna();
            textView2.setText(choiceReminderAhwBna2 != null ? choiceReminderAhwBna2.getContent() : null);
        } else {
            abstractC43914ryK.AEQbTJ.setVisibility(8);
        }
        roj.AEQbTJ = false;
        rax.setValue(taskDescription.fetchVPNInfo());
        inputSelectAppModel.setValueName(taskDescription.values());
        inputSelectAppModel.setCountryFlagUrl(taskDescription.copydefault());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.copydefault()) && C33129mqd.OLrzqt((java.lang.CharSequence) C43386roM.EZpvd.EZpvd()) && C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.fetchVPNInfo())) {
            roj.EZpvd.setVisibility(0);
            C42513rVq c42513rVq = roj.EZpvd;
            java.lang.String strCopydefault = taskDescription.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            c42513rVq.setData(strCopydefault);
        } else {
            roj.EZpvd.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.djBIcL())) {
            abstractC43914ryK.djBIcL.setVisibility(0);
            abstractC43914ryK.djBIcL.setText(taskDescription.djBIcL());
        } else {
            abstractC43914ryK.djBIcL.setVisibility(8);
        }
        rgl.gasjUx().setValue(new C42156rIk(taskDescription.AYXKKw(), taskDescription.EZpvd()));
        C55009xbp c55009xbpFIwbmz = abstractC43914ryK.copydefault.fIwbmz();
        if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
            c55001xbh.setText(taskDescription.values());
        }
        if (Intrinsics.EZpvd(taskDescription.fARcdN(), bool)) {
            objectRef.element = taskDescription.values();
        } else {
            objectRef.element = "";
        }
        abstractC42074rFj.KWHzl(new kotlin.Pair<>(inputSelectAppModel.getCustomId(), C33129mqd.OLrzqt((java.lang.CharSequence) objectRef.element) ? (java.lang.String) objectRef.element : null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(rRH.TaskDescription taskDescription, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("value", C33129mqd.gEmmrt(taskDescription.fetchVPNInfo()), true);
        eventParamsList.put("text", C33129mqd.gEmmrt(taskDescription.values()), true);
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj) {
        AbstractC43914ryK abstractC43914ryK;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55008xbo c55008xbo;
        C55009xbp c55009xbpFIwbmz;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C55009xbp c55009xbpFIwbmz2;
        C55009xbp c55009xbpFIwbmz3;
        C55009xbp c55009xbpFIwbmz4;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPadding(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AhwBna, uIComponentAppModel.getBottomMargin()));
        final InputSelectAppModel inputSelectAppModel = uIComponentAppModel instanceof InputSelectAppModel ? (InputSelectAppModel) uIComponentAppModel : null;
        if (inputSelectAppModel == null || (abstractC43914ryK = this.OLrzqt) == null) {
            return;
        }
        java.lang.Boolean enabled = inputSelectAppModel.getEnabled();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(enabled, bool)) {
            abstractC43914ryK.copydefault.setState(0);
        } else {
            abstractC43914ryK.copydefault.setState(3);
            java.lang.Integer numOLrzqt = rqr.OLrzqt(inputSelectAppModel.getTextColor(), this.valueOf);
            if (numOLrzqt != null) {
                int iIntValue = numOLrzqt.intValue();
                C55009xbp c55009xbpFIwbmz5 = abstractC43914ryK.copydefault.fIwbmz();
                if (c55009xbpFIwbmz5 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz5.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setTextColor(iIntValue);
                }
            }
        }
        java.lang.String label = inputSelectAppModel.getLabel();
        if (label != null) {
            if (inputSelectAppModel.getEditCtaButton() != null) {
                C55008xbo c55008xbo2 = abstractC43914ryK.copydefault;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                C42514rVr c42514rVr = new C42514rVr(context3, null, 0, 6, null);
                c42514rVr.setData(inputSelectAppModel.getEditCtaButton().getText(), label, new Function0() { // from class: o.rOQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rOJ.OLrzqt(abstractC42074rFj, inputSelectAppModel);
                    }
                });
                c55008xbo2.setLabelView(c42514rVr);
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) label)) {
                android.view.View viewIwGUEr = abstractC43914ryK.copydefault.iwGUEr();
                if (viewIwGUEr != null) {
                    viewIwGUEr.setVisibility(0);
                }
                abstractC43914ryK.copydefault.setLabelText(label);
            } else {
                android.view.View viewIwGUEr2 = abstractC43914ryK.copydefault.iwGUEr();
                if (viewIwGUEr2 != null) {
                    viewIwGUEr2.setVisibility(8);
                }
            }
        } else {
            android.view.View viewIwGUEr3 = abstractC43914ryK.copydefault.iwGUEr();
            if (viewIwGUEr3 != null) {
                viewIwGUEr3.setVisibility(8);
            }
        }
        java.lang.String placeholder = inputSelectAppModel.getPlaceholder();
        if (placeholder != null) {
            abstractC43914ryK.copydefault.setHintText(placeholder);
        }
        C55009xbp c55009xbpFIwbmz6 = abstractC43914ryK.copydefault.fIwbmz();
        if (c55009xbpFIwbmz6 != null) {
            c55009xbpFIwbmz6.addView(this.EZpvd, 0);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) inputSelectAppModel.getCountryFlagUrl()) && C33129mqd.OLrzqt((java.lang.CharSequence) C43386roM.EZpvd.EZpvd()) && C33129mqd.OLrzqt((java.lang.CharSequence) inputSelectAppModel.getValue())) {
            this.EZpvd.setVisibility(0);
            C42513rVq c42513rVq = this.EZpvd;
            java.lang.String countryFlagUrl = inputSelectAppModel.getCountryFlagUrl();
            c42513rVq.setData(countryFlagUrl != null ? countryFlagUrl : "");
        } else {
            this.EZpvd.setVisibility(8);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(C43662rtX.Application.djBIcL, typedValue, true);
        C55008xbo c55008xbo3 = abstractC43914ryK.copydefault;
        if (c55008xbo3 != null && (c55009xbpFIwbmz4 = c55008xbo3.fIwbmz()) != null) {
            C55009xbp.setIconImage$default(c55009xbpFIwbmz4, typedValue.resourceId, 0, 0, 0, 14, null);
        }
        C55008xbo c55008xbo4 = abstractC43914ryK.copydefault;
        if (c55008xbo4 != null && (c55009xbpFIwbmz3 = c55008xbo4.fIwbmz()) != null) {
            c55009xbpFIwbmz3.setImageTint(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
        }
        C55008xbo c55008xbo5 = abstractC43914ryK.copydefault;
        if (c55008xbo5 != null && (c55009xbpFIwbmz2 = c55008xbo5.fIwbmz()) != null) {
            c55009xbpFIwbmz2.setInterceptEvent(true);
        }
        abstractC43914ryK.copydefault.setSaveEnabled(false);
        C55009xbp c55009xbpFIwbmz7 = abstractC43914ryK.copydefault.fIwbmz();
        if (c55009xbpFIwbmz7 != null) {
            c55009xbpFIwbmz7.setSaveEnabled(false);
        }
        C55009xbp c55009xbpFIwbmz8 = abstractC43914ryK.copydefault.fIwbmz();
        if (c55009xbpFIwbmz8 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz8.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
            c55001xbh2.setSaveEnabled(false);
        }
        if (Intrinsics.EZpvd(inputSelectAppModel.getEnabled(), bool) || (c55008xbo = abstractC43914ryK.copydefault) == null || (c55009xbpFIwbmz = c55008xbo.fIwbmz()) == null) {
            return;
        }
        C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz, null, 0, 0, 6, null);
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, InputSelectAppModel inputSelectAppModel) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_Edit_Cor_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rOJ.AEQbTJ((EventParamsList) obj);
            }
        });
        abstractC42074rFj.AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(inputSelectAppModel.getEditCtaButton(), new DialogInformation("", false, null, 4, null))));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final class Application extends RecyclerView.Adapter<StateListAnimator> {
        public int AEQbTJ;
        public java.util.List<Picture> KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
  (r2v0 java.util.List)
 A[MD:(int, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Picture>):void (m)] (LINE:853) call: o.rOJ.Application.<init>(int, java.util.List):void type: THIS */
        public /* synthetic */ Application(int i, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i, list);
        }

        public Application(int i, @NotNull java.util.List<Picture> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = i;
            this.KWHzl = list;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC43862rxL abstractC43862rxLEZpvd = AbstractC43862rxL.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC43862rxLEZpvd, "");
            return new StateListAnimator(abstractC43862rxLEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.copydefault(i, this.AEQbTJ, this.KWHzl.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        public static /* synthetic */ void notifyDataChanged$default(Application application, int i, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 2;
            }
            application.EZpvd(i, list);
        }

        public final void EZpvd(int i, @NotNull java.util.List<Picture> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = i;
            this.KWHzl = list;
            notifyDataSetChanged();
        }
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC43862rxL EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC43862rxL abstractC43862rxL) {
            super(abstractC43862rxL.getRoot());
            Intrinsics.checkNotNullParameter(abstractC43862rxL, "");
            this.EZpvd = abstractC43862rxL;
        }

        public static /* synthetic */ void bindView$default(StateListAnimator stateListAnimator, int i, int i2, Picture picture, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 2;
            }
            stateListAnimator.copydefault(i, i2, picture);
        }

        public final void copydefault(int i, int i2, @NotNull Picture picture) {
            Intrinsics.checkNotNullParameter(picture, "");
            ViewGroup.LayoutParams layoutParams = this.EZpvd.copydefault.getLayoutParams();
            int iAEQbTJ = ((C33570myu.AEQbTJ() - (C55298xhM.dp2px$default(20.0f, null, 1, null) * 2)) - C55298xhM.dp2px$default(12.0f, null, 1, null)) / i2;
            layoutParams.width = iAEQbTJ;
            int width = picture.getWidth();
            int height = picture.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            int i3 = (iAEQbTJ * height) / width;
            layoutParams.height = i3;
            java.lang.String strKWHzl = C55297xhL.KWHzl(picture.getUrl(), "lfit", layoutParams.height, layoutParams.width);
            if (strKWHzl == null) {
                strKWHzl = picture.getUrl();
            }
            pUU.EZpvd("qjf", "position:" + i + ", ScreenWidth = " + C33570myu.AEQbTJ() + ", imgWidth=" + iAEQbTJ + ", imgHeight = " + i3 + ", idUrl=" + strKWHzl);
            int i4 = width > height ? C43662rtX.Activity.QKVWgx : C43662rtX.Activity.RJOkX;
            Glide.AEQbTJ(this.EZpvd.copydefault.getContext()).EZpvd(strKWHzl).KWHzl(i4).copydefault(i4).EZpvd(this.EZpvd.copydefault);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C55008xbo c55008xbo;
        super.onDetachedFromWindow();
        AbstractC43914ryK abstractC43914ryK = this.OLrzqt;
        if (abstractC43914ryK != null && (c55008xbo = abstractC43914ryK.copydefault) != null) {
            c55008xbo.setContentView((C55009xbp) null);
        }
        AbstractC43914ryK abstractC43914ryK2 = this.OLrzqt;
        if (abstractC43914ryK2 != null) {
            abstractC43914ryK2.unbind();
        }
        this.OLrzqt = null;
    }
}
