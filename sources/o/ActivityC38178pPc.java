package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$setUpObservers$1;
import com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$setUpObservers$2;
import com.okinc.lifecycle.ui.debug.H5DeeplinkDebugViewModel;
import com.okinc.uilab.edit.OKEditText;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.pKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC38178pPc extends AbstractActivityC38192pPq implements pOV {
    public RecyclerView AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public C55230xfy EZpvd;
    public C52794wYp KWHzl;
    public final java.util.List<C38092pLy> OLrzqt = new java.util.ArrayList();
    public pOU copydefault;

    public ActivityC38178pPc() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(H5DeeplinkDebugViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.pPq.EZpvd()V */
    public final H5DeeplinkDebugViewModel EZpvd() {
        return (H5DeeplinkDebugViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractActivityC38192pPq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pKK.ActionBar.copydefault);
        this.KWHzl = (C52794wYp) findViewById(pKK.StateListAnimator.fJNWhG);
        ((android.widget.ImageView) findViewById(pKK.StateListAnimator.DbNXlk)).setOnClickListener(new View.OnClickListener() { // from class: o.pPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC38178pPc.AEQbTJ(this.OLrzqt, view);
            }
        });
        this.EZpvd = (C55230xfy) findViewById(pKK.StateListAnimator.getNewProxyInstance);
        this.AEQbTJ = (RecyclerView) findViewById(pKK.StateListAnimator.values);
        C55230xfy c55230xfy = this.EZpvd;
        C52794wYp c52794wYp = null;
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        c55230xfy.EZpvd().addTextChangedListener(new ActionBar());
        AEQbTJ();
        EZpvd().copydefault();
        valueOf();
        C52794wYp c52794wYp2 = this.KWHzl;
        if (c52794wYp2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c52794wYp = c52794wYp2;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC38178pPc.OLrzqt(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(ActivityC38178pPc activityC38178pPc, android.view.View view) {
        activityC38178pPc.finish();
    }

    public static final void OLrzqt(ActivityC38178pPc activityC38178pPc, android.view.View view) {
        activityC38178pPc.OLrzqt();
    }

    public final void OLrzqt() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle("Enter H5 Url to trigger in webview");
        viewOnClickListenerC54939xaY.KWHzl(pKK.ActionBar.AYXKKw);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) "Execute", new View.OnClickListener() { // from class: o.pPg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC38178pPc.copydefault(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.lifecycle.ui.debug.H5DeeplinkDebugViewModel.processUrl$default(com.okinc.lifecycle.ui.debug.H5DeeplinkDebugViewModel, java.lang.String, int, java.lang.Object):void */
    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC38178pPc activityC38178pPc, android.view.View view) {
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo = (C55008xbo) viewOnClickListenerC54939xaY.findViewById(pKK.StateListAnimator.gEmmrt);
        java.lang.String strGEmmrt = C33129mqd.gEmmrt((c55008xbo == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) ? null : c55001xbhAkhnZx.getText());
        if (strGEmmrt.length() > 0) {
            activityC38178pPc.EZpvd().copydefault(strGEmmrt);
        } else {
            H5DeeplinkDebugViewModel.processUrl$default(activityC38178pPc.EZpvd(), null, 1, null);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.pPc$ActionBar */
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
            ActivityC38178pPc.this.OLrzqt(java.lang.String.valueOf(editable));
        }
    }

    public final void AEQbTJ() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new H5DeeplinkDebugActivity$setUpObservers$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new H5DeeplinkDebugActivity$setUpObservers$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        this.OLrzqt.clear();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            java.util.List<C38092pLy> list = this.OLrzqt;
            java.util.List<C38092pLy> value = EZpvd().EZpvd().getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                C38092pLy c38092pLy = (C38092pLy) obj;
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c38092pLy.EZpvd(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c38092pLy.OLrzqt(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c38092pLy.KWHzl(), (java.lang.CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            list.addAll(arrayList);
        } else {
            this.OLrzqt.addAll(EZpvd().EZpvd().getValue());
        }
        pOU pou = this.copydefault;
        if (pou != null) {
            pou.notifyDataSetChanged();
        }
    }

    private final void valueOf() {
        RecyclerView recyclerView = this.AEQbTJ;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.copydefault = new pOU(this.OLrzqt, this);
        RecyclerView recyclerView3 = this.AEQbTJ;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.copydefault);
        RecyclerView recyclerView4 = this.AEQbTJ;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.addItemDecoration(new C57593ylO(10, false, false, 6, null));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    @Override // o.pOV
    public void copydefault(@NotNull final C38092pLy c38092pLy) {
        Intrinsics.checkNotNullParameter(c38092pLy, "");
        java.util.List<java.lang.String> listKWHzl = KWHzl(c38092pLy.KWHzl());
        if (!listKWHzl.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter Key-Value Pairs for Deeplink");
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            final java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : listKWHzl) {
                OKEditText oKEditText = new OKEditText(this, null, 0, 6, null);
                oKEditText.setHint(str);
                oKEditText.setMaxLines(1);
                oKEditText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,_-:/"));
                oKEditText.setRawInputType(1);
                oKEditText.setLayoutParams(layoutParams);
                map.put(str, oKEditText);
                linearLayout.addView(oKEditText);
            }
            builder.setView(linearLayout);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = c38092pLy.KWHzl();
            builder.setPositiveButton("Execute", new DialogInterface.OnClickListener() { // from class: o.pPd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    ActivityC38178pPc.KWHzl(map, c38092pLy, objectRef, this, dialogInterface, i);
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.pPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    ActivityC38178pPc.copydefault(dialogInterface, i);
                }
            });
            builder.create().show();
            return;
        }
        EZpvd().copydefault(C38187pPl.copydefault() + c38092pLy.EZpvd());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    public static final void KWHzl(java.util.HashMap map, C38092pLy c38092pLy, Ref.ObjectRef objectRef, ActivityC38178pPc activityC38178pPc, android.content.DialogInterface dialogInterface, int i) {
        java.util.Set<Map.Entry> setEntrySet = map.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        for (Map.Entry entry : setEntrySet) {
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.String str = (java.lang.String) key;
            java.lang.Object value = entry.getValue();
            Intrinsics.copydefault(value, "");
            java.lang.String strValueOf = java.lang.String.valueOf(((OKEditText) value).getText());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
                objectRef.element = C59449zhJ.replace$default((java.lang.String) objectRef.element, "{" + str + "}", strValueOf, false, 4, (java.lang.Object) null);
            }
        }
        activityC38178pPc.EZpvd().copydefault(C38187pPl.copydefault() + c38092pLy.EZpvd() + objectRef.element);
        dialogInterface.dismiss();
    }

    public static final void copydefault(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    public final java.util.List<java.lang.String> KWHzl(java.lang.String str) {
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(Regex.findAll$default(new Regex("\\{([^}]+)\\}"), str, 0, 2, null), new Function1() { // from class: o.pPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38178pPc.OLrzqt((MatchResult) obj);
            }
        }));
    }

    public static final java.lang.String OLrzqt(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.OLrzqt().get(1);
    }

    @Override // o.AbstractActivityC38192pPq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38192pPq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC38192pPq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC38192pPq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
