package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.InputCardItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC42074rFj;
import o.AbstractC43310rmq;
import o.AbstractC43931ryb;
import o.AbstractC43933ryd;
import o.C31695mAm;
import o.C33047mpA;
import o.C33070mpX;
import o.C33129mqd;
import o.C42156rIk;
import o.C42179rJg;
import o.C42519rVw;
import o.C43312rms;
import o.C43316rmw;
import o.C43662rtX;
import o.C52761wXj;
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
public final class InputCardItemView extends FrameLayout {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final AbstractC43931ryb AEQbTJ;
    public final ArrayList<Value> EZpvd;
    public final C42519rVw KWHzl;
    public final C43316rmw OLrzqt;
    public ViewStatus valueOf;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputCardItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputCardItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.valueOf = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: com.okinc.ok_kyc_core.presentation.views.InputCardItemView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ InputCardItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = ViewStatus.Form;
        this.EZpvd = new ArrayList<>();
        this.OLrzqt = new C43316rmw();
        this.KWHzl = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C43662rtX.TaskDescription.ODWQjV, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43931ryb) viewDataBindingInflate;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.presentation.views.InputCardItemView.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Boolean required;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputCardAppModel inputCardAppModel = uIComponentAppModel instanceof InputCardAppModel ? (InputCardAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((Object) rax.OLrzqt(), (Object) (inputCardAppModel != null ? inputCardAppModel.getId() : null))) {
                    if (inputCardAppModel != null && Intrinsics.EZpvd(inputCardAppModel.isHidden(), Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        rax.EZpvd((inputCardAppModel == null || (required = inputCardAppModel.getRequired()) == null) ? false : required.booleanValue());
                        String value = inputCardAppModel != null ? inputCardAppModel.getValue() : null;
                        if (!Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rMW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return InputCardItemView.copydefault(inputCardAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    this.OLrzqt.register(Value.class, new Application(this, new Function1() { // from class: o.rMV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return InputCardItemView.OLrzqt(rax, inputCardAppModel, (Value) obj);
                        }
                    }));
                    EZpvd((String) rax.getValue());
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(InputCardAppModel inputCardAppModel, InputCardItemView inputCardItemView, rAX rax, C42156rIk c42156rIk) {
        Boolean required;
        List<String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listCopydefault), inputCardAppModel != null ? inputCardAppModel.getId() : null) && inputCardItemView.getVisibility() == 8) {
                inputCardItemView.setVisibility(0);
                rax.EZpvd((inputCardAppModel == null || (required = inputCardAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (inputCardAppModel != null) {
                    inputCardAppModel.setValue(null);
                }
                inputCardItemView.EZpvd((String) rax.getValue());
                if (inputCardAppModel != null) {
                    inputCardAppModel.setHidden(Boolean.FALSE);
                }
            }
        }
        List<String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listKWHzl), inputCardAppModel != null ? inputCardAppModel.getId() : null) && inputCardItemView.getVisibility() == 0) {
                inputCardItemView.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (inputCardAppModel != null) {
                    inputCardAppModel.setValue(null);
                }
                inputCardItemView.EZpvd((String) rax.getValue());
                if (inputCardAppModel != null) {
                    inputCardAppModel.setHidden(Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, InputCardAppModel inputCardAppModel, Value value) {
        rax.setValue(value != null ? value.getValue() : null);
        if (inputCardAppModel != null) {
            inputCardAppModel.setValue(value != null ? value.getValue() : null);
        }
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.valueOf, uIComponentAppModel.getBottomMargin()));
        InputCardAppModel inputCardAppModel = uIComponentAppModel instanceof InputCardAppModel ? (InputCardAppModel) uIComponentAppModel : null;
        if (inputCardAppModel != null) {
            String label = inputCardAppModel.getLabel();
            if (label != null) {
                this.AEQbTJ.copydefault.setText(label);
                this.AEQbTJ.copydefault.setTextSize(0, 36.0f);
            }
            C31695mAm c31695mAm = this.AEQbTJ.EZpvd;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.OLrzqt);
            Choices choices = inputCardAppModel.getChoices();
            if (choices != null) {
                List<Value> values = choices.getValues();
                if (values != null) {
                    this.EZpvd.addAll(values);
                }
                this.OLrzqt.setItems(this.EZpvd);
                this.OLrzqt.notifyDataSetChanged();
            }
        }
    }

    public final void EZpvd(String str) {
        Iterator<Value> it = this.EZpvd.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value = next;
            value.setSelected(Boolean.valueOf(Intrinsics.EZpvd((Object) str, (Object) value.getValue())));
        }
        this.OLrzqt.notifyDataSetChanged();
    }

    public final class Application extends AbstractC43310rmq<Value, AbstractC43933ryd> {
        public final Function1<Value, Unit> AEQbTJ;
        public final /* synthetic */ InputCardItemView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.ffGIBT;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.Value, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull InputCardItemView inputCardItemView, Function1<? super Value, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = inputCardItemView;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43933ryd> c43312rms, @NotNull final Value value) {
            Drawable drawableCopydefault;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(value, "");
            super.onBindViewHolder((C43312rms) c43312rms, value);
            ((AbstractC43933ryd) c43312rms.OLrzqt()).copydefault.setText(value.getText());
            String icon = value.getIcon();
            if (icon != null) {
                if (icon.length() > 0) {
                    ((AbstractC43933ryd) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
                    ((AbstractC43933ryd) c43312rms.OLrzqt()).OLrzqt.setText(icon);
                } else {
                    ((AbstractC43933ryd) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
                }
            }
            if (Intrinsics.EZpvd(value.getSelected(), Boolean.TRUE)) {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).EZpvd.setBackgroundResource(C43662rtX.Activity.DbNXlk);
            } else {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).EZpvd.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43933ryd) c43312rms.OLrzqt()).EZpvd;
            final InputCardItemView inputCardItemView = this.OLrzqt;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: o.rMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    InputCardItemView.Application.KWHzl(value, inputCardItemView, this, view);
                }
            });
            String graphic = value.getGraphic();
            if (graphic != null && (drawableCopydefault = this.OLrzqt.copydefault(graphic)) != null) {
                if (!Intrinsics.EZpvd((Object) graphic, (Object) Icon.OKX_WALLET_IMAGE.getNameValue())) {
                    DrawableCompat.setTint(drawableCopydefault, C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
                }
                ((AbstractC43933ryd) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableCopydefault);
            }
            if (C33129mqd.OLrzqt((CharSequence) value.getTip())) {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).AYXKKw.setVisibility(0);
                ((AbstractC43933ryd) c43312rms.OLrzqt()).AYXKKw.setText(value.getTip());
            } else {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).AYXKKw.setVisibility(8);
            }
            if (getPosition(c43312rms) == 0) {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).djBIcL.setVisibility(8);
            } else {
                ((AbstractC43933ryd) c43312rms.OLrzqt()).djBIcL.setVisibility(0);
            }
        }

        public static final void KWHzl(Value value, InputCardItemView inputCardItemView, Application application, View view) {
            if (Intrinsics.EZpvd(value.getSelected(), Boolean.FALSE)) {
                inputCardItemView.EZpvd(value.getValue());
                application.AEQbTJ.invoke(value);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Icon {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        private final int imageId;
        private final String nameValue;
        public static final Icon CARD_ID_CARD = new Icon("CARD_ID_CARD", 0, "ID_CARD", C43662rtX.PendingIntent.AuCTelauCTel);
        public static final Icon CARD_PASSPORT = new Icon("CARD_PASSPORT", 1, "PASSPORT", C43662rtX.PendingIntent.zLjUOn);
        public static final Icon CARD_DRIVING_LICENSE = new Icon("CARD_DRIVING_LICENSE", 2, "DRIVING_LICENSE", C43662rtX.PendingIntent.AubY);
        public static final Icon PORTFOLIO = new Icon("PORTFOLIO", 3, "PORTFOLIO", C43662rtX.PendingIntent.wlaJM);
        public static final Icon ADDRESS_BOOK = new Icon("ADDRESS_BOOK", 4, "ADDRESS_BOOK", C43662rtX.PendingIntent.iwGUEr);
        public static final Icon OKX_WALLET_IMAGE = new Icon("OKX_WALLET_IMAGE", 5, "OKX_WALLET_IMAGE", C43662rtX.PendingIntent.zsXlph);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Icon[] $values() {
            return new Icon[]{CARD_ID_CARD, CARD_PASSPORT, CARD_DRIVING_LICENSE, PORTFOLIO, ADDRESS_BOOK, OKX_WALLET_IMAGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Icon> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNameValue() {
            return this.nameValue;
        }

        private Icon(String str, @IdRes int i, String str2, int i2) {
            this.nameValue = str2;
            this.imageId = i2;
        }

        static {
            Icon[] iconArr$values = $values();
            $VALUES = iconArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(iconArr$values);
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public final Drawable copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (Icon icon : Icon.values()) {
            if (Intrinsics.EZpvd((Object) icon.getNameValue(), (Object) str)) {
                return this.KWHzl.OLrzqt(icon.getImageId());
            }
        }
        return this.KWHzl.OLrzqt(C43662rtX.PendingIntent.AuCTelauCTel);
    }
}
