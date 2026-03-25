package o;

import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderGroupBean;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderTitleBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C43662rtX;
import o.rSG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rSG extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public Function1<? super ExchangeReminderBean, Unit> KWHzl;
    public AbstractC43843rwt gEmmrt;
    public final C59534zip EZpvd = new C59534zip();
    public final LinkedHashMap<ExchangeReminderTitleBean, java.util.ArrayList<ExchangeReminderBean>> OLrzqt = new LinkedHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super ExchangeReminderBean, Unit> function1) {
        this.KWHzl = function1;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rSG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final rSG OLrzqt() {
            return new rSG();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33570myu.copydefault((android.app.Activity) activity);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (viewGroup = (android.view.ViewGroup) window.findViewById(C32113mPz.FragmentManager.isConnected)) == null) {
            return;
        }
        viewGroup.setBackgroundResource(android.R.color.transparent);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        copydefault();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(48);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC43843rwt abstractC43843rwt = (AbstractC43843rwt) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.AuCTelauCTel, constraintLayout, false);
        this.gEmmrt = abstractC43843rwt;
        if (abstractC43843rwt == null) {
            Intrinsics.gEmmrt("");
            abstractC43843rwt = null;
        }
        constraintLayout.addView(abstractC43843rwt.getRoot(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        C33570myu.copydefault((android.app.Activity) getActivity());
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void copydefault() {
        this.EZpvd.register(ExchangeReminderBean.class, new rSJ(new Function1() { // from class: o.rSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSG.EZpvd(this.AEQbTJ, (ExchangeReminderBean) obj);
            }
        }));
        this.EZpvd.register(ExchangeReminderTitleBean.class, new rSK());
        AbstractC43843rwt abstractC43843rwt = this.gEmmrt;
        AbstractC43843rwt abstractC43843rwt2 = null;
        if (abstractC43843rwt == null) {
            Intrinsics.gEmmrt("");
            abstractC43843rwt = null;
        }
        abstractC43843rwt.AEQbTJ.setLayoutManager(C33047mpA.KWHzl(requireActivity()));
        AbstractC43843rwt abstractC43843rwt3 = this.gEmmrt;
        if (abstractC43843rwt3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43843rwt3 = null;
        }
        abstractC43843rwt3.AEQbTJ.setAdapter(this.EZpvd);
        OLrzqt();
        AbstractC43843rwt abstractC43843rwt4 = this.gEmmrt;
        if (abstractC43843rwt4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43843rwt2 = abstractC43843rwt4;
        }
        abstractC43843rwt2.EZpvd.KWHzl().addTextChangedListener(new Application());
    }

    public static final Unit EZpvd(rSG rsg, ExchangeReminderBean exchangeReminderBean) {
        Intrinsics.checkNotNullParameter(exchangeReminderBean, "");
        rsg.EZpvd(exchangeReminderBean);
        return Unit.INSTANCE;
    }

    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            InterfaceC58217yxC interfaceC58217yxC = rSG.this.AYXKKw;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            rSG rsg = rSG.this;
            AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
            final rSG rsg2 = rSG.this;
            final Function1 function1 = new Function1() { // from class: o.rSP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rSG.Application.EZpvd(rsg2, (java.lang.Long) obj);
                }
            };
            rsg.AYXKKw = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.rSM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    rSG.Application.KWHzl(function1, obj);
                }
            });
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(rSG rsg, java.lang.Long l) {
            AbstractC43843rwt abstractC43843rwt = rsg.gEmmrt;
            if (abstractC43843rwt == null) {
                Intrinsics.gEmmrt("");
                abstractC43843rwt = null;
            }
            rsg.AEQbTJ(abstractC43843rwt.EZpvd.EZpvd().getText().toString());
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<ExchangeReminderTitleBean, java.util.ArrayList<ExchangeReminderBean>> entry : this.OLrzqt.entrySet()) {
            ExchangeReminderTitleBean key = entry.getKey();
            java.util.ArrayList<ExchangeReminderBean> value = entry.getValue();
            arrayList.add(key);
            arrayList.addAll(value);
        }
        this.EZpvd.setItems(arrayList);
        this.EZpvd.notifyDataSetChanged();
        AbstractC43843rwt abstractC43843rwt = this.gEmmrt;
        if (abstractC43843rwt == null) {
            Intrinsics.gEmmrt("");
            abstractC43843rwt = null;
        }
        abstractC43843rwt.AEQbTJ.requestLayout();
    }

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
    public final void AEQbTJ(java.lang.String str) {
        if (str.length() == 0) {
            OLrzqt();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<Map.Entry<ExchangeReminderTitleBean, java.util.ArrayList<ExchangeReminderBean>>> it = this.OLrzqt.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<ExchangeReminderTitleBean, java.util.ArrayList<ExchangeReminderBean>> next = it.next();
            ExchangeReminderTitleBean key = next.getKey();
            java.util.ArrayList<ExchangeReminderBean> value = next.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((ExchangeReminderBean) obj).getExchangeName(), (java.lang.CharSequence) str, true)) {
                    arrayList2.add(obj);
                }
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                linkedHashMap.put(new ExchangeReminderTitleBean(key.getName(), linkedHashMap.size() != 0), arrayList2);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ExchangeReminderTitleBean exchangeReminderTitleBean = (ExchangeReminderTitleBean) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            arrayList.add(exchangeReminderTitleBean);
            arrayList.addAll(list);
        }
        AbstractC43843rwt abstractC43843rwt = this.gEmmrt;
        if (abstractC43843rwt == null) {
            Intrinsics.gEmmrt("");
            abstractC43843rwt = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC43843rwt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.EZpvd.setItems(arrayList);
        this.EZpvd.notifyDataSetChanged();
    }

    private final void KWHzl() {
        ExchangeReminderTitleBean exchangeReminderTitleBean;
        int i = 0;
        for (java.lang.Object obj : rSO.Companion.OLrzqt()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ExchangeReminderGroupBean exchangeReminderGroupBean = (ExchangeReminderGroupBean) obj;
            if (i == 0) {
                exchangeReminderTitleBean = new ExchangeReminderTitleBean(exchangeReminderGroupBean.getName(), false);
            } else {
                exchangeReminderTitleBean = new ExchangeReminderTitleBean(exchangeReminderGroupBean.getName(), true);
            }
            this.OLrzqt.put(exchangeReminderTitleBean, new java.util.ArrayList<>(exchangeReminderGroupBean.getValues()));
            i++;
        }
    }

    public final void EZpvd(ExchangeReminderBean exchangeReminderBean) {
        Function1<? super ExchangeReminderBean, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(exchangeReminderBean);
        }
        dismissAllowingStateLoss();
    }
}
