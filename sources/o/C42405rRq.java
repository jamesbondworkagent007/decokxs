package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressField;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.presentation.views.costomUIView.AddressSearchBottomSheet$searchAddress$1;
import com.okinc.uilab.edit.OKEditText;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C32113mPz;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42405rRq extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;
    public AbstractC43842rws AYXKKw;
    public java.lang.String AhwBna;
    public AddressAutoComplete EZpvd;
    public Function2<? super java.util.HashMap<java.lang.String, java.lang.String>, ? super java.lang.String, Unit> KWHzl;
    public Job djBIcL;
    public java.lang.String valueOf;
    public final C59534zip OLrzqt = new C59534zip();
    public final java.util.ArrayList<java.lang.String> gEmmrt = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super java.util.HashMap<java.lang.String, java.lang.String>, ? super java.lang.String, Unit> function2) {
        this.KWHzl = function2;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    /* JADX INFO: renamed from: o.rRq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rRq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C42405rRq copydefault(@NotNull AddressAutoComplete addressAutoComplete, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(addressAutoComplete, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C42405rRq c42405rRq = new C42405rRq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", addressAutoComplete);
            bundle.putString("title", str);
            bundle.putString("input_data", str2);
            c42405rRq.setArguments(bundle);
            return c42405rRq;
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
        android.view.Window window2;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null && (viewGroup = (android.view.ViewGroup) window2.findViewById(C32113mPz.FragmentManager.isConnected)) != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(21);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        android.view.View decorView;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.rRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C42405rRq.OLrzqt(this.EZpvd, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat OLrzqt(C42405rRq c42405rRq, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        AbstractC43842rws abstractC43842rws = c42405rRq.AYXKKw;
        if (abstractC43842rws == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws = null;
        }
        abstractC43842rws.OLrzqt.setPaddingRelative(0, 0, 0, i);
        return windowInsetsCompat;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? (AddressAutoComplete) arguments.getParcelable("data") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AhwBna = arguments2 != null ? arguments2.getString("title") : null;
        android.os.Bundle arguments3 = getArguments();
        this.valueOf = arguments3 != null ? arguments3.getString("input_data") : null;
        setStyle(0, C32113mPz.Dialog.EZpvd);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.rRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C42405rRq.copydefault(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(C42405rRq c42405rRq, android.view.View view) {
        c42405rRq.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC43842rws abstractC43842rws = (AbstractC43842rws) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.hDKMBd, constraintLayout, false);
        this.AYXKKw = abstractC43842rws;
        if (abstractC43842rws == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws = null;
        }
        constraintLayout.addView(abstractC43842rws.getRoot(), new FrameLayout.LayoutParams(-1, -1));
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

    private final void KWHzl() {
        this.OLrzqt.register(AddressSearchBean.class, new C42410rRv(new Function2() { // from class: o.rRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C42405rRq.AEQbTJ(this.KWHzl, (AddressSearchBean) obj, (java.lang.String) obj2);
            }
        }));
        this.OLrzqt.register(java.lang.String.class, new C42404rRp(new Function1() { // from class: o.rRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42405rRq.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }));
        AbstractC43842rws abstractC43842rws = this.AYXKKw;
        AbstractC43842rws abstractC43842rws2 = null;
        if (abstractC43842rws == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws = null;
        }
        abstractC43842rws.OLrzqt.setLayoutManager(C33047mpA.KWHzl(requireActivity()));
        AbstractC43842rws abstractC43842rws3 = this.AYXKKw;
        if (abstractC43842rws3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws3 = null;
        }
        abstractC43842rws3.OLrzqt.setAdapter(this.OLrzqt);
        AbstractC43842rws abstractC43842rws4 = this.AYXKKw;
        if (abstractC43842rws4 == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws4 = null;
        }
        final C55230xfy c55230xfy = abstractC43842rws4.AEQbTJ;
        c55230xfy.KWHzl().addTextChangedListener(new ActionBar());
        c55230xfy.KWHzl().post(new java.lang.Runnable() { // from class: o.rRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C42405rRq.EZpvd(c55230xfy);
            }
        });
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna)) {
            AbstractC43842rws abstractC43842rws5 = this.AYXKKw;
            if (abstractC43842rws5 == null) {
                Intrinsics.gEmmrt("");
                abstractC43842rws5 = null;
            }
            abstractC43842rws5.AEQbTJ.KWHzl().setHint(this.AhwBna);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf)) {
            AbstractC43842rws abstractC43842rws6 = this.AYXKKw;
            if (abstractC43842rws6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC43842rws2 = abstractC43842rws6;
            }
            abstractC43842rws2.AEQbTJ.KWHzl().setText(this.valueOf);
            return;
        }
        AbstractC43842rws abstractC43842rws7 = this.AYXKKw;
        if (abstractC43842rws7 == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws7 = null;
        }
        abstractC43842rws7.EZpvd.setVisibility(0);
        AbstractC43842rws abstractC43842rws8 = this.AYXKKw;
        if (abstractC43842rws8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43842rws2 = abstractC43842rws8;
        }
        abstractC43842rws2.OLrzqt.setVisibility(8);
    }

    public static final Unit AEQbTJ(C42405rRq c42405rRq, AddressSearchBean addressSearchBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(addressSearchBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        c42405rRq.KWHzl(addressSearchBean, str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42405rRq c42405rRq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC43842rws abstractC43842rws = c42405rRq.AYXKKw;
        if (abstractC43842rws == null) {
            Intrinsics.gEmmrt("");
            abstractC43842rws = null;
        }
        c42405rRq.KWHzl(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) abstractC43842rws.AEQbTJ.EZpvd().getText().toString()).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rRq$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            AbstractC43842rws abstractC43842rws = C42405rRq.this.AYXKKw;
            AbstractC43842rws abstractC43842rws2 = null;
            if (abstractC43842rws == null) {
                Intrinsics.gEmmrt("");
                abstractC43842rws = null;
            }
            java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) abstractC43842rws.AEQbTJ.EZpvd().getText().toString()).toString();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                AbstractC43842rws abstractC43842rws3 = C42405rRq.this.AYXKKw;
                if (abstractC43842rws3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43842rws3 = null;
                }
                abstractC43842rws3.EZpvd.setVisibility(0);
                AbstractC43842rws abstractC43842rws4 = C42405rRq.this.AYXKKw;
                if (abstractC43842rws4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC43842rws2 = abstractC43842rws4;
                }
                abstractC43842rws2.OLrzqt.setVisibility(8);
            } else {
                AbstractC43842rws abstractC43842rws5 = C42405rRq.this.AYXKKw;
                if (abstractC43842rws5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43842rws5 = null;
                }
                abstractC43842rws5.EZpvd.setVisibility(8);
                AbstractC43842rws abstractC43842rws6 = C42405rRq.this.AYXKKw;
                if (abstractC43842rws6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC43842rws2 = abstractC43842rws6;
                }
                abstractC43842rws2.OLrzqt.setVisibility(0);
            }
            C42405rRq.this.AEQbTJ().add(string);
            C42405rRq.this.EZpvd(string);
        }
    }

    public static final void EZpvd(C55230xfy c55230xfy) {
        OKEditText oKEditTextKWHzl = c55230xfy.KWHzl();
        oKEditTextKWHzl.requestFocus();
        android.text.Editable text = oKEditTextKWHzl.getText();
        oKEditTextKWHzl.setSelection(text != null ? text.length() : 0);
        java.lang.Object systemService = oKEditTextKWHzl.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(oKEditTextKWHzl, 0);
        }
    }

    public final void KWHzl(AddressSearchBean addressSearchBean, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        for (AddressField addressField : addressSearchBean.getAutoCompleteAddress().getFields()) {
            map.put(addressField.getId(), addressField.getValue());
        }
        Function2<? super java.util.HashMap<java.lang.String, java.lang.String>, ? super java.lang.String, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            function2.invoke(map, str);
        }
        dismissAllowingStateLoss();
    }

    public final void KWHzl(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("roadAddress", str);
        map.put("useEnteredValues", "true");
        Function2<? super java.util.HashMap<java.lang.String, java.lang.String>, ? super java.lang.String, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            function2.invoke(map, str);
        }
        dismissAllowingStateLoss();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            EZpvd();
            return;
        }
        if (this.EZpvd == null) {
            pUU.KWHzl("AddressSearchBottomSheet", "data = null");
            return;
        }
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AddressAutoComplete addressAutoComplete = this.EZpvd;
        Intrinsics.copydefault(addressAutoComplete);
        java.util.Map<java.lang.String, java.lang.String> listUriParams = addressAutoComplete.getListUriParams();
        java.util.HashMap map = listUriParams instanceof java.util.HashMap ? (java.util.HashMap) listUriParams : null;
        if (map != null) {
        }
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new AddressSearchBottomSheet$searchAddress$1(this, str, null), 2, null);
    }

    public final void copydefault(java.lang.String str, AutoCompleteAddresses autoCompleteAddresses) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = autoCompleteAddresses.getResults().iterator();
        while (it.hasNext()) {
            arrayList.add(new AddressSearchBean((AutoCompleteAddress) it.next(), str));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            arrayList.add(str);
        }
        this.OLrzqt.setItems(arrayList);
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void EZpvd() {
        this.OLrzqt.setItems(new java.util.ArrayList());
        this.OLrzqt.notifyDataSetChanged();
    }
}
