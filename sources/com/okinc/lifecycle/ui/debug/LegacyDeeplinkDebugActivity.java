package com.okinc.lifecycle.ui.debug;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.lifecycle.ui.debug.LegacyDeeplinkDebugActivity;
import com.okinc.uilab.edit.OKEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractActivityC38194pPs;
import o.AbstractC43238rlX;
import o.C33129mqd;
import o.C33134mqi;
import o.C34704nhP;
import o.C38119pMy;
import o.C43251rlk;
import o.C55230xfy;
import o.C57593ylO;
import o.C6832aWn;
import o.InterfaceC38114pMt;
import o.InterfaceC43294rma;
import o.pKK;
import o.pPF;
import o.pPO;
import o.yCM;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LegacyDeeplinkDebugActivity extends AbstractActivityC38194pPs {
    public TextView AEQbTJ;
    public RecyclerView AYXKKw;

    @yCM
    public InterfaceC38114pMt deeplinkLegacyFlowUseCase;
    public C55230xfy gEmmrt;
    public ActionBar valueOf;
    public final List<pPF> AhwBna = new ArrayList();
    public final List<pPF> djBIcL = new ArrayList();
    public final String isConnected = (String) yDV.AubY(C34704nhP.copydefault.KWHzl());

    /* JADX DEBUG: Possible override for method o.pPs.EZpvd()V */
    public final InterfaceC38114pMt EZpvd() {
        InterfaceC38114pMt interfaceC38114pMt = this.deeplinkLegacyFlowUseCase;
        if (interfaceC38114pMt != null) {
            return interfaceC38114pMt;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC38194pPs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pKK.ActionBar.KWHzl);
        this.AEQbTJ = (TextView) findViewById(pKK.StateListAnimator.AYXKKw);
        ((ImageView) findViewById(pKK.StateListAnimator.DbNXlk)).setOnClickListener(new View.OnClickListener() { // from class: o.pPu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                LegacyDeeplinkDebugActivity.copydefault(this.AEQbTJ, view);
            }
        });
        this.gEmmrt = (C55230xfy) findViewById(pKK.StateListAnimator.getNewProxyInstance);
        this.AYXKKw = (RecyclerView) findViewById(pKK.StateListAnimator.djBIcL);
        C55230xfy c55230xfy = this.gEmmrt;
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        c55230xfy.EZpvd().addTextChangedListener(new StateListAnimator());
        AhwBna();
    }

    public static final void copydefault(LegacyDeeplinkDebugActivity legacyDeeplinkDebugActivity, View view) {
        legacyDeeplinkDebugActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(String str) {
        this.djBIcL.clear();
        if (str.length() == 0) {
            this.djBIcL.addAll(this.AhwBna);
        } else {
            for (pPF ppf : this.AhwBna) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) ppf.AEQbTJ(), (CharSequence) str, true)) {
                    this.djBIcL.add(ppf);
                }
            }
        }
        ActionBar actionBar = this.valueOf;
        if (actionBar != null) {
            actionBar.notifyDataSetChanged();
        }
        TextView textView = this.AEQbTJ;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText("Total Legacy Deeplinks : " + this.AhwBna.size());
    }

    public static final class StateListAnimator implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LegacyDeeplinkDebugActivity.this.EZpvd(String.valueOf(editable));
        }
    }

    private final void AhwBna() {
        this.AhwBna.clear();
        InterfaceC38114pMt interfaceC38114pMtEZpvd = EZpvd();
        Intrinsics.copydefault(interfaceC38114pMtEZpvd, "");
        for (Map.Entry<String, String> entry : ((C38119pMy) interfaceC38114pMtEZpvd).EZpvd().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            this.AhwBna.add(new pPF(this.isConnected + "://" + key, this.isConnected + "://" + value, null, 4, null));
        }
        C55230xfy c55230xfy = this.gEmmrt;
        TextView textView = null;
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        EZpvd(String.valueOf(c55230xfy.KWHzl().getText()));
        RecyclerView recyclerView = this.AYXKKw;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.valueOf = new ActionBar(this.djBIcL, new Function1() { // from class: o.pPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LegacyDeeplinkDebugActivity.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LegacyDeeplinkDebugActivity.EZpvd(this.KWHzl, (pPF) obj);
            }
        });
        RecyclerView recyclerView2 = this.AYXKKw;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.valueOf);
        RecyclerView recyclerView3 = this.AYXKKw;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new C57593ylO(10, false, false, 6, null));
        TextView textView2 = this.AEQbTJ;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        textView.setText("Total Deeplink Mapping: " + this.AhwBna.size());
    }

    public static final Unit KWHzl(LegacyDeeplinkDebugActivity legacyDeeplinkDebugActivity, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        legacyDeeplinkDebugActivity.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(LegacyDeeplinkDebugActivity legacyDeeplinkDebugActivity, pPF ppf) {
        Intrinsics.checkNotNullParameter(ppf, "");
        legacyDeeplinkDebugActivity.EZpvd((Context) legacyDeeplinkDebugActivity, ppf);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final Context context, final pPF ppf) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Enter Key-Value Pairs for Deeplink");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final OKEditText oKEditText = new OKEditText(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(10, 0, 10, 0);
        oKEditText.setMaxLines(1);
        oKEditText.setKeyListener(DigitsKeyListener.getInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,_-:/"));
        oKEditText.setRawInputType(1);
        oKEditText.setLayoutParams(layoutParams);
        oKEditText.setHint("Key");
        linearLayout.addView(oKEditText);
        final OKEditText oKEditText2 = new OKEditText(context, null, 0, 6, null);
        oKEditText2.setHint("Value");
        oKEditText2.setMaxLines(1);
        oKEditText2.setKeyListener(DigitsKeyListener.getInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,_-:/"));
        oKEditText2.setRawInputType(1);
        oKEditText2.setLayoutParams(layoutParams);
        linearLayout.addView(oKEditText2);
        builder.setView(linearLayout);
        builder.setPositiveButton("Add More", new DialogInterface.OnClickListener() { // from class: o.pPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                LegacyDeeplinkDebugActivity.EZpvd(oKEditText, oKEditText2, ppf, this, context, dialogInterface, i);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.pPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                LegacyDeeplinkDebugActivity.AEQbTJ(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public static final void EZpvd(OKEditText oKEditText, OKEditText oKEditText2, pPF ppf, LegacyDeeplinkDebugActivity legacyDeeplinkDebugActivity, Context context, DialogInterface dialogInterface, int i) {
        String strValueOf = String.valueOf(oKEditText.getText());
        String strValueOf2 = String.valueOf(oKEditText2.getText());
        if (C33129mqd.OLrzqt((CharSequence) strValueOf) && C33129mqd.OLrzqt((CharSequence) strValueOf2)) {
            ppf.copydefault().put(strValueOf, strValueOf2);
            ActionBar actionBar = legacyDeeplinkDebugActivity.valueOf;
            if (actionBar != null) {
                actionBar.notifyDataSetChanged();
            }
            legacyDeeplinkDebugActivity.EZpvd(context, ppf);
            return;
        }
        C33134mqi.copydefault(legacyDeeplinkDebugActivity, "Invalid Values");
    }

    public static final void AEQbTJ(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    private final void KWHzl(String str) {
        if (str.length() == 0 || Intrinsics.EZpvd((Object) str, (Object) "INVALID_DEEPLINK")) {
            C33134mqi.copydefault(this, "Invalid Deeplink Value");
        } else {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this, str, null, new Function1() { // from class: o.pPw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LegacyDeeplinkDebugActivity.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends RecyclerView.Adapter<Activity> {
        public final Function1<pPF, Unit> EZpvd;
        public final Function1<String, Unit> KWHzl;
        public final List<pPF> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.pPF, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull List<pPF> list, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super pPF, Unit> function12) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.OLrzqt = list;
            this.KWHzl = function1;
            this.EZpvd = function12;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(pKK.ActionBar.gEmmrt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.OLrzqt(this.OLrzqt.get(i), this.KWHzl, this.EZpvd);
        }

        public static final class Activity extends RecyclerView.ViewHolder {
            public final TextView AEQbTJ;
            public final TextView EZpvd;
            public final TextView KWHzl;
            public final LinearLayout copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                View viewFindViewById = view.findViewById(pKK.StateListAnimator.zsXlph);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.KWHzl = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(pKK.StateListAnimator.AwvSrB);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.AEQbTJ = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(pKK.StateListAnimator.OLrzqt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.EZpvd = (TextView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(pKK.StateListAnimator.hDKMBd);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.copydefault = (LinearLayout) viewFindViewById4;
            }

            public final void OLrzqt(@NotNull final pPF ppf, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super pPF, Unit> function12) {
                Intrinsics.checkNotNullParameter(ppf, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function12, "");
                this.KWHzl.setText(ppf.AEQbTJ());
                this.AEQbTJ.setText(ppf.OLrzqt());
                this.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pPA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        LegacyDeeplinkDebugActivity.ActionBar.Activity.EZpvd(ppf, function1, view);
                    }
                });
                this.KWHzl.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pPC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return LegacyDeeplinkDebugActivity.ActionBar.Activity.copydefault(ppf, view);
                    }
                });
                this.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.pPB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        LegacyDeeplinkDebugActivity.ActionBar.Activity.KWHzl(function12, ppf, view);
                    }
                });
                this.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pPy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return LegacyDeeplinkDebugActivity.ActionBar.Activity.OLrzqt(ppf, view);
                    }
                });
                this.copydefault.removeAllViews();
                this.copydefault.setVisibility(ppf.copydefault().isEmpty() ^ true ? 0 : 8);
                for (String str : ppf.copydefault().keySet()) {
                    Context context = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    final pPO ppo = new pPO(context);
                    ppo.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    String str2 = ppf.copydefault().get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    ppo.setup(str, str2, new Function1() { // from class: o.pPD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return LegacyDeeplinkDebugActivity.ActionBar.Activity.AEQbTJ(ppf, this, ppo, (java.lang.String) obj);
                        }
                    });
                    this.copydefault.addView(ppo);
                }
            }

            public static final void EZpvd(pPF ppf, Function1 function1, View view) {
                String str = ppf.AEQbTJ() + "?";
                for (String str2 : ppf.copydefault().keySet()) {
                    str = ((Object) str) + str2 + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) ppf.copydefault().get(str2)) + ContainerUtils.FIELD_DELIMITER;
                }
                function1.invoke(str);
            }

            public static final boolean copydefault(pPF ppf, View view) {
                Object objEZpvd = C6832aWn.EZpvd("clipboard");
                ClipboardManager clipboardManager = objEZpvd instanceof ClipboardManager ? (ClipboardManager) objEZpvd : null;
                if (clipboardManager == null) {
                    return true;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ppf.AEQbTJ()));
                return true;
            }

            public static final void KWHzl(Function1 function1, pPF ppf, View view) {
                function1.invoke(ppf);
            }

            public static final boolean OLrzqt(pPF ppf, View view) {
                Object objEZpvd = C6832aWn.EZpvd("clipboard");
                ClipboardManager clipboardManager = objEZpvd instanceof ClipboardManager ? (ClipboardManager) objEZpvd : null;
                if (clipboardManager == null) {
                    return true;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ppf.OLrzqt()));
                return true;
            }

            public static final Unit AEQbTJ(pPF ppf, Activity activity, pPO ppo, String str) {
                Intrinsics.checkNotNullParameter(str, "");
                ppf.copydefault().remove(str);
                activity.copydefault.removeView(ppo);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // o.AbstractActivityC38194pPs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38194pPs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC38194pPs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC38194pPs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
